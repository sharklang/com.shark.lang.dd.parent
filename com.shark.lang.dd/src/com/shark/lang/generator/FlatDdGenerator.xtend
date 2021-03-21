package com.shark.lang.generator

import com.google.inject.Inject
import com.shark.lang.dd.Attribute
import com.shark.lang.dd.AttributeSize
import com.shark.lang.dd.DataModelFragment
import com.shark.lang.dd.DataType
import com.shark.lang.dd.Entity
import com.shark.lang.naming.DdQualifiedNameProvider
import java.io.File
import java.nio.charset.StandardCharsets
import java.nio.file.Files
import java.nio.file.Paths
import org.apache.log4j.Logger
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.xtext.naming.IQualifiedNameProvider

class FlatDdGenerator extends AbstractGenerator {

	@Inject extension IQualifiedNameProvider = new DdQualifiedNameProvider()

	static val LOG = Logger.getLogger(FlatDdGenerator)

	val STRING_FLATTYPE = #["string"]
	val BOOL_FLATTYPE = #["bool"]
	val INT_FLATTYPE = #["int"]
	val LONG_FLATTYPE = #["long"]
	val ULONG_FLATTYPE = #["ulong"]
	val UINT_FLATTYPE = #["uint"]
	val USHORT_FLATTYPE = #["ushort"]
	val UINT8_FLATTYPE = #["uint8"]
	val SHORT_FLATTYPE = #["short"]
	val INT8_FLATTYPE = #["int8"]
	val INT_FLATTYPE_DEC = #["int", "uint8"]
	val LONG_FLATTYPE_DEC = #["long", "uint8"]
	val SHORT_FLATTYPE_DEC = #["short", "uint8"]
	val INT8_FLATTYPE_DEC = #["int8", "uint8"]
	val DECIMALS_VAR_NAMES = #["", "_digits"]
	val OTHER_VAR_NAMES = #["", ""]

	// if some more control is required one can override and bind an impl of IOutputConfigurationProvider
	// and create another config than DEFAULT_OUTPUT
	// the simplified dd language does not mandate directory structure and a packages/model statement to align
	// but the directory structure is used to generate namespace and package statements as required in underlying languages.
	// in a sharklang project the naming scope if global for entities and a lot of othe things. There is one namespace per 
	// microservice project and that is enough
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		// keep same relative path when generating source in src-gen
		// TODO move to utility
		// TODO test outside of eclipse
		val uri = resource.URI.trimSegments(1)
		var path = uri.toFileString
		if ((path === null) && (uri.isPlatform)) {
			path = uri.toPlatformString(true)
		}
		var temp = ""
		if(!path.endsWith("/src")) {
			val posSrc = path.lastIndexOf("/src")
			if(posSrc > 0) {
				temp = path.substring(posSrc + 5)
			} else {
				LOG.error("generator does not work in this context, sources should be in a src subfolder")
				return
			}
		}
		val fileNameBase= temp
		// defensive programming, but structurally the model is the first object
		for (eObj : resource.contents) {
			if(eObj instanceof DataModelFragment) {
				val fileName = fileNameBase + File.separator + eObj.name + ".fbs"
				val flatBufferCode=compile(eObj,fileNameBase)
				fsa.generateFile(fileName, IFileSystemAccess.DEFAULT_OUTPUT, flatBufferCode)
				//for now as a prerequisite, flatc needs to be a command in the %PATH% of the dev workstation
				//content of generated file is copied to a temp directory for flatc gen and result is read to be used 
				//to create a known eclipse resource. pb is that it is slow...
				val defaultBaseDir = System.getProperty("java.io.tmpdir");
				val tempFile = Files.createTempFile(eObj.name , ".fbs");
				Files.write(tempFile, flatBufferCode.toString.getBytes(StandardCharsets.UTF_8))
				val tempGenDirName = defaultBaseDir + File.separator + eObj.name
				val command ="flatc -j --gen-mutable -o " + tempGenDirName +" "+ tempFile.toAbsolutePath
				val process = Runtime.getRuntime().exec(command)
				process.waitFor(); 
				if (process.exitValue!=0) {
						LOG.error(command+" failed, please add flatc to your PATH")
				} else {
					tempFile.toFile.delete
					val tempGenDir = Paths.get(tempGenDirName);
        			Files.walk(tempGenDir).forEach[p | injectFileToProject(p.toFile,tempGenDirName,fsa)];
				}
				//then loop on all java generated files in temp and inject them in the workspace
			}
		}
	}
	
	static def injectFileToProject(File file,String tempGenDirName, IFileSystemAccess2 fsa){
		if (!file.isDirectory()) {
			val fileAbsolutePath =file.absolutePath
			val relativePath=fileAbsolutePath.substring(tempGenDirName.length+1)
			fsa.generateFile(relativePath, IFileSystemAccess.DEFAULT_OUTPUT, Files.readString(Paths.get(file.toURI)))
        }
	}

	//generate a namepaces and will generate a java packqge statement then based on folder structure
	private def compile(DataModelFragment model,String namespace) '''
		«FOR commentLine : model.modelDesc»
		//«commentLine»
		«ENDFOR»
		namespace org.«namespace.replace("/",".")».«model.fullyQualifiedName»;
		
		«FOR entity : model.entities»
			«entity.compile»
		«ENDFOR»
		
	'''
	
	//comments are propagated in generated code
	private def compile(Entity ent) '''
		«FOR commentLine : ent.entityDescLines»
		//«commentLine»
		«ENDFOR»
		table «ent.name» {
			«FOR attr : ent.attributes»
				«attr.compile»
			«ENDFOR»
		}
	'''
	
	//the only complexity is due to the fact that decimals are stored as 2 attributes in flat and java
	//getFlatType will return an array of 2 strings in such case, and the FOR loop below will write 2 lines
	private def compile(Attribute attr) {
		val type = attr.dataType
		val size = attr.attributeSize
		val array = attr.arraySize
		var rightArray = ""
		var leftArray = ""
		
		//optional case for arrays
		if(array !== null) {
			rightArray = "]"
			leftArray = "["
		}
		
		//the 2 constants below allow to customize the generated var names with suffixes
		val flatTypes = getFlatType(type, size)
		var var_names = OTHER_VAR_NAMES
		if(flatTypes.length == 2) {
			var_names = DECIMALS_VAR_NAMES
		}
		
		var i = 0
		'''
			«FOR flatType : flatTypes»
				«attr.name»«var_names.get(i++)» : «leftArray»«flatType»«rightArray» ;
			«ENDFOR»
		'''
	}

	// DD:  dec | int | bits | bool | date | time | stamp | str | chr 
	// Flat: bool | int8/byte/ubyte(8=127->99/2) | short/ushort(16=32000->9999/4) | int/uint(32->9) | long/ulong(64->18) | string
	private def getFlatType(DataType type, AttributeSize size) {
		val typeValue = type.value
		val length = size === null ? 0 : size.length
		val precision = size === null ? 0 : size.precision
		switch (typeValue) {
			case ((typeValue == DataType.STR_VALUE) || (typeValue == DataType.CHR_VALUE)): {
				STRING_FLATTYPE
			}
			case typeValue == DataType.BOOL_VALUE: {
				BOOL_FLATTYPE
			}
			case typeValue == DataType.DATE_VALUE: {
				INT_FLATTYPE // YYYYMMDD
			}
			case typeValue == DataType.TIME_VALUE: {
				INT_FLATTYPE // HHMMSS
			}
			case typeValue == DataType.STAMP_VALUE: {
				LONG_FLATTYPE // YYYYMMDD.HHMMSS.ssss
			}
			case typeValue == DataType.BITS_VALUE: {
				// field of bits limited to 64 for now
				switch (length) {
					case length <= 8: {
						UINT8_FLATTYPE
					}
					case ((length > 8) && (length <= 16)): {
						USHORT_FLATTYPE
					}
					case ((length > 16) && (length <= 32)): {
						UINT_FLATTYPE
					}
					case ((length > 32) && (length <= 64)): {
						ULONG_FLATTYPE
					}
					case (length > 64): {
						LOG.error("there should be a control in the grammar, bits cannot be over 64bits long")
					}
				}
			}
			case typeValue == DataType.INT_VALUE: {
				// field of bits limited to 64 for now
				switch (length) {
					case length <= 2: {
						INT8_FLATTYPE
					}
					case ((length > 2) && (length <= 4)): {
						SHORT_FLATTYPE
					}
					case ((length > 4) && (length <= 9)): {
						INT_FLATTYPE
					}
					case ((length > 9) && (length <= 18)): {
						LONG_FLATTYPE
					}
					case (length > 18): {
						LOG.error("there should be a control in the grammar, int cannot be over 18 digits long")
					}
				}
			}
			case typeValue == DataType.DEC_VALUE: {
				// field of bits limited to 64 for now
				val fullsize = length + precision
				switch (fullsize) {
					case fullsize <= 2: {
						INT8_FLATTYPE_DEC
					}
					case ((fullsize > 8) && (fullsize <= 16)): {
						SHORT_FLATTYPE_DEC
					}
					case ((fullsize > 16) && (fullsize <= 32)): {
						INT_FLATTYPE_DEC
					}
					case ((fullsize > 32) && (fullsize <= 64)): {
						LONG_FLATTYPE_DEC
					}
					case (fullsize > 64): {
						LOG.error("there should be a control in the grammar, dec length=precision cannot be over 18 digits long")
					}
				}
			}
		}
	}
}
