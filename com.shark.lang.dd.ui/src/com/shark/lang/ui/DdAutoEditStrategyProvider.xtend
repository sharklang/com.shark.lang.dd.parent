package com.shark.lang.ui

import org.eclipse.xtext.ui.editor.autoedit.DefaultAutoEditStrategyProvider

//TOD try and understand how to create auto closing directly from the first bracket or double quote typing

class DdAutoEditStrategyProvider extends DefaultAutoEditStrategyProvider {
	
	override configureStringLiteral(IEditStrategyAcceptor acceptor) {
		//acceptor.accept(partitionInsert.newInstance("\"","\""),IDocument.DEFAULT_CONTENT_TYPE);
		//acceptor.accept(partitionInsert.newInstance("'","'"),IDocument.DEFAULT_CONTENT_TYPE);
		//acceptor.accept(partitionDeletion.newInstance("\"","\""),IDocument.DEFAULT_CONTENT_TYPE);
		//acceptor.accept(partitionDeletion.newInstance("'","'"),IDocument.DEFAULT_CONTENT_TYPE);
		//acceptor.accept(partitionEndSkippingEditStrategy.get(),TerminalsTokenTypeToPartitionMapper.STRING_LITERAL_PARTITION);
	}
	
	override configureMultilineComments(IEditStrategyAcceptor acceptor) {
		//acceptor.accept(singleLineTerminals.newInstance("/*", " */"),IDocument.DEFAULT_CONTENT_TYPE);
		//acceptor.accept(multiLineTerminals.newInstance("/***"," * ", " ***/"),IDocument.DEFAULT_CONTENT_TYPE);
		//acceptor.accept(multiLineTerminals.newInstance("/***"," * ", " ***/"),TerminalsTokenTypeToPartitionMapper.COMMENT_PARTITION);
		//acceptor.accept(multiLineTerminals.newInstance("/*"," * ", " */"),IDocument.DEFAULT_CONTENT_TYPE);
		//acceptor.accept(multiLineTerminals.newInstance("/*"," * ", " */"),TerminalsTokenTypeToPartitionMapper.COMMENT_PARTITION);
	}
	
	override configureParenthesis(IEditStrategyAcceptor acceptor) {
		//acceptor.accept(singleLineTerminals.newInstance("(", ")"),IDocument.DEFAULT_CONTENT_TYPE);
	}
}