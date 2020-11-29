/*
 * generated by Xtext 2.21.0
 */
package com.shark.lang.ui.labeling

import com.google.inject.Inject
import com.shark.lang.dd.Attribute
import com.shark.lang.dd.BinaryExpression
import com.shark.lang.dd.CheckExpression
import com.shark.lang.dd.Constant
import com.shark.lang.dd.Constraint
import com.shark.lang.dd.DataModelFragment
import com.shark.lang.dd.Entity
import com.shark.lang.dd.ListExpression
import com.shark.lang.dd.ListExpressionElt
import com.shark.lang.dd.UnaryExpression
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider

/**
 * Provides labels for EObjects.
 * 
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#label-provider
 */
class DdLabelProvider extends DefaultEObjectLabelProvider {

	@Inject
	new(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

//to look nicer
	def text(Entity ele) {
		'Entity ' + ele.name
	}
	
	def text(Attribute ele) {
		'- ' + ele.name
	}
	
	def text(Constraint ele) {
		ele.name.substring(1)+" checks"
	}
	
//to ensure Binary Operators are properly displayed in outline that needs to be added
	def text(BinaryExpression ele) {
		ele.op.getLiteral()
	}

//to ensure Binary Operators are properly displayed in outline that needs to be added
	def text(UnaryExpression ele) {
		ele.op.getLiteral()
	}
	
	//to look nicer
	def text(ListExpression ele) {
		'List'
	}
	
	def text(ListExpressionElt ele) {
		'Elt'
	}
	
	def text(Constant ele) {
		'Cst '+ele.name
	}
	
   def image(Entity ele) {
	'entity.png'
	}
	
   def image(Attribute ele) {
	'attribute.png'
	}
	
	def image(Constraint ele) {
	'constraint.png'
	}
	
	def image(CheckExpression ele) {
	'check.png'
	}
	
	def image(Constant ele) {
	'const.png'
	}
	
	def image(DataModelFragment ele) {
	'model.png'
	}
}
