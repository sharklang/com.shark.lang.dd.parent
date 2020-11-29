package com.shark.lang.ui

import org.eclipse.xtext.ide.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper
import org.eclipse.xtext.ide.editor.syntaxcoloring.HighlightingStyles

class DdAntlrTokenToAttributeIdMapper extends DefaultAntlrTokenToAttributeIdMapper {
	
override String calculateId(String tokenName, int tokenType) {
		if ("RULE_CMT".equals(tokenName)) {
			return HighlightingStyles.COMMENT_ID;
		} else if ("RULE_ID".equals(tokenName)) {
			return DdHighlightingConfiguration.IDENTIFIER_ID;
		} else if ("RULE_OBJID".equals(tokenName)) {
			return DdHighlightingConfiguration.IDENTIFIER_ID;
		} else if ("RULE_CHKID".equals(tokenName)) {
			return DdHighlightingConfiguration.CHK_ID;
		} else if ("RULE_CHR".equals(tokenName)) {
			return DdHighlightingConfiguration.CHAR_ID;
		} else if ("RULE_STR".equals(tokenName)) {
			return HighlightingStyles.STRING_ID;
		} else if ("RULE_INT".equals(tokenName)) {
			return HighlightingStyles.NUMBER_ID;
		} else if ("RULE_DEC".equals(tokenName)) {
			return HighlightingStyles.NUMBER_ID;
		} else if ("RULE_CSTID".equals(tokenName)) {
			return DdHighlightingConfiguration.CONST_ID;
		}
		return super.calculateId(tokenName, tokenType);
	}

}