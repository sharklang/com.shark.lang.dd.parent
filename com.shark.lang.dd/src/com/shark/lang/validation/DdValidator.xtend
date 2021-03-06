/*
 * generated by Xtext 2.21.0
 */
package com.shark.lang.validation

import com.google.inject.Inject
import com.google.inject.Provider
import com.shark.lang.dd.ArraySize
import com.shark.lang.dd.AttributeValue
import com.shark.lang.dd.CheckExpression
import com.shark.lang.dd.Constant
import com.shark.lang.dd.Constraint
import com.shark.lang.dd.CstValue
import com.shark.lang.dd.DataModelFragment
import com.shark.lang.dd.DdPackage
import com.shark.lang.dd.Entity
import org.apache.log4j.Logger
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.resource.IContainer
import org.eclipse.xtext.resource.IResourceDescriptions
import org.eclipse.xtext.resource.XtextResourceSet
import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.CheckType
import org.eclipse.xtext.validation.ComposedChecks

/**
 * This class contains custom validation rules.
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 * 
 * It contains the following validation:
 * 	TODO test the global scope with several project and dependencies
 * 	- checks that entities are unique in the global scope 
 * 	- checks that the intrinsic check constrains group only refers attribute of the related entity
 * 	- checks that the check constraints are bool
 * 
 */
@ComposedChecks(validators=#[DdDeclarationValidator])
//TODO check numberUtil iCreatable and compare to exception management below 
class DdValidator extends AbstractDdValidator {

	@Inject
	IContainer.Manager containerManager;
	@Inject
	IResourceDescriptions resourceDescriptions
	@Inject
	Provider<XtextResourceSet> resourceSetProvider;
	
	
	static val Logger LOG = Logger.getLogger(DdValidator);

	// check that when the constraint name is an # and entity name from the same file, 
	// then it refers only to this entity attributes or constants and literals
	// indeed these expressions will be checked at each time the object is created/changed
	// BEWARE: default check is FAST so it runs all the time --> this one should go normal
	@Check(CheckType.NORMAL)
	def checkAttributesInEntityConstraint(Constraint cstr) {

		val dataModelFragment = cstr.eContainer as DataModelFragment
		val cstrName = cstr.name.substring(1, cstr.name.length) // strip out # from constraint name
		var isEntityCoreCstr = false

		// get list of all entities in this fragment(file) and check each if name is same
		for (entity : dataModelFragment.entities) {
			if(cstrName == entity.name) {
				// this is the special case based on naming convention of a constraint only applicable for a given object
				isEntityCoreCstr = true
				// in that case we check the list of operands to verify that none goes outside of the entity scope
				for (CheckExpression chk : cstr.check.toList) {
					for (EObject eObj : chk.eAllContents.toIterable) {
						if(eObj instanceof AttributeValue) {
							val ident = eObj as AttributeValue
							val referredEntity = ident.value.eContainer as Entity
							if(referredEntity.name != cstrName) {
								error(
									"Invalid Entity check expression: it cannot use a reference to an attribute outside of the referred Entity here " +
										referredEntity.name + " is used, but allowed only are attributes from " + cstrName, ident,
									DdPackage.Literals.ATTRIBUTE_VALUE__VALUE)
							}
						}
					}
				} // and we check for consistency that there is no scope in suche a case
				if(cstr.firstEntity !== null) {
					error(
						"A scope of entities for the verifications cannot be set in the case of the check rule named for a special entity ",
						cstr, DdPackage.Literals.CONSTRAINT__FIRST_ENTITY)
				}
			}
		}
		if(!isEntityCoreCstr) {
			// in that case this is a generic constraint for which we need to verify that attributes are accessible.
			// to do that we gather all entities that have attributes used in these check constraints, then check they are in scope
			// and of course in that case scope is required so we check that
			if(cstr.firstEntity === null) {
				error("A scope of entities for the verifications is required in that case", cstr,
					DdPackage.Literals.CONSTRAINT__FIRST_ENTITY)
			}
			for (CheckExpression chk : cstr.check.toList) {
				for (EObject eObj : chk.eAllContents.toIterable) {
					if(eObj instanceof AttributeValue) {
						val ident = eObj as AttributeValue
						val referredEntity = ident.value.eContainer as Entity
						if(referredEntity.name != cstr.firstEntity.name) {
							var found = false
							// search constraint scope for the entity found in the expressions
							for (elt : cstr.entitiesList) {
								if(referredEntity.name == elt.entity.name) {
									found = true
								}
							}
							if(!found) {
								error(
									"Invalid Entity check expression: it cannot use a reference to an attribute outside of the scope of entities",
									ident, DdPackage.Literals.ATTRIBUTE_VALUE__VALUE)
							}
						}
					}
				}
			}
		}
	}

	// TODO: the below looks hyper slow so check how to improve by doing it more lazily
	// like for reference verification and scope (check lazylinker) 
	@Check(CheckType.NORMAL)
	def checkEntityGloballyUnique(Entity entity) {

		// visible containers is part of the global scope provider system
		// but the below does not solve the fact that a clean does not register such errors, only when typing
		// and also this is very slow
		/*
		 * var entity_description = resourceDescriptions.getResourceDescription(entity.eResource.URI)
		 * if (entity_description===null) {//it is null when the global index is not yet created? so a clean does not create these errors...
		 * 	val IResourceServiceProvider resourceServiceProvider = 
		 * 			resourceServiceProviderRegistry.getResourceServiceProvider(entity.eResource.URI);
		 * 	val IResourceDescription.Manager manager = resourceServiceProvider.getResourceDescriptionManager();
		 * 	entity_description = manager.getResourceDescription(entity.eResource);
		 * }
		 * val visibleContainers = containerManager.getVisibleContainers(entity_description, resourceDescriptions)
		 * for (visibleContainer : visibleContainers) {
		 * 	for (_description : visibleContainer.getExportedObjectsByType(DdPackage.Literals.ENTITY)) {
		 * 		val _entity = resourceSetProvider.get.getEObject(_description.EObjectURI, true) as Entity
		 * 		if((entity.eResource.URI != _entity.eResource.URI) && (entity.name == _entity.name)) {
		 * 			error('Entity duplication', entity, DdPackage.Literals.ENTITY__NAME)
		 * 		}
		 * 	}
		 }*/
		var entity_description = resourceDescriptions.getResourceDescription(entity.eResource.URI)
		if(entity_description !== null) { // it is null when the global index is not yet created? so a clean does not create these errors...
			val visibleContainers = containerManager.getVisibleContainers(entity_description, resourceDescriptions)
			for (visibleContainer : visibleContainers) {
				for (_description : visibleContainer.getExportedObjectsByType(DdPackage.Literals.ENTITY)) {
					if(_description !== null) {
						val _entity = resourceSetProvider.get.getEObject(_description.EObjectURI, true) as Entity
						if((entity.eResource.URI != _entity.eResource.URI) && (entity.name == _entity.name)) {
							error('Entity duplication', entity, DdPackage.Literals.ENTITY__NAME)
						}
					}
				}
			}
		} else {
			LOG.error("index was not built?")
		}
	}

	@Check(CheckType.NORMAL)
	def checkModelGloballyUnique(DataModelFragment model) {
		// visible containers is part of the global scope provider system
		var model_description = resourceDescriptions.getResourceDescription(model.eResource.URI)
		if(model_description !== null) { // it is null when the global index is not yet created? so a clean does not create these errors...
		/*val IResourceServiceProvider resourceServiceProvider = resourceServiceProviderRegistry.
		 * 	getResourceServiceProvider(model.eResource.URI);
		 * val IResourceDescription.Manager manager = resourceServiceProvider.getResourceDescriptionManager();
		 * model_description = manager.getResourceDescription(model.eResource);
		 }*/
			val visibleContainers = containerManager.getVisibleContainers(model_description, resourceDescriptions)
			for (visibleContainer : visibleContainers) {
				for (_description : visibleContainer.getExportedObjectsByType(DdPackage.Literals.DATA_MODEL_FRAGMENT)) {
					if(_description !== null) {
						val _model = resourceSetProvider.get.getEObject(_description.EObjectURI, true) as DataModelFragment
						if((model.eResource.URI != _model.eResource.URI) && (model.name == _model.name)) {
							error('Model duplication', model, DdPackage.Literals.DATA_MODEL_FRAGMENT__NAME)
						}
					}
				}
			}
		}
	}

	@Check(CheckType.NORMAL)
	def checkConstantGloballyUnique(Constant cst) {
		// visible containers is part of the global scope provider system
		var cst_description = resourceDescriptions.getResourceDescription(cst.eResource.URI)
		if(cst_description !== null) { // it is null when the global index is not yet created? so a clean does not create these errors...
			val visibleContainers = containerManager.getVisibleContainers(cst_description, resourceDescriptions)
			for (visibleContainer : visibleContainers) {
				for (_description : visibleContainer.getExportedObjectsByType(DdPackage.Literals.CONSTANT)) {
					if(_description !== null) {
						val _cst = resourceSetProvider.get.getEObject(_description.EObjectURI, true) as Constant
						if((cst.eResource.URI != _cst.eResource.URI) && (cst.name == _cst.name)) {
							error('Constant duplication', cst, DdPackage.Literals.CONSTANT__NAME)
						}
					}
				}
			}
		}
	}

	@Check(CheckType.NORMAL)
	def checkConstraintGloballyUnique(Constraint cst) {
		// visible containers is part of the global scope provider system
		var cst_description = resourceDescriptions.getResourceDescription(cst.eResource.URI)
		if(cst_description !== null) { // it is null when the global index is not yet created? so a clean does not create these errors...
			val visibleContainers = containerManager.getVisibleContainers(cst_description, resourceDescriptions)
			for (visibleContainer : visibleContainers) {
				for (_description : visibleContainer.getExportedObjectsByType(DdPackage.Literals.CONSTRAINT)) {
					if(_description !== null) {
						val _cst = resourceSetProvider.get.getEObject(_description.EObjectURI, true) as Constraint
						if((cst.eResource.URI != _cst.eResource.URI) && (cst.name == _cst.name)) {
							error('Constraint duplication', cst, DdPackage.Literals.CONSTRAINT__NAME)
						}
					}
				}
			}
		}
	}

	// check that index of the identifier is in line with the array size declared
	@Check(CheckType.NORMAL)
	def checkArrayConsistency(ArraySize arraySize) {
		val parent = arraySize.eContainer
		if(parent instanceof AttributeValue) {
			val idExpr = parent as AttributeValue
			val attr = idExpr.value
			if(attr.arraySize === null) {
				error("This attribute is not an array and so no index can be specified to access it", arraySize,
					DdPackage.Literals.ARRAY_SIZE__SIZE)
			} else if(arraySize.size >= attr.arraySize.size) {
				// array access is index from 0 to size-1
				error("Index is out of bound", arraySize, DdPackage.Literals.ARRAY_SIZE__SIZE)
			}
		} else if(parent instanceof CstValue) {
			val idExpr = parent as CstValue
			val cst = idExpr.value
			if(cst.arraySize === null) {
				error("This constant is not an array and so no index can be specified to access it", arraySize,
					DdPackage.Literals.ARRAY_SIZE__SIZE)
			} else if(arraySize.size >= cst.arraySize.size) {
				// array access is index from 0 to size-1
				error("Index is out of bound", arraySize, DdPackage.Literals.ARRAY_SIZE__SIZE)
			}
		}
	}
} //end class
