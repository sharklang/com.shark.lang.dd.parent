package com.shark.lang.ide.contentassist.antlr.internal;
import java.util.Map;
import java.util.HashMap;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import com.shark.lang.services.DdGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalDdParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "False", "Round", "Stamp", "Unset", "Bits", "Bool", "Date", "Like", "Stxt", "Time", "True", "And", "Chr", "Dec", "Int", "Len", "Not", "Str", "HalfwidthHangulFillerHalfwidthHangulFillerHalfwidthHangulFiller", "ExclamationMarkEqualsSign", "HyphenMinusGreaterThanSign", "LessThanSignEqualsSign", "EqualsSignEqualsSign", "GreaterThanSignEqualsSign", "In", "Or", "Pk", "ExclamationMark", "PercentSign", "Ampersand", "LeftParenthesis", "RightParenthesis", "Asterisk", "PlusSign", "Comma", "HyphenMinus", "FullStop", "Solidus", "Colon", "LessThanSign", "EqualsSign", "GreaterThanSign", "LeftSquareBracket", "RightSquareBracket", "CircumflexAccent", "RULE_BEGIN", "RULE_END", "RULE_EOL", "RULE_NULL", "RULE_HEX", "RULE_NUM", "RULE_UNI", "RULE_ESC", "RULE_ASCII", "RULE_NL", "RULE_CHR", "RULE_STR", "RULE_RANGEINF", "RULE_RANGE", "RULE_CHKID", "RULE_CSTID", "RULE_OBJID", "RULE_ID", "RULE_DEC", "RULE_INT", "RULE_CONT", "RULE_IDENT", "RULE_CMT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_HEX=53;
    public static final int Or=29;
    public static final int RULE_BEGIN=49;
    public static final int True=14;
    public static final int RULE_CHKID=63;
    public static final int False=4;
    public static final int Chr=16;
    public static final int LessThanSign=43;
    public static final int Str=21;
    public static final int PercentSign=32;
    public static final int Like=11;
    public static final int LeftParenthesis=34;
    public static final int RULE_OBJID=65;
    public static final int Bool=9;
    public static final int RULE_NUM=54;
    public static final int Stxt=12;
    public static final int Ampersand=33;
    public static final int Pk=30;
    public static final int RightSquareBracket=47;
    public static final int ExclamationMark=31;
    public static final int GreaterThanSign=45;
    public static final int RULE_ID=66;
    public static final int RULE_EOL=51;
    public static final int RULE_RANGEINF=61;
    public static final int RULE_DEC=67;
    public static final int RightParenthesis=35;
    public static final int RULE_ESC=56;
    public static final int RULE_IDENT=70;
    public static final int GreaterThanSignEqualsSign=27;
    public static final int EqualsSignEqualsSign=26;
    public static final int Not=20;
    public static final int RULE_CONT=69;
    public static final int And=15;
    public static final int PlusSign=37;
    public static final int RULE_UNI=55;
    public static final int RULE_INT=68;
    public static final int Bits=8;
    public static final int LeftSquareBracket=46;
    public static final int HalfwidthHangulFillerHalfwidthHangulFillerHalfwidthHangulFiller=22;
    public static final int RULE_END=50;
    public static final int In=28;
    public static final int Time=13;
    public static final int RULE_NULL=52;
    public static final int Int=18;
    public static final int Comma=38;
    public static final int EqualsSign=44;
    public static final int HyphenMinus=39;
    public static final int RULE_ASCII=57;
    public static final int Round=5;
    public static final int LessThanSignEqualsSign=25;
    public static final int Solidus=41;
    public static final int Colon=42;
    public static final int EOF=-1;
    public static final int Asterisk=36;
    public static final int RULE_CMT=71;
    public static final int FullStop=40;
    public static final int Dec=17;
    public static final int Stamp=6;
    public static final int RULE_CSTID=64;
    public static final int RULE_WS=72;
    public static final int Unset=7;
    public static final int RULE_ANY_OTHER=73;
    public static final int Date=10;
    public static final int CircumflexAccent=48;
    public static final int RULE_CHR=59;
    public static final int Len=19;
    public static final int RULE_STR=60;
    public static final int ExclamationMarkEqualsSign=23;
    public static final int RULE_NL=58;
    public static final int HyphenMinusGreaterThanSign=24;
    public static final int RULE_RANGE=62;

    // delegates
    // delegators


        public InternalDdParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDdParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDdParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDdParser.g"; }


    	private DdGrammarAccess grammarAccess;
    	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
    	
    	{
    		tokenNameToValue.put("ExclamationMark", "'!'");
    		tokenNameToValue.put("PercentSign", "'%'");
    		tokenNameToValue.put("Ampersand", "'&'");
    		tokenNameToValue.put("LeftParenthesis", "'('");
    		tokenNameToValue.put("RightParenthesis", "')'");
    		tokenNameToValue.put("Asterisk", "'*'");
    		tokenNameToValue.put("PlusSign", "'+'");
    		tokenNameToValue.put("Comma", "','");
    		tokenNameToValue.put("HyphenMinus", "'-'");
    		tokenNameToValue.put("FullStop", "'.'");
    		tokenNameToValue.put("Solidus", "'/'");
    		tokenNameToValue.put("Colon", "':'");
    		tokenNameToValue.put("LessThanSign", "'<'");
    		tokenNameToValue.put("EqualsSign", "'='");
    		tokenNameToValue.put("GreaterThanSign", "'>'");
    		tokenNameToValue.put("LeftSquareBracket", "'['");
    		tokenNameToValue.put("RightSquareBracket", "']'");
    		tokenNameToValue.put("CircumflexAccent", "'^'");
    		tokenNameToValue.put("ExclamationMarkEqualsSign", "'!='");
    		tokenNameToValue.put("HyphenMinusGreaterThanSign", "'->'");
    		tokenNameToValue.put("LessThanSignEqualsSign", "'<='");
    		tokenNameToValue.put("EqualsSignEqualsSign", "'=='");
    		tokenNameToValue.put("GreaterThanSignEqualsSign", "'>='");
    		tokenNameToValue.put("In", "'in'");
    		tokenNameToValue.put("Or", "'or'");
    		tokenNameToValue.put("Pk", "'pk'");
    		tokenNameToValue.put("And", "'and'");
    		tokenNameToValue.put("Chr", "'chr'");
    		tokenNameToValue.put("Dec", "'dec'");
    		tokenNameToValue.put("Int", "'int'");
    		tokenNameToValue.put("Len", "'len'");
    		tokenNameToValue.put("Not", "'not'");
    		tokenNameToValue.put("Str", "'str'");
    		tokenNameToValue.put("HalfwidthHangulFillerHalfwidthHangulFillerHalfwidthHangulFiller", "'\uFFA0\uFFA0\uFFA0'");
    		tokenNameToValue.put("Bits", "'bits'");
    		tokenNameToValue.put("Bool", "'bool'");
    		tokenNameToValue.put("Date", "'date'");
    		tokenNameToValue.put("Like", "'like'");
    		tokenNameToValue.put("Stxt", "'stxt'");
    		tokenNameToValue.put("Time", "'time'");
    		tokenNameToValue.put("True", "'true'");
    		tokenNameToValue.put("False", "'false'");
    		tokenNameToValue.put("Round", "'round'");
    		tokenNameToValue.put("Stamp", "'stamp'");
    		tokenNameToValue.put("Unset", "'unset'");
    	}

    	public void setGrammarAccess(DdGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		String result = tokenNameToValue.get(tokenName);
    		if (result == null)
    			result = tokenName;
    		return result;
    	}



    // $ANTLR start "entryRuleDataModelFragment"
    // InternalDdParser.g:101:1: entryRuleDataModelFragment : ruleDataModelFragment EOF ;
    public final void entryRuleDataModelFragment() throws RecognitionException {
        try {
            // InternalDdParser.g:102:1: ( ruleDataModelFragment EOF )
            // InternalDdParser.g:103:1: ruleDataModelFragment EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDataModelFragmentRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDataModelFragment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDataModelFragmentRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDataModelFragment"


    // $ANTLR start "ruleDataModelFragment"
    // InternalDdParser.g:110:1: ruleDataModelFragment : ( ( rule__DataModelFragment__Group__0 ) ) ;
    public final void ruleDataModelFragment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:114:2: ( ( ( rule__DataModelFragment__Group__0 ) ) )
            // InternalDdParser.g:115:2: ( ( rule__DataModelFragment__Group__0 ) )
            {
            // InternalDdParser.g:115:2: ( ( rule__DataModelFragment__Group__0 ) )
            // InternalDdParser.g:116:3: ( rule__DataModelFragment__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDataModelFragmentAccess().getGroup()); 
            }
            // InternalDdParser.g:117:3: ( rule__DataModelFragment__Group__0 )
            // InternalDdParser.g:117:4: rule__DataModelFragment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DataModelFragment__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDataModelFragmentAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataModelFragment"


    // $ANTLR start "entryRuleConstant"
    // InternalDdParser.g:126:1: entryRuleConstant : ruleConstant EOF ;
    public final void entryRuleConstant() throws RecognitionException {
        try {
            // InternalDdParser.g:127:1: ( ruleConstant EOF )
            // InternalDdParser.g:128:1: ruleConstant EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleConstant();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // InternalDdParser.g:135:1: ruleConstant : ( ( rule__Constant__Group__0 ) ) ;
    public final void ruleConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:139:2: ( ( ( rule__Constant__Group__0 ) ) )
            // InternalDdParser.g:140:2: ( ( rule__Constant__Group__0 ) )
            {
            // InternalDdParser.g:140:2: ( ( rule__Constant__Group__0 ) )
            // InternalDdParser.g:141:3: ( rule__Constant__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getGroup()); 
            }
            // InternalDdParser.g:142:3: ( rule__Constant__Group__0 )
            // InternalDdParser.g:142:4: rule__Constant__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Constant__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstant"


    // $ANTLR start "entryRuleEntity"
    // InternalDdParser.g:151:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalDdParser.g:152:1: ( ruleEntity EOF )
            // InternalDdParser.g:153:1: ruleEntity EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEntity();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalDdParser.g:160:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:164:2: ( ( ( rule__Entity__Group__0 ) ) )
            // InternalDdParser.g:165:2: ( ( rule__Entity__Group__0 ) )
            {
            // InternalDdParser.g:165:2: ( ( rule__Entity__Group__0 ) )
            // InternalDdParser.g:166:3: ( rule__Entity__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getGroup()); 
            }
            // InternalDdParser.g:167:3: ( rule__Entity__Group__0 )
            // InternalDdParser.g:167:4: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleAttribute"
    // InternalDdParser.g:176:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalDdParser.g:177:1: ( ruleAttribute EOF )
            // InternalDdParser.g:178:1: ruleAttribute EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalDdParser.g:185:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:189:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalDdParser.g:190:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalDdParser.g:190:2: ( ( rule__Attribute__Group__0 ) )
            // InternalDdParser.g:191:3: ( rule__Attribute__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getGroup()); 
            }
            // InternalDdParser.g:192:3: ( rule__Attribute__Group__0 )
            // InternalDdParser.g:192:4: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleAttributeSize"
    // InternalDdParser.g:201:1: entryRuleAttributeSize : ruleAttributeSize EOF ;
    public final void entryRuleAttributeSize() throws RecognitionException {
        try {
            // InternalDdParser.g:202:1: ( ruleAttributeSize EOF )
            // InternalDdParser.g:203:1: ruleAttributeSize EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeSizeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAttributeSize();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeSizeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttributeSize"


    // $ANTLR start "ruleAttributeSize"
    // InternalDdParser.g:210:1: ruleAttributeSize : ( ( rule__AttributeSize__Group__0 ) ) ;
    public final void ruleAttributeSize() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:214:2: ( ( ( rule__AttributeSize__Group__0 ) ) )
            // InternalDdParser.g:215:2: ( ( rule__AttributeSize__Group__0 ) )
            {
            // InternalDdParser.g:215:2: ( ( rule__AttributeSize__Group__0 ) )
            // InternalDdParser.g:216:3: ( rule__AttributeSize__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeSizeAccess().getGroup()); 
            }
            // InternalDdParser.g:217:3: ( rule__AttributeSize__Group__0 )
            // InternalDdParser.g:217:4: rule__AttributeSize__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AttributeSize__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeSizeAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributeSize"


    // $ANTLR start "entryRuleArraySize"
    // InternalDdParser.g:226:1: entryRuleArraySize : ruleArraySize EOF ;
    public final void entryRuleArraySize() throws RecognitionException {
        try {
            // InternalDdParser.g:227:1: ( ruleArraySize EOF )
            // InternalDdParser.g:228:1: ruleArraySize EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArraySizeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleArraySize();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArraySizeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArraySize"


    // $ANTLR start "ruleArraySize"
    // InternalDdParser.g:235:1: ruleArraySize : ( ( rule__ArraySize__Group__0 ) ) ;
    public final void ruleArraySize() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:239:2: ( ( ( rule__ArraySize__Group__0 ) ) )
            // InternalDdParser.g:240:2: ( ( rule__ArraySize__Group__0 ) )
            {
            // InternalDdParser.g:240:2: ( ( rule__ArraySize__Group__0 ) )
            // InternalDdParser.g:241:3: ( rule__ArraySize__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArraySizeAccess().getGroup()); 
            }
            // InternalDdParser.g:242:3: ( rule__ArraySize__Group__0 )
            // InternalDdParser.g:242:4: rule__ArraySize__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ArraySize__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArraySizeAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArraySize"


    // $ANTLR start "entryRuleRelationship"
    // InternalDdParser.g:251:1: entryRuleRelationship : ruleRelationship EOF ;
    public final void entryRuleRelationship() throws RecognitionException {
        try {
            // InternalDdParser.g:252:1: ( ruleRelationship EOF )
            // InternalDdParser.g:253:1: ruleRelationship EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleRelationship();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRelationship"


    // $ANTLR start "ruleRelationship"
    // InternalDdParser.g:260:1: ruleRelationship : ( ( rule__Relationship__Group__0 ) ) ;
    public final void ruleRelationship() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:264:2: ( ( ( rule__Relationship__Group__0 ) ) )
            // InternalDdParser.g:265:2: ( ( rule__Relationship__Group__0 ) )
            {
            // InternalDdParser.g:265:2: ( ( rule__Relationship__Group__0 ) )
            // InternalDdParser.g:266:3: ( rule__Relationship__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getGroup()); 
            }
            // InternalDdParser.g:267:3: ( rule__Relationship__Group__0 )
            // InternalDdParser.g:267:4: rule__Relationship__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Relationship__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelationship"


    // $ANTLR start "entryRuleConstraint"
    // InternalDdParser.g:276:1: entryRuleConstraint : ruleConstraint EOF ;
    public final void entryRuleConstraint() throws RecognitionException {
        try {
            // InternalDdParser.g:277:1: ( ruleConstraint EOF )
            // InternalDdParser.g:278:1: ruleConstraint EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleConstraint();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstraintRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // InternalDdParser.g:285:1: ruleConstraint : ( ( rule__Constraint__Group__0 ) ) ;
    public final void ruleConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:289:2: ( ( ( rule__Constraint__Group__0 ) ) )
            // InternalDdParser.g:290:2: ( ( rule__Constraint__Group__0 ) )
            {
            // InternalDdParser.g:290:2: ( ( rule__Constraint__Group__0 ) )
            // InternalDdParser.g:291:3: ( rule__Constraint__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintAccess().getGroup()); 
            }
            // InternalDdParser.g:292:3: ( rule__Constraint__Group__0 )
            // InternalDdParser.g:292:4: rule__Constraint__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstraintAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRuleCheckExpression"
    // InternalDdParser.g:301:1: entryRuleCheckExpression : ruleCheckExpression EOF ;
    public final void entryRuleCheckExpression() throws RecognitionException {
        try {
            // InternalDdParser.g:302:1: ( ruleCheckExpression EOF )
            // InternalDdParser.g:303:1: ruleCheckExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCheckExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCheckExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCheckExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCheckExpression"


    // $ANTLR start "ruleCheckExpression"
    // InternalDdParser.g:310:1: ruleCheckExpression : ( ( rule__CheckExpression__Group__0 ) ) ;
    public final void ruleCheckExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:314:2: ( ( ( rule__CheckExpression__Group__0 ) ) )
            // InternalDdParser.g:315:2: ( ( rule__CheckExpression__Group__0 ) )
            {
            // InternalDdParser.g:315:2: ( ( rule__CheckExpression__Group__0 ) )
            // InternalDdParser.g:316:3: ( rule__CheckExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCheckExpressionAccess().getGroup()); 
            }
            // InternalDdParser.g:317:3: ( rule__CheckExpression__Group__0 )
            // InternalDdParser.g:317:4: rule__CheckExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CheckExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCheckExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCheckExpression"


    // $ANTLR start "entryRuleSharkExpression"
    // InternalDdParser.g:326:1: entryRuleSharkExpression : ruleSharkExpression EOF ;
    public final void entryRuleSharkExpression() throws RecognitionException {
        try {
            // InternalDdParser.g:327:1: ( ruleSharkExpression EOF )
            // InternalDdParser.g:328:1: ruleSharkExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSharkExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSharkExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSharkExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSharkExpression"


    // $ANTLR start "ruleSharkExpression"
    // InternalDdParser.g:335:1: ruleSharkExpression : ( ( rule__SharkExpression__Alternatives ) ) ;
    public final void ruleSharkExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:339:2: ( ( ( rule__SharkExpression__Alternatives ) ) )
            // InternalDdParser.g:340:2: ( ( rule__SharkExpression__Alternatives ) )
            {
            // InternalDdParser.g:340:2: ( ( rule__SharkExpression__Alternatives ) )
            // InternalDdParser.g:341:3: ( rule__SharkExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSharkExpressionAccess().getAlternatives()); 
            }
            // InternalDdParser.g:342:3: ( rule__SharkExpression__Alternatives )
            // InternalDdParser.g:342:4: rule__SharkExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SharkExpression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSharkExpressionAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSharkExpression"


    // $ANTLR start "entryRuleBinaryExpression"
    // InternalDdParser.g:351:1: entryRuleBinaryExpression : ruleBinaryExpression EOF ;
    public final void entryRuleBinaryExpression() throws RecognitionException {
        try {
            // InternalDdParser.g:352:1: ( ruleBinaryExpression EOF )
            // InternalDdParser.g:353:1: ruleBinaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBinaryExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBinaryExpression"


    // $ANTLR start "ruleBinaryExpression"
    // InternalDdParser.g:360:1: ruleBinaryExpression : ( ( rule__BinaryExpression__Group__0 ) ) ;
    public final void ruleBinaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:364:2: ( ( ( rule__BinaryExpression__Group__0 ) ) )
            // InternalDdParser.g:365:2: ( ( rule__BinaryExpression__Group__0 ) )
            {
            // InternalDdParser.g:365:2: ( ( rule__BinaryExpression__Group__0 ) )
            // InternalDdParser.g:366:3: ( rule__BinaryExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryExpressionAccess().getGroup()); 
            }
            // InternalDdParser.g:367:3: ( rule__BinaryExpression__Group__0 )
            // InternalDdParser.g:367:4: rule__BinaryExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BinaryExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBinaryExpression"


    // $ANTLR start "entryRuleUnaryExpression"
    // InternalDdParser.g:376:1: entryRuleUnaryExpression : ruleUnaryExpression EOF ;
    public final void entryRuleUnaryExpression() throws RecognitionException {
        try {
            // InternalDdParser.g:377:1: ( ruleUnaryExpression EOF )
            // InternalDdParser.g:378:1: ruleUnaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleUnaryExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnaryExpression"


    // $ANTLR start "ruleUnaryExpression"
    // InternalDdParser.g:385:1: ruleUnaryExpression : ( ( rule__UnaryExpression__Group__0 ) ) ;
    public final void ruleUnaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:389:2: ( ( ( rule__UnaryExpression__Group__0 ) ) )
            // InternalDdParser.g:390:2: ( ( rule__UnaryExpression__Group__0 ) )
            {
            // InternalDdParser.g:390:2: ( ( rule__UnaryExpression__Group__0 ) )
            // InternalDdParser.g:391:3: ( rule__UnaryExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getGroup()); 
            }
            // InternalDdParser.g:392:3: ( rule__UnaryExpression__Group__0 )
            // InternalDdParser.g:392:4: rule__UnaryExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UnaryExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnaryExpression"


    // $ANTLR start "entryRuleAddExpression"
    // InternalDdParser.g:401:1: entryRuleAddExpression : ruleAddExpression EOF ;
    public final void entryRuleAddExpression() throws RecognitionException {
        try {
            // InternalDdParser.g:402:1: ( ruleAddExpression EOF )
            // InternalDdParser.g:403:1: ruleAddExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAddExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAddExpression"


    // $ANTLR start "ruleAddExpression"
    // InternalDdParser.g:410:1: ruleAddExpression : ( ( rule__AddExpression__Group__0 ) ) ;
    public final void ruleAddExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:414:2: ( ( ( rule__AddExpression__Group__0 ) ) )
            // InternalDdParser.g:415:2: ( ( rule__AddExpression__Group__0 ) )
            {
            // InternalDdParser.g:415:2: ( ( rule__AddExpression__Group__0 ) )
            // InternalDdParser.g:416:3: ( rule__AddExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getGroup()); 
            }
            // InternalDdParser.g:417:3: ( rule__AddExpression__Group__0 )
            // InternalDdParser.g:417:4: rule__AddExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AddExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAddExpression"


    // $ANTLR start "entryRuleAddExpressionElt"
    // InternalDdParser.g:426:1: entryRuleAddExpressionElt : ruleAddExpressionElt EOF ;
    public final void entryRuleAddExpressionElt() throws RecognitionException {
        try {
            // InternalDdParser.g:427:1: ( ruleAddExpressionElt EOF )
            // InternalDdParser.g:428:1: ruleAddExpressionElt EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionEltRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAddExpressionElt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddExpressionEltRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAddExpressionElt"


    // $ANTLR start "ruleAddExpressionElt"
    // InternalDdParser.g:435:1: ruleAddExpressionElt : ( ( rule__AddExpressionElt__Group__0 ) ) ;
    public final void ruleAddExpressionElt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:439:2: ( ( ( rule__AddExpressionElt__Group__0 ) ) )
            // InternalDdParser.g:440:2: ( ( rule__AddExpressionElt__Group__0 ) )
            {
            // InternalDdParser.g:440:2: ( ( rule__AddExpressionElt__Group__0 ) )
            // InternalDdParser.g:441:3: ( rule__AddExpressionElt__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionEltAccess().getGroup()); 
            }
            // InternalDdParser.g:442:3: ( rule__AddExpressionElt__Group__0 )
            // InternalDdParser.g:442:4: rule__AddExpressionElt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AddExpressionElt__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddExpressionEltAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAddExpressionElt"


    // $ANTLR start "entryRuleMultExpression"
    // InternalDdParser.g:451:1: entryRuleMultExpression : ruleMultExpression EOF ;
    public final void entryRuleMultExpression() throws RecognitionException {
        try {
            // InternalDdParser.g:452:1: ( ruleMultExpression EOF )
            // InternalDdParser.g:453:1: ruleMultExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMultExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMultExpression"


    // $ANTLR start "ruleMultExpression"
    // InternalDdParser.g:460:1: ruleMultExpression : ( ( rule__MultExpression__Group__0 ) ) ;
    public final void ruleMultExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:464:2: ( ( ( rule__MultExpression__Group__0 ) ) )
            // InternalDdParser.g:465:2: ( ( rule__MultExpression__Group__0 ) )
            {
            // InternalDdParser.g:465:2: ( ( rule__MultExpression__Group__0 ) )
            // InternalDdParser.g:466:3: ( rule__MultExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getGroup()); 
            }
            // InternalDdParser.g:467:3: ( rule__MultExpression__Group__0 )
            // InternalDdParser.g:467:4: rule__MultExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MultExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultExpression"


    // $ANTLR start "entryRuleMultExpressionElt"
    // InternalDdParser.g:476:1: entryRuleMultExpressionElt : ruleMultExpressionElt EOF ;
    public final void entryRuleMultExpressionElt() throws RecognitionException {
        try {
            // InternalDdParser.g:477:1: ( ruleMultExpressionElt EOF )
            // InternalDdParser.g:478:1: ruleMultExpressionElt EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionEltRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMultExpressionElt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultExpressionEltRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMultExpressionElt"


    // $ANTLR start "ruleMultExpressionElt"
    // InternalDdParser.g:485:1: ruleMultExpressionElt : ( ( rule__MultExpressionElt__Group__0 ) ) ;
    public final void ruleMultExpressionElt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:489:2: ( ( ( rule__MultExpressionElt__Group__0 ) ) )
            // InternalDdParser.g:490:2: ( ( rule__MultExpressionElt__Group__0 ) )
            {
            // InternalDdParser.g:490:2: ( ( rule__MultExpressionElt__Group__0 ) )
            // InternalDdParser.g:491:3: ( rule__MultExpressionElt__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionEltAccess().getGroup()); 
            }
            // InternalDdParser.g:492:3: ( rule__MultExpressionElt__Group__0 )
            // InternalDdParser.g:492:4: rule__MultExpressionElt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MultExpressionElt__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultExpressionEltAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultExpressionElt"


    // $ANTLR start "entryRuleAndExpression"
    // InternalDdParser.g:501:1: entryRuleAndExpression : ruleAndExpression EOF ;
    public final void entryRuleAndExpression() throws RecognitionException {
        try {
            // InternalDdParser.g:502:1: ( ruleAndExpression EOF )
            // InternalDdParser.g:503:1: ruleAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAndExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // InternalDdParser.g:510:1: ruleAndExpression : ( ( rule__AndExpression__Group__0 ) ) ;
    public final void ruleAndExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:514:2: ( ( ( rule__AndExpression__Group__0 ) ) )
            // InternalDdParser.g:515:2: ( ( rule__AndExpression__Group__0 ) )
            {
            // InternalDdParser.g:515:2: ( ( rule__AndExpression__Group__0 ) )
            // InternalDdParser.g:516:3: ( rule__AndExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getGroup()); 
            }
            // InternalDdParser.g:517:3: ( rule__AndExpression__Group__0 )
            // InternalDdParser.g:517:4: rule__AndExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleAndExpressionElt"
    // InternalDdParser.g:526:1: entryRuleAndExpressionElt : ruleAndExpressionElt EOF ;
    public final void entryRuleAndExpressionElt() throws RecognitionException {
        try {
            // InternalDdParser.g:527:1: ( ruleAndExpressionElt EOF )
            // InternalDdParser.g:528:1: ruleAndExpressionElt EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionEltRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAndExpressionElt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionEltRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAndExpressionElt"


    // $ANTLR start "ruleAndExpressionElt"
    // InternalDdParser.g:535:1: ruleAndExpressionElt : ( ( rule__AndExpressionElt__Group__0 ) ) ;
    public final void ruleAndExpressionElt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:539:2: ( ( ( rule__AndExpressionElt__Group__0 ) ) )
            // InternalDdParser.g:540:2: ( ( rule__AndExpressionElt__Group__0 ) )
            {
            // InternalDdParser.g:540:2: ( ( rule__AndExpressionElt__Group__0 ) )
            // InternalDdParser.g:541:3: ( rule__AndExpressionElt__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionEltAccess().getGroup()); 
            }
            // InternalDdParser.g:542:3: ( rule__AndExpressionElt__Group__0 )
            // InternalDdParser.g:542:4: rule__AndExpressionElt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AndExpressionElt__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionEltAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAndExpressionElt"


    // $ANTLR start "entryRuleOrExpression"
    // InternalDdParser.g:551:1: entryRuleOrExpression : ruleOrExpression EOF ;
    public final void entryRuleOrExpression() throws RecognitionException {
        try {
            // InternalDdParser.g:552:1: ( ruleOrExpression EOF )
            // InternalDdParser.g:553:1: ruleOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleOrExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOrExpression"


    // $ANTLR start "ruleOrExpression"
    // InternalDdParser.g:560:1: ruleOrExpression : ( ( rule__OrExpression__Group__0 ) ) ;
    public final void ruleOrExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:564:2: ( ( ( rule__OrExpression__Group__0 ) ) )
            // InternalDdParser.g:565:2: ( ( rule__OrExpression__Group__0 ) )
            {
            // InternalDdParser.g:565:2: ( ( rule__OrExpression__Group__0 ) )
            // InternalDdParser.g:566:3: ( rule__OrExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getGroup()); 
            }
            // InternalDdParser.g:567:3: ( rule__OrExpression__Group__0 )
            // InternalDdParser.g:567:4: rule__OrExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OrExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleOrExpressionElt"
    // InternalDdParser.g:576:1: entryRuleOrExpressionElt : ruleOrExpressionElt EOF ;
    public final void entryRuleOrExpressionElt() throws RecognitionException {
        try {
            // InternalDdParser.g:577:1: ( ruleOrExpressionElt EOF )
            // InternalDdParser.g:578:1: ruleOrExpressionElt EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionEltRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleOrExpressionElt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionEltRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOrExpressionElt"


    // $ANTLR start "ruleOrExpressionElt"
    // InternalDdParser.g:585:1: ruleOrExpressionElt : ( ( rule__OrExpressionElt__Group__0 ) ) ;
    public final void ruleOrExpressionElt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:589:2: ( ( ( rule__OrExpressionElt__Group__0 ) ) )
            // InternalDdParser.g:590:2: ( ( rule__OrExpressionElt__Group__0 ) )
            {
            // InternalDdParser.g:590:2: ( ( rule__OrExpressionElt__Group__0 ) )
            // InternalDdParser.g:591:3: ( rule__OrExpressionElt__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionEltAccess().getGroup()); 
            }
            // InternalDdParser.g:592:3: ( rule__OrExpressionElt__Group__0 )
            // InternalDdParser.g:592:4: rule__OrExpressionElt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OrExpressionElt__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionEltAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOrExpressionElt"


    // $ANTLR start "entryRuleCatExpression"
    // InternalDdParser.g:601:1: entryRuleCatExpression : ruleCatExpression EOF ;
    public final void entryRuleCatExpression() throws RecognitionException {
        try {
            // InternalDdParser.g:602:1: ( ruleCatExpression EOF )
            // InternalDdParser.g:603:1: ruleCatExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCatExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCatExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCatExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCatExpression"


    // $ANTLR start "ruleCatExpression"
    // InternalDdParser.g:610:1: ruleCatExpression : ( ( rule__CatExpression__Group__0 ) ) ;
    public final void ruleCatExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:614:2: ( ( ( rule__CatExpression__Group__0 ) ) )
            // InternalDdParser.g:615:2: ( ( rule__CatExpression__Group__0 ) )
            {
            // InternalDdParser.g:615:2: ( ( rule__CatExpression__Group__0 ) )
            // InternalDdParser.g:616:3: ( rule__CatExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCatExpressionAccess().getGroup()); 
            }
            // InternalDdParser.g:617:3: ( rule__CatExpression__Group__0 )
            // InternalDdParser.g:617:4: rule__CatExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CatExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCatExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCatExpression"


    // $ANTLR start "entryRuleCatExpressionElt"
    // InternalDdParser.g:626:1: entryRuleCatExpressionElt : ruleCatExpressionElt EOF ;
    public final void entryRuleCatExpressionElt() throws RecognitionException {
        try {
            // InternalDdParser.g:627:1: ( ruleCatExpressionElt EOF )
            // InternalDdParser.g:628:1: ruleCatExpressionElt EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCatExpressionEltRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCatExpressionElt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCatExpressionEltRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCatExpressionElt"


    // $ANTLR start "ruleCatExpressionElt"
    // InternalDdParser.g:635:1: ruleCatExpressionElt : ( ( rule__CatExpressionElt__Group__0 ) ) ;
    public final void ruleCatExpressionElt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:639:2: ( ( ( rule__CatExpressionElt__Group__0 ) ) )
            // InternalDdParser.g:640:2: ( ( rule__CatExpressionElt__Group__0 ) )
            {
            // InternalDdParser.g:640:2: ( ( rule__CatExpressionElt__Group__0 ) )
            // InternalDdParser.g:641:3: ( rule__CatExpressionElt__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCatExpressionEltAccess().getGroup()); 
            }
            // InternalDdParser.g:642:3: ( rule__CatExpressionElt__Group__0 )
            // InternalDdParser.g:642:4: rule__CatExpressionElt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CatExpressionElt__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCatExpressionEltAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCatExpressionElt"


    // $ANTLR start "entryRuleListExpression"
    // InternalDdParser.g:651:1: entryRuleListExpression : ruleListExpression EOF ;
    public final void entryRuleListExpression() throws RecognitionException {
        try {
            // InternalDdParser.g:652:1: ( ruleListExpression EOF )
            // InternalDdParser.g:653:1: ruleListExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleListExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleListExpression"


    // $ANTLR start "ruleListExpression"
    // InternalDdParser.g:660:1: ruleListExpression : ( ( rule__ListExpression__Group__0 ) ) ;
    public final void ruleListExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:664:2: ( ( ( rule__ListExpression__Group__0 ) ) )
            // InternalDdParser.g:665:2: ( ( rule__ListExpression__Group__0 ) )
            {
            // InternalDdParser.g:665:2: ( ( rule__ListExpression__Group__0 ) )
            // InternalDdParser.g:666:3: ( rule__ListExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getGroup()); 
            }
            // InternalDdParser.g:667:3: ( rule__ListExpression__Group__0 )
            // InternalDdParser.g:667:4: rule__ListExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ListExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleListExpression"


    // $ANTLR start "entryRuleListExpressionElt"
    // InternalDdParser.g:676:1: entryRuleListExpressionElt : ruleListExpressionElt EOF ;
    public final void entryRuleListExpressionElt() throws RecognitionException {
        try {
            // InternalDdParser.g:677:1: ( ruleListExpressionElt EOF )
            // InternalDdParser.g:678:1: ruleListExpressionElt EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionEltRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleListExpressionElt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionEltRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleListExpressionElt"


    // $ANTLR start "ruleListExpressionElt"
    // InternalDdParser.g:685:1: ruleListExpressionElt : ( ( rule__ListExpressionElt__Group__0 ) ) ;
    public final void ruleListExpressionElt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:689:2: ( ( ( rule__ListExpressionElt__Group__0 ) ) )
            // InternalDdParser.g:690:2: ( ( rule__ListExpressionElt__Group__0 ) )
            {
            // InternalDdParser.g:690:2: ( ( rule__ListExpressionElt__Group__0 ) )
            // InternalDdParser.g:691:3: ( rule__ListExpressionElt__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionEltAccess().getGroup()); 
            }
            // InternalDdParser.g:692:3: ( rule__ListExpressionElt__Group__0 )
            // InternalDdParser.g:692:4: rule__ListExpressionElt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ListExpressionElt__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionEltAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleListExpressionElt"


    // $ANTLR start "entryRuleRangeExpression"
    // InternalDdParser.g:701:1: entryRuleRangeExpression : ruleRangeExpression EOF ;
    public final void entryRuleRangeExpression() throws RecognitionException {
        try {
            // InternalDdParser.g:702:1: ( ruleRangeExpression EOF )
            // InternalDdParser.g:703:1: ruleRangeExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleRangeExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRangeExpression"


    // $ANTLR start "ruleRangeExpression"
    // InternalDdParser.g:710:1: ruleRangeExpression : ( ( rule__RangeExpression__Alternatives ) ) ;
    public final void ruleRangeExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:714:2: ( ( ( rule__RangeExpression__Alternatives ) ) )
            // InternalDdParser.g:715:2: ( ( rule__RangeExpression__Alternatives ) )
            {
            // InternalDdParser.g:715:2: ( ( rule__RangeExpression__Alternatives ) )
            // InternalDdParser.g:716:3: ( rule__RangeExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeExpressionAccess().getAlternatives()); 
            }
            // InternalDdParser.g:717:3: ( rule__RangeExpression__Alternatives )
            // InternalDdParser.g:717:4: rule__RangeExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RangeExpression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeExpressionAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRangeExpression"


    // $ANTLR start "entryRuleTerminalExpression"
    // InternalDdParser.g:726:1: entryRuleTerminalExpression : ruleTerminalExpression EOF ;
    public final void entryRuleTerminalExpression() throws RecognitionException {
        try {
            // InternalDdParser.g:727:1: ( ruleTerminalExpression EOF )
            // InternalDdParser.g:728:1: ruleTerminalExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTerminalExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTerminalExpression"


    // $ANTLR start "ruleTerminalExpression"
    // InternalDdParser.g:735:1: ruleTerminalExpression : ( ( rule__TerminalExpression__Alternatives ) ) ;
    public final void ruleTerminalExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:739:2: ( ( ( rule__TerminalExpression__Alternatives ) ) )
            // InternalDdParser.g:740:2: ( ( rule__TerminalExpression__Alternatives ) )
            {
            // InternalDdParser.g:740:2: ( ( rule__TerminalExpression__Alternatives ) )
            // InternalDdParser.g:741:3: ( rule__TerminalExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getAlternatives()); 
            }
            // InternalDdParser.g:742:3: ( rule__TerminalExpression__Alternatives )
            // InternalDdParser.g:742:4: rule__TerminalExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTerminalExpression"


    // $ANTLR start "entryRuleIdentifierExpression"
    // InternalDdParser.g:751:1: entryRuleIdentifierExpression : ruleIdentifierExpression EOF ;
    public final void entryRuleIdentifierExpression() throws RecognitionException {
        try {
            // InternalDdParser.g:752:1: ( ruleIdentifierExpression EOF )
            // InternalDdParser.g:753:1: ruleIdentifierExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentifierExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleIdentifierExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdentifierExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIdentifierExpression"


    // $ANTLR start "ruleIdentifierExpression"
    // InternalDdParser.g:760:1: ruleIdentifierExpression : ( ( rule__IdentifierExpression__Group__0 ) ) ;
    public final void ruleIdentifierExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:764:2: ( ( ( rule__IdentifierExpression__Group__0 ) ) )
            // InternalDdParser.g:765:2: ( ( rule__IdentifierExpression__Group__0 ) )
            {
            // InternalDdParser.g:765:2: ( ( rule__IdentifierExpression__Group__0 ) )
            // InternalDdParser.g:766:3: ( rule__IdentifierExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentifierExpressionAccess().getGroup()); 
            }
            // InternalDdParser.g:767:3: ( rule__IdentifierExpression__Group__0 )
            // InternalDdParser.g:767:4: rule__IdentifierExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IdentifierExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdentifierExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIdentifierExpression"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalDdParser.g:776:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalDdParser.g:777:1: ( ruleQualifiedName EOF )
            // InternalDdParser.g:778:1: ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalDdParser.g:785:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:789:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalDdParser.g:790:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalDdParser.g:790:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalDdParser.g:791:3: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // InternalDdParser.g:792:3: ( rule__QualifiedName__Group__0 )
            // InternalDdParser.g:792:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleLineComment"
    // InternalDdParser.g:801:1: entryRuleLineComment : ruleLineComment EOF ;
    public final void entryRuleLineComment() throws RecognitionException {
        try {
            // InternalDdParser.g:802:1: ( ruleLineComment EOF )
            // InternalDdParser.g:803:1: ruleLineComment EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLineCommentRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLineComment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLineCommentRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLineComment"


    // $ANTLR start "ruleLineComment"
    // InternalDdParser.g:810:1: ruleLineComment : ( ( rule__LineComment__Group__0 ) ) ;
    public final void ruleLineComment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:814:2: ( ( ( rule__LineComment__Group__0 ) ) )
            // InternalDdParser.g:815:2: ( ( rule__LineComment__Group__0 ) )
            {
            // InternalDdParser.g:815:2: ( ( rule__LineComment__Group__0 ) )
            // InternalDdParser.g:816:3: ( rule__LineComment__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLineCommentAccess().getGroup()); 
            }
            // InternalDdParser.g:817:3: ( rule__LineComment__Group__0 )
            // InternalDdParser.g:817:4: rule__LineComment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LineComment__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLineCommentAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLineComment"


    // $ANTLR start "entryRuleTrailComment"
    // InternalDdParser.g:826:1: entryRuleTrailComment : ruleTrailComment EOF ;
    public final void entryRuleTrailComment() throws RecognitionException {
        try {
            // InternalDdParser.g:827:1: ( ruleTrailComment EOF )
            // InternalDdParser.g:828:1: ruleTrailComment EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTrailCommentRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTrailComment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTrailCommentRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTrailComment"


    // $ANTLR start "ruleTrailComment"
    // InternalDdParser.g:835:1: ruleTrailComment : ( ( rule__TrailComment__Group__0 ) ) ;
    public final void ruleTrailComment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:839:2: ( ( ( rule__TrailComment__Group__0 ) ) )
            // InternalDdParser.g:840:2: ( ( rule__TrailComment__Group__0 ) )
            {
            // InternalDdParser.g:840:2: ( ( rule__TrailComment__Group__0 ) )
            // InternalDdParser.g:841:3: ( rule__TrailComment__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTrailCommentAccess().getGroup()); 
            }
            // InternalDdParser.g:842:3: ( rule__TrailComment__Group__0 )
            // InternalDdParser.g:842:4: rule__TrailComment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TrailComment__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTrailCommentAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTrailComment"


    // $ANTLR start "ruleBinaryOperator"
    // InternalDdParser.g:851:1: ruleBinaryOperator : ( ( rule__BinaryOperator__Alternatives ) ) ;
    public final void ruleBinaryOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:855:1: ( ( ( rule__BinaryOperator__Alternatives ) ) )
            // InternalDdParser.g:856:2: ( ( rule__BinaryOperator__Alternatives ) )
            {
            // InternalDdParser.g:856:2: ( ( rule__BinaryOperator__Alternatives ) )
            // InternalDdParser.g:857:3: ( rule__BinaryOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryOperatorAccess().getAlternatives()); 
            }
            // InternalDdParser.g:858:3: ( rule__BinaryOperator__Alternatives )
            // InternalDdParser.g:858:4: rule__BinaryOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BinaryOperator__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryOperatorAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBinaryOperator"


    // $ANTLR start "ruleUnaryOperator"
    // InternalDdParser.g:867:1: ruleUnaryOperator : ( ( rule__UnaryOperator__Alternatives ) ) ;
    public final void ruleUnaryOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:871:1: ( ( ( rule__UnaryOperator__Alternatives ) ) )
            // InternalDdParser.g:872:2: ( ( rule__UnaryOperator__Alternatives ) )
            {
            // InternalDdParser.g:872:2: ( ( rule__UnaryOperator__Alternatives ) )
            // InternalDdParser.g:873:3: ( rule__UnaryOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryOperatorAccess().getAlternatives()); 
            }
            // InternalDdParser.g:874:3: ( rule__UnaryOperator__Alternatives )
            // InternalDdParser.g:874:4: rule__UnaryOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__UnaryOperator__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryOperatorAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnaryOperator"


    // $ANTLR start "ruleUnset"
    // InternalDdParser.g:883:1: ruleUnset : ( ( Unset ) ) ;
    public final void ruleUnset() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:887:1: ( ( ( Unset ) ) )
            // InternalDdParser.g:888:2: ( ( Unset ) )
            {
            // InternalDdParser.g:888:2: ( ( Unset ) )
            // InternalDdParser.g:889:3: ( Unset )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnsetAccess().getUnsetEnumLiteralDeclaration()); 
            }
            // InternalDdParser.g:890:3: ( Unset )
            // InternalDdParser.g:890:4: Unset
            {
            match(input,Unset,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnsetAccess().getUnsetEnumLiteralDeclaration()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnset"


    // $ANTLR start "ruleBoolean"
    // InternalDdParser.g:899:1: ruleBoolean : ( ( rule__Boolean__Alternatives ) ) ;
    public final void ruleBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:903:1: ( ( ( rule__Boolean__Alternatives ) ) )
            // InternalDdParser.g:904:2: ( ( rule__Boolean__Alternatives ) )
            {
            // InternalDdParser.g:904:2: ( ( rule__Boolean__Alternatives ) )
            // InternalDdParser.g:905:3: ( rule__Boolean__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanAccess().getAlternatives()); 
            }
            // InternalDdParser.g:906:3: ( rule__Boolean__Alternatives )
            // InternalDdParser.g:906:4: rule__Boolean__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Boolean__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "ruleDataType"
    // InternalDdParser.g:915:1: ruleDataType : ( ( rule__DataType__Alternatives ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:919:1: ( ( ( rule__DataType__Alternatives ) ) )
            // InternalDdParser.g:920:2: ( ( rule__DataType__Alternatives ) )
            {
            // InternalDdParser.g:920:2: ( ( rule__DataType__Alternatives ) )
            // InternalDdParser.g:921:3: ( rule__DataType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDataTypeAccess().getAlternatives()); 
            }
            // InternalDdParser.g:922:3: ( rule__DataType__Alternatives )
            // InternalDdParser.g:922:4: rule__DataType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDataTypeAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataType"


    // $ANTLR start "rule__SharkExpression__Alternatives"
    // InternalDdParser.g:930:1: rule__SharkExpression__Alternatives : ( ( ( ruleRangeExpression ) ) | ( ( ruleAddExpression ) ) | ( ( ruleMultExpression ) ) | ( ( ruleAndExpression ) ) | ( ( ruleOrExpression ) ) | ( ( ruleCatExpression ) ) | ( ( ruleListExpression ) ) | ( ruleBinaryExpression ) | ( ruleUnaryExpression ) | ( ruleTerminalExpression ) | ( ruleIdentifierExpression ) );
    public final void rule__SharkExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:934:1: ( ( ( ruleRangeExpression ) ) | ( ( ruleAddExpression ) ) | ( ( ruleMultExpression ) ) | ( ( ruleAndExpression ) ) | ( ( ruleOrExpression ) ) | ( ( ruleCatExpression ) ) | ( ( ruleListExpression ) ) | ( ruleBinaryExpression ) | ( ruleUnaryExpression ) | ( ruleTerminalExpression ) | ( ruleIdentifierExpression ) )
            int alt1=11;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalDdParser.g:935:2: ( ( ruleRangeExpression ) )
                    {
                    // InternalDdParser.g:935:2: ( ( ruleRangeExpression ) )
                    // InternalDdParser.g:936:3: ( ruleRangeExpression )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSharkExpressionAccess().getRangeExpressionParserRuleCall_0()); 
                    }
                    // InternalDdParser.g:937:3: ( ruleRangeExpression )
                    // InternalDdParser.g:937:4: ruleRangeExpression
                    {
                    pushFollow(FOLLOW_2);
                    ruleRangeExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSharkExpressionAccess().getRangeExpressionParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDdParser.g:941:2: ( ( ruleAddExpression ) )
                    {
                    // InternalDdParser.g:941:2: ( ( ruleAddExpression ) )
                    // InternalDdParser.g:942:3: ( ruleAddExpression )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSharkExpressionAccess().getAddExpressionParserRuleCall_1()); 
                    }
                    // InternalDdParser.g:943:3: ( ruleAddExpression )
                    // InternalDdParser.g:943:4: ruleAddExpression
                    {
                    pushFollow(FOLLOW_2);
                    ruleAddExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSharkExpressionAccess().getAddExpressionParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDdParser.g:947:2: ( ( ruleMultExpression ) )
                    {
                    // InternalDdParser.g:947:2: ( ( ruleMultExpression ) )
                    // InternalDdParser.g:948:3: ( ruleMultExpression )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSharkExpressionAccess().getMultExpressionParserRuleCall_2()); 
                    }
                    // InternalDdParser.g:949:3: ( ruleMultExpression )
                    // InternalDdParser.g:949:4: ruleMultExpression
                    {
                    pushFollow(FOLLOW_2);
                    ruleMultExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSharkExpressionAccess().getMultExpressionParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDdParser.g:953:2: ( ( ruleAndExpression ) )
                    {
                    // InternalDdParser.g:953:2: ( ( ruleAndExpression ) )
                    // InternalDdParser.g:954:3: ( ruleAndExpression )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSharkExpressionAccess().getAndExpressionParserRuleCall_3()); 
                    }
                    // InternalDdParser.g:955:3: ( ruleAndExpression )
                    // InternalDdParser.g:955:4: ruleAndExpression
                    {
                    pushFollow(FOLLOW_2);
                    ruleAndExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSharkExpressionAccess().getAndExpressionParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalDdParser.g:959:2: ( ( ruleOrExpression ) )
                    {
                    // InternalDdParser.g:959:2: ( ( ruleOrExpression ) )
                    // InternalDdParser.g:960:3: ( ruleOrExpression )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSharkExpressionAccess().getOrExpressionParserRuleCall_4()); 
                    }
                    // InternalDdParser.g:961:3: ( ruleOrExpression )
                    // InternalDdParser.g:961:4: ruleOrExpression
                    {
                    pushFollow(FOLLOW_2);
                    ruleOrExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSharkExpressionAccess().getOrExpressionParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalDdParser.g:965:2: ( ( ruleCatExpression ) )
                    {
                    // InternalDdParser.g:965:2: ( ( ruleCatExpression ) )
                    // InternalDdParser.g:966:3: ( ruleCatExpression )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSharkExpressionAccess().getCatExpressionParserRuleCall_5()); 
                    }
                    // InternalDdParser.g:967:3: ( ruleCatExpression )
                    // InternalDdParser.g:967:4: ruleCatExpression
                    {
                    pushFollow(FOLLOW_2);
                    ruleCatExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSharkExpressionAccess().getCatExpressionParserRuleCall_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalDdParser.g:971:2: ( ( ruleListExpression ) )
                    {
                    // InternalDdParser.g:971:2: ( ( ruleListExpression ) )
                    // InternalDdParser.g:972:3: ( ruleListExpression )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSharkExpressionAccess().getListExpressionParserRuleCall_6()); 
                    }
                    // InternalDdParser.g:973:3: ( ruleListExpression )
                    // InternalDdParser.g:973:4: ruleListExpression
                    {
                    pushFollow(FOLLOW_2);
                    ruleListExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSharkExpressionAccess().getListExpressionParserRuleCall_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalDdParser.g:977:2: ( ruleBinaryExpression )
                    {
                    // InternalDdParser.g:977:2: ( ruleBinaryExpression )
                    // InternalDdParser.g:978:3: ruleBinaryExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSharkExpressionAccess().getBinaryExpressionParserRuleCall_7()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleBinaryExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSharkExpressionAccess().getBinaryExpressionParserRuleCall_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalDdParser.g:983:2: ( ruleUnaryExpression )
                    {
                    // InternalDdParser.g:983:2: ( ruleUnaryExpression )
                    // InternalDdParser.g:984:3: ruleUnaryExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSharkExpressionAccess().getUnaryExpressionParserRuleCall_8()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleUnaryExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSharkExpressionAccess().getUnaryExpressionParserRuleCall_8()); 
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalDdParser.g:989:2: ( ruleTerminalExpression )
                    {
                    // InternalDdParser.g:989:2: ( ruleTerminalExpression )
                    // InternalDdParser.g:990:3: ruleTerminalExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSharkExpressionAccess().getTerminalExpressionParserRuleCall_9()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleTerminalExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSharkExpressionAccess().getTerminalExpressionParserRuleCall_9()); 
                    }

                    }


                    }
                    break;
                case 11 :
                    // InternalDdParser.g:995:2: ( ruleIdentifierExpression )
                    {
                    // InternalDdParser.g:995:2: ( ruleIdentifierExpression )
                    // InternalDdParser.g:996:3: ruleIdentifierExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSharkExpressionAccess().getIdentifierExpressionParserRuleCall_10()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleIdentifierExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSharkExpressionAccess().getIdentifierExpressionParserRuleCall_10()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SharkExpression__Alternatives"


    // $ANTLR start "rule__AddExpression__OpAlternatives_2_0"
    // InternalDdParser.g:1005:1: rule__AddExpression__OpAlternatives_2_0 : ( ( PlusSign ) | ( HyphenMinus ) );
    public final void rule__AddExpression__OpAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:1009:1: ( ( PlusSign ) | ( HyphenMinus ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==PlusSign) ) {
                alt2=1;
            }
            else if ( (LA2_0==HyphenMinus) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDdParser.g:1010:2: ( PlusSign )
                    {
                    // InternalDdParser.g:1010:2: ( PlusSign )
                    // InternalDdParser.g:1011:3: PlusSign
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAddExpressionAccess().getOpPlusSignKeyword_2_0_0()); 
                    }
                    match(input,PlusSign,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAddExpressionAccess().getOpPlusSignKeyword_2_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDdParser.g:1016:2: ( HyphenMinus )
                    {
                    // InternalDdParser.g:1016:2: ( HyphenMinus )
                    // InternalDdParser.g:1017:3: HyphenMinus
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAddExpressionAccess().getOpHyphenMinusKeyword_2_0_1()); 
                    }
                    match(input,HyphenMinus,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAddExpressionAccess().getOpHyphenMinusKeyword_2_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpression__OpAlternatives_2_0"


    // $ANTLR start "rule__AddExpressionElt__OpAlternatives_0_0"
    // InternalDdParser.g:1026:1: rule__AddExpressionElt__OpAlternatives_0_0 : ( ( PlusSign ) | ( HyphenMinus ) );
    public final void rule__AddExpressionElt__OpAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:1030:1: ( ( PlusSign ) | ( HyphenMinus ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==PlusSign) ) {
                alt3=1;
            }
            else if ( (LA3_0==HyphenMinus) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalDdParser.g:1031:2: ( PlusSign )
                    {
                    // InternalDdParser.g:1031:2: ( PlusSign )
                    // InternalDdParser.g:1032:3: PlusSign
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAddExpressionEltAccess().getOpPlusSignKeyword_0_0_0()); 
                    }
                    match(input,PlusSign,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAddExpressionEltAccess().getOpPlusSignKeyword_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDdParser.g:1037:2: ( HyphenMinus )
                    {
                    // InternalDdParser.g:1037:2: ( HyphenMinus )
                    // InternalDdParser.g:1038:3: HyphenMinus
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAddExpressionEltAccess().getOpHyphenMinusKeyword_0_0_1()); 
                    }
                    match(input,HyphenMinus,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAddExpressionEltAccess().getOpHyphenMinusKeyword_0_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpressionElt__OpAlternatives_0_0"


    // $ANTLR start "rule__RangeExpression__Alternatives"
    // InternalDdParser.g:1047:1: rule__RangeExpression__Alternatives : ( ( ( rule__RangeExpression__Group_0__0 ) ) | ( ( rule__RangeExpression__Group_1__0 ) ) );
    public final void rule__RangeExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:1051:1: ( ( ( rule__RangeExpression__Group_0__0 ) ) | ( ( rule__RangeExpression__Group_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==LeftParenthesis) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==RULE_RANGEINF) ) {
                    alt4=2;
                }
                else if ( (LA4_1==RULE_RANGE) ) {
                    alt4=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalDdParser.g:1052:2: ( ( rule__RangeExpression__Group_0__0 ) )
                    {
                    // InternalDdParser.g:1052:2: ( ( rule__RangeExpression__Group_0__0 ) )
                    // InternalDdParser.g:1053:3: ( rule__RangeExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRangeExpressionAccess().getGroup_0()); 
                    }
                    // InternalDdParser.g:1054:3: ( rule__RangeExpression__Group_0__0 )
                    // InternalDdParser.g:1054:4: rule__RangeExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RangeExpression__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRangeExpressionAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDdParser.g:1058:2: ( ( rule__RangeExpression__Group_1__0 ) )
                    {
                    // InternalDdParser.g:1058:2: ( ( rule__RangeExpression__Group_1__0 ) )
                    // InternalDdParser.g:1059:3: ( rule__RangeExpression__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRangeExpressionAccess().getGroup_1()); 
                    }
                    // InternalDdParser.g:1060:3: ( rule__RangeExpression__Group_1__0 )
                    // InternalDdParser.g:1060:4: rule__RangeExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RangeExpression__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRangeExpressionAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeExpression__Alternatives"


    // $ANTLR start "rule__TerminalExpression__Alternatives"
    // InternalDdParser.g:1068:1: rule__TerminalExpression__Alternatives : ( ( ( rule__TerminalExpression__Group_0__0 ) ) | ( ( rule__TerminalExpression__Group_1__0 ) ) | ( ( rule__TerminalExpression__Group_2__0 ) ) | ( ( rule__TerminalExpression__Group_3__0 ) ) | ( ( rule__TerminalExpression__Group_4__0 ) ) | ( ( rule__TerminalExpression__Group_5__0 ) ) | ( ( rule__TerminalExpression__Group_6__0 ) ) );
    public final void rule__TerminalExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:1072:1: ( ( ( rule__TerminalExpression__Group_0__0 ) ) | ( ( rule__TerminalExpression__Group_1__0 ) ) | ( ( rule__TerminalExpression__Group_2__0 ) ) | ( ( rule__TerminalExpression__Group_3__0 ) ) | ( ( rule__TerminalExpression__Group_4__0 ) ) | ( ( rule__TerminalExpression__Group_5__0 ) ) | ( ( rule__TerminalExpression__Group_6__0 ) ) )
            int alt5=7;
            switch ( input.LA(1) ) {
            case RULE_STR:
                {
                alt5=1;
                }
                break;
            case RULE_INT:
                {
                alt5=2;
                }
                break;
            case RULE_DEC:
                {
                alt5=3;
                }
                break;
            case RULE_CHR:
                {
                alt5=4;
                }
                break;
            case RULE_CSTID:
                {
                alt5=5;
                }
                break;
            case False:
            case True:
                {
                alt5=6;
                }
                break;
            case Unset:
                {
                alt5=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalDdParser.g:1073:2: ( ( rule__TerminalExpression__Group_0__0 ) )
                    {
                    // InternalDdParser.g:1073:2: ( ( rule__TerminalExpression__Group_0__0 ) )
                    // InternalDdParser.g:1074:3: ( rule__TerminalExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalExpressionAccess().getGroup_0()); 
                    }
                    // InternalDdParser.g:1075:3: ( rule__TerminalExpression__Group_0__0 )
                    // InternalDdParser.g:1075:4: rule__TerminalExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TerminalExpression__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTerminalExpressionAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDdParser.g:1079:2: ( ( rule__TerminalExpression__Group_1__0 ) )
                    {
                    // InternalDdParser.g:1079:2: ( ( rule__TerminalExpression__Group_1__0 ) )
                    // InternalDdParser.g:1080:3: ( rule__TerminalExpression__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalExpressionAccess().getGroup_1()); 
                    }
                    // InternalDdParser.g:1081:3: ( rule__TerminalExpression__Group_1__0 )
                    // InternalDdParser.g:1081:4: rule__TerminalExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TerminalExpression__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTerminalExpressionAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDdParser.g:1085:2: ( ( rule__TerminalExpression__Group_2__0 ) )
                    {
                    // InternalDdParser.g:1085:2: ( ( rule__TerminalExpression__Group_2__0 ) )
                    // InternalDdParser.g:1086:3: ( rule__TerminalExpression__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalExpressionAccess().getGroup_2()); 
                    }
                    // InternalDdParser.g:1087:3: ( rule__TerminalExpression__Group_2__0 )
                    // InternalDdParser.g:1087:4: rule__TerminalExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TerminalExpression__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTerminalExpressionAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDdParser.g:1091:2: ( ( rule__TerminalExpression__Group_3__0 ) )
                    {
                    // InternalDdParser.g:1091:2: ( ( rule__TerminalExpression__Group_3__0 ) )
                    // InternalDdParser.g:1092:3: ( rule__TerminalExpression__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalExpressionAccess().getGroup_3()); 
                    }
                    // InternalDdParser.g:1093:3: ( rule__TerminalExpression__Group_3__0 )
                    // InternalDdParser.g:1093:4: rule__TerminalExpression__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TerminalExpression__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTerminalExpressionAccess().getGroup_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalDdParser.g:1097:2: ( ( rule__TerminalExpression__Group_4__0 ) )
                    {
                    // InternalDdParser.g:1097:2: ( ( rule__TerminalExpression__Group_4__0 ) )
                    // InternalDdParser.g:1098:3: ( rule__TerminalExpression__Group_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalExpressionAccess().getGroup_4()); 
                    }
                    // InternalDdParser.g:1099:3: ( rule__TerminalExpression__Group_4__0 )
                    // InternalDdParser.g:1099:4: rule__TerminalExpression__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TerminalExpression__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTerminalExpressionAccess().getGroup_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalDdParser.g:1103:2: ( ( rule__TerminalExpression__Group_5__0 ) )
                    {
                    // InternalDdParser.g:1103:2: ( ( rule__TerminalExpression__Group_5__0 ) )
                    // InternalDdParser.g:1104:3: ( rule__TerminalExpression__Group_5__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalExpressionAccess().getGroup_5()); 
                    }
                    // InternalDdParser.g:1105:3: ( rule__TerminalExpression__Group_5__0 )
                    // InternalDdParser.g:1105:4: rule__TerminalExpression__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TerminalExpression__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTerminalExpressionAccess().getGroup_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalDdParser.g:1109:2: ( ( rule__TerminalExpression__Group_6__0 ) )
                    {
                    // InternalDdParser.g:1109:2: ( ( rule__TerminalExpression__Group_6__0 ) )
                    // InternalDdParser.g:1110:3: ( rule__TerminalExpression__Group_6__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalExpressionAccess().getGroup_6()); 
                    }
                    // InternalDdParser.g:1111:3: ( rule__TerminalExpression__Group_6__0 )
                    // InternalDdParser.g:1111:4: rule__TerminalExpression__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TerminalExpression__Group_6__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTerminalExpressionAccess().getGroup_6()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Alternatives"


    // $ANTLR start "rule__BinaryOperator__Alternatives"
    // InternalDdParser.g:1119:1: rule__BinaryOperator__Alternatives : ( ( ( Or ) ) | ( ( And ) ) | ( ( PlusSign ) ) | ( ( HyphenMinus ) ) | ( ( Asterisk ) ) | ( ( Solidus ) ) | ( ( PercentSign ) ) | ( ( EqualsSignEqualsSign ) ) | ( ( GreaterThanSign ) ) | ( ( LessThanSign ) ) | ( ( LessThanSignEqualsSign ) ) | ( ( GreaterThanSignEqualsSign ) ) | ( ( CircumflexAccent ) ) | ( ( Like ) ) | ( ( ExclamationMarkEqualsSign ) ) | ( ( Ampersand ) ) | ( ( In ) ) | ( ( Stxt ) ) | ( ( Round ) ) );
    public final void rule__BinaryOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:1123:1: ( ( ( Or ) ) | ( ( And ) ) | ( ( PlusSign ) ) | ( ( HyphenMinus ) ) | ( ( Asterisk ) ) | ( ( Solidus ) ) | ( ( PercentSign ) ) | ( ( EqualsSignEqualsSign ) ) | ( ( GreaterThanSign ) ) | ( ( LessThanSign ) ) | ( ( LessThanSignEqualsSign ) ) | ( ( GreaterThanSignEqualsSign ) ) | ( ( CircumflexAccent ) ) | ( ( Like ) ) | ( ( ExclamationMarkEqualsSign ) ) | ( ( Ampersand ) ) | ( ( In ) ) | ( ( Stxt ) ) | ( ( Round ) ) )
            int alt6=19;
            switch ( input.LA(1) ) {
            case Or:
                {
                alt6=1;
                }
                break;
            case And:
                {
                alt6=2;
                }
                break;
            case PlusSign:
                {
                alt6=3;
                }
                break;
            case HyphenMinus:
                {
                alt6=4;
                }
                break;
            case Asterisk:
                {
                alt6=5;
                }
                break;
            case Solidus:
                {
                alt6=6;
                }
                break;
            case PercentSign:
                {
                alt6=7;
                }
                break;
            case EqualsSignEqualsSign:
                {
                alt6=8;
                }
                break;
            case GreaterThanSign:
                {
                alt6=9;
                }
                break;
            case LessThanSign:
                {
                alt6=10;
                }
                break;
            case LessThanSignEqualsSign:
                {
                alt6=11;
                }
                break;
            case GreaterThanSignEqualsSign:
                {
                alt6=12;
                }
                break;
            case CircumflexAccent:
                {
                alt6=13;
                }
                break;
            case Like:
                {
                alt6=14;
                }
                break;
            case ExclamationMarkEqualsSign:
                {
                alt6=15;
                }
                break;
            case Ampersand:
                {
                alt6=16;
                }
                break;
            case In:
                {
                alt6=17;
                }
                break;
            case Stxt:
                {
                alt6=18;
                }
                break;
            case Round:
                {
                alt6=19;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalDdParser.g:1124:2: ( ( Or ) )
                    {
                    // InternalDdParser.g:1124:2: ( ( Or ) )
                    // InternalDdParser.g:1125:3: ( Or )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryOperatorAccess().getOpOrEnumLiteralDeclaration_0()); 
                    }
                    // InternalDdParser.g:1126:3: ( Or )
                    // InternalDdParser.g:1126:4: Or
                    {
                    match(input,Or,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryOperatorAccess().getOpOrEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDdParser.g:1130:2: ( ( And ) )
                    {
                    // InternalDdParser.g:1130:2: ( ( And ) )
                    // InternalDdParser.g:1131:3: ( And )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryOperatorAccess().getOpAndEnumLiteralDeclaration_1()); 
                    }
                    // InternalDdParser.g:1132:3: ( And )
                    // InternalDdParser.g:1132:4: And
                    {
                    match(input,And,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryOperatorAccess().getOpAndEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDdParser.g:1136:2: ( ( PlusSign ) )
                    {
                    // InternalDdParser.g:1136:2: ( ( PlusSign ) )
                    // InternalDdParser.g:1137:3: ( PlusSign )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryOperatorAccess().getOpAddEnumLiteralDeclaration_2()); 
                    }
                    // InternalDdParser.g:1138:3: ( PlusSign )
                    // InternalDdParser.g:1138:4: PlusSign
                    {
                    match(input,PlusSign,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryOperatorAccess().getOpAddEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDdParser.g:1142:2: ( ( HyphenMinus ) )
                    {
                    // InternalDdParser.g:1142:2: ( ( HyphenMinus ) )
                    // InternalDdParser.g:1143:3: ( HyphenMinus )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryOperatorAccess().getOpMinEnumLiteralDeclaration_3()); 
                    }
                    // InternalDdParser.g:1144:3: ( HyphenMinus )
                    // InternalDdParser.g:1144:4: HyphenMinus
                    {
                    match(input,HyphenMinus,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryOperatorAccess().getOpMinEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalDdParser.g:1148:2: ( ( Asterisk ) )
                    {
                    // InternalDdParser.g:1148:2: ( ( Asterisk ) )
                    // InternalDdParser.g:1149:3: ( Asterisk )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryOperatorAccess().getOpMultEnumLiteralDeclaration_4()); 
                    }
                    // InternalDdParser.g:1150:3: ( Asterisk )
                    // InternalDdParser.g:1150:4: Asterisk
                    {
                    match(input,Asterisk,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryOperatorAccess().getOpMultEnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalDdParser.g:1154:2: ( ( Solidus ) )
                    {
                    // InternalDdParser.g:1154:2: ( ( Solidus ) )
                    // InternalDdParser.g:1155:3: ( Solidus )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryOperatorAccess().getOpDivEnumLiteralDeclaration_5()); 
                    }
                    // InternalDdParser.g:1156:3: ( Solidus )
                    // InternalDdParser.g:1156:4: Solidus
                    {
                    match(input,Solidus,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryOperatorAccess().getOpDivEnumLiteralDeclaration_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalDdParser.g:1160:2: ( ( PercentSign ) )
                    {
                    // InternalDdParser.g:1160:2: ( ( PercentSign ) )
                    // InternalDdParser.g:1161:3: ( PercentSign )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryOperatorAccess().getOpModEnumLiteralDeclaration_6()); 
                    }
                    // InternalDdParser.g:1162:3: ( PercentSign )
                    // InternalDdParser.g:1162:4: PercentSign
                    {
                    match(input,PercentSign,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryOperatorAccess().getOpModEnumLiteralDeclaration_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalDdParser.g:1166:2: ( ( EqualsSignEqualsSign ) )
                    {
                    // InternalDdParser.g:1166:2: ( ( EqualsSignEqualsSign ) )
                    // InternalDdParser.g:1167:3: ( EqualsSignEqualsSign )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryOperatorAccess().getOpEqEnumLiteralDeclaration_7()); 
                    }
                    // InternalDdParser.g:1168:3: ( EqualsSignEqualsSign )
                    // InternalDdParser.g:1168:4: EqualsSignEqualsSign
                    {
                    match(input,EqualsSignEqualsSign,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryOperatorAccess().getOpEqEnumLiteralDeclaration_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalDdParser.g:1172:2: ( ( GreaterThanSign ) )
                    {
                    // InternalDdParser.g:1172:2: ( ( GreaterThanSign ) )
                    // InternalDdParser.g:1173:3: ( GreaterThanSign )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryOperatorAccess().getOpGtEnumLiteralDeclaration_8()); 
                    }
                    // InternalDdParser.g:1174:3: ( GreaterThanSign )
                    // InternalDdParser.g:1174:4: GreaterThanSign
                    {
                    match(input,GreaterThanSign,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryOperatorAccess().getOpGtEnumLiteralDeclaration_8()); 
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalDdParser.g:1178:2: ( ( LessThanSign ) )
                    {
                    // InternalDdParser.g:1178:2: ( ( LessThanSign ) )
                    // InternalDdParser.g:1179:3: ( LessThanSign )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryOperatorAccess().getOpLtEnumLiteralDeclaration_9()); 
                    }
                    // InternalDdParser.g:1180:3: ( LessThanSign )
                    // InternalDdParser.g:1180:4: LessThanSign
                    {
                    match(input,LessThanSign,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryOperatorAccess().getOpLtEnumLiteralDeclaration_9()); 
                    }

                    }


                    }
                    break;
                case 11 :
                    // InternalDdParser.g:1184:2: ( ( LessThanSignEqualsSign ) )
                    {
                    // InternalDdParser.g:1184:2: ( ( LessThanSignEqualsSign ) )
                    // InternalDdParser.g:1185:3: ( LessThanSignEqualsSign )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryOperatorAccess().getOpLteEnumLiteralDeclaration_10()); 
                    }
                    // InternalDdParser.g:1186:3: ( LessThanSignEqualsSign )
                    // InternalDdParser.g:1186:4: LessThanSignEqualsSign
                    {
                    match(input,LessThanSignEqualsSign,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryOperatorAccess().getOpLteEnumLiteralDeclaration_10()); 
                    }

                    }


                    }
                    break;
                case 12 :
                    // InternalDdParser.g:1190:2: ( ( GreaterThanSignEqualsSign ) )
                    {
                    // InternalDdParser.g:1190:2: ( ( GreaterThanSignEqualsSign ) )
                    // InternalDdParser.g:1191:3: ( GreaterThanSignEqualsSign )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryOperatorAccess().getOpGteEnumLiteralDeclaration_11()); 
                    }
                    // InternalDdParser.g:1192:3: ( GreaterThanSignEqualsSign )
                    // InternalDdParser.g:1192:4: GreaterThanSignEqualsSign
                    {
                    match(input,GreaterThanSignEqualsSign,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryOperatorAccess().getOpGteEnumLiteralDeclaration_11()); 
                    }

                    }


                    }
                    break;
                case 13 :
                    // InternalDdParser.g:1196:2: ( ( CircumflexAccent ) )
                    {
                    // InternalDdParser.g:1196:2: ( ( CircumflexAccent ) )
                    // InternalDdParser.g:1197:3: ( CircumflexAccent )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryOperatorAccess().getOpPowEnumLiteralDeclaration_12()); 
                    }
                    // InternalDdParser.g:1198:3: ( CircumflexAccent )
                    // InternalDdParser.g:1198:4: CircumflexAccent
                    {
                    match(input,CircumflexAccent,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryOperatorAccess().getOpPowEnumLiteralDeclaration_12()); 
                    }

                    }


                    }
                    break;
                case 14 :
                    // InternalDdParser.g:1202:2: ( ( Like ) )
                    {
                    // InternalDdParser.g:1202:2: ( ( Like ) )
                    // InternalDdParser.g:1203:3: ( Like )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryOperatorAccess().getOpLikeEnumLiteralDeclaration_13()); 
                    }
                    // InternalDdParser.g:1204:3: ( Like )
                    // InternalDdParser.g:1204:4: Like
                    {
                    match(input,Like,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryOperatorAccess().getOpLikeEnumLiteralDeclaration_13()); 
                    }

                    }


                    }
                    break;
                case 15 :
                    // InternalDdParser.g:1208:2: ( ( ExclamationMarkEqualsSign ) )
                    {
                    // InternalDdParser.g:1208:2: ( ( ExclamationMarkEqualsSign ) )
                    // InternalDdParser.g:1209:3: ( ExclamationMarkEqualsSign )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryOperatorAccess().getOpDifEnumLiteralDeclaration_14()); 
                    }
                    // InternalDdParser.g:1210:3: ( ExclamationMarkEqualsSign )
                    // InternalDdParser.g:1210:4: ExclamationMarkEqualsSign
                    {
                    match(input,ExclamationMarkEqualsSign,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryOperatorAccess().getOpDifEnumLiteralDeclaration_14()); 
                    }

                    }


                    }
                    break;
                case 16 :
                    // InternalDdParser.g:1214:2: ( ( Ampersand ) )
                    {
                    // InternalDdParser.g:1214:2: ( ( Ampersand ) )
                    // InternalDdParser.g:1215:3: ( Ampersand )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryOperatorAccess().getOpCatEnumLiteralDeclaration_15()); 
                    }
                    // InternalDdParser.g:1216:3: ( Ampersand )
                    // InternalDdParser.g:1216:4: Ampersand
                    {
                    match(input,Ampersand,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryOperatorAccess().getOpCatEnumLiteralDeclaration_15()); 
                    }

                    }


                    }
                    break;
                case 17 :
                    // InternalDdParser.g:1220:2: ( ( In ) )
                    {
                    // InternalDdParser.g:1220:2: ( ( In ) )
                    // InternalDdParser.g:1221:3: ( In )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryOperatorAccess().getOpInEnumLiteralDeclaration_16()); 
                    }
                    // InternalDdParser.g:1222:3: ( In )
                    // InternalDdParser.g:1222:4: In
                    {
                    match(input,In,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryOperatorAccess().getOpInEnumLiteralDeclaration_16()); 
                    }

                    }


                    }
                    break;
                case 18 :
                    // InternalDdParser.g:1226:2: ( ( Stxt ) )
                    {
                    // InternalDdParser.g:1226:2: ( ( Stxt ) )
                    // InternalDdParser.g:1227:3: ( Stxt )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryOperatorAccess().getOpStxtEnumLiteralDeclaration_17()); 
                    }
                    // InternalDdParser.g:1228:3: ( Stxt )
                    // InternalDdParser.g:1228:4: Stxt
                    {
                    match(input,Stxt,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryOperatorAccess().getOpStxtEnumLiteralDeclaration_17()); 
                    }

                    }


                    }
                    break;
                case 19 :
                    // InternalDdParser.g:1232:2: ( ( Round ) )
                    {
                    // InternalDdParser.g:1232:2: ( ( Round ) )
                    // InternalDdParser.g:1233:3: ( Round )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryOperatorAccess().getOpRoundEnumLiteralDeclaration_18()); 
                    }
                    // InternalDdParser.g:1234:3: ( Round )
                    // InternalDdParser.g:1234:4: Round
                    {
                    match(input,Round,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryOperatorAccess().getOpRoundEnumLiteralDeclaration_18()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryOperator__Alternatives"


    // $ANTLR start "rule__UnaryOperator__Alternatives"
    // InternalDdParser.g:1242:1: rule__UnaryOperator__Alternatives : ( ( ( Not ) ) | ( ( HyphenMinus ) ) | ( ( Str ) ) | ( ( Int ) ) | ( ( Dec ) ) | ( ( Date ) ) | ( ( Time ) ) | ( ( Len ) ) | ( ( Stamp ) ) );
    public final void rule__UnaryOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:1246:1: ( ( ( Not ) ) | ( ( HyphenMinus ) ) | ( ( Str ) ) | ( ( Int ) ) | ( ( Dec ) ) | ( ( Date ) ) | ( ( Time ) ) | ( ( Len ) ) | ( ( Stamp ) ) )
            int alt7=9;
            switch ( input.LA(1) ) {
            case Not:
                {
                alt7=1;
                }
                break;
            case HyphenMinus:
                {
                alt7=2;
                }
                break;
            case Str:
                {
                alt7=3;
                }
                break;
            case Int:
                {
                alt7=4;
                }
                break;
            case Dec:
                {
                alt7=5;
                }
                break;
            case Date:
                {
                alt7=6;
                }
                break;
            case Time:
                {
                alt7=7;
                }
                break;
            case Len:
                {
                alt7=8;
                }
                break;
            case Stamp:
                {
                alt7=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalDdParser.g:1247:2: ( ( Not ) )
                    {
                    // InternalDdParser.g:1247:2: ( ( Not ) )
                    // InternalDdParser.g:1248:3: ( Not )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnaryOperatorAccess().getOpNotEnumLiteralDeclaration_0()); 
                    }
                    // InternalDdParser.g:1249:3: ( Not )
                    // InternalDdParser.g:1249:4: Not
                    {
                    match(input,Not,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUnaryOperatorAccess().getOpNotEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDdParser.g:1253:2: ( ( HyphenMinus ) )
                    {
                    // InternalDdParser.g:1253:2: ( ( HyphenMinus ) )
                    // InternalDdParser.g:1254:3: ( HyphenMinus )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnaryOperatorAccess().getOpNegEnumLiteralDeclaration_1()); 
                    }
                    // InternalDdParser.g:1255:3: ( HyphenMinus )
                    // InternalDdParser.g:1255:4: HyphenMinus
                    {
                    match(input,HyphenMinus,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUnaryOperatorAccess().getOpNegEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDdParser.g:1259:2: ( ( Str ) )
                    {
                    // InternalDdParser.g:1259:2: ( ( Str ) )
                    // InternalDdParser.g:1260:3: ( Str )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnaryOperatorAccess().getStrCastEnumLiteralDeclaration_2()); 
                    }
                    // InternalDdParser.g:1261:3: ( Str )
                    // InternalDdParser.g:1261:4: Str
                    {
                    match(input,Str,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUnaryOperatorAccess().getStrCastEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDdParser.g:1265:2: ( ( Int ) )
                    {
                    // InternalDdParser.g:1265:2: ( ( Int ) )
                    // InternalDdParser.g:1266:3: ( Int )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnaryOperatorAccess().getIntCastEnumLiteralDeclaration_3()); 
                    }
                    // InternalDdParser.g:1267:3: ( Int )
                    // InternalDdParser.g:1267:4: Int
                    {
                    match(input,Int,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUnaryOperatorAccess().getIntCastEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalDdParser.g:1271:2: ( ( Dec ) )
                    {
                    // InternalDdParser.g:1271:2: ( ( Dec ) )
                    // InternalDdParser.g:1272:3: ( Dec )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnaryOperatorAccess().getDecCastEnumLiteralDeclaration_4()); 
                    }
                    // InternalDdParser.g:1273:3: ( Dec )
                    // InternalDdParser.g:1273:4: Dec
                    {
                    match(input,Dec,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUnaryOperatorAccess().getDecCastEnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalDdParser.g:1277:2: ( ( Date ) )
                    {
                    // InternalDdParser.g:1277:2: ( ( Date ) )
                    // InternalDdParser.g:1278:3: ( Date )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnaryOperatorAccess().getDateCastEnumLiteralDeclaration_5()); 
                    }
                    // InternalDdParser.g:1279:3: ( Date )
                    // InternalDdParser.g:1279:4: Date
                    {
                    match(input,Date,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUnaryOperatorAccess().getDateCastEnumLiteralDeclaration_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalDdParser.g:1283:2: ( ( Time ) )
                    {
                    // InternalDdParser.g:1283:2: ( ( Time ) )
                    // InternalDdParser.g:1284:3: ( Time )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnaryOperatorAccess().getTimeCastEnumLiteralDeclaration_6()); 
                    }
                    // InternalDdParser.g:1285:3: ( Time )
                    // InternalDdParser.g:1285:4: Time
                    {
                    match(input,Time,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUnaryOperatorAccess().getTimeCastEnumLiteralDeclaration_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalDdParser.g:1289:2: ( ( Len ) )
                    {
                    // InternalDdParser.g:1289:2: ( ( Len ) )
                    // InternalDdParser.g:1290:3: ( Len )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnaryOperatorAccess().getOpLenEnumLiteralDeclaration_7()); 
                    }
                    // InternalDdParser.g:1291:3: ( Len )
                    // InternalDdParser.g:1291:4: Len
                    {
                    match(input,Len,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUnaryOperatorAccess().getOpLenEnumLiteralDeclaration_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalDdParser.g:1295:2: ( ( Stamp ) )
                    {
                    // InternalDdParser.g:1295:2: ( ( Stamp ) )
                    // InternalDdParser.g:1296:3: ( Stamp )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnaryOperatorAccess().getStampCastEnumLiteralDeclaration_8()); 
                    }
                    // InternalDdParser.g:1297:3: ( Stamp )
                    // InternalDdParser.g:1297:4: Stamp
                    {
                    match(input,Stamp,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUnaryOperatorAccess().getStampCastEnumLiteralDeclaration_8()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryOperator__Alternatives"


    // $ANTLR start "rule__Boolean__Alternatives"
    // InternalDdParser.g:1305:1: rule__Boolean__Alternatives : ( ( ( True ) ) | ( ( False ) ) );
    public final void rule__Boolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:1309:1: ( ( ( True ) ) | ( ( False ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==True) ) {
                alt8=1;
            }
            else if ( (LA8_0==False) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalDdParser.g:1310:2: ( ( True ) )
                    {
                    // InternalDdParser.g:1310:2: ( ( True ) )
                    // InternalDdParser.g:1311:3: ( True )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanAccess().getTrueCstEnumLiteralDeclaration_0()); 
                    }
                    // InternalDdParser.g:1312:3: ( True )
                    // InternalDdParser.g:1312:4: True
                    {
                    match(input,True,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanAccess().getTrueCstEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDdParser.g:1316:2: ( ( False ) )
                    {
                    // InternalDdParser.g:1316:2: ( ( False ) )
                    // InternalDdParser.g:1317:3: ( False )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanAccess().getFalseCstEnumLiteralDeclaration_1()); 
                    }
                    // InternalDdParser.g:1318:3: ( False )
                    // InternalDdParser.g:1318:4: False
                    {
                    match(input,False,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanAccess().getFalseCstEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boolean__Alternatives"


    // $ANTLR start "rule__DataType__Alternatives"
    // InternalDdParser.g:1326:1: rule__DataType__Alternatives : ( ( ( Str ) ) | ( ( Dec ) ) | ( ( Date ) ) | ( ( Time ) ) | ( ( Chr ) ) | ( ( Int ) ) | ( ( Stamp ) ) | ( ( Bits ) ) | ( ( Bool ) ) | ( ( HalfwidthHangulFillerHalfwidthHangulFillerHalfwidthHangulFiller ) ) );
    public final void rule__DataType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:1330:1: ( ( ( Str ) ) | ( ( Dec ) ) | ( ( Date ) ) | ( ( Time ) ) | ( ( Chr ) ) | ( ( Int ) ) | ( ( Stamp ) ) | ( ( Bits ) ) | ( ( Bool ) ) | ( ( HalfwidthHangulFillerHalfwidthHangulFillerHalfwidthHangulFiller ) ) )
            int alt9=10;
            switch ( input.LA(1) ) {
            case Str:
                {
                alt9=1;
                }
                break;
            case Dec:
                {
                alt9=2;
                }
                break;
            case Date:
                {
                alt9=3;
                }
                break;
            case Time:
                {
                alt9=4;
                }
                break;
            case Chr:
                {
                alt9=5;
                }
                break;
            case Int:
                {
                alt9=6;
                }
                break;
            case Stamp:
                {
                alt9=7;
                }
                break;
            case Bits:
                {
                alt9=8;
                }
                break;
            case Bool:
                {
                alt9=9;
                }
                break;
            case HalfwidthHangulFillerHalfwidthHangulFillerHalfwidthHangulFiller:
                {
                alt9=10;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalDdParser.g:1331:2: ( ( Str ) )
                    {
                    // InternalDdParser.g:1331:2: ( ( Str ) )
                    // InternalDdParser.g:1332:3: ( Str )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDataTypeAccess().getStrEnumLiteralDeclaration_0()); 
                    }
                    // InternalDdParser.g:1333:3: ( Str )
                    // InternalDdParser.g:1333:4: Str
                    {
                    match(input,Str,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDataTypeAccess().getStrEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDdParser.g:1337:2: ( ( Dec ) )
                    {
                    // InternalDdParser.g:1337:2: ( ( Dec ) )
                    // InternalDdParser.g:1338:3: ( Dec )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDataTypeAccess().getDecEnumLiteralDeclaration_1()); 
                    }
                    // InternalDdParser.g:1339:3: ( Dec )
                    // InternalDdParser.g:1339:4: Dec
                    {
                    match(input,Dec,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDataTypeAccess().getDecEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDdParser.g:1343:2: ( ( Date ) )
                    {
                    // InternalDdParser.g:1343:2: ( ( Date ) )
                    // InternalDdParser.g:1344:3: ( Date )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDataTypeAccess().getDateEnumLiteralDeclaration_2()); 
                    }
                    // InternalDdParser.g:1345:3: ( Date )
                    // InternalDdParser.g:1345:4: Date
                    {
                    match(input,Date,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDataTypeAccess().getDateEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDdParser.g:1349:2: ( ( Time ) )
                    {
                    // InternalDdParser.g:1349:2: ( ( Time ) )
                    // InternalDdParser.g:1350:3: ( Time )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDataTypeAccess().getTimeEnumLiteralDeclaration_3()); 
                    }
                    // InternalDdParser.g:1351:3: ( Time )
                    // InternalDdParser.g:1351:4: Time
                    {
                    match(input,Time,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDataTypeAccess().getTimeEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalDdParser.g:1355:2: ( ( Chr ) )
                    {
                    // InternalDdParser.g:1355:2: ( ( Chr ) )
                    // InternalDdParser.g:1356:3: ( Chr )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDataTypeAccess().getChrEnumLiteralDeclaration_4()); 
                    }
                    // InternalDdParser.g:1357:3: ( Chr )
                    // InternalDdParser.g:1357:4: Chr
                    {
                    match(input,Chr,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDataTypeAccess().getChrEnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalDdParser.g:1361:2: ( ( Int ) )
                    {
                    // InternalDdParser.g:1361:2: ( ( Int ) )
                    // InternalDdParser.g:1362:3: ( Int )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDataTypeAccess().getIntEnumLiteralDeclaration_5()); 
                    }
                    // InternalDdParser.g:1363:3: ( Int )
                    // InternalDdParser.g:1363:4: Int
                    {
                    match(input,Int,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDataTypeAccess().getIntEnumLiteralDeclaration_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalDdParser.g:1367:2: ( ( Stamp ) )
                    {
                    // InternalDdParser.g:1367:2: ( ( Stamp ) )
                    // InternalDdParser.g:1368:3: ( Stamp )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDataTypeAccess().getStampEnumLiteralDeclaration_6()); 
                    }
                    // InternalDdParser.g:1369:3: ( Stamp )
                    // InternalDdParser.g:1369:4: Stamp
                    {
                    match(input,Stamp,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDataTypeAccess().getStampEnumLiteralDeclaration_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalDdParser.g:1373:2: ( ( Bits ) )
                    {
                    // InternalDdParser.g:1373:2: ( ( Bits ) )
                    // InternalDdParser.g:1374:3: ( Bits )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDataTypeAccess().getBitsEnumLiteralDeclaration_7()); 
                    }
                    // InternalDdParser.g:1375:3: ( Bits )
                    // InternalDdParser.g:1375:4: Bits
                    {
                    match(input,Bits,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDataTypeAccess().getBitsEnumLiteralDeclaration_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalDdParser.g:1379:2: ( ( Bool ) )
                    {
                    // InternalDdParser.g:1379:2: ( ( Bool ) )
                    // InternalDdParser.g:1380:3: ( Bool )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDataTypeAccess().getBoolEnumLiteralDeclaration_8()); 
                    }
                    // InternalDdParser.g:1381:3: ( Bool )
                    // InternalDdParser.g:1381:4: Bool
                    {
                    match(input,Bool,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDataTypeAccess().getBoolEnumLiteralDeclaration_8()); 
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalDdParser.g:1385:2: ( ( HalfwidthHangulFillerHalfwidthHangulFillerHalfwidthHangulFiller ) )
                    {
                    // InternalDdParser.g:1385:2: ( ( HalfwidthHangulFillerHalfwidthHangulFillerHalfwidthHangulFiller ) )
                    // InternalDdParser.g:1386:3: ( HalfwidthHangulFillerHalfwidthHangulFillerHalfwidthHangulFiller )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDataTypeAccess().getUnsetEnumLiteralDeclaration_9()); 
                    }
                    // InternalDdParser.g:1387:3: ( HalfwidthHangulFillerHalfwidthHangulFillerHalfwidthHangulFiller )
                    // InternalDdParser.g:1387:4: HalfwidthHangulFillerHalfwidthHangulFillerHalfwidthHangulFiller
                    {
                    match(input,HalfwidthHangulFillerHalfwidthHangulFillerHalfwidthHangulFiller,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDataTypeAccess().getUnsetEnumLiteralDeclaration_9()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Alternatives"


    // $ANTLR start "rule__DataModelFragment__Group__0"
    // InternalDdParser.g:1395:1: rule__DataModelFragment__Group__0 : rule__DataModelFragment__Group__0__Impl rule__DataModelFragment__Group__1 ;
    public final void rule__DataModelFragment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:1399:1: ( rule__DataModelFragment__Group__0__Impl rule__DataModelFragment__Group__1 )
            // InternalDdParser.g:1400:2: rule__DataModelFragment__Group__0__Impl rule__DataModelFragment__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__DataModelFragment__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DataModelFragment__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModelFragment__Group__0"


    // $ANTLR start "rule__DataModelFragment__Group__0__Impl"
    // InternalDdParser.g:1407:1: rule__DataModelFragment__Group__0__Impl : ( ( rule__DataModelFragment__ConstantsAssignment_0 )* ) ;
    public final void rule__DataModelFragment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:1411:1: ( ( ( rule__DataModelFragment__ConstantsAssignment_0 )* ) )
            // InternalDdParser.g:1412:1: ( ( rule__DataModelFragment__ConstantsAssignment_0 )* )
            {
            // InternalDdParser.g:1412:1: ( ( rule__DataModelFragment__ConstantsAssignment_0 )* )
            // InternalDdParser.g:1413:2: ( rule__DataModelFragment__ConstantsAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDataModelFragmentAccess().getConstantsAssignment_0()); 
            }
            // InternalDdParser.g:1414:2: ( rule__DataModelFragment__ConstantsAssignment_0 )*
            loop10:
            do {
                int alt10=2;
                alt10 = dfa10.predict(input);
                switch (alt10) {
            	case 1 :
            	    // InternalDdParser.g:1414:3: rule__DataModelFragment__ConstantsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__DataModelFragment__ConstantsAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDataModelFragmentAccess().getConstantsAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModelFragment__Group__0__Impl"


    // $ANTLR start "rule__DataModelFragment__Group__1"
    // InternalDdParser.g:1422:1: rule__DataModelFragment__Group__1 : rule__DataModelFragment__Group__1__Impl rule__DataModelFragment__Group__2 ;
    public final void rule__DataModelFragment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:1426:1: ( rule__DataModelFragment__Group__1__Impl rule__DataModelFragment__Group__2 )
            // InternalDdParser.g:1427:2: rule__DataModelFragment__Group__1__Impl rule__DataModelFragment__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__DataModelFragment__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DataModelFragment__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModelFragment__Group__1"


    // $ANTLR start "rule__DataModelFragment__Group__1__Impl"
    // InternalDdParser.g:1434:1: rule__DataModelFragment__Group__1__Impl : ( ( rule__DataModelFragment__EntitiesAssignment_1 )* ) ;
    public final void rule__DataModelFragment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:1438:1: ( ( ( rule__DataModelFragment__EntitiesAssignment_1 )* ) )
            // InternalDdParser.g:1439:1: ( ( rule__DataModelFragment__EntitiesAssignment_1 )* )
            {
            // InternalDdParser.g:1439:1: ( ( rule__DataModelFragment__EntitiesAssignment_1 )* )
            // InternalDdParser.g:1440:2: ( rule__DataModelFragment__EntitiesAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDataModelFragmentAccess().getEntitiesAssignment_1()); 
            }
            // InternalDdParser.g:1441:2: ( rule__DataModelFragment__EntitiesAssignment_1 )*
            loop11:
            do {
                int alt11=2;
                alt11 = dfa11.predict(input);
                switch (alt11) {
            	case 1 :
            	    // InternalDdParser.g:1441:3: rule__DataModelFragment__EntitiesAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__DataModelFragment__EntitiesAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDataModelFragmentAccess().getEntitiesAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModelFragment__Group__1__Impl"


    // $ANTLR start "rule__DataModelFragment__Group__2"
    // InternalDdParser.g:1449:1: rule__DataModelFragment__Group__2 : rule__DataModelFragment__Group__2__Impl ;
    public final void rule__DataModelFragment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:1453:1: ( rule__DataModelFragment__Group__2__Impl )
            // InternalDdParser.g:1454:2: rule__DataModelFragment__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataModelFragment__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModelFragment__Group__2"


    // $ANTLR start "rule__DataModelFragment__Group__2__Impl"
    // InternalDdParser.g:1460:1: rule__DataModelFragment__Group__2__Impl : ( ( rule__DataModelFragment__ConstraintsAssignment_2 )* ) ;
    public final void rule__DataModelFragment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:1464:1: ( ( ( rule__DataModelFragment__ConstraintsAssignment_2 )* ) )
            // InternalDdParser.g:1465:1: ( ( rule__DataModelFragment__ConstraintsAssignment_2 )* )
            {
            // InternalDdParser.g:1465:1: ( ( rule__DataModelFragment__ConstraintsAssignment_2 )* )
            // InternalDdParser.g:1466:2: ( rule__DataModelFragment__ConstraintsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDataModelFragmentAccess().getConstraintsAssignment_2()); 
            }
            // InternalDdParser.g:1467:2: ( rule__DataModelFragment__ConstraintsAssignment_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_CMT) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDdParser.g:1467:3: rule__DataModelFragment__ConstraintsAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__DataModelFragment__ConstraintsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDataModelFragmentAccess().getConstraintsAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModelFragment__Group__2__Impl"


    // $ANTLR start "rule__Constant__Group__0"
    // InternalDdParser.g:1476:1: rule__Constant__Group__0 : rule__Constant__Group__0__Impl rule__Constant__Group__1 ;
    public final void rule__Constant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:1480:1: ( rule__Constant__Group__0__Impl rule__Constant__Group__1 )
            // InternalDdParser.g:1481:2: rule__Constant__Group__0__Impl rule__Constant__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Constant__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Constant__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__0"


    // $ANTLR start "rule__Constant__Group__0__Impl"
    // InternalDdParser.g:1488:1: rule__Constant__Group__0__Impl : ( ( rule__Constant__ExtraAttrDescAssignment_0 )* ) ;
    public final void rule__Constant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:1492:1: ( ( ( rule__Constant__ExtraAttrDescAssignment_0 )* ) )
            // InternalDdParser.g:1493:1: ( ( rule__Constant__ExtraAttrDescAssignment_0 )* )
            {
            // InternalDdParser.g:1493:1: ( ( rule__Constant__ExtraAttrDescAssignment_0 )* )
            // InternalDdParser.g:1494:2: ( rule__Constant__ExtraAttrDescAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getExtraAttrDescAssignment_0()); 
            }
            // InternalDdParser.g:1495:2: ( rule__Constant__ExtraAttrDescAssignment_0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_CMT) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalDdParser.g:1495:3: rule__Constant__ExtraAttrDescAssignment_0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Constant__ExtraAttrDescAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantAccess().getExtraAttrDescAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__0__Impl"


    // $ANTLR start "rule__Constant__Group__1"
    // InternalDdParser.g:1503:1: rule__Constant__Group__1 : rule__Constant__Group__1__Impl rule__Constant__Group__2 ;
    public final void rule__Constant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:1507:1: ( rule__Constant__Group__1__Impl rule__Constant__Group__2 )
            // InternalDdParser.g:1508:2: rule__Constant__Group__1__Impl rule__Constant__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Constant__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Constant__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__1"


    // $ANTLR start "rule__Constant__Group__1__Impl"
    // InternalDdParser.g:1515:1: rule__Constant__Group__1__Impl : ( ( rule__Constant__DataTypeAssignment_1 ) ) ;
    public final void rule__Constant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:1519:1: ( ( ( rule__Constant__DataTypeAssignment_1 ) ) )
            // InternalDdParser.g:1520:1: ( ( rule__Constant__DataTypeAssignment_1 ) )
            {
            // InternalDdParser.g:1520:1: ( ( rule__Constant__DataTypeAssignment_1 ) )
            // InternalDdParser.g:1521:2: ( rule__Constant__DataTypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getDataTypeAssignment_1()); 
            }
            // InternalDdParser.g:1522:2: ( rule__Constant__DataTypeAssignment_1 )
            // InternalDdParser.g:1522:3: rule__Constant__DataTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Constant__DataTypeAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantAccess().getDataTypeAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__1__Impl"


    // $ANTLR start "rule__Constant__Group__2"
    // InternalDdParser.g:1530:1: rule__Constant__Group__2 : rule__Constant__Group__2__Impl rule__Constant__Group__3 ;
    public final void rule__Constant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:1534:1: ( rule__Constant__Group__2__Impl rule__Constant__Group__3 )
            // InternalDdParser.g:1535:2: rule__Constant__Group__2__Impl rule__Constant__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Constant__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Constant__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__2"


    // $ANTLR start "rule__Constant__Group__2__Impl"
    // InternalDdParser.g:1542:1: rule__Constant__Group__2__Impl : ( ( rule__Constant__AttributeSizeAssignment_2 )? ) ;
    public final void rule__Constant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:1546:1: ( ( ( rule__Constant__AttributeSizeAssignment_2 )? ) )
            // InternalDdParser.g:1547:1: ( ( rule__Constant__AttributeSizeAssignment_2 )? )
            {
            // InternalDdParser.g:1547:1: ( ( rule__Constant__AttributeSizeAssignment_2 )? )
            // InternalDdParser.g:1548:2: ( rule__Constant__AttributeSizeAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getAttributeSizeAssignment_2()); 
            }
            // InternalDdParser.g:1549:2: ( rule__Constant__AttributeSizeAssignment_2 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==LeftParenthesis) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDdParser.g:1549:3: rule__Constant__AttributeSizeAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Constant__AttributeSizeAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantAccess().getAttributeSizeAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__2__Impl"


    // $ANTLR start "rule__Constant__Group__3"
    // InternalDdParser.g:1557:1: rule__Constant__Group__3 : rule__Constant__Group__3__Impl rule__Constant__Group__4 ;
    public final void rule__Constant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:1561:1: ( rule__Constant__Group__3__Impl rule__Constant__Group__4 )
            // InternalDdParser.g:1562:2: rule__Constant__Group__3__Impl rule__Constant__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Constant__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Constant__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__3"


    // $ANTLR start "rule__Constant__Group__3__Impl"
    // InternalDdParser.g:1569:1: rule__Constant__Group__3__Impl : ( ( rule__Constant__ArraySizeAssignment_3 )? ) ;
    public final void rule__Constant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:1573:1: ( ( ( rule__Constant__ArraySizeAssignment_3 )? ) )
            // InternalDdParser.g:1574:1: ( ( rule__Constant__ArraySizeAssignment_3 )? )
            {
            // InternalDdParser.g:1574:1: ( ( rule__Constant__ArraySizeAssignment_3 )? )
            // InternalDdParser.g:1575:2: ( rule__Constant__ArraySizeAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getArraySizeAssignment_3()); 
            }
            // InternalDdParser.g:1576:2: ( rule__Constant__ArraySizeAssignment_3 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==LeftSquareBracket) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDdParser.g:1576:3: rule__Constant__ArraySizeAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Constant__ArraySizeAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantAccess().getArraySizeAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__3__Impl"


    // $ANTLR start "rule__Constant__Group__4"
    // InternalDdParser.g:1584:1: rule__Constant__Group__4 : rule__Constant__Group__4__Impl rule__Constant__Group__5 ;
    public final void rule__Constant__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:1588:1: ( rule__Constant__Group__4__Impl rule__Constant__Group__5 )
            // InternalDdParser.g:1589:2: rule__Constant__Group__4__Impl rule__Constant__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Constant__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Constant__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__4"


    // $ANTLR start "rule__Constant__Group__4__Impl"
    // InternalDdParser.g:1596:1: rule__Constant__Group__4__Impl : ( ( rule__Constant__NameAssignment_4 ) ) ;
    public final void rule__Constant__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:1600:1: ( ( ( rule__Constant__NameAssignment_4 ) ) )
            // InternalDdParser.g:1601:1: ( ( rule__Constant__NameAssignment_4 ) )
            {
            // InternalDdParser.g:1601:1: ( ( rule__Constant__NameAssignment_4 ) )
            // InternalDdParser.g:1602:2: ( rule__Constant__NameAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getNameAssignment_4()); 
            }
            // InternalDdParser.g:1603:2: ( rule__Constant__NameAssignment_4 )
            // InternalDdParser.g:1603:3: rule__Constant__NameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Constant__NameAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantAccess().getNameAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__4__Impl"


    // $ANTLR start "rule__Constant__Group__5"
    // InternalDdParser.g:1611:1: rule__Constant__Group__5 : rule__Constant__Group__5__Impl rule__Constant__Group__6 ;
    public final void rule__Constant__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:1615:1: ( rule__Constant__Group__5__Impl rule__Constant__Group__6 )
            // InternalDdParser.g:1616:2: rule__Constant__Group__5__Impl rule__Constant__Group__6
            {
            pushFollow(FOLLOW_3);
            rule__Constant__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Constant__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__5"


    // $ANTLR start "rule__Constant__Group__5__Impl"
    // InternalDdParser.g:1623:1: rule__Constant__Group__5__Impl : ( ( rule__Constant__Group_5__0 ) ) ;
    public final void rule__Constant__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:1627:1: ( ( ( rule__Constant__Group_5__0 ) ) )
            // InternalDdParser.g:1628:1: ( ( rule__Constant__Group_5__0 ) )
            {
            // InternalDdParser.g:1628:1: ( ( rule__Constant__Group_5__0 ) )
            // InternalDdParser.g:1629:2: ( rule__Constant__Group_5__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getGroup_5()); 
            }
            // InternalDdParser.g:1630:2: ( rule__Constant__Group_5__0 )
            // InternalDdParser.g:1630:3: rule__Constant__Group_5__0
            {
            pushFollow(FOLLOW_2);
            rule__Constant__Group_5__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantAccess().getGroup_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__5__Impl"


    // $ANTLR start "rule__Constant__Group__6"
    // InternalDdParser.g:1638:1: rule__Constant__Group__6 : rule__Constant__Group__6__Impl rule__Constant__Group__7 ;
    public final void rule__Constant__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:1642:1: ( rule__Constant__Group__6__Impl rule__Constant__Group__7 )
            // InternalDdParser.g:1643:2: rule__Constant__Group__6__Impl rule__Constant__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__Constant__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Constant__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__6"


    // $ANTLR start "rule__Constant__Group__6__Impl"
    // InternalDdParser.g:1650:1: rule__Constant__Group__6__Impl : ( ( rule__Constant__AttrDescAssignment_6 ) ) ;
    public final void rule__Constant__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:1654:1: ( ( ( rule__Constant__AttrDescAssignment_6 ) ) )
            // InternalDdParser.g:1655:1: ( ( rule__Constant__AttrDescAssignment_6 ) )
            {
            // InternalDdParser.g:1655:1: ( ( rule__Constant__AttrDescAssignment_6 ) )
            // InternalDdParser.g:1656:2: ( rule__Constant__AttrDescAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getAttrDescAssignment_6()); 
            }
            // InternalDdParser.g:1657:2: ( rule__Constant__AttrDescAssignment_6 )
            // InternalDdParser.g:1657:3: rule__Constant__AttrDescAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Constant__AttrDescAssignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantAccess().getAttrDescAssignment_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__6__Impl"


    // $ANTLR start "rule__Constant__Group__7"
    // InternalDdParser.g:1665:1: rule__Constant__Group__7 : rule__Constant__Group__7__Impl ;
    public final void rule__Constant__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:1669:1: ( rule__Constant__Group__7__Impl )
            // InternalDdParser.g:1670:2: rule__Constant__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constant__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__7"


    // $ANTLR start "rule__Constant__Group__7__Impl"
    // InternalDdParser.g:1676:1: rule__Constant__Group__7__Impl : ( RULE_EOL ) ;
    public final void rule__Constant__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:1680:1: ( ( RULE_EOL ) )
            // InternalDdParser.g:1681:1: ( RULE_EOL )
            {
            // InternalDdParser.g:1681:1: ( RULE_EOL )
            // InternalDdParser.g:1682:2: RULE_EOL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getEOLTerminalRuleCall_7()); 
            }
            match(input,RULE_EOL,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantAccess().getEOLTerminalRuleCall_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__7__Impl"


    // $ANTLR start "rule__Constant__Group_5__0"
    // InternalDdParser.g:1692:1: rule__Constant__Group_5__0 : rule__Constant__Group_5__0__Impl rule__Constant__Group_5__1 ;
    public final void rule__Constant__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:1696:1: ( rule__Constant__Group_5__0__Impl rule__Constant__Group_5__1 )
            // InternalDdParser.g:1697:2: rule__Constant__Group_5__0__Impl rule__Constant__Group_5__1
            {
            pushFollow(FOLLOW_10);
            rule__Constant__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Constant__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group_5__0"


    // $ANTLR start "rule__Constant__Group_5__0__Impl"
    // InternalDdParser.g:1704:1: rule__Constant__Group_5__0__Impl : ( EqualsSign ) ;
    public final void rule__Constant__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:1708:1: ( ( EqualsSign ) )
            // InternalDdParser.g:1709:1: ( EqualsSign )
            {
            // InternalDdParser.g:1709:1: ( EqualsSign )
            // InternalDdParser.g:1710:2: EqualsSign
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getEqualsSignKeyword_5_0()); 
            }
            match(input,EqualsSign,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantAccess().getEqualsSignKeyword_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group_5__0__Impl"


    // $ANTLR start "rule__Constant__Group_5__1"
    // InternalDdParser.g:1719:1: rule__Constant__Group_5__1 : rule__Constant__Group_5__1__Impl ;
    public final void rule__Constant__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:1723:1: ( rule__Constant__Group_5__1__Impl )
            // InternalDdParser.g:1724:2: rule__Constant__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constant__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group_5__1"


    // $ANTLR start "rule__Constant__Group_5__1__Impl"
    // InternalDdParser.g:1730:1: rule__Constant__Group_5__1__Impl : ( ( rule__Constant__DefaultValueAssignment_5_1 ) ) ;
    public final void rule__Constant__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:1734:1: ( ( ( rule__Constant__DefaultValueAssignment_5_1 ) ) )
            // InternalDdParser.g:1735:1: ( ( rule__Constant__DefaultValueAssignment_5_1 ) )
            {
            // InternalDdParser.g:1735:1: ( ( rule__Constant__DefaultValueAssignment_5_1 ) )
            // InternalDdParser.g:1736:2: ( rule__Constant__DefaultValueAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getDefaultValueAssignment_5_1()); 
            }
            // InternalDdParser.g:1737:2: ( rule__Constant__DefaultValueAssignment_5_1 )
            // InternalDdParser.g:1737:3: rule__Constant__DefaultValueAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Constant__DefaultValueAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantAccess().getDefaultValueAssignment_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group_5__1__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // InternalDdParser.g:1746:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:1750:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalDdParser.g:1751:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Entity__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Entity__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // InternalDdParser.g:1758:1: rule__Entity__Group__0__Impl : ( ( ( rule__Entity__EntityDescLinesAssignment_0 ) ) ( ( rule__Entity__EntityDescLinesAssignment_0 )* ) ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:1762:1: ( ( ( ( rule__Entity__EntityDescLinesAssignment_0 ) ) ( ( rule__Entity__EntityDescLinesAssignment_0 )* ) ) )
            // InternalDdParser.g:1763:1: ( ( ( rule__Entity__EntityDescLinesAssignment_0 ) ) ( ( rule__Entity__EntityDescLinesAssignment_0 )* ) )
            {
            // InternalDdParser.g:1763:1: ( ( ( rule__Entity__EntityDescLinesAssignment_0 ) ) ( ( rule__Entity__EntityDescLinesAssignment_0 )* ) )
            // InternalDdParser.g:1764:2: ( ( rule__Entity__EntityDescLinesAssignment_0 ) ) ( ( rule__Entity__EntityDescLinesAssignment_0 )* )
            {
            // InternalDdParser.g:1764:2: ( ( rule__Entity__EntityDescLinesAssignment_0 ) )
            // InternalDdParser.g:1765:3: ( rule__Entity__EntityDescLinesAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getEntityDescLinesAssignment_0()); 
            }
            // InternalDdParser.g:1766:3: ( rule__Entity__EntityDescLinesAssignment_0 )
            // InternalDdParser.g:1766:4: rule__Entity__EntityDescLinesAssignment_0
            {
            pushFollow(FOLLOW_5);
            rule__Entity__EntityDescLinesAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getEntityDescLinesAssignment_0()); 
            }

            }

            // InternalDdParser.g:1769:2: ( ( rule__Entity__EntityDescLinesAssignment_0 )* )
            // InternalDdParser.g:1770:3: ( rule__Entity__EntityDescLinesAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getEntityDescLinesAssignment_0()); 
            }
            // InternalDdParser.g:1771:3: ( rule__Entity__EntityDescLinesAssignment_0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_CMT) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalDdParser.g:1771:4: rule__Entity__EntityDescLinesAssignment_0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Entity__EntityDescLinesAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getEntityDescLinesAssignment_0()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // InternalDdParser.g:1780:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:1784:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalDdParser.g:1785:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Entity__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Entity__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // InternalDdParser.g:1792:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:1796:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // InternalDdParser.g:1797:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // InternalDdParser.g:1797:1: ( ( rule__Entity__NameAssignment_1 ) )
            // InternalDdParser.g:1798:2: ( rule__Entity__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            }
            // InternalDdParser.g:1799:2: ( rule__Entity__NameAssignment_1 )
            // InternalDdParser.g:1799:3: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // InternalDdParser.g:1807:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:1811:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalDdParser.g:1812:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Entity__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Entity__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // InternalDdParser.g:1819:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__Group_2__0 )? ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:1823:1: ( ( ( rule__Entity__Group_2__0 )? ) )
            // InternalDdParser.g:1824:1: ( ( rule__Entity__Group_2__0 )? )
            {
            // InternalDdParser.g:1824:1: ( ( rule__Entity__Group_2__0 )? )
            // InternalDdParser.g:1825:2: ( rule__Entity__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getGroup_2()); 
            }
            // InternalDdParser.g:1826:2: ( rule__Entity__Group_2__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==HyphenMinusGreaterThanSign) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalDdParser.g:1826:3: rule__Entity__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entity__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // InternalDdParser.g:1834:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:1838:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // InternalDdParser.g:1839:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Entity__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Entity__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3"


    // $ANTLR start "rule__Entity__Group__3__Impl"
    // InternalDdParser.g:1846:1: rule__Entity__Group__3__Impl : ( Colon ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:1850:1: ( ( Colon ) )
            // InternalDdParser.g:1851:1: ( Colon )
            {
            // InternalDdParser.g:1851:1: ( Colon )
            // InternalDdParser.g:1852:2: Colon
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getColonKeyword_3()); 
            }
            match(input,Colon,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getColonKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__4"
    // InternalDdParser.g:1861:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:1865:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // InternalDdParser.g:1866:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Entity__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Entity__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__4"


    // $ANTLR start "rule__Entity__Group__4__Impl"
    // InternalDdParser.g:1873:1: rule__Entity__Group__4__Impl : ( RULE_BEGIN ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:1877:1: ( ( RULE_BEGIN ) )
            // InternalDdParser.g:1878:1: ( RULE_BEGIN )
            {
            // InternalDdParser.g:1878:1: ( RULE_BEGIN )
            // InternalDdParser.g:1879:2: RULE_BEGIN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getBEGINTerminalRuleCall_4()); 
            }
            match(input,RULE_BEGIN,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getBEGINTerminalRuleCall_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__4__Impl"


    // $ANTLR start "rule__Entity__Group__5"
    // InternalDdParser.g:1888:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl rule__Entity__Group__6 ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:1892:1: ( rule__Entity__Group__5__Impl rule__Entity__Group__6 )
            // InternalDdParser.g:1893:2: rule__Entity__Group__5__Impl rule__Entity__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__Entity__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Entity__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__5"


    // $ANTLR start "rule__Entity__Group__5__Impl"
    // InternalDdParser.g:1900:1: rule__Entity__Group__5__Impl : ( ( ( rule__Entity__AttributesAssignment_5 ) ) ( ( rule__Entity__AttributesAssignment_5 )* ) ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:1904:1: ( ( ( ( rule__Entity__AttributesAssignment_5 ) ) ( ( rule__Entity__AttributesAssignment_5 )* ) ) )
            // InternalDdParser.g:1905:1: ( ( ( rule__Entity__AttributesAssignment_5 ) ) ( ( rule__Entity__AttributesAssignment_5 )* ) )
            {
            // InternalDdParser.g:1905:1: ( ( ( rule__Entity__AttributesAssignment_5 ) ) ( ( rule__Entity__AttributesAssignment_5 )* ) )
            // InternalDdParser.g:1906:2: ( ( rule__Entity__AttributesAssignment_5 ) ) ( ( rule__Entity__AttributesAssignment_5 )* )
            {
            // InternalDdParser.g:1906:2: ( ( rule__Entity__AttributesAssignment_5 ) )
            // InternalDdParser.g:1907:3: ( rule__Entity__AttributesAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getAttributesAssignment_5()); 
            }
            // InternalDdParser.g:1908:3: ( rule__Entity__AttributesAssignment_5 )
            // InternalDdParser.g:1908:4: rule__Entity__AttributesAssignment_5
            {
            pushFollow(FOLLOW_4);
            rule__Entity__AttributesAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getAttributesAssignment_5()); 
            }

            }

            // InternalDdParser.g:1911:2: ( ( rule__Entity__AttributesAssignment_5 )* )
            // InternalDdParser.g:1912:3: ( rule__Entity__AttributesAssignment_5 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getAttributesAssignment_5()); 
            }
            // InternalDdParser.g:1913:3: ( rule__Entity__AttributesAssignment_5 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==Stamp||(LA18_0>=Bits && LA18_0<=Date)||LA18_0==Time||(LA18_0>=Chr && LA18_0<=Int)||(LA18_0>=Str && LA18_0<=HalfwidthHangulFillerHalfwidthHangulFillerHalfwidthHangulFiller)||LA18_0==RULE_CMT) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalDdParser.g:1913:4: rule__Entity__AttributesAssignment_5
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Entity__AttributesAssignment_5();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getAttributesAssignment_5()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__5__Impl"


    // $ANTLR start "rule__Entity__Group__6"
    // InternalDdParser.g:1922:1: rule__Entity__Group__6 : rule__Entity__Group__6__Impl rule__Entity__Group__7 ;
    public final void rule__Entity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:1926:1: ( rule__Entity__Group__6__Impl rule__Entity__Group__7 )
            // InternalDdParser.g:1927:2: rule__Entity__Group__6__Impl rule__Entity__Group__7
            {
            pushFollow(FOLLOW_14);
            rule__Entity__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Entity__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__6"


    // $ANTLR start "rule__Entity__Group__6__Impl"
    // InternalDdParser.g:1934:1: rule__Entity__Group__6__Impl : ( ( rule__Entity__RelationshipsAssignment_6 )* ) ;
    public final void rule__Entity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:1938:1: ( ( ( rule__Entity__RelationshipsAssignment_6 )* ) )
            // InternalDdParser.g:1939:1: ( ( rule__Entity__RelationshipsAssignment_6 )* )
            {
            // InternalDdParser.g:1939:1: ( ( rule__Entity__RelationshipsAssignment_6 )* )
            // InternalDdParser.g:1940:2: ( rule__Entity__RelationshipsAssignment_6 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getRelationshipsAssignment_6()); 
            }
            // InternalDdParser.g:1941:2: ( rule__Entity__RelationshipsAssignment_6 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==LeftParenthesis) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalDdParser.g:1941:3: rule__Entity__RelationshipsAssignment_6
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Entity__RelationshipsAssignment_6();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getRelationshipsAssignment_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__6__Impl"


    // $ANTLR start "rule__Entity__Group__7"
    // InternalDdParser.g:1949:1: rule__Entity__Group__7 : rule__Entity__Group__7__Impl ;
    public final void rule__Entity__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:1953:1: ( rule__Entity__Group__7__Impl )
            // InternalDdParser.g:1954:2: rule__Entity__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__7"


    // $ANTLR start "rule__Entity__Group__7__Impl"
    // InternalDdParser.g:1960:1: rule__Entity__Group__7__Impl : ( RULE_END ) ;
    public final void rule__Entity__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:1964:1: ( ( RULE_END ) )
            // InternalDdParser.g:1965:1: ( RULE_END )
            {
            // InternalDdParser.g:1965:1: ( RULE_END )
            // InternalDdParser.g:1966:2: RULE_END
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getENDTerminalRuleCall_7()); 
            }
            match(input,RULE_END,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getENDTerminalRuleCall_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__7__Impl"


    // $ANTLR start "rule__Entity__Group_2__0"
    // InternalDdParser.g:1976:1: rule__Entity__Group_2__0 : rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 ;
    public final void rule__Entity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:1980:1: ( rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 )
            // InternalDdParser.g:1981:2: rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1
            {
            pushFollow(FOLLOW_16);
            rule__Entity__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Entity__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__0"


    // $ANTLR start "rule__Entity__Group_2__0__Impl"
    // InternalDdParser.g:1988:1: rule__Entity__Group_2__0__Impl : ( HyphenMinusGreaterThanSign ) ;
    public final void rule__Entity__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:1992:1: ( ( HyphenMinusGreaterThanSign ) )
            // InternalDdParser.g:1993:1: ( HyphenMinusGreaterThanSign )
            {
            // InternalDdParser.g:1993:1: ( HyphenMinusGreaterThanSign )
            // InternalDdParser.g:1994:2: HyphenMinusGreaterThanSign
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getHyphenMinusGreaterThanSignKeyword_2_0()); 
            }
            match(input,HyphenMinusGreaterThanSign,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getHyphenMinusGreaterThanSignKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__0__Impl"


    // $ANTLR start "rule__Entity__Group_2__1"
    // InternalDdParser.g:2003:1: rule__Entity__Group_2__1 : rule__Entity__Group_2__1__Impl ;
    public final void rule__Entity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:2007:1: ( rule__Entity__Group_2__1__Impl )
            // InternalDdParser.g:2008:2: rule__Entity__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__1"


    // $ANTLR start "rule__Entity__Group_2__1__Impl"
    // InternalDdParser.g:2014:1: rule__Entity__Group_2__1__Impl : ( ( rule__Entity__ExtendsAssignment_2_1 ) ) ;
    public final void rule__Entity__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:2018:1: ( ( ( rule__Entity__ExtendsAssignment_2_1 ) ) )
            // InternalDdParser.g:2019:1: ( ( rule__Entity__ExtendsAssignment_2_1 ) )
            {
            // InternalDdParser.g:2019:1: ( ( rule__Entity__ExtendsAssignment_2_1 ) )
            // InternalDdParser.g:2020:2: ( rule__Entity__ExtendsAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getExtendsAssignment_2_1()); 
            }
            // InternalDdParser.g:2021:2: ( rule__Entity__ExtendsAssignment_2_1 )
            // InternalDdParser.g:2021:3: rule__Entity__ExtendsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__ExtendsAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getExtendsAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__1__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalDdParser.g:2030:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:2034:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalDdParser.g:2035:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Attribute__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // InternalDdParser.g:2042:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__ExtraAttrDescAssignment_0 )* ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:2046:1: ( ( ( rule__Attribute__ExtraAttrDescAssignment_0 )* ) )
            // InternalDdParser.g:2047:1: ( ( rule__Attribute__ExtraAttrDescAssignment_0 )* )
            {
            // InternalDdParser.g:2047:1: ( ( rule__Attribute__ExtraAttrDescAssignment_0 )* )
            // InternalDdParser.g:2048:2: ( rule__Attribute__ExtraAttrDescAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getExtraAttrDescAssignment_0()); 
            }
            // InternalDdParser.g:2049:2: ( rule__Attribute__ExtraAttrDescAssignment_0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_CMT) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalDdParser.g:2049:3: rule__Attribute__ExtraAttrDescAssignment_0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Attribute__ExtraAttrDescAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getExtraAttrDescAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // InternalDdParser.g:2057:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:2061:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalDdParser.g:2062:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Attribute__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // InternalDdParser.g:2069:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__DataTypeAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:2073:1: ( ( ( rule__Attribute__DataTypeAssignment_1 ) ) )
            // InternalDdParser.g:2074:1: ( ( rule__Attribute__DataTypeAssignment_1 ) )
            {
            // InternalDdParser.g:2074:1: ( ( rule__Attribute__DataTypeAssignment_1 ) )
            // InternalDdParser.g:2075:2: ( rule__Attribute__DataTypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getDataTypeAssignment_1()); 
            }
            // InternalDdParser.g:2076:2: ( rule__Attribute__DataTypeAssignment_1 )
            // InternalDdParser.g:2076:3: rule__Attribute__DataTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__DataTypeAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getDataTypeAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // InternalDdParser.g:2084:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:2088:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalDdParser.g:2089:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__Attribute__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // InternalDdParser.g:2096:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__AttributeSizeAssignment_2 )? ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:2100:1: ( ( ( rule__Attribute__AttributeSizeAssignment_2 )? ) )
            // InternalDdParser.g:2101:1: ( ( rule__Attribute__AttributeSizeAssignment_2 )? )
            {
            // InternalDdParser.g:2101:1: ( ( rule__Attribute__AttributeSizeAssignment_2 )? )
            // InternalDdParser.g:2102:2: ( rule__Attribute__AttributeSizeAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getAttributeSizeAssignment_2()); 
            }
            // InternalDdParser.g:2103:2: ( rule__Attribute__AttributeSizeAssignment_2 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==LeftParenthesis) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalDdParser.g:2103:3: rule__Attribute__AttributeSizeAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__AttributeSizeAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getAttributeSizeAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__Attribute__Group__3"
    // InternalDdParser.g:2111:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:2115:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // InternalDdParser.g:2116:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Attribute__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__3"


    // $ANTLR start "rule__Attribute__Group__3__Impl"
    // InternalDdParser.g:2123:1: rule__Attribute__Group__3__Impl : ( ( rule__Attribute__ArraySizeAssignment_3 )? ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:2127:1: ( ( ( rule__Attribute__ArraySizeAssignment_3 )? ) )
            // InternalDdParser.g:2128:1: ( ( rule__Attribute__ArraySizeAssignment_3 )? )
            {
            // InternalDdParser.g:2128:1: ( ( rule__Attribute__ArraySizeAssignment_3 )? )
            // InternalDdParser.g:2129:2: ( rule__Attribute__ArraySizeAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getArraySizeAssignment_3()); 
            }
            // InternalDdParser.g:2130:2: ( rule__Attribute__ArraySizeAssignment_3 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==LeftSquareBracket) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalDdParser.g:2130:3: rule__Attribute__ArraySizeAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__ArraySizeAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getArraySizeAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__3__Impl"


    // $ANTLR start "rule__Attribute__Group__4"
    // InternalDdParser.g:2138:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl rule__Attribute__Group__5 ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:2142:1: ( rule__Attribute__Group__4__Impl rule__Attribute__Group__5 )
            // InternalDdParser.g:2143:2: rule__Attribute__Group__4__Impl rule__Attribute__Group__5
            {
            pushFollow(FOLLOW_18);
            rule__Attribute__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__4"


    // $ANTLR start "rule__Attribute__Group__4__Impl"
    // InternalDdParser.g:2150:1: rule__Attribute__Group__4__Impl : ( ( rule__Attribute__NameAssignment_4 ) ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:2154:1: ( ( ( rule__Attribute__NameAssignment_4 ) ) )
            // InternalDdParser.g:2155:1: ( ( rule__Attribute__NameAssignment_4 ) )
            {
            // InternalDdParser.g:2155:1: ( ( rule__Attribute__NameAssignment_4 ) )
            // InternalDdParser.g:2156:2: ( rule__Attribute__NameAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getNameAssignment_4()); 
            }
            // InternalDdParser.g:2157:2: ( rule__Attribute__NameAssignment_4 )
            // InternalDdParser.g:2157:3: rule__Attribute__NameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__NameAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getNameAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__4__Impl"


    // $ANTLR start "rule__Attribute__Group__5"
    // InternalDdParser.g:2165:1: rule__Attribute__Group__5 : rule__Attribute__Group__5__Impl rule__Attribute__Group__6 ;
    public final void rule__Attribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:2169:1: ( rule__Attribute__Group__5__Impl rule__Attribute__Group__6 )
            // InternalDdParser.g:2170:2: rule__Attribute__Group__5__Impl rule__Attribute__Group__6
            {
            pushFollow(FOLLOW_18);
            rule__Attribute__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__5"


    // $ANTLR start "rule__Attribute__Group__5__Impl"
    // InternalDdParser.g:2177:1: rule__Attribute__Group__5__Impl : ( ( rule__Attribute__Group_5__0 )? ) ;
    public final void rule__Attribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:2181:1: ( ( ( rule__Attribute__Group_5__0 )? ) )
            // InternalDdParser.g:2182:1: ( ( rule__Attribute__Group_5__0 )? )
            {
            // InternalDdParser.g:2182:1: ( ( rule__Attribute__Group_5__0 )? )
            // InternalDdParser.g:2183:2: ( rule__Attribute__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getGroup_5()); 
            }
            // InternalDdParser.g:2184:2: ( rule__Attribute__Group_5__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==EqualsSign) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalDdParser.g:2184:3: rule__Attribute__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getGroup_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__5__Impl"


    // $ANTLR start "rule__Attribute__Group__6"
    // InternalDdParser.g:2192:1: rule__Attribute__Group__6 : rule__Attribute__Group__6__Impl rule__Attribute__Group__7 ;
    public final void rule__Attribute__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:2196:1: ( rule__Attribute__Group__6__Impl rule__Attribute__Group__7 )
            // InternalDdParser.g:2197:2: rule__Attribute__Group__6__Impl rule__Attribute__Group__7
            {
            pushFollow(FOLLOW_18);
            rule__Attribute__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__6"


    // $ANTLR start "rule__Attribute__Group__6__Impl"
    // InternalDdParser.g:2204:1: rule__Attribute__Group__6__Impl : ( ( rule__Attribute__PrimaryKeyAssignment_6 )? ) ;
    public final void rule__Attribute__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:2208:1: ( ( ( rule__Attribute__PrimaryKeyAssignment_6 )? ) )
            // InternalDdParser.g:2209:1: ( ( rule__Attribute__PrimaryKeyAssignment_6 )? )
            {
            // InternalDdParser.g:2209:1: ( ( rule__Attribute__PrimaryKeyAssignment_6 )? )
            // InternalDdParser.g:2210:2: ( rule__Attribute__PrimaryKeyAssignment_6 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getPrimaryKeyAssignment_6()); 
            }
            // InternalDdParser.g:2211:2: ( rule__Attribute__PrimaryKeyAssignment_6 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==Pk) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalDdParser.g:2211:3: rule__Attribute__PrimaryKeyAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__PrimaryKeyAssignment_6();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getPrimaryKeyAssignment_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__6__Impl"


    // $ANTLR start "rule__Attribute__Group__7"
    // InternalDdParser.g:2219:1: rule__Attribute__Group__7 : rule__Attribute__Group__7__Impl rule__Attribute__Group__8 ;
    public final void rule__Attribute__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:2223:1: ( rule__Attribute__Group__7__Impl rule__Attribute__Group__8 )
            // InternalDdParser.g:2224:2: rule__Attribute__Group__7__Impl rule__Attribute__Group__8
            {
            pushFollow(FOLLOW_18);
            rule__Attribute__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__7"


    // $ANTLR start "rule__Attribute__Group__7__Impl"
    // InternalDdParser.g:2231:1: rule__Attribute__Group__7__Impl : ( ( rule__Attribute__MandatoryAssignment_7 )? ) ;
    public final void rule__Attribute__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:2235:1: ( ( ( rule__Attribute__MandatoryAssignment_7 )? ) )
            // InternalDdParser.g:2236:1: ( ( rule__Attribute__MandatoryAssignment_7 )? )
            {
            // InternalDdParser.g:2236:1: ( ( rule__Attribute__MandatoryAssignment_7 )? )
            // InternalDdParser.g:2237:2: ( rule__Attribute__MandatoryAssignment_7 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getMandatoryAssignment_7()); 
            }
            // InternalDdParser.g:2238:2: ( rule__Attribute__MandatoryAssignment_7 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==ExclamationMark) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalDdParser.g:2238:3: rule__Attribute__MandatoryAssignment_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__MandatoryAssignment_7();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getMandatoryAssignment_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__7__Impl"


    // $ANTLR start "rule__Attribute__Group__8"
    // InternalDdParser.g:2246:1: rule__Attribute__Group__8 : rule__Attribute__Group__8__Impl rule__Attribute__Group__9 ;
    public final void rule__Attribute__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:2250:1: ( rule__Attribute__Group__8__Impl rule__Attribute__Group__9 )
            // InternalDdParser.g:2251:2: rule__Attribute__Group__8__Impl rule__Attribute__Group__9
            {
            pushFollow(FOLLOW_9);
            rule__Attribute__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__8"


    // $ANTLR start "rule__Attribute__Group__8__Impl"
    // InternalDdParser.g:2258:1: rule__Attribute__Group__8__Impl : ( ( rule__Attribute__AttrDescAssignment_8 ) ) ;
    public final void rule__Attribute__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:2262:1: ( ( ( rule__Attribute__AttrDescAssignment_8 ) ) )
            // InternalDdParser.g:2263:1: ( ( rule__Attribute__AttrDescAssignment_8 ) )
            {
            // InternalDdParser.g:2263:1: ( ( rule__Attribute__AttrDescAssignment_8 ) )
            // InternalDdParser.g:2264:2: ( rule__Attribute__AttrDescAssignment_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getAttrDescAssignment_8()); 
            }
            // InternalDdParser.g:2265:2: ( rule__Attribute__AttrDescAssignment_8 )
            // InternalDdParser.g:2265:3: rule__Attribute__AttrDescAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__AttrDescAssignment_8();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getAttrDescAssignment_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__8__Impl"


    // $ANTLR start "rule__Attribute__Group__9"
    // InternalDdParser.g:2273:1: rule__Attribute__Group__9 : rule__Attribute__Group__9__Impl ;
    public final void rule__Attribute__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:2277:1: ( rule__Attribute__Group__9__Impl )
            // InternalDdParser.g:2278:2: rule__Attribute__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__9"


    // $ANTLR start "rule__Attribute__Group__9__Impl"
    // InternalDdParser.g:2284:1: rule__Attribute__Group__9__Impl : ( RULE_EOL ) ;
    public final void rule__Attribute__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:2288:1: ( ( RULE_EOL ) )
            // InternalDdParser.g:2289:1: ( RULE_EOL )
            {
            // InternalDdParser.g:2289:1: ( RULE_EOL )
            // InternalDdParser.g:2290:2: RULE_EOL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getEOLTerminalRuleCall_9()); 
            }
            match(input,RULE_EOL,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getEOLTerminalRuleCall_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__9__Impl"


    // $ANTLR start "rule__Attribute__Group_5__0"
    // InternalDdParser.g:2300:1: rule__Attribute__Group_5__0 : rule__Attribute__Group_5__0__Impl rule__Attribute__Group_5__1 ;
    public final void rule__Attribute__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:2304:1: ( rule__Attribute__Group_5__0__Impl rule__Attribute__Group_5__1 )
            // InternalDdParser.g:2305:2: rule__Attribute__Group_5__0__Impl rule__Attribute__Group_5__1
            {
            pushFollow(FOLLOW_10);
            rule__Attribute__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Attribute__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_5__0"


    // $ANTLR start "rule__Attribute__Group_5__0__Impl"
    // InternalDdParser.g:2312:1: rule__Attribute__Group_5__0__Impl : ( EqualsSign ) ;
    public final void rule__Attribute__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:2316:1: ( ( EqualsSign ) )
            // InternalDdParser.g:2317:1: ( EqualsSign )
            {
            // InternalDdParser.g:2317:1: ( EqualsSign )
            // InternalDdParser.g:2318:2: EqualsSign
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getEqualsSignKeyword_5_0()); 
            }
            match(input,EqualsSign,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getEqualsSignKeyword_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_5__0__Impl"


    // $ANTLR start "rule__Attribute__Group_5__1"
    // InternalDdParser.g:2327:1: rule__Attribute__Group_5__1 : rule__Attribute__Group_5__1__Impl ;
    public final void rule__Attribute__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:2331:1: ( rule__Attribute__Group_5__1__Impl )
            // InternalDdParser.g:2332:2: rule__Attribute__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_5__1"


    // $ANTLR start "rule__Attribute__Group_5__1__Impl"
    // InternalDdParser.g:2338:1: rule__Attribute__Group_5__1__Impl : ( ( rule__Attribute__DefaultValueAssignment_5_1 ) ) ;
    public final void rule__Attribute__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:2342:1: ( ( ( rule__Attribute__DefaultValueAssignment_5_1 ) ) )
            // InternalDdParser.g:2343:1: ( ( rule__Attribute__DefaultValueAssignment_5_1 ) )
            {
            // InternalDdParser.g:2343:1: ( ( rule__Attribute__DefaultValueAssignment_5_1 ) )
            // InternalDdParser.g:2344:2: ( rule__Attribute__DefaultValueAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getDefaultValueAssignment_5_1()); 
            }
            // InternalDdParser.g:2345:2: ( rule__Attribute__DefaultValueAssignment_5_1 )
            // InternalDdParser.g:2345:3: rule__Attribute__DefaultValueAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__DefaultValueAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getDefaultValueAssignment_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_5__1__Impl"


    // $ANTLR start "rule__AttributeSize__Group__0"
    // InternalDdParser.g:2354:1: rule__AttributeSize__Group__0 : rule__AttributeSize__Group__0__Impl rule__AttributeSize__Group__1 ;
    public final void rule__AttributeSize__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:2358:1: ( rule__AttributeSize__Group__0__Impl rule__AttributeSize__Group__1 )
            // InternalDdParser.g:2359:2: rule__AttributeSize__Group__0__Impl rule__AttributeSize__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__AttributeSize__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AttributeSize__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeSize__Group__0"


    // $ANTLR start "rule__AttributeSize__Group__0__Impl"
    // InternalDdParser.g:2366:1: rule__AttributeSize__Group__0__Impl : ( LeftParenthesis ) ;
    public final void rule__AttributeSize__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:2370:1: ( ( LeftParenthesis ) )
            // InternalDdParser.g:2371:1: ( LeftParenthesis )
            {
            // InternalDdParser.g:2371:1: ( LeftParenthesis )
            // InternalDdParser.g:2372:2: LeftParenthesis
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeSizeAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,LeftParenthesis,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeSizeAccess().getLeftParenthesisKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeSize__Group__0__Impl"


    // $ANTLR start "rule__AttributeSize__Group__1"
    // InternalDdParser.g:2381:1: rule__AttributeSize__Group__1 : rule__AttributeSize__Group__1__Impl rule__AttributeSize__Group__2 ;
    public final void rule__AttributeSize__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:2385:1: ( rule__AttributeSize__Group__1__Impl rule__AttributeSize__Group__2 )
            // InternalDdParser.g:2386:2: rule__AttributeSize__Group__1__Impl rule__AttributeSize__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__AttributeSize__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AttributeSize__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeSize__Group__1"


    // $ANTLR start "rule__AttributeSize__Group__1__Impl"
    // InternalDdParser.g:2393:1: rule__AttributeSize__Group__1__Impl : ( ( rule__AttributeSize__LengthAssignment_1 ) ) ;
    public final void rule__AttributeSize__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:2397:1: ( ( ( rule__AttributeSize__LengthAssignment_1 ) ) )
            // InternalDdParser.g:2398:1: ( ( rule__AttributeSize__LengthAssignment_1 ) )
            {
            // InternalDdParser.g:2398:1: ( ( rule__AttributeSize__LengthAssignment_1 ) )
            // InternalDdParser.g:2399:2: ( rule__AttributeSize__LengthAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeSizeAccess().getLengthAssignment_1()); 
            }
            // InternalDdParser.g:2400:2: ( rule__AttributeSize__LengthAssignment_1 )
            // InternalDdParser.g:2400:3: rule__AttributeSize__LengthAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AttributeSize__LengthAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeSizeAccess().getLengthAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeSize__Group__1__Impl"


    // $ANTLR start "rule__AttributeSize__Group__2"
    // InternalDdParser.g:2408:1: rule__AttributeSize__Group__2 : rule__AttributeSize__Group__2__Impl rule__AttributeSize__Group__3 ;
    public final void rule__AttributeSize__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:2412:1: ( rule__AttributeSize__Group__2__Impl rule__AttributeSize__Group__3 )
            // InternalDdParser.g:2413:2: rule__AttributeSize__Group__2__Impl rule__AttributeSize__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__AttributeSize__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AttributeSize__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeSize__Group__2"


    // $ANTLR start "rule__AttributeSize__Group__2__Impl"
    // InternalDdParser.g:2420:1: rule__AttributeSize__Group__2__Impl : ( ( rule__AttributeSize__Group_2__0 )? ) ;
    public final void rule__AttributeSize__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:2424:1: ( ( ( rule__AttributeSize__Group_2__0 )? ) )
            // InternalDdParser.g:2425:1: ( ( rule__AttributeSize__Group_2__0 )? )
            {
            // InternalDdParser.g:2425:1: ( ( rule__AttributeSize__Group_2__0 )? )
            // InternalDdParser.g:2426:2: ( rule__AttributeSize__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeSizeAccess().getGroup_2()); 
            }
            // InternalDdParser.g:2427:2: ( rule__AttributeSize__Group_2__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==Comma) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalDdParser.g:2427:3: rule__AttributeSize__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AttributeSize__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeSizeAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeSize__Group__2__Impl"


    // $ANTLR start "rule__AttributeSize__Group__3"
    // InternalDdParser.g:2435:1: rule__AttributeSize__Group__3 : rule__AttributeSize__Group__3__Impl ;
    public final void rule__AttributeSize__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:2439:1: ( rule__AttributeSize__Group__3__Impl )
            // InternalDdParser.g:2440:2: rule__AttributeSize__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeSize__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeSize__Group__3"


    // $ANTLR start "rule__AttributeSize__Group__3__Impl"
    // InternalDdParser.g:2446:1: rule__AttributeSize__Group__3__Impl : ( RightParenthesis ) ;
    public final void rule__AttributeSize__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:2450:1: ( ( RightParenthesis ) )
            // InternalDdParser.g:2451:1: ( RightParenthesis )
            {
            // InternalDdParser.g:2451:1: ( RightParenthesis )
            // InternalDdParser.g:2452:2: RightParenthesis
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeSizeAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,RightParenthesis,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeSizeAccess().getRightParenthesisKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeSize__Group__3__Impl"


    // $ANTLR start "rule__AttributeSize__Group_2__0"
    // InternalDdParser.g:2462:1: rule__AttributeSize__Group_2__0 : rule__AttributeSize__Group_2__0__Impl rule__AttributeSize__Group_2__1 ;
    public final void rule__AttributeSize__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:2466:1: ( rule__AttributeSize__Group_2__0__Impl rule__AttributeSize__Group_2__1 )
            // InternalDdParser.g:2467:2: rule__AttributeSize__Group_2__0__Impl rule__AttributeSize__Group_2__1
            {
            pushFollow(FOLLOW_19);
            rule__AttributeSize__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AttributeSize__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeSize__Group_2__0"


    // $ANTLR start "rule__AttributeSize__Group_2__0__Impl"
    // InternalDdParser.g:2474:1: rule__AttributeSize__Group_2__0__Impl : ( Comma ) ;
    public final void rule__AttributeSize__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:2478:1: ( ( Comma ) )
            // InternalDdParser.g:2479:1: ( Comma )
            {
            // InternalDdParser.g:2479:1: ( Comma )
            // InternalDdParser.g:2480:2: Comma
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeSizeAccess().getCommaKeyword_2_0()); 
            }
            match(input,Comma,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeSizeAccess().getCommaKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeSize__Group_2__0__Impl"


    // $ANTLR start "rule__AttributeSize__Group_2__1"
    // InternalDdParser.g:2489:1: rule__AttributeSize__Group_2__1 : rule__AttributeSize__Group_2__1__Impl ;
    public final void rule__AttributeSize__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:2493:1: ( rule__AttributeSize__Group_2__1__Impl )
            // InternalDdParser.g:2494:2: rule__AttributeSize__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeSize__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeSize__Group_2__1"


    // $ANTLR start "rule__AttributeSize__Group_2__1__Impl"
    // InternalDdParser.g:2500:1: rule__AttributeSize__Group_2__1__Impl : ( ( rule__AttributeSize__PrecisionAssignment_2_1 ) ) ;
    public final void rule__AttributeSize__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:2504:1: ( ( ( rule__AttributeSize__PrecisionAssignment_2_1 ) ) )
            // InternalDdParser.g:2505:1: ( ( rule__AttributeSize__PrecisionAssignment_2_1 ) )
            {
            // InternalDdParser.g:2505:1: ( ( rule__AttributeSize__PrecisionAssignment_2_1 ) )
            // InternalDdParser.g:2506:2: ( rule__AttributeSize__PrecisionAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeSizeAccess().getPrecisionAssignment_2_1()); 
            }
            // InternalDdParser.g:2507:2: ( rule__AttributeSize__PrecisionAssignment_2_1 )
            // InternalDdParser.g:2507:3: rule__AttributeSize__PrecisionAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__AttributeSize__PrecisionAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeSizeAccess().getPrecisionAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeSize__Group_2__1__Impl"


    // $ANTLR start "rule__ArraySize__Group__0"
    // InternalDdParser.g:2516:1: rule__ArraySize__Group__0 : rule__ArraySize__Group__0__Impl rule__ArraySize__Group__1 ;
    public final void rule__ArraySize__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:2520:1: ( rule__ArraySize__Group__0__Impl rule__ArraySize__Group__1 )
            // InternalDdParser.g:2521:2: rule__ArraySize__Group__0__Impl rule__ArraySize__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__ArraySize__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ArraySize__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArraySize__Group__0"


    // $ANTLR start "rule__ArraySize__Group__0__Impl"
    // InternalDdParser.g:2528:1: rule__ArraySize__Group__0__Impl : ( LeftSquareBracket ) ;
    public final void rule__ArraySize__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:2532:1: ( ( LeftSquareBracket ) )
            // InternalDdParser.g:2533:1: ( LeftSquareBracket )
            {
            // InternalDdParser.g:2533:1: ( LeftSquareBracket )
            // InternalDdParser.g:2534:2: LeftSquareBracket
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArraySizeAccess().getLeftSquareBracketKeyword_0()); 
            }
            match(input,LeftSquareBracket,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArraySizeAccess().getLeftSquareBracketKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArraySize__Group__0__Impl"


    // $ANTLR start "rule__ArraySize__Group__1"
    // InternalDdParser.g:2543:1: rule__ArraySize__Group__1 : rule__ArraySize__Group__1__Impl rule__ArraySize__Group__2 ;
    public final void rule__ArraySize__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:2547:1: ( rule__ArraySize__Group__1__Impl rule__ArraySize__Group__2 )
            // InternalDdParser.g:2548:2: rule__ArraySize__Group__1__Impl rule__ArraySize__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__ArraySize__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ArraySize__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArraySize__Group__1"


    // $ANTLR start "rule__ArraySize__Group__1__Impl"
    // InternalDdParser.g:2555:1: rule__ArraySize__Group__1__Impl : ( ( rule__ArraySize__SizeAssignment_1 ) ) ;
    public final void rule__ArraySize__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:2559:1: ( ( ( rule__ArraySize__SizeAssignment_1 ) ) )
            // InternalDdParser.g:2560:1: ( ( rule__ArraySize__SizeAssignment_1 ) )
            {
            // InternalDdParser.g:2560:1: ( ( rule__ArraySize__SizeAssignment_1 ) )
            // InternalDdParser.g:2561:2: ( rule__ArraySize__SizeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArraySizeAccess().getSizeAssignment_1()); 
            }
            // InternalDdParser.g:2562:2: ( rule__ArraySize__SizeAssignment_1 )
            // InternalDdParser.g:2562:3: rule__ArraySize__SizeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ArraySize__SizeAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArraySizeAccess().getSizeAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArraySize__Group__1__Impl"


    // $ANTLR start "rule__ArraySize__Group__2"
    // InternalDdParser.g:2570:1: rule__ArraySize__Group__2 : rule__ArraySize__Group__2__Impl ;
    public final void rule__ArraySize__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:2574:1: ( rule__ArraySize__Group__2__Impl )
            // InternalDdParser.g:2575:2: rule__ArraySize__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArraySize__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArraySize__Group__2"


    // $ANTLR start "rule__ArraySize__Group__2__Impl"
    // InternalDdParser.g:2581:1: rule__ArraySize__Group__2__Impl : ( RightSquareBracket ) ;
    public final void rule__ArraySize__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:2585:1: ( ( RightSquareBracket ) )
            // InternalDdParser.g:2586:1: ( RightSquareBracket )
            {
            // InternalDdParser.g:2586:1: ( RightSquareBracket )
            // InternalDdParser.g:2587:2: RightSquareBracket
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArraySizeAccess().getRightSquareBracketKeyword_2()); 
            }
            match(input,RightSquareBracket,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArraySizeAccess().getRightSquareBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArraySize__Group__2__Impl"


    // $ANTLR start "rule__Relationship__Group__0"
    // InternalDdParser.g:2597:1: rule__Relationship__Group__0 : rule__Relationship__Group__0__Impl rule__Relationship__Group__1 ;
    public final void rule__Relationship__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:2601:1: ( rule__Relationship__Group__0__Impl rule__Relationship__Group__1 )
            // InternalDdParser.g:2602:2: rule__Relationship__Group__0__Impl rule__Relationship__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Relationship__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Relationship__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__0"


    // $ANTLR start "rule__Relationship__Group__0__Impl"
    // InternalDdParser.g:2609:1: rule__Relationship__Group__0__Impl : ( ( rule__Relationship__Cardi1Assignment_0 ) ) ;
    public final void rule__Relationship__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:2613:1: ( ( ( rule__Relationship__Cardi1Assignment_0 ) ) )
            // InternalDdParser.g:2614:1: ( ( rule__Relationship__Cardi1Assignment_0 ) )
            {
            // InternalDdParser.g:2614:1: ( ( rule__Relationship__Cardi1Assignment_0 ) )
            // InternalDdParser.g:2615:2: ( rule__Relationship__Cardi1Assignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getCardi1Assignment_0()); 
            }
            // InternalDdParser.g:2616:2: ( rule__Relationship__Cardi1Assignment_0 )
            // InternalDdParser.g:2616:3: rule__Relationship__Cardi1Assignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Relationship__Cardi1Assignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipAccess().getCardi1Assignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__0__Impl"


    // $ANTLR start "rule__Relationship__Group__1"
    // InternalDdParser.g:2624:1: rule__Relationship__Group__1 : rule__Relationship__Group__1__Impl rule__Relationship__Group__2 ;
    public final void rule__Relationship__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:2628:1: ( rule__Relationship__Group__1__Impl rule__Relationship__Group__2 )
            // InternalDdParser.g:2629:2: rule__Relationship__Group__1__Impl rule__Relationship__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__Relationship__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Relationship__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__1"


    // $ANTLR start "rule__Relationship__Group__1__Impl"
    // InternalDdParser.g:2636:1: rule__Relationship__Group__1__Impl : ( ( rule__Relationship__NameAssignment_1 ) ) ;
    public final void rule__Relationship__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:2640:1: ( ( ( rule__Relationship__NameAssignment_1 ) ) )
            // InternalDdParser.g:2641:1: ( ( rule__Relationship__NameAssignment_1 ) )
            {
            // InternalDdParser.g:2641:1: ( ( rule__Relationship__NameAssignment_1 ) )
            // InternalDdParser.g:2642:2: ( rule__Relationship__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getNameAssignment_1()); 
            }
            // InternalDdParser.g:2643:2: ( rule__Relationship__NameAssignment_1 )
            // InternalDdParser.g:2643:3: rule__Relationship__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Relationship__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__1__Impl"


    // $ANTLR start "rule__Relationship__Group__2"
    // InternalDdParser.g:2651:1: rule__Relationship__Group__2 : rule__Relationship__Group__2__Impl rule__Relationship__Group__3 ;
    public final void rule__Relationship__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:2655:1: ( rule__Relationship__Group__2__Impl rule__Relationship__Group__3 )
            // InternalDdParser.g:2656:2: rule__Relationship__Group__2__Impl rule__Relationship__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Relationship__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Relationship__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__2"


    // $ANTLR start "rule__Relationship__Group__2__Impl"
    // InternalDdParser.g:2663:1: rule__Relationship__Group__2__Impl : ( ( rule__Relationship__Cardi2Assignment_2 ) ) ;
    public final void rule__Relationship__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:2667:1: ( ( ( rule__Relationship__Cardi2Assignment_2 ) ) )
            // InternalDdParser.g:2668:1: ( ( rule__Relationship__Cardi2Assignment_2 ) )
            {
            // InternalDdParser.g:2668:1: ( ( rule__Relationship__Cardi2Assignment_2 ) )
            // InternalDdParser.g:2669:2: ( rule__Relationship__Cardi2Assignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getCardi2Assignment_2()); 
            }
            // InternalDdParser.g:2670:2: ( rule__Relationship__Cardi2Assignment_2 )
            // InternalDdParser.g:2670:3: rule__Relationship__Cardi2Assignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Relationship__Cardi2Assignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipAccess().getCardi2Assignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__2__Impl"


    // $ANTLR start "rule__Relationship__Group__3"
    // InternalDdParser.g:2678:1: rule__Relationship__Group__3 : rule__Relationship__Group__3__Impl rule__Relationship__Group__4 ;
    public final void rule__Relationship__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:2682:1: ( rule__Relationship__Group__3__Impl rule__Relationship__Group__4 )
            // InternalDdParser.g:2683:2: rule__Relationship__Group__3__Impl rule__Relationship__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__Relationship__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Relationship__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__3"


    // $ANTLR start "rule__Relationship__Group__3__Impl"
    // InternalDdParser.g:2690:1: rule__Relationship__Group__3__Impl : ( ( rule__Relationship__LinkToAssignment_3 ) ) ;
    public final void rule__Relationship__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:2694:1: ( ( ( rule__Relationship__LinkToAssignment_3 ) ) )
            // InternalDdParser.g:2695:1: ( ( rule__Relationship__LinkToAssignment_3 ) )
            {
            // InternalDdParser.g:2695:1: ( ( rule__Relationship__LinkToAssignment_3 ) )
            // InternalDdParser.g:2696:2: ( rule__Relationship__LinkToAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getLinkToAssignment_3()); 
            }
            // InternalDdParser.g:2697:2: ( rule__Relationship__LinkToAssignment_3 )
            // InternalDdParser.g:2697:3: rule__Relationship__LinkToAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Relationship__LinkToAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipAccess().getLinkToAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__3__Impl"


    // $ANTLR start "rule__Relationship__Group__4"
    // InternalDdParser.g:2705:1: rule__Relationship__Group__4 : rule__Relationship__Group__4__Impl rule__Relationship__Group__5 ;
    public final void rule__Relationship__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:2709:1: ( rule__Relationship__Group__4__Impl rule__Relationship__Group__5 )
            // InternalDdParser.g:2710:2: rule__Relationship__Group__4__Impl rule__Relationship__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__Relationship__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Relationship__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__4"


    // $ANTLR start "rule__Relationship__Group__4__Impl"
    // InternalDdParser.g:2717:1: rule__Relationship__Group__4__Impl : ( ( rule__Relationship__RelDescAssignment_4 ) ) ;
    public final void rule__Relationship__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:2721:1: ( ( ( rule__Relationship__RelDescAssignment_4 ) ) )
            // InternalDdParser.g:2722:1: ( ( rule__Relationship__RelDescAssignment_4 ) )
            {
            // InternalDdParser.g:2722:1: ( ( rule__Relationship__RelDescAssignment_4 ) )
            // InternalDdParser.g:2723:2: ( rule__Relationship__RelDescAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getRelDescAssignment_4()); 
            }
            // InternalDdParser.g:2724:2: ( rule__Relationship__RelDescAssignment_4 )
            // InternalDdParser.g:2724:3: rule__Relationship__RelDescAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Relationship__RelDescAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipAccess().getRelDescAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__4__Impl"


    // $ANTLR start "rule__Relationship__Group__5"
    // InternalDdParser.g:2732:1: rule__Relationship__Group__5 : rule__Relationship__Group__5__Impl ;
    public final void rule__Relationship__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:2736:1: ( rule__Relationship__Group__5__Impl )
            // InternalDdParser.g:2737:2: rule__Relationship__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Relationship__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__5"


    // $ANTLR start "rule__Relationship__Group__5__Impl"
    // InternalDdParser.g:2743:1: rule__Relationship__Group__5__Impl : ( RULE_EOL ) ;
    public final void rule__Relationship__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:2747:1: ( ( RULE_EOL ) )
            // InternalDdParser.g:2748:1: ( RULE_EOL )
            {
            // InternalDdParser.g:2748:1: ( RULE_EOL )
            // InternalDdParser.g:2749:2: RULE_EOL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getEOLTerminalRuleCall_5()); 
            }
            match(input,RULE_EOL,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipAccess().getEOLTerminalRuleCall_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__5__Impl"


    // $ANTLR start "rule__Constraint__Group__0"
    // InternalDdParser.g:2759:1: rule__Constraint__Group__0 : rule__Constraint__Group__0__Impl rule__Constraint__Group__1 ;
    public final void rule__Constraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:2763:1: ( rule__Constraint__Group__0__Impl rule__Constraint__Group__1 )
            // InternalDdParser.g:2764:2: rule__Constraint__Group__0__Impl rule__Constraint__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__Constraint__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Constraint__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__0"


    // $ANTLR start "rule__Constraint__Group__0__Impl"
    // InternalDdParser.g:2771:1: rule__Constraint__Group__0__Impl : ( ( ( rule__Constraint__ChkDescLinesAssignment_0 ) ) ( ( rule__Constraint__ChkDescLinesAssignment_0 )* ) ) ;
    public final void rule__Constraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:2775:1: ( ( ( ( rule__Constraint__ChkDescLinesAssignment_0 ) ) ( ( rule__Constraint__ChkDescLinesAssignment_0 )* ) ) )
            // InternalDdParser.g:2776:1: ( ( ( rule__Constraint__ChkDescLinesAssignment_0 ) ) ( ( rule__Constraint__ChkDescLinesAssignment_0 )* ) )
            {
            // InternalDdParser.g:2776:1: ( ( ( rule__Constraint__ChkDescLinesAssignment_0 ) ) ( ( rule__Constraint__ChkDescLinesAssignment_0 )* ) )
            // InternalDdParser.g:2777:2: ( ( rule__Constraint__ChkDescLinesAssignment_0 ) ) ( ( rule__Constraint__ChkDescLinesAssignment_0 )* )
            {
            // InternalDdParser.g:2777:2: ( ( rule__Constraint__ChkDescLinesAssignment_0 ) )
            // InternalDdParser.g:2778:3: ( rule__Constraint__ChkDescLinesAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintAccess().getChkDescLinesAssignment_0()); 
            }
            // InternalDdParser.g:2779:3: ( rule__Constraint__ChkDescLinesAssignment_0 )
            // InternalDdParser.g:2779:4: rule__Constraint__ChkDescLinesAssignment_0
            {
            pushFollow(FOLLOW_5);
            rule__Constraint__ChkDescLinesAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstraintAccess().getChkDescLinesAssignment_0()); 
            }

            }

            // InternalDdParser.g:2782:2: ( ( rule__Constraint__ChkDescLinesAssignment_0 )* )
            // InternalDdParser.g:2783:3: ( rule__Constraint__ChkDescLinesAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintAccess().getChkDescLinesAssignment_0()); 
            }
            // InternalDdParser.g:2784:3: ( rule__Constraint__ChkDescLinesAssignment_0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_CMT) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalDdParser.g:2784:4: rule__Constraint__ChkDescLinesAssignment_0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Constraint__ChkDescLinesAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstraintAccess().getChkDescLinesAssignment_0()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__0__Impl"


    // $ANTLR start "rule__Constraint__Group__1"
    // InternalDdParser.g:2793:1: rule__Constraint__Group__1 : rule__Constraint__Group__1__Impl rule__Constraint__Group__2 ;
    public final void rule__Constraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:2797:1: ( rule__Constraint__Group__1__Impl rule__Constraint__Group__2 )
            // InternalDdParser.g:2798:2: rule__Constraint__Group__1__Impl rule__Constraint__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__Constraint__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Constraint__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__1"


    // $ANTLR start "rule__Constraint__Group__1__Impl"
    // InternalDdParser.g:2805:1: rule__Constraint__Group__1__Impl : ( ( rule__Constraint__NameAssignment_1 ) ) ;
    public final void rule__Constraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:2809:1: ( ( ( rule__Constraint__NameAssignment_1 ) ) )
            // InternalDdParser.g:2810:1: ( ( rule__Constraint__NameAssignment_1 ) )
            {
            // InternalDdParser.g:2810:1: ( ( rule__Constraint__NameAssignment_1 ) )
            // InternalDdParser.g:2811:2: ( rule__Constraint__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintAccess().getNameAssignment_1()); 
            }
            // InternalDdParser.g:2812:2: ( rule__Constraint__NameAssignment_1 )
            // InternalDdParser.g:2812:3: rule__Constraint__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstraintAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__1__Impl"


    // $ANTLR start "rule__Constraint__Group__2"
    // InternalDdParser.g:2820:1: rule__Constraint__Group__2 : rule__Constraint__Group__2__Impl rule__Constraint__Group__3 ;
    public final void rule__Constraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:2824:1: ( rule__Constraint__Group__2__Impl rule__Constraint__Group__3 )
            // InternalDdParser.g:2825:2: rule__Constraint__Group__2__Impl rule__Constraint__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Constraint__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Constraint__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__2"


    // $ANTLR start "rule__Constraint__Group__2__Impl"
    // InternalDdParser.g:2832:1: rule__Constraint__Group__2__Impl : ( Colon ) ;
    public final void rule__Constraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:2836:1: ( ( Colon ) )
            // InternalDdParser.g:2837:1: ( Colon )
            {
            // InternalDdParser.g:2837:1: ( Colon )
            // InternalDdParser.g:2838:2: Colon
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintAccess().getColonKeyword_2()); 
            }
            match(input,Colon,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstraintAccess().getColonKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__2__Impl"


    // $ANTLR start "rule__Constraint__Group__3"
    // InternalDdParser.g:2847:1: rule__Constraint__Group__3 : rule__Constraint__Group__3__Impl rule__Constraint__Group__4 ;
    public final void rule__Constraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:2851:1: ( rule__Constraint__Group__3__Impl rule__Constraint__Group__4 )
            // InternalDdParser.g:2852:2: rule__Constraint__Group__3__Impl rule__Constraint__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__Constraint__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Constraint__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__3"


    // $ANTLR start "rule__Constraint__Group__3__Impl"
    // InternalDdParser.g:2859:1: rule__Constraint__Group__3__Impl : ( RULE_BEGIN ) ;
    public final void rule__Constraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:2863:1: ( ( RULE_BEGIN ) )
            // InternalDdParser.g:2864:1: ( RULE_BEGIN )
            {
            // InternalDdParser.g:2864:1: ( RULE_BEGIN )
            // InternalDdParser.g:2865:2: RULE_BEGIN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintAccess().getBEGINTerminalRuleCall_3()); 
            }
            match(input,RULE_BEGIN,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstraintAccess().getBEGINTerminalRuleCall_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__3__Impl"


    // $ANTLR start "rule__Constraint__Group__4"
    // InternalDdParser.g:2874:1: rule__Constraint__Group__4 : rule__Constraint__Group__4__Impl rule__Constraint__Group__5 ;
    public final void rule__Constraint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:2878:1: ( rule__Constraint__Group__4__Impl rule__Constraint__Group__5 )
            // InternalDdParser.g:2879:2: rule__Constraint__Group__4__Impl rule__Constraint__Group__5
            {
            pushFollow(FOLLOW_25);
            rule__Constraint__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Constraint__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__4"


    // $ANTLR start "rule__Constraint__Group__4__Impl"
    // InternalDdParser.g:2886:1: rule__Constraint__Group__4__Impl : ( ( ( rule__Constraint__CheckAssignment_4 ) ) ( ( rule__Constraint__CheckAssignment_4 )* ) ) ;
    public final void rule__Constraint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:2890:1: ( ( ( ( rule__Constraint__CheckAssignment_4 ) ) ( ( rule__Constraint__CheckAssignment_4 )* ) ) )
            // InternalDdParser.g:2891:1: ( ( ( rule__Constraint__CheckAssignment_4 ) ) ( ( rule__Constraint__CheckAssignment_4 )* ) )
            {
            // InternalDdParser.g:2891:1: ( ( ( rule__Constraint__CheckAssignment_4 ) ) ( ( rule__Constraint__CheckAssignment_4 )* ) )
            // InternalDdParser.g:2892:2: ( ( rule__Constraint__CheckAssignment_4 ) ) ( ( rule__Constraint__CheckAssignment_4 )* )
            {
            // InternalDdParser.g:2892:2: ( ( rule__Constraint__CheckAssignment_4 ) )
            // InternalDdParser.g:2893:3: ( rule__Constraint__CheckAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintAccess().getCheckAssignment_4()); 
            }
            // InternalDdParser.g:2894:3: ( rule__Constraint__CheckAssignment_4 )
            // InternalDdParser.g:2894:4: rule__Constraint__CheckAssignment_4
            {
            pushFollow(FOLLOW_5);
            rule__Constraint__CheckAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstraintAccess().getCheckAssignment_4()); 
            }

            }

            // InternalDdParser.g:2897:2: ( ( rule__Constraint__CheckAssignment_4 )* )
            // InternalDdParser.g:2898:3: ( rule__Constraint__CheckAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintAccess().getCheckAssignment_4()); 
            }
            // InternalDdParser.g:2899:3: ( rule__Constraint__CheckAssignment_4 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_CMT) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalDdParser.g:2899:4: rule__Constraint__CheckAssignment_4
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Constraint__CheckAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstraintAccess().getCheckAssignment_4()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__4__Impl"


    // $ANTLR start "rule__Constraint__Group__5"
    // InternalDdParser.g:2908:1: rule__Constraint__Group__5 : rule__Constraint__Group__5__Impl ;
    public final void rule__Constraint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:2912:1: ( rule__Constraint__Group__5__Impl )
            // InternalDdParser.g:2913:2: rule__Constraint__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__5"


    // $ANTLR start "rule__Constraint__Group__5__Impl"
    // InternalDdParser.g:2919:1: rule__Constraint__Group__5__Impl : ( RULE_END ) ;
    public final void rule__Constraint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:2923:1: ( ( RULE_END ) )
            // InternalDdParser.g:2924:1: ( RULE_END )
            {
            // InternalDdParser.g:2924:1: ( RULE_END )
            // InternalDdParser.g:2925:2: RULE_END
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintAccess().getENDTerminalRuleCall_5()); 
            }
            match(input,RULE_END,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstraintAccess().getENDTerminalRuleCall_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__5__Impl"


    // $ANTLR start "rule__CheckExpression__Group__0"
    // InternalDdParser.g:2935:1: rule__CheckExpression__Group__0 : rule__CheckExpression__Group__0__Impl rule__CheckExpression__Group__1 ;
    public final void rule__CheckExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:2939:1: ( rule__CheckExpression__Group__0__Impl rule__CheckExpression__Group__1 )
            // InternalDdParser.g:2940:2: rule__CheckExpression__Group__0__Impl rule__CheckExpression__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__CheckExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CheckExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckExpression__Group__0"


    // $ANTLR start "rule__CheckExpression__Group__0__Impl"
    // InternalDdParser.g:2947:1: rule__CheckExpression__Group__0__Impl : ( ( ( rule__CheckExpression__ChkDescAssignment_0 ) ) ( ( rule__CheckExpression__ChkDescAssignment_0 )* ) ) ;
    public final void rule__CheckExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:2951:1: ( ( ( ( rule__CheckExpression__ChkDescAssignment_0 ) ) ( ( rule__CheckExpression__ChkDescAssignment_0 )* ) ) )
            // InternalDdParser.g:2952:1: ( ( ( rule__CheckExpression__ChkDescAssignment_0 ) ) ( ( rule__CheckExpression__ChkDescAssignment_0 )* ) )
            {
            // InternalDdParser.g:2952:1: ( ( ( rule__CheckExpression__ChkDescAssignment_0 ) ) ( ( rule__CheckExpression__ChkDescAssignment_0 )* ) )
            // InternalDdParser.g:2953:2: ( ( rule__CheckExpression__ChkDescAssignment_0 ) ) ( ( rule__CheckExpression__ChkDescAssignment_0 )* )
            {
            // InternalDdParser.g:2953:2: ( ( rule__CheckExpression__ChkDescAssignment_0 ) )
            // InternalDdParser.g:2954:3: ( rule__CheckExpression__ChkDescAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCheckExpressionAccess().getChkDescAssignment_0()); 
            }
            // InternalDdParser.g:2955:3: ( rule__CheckExpression__ChkDescAssignment_0 )
            // InternalDdParser.g:2955:4: rule__CheckExpression__ChkDescAssignment_0
            {
            pushFollow(FOLLOW_5);
            rule__CheckExpression__ChkDescAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCheckExpressionAccess().getChkDescAssignment_0()); 
            }

            }

            // InternalDdParser.g:2958:2: ( ( rule__CheckExpression__ChkDescAssignment_0 )* )
            // InternalDdParser.g:2959:3: ( rule__CheckExpression__ChkDescAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCheckExpressionAccess().getChkDescAssignment_0()); 
            }
            // InternalDdParser.g:2960:3: ( rule__CheckExpression__ChkDescAssignment_0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_CMT) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalDdParser.g:2960:4: rule__CheckExpression__ChkDescAssignment_0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__CheckExpression__ChkDescAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCheckExpressionAccess().getChkDescAssignment_0()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckExpression__Group__0__Impl"


    // $ANTLR start "rule__CheckExpression__Group__1"
    // InternalDdParser.g:2969:1: rule__CheckExpression__Group__1 : rule__CheckExpression__Group__1__Impl rule__CheckExpression__Group__2 ;
    public final void rule__CheckExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:2973:1: ( rule__CheckExpression__Group__1__Impl rule__CheckExpression__Group__2 )
            // InternalDdParser.g:2974:2: rule__CheckExpression__Group__1__Impl rule__CheckExpression__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__CheckExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CheckExpression__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckExpression__Group__1"


    // $ANTLR start "rule__CheckExpression__Group__1__Impl"
    // InternalDdParser.g:2981:1: rule__CheckExpression__Group__1__Impl : ( ( rule__CheckExpression__NameAssignment_1 ) ) ;
    public final void rule__CheckExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:2985:1: ( ( ( rule__CheckExpression__NameAssignment_1 ) ) )
            // InternalDdParser.g:2986:1: ( ( rule__CheckExpression__NameAssignment_1 ) )
            {
            // InternalDdParser.g:2986:1: ( ( rule__CheckExpression__NameAssignment_1 ) )
            // InternalDdParser.g:2987:2: ( rule__CheckExpression__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCheckExpressionAccess().getNameAssignment_1()); 
            }
            // InternalDdParser.g:2988:2: ( rule__CheckExpression__NameAssignment_1 )
            // InternalDdParser.g:2988:3: rule__CheckExpression__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CheckExpression__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCheckExpressionAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckExpression__Group__1__Impl"


    // $ANTLR start "rule__CheckExpression__Group__2"
    // InternalDdParser.g:2996:1: rule__CheckExpression__Group__2 : rule__CheckExpression__Group__2__Impl rule__CheckExpression__Group__3 ;
    public final void rule__CheckExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:3000:1: ( rule__CheckExpression__Group__2__Impl rule__CheckExpression__Group__3 )
            // InternalDdParser.g:3001:2: rule__CheckExpression__Group__2__Impl rule__CheckExpression__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__CheckExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CheckExpression__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckExpression__Group__2"


    // $ANTLR start "rule__CheckExpression__Group__2__Impl"
    // InternalDdParser.g:3008:1: rule__CheckExpression__Group__2__Impl : ( ( rule__CheckExpression__ExprAssignment_2 ) ) ;
    public final void rule__CheckExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:3012:1: ( ( ( rule__CheckExpression__ExprAssignment_2 ) ) )
            // InternalDdParser.g:3013:1: ( ( rule__CheckExpression__ExprAssignment_2 ) )
            {
            // InternalDdParser.g:3013:1: ( ( rule__CheckExpression__ExprAssignment_2 ) )
            // InternalDdParser.g:3014:2: ( rule__CheckExpression__ExprAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCheckExpressionAccess().getExprAssignment_2()); 
            }
            // InternalDdParser.g:3015:2: ( rule__CheckExpression__ExprAssignment_2 )
            // InternalDdParser.g:3015:3: rule__CheckExpression__ExprAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__CheckExpression__ExprAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCheckExpressionAccess().getExprAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckExpression__Group__2__Impl"


    // $ANTLR start "rule__CheckExpression__Group__3"
    // InternalDdParser.g:3023:1: rule__CheckExpression__Group__3 : rule__CheckExpression__Group__3__Impl ;
    public final void rule__CheckExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:3027:1: ( rule__CheckExpression__Group__3__Impl )
            // InternalDdParser.g:3028:2: rule__CheckExpression__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CheckExpression__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckExpression__Group__3"


    // $ANTLR start "rule__CheckExpression__Group__3__Impl"
    // InternalDdParser.g:3034:1: rule__CheckExpression__Group__3__Impl : ( RULE_EOL ) ;
    public final void rule__CheckExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:3038:1: ( ( RULE_EOL ) )
            // InternalDdParser.g:3039:1: ( RULE_EOL )
            {
            // InternalDdParser.g:3039:1: ( RULE_EOL )
            // InternalDdParser.g:3040:2: RULE_EOL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCheckExpressionAccess().getEOLTerminalRuleCall_3()); 
            }
            match(input,RULE_EOL,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCheckExpressionAccess().getEOLTerminalRuleCall_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckExpression__Group__3__Impl"


    // $ANTLR start "rule__BinaryExpression__Group__0"
    // InternalDdParser.g:3050:1: rule__BinaryExpression__Group__0 : rule__BinaryExpression__Group__0__Impl rule__BinaryExpression__Group__1 ;
    public final void rule__BinaryExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:3054:1: ( rule__BinaryExpression__Group__0__Impl rule__BinaryExpression__Group__1 )
            // InternalDdParser.g:3055:2: rule__BinaryExpression__Group__0__Impl rule__BinaryExpression__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__BinaryExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BinaryExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__Group__0"


    // $ANTLR start "rule__BinaryExpression__Group__0__Impl"
    // InternalDdParser.g:3062:1: rule__BinaryExpression__Group__0__Impl : ( LeftParenthesis ) ;
    public final void rule__BinaryExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:3066:1: ( ( LeftParenthesis ) )
            // InternalDdParser.g:3067:1: ( LeftParenthesis )
            {
            // InternalDdParser.g:3067:1: ( LeftParenthesis )
            // InternalDdParser.g:3068:2: LeftParenthesis
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryExpressionAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,LeftParenthesis,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryExpressionAccess().getLeftParenthesisKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__Group__0__Impl"


    // $ANTLR start "rule__BinaryExpression__Group__1"
    // InternalDdParser.g:3077:1: rule__BinaryExpression__Group__1 : rule__BinaryExpression__Group__1__Impl rule__BinaryExpression__Group__2 ;
    public final void rule__BinaryExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:3081:1: ( rule__BinaryExpression__Group__1__Impl rule__BinaryExpression__Group__2 )
            // InternalDdParser.g:3082:2: rule__BinaryExpression__Group__1__Impl rule__BinaryExpression__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__BinaryExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BinaryExpression__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__Group__1"


    // $ANTLR start "rule__BinaryExpression__Group__1__Impl"
    // InternalDdParser.g:3089:1: rule__BinaryExpression__Group__1__Impl : ( ( rule__BinaryExpression__LeftAssignment_1 ) ) ;
    public final void rule__BinaryExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:3093:1: ( ( ( rule__BinaryExpression__LeftAssignment_1 ) ) )
            // InternalDdParser.g:3094:1: ( ( rule__BinaryExpression__LeftAssignment_1 ) )
            {
            // InternalDdParser.g:3094:1: ( ( rule__BinaryExpression__LeftAssignment_1 ) )
            // InternalDdParser.g:3095:2: ( rule__BinaryExpression__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryExpressionAccess().getLeftAssignment_1()); 
            }
            // InternalDdParser.g:3096:2: ( rule__BinaryExpression__LeftAssignment_1 )
            // InternalDdParser.g:3096:3: rule__BinaryExpression__LeftAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__BinaryExpression__LeftAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryExpressionAccess().getLeftAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__Group__1__Impl"


    // $ANTLR start "rule__BinaryExpression__Group__2"
    // InternalDdParser.g:3104:1: rule__BinaryExpression__Group__2 : rule__BinaryExpression__Group__2__Impl rule__BinaryExpression__Group__3 ;
    public final void rule__BinaryExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:3108:1: ( rule__BinaryExpression__Group__2__Impl rule__BinaryExpression__Group__3 )
            // InternalDdParser.g:3109:2: rule__BinaryExpression__Group__2__Impl rule__BinaryExpression__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__BinaryExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BinaryExpression__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__Group__2"


    // $ANTLR start "rule__BinaryExpression__Group__2__Impl"
    // InternalDdParser.g:3116:1: rule__BinaryExpression__Group__2__Impl : ( ( rule__BinaryExpression__OpAssignment_2 ) ) ;
    public final void rule__BinaryExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:3120:1: ( ( ( rule__BinaryExpression__OpAssignment_2 ) ) )
            // InternalDdParser.g:3121:1: ( ( rule__BinaryExpression__OpAssignment_2 ) )
            {
            // InternalDdParser.g:3121:1: ( ( rule__BinaryExpression__OpAssignment_2 ) )
            // InternalDdParser.g:3122:2: ( rule__BinaryExpression__OpAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryExpressionAccess().getOpAssignment_2()); 
            }
            // InternalDdParser.g:3123:2: ( rule__BinaryExpression__OpAssignment_2 )
            // InternalDdParser.g:3123:3: rule__BinaryExpression__OpAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__BinaryExpression__OpAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryExpressionAccess().getOpAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__Group__2__Impl"


    // $ANTLR start "rule__BinaryExpression__Group__3"
    // InternalDdParser.g:3131:1: rule__BinaryExpression__Group__3 : rule__BinaryExpression__Group__3__Impl rule__BinaryExpression__Group__4 ;
    public final void rule__BinaryExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:3135:1: ( rule__BinaryExpression__Group__3__Impl rule__BinaryExpression__Group__4 )
            // InternalDdParser.g:3136:2: rule__BinaryExpression__Group__3__Impl rule__BinaryExpression__Group__4
            {
            pushFollow(FOLLOW_27);
            rule__BinaryExpression__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BinaryExpression__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__Group__3"


    // $ANTLR start "rule__BinaryExpression__Group__3__Impl"
    // InternalDdParser.g:3143:1: rule__BinaryExpression__Group__3__Impl : ( ( rule__BinaryExpression__RightAssignment_3 ) ) ;
    public final void rule__BinaryExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:3147:1: ( ( ( rule__BinaryExpression__RightAssignment_3 ) ) )
            // InternalDdParser.g:3148:1: ( ( rule__BinaryExpression__RightAssignment_3 ) )
            {
            // InternalDdParser.g:3148:1: ( ( rule__BinaryExpression__RightAssignment_3 ) )
            // InternalDdParser.g:3149:2: ( rule__BinaryExpression__RightAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryExpressionAccess().getRightAssignment_3()); 
            }
            // InternalDdParser.g:3150:2: ( rule__BinaryExpression__RightAssignment_3 )
            // InternalDdParser.g:3150:3: rule__BinaryExpression__RightAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__BinaryExpression__RightAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryExpressionAccess().getRightAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__Group__3__Impl"


    // $ANTLR start "rule__BinaryExpression__Group__4"
    // InternalDdParser.g:3158:1: rule__BinaryExpression__Group__4 : rule__BinaryExpression__Group__4__Impl rule__BinaryExpression__Group__5 ;
    public final void rule__BinaryExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:3162:1: ( rule__BinaryExpression__Group__4__Impl rule__BinaryExpression__Group__5 )
            // InternalDdParser.g:3163:2: rule__BinaryExpression__Group__4__Impl rule__BinaryExpression__Group__5
            {
            pushFollow(FOLLOW_28);
            rule__BinaryExpression__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BinaryExpression__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__Group__4"


    // $ANTLR start "rule__BinaryExpression__Group__4__Impl"
    // InternalDdParser.g:3170:1: rule__BinaryExpression__Group__4__Impl : ( RightParenthesis ) ;
    public final void rule__BinaryExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:3174:1: ( ( RightParenthesis ) )
            // InternalDdParser.g:3175:1: ( RightParenthesis )
            {
            // InternalDdParser.g:3175:1: ( RightParenthesis )
            // InternalDdParser.g:3176:2: RightParenthesis
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryExpressionAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,RightParenthesis,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryExpressionAccess().getRightParenthesisKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__Group__4__Impl"


    // $ANTLR start "rule__BinaryExpression__Group__5"
    // InternalDdParser.g:3185:1: rule__BinaryExpression__Group__5 : rule__BinaryExpression__Group__5__Impl ;
    public final void rule__BinaryExpression__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:3189:1: ( rule__BinaryExpression__Group__5__Impl )
            // InternalDdParser.g:3190:2: rule__BinaryExpression__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BinaryExpression__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__Group__5"


    // $ANTLR start "rule__BinaryExpression__Group__5__Impl"
    // InternalDdParser.g:3196:1: rule__BinaryExpression__Group__5__Impl : ( ( rule__BinaryExpression__Group_5__0 )? ) ;
    public final void rule__BinaryExpression__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:3200:1: ( ( ( rule__BinaryExpression__Group_5__0 )? ) )
            // InternalDdParser.g:3201:1: ( ( rule__BinaryExpression__Group_5__0 )? )
            {
            // InternalDdParser.g:3201:1: ( ( rule__BinaryExpression__Group_5__0 )? )
            // InternalDdParser.g:3202:2: ( rule__BinaryExpression__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryExpressionAccess().getGroup_5()); 
            }
            // InternalDdParser.g:3203:2: ( rule__BinaryExpression__Group_5__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_NULL) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalDdParser.g:3203:3: rule__BinaryExpression__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BinaryExpression__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryExpressionAccess().getGroup_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__Group__5__Impl"


    // $ANTLR start "rule__BinaryExpression__Group_5__0"
    // InternalDdParser.g:3212:1: rule__BinaryExpression__Group_5__0 : rule__BinaryExpression__Group_5__0__Impl rule__BinaryExpression__Group_5__1 ;
    public final void rule__BinaryExpression__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:3216:1: ( rule__BinaryExpression__Group_5__0__Impl rule__BinaryExpression__Group_5__1 )
            // InternalDdParser.g:3217:2: rule__BinaryExpression__Group_5__0__Impl rule__BinaryExpression__Group_5__1
            {
            pushFollow(FOLLOW_28);
            rule__BinaryExpression__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BinaryExpression__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__Group_5__0"


    // $ANTLR start "rule__BinaryExpression__Group_5__0__Impl"
    // InternalDdParser.g:3224:1: rule__BinaryExpression__Group_5__0__Impl : ( ( rule__BinaryExpression__NumTypeAssignment_5_0 ) ) ;
    public final void rule__BinaryExpression__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:3228:1: ( ( ( rule__BinaryExpression__NumTypeAssignment_5_0 ) ) )
            // InternalDdParser.g:3229:1: ( ( rule__BinaryExpression__NumTypeAssignment_5_0 ) )
            {
            // InternalDdParser.g:3229:1: ( ( rule__BinaryExpression__NumTypeAssignment_5_0 ) )
            // InternalDdParser.g:3230:2: ( rule__BinaryExpression__NumTypeAssignment_5_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryExpressionAccess().getNumTypeAssignment_5_0()); 
            }
            // InternalDdParser.g:3231:2: ( rule__BinaryExpression__NumTypeAssignment_5_0 )
            // InternalDdParser.g:3231:3: rule__BinaryExpression__NumTypeAssignment_5_0
            {
            pushFollow(FOLLOW_2);
            rule__BinaryExpression__NumTypeAssignment_5_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryExpressionAccess().getNumTypeAssignment_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__Group_5__0__Impl"


    // $ANTLR start "rule__BinaryExpression__Group_5__1"
    // InternalDdParser.g:3239:1: rule__BinaryExpression__Group_5__1 : rule__BinaryExpression__Group_5__1__Impl rule__BinaryExpression__Group_5__2 ;
    public final void rule__BinaryExpression__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:3243:1: ( rule__BinaryExpression__Group_5__1__Impl rule__BinaryExpression__Group_5__2 )
            // InternalDdParser.g:3244:2: rule__BinaryExpression__Group_5__1__Impl rule__BinaryExpression__Group_5__2
            {
            pushFollow(FOLLOW_28);
            rule__BinaryExpression__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BinaryExpression__Group_5__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__Group_5__1"


    // $ANTLR start "rule__BinaryExpression__Group_5__1__Impl"
    // InternalDdParser.g:3251:1: rule__BinaryExpression__Group_5__1__Impl : ( ( rule__BinaryExpression__StrTypeAssignment_5_1 ) ) ;
    public final void rule__BinaryExpression__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:3255:1: ( ( ( rule__BinaryExpression__StrTypeAssignment_5_1 ) ) )
            // InternalDdParser.g:3256:1: ( ( rule__BinaryExpression__StrTypeAssignment_5_1 ) )
            {
            // InternalDdParser.g:3256:1: ( ( rule__BinaryExpression__StrTypeAssignment_5_1 ) )
            // InternalDdParser.g:3257:2: ( rule__BinaryExpression__StrTypeAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryExpressionAccess().getStrTypeAssignment_5_1()); 
            }
            // InternalDdParser.g:3258:2: ( rule__BinaryExpression__StrTypeAssignment_5_1 )
            // InternalDdParser.g:3258:3: rule__BinaryExpression__StrTypeAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__BinaryExpression__StrTypeAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryExpressionAccess().getStrTypeAssignment_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__Group_5__1__Impl"


    // $ANTLR start "rule__BinaryExpression__Group_5__2"
    // InternalDdParser.g:3266:1: rule__BinaryExpression__Group_5__2 : rule__BinaryExpression__Group_5__2__Impl rule__BinaryExpression__Group_5__3 ;
    public final void rule__BinaryExpression__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:3270:1: ( rule__BinaryExpression__Group_5__2__Impl rule__BinaryExpression__Group_5__3 )
            // InternalDdParser.g:3271:2: rule__BinaryExpression__Group_5__2__Impl rule__BinaryExpression__Group_5__3
            {
            pushFollow(FOLLOW_28);
            rule__BinaryExpression__Group_5__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BinaryExpression__Group_5__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__Group_5__2"


    // $ANTLR start "rule__BinaryExpression__Group_5__2__Impl"
    // InternalDdParser.g:3278:1: rule__BinaryExpression__Group_5__2__Impl : ( ( rule__BinaryExpression__DateTypeAssignment_5_2 ) ) ;
    public final void rule__BinaryExpression__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:3282:1: ( ( ( rule__BinaryExpression__DateTypeAssignment_5_2 ) ) )
            // InternalDdParser.g:3283:1: ( ( rule__BinaryExpression__DateTypeAssignment_5_2 ) )
            {
            // InternalDdParser.g:3283:1: ( ( rule__BinaryExpression__DateTypeAssignment_5_2 ) )
            // InternalDdParser.g:3284:2: ( rule__BinaryExpression__DateTypeAssignment_5_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryExpressionAccess().getDateTypeAssignment_5_2()); 
            }
            // InternalDdParser.g:3285:2: ( rule__BinaryExpression__DateTypeAssignment_5_2 )
            // InternalDdParser.g:3285:3: rule__BinaryExpression__DateTypeAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__BinaryExpression__DateTypeAssignment_5_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryExpressionAccess().getDateTypeAssignment_5_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__Group_5__2__Impl"


    // $ANTLR start "rule__BinaryExpression__Group_5__3"
    // InternalDdParser.g:3293:1: rule__BinaryExpression__Group_5__3 : rule__BinaryExpression__Group_5__3__Impl ;
    public final void rule__BinaryExpression__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:3297:1: ( rule__BinaryExpression__Group_5__3__Impl )
            // InternalDdParser.g:3298:2: rule__BinaryExpression__Group_5__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BinaryExpression__Group_5__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__Group_5__3"


    // $ANTLR start "rule__BinaryExpression__Group_5__3__Impl"
    // InternalDdParser.g:3304:1: rule__BinaryExpression__Group_5__3__Impl : ( ( rule__BinaryExpression__BoolTypeAssignment_5_3 ) ) ;
    public final void rule__BinaryExpression__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:3308:1: ( ( ( rule__BinaryExpression__BoolTypeAssignment_5_3 ) ) )
            // InternalDdParser.g:3309:1: ( ( rule__BinaryExpression__BoolTypeAssignment_5_3 ) )
            {
            // InternalDdParser.g:3309:1: ( ( rule__BinaryExpression__BoolTypeAssignment_5_3 ) )
            // InternalDdParser.g:3310:2: ( rule__BinaryExpression__BoolTypeAssignment_5_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryExpressionAccess().getBoolTypeAssignment_5_3()); 
            }
            // InternalDdParser.g:3311:2: ( rule__BinaryExpression__BoolTypeAssignment_5_3 )
            // InternalDdParser.g:3311:3: rule__BinaryExpression__BoolTypeAssignment_5_3
            {
            pushFollow(FOLLOW_2);
            rule__BinaryExpression__BoolTypeAssignment_5_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryExpressionAccess().getBoolTypeAssignment_5_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__Group_5__3__Impl"


    // $ANTLR start "rule__UnaryExpression__Group__0"
    // InternalDdParser.g:3320:1: rule__UnaryExpression__Group__0 : rule__UnaryExpression__Group__0__Impl rule__UnaryExpression__Group__1 ;
    public final void rule__UnaryExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:3324:1: ( rule__UnaryExpression__Group__0__Impl rule__UnaryExpression__Group__1 )
            // InternalDdParser.g:3325:2: rule__UnaryExpression__Group__0__Impl rule__UnaryExpression__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__UnaryExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__UnaryExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group__0"


    // $ANTLR start "rule__UnaryExpression__Group__0__Impl"
    // InternalDdParser.g:3332:1: rule__UnaryExpression__Group__0__Impl : ( ( rule__UnaryExpression__OpAssignment_0 ) ) ;
    public final void rule__UnaryExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:3336:1: ( ( ( rule__UnaryExpression__OpAssignment_0 ) ) )
            // InternalDdParser.g:3337:1: ( ( rule__UnaryExpression__OpAssignment_0 ) )
            {
            // InternalDdParser.g:3337:1: ( ( rule__UnaryExpression__OpAssignment_0 ) )
            // InternalDdParser.g:3338:2: ( rule__UnaryExpression__OpAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getOpAssignment_0()); 
            }
            // InternalDdParser.g:3339:2: ( rule__UnaryExpression__OpAssignment_0 )
            // InternalDdParser.g:3339:3: rule__UnaryExpression__OpAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__UnaryExpression__OpAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExpressionAccess().getOpAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group__0__Impl"


    // $ANTLR start "rule__UnaryExpression__Group__1"
    // InternalDdParser.g:3347:1: rule__UnaryExpression__Group__1 : rule__UnaryExpression__Group__1__Impl rule__UnaryExpression__Group__2 ;
    public final void rule__UnaryExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:3351:1: ( rule__UnaryExpression__Group__1__Impl rule__UnaryExpression__Group__2 )
            // InternalDdParser.g:3352:2: rule__UnaryExpression__Group__1__Impl rule__UnaryExpression__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__UnaryExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__UnaryExpression__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group__1"


    // $ANTLR start "rule__UnaryExpression__Group__1__Impl"
    // InternalDdParser.g:3359:1: rule__UnaryExpression__Group__1__Impl : ( LeftParenthesis ) ;
    public final void rule__UnaryExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:3363:1: ( ( LeftParenthesis ) )
            // InternalDdParser.g:3364:1: ( LeftParenthesis )
            {
            // InternalDdParser.g:3364:1: ( LeftParenthesis )
            // InternalDdParser.g:3365:2: LeftParenthesis
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,LeftParenthesis,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExpressionAccess().getLeftParenthesisKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group__1__Impl"


    // $ANTLR start "rule__UnaryExpression__Group__2"
    // InternalDdParser.g:3374:1: rule__UnaryExpression__Group__2 : rule__UnaryExpression__Group__2__Impl rule__UnaryExpression__Group__3 ;
    public final void rule__UnaryExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:3378:1: ( rule__UnaryExpression__Group__2__Impl rule__UnaryExpression__Group__3 )
            // InternalDdParser.g:3379:2: rule__UnaryExpression__Group__2__Impl rule__UnaryExpression__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__UnaryExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__UnaryExpression__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group__2"


    // $ANTLR start "rule__UnaryExpression__Group__2__Impl"
    // InternalDdParser.g:3386:1: rule__UnaryExpression__Group__2__Impl : ( ( rule__UnaryExpression__LeftAssignment_2 ) ) ;
    public final void rule__UnaryExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:3390:1: ( ( ( rule__UnaryExpression__LeftAssignment_2 ) ) )
            // InternalDdParser.g:3391:1: ( ( rule__UnaryExpression__LeftAssignment_2 ) )
            {
            // InternalDdParser.g:3391:1: ( ( rule__UnaryExpression__LeftAssignment_2 ) )
            // InternalDdParser.g:3392:2: ( rule__UnaryExpression__LeftAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getLeftAssignment_2()); 
            }
            // InternalDdParser.g:3393:2: ( rule__UnaryExpression__LeftAssignment_2 )
            // InternalDdParser.g:3393:3: rule__UnaryExpression__LeftAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__UnaryExpression__LeftAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExpressionAccess().getLeftAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group__2__Impl"


    // $ANTLR start "rule__UnaryExpression__Group__3"
    // InternalDdParser.g:3401:1: rule__UnaryExpression__Group__3 : rule__UnaryExpression__Group__3__Impl rule__UnaryExpression__Group__4 ;
    public final void rule__UnaryExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:3405:1: ( rule__UnaryExpression__Group__3__Impl rule__UnaryExpression__Group__4 )
            // InternalDdParser.g:3406:2: rule__UnaryExpression__Group__3__Impl rule__UnaryExpression__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__UnaryExpression__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__UnaryExpression__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group__3"


    // $ANTLR start "rule__UnaryExpression__Group__3__Impl"
    // InternalDdParser.g:3413:1: rule__UnaryExpression__Group__3__Impl : ( RightParenthesis ) ;
    public final void rule__UnaryExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:3417:1: ( ( RightParenthesis ) )
            // InternalDdParser.g:3418:1: ( RightParenthesis )
            {
            // InternalDdParser.g:3418:1: ( RightParenthesis )
            // InternalDdParser.g:3419:2: RightParenthesis
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,RightParenthesis,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExpressionAccess().getRightParenthesisKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group__3__Impl"


    // $ANTLR start "rule__UnaryExpression__Group__4"
    // InternalDdParser.g:3428:1: rule__UnaryExpression__Group__4 : rule__UnaryExpression__Group__4__Impl ;
    public final void rule__UnaryExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:3432:1: ( rule__UnaryExpression__Group__4__Impl )
            // InternalDdParser.g:3433:2: rule__UnaryExpression__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnaryExpression__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group__4"


    // $ANTLR start "rule__UnaryExpression__Group__4__Impl"
    // InternalDdParser.g:3439:1: rule__UnaryExpression__Group__4__Impl : ( ( rule__UnaryExpression__Group_4__0 )? ) ;
    public final void rule__UnaryExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:3443:1: ( ( ( rule__UnaryExpression__Group_4__0 )? ) )
            // InternalDdParser.g:3444:1: ( ( rule__UnaryExpression__Group_4__0 )? )
            {
            // InternalDdParser.g:3444:1: ( ( rule__UnaryExpression__Group_4__0 )? )
            // InternalDdParser.g:3445:2: ( rule__UnaryExpression__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getGroup_4()); 
            }
            // InternalDdParser.g:3446:2: ( rule__UnaryExpression__Group_4__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_NULL) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalDdParser.g:3446:3: rule__UnaryExpression__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UnaryExpression__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExpressionAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group__4__Impl"


    // $ANTLR start "rule__UnaryExpression__Group_4__0"
    // InternalDdParser.g:3455:1: rule__UnaryExpression__Group_4__0 : rule__UnaryExpression__Group_4__0__Impl rule__UnaryExpression__Group_4__1 ;
    public final void rule__UnaryExpression__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:3459:1: ( rule__UnaryExpression__Group_4__0__Impl rule__UnaryExpression__Group_4__1 )
            // InternalDdParser.g:3460:2: rule__UnaryExpression__Group_4__0__Impl rule__UnaryExpression__Group_4__1
            {
            pushFollow(FOLLOW_28);
            rule__UnaryExpression__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__UnaryExpression__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group_4__0"


    // $ANTLR start "rule__UnaryExpression__Group_4__0__Impl"
    // InternalDdParser.g:3467:1: rule__UnaryExpression__Group_4__0__Impl : ( ( rule__UnaryExpression__NumTypeAssignment_4_0 ) ) ;
    public final void rule__UnaryExpression__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:3471:1: ( ( ( rule__UnaryExpression__NumTypeAssignment_4_0 ) ) )
            // InternalDdParser.g:3472:1: ( ( rule__UnaryExpression__NumTypeAssignment_4_0 ) )
            {
            // InternalDdParser.g:3472:1: ( ( rule__UnaryExpression__NumTypeAssignment_4_0 ) )
            // InternalDdParser.g:3473:2: ( rule__UnaryExpression__NumTypeAssignment_4_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getNumTypeAssignment_4_0()); 
            }
            // InternalDdParser.g:3474:2: ( rule__UnaryExpression__NumTypeAssignment_4_0 )
            // InternalDdParser.g:3474:3: rule__UnaryExpression__NumTypeAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__UnaryExpression__NumTypeAssignment_4_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExpressionAccess().getNumTypeAssignment_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group_4__0__Impl"


    // $ANTLR start "rule__UnaryExpression__Group_4__1"
    // InternalDdParser.g:3482:1: rule__UnaryExpression__Group_4__1 : rule__UnaryExpression__Group_4__1__Impl rule__UnaryExpression__Group_4__2 ;
    public final void rule__UnaryExpression__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:3486:1: ( rule__UnaryExpression__Group_4__1__Impl rule__UnaryExpression__Group_4__2 )
            // InternalDdParser.g:3487:2: rule__UnaryExpression__Group_4__1__Impl rule__UnaryExpression__Group_4__2
            {
            pushFollow(FOLLOW_28);
            rule__UnaryExpression__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__UnaryExpression__Group_4__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group_4__1"


    // $ANTLR start "rule__UnaryExpression__Group_4__1__Impl"
    // InternalDdParser.g:3494:1: rule__UnaryExpression__Group_4__1__Impl : ( ( rule__UnaryExpression__StrTypeAssignment_4_1 ) ) ;
    public final void rule__UnaryExpression__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:3498:1: ( ( ( rule__UnaryExpression__StrTypeAssignment_4_1 ) ) )
            // InternalDdParser.g:3499:1: ( ( rule__UnaryExpression__StrTypeAssignment_4_1 ) )
            {
            // InternalDdParser.g:3499:1: ( ( rule__UnaryExpression__StrTypeAssignment_4_1 ) )
            // InternalDdParser.g:3500:2: ( rule__UnaryExpression__StrTypeAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getStrTypeAssignment_4_1()); 
            }
            // InternalDdParser.g:3501:2: ( rule__UnaryExpression__StrTypeAssignment_4_1 )
            // InternalDdParser.g:3501:3: rule__UnaryExpression__StrTypeAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__UnaryExpression__StrTypeAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExpressionAccess().getStrTypeAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group_4__1__Impl"


    // $ANTLR start "rule__UnaryExpression__Group_4__2"
    // InternalDdParser.g:3509:1: rule__UnaryExpression__Group_4__2 : rule__UnaryExpression__Group_4__2__Impl rule__UnaryExpression__Group_4__3 ;
    public final void rule__UnaryExpression__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:3513:1: ( rule__UnaryExpression__Group_4__2__Impl rule__UnaryExpression__Group_4__3 )
            // InternalDdParser.g:3514:2: rule__UnaryExpression__Group_4__2__Impl rule__UnaryExpression__Group_4__3
            {
            pushFollow(FOLLOW_28);
            rule__UnaryExpression__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__UnaryExpression__Group_4__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group_4__2"


    // $ANTLR start "rule__UnaryExpression__Group_4__2__Impl"
    // InternalDdParser.g:3521:1: rule__UnaryExpression__Group_4__2__Impl : ( ( rule__UnaryExpression__DateTypeAssignment_4_2 ) ) ;
    public final void rule__UnaryExpression__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:3525:1: ( ( ( rule__UnaryExpression__DateTypeAssignment_4_2 ) ) )
            // InternalDdParser.g:3526:1: ( ( rule__UnaryExpression__DateTypeAssignment_4_2 ) )
            {
            // InternalDdParser.g:3526:1: ( ( rule__UnaryExpression__DateTypeAssignment_4_2 ) )
            // InternalDdParser.g:3527:2: ( rule__UnaryExpression__DateTypeAssignment_4_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getDateTypeAssignment_4_2()); 
            }
            // InternalDdParser.g:3528:2: ( rule__UnaryExpression__DateTypeAssignment_4_2 )
            // InternalDdParser.g:3528:3: rule__UnaryExpression__DateTypeAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__UnaryExpression__DateTypeAssignment_4_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExpressionAccess().getDateTypeAssignment_4_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group_4__2__Impl"


    // $ANTLR start "rule__UnaryExpression__Group_4__3"
    // InternalDdParser.g:3536:1: rule__UnaryExpression__Group_4__3 : rule__UnaryExpression__Group_4__3__Impl ;
    public final void rule__UnaryExpression__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:3540:1: ( rule__UnaryExpression__Group_4__3__Impl )
            // InternalDdParser.g:3541:2: rule__UnaryExpression__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnaryExpression__Group_4__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group_4__3"


    // $ANTLR start "rule__UnaryExpression__Group_4__3__Impl"
    // InternalDdParser.g:3547:1: rule__UnaryExpression__Group_4__3__Impl : ( ( rule__UnaryExpression__BoolTypeAssignment_4_3 ) ) ;
    public final void rule__UnaryExpression__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:3551:1: ( ( ( rule__UnaryExpression__BoolTypeAssignment_4_3 ) ) )
            // InternalDdParser.g:3552:1: ( ( rule__UnaryExpression__BoolTypeAssignment_4_3 ) )
            {
            // InternalDdParser.g:3552:1: ( ( rule__UnaryExpression__BoolTypeAssignment_4_3 ) )
            // InternalDdParser.g:3553:2: ( rule__UnaryExpression__BoolTypeAssignment_4_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getBoolTypeAssignment_4_3()); 
            }
            // InternalDdParser.g:3554:2: ( rule__UnaryExpression__BoolTypeAssignment_4_3 )
            // InternalDdParser.g:3554:3: rule__UnaryExpression__BoolTypeAssignment_4_3
            {
            pushFollow(FOLLOW_2);
            rule__UnaryExpression__BoolTypeAssignment_4_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExpressionAccess().getBoolTypeAssignment_4_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group_4__3__Impl"


    // $ANTLR start "rule__AddExpression__Group__0"
    // InternalDdParser.g:3563:1: rule__AddExpression__Group__0 : rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1 ;
    public final void rule__AddExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:3567:1: ( rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1 )
            // InternalDdParser.g:3568:2: rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__AddExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AddExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpression__Group__0"


    // $ANTLR start "rule__AddExpression__Group__0__Impl"
    // InternalDdParser.g:3575:1: rule__AddExpression__Group__0__Impl : ( LeftParenthesis ) ;
    public final void rule__AddExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:3579:1: ( ( LeftParenthesis ) )
            // InternalDdParser.g:3580:1: ( LeftParenthesis )
            {
            // InternalDdParser.g:3580:1: ( LeftParenthesis )
            // InternalDdParser.g:3581:2: LeftParenthesis
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,LeftParenthesis,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddExpressionAccess().getLeftParenthesisKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpression__Group__0__Impl"


    // $ANTLR start "rule__AddExpression__Group__1"
    // InternalDdParser.g:3590:1: rule__AddExpression__Group__1 : rule__AddExpression__Group__1__Impl rule__AddExpression__Group__2 ;
    public final void rule__AddExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:3594:1: ( rule__AddExpression__Group__1__Impl rule__AddExpression__Group__2 )
            // InternalDdParser.g:3595:2: rule__AddExpression__Group__1__Impl rule__AddExpression__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__AddExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AddExpression__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpression__Group__1"


    // $ANTLR start "rule__AddExpression__Group__1__Impl"
    // InternalDdParser.g:3602:1: rule__AddExpression__Group__1__Impl : ( ( rule__AddExpression__LeftAssignment_1 ) ) ;
    public final void rule__AddExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:3606:1: ( ( ( rule__AddExpression__LeftAssignment_1 ) ) )
            // InternalDdParser.g:3607:1: ( ( rule__AddExpression__LeftAssignment_1 ) )
            {
            // InternalDdParser.g:3607:1: ( ( rule__AddExpression__LeftAssignment_1 ) )
            // InternalDdParser.g:3608:2: ( rule__AddExpression__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getLeftAssignment_1()); 
            }
            // InternalDdParser.g:3609:2: ( rule__AddExpression__LeftAssignment_1 )
            // InternalDdParser.g:3609:3: rule__AddExpression__LeftAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AddExpression__LeftAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddExpressionAccess().getLeftAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpression__Group__1__Impl"


    // $ANTLR start "rule__AddExpression__Group__2"
    // InternalDdParser.g:3617:1: rule__AddExpression__Group__2 : rule__AddExpression__Group__2__Impl rule__AddExpression__Group__3 ;
    public final void rule__AddExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:3621:1: ( rule__AddExpression__Group__2__Impl rule__AddExpression__Group__3 )
            // InternalDdParser.g:3622:2: rule__AddExpression__Group__2__Impl rule__AddExpression__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__AddExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AddExpression__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpression__Group__2"


    // $ANTLR start "rule__AddExpression__Group__2__Impl"
    // InternalDdParser.g:3629:1: rule__AddExpression__Group__2__Impl : ( ( rule__AddExpression__OpAssignment_2 ) ) ;
    public final void rule__AddExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:3633:1: ( ( ( rule__AddExpression__OpAssignment_2 ) ) )
            // InternalDdParser.g:3634:1: ( ( rule__AddExpression__OpAssignment_2 ) )
            {
            // InternalDdParser.g:3634:1: ( ( rule__AddExpression__OpAssignment_2 ) )
            // InternalDdParser.g:3635:2: ( rule__AddExpression__OpAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getOpAssignment_2()); 
            }
            // InternalDdParser.g:3636:2: ( rule__AddExpression__OpAssignment_2 )
            // InternalDdParser.g:3636:3: rule__AddExpression__OpAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AddExpression__OpAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddExpressionAccess().getOpAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpression__Group__2__Impl"


    // $ANTLR start "rule__AddExpression__Group__3"
    // InternalDdParser.g:3644:1: rule__AddExpression__Group__3 : rule__AddExpression__Group__3__Impl rule__AddExpression__Group__4 ;
    public final void rule__AddExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:3648:1: ( rule__AddExpression__Group__3__Impl rule__AddExpression__Group__4 )
            // InternalDdParser.g:3649:2: rule__AddExpression__Group__3__Impl rule__AddExpression__Group__4
            {
            pushFollow(FOLLOW_29);
            rule__AddExpression__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AddExpression__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpression__Group__3"


    // $ANTLR start "rule__AddExpression__Group__3__Impl"
    // InternalDdParser.g:3656:1: rule__AddExpression__Group__3__Impl : ( ( rule__AddExpression__RightAssignment_3 ) ) ;
    public final void rule__AddExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:3660:1: ( ( ( rule__AddExpression__RightAssignment_3 ) ) )
            // InternalDdParser.g:3661:1: ( ( rule__AddExpression__RightAssignment_3 ) )
            {
            // InternalDdParser.g:3661:1: ( ( rule__AddExpression__RightAssignment_3 ) )
            // InternalDdParser.g:3662:2: ( rule__AddExpression__RightAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getRightAssignment_3()); 
            }
            // InternalDdParser.g:3663:2: ( rule__AddExpression__RightAssignment_3 )
            // InternalDdParser.g:3663:3: rule__AddExpression__RightAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__AddExpression__RightAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddExpressionAccess().getRightAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpression__Group__3__Impl"


    // $ANTLR start "rule__AddExpression__Group__4"
    // InternalDdParser.g:3671:1: rule__AddExpression__Group__4 : rule__AddExpression__Group__4__Impl rule__AddExpression__Group__5 ;
    public final void rule__AddExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:3675:1: ( rule__AddExpression__Group__4__Impl rule__AddExpression__Group__5 )
            // InternalDdParser.g:3676:2: rule__AddExpression__Group__4__Impl rule__AddExpression__Group__5
            {
            pushFollow(FOLLOW_27);
            rule__AddExpression__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AddExpression__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpression__Group__4"


    // $ANTLR start "rule__AddExpression__Group__4__Impl"
    // InternalDdParser.g:3683:1: rule__AddExpression__Group__4__Impl : ( ( ( rule__AddExpression__AddEltsAssignment_4 ) ) ( ( rule__AddExpression__AddEltsAssignment_4 )* ) ) ;
    public final void rule__AddExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:3687:1: ( ( ( ( rule__AddExpression__AddEltsAssignment_4 ) ) ( ( rule__AddExpression__AddEltsAssignment_4 )* ) ) )
            // InternalDdParser.g:3688:1: ( ( ( rule__AddExpression__AddEltsAssignment_4 ) ) ( ( rule__AddExpression__AddEltsAssignment_4 )* ) )
            {
            // InternalDdParser.g:3688:1: ( ( ( rule__AddExpression__AddEltsAssignment_4 ) ) ( ( rule__AddExpression__AddEltsAssignment_4 )* ) )
            // InternalDdParser.g:3689:2: ( ( rule__AddExpression__AddEltsAssignment_4 ) ) ( ( rule__AddExpression__AddEltsAssignment_4 )* )
            {
            // InternalDdParser.g:3689:2: ( ( rule__AddExpression__AddEltsAssignment_4 ) )
            // InternalDdParser.g:3690:3: ( rule__AddExpression__AddEltsAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getAddEltsAssignment_4()); 
            }
            // InternalDdParser.g:3691:3: ( rule__AddExpression__AddEltsAssignment_4 )
            // InternalDdParser.g:3691:4: rule__AddExpression__AddEltsAssignment_4
            {
            pushFollow(FOLLOW_30);
            rule__AddExpression__AddEltsAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddExpressionAccess().getAddEltsAssignment_4()); 
            }

            }

            // InternalDdParser.g:3694:2: ( ( rule__AddExpression__AddEltsAssignment_4 )* )
            // InternalDdParser.g:3695:3: ( rule__AddExpression__AddEltsAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getAddEltsAssignment_4()); 
            }
            // InternalDdParser.g:3696:3: ( rule__AddExpression__AddEltsAssignment_4 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==PlusSign||LA32_0==HyphenMinus) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalDdParser.g:3696:4: rule__AddExpression__AddEltsAssignment_4
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__AddExpression__AddEltsAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddExpressionAccess().getAddEltsAssignment_4()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpression__Group__4__Impl"


    // $ANTLR start "rule__AddExpression__Group__5"
    // InternalDdParser.g:3705:1: rule__AddExpression__Group__5 : rule__AddExpression__Group__5__Impl rule__AddExpression__Group__6 ;
    public final void rule__AddExpression__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:3709:1: ( rule__AddExpression__Group__5__Impl rule__AddExpression__Group__6 )
            // InternalDdParser.g:3710:2: rule__AddExpression__Group__5__Impl rule__AddExpression__Group__6
            {
            pushFollow(FOLLOW_28);
            rule__AddExpression__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AddExpression__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpression__Group__5"


    // $ANTLR start "rule__AddExpression__Group__5__Impl"
    // InternalDdParser.g:3717:1: rule__AddExpression__Group__5__Impl : ( RightParenthesis ) ;
    public final void rule__AddExpression__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:3721:1: ( ( RightParenthesis ) )
            // InternalDdParser.g:3722:1: ( RightParenthesis )
            {
            // InternalDdParser.g:3722:1: ( RightParenthesis )
            // InternalDdParser.g:3723:2: RightParenthesis
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getRightParenthesisKeyword_5()); 
            }
            match(input,RightParenthesis,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddExpressionAccess().getRightParenthesisKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpression__Group__5__Impl"


    // $ANTLR start "rule__AddExpression__Group__6"
    // InternalDdParser.g:3732:1: rule__AddExpression__Group__6 : rule__AddExpression__Group__6__Impl ;
    public final void rule__AddExpression__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:3736:1: ( rule__AddExpression__Group__6__Impl )
            // InternalDdParser.g:3737:2: rule__AddExpression__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AddExpression__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpression__Group__6"


    // $ANTLR start "rule__AddExpression__Group__6__Impl"
    // InternalDdParser.g:3743:1: rule__AddExpression__Group__6__Impl : ( ( rule__AddExpression__CheckedAssignment_6 )? ) ;
    public final void rule__AddExpression__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:3747:1: ( ( ( rule__AddExpression__CheckedAssignment_6 )? ) )
            // InternalDdParser.g:3748:1: ( ( rule__AddExpression__CheckedAssignment_6 )? )
            {
            // InternalDdParser.g:3748:1: ( ( rule__AddExpression__CheckedAssignment_6 )? )
            // InternalDdParser.g:3749:2: ( rule__AddExpression__CheckedAssignment_6 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getCheckedAssignment_6()); 
            }
            // InternalDdParser.g:3750:2: ( rule__AddExpression__CheckedAssignment_6 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_NULL) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalDdParser.g:3750:3: rule__AddExpression__CheckedAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__AddExpression__CheckedAssignment_6();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddExpressionAccess().getCheckedAssignment_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpression__Group__6__Impl"


    // $ANTLR start "rule__AddExpressionElt__Group__0"
    // InternalDdParser.g:3759:1: rule__AddExpressionElt__Group__0 : rule__AddExpressionElt__Group__0__Impl rule__AddExpressionElt__Group__1 ;
    public final void rule__AddExpressionElt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:3763:1: ( rule__AddExpressionElt__Group__0__Impl rule__AddExpressionElt__Group__1 )
            // InternalDdParser.g:3764:2: rule__AddExpressionElt__Group__0__Impl rule__AddExpressionElt__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__AddExpressionElt__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AddExpressionElt__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpressionElt__Group__0"


    // $ANTLR start "rule__AddExpressionElt__Group__0__Impl"
    // InternalDdParser.g:3771:1: rule__AddExpressionElt__Group__0__Impl : ( ( rule__AddExpressionElt__OpAssignment_0 ) ) ;
    public final void rule__AddExpressionElt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:3775:1: ( ( ( rule__AddExpressionElt__OpAssignment_0 ) ) )
            // InternalDdParser.g:3776:1: ( ( rule__AddExpressionElt__OpAssignment_0 ) )
            {
            // InternalDdParser.g:3776:1: ( ( rule__AddExpressionElt__OpAssignment_0 ) )
            // InternalDdParser.g:3777:2: ( rule__AddExpressionElt__OpAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionEltAccess().getOpAssignment_0()); 
            }
            // InternalDdParser.g:3778:2: ( rule__AddExpressionElt__OpAssignment_0 )
            // InternalDdParser.g:3778:3: rule__AddExpressionElt__OpAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__AddExpressionElt__OpAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddExpressionEltAccess().getOpAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpressionElt__Group__0__Impl"


    // $ANTLR start "rule__AddExpressionElt__Group__1"
    // InternalDdParser.g:3786:1: rule__AddExpressionElt__Group__1 : rule__AddExpressionElt__Group__1__Impl ;
    public final void rule__AddExpressionElt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:3790:1: ( rule__AddExpressionElt__Group__1__Impl )
            // InternalDdParser.g:3791:2: rule__AddExpressionElt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AddExpressionElt__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpressionElt__Group__1"


    // $ANTLR start "rule__AddExpressionElt__Group__1__Impl"
    // InternalDdParser.g:3797:1: rule__AddExpressionElt__Group__1__Impl : ( ( rule__AddExpressionElt__RightAssignment_1 ) ) ;
    public final void rule__AddExpressionElt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:3801:1: ( ( ( rule__AddExpressionElt__RightAssignment_1 ) ) )
            // InternalDdParser.g:3802:1: ( ( rule__AddExpressionElt__RightAssignment_1 ) )
            {
            // InternalDdParser.g:3802:1: ( ( rule__AddExpressionElt__RightAssignment_1 ) )
            // InternalDdParser.g:3803:2: ( rule__AddExpressionElt__RightAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionEltAccess().getRightAssignment_1()); 
            }
            // InternalDdParser.g:3804:2: ( rule__AddExpressionElt__RightAssignment_1 )
            // InternalDdParser.g:3804:3: rule__AddExpressionElt__RightAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AddExpressionElt__RightAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddExpressionEltAccess().getRightAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpressionElt__Group__1__Impl"


    // $ANTLR start "rule__MultExpression__Group__0"
    // InternalDdParser.g:3813:1: rule__MultExpression__Group__0 : rule__MultExpression__Group__0__Impl rule__MultExpression__Group__1 ;
    public final void rule__MultExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:3817:1: ( rule__MultExpression__Group__0__Impl rule__MultExpression__Group__1 )
            // InternalDdParser.g:3818:2: rule__MultExpression__Group__0__Impl rule__MultExpression__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__MultExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MultExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__Group__0"


    // $ANTLR start "rule__MultExpression__Group__0__Impl"
    // InternalDdParser.g:3825:1: rule__MultExpression__Group__0__Impl : ( LeftParenthesis ) ;
    public final void rule__MultExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:3829:1: ( ( LeftParenthesis ) )
            // InternalDdParser.g:3830:1: ( LeftParenthesis )
            {
            // InternalDdParser.g:3830:1: ( LeftParenthesis )
            // InternalDdParser.g:3831:2: LeftParenthesis
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,LeftParenthesis,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultExpressionAccess().getLeftParenthesisKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__Group__0__Impl"


    // $ANTLR start "rule__MultExpression__Group__1"
    // InternalDdParser.g:3840:1: rule__MultExpression__Group__1 : rule__MultExpression__Group__1__Impl rule__MultExpression__Group__2 ;
    public final void rule__MultExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:3844:1: ( rule__MultExpression__Group__1__Impl rule__MultExpression__Group__2 )
            // InternalDdParser.g:3845:2: rule__MultExpression__Group__1__Impl rule__MultExpression__Group__2
            {
            pushFollow(FOLLOW_31);
            rule__MultExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MultExpression__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__Group__1"


    // $ANTLR start "rule__MultExpression__Group__1__Impl"
    // InternalDdParser.g:3852:1: rule__MultExpression__Group__1__Impl : ( ( rule__MultExpression__LeftAssignment_1 ) ) ;
    public final void rule__MultExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:3856:1: ( ( ( rule__MultExpression__LeftAssignment_1 ) ) )
            // InternalDdParser.g:3857:1: ( ( rule__MultExpression__LeftAssignment_1 ) )
            {
            // InternalDdParser.g:3857:1: ( ( rule__MultExpression__LeftAssignment_1 ) )
            // InternalDdParser.g:3858:2: ( rule__MultExpression__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getLeftAssignment_1()); 
            }
            // InternalDdParser.g:3859:2: ( rule__MultExpression__LeftAssignment_1 )
            // InternalDdParser.g:3859:3: rule__MultExpression__LeftAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MultExpression__LeftAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultExpressionAccess().getLeftAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__Group__1__Impl"


    // $ANTLR start "rule__MultExpression__Group__2"
    // InternalDdParser.g:3867:1: rule__MultExpression__Group__2 : rule__MultExpression__Group__2__Impl rule__MultExpression__Group__3 ;
    public final void rule__MultExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:3871:1: ( rule__MultExpression__Group__2__Impl rule__MultExpression__Group__3 )
            // InternalDdParser.g:3872:2: rule__MultExpression__Group__2__Impl rule__MultExpression__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__MultExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MultExpression__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__Group__2"


    // $ANTLR start "rule__MultExpression__Group__2__Impl"
    // InternalDdParser.g:3879:1: rule__MultExpression__Group__2__Impl : ( ( rule__MultExpression__OpAssignment_2 ) ) ;
    public final void rule__MultExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:3883:1: ( ( ( rule__MultExpression__OpAssignment_2 ) ) )
            // InternalDdParser.g:3884:1: ( ( rule__MultExpression__OpAssignment_2 ) )
            {
            // InternalDdParser.g:3884:1: ( ( rule__MultExpression__OpAssignment_2 ) )
            // InternalDdParser.g:3885:2: ( rule__MultExpression__OpAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getOpAssignment_2()); 
            }
            // InternalDdParser.g:3886:2: ( rule__MultExpression__OpAssignment_2 )
            // InternalDdParser.g:3886:3: rule__MultExpression__OpAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MultExpression__OpAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultExpressionAccess().getOpAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__Group__2__Impl"


    // $ANTLR start "rule__MultExpression__Group__3"
    // InternalDdParser.g:3894:1: rule__MultExpression__Group__3 : rule__MultExpression__Group__3__Impl rule__MultExpression__Group__4 ;
    public final void rule__MultExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:3898:1: ( rule__MultExpression__Group__3__Impl rule__MultExpression__Group__4 )
            // InternalDdParser.g:3899:2: rule__MultExpression__Group__3__Impl rule__MultExpression__Group__4
            {
            pushFollow(FOLLOW_31);
            rule__MultExpression__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MultExpression__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__Group__3"


    // $ANTLR start "rule__MultExpression__Group__3__Impl"
    // InternalDdParser.g:3906:1: rule__MultExpression__Group__3__Impl : ( ( rule__MultExpression__RightAssignment_3 ) ) ;
    public final void rule__MultExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:3910:1: ( ( ( rule__MultExpression__RightAssignment_3 ) ) )
            // InternalDdParser.g:3911:1: ( ( rule__MultExpression__RightAssignment_3 ) )
            {
            // InternalDdParser.g:3911:1: ( ( rule__MultExpression__RightAssignment_3 ) )
            // InternalDdParser.g:3912:2: ( rule__MultExpression__RightAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getRightAssignment_3()); 
            }
            // InternalDdParser.g:3913:2: ( rule__MultExpression__RightAssignment_3 )
            // InternalDdParser.g:3913:3: rule__MultExpression__RightAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__MultExpression__RightAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultExpressionAccess().getRightAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__Group__3__Impl"


    // $ANTLR start "rule__MultExpression__Group__4"
    // InternalDdParser.g:3921:1: rule__MultExpression__Group__4 : rule__MultExpression__Group__4__Impl rule__MultExpression__Group__5 ;
    public final void rule__MultExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:3925:1: ( rule__MultExpression__Group__4__Impl rule__MultExpression__Group__5 )
            // InternalDdParser.g:3926:2: rule__MultExpression__Group__4__Impl rule__MultExpression__Group__5
            {
            pushFollow(FOLLOW_27);
            rule__MultExpression__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MultExpression__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__Group__4"


    // $ANTLR start "rule__MultExpression__Group__4__Impl"
    // InternalDdParser.g:3933:1: rule__MultExpression__Group__4__Impl : ( ( ( rule__MultExpression__MultEltsAssignment_4 ) ) ( ( rule__MultExpression__MultEltsAssignment_4 )* ) ) ;
    public final void rule__MultExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:3937:1: ( ( ( ( rule__MultExpression__MultEltsAssignment_4 ) ) ( ( rule__MultExpression__MultEltsAssignment_4 )* ) ) )
            // InternalDdParser.g:3938:1: ( ( ( rule__MultExpression__MultEltsAssignment_4 ) ) ( ( rule__MultExpression__MultEltsAssignment_4 )* ) )
            {
            // InternalDdParser.g:3938:1: ( ( ( rule__MultExpression__MultEltsAssignment_4 ) ) ( ( rule__MultExpression__MultEltsAssignment_4 )* ) )
            // InternalDdParser.g:3939:2: ( ( rule__MultExpression__MultEltsAssignment_4 ) ) ( ( rule__MultExpression__MultEltsAssignment_4 )* )
            {
            // InternalDdParser.g:3939:2: ( ( rule__MultExpression__MultEltsAssignment_4 ) )
            // InternalDdParser.g:3940:3: ( rule__MultExpression__MultEltsAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getMultEltsAssignment_4()); 
            }
            // InternalDdParser.g:3941:3: ( rule__MultExpression__MultEltsAssignment_4 )
            // InternalDdParser.g:3941:4: rule__MultExpression__MultEltsAssignment_4
            {
            pushFollow(FOLLOW_32);
            rule__MultExpression__MultEltsAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultExpressionAccess().getMultEltsAssignment_4()); 
            }

            }

            // InternalDdParser.g:3944:2: ( ( rule__MultExpression__MultEltsAssignment_4 )* )
            // InternalDdParser.g:3945:3: ( rule__MultExpression__MultEltsAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getMultEltsAssignment_4()); 
            }
            // InternalDdParser.g:3946:3: ( rule__MultExpression__MultEltsAssignment_4 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==Asterisk) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalDdParser.g:3946:4: rule__MultExpression__MultEltsAssignment_4
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__MultExpression__MultEltsAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultExpressionAccess().getMultEltsAssignment_4()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__Group__4__Impl"


    // $ANTLR start "rule__MultExpression__Group__5"
    // InternalDdParser.g:3955:1: rule__MultExpression__Group__5 : rule__MultExpression__Group__5__Impl rule__MultExpression__Group__6 ;
    public final void rule__MultExpression__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:3959:1: ( rule__MultExpression__Group__5__Impl rule__MultExpression__Group__6 )
            // InternalDdParser.g:3960:2: rule__MultExpression__Group__5__Impl rule__MultExpression__Group__6
            {
            pushFollow(FOLLOW_28);
            rule__MultExpression__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MultExpression__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__Group__5"


    // $ANTLR start "rule__MultExpression__Group__5__Impl"
    // InternalDdParser.g:3967:1: rule__MultExpression__Group__5__Impl : ( RightParenthesis ) ;
    public final void rule__MultExpression__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:3971:1: ( ( RightParenthesis ) )
            // InternalDdParser.g:3972:1: ( RightParenthesis )
            {
            // InternalDdParser.g:3972:1: ( RightParenthesis )
            // InternalDdParser.g:3973:2: RightParenthesis
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getRightParenthesisKeyword_5()); 
            }
            match(input,RightParenthesis,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultExpressionAccess().getRightParenthesisKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__Group__5__Impl"


    // $ANTLR start "rule__MultExpression__Group__6"
    // InternalDdParser.g:3982:1: rule__MultExpression__Group__6 : rule__MultExpression__Group__6__Impl ;
    public final void rule__MultExpression__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:3986:1: ( rule__MultExpression__Group__6__Impl )
            // InternalDdParser.g:3987:2: rule__MultExpression__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultExpression__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__Group__6"


    // $ANTLR start "rule__MultExpression__Group__6__Impl"
    // InternalDdParser.g:3993:1: rule__MultExpression__Group__6__Impl : ( ( rule__MultExpression__CheckedAssignment_6 )? ) ;
    public final void rule__MultExpression__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:3997:1: ( ( ( rule__MultExpression__CheckedAssignment_6 )? ) )
            // InternalDdParser.g:3998:1: ( ( rule__MultExpression__CheckedAssignment_6 )? )
            {
            // InternalDdParser.g:3998:1: ( ( rule__MultExpression__CheckedAssignment_6 )? )
            // InternalDdParser.g:3999:2: ( rule__MultExpression__CheckedAssignment_6 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getCheckedAssignment_6()); 
            }
            // InternalDdParser.g:4000:2: ( rule__MultExpression__CheckedAssignment_6 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_NULL) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalDdParser.g:4000:3: rule__MultExpression__CheckedAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__MultExpression__CheckedAssignment_6();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultExpressionAccess().getCheckedAssignment_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__Group__6__Impl"


    // $ANTLR start "rule__MultExpressionElt__Group__0"
    // InternalDdParser.g:4009:1: rule__MultExpressionElt__Group__0 : rule__MultExpressionElt__Group__0__Impl rule__MultExpressionElt__Group__1 ;
    public final void rule__MultExpressionElt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:4013:1: ( rule__MultExpressionElt__Group__0__Impl rule__MultExpressionElt__Group__1 )
            // InternalDdParser.g:4014:2: rule__MultExpressionElt__Group__0__Impl rule__MultExpressionElt__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__MultExpressionElt__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MultExpressionElt__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpressionElt__Group__0"


    // $ANTLR start "rule__MultExpressionElt__Group__0__Impl"
    // InternalDdParser.g:4021:1: rule__MultExpressionElt__Group__0__Impl : ( ( rule__MultExpressionElt__OpAssignment_0 ) ) ;
    public final void rule__MultExpressionElt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:4025:1: ( ( ( rule__MultExpressionElt__OpAssignment_0 ) ) )
            // InternalDdParser.g:4026:1: ( ( rule__MultExpressionElt__OpAssignment_0 ) )
            {
            // InternalDdParser.g:4026:1: ( ( rule__MultExpressionElt__OpAssignment_0 ) )
            // InternalDdParser.g:4027:2: ( rule__MultExpressionElt__OpAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionEltAccess().getOpAssignment_0()); 
            }
            // InternalDdParser.g:4028:2: ( rule__MultExpressionElt__OpAssignment_0 )
            // InternalDdParser.g:4028:3: rule__MultExpressionElt__OpAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__MultExpressionElt__OpAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultExpressionEltAccess().getOpAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpressionElt__Group__0__Impl"


    // $ANTLR start "rule__MultExpressionElt__Group__1"
    // InternalDdParser.g:4036:1: rule__MultExpressionElt__Group__1 : rule__MultExpressionElt__Group__1__Impl ;
    public final void rule__MultExpressionElt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:4040:1: ( rule__MultExpressionElt__Group__1__Impl )
            // InternalDdParser.g:4041:2: rule__MultExpressionElt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultExpressionElt__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpressionElt__Group__1"


    // $ANTLR start "rule__MultExpressionElt__Group__1__Impl"
    // InternalDdParser.g:4047:1: rule__MultExpressionElt__Group__1__Impl : ( ( rule__MultExpressionElt__RightAssignment_1 ) ) ;
    public final void rule__MultExpressionElt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:4051:1: ( ( ( rule__MultExpressionElt__RightAssignment_1 ) ) )
            // InternalDdParser.g:4052:1: ( ( rule__MultExpressionElt__RightAssignment_1 ) )
            {
            // InternalDdParser.g:4052:1: ( ( rule__MultExpressionElt__RightAssignment_1 ) )
            // InternalDdParser.g:4053:2: ( rule__MultExpressionElt__RightAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionEltAccess().getRightAssignment_1()); 
            }
            // InternalDdParser.g:4054:2: ( rule__MultExpressionElt__RightAssignment_1 )
            // InternalDdParser.g:4054:3: rule__MultExpressionElt__RightAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MultExpressionElt__RightAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultExpressionEltAccess().getRightAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpressionElt__Group__1__Impl"


    // $ANTLR start "rule__AndExpression__Group__0"
    // InternalDdParser.g:4063:1: rule__AndExpression__Group__0 : rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 ;
    public final void rule__AndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:4067:1: ( rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 )
            // InternalDdParser.g:4068:2: rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__AndExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group__0"


    // $ANTLR start "rule__AndExpression__Group__0__Impl"
    // InternalDdParser.g:4075:1: rule__AndExpression__Group__0__Impl : ( LeftParenthesis ) ;
    public final void rule__AndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:4079:1: ( ( LeftParenthesis ) )
            // InternalDdParser.g:4080:1: ( LeftParenthesis )
            {
            // InternalDdParser.g:4080:1: ( LeftParenthesis )
            // InternalDdParser.g:4081:2: LeftParenthesis
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,LeftParenthesis,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getLeftParenthesisKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group__0__Impl"


    // $ANTLR start "rule__AndExpression__Group__1"
    // InternalDdParser.g:4090:1: rule__AndExpression__Group__1 : rule__AndExpression__Group__1__Impl rule__AndExpression__Group__2 ;
    public final void rule__AndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:4094:1: ( rule__AndExpression__Group__1__Impl rule__AndExpression__Group__2 )
            // InternalDdParser.g:4095:2: rule__AndExpression__Group__1__Impl rule__AndExpression__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__AndExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group__1"


    // $ANTLR start "rule__AndExpression__Group__1__Impl"
    // InternalDdParser.g:4102:1: rule__AndExpression__Group__1__Impl : ( ( rule__AndExpression__LeftAssignment_1 ) ) ;
    public final void rule__AndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:4106:1: ( ( ( rule__AndExpression__LeftAssignment_1 ) ) )
            // InternalDdParser.g:4107:1: ( ( rule__AndExpression__LeftAssignment_1 ) )
            {
            // InternalDdParser.g:4107:1: ( ( rule__AndExpression__LeftAssignment_1 ) )
            // InternalDdParser.g:4108:2: ( rule__AndExpression__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getLeftAssignment_1()); 
            }
            // InternalDdParser.g:4109:2: ( rule__AndExpression__LeftAssignment_1 )
            // InternalDdParser.g:4109:3: rule__AndExpression__LeftAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__LeftAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getLeftAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group__1__Impl"


    // $ANTLR start "rule__AndExpression__Group__2"
    // InternalDdParser.g:4117:1: rule__AndExpression__Group__2 : rule__AndExpression__Group__2__Impl rule__AndExpression__Group__3 ;
    public final void rule__AndExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:4121:1: ( rule__AndExpression__Group__2__Impl rule__AndExpression__Group__3 )
            // InternalDdParser.g:4122:2: rule__AndExpression__Group__2__Impl rule__AndExpression__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__AndExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group__2"


    // $ANTLR start "rule__AndExpression__Group__2__Impl"
    // InternalDdParser.g:4129:1: rule__AndExpression__Group__2__Impl : ( ( rule__AndExpression__OpAssignment_2 ) ) ;
    public final void rule__AndExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:4133:1: ( ( ( rule__AndExpression__OpAssignment_2 ) ) )
            // InternalDdParser.g:4134:1: ( ( rule__AndExpression__OpAssignment_2 ) )
            {
            // InternalDdParser.g:4134:1: ( ( rule__AndExpression__OpAssignment_2 ) )
            // InternalDdParser.g:4135:2: ( rule__AndExpression__OpAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getOpAssignment_2()); 
            }
            // InternalDdParser.g:4136:2: ( rule__AndExpression__OpAssignment_2 )
            // InternalDdParser.g:4136:3: rule__AndExpression__OpAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__OpAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getOpAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group__2__Impl"


    // $ANTLR start "rule__AndExpression__Group__3"
    // InternalDdParser.g:4144:1: rule__AndExpression__Group__3 : rule__AndExpression__Group__3__Impl rule__AndExpression__Group__4 ;
    public final void rule__AndExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:4148:1: ( rule__AndExpression__Group__3__Impl rule__AndExpression__Group__4 )
            // InternalDdParser.g:4149:2: rule__AndExpression__Group__3__Impl rule__AndExpression__Group__4
            {
            pushFollow(FOLLOW_33);
            rule__AndExpression__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group__3"


    // $ANTLR start "rule__AndExpression__Group__3__Impl"
    // InternalDdParser.g:4156:1: rule__AndExpression__Group__3__Impl : ( ( rule__AndExpression__RightAssignment_3 ) ) ;
    public final void rule__AndExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:4160:1: ( ( ( rule__AndExpression__RightAssignment_3 ) ) )
            // InternalDdParser.g:4161:1: ( ( rule__AndExpression__RightAssignment_3 ) )
            {
            // InternalDdParser.g:4161:1: ( ( rule__AndExpression__RightAssignment_3 ) )
            // InternalDdParser.g:4162:2: ( rule__AndExpression__RightAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getRightAssignment_3()); 
            }
            // InternalDdParser.g:4163:2: ( rule__AndExpression__RightAssignment_3 )
            // InternalDdParser.g:4163:3: rule__AndExpression__RightAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__RightAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getRightAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group__3__Impl"


    // $ANTLR start "rule__AndExpression__Group__4"
    // InternalDdParser.g:4171:1: rule__AndExpression__Group__4 : rule__AndExpression__Group__4__Impl rule__AndExpression__Group__5 ;
    public final void rule__AndExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:4175:1: ( rule__AndExpression__Group__4__Impl rule__AndExpression__Group__5 )
            // InternalDdParser.g:4176:2: rule__AndExpression__Group__4__Impl rule__AndExpression__Group__5
            {
            pushFollow(FOLLOW_27);
            rule__AndExpression__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group__4"


    // $ANTLR start "rule__AndExpression__Group__4__Impl"
    // InternalDdParser.g:4183:1: rule__AndExpression__Group__4__Impl : ( ( ( rule__AndExpression__AndEltsAssignment_4 ) ) ( ( rule__AndExpression__AndEltsAssignment_4 )* ) ) ;
    public final void rule__AndExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:4187:1: ( ( ( ( rule__AndExpression__AndEltsAssignment_4 ) ) ( ( rule__AndExpression__AndEltsAssignment_4 )* ) ) )
            // InternalDdParser.g:4188:1: ( ( ( rule__AndExpression__AndEltsAssignment_4 ) ) ( ( rule__AndExpression__AndEltsAssignment_4 )* ) )
            {
            // InternalDdParser.g:4188:1: ( ( ( rule__AndExpression__AndEltsAssignment_4 ) ) ( ( rule__AndExpression__AndEltsAssignment_4 )* ) )
            // InternalDdParser.g:4189:2: ( ( rule__AndExpression__AndEltsAssignment_4 ) ) ( ( rule__AndExpression__AndEltsAssignment_4 )* )
            {
            // InternalDdParser.g:4189:2: ( ( rule__AndExpression__AndEltsAssignment_4 ) )
            // InternalDdParser.g:4190:3: ( rule__AndExpression__AndEltsAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getAndEltsAssignment_4()); 
            }
            // InternalDdParser.g:4191:3: ( rule__AndExpression__AndEltsAssignment_4 )
            // InternalDdParser.g:4191:4: rule__AndExpression__AndEltsAssignment_4
            {
            pushFollow(FOLLOW_34);
            rule__AndExpression__AndEltsAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getAndEltsAssignment_4()); 
            }

            }

            // InternalDdParser.g:4194:2: ( ( rule__AndExpression__AndEltsAssignment_4 )* )
            // InternalDdParser.g:4195:3: ( rule__AndExpression__AndEltsAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getAndEltsAssignment_4()); 
            }
            // InternalDdParser.g:4196:3: ( rule__AndExpression__AndEltsAssignment_4 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==And) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalDdParser.g:4196:4: rule__AndExpression__AndEltsAssignment_4
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__AndExpression__AndEltsAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getAndEltsAssignment_4()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group__4__Impl"


    // $ANTLR start "rule__AndExpression__Group__5"
    // InternalDdParser.g:4205:1: rule__AndExpression__Group__5 : rule__AndExpression__Group__5__Impl rule__AndExpression__Group__6 ;
    public final void rule__AndExpression__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:4209:1: ( rule__AndExpression__Group__5__Impl rule__AndExpression__Group__6 )
            // InternalDdParser.g:4210:2: rule__AndExpression__Group__5__Impl rule__AndExpression__Group__6
            {
            pushFollow(FOLLOW_28);
            rule__AndExpression__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group__5"


    // $ANTLR start "rule__AndExpression__Group__5__Impl"
    // InternalDdParser.g:4217:1: rule__AndExpression__Group__5__Impl : ( RightParenthesis ) ;
    public final void rule__AndExpression__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:4221:1: ( ( RightParenthesis ) )
            // InternalDdParser.g:4222:1: ( RightParenthesis )
            {
            // InternalDdParser.g:4222:1: ( RightParenthesis )
            // InternalDdParser.g:4223:2: RightParenthesis
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getRightParenthesisKeyword_5()); 
            }
            match(input,RightParenthesis,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getRightParenthesisKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group__5__Impl"


    // $ANTLR start "rule__AndExpression__Group__6"
    // InternalDdParser.g:4232:1: rule__AndExpression__Group__6 : rule__AndExpression__Group__6__Impl ;
    public final void rule__AndExpression__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:4236:1: ( rule__AndExpression__Group__6__Impl )
            // InternalDdParser.g:4237:2: rule__AndExpression__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group__6"


    // $ANTLR start "rule__AndExpression__Group__6__Impl"
    // InternalDdParser.g:4243:1: rule__AndExpression__Group__6__Impl : ( ( rule__AndExpression__CheckedAssignment_6 )? ) ;
    public final void rule__AndExpression__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:4247:1: ( ( ( rule__AndExpression__CheckedAssignment_6 )? ) )
            // InternalDdParser.g:4248:1: ( ( rule__AndExpression__CheckedAssignment_6 )? )
            {
            // InternalDdParser.g:4248:1: ( ( rule__AndExpression__CheckedAssignment_6 )? )
            // InternalDdParser.g:4249:2: ( rule__AndExpression__CheckedAssignment_6 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getCheckedAssignment_6()); 
            }
            // InternalDdParser.g:4250:2: ( rule__AndExpression__CheckedAssignment_6 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_NULL) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalDdParser.g:4250:3: rule__AndExpression__CheckedAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__AndExpression__CheckedAssignment_6();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getCheckedAssignment_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group__6__Impl"


    // $ANTLR start "rule__AndExpressionElt__Group__0"
    // InternalDdParser.g:4259:1: rule__AndExpressionElt__Group__0 : rule__AndExpressionElt__Group__0__Impl rule__AndExpressionElt__Group__1 ;
    public final void rule__AndExpressionElt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:4263:1: ( rule__AndExpressionElt__Group__0__Impl rule__AndExpressionElt__Group__1 )
            // InternalDdParser.g:4264:2: rule__AndExpressionElt__Group__0__Impl rule__AndExpressionElt__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__AndExpressionElt__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AndExpressionElt__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpressionElt__Group__0"


    // $ANTLR start "rule__AndExpressionElt__Group__0__Impl"
    // InternalDdParser.g:4271:1: rule__AndExpressionElt__Group__0__Impl : ( ( rule__AndExpressionElt__OpAssignment_0 ) ) ;
    public final void rule__AndExpressionElt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:4275:1: ( ( ( rule__AndExpressionElt__OpAssignment_0 ) ) )
            // InternalDdParser.g:4276:1: ( ( rule__AndExpressionElt__OpAssignment_0 ) )
            {
            // InternalDdParser.g:4276:1: ( ( rule__AndExpressionElt__OpAssignment_0 ) )
            // InternalDdParser.g:4277:2: ( rule__AndExpressionElt__OpAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionEltAccess().getOpAssignment_0()); 
            }
            // InternalDdParser.g:4278:2: ( rule__AndExpressionElt__OpAssignment_0 )
            // InternalDdParser.g:4278:3: rule__AndExpressionElt__OpAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__AndExpressionElt__OpAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionEltAccess().getOpAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpressionElt__Group__0__Impl"


    // $ANTLR start "rule__AndExpressionElt__Group__1"
    // InternalDdParser.g:4286:1: rule__AndExpressionElt__Group__1 : rule__AndExpressionElt__Group__1__Impl ;
    public final void rule__AndExpressionElt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:4290:1: ( rule__AndExpressionElt__Group__1__Impl )
            // InternalDdParser.g:4291:2: rule__AndExpressionElt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AndExpressionElt__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpressionElt__Group__1"


    // $ANTLR start "rule__AndExpressionElt__Group__1__Impl"
    // InternalDdParser.g:4297:1: rule__AndExpressionElt__Group__1__Impl : ( ( rule__AndExpressionElt__RightAssignment_1 ) ) ;
    public final void rule__AndExpressionElt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:4301:1: ( ( ( rule__AndExpressionElt__RightAssignment_1 ) ) )
            // InternalDdParser.g:4302:1: ( ( rule__AndExpressionElt__RightAssignment_1 ) )
            {
            // InternalDdParser.g:4302:1: ( ( rule__AndExpressionElt__RightAssignment_1 ) )
            // InternalDdParser.g:4303:2: ( rule__AndExpressionElt__RightAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionEltAccess().getRightAssignment_1()); 
            }
            // InternalDdParser.g:4304:2: ( rule__AndExpressionElt__RightAssignment_1 )
            // InternalDdParser.g:4304:3: rule__AndExpressionElt__RightAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AndExpressionElt__RightAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionEltAccess().getRightAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpressionElt__Group__1__Impl"


    // $ANTLR start "rule__OrExpression__Group__0"
    // InternalDdParser.g:4313:1: rule__OrExpression__Group__0 : rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 ;
    public final void rule__OrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:4317:1: ( rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 )
            // InternalDdParser.g:4318:2: rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__OrExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OrExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group__0"


    // $ANTLR start "rule__OrExpression__Group__0__Impl"
    // InternalDdParser.g:4325:1: rule__OrExpression__Group__0__Impl : ( LeftParenthesis ) ;
    public final void rule__OrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:4329:1: ( ( LeftParenthesis ) )
            // InternalDdParser.g:4330:1: ( LeftParenthesis )
            {
            // InternalDdParser.g:4330:1: ( LeftParenthesis )
            // InternalDdParser.g:4331:2: LeftParenthesis
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,LeftParenthesis,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionAccess().getLeftParenthesisKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group__0__Impl"


    // $ANTLR start "rule__OrExpression__Group__1"
    // InternalDdParser.g:4340:1: rule__OrExpression__Group__1 : rule__OrExpression__Group__1__Impl rule__OrExpression__Group__2 ;
    public final void rule__OrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:4344:1: ( rule__OrExpression__Group__1__Impl rule__OrExpression__Group__2 )
            // InternalDdParser.g:4345:2: rule__OrExpression__Group__1__Impl rule__OrExpression__Group__2
            {
            pushFollow(FOLLOW_35);
            rule__OrExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OrExpression__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group__1"


    // $ANTLR start "rule__OrExpression__Group__1__Impl"
    // InternalDdParser.g:4352:1: rule__OrExpression__Group__1__Impl : ( ( rule__OrExpression__LeftAssignment_1 ) ) ;
    public final void rule__OrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:4356:1: ( ( ( rule__OrExpression__LeftAssignment_1 ) ) )
            // InternalDdParser.g:4357:1: ( ( rule__OrExpression__LeftAssignment_1 ) )
            {
            // InternalDdParser.g:4357:1: ( ( rule__OrExpression__LeftAssignment_1 ) )
            // InternalDdParser.g:4358:2: ( rule__OrExpression__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getLeftAssignment_1()); 
            }
            // InternalDdParser.g:4359:2: ( rule__OrExpression__LeftAssignment_1 )
            // InternalDdParser.g:4359:3: rule__OrExpression__LeftAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__OrExpression__LeftAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionAccess().getLeftAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group__1__Impl"


    // $ANTLR start "rule__OrExpression__Group__2"
    // InternalDdParser.g:4367:1: rule__OrExpression__Group__2 : rule__OrExpression__Group__2__Impl rule__OrExpression__Group__3 ;
    public final void rule__OrExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:4371:1: ( rule__OrExpression__Group__2__Impl rule__OrExpression__Group__3 )
            // InternalDdParser.g:4372:2: rule__OrExpression__Group__2__Impl rule__OrExpression__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__OrExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OrExpression__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group__2"


    // $ANTLR start "rule__OrExpression__Group__2__Impl"
    // InternalDdParser.g:4379:1: rule__OrExpression__Group__2__Impl : ( ( rule__OrExpression__OpAssignment_2 ) ) ;
    public final void rule__OrExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:4383:1: ( ( ( rule__OrExpression__OpAssignment_2 ) ) )
            // InternalDdParser.g:4384:1: ( ( rule__OrExpression__OpAssignment_2 ) )
            {
            // InternalDdParser.g:4384:1: ( ( rule__OrExpression__OpAssignment_2 ) )
            // InternalDdParser.g:4385:2: ( rule__OrExpression__OpAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOpAssignment_2()); 
            }
            // InternalDdParser.g:4386:2: ( rule__OrExpression__OpAssignment_2 )
            // InternalDdParser.g:4386:3: rule__OrExpression__OpAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__OrExpression__OpAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionAccess().getOpAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group__2__Impl"


    // $ANTLR start "rule__OrExpression__Group__3"
    // InternalDdParser.g:4394:1: rule__OrExpression__Group__3 : rule__OrExpression__Group__3__Impl rule__OrExpression__Group__4 ;
    public final void rule__OrExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:4398:1: ( rule__OrExpression__Group__3__Impl rule__OrExpression__Group__4 )
            // InternalDdParser.g:4399:2: rule__OrExpression__Group__3__Impl rule__OrExpression__Group__4
            {
            pushFollow(FOLLOW_35);
            rule__OrExpression__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OrExpression__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group__3"


    // $ANTLR start "rule__OrExpression__Group__3__Impl"
    // InternalDdParser.g:4406:1: rule__OrExpression__Group__3__Impl : ( ( rule__OrExpression__RightAssignment_3 ) ) ;
    public final void rule__OrExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:4410:1: ( ( ( rule__OrExpression__RightAssignment_3 ) ) )
            // InternalDdParser.g:4411:1: ( ( rule__OrExpression__RightAssignment_3 ) )
            {
            // InternalDdParser.g:4411:1: ( ( rule__OrExpression__RightAssignment_3 ) )
            // InternalDdParser.g:4412:2: ( rule__OrExpression__RightAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getRightAssignment_3()); 
            }
            // InternalDdParser.g:4413:2: ( rule__OrExpression__RightAssignment_3 )
            // InternalDdParser.g:4413:3: rule__OrExpression__RightAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__OrExpression__RightAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionAccess().getRightAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group__3__Impl"


    // $ANTLR start "rule__OrExpression__Group__4"
    // InternalDdParser.g:4421:1: rule__OrExpression__Group__4 : rule__OrExpression__Group__4__Impl rule__OrExpression__Group__5 ;
    public final void rule__OrExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:4425:1: ( rule__OrExpression__Group__4__Impl rule__OrExpression__Group__5 )
            // InternalDdParser.g:4426:2: rule__OrExpression__Group__4__Impl rule__OrExpression__Group__5
            {
            pushFollow(FOLLOW_27);
            rule__OrExpression__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OrExpression__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group__4"


    // $ANTLR start "rule__OrExpression__Group__4__Impl"
    // InternalDdParser.g:4433:1: rule__OrExpression__Group__4__Impl : ( ( ( rule__OrExpression__OrEltsAssignment_4 ) ) ( ( rule__OrExpression__OrEltsAssignment_4 )* ) ) ;
    public final void rule__OrExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:4437:1: ( ( ( ( rule__OrExpression__OrEltsAssignment_4 ) ) ( ( rule__OrExpression__OrEltsAssignment_4 )* ) ) )
            // InternalDdParser.g:4438:1: ( ( ( rule__OrExpression__OrEltsAssignment_4 ) ) ( ( rule__OrExpression__OrEltsAssignment_4 )* ) )
            {
            // InternalDdParser.g:4438:1: ( ( ( rule__OrExpression__OrEltsAssignment_4 ) ) ( ( rule__OrExpression__OrEltsAssignment_4 )* ) )
            // InternalDdParser.g:4439:2: ( ( rule__OrExpression__OrEltsAssignment_4 ) ) ( ( rule__OrExpression__OrEltsAssignment_4 )* )
            {
            // InternalDdParser.g:4439:2: ( ( rule__OrExpression__OrEltsAssignment_4 ) )
            // InternalDdParser.g:4440:3: ( rule__OrExpression__OrEltsAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOrEltsAssignment_4()); 
            }
            // InternalDdParser.g:4441:3: ( rule__OrExpression__OrEltsAssignment_4 )
            // InternalDdParser.g:4441:4: rule__OrExpression__OrEltsAssignment_4
            {
            pushFollow(FOLLOW_36);
            rule__OrExpression__OrEltsAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionAccess().getOrEltsAssignment_4()); 
            }

            }

            // InternalDdParser.g:4444:2: ( ( rule__OrExpression__OrEltsAssignment_4 )* )
            // InternalDdParser.g:4445:3: ( rule__OrExpression__OrEltsAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOrEltsAssignment_4()); 
            }
            // InternalDdParser.g:4446:3: ( rule__OrExpression__OrEltsAssignment_4 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==Or) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalDdParser.g:4446:4: rule__OrExpression__OrEltsAssignment_4
            	    {
            	    pushFollow(FOLLOW_36);
            	    rule__OrExpression__OrEltsAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionAccess().getOrEltsAssignment_4()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group__4__Impl"


    // $ANTLR start "rule__OrExpression__Group__5"
    // InternalDdParser.g:4455:1: rule__OrExpression__Group__5 : rule__OrExpression__Group__5__Impl rule__OrExpression__Group__6 ;
    public final void rule__OrExpression__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:4459:1: ( rule__OrExpression__Group__5__Impl rule__OrExpression__Group__6 )
            // InternalDdParser.g:4460:2: rule__OrExpression__Group__5__Impl rule__OrExpression__Group__6
            {
            pushFollow(FOLLOW_28);
            rule__OrExpression__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OrExpression__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group__5"


    // $ANTLR start "rule__OrExpression__Group__5__Impl"
    // InternalDdParser.g:4467:1: rule__OrExpression__Group__5__Impl : ( RightParenthesis ) ;
    public final void rule__OrExpression__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:4471:1: ( ( RightParenthesis ) )
            // InternalDdParser.g:4472:1: ( RightParenthesis )
            {
            // InternalDdParser.g:4472:1: ( RightParenthesis )
            // InternalDdParser.g:4473:2: RightParenthesis
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getRightParenthesisKeyword_5()); 
            }
            match(input,RightParenthesis,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionAccess().getRightParenthesisKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group__5__Impl"


    // $ANTLR start "rule__OrExpression__Group__6"
    // InternalDdParser.g:4482:1: rule__OrExpression__Group__6 : rule__OrExpression__Group__6__Impl ;
    public final void rule__OrExpression__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:4486:1: ( rule__OrExpression__Group__6__Impl )
            // InternalDdParser.g:4487:2: rule__OrExpression__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrExpression__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group__6"


    // $ANTLR start "rule__OrExpression__Group__6__Impl"
    // InternalDdParser.g:4493:1: rule__OrExpression__Group__6__Impl : ( ( rule__OrExpression__CheckedAssignment_6 )? ) ;
    public final void rule__OrExpression__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:4497:1: ( ( ( rule__OrExpression__CheckedAssignment_6 )? ) )
            // InternalDdParser.g:4498:1: ( ( rule__OrExpression__CheckedAssignment_6 )? )
            {
            // InternalDdParser.g:4498:1: ( ( rule__OrExpression__CheckedAssignment_6 )? )
            // InternalDdParser.g:4499:2: ( rule__OrExpression__CheckedAssignment_6 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getCheckedAssignment_6()); 
            }
            // InternalDdParser.g:4500:2: ( rule__OrExpression__CheckedAssignment_6 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_NULL) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalDdParser.g:4500:3: rule__OrExpression__CheckedAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__OrExpression__CheckedAssignment_6();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionAccess().getCheckedAssignment_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group__6__Impl"


    // $ANTLR start "rule__OrExpressionElt__Group__0"
    // InternalDdParser.g:4509:1: rule__OrExpressionElt__Group__0 : rule__OrExpressionElt__Group__0__Impl rule__OrExpressionElt__Group__1 ;
    public final void rule__OrExpressionElt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:4513:1: ( rule__OrExpressionElt__Group__0__Impl rule__OrExpressionElt__Group__1 )
            // InternalDdParser.g:4514:2: rule__OrExpressionElt__Group__0__Impl rule__OrExpressionElt__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__OrExpressionElt__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OrExpressionElt__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpressionElt__Group__0"


    // $ANTLR start "rule__OrExpressionElt__Group__0__Impl"
    // InternalDdParser.g:4521:1: rule__OrExpressionElt__Group__0__Impl : ( ( rule__OrExpressionElt__OpAssignment_0 ) ) ;
    public final void rule__OrExpressionElt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:4525:1: ( ( ( rule__OrExpressionElt__OpAssignment_0 ) ) )
            // InternalDdParser.g:4526:1: ( ( rule__OrExpressionElt__OpAssignment_0 ) )
            {
            // InternalDdParser.g:4526:1: ( ( rule__OrExpressionElt__OpAssignment_0 ) )
            // InternalDdParser.g:4527:2: ( rule__OrExpressionElt__OpAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionEltAccess().getOpAssignment_0()); 
            }
            // InternalDdParser.g:4528:2: ( rule__OrExpressionElt__OpAssignment_0 )
            // InternalDdParser.g:4528:3: rule__OrExpressionElt__OpAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__OrExpressionElt__OpAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionEltAccess().getOpAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpressionElt__Group__0__Impl"


    // $ANTLR start "rule__OrExpressionElt__Group__1"
    // InternalDdParser.g:4536:1: rule__OrExpressionElt__Group__1 : rule__OrExpressionElt__Group__1__Impl ;
    public final void rule__OrExpressionElt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:4540:1: ( rule__OrExpressionElt__Group__1__Impl )
            // InternalDdParser.g:4541:2: rule__OrExpressionElt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrExpressionElt__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpressionElt__Group__1"


    // $ANTLR start "rule__OrExpressionElt__Group__1__Impl"
    // InternalDdParser.g:4547:1: rule__OrExpressionElt__Group__1__Impl : ( ( rule__OrExpressionElt__RightAssignment_1 ) ) ;
    public final void rule__OrExpressionElt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:4551:1: ( ( ( rule__OrExpressionElt__RightAssignment_1 ) ) )
            // InternalDdParser.g:4552:1: ( ( rule__OrExpressionElt__RightAssignment_1 ) )
            {
            // InternalDdParser.g:4552:1: ( ( rule__OrExpressionElt__RightAssignment_1 ) )
            // InternalDdParser.g:4553:2: ( rule__OrExpressionElt__RightAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionEltAccess().getRightAssignment_1()); 
            }
            // InternalDdParser.g:4554:2: ( rule__OrExpressionElt__RightAssignment_1 )
            // InternalDdParser.g:4554:3: rule__OrExpressionElt__RightAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__OrExpressionElt__RightAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionEltAccess().getRightAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpressionElt__Group__1__Impl"


    // $ANTLR start "rule__CatExpression__Group__0"
    // InternalDdParser.g:4563:1: rule__CatExpression__Group__0 : rule__CatExpression__Group__0__Impl rule__CatExpression__Group__1 ;
    public final void rule__CatExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:4567:1: ( rule__CatExpression__Group__0__Impl rule__CatExpression__Group__1 )
            // InternalDdParser.g:4568:2: rule__CatExpression__Group__0__Impl rule__CatExpression__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__CatExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CatExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CatExpression__Group__0"


    // $ANTLR start "rule__CatExpression__Group__0__Impl"
    // InternalDdParser.g:4575:1: rule__CatExpression__Group__0__Impl : ( LeftParenthesis ) ;
    public final void rule__CatExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:4579:1: ( ( LeftParenthesis ) )
            // InternalDdParser.g:4580:1: ( LeftParenthesis )
            {
            // InternalDdParser.g:4580:1: ( LeftParenthesis )
            // InternalDdParser.g:4581:2: LeftParenthesis
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCatExpressionAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,LeftParenthesis,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCatExpressionAccess().getLeftParenthesisKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CatExpression__Group__0__Impl"


    // $ANTLR start "rule__CatExpression__Group__1"
    // InternalDdParser.g:4590:1: rule__CatExpression__Group__1 : rule__CatExpression__Group__1__Impl rule__CatExpression__Group__2 ;
    public final void rule__CatExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:4594:1: ( rule__CatExpression__Group__1__Impl rule__CatExpression__Group__2 )
            // InternalDdParser.g:4595:2: rule__CatExpression__Group__1__Impl rule__CatExpression__Group__2
            {
            pushFollow(FOLLOW_37);
            rule__CatExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CatExpression__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CatExpression__Group__1"


    // $ANTLR start "rule__CatExpression__Group__1__Impl"
    // InternalDdParser.g:4602:1: rule__CatExpression__Group__1__Impl : ( ( rule__CatExpression__LeftAssignment_1 ) ) ;
    public final void rule__CatExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:4606:1: ( ( ( rule__CatExpression__LeftAssignment_1 ) ) )
            // InternalDdParser.g:4607:1: ( ( rule__CatExpression__LeftAssignment_1 ) )
            {
            // InternalDdParser.g:4607:1: ( ( rule__CatExpression__LeftAssignment_1 ) )
            // InternalDdParser.g:4608:2: ( rule__CatExpression__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCatExpressionAccess().getLeftAssignment_1()); 
            }
            // InternalDdParser.g:4609:2: ( rule__CatExpression__LeftAssignment_1 )
            // InternalDdParser.g:4609:3: rule__CatExpression__LeftAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CatExpression__LeftAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCatExpressionAccess().getLeftAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CatExpression__Group__1__Impl"


    // $ANTLR start "rule__CatExpression__Group__2"
    // InternalDdParser.g:4617:1: rule__CatExpression__Group__2 : rule__CatExpression__Group__2__Impl rule__CatExpression__Group__3 ;
    public final void rule__CatExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:4621:1: ( rule__CatExpression__Group__2__Impl rule__CatExpression__Group__3 )
            // InternalDdParser.g:4622:2: rule__CatExpression__Group__2__Impl rule__CatExpression__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__CatExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CatExpression__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CatExpression__Group__2"


    // $ANTLR start "rule__CatExpression__Group__2__Impl"
    // InternalDdParser.g:4629:1: rule__CatExpression__Group__2__Impl : ( ( rule__CatExpression__OpAssignment_2 ) ) ;
    public final void rule__CatExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:4633:1: ( ( ( rule__CatExpression__OpAssignment_2 ) ) )
            // InternalDdParser.g:4634:1: ( ( rule__CatExpression__OpAssignment_2 ) )
            {
            // InternalDdParser.g:4634:1: ( ( rule__CatExpression__OpAssignment_2 ) )
            // InternalDdParser.g:4635:2: ( rule__CatExpression__OpAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCatExpressionAccess().getOpAssignment_2()); 
            }
            // InternalDdParser.g:4636:2: ( rule__CatExpression__OpAssignment_2 )
            // InternalDdParser.g:4636:3: rule__CatExpression__OpAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__CatExpression__OpAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCatExpressionAccess().getOpAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CatExpression__Group__2__Impl"


    // $ANTLR start "rule__CatExpression__Group__3"
    // InternalDdParser.g:4644:1: rule__CatExpression__Group__3 : rule__CatExpression__Group__3__Impl rule__CatExpression__Group__4 ;
    public final void rule__CatExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:4648:1: ( rule__CatExpression__Group__3__Impl rule__CatExpression__Group__4 )
            // InternalDdParser.g:4649:2: rule__CatExpression__Group__3__Impl rule__CatExpression__Group__4
            {
            pushFollow(FOLLOW_37);
            rule__CatExpression__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CatExpression__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CatExpression__Group__3"


    // $ANTLR start "rule__CatExpression__Group__3__Impl"
    // InternalDdParser.g:4656:1: rule__CatExpression__Group__3__Impl : ( ( rule__CatExpression__RightAssignment_3 ) ) ;
    public final void rule__CatExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:4660:1: ( ( ( rule__CatExpression__RightAssignment_3 ) ) )
            // InternalDdParser.g:4661:1: ( ( rule__CatExpression__RightAssignment_3 ) )
            {
            // InternalDdParser.g:4661:1: ( ( rule__CatExpression__RightAssignment_3 ) )
            // InternalDdParser.g:4662:2: ( rule__CatExpression__RightAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCatExpressionAccess().getRightAssignment_3()); 
            }
            // InternalDdParser.g:4663:2: ( rule__CatExpression__RightAssignment_3 )
            // InternalDdParser.g:4663:3: rule__CatExpression__RightAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__CatExpression__RightAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCatExpressionAccess().getRightAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CatExpression__Group__3__Impl"


    // $ANTLR start "rule__CatExpression__Group__4"
    // InternalDdParser.g:4671:1: rule__CatExpression__Group__4 : rule__CatExpression__Group__4__Impl rule__CatExpression__Group__5 ;
    public final void rule__CatExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:4675:1: ( rule__CatExpression__Group__4__Impl rule__CatExpression__Group__5 )
            // InternalDdParser.g:4676:2: rule__CatExpression__Group__4__Impl rule__CatExpression__Group__5
            {
            pushFollow(FOLLOW_27);
            rule__CatExpression__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CatExpression__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CatExpression__Group__4"


    // $ANTLR start "rule__CatExpression__Group__4__Impl"
    // InternalDdParser.g:4683:1: rule__CatExpression__Group__4__Impl : ( ( ( rule__CatExpression__CatEltsAssignment_4 ) ) ( ( rule__CatExpression__CatEltsAssignment_4 )* ) ) ;
    public final void rule__CatExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:4687:1: ( ( ( ( rule__CatExpression__CatEltsAssignment_4 ) ) ( ( rule__CatExpression__CatEltsAssignment_4 )* ) ) )
            // InternalDdParser.g:4688:1: ( ( ( rule__CatExpression__CatEltsAssignment_4 ) ) ( ( rule__CatExpression__CatEltsAssignment_4 )* ) )
            {
            // InternalDdParser.g:4688:1: ( ( ( rule__CatExpression__CatEltsAssignment_4 ) ) ( ( rule__CatExpression__CatEltsAssignment_4 )* ) )
            // InternalDdParser.g:4689:2: ( ( rule__CatExpression__CatEltsAssignment_4 ) ) ( ( rule__CatExpression__CatEltsAssignment_4 )* )
            {
            // InternalDdParser.g:4689:2: ( ( rule__CatExpression__CatEltsAssignment_4 ) )
            // InternalDdParser.g:4690:3: ( rule__CatExpression__CatEltsAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCatExpressionAccess().getCatEltsAssignment_4()); 
            }
            // InternalDdParser.g:4691:3: ( rule__CatExpression__CatEltsAssignment_4 )
            // InternalDdParser.g:4691:4: rule__CatExpression__CatEltsAssignment_4
            {
            pushFollow(FOLLOW_38);
            rule__CatExpression__CatEltsAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCatExpressionAccess().getCatEltsAssignment_4()); 
            }

            }

            // InternalDdParser.g:4694:2: ( ( rule__CatExpression__CatEltsAssignment_4 )* )
            // InternalDdParser.g:4695:3: ( rule__CatExpression__CatEltsAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCatExpressionAccess().getCatEltsAssignment_4()); 
            }
            // InternalDdParser.g:4696:3: ( rule__CatExpression__CatEltsAssignment_4 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==Ampersand) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalDdParser.g:4696:4: rule__CatExpression__CatEltsAssignment_4
            	    {
            	    pushFollow(FOLLOW_38);
            	    rule__CatExpression__CatEltsAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCatExpressionAccess().getCatEltsAssignment_4()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CatExpression__Group__4__Impl"


    // $ANTLR start "rule__CatExpression__Group__5"
    // InternalDdParser.g:4705:1: rule__CatExpression__Group__5 : rule__CatExpression__Group__5__Impl rule__CatExpression__Group__6 ;
    public final void rule__CatExpression__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:4709:1: ( rule__CatExpression__Group__5__Impl rule__CatExpression__Group__6 )
            // InternalDdParser.g:4710:2: rule__CatExpression__Group__5__Impl rule__CatExpression__Group__6
            {
            pushFollow(FOLLOW_28);
            rule__CatExpression__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CatExpression__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CatExpression__Group__5"


    // $ANTLR start "rule__CatExpression__Group__5__Impl"
    // InternalDdParser.g:4717:1: rule__CatExpression__Group__5__Impl : ( RightParenthesis ) ;
    public final void rule__CatExpression__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:4721:1: ( ( RightParenthesis ) )
            // InternalDdParser.g:4722:1: ( RightParenthesis )
            {
            // InternalDdParser.g:4722:1: ( RightParenthesis )
            // InternalDdParser.g:4723:2: RightParenthesis
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCatExpressionAccess().getRightParenthesisKeyword_5()); 
            }
            match(input,RightParenthesis,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCatExpressionAccess().getRightParenthesisKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CatExpression__Group__5__Impl"


    // $ANTLR start "rule__CatExpression__Group__6"
    // InternalDdParser.g:4732:1: rule__CatExpression__Group__6 : rule__CatExpression__Group__6__Impl ;
    public final void rule__CatExpression__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:4736:1: ( rule__CatExpression__Group__6__Impl )
            // InternalDdParser.g:4737:2: rule__CatExpression__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CatExpression__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CatExpression__Group__6"


    // $ANTLR start "rule__CatExpression__Group__6__Impl"
    // InternalDdParser.g:4743:1: rule__CatExpression__Group__6__Impl : ( ( rule__CatExpression__CheckedAssignment_6 )? ) ;
    public final void rule__CatExpression__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:4747:1: ( ( ( rule__CatExpression__CheckedAssignment_6 )? ) )
            // InternalDdParser.g:4748:1: ( ( rule__CatExpression__CheckedAssignment_6 )? )
            {
            // InternalDdParser.g:4748:1: ( ( rule__CatExpression__CheckedAssignment_6 )? )
            // InternalDdParser.g:4749:2: ( rule__CatExpression__CheckedAssignment_6 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCatExpressionAccess().getCheckedAssignment_6()); 
            }
            // InternalDdParser.g:4750:2: ( rule__CatExpression__CheckedAssignment_6 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_NULL) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalDdParser.g:4750:3: rule__CatExpression__CheckedAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__CatExpression__CheckedAssignment_6();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCatExpressionAccess().getCheckedAssignment_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CatExpression__Group__6__Impl"


    // $ANTLR start "rule__CatExpressionElt__Group__0"
    // InternalDdParser.g:4759:1: rule__CatExpressionElt__Group__0 : rule__CatExpressionElt__Group__0__Impl rule__CatExpressionElt__Group__1 ;
    public final void rule__CatExpressionElt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:4763:1: ( rule__CatExpressionElt__Group__0__Impl rule__CatExpressionElt__Group__1 )
            // InternalDdParser.g:4764:2: rule__CatExpressionElt__Group__0__Impl rule__CatExpressionElt__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__CatExpressionElt__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CatExpressionElt__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CatExpressionElt__Group__0"


    // $ANTLR start "rule__CatExpressionElt__Group__0__Impl"
    // InternalDdParser.g:4771:1: rule__CatExpressionElt__Group__0__Impl : ( ( rule__CatExpressionElt__OpAssignment_0 ) ) ;
    public final void rule__CatExpressionElt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:4775:1: ( ( ( rule__CatExpressionElt__OpAssignment_0 ) ) )
            // InternalDdParser.g:4776:1: ( ( rule__CatExpressionElt__OpAssignment_0 ) )
            {
            // InternalDdParser.g:4776:1: ( ( rule__CatExpressionElt__OpAssignment_0 ) )
            // InternalDdParser.g:4777:2: ( rule__CatExpressionElt__OpAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCatExpressionEltAccess().getOpAssignment_0()); 
            }
            // InternalDdParser.g:4778:2: ( rule__CatExpressionElt__OpAssignment_0 )
            // InternalDdParser.g:4778:3: rule__CatExpressionElt__OpAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__CatExpressionElt__OpAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCatExpressionEltAccess().getOpAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CatExpressionElt__Group__0__Impl"


    // $ANTLR start "rule__CatExpressionElt__Group__1"
    // InternalDdParser.g:4786:1: rule__CatExpressionElt__Group__1 : rule__CatExpressionElt__Group__1__Impl ;
    public final void rule__CatExpressionElt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:4790:1: ( rule__CatExpressionElt__Group__1__Impl )
            // InternalDdParser.g:4791:2: rule__CatExpressionElt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CatExpressionElt__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CatExpressionElt__Group__1"


    // $ANTLR start "rule__CatExpressionElt__Group__1__Impl"
    // InternalDdParser.g:4797:1: rule__CatExpressionElt__Group__1__Impl : ( ( rule__CatExpressionElt__RightAssignment_1 ) ) ;
    public final void rule__CatExpressionElt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:4801:1: ( ( ( rule__CatExpressionElt__RightAssignment_1 ) ) )
            // InternalDdParser.g:4802:1: ( ( rule__CatExpressionElt__RightAssignment_1 ) )
            {
            // InternalDdParser.g:4802:1: ( ( rule__CatExpressionElt__RightAssignment_1 ) )
            // InternalDdParser.g:4803:2: ( rule__CatExpressionElt__RightAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCatExpressionEltAccess().getRightAssignment_1()); 
            }
            // InternalDdParser.g:4804:2: ( rule__CatExpressionElt__RightAssignment_1 )
            // InternalDdParser.g:4804:3: rule__CatExpressionElt__RightAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CatExpressionElt__RightAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCatExpressionEltAccess().getRightAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CatExpressionElt__Group__1__Impl"


    // $ANTLR start "rule__ListExpression__Group__0"
    // InternalDdParser.g:4813:1: rule__ListExpression__Group__0 : rule__ListExpression__Group__0__Impl rule__ListExpression__Group__1 ;
    public final void rule__ListExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:4817:1: ( rule__ListExpression__Group__0__Impl rule__ListExpression__Group__1 )
            // InternalDdParser.g:4818:2: rule__ListExpression__Group__0__Impl rule__ListExpression__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__ListExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ListExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListExpression__Group__0"


    // $ANTLR start "rule__ListExpression__Group__0__Impl"
    // InternalDdParser.g:4825:1: rule__ListExpression__Group__0__Impl : ( ( rule__ListExpression__OpAssignment_0 ) ) ;
    public final void rule__ListExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:4829:1: ( ( ( rule__ListExpression__OpAssignment_0 ) ) )
            // InternalDdParser.g:4830:1: ( ( rule__ListExpression__OpAssignment_0 ) )
            {
            // InternalDdParser.g:4830:1: ( ( rule__ListExpression__OpAssignment_0 ) )
            // InternalDdParser.g:4831:2: ( rule__ListExpression__OpAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getOpAssignment_0()); 
            }
            // InternalDdParser.g:4832:2: ( rule__ListExpression__OpAssignment_0 )
            // InternalDdParser.g:4832:3: rule__ListExpression__OpAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ListExpression__OpAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getOpAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListExpression__Group__0__Impl"


    // $ANTLR start "rule__ListExpression__Group__1"
    // InternalDdParser.g:4840:1: rule__ListExpression__Group__1 : rule__ListExpression__Group__1__Impl rule__ListExpression__Group__2 ;
    public final void rule__ListExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:4844:1: ( rule__ListExpression__Group__1__Impl rule__ListExpression__Group__2 )
            // InternalDdParser.g:4845:2: rule__ListExpression__Group__1__Impl rule__ListExpression__Group__2
            {
            pushFollow(FOLLOW_39);
            rule__ListExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ListExpression__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListExpression__Group__1"


    // $ANTLR start "rule__ListExpression__Group__1__Impl"
    // InternalDdParser.g:4852:1: rule__ListExpression__Group__1__Impl : ( ( rule__ListExpression__LeftAssignment_1 ) ) ;
    public final void rule__ListExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:4856:1: ( ( ( rule__ListExpression__LeftAssignment_1 ) ) )
            // InternalDdParser.g:4857:1: ( ( rule__ListExpression__LeftAssignment_1 ) )
            {
            // InternalDdParser.g:4857:1: ( ( rule__ListExpression__LeftAssignment_1 ) )
            // InternalDdParser.g:4858:2: ( rule__ListExpression__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getLeftAssignment_1()); 
            }
            // InternalDdParser.g:4859:2: ( rule__ListExpression__LeftAssignment_1 )
            // InternalDdParser.g:4859:3: rule__ListExpression__LeftAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ListExpression__LeftAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getLeftAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListExpression__Group__1__Impl"


    // $ANTLR start "rule__ListExpression__Group__2"
    // InternalDdParser.g:4867:1: rule__ListExpression__Group__2 : rule__ListExpression__Group__2__Impl rule__ListExpression__Group__3 ;
    public final void rule__ListExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:4871:1: ( rule__ListExpression__Group__2__Impl rule__ListExpression__Group__3 )
            // InternalDdParser.g:4872:2: rule__ListExpression__Group__2__Impl rule__ListExpression__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__ListExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ListExpression__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListExpression__Group__2"


    // $ANTLR start "rule__ListExpression__Group__2__Impl"
    // InternalDdParser.g:4879:1: rule__ListExpression__Group__2__Impl : ( ( ( rule__ListExpression__ListEltsAssignment_2 ) ) ( ( rule__ListExpression__ListEltsAssignment_2 )* ) ) ;
    public final void rule__ListExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:4883:1: ( ( ( ( rule__ListExpression__ListEltsAssignment_2 ) ) ( ( rule__ListExpression__ListEltsAssignment_2 )* ) ) )
            // InternalDdParser.g:4884:1: ( ( ( rule__ListExpression__ListEltsAssignment_2 ) ) ( ( rule__ListExpression__ListEltsAssignment_2 )* ) )
            {
            // InternalDdParser.g:4884:1: ( ( ( rule__ListExpression__ListEltsAssignment_2 ) ) ( ( rule__ListExpression__ListEltsAssignment_2 )* ) )
            // InternalDdParser.g:4885:2: ( ( rule__ListExpression__ListEltsAssignment_2 ) ) ( ( rule__ListExpression__ListEltsAssignment_2 )* )
            {
            // InternalDdParser.g:4885:2: ( ( rule__ListExpression__ListEltsAssignment_2 ) )
            // InternalDdParser.g:4886:3: ( rule__ListExpression__ListEltsAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getListEltsAssignment_2()); 
            }
            // InternalDdParser.g:4887:3: ( rule__ListExpression__ListEltsAssignment_2 )
            // InternalDdParser.g:4887:4: rule__ListExpression__ListEltsAssignment_2
            {
            pushFollow(FOLLOW_40);
            rule__ListExpression__ListEltsAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getListEltsAssignment_2()); 
            }

            }

            // InternalDdParser.g:4890:2: ( ( rule__ListExpression__ListEltsAssignment_2 )* )
            // InternalDdParser.g:4891:3: ( rule__ListExpression__ListEltsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getListEltsAssignment_2()); 
            }
            // InternalDdParser.g:4892:3: ( rule__ListExpression__ListEltsAssignment_2 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==Comma) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalDdParser.g:4892:4: rule__ListExpression__ListEltsAssignment_2
            	    {
            	    pushFollow(FOLLOW_40);
            	    rule__ListExpression__ListEltsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getListEltsAssignment_2()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListExpression__Group__2__Impl"


    // $ANTLR start "rule__ListExpression__Group__3"
    // InternalDdParser.g:4901:1: rule__ListExpression__Group__3 : rule__ListExpression__Group__3__Impl rule__ListExpression__Group__4 ;
    public final void rule__ListExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:4905:1: ( rule__ListExpression__Group__3__Impl rule__ListExpression__Group__4 )
            // InternalDdParser.g:4906:2: rule__ListExpression__Group__3__Impl rule__ListExpression__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__ListExpression__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ListExpression__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListExpression__Group__3"


    // $ANTLR start "rule__ListExpression__Group__3__Impl"
    // InternalDdParser.g:4913:1: rule__ListExpression__Group__3__Impl : ( RightParenthesis ) ;
    public final void rule__ListExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:4917:1: ( ( RightParenthesis ) )
            // InternalDdParser.g:4918:1: ( RightParenthesis )
            {
            // InternalDdParser.g:4918:1: ( RightParenthesis )
            // InternalDdParser.g:4919:2: RightParenthesis
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,RightParenthesis,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getRightParenthesisKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListExpression__Group__3__Impl"


    // $ANTLR start "rule__ListExpression__Group__4"
    // InternalDdParser.g:4928:1: rule__ListExpression__Group__4 : rule__ListExpression__Group__4__Impl ;
    public final void rule__ListExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:4932:1: ( rule__ListExpression__Group__4__Impl )
            // InternalDdParser.g:4933:2: rule__ListExpression__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListExpression__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListExpression__Group__4"


    // $ANTLR start "rule__ListExpression__Group__4__Impl"
    // InternalDdParser.g:4939:1: rule__ListExpression__Group__4__Impl : ( ( rule__ListExpression__Group_4__0 )? ) ;
    public final void rule__ListExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:4943:1: ( ( ( rule__ListExpression__Group_4__0 )? ) )
            // InternalDdParser.g:4944:1: ( ( rule__ListExpression__Group_4__0 )? )
            {
            // InternalDdParser.g:4944:1: ( ( rule__ListExpression__Group_4__0 )? )
            // InternalDdParser.g:4945:2: ( rule__ListExpression__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getGroup_4()); 
            }
            // InternalDdParser.g:4946:2: ( rule__ListExpression__Group_4__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_NULL) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalDdParser.g:4946:3: rule__ListExpression__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ListExpression__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListExpression__Group__4__Impl"


    // $ANTLR start "rule__ListExpression__Group_4__0"
    // InternalDdParser.g:4955:1: rule__ListExpression__Group_4__0 : rule__ListExpression__Group_4__0__Impl rule__ListExpression__Group_4__1 ;
    public final void rule__ListExpression__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:4959:1: ( rule__ListExpression__Group_4__0__Impl rule__ListExpression__Group_4__1 )
            // InternalDdParser.g:4960:2: rule__ListExpression__Group_4__0__Impl rule__ListExpression__Group_4__1
            {
            pushFollow(FOLLOW_28);
            rule__ListExpression__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ListExpression__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListExpression__Group_4__0"


    // $ANTLR start "rule__ListExpression__Group_4__0__Impl"
    // InternalDdParser.g:4967:1: rule__ListExpression__Group_4__0__Impl : ( ( rule__ListExpression__NumTypeAssignment_4_0 ) ) ;
    public final void rule__ListExpression__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:4971:1: ( ( ( rule__ListExpression__NumTypeAssignment_4_0 ) ) )
            // InternalDdParser.g:4972:1: ( ( rule__ListExpression__NumTypeAssignment_4_0 ) )
            {
            // InternalDdParser.g:4972:1: ( ( rule__ListExpression__NumTypeAssignment_4_0 ) )
            // InternalDdParser.g:4973:2: ( rule__ListExpression__NumTypeAssignment_4_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getNumTypeAssignment_4_0()); 
            }
            // InternalDdParser.g:4974:2: ( rule__ListExpression__NumTypeAssignment_4_0 )
            // InternalDdParser.g:4974:3: rule__ListExpression__NumTypeAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__ListExpression__NumTypeAssignment_4_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getNumTypeAssignment_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListExpression__Group_4__0__Impl"


    // $ANTLR start "rule__ListExpression__Group_4__1"
    // InternalDdParser.g:4982:1: rule__ListExpression__Group_4__1 : rule__ListExpression__Group_4__1__Impl rule__ListExpression__Group_4__2 ;
    public final void rule__ListExpression__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:4986:1: ( rule__ListExpression__Group_4__1__Impl rule__ListExpression__Group_4__2 )
            // InternalDdParser.g:4987:2: rule__ListExpression__Group_4__1__Impl rule__ListExpression__Group_4__2
            {
            pushFollow(FOLLOW_28);
            rule__ListExpression__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ListExpression__Group_4__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListExpression__Group_4__1"


    // $ANTLR start "rule__ListExpression__Group_4__1__Impl"
    // InternalDdParser.g:4994:1: rule__ListExpression__Group_4__1__Impl : ( ( rule__ListExpression__StrTypeAssignment_4_1 ) ) ;
    public final void rule__ListExpression__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:4998:1: ( ( ( rule__ListExpression__StrTypeAssignment_4_1 ) ) )
            // InternalDdParser.g:4999:1: ( ( rule__ListExpression__StrTypeAssignment_4_1 ) )
            {
            // InternalDdParser.g:4999:1: ( ( rule__ListExpression__StrTypeAssignment_4_1 ) )
            // InternalDdParser.g:5000:2: ( rule__ListExpression__StrTypeAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getStrTypeAssignment_4_1()); 
            }
            // InternalDdParser.g:5001:2: ( rule__ListExpression__StrTypeAssignment_4_1 )
            // InternalDdParser.g:5001:3: rule__ListExpression__StrTypeAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ListExpression__StrTypeAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getStrTypeAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListExpression__Group_4__1__Impl"


    // $ANTLR start "rule__ListExpression__Group_4__2"
    // InternalDdParser.g:5009:1: rule__ListExpression__Group_4__2 : rule__ListExpression__Group_4__2__Impl rule__ListExpression__Group_4__3 ;
    public final void rule__ListExpression__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:5013:1: ( rule__ListExpression__Group_4__2__Impl rule__ListExpression__Group_4__3 )
            // InternalDdParser.g:5014:2: rule__ListExpression__Group_4__2__Impl rule__ListExpression__Group_4__3
            {
            pushFollow(FOLLOW_28);
            rule__ListExpression__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ListExpression__Group_4__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListExpression__Group_4__2"


    // $ANTLR start "rule__ListExpression__Group_4__2__Impl"
    // InternalDdParser.g:5021:1: rule__ListExpression__Group_4__2__Impl : ( ( rule__ListExpression__DateTypeAssignment_4_2 ) ) ;
    public final void rule__ListExpression__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:5025:1: ( ( ( rule__ListExpression__DateTypeAssignment_4_2 ) ) )
            // InternalDdParser.g:5026:1: ( ( rule__ListExpression__DateTypeAssignment_4_2 ) )
            {
            // InternalDdParser.g:5026:1: ( ( rule__ListExpression__DateTypeAssignment_4_2 ) )
            // InternalDdParser.g:5027:2: ( rule__ListExpression__DateTypeAssignment_4_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getDateTypeAssignment_4_2()); 
            }
            // InternalDdParser.g:5028:2: ( rule__ListExpression__DateTypeAssignment_4_2 )
            // InternalDdParser.g:5028:3: rule__ListExpression__DateTypeAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__ListExpression__DateTypeAssignment_4_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getDateTypeAssignment_4_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListExpression__Group_4__2__Impl"


    // $ANTLR start "rule__ListExpression__Group_4__3"
    // InternalDdParser.g:5036:1: rule__ListExpression__Group_4__3 : rule__ListExpression__Group_4__3__Impl ;
    public final void rule__ListExpression__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:5040:1: ( rule__ListExpression__Group_4__3__Impl )
            // InternalDdParser.g:5041:2: rule__ListExpression__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListExpression__Group_4__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListExpression__Group_4__3"


    // $ANTLR start "rule__ListExpression__Group_4__3__Impl"
    // InternalDdParser.g:5047:1: rule__ListExpression__Group_4__3__Impl : ( ( rule__ListExpression__BoolTypeAssignment_4_3 ) ) ;
    public final void rule__ListExpression__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:5051:1: ( ( ( rule__ListExpression__BoolTypeAssignment_4_3 ) ) )
            // InternalDdParser.g:5052:1: ( ( rule__ListExpression__BoolTypeAssignment_4_3 ) )
            {
            // InternalDdParser.g:5052:1: ( ( rule__ListExpression__BoolTypeAssignment_4_3 ) )
            // InternalDdParser.g:5053:2: ( rule__ListExpression__BoolTypeAssignment_4_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getBoolTypeAssignment_4_3()); 
            }
            // InternalDdParser.g:5054:2: ( rule__ListExpression__BoolTypeAssignment_4_3 )
            // InternalDdParser.g:5054:3: rule__ListExpression__BoolTypeAssignment_4_3
            {
            pushFollow(FOLLOW_2);
            rule__ListExpression__BoolTypeAssignment_4_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getBoolTypeAssignment_4_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListExpression__Group_4__3__Impl"


    // $ANTLR start "rule__ListExpressionElt__Group__0"
    // InternalDdParser.g:5063:1: rule__ListExpressionElt__Group__0 : rule__ListExpressionElt__Group__0__Impl rule__ListExpressionElt__Group__1 ;
    public final void rule__ListExpressionElt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:5067:1: ( rule__ListExpressionElt__Group__0__Impl rule__ListExpressionElt__Group__1 )
            // InternalDdParser.g:5068:2: rule__ListExpressionElt__Group__0__Impl rule__ListExpressionElt__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__ListExpressionElt__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ListExpressionElt__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListExpressionElt__Group__0"


    // $ANTLR start "rule__ListExpressionElt__Group__0__Impl"
    // InternalDdParser.g:5075:1: rule__ListExpressionElt__Group__0__Impl : ( ( rule__ListExpressionElt__OpAssignment_0 ) ) ;
    public final void rule__ListExpressionElt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:5079:1: ( ( ( rule__ListExpressionElt__OpAssignment_0 ) ) )
            // InternalDdParser.g:5080:1: ( ( rule__ListExpressionElt__OpAssignment_0 ) )
            {
            // InternalDdParser.g:5080:1: ( ( rule__ListExpressionElt__OpAssignment_0 ) )
            // InternalDdParser.g:5081:2: ( rule__ListExpressionElt__OpAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionEltAccess().getOpAssignment_0()); 
            }
            // InternalDdParser.g:5082:2: ( rule__ListExpressionElt__OpAssignment_0 )
            // InternalDdParser.g:5082:3: rule__ListExpressionElt__OpAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ListExpressionElt__OpAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionEltAccess().getOpAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListExpressionElt__Group__0__Impl"


    // $ANTLR start "rule__ListExpressionElt__Group__1"
    // InternalDdParser.g:5090:1: rule__ListExpressionElt__Group__1 : rule__ListExpressionElt__Group__1__Impl ;
    public final void rule__ListExpressionElt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:5094:1: ( rule__ListExpressionElt__Group__1__Impl )
            // InternalDdParser.g:5095:2: rule__ListExpressionElt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListExpressionElt__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListExpressionElt__Group__1"


    // $ANTLR start "rule__ListExpressionElt__Group__1__Impl"
    // InternalDdParser.g:5101:1: rule__ListExpressionElt__Group__1__Impl : ( ( rule__ListExpressionElt__RightAssignment_1 ) ) ;
    public final void rule__ListExpressionElt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:5105:1: ( ( ( rule__ListExpressionElt__RightAssignment_1 ) ) )
            // InternalDdParser.g:5106:1: ( ( rule__ListExpressionElt__RightAssignment_1 ) )
            {
            // InternalDdParser.g:5106:1: ( ( rule__ListExpressionElt__RightAssignment_1 ) )
            // InternalDdParser.g:5107:2: ( rule__ListExpressionElt__RightAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionEltAccess().getRightAssignment_1()); 
            }
            // InternalDdParser.g:5108:2: ( rule__ListExpressionElt__RightAssignment_1 )
            // InternalDdParser.g:5108:3: rule__ListExpressionElt__RightAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ListExpressionElt__RightAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionEltAccess().getRightAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListExpressionElt__Group__1__Impl"


    // $ANTLR start "rule__RangeExpression__Group_0__0"
    // InternalDdParser.g:5117:1: rule__RangeExpression__Group_0__0 : rule__RangeExpression__Group_0__0__Impl rule__RangeExpression__Group_0__1 ;
    public final void rule__RangeExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:5121:1: ( rule__RangeExpression__Group_0__0__Impl rule__RangeExpression__Group_0__1 )
            // InternalDdParser.g:5122:2: rule__RangeExpression__Group_0__0__Impl rule__RangeExpression__Group_0__1
            {
            pushFollow(FOLLOW_22);
            rule__RangeExpression__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RangeExpression__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeExpression__Group_0__0"


    // $ANTLR start "rule__RangeExpression__Group_0__0__Impl"
    // InternalDdParser.g:5129:1: rule__RangeExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__RangeExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:5133:1: ( ( () ) )
            // InternalDdParser.g:5134:1: ( () )
            {
            // InternalDdParser.g:5134:1: ( () )
            // InternalDdParser.g:5135:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeExpressionAccess().getListExpressionAction_0_0()); 
            }
            // InternalDdParser.g:5136:2: ()
            // InternalDdParser.g:5136:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeExpressionAccess().getListExpressionAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeExpression__Group_0__0__Impl"


    // $ANTLR start "rule__RangeExpression__Group_0__1"
    // InternalDdParser.g:5144:1: rule__RangeExpression__Group_0__1 : rule__RangeExpression__Group_0__1__Impl rule__RangeExpression__Group_0__2 ;
    public final void rule__RangeExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:5148:1: ( rule__RangeExpression__Group_0__1__Impl rule__RangeExpression__Group_0__2 )
            // InternalDdParser.g:5149:2: rule__RangeExpression__Group_0__1__Impl rule__RangeExpression__Group_0__2
            {
            pushFollow(FOLLOW_41);
            rule__RangeExpression__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RangeExpression__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeExpression__Group_0__1"


    // $ANTLR start "rule__RangeExpression__Group_0__1__Impl"
    // InternalDdParser.g:5156:1: rule__RangeExpression__Group_0__1__Impl : ( LeftParenthesis ) ;
    public final void rule__RangeExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:5160:1: ( ( LeftParenthesis ) )
            // InternalDdParser.g:5161:1: ( LeftParenthesis )
            {
            // InternalDdParser.g:5161:1: ( LeftParenthesis )
            // InternalDdParser.g:5162:2: LeftParenthesis
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeExpressionAccess().getLeftParenthesisKeyword_0_1()); 
            }
            match(input,LeftParenthesis,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeExpressionAccess().getLeftParenthesisKeyword_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeExpression__Group_0__1__Impl"


    // $ANTLR start "rule__RangeExpression__Group_0__2"
    // InternalDdParser.g:5171:1: rule__RangeExpression__Group_0__2 : rule__RangeExpression__Group_0__2__Impl rule__RangeExpression__Group_0__3 ;
    public final void rule__RangeExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:5175:1: ( rule__RangeExpression__Group_0__2__Impl rule__RangeExpression__Group_0__3 )
            // InternalDdParser.g:5176:2: rule__RangeExpression__Group_0__2__Impl rule__RangeExpression__Group_0__3
            {
            pushFollow(FOLLOW_27);
            rule__RangeExpression__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RangeExpression__Group_0__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeExpression__Group_0__2"


    // $ANTLR start "rule__RangeExpression__Group_0__2__Impl"
    // InternalDdParser.g:5183:1: rule__RangeExpression__Group_0__2__Impl : ( ( rule__RangeExpression__RangeAssignment_0_2 ) ) ;
    public final void rule__RangeExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:5187:1: ( ( ( rule__RangeExpression__RangeAssignment_0_2 ) ) )
            // InternalDdParser.g:5188:1: ( ( rule__RangeExpression__RangeAssignment_0_2 ) )
            {
            // InternalDdParser.g:5188:1: ( ( rule__RangeExpression__RangeAssignment_0_2 ) )
            // InternalDdParser.g:5189:2: ( rule__RangeExpression__RangeAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeExpressionAccess().getRangeAssignment_0_2()); 
            }
            // InternalDdParser.g:5190:2: ( rule__RangeExpression__RangeAssignment_0_2 )
            // InternalDdParser.g:5190:3: rule__RangeExpression__RangeAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__RangeExpression__RangeAssignment_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeExpressionAccess().getRangeAssignment_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeExpression__Group_0__2__Impl"


    // $ANTLR start "rule__RangeExpression__Group_0__3"
    // InternalDdParser.g:5198:1: rule__RangeExpression__Group_0__3 : rule__RangeExpression__Group_0__3__Impl rule__RangeExpression__Group_0__4 ;
    public final void rule__RangeExpression__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:5202:1: ( rule__RangeExpression__Group_0__3__Impl rule__RangeExpression__Group_0__4 )
            // InternalDdParser.g:5203:2: rule__RangeExpression__Group_0__3__Impl rule__RangeExpression__Group_0__4
            {
            pushFollow(FOLLOW_28);
            rule__RangeExpression__Group_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RangeExpression__Group_0__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeExpression__Group_0__3"


    // $ANTLR start "rule__RangeExpression__Group_0__3__Impl"
    // InternalDdParser.g:5210:1: rule__RangeExpression__Group_0__3__Impl : ( RightParenthesis ) ;
    public final void rule__RangeExpression__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:5214:1: ( ( RightParenthesis ) )
            // InternalDdParser.g:5215:1: ( RightParenthesis )
            {
            // InternalDdParser.g:5215:1: ( RightParenthesis )
            // InternalDdParser.g:5216:2: RightParenthesis
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeExpressionAccess().getRightParenthesisKeyword_0_3()); 
            }
            match(input,RightParenthesis,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeExpressionAccess().getRightParenthesisKeyword_0_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeExpression__Group_0__3__Impl"


    // $ANTLR start "rule__RangeExpression__Group_0__4"
    // InternalDdParser.g:5225:1: rule__RangeExpression__Group_0__4 : rule__RangeExpression__Group_0__4__Impl ;
    public final void rule__RangeExpression__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:5229:1: ( rule__RangeExpression__Group_0__4__Impl )
            // InternalDdParser.g:5230:2: rule__RangeExpression__Group_0__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RangeExpression__Group_0__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeExpression__Group_0__4"


    // $ANTLR start "rule__RangeExpression__Group_0__4__Impl"
    // InternalDdParser.g:5236:1: rule__RangeExpression__Group_0__4__Impl : ( ( rule__RangeExpression__Group_0_4__0 )? ) ;
    public final void rule__RangeExpression__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:5240:1: ( ( ( rule__RangeExpression__Group_0_4__0 )? ) )
            // InternalDdParser.g:5241:1: ( ( rule__RangeExpression__Group_0_4__0 )? )
            {
            // InternalDdParser.g:5241:1: ( ( rule__RangeExpression__Group_0_4__0 )? )
            // InternalDdParser.g:5242:2: ( rule__RangeExpression__Group_0_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeExpressionAccess().getGroup_0_4()); 
            }
            // InternalDdParser.g:5243:2: ( rule__RangeExpression__Group_0_4__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_NULL) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalDdParser.g:5243:3: rule__RangeExpression__Group_0_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RangeExpression__Group_0_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeExpressionAccess().getGroup_0_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeExpression__Group_0__4__Impl"


    // $ANTLR start "rule__RangeExpression__Group_0_4__0"
    // InternalDdParser.g:5252:1: rule__RangeExpression__Group_0_4__0 : rule__RangeExpression__Group_0_4__0__Impl rule__RangeExpression__Group_0_4__1 ;
    public final void rule__RangeExpression__Group_0_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:5256:1: ( rule__RangeExpression__Group_0_4__0__Impl rule__RangeExpression__Group_0_4__1 )
            // InternalDdParser.g:5257:2: rule__RangeExpression__Group_0_4__0__Impl rule__RangeExpression__Group_0_4__1
            {
            pushFollow(FOLLOW_28);
            rule__RangeExpression__Group_0_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RangeExpression__Group_0_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeExpression__Group_0_4__0"


    // $ANTLR start "rule__RangeExpression__Group_0_4__0__Impl"
    // InternalDdParser.g:5264:1: rule__RangeExpression__Group_0_4__0__Impl : ( ( rule__RangeExpression__NumTypeAssignment_0_4_0 ) ) ;
    public final void rule__RangeExpression__Group_0_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:5268:1: ( ( ( rule__RangeExpression__NumTypeAssignment_0_4_0 ) ) )
            // InternalDdParser.g:5269:1: ( ( rule__RangeExpression__NumTypeAssignment_0_4_0 ) )
            {
            // InternalDdParser.g:5269:1: ( ( rule__RangeExpression__NumTypeAssignment_0_4_0 ) )
            // InternalDdParser.g:5270:2: ( rule__RangeExpression__NumTypeAssignment_0_4_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeExpressionAccess().getNumTypeAssignment_0_4_0()); 
            }
            // InternalDdParser.g:5271:2: ( rule__RangeExpression__NumTypeAssignment_0_4_0 )
            // InternalDdParser.g:5271:3: rule__RangeExpression__NumTypeAssignment_0_4_0
            {
            pushFollow(FOLLOW_2);
            rule__RangeExpression__NumTypeAssignment_0_4_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeExpressionAccess().getNumTypeAssignment_0_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeExpression__Group_0_4__0__Impl"


    // $ANTLR start "rule__RangeExpression__Group_0_4__1"
    // InternalDdParser.g:5279:1: rule__RangeExpression__Group_0_4__1 : rule__RangeExpression__Group_0_4__1__Impl rule__RangeExpression__Group_0_4__2 ;
    public final void rule__RangeExpression__Group_0_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:5283:1: ( rule__RangeExpression__Group_0_4__1__Impl rule__RangeExpression__Group_0_4__2 )
            // InternalDdParser.g:5284:2: rule__RangeExpression__Group_0_4__1__Impl rule__RangeExpression__Group_0_4__2
            {
            pushFollow(FOLLOW_28);
            rule__RangeExpression__Group_0_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RangeExpression__Group_0_4__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeExpression__Group_0_4__1"


    // $ANTLR start "rule__RangeExpression__Group_0_4__1__Impl"
    // InternalDdParser.g:5291:1: rule__RangeExpression__Group_0_4__1__Impl : ( ( rule__RangeExpression__StrTypeAssignment_0_4_1 ) ) ;
    public final void rule__RangeExpression__Group_0_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:5295:1: ( ( ( rule__RangeExpression__StrTypeAssignment_0_4_1 ) ) )
            // InternalDdParser.g:5296:1: ( ( rule__RangeExpression__StrTypeAssignment_0_4_1 ) )
            {
            // InternalDdParser.g:5296:1: ( ( rule__RangeExpression__StrTypeAssignment_0_4_1 ) )
            // InternalDdParser.g:5297:2: ( rule__RangeExpression__StrTypeAssignment_0_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeExpressionAccess().getStrTypeAssignment_0_4_1()); 
            }
            // InternalDdParser.g:5298:2: ( rule__RangeExpression__StrTypeAssignment_0_4_1 )
            // InternalDdParser.g:5298:3: rule__RangeExpression__StrTypeAssignment_0_4_1
            {
            pushFollow(FOLLOW_2);
            rule__RangeExpression__StrTypeAssignment_0_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeExpressionAccess().getStrTypeAssignment_0_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeExpression__Group_0_4__1__Impl"


    // $ANTLR start "rule__RangeExpression__Group_0_4__2"
    // InternalDdParser.g:5306:1: rule__RangeExpression__Group_0_4__2 : rule__RangeExpression__Group_0_4__2__Impl rule__RangeExpression__Group_0_4__3 ;
    public final void rule__RangeExpression__Group_0_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:5310:1: ( rule__RangeExpression__Group_0_4__2__Impl rule__RangeExpression__Group_0_4__3 )
            // InternalDdParser.g:5311:2: rule__RangeExpression__Group_0_4__2__Impl rule__RangeExpression__Group_0_4__3
            {
            pushFollow(FOLLOW_28);
            rule__RangeExpression__Group_0_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RangeExpression__Group_0_4__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeExpression__Group_0_4__2"


    // $ANTLR start "rule__RangeExpression__Group_0_4__2__Impl"
    // InternalDdParser.g:5318:1: rule__RangeExpression__Group_0_4__2__Impl : ( ( rule__RangeExpression__DateTypeAssignment_0_4_2 ) ) ;
    public final void rule__RangeExpression__Group_0_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:5322:1: ( ( ( rule__RangeExpression__DateTypeAssignment_0_4_2 ) ) )
            // InternalDdParser.g:5323:1: ( ( rule__RangeExpression__DateTypeAssignment_0_4_2 ) )
            {
            // InternalDdParser.g:5323:1: ( ( rule__RangeExpression__DateTypeAssignment_0_4_2 ) )
            // InternalDdParser.g:5324:2: ( rule__RangeExpression__DateTypeAssignment_0_4_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeExpressionAccess().getDateTypeAssignment_0_4_2()); 
            }
            // InternalDdParser.g:5325:2: ( rule__RangeExpression__DateTypeAssignment_0_4_2 )
            // InternalDdParser.g:5325:3: rule__RangeExpression__DateTypeAssignment_0_4_2
            {
            pushFollow(FOLLOW_2);
            rule__RangeExpression__DateTypeAssignment_0_4_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeExpressionAccess().getDateTypeAssignment_0_4_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeExpression__Group_0_4__2__Impl"


    // $ANTLR start "rule__RangeExpression__Group_0_4__3"
    // InternalDdParser.g:5333:1: rule__RangeExpression__Group_0_4__3 : rule__RangeExpression__Group_0_4__3__Impl ;
    public final void rule__RangeExpression__Group_0_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:5337:1: ( rule__RangeExpression__Group_0_4__3__Impl )
            // InternalDdParser.g:5338:2: rule__RangeExpression__Group_0_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RangeExpression__Group_0_4__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeExpression__Group_0_4__3"


    // $ANTLR start "rule__RangeExpression__Group_0_4__3__Impl"
    // InternalDdParser.g:5344:1: rule__RangeExpression__Group_0_4__3__Impl : ( ( rule__RangeExpression__BoolTypeAssignment_0_4_3 ) ) ;
    public final void rule__RangeExpression__Group_0_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:5348:1: ( ( ( rule__RangeExpression__BoolTypeAssignment_0_4_3 ) ) )
            // InternalDdParser.g:5349:1: ( ( rule__RangeExpression__BoolTypeAssignment_0_4_3 ) )
            {
            // InternalDdParser.g:5349:1: ( ( rule__RangeExpression__BoolTypeAssignment_0_4_3 ) )
            // InternalDdParser.g:5350:2: ( rule__RangeExpression__BoolTypeAssignment_0_4_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeExpressionAccess().getBoolTypeAssignment_0_4_3()); 
            }
            // InternalDdParser.g:5351:2: ( rule__RangeExpression__BoolTypeAssignment_0_4_3 )
            // InternalDdParser.g:5351:3: rule__RangeExpression__BoolTypeAssignment_0_4_3
            {
            pushFollow(FOLLOW_2);
            rule__RangeExpression__BoolTypeAssignment_0_4_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeExpressionAccess().getBoolTypeAssignment_0_4_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeExpression__Group_0_4__3__Impl"


    // $ANTLR start "rule__RangeExpression__Group_1__0"
    // InternalDdParser.g:5360:1: rule__RangeExpression__Group_1__0 : rule__RangeExpression__Group_1__0__Impl rule__RangeExpression__Group_1__1 ;
    public final void rule__RangeExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:5364:1: ( rule__RangeExpression__Group_1__0__Impl rule__RangeExpression__Group_1__1 )
            // InternalDdParser.g:5365:2: rule__RangeExpression__Group_1__0__Impl rule__RangeExpression__Group_1__1
            {
            pushFollow(FOLLOW_22);
            rule__RangeExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RangeExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeExpression__Group_1__0"


    // $ANTLR start "rule__RangeExpression__Group_1__0__Impl"
    // InternalDdParser.g:5372:1: rule__RangeExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__RangeExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:5376:1: ( ( () ) )
            // InternalDdParser.g:5377:1: ( () )
            {
            // InternalDdParser.g:5377:1: ( () )
            // InternalDdParser.g:5378:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeExpressionAccess().getListExpressionAction_1_0()); 
            }
            // InternalDdParser.g:5379:2: ()
            // InternalDdParser.g:5379:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeExpressionAccess().getListExpressionAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeExpression__Group_1__0__Impl"


    // $ANTLR start "rule__RangeExpression__Group_1__1"
    // InternalDdParser.g:5387:1: rule__RangeExpression__Group_1__1 : rule__RangeExpression__Group_1__1__Impl rule__RangeExpression__Group_1__2 ;
    public final void rule__RangeExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:5391:1: ( rule__RangeExpression__Group_1__1__Impl rule__RangeExpression__Group_1__2 )
            // InternalDdParser.g:5392:2: rule__RangeExpression__Group_1__1__Impl rule__RangeExpression__Group_1__2
            {
            pushFollow(FOLLOW_42);
            rule__RangeExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RangeExpression__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeExpression__Group_1__1"


    // $ANTLR start "rule__RangeExpression__Group_1__1__Impl"
    // InternalDdParser.g:5399:1: rule__RangeExpression__Group_1__1__Impl : ( ( LeftParenthesis ) ) ;
    public final void rule__RangeExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:5403:1: ( ( ( LeftParenthesis ) ) )
            // InternalDdParser.g:5404:1: ( ( LeftParenthesis ) )
            {
            // InternalDdParser.g:5404:1: ( ( LeftParenthesis ) )
            // InternalDdParser.g:5405:2: ( LeftParenthesis )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeExpressionAccess().getLeftParenthesisKeyword_1_1()); 
            }
            // InternalDdParser.g:5406:2: ( LeftParenthesis )
            // InternalDdParser.g:5406:3: LeftParenthesis
            {
            match(input,LeftParenthesis,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeExpressionAccess().getLeftParenthesisKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeExpression__Group_1__1__Impl"


    // $ANTLR start "rule__RangeExpression__Group_1__2"
    // InternalDdParser.g:5414:1: rule__RangeExpression__Group_1__2 : rule__RangeExpression__Group_1__2__Impl rule__RangeExpression__Group_1__3 ;
    public final void rule__RangeExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:5418:1: ( rule__RangeExpression__Group_1__2__Impl rule__RangeExpression__Group_1__3 )
            // InternalDdParser.g:5419:2: rule__RangeExpression__Group_1__2__Impl rule__RangeExpression__Group_1__3
            {
            pushFollow(FOLLOW_27);
            rule__RangeExpression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RangeExpression__Group_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeExpression__Group_1__2"


    // $ANTLR start "rule__RangeExpression__Group_1__2__Impl"
    // InternalDdParser.g:5426:1: rule__RangeExpression__Group_1__2__Impl : ( ( rule__RangeExpression__RangeAssignment_1_2 ) ) ;
    public final void rule__RangeExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:5430:1: ( ( ( rule__RangeExpression__RangeAssignment_1_2 ) ) )
            // InternalDdParser.g:5431:1: ( ( rule__RangeExpression__RangeAssignment_1_2 ) )
            {
            // InternalDdParser.g:5431:1: ( ( rule__RangeExpression__RangeAssignment_1_2 ) )
            // InternalDdParser.g:5432:2: ( rule__RangeExpression__RangeAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeExpressionAccess().getRangeAssignment_1_2()); 
            }
            // InternalDdParser.g:5433:2: ( rule__RangeExpression__RangeAssignment_1_2 )
            // InternalDdParser.g:5433:3: rule__RangeExpression__RangeAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__RangeExpression__RangeAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeExpressionAccess().getRangeAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeExpression__Group_1__2__Impl"


    // $ANTLR start "rule__RangeExpression__Group_1__3"
    // InternalDdParser.g:5441:1: rule__RangeExpression__Group_1__3 : rule__RangeExpression__Group_1__3__Impl rule__RangeExpression__Group_1__4 ;
    public final void rule__RangeExpression__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:5445:1: ( rule__RangeExpression__Group_1__3__Impl rule__RangeExpression__Group_1__4 )
            // InternalDdParser.g:5446:2: rule__RangeExpression__Group_1__3__Impl rule__RangeExpression__Group_1__4
            {
            pushFollow(FOLLOW_28);
            rule__RangeExpression__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RangeExpression__Group_1__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeExpression__Group_1__3"


    // $ANTLR start "rule__RangeExpression__Group_1__3__Impl"
    // InternalDdParser.g:5453:1: rule__RangeExpression__Group_1__3__Impl : ( RightParenthesis ) ;
    public final void rule__RangeExpression__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:5457:1: ( ( RightParenthesis ) )
            // InternalDdParser.g:5458:1: ( RightParenthesis )
            {
            // InternalDdParser.g:5458:1: ( RightParenthesis )
            // InternalDdParser.g:5459:2: RightParenthesis
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeExpressionAccess().getRightParenthesisKeyword_1_3()); 
            }
            match(input,RightParenthesis,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeExpressionAccess().getRightParenthesisKeyword_1_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeExpression__Group_1__3__Impl"


    // $ANTLR start "rule__RangeExpression__Group_1__4"
    // InternalDdParser.g:5468:1: rule__RangeExpression__Group_1__4 : rule__RangeExpression__Group_1__4__Impl ;
    public final void rule__RangeExpression__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:5472:1: ( rule__RangeExpression__Group_1__4__Impl )
            // InternalDdParser.g:5473:2: rule__RangeExpression__Group_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RangeExpression__Group_1__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeExpression__Group_1__4"


    // $ANTLR start "rule__RangeExpression__Group_1__4__Impl"
    // InternalDdParser.g:5479:1: rule__RangeExpression__Group_1__4__Impl : ( ( rule__RangeExpression__Group_1_4__0 )? ) ;
    public final void rule__RangeExpression__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:5483:1: ( ( ( rule__RangeExpression__Group_1_4__0 )? ) )
            // InternalDdParser.g:5484:1: ( ( rule__RangeExpression__Group_1_4__0 )? )
            {
            // InternalDdParser.g:5484:1: ( ( rule__RangeExpression__Group_1_4__0 )? )
            // InternalDdParser.g:5485:2: ( rule__RangeExpression__Group_1_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeExpressionAccess().getGroup_1_4()); 
            }
            // InternalDdParser.g:5486:2: ( rule__RangeExpression__Group_1_4__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_NULL) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalDdParser.g:5486:3: rule__RangeExpression__Group_1_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RangeExpression__Group_1_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeExpressionAccess().getGroup_1_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeExpression__Group_1__4__Impl"


    // $ANTLR start "rule__RangeExpression__Group_1_4__0"
    // InternalDdParser.g:5495:1: rule__RangeExpression__Group_1_4__0 : rule__RangeExpression__Group_1_4__0__Impl rule__RangeExpression__Group_1_4__1 ;
    public final void rule__RangeExpression__Group_1_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:5499:1: ( rule__RangeExpression__Group_1_4__0__Impl rule__RangeExpression__Group_1_4__1 )
            // InternalDdParser.g:5500:2: rule__RangeExpression__Group_1_4__0__Impl rule__RangeExpression__Group_1_4__1
            {
            pushFollow(FOLLOW_28);
            rule__RangeExpression__Group_1_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RangeExpression__Group_1_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeExpression__Group_1_4__0"


    // $ANTLR start "rule__RangeExpression__Group_1_4__0__Impl"
    // InternalDdParser.g:5507:1: rule__RangeExpression__Group_1_4__0__Impl : ( ( rule__RangeExpression__NumTypeAssignment_1_4_0 ) ) ;
    public final void rule__RangeExpression__Group_1_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:5511:1: ( ( ( rule__RangeExpression__NumTypeAssignment_1_4_0 ) ) )
            // InternalDdParser.g:5512:1: ( ( rule__RangeExpression__NumTypeAssignment_1_4_0 ) )
            {
            // InternalDdParser.g:5512:1: ( ( rule__RangeExpression__NumTypeAssignment_1_4_0 ) )
            // InternalDdParser.g:5513:2: ( rule__RangeExpression__NumTypeAssignment_1_4_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeExpressionAccess().getNumTypeAssignment_1_4_0()); 
            }
            // InternalDdParser.g:5514:2: ( rule__RangeExpression__NumTypeAssignment_1_4_0 )
            // InternalDdParser.g:5514:3: rule__RangeExpression__NumTypeAssignment_1_4_0
            {
            pushFollow(FOLLOW_2);
            rule__RangeExpression__NumTypeAssignment_1_4_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeExpressionAccess().getNumTypeAssignment_1_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeExpression__Group_1_4__0__Impl"


    // $ANTLR start "rule__RangeExpression__Group_1_4__1"
    // InternalDdParser.g:5522:1: rule__RangeExpression__Group_1_4__1 : rule__RangeExpression__Group_1_4__1__Impl rule__RangeExpression__Group_1_4__2 ;
    public final void rule__RangeExpression__Group_1_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:5526:1: ( rule__RangeExpression__Group_1_4__1__Impl rule__RangeExpression__Group_1_4__2 )
            // InternalDdParser.g:5527:2: rule__RangeExpression__Group_1_4__1__Impl rule__RangeExpression__Group_1_4__2
            {
            pushFollow(FOLLOW_28);
            rule__RangeExpression__Group_1_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RangeExpression__Group_1_4__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeExpression__Group_1_4__1"


    // $ANTLR start "rule__RangeExpression__Group_1_4__1__Impl"
    // InternalDdParser.g:5534:1: rule__RangeExpression__Group_1_4__1__Impl : ( ( rule__RangeExpression__StrTypeAssignment_1_4_1 ) ) ;
    public final void rule__RangeExpression__Group_1_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:5538:1: ( ( ( rule__RangeExpression__StrTypeAssignment_1_4_1 ) ) )
            // InternalDdParser.g:5539:1: ( ( rule__RangeExpression__StrTypeAssignment_1_4_1 ) )
            {
            // InternalDdParser.g:5539:1: ( ( rule__RangeExpression__StrTypeAssignment_1_4_1 ) )
            // InternalDdParser.g:5540:2: ( rule__RangeExpression__StrTypeAssignment_1_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeExpressionAccess().getStrTypeAssignment_1_4_1()); 
            }
            // InternalDdParser.g:5541:2: ( rule__RangeExpression__StrTypeAssignment_1_4_1 )
            // InternalDdParser.g:5541:3: rule__RangeExpression__StrTypeAssignment_1_4_1
            {
            pushFollow(FOLLOW_2);
            rule__RangeExpression__StrTypeAssignment_1_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeExpressionAccess().getStrTypeAssignment_1_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeExpression__Group_1_4__1__Impl"


    // $ANTLR start "rule__RangeExpression__Group_1_4__2"
    // InternalDdParser.g:5549:1: rule__RangeExpression__Group_1_4__2 : rule__RangeExpression__Group_1_4__2__Impl rule__RangeExpression__Group_1_4__3 ;
    public final void rule__RangeExpression__Group_1_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:5553:1: ( rule__RangeExpression__Group_1_4__2__Impl rule__RangeExpression__Group_1_4__3 )
            // InternalDdParser.g:5554:2: rule__RangeExpression__Group_1_4__2__Impl rule__RangeExpression__Group_1_4__3
            {
            pushFollow(FOLLOW_28);
            rule__RangeExpression__Group_1_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RangeExpression__Group_1_4__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeExpression__Group_1_4__2"


    // $ANTLR start "rule__RangeExpression__Group_1_4__2__Impl"
    // InternalDdParser.g:5561:1: rule__RangeExpression__Group_1_4__2__Impl : ( ( rule__RangeExpression__DateTypeAssignment_1_4_2 ) ) ;
    public final void rule__RangeExpression__Group_1_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:5565:1: ( ( ( rule__RangeExpression__DateTypeAssignment_1_4_2 ) ) )
            // InternalDdParser.g:5566:1: ( ( rule__RangeExpression__DateTypeAssignment_1_4_2 ) )
            {
            // InternalDdParser.g:5566:1: ( ( rule__RangeExpression__DateTypeAssignment_1_4_2 ) )
            // InternalDdParser.g:5567:2: ( rule__RangeExpression__DateTypeAssignment_1_4_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeExpressionAccess().getDateTypeAssignment_1_4_2()); 
            }
            // InternalDdParser.g:5568:2: ( rule__RangeExpression__DateTypeAssignment_1_4_2 )
            // InternalDdParser.g:5568:3: rule__RangeExpression__DateTypeAssignment_1_4_2
            {
            pushFollow(FOLLOW_2);
            rule__RangeExpression__DateTypeAssignment_1_4_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeExpressionAccess().getDateTypeAssignment_1_4_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeExpression__Group_1_4__2__Impl"


    // $ANTLR start "rule__RangeExpression__Group_1_4__3"
    // InternalDdParser.g:5576:1: rule__RangeExpression__Group_1_4__3 : rule__RangeExpression__Group_1_4__3__Impl ;
    public final void rule__RangeExpression__Group_1_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:5580:1: ( rule__RangeExpression__Group_1_4__3__Impl )
            // InternalDdParser.g:5581:2: rule__RangeExpression__Group_1_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RangeExpression__Group_1_4__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeExpression__Group_1_4__3"


    // $ANTLR start "rule__RangeExpression__Group_1_4__3__Impl"
    // InternalDdParser.g:5587:1: rule__RangeExpression__Group_1_4__3__Impl : ( ( rule__RangeExpression__BoolTypeAssignment_1_4_3 ) ) ;
    public final void rule__RangeExpression__Group_1_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:5591:1: ( ( ( rule__RangeExpression__BoolTypeAssignment_1_4_3 ) ) )
            // InternalDdParser.g:5592:1: ( ( rule__RangeExpression__BoolTypeAssignment_1_4_3 ) )
            {
            // InternalDdParser.g:5592:1: ( ( rule__RangeExpression__BoolTypeAssignment_1_4_3 ) )
            // InternalDdParser.g:5593:2: ( rule__RangeExpression__BoolTypeAssignment_1_4_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeExpressionAccess().getBoolTypeAssignment_1_4_3()); 
            }
            // InternalDdParser.g:5594:2: ( rule__RangeExpression__BoolTypeAssignment_1_4_3 )
            // InternalDdParser.g:5594:3: rule__RangeExpression__BoolTypeAssignment_1_4_3
            {
            pushFollow(FOLLOW_2);
            rule__RangeExpression__BoolTypeAssignment_1_4_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeExpressionAccess().getBoolTypeAssignment_1_4_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeExpression__Group_1_4__3__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_0__0"
    // InternalDdParser.g:5603:1: rule__TerminalExpression__Group_0__0 : rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1 ;
    public final void rule__TerminalExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:5607:1: ( rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1 )
            // InternalDdParser.g:5608:2: rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1
            {
            pushFollow(FOLLOW_43);
            rule__TerminalExpression__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_0__0"


    // $ANTLR start "rule__TerminalExpression__Group_0__0__Impl"
    // InternalDdParser.g:5615:1: rule__TerminalExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:5619:1: ( ( () ) )
            // InternalDdParser.g:5620:1: ( () )
            {
            // InternalDdParser.g:5620:1: ( () )
            // InternalDdParser.g:5621:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getStrValueAction_0_0()); 
            }
            // InternalDdParser.g:5622:2: ()
            // InternalDdParser.g:5622:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getStrValueAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_0__0__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_0__1"
    // InternalDdParser.g:5630:1: rule__TerminalExpression__Group_0__1 : rule__TerminalExpression__Group_0__1__Impl ;
    public final void rule__TerminalExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:5634:1: ( rule__TerminalExpression__Group_0__1__Impl )
            // InternalDdParser.g:5635:2: rule__TerminalExpression__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_0__1"


    // $ANTLR start "rule__TerminalExpression__Group_0__1__Impl"
    // InternalDdParser.g:5641:1: rule__TerminalExpression__Group_0__1__Impl : ( ( rule__TerminalExpression__ValueAssignment_0_1 ) ) ;
    public final void rule__TerminalExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:5645:1: ( ( ( rule__TerminalExpression__ValueAssignment_0_1 ) ) )
            // InternalDdParser.g:5646:1: ( ( rule__TerminalExpression__ValueAssignment_0_1 ) )
            {
            // InternalDdParser.g:5646:1: ( ( rule__TerminalExpression__ValueAssignment_0_1 ) )
            // InternalDdParser.g:5647:2: ( rule__TerminalExpression__ValueAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getValueAssignment_0_1()); 
            }
            // InternalDdParser.g:5648:2: ( rule__TerminalExpression__ValueAssignment_0_1 )
            // InternalDdParser.g:5648:3: rule__TerminalExpression__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__ValueAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getValueAssignment_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_0__1__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_1__0"
    // InternalDdParser.g:5657:1: rule__TerminalExpression__Group_1__0 : rule__TerminalExpression__Group_1__0__Impl rule__TerminalExpression__Group_1__1 ;
    public final void rule__TerminalExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:5661:1: ( rule__TerminalExpression__Group_1__0__Impl rule__TerminalExpression__Group_1__1 )
            // InternalDdParser.g:5662:2: rule__TerminalExpression__Group_1__0__Impl rule__TerminalExpression__Group_1__1
            {
            pushFollow(FOLLOW_19);
            rule__TerminalExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_1__0"


    // $ANTLR start "rule__TerminalExpression__Group_1__0__Impl"
    // InternalDdParser.g:5669:1: rule__TerminalExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:5673:1: ( ( () ) )
            // InternalDdParser.g:5674:1: ( () )
            {
            // InternalDdParser.g:5674:1: ( () )
            // InternalDdParser.g:5675:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getIntValueAction_1_0()); 
            }
            // InternalDdParser.g:5676:2: ()
            // InternalDdParser.g:5676:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getIntValueAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_1__0__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_1__1"
    // InternalDdParser.g:5684:1: rule__TerminalExpression__Group_1__1 : rule__TerminalExpression__Group_1__1__Impl ;
    public final void rule__TerminalExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:5688:1: ( rule__TerminalExpression__Group_1__1__Impl )
            // InternalDdParser.g:5689:2: rule__TerminalExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_1__1"


    // $ANTLR start "rule__TerminalExpression__Group_1__1__Impl"
    // InternalDdParser.g:5695:1: rule__TerminalExpression__Group_1__1__Impl : ( ( rule__TerminalExpression__ValueAssignment_1_1 ) ) ;
    public final void rule__TerminalExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:5699:1: ( ( ( rule__TerminalExpression__ValueAssignment_1_1 ) ) )
            // InternalDdParser.g:5700:1: ( ( rule__TerminalExpression__ValueAssignment_1_1 ) )
            {
            // InternalDdParser.g:5700:1: ( ( rule__TerminalExpression__ValueAssignment_1_1 ) )
            // InternalDdParser.g:5701:2: ( rule__TerminalExpression__ValueAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getValueAssignment_1_1()); 
            }
            // InternalDdParser.g:5702:2: ( rule__TerminalExpression__ValueAssignment_1_1 )
            // InternalDdParser.g:5702:3: rule__TerminalExpression__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__ValueAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getValueAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_1__1__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_2__0"
    // InternalDdParser.g:5711:1: rule__TerminalExpression__Group_2__0 : rule__TerminalExpression__Group_2__0__Impl rule__TerminalExpression__Group_2__1 ;
    public final void rule__TerminalExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:5715:1: ( rule__TerminalExpression__Group_2__0__Impl rule__TerminalExpression__Group_2__1 )
            // InternalDdParser.g:5716:2: rule__TerminalExpression__Group_2__0__Impl rule__TerminalExpression__Group_2__1
            {
            pushFollow(FOLLOW_44);
            rule__TerminalExpression__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_2__0"


    // $ANTLR start "rule__TerminalExpression__Group_2__0__Impl"
    // InternalDdParser.g:5723:1: rule__TerminalExpression__Group_2__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:5727:1: ( ( () ) )
            // InternalDdParser.g:5728:1: ( () )
            {
            // InternalDdParser.g:5728:1: ( () )
            // InternalDdParser.g:5729:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getDecValueAction_2_0()); 
            }
            // InternalDdParser.g:5730:2: ()
            // InternalDdParser.g:5730:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getDecValueAction_2_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_2__0__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_2__1"
    // InternalDdParser.g:5738:1: rule__TerminalExpression__Group_2__1 : rule__TerminalExpression__Group_2__1__Impl ;
    public final void rule__TerminalExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:5742:1: ( rule__TerminalExpression__Group_2__1__Impl )
            // InternalDdParser.g:5743:2: rule__TerminalExpression__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_2__1"


    // $ANTLR start "rule__TerminalExpression__Group_2__1__Impl"
    // InternalDdParser.g:5749:1: rule__TerminalExpression__Group_2__1__Impl : ( ( rule__TerminalExpression__ValueAssignment_2_1 ) ) ;
    public final void rule__TerminalExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:5753:1: ( ( ( rule__TerminalExpression__ValueAssignment_2_1 ) ) )
            // InternalDdParser.g:5754:1: ( ( rule__TerminalExpression__ValueAssignment_2_1 ) )
            {
            // InternalDdParser.g:5754:1: ( ( rule__TerminalExpression__ValueAssignment_2_1 ) )
            // InternalDdParser.g:5755:2: ( rule__TerminalExpression__ValueAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getValueAssignment_2_1()); 
            }
            // InternalDdParser.g:5756:2: ( rule__TerminalExpression__ValueAssignment_2_1 )
            // InternalDdParser.g:5756:3: rule__TerminalExpression__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__ValueAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getValueAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_2__1__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_3__0"
    // InternalDdParser.g:5765:1: rule__TerminalExpression__Group_3__0 : rule__TerminalExpression__Group_3__0__Impl rule__TerminalExpression__Group_3__1 ;
    public final void rule__TerminalExpression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:5769:1: ( rule__TerminalExpression__Group_3__0__Impl rule__TerminalExpression__Group_3__1 )
            // InternalDdParser.g:5770:2: rule__TerminalExpression__Group_3__0__Impl rule__TerminalExpression__Group_3__1
            {
            pushFollow(FOLLOW_45);
            rule__TerminalExpression__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_3__0"


    // $ANTLR start "rule__TerminalExpression__Group_3__0__Impl"
    // InternalDdParser.g:5777:1: rule__TerminalExpression__Group_3__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:5781:1: ( ( () ) )
            // InternalDdParser.g:5782:1: ( () )
            {
            // InternalDdParser.g:5782:1: ( () )
            // InternalDdParser.g:5783:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getChrValueAction_3_0()); 
            }
            // InternalDdParser.g:5784:2: ()
            // InternalDdParser.g:5784:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getChrValueAction_3_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_3__0__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_3__1"
    // InternalDdParser.g:5792:1: rule__TerminalExpression__Group_3__1 : rule__TerminalExpression__Group_3__1__Impl ;
    public final void rule__TerminalExpression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:5796:1: ( rule__TerminalExpression__Group_3__1__Impl )
            // InternalDdParser.g:5797:2: rule__TerminalExpression__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_3__1"


    // $ANTLR start "rule__TerminalExpression__Group_3__1__Impl"
    // InternalDdParser.g:5803:1: rule__TerminalExpression__Group_3__1__Impl : ( ( rule__TerminalExpression__ValueAssignment_3_1 ) ) ;
    public final void rule__TerminalExpression__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:5807:1: ( ( ( rule__TerminalExpression__ValueAssignment_3_1 ) ) )
            // InternalDdParser.g:5808:1: ( ( rule__TerminalExpression__ValueAssignment_3_1 ) )
            {
            // InternalDdParser.g:5808:1: ( ( rule__TerminalExpression__ValueAssignment_3_1 ) )
            // InternalDdParser.g:5809:2: ( rule__TerminalExpression__ValueAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getValueAssignment_3_1()); 
            }
            // InternalDdParser.g:5810:2: ( rule__TerminalExpression__ValueAssignment_3_1 )
            // InternalDdParser.g:5810:3: rule__TerminalExpression__ValueAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__ValueAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getValueAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_3__1__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_4__0"
    // InternalDdParser.g:5819:1: rule__TerminalExpression__Group_4__0 : rule__TerminalExpression__Group_4__0__Impl rule__TerminalExpression__Group_4__1 ;
    public final void rule__TerminalExpression__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:5823:1: ( rule__TerminalExpression__Group_4__0__Impl rule__TerminalExpression__Group_4__1 )
            // InternalDdParser.g:5824:2: rule__TerminalExpression__Group_4__0__Impl rule__TerminalExpression__Group_4__1
            {
            pushFollow(FOLLOW_46);
            rule__TerminalExpression__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_4__0"


    // $ANTLR start "rule__TerminalExpression__Group_4__0__Impl"
    // InternalDdParser.g:5831:1: rule__TerminalExpression__Group_4__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:5835:1: ( ( () ) )
            // InternalDdParser.g:5836:1: ( () )
            {
            // InternalDdParser.g:5836:1: ( () )
            // InternalDdParser.g:5837:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getCstValueAction_4_0()); 
            }
            // InternalDdParser.g:5838:2: ()
            // InternalDdParser.g:5838:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getCstValueAction_4_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_4__0__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_4__1"
    // InternalDdParser.g:5846:1: rule__TerminalExpression__Group_4__1 : rule__TerminalExpression__Group_4__1__Impl ;
    public final void rule__TerminalExpression__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:5850:1: ( rule__TerminalExpression__Group_4__1__Impl )
            // InternalDdParser.g:5851:2: rule__TerminalExpression__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_4__1"


    // $ANTLR start "rule__TerminalExpression__Group_4__1__Impl"
    // InternalDdParser.g:5857:1: rule__TerminalExpression__Group_4__1__Impl : ( ( rule__TerminalExpression__ValueAssignment_4_1 ) ) ;
    public final void rule__TerminalExpression__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:5861:1: ( ( ( rule__TerminalExpression__ValueAssignment_4_1 ) ) )
            // InternalDdParser.g:5862:1: ( ( rule__TerminalExpression__ValueAssignment_4_1 ) )
            {
            // InternalDdParser.g:5862:1: ( ( rule__TerminalExpression__ValueAssignment_4_1 ) )
            // InternalDdParser.g:5863:2: ( rule__TerminalExpression__ValueAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getValueAssignment_4_1()); 
            }
            // InternalDdParser.g:5864:2: ( rule__TerminalExpression__ValueAssignment_4_1 )
            // InternalDdParser.g:5864:3: rule__TerminalExpression__ValueAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__ValueAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getValueAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_4__1__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_5__0"
    // InternalDdParser.g:5873:1: rule__TerminalExpression__Group_5__0 : rule__TerminalExpression__Group_5__0__Impl rule__TerminalExpression__Group_5__1 ;
    public final void rule__TerminalExpression__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:5877:1: ( rule__TerminalExpression__Group_5__0__Impl rule__TerminalExpression__Group_5__1 )
            // InternalDdParser.g:5878:2: rule__TerminalExpression__Group_5__0__Impl rule__TerminalExpression__Group_5__1
            {
            pushFollow(FOLLOW_47);
            rule__TerminalExpression__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_5__0"


    // $ANTLR start "rule__TerminalExpression__Group_5__0__Impl"
    // InternalDdParser.g:5885:1: rule__TerminalExpression__Group_5__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:5889:1: ( ( () ) )
            // InternalDdParser.g:5890:1: ( () )
            {
            // InternalDdParser.g:5890:1: ( () )
            // InternalDdParser.g:5891:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getBoolValueAction_5_0()); 
            }
            // InternalDdParser.g:5892:2: ()
            // InternalDdParser.g:5892:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getBoolValueAction_5_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_5__0__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_5__1"
    // InternalDdParser.g:5900:1: rule__TerminalExpression__Group_5__1 : rule__TerminalExpression__Group_5__1__Impl ;
    public final void rule__TerminalExpression__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:5904:1: ( rule__TerminalExpression__Group_5__1__Impl )
            // InternalDdParser.g:5905:2: rule__TerminalExpression__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_5__1"


    // $ANTLR start "rule__TerminalExpression__Group_5__1__Impl"
    // InternalDdParser.g:5911:1: rule__TerminalExpression__Group_5__1__Impl : ( ( rule__TerminalExpression__ValueAssignment_5_1 ) ) ;
    public final void rule__TerminalExpression__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:5915:1: ( ( ( rule__TerminalExpression__ValueAssignment_5_1 ) ) )
            // InternalDdParser.g:5916:1: ( ( rule__TerminalExpression__ValueAssignment_5_1 ) )
            {
            // InternalDdParser.g:5916:1: ( ( rule__TerminalExpression__ValueAssignment_5_1 ) )
            // InternalDdParser.g:5917:2: ( rule__TerminalExpression__ValueAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getValueAssignment_5_1()); 
            }
            // InternalDdParser.g:5918:2: ( rule__TerminalExpression__ValueAssignment_5_1 )
            // InternalDdParser.g:5918:3: rule__TerminalExpression__ValueAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__ValueAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getValueAssignment_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_5__1__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_6__0"
    // InternalDdParser.g:5927:1: rule__TerminalExpression__Group_6__0 : rule__TerminalExpression__Group_6__0__Impl rule__TerminalExpression__Group_6__1 ;
    public final void rule__TerminalExpression__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:5931:1: ( rule__TerminalExpression__Group_6__0__Impl rule__TerminalExpression__Group_6__1 )
            // InternalDdParser.g:5932:2: rule__TerminalExpression__Group_6__0__Impl rule__TerminalExpression__Group_6__1
            {
            pushFollow(FOLLOW_48);
            rule__TerminalExpression__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_6__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_6__0"


    // $ANTLR start "rule__TerminalExpression__Group_6__0__Impl"
    // InternalDdParser.g:5939:1: rule__TerminalExpression__Group_6__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:5943:1: ( ( () ) )
            // InternalDdParser.g:5944:1: ( () )
            {
            // InternalDdParser.g:5944:1: ( () )
            // InternalDdParser.g:5945:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getUnsetValueAction_6_0()); 
            }
            // InternalDdParser.g:5946:2: ()
            // InternalDdParser.g:5946:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getUnsetValueAction_6_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_6__0__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_6__1"
    // InternalDdParser.g:5954:1: rule__TerminalExpression__Group_6__1 : rule__TerminalExpression__Group_6__1__Impl ;
    public final void rule__TerminalExpression__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:5958:1: ( rule__TerminalExpression__Group_6__1__Impl )
            // InternalDdParser.g:5959:2: rule__TerminalExpression__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_6__1"


    // $ANTLR start "rule__TerminalExpression__Group_6__1__Impl"
    // InternalDdParser.g:5965:1: rule__TerminalExpression__Group_6__1__Impl : ( ( rule__TerminalExpression__ValueAssignment_6_1 ) ) ;
    public final void rule__TerminalExpression__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:5969:1: ( ( ( rule__TerminalExpression__ValueAssignment_6_1 ) ) )
            // InternalDdParser.g:5970:1: ( ( rule__TerminalExpression__ValueAssignment_6_1 ) )
            {
            // InternalDdParser.g:5970:1: ( ( rule__TerminalExpression__ValueAssignment_6_1 ) )
            // InternalDdParser.g:5971:2: ( rule__TerminalExpression__ValueAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getValueAssignment_6_1()); 
            }
            // InternalDdParser.g:5972:2: ( rule__TerminalExpression__ValueAssignment_6_1 )
            // InternalDdParser.g:5972:3: rule__TerminalExpression__ValueAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__ValueAssignment_6_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getValueAssignment_6_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_6__1__Impl"


    // $ANTLR start "rule__IdentifierExpression__Group__0"
    // InternalDdParser.g:5981:1: rule__IdentifierExpression__Group__0 : rule__IdentifierExpression__Group__0__Impl rule__IdentifierExpression__Group__1 ;
    public final void rule__IdentifierExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:5985:1: ( rule__IdentifierExpression__Group__0__Impl rule__IdentifierExpression__Group__1 )
            // InternalDdParser.g:5986:2: rule__IdentifierExpression__Group__0__Impl rule__IdentifierExpression__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__IdentifierExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IdentifierExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdentifierExpression__Group__0"


    // $ANTLR start "rule__IdentifierExpression__Group__0__Impl"
    // InternalDdParser.g:5993:1: rule__IdentifierExpression__Group__0__Impl : ( () ) ;
    public final void rule__IdentifierExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:5997:1: ( ( () ) )
            // InternalDdParser.g:5998:1: ( () )
            {
            // InternalDdParser.g:5998:1: ( () )
            // InternalDdParser.g:5999:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentifierExpressionAccess().getIdentifierExpressionAction_0()); 
            }
            // InternalDdParser.g:6000:2: ()
            // InternalDdParser.g:6000:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdentifierExpressionAccess().getIdentifierExpressionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdentifierExpression__Group__0__Impl"


    // $ANTLR start "rule__IdentifierExpression__Group__1"
    // InternalDdParser.g:6008:1: rule__IdentifierExpression__Group__1 : rule__IdentifierExpression__Group__1__Impl ;
    public final void rule__IdentifierExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:6012:1: ( rule__IdentifierExpression__Group__1__Impl )
            // InternalDdParser.g:6013:2: rule__IdentifierExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IdentifierExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdentifierExpression__Group__1"


    // $ANTLR start "rule__IdentifierExpression__Group__1__Impl"
    // InternalDdParser.g:6019:1: rule__IdentifierExpression__Group__1__Impl : ( ( rule__IdentifierExpression__ValueAssignment_1 ) ) ;
    public final void rule__IdentifierExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:6023:1: ( ( ( rule__IdentifierExpression__ValueAssignment_1 ) ) )
            // InternalDdParser.g:6024:1: ( ( rule__IdentifierExpression__ValueAssignment_1 ) )
            {
            // InternalDdParser.g:6024:1: ( ( rule__IdentifierExpression__ValueAssignment_1 ) )
            // InternalDdParser.g:6025:2: ( rule__IdentifierExpression__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentifierExpressionAccess().getValueAssignment_1()); 
            }
            // InternalDdParser.g:6026:2: ( rule__IdentifierExpression__ValueAssignment_1 )
            // InternalDdParser.g:6026:3: rule__IdentifierExpression__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__IdentifierExpression__ValueAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdentifierExpressionAccess().getValueAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdentifierExpression__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalDdParser.g:6035:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:6039:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalDdParser.g:6040:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalDdParser.g:6047:1: rule__QualifiedName__Group__0__Impl : ( ( rule__QualifiedName__Group_0__0 )? ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:6051:1: ( ( ( rule__QualifiedName__Group_0__0 )? ) )
            // InternalDdParser.g:6052:1: ( ( rule__QualifiedName__Group_0__0 )? )
            {
            // InternalDdParser.g:6052:1: ( ( rule__QualifiedName__Group_0__0 )? )
            // InternalDdParser.g:6053:2: ( rule__QualifiedName__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_0()); 
            }
            // InternalDdParser.g:6054:2: ( rule__QualifiedName__Group_0__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_OBJID) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalDdParser.g:6054:3: rule__QualifiedName__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__QualifiedName__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalDdParser.g:6062:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:6066:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalDdParser.g:6067:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalDdParser.g:6073:1: rule__QualifiedName__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:6077:1: ( ( RULE_ID ) )
            // InternalDdParser.g:6078:1: ( RULE_ID )
            {
            // InternalDdParser.g:6078:1: ( RULE_ID )
            // InternalDdParser.g:6079:2: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_0__0"
    // InternalDdParser.g:6089:1: rule__QualifiedName__Group_0__0 : rule__QualifiedName__Group_0__0__Impl rule__QualifiedName__Group_0__1 ;
    public final void rule__QualifiedName__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:6093:1: ( rule__QualifiedName__Group_0__0__Impl rule__QualifiedName__Group_0__1 )
            // InternalDdParser.g:6094:2: rule__QualifiedName__Group_0__0__Impl rule__QualifiedName__Group_0__1
            {
            pushFollow(FOLLOW_49);
            rule__QualifiedName__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_0__0"


    // $ANTLR start "rule__QualifiedName__Group_0__0__Impl"
    // InternalDdParser.g:6101:1: rule__QualifiedName__Group_0__0__Impl : ( RULE_OBJID ) ;
    public final void rule__QualifiedName__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:6105:1: ( ( RULE_OBJID ) )
            // InternalDdParser.g:6106:1: ( RULE_OBJID )
            {
            // InternalDdParser.g:6106:1: ( RULE_OBJID )
            // InternalDdParser.g:6107:2: RULE_OBJID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getOBJIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_OBJID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getOBJIDTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_0__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_0__1"
    // InternalDdParser.g:6116:1: rule__QualifiedName__Group_0__1 : rule__QualifiedName__Group_0__1__Impl ;
    public final void rule__QualifiedName__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:6120:1: ( rule__QualifiedName__Group_0__1__Impl )
            // InternalDdParser.g:6121:2: rule__QualifiedName__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_0__1"


    // $ANTLR start "rule__QualifiedName__Group_0__1__Impl"
    // InternalDdParser.g:6127:1: rule__QualifiedName__Group_0__1__Impl : ( FullStop ) ;
    public final void rule__QualifiedName__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:6131:1: ( ( FullStop ) )
            // InternalDdParser.g:6132:1: ( FullStop )
            {
            // InternalDdParser.g:6132:1: ( FullStop )
            // InternalDdParser.g:6133:2: FullStop
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_0_1()); 
            }
            match(input,FullStop,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_0__1__Impl"


    // $ANTLR start "rule__LineComment__Group__0"
    // InternalDdParser.g:6143:1: rule__LineComment__Group__0 : rule__LineComment__Group__0__Impl rule__LineComment__Group__1 ;
    public final void rule__LineComment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:6147:1: ( rule__LineComment__Group__0__Impl rule__LineComment__Group__1 )
            // InternalDdParser.g:6148:2: rule__LineComment__Group__0__Impl rule__LineComment__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__LineComment__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LineComment__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineComment__Group__0"


    // $ANTLR start "rule__LineComment__Group__0__Impl"
    // InternalDdParser.g:6155:1: rule__LineComment__Group__0__Impl : ( () ) ;
    public final void rule__LineComment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:6159:1: ( ( () ) )
            // InternalDdParser.g:6160:1: ( () )
            {
            // InternalDdParser.g:6160:1: ( () )
            // InternalDdParser.g:6161:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLineCommentAccess().getCommentAction_0()); 
            }
            // InternalDdParser.g:6162:2: ()
            // InternalDdParser.g:6162:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLineCommentAccess().getCommentAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineComment__Group__0__Impl"


    // $ANTLR start "rule__LineComment__Group__1"
    // InternalDdParser.g:6170:1: rule__LineComment__Group__1 : rule__LineComment__Group__1__Impl rule__LineComment__Group__2 ;
    public final void rule__LineComment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:6174:1: ( rule__LineComment__Group__1__Impl rule__LineComment__Group__2 )
            // InternalDdParser.g:6175:2: rule__LineComment__Group__1__Impl rule__LineComment__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__LineComment__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LineComment__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineComment__Group__1"


    // $ANTLR start "rule__LineComment__Group__1__Impl"
    // InternalDdParser.g:6182:1: rule__LineComment__Group__1__Impl : ( ( rule__LineComment__LineAssignment_1 ) ) ;
    public final void rule__LineComment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:6186:1: ( ( ( rule__LineComment__LineAssignment_1 ) ) )
            // InternalDdParser.g:6187:1: ( ( rule__LineComment__LineAssignment_1 ) )
            {
            // InternalDdParser.g:6187:1: ( ( rule__LineComment__LineAssignment_1 ) )
            // InternalDdParser.g:6188:2: ( rule__LineComment__LineAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLineCommentAccess().getLineAssignment_1()); 
            }
            // InternalDdParser.g:6189:2: ( rule__LineComment__LineAssignment_1 )
            // InternalDdParser.g:6189:3: rule__LineComment__LineAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LineComment__LineAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLineCommentAccess().getLineAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineComment__Group__1__Impl"


    // $ANTLR start "rule__LineComment__Group__2"
    // InternalDdParser.g:6197:1: rule__LineComment__Group__2 : rule__LineComment__Group__2__Impl ;
    public final void rule__LineComment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:6201:1: ( rule__LineComment__Group__2__Impl )
            // InternalDdParser.g:6202:2: rule__LineComment__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LineComment__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineComment__Group__2"


    // $ANTLR start "rule__LineComment__Group__2__Impl"
    // InternalDdParser.g:6208:1: rule__LineComment__Group__2__Impl : ( RULE_EOL ) ;
    public final void rule__LineComment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:6212:1: ( ( RULE_EOL ) )
            // InternalDdParser.g:6213:1: ( RULE_EOL )
            {
            // InternalDdParser.g:6213:1: ( RULE_EOL )
            // InternalDdParser.g:6214:2: RULE_EOL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLineCommentAccess().getEOLTerminalRuleCall_2()); 
            }
            match(input,RULE_EOL,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLineCommentAccess().getEOLTerminalRuleCall_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineComment__Group__2__Impl"


    // $ANTLR start "rule__TrailComment__Group__0"
    // InternalDdParser.g:6224:1: rule__TrailComment__Group__0 : rule__TrailComment__Group__0__Impl rule__TrailComment__Group__1 ;
    public final void rule__TrailComment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:6228:1: ( rule__TrailComment__Group__0__Impl rule__TrailComment__Group__1 )
            // InternalDdParser.g:6229:2: rule__TrailComment__Group__0__Impl rule__TrailComment__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__TrailComment__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TrailComment__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrailComment__Group__0"


    // $ANTLR start "rule__TrailComment__Group__0__Impl"
    // InternalDdParser.g:6236:1: rule__TrailComment__Group__0__Impl : ( () ) ;
    public final void rule__TrailComment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:6240:1: ( ( () ) )
            // InternalDdParser.g:6241:1: ( () )
            {
            // InternalDdParser.g:6241:1: ( () )
            // InternalDdParser.g:6242:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTrailCommentAccess().getCommentAction_0()); 
            }
            // InternalDdParser.g:6243:2: ()
            // InternalDdParser.g:6243:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTrailCommentAccess().getCommentAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrailComment__Group__0__Impl"


    // $ANTLR start "rule__TrailComment__Group__1"
    // InternalDdParser.g:6251:1: rule__TrailComment__Group__1 : rule__TrailComment__Group__1__Impl ;
    public final void rule__TrailComment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:6255:1: ( rule__TrailComment__Group__1__Impl )
            // InternalDdParser.g:6256:2: rule__TrailComment__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TrailComment__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrailComment__Group__1"


    // $ANTLR start "rule__TrailComment__Group__1__Impl"
    // InternalDdParser.g:6262:1: rule__TrailComment__Group__1__Impl : ( ( rule__TrailComment__LineAssignment_1 ) ) ;
    public final void rule__TrailComment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:6266:1: ( ( ( rule__TrailComment__LineAssignment_1 ) ) )
            // InternalDdParser.g:6267:1: ( ( rule__TrailComment__LineAssignment_1 ) )
            {
            // InternalDdParser.g:6267:1: ( ( rule__TrailComment__LineAssignment_1 ) )
            // InternalDdParser.g:6268:2: ( rule__TrailComment__LineAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTrailCommentAccess().getLineAssignment_1()); 
            }
            // InternalDdParser.g:6269:2: ( rule__TrailComment__LineAssignment_1 )
            // InternalDdParser.g:6269:3: rule__TrailComment__LineAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TrailComment__LineAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTrailCommentAccess().getLineAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrailComment__Group__1__Impl"


    // $ANTLR start "rule__DataModelFragment__ConstantsAssignment_0"
    // InternalDdParser.g:6278:1: rule__DataModelFragment__ConstantsAssignment_0 : ( ruleConstant ) ;
    public final void rule__DataModelFragment__ConstantsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:6282:1: ( ( ruleConstant ) )
            // InternalDdParser.g:6283:2: ( ruleConstant )
            {
            // InternalDdParser.g:6283:2: ( ruleConstant )
            // InternalDdParser.g:6284:3: ruleConstant
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDataModelFragmentAccess().getConstantsConstantParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleConstant();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDataModelFragmentAccess().getConstantsConstantParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModelFragment__ConstantsAssignment_0"


    // $ANTLR start "rule__DataModelFragment__EntitiesAssignment_1"
    // InternalDdParser.g:6293:1: rule__DataModelFragment__EntitiesAssignment_1 : ( ruleEntity ) ;
    public final void rule__DataModelFragment__EntitiesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:6297:1: ( ( ruleEntity ) )
            // InternalDdParser.g:6298:2: ( ruleEntity )
            {
            // InternalDdParser.g:6298:2: ( ruleEntity )
            // InternalDdParser.g:6299:3: ruleEntity
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDataModelFragmentAccess().getEntitiesEntityParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEntity();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDataModelFragmentAccess().getEntitiesEntityParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModelFragment__EntitiesAssignment_1"


    // $ANTLR start "rule__DataModelFragment__ConstraintsAssignment_2"
    // InternalDdParser.g:6308:1: rule__DataModelFragment__ConstraintsAssignment_2 : ( ruleConstraint ) ;
    public final void rule__DataModelFragment__ConstraintsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:6312:1: ( ( ruleConstraint ) )
            // InternalDdParser.g:6313:2: ( ruleConstraint )
            {
            // InternalDdParser.g:6313:2: ( ruleConstraint )
            // InternalDdParser.g:6314:3: ruleConstraint
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDataModelFragmentAccess().getConstraintsConstraintParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleConstraint();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDataModelFragmentAccess().getConstraintsConstraintParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModelFragment__ConstraintsAssignment_2"


    // $ANTLR start "rule__Constant__ExtraAttrDescAssignment_0"
    // InternalDdParser.g:6323:1: rule__Constant__ExtraAttrDescAssignment_0 : ( ruleLineComment ) ;
    public final void rule__Constant__ExtraAttrDescAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:6327:1: ( ( ruleLineComment ) )
            // InternalDdParser.g:6328:2: ( ruleLineComment )
            {
            // InternalDdParser.g:6328:2: ( ruleLineComment )
            // InternalDdParser.g:6329:3: ruleLineComment
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getExtraAttrDescLineCommentParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleLineComment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantAccess().getExtraAttrDescLineCommentParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__ExtraAttrDescAssignment_0"


    // $ANTLR start "rule__Constant__DataTypeAssignment_1"
    // InternalDdParser.g:6338:1: rule__Constant__DataTypeAssignment_1 : ( ruleDataType ) ;
    public final void rule__Constant__DataTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:6342:1: ( ( ruleDataType ) )
            // InternalDdParser.g:6343:2: ( ruleDataType )
            {
            // InternalDdParser.g:6343:2: ( ruleDataType )
            // InternalDdParser.g:6344:3: ruleDataType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getDataTypeDataTypeEnumRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDataType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantAccess().getDataTypeDataTypeEnumRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__DataTypeAssignment_1"


    // $ANTLR start "rule__Constant__AttributeSizeAssignment_2"
    // InternalDdParser.g:6353:1: rule__Constant__AttributeSizeAssignment_2 : ( ruleAttributeSize ) ;
    public final void rule__Constant__AttributeSizeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:6357:1: ( ( ruleAttributeSize ) )
            // InternalDdParser.g:6358:2: ( ruleAttributeSize )
            {
            // InternalDdParser.g:6358:2: ( ruleAttributeSize )
            // InternalDdParser.g:6359:3: ruleAttributeSize
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getAttributeSizeAttributeSizeParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAttributeSize();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantAccess().getAttributeSizeAttributeSizeParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__AttributeSizeAssignment_2"


    // $ANTLR start "rule__Constant__ArraySizeAssignment_3"
    // InternalDdParser.g:6368:1: rule__Constant__ArraySizeAssignment_3 : ( ruleArraySize ) ;
    public final void rule__Constant__ArraySizeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:6372:1: ( ( ruleArraySize ) )
            // InternalDdParser.g:6373:2: ( ruleArraySize )
            {
            // InternalDdParser.g:6373:2: ( ruleArraySize )
            // InternalDdParser.g:6374:3: ruleArraySize
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getArraySizeArraySizeParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleArraySize();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantAccess().getArraySizeArraySizeParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__ArraySizeAssignment_3"


    // $ANTLR start "rule__Constant__NameAssignment_4"
    // InternalDdParser.g:6383:1: rule__Constant__NameAssignment_4 : ( RULE_CSTID ) ;
    public final void rule__Constant__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:6387:1: ( ( RULE_CSTID ) )
            // InternalDdParser.g:6388:2: ( RULE_CSTID )
            {
            // InternalDdParser.g:6388:2: ( RULE_CSTID )
            // InternalDdParser.g:6389:3: RULE_CSTID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getNameCSTIDTerminalRuleCall_4_0()); 
            }
            match(input,RULE_CSTID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantAccess().getNameCSTIDTerminalRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__NameAssignment_4"


    // $ANTLR start "rule__Constant__DefaultValueAssignment_5_1"
    // InternalDdParser.g:6398:1: rule__Constant__DefaultValueAssignment_5_1 : ( ruleSharkExpression ) ;
    public final void rule__Constant__DefaultValueAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:6402:1: ( ( ruleSharkExpression ) )
            // InternalDdParser.g:6403:2: ( ruleSharkExpression )
            {
            // InternalDdParser.g:6403:2: ( ruleSharkExpression )
            // InternalDdParser.g:6404:3: ruleSharkExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getDefaultValueSharkExpressionParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSharkExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantAccess().getDefaultValueSharkExpressionParserRuleCall_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__DefaultValueAssignment_5_1"


    // $ANTLR start "rule__Constant__AttrDescAssignment_6"
    // InternalDdParser.g:6413:1: rule__Constant__AttrDescAssignment_6 : ( ruleTrailComment ) ;
    public final void rule__Constant__AttrDescAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:6417:1: ( ( ruleTrailComment ) )
            // InternalDdParser.g:6418:2: ( ruleTrailComment )
            {
            // InternalDdParser.g:6418:2: ( ruleTrailComment )
            // InternalDdParser.g:6419:3: ruleTrailComment
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getAttrDescTrailCommentParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTrailComment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantAccess().getAttrDescTrailCommentParserRuleCall_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__AttrDescAssignment_6"


    // $ANTLR start "rule__Entity__EntityDescLinesAssignment_0"
    // InternalDdParser.g:6428:1: rule__Entity__EntityDescLinesAssignment_0 : ( ruleLineComment ) ;
    public final void rule__Entity__EntityDescLinesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:6432:1: ( ( ruleLineComment ) )
            // InternalDdParser.g:6433:2: ( ruleLineComment )
            {
            // InternalDdParser.g:6433:2: ( ruleLineComment )
            // InternalDdParser.g:6434:3: ruleLineComment
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getEntityDescLinesLineCommentParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleLineComment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getEntityDescLinesLineCommentParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__EntityDescLinesAssignment_0"


    // $ANTLR start "rule__Entity__NameAssignment_1"
    // InternalDdParser.g:6443:1: rule__Entity__NameAssignment_1 : ( RULE_OBJID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:6447:1: ( ( RULE_OBJID ) )
            // InternalDdParser.g:6448:2: ( RULE_OBJID )
            {
            // InternalDdParser.g:6448:2: ( RULE_OBJID )
            // InternalDdParser.g:6449:3: RULE_OBJID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getNameOBJIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_OBJID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getNameOBJIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__NameAssignment_1"


    // $ANTLR start "rule__Entity__ExtendsAssignment_2_1"
    // InternalDdParser.g:6458:1: rule__Entity__ExtendsAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Entity__ExtendsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:6462:1: ( ( ( RULE_ID ) ) )
            // InternalDdParser.g:6463:2: ( ( RULE_ID ) )
            {
            // InternalDdParser.g:6463:2: ( ( RULE_ID ) )
            // InternalDdParser.g:6464:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getExtendsEntityCrossReference_2_1_0()); 
            }
            // InternalDdParser.g:6465:3: ( RULE_ID )
            // InternalDdParser.g:6466:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getExtendsEntityIDTerminalRuleCall_2_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getExtendsEntityIDTerminalRuleCall_2_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getExtendsEntityCrossReference_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__ExtendsAssignment_2_1"


    // $ANTLR start "rule__Entity__AttributesAssignment_5"
    // InternalDdParser.g:6477:1: rule__Entity__AttributesAssignment_5 : ( ruleAttribute ) ;
    public final void rule__Entity__AttributesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:6481:1: ( ( ruleAttribute ) )
            // InternalDdParser.g:6482:2: ( ruleAttribute )
            {
            // InternalDdParser.g:6482:2: ( ruleAttribute )
            // InternalDdParser.g:6483:3: ruleAttribute
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__AttributesAssignment_5"


    // $ANTLR start "rule__Entity__RelationshipsAssignment_6"
    // InternalDdParser.g:6492:1: rule__Entity__RelationshipsAssignment_6 : ( ruleRelationship ) ;
    public final void rule__Entity__RelationshipsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:6496:1: ( ( ruleRelationship ) )
            // InternalDdParser.g:6497:2: ( ruleRelationship )
            {
            // InternalDdParser.g:6497:2: ( ruleRelationship )
            // InternalDdParser.g:6498:3: ruleRelationship
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getRelationshipsRelationshipParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleRelationship();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getRelationshipsRelationshipParserRuleCall_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__RelationshipsAssignment_6"


    // $ANTLR start "rule__Attribute__ExtraAttrDescAssignment_0"
    // InternalDdParser.g:6507:1: rule__Attribute__ExtraAttrDescAssignment_0 : ( ruleLineComment ) ;
    public final void rule__Attribute__ExtraAttrDescAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:6511:1: ( ( ruleLineComment ) )
            // InternalDdParser.g:6512:2: ( ruleLineComment )
            {
            // InternalDdParser.g:6512:2: ( ruleLineComment )
            // InternalDdParser.g:6513:3: ruleLineComment
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getExtraAttrDescLineCommentParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleLineComment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getExtraAttrDescLineCommentParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__ExtraAttrDescAssignment_0"


    // $ANTLR start "rule__Attribute__DataTypeAssignment_1"
    // InternalDdParser.g:6522:1: rule__Attribute__DataTypeAssignment_1 : ( ruleDataType ) ;
    public final void rule__Attribute__DataTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:6526:1: ( ( ruleDataType ) )
            // InternalDdParser.g:6527:2: ( ruleDataType )
            {
            // InternalDdParser.g:6527:2: ( ruleDataType )
            // InternalDdParser.g:6528:3: ruleDataType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getDataTypeDataTypeEnumRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDataType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getDataTypeDataTypeEnumRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__DataTypeAssignment_1"


    // $ANTLR start "rule__Attribute__AttributeSizeAssignment_2"
    // InternalDdParser.g:6537:1: rule__Attribute__AttributeSizeAssignment_2 : ( ruleAttributeSize ) ;
    public final void rule__Attribute__AttributeSizeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:6541:1: ( ( ruleAttributeSize ) )
            // InternalDdParser.g:6542:2: ( ruleAttributeSize )
            {
            // InternalDdParser.g:6542:2: ( ruleAttributeSize )
            // InternalDdParser.g:6543:3: ruleAttributeSize
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getAttributeSizeAttributeSizeParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAttributeSize();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getAttributeSizeAttributeSizeParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__AttributeSizeAssignment_2"


    // $ANTLR start "rule__Attribute__ArraySizeAssignment_3"
    // InternalDdParser.g:6552:1: rule__Attribute__ArraySizeAssignment_3 : ( ruleArraySize ) ;
    public final void rule__Attribute__ArraySizeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:6556:1: ( ( ruleArraySize ) )
            // InternalDdParser.g:6557:2: ( ruleArraySize )
            {
            // InternalDdParser.g:6557:2: ( ruleArraySize )
            // InternalDdParser.g:6558:3: ruleArraySize
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getArraySizeArraySizeParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleArraySize();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getArraySizeArraySizeParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__ArraySizeAssignment_3"


    // $ANTLR start "rule__Attribute__NameAssignment_4"
    // InternalDdParser.g:6567:1: rule__Attribute__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:6571:1: ( ( RULE_ID ) )
            // InternalDdParser.g:6572:2: ( RULE_ID )
            {
            // InternalDdParser.g:6572:2: ( RULE_ID )
            // InternalDdParser.g:6573:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_4_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__NameAssignment_4"


    // $ANTLR start "rule__Attribute__DefaultValueAssignment_5_1"
    // InternalDdParser.g:6582:1: rule__Attribute__DefaultValueAssignment_5_1 : ( ruleSharkExpression ) ;
    public final void rule__Attribute__DefaultValueAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:6586:1: ( ( ruleSharkExpression ) )
            // InternalDdParser.g:6587:2: ( ruleSharkExpression )
            {
            // InternalDdParser.g:6587:2: ( ruleSharkExpression )
            // InternalDdParser.g:6588:3: ruleSharkExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getDefaultValueSharkExpressionParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSharkExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getDefaultValueSharkExpressionParserRuleCall_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__DefaultValueAssignment_5_1"


    // $ANTLR start "rule__Attribute__PrimaryKeyAssignment_6"
    // InternalDdParser.g:6597:1: rule__Attribute__PrimaryKeyAssignment_6 : ( ( Pk ) ) ;
    public final void rule__Attribute__PrimaryKeyAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:6601:1: ( ( ( Pk ) ) )
            // InternalDdParser.g:6602:2: ( ( Pk ) )
            {
            // InternalDdParser.g:6602:2: ( ( Pk ) )
            // InternalDdParser.g:6603:3: ( Pk )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getPrimaryKeyPkKeyword_6_0()); 
            }
            // InternalDdParser.g:6604:3: ( Pk )
            // InternalDdParser.g:6605:4: Pk
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getPrimaryKeyPkKeyword_6_0()); 
            }
            match(input,Pk,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getPrimaryKeyPkKeyword_6_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getPrimaryKeyPkKeyword_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__PrimaryKeyAssignment_6"


    // $ANTLR start "rule__Attribute__MandatoryAssignment_7"
    // InternalDdParser.g:6616:1: rule__Attribute__MandatoryAssignment_7 : ( ( ExclamationMark ) ) ;
    public final void rule__Attribute__MandatoryAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:6620:1: ( ( ( ExclamationMark ) ) )
            // InternalDdParser.g:6621:2: ( ( ExclamationMark ) )
            {
            // InternalDdParser.g:6621:2: ( ( ExclamationMark ) )
            // InternalDdParser.g:6622:3: ( ExclamationMark )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getMandatoryExclamationMarkKeyword_7_0()); 
            }
            // InternalDdParser.g:6623:3: ( ExclamationMark )
            // InternalDdParser.g:6624:4: ExclamationMark
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getMandatoryExclamationMarkKeyword_7_0()); 
            }
            match(input,ExclamationMark,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getMandatoryExclamationMarkKeyword_7_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getMandatoryExclamationMarkKeyword_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__MandatoryAssignment_7"


    // $ANTLR start "rule__Attribute__AttrDescAssignment_8"
    // InternalDdParser.g:6635:1: rule__Attribute__AttrDescAssignment_8 : ( ruleTrailComment ) ;
    public final void rule__Attribute__AttrDescAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:6639:1: ( ( ruleTrailComment ) )
            // InternalDdParser.g:6640:2: ( ruleTrailComment )
            {
            // InternalDdParser.g:6640:2: ( ruleTrailComment )
            // InternalDdParser.g:6641:3: ruleTrailComment
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getAttrDescTrailCommentParserRuleCall_8_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTrailComment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getAttrDescTrailCommentParserRuleCall_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__AttrDescAssignment_8"


    // $ANTLR start "rule__AttributeSize__LengthAssignment_1"
    // InternalDdParser.g:6650:1: rule__AttributeSize__LengthAssignment_1 : ( RULE_INT ) ;
    public final void rule__AttributeSize__LengthAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:6654:1: ( ( RULE_INT ) )
            // InternalDdParser.g:6655:2: ( RULE_INT )
            {
            // InternalDdParser.g:6655:2: ( RULE_INT )
            // InternalDdParser.g:6656:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeSizeAccess().getLengthINTTerminalRuleCall_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeSizeAccess().getLengthINTTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeSize__LengthAssignment_1"


    // $ANTLR start "rule__AttributeSize__PrecisionAssignment_2_1"
    // InternalDdParser.g:6665:1: rule__AttributeSize__PrecisionAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__AttributeSize__PrecisionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:6669:1: ( ( RULE_INT ) )
            // InternalDdParser.g:6670:2: ( RULE_INT )
            {
            // InternalDdParser.g:6670:2: ( RULE_INT )
            // InternalDdParser.g:6671:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeSizeAccess().getPrecisionINTTerminalRuleCall_2_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeSizeAccess().getPrecisionINTTerminalRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeSize__PrecisionAssignment_2_1"


    // $ANTLR start "rule__ArraySize__SizeAssignment_1"
    // InternalDdParser.g:6680:1: rule__ArraySize__SizeAssignment_1 : ( RULE_INT ) ;
    public final void rule__ArraySize__SizeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:6684:1: ( ( RULE_INT ) )
            // InternalDdParser.g:6685:2: ( RULE_INT )
            {
            // InternalDdParser.g:6685:2: ( RULE_INT )
            // InternalDdParser.g:6686:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArraySizeAccess().getSizeINTTerminalRuleCall_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArraySizeAccess().getSizeINTTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArraySize__SizeAssignment_1"


    // $ANTLR start "rule__Relationship__Cardi1Assignment_0"
    // InternalDdParser.g:6695:1: rule__Relationship__Cardi1Assignment_0 : ( ruleRangeExpression ) ;
    public final void rule__Relationship__Cardi1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:6699:1: ( ( ruleRangeExpression ) )
            // InternalDdParser.g:6700:2: ( ruleRangeExpression )
            {
            // InternalDdParser.g:6700:2: ( ruleRangeExpression )
            // InternalDdParser.g:6701:3: ruleRangeExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getCardi1RangeExpressionParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleRangeExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipAccess().getCardi1RangeExpressionParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Cardi1Assignment_0"


    // $ANTLR start "rule__Relationship__NameAssignment_1"
    // InternalDdParser.g:6710:1: rule__Relationship__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Relationship__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:6714:1: ( ( RULE_ID ) )
            // InternalDdParser.g:6715:2: ( RULE_ID )
            {
            // InternalDdParser.g:6715:2: ( RULE_ID )
            // InternalDdParser.g:6716:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__NameAssignment_1"


    // $ANTLR start "rule__Relationship__Cardi2Assignment_2"
    // InternalDdParser.g:6725:1: rule__Relationship__Cardi2Assignment_2 : ( ruleRangeExpression ) ;
    public final void rule__Relationship__Cardi2Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:6729:1: ( ( ruleRangeExpression ) )
            // InternalDdParser.g:6730:2: ( ruleRangeExpression )
            {
            // InternalDdParser.g:6730:2: ( ruleRangeExpression )
            // InternalDdParser.g:6731:3: ruleRangeExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getCardi2RangeExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleRangeExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipAccess().getCardi2RangeExpressionParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Cardi2Assignment_2"


    // $ANTLR start "rule__Relationship__LinkToAssignment_3"
    // InternalDdParser.g:6740:1: rule__Relationship__LinkToAssignment_3 : ( ( RULE_OBJID ) ) ;
    public final void rule__Relationship__LinkToAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:6744:1: ( ( ( RULE_OBJID ) ) )
            // InternalDdParser.g:6745:2: ( ( RULE_OBJID ) )
            {
            // InternalDdParser.g:6745:2: ( ( RULE_OBJID ) )
            // InternalDdParser.g:6746:3: ( RULE_OBJID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getLinkToEntityCrossReference_3_0()); 
            }
            // InternalDdParser.g:6747:3: ( RULE_OBJID )
            // InternalDdParser.g:6748:4: RULE_OBJID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getLinkToEntityOBJIDTerminalRuleCall_3_0_1()); 
            }
            match(input,RULE_OBJID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipAccess().getLinkToEntityOBJIDTerminalRuleCall_3_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipAccess().getLinkToEntityCrossReference_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__LinkToAssignment_3"


    // $ANTLR start "rule__Relationship__RelDescAssignment_4"
    // InternalDdParser.g:6759:1: rule__Relationship__RelDescAssignment_4 : ( ruleTrailComment ) ;
    public final void rule__Relationship__RelDescAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:6763:1: ( ( ruleTrailComment ) )
            // InternalDdParser.g:6764:2: ( ruleTrailComment )
            {
            // InternalDdParser.g:6764:2: ( ruleTrailComment )
            // InternalDdParser.g:6765:3: ruleTrailComment
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getRelDescTrailCommentParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTrailComment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipAccess().getRelDescTrailCommentParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__RelDescAssignment_4"


    // $ANTLR start "rule__Constraint__ChkDescLinesAssignment_0"
    // InternalDdParser.g:6774:1: rule__Constraint__ChkDescLinesAssignment_0 : ( ruleLineComment ) ;
    public final void rule__Constraint__ChkDescLinesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:6778:1: ( ( ruleLineComment ) )
            // InternalDdParser.g:6779:2: ( ruleLineComment )
            {
            // InternalDdParser.g:6779:2: ( ruleLineComment )
            // InternalDdParser.g:6780:3: ruleLineComment
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintAccess().getChkDescLinesLineCommentParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleLineComment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstraintAccess().getChkDescLinesLineCommentParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__ChkDescLinesAssignment_0"


    // $ANTLR start "rule__Constraint__NameAssignment_1"
    // InternalDdParser.g:6789:1: rule__Constraint__NameAssignment_1 : ( RULE_CHKID ) ;
    public final void rule__Constraint__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:6793:1: ( ( RULE_CHKID ) )
            // InternalDdParser.g:6794:2: ( RULE_CHKID )
            {
            // InternalDdParser.g:6794:2: ( RULE_CHKID )
            // InternalDdParser.g:6795:3: RULE_CHKID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintAccess().getNameCHKIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_CHKID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstraintAccess().getNameCHKIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__NameAssignment_1"


    // $ANTLR start "rule__Constraint__CheckAssignment_4"
    // InternalDdParser.g:6804:1: rule__Constraint__CheckAssignment_4 : ( ruleCheckExpression ) ;
    public final void rule__Constraint__CheckAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:6808:1: ( ( ruleCheckExpression ) )
            // InternalDdParser.g:6809:2: ( ruleCheckExpression )
            {
            // InternalDdParser.g:6809:2: ( ruleCheckExpression )
            // InternalDdParser.g:6810:3: ruleCheckExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintAccess().getCheckCheckExpressionParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCheckExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstraintAccess().getCheckCheckExpressionParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__CheckAssignment_4"


    // $ANTLR start "rule__CheckExpression__ChkDescAssignment_0"
    // InternalDdParser.g:6819:1: rule__CheckExpression__ChkDescAssignment_0 : ( ruleLineComment ) ;
    public final void rule__CheckExpression__ChkDescAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:6823:1: ( ( ruleLineComment ) )
            // InternalDdParser.g:6824:2: ( ruleLineComment )
            {
            // InternalDdParser.g:6824:2: ( ruleLineComment )
            // InternalDdParser.g:6825:3: ruleLineComment
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCheckExpressionAccess().getChkDescLineCommentParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleLineComment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCheckExpressionAccess().getChkDescLineCommentParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckExpression__ChkDescAssignment_0"


    // $ANTLR start "rule__CheckExpression__NameAssignment_1"
    // InternalDdParser.g:6834:1: rule__CheckExpression__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CheckExpression__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:6838:1: ( ( RULE_ID ) )
            // InternalDdParser.g:6839:2: ( RULE_ID )
            {
            // InternalDdParser.g:6839:2: ( RULE_ID )
            // InternalDdParser.g:6840:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCheckExpressionAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCheckExpressionAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckExpression__NameAssignment_1"


    // $ANTLR start "rule__CheckExpression__ExprAssignment_2"
    // InternalDdParser.g:6849:1: rule__CheckExpression__ExprAssignment_2 : ( ruleSharkExpression ) ;
    public final void rule__CheckExpression__ExprAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:6853:1: ( ( ruleSharkExpression ) )
            // InternalDdParser.g:6854:2: ( ruleSharkExpression )
            {
            // InternalDdParser.g:6854:2: ( ruleSharkExpression )
            // InternalDdParser.g:6855:3: ruleSharkExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCheckExpressionAccess().getExprSharkExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSharkExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCheckExpressionAccess().getExprSharkExpressionParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckExpression__ExprAssignment_2"


    // $ANTLR start "rule__BinaryExpression__LeftAssignment_1"
    // InternalDdParser.g:6864:1: rule__BinaryExpression__LeftAssignment_1 : ( ruleSharkExpression ) ;
    public final void rule__BinaryExpression__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:6868:1: ( ( ruleSharkExpression ) )
            // InternalDdParser.g:6869:2: ( ruleSharkExpression )
            {
            // InternalDdParser.g:6869:2: ( ruleSharkExpression )
            // InternalDdParser.g:6870:3: ruleSharkExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryExpressionAccess().getLeftSharkExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSharkExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryExpressionAccess().getLeftSharkExpressionParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__LeftAssignment_1"


    // $ANTLR start "rule__BinaryExpression__OpAssignment_2"
    // InternalDdParser.g:6879:1: rule__BinaryExpression__OpAssignment_2 : ( ruleBinaryOperator ) ;
    public final void rule__BinaryExpression__OpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:6883:1: ( ( ruleBinaryOperator ) )
            // InternalDdParser.g:6884:2: ( ruleBinaryOperator )
            {
            // InternalDdParser.g:6884:2: ( ruleBinaryOperator )
            // InternalDdParser.g:6885:3: ruleBinaryOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryExpressionAccess().getOpBinaryOperatorEnumRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBinaryOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryExpressionAccess().getOpBinaryOperatorEnumRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__OpAssignment_2"


    // $ANTLR start "rule__BinaryExpression__RightAssignment_3"
    // InternalDdParser.g:6894:1: rule__BinaryExpression__RightAssignment_3 : ( ruleSharkExpression ) ;
    public final void rule__BinaryExpression__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:6898:1: ( ( ruleSharkExpression ) )
            // InternalDdParser.g:6899:2: ( ruleSharkExpression )
            {
            // InternalDdParser.g:6899:2: ( ruleSharkExpression )
            // InternalDdParser.g:6900:3: ruleSharkExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryExpressionAccess().getRightSharkExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSharkExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryExpressionAccess().getRightSharkExpressionParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__RightAssignment_3"


    // $ANTLR start "rule__BinaryExpression__NumTypeAssignment_5_0"
    // InternalDdParser.g:6909:1: rule__BinaryExpression__NumTypeAssignment_5_0 : ( RULE_NULL ) ;
    public final void rule__BinaryExpression__NumTypeAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:6913:1: ( ( RULE_NULL ) )
            // InternalDdParser.g:6914:2: ( RULE_NULL )
            {
            // InternalDdParser.g:6914:2: ( RULE_NULL )
            // InternalDdParser.g:6915:3: RULE_NULL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryExpressionAccess().getNumTypeNULLTerminalRuleCall_5_0_0()); 
            }
            match(input,RULE_NULL,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryExpressionAccess().getNumTypeNULLTerminalRuleCall_5_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__NumTypeAssignment_5_0"


    // $ANTLR start "rule__BinaryExpression__StrTypeAssignment_5_1"
    // InternalDdParser.g:6924:1: rule__BinaryExpression__StrTypeAssignment_5_1 : ( RULE_NULL ) ;
    public final void rule__BinaryExpression__StrTypeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:6928:1: ( ( RULE_NULL ) )
            // InternalDdParser.g:6929:2: ( RULE_NULL )
            {
            // InternalDdParser.g:6929:2: ( RULE_NULL )
            // InternalDdParser.g:6930:3: RULE_NULL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryExpressionAccess().getStrTypeNULLTerminalRuleCall_5_1_0()); 
            }
            match(input,RULE_NULL,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryExpressionAccess().getStrTypeNULLTerminalRuleCall_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__StrTypeAssignment_5_1"


    // $ANTLR start "rule__BinaryExpression__DateTypeAssignment_5_2"
    // InternalDdParser.g:6939:1: rule__BinaryExpression__DateTypeAssignment_5_2 : ( RULE_NULL ) ;
    public final void rule__BinaryExpression__DateTypeAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:6943:1: ( ( RULE_NULL ) )
            // InternalDdParser.g:6944:2: ( RULE_NULL )
            {
            // InternalDdParser.g:6944:2: ( RULE_NULL )
            // InternalDdParser.g:6945:3: RULE_NULL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryExpressionAccess().getDateTypeNULLTerminalRuleCall_5_2_0()); 
            }
            match(input,RULE_NULL,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryExpressionAccess().getDateTypeNULLTerminalRuleCall_5_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__DateTypeAssignment_5_2"


    // $ANTLR start "rule__BinaryExpression__BoolTypeAssignment_5_3"
    // InternalDdParser.g:6954:1: rule__BinaryExpression__BoolTypeAssignment_5_3 : ( RULE_NULL ) ;
    public final void rule__BinaryExpression__BoolTypeAssignment_5_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:6958:1: ( ( RULE_NULL ) )
            // InternalDdParser.g:6959:2: ( RULE_NULL )
            {
            // InternalDdParser.g:6959:2: ( RULE_NULL )
            // InternalDdParser.g:6960:3: RULE_NULL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryExpressionAccess().getBoolTypeNULLTerminalRuleCall_5_3_0()); 
            }
            match(input,RULE_NULL,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryExpressionAccess().getBoolTypeNULLTerminalRuleCall_5_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__BoolTypeAssignment_5_3"


    // $ANTLR start "rule__UnaryExpression__OpAssignment_0"
    // InternalDdParser.g:6969:1: rule__UnaryExpression__OpAssignment_0 : ( ruleUnaryOperator ) ;
    public final void rule__UnaryExpression__OpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:6973:1: ( ( ruleUnaryOperator ) )
            // InternalDdParser.g:6974:2: ( ruleUnaryOperator )
            {
            // InternalDdParser.g:6974:2: ( ruleUnaryOperator )
            // InternalDdParser.g:6975:3: ruleUnaryOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getOpUnaryOperatorEnumRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleUnaryOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExpressionAccess().getOpUnaryOperatorEnumRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__OpAssignment_0"


    // $ANTLR start "rule__UnaryExpression__LeftAssignment_2"
    // InternalDdParser.g:6984:1: rule__UnaryExpression__LeftAssignment_2 : ( ruleSharkExpression ) ;
    public final void rule__UnaryExpression__LeftAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:6988:1: ( ( ruleSharkExpression ) )
            // InternalDdParser.g:6989:2: ( ruleSharkExpression )
            {
            // InternalDdParser.g:6989:2: ( ruleSharkExpression )
            // InternalDdParser.g:6990:3: ruleSharkExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getLeftSharkExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSharkExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExpressionAccess().getLeftSharkExpressionParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__LeftAssignment_2"


    // $ANTLR start "rule__UnaryExpression__NumTypeAssignment_4_0"
    // InternalDdParser.g:6999:1: rule__UnaryExpression__NumTypeAssignment_4_0 : ( RULE_NULL ) ;
    public final void rule__UnaryExpression__NumTypeAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:7003:1: ( ( RULE_NULL ) )
            // InternalDdParser.g:7004:2: ( RULE_NULL )
            {
            // InternalDdParser.g:7004:2: ( RULE_NULL )
            // InternalDdParser.g:7005:3: RULE_NULL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getNumTypeNULLTerminalRuleCall_4_0_0()); 
            }
            match(input,RULE_NULL,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExpressionAccess().getNumTypeNULLTerminalRuleCall_4_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__NumTypeAssignment_4_0"


    // $ANTLR start "rule__UnaryExpression__StrTypeAssignment_4_1"
    // InternalDdParser.g:7014:1: rule__UnaryExpression__StrTypeAssignment_4_1 : ( RULE_NULL ) ;
    public final void rule__UnaryExpression__StrTypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:7018:1: ( ( RULE_NULL ) )
            // InternalDdParser.g:7019:2: ( RULE_NULL )
            {
            // InternalDdParser.g:7019:2: ( RULE_NULL )
            // InternalDdParser.g:7020:3: RULE_NULL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getStrTypeNULLTerminalRuleCall_4_1_0()); 
            }
            match(input,RULE_NULL,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExpressionAccess().getStrTypeNULLTerminalRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__StrTypeAssignment_4_1"


    // $ANTLR start "rule__UnaryExpression__DateTypeAssignment_4_2"
    // InternalDdParser.g:7029:1: rule__UnaryExpression__DateTypeAssignment_4_2 : ( RULE_NULL ) ;
    public final void rule__UnaryExpression__DateTypeAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:7033:1: ( ( RULE_NULL ) )
            // InternalDdParser.g:7034:2: ( RULE_NULL )
            {
            // InternalDdParser.g:7034:2: ( RULE_NULL )
            // InternalDdParser.g:7035:3: RULE_NULL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getDateTypeNULLTerminalRuleCall_4_2_0()); 
            }
            match(input,RULE_NULL,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExpressionAccess().getDateTypeNULLTerminalRuleCall_4_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__DateTypeAssignment_4_2"


    // $ANTLR start "rule__UnaryExpression__BoolTypeAssignment_4_3"
    // InternalDdParser.g:7044:1: rule__UnaryExpression__BoolTypeAssignment_4_3 : ( RULE_NULL ) ;
    public final void rule__UnaryExpression__BoolTypeAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:7048:1: ( ( RULE_NULL ) )
            // InternalDdParser.g:7049:2: ( RULE_NULL )
            {
            // InternalDdParser.g:7049:2: ( RULE_NULL )
            // InternalDdParser.g:7050:3: RULE_NULL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getBoolTypeNULLTerminalRuleCall_4_3_0()); 
            }
            match(input,RULE_NULL,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExpressionAccess().getBoolTypeNULLTerminalRuleCall_4_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__BoolTypeAssignment_4_3"


    // $ANTLR start "rule__AddExpression__LeftAssignment_1"
    // InternalDdParser.g:7059:1: rule__AddExpression__LeftAssignment_1 : ( ruleSharkExpression ) ;
    public final void rule__AddExpression__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:7063:1: ( ( ruleSharkExpression ) )
            // InternalDdParser.g:7064:2: ( ruleSharkExpression )
            {
            // InternalDdParser.g:7064:2: ( ruleSharkExpression )
            // InternalDdParser.g:7065:3: ruleSharkExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getLeftSharkExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSharkExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddExpressionAccess().getLeftSharkExpressionParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpression__LeftAssignment_1"


    // $ANTLR start "rule__AddExpression__OpAssignment_2"
    // InternalDdParser.g:7074:1: rule__AddExpression__OpAssignment_2 : ( ( rule__AddExpression__OpAlternatives_2_0 ) ) ;
    public final void rule__AddExpression__OpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:7078:1: ( ( ( rule__AddExpression__OpAlternatives_2_0 ) ) )
            // InternalDdParser.g:7079:2: ( ( rule__AddExpression__OpAlternatives_2_0 ) )
            {
            // InternalDdParser.g:7079:2: ( ( rule__AddExpression__OpAlternatives_2_0 ) )
            // InternalDdParser.g:7080:3: ( rule__AddExpression__OpAlternatives_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getOpAlternatives_2_0()); 
            }
            // InternalDdParser.g:7081:3: ( rule__AddExpression__OpAlternatives_2_0 )
            // InternalDdParser.g:7081:4: rule__AddExpression__OpAlternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__AddExpression__OpAlternatives_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddExpressionAccess().getOpAlternatives_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpression__OpAssignment_2"


    // $ANTLR start "rule__AddExpression__RightAssignment_3"
    // InternalDdParser.g:7089:1: rule__AddExpression__RightAssignment_3 : ( ruleSharkExpression ) ;
    public final void rule__AddExpression__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:7093:1: ( ( ruleSharkExpression ) )
            // InternalDdParser.g:7094:2: ( ruleSharkExpression )
            {
            // InternalDdParser.g:7094:2: ( ruleSharkExpression )
            // InternalDdParser.g:7095:3: ruleSharkExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getRightSharkExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSharkExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddExpressionAccess().getRightSharkExpressionParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpression__RightAssignment_3"


    // $ANTLR start "rule__AddExpression__AddEltsAssignment_4"
    // InternalDdParser.g:7104:1: rule__AddExpression__AddEltsAssignment_4 : ( ruleAddExpressionElt ) ;
    public final void rule__AddExpression__AddEltsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:7108:1: ( ( ruleAddExpressionElt ) )
            // InternalDdParser.g:7109:2: ( ruleAddExpressionElt )
            {
            // InternalDdParser.g:7109:2: ( ruleAddExpressionElt )
            // InternalDdParser.g:7110:3: ruleAddExpressionElt
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getAddEltsAddExpressionEltParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAddExpressionElt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddExpressionAccess().getAddEltsAddExpressionEltParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpression__AddEltsAssignment_4"


    // $ANTLR start "rule__AddExpression__CheckedAssignment_6"
    // InternalDdParser.g:7119:1: rule__AddExpression__CheckedAssignment_6 : ( RULE_NULL ) ;
    public final void rule__AddExpression__CheckedAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:7123:1: ( ( RULE_NULL ) )
            // InternalDdParser.g:7124:2: ( RULE_NULL )
            {
            // InternalDdParser.g:7124:2: ( RULE_NULL )
            // InternalDdParser.g:7125:3: RULE_NULL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getCheckedNULLTerminalRuleCall_6_0()); 
            }
            match(input,RULE_NULL,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddExpressionAccess().getCheckedNULLTerminalRuleCall_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpression__CheckedAssignment_6"


    // $ANTLR start "rule__AddExpressionElt__OpAssignment_0"
    // InternalDdParser.g:7134:1: rule__AddExpressionElt__OpAssignment_0 : ( ( rule__AddExpressionElt__OpAlternatives_0_0 ) ) ;
    public final void rule__AddExpressionElt__OpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:7138:1: ( ( ( rule__AddExpressionElt__OpAlternatives_0_0 ) ) )
            // InternalDdParser.g:7139:2: ( ( rule__AddExpressionElt__OpAlternatives_0_0 ) )
            {
            // InternalDdParser.g:7139:2: ( ( rule__AddExpressionElt__OpAlternatives_0_0 ) )
            // InternalDdParser.g:7140:3: ( rule__AddExpressionElt__OpAlternatives_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionEltAccess().getOpAlternatives_0_0()); 
            }
            // InternalDdParser.g:7141:3: ( rule__AddExpressionElt__OpAlternatives_0_0 )
            // InternalDdParser.g:7141:4: rule__AddExpressionElt__OpAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__AddExpressionElt__OpAlternatives_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddExpressionEltAccess().getOpAlternatives_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpressionElt__OpAssignment_0"


    // $ANTLR start "rule__AddExpressionElt__RightAssignment_1"
    // InternalDdParser.g:7149:1: rule__AddExpressionElt__RightAssignment_1 : ( ruleSharkExpression ) ;
    public final void rule__AddExpressionElt__RightAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:7153:1: ( ( ruleSharkExpression ) )
            // InternalDdParser.g:7154:2: ( ruleSharkExpression )
            {
            // InternalDdParser.g:7154:2: ( ruleSharkExpression )
            // InternalDdParser.g:7155:3: ruleSharkExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionEltAccess().getRightSharkExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSharkExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddExpressionEltAccess().getRightSharkExpressionParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpressionElt__RightAssignment_1"


    // $ANTLR start "rule__MultExpression__LeftAssignment_1"
    // InternalDdParser.g:7164:1: rule__MultExpression__LeftAssignment_1 : ( ruleSharkExpression ) ;
    public final void rule__MultExpression__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:7168:1: ( ( ruleSharkExpression ) )
            // InternalDdParser.g:7169:2: ( ruleSharkExpression )
            {
            // InternalDdParser.g:7169:2: ( ruleSharkExpression )
            // InternalDdParser.g:7170:3: ruleSharkExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getLeftSharkExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSharkExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultExpressionAccess().getLeftSharkExpressionParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__LeftAssignment_1"


    // $ANTLR start "rule__MultExpression__OpAssignment_2"
    // InternalDdParser.g:7179:1: rule__MultExpression__OpAssignment_2 : ( ( Asterisk ) ) ;
    public final void rule__MultExpression__OpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:7183:1: ( ( ( Asterisk ) ) )
            // InternalDdParser.g:7184:2: ( ( Asterisk ) )
            {
            // InternalDdParser.g:7184:2: ( ( Asterisk ) )
            // InternalDdParser.g:7185:3: ( Asterisk )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getOpAsteriskKeyword_2_0()); 
            }
            // InternalDdParser.g:7186:3: ( Asterisk )
            // InternalDdParser.g:7187:4: Asterisk
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getOpAsteriskKeyword_2_0()); 
            }
            match(input,Asterisk,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultExpressionAccess().getOpAsteriskKeyword_2_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultExpressionAccess().getOpAsteriskKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__OpAssignment_2"


    // $ANTLR start "rule__MultExpression__RightAssignment_3"
    // InternalDdParser.g:7198:1: rule__MultExpression__RightAssignment_3 : ( ruleSharkExpression ) ;
    public final void rule__MultExpression__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:7202:1: ( ( ruleSharkExpression ) )
            // InternalDdParser.g:7203:2: ( ruleSharkExpression )
            {
            // InternalDdParser.g:7203:2: ( ruleSharkExpression )
            // InternalDdParser.g:7204:3: ruleSharkExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getRightSharkExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSharkExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultExpressionAccess().getRightSharkExpressionParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__RightAssignment_3"


    // $ANTLR start "rule__MultExpression__MultEltsAssignment_4"
    // InternalDdParser.g:7213:1: rule__MultExpression__MultEltsAssignment_4 : ( ruleMultExpressionElt ) ;
    public final void rule__MultExpression__MultEltsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:7217:1: ( ( ruleMultExpressionElt ) )
            // InternalDdParser.g:7218:2: ( ruleMultExpressionElt )
            {
            // InternalDdParser.g:7218:2: ( ruleMultExpressionElt )
            // InternalDdParser.g:7219:3: ruleMultExpressionElt
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getMultEltsMultExpressionEltParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMultExpressionElt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultExpressionAccess().getMultEltsMultExpressionEltParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__MultEltsAssignment_4"


    // $ANTLR start "rule__MultExpression__CheckedAssignment_6"
    // InternalDdParser.g:7228:1: rule__MultExpression__CheckedAssignment_6 : ( RULE_NULL ) ;
    public final void rule__MultExpression__CheckedAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:7232:1: ( ( RULE_NULL ) )
            // InternalDdParser.g:7233:2: ( RULE_NULL )
            {
            // InternalDdParser.g:7233:2: ( RULE_NULL )
            // InternalDdParser.g:7234:3: RULE_NULL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getCheckedNULLTerminalRuleCall_6_0()); 
            }
            match(input,RULE_NULL,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultExpressionAccess().getCheckedNULLTerminalRuleCall_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__CheckedAssignment_6"


    // $ANTLR start "rule__MultExpressionElt__OpAssignment_0"
    // InternalDdParser.g:7243:1: rule__MultExpressionElt__OpAssignment_0 : ( ( Asterisk ) ) ;
    public final void rule__MultExpressionElt__OpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:7247:1: ( ( ( Asterisk ) ) )
            // InternalDdParser.g:7248:2: ( ( Asterisk ) )
            {
            // InternalDdParser.g:7248:2: ( ( Asterisk ) )
            // InternalDdParser.g:7249:3: ( Asterisk )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionEltAccess().getOpAsteriskKeyword_0_0()); 
            }
            // InternalDdParser.g:7250:3: ( Asterisk )
            // InternalDdParser.g:7251:4: Asterisk
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionEltAccess().getOpAsteriskKeyword_0_0()); 
            }
            match(input,Asterisk,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultExpressionEltAccess().getOpAsteriskKeyword_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultExpressionEltAccess().getOpAsteriskKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpressionElt__OpAssignment_0"


    // $ANTLR start "rule__MultExpressionElt__RightAssignment_1"
    // InternalDdParser.g:7262:1: rule__MultExpressionElt__RightAssignment_1 : ( ruleSharkExpression ) ;
    public final void rule__MultExpressionElt__RightAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:7266:1: ( ( ruleSharkExpression ) )
            // InternalDdParser.g:7267:2: ( ruleSharkExpression )
            {
            // InternalDdParser.g:7267:2: ( ruleSharkExpression )
            // InternalDdParser.g:7268:3: ruleSharkExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionEltAccess().getRightSharkExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSharkExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultExpressionEltAccess().getRightSharkExpressionParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpressionElt__RightAssignment_1"


    // $ANTLR start "rule__AndExpression__LeftAssignment_1"
    // InternalDdParser.g:7277:1: rule__AndExpression__LeftAssignment_1 : ( ruleSharkExpression ) ;
    public final void rule__AndExpression__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:7281:1: ( ( ruleSharkExpression ) )
            // InternalDdParser.g:7282:2: ( ruleSharkExpression )
            {
            // InternalDdParser.g:7282:2: ( ruleSharkExpression )
            // InternalDdParser.g:7283:3: ruleSharkExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getLeftSharkExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSharkExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getLeftSharkExpressionParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__LeftAssignment_1"


    // $ANTLR start "rule__AndExpression__OpAssignment_2"
    // InternalDdParser.g:7292:1: rule__AndExpression__OpAssignment_2 : ( ( And ) ) ;
    public final void rule__AndExpression__OpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:7296:1: ( ( ( And ) ) )
            // InternalDdParser.g:7297:2: ( ( And ) )
            {
            // InternalDdParser.g:7297:2: ( ( And ) )
            // InternalDdParser.g:7298:3: ( And )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getOpAndKeyword_2_0()); 
            }
            // InternalDdParser.g:7299:3: ( And )
            // InternalDdParser.g:7300:4: And
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getOpAndKeyword_2_0()); 
            }
            match(input,And,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getOpAndKeyword_2_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getOpAndKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__OpAssignment_2"


    // $ANTLR start "rule__AndExpression__RightAssignment_3"
    // InternalDdParser.g:7311:1: rule__AndExpression__RightAssignment_3 : ( ruleSharkExpression ) ;
    public final void rule__AndExpression__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:7315:1: ( ( ruleSharkExpression ) )
            // InternalDdParser.g:7316:2: ( ruleSharkExpression )
            {
            // InternalDdParser.g:7316:2: ( ruleSharkExpression )
            // InternalDdParser.g:7317:3: ruleSharkExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getRightSharkExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSharkExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getRightSharkExpressionParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__RightAssignment_3"


    // $ANTLR start "rule__AndExpression__AndEltsAssignment_4"
    // InternalDdParser.g:7326:1: rule__AndExpression__AndEltsAssignment_4 : ( ruleAndExpressionElt ) ;
    public final void rule__AndExpression__AndEltsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:7330:1: ( ( ruleAndExpressionElt ) )
            // InternalDdParser.g:7331:2: ( ruleAndExpressionElt )
            {
            // InternalDdParser.g:7331:2: ( ruleAndExpressionElt )
            // InternalDdParser.g:7332:3: ruleAndExpressionElt
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getAndEltsAndExpressionEltParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAndExpressionElt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getAndEltsAndExpressionEltParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__AndEltsAssignment_4"


    // $ANTLR start "rule__AndExpression__CheckedAssignment_6"
    // InternalDdParser.g:7341:1: rule__AndExpression__CheckedAssignment_6 : ( RULE_NULL ) ;
    public final void rule__AndExpression__CheckedAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:7345:1: ( ( RULE_NULL ) )
            // InternalDdParser.g:7346:2: ( RULE_NULL )
            {
            // InternalDdParser.g:7346:2: ( RULE_NULL )
            // InternalDdParser.g:7347:3: RULE_NULL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getCheckedNULLTerminalRuleCall_6_0()); 
            }
            match(input,RULE_NULL,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getCheckedNULLTerminalRuleCall_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__CheckedAssignment_6"


    // $ANTLR start "rule__AndExpressionElt__OpAssignment_0"
    // InternalDdParser.g:7356:1: rule__AndExpressionElt__OpAssignment_0 : ( ( And ) ) ;
    public final void rule__AndExpressionElt__OpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:7360:1: ( ( ( And ) ) )
            // InternalDdParser.g:7361:2: ( ( And ) )
            {
            // InternalDdParser.g:7361:2: ( ( And ) )
            // InternalDdParser.g:7362:3: ( And )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionEltAccess().getOpAndKeyword_0_0()); 
            }
            // InternalDdParser.g:7363:3: ( And )
            // InternalDdParser.g:7364:4: And
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionEltAccess().getOpAndKeyword_0_0()); 
            }
            match(input,And,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionEltAccess().getOpAndKeyword_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionEltAccess().getOpAndKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpressionElt__OpAssignment_0"


    // $ANTLR start "rule__AndExpressionElt__RightAssignment_1"
    // InternalDdParser.g:7375:1: rule__AndExpressionElt__RightAssignment_1 : ( ruleSharkExpression ) ;
    public final void rule__AndExpressionElt__RightAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:7379:1: ( ( ruleSharkExpression ) )
            // InternalDdParser.g:7380:2: ( ruleSharkExpression )
            {
            // InternalDdParser.g:7380:2: ( ruleSharkExpression )
            // InternalDdParser.g:7381:3: ruleSharkExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionEltAccess().getRightSharkExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSharkExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionEltAccess().getRightSharkExpressionParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpressionElt__RightAssignment_1"


    // $ANTLR start "rule__OrExpression__LeftAssignment_1"
    // InternalDdParser.g:7390:1: rule__OrExpression__LeftAssignment_1 : ( ruleSharkExpression ) ;
    public final void rule__OrExpression__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:7394:1: ( ( ruleSharkExpression ) )
            // InternalDdParser.g:7395:2: ( ruleSharkExpression )
            {
            // InternalDdParser.g:7395:2: ( ruleSharkExpression )
            // InternalDdParser.g:7396:3: ruleSharkExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getLeftSharkExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSharkExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionAccess().getLeftSharkExpressionParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__LeftAssignment_1"


    // $ANTLR start "rule__OrExpression__OpAssignment_2"
    // InternalDdParser.g:7405:1: rule__OrExpression__OpAssignment_2 : ( ( Or ) ) ;
    public final void rule__OrExpression__OpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:7409:1: ( ( ( Or ) ) )
            // InternalDdParser.g:7410:2: ( ( Or ) )
            {
            // InternalDdParser.g:7410:2: ( ( Or ) )
            // InternalDdParser.g:7411:3: ( Or )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOpOrKeyword_2_0()); 
            }
            // InternalDdParser.g:7412:3: ( Or )
            // InternalDdParser.g:7413:4: Or
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOpOrKeyword_2_0()); 
            }
            match(input,Or,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionAccess().getOpOrKeyword_2_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionAccess().getOpOrKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__OpAssignment_2"


    // $ANTLR start "rule__OrExpression__RightAssignment_3"
    // InternalDdParser.g:7424:1: rule__OrExpression__RightAssignment_3 : ( ruleSharkExpression ) ;
    public final void rule__OrExpression__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:7428:1: ( ( ruleSharkExpression ) )
            // InternalDdParser.g:7429:2: ( ruleSharkExpression )
            {
            // InternalDdParser.g:7429:2: ( ruleSharkExpression )
            // InternalDdParser.g:7430:3: ruleSharkExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getRightSharkExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSharkExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionAccess().getRightSharkExpressionParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__RightAssignment_3"


    // $ANTLR start "rule__OrExpression__OrEltsAssignment_4"
    // InternalDdParser.g:7439:1: rule__OrExpression__OrEltsAssignment_4 : ( ruleOrExpressionElt ) ;
    public final void rule__OrExpression__OrEltsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:7443:1: ( ( ruleOrExpressionElt ) )
            // InternalDdParser.g:7444:2: ( ruleOrExpressionElt )
            {
            // InternalDdParser.g:7444:2: ( ruleOrExpressionElt )
            // InternalDdParser.g:7445:3: ruleOrExpressionElt
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOrEltsOrExpressionEltParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleOrExpressionElt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionAccess().getOrEltsOrExpressionEltParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__OrEltsAssignment_4"


    // $ANTLR start "rule__OrExpression__CheckedAssignment_6"
    // InternalDdParser.g:7454:1: rule__OrExpression__CheckedAssignment_6 : ( RULE_NULL ) ;
    public final void rule__OrExpression__CheckedAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:7458:1: ( ( RULE_NULL ) )
            // InternalDdParser.g:7459:2: ( RULE_NULL )
            {
            // InternalDdParser.g:7459:2: ( RULE_NULL )
            // InternalDdParser.g:7460:3: RULE_NULL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getCheckedNULLTerminalRuleCall_6_0()); 
            }
            match(input,RULE_NULL,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionAccess().getCheckedNULLTerminalRuleCall_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__CheckedAssignment_6"


    // $ANTLR start "rule__OrExpressionElt__OpAssignment_0"
    // InternalDdParser.g:7469:1: rule__OrExpressionElt__OpAssignment_0 : ( ( Or ) ) ;
    public final void rule__OrExpressionElt__OpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:7473:1: ( ( ( Or ) ) )
            // InternalDdParser.g:7474:2: ( ( Or ) )
            {
            // InternalDdParser.g:7474:2: ( ( Or ) )
            // InternalDdParser.g:7475:3: ( Or )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionEltAccess().getOpOrKeyword_0_0()); 
            }
            // InternalDdParser.g:7476:3: ( Or )
            // InternalDdParser.g:7477:4: Or
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionEltAccess().getOpOrKeyword_0_0()); 
            }
            match(input,Or,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionEltAccess().getOpOrKeyword_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionEltAccess().getOpOrKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpressionElt__OpAssignment_0"


    // $ANTLR start "rule__OrExpressionElt__RightAssignment_1"
    // InternalDdParser.g:7488:1: rule__OrExpressionElt__RightAssignment_1 : ( ruleSharkExpression ) ;
    public final void rule__OrExpressionElt__RightAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:7492:1: ( ( ruleSharkExpression ) )
            // InternalDdParser.g:7493:2: ( ruleSharkExpression )
            {
            // InternalDdParser.g:7493:2: ( ruleSharkExpression )
            // InternalDdParser.g:7494:3: ruleSharkExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionEltAccess().getRightSharkExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSharkExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionEltAccess().getRightSharkExpressionParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpressionElt__RightAssignment_1"


    // $ANTLR start "rule__CatExpression__LeftAssignment_1"
    // InternalDdParser.g:7503:1: rule__CatExpression__LeftAssignment_1 : ( ruleSharkExpression ) ;
    public final void rule__CatExpression__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:7507:1: ( ( ruleSharkExpression ) )
            // InternalDdParser.g:7508:2: ( ruleSharkExpression )
            {
            // InternalDdParser.g:7508:2: ( ruleSharkExpression )
            // InternalDdParser.g:7509:3: ruleSharkExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCatExpressionAccess().getLeftSharkExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSharkExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCatExpressionAccess().getLeftSharkExpressionParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CatExpression__LeftAssignment_1"


    // $ANTLR start "rule__CatExpression__OpAssignment_2"
    // InternalDdParser.g:7518:1: rule__CatExpression__OpAssignment_2 : ( ( Ampersand ) ) ;
    public final void rule__CatExpression__OpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:7522:1: ( ( ( Ampersand ) ) )
            // InternalDdParser.g:7523:2: ( ( Ampersand ) )
            {
            // InternalDdParser.g:7523:2: ( ( Ampersand ) )
            // InternalDdParser.g:7524:3: ( Ampersand )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCatExpressionAccess().getOpAmpersandKeyword_2_0()); 
            }
            // InternalDdParser.g:7525:3: ( Ampersand )
            // InternalDdParser.g:7526:4: Ampersand
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCatExpressionAccess().getOpAmpersandKeyword_2_0()); 
            }
            match(input,Ampersand,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCatExpressionAccess().getOpAmpersandKeyword_2_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCatExpressionAccess().getOpAmpersandKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CatExpression__OpAssignment_2"


    // $ANTLR start "rule__CatExpression__RightAssignment_3"
    // InternalDdParser.g:7537:1: rule__CatExpression__RightAssignment_3 : ( ruleSharkExpression ) ;
    public final void rule__CatExpression__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:7541:1: ( ( ruleSharkExpression ) )
            // InternalDdParser.g:7542:2: ( ruleSharkExpression )
            {
            // InternalDdParser.g:7542:2: ( ruleSharkExpression )
            // InternalDdParser.g:7543:3: ruleSharkExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCatExpressionAccess().getRightSharkExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSharkExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCatExpressionAccess().getRightSharkExpressionParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CatExpression__RightAssignment_3"


    // $ANTLR start "rule__CatExpression__CatEltsAssignment_4"
    // InternalDdParser.g:7552:1: rule__CatExpression__CatEltsAssignment_4 : ( ruleCatExpressionElt ) ;
    public final void rule__CatExpression__CatEltsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:7556:1: ( ( ruleCatExpressionElt ) )
            // InternalDdParser.g:7557:2: ( ruleCatExpressionElt )
            {
            // InternalDdParser.g:7557:2: ( ruleCatExpressionElt )
            // InternalDdParser.g:7558:3: ruleCatExpressionElt
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCatExpressionAccess().getCatEltsCatExpressionEltParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCatExpressionElt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCatExpressionAccess().getCatEltsCatExpressionEltParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CatExpression__CatEltsAssignment_4"


    // $ANTLR start "rule__CatExpression__CheckedAssignment_6"
    // InternalDdParser.g:7567:1: rule__CatExpression__CheckedAssignment_6 : ( RULE_NULL ) ;
    public final void rule__CatExpression__CheckedAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:7571:1: ( ( RULE_NULL ) )
            // InternalDdParser.g:7572:2: ( RULE_NULL )
            {
            // InternalDdParser.g:7572:2: ( RULE_NULL )
            // InternalDdParser.g:7573:3: RULE_NULL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCatExpressionAccess().getCheckedNULLTerminalRuleCall_6_0()); 
            }
            match(input,RULE_NULL,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCatExpressionAccess().getCheckedNULLTerminalRuleCall_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CatExpression__CheckedAssignment_6"


    // $ANTLR start "rule__CatExpressionElt__OpAssignment_0"
    // InternalDdParser.g:7582:1: rule__CatExpressionElt__OpAssignment_0 : ( ( Ampersand ) ) ;
    public final void rule__CatExpressionElt__OpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:7586:1: ( ( ( Ampersand ) ) )
            // InternalDdParser.g:7587:2: ( ( Ampersand ) )
            {
            // InternalDdParser.g:7587:2: ( ( Ampersand ) )
            // InternalDdParser.g:7588:3: ( Ampersand )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCatExpressionEltAccess().getOpAmpersandKeyword_0_0()); 
            }
            // InternalDdParser.g:7589:3: ( Ampersand )
            // InternalDdParser.g:7590:4: Ampersand
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCatExpressionEltAccess().getOpAmpersandKeyword_0_0()); 
            }
            match(input,Ampersand,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCatExpressionEltAccess().getOpAmpersandKeyword_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCatExpressionEltAccess().getOpAmpersandKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CatExpressionElt__OpAssignment_0"


    // $ANTLR start "rule__CatExpressionElt__RightAssignment_1"
    // InternalDdParser.g:7601:1: rule__CatExpressionElt__RightAssignment_1 : ( ruleSharkExpression ) ;
    public final void rule__CatExpressionElt__RightAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:7605:1: ( ( ruleSharkExpression ) )
            // InternalDdParser.g:7606:2: ( ruleSharkExpression )
            {
            // InternalDdParser.g:7606:2: ( ruleSharkExpression )
            // InternalDdParser.g:7607:3: ruleSharkExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCatExpressionEltAccess().getRightSharkExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSharkExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCatExpressionEltAccess().getRightSharkExpressionParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CatExpressionElt__RightAssignment_1"


    // $ANTLR start "rule__ListExpression__OpAssignment_0"
    // InternalDdParser.g:7616:1: rule__ListExpression__OpAssignment_0 : ( ( LeftParenthesis ) ) ;
    public final void rule__ListExpression__OpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:7620:1: ( ( ( LeftParenthesis ) ) )
            // InternalDdParser.g:7621:2: ( ( LeftParenthesis ) )
            {
            // InternalDdParser.g:7621:2: ( ( LeftParenthesis ) )
            // InternalDdParser.g:7622:3: ( LeftParenthesis )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getOpLeftParenthesisKeyword_0_0()); 
            }
            // InternalDdParser.g:7623:3: ( LeftParenthesis )
            // InternalDdParser.g:7624:4: LeftParenthesis
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getOpLeftParenthesisKeyword_0_0()); 
            }
            match(input,LeftParenthesis,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getOpLeftParenthesisKeyword_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getOpLeftParenthesisKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListExpression__OpAssignment_0"


    // $ANTLR start "rule__ListExpression__LeftAssignment_1"
    // InternalDdParser.g:7635:1: rule__ListExpression__LeftAssignment_1 : ( ruleSharkExpression ) ;
    public final void rule__ListExpression__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:7639:1: ( ( ruleSharkExpression ) )
            // InternalDdParser.g:7640:2: ( ruleSharkExpression )
            {
            // InternalDdParser.g:7640:2: ( ruleSharkExpression )
            // InternalDdParser.g:7641:3: ruleSharkExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getLeftSharkExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSharkExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getLeftSharkExpressionParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListExpression__LeftAssignment_1"


    // $ANTLR start "rule__ListExpression__ListEltsAssignment_2"
    // InternalDdParser.g:7650:1: rule__ListExpression__ListEltsAssignment_2 : ( ruleListExpressionElt ) ;
    public final void rule__ListExpression__ListEltsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:7654:1: ( ( ruleListExpressionElt ) )
            // InternalDdParser.g:7655:2: ( ruleListExpressionElt )
            {
            // InternalDdParser.g:7655:2: ( ruleListExpressionElt )
            // InternalDdParser.g:7656:3: ruleListExpressionElt
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getListEltsListExpressionEltParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleListExpressionElt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getListEltsListExpressionEltParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListExpression__ListEltsAssignment_2"


    // $ANTLR start "rule__ListExpression__NumTypeAssignment_4_0"
    // InternalDdParser.g:7665:1: rule__ListExpression__NumTypeAssignment_4_0 : ( RULE_NULL ) ;
    public final void rule__ListExpression__NumTypeAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:7669:1: ( ( RULE_NULL ) )
            // InternalDdParser.g:7670:2: ( RULE_NULL )
            {
            // InternalDdParser.g:7670:2: ( RULE_NULL )
            // InternalDdParser.g:7671:3: RULE_NULL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getNumTypeNULLTerminalRuleCall_4_0_0()); 
            }
            match(input,RULE_NULL,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getNumTypeNULLTerminalRuleCall_4_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListExpression__NumTypeAssignment_4_0"


    // $ANTLR start "rule__ListExpression__StrTypeAssignment_4_1"
    // InternalDdParser.g:7680:1: rule__ListExpression__StrTypeAssignment_4_1 : ( RULE_NULL ) ;
    public final void rule__ListExpression__StrTypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:7684:1: ( ( RULE_NULL ) )
            // InternalDdParser.g:7685:2: ( RULE_NULL )
            {
            // InternalDdParser.g:7685:2: ( RULE_NULL )
            // InternalDdParser.g:7686:3: RULE_NULL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getStrTypeNULLTerminalRuleCall_4_1_0()); 
            }
            match(input,RULE_NULL,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getStrTypeNULLTerminalRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListExpression__StrTypeAssignment_4_1"


    // $ANTLR start "rule__ListExpression__DateTypeAssignment_4_2"
    // InternalDdParser.g:7695:1: rule__ListExpression__DateTypeAssignment_4_2 : ( RULE_NULL ) ;
    public final void rule__ListExpression__DateTypeAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:7699:1: ( ( RULE_NULL ) )
            // InternalDdParser.g:7700:2: ( RULE_NULL )
            {
            // InternalDdParser.g:7700:2: ( RULE_NULL )
            // InternalDdParser.g:7701:3: RULE_NULL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getDateTypeNULLTerminalRuleCall_4_2_0()); 
            }
            match(input,RULE_NULL,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getDateTypeNULLTerminalRuleCall_4_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListExpression__DateTypeAssignment_4_2"


    // $ANTLR start "rule__ListExpression__BoolTypeAssignment_4_3"
    // InternalDdParser.g:7710:1: rule__ListExpression__BoolTypeAssignment_4_3 : ( RULE_NULL ) ;
    public final void rule__ListExpression__BoolTypeAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:7714:1: ( ( RULE_NULL ) )
            // InternalDdParser.g:7715:2: ( RULE_NULL )
            {
            // InternalDdParser.g:7715:2: ( RULE_NULL )
            // InternalDdParser.g:7716:3: RULE_NULL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionAccess().getBoolTypeNULLTerminalRuleCall_4_3_0()); 
            }
            match(input,RULE_NULL,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionAccess().getBoolTypeNULLTerminalRuleCall_4_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListExpression__BoolTypeAssignment_4_3"


    // $ANTLR start "rule__ListExpressionElt__OpAssignment_0"
    // InternalDdParser.g:7725:1: rule__ListExpressionElt__OpAssignment_0 : ( ( Comma ) ) ;
    public final void rule__ListExpressionElt__OpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:7729:1: ( ( ( Comma ) ) )
            // InternalDdParser.g:7730:2: ( ( Comma ) )
            {
            // InternalDdParser.g:7730:2: ( ( Comma ) )
            // InternalDdParser.g:7731:3: ( Comma )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionEltAccess().getOpCommaKeyword_0_0()); 
            }
            // InternalDdParser.g:7732:3: ( Comma )
            // InternalDdParser.g:7733:4: Comma
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionEltAccess().getOpCommaKeyword_0_0()); 
            }
            match(input,Comma,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionEltAccess().getOpCommaKeyword_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionEltAccess().getOpCommaKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListExpressionElt__OpAssignment_0"


    // $ANTLR start "rule__ListExpressionElt__RightAssignment_1"
    // InternalDdParser.g:7744:1: rule__ListExpressionElt__RightAssignment_1 : ( ruleSharkExpression ) ;
    public final void rule__ListExpressionElt__RightAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:7748:1: ( ( ruleSharkExpression ) )
            // InternalDdParser.g:7749:2: ( ruleSharkExpression )
            {
            // InternalDdParser.g:7749:2: ( ruleSharkExpression )
            // InternalDdParser.g:7750:3: ruleSharkExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListExpressionEltAccess().getRightSharkExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSharkExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListExpressionEltAccess().getRightSharkExpressionParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListExpressionElt__RightAssignment_1"


    // $ANTLR start "rule__RangeExpression__RangeAssignment_0_2"
    // InternalDdParser.g:7759:1: rule__RangeExpression__RangeAssignment_0_2 : ( RULE_RANGE ) ;
    public final void rule__RangeExpression__RangeAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:7763:1: ( ( RULE_RANGE ) )
            // InternalDdParser.g:7764:2: ( RULE_RANGE )
            {
            // InternalDdParser.g:7764:2: ( RULE_RANGE )
            // InternalDdParser.g:7765:3: RULE_RANGE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeExpressionAccess().getRangeRANGETerminalRuleCall_0_2_0()); 
            }
            match(input,RULE_RANGE,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeExpressionAccess().getRangeRANGETerminalRuleCall_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeExpression__RangeAssignment_0_2"


    // $ANTLR start "rule__RangeExpression__NumTypeAssignment_0_4_0"
    // InternalDdParser.g:7774:1: rule__RangeExpression__NumTypeAssignment_0_4_0 : ( RULE_NULL ) ;
    public final void rule__RangeExpression__NumTypeAssignment_0_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:7778:1: ( ( RULE_NULL ) )
            // InternalDdParser.g:7779:2: ( RULE_NULL )
            {
            // InternalDdParser.g:7779:2: ( RULE_NULL )
            // InternalDdParser.g:7780:3: RULE_NULL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeExpressionAccess().getNumTypeNULLTerminalRuleCall_0_4_0_0()); 
            }
            match(input,RULE_NULL,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeExpressionAccess().getNumTypeNULLTerminalRuleCall_0_4_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeExpression__NumTypeAssignment_0_4_0"


    // $ANTLR start "rule__RangeExpression__StrTypeAssignment_0_4_1"
    // InternalDdParser.g:7789:1: rule__RangeExpression__StrTypeAssignment_0_4_1 : ( RULE_NULL ) ;
    public final void rule__RangeExpression__StrTypeAssignment_0_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:7793:1: ( ( RULE_NULL ) )
            // InternalDdParser.g:7794:2: ( RULE_NULL )
            {
            // InternalDdParser.g:7794:2: ( RULE_NULL )
            // InternalDdParser.g:7795:3: RULE_NULL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeExpressionAccess().getStrTypeNULLTerminalRuleCall_0_4_1_0()); 
            }
            match(input,RULE_NULL,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeExpressionAccess().getStrTypeNULLTerminalRuleCall_0_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeExpression__StrTypeAssignment_0_4_1"


    // $ANTLR start "rule__RangeExpression__DateTypeAssignment_0_4_2"
    // InternalDdParser.g:7804:1: rule__RangeExpression__DateTypeAssignment_0_4_2 : ( RULE_NULL ) ;
    public final void rule__RangeExpression__DateTypeAssignment_0_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:7808:1: ( ( RULE_NULL ) )
            // InternalDdParser.g:7809:2: ( RULE_NULL )
            {
            // InternalDdParser.g:7809:2: ( RULE_NULL )
            // InternalDdParser.g:7810:3: RULE_NULL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeExpressionAccess().getDateTypeNULLTerminalRuleCall_0_4_2_0()); 
            }
            match(input,RULE_NULL,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeExpressionAccess().getDateTypeNULLTerminalRuleCall_0_4_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeExpression__DateTypeAssignment_0_4_2"


    // $ANTLR start "rule__RangeExpression__BoolTypeAssignment_0_4_3"
    // InternalDdParser.g:7819:1: rule__RangeExpression__BoolTypeAssignment_0_4_3 : ( RULE_NULL ) ;
    public final void rule__RangeExpression__BoolTypeAssignment_0_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:7823:1: ( ( RULE_NULL ) )
            // InternalDdParser.g:7824:2: ( RULE_NULL )
            {
            // InternalDdParser.g:7824:2: ( RULE_NULL )
            // InternalDdParser.g:7825:3: RULE_NULL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeExpressionAccess().getBoolTypeNULLTerminalRuleCall_0_4_3_0()); 
            }
            match(input,RULE_NULL,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeExpressionAccess().getBoolTypeNULLTerminalRuleCall_0_4_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeExpression__BoolTypeAssignment_0_4_3"


    // $ANTLR start "rule__RangeExpression__RangeAssignment_1_2"
    // InternalDdParser.g:7834:1: rule__RangeExpression__RangeAssignment_1_2 : ( RULE_RANGEINF ) ;
    public final void rule__RangeExpression__RangeAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:7838:1: ( ( RULE_RANGEINF ) )
            // InternalDdParser.g:7839:2: ( RULE_RANGEINF )
            {
            // InternalDdParser.g:7839:2: ( RULE_RANGEINF )
            // InternalDdParser.g:7840:3: RULE_RANGEINF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeExpressionAccess().getRangeRANGEINFTerminalRuleCall_1_2_0()); 
            }
            match(input,RULE_RANGEINF,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeExpressionAccess().getRangeRANGEINFTerminalRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeExpression__RangeAssignment_1_2"


    // $ANTLR start "rule__RangeExpression__NumTypeAssignment_1_4_0"
    // InternalDdParser.g:7849:1: rule__RangeExpression__NumTypeAssignment_1_4_0 : ( RULE_NULL ) ;
    public final void rule__RangeExpression__NumTypeAssignment_1_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:7853:1: ( ( RULE_NULL ) )
            // InternalDdParser.g:7854:2: ( RULE_NULL )
            {
            // InternalDdParser.g:7854:2: ( RULE_NULL )
            // InternalDdParser.g:7855:3: RULE_NULL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeExpressionAccess().getNumTypeNULLTerminalRuleCall_1_4_0_0()); 
            }
            match(input,RULE_NULL,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeExpressionAccess().getNumTypeNULLTerminalRuleCall_1_4_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeExpression__NumTypeAssignment_1_4_0"


    // $ANTLR start "rule__RangeExpression__StrTypeAssignment_1_4_1"
    // InternalDdParser.g:7864:1: rule__RangeExpression__StrTypeAssignment_1_4_1 : ( RULE_NULL ) ;
    public final void rule__RangeExpression__StrTypeAssignment_1_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:7868:1: ( ( RULE_NULL ) )
            // InternalDdParser.g:7869:2: ( RULE_NULL )
            {
            // InternalDdParser.g:7869:2: ( RULE_NULL )
            // InternalDdParser.g:7870:3: RULE_NULL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeExpressionAccess().getStrTypeNULLTerminalRuleCall_1_4_1_0()); 
            }
            match(input,RULE_NULL,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeExpressionAccess().getStrTypeNULLTerminalRuleCall_1_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeExpression__StrTypeAssignment_1_4_1"


    // $ANTLR start "rule__RangeExpression__DateTypeAssignment_1_4_2"
    // InternalDdParser.g:7879:1: rule__RangeExpression__DateTypeAssignment_1_4_2 : ( RULE_NULL ) ;
    public final void rule__RangeExpression__DateTypeAssignment_1_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:7883:1: ( ( RULE_NULL ) )
            // InternalDdParser.g:7884:2: ( RULE_NULL )
            {
            // InternalDdParser.g:7884:2: ( RULE_NULL )
            // InternalDdParser.g:7885:3: RULE_NULL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeExpressionAccess().getDateTypeNULLTerminalRuleCall_1_4_2_0()); 
            }
            match(input,RULE_NULL,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeExpressionAccess().getDateTypeNULLTerminalRuleCall_1_4_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeExpression__DateTypeAssignment_1_4_2"


    // $ANTLR start "rule__RangeExpression__BoolTypeAssignment_1_4_3"
    // InternalDdParser.g:7894:1: rule__RangeExpression__BoolTypeAssignment_1_4_3 : ( RULE_NULL ) ;
    public final void rule__RangeExpression__BoolTypeAssignment_1_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:7898:1: ( ( RULE_NULL ) )
            // InternalDdParser.g:7899:2: ( RULE_NULL )
            {
            // InternalDdParser.g:7899:2: ( RULE_NULL )
            // InternalDdParser.g:7900:3: RULE_NULL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeExpressionAccess().getBoolTypeNULLTerminalRuleCall_1_4_3_0()); 
            }
            match(input,RULE_NULL,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeExpressionAccess().getBoolTypeNULLTerminalRuleCall_1_4_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeExpression__BoolTypeAssignment_1_4_3"


    // $ANTLR start "rule__TerminalExpression__ValueAssignment_0_1"
    // InternalDdParser.g:7909:1: rule__TerminalExpression__ValueAssignment_0_1 : ( RULE_STR ) ;
    public final void rule__TerminalExpression__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:7913:1: ( ( RULE_STR ) )
            // InternalDdParser.g:7914:2: ( RULE_STR )
            {
            // InternalDdParser.g:7914:2: ( RULE_STR )
            // InternalDdParser.g:7915:3: RULE_STR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getValueSTRTerminalRuleCall_0_1_0()); 
            }
            match(input,RULE_STR,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getValueSTRTerminalRuleCall_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__ValueAssignment_0_1"


    // $ANTLR start "rule__TerminalExpression__ValueAssignment_1_1"
    // InternalDdParser.g:7924:1: rule__TerminalExpression__ValueAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__TerminalExpression__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:7928:1: ( ( RULE_INT ) )
            // InternalDdParser.g:7929:2: ( RULE_INT )
            {
            // InternalDdParser.g:7929:2: ( RULE_INT )
            // InternalDdParser.g:7930:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getValueINTTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getValueINTTerminalRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__ValueAssignment_1_1"


    // $ANTLR start "rule__TerminalExpression__ValueAssignment_2_1"
    // InternalDdParser.g:7939:1: rule__TerminalExpression__ValueAssignment_2_1 : ( RULE_DEC ) ;
    public final void rule__TerminalExpression__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:7943:1: ( ( RULE_DEC ) )
            // InternalDdParser.g:7944:2: ( RULE_DEC )
            {
            // InternalDdParser.g:7944:2: ( RULE_DEC )
            // InternalDdParser.g:7945:3: RULE_DEC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getValueDECTerminalRuleCall_2_1_0()); 
            }
            match(input,RULE_DEC,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getValueDECTerminalRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__ValueAssignment_2_1"


    // $ANTLR start "rule__TerminalExpression__ValueAssignment_3_1"
    // InternalDdParser.g:7954:1: rule__TerminalExpression__ValueAssignment_3_1 : ( RULE_CHR ) ;
    public final void rule__TerminalExpression__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:7958:1: ( ( RULE_CHR ) )
            // InternalDdParser.g:7959:2: ( RULE_CHR )
            {
            // InternalDdParser.g:7959:2: ( RULE_CHR )
            // InternalDdParser.g:7960:3: RULE_CHR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getValueCHRTerminalRuleCall_3_1_0()); 
            }
            match(input,RULE_CHR,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getValueCHRTerminalRuleCall_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__ValueAssignment_3_1"


    // $ANTLR start "rule__TerminalExpression__ValueAssignment_4_1"
    // InternalDdParser.g:7969:1: rule__TerminalExpression__ValueAssignment_4_1 : ( ( RULE_CSTID ) ) ;
    public final void rule__TerminalExpression__ValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:7973:1: ( ( ( RULE_CSTID ) ) )
            // InternalDdParser.g:7974:2: ( ( RULE_CSTID ) )
            {
            // InternalDdParser.g:7974:2: ( ( RULE_CSTID ) )
            // InternalDdParser.g:7975:3: ( RULE_CSTID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getValueConstantCrossReference_4_1_0()); 
            }
            // InternalDdParser.g:7976:3: ( RULE_CSTID )
            // InternalDdParser.g:7977:4: RULE_CSTID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getValueConstantCSTIDTerminalRuleCall_4_1_0_1()); 
            }
            match(input,RULE_CSTID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getValueConstantCSTIDTerminalRuleCall_4_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getValueConstantCrossReference_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__ValueAssignment_4_1"


    // $ANTLR start "rule__TerminalExpression__ValueAssignment_5_1"
    // InternalDdParser.g:7988:1: rule__TerminalExpression__ValueAssignment_5_1 : ( ruleBoolean ) ;
    public final void rule__TerminalExpression__ValueAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:7992:1: ( ( ruleBoolean ) )
            // InternalDdParser.g:7993:2: ( ruleBoolean )
            {
            // InternalDdParser.g:7993:2: ( ruleBoolean )
            // InternalDdParser.g:7994:3: ruleBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getValueBooleanEnumRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getValueBooleanEnumRuleCall_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__ValueAssignment_5_1"


    // $ANTLR start "rule__TerminalExpression__ValueAssignment_6_1"
    // InternalDdParser.g:8003:1: rule__TerminalExpression__ValueAssignment_6_1 : ( ruleUnset ) ;
    public final void rule__TerminalExpression__ValueAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:8007:1: ( ( ruleUnset ) )
            // InternalDdParser.g:8008:2: ( ruleUnset )
            {
            // InternalDdParser.g:8008:2: ( ruleUnset )
            // InternalDdParser.g:8009:3: ruleUnset
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getValueUnsetEnumRuleCall_6_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleUnset();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getValueUnsetEnumRuleCall_6_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__ValueAssignment_6_1"


    // $ANTLR start "rule__IdentifierExpression__ValueAssignment_1"
    // InternalDdParser.g:8018:1: rule__IdentifierExpression__ValueAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__IdentifierExpression__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:8022:1: ( ( ( ruleQualifiedName ) ) )
            // InternalDdParser.g:8023:2: ( ( ruleQualifiedName ) )
            {
            // InternalDdParser.g:8023:2: ( ( ruleQualifiedName ) )
            // InternalDdParser.g:8024:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentifierExpressionAccess().getValueAttributeCrossReference_1_0()); 
            }
            // InternalDdParser.g:8025:3: ( ruleQualifiedName )
            // InternalDdParser.g:8026:4: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentifierExpressionAccess().getValueAttributeQualifiedNameParserRuleCall_1_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdentifierExpressionAccess().getValueAttributeQualifiedNameParserRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdentifierExpressionAccess().getValueAttributeCrossReference_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdentifierExpression__ValueAssignment_1"


    // $ANTLR start "rule__LineComment__LineAssignment_1"
    // InternalDdParser.g:8037:1: rule__LineComment__LineAssignment_1 : ( RULE_CMT ) ;
    public final void rule__LineComment__LineAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:8041:1: ( ( RULE_CMT ) )
            // InternalDdParser.g:8042:2: ( RULE_CMT )
            {
            // InternalDdParser.g:8042:2: ( RULE_CMT )
            // InternalDdParser.g:8043:3: RULE_CMT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLineCommentAccess().getLineCMTTerminalRuleCall_1_0()); 
            }
            match(input,RULE_CMT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLineCommentAccess().getLineCMTTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineComment__LineAssignment_1"


    // $ANTLR start "rule__TrailComment__LineAssignment_1"
    // InternalDdParser.g:8052:1: rule__TrailComment__LineAssignment_1 : ( RULE_CMT ) ;
    public final void rule__TrailComment__LineAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDdParser.g:8056:1: ( ( RULE_CMT ) )
            // InternalDdParser.g:8057:2: ( RULE_CMT )
            {
            // InternalDdParser.g:8057:2: ( RULE_CMT )
            // InternalDdParser.g:8058:3: RULE_CMT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTrailCommentAccess().getLineCMTTerminalRuleCall_1_0()); 
            }
            match(input,RULE_CMT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTrailCommentAccess().getLineCMTTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrailComment__LineAssignment_1"

    // $ANTLR start synpred1_InternalDdParser
    public final void synpred1_InternalDdParser_fragment() throws RecognitionException {   
        // InternalDdParser.g:935:2: ( ( ( ruleRangeExpression ) ) )
        // InternalDdParser.g:935:2: ( ( ruleRangeExpression ) )
        {
        // InternalDdParser.g:935:2: ( ( ruleRangeExpression ) )
        // InternalDdParser.g:936:3: ( ruleRangeExpression )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getSharkExpressionAccess().getRangeExpressionParserRuleCall_0()); 
        }
        // InternalDdParser.g:937:3: ( ruleRangeExpression )
        // InternalDdParser.g:937:4: ruleRangeExpression
        {
        pushFollow(FOLLOW_2);
        ruleRangeExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred1_InternalDdParser

    // $ANTLR start synpred2_InternalDdParser
    public final void synpred2_InternalDdParser_fragment() throws RecognitionException {   
        // InternalDdParser.g:941:2: ( ( ( ruleAddExpression ) ) )
        // InternalDdParser.g:941:2: ( ( ruleAddExpression ) )
        {
        // InternalDdParser.g:941:2: ( ( ruleAddExpression ) )
        // InternalDdParser.g:942:3: ( ruleAddExpression )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getSharkExpressionAccess().getAddExpressionParserRuleCall_1()); 
        }
        // InternalDdParser.g:943:3: ( ruleAddExpression )
        // InternalDdParser.g:943:4: ruleAddExpression
        {
        pushFollow(FOLLOW_2);
        ruleAddExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred2_InternalDdParser

    // $ANTLR start synpred3_InternalDdParser
    public final void synpred3_InternalDdParser_fragment() throws RecognitionException {   
        // InternalDdParser.g:947:2: ( ( ( ruleMultExpression ) ) )
        // InternalDdParser.g:947:2: ( ( ruleMultExpression ) )
        {
        // InternalDdParser.g:947:2: ( ( ruleMultExpression ) )
        // InternalDdParser.g:948:3: ( ruleMultExpression )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getSharkExpressionAccess().getMultExpressionParserRuleCall_2()); 
        }
        // InternalDdParser.g:949:3: ( ruleMultExpression )
        // InternalDdParser.g:949:4: ruleMultExpression
        {
        pushFollow(FOLLOW_2);
        ruleMultExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred3_InternalDdParser

    // $ANTLR start synpred4_InternalDdParser
    public final void synpred4_InternalDdParser_fragment() throws RecognitionException {   
        // InternalDdParser.g:953:2: ( ( ( ruleAndExpression ) ) )
        // InternalDdParser.g:953:2: ( ( ruleAndExpression ) )
        {
        // InternalDdParser.g:953:2: ( ( ruleAndExpression ) )
        // InternalDdParser.g:954:3: ( ruleAndExpression )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getSharkExpressionAccess().getAndExpressionParserRuleCall_3()); 
        }
        // InternalDdParser.g:955:3: ( ruleAndExpression )
        // InternalDdParser.g:955:4: ruleAndExpression
        {
        pushFollow(FOLLOW_2);
        ruleAndExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred4_InternalDdParser

    // $ANTLR start synpred5_InternalDdParser
    public final void synpred5_InternalDdParser_fragment() throws RecognitionException {   
        // InternalDdParser.g:959:2: ( ( ( ruleOrExpression ) ) )
        // InternalDdParser.g:959:2: ( ( ruleOrExpression ) )
        {
        // InternalDdParser.g:959:2: ( ( ruleOrExpression ) )
        // InternalDdParser.g:960:3: ( ruleOrExpression )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getSharkExpressionAccess().getOrExpressionParserRuleCall_4()); 
        }
        // InternalDdParser.g:961:3: ( ruleOrExpression )
        // InternalDdParser.g:961:4: ruleOrExpression
        {
        pushFollow(FOLLOW_2);
        ruleOrExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred5_InternalDdParser

    // $ANTLR start synpred6_InternalDdParser
    public final void synpred6_InternalDdParser_fragment() throws RecognitionException {   
        // InternalDdParser.g:965:2: ( ( ( ruleCatExpression ) ) )
        // InternalDdParser.g:965:2: ( ( ruleCatExpression ) )
        {
        // InternalDdParser.g:965:2: ( ( ruleCatExpression ) )
        // InternalDdParser.g:966:3: ( ruleCatExpression )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getSharkExpressionAccess().getCatExpressionParserRuleCall_5()); 
        }
        // InternalDdParser.g:967:3: ( ruleCatExpression )
        // InternalDdParser.g:967:4: ruleCatExpression
        {
        pushFollow(FOLLOW_2);
        ruleCatExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred6_InternalDdParser

    // $ANTLR start synpred7_InternalDdParser
    public final void synpred7_InternalDdParser_fragment() throws RecognitionException {   
        // InternalDdParser.g:971:2: ( ( ( ruleListExpression ) ) )
        // InternalDdParser.g:971:2: ( ( ruleListExpression ) )
        {
        // InternalDdParser.g:971:2: ( ( ruleListExpression ) )
        // InternalDdParser.g:972:3: ( ruleListExpression )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getSharkExpressionAccess().getListExpressionParserRuleCall_6()); 
        }
        // InternalDdParser.g:973:3: ( ruleListExpression )
        // InternalDdParser.g:973:4: ruleListExpression
        {
        pushFollow(FOLLOW_2);
        ruleListExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred7_InternalDdParser

    // $ANTLR start synpred8_InternalDdParser
    public final void synpred8_InternalDdParser_fragment() throws RecognitionException {   
        // InternalDdParser.g:977:2: ( ( ruleBinaryExpression ) )
        // InternalDdParser.g:977:2: ( ruleBinaryExpression )
        {
        // InternalDdParser.g:977:2: ( ruleBinaryExpression )
        // InternalDdParser.g:978:3: ruleBinaryExpression
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getSharkExpressionAccess().getBinaryExpressionParserRuleCall_7()); 
        }
        pushFollow(FOLLOW_2);
        ruleBinaryExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred8_InternalDdParser

    // Delegated rules

    public final boolean synpred2_InternalDdParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalDdParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalDdParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalDdParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalDdParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalDdParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalDdParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalDdParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalDdParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalDdParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalDdParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalDdParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalDdParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalDdParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalDdParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalDdParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA10 dfa10 = new DFA10(this);
    protected DFA11 dfa11 = new DFA11(this);
    static final String dfa_1s = "\35\uffff";
    static final String dfa_2s = "\1\4\1\0\33\uffff";
    static final String dfa_3s = "\1\104\1\0\33\uffff";
    static final String dfa_4s = "\2\uffff\1\11\10\uffff\1\12\7\uffff\1\13\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10";
    static final String dfa_5s = "\1\uffff\1\0\33\uffff}>";
    static final String[] dfa_6s = {
            "\1\13\1\uffff\1\2\1\13\2\uffff\1\2\2\uffff\1\2\1\13\2\uffff\5\2\14\uffff\1\1\4\uffff\1\2\23\uffff\2\13\3\uffff\1\13\2\23\2\13",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "930:1: rule__SharkExpression__Alternatives : ( ( ( ruleRangeExpression ) ) | ( ( ruleAddExpression ) ) | ( ( ruleMultExpression ) ) | ( ( ruleAndExpression ) ) | ( ( ruleOrExpression ) ) | ( ( ruleCatExpression ) ) | ( ( ruleListExpression ) ) | ( ruleBinaryExpression ) | ( ruleUnaryExpression ) | ( ruleTerminalExpression ) | ( ruleIdentifierExpression ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA1_1 = input.LA(1);

                         
                        int index1_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalDdParser()) ) {s = 21;}

                        else if ( (synpred2_InternalDdParser()) ) {s = 22;}

                        else if ( (synpred3_InternalDdParser()) ) {s = 23;}

                        else if ( (synpred4_InternalDdParser()) ) {s = 24;}

                        else if ( (synpred5_InternalDdParser()) ) {s = 25;}

                        else if ( (synpred6_InternalDdParser()) ) {s = 26;}

                        else if ( (synpred7_InternalDdParser()) ) {s = 27;}

                        else if ( (synpred8_InternalDdParser()) ) {s = 28;}

                         
                        input.seek(index1_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 1, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_7s = "\7\uffff";
    static final String dfa_8s = "\1\2\6\uffff";
    static final String dfa_9s = "\1\6\1\63\2\uffff\1\6\1\63\1\6";
    static final String dfa_10s = "\1\107\1\63\2\uffff\1\107\1\63\1\107";
    static final String dfa_11s = "\2\uffff\1\2\1\1\3\uffff";
    static final String dfa_12s = "\7\uffff}>";
    static final String[] dfa_13s = {
            "\1\3\1\uffff\3\3\2\uffff\1\3\2\uffff\3\3\2\uffff\2\3\60\uffff\1\1",
            "\1\4",
            "",
            "",
            "\1\3\1\uffff\3\3\2\uffff\1\3\2\uffff\3\3\2\uffff\2\3\50\uffff\1\2\1\uffff\1\2\5\uffff\1\5",
            "\1\6",
            "\1\3\1\uffff\3\3\2\uffff\1\3\2\uffff\3\3\2\uffff\2\3\50\uffff\1\2\1\uffff\1\2\5\uffff\1\5"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "()* loopback of 1414:2: ( rule__DataModelFragment__ConstantsAssignment_0 )*";
        }
    }
    static final String dfa_14s = "\1\107\1\63\1\uffff\1\77\1\63\1\uffff\1\77";
    static final String dfa_15s = "\1\107\1\63\1\uffff\1\107\1\63\1\uffff\1\107";
    static final String dfa_16s = "\2\uffff\1\2\2\uffff\1\1\1\uffff";
    static final String[] dfa_17s = {
            "\1\1",
            "\1\3",
            "",
            "\1\2\1\uffff\1\5\5\uffff\1\4",
            "\1\6",
            "",
            "\1\2\1\uffff\1\5\5\uffff\1\4"
    };
    static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final short[][] dfa_17 = unpackEncodedStringArray(dfa_17s);

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_14;
            this.max = dfa_15;
            this.accept = dfa_16;
            this.special = dfa_12;
            this.transition = dfa_17;
        }
        public String getDescription() {
            return "()* loopback of 1441:2: ( rule__DataModelFragment__EntitiesAssignment_1 )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000672742L,0x0000000000000080L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000672740L,0x0000000000000080L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000400400000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x18000084003E64D0L,0x000000000000001FL});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000040001000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0004000400000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000400400000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00001000C0000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000004800000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00012AB33E809820L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000000A000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000000A000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x1800000000004090L,0x0000000000000019L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000010000000000L});

}