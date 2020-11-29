package com.shark.lang.ui

import org.eclipse.swt.SWT
import org.eclipse.swt.graphics.RGB
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor
import org.eclipse.xtext.ui.editor.utils.TextStyle

//this is meant to change the default value in the editor menu for the language
//and add some extra cases like the identifier here. It adds to the config menu...

class DdHighlightingConfiguration extends DefaultHighlightingConfiguration {
	
	public static final String IDENTIFIER_ID = "Identifier"
	public static final String CHAR_ID = "Character"
	public static final String CONST_ID = "Constant"
	public static final String CHK_ID = "Check"
	
	override configure(IHighlightingConfigurationAcceptor acceptor) {
		super.configure(acceptor)
		acceptor.acceptDefaultHighlighting(IDENTIFIER_ID, "Identifier", identifierTextStyle())
		acceptor.acceptDefaultHighlighting(CHAR_ID, "Character", identifierTextStyle())
		acceptor.acceptDefaultHighlighting(CONST_ID, "Constant", constantTextStyle())
		acceptor.acceptDefaultHighlighting(CHK_ID, "Check", checkTextStyle())
	}
	
	def TextStyle checkTextStyle() {
		var textStyle = identifierTextStyle().copy()
		textStyle.setStyle(SWT.ITALIC)
		return textStyle
	}
	
	def TextStyle charTextStyle() {
		var textStyle = numberTextStyle().copy()
		textStyle.setStyle(SWT.BOLD)
		return textStyle
	}
	
	def TextStyle constantTextStyle() {
		var textStyle = defaultTextStyle().copy()
		textStyle.setColor(new RGB(10,10,10))
		return textStyle
	}
	
	def TextStyle identifierTextStyle() {
		var textStyle = defaultTextStyle().copy()
		textStyle.setColor(new RGB(47, 15, 115))
		return textStyle
	}

	override TextStyle defaultTextStyle() {
		return super.defaultTextStyle
	}

	override TextStyle stringTextStyle() {
		var textStyle = defaultTextStyle().copy()
		textStyle.setColor(new RGB(255, 0, 0))
		return textStyle
	}

	override TextStyle numberTextStyle() {
		var textStyle = defaultTextStyle().copy()
		textStyle.setColor(new RGB(200,200, 0))
		textStyle.setStyle(SWT.BOLD)
		return textStyle
	}

	override TextStyle commentTextStyle() {
		return super.commentTextStyle()
	}

	override TextStyle taskTextStyle() {
		return super.taskTextStyle()
	}

	override TextStyle keywordTextStyle() {
		return super.keywordTextStyle()
	}

	override TextStyle punctuationTextStyle() {
		return super.punctuationTextStyle()
	}
}
