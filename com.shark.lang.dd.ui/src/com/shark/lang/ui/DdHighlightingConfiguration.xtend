package com.shark.lang.ui

import org.eclipse.swt.SWT
import org.eclipse.swt.graphics.RGB
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor
import org.eclipse.xtext.ui.editor.utils.TextStyle

//this is meant to change the default value in the editor menu for the language
//and add some extra cases like the identifier here. It adds them to the config menu
//and then it can be changed in the workspace settings

class DdHighlightingConfiguration extends DefaultHighlightingConfiguration {
	
	public static final String IDENTIFIER_ID = "Id"
	public static final String OBJ_ID = "Object"
	public static final String CHAR_ID = "Character"
	public static final String CONST_ID = "Constant"
	public static final String CHK_ID = "Check"
	
	override configure(IHighlightingConfigurationAcceptor acceptor) {
		super.configure(acceptor)
		acceptor.acceptDefaultHighlighting(IDENTIFIER_ID, "Id", identifierTextStyle())
		acceptor.acceptDefaultHighlighting(OBJ_ID, "Object", objTextStyle())
		acceptor.acceptDefaultHighlighting(CHAR_ID, "Character", charTextStyle())
		acceptor.acceptDefaultHighlighting(CONST_ID, "Constant", constantTextStyle())
		acceptor.acceptDefaultHighlighting(CHK_ID, "Check", checkTextStyle())
	}
	
	//objects and constraints in dark yellow bold the second also underligned
	def TextStyle objTextStyle() {
		var textStyle = defaultTextStyle().copy()
		textStyle.setColor(new RGB(230, 170, 0))
		textStyle.setStyle(SWT.BOLD)
		return textStyle
	}
	
	def TextStyle checkTextStyle() {
		var textStyle = objTextStyle().copy()
		textStyle.setStyle(SWT.UNDERLINE_SINGLE)
		return textStyle
	}
	
	//char and strings in red, char is bold
	def TextStyle charTextStyle() {
		var textStyle = stringTextStyle().copy()
		textStyle.setStyle(SWT.BOLD)
		return textStyle
	}
	
	override TextStyle stringTextStyle() {
		var textStyle = defaultTextStyle().copy()
		textStyle.setColor(new RGB(255, 0, 0))
		return textStyle
	}
	
	//classical constant in bold blue/dark violet
	def TextStyle constantTextStyle() {
		var textStyle = identifierTextStyle.copy()
		textStyle.setStyle(SWT.BOLD)
		return textStyle
	}
	
	//classical identifier in blue/dark violet
	def TextStyle identifierTextStyle() {
		var textStyle = defaultTextStyle().copy()
		textStyle.setColor(new RGB(115, 70, 215))
		return textStyle
	}
	
	override TextStyle defaultTextStyle() {
		return super.defaultTextStyle
	}

	//numbers in light yellow
	override TextStyle numberTextStyle() {
		var textStyle = defaultTextStyle().copy()
		textStyle.setColor(new RGB(255,255,120))
		return textStyle
	}
	
	//comment in classical green but italic
	override TextStyle commentTextStyle() {
		var textStyle = defaultTextStyle().copy()
		textStyle.setColor(new RGB(100,240,100))
		textStyle.setStyle(SWT.ITALIC)
		return textStyle
	}

	override TextStyle taskTextStyle() {
		return super.taskTextStyle()
	}
	
	//classical default as dark pink but needs a bit lighter in dark theme
	override TextStyle keywordTextStyle() {
		var textStyle = defaultTextStyle().copy()
		textStyle.setColor(new RGB(180,25,125))
		return textStyle
	}

	override TextStyle punctuationTextStyle() {
		return super.punctuationTextStyle()
	}
}
