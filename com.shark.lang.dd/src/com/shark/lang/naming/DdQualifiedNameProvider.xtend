package com.shark.lang.naming

import com.google.inject.Inject
import com.shark.lang.dd.Attribute
import com.shark.lang.dd.Constant
import com.shark.lang.dd.Entity
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider
import org.eclipse.xtext.naming.IQualifiedNameConverter
import org.eclipse.xtext.naming.QualifiedName

class DdQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {

	@Inject IQualifiedNameConverter converter = new IQualifiedNameConverter.DefaultImpl();

	override QualifiedName getFullyQualifiedName(EObject obj) {
		//with this special behavious the qualified name for constant does not containt the parent and so a constant can be declared in another 
		//file and be resolve by the default lazy resolution of reference
		if(obj instanceof Constant) {
			val name = obj.name
			if(name !== null) {
				return converter.toQualifiedName(name)
			}
		}
		if(obj instanceof Entity) {
			val name = obj.name
			if(name !== null) {
				return converter.toQualifiedName(name)
			}
		}
		if(obj instanceof Attribute) {
			val name = obj.name
			val entity = (obj.eContainer as Entity).name
			if(name !== null) {
				return converter.toQualifiedName(entity+"."+name)
			}
		}
		val fqn = super.getFullyQualifiedName(obj)
		fqn
	}
}

