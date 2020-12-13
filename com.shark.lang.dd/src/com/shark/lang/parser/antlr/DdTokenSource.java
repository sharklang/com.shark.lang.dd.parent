/*
 * generated by Xtext 2.21.0
 */
package com.shark.lang.parser.antlr;

import com.shark.lang.parser.antlr.internal.InternalDdParser;

//this class intercept all tokens in the streams and inserts extra ones
//it analyses the indentation structure and adds both block separators and EOL separators 
//so in the end the grammar has to process a code that has block begin block end and eol/end of statement
//separators just like { } and ; in java or C
//that allows to make an easier less ambiguous more robust grammar (or so I believe naively maybe)

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenSource;
import org.eclipse.xtext.parser.antlr.AbstractIndentationTokenSource;
import org.eclipse.xtext.parser.antlr.ITokenAcceptor;

public class DdTokenSource extends AbstractIndentationTokenSource {

	public DdTokenSource(TokenSource delegate) {
		super(delegate);
	}

	@Override
	protected boolean shouldSplitTokenImpl(Token token) {
		// TODO Review assumption
		return token.getType() == InternalDdParser.RULE_IDENT;
	}

	@Override
	protected int getBeginTokenType() {
		// TODO Review assumption
		return InternalDdParser.RULE_BEGIN;
	}

	@Override
	protected int getEndTokenType() {
		// TODO Review assumption
		return InternalDdParser.RULE_END;
	}	
	
	protected Token createEOLToken(int offset) {
		CommonToken result = new CommonToken(InternalDdParser.RULE_EOL);
		result.setText("");
		result.setChannel(Token.DEFAULT_CHANNEL);
		result.setStartIndex(offset);
		result.setStopIndex(offset-1);
		return result;
	}
	
	@Override
	/**
	 * To have a block and an extra EOL token too in case indentation does not change to simulate ;}
	 * So it can be used in parser and make it more robust
	 */
	protected void doSplitTokenImpl(Token token, ITokenAcceptor result) {
		String text = token.getText();
		int indentation = computeIndentation(text);
		if (indentation == -1 || indentation == currentIndentation) {
			// no change of indentation level only create an EOL token
			result.accept(token);
			result.accept(createEOLToken(((CommonToken) token).getStopIndex() + 1));
		} else if (indentation > currentIndentation) {
			// indentation level increased
			splitIntoBeginToken(token, indentation, result);
		} else if (indentation < currentIndentation) {
			//end the previous statement
			result.accept(createEOLToken(((CommonToken) token).getStopIndex() + 1));
			// indentation level decreased
			int charCount = computeIndentationRelevantCharCount(text);
			if (charCount > 0) {
				// emit whitespace including newline
				splitWithText(token, text.substring(0, charCount), result);	
			}
			// emit end tokens at the beginning of the line
			decreaseIndentation(indentation, result);
			if (charCount != text.length()) {
				handleRemainingText(token, text.substring(charCount), indentation, result);
			}
		} else {
			throw new IllegalStateException(String.valueOf(indentation));
		}
	}
	
	//copied from the abstract super class as it was private
	private void splitIntoBeginToken(Token token, int indentation, ITokenAcceptor result) {
		result.accept(token);
		if (shouldEmitPendingEndTokens()) {
			Token nextToken = getDelegate().nextToken();
			if (shouldSplitToken(nextToken)) {
				nextOffset = ((CommonToken) token).getStopIndex() + 1;
				doSplitToken(nextToken, result);
			} else {
				indentationStack.push(indentation);
				currentIndentation = indentation;
				result.accept(createBeginToken(((CommonToken) token).getStopIndex() + 1));
				result.accept(nextToken);
			}	
		} else {
			indentationStack.push(indentation);
			currentIndentation = indentation;
			result.accept(createBeginToken(((CommonToken) token).getStopIndex() + 1));
		}
	}

}
