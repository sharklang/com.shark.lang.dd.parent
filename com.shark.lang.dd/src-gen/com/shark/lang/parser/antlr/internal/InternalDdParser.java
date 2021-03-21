package com.shark.lang.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.shark.lang.services.DdGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalDdParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Partitionkey", "Deprecated", "False", "Model", "Round", "Stamp", "Unset", "Bits", "Bool", "Date", "Like", "Stxt", "Time", "True", "And", "Chr", "Dec", "Int", "Key", "Len", "Not", "Str", "HalfwidthHangulFillerHalfwidthHangulFillerHalfwidthHangulFiller", "ExclamationMarkEqualsSign", "HyphenMinusGreaterThanSign", "LessThanSignEqualsSign", "EqualsSignEqualsSign", "GreaterThanSignEqualsSign", "LeftSquareBracketRightSquareBracket", "In", "Or", "ExclamationMark", "PercentSign", "Ampersand", "LeftParenthesis", "RightParenthesis", "Asterisk", "PlusSign", "Comma", "HyphenMinus", "FullStop", "Solidus", "Colon", "LessThanSign", "EqualsSign", "GreaterThanSign", "LeftSquareBracket", "RightSquareBracket", "CircumflexAccent", "LeftCurlyBracket", "RightCurlyBracket", "RULE_BEGIN", "RULE_END", "RULE_EOL", "RULE_NUL", "RULE_HEX", "RULE_NUM", "RULE_UNI", "RULE_ESC", "RULE_ASCII", "RULE_NL", "RULE_STR", "RULE_CHR", "RULE_RANGEINF", "RULE_RANGE", "RULE_CHKID", "RULE_CSTID", "RULE_OBJID", "RULE_ID", "RULE_DEC", "RULE_INT", "RULE_CONT", "RULE_IDENT", "RULE_CMT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_HEX=59;
    public static final int Or=34;
    public static final int RULE_BEGIN=55;
    public static final int True=17;
    public static final int RULE_CHKID=69;
    public static final int False=6;
    public static final int Chr=19;
    public static final int LessThanSign=47;
    public static final int Str=25;
    public static final int PercentSign=36;
    public static final int Like=14;
    public static final int LeftParenthesis=38;
    public static final int RULE_OBJID=71;
    public static final int Bool=12;
    public static final int RULE_NUM=60;
    public static final int RULE_NUL=58;
    public static final int Stxt=15;
    public static final int Ampersand=37;
    public static final int RightSquareBracket=51;
    public static final int ExclamationMark=35;
    public static final int GreaterThanSign=49;
    public static final int RULE_ID=72;
    public static final int RULE_EOL=57;
    public static final int RULE_RANGEINF=67;
    public static final int RULE_DEC=73;
    public static final int RightParenthesis=39;
    public static final int RULE_ESC=62;
    public static final int RULE_IDENT=76;
    public static final int GreaterThanSignEqualsSign=31;
    public static final int EqualsSignEqualsSign=30;
    public static final int Not=24;
    public static final int RULE_CONT=75;
    public static final int And=18;
    public static final int PlusSign=41;
    public static final int RULE_UNI=61;
    public static final int RULE_INT=74;
    public static final int Bits=11;
    public static final int LeftSquareBracket=50;
    public static final int HalfwidthHangulFillerHalfwidthHangulFillerHalfwidthHangulFiller=26;
    public static final int Key=22;
    public static final int RULE_END=56;
    public static final int In=33;
    public static final int Time=16;
    public static final int Int=21;
    public static final int Comma=42;
    public static final int EqualsSign=48;
    public static final int HyphenMinus=43;
    public static final int RULE_ASCII=63;
    public static final int LeftSquareBracketRightSquareBracket=32;
    public static final int Deprecated=5;
    public static final int Partitionkey=4;
    public static final int Round=8;
    public static final int LessThanSignEqualsSign=29;
    public static final int Solidus=45;
    public static final int Colon=46;
    public static final int RightCurlyBracket=54;
    public static final int EOF=-1;
    public static final int Asterisk=40;
    public static final int RULE_CMT=77;
    public static final int FullStop=44;
    public static final int Dec=20;
    public static final int Stamp=9;
    public static final int RULE_CSTID=70;
    public static final int RULE_WS=78;
    public static final int Unset=10;
    public static final int LeftCurlyBracket=53;
    public static final int RULE_ANY_OTHER=79;
    public static final int Date=13;
    public static final int CircumflexAccent=52;
    public static final int RULE_CHR=66;
    public static final int Len=23;
    public static final int RULE_STR=65;
    public static final int Model=7;
    public static final int ExclamationMarkEqualsSign=27;
    public static final int RULE_NL=64;
    public static final int HyphenMinusGreaterThanSign=28;
    public static final int RULE_RANGE=68;

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

        public InternalDdParser(TokenStream input, DdGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "DataModelFragment";
       	}

       	@Override
       	protected DdGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDataModelFragment"
    // InternalDdParser.g:58:1: entryRuleDataModelFragment returns [EObject current=null] : iv_ruleDataModelFragment= ruleDataModelFragment EOF ;
    public final EObject entryRuleDataModelFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataModelFragment = null;


        try {
            // InternalDdParser.g:58:58: (iv_ruleDataModelFragment= ruleDataModelFragment EOF )
            // InternalDdParser.g:59:2: iv_ruleDataModelFragment= ruleDataModelFragment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDataModelFragmentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDataModelFragment=ruleDataModelFragment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDataModelFragment; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataModelFragment"


    // $ANTLR start "ruleDataModelFragment"
    // InternalDdParser.g:65:1: ruleDataModelFragment returns [EObject current=null] : ( ( (lv_modelDesc_0_0= ruleLineComment ) )+ otherlv_1= Model ( (lv_name_2_0= RULE_OBJID ) ) this_EOL_3= RULE_EOL ( (lv_constants_4_0= ruleConstant ) )* ( (lv_entities_5_0= ruleEntity ) )* ( (lv_constraints_6_0= ruleConstraint ) )* ) ;
    public final EObject ruleDataModelFragment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token this_EOL_3=null;
        EObject lv_modelDesc_0_0 = null;

        EObject lv_constants_4_0 = null;

        EObject lv_entities_5_0 = null;

        EObject lv_constraints_6_0 = null;



        	enterRule();

        try {
            // InternalDdParser.g:71:2: ( ( ( (lv_modelDesc_0_0= ruleLineComment ) )+ otherlv_1= Model ( (lv_name_2_0= RULE_OBJID ) ) this_EOL_3= RULE_EOL ( (lv_constants_4_0= ruleConstant ) )* ( (lv_entities_5_0= ruleEntity ) )* ( (lv_constraints_6_0= ruleConstraint ) )* ) )
            // InternalDdParser.g:72:2: ( ( (lv_modelDesc_0_0= ruleLineComment ) )+ otherlv_1= Model ( (lv_name_2_0= RULE_OBJID ) ) this_EOL_3= RULE_EOL ( (lv_constants_4_0= ruleConstant ) )* ( (lv_entities_5_0= ruleEntity ) )* ( (lv_constraints_6_0= ruleConstraint ) )* )
            {
            // InternalDdParser.g:72:2: ( ( (lv_modelDesc_0_0= ruleLineComment ) )+ otherlv_1= Model ( (lv_name_2_0= RULE_OBJID ) ) this_EOL_3= RULE_EOL ( (lv_constants_4_0= ruleConstant ) )* ( (lv_entities_5_0= ruleEntity ) )* ( (lv_constraints_6_0= ruleConstraint ) )* )
            // InternalDdParser.g:73:3: ( (lv_modelDesc_0_0= ruleLineComment ) )+ otherlv_1= Model ( (lv_name_2_0= RULE_OBJID ) ) this_EOL_3= RULE_EOL ( (lv_constants_4_0= ruleConstant ) )* ( (lv_entities_5_0= ruleEntity ) )* ( (lv_constraints_6_0= ruleConstraint ) )*
            {
            // InternalDdParser.g:73:3: ( (lv_modelDesc_0_0= ruleLineComment ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_CMT) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDdParser.g:74:4: (lv_modelDesc_0_0= ruleLineComment )
            	    {
            	    // InternalDdParser.g:74:4: (lv_modelDesc_0_0= ruleLineComment )
            	    // InternalDdParser.g:75:5: lv_modelDesc_0_0= ruleLineComment
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDataModelFragmentAccess().getModelDescLineCommentParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_modelDesc_0_0=ruleLineComment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDataModelFragmentRule());
            	      					}
            	      					add(
            	      						current,
            	      						"modelDesc",
            	      						lv_modelDesc_0_0,
            	      						"com.shark.lang.Dd.LineComment");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            otherlv_1=(Token)match(input,Model,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDataModelFragmentAccess().getModelKeyword_1());
              		
            }
            // InternalDdParser.g:96:3: ( (lv_name_2_0= RULE_OBJID ) )
            // InternalDdParser.g:97:4: (lv_name_2_0= RULE_OBJID )
            {
            // InternalDdParser.g:97:4: (lv_name_2_0= RULE_OBJID )
            // InternalDdParser.g:98:5: lv_name_2_0= RULE_OBJID
            {
            lv_name_2_0=(Token)match(input,RULE_OBJID,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getDataModelFragmentAccess().getNameOBJIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDataModelFragmentRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"com.shark.lang.Dd.OBJID");
              				
            }

            }


            }

            this_EOL_3=(Token)match(input,RULE_EOL,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_EOL_3, grammarAccess.getDataModelFragmentAccess().getEOLTerminalRuleCall_3());
              		
            }
            // InternalDdParser.g:118:3: ( (lv_constants_4_0= ruleConstant ) )*
            loop2:
            do {
                int alt2=2;
                alt2 = dfa2.predict(input);
                switch (alt2) {
            	case 1 :
            	    // InternalDdParser.g:119:4: (lv_constants_4_0= ruleConstant )
            	    {
            	    // InternalDdParser.g:119:4: (lv_constants_4_0= ruleConstant )
            	    // InternalDdParser.g:120:5: lv_constants_4_0= ruleConstant
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDataModelFragmentAccess().getConstantsConstantParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_6);
            	    lv_constants_4_0=ruleConstant();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDataModelFragmentRule());
            	      					}
            	      					add(
            	      						current,
            	      						"constants",
            	      						lv_constants_4_0,
            	      						"com.shark.lang.Dd.Constant");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalDdParser.g:137:3: ( (lv_entities_5_0= ruleEntity ) )*
            loop3:
            do {
                int alt3=2;
                alt3 = dfa3.predict(input);
                switch (alt3) {
            	case 1 :
            	    // InternalDdParser.g:138:4: (lv_entities_5_0= ruleEntity )
            	    {
            	    // InternalDdParser.g:138:4: (lv_entities_5_0= ruleEntity )
            	    // InternalDdParser.g:139:5: lv_entities_5_0= ruleEntity
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDataModelFragmentAccess().getEntitiesEntityParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_7);
            	    lv_entities_5_0=ruleEntity();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDataModelFragmentRule());
            	      					}
            	      					add(
            	      						current,
            	      						"entities",
            	      						lv_entities_5_0,
            	      						"com.shark.lang.Dd.Entity");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalDdParser.g:156:3: ( (lv_constraints_6_0= ruleConstraint ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_CMT) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDdParser.g:157:4: (lv_constraints_6_0= ruleConstraint )
            	    {
            	    // InternalDdParser.g:157:4: (lv_constraints_6_0= ruleConstraint )
            	    // InternalDdParser.g:158:5: lv_constraints_6_0= ruleConstraint
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDataModelFragmentAccess().getConstraintsConstraintParserRuleCall_6_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_7);
            	    lv_constraints_6_0=ruleConstraint();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDataModelFragmentRule());
            	      					}
            	      					add(
            	      						current,
            	      						"constraints",
            	      						lv_constraints_6_0,
            	      						"com.shark.lang.Dd.Constraint");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataModelFragment"


    // $ANTLR start "entryRuleConstant"
    // InternalDdParser.g:179:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // InternalDdParser.g:179:49: (iv_ruleConstant= ruleConstant EOF )
            // InternalDdParser.g:180:2: iv_ruleConstant= ruleConstant EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConstant=ruleConstant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstant; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // InternalDdParser.g:186:1: ruleConstant returns [EObject current=null] : ( ( (lv_extraAttrDesc_0_0= ruleLineComment ) )* ( (lv_dataType_1_0= ruleDataType ) ) ( (lv_attributeSize_2_0= ruleAttributeSize ) )? ( (lv_arraySize_3_0= ruleArraySize ) )? ( (lv_name_4_0= RULE_CSTID ) ) (otherlv_5= EqualsSign ( (lv_defaultValue_6_0= ruleSharkExpression ) ) ) ( (lv_attrDesc_7_0= ruleTrailComment ) ) this_EOL_8= RULE_EOL ) ;
    public final EObject ruleConstant() throws RecognitionException {
        EObject current = null;

        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token this_EOL_8=null;
        EObject lv_extraAttrDesc_0_0 = null;

        Enumerator lv_dataType_1_0 = null;

        EObject lv_attributeSize_2_0 = null;

        EObject lv_arraySize_3_0 = null;

        EObject lv_defaultValue_6_0 = null;

        EObject lv_attrDesc_7_0 = null;



        	enterRule();

        try {
            // InternalDdParser.g:192:2: ( ( ( (lv_extraAttrDesc_0_0= ruleLineComment ) )* ( (lv_dataType_1_0= ruleDataType ) ) ( (lv_attributeSize_2_0= ruleAttributeSize ) )? ( (lv_arraySize_3_0= ruleArraySize ) )? ( (lv_name_4_0= RULE_CSTID ) ) (otherlv_5= EqualsSign ( (lv_defaultValue_6_0= ruleSharkExpression ) ) ) ( (lv_attrDesc_7_0= ruleTrailComment ) ) this_EOL_8= RULE_EOL ) )
            // InternalDdParser.g:193:2: ( ( (lv_extraAttrDesc_0_0= ruleLineComment ) )* ( (lv_dataType_1_0= ruleDataType ) ) ( (lv_attributeSize_2_0= ruleAttributeSize ) )? ( (lv_arraySize_3_0= ruleArraySize ) )? ( (lv_name_4_0= RULE_CSTID ) ) (otherlv_5= EqualsSign ( (lv_defaultValue_6_0= ruleSharkExpression ) ) ) ( (lv_attrDesc_7_0= ruleTrailComment ) ) this_EOL_8= RULE_EOL )
            {
            // InternalDdParser.g:193:2: ( ( (lv_extraAttrDesc_0_0= ruleLineComment ) )* ( (lv_dataType_1_0= ruleDataType ) ) ( (lv_attributeSize_2_0= ruleAttributeSize ) )? ( (lv_arraySize_3_0= ruleArraySize ) )? ( (lv_name_4_0= RULE_CSTID ) ) (otherlv_5= EqualsSign ( (lv_defaultValue_6_0= ruleSharkExpression ) ) ) ( (lv_attrDesc_7_0= ruleTrailComment ) ) this_EOL_8= RULE_EOL )
            // InternalDdParser.g:194:3: ( (lv_extraAttrDesc_0_0= ruleLineComment ) )* ( (lv_dataType_1_0= ruleDataType ) ) ( (lv_attributeSize_2_0= ruleAttributeSize ) )? ( (lv_arraySize_3_0= ruleArraySize ) )? ( (lv_name_4_0= RULE_CSTID ) ) (otherlv_5= EqualsSign ( (lv_defaultValue_6_0= ruleSharkExpression ) ) ) ( (lv_attrDesc_7_0= ruleTrailComment ) ) this_EOL_8= RULE_EOL
            {
            // InternalDdParser.g:194:3: ( (lv_extraAttrDesc_0_0= ruleLineComment ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_CMT) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDdParser.g:195:4: (lv_extraAttrDesc_0_0= ruleLineComment )
            	    {
            	    // InternalDdParser.g:195:4: (lv_extraAttrDesc_0_0= ruleLineComment )
            	    // InternalDdParser.g:196:5: lv_extraAttrDesc_0_0= ruleLineComment
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getConstantAccess().getExtraAttrDescLineCommentParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_8);
            	    lv_extraAttrDesc_0_0=ruleLineComment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getConstantRule());
            	      					}
            	      					add(
            	      						current,
            	      						"extraAttrDesc",
            	      						lv_extraAttrDesc_0_0,
            	      						"com.shark.lang.Dd.LineComment");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // InternalDdParser.g:213:3: ( (lv_dataType_1_0= ruleDataType ) )
            // InternalDdParser.g:214:4: (lv_dataType_1_0= ruleDataType )
            {
            // InternalDdParser.g:214:4: (lv_dataType_1_0= ruleDataType )
            // InternalDdParser.g:215:5: lv_dataType_1_0= ruleDataType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConstantAccess().getDataTypeDataTypeEnumRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_9);
            lv_dataType_1_0=ruleDataType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConstantRule());
              					}
              					set(
              						current,
              						"dataType",
              						lv_dataType_1_0,
              						"com.shark.lang.Dd.DataType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalDdParser.g:232:3: ( (lv_attributeSize_2_0= ruleAttributeSize ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==LeftParenthesis) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDdParser.g:233:4: (lv_attributeSize_2_0= ruleAttributeSize )
                    {
                    // InternalDdParser.g:233:4: (lv_attributeSize_2_0= ruleAttributeSize )
                    // InternalDdParser.g:234:5: lv_attributeSize_2_0= ruleAttributeSize
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getConstantAccess().getAttributeSizeAttributeSizeParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_10);
                    lv_attributeSize_2_0=ruleAttributeSize();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getConstantRule());
                      					}
                      					set(
                      						current,
                      						"attributeSize",
                      						lv_attributeSize_2_0,
                      						"com.shark.lang.Dd.AttributeSize");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDdParser.g:251:3: ( (lv_arraySize_3_0= ruleArraySize ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==LeftSquareBracket) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDdParser.g:252:4: (lv_arraySize_3_0= ruleArraySize )
                    {
                    // InternalDdParser.g:252:4: (lv_arraySize_3_0= ruleArraySize )
                    // InternalDdParser.g:253:5: lv_arraySize_3_0= ruleArraySize
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getConstantAccess().getArraySizeArraySizeParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_11);
                    lv_arraySize_3_0=ruleArraySize();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getConstantRule());
                      					}
                      					set(
                      						current,
                      						"arraySize",
                      						lv_arraySize_3_0,
                      						"com.shark.lang.Dd.ArraySize");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDdParser.g:270:3: ( (lv_name_4_0= RULE_CSTID ) )
            // InternalDdParser.g:271:4: (lv_name_4_0= RULE_CSTID )
            {
            // InternalDdParser.g:271:4: (lv_name_4_0= RULE_CSTID )
            // InternalDdParser.g:272:5: lv_name_4_0= RULE_CSTID
            {
            lv_name_4_0=(Token)match(input,RULE_CSTID,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_4_0, grammarAccess.getConstantAccess().getNameCSTIDTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getConstantRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_4_0,
              						"com.shark.lang.Dd.CSTID");
              				
            }

            }


            }

            // InternalDdParser.g:288:3: (otherlv_5= EqualsSign ( (lv_defaultValue_6_0= ruleSharkExpression ) ) )
            // InternalDdParser.g:289:4: otherlv_5= EqualsSign ( (lv_defaultValue_6_0= ruleSharkExpression ) )
            {
            otherlv_5=(Token)match(input,EqualsSign,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_5, grammarAccess.getConstantAccess().getEqualsSignKeyword_5_0());
              			
            }
            // InternalDdParser.g:293:4: ( (lv_defaultValue_6_0= ruleSharkExpression ) )
            // InternalDdParser.g:294:5: (lv_defaultValue_6_0= ruleSharkExpression )
            {
            // InternalDdParser.g:294:5: (lv_defaultValue_6_0= ruleSharkExpression )
            // InternalDdParser.g:295:6: lv_defaultValue_6_0= ruleSharkExpression
            {
            if ( state.backtracking==0 ) {

              						newCompositeNode(grammarAccess.getConstantAccess().getDefaultValueSharkExpressionParserRuleCall_5_1_0());
              					
            }
            pushFollow(FOLLOW_14);
            lv_defaultValue_6_0=ruleSharkExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              						if (current==null) {
              							current = createModelElementForParent(grammarAccess.getConstantRule());
              						}
              						set(
              							current,
              							"defaultValue",
              							lv_defaultValue_6_0,
              							"com.shark.lang.Dd.SharkExpression");
              						afterParserOrEnumRuleCall();
              					
            }

            }


            }


            }

            // InternalDdParser.g:313:3: ( (lv_attrDesc_7_0= ruleTrailComment ) )
            // InternalDdParser.g:314:4: (lv_attrDesc_7_0= ruleTrailComment )
            {
            // InternalDdParser.g:314:4: (lv_attrDesc_7_0= ruleTrailComment )
            // InternalDdParser.g:315:5: lv_attrDesc_7_0= ruleTrailComment
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConstantAccess().getAttrDescTrailCommentParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_5);
            lv_attrDesc_7_0=ruleTrailComment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConstantRule());
              					}
              					set(
              						current,
              						"attrDesc",
              						lv_attrDesc_7_0,
              						"com.shark.lang.Dd.TrailComment");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            this_EOL_8=(Token)match(input,RULE_EOL,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_EOL_8, grammarAccess.getConstantAccess().getEOLTerminalRuleCall_7());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstant"


    // $ANTLR start "entryRuleEntity"
    // InternalDdParser.g:340:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalDdParser.g:340:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalDdParser.g:341:2: iv_ruleEntity= ruleEntity EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntityRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntity; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalDdParser.g:347:1: ruleEntity returns [EObject current=null] : ( ( (lv_entityDescLines_0_0= ruleLineComment ) )+ ( (lv_name_1_0= RULE_OBJID ) ) (otherlv_2= HyphenMinusGreaterThanSign ( (otherlv_3= RULE_ID ) ) )? otherlv_4= Colon this_BEGIN_5= RULE_BEGIN ( (lv_attributes_6_0= ruleAttribute ) )+ ( (lv_relationships_7_0= ruleRelationship ) )* this_END_8= RULE_END ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token this_BEGIN_5=null;
        Token this_END_8=null;
        EObject lv_entityDescLines_0_0 = null;

        EObject lv_attributes_6_0 = null;

        EObject lv_relationships_7_0 = null;



        	enterRule();

        try {
            // InternalDdParser.g:353:2: ( ( ( (lv_entityDescLines_0_0= ruleLineComment ) )+ ( (lv_name_1_0= RULE_OBJID ) ) (otherlv_2= HyphenMinusGreaterThanSign ( (otherlv_3= RULE_ID ) ) )? otherlv_4= Colon this_BEGIN_5= RULE_BEGIN ( (lv_attributes_6_0= ruleAttribute ) )+ ( (lv_relationships_7_0= ruleRelationship ) )* this_END_8= RULE_END ) )
            // InternalDdParser.g:354:2: ( ( (lv_entityDescLines_0_0= ruleLineComment ) )+ ( (lv_name_1_0= RULE_OBJID ) ) (otherlv_2= HyphenMinusGreaterThanSign ( (otherlv_3= RULE_ID ) ) )? otherlv_4= Colon this_BEGIN_5= RULE_BEGIN ( (lv_attributes_6_0= ruleAttribute ) )+ ( (lv_relationships_7_0= ruleRelationship ) )* this_END_8= RULE_END )
            {
            // InternalDdParser.g:354:2: ( ( (lv_entityDescLines_0_0= ruleLineComment ) )+ ( (lv_name_1_0= RULE_OBJID ) ) (otherlv_2= HyphenMinusGreaterThanSign ( (otherlv_3= RULE_ID ) ) )? otherlv_4= Colon this_BEGIN_5= RULE_BEGIN ( (lv_attributes_6_0= ruleAttribute ) )+ ( (lv_relationships_7_0= ruleRelationship ) )* this_END_8= RULE_END )
            // InternalDdParser.g:355:3: ( (lv_entityDescLines_0_0= ruleLineComment ) )+ ( (lv_name_1_0= RULE_OBJID ) ) (otherlv_2= HyphenMinusGreaterThanSign ( (otherlv_3= RULE_ID ) ) )? otherlv_4= Colon this_BEGIN_5= RULE_BEGIN ( (lv_attributes_6_0= ruleAttribute ) )+ ( (lv_relationships_7_0= ruleRelationship ) )* this_END_8= RULE_END
            {
            // InternalDdParser.g:355:3: ( (lv_entityDescLines_0_0= ruleLineComment ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_CMT) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDdParser.g:356:4: (lv_entityDescLines_0_0= ruleLineComment )
            	    {
            	    // InternalDdParser.g:356:4: (lv_entityDescLines_0_0= ruleLineComment )
            	    // InternalDdParser.g:357:5: lv_entityDescLines_0_0= ruleLineComment
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getEntityAccess().getEntityDescLinesLineCommentParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_15);
            	    lv_entityDescLines_0_0=ruleLineComment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getEntityRule());
            	      					}
            	      					add(
            	      						current,
            	      						"entityDescLines",
            	      						lv_entityDescLines_0_0,
            	      						"com.shark.lang.Dd.LineComment");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            // InternalDdParser.g:374:3: ( (lv_name_1_0= RULE_OBJID ) )
            // InternalDdParser.g:375:4: (lv_name_1_0= RULE_OBJID )
            {
            // InternalDdParser.g:375:4: (lv_name_1_0= RULE_OBJID )
            // InternalDdParser.g:376:5: lv_name_1_0= RULE_OBJID
            {
            lv_name_1_0=(Token)match(input,RULE_OBJID,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getEntityAccess().getNameOBJIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getEntityRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"com.shark.lang.Dd.OBJID");
              				
            }

            }


            }

            // InternalDdParser.g:392:3: (otherlv_2= HyphenMinusGreaterThanSign ( (otherlv_3= RULE_ID ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==HyphenMinusGreaterThanSign) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDdParser.g:393:4: otherlv_2= HyphenMinusGreaterThanSign ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,HyphenMinusGreaterThanSign,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getHyphenMinusGreaterThanSignKeyword_2_0());
                      			
                    }
                    // InternalDdParser.g:397:4: ( (otherlv_3= RULE_ID ) )
                    // InternalDdParser.g:398:5: (otherlv_3= RULE_ID )
                    {
                    // InternalDdParser.g:398:5: (otherlv_3= RULE_ID )
                    // InternalDdParser.g:399:6: otherlv_3= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getEntityRule());
                      						}
                      					
                    }
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getExtendsEntityCrossReference_2_1_0());
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,Colon,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getColonKeyword_3());
              		
            }
            this_BEGIN_5=(Token)match(input,RULE_BEGIN,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_BEGIN_5, grammarAccess.getEntityAccess().getBEGINTerminalRuleCall_4());
              		
            }
            // InternalDdParser.g:419:3: ( (lv_attributes_6_0= ruleAttribute ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                alt10 = dfa10.predict(input);
                switch (alt10) {
            	case 1 :
            	    // InternalDdParser.g:420:4: (lv_attributes_6_0= ruleAttribute )
            	    {
            	    // InternalDdParser.g:420:4: (lv_attributes_6_0= ruleAttribute )
            	    // InternalDdParser.g:421:5: lv_attributes_6_0= ruleAttribute
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_20);
            	    lv_attributes_6_0=ruleAttribute();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getEntityRule());
            	      					}
            	      					add(
            	      						current,
            	      						"attributes",
            	      						lv_attributes_6_0,
            	      						"com.shark.lang.Dd.Attribute");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            // InternalDdParser.g:438:3: ( (lv_relationships_7_0= ruleRelationship ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==LeftParenthesis||LA11_0==RULE_CMT) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDdParser.g:439:4: (lv_relationships_7_0= ruleRelationship )
            	    {
            	    // InternalDdParser.g:439:4: (lv_relationships_7_0= ruleRelationship )
            	    // InternalDdParser.g:440:5: lv_relationships_7_0= ruleRelationship
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getEntityAccess().getRelationshipsRelationshipParserRuleCall_6_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_21);
            	    lv_relationships_7_0=ruleRelationship();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getEntityRule());
            	      					}
            	      					add(
            	      						current,
            	      						"relationships",
            	      						lv_relationships_7_0,
            	      						"com.shark.lang.Dd.Relationship");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            this_END_8=(Token)match(input,RULE_END,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_END_8, grammarAccess.getEntityAccess().getENDTerminalRuleCall_7());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleAttribute"
    // InternalDdParser.g:465:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalDdParser.g:465:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalDdParser.g:466:2: iv_ruleAttribute= ruleAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttribute; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalDdParser.g:472:1: ruleAttribute returns [EObject current=null] : ( ( (lv_extraAttrDesc_0_0= ruleLineComment ) )* ( (lv_dataType_1_0= ruleDataType ) ) ( (lv_attributeSize_2_0= ruleAttributeSize ) )? ( (lv_arraySize_3_0= ruleArraySize ) )? ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= EqualsSign ( (lv_defaultValue_6_0= ruleSharkExpression ) ) )? ( (lv_primaryKey_7_0= Key ) )? ( (lv_partitionKey_8_0= Partitionkey ) )? ( (lv_mandatory_9_0= ExclamationMark ) )? ( (lv_deprecated_10_0= Deprecated ) )? ( (lv_attrDesc_11_0= ruleTrailComment ) ) this_EOL_12= RULE_EOL ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token lv_primaryKey_7_0=null;
        Token lv_partitionKey_8_0=null;
        Token lv_mandatory_9_0=null;
        Token lv_deprecated_10_0=null;
        Token this_EOL_12=null;
        EObject lv_extraAttrDesc_0_0 = null;

        Enumerator lv_dataType_1_0 = null;

        EObject lv_attributeSize_2_0 = null;

        EObject lv_arraySize_3_0 = null;

        EObject lv_defaultValue_6_0 = null;

        EObject lv_attrDesc_11_0 = null;



        	enterRule();

        try {
            // InternalDdParser.g:478:2: ( ( ( (lv_extraAttrDesc_0_0= ruleLineComment ) )* ( (lv_dataType_1_0= ruleDataType ) ) ( (lv_attributeSize_2_0= ruleAttributeSize ) )? ( (lv_arraySize_3_0= ruleArraySize ) )? ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= EqualsSign ( (lv_defaultValue_6_0= ruleSharkExpression ) ) )? ( (lv_primaryKey_7_0= Key ) )? ( (lv_partitionKey_8_0= Partitionkey ) )? ( (lv_mandatory_9_0= ExclamationMark ) )? ( (lv_deprecated_10_0= Deprecated ) )? ( (lv_attrDesc_11_0= ruleTrailComment ) ) this_EOL_12= RULE_EOL ) )
            // InternalDdParser.g:479:2: ( ( (lv_extraAttrDesc_0_0= ruleLineComment ) )* ( (lv_dataType_1_0= ruleDataType ) ) ( (lv_attributeSize_2_0= ruleAttributeSize ) )? ( (lv_arraySize_3_0= ruleArraySize ) )? ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= EqualsSign ( (lv_defaultValue_6_0= ruleSharkExpression ) ) )? ( (lv_primaryKey_7_0= Key ) )? ( (lv_partitionKey_8_0= Partitionkey ) )? ( (lv_mandatory_9_0= ExclamationMark ) )? ( (lv_deprecated_10_0= Deprecated ) )? ( (lv_attrDesc_11_0= ruleTrailComment ) ) this_EOL_12= RULE_EOL )
            {
            // InternalDdParser.g:479:2: ( ( (lv_extraAttrDesc_0_0= ruleLineComment ) )* ( (lv_dataType_1_0= ruleDataType ) ) ( (lv_attributeSize_2_0= ruleAttributeSize ) )? ( (lv_arraySize_3_0= ruleArraySize ) )? ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= EqualsSign ( (lv_defaultValue_6_0= ruleSharkExpression ) ) )? ( (lv_primaryKey_7_0= Key ) )? ( (lv_partitionKey_8_0= Partitionkey ) )? ( (lv_mandatory_9_0= ExclamationMark ) )? ( (lv_deprecated_10_0= Deprecated ) )? ( (lv_attrDesc_11_0= ruleTrailComment ) ) this_EOL_12= RULE_EOL )
            // InternalDdParser.g:480:3: ( (lv_extraAttrDesc_0_0= ruleLineComment ) )* ( (lv_dataType_1_0= ruleDataType ) ) ( (lv_attributeSize_2_0= ruleAttributeSize ) )? ( (lv_arraySize_3_0= ruleArraySize ) )? ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= EqualsSign ( (lv_defaultValue_6_0= ruleSharkExpression ) ) )? ( (lv_primaryKey_7_0= Key ) )? ( (lv_partitionKey_8_0= Partitionkey ) )? ( (lv_mandatory_9_0= ExclamationMark ) )? ( (lv_deprecated_10_0= Deprecated ) )? ( (lv_attrDesc_11_0= ruleTrailComment ) ) this_EOL_12= RULE_EOL
            {
            // InternalDdParser.g:480:3: ( (lv_extraAttrDesc_0_0= ruleLineComment ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_CMT) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDdParser.g:481:4: (lv_extraAttrDesc_0_0= ruleLineComment )
            	    {
            	    // InternalDdParser.g:481:4: (lv_extraAttrDesc_0_0= ruleLineComment )
            	    // InternalDdParser.g:482:5: lv_extraAttrDesc_0_0= ruleLineComment
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getAttributeAccess().getExtraAttrDescLineCommentParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_8);
            	    lv_extraAttrDesc_0_0=ruleLineComment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getAttributeRule());
            	      					}
            	      					add(
            	      						current,
            	      						"extraAttrDesc",
            	      						lv_extraAttrDesc_0_0,
            	      						"com.shark.lang.Dd.LineComment");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // InternalDdParser.g:499:3: ( (lv_dataType_1_0= ruleDataType ) )
            // InternalDdParser.g:500:4: (lv_dataType_1_0= ruleDataType )
            {
            // InternalDdParser.g:500:4: (lv_dataType_1_0= ruleDataType )
            // InternalDdParser.g:501:5: lv_dataType_1_0= ruleDataType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAttributeAccess().getDataTypeDataTypeEnumRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_22);
            lv_dataType_1_0=ruleDataType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAttributeRule());
              					}
              					set(
              						current,
              						"dataType",
              						lv_dataType_1_0,
              						"com.shark.lang.Dd.DataType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalDdParser.g:518:3: ( (lv_attributeSize_2_0= ruleAttributeSize ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==LeftParenthesis) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDdParser.g:519:4: (lv_attributeSize_2_0= ruleAttributeSize )
                    {
                    // InternalDdParser.g:519:4: (lv_attributeSize_2_0= ruleAttributeSize )
                    // InternalDdParser.g:520:5: lv_attributeSize_2_0= ruleAttributeSize
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getAttributeAccess().getAttributeSizeAttributeSizeParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_23);
                    lv_attributeSize_2_0=ruleAttributeSize();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getAttributeRule());
                      					}
                      					set(
                      						current,
                      						"attributeSize",
                      						lv_attributeSize_2_0,
                      						"com.shark.lang.Dd.AttributeSize");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDdParser.g:537:3: ( (lv_arraySize_3_0= ruleArraySize ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==LeftSquareBracket) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDdParser.g:538:4: (lv_arraySize_3_0= ruleArraySize )
                    {
                    // InternalDdParser.g:538:4: (lv_arraySize_3_0= ruleArraySize )
                    // InternalDdParser.g:539:5: lv_arraySize_3_0= ruleArraySize
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getAttributeAccess().getArraySizeArraySizeParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_17);
                    lv_arraySize_3_0=ruleArraySize();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getAttributeRule());
                      					}
                      					set(
                      						current,
                      						"arraySize",
                      						lv_arraySize_3_0,
                      						"com.shark.lang.Dd.ArraySize");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDdParser.g:556:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalDdParser.g:557:4: (lv_name_4_0= RULE_ID )
            {
            // InternalDdParser.g:557:4: (lv_name_4_0= RULE_ID )
            // InternalDdParser.g:558:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_4_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getAttributeRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_4_0,
              						"com.shark.lang.Dd.ID");
              				
            }

            }


            }

            // InternalDdParser.g:574:3: (otherlv_5= EqualsSign ( (lv_defaultValue_6_0= ruleSharkExpression ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==EqualsSign) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDdParser.g:575:4: otherlv_5= EqualsSign ( (lv_defaultValue_6_0= ruleSharkExpression ) )
                    {
                    otherlv_5=(Token)match(input,EqualsSign,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getAttributeAccess().getEqualsSignKeyword_5_0());
                      			
                    }
                    // InternalDdParser.g:579:4: ( (lv_defaultValue_6_0= ruleSharkExpression ) )
                    // InternalDdParser.g:580:5: (lv_defaultValue_6_0= ruleSharkExpression )
                    {
                    // InternalDdParser.g:580:5: (lv_defaultValue_6_0= ruleSharkExpression )
                    // InternalDdParser.g:581:6: lv_defaultValue_6_0= ruleSharkExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAttributeAccess().getDefaultValueSharkExpressionParserRuleCall_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_25);
                    lv_defaultValue_6_0=ruleSharkExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getAttributeRule());
                      						}
                      						set(
                      							current,
                      							"defaultValue",
                      							lv_defaultValue_6_0,
                      							"com.shark.lang.Dd.SharkExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalDdParser.g:599:3: ( (lv_primaryKey_7_0= Key ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==Key) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalDdParser.g:600:4: (lv_primaryKey_7_0= Key )
                    {
                    // InternalDdParser.g:600:4: (lv_primaryKey_7_0= Key )
                    // InternalDdParser.g:601:5: lv_primaryKey_7_0= Key
                    {
                    lv_primaryKey_7_0=(Token)match(input,Key,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_primaryKey_7_0, grammarAccess.getAttributeAccess().getPrimaryKeyKeyKeyword_6_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getAttributeRule());
                      					}
                      					setWithLastConsumed(current, "primaryKey", lv_primaryKey_7_0 != null, "key");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDdParser.g:613:3: ( (lv_partitionKey_8_0= Partitionkey ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==Partitionkey) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalDdParser.g:614:4: (lv_partitionKey_8_0= Partitionkey )
                    {
                    // InternalDdParser.g:614:4: (lv_partitionKey_8_0= Partitionkey )
                    // InternalDdParser.g:615:5: lv_partitionKey_8_0= Partitionkey
                    {
                    lv_partitionKey_8_0=(Token)match(input,Partitionkey,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_partitionKey_8_0, grammarAccess.getAttributeAccess().getPartitionKeyPartitionkeyKeyword_7_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getAttributeRule());
                      					}
                      					setWithLastConsumed(current, "partitionKey", lv_partitionKey_8_0 != null, "partitionkey");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDdParser.g:627:3: ( (lv_mandatory_9_0= ExclamationMark ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==ExclamationMark) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalDdParser.g:628:4: (lv_mandatory_9_0= ExclamationMark )
                    {
                    // InternalDdParser.g:628:4: (lv_mandatory_9_0= ExclamationMark )
                    // InternalDdParser.g:629:5: lv_mandatory_9_0= ExclamationMark
                    {
                    lv_mandatory_9_0=(Token)match(input,ExclamationMark,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_mandatory_9_0, grammarAccess.getAttributeAccess().getMandatoryExclamationMarkKeyword_8_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getAttributeRule());
                      					}
                      					setWithLastConsumed(current, "mandatory", lv_mandatory_9_0 != null, "!");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDdParser.g:641:3: ( (lv_deprecated_10_0= Deprecated ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==Deprecated) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalDdParser.g:642:4: (lv_deprecated_10_0= Deprecated )
                    {
                    // InternalDdParser.g:642:4: (lv_deprecated_10_0= Deprecated )
                    // InternalDdParser.g:643:5: lv_deprecated_10_0= Deprecated
                    {
                    lv_deprecated_10_0=(Token)match(input,Deprecated,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_deprecated_10_0, grammarAccess.getAttributeAccess().getDeprecatedDeprecatedKeyword_9_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getAttributeRule());
                      					}
                      					setWithLastConsumed(current, "deprecated", lv_deprecated_10_0 != null, "deprecated");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDdParser.g:655:3: ( (lv_attrDesc_11_0= ruleTrailComment ) )
            // InternalDdParser.g:656:4: (lv_attrDesc_11_0= ruleTrailComment )
            {
            // InternalDdParser.g:656:4: (lv_attrDesc_11_0= ruleTrailComment )
            // InternalDdParser.g:657:5: lv_attrDesc_11_0= ruleTrailComment
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAttributeAccess().getAttrDescTrailCommentParserRuleCall_10_0());
              				
            }
            pushFollow(FOLLOW_5);
            lv_attrDesc_11_0=ruleTrailComment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAttributeRule());
              					}
              					set(
              						current,
              						"attrDesc",
              						lv_attrDesc_11_0,
              						"com.shark.lang.Dd.TrailComment");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            this_EOL_12=(Token)match(input,RULE_EOL,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_EOL_12, grammarAccess.getAttributeAccess().getEOLTerminalRuleCall_11());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleAttributeSize"
    // InternalDdParser.g:682:1: entryRuleAttributeSize returns [EObject current=null] : iv_ruleAttributeSize= ruleAttributeSize EOF ;
    public final EObject entryRuleAttributeSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeSize = null;


        try {
            // InternalDdParser.g:682:54: (iv_ruleAttributeSize= ruleAttributeSize EOF )
            // InternalDdParser.g:683:2: iv_ruleAttributeSize= ruleAttributeSize EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeSizeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAttributeSize=ruleAttributeSize();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttributeSize; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttributeSize"


    // $ANTLR start "ruleAttributeSize"
    // InternalDdParser.g:689:1: ruleAttributeSize returns [EObject current=null] : (otherlv_0= LeftParenthesis ( (lv_length_1_0= RULE_INT ) ) (otherlv_2= Comma ( (lv_precision_3_0= RULE_INT ) ) )? otherlv_4= RightParenthesis ) ;
    public final EObject ruleAttributeSize() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_length_1_0=null;
        Token otherlv_2=null;
        Token lv_precision_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalDdParser.g:695:2: ( (otherlv_0= LeftParenthesis ( (lv_length_1_0= RULE_INT ) ) (otherlv_2= Comma ( (lv_precision_3_0= RULE_INT ) ) )? otherlv_4= RightParenthesis ) )
            // InternalDdParser.g:696:2: (otherlv_0= LeftParenthesis ( (lv_length_1_0= RULE_INT ) ) (otherlv_2= Comma ( (lv_precision_3_0= RULE_INT ) ) )? otherlv_4= RightParenthesis )
            {
            // InternalDdParser.g:696:2: (otherlv_0= LeftParenthesis ( (lv_length_1_0= RULE_INT ) ) (otherlv_2= Comma ( (lv_precision_3_0= RULE_INT ) ) )? otherlv_4= RightParenthesis )
            // InternalDdParser.g:697:3: otherlv_0= LeftParenthesis ( (lv_length_1_0= RULE_INT ) ) (otherlv_2= Comma ( (lv_precision_3_0= RULE_INT ) ) )? otherlv_4= RightParenthesis
            {
            otherlv_0=(Token)match(input,LeftParenthesis,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAttributeSizeAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalDdParser.g:701:3: ( (lv_length_1_0= RULE_INT ) )
            // InternalDdParser.g:702:4: (lv_length_1_0= RULE_INT )
            {
            // InternalDdParser.g:702:4: (lv_length_1_0= RULE_INT )
            // InternalDdParser.g:703:5: lv_length_1_0= RULE_INT
            {
            lv_length_1_0=(Token)match(input,RULE_INT,FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_length_1_0, grammarAccess.getAttributeSizeAccess().getLengthINTTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getAttributeSizeRule());
              					}
              					setWithLastConsumed(
              						current,
              						"length",
              						lv_length_1_0,
              						"com.shark.lang.Dd.INT");
              				
            }

            }


            }

            // InternalDdParser.g:719:3: (otherlv_2= Comma ( (lv_precision_3_0= RULE_INT ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==Comma) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalDdParser.g:720:4: otherlv_2= Comma ( (lv_precision_3_0= RULE_INT ) )
                    {
                    otherlv_2=(Token)match(input,Comma,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getAttributeSizeAccess().getCommaKeyword_2_0());
                      			
                    }
                    // InternalDdParser.g:724:4: ( (lv_precision_3_0= RULE_INT ) )
                    // InternalDdParser.g:725:5: (lv_precision_3_0= RULE_INT )
                    {
                    // InternalDdParser.g:725:5: (lv_precision_3_0= RULE_INT )
                    // InternalDdParser.g:726:6: lv_precision_3_0= RULE_INT
                    {
                    lv_precision_3_0=(Token)match(input,RULE_INT,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_precision_3_0, grammarAccess.getAttributeSizeAccess().getPrecisionINTTerminalRuleCall_2_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAttributeSizeRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"precision",
                      							lv_precision_3_0,
                      							"com.shark.lang.Dd.INT");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,RightParenthesis,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getAttributeSizeAccess().getRightParenthesisKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttributeSize"


    // $ANTLR start "entryRuleArraySize"
    // InternalDdParser.g:751:1: entryRuleArraySize returns [EObject current=null] : iv_ruleArraySize= ruleArraySize EOF ;
    public final EObject entryRuleArraySize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArraySize = null;


        try {
            // InternalDdParser.g:751:50: (iv_ruleArraySize= ruleArraySize EOF )
            // InternalDdParser.g:752:2: iv_ruleArraySize= ruleArraySize EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArraySizeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArraySize=ruleArraySize();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArraySize; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArraySize"


    // $ANTLR start "ruleArraySize"
    // InternalDdParser.g:758:1: ruleArraySize returns [EObject current=null] : (otherlv_0= LeftSquareBracket ( (lv_size_1_0= RULE_INT ) ) otherlv_2= RightSquareBracket ) ;
    public final EObject ruleArraySize() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_size_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalDdParser.g:764:2: ( (otherlv_0= LeftSquareBracket ( (lv_size_1_0= RULE_INT ) ) otherlv_2= RightSquareBracket ) )
            // InternalDdParser.g:765:2: (otherlv_0= LeftSquareBracket ( (lv_size_1_0= RULE_INT ) ) otherlv_2= RightSquareBracket )
            {
            // InternalDdParser.g:765:2: (otherlv_0= LeftSquareBracket ( (lv_size_1_0= RULE_INT ) ) otherlv_2= RightSquareBracket )
            // InternalDdParser.g:766:3: otherlv_0= LeftSquareBracket ( (lv_size_1_0= RULE_INT ) ) otherlv_2= RightSquareBracket
            {
            otherlv_0=(Token)match(input,LeftSquareBracket,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getArraySizeAccess().getLeftSquareBracketKeyword_0());
              		
            }
            // InternalDdParser.g:770:3: ( (lv_size_1_0= RULE_INT ) )
            // InternalDdParser.g:771:4: (lv_size_1_0= RULE_INT )
            {
            // InternalDdParser.g:771:4: (lv_size_1_0= RULE_INT )
            // InternalDdParser.g:772:5: lv_size_1_0= RULE_INT
            {
            lv_size_1_0=(Token)match(input,RULE_INT,FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_size_1_0, grammarAccess.getArraySizeAccess().getSizeINTTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getArraySizeRule());
              					}
              					setWithLastConsumed(
              						current,
              						"size",
              						lv_size_1_0,
              						"com.shark.lang.Dd.INT");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,RightSquareBracket,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getArraySizeAccess().getRightSquareBracketKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArraySize"


    // $ANTLR start "entryRuleRelationship"
    // InternalDdParser.g:796:1: entryRuleRelationship returns [EObject current=null] : iv_ruleRelationship= ruleRelationship EOF ;
    public final EObject entryRuleRelationship() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationship = null;


        try {
            // InternalDdParser.g:796:53: (iv_ruleRelationship= ruleRelationship EOF )
            // InternalDdParser.g:797:2: iv_ruleRelationship= ruleRelationship EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationshipRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRelationship=ruleRelationship();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelationship; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelationship"


    // $ANTLR start "ruleRelationship"
    // InternalDdParser.g:803:1: ruleRelationship returns [EObject current=null] : ( ( (lv_relDescLines_0_0= ruleLineComment ) )* ( (lv_cardi1_1_0= ruleRangeExpression ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_cardi2_3_0= ruleRangeExpression ) ) ( (otherlv_4= RULE_OBJID ) ) ( (lv_relDesc_5_0= ruleTrailComment ) ) this_EOL_6= RULE_EOL ) ;
    public final EObject ruleRelationship() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Token otherlv_4=null;
        Token this_EOL_6=null;
        EObject lv_relDescLines_0_0 = null;

        EObject lv_cardi1_1_0 = null;

        EObject lv_cardi2_3_0 = null;

        EObject lv_relDesc_5_0 = null;



        	enterRule();

        try {
            // InternalDdParser.g:809:2: ( ( ( (lv_relDescLines_0_0= ruleLineComment ) )* ( (lv_cardi1_1_0= ruleRangeExpression ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_cardi2_3_0= ruleRangeExpression ) ) ( (otherlv_4= RULE_OBJID ) ) ( (lv_relDesc_5_0= ruleTrailComment ) ) this_EOL_6= RULE_EOL ) )
            // InternalDdParser.g:810:2: ( ( (lv_relDescLines_0_0= ruleLineComment ) )* ( (lv_cardi1_1_0= ruleRangeExpression ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_cardi2_3_0= ruleRangeExpression ) ) ( (otherlv_4= RULE_OBJID ) ) ( (lv_relDesc_5_0= ruleTrailComment ) ) this_EOL_6= RULE_EOL )
            {
            // InternalDdParser.g:810:2: ( ( (lv_relDescLines_0_0= ruleLineComment ) )* ( (lv_cardi1_1_0= ruleRangeExpression ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_cardi2_3_0= ruleRangeExpression ) ) ( (otherlv_4= RULE_OBJID ) ) ( (lv_relDesc_5_0= ruleTrailComment ) ) this_EOL_6= RULE_EOL )
            // InternalDdParser.g:811:3: ( (lv_relDescLines_0_0= ruleLineComment ) )* ( (lv_cardi1_1_0= ruleRangeExpression ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_cardi2_3_0= ruleRangeExpression ) ) ( (otherlv_4= RULE_OBJID ) ) ( (lv_relDesc_5_0= ruleTrailComment ) ) this_EOL_6= RULE_EOL
            {
            // InternalDdParser.g:811:3: ( (lv_relDescLines_0_0= ruleLineComment ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_CMT) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalDdParser.g:812:4: (lv_relDescLines_0_0= ruleLineComment )
            	    {
            	    // InternalDdParser.g:812:4: (lv_relDescLines_0_0= ruleLineComment )
            	    // InternalDdParser.g:813:5: lv_relDescLines_0_0= ruleLineComment
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getRelationshipAccess().getRelDescLinesLineCommentParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_33);
            	    lv_relDescLines_0_0=ruleLineComment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getRelationshipRule());
            	      					}
            	      					add(
            	      						current,
            	      						"relDescLines",
            	      						lv_relDescLines_0_0,
            	      						"com.shark.lang.Dd.LineComment");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            // InternalDdParser.g:830:3: ( (lv_cardi1_1_0= ruleRangeExpression ) )
            // InternalDdParser.g:831:4: (lv_cardi1_1_0= ruleRangeExpression )
            {
            // InternalDdParser.g:831:4: (lv_cardi1_1_0= ruleRangeExpression )
            // InternalDdParser.g:832:5: lv_cardi1_1_0= ruleRangeExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRelationshipAccess().getCardi1RangeExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_17);
            lv_cardi1_1_0=ruleRangeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRelationshipRule());
              					}
              					set(
              						current,
              						"cardi1",
              						lv_cardi1_1_0,
              						"com.shark.lang.Dd.RangeExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalDdParser.g:849:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDdParser.g:850:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDdParser.g:850:4: (lv_name_2_0= RULE_ID )
            // InternalDdParser.g:851:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getRelationshipAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRelationshipRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"com.shark.lang.Dd.ID");
              				
            }

            }


            }

            // InternalDdParser.g:867:3: ( (lv_cardi2_3_0= ruleRangeExpression ) )
            // InternalDdParser.g:868:4: (lv_cardi2_3_0= ruleRangeExpression )
            {
            // InternalDdParser.g:868:4: (lv_cardi2_3_0= ruleRangeExpression )
            // InternalDdParser.g:869:5: lv_cardi2_3_0= ruleRangeExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRelationshipAccess().getCardi2RangeExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_4);
            lv_cardi2_3_0=ruleRangeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRelationshipRule());
              					}
              					set(
              						current,
              						"cardi2",
              						lv_cardi2_3_0,
              						"com.shark.lang.Dd.RangeExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalDdParser.g:886:3: ( (otherlv_4= RULE_OBJID ) )
            // InternalDdParser.g:887:4: (otherlv_4= RULE_OBJID )
            {
            // InternalDdParser.g:887:4: (otherlv_4= RULE_OBJID )
            // InternalDdParser.g:888:5: otherlv_4= RULE_OBJID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRelationshipRule());
              					}
              				
            }
            otherlv_4=(Token)match(input,RULE_OBJID,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_4, grammarAccess.getRelationshipAccess().getLinkToEntityCrossReference_4_0());
              				
            }

            }


            }

            // InternalDdParser.g:899:3: ( (lv_relDesc_5_0= ruleTrailComment ) )
            // InternalDdParser.g:900:4: (lv_relDesc_5_0= ruleTrailComment )
            {
            // InternalDdParser.g:900:4: (lv_relDesc_5_0= ruleTrailComment )
            // InternalDdParser.g:901:5: lv_relDesc_5_0= ruleTrailComment
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRelationshipAccess().getRelDescTrailCommentParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_5);
            lv_relDesc_5_0=ruleTrailComment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRelationshipRule());
              					}
              					set(
              						current,
              						"relDesc",
              						lv_relDesc_5_0,
              						"com.shark.lang.Dd.TrailComment");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            this_EOL_6=(Token)match(input,RULE_EOL,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_EOL_6, grammarAccess.getRelationshipAccess().getEOLTerminalRuleCall_6());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelationship"


    // $ANTLR start "entryRuleConstraint"
    // InternalDdParser.g:926:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // InternalDdParser.g:926:51: (iv_ruleConstraint= ruleConstraint EOF )
            // InternalDdParser.g:927:2: iv_ruleConstraint= ruleConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstraintRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConstraint=ruleConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstraint; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // InternalDdParser.g:933:1: ruleConstraint returns [EObject current=null] : ( ( (lv_chkDescLines_0_0= ruleLineComment ) )+ ( (lv_name_1_0= RULE_CHKID ) ) (otherlv_2= LeftParenthesis ( (otherlv_3= RULE_OBJID ) ) ( (lv_entitiesList_4_0= ruleEntitiesListElt ) )* otherlv_5= RightParenthesis )? otherlv_6= Colon this_BEGIN_7= RULE_BEGIN ( (lv_check_8_0= ruleCheckExpression ) )+ this_END_9= RULE_END ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token this_BEGIN_7=null;
        Token this_END_9=null;
        EObject lv_chkDescLines_0_0 = null;

        EObject lv_entitiesList_4_0 = null;

        EObject lv_check_8_0 = null;



        	enterRule();

        try {
            // InternalDdParser.g:939:2: ( ( ( (lv_chkDescLines_0_0= ruleLineComment ) )+ ( (lv_name_1_0= RULE_CHKID ) ) (otherlv_2= LeftParenthesis ( (otherlv_3= RULE_OBJID ) ) ( (lv_entitiesList_4_0= ruleEntitiesListElt ) )* otherlv_5= RightParenthesis )? otherlv_6= Colon this_BEGIN_7= RULE_BEGIN ( (lv_check_8_0= ruleCheckExpression ) )+ this_END_9= RULE_END ) )
            // InternalDdParser.g:940:2: ( ( (lv_chkDescLines_0_0= ruleLineComment ) )+ ( (lv_name_1_0= RULE_CHKID ) ) (otherlv_2= LeftParenthesis ( (otherlv_3= RULE_OBJID ) ) ( (lv_entitiesList_4_0= ruleEntitiesListElt ) )* otherlv_5= RightParenthesis )? otherlv_6= Colon this_BEGIN_7= RULE_BEGIN ( (lv_check_8_0= ruleCheckExpression ) )+ this_END_9= RULE_END )
            {
            // InternalDdParser.g:940:2: ( ( (lv_chkDescLines_0_0= ruleLineComment ) )+ ( (lv_name_1_0= RULE_CHKID ) ) (otherlv_2= LeftParenthesis ( (otherlv_3= RULE_OBJID ) ) ( (lv_entitiesList_4_0= ruleEntitiesListElt ) )* otherlv_5= RightParenthesis )? otherlv_6= Colon this_BEGIN_7= RULE_BEGIN ( (lv_check_8_0= ruleCheckExpression ) )+ this_END_9= RULE_END )
            // InternalDdParser.g:941:3: ( (lv_chkDescLines_0_0= ruleLineComment ) )+ ( (lv_name_1_0= RULE_CHKID ) ) (otherlv_2= LeftParenthesis ( (otherlv_3= RULE_OBJID ) ) ( (lv_entitiesList_4_0= ruleEntitiesListElt ) )* otherlv_5= RightParenthesis )? otherlv_6= Colon this_BEGIN_7= RULE_BEGIN ( (lv_check_8_0= ruleCheckExpression ) )+ this_END_9= RULE_END
            {
            // InternalDdParser.g:941:3: ( (lv_chkDescLines_0_0= ruleLineComment ) )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_CMT) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalDdParser.g:942:4: (lv_chkDescLines_0_0= ruleLineComment )
            	    {
            	    // InternalDdParser.g:942:4: (lv_chkDescLines_0_0= ruleLineComment )
            	    // InternalDdParser.g:943:5: lv_chkDescLines_0_0= ruleLineComment
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getConstraintAccess().getChkDescLinesLineCommentParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_35);
            	    lv_chkDescLines_0_0=ruleLineComment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getConstraintRule());
            	      					}
            	      					add(
            	      						current,
            	      						"chkDescLines",
            	      						lv_chkDescLines_0_0,
            	      						"com.shark.lang.Dd.LineComment");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);

            // InternalDdParser.g:960:3: ( (lv_name_1_0= RULE_CHKID ) )
            // InternalDdParser.g:961:4: (lv_name_1_0= RULE_CHKID )
            {
            // InternalDdParser.g:961:4: (lv_name_1_0= RULE_CHKID )
            // InternalDdParser.g:962:5: lv_name_1_0= RULE_CHKID
            {
            lv_name_1_0=(Token)match(input,RULE_CHKID,FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getConstraintAccess().getNameCHKIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getConstraintRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"com.shark.lang.Dd.CHKID");
              				
            }

            }


            }

            // InternalDdParser.g:978:3: (otherlv_2= LeftParenthesis ( (otherlv_3= RULE_OBJID ) ) ( (lv_entitiesList_4_0= ruleEntitiesListElt ) )* otherlv_5= RightParenthesis )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==LeftParenthesis) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalDdParser.g:979:4: otherlv_2= LeftParenthesis ( (otherlv_3= RULE_OBJID ) ) ( (lv_entitiesList_4_0= ruleEntitiesListElt ) )* otherlv_5= RightParenthesis
                    {
                    otherlv_2=(Token)match(input,LeftParenthesis,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getConstraintAccess().getLeftParenthesisKeyword_2_0());
                      			
                    }
                    // InternalDdParser.g:983:4: ( (otherlv_3= RULE_OBJID ) )
                    // InternalDdParser.g:984:5: (otherlv_3= RULE_OBJID )
                    {
                    // InternalDdParser.g:984:5: (otherlv_3= RULE_OBJID )
                    // InternalDdParser.g:985:6: otherlv_3= RULE_OBJID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getConstraintRule());
                      						}
                      					
                    }
                    otherlv_3=(Token)match(input,RULE_OBJID,FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_3, grammarAccess.getConstraintAccess().getFirstEntityEntityCrossReference_2_1_0());
                      					
                    }

                    }


                    }

                    // InternalDdParser.g:996:4: ( (lv_entitiesList_4_0= ruleEntitiesListElt ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==Comma) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalDdParser.g:997:5: (lv_entitiesList_4_0= ruleEntitiesListElt )
                    	    {
                    	    // InternalDdParser.g:997:5: (lv_entitiesList_4_0= ruleEntitiesListElt )
                    	    // InternalDdParser.g:998:6: lv_entitiesList_4_0= ruleEntitiesListElt
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getConstraintAccess().getEntitiesListEntitiesListEltParserRuleCall_2_2_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_30);
                    	    lv_entitiesList_4_0=ruleEntitiesListElt();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getConstraintRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"entitiesList",
                    	      							lv_entitiesList_4_0,
                    	      							"com.shark.lang.Dd.EntitiesListElt");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,RightParenthesis,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getConstraintAccess().getRightParenthesisKeyword_2_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_6=(Token)match(input,Colon,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getConstraintAccess().getColonKeyword_3());
              		
            }
            this_BEGIN_7=(Token)match(input,RULE_BEGIN,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_BEGIN_7, grammarAccess.getConstraintAccess().getBEGINTerminalRuleCall_4());
              		
            }
            // InternalDdParser.g:1028:3: ( (lv_check_8_0= ruleCheckExpression ) )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_CMT) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalDdParser.g:1029:4: (lv_check_8_0= ruleCheckExpression )
            	    {
            	    // InternalDdParser.g:1029:4: (lv_check_8_0= ruleCheckExpression )
            	    // InternalDdParser.g:1030:5: lv_check_8_0= ruleCheckExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getConstraintAccess().getCheckCheckExpressionParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_37);
            	    lv_check_8_0=ruleCheckExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getConstraintRule());
            	      					}
            	      					add(
            	      						current,
            	      						"check",
            	      						lv_check_8_0,
            	      						"com.shark.lang.Dd.CheckExpression");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt25 >= 1 ) break loop25;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
            } while (true);

            this_END_9=(Token)match(input,RULE_END,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_END_9, grammarAccess.getConstraintAccess().getENDTerminalRuleCall_6());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRuleEntitiesListElt"
    // InternalDdParser.g:1055:1: entryRuleEntitiesListElt returns [EObject current=null] : iv_ruleEntitiesListElt= ruleEntitiesListElt EOF ;
    public final EObject entryRuleEntitiesListElt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntitiesListElt = null;


        try {
            // InternalDdParser.g:1055:56: (iv_ruleEntitiesListElt= ruleEntitiesListElt EOF )
            // InternalDdParser.g:1056:2: iv_ruleEntitiesListElt= ruleEntitiesListElt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntitiesListEltRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEntitiesListElt=ruleEntitiesListElt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntitiesListElt; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntitiesListElt"


    // $ANTLR start "ruleEntitiesListElt"
    // InternalDdParser.g:1062:1: ruleEntitiesListElt returns [EObject current=null] : (otherlv_0= Comma ( (otherlv_1= RULE_OBJID ) ) ( (lv_isArray_2_0= LeftSquareBracketRightSquareBracket ) )? ) ;
    public final EObject ruleEntitiesListElt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_isArray_2_0=null;


        	enterRule();

        try {
            // InternalDdParser.g:1068:2: ( (otherlv_0= Comma ( (otherlv_1= RULE_OBJID ) ) ( (lv_isArray_2_0= LeftSquareBracketRightSquareBracket ) )? ) )
            // InternalDdParser.g:1069:2: (otherlv_0= Comma ( (otherlv_1= RULE_OBJID ) ) ( (lv_isArray_2_0= LeftSquareBracketRightSquareBracket ) )? )
            {
            // InternalDdParser.g:1069:2: (otherlv_0= Comma ( (otherlv_1= RULE_OBJID ) ) ( (lv_isArray_2_0= LeftSquareBracketRightSquareBracket ) )? )
            // InternalDdParser.g:1070:3: otherlv_0= Comma ( (otherlv_1= RULE_OBJID ) ) ( (lv_isArray_2_0= LeftSquareBracketRightSquareBracket ) )?
            {
            otherlv_0=(Token)match(input,Comma,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getEntitiesListEltAccess().getCommaKeyword_0());
              		
            }
            // InternalDdParser.g:1074:3: ( (otherlv_1= RULE_OBJID ) )
            // InternalDdParser.g:1075:4: (otherlv_1= RULE_OBJID )
            {
            // InternalDdParser.g:1075:4: (otherlv_1= RULE_OBJID )
            // InternalDdParser.g:1076:5: otherlv_1= RULE_OBJID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getEntitiesListEltRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_OBJID,FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getEntitiesListEltAccess().getEntityEntityCrossReference_1_0());
              				
            }

            }


            }

            // InternalDdParser.g:1087:3: ( (lv_isArray_2_0= LeftSquareBracketRightSquareBracket ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==LeftSquareBracketRightSquareBracket) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalDdParser.g:1088:4: (lv_isArray_2_0= LeftSquareBracketRightSquareBracket )
                    {
                    // InternalDdParser.g:1088:4: (lv_isArray_2_0= LeftSquareBracketRightSquareBracket )
                    // InternalDdParser.g:1089:5: lv_isArray_2_0= LeftSquareBracketRightSquareBracket
                    {
                    lv_isArray_2_0=(Token)match(input,LeftSquareBracketRightSquareBracket,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isArray_2_0, grammarAccess.getEntitiesListEltAccess().getIsArrayLeftSquareBracketRightSquareBracketKeyword_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getEntitiesListEltRule());
                      					}
                      					setWithLastConsumed(current, "isArray", lv_isArray_2_0, "[]");
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntitiesListElt"


    // $ANTLR start "entryRuleCheckExpression"
    // InternalDdParser.g:1105:1: entryRuleCheckExpression returns [EObject current=null] : iv_ruleCheckExpression= ruleCheckExpression EOF ;
    public final EObject entryRuleCheckExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckExpression = null;


        try {
            // InternalDdParser.g:1105:56: (iv_ruleCheckExpression= ruleCheckExpression EOF )
            // InternalDdParser.g:1106:2: iv_ruleCheckExpression= ruleCheckExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCheckExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCheckExpression=ruleCheckExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCheckExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCheckExpression"


    // $ANTLR start "ruleCheckExpression"
    // InternalDdParser.g:1112:1: ruleCheckExpression returns [EObject current=null] : ( ( (lv_chkDesc_0_0= ruleLineComment ) )+ ( (lv_name_1_0= RULE_ID ) ) ( (lv_expr_2_0= ruleSharkExpression ) ) this_EOL_3= RULE_EOL ) ;
    public final EObject ruleCheckExpression() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token this_EOL_3=null;
        EObject lv_chkDesc_0_0 = null;

        EObject lv_expr_2_0 = null;



        	enterRule();

        try {
            // InternalDdParser.g:1118:2: ( ( ( (lv_chkDesc_0_0= ruleLineComment ) )+ ( (lv_name_1_0= RULE_ID ) ) ( (lv_expr_2_0= ruleSharkExpression ) ) this_EOL_3= RULE_EOL ) )
            // InternalDdParser.g:1119:2: ( ( (lv_chkDesc_0_0= ruleLineComment ) )+ ( (lv_name_1_0= RULE_ID ) ) ( (lv_expr_2_0= ruleSharkExpression ) ) this_EOL_3= RULE_EOL )
            {
            // InternalDdParser.g:1119:2: ( ( (lv_chkDesc_0_0= ruleLineComment ) )+ ( (lv_name_1_0= RULE_ID ) ) ( (lv_expr_2_0= ruleSharkExpression ) ) this_EOL_3= RULE_EOL )
            // InternalDdParser.g:1120:3: ( (lv_chkDesc_0_0= ruleLineComment ) )+ ( (lv_name_1_0= RULE_ID ) ) ( (lv_expr_2_0= ruleSharkExpression ) ) this_EOL_3= RULE_EOL
            {
            // InternalDdParser.g:1120:3: ( (lv_chkDesc_0_0= ruleLineComment ) )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_CMT) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalDdParser.g:1121:4: (lv_chkDesc_0_0= ruleLineComment )
            	    {
            	    // InternalDdParser.g:1121:4: (lv_chkDesc_0_0= ruleLineComment )
            	    // InternalDdParser.g:1122:5: lv_chkDesc_0_0= ruleLineComment
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getCheckExpressionAccess().getChkDescLineCommentParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_39);
            	    lv_chkDesc_0_0=ruleLineComment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getCheckExpressionRule());
            	      					}
            	      					add(
            	      						current,
            	      						"chkDesc",
            	      						lv_chkDesc_0_0,
            	      						"com.shark.lang.Dd.LineComment");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt27 >= 1 ) break loop27;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(27, input);
                        throw eee;
                }
                cnt27++;
            } while (true);

            // InternalDdParser.g:1139:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDdParser.g:1140:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDdParser.g:1140:4: (lv_name_1_0= RULE_ID )
            // InternalDdParser.g:1141:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getCheckExpressionAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getCheckExpressionRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"com.shark.lang.Dd.ID");
              				
            }

            }


            }

            // InternalDdParser.g:1157:3: ( (lv_expr_2_0= ruleSharkExpression ) )
            // InternalDdParser.g:1158:4: (lv_expr_2_0= ruleSharkExpression )
            {
            // InternalDdParser.g:1158:4: (lv_expr_2_0= ruleSharkExpression )
            // InternalDdParser.g:1159:5: lv_expr_2_0= ruleSharkExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCheckExpressionAccess().getExprSharkExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_5);
            lv_expr_2_0=ruleSharkExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCheckExpressionRule());
              					}
              					set(
              						current,
              						"expr",
              						lv_expr_2_0,
              						"com.shark.lang.Dd.SharkExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            this_EOL_3=(Token)match(input,RULE_EOL,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_EOL_3, grammarAccess.getCheckExpressionAccess().getEOLTerminalRuleCall_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCheckExpression"


    // $ANTLR start "entryRuleSharkExpression"
    // InternalDdParser.g:1184:1: entryRuleSharkExpression returns [EObject current=null] : iv_ruleSharkExpression= ruleSharkExpression EOF ;
    public final EObject entryRuleSharkExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSharkExpression = null;


        try {
            // InternalDdParser.g:1184:56: (iv_ruleSharkExpression= ruleSharkExpression EOF )
            // InternalDdParser.g:1185:2: iv_ruleSharkExpression= ruleSharkExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSharkExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSharkExpression=ruleSharkExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSharkExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSharkExpression"


    // $ANTLR start "ruleSharkExpression"
    // InternalDdParser.g:1191:1: ruleSharkExpression returns [EObject current=null] : ( ( ( ruleRangeExpression )=>this_RangeExpression_0= ruleRangeExpression ) | ( ( ruleAddExpression )=>this_AddExpression_1= ruleAddExpression ) | ( ( ruleMultExpression )=>this_MultExpression_2= ruleMultExpression ) | ( ( ruleAndExpression )=>this_AndExpression_3= ruleAndExpression ) | ( ( ruleOrExpression )=>this_OrExpression_4= ruleOrExpression ) | ( ( ruleCatExpression )=>this_CatExpression_5= ruleCatExpression ) | ( ( ruleListExpression )=>this_ListExpression_6= ruleListExpression ) | this_BinaryExpression_7= ruleBinaryExpression | this_UnaryExpression_8= ruleUnaryExpression | this_TerminalExpression_9= ruleTerminalExpression ) ;
    public final EObject ruleSharkExpression() throws RecognitionException {
        EObject current = null;

        EObject this_RangeExpression_0 = null;

        EObject this_AddExpression_1 = null;

        EObject this_MultExpression_2 = null;

        EObject this_AndExpression_3 = null;

        EObject this_OrExpression_4 = null;

        EObject this_CatExpression_5 = null;

        EObject this_ListExpression_6 = null;

        EObject this_BinaryExpression_7 = null;

        EObject this_UnaryExpression_8 = null;

        EObject this_TerminalExpression_9 = null;



        	enterRule();

        try {
            // InternalDdParser.g:1197:2: ( ( ( ( ruleRangeExpression )=>this_RangeExpression_0= ruleRangeExpression ) | ( ( ruleAddExpression )=>this_AddExpression_1= ruleAddExpression ) | ( ( ruleMultExpression )=>this_MultExpression_2= ruleMultExpression ) | ( ( ruleAndExpression )=>this_AndExpression_3= ruleAndExpression ) | ( ( ruleOrExpression )=>this_OrExpression_4= ruleOrExpression ) | ( ( ruleCatExpression )=>this_CatExpression_5= ruleCatExpression ) | ( ( ruleListExpression )=>this_ListExpression_6= ruleListExpression ) | this_BinaryExpression_7= ruleBinaryExpression | this_UnaryExpression_8= ruleUnaryExpression | this_TerminalExpression_9= ruleTerminalExpression ) )
            // InternalDdParser.g:1198:2: ( ( ( ruleRangeExpression )=>this_RangeExpression_0= ruleRangeExpression ) | ( ( ruleAddExpression )=>this_AddExpression_1= ruleAddExpression ) | ( ( ruleMultExpression )=>this_MultExpression_2= ruleMultExpression ) | ( ( ruleAndExpression )=>this_AndExpression_3= ruleAndExpression ) | ( ( ruleOrExpression )=>this_OrExpression_4= ruleOrExpression ) | ( ( ruleCatExpression )=>this_CatExpression_5= ruleCatExpression ) | ( ( ruleListExpression )=>this_ListExpression_6= ruleListExpression ) | this_BinaryExpression_7= ruleBinaryExpression | this_UnaryExpression_8= ruleUnaryExpression | this_TerminalExpression_9= ruleTerminalExpression )
            {
            // InternalDdParser.g:1198:2: ( ( ( ruleRangeExpression )=>this_RangeExpression_0= ruleRangeExpression ) | ( ( ruleAddExpression )=>this_AddExpression_1= ruleAddExpression ) | ( ( ruleMultExpression )=>this_MultExpression_2= ruleMultExpression ) | ( ( ruleAndExpression )=>this_AndExpression_3= ruleAndExpression ) | ( ( ruleOrExpression )=>this_OrExpression_4= ruleOrExpression ) | ( ( ruleCatExpression )=>this_CatExpression_5= ruleCatExpression ) | ( ( ruleListExpression )=>this_ListExpression_6= ruleListExpression ) | this_BinaryExpression_7= ruleBinaryExpression | this_UnaryExpression_8= ruleUnaryExpression | this_TerminalExpression_9= ruleTerminalExpression )
            int alt28=10;
            alt28 = dfa28.predict(input);
            switch (alt28) {
                case 1 :
                    // InternalDdParser.g:1199:3: ( ( ruleRangeExpression )=>this_RangeExpression_0= ruleRangeExpression )
                    {
                    // InternalDdParser.g:1199:3: ( ( ruleRangeExpression )=>this_RangeExpression_0= ruleRangeExpression )
                    // InternalDdParser.g:1200:4: ( ruleRangeExpression )=>this_RangeExpression_0= ruleRangeExpression
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSharkExpressionAccess().getRangeExpressionParserRuleCall_0());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_RangeExpression_0=ruleRangeExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_RangeExpression_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDdParser.g:1211:3: ( ( ruleAddExpression )=>this_AddExpression_1= ruleAddExpression )
                    {
                    // InternalDdParser.g:1211:3: ( ( ruleAddExpression )=>this_AddExpression_1= ruleAddExpression )
                    // InternalDdParser.g:1212:4: ( ruleAddExpression )=>this_AddExpression_1= ruleAddExpression
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSharkExpressionAccess().getAddExpressionParserRuleCall_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_AddExpression_1=ruleAddExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_AddExpression_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDdParser.g:1223:3: ( ( ruleMultExpression )=>this_MultExpression_2= ruleMultExpression )
                    {
                    // InternalDdParser.g:1223:3: ( ( ruleMultExpression )=>this_MultExpression_2= ruleMultExpression )
                    // InternalDdParser.g:1224:4: ( ruleMultExpression )=>this_MultExpression_2= ruleMultExpression
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSharkExpressionAccess().getMultExpressionParserRuleCall_2());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_MultExpression_2=ruleMultExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_MultExpression_2;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDdParser.g:1235:3: ( ( ruleAndExpression )=>this_AndExpression_3= ruleAndExpression )
                    {
                    // InternalDdParser.g:1235:3: ( ( ruleAndExpression )=>this_AndExpression_3= ruleAndExpression )
                    // InternalDdParser.g:1236:4: ( ruleAndExpression )=>this_AndExpression_3= ruleAndExpression
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSharkExpressionAccess().getAndExpressionParserRuleCall_3());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_AndExpression_3=ruleAndExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_AndExpression_3;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalDdParser.g:1247:3: ( ( ruleOrExpression )=>this_OrExpression_4= ruleOrExpression )
                    {
                    // InternalDdParser.g:1247:3: ( ( ruleOrExpression )=>this_OrExpression_4= ruleOrExpression )
                    // InternalDdParser.g:1248:4: ( ruleOrExpression )=>this_OrExpression_4= ruleOrExpression
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSharkExpressionAccess().getOrExpressionParserRuleCall_4());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_OrExpression_4=ruleOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_OrExpression_4;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalDdParser.g:1259:3: ( ( ruleCatExpression )=>this_CatExpression_5= ruleCatExpression )
                    {
                    // InternalDdParser.g:1259:3: ( ( ruleCatExpression )=>this_CatExpression_5= ruleCatExpression )
                    // InternalDdParser.g:1260:4: ( ruleCatExpression )=>this_CatExpression_5= ruleCatExpression
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSharkExpressionAccess().getCatExpressionParserRuleCall_5());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_CatExpression_5=ruleCatExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_CatExpression_5;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalDdParser.g:1271:3: ( ( ruleListExpression )=>this_ListExpression_6= ruleListExpression )
                    {
                    // InternalDdParser.g:1271:3: ( ( ruleListExpression )=>this_ListExpression_6= ruleListExpression )
                    // InternalDdParser.g:1272:4: ( ruleListExpression )=>this_ListExpression_6= ruleListExpression
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSharkExpressionAccess().getListExpressionParserRuleCall_6());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_ListExpression_6=ruleListExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_ListExpression_6;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalDdParser.g:1283:3: this_BinaryExpression_7= ruleBinaryExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSharkExpressionAccess().getBinaryExpressionParserRuleCall_7());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BinaryExpression_7=ruleBinaryExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BinaryExpression_7;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalDdParser.g:1292:3: this_UnaryExpression_8= ruleUnaryExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSharkExpressionAccess().getUnaryExpressionParserRuleCall_8());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_UnaryExpression_8=ruleUnaryExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_UnaryExpression_8;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalDdParser.g:1301:3: this_TerminalExpression_9= ruleTerminalExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSharkExpressionAccess().getTerminalExpressionParserRuleCall_9());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_TerminalExpression_9=ruleTerminalExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TerminalExpression_9;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSharkExpression"


    // $ANTLR start "entryRuleBinaryExpression"
    // InternalDdParser.g:1313:1: entryRuleBinaryExpression returns [EObject current=null] : iv_ruleBinaryExpression= ruleBinaryExpression EOF ;
    public final EObject entryRuleBinaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryExpression = null;


        try {
            // InternalDdParser.g:1313:57: (iv_ruleBinaryExpression= ruleBinaryExpression EOF )
            // InternalDdParser.g:1314:2: iv_ruleBinaryExpression= ruleBinaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBinaryExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBinaryExpression=ruleBinaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBinaryExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBinaryExpression"


    // $ANTLR start "ruleBinaryExpression"
    // InternalDdParser.g:1320:1: ruleBinaryExpression returns [EObject current=null] : ( ( (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= ruleBinaryOperator ) ) ( (lv_right_3_0= ruleSharkExpression ) ) otherlv_4= RightParenthesis ) | (otherlv_5= LeftSquareBracket ( (lv_left_6_0= ruleSharkExpression ) ) ( (lv_op_7_0= ruleBinaryOperator ) ) ( (lv_right_8_0= ruleSharkExpression ) ) otherlv_9= RightSquareBracket ) | (otherlv_10= LeftCurlyBracket ( (lv_left_11_0= ruleSharkExpression ) ) ( (lv_op_12_0= ruleBinaryOperator ) ) ( (lv_right_13_0= ruleSharkExpression ) ) otherlv_14= RightCurlyBracket ) ) ( ( (lv_exprValue_15_0= RULE_NUL ) ) ( (lv_precision_16_0= RULE_INT ) ) ( (lv_length_17_0= RULE_INT ) ) ( (lv_hasAttribute_18_0= RULE_INT ) ) )? ) ;
    public final EObject ruleBinaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_14=null;
        Token lv_exprValue_15_0=null;
        Token lv_precision_16_0=null;
        Token lv_length_17_0=null;
        Token lv_hasAttribute_18_0=null;
        EObject lv_left_1_0 = null;

        Enumerator lv_op_2_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_left_6_0 = null;

        Enumerator lv_op_7_0 = null;

        EObject lv_right_8_0 = null;

        EObject lv_left_11_0 = null;

        Enumerator lv_op_12_0 = null;

        EObject lv_right_13_0 = null;



        	enterRule();

        try {
            // InternalDdParser.g:1326:2: ( ( ( (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= ruleBinaryOperator ) ) ( (lv_right_3_0= ruleSharkExpression ) ) otherlv_4= RightParenthesis ) | (otherlv_5= LeftSquareBracket ( (lv_left_6_0= ruleSharkExpression ) ) ( (lv_op_7_0= ruleBinaryOperator ) ) ( (lv_right_8_0= ruleSharkExpression ) ) otherlv_9= RightSquareBracket ) | (otherlv_10= LeftCurlyBracket ( (lv_left_11_0= ruleSharkExpression ) ) ( (lv_op_12_0= ruleBinaryOperator ) ) ( (lv_right_13_0= ruleSharkExpression ) ) otherlv_14= RightCurlyBracket ) ) ( ( (lv_exprValue_15_0= RULE_NUL ) ) ( (lv_precision_16_0= RULE_INT ) ) ( (lv_length_17_0= RULE_INT ) ) ( (lv_hasAttribute_18_0= RULE_INT ) ) )? ) )
            // InternalDdParser.g:1327:2: ( ( (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= ruleBinaryOperator ) ) ( (lv_right_3_0= ruleSharkExpression ) ) otherlv_4= RightParenthesis ) | (otherlv_5= LeftSquareBracket ( (lv_left_6_0= ruleSharkExpression ) ) ( (lv_op_7_0= ruleBinaryOperator ) ) ( (lv_right_8_0= ruleSharkExpression ) ) otherlv_9= RightSquareBracket ) | (otherlv_10= LeftCurlyBracket ( (lv_left_11_0= ruleSharkExpression ) ) ( (lv_op_12_0= ruleBinaryOperator ) ) ( (lv_right_13_0= ruleSharkExpression ) ) otherlv_14= RightCurlyBracket ) ) ( ( (lv_exprValue_15_0= RULE_NUL ) ) ( (lv_precision_16_0= RULE_INT ) ) ( (lv_length_17_0= RULE_INT ) ) ( (lv_hasAttribute_18_0= RULE_INT ) ) )? )
            {
            // InternalDdParser.g:1327:2: ( ( (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= ruleBinaryOperator ) ) ( (lv_right_3_0= ruleSharkExpression ) ) otherlv_4= RightParenthesis ) | (otherlv_5= LeftSquareBracket ( (lv_left_6_0= ruleSharkExpression ) ) ( (lv_op_7_0= ruleBinaryOperator ) ) ( (lv_right_8_0= ruleSharkExpression ) ) otherlv_9= RightSquareBracket ) | (otherlv_10= LeftCurlyBracket ( (lv_left_11_0= ruleSharkExpression ) ) ( (lv_op_12_0= ruleBinaryOperator ) ) ( (lv_right_13_0= ruleSharkExpression ) ) otherlv_14= RightCurlyBracket ) ) ( ( (lv_exprValue_15_0= RULE_NUL ) ) ( (lv_precision_16_0= RULE_INT ) ) ( (lv_length_17_0= RULE_INT ) ) ( (lv_hasAttribute_18_0= RULE_INT ) ) )? )
            // InternalDdParser.g:1328:3: ( (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= ruleBinaryOperator ) ) ( (lv_right_3_0= ruleSharkExpression ) ) otherlv_4= RightParenthesis ) | (otherlv_5= LeftSquareBracket ( (lv_left_6_0= ruleSharkExpression ) ) ( (lv_op_7_0= ruleBinaryOperator ) ) ( (lv_right_8_0= ruleSharkExpression ) ) otherlv_9= RightSquareBracket ) | (otherlv_10= LeftCurlyBracket ( (lv_left_11_0= ruleSharkExpression ) ) ( (lv_op_12_0= ruleBinaryOperator ) ) ( (lv_right_13_0= ruleSharkExpression ) ) otherlv_14= RightCurlyBracket ) ) ( ( (lv_exprValue_15_0= RULE_NUL ) ) ( (lv_precision_16_0= RULE_INT ) ) ( (lv_length_17_0= RULE_INT ) ) ( (lv_hasAttribute_18_0= RULE_INT ) ) )?
            {
            // InternalDdParser.g:1328:3: ( (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= ruleBinaryOperator ) ) ( (lv_right_3_0= ruleSharkExpression ) ) otherlv_4= RightParenthesis ) | (otherlv_5= LeftSquareBracket ( (lv_left_6_0= ruleSharkExpression ) ) ( (lv_op_7_0= ruleBinaryOperator ) ) ( (lv_right_8_0= ruleSharkExpression ) ) otherlv_9= RightSquareBracket ) | (otherlv_10= LeftCurlyBracket ( (lv_left_11_0= ruleSharkExpression ) ) ( (lv_op_12_0= ruleBinaryOperator ) ) ( (lv_right_13_0= ruleSharkExpression ) ) otherlv_14= RightCurlyBracket ) )
            int alt29=3;
            switch ( input.LA(1) ) {
            case LeftParenthesis:
                {
                alt29=1;
                }
                break;
            case LeftSquareBracket:
                {
                alt29=2;
                }
                break;
            case LeftCurlyBracket:
                {
                alt29=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalDdParser.g:1329:4: (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= ruleBinaryOperator ) ) ( (lv_right_3_0= ruleSharkExpression ) ) otherlv_4= RightParenthesis )
                    {
                    // InternalDdParser.g:1329:4: (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= ruleBinaryOperator ) ) ( (lv_right_3_0= ruleSharkExpression ) ) otherlv_4= RightParenthesis )
                    // InternalDdParser.g:1330:5: otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= ruleBinaryOperator ) ) ( (lv_right_3_0= ruleSharkExpression ) ) otherlv_4= RightParenthesis
                    {
                    otherlv_0=(Token)match(input,LeftParenthesis,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_0, grammarAccess.getBinaryExpressionAccess().getLeftParenthesisKeyword_0_0_0());
                      				
                    }
                    // InternalDdParser.g:1334:5: ( (lv_left_1_0= ruleSharkExpression ) )
                    // InternalDdParser.g:1335:6: (lv_left_1_0= ruleSharkExpression )
                    {
                    // InternalDdParser.g:1335:6: (lv_left_1_0= ruleSharkExpression )
                    // InternalDdParser.g:1336:7: lv_left_1_0= ruleSharkExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getBinaryExpressionAccess().getLeftSharkExpressionParserRuleCall_0_0_1_0());
                      						
                    }
                    pushFollow(FOLLOW_40);
                    lv_left_1_0=ruleSharkExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getBinaryExpressionRule());
                      							}
                      							set(
                      								current,
                      								"left",
                      								lv_left_1_0,
                      								"com.shark.lang.Dd.SharkExpression");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalDdParser.g:1353:5: ( (lv_op_2_0= ruleBinaryOperator ) )
                    // InternalDdParser.g:1354:6: (lv_op_2_0= ruleBinaryOperator )
                    {
                    // InternalDdParser.g:1354:6: (lv_op_2_0= ruleBinaryOperator )
                    // InternalDdParser.g:1355:7: lv_op_2_0= ruleBinaryOperator
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getBinaryExpressionAccess().getOpBinaryOperatorEnumRuleCall_0_0_2_0());
                      						
                    }
                    pushFollow(FOLLOW_13);
                    lv_op_2_0=ruleBinaryOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getBinaryExpressionRule());
                      							}
                      							set(
                      								current,
                      								"op",
                      								lv_op_2_0,
                      								"com.shark.lang.Dd.BinaryOperator");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalDdParser.g:1372:5: ( (lv_right_3_0= ruleSharkExpression ) )
                    // InternalDdParser.g:1373:6: (lv_right_3_0= ruleSharkExpression )
                    {
                    // InternalDdParser.g:1373:6: (lv_right_3_0= ruleSharkExpression )
                    // InternalDdParser.g:1374:7: lv_right_3_0= ruleSharkExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getBinaryExpressionAccess().getRightSharkExpressionParserRuleCall_0_0_3_0());
                      						
                    }
                    pushFollow(FOLLOW_31);
                    lv_right_3_0=ruleSharkExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getBinaryExpressionRule());
                      							}
                      							set(
                      								current,
                      								"right",
                      								lv_right_3_0,
                      								"com.shark.lang.Dd.SharkExpression");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,RightParenthesis,FOLLOW_41); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getBinaryExpressionAccess().getRightParenthesisKeyword_0_0_4());
                      				
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDdParser.g:1397:4: (otherlv_5= LeftSquareBracket ( (lv_left_6_0= ruleSharkExpression ) ) ( (lv_op_7_0= ruleBinaryOperator ) ) ( (lv_right_8_0= ruleSharkExpression ) ) otherlv_9= RightSquareBracket )
                    {
                    // InternalDdParser.g:1397:4: (otherlv_5= LeftSquareBracket ( (lv_left_6_0= ruleSharkExpression ) ) ( (lv_op_7_0= ruleBinaryOperator ) ) ( (lv_right_8_0= ruleSharkExpression ) ) otherlv_9= RightSquareBracket )
                    // InternalDdParser.g:1398:5: otherlv_5= LeftSquareBracket ( (lv_left_6_0= ruleSharkExpression ) ) ( (lv_op_7_0= ruleBinaryOperator ) ) ( (lv_right_8_0= ruleSharkExpression ) ) otherlv_9= RightSquareBracket
                    {
                    otherlv_5=(Token)match(input,LeftSquareBracket,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getBinaryExpressionAccess().getLeftSquareBracketKeyword_0_1_0());
                      				
                    }
                    // InternalDdParser.g:1402:5: ( (lv_left_6_0= ruleSharkExpression ) )
                    // InternalDdParser.g:1403:6: (lv_left_6_0= ruleSharkExpression )
                    {
                    // InternalDdParser.g:1403:6: (lv_left_6_0= ruleSharkExpression )
                    // InternalDdParser.g:1404:7: lv_left_6_0= ruleSharkExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getBinaryExpressionAccess().getLeftSharkExpressionParserRuleCall_0_1_1_0());
                      						
                    }
                    pushFollow(FOLLOW_40);
                    lv_left_6_0=ruleSharkExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getBinaryExpressionRule());
                      							}
                      							set(
                      								current,
                      								"left",
                      								lv_left_6_0,
                      								"com.shark.lang.Dd.SharkExpression");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalDdParser.g:1421:5: ( (lv_op_7_0= ruleBinaryOperator ) )
                    // InternalDdParser.g:1422:6: (lv_op_7_0= ruleBinaryOperator )
                    {
                    // InternalDdParser.g:1422:6: (lv_op_7_0= ruleBinaryOperator )
                    // InternalDdParser.g:1423:7: lv_op_7_0= ruleBinaryOperator
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getBinaryExpressionAccess().getOpBinaryOperatorEnumRuleCall_0_1_2_0());
                      						
                    }
                    pushFollow(FOLLOW_13);
                    lv_op_7_0=ruleBinaryOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getBinaryExpressionRule());
                      							}
                      							set(
                      								current,
                      								"op",
                      								lv_op_7_0,
                      								"com.shark.lang.Dd.BinaryOperator");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalDdParser.g:1440:5: ( (lv_right_8_0= ruleSharkExpression ) )
                    // InternalDdParser.g:1441:6: (lv_right_8_0= ruleSharkExpression )
                    {
                    // InternalDdParser.g:1441:6: (lv_right_8_0= ruleSharkExpression )
                    // InternalDdParser.g:1442:7: lv_right_8_0= ruleSharkExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getBinaryExpressionAccess().getRightSharkExpressionParserRuleCall_0_1_3_0());
                      						
                    }
                    pushFollow(FOLLOW_32);
                    lv_right_8_0=ruleSharkExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getBinaryExpressionRule());
                      							}
                      							set(
                      								current,
                      								"right",
                      								lv_right_8_0,
                      								"com.shark.lang.Dd.SharkExpression");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    otherlv_9=(Token)match(input,RightSquareBracket,FOLLOW_41); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_9, grammarAccess.getBinaryExpressionAccess().getRightSquareBracketKeyword_0_1_4());
                      				
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDdParser.g:1465:4: (otherlv_10= LeftCurlyBracket ( (lv_left_11_0= ruleSharkExpression ) ) ( (lv_op_12_0= ruleBinaryOperator ) ) ( (lv_right_13_0= ruleSharkExpression ) ) otherlv_14= RightCurlyBracket )
                    {
                    // InternalDdParser.g:1465:4: (otherlv_10= LeftCurlyBracket ( (lv_left_11_0= ruleSharkExpression ) ) ( (lv_op_12_0= ruleBinaryOperator ) ) ( (lv_right_13_0= ruleSharkExpression ) ) otherlv_14= RightCurlyBracket )
                    // InternalDdParser.g:1466:5: otherlv_10= LeftCurlyBracket ( (lv_left_11_0= ruleSharkExpression ) ) ( (lv_op_12_0= ruleBinaryOperator ) ) ( (lv_right_13_0= ruleSharkExpression ) ) otherlv_14= RightCurlyBracket
                    {
                    otherlv_10=(Token)match(input,LeftCurlyBracket,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_10, grammarAccess.getBinaryExpressionAccess().getLeftCurlyBracketKeyword_0_2_0());
                      				
                    }
                    // InternalDdParser.g:1470:5: ( (lv_left_11_0= ruleSharkExpression ) )
                    // InternalDdParser.g:1471:6: (lv_left_11_0= ruleSharkExpression )
                    {
                    // InternalDdParser.g:1471:6: (lv_left_11_0= ruleSharkExpression )
                    // InternalDdParser.g:1472:7: lv_left_11_0= ruleSharkExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getBinaryExpressionAccess().getLeftSharkExpressionParserRuleCall_0_2_1_0());
                      						
                    }
                    pushFollow(FOLLOW_40);
                    lv_left_11_0=ruleSharkExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getBinaryExpressionRule());
                      							}
                      							set(
                      								current,
                      								"left",
                      								lv_left_11_0,
                      								"com.shark.lang.Dd.SharkExpression");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalDdParser.g:1489:5: ( (lv_op_12_0= ruleBinaryOperator ) )
                    // InternalDdParser.g:1490:6: (lv_op_12_0= ruleBinaryOperator )
                    {
                    // InternalDdParser.g:1490:6: (lv_op_12_0= ruleBinaryOperator )
                    // InternalDdParser.g:1491:7: lv_op_12_0= ruleBinaryOperator
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getBinaryExpressionAccess().getOpBinaryOperatorEnumRuleCall_0_2_2_0());
                      						
                    }
                    pushFollow(FOLLOW_13);
                    lv_op_12_0=ruleBinaryOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getBinaryExpressionRule());
                      							}
                      							set(
                      								current,
                      								"op",
                      								lv_op_12_0,
                      								"com.shark.lang.Dd.BinaryOperator");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalDdParser.g:1508:5: ( (lv_right_13_0= ruleSharkExpression ) )
                    // InternalDdParser.g:1509:6: (lv_right_13_0= ruleSharkExpression )
                    {
                    // InternalDdParser.g:1509:6: (lv_right_13_0= ruleSharkExpression )
                    // InternalDdParser.g:1510:7: lv_right_13_0= ruleSharkExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getBinaryExpressionAccess().getRightSharkExpressionParserRuleCall_0_2_3_0());
                      						
                    }
                    pushFollow(FOLLOW_42);
                    lv_right_13_0=ruleSharkExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getBinaryExpressionRule());
                      							}
                      							set(
                      								current,
                      								"right",
                      								lv_right_13_0,
                      								"com.shark.lang.Dd.SharkExpression");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    otherlv_14=(Token)match(input,RightCurlyBracket,FOLLOW_41); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_14, grammarAccess.getBinaryExpressionAccess().getRightCurlyBracketKeyword_0_2_4());
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDdParser.g:1533:3: ( ( (lv_exprValue_15_0= RULE_NUL ) ) ( (lv_precision_16_0= RULE_INT ) ) ( (lv_length_17_0= RULE_INT ) ) ( (lv_hasAttribute_18_0= RULE_INT ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_NUL) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalDdParser.g:1534:4: ( (lv_exprValue_15_0= RULE_NUL ) ) ( (lv_precision_16_0= RULE_INT ) ) ( (lv_length_17_0= RULE_INT ) ) ( (lv_hasAttribute_18_0= RULE_INT ) )
                    {
                    // InternalDdParser.g:1534:4: ( (lv_exprValue_15_0= RULE_NUL ) )
                    // InternalDdParser.g:1535:5: (lv_exprValue_15_0= RULE_NUL )
                    {
                    // InternalDdParser.g:1535:5: (lv_exprValue_15_0= RULE_NUL )
                    // InternalDdParser.g:1536:6: lv_exprValue_15_0= RULE_NUL
                    {
                    lv_exprValue_15_0=(Token)match(input,RULE_NUL,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_exprValue_15_0, grammarAccess.getBinaryExpressionAccess().getExprValueNULTerminalRuleCall_1_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getBinaryExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"exprValue",
                      							lv_exprValue_15_0,
                      							"com.shark.lang.Dd.NUL");
                      					
                    }

                    }


                    }

                    // InternalDdParser.g:1552:4: ( (lv_precision_16_0= RULE_INT ) )
                    // InternalDdParser.g:1553:5: (lv_precision_16_0= RULE_INT )
                    {
                    // InternalDdParser.g:1553:5: (lv_precision_16_0= RULE_INT )
                    // InternalDdParser.g:1554:6: lv_precision_16_0= RULE_INT
                    {
                    lv_precision_16_0=(Token)match(input,RULE_INT,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_precision_16_0, grammarAccess.getBinaryExpressionAccess().getPrecisionINTTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getBinaryExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"precision",
                      							lv_precision_16_0,
                      							"com.shark.lang.Dd.INT");
                      					
                    }

                    }


                    }

                    // InternalDdParser.g:1570:4: ( (lv_length_17_0= RULE_INT ) )
                    // InternalDdParser.g:1571:5: (lv_length_17_0= RULE_INT )
                    {
                    // InternalDdParser.g:1571:5: (lv_length_17_0= RULE_INT )
                    // InternalDdParser.g:1572:6: lv_length_17_0= RULE_INT
                    {
                    lv_length_17_0=(Token)match(input,RULE_INT,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_length_17_0, grammarAccess.getBinaryExpressionAccess().getLengthINTTerminalRuleCall_1_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getBinaryExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"length",
                      							lv_length_17_0,
                      							"com.shark.lang.Dd.INT");
                      					
                    }

                    }


                    }

                    // InternalDdParser.g:1588:4: ( (lv_hasAttribute_18_0= RULE_INT ) )
                    // InternalDdParser.g:1589:5: (lv_hasAttribute_18_0= RULE_INT )
                    {
                    // InternalDdParser.g:1589:5: (lv_hasAttribute_18_0= RULE_INT )
                    // InternalDdParser.g:1590:6: lv_hasAttribute_18_0= RULE_INT
                    {
                    lv_hasAttribute_18_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_hasAttribute_18_0, grammarAccess.getBinaryExpressionAccess().getHasAttributeINTTerminalRuleCall_1_3_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getBinaryExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"hasAttribute",
                      							lv_hasAttribute_18_0,
                      							"com.shark.lang.Dd.INT");
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBinaryExpression"


    // $ANTLR start "entryRuleUnaryExpression"
    // InternalDdParser.g:1611:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // InternalDdParser.g:1611:56: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // InternalDdParser.g:1612:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnaryExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUnaryExpression=ruleUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnaryExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnaryExpression"


    // $ANTLR start "ruleUnaryExpression"
    // InternalDdParser.g:1618:1: ruleUnaryExpression returns [EObject current=null] : ( ( ( ( (lv_op_0_0= ruleUnaryOperator ) ) otherlv_1= LeftParenthesis ( (lv_left_2_0= ruleSharkExpression ) ) otherlv_3= RightParenthesis ) | ( ( (lv_op_4_0= ruleUnaryOperator ) ) otherlv_5= LeftSquareBracket ( (lv_left_6_0= ruleSharkExpression ) ) otherlv_7= RightSquareBracket ) | ( ( (lv_op_8_0= ruleUnaryOperator ) ) otherlv_9= LeftCurlyBracket ( (lv_left_10_0= ruleSharkExpression ) ) otherlv_11= RightCurlyBracket ) ) ( ( (lv_exprValue_12_0= RULE_NUL ) ) ( (lv_precision_13_0= RULE_INT ) ) ( (lv_length_14_0= RULE_INT ) ) ( (lv_hasAttribute_15_0= RULE_INT ) ) )? ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token lv_exprValue_12_0=null;
        Token lv_precision_13_0=null;
        Token lv_length_14_0=null;
        Token lv_hasAttribute_15_0=null;
        Enumerator lv_op_0_0 = null;

        EObject lv_left_2_0 = null;

        Enumerator lv_op_4_0 = null;

        EObject lv_left_6_0 = null;

        Enumerator lv_op_8_0 = null;

        EObject lv_left_10_0 = null;



        	enterRule();

        try {
            // InternalDdParser.g:1624:2: ( ( ( ( ( (lv_op_0_0= ruleUnaryOperator ) ) otherlv_1= LeftParenthesis ( (lv_left_2_0= ruleSharkExpression ) ) otherlv_3= RightParenthesis ) | ( ( (lv_op_4_0= ruleUnaryOperator ) ) otherlv_5= LeftSquareBracket ( (lv_left_6_0= ruleSharkExpression ) ) otherlv_7= RightSquareBracket ) | ( ( (lv_op_8_0= ruleUnaryOperator ) ) otherlv_9= LeftCurlyBracket ( (lv_left_10_0= ruleSharkExpression ) ) otherlv_11= RightCurlyBracket ) ) ( ( (lv_exprValue_12_0= RULE_NUL ) ) ( (lv_precision_13_0= RULE_INT ) ) ( (lv_length_14_0= RULE_INT ) ) ( (lv_hasAttribute_15_0= RULE_INT ) ) )? ) )
            // InternalDdParser.g:1625:2: ( ( ( ( (lv_op_0_0= ruleUnaryOperator ) ) otherlv_1= LeftParenthesis ( (lv_left_2_0= ruleSharkExpression ) ) otherlv_3= RightParenthesis ) | ( ( (lv_op_4_0= ruleUnaryOperator ) ) otherlv_5= LeftSquareBracket ( (lv_left_6_0= ruleSharkExpression ) ) otherlv_7= RightSquareBracket ) | ( ( (lv_op_8_0= ruleUnaryOperator ) ) otherlv_9= LeftCurlyBracket ( (lv_left_10_0= ruleSharkExpression ) ) otherlv_11= RightCurlyBracket ) ) ( ( (lv_exprValue_12_0= RULE_NUL ) ) ( (lv_precision_13_0= RULE_INT ) ) ( (lv_length_14_0= RULE_INT ) ) ( (lv_hasAttribute_15_0= RULE_INT ) ) )? )
            {
            // InternalDdParser.g:1625:2: ( ( ( ( (lv_op_0_0= ruleUnaryOperator ) ) otherlv_1= LeftParenthesis ( (lv_left_2_0= ruleSharkExpression ) ) otherlv_3= RightParenthesis ) | ( ( (lv_op_4_0= ruleUnaryOperator ) ) otherlv_5= LeftSquareBracket ( (lv_left_6_0= ruleSharkExpression ) ) otherlv_7= RightSquareBracket ) | ( ( (lv_op_8_0= ruleUnaryOperator ) ) otherlv_9= LeftCurlyBracket ( (lv_left_10_0= ruleSharkExpression ) ) otherlv_11= RightCurlyBracket ) ) ( ( (lv_exprValue_12_0= RULE_NUL ) ) ( (lv_precision_13_0= RULE_INT ) ) ( (lv_length_14_0= RULE_INT ) ) ( (lv_hasAttribute_15_0= RULE_INT ) ) )? )
            // InternalDdParser.g:1626:3: ( ( ( (lv_op_0_0= ruleUnaryOperator ) ) otherlv_1= LeftParenthesis ( (lv_left_2_0= ruleSharkExpression ) ) otherlv_3= RightParenthesis ) | ( ( (lv_op_4_0= ruleUnaryOperator ) ) otherlv_5= LeftSquareBracket ( (lv_left_6_0= ruleSharkExpression ) ) otherlv_7= RightSquareBracket ) | ( ( (lv_op_8_0= ruleUnaryOperator ) ) otherlv_9= LeftCurlyBracket ( (lv_left_10_0= ruleSharkExpression ) ) otherlv_11= RightCurlyBracket ) ) ( ( (lv_exprValue_12_0= RULE_NUL ) ) ( (lv_precision_13_0= RULE_INT ) ) ( (lv_length_14_0= RULE_INT ) ) ( (lv_hasAttribute_15_0= RULE_INT ) ) )?
            {
            // InternalDdParser.g:1626:3: ( ( ( (lv_op_0_0= ruleUnaryOperator ) ) otherlv_1= LeftParenthesis ( (lv_left_2_0= ruleSharkExpression ) ) otherlv_3= RightParenthesis ) | ( ( (lv_op_4_0= ruleUnaryOperator ) ) otherlv_5= LeftSquareBracket ( (lv_left_6_0= ruleSharkExpression ) ) otherlv_7= RightSquareBracket ) | ( ( (lv_op_8_0= ruleUnaryOperator ) ) otherlv_9= LeftCurlyBracket ( (lv_left_10_0= ruleSharkExpression ) ) otherlv_11= RightCurlyBracket ) )
            int alt31=3;
            alt31 = dfa31.predict(input);
            switch (alt31) {
                case 1 :
                    // InternalDdParser.g:1627:4: ( ( (lv_op_0_0= ruleUnaryOperator ) ) otherlv_1= LeftParenthesis ( (lv_left_2_0= ruleSharkExpression ) ) otherlv_3= RightParenthesis )
                    {
                    // InternalDdParser.g:1627:4: ( ( (lv_op_0_0= ruleUnaryOperator ) ) otherlv_1= LeftParenthesis ( (lv_left_2_0= ruleSharkExpression ) ) otherlv_3= RightParenthesis )
                    // InternalDdParser.g:1628:5: ( (lv_op_0_0= ruleUnaryOperator ) ) otherlv_1= LeftParenthesis ( (lv_left_2_0= ruleSharkExpression ) ) otherlv_3= RightParenthesis
                    {
                    // InternalDdParser.g:1628:5: ( (lv_op_0_0= ruleUnaryOperator ) )
                    // InternalDdParser.g:1629:6: (lv_op_0_0= ruleUnaryOperator )
                    {
                    // InternalDdParser.g:1629:6: (lv_op_0_0= ruleUnaryOperator )
                    // InternalDdParser.g:1630:7: lv_op_0_0= ruleUnaryOperator
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getUnaryExpressionAccess().getOpUnaryOperatorEnumRuleCall_0_0_0_0());
                      						
                    }
                    pushFollow(FOLLOW_34);
                    lv_op_0_0=ruleUnaryOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getUnaryExpressionRule());
                      							}
                      							set(
                      								current,
                      								"op",
                      								lv_op_0_0,
                      								"com.shark.lang.Dd.UnaryOperator");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getUnaryExpressionAccess().getLeftParenthesisKeyword_0_0_1());
                      				
                    }
                    // InternalDdParser.g:1651:5: ( (lv_left_2_0= ruleSharkExpression ) )
                    // InternalDdParser.g:1652:6: (lv_left_2_0= ruleSharkExpression )
                    {
                    // InternalDdParser.g:1652:6: (lv_left_2_0= ruleSharkExpression )
                    // InternalDdParser.g:1653:7: lv_left_2_0= ruleSharkExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getUnaryExpressionAccess().getLeftSharkExpressionParserRuleCall_0_0_2_0());
                      						
                    }
                    pushFollow(FOLLOW_31);
                    lv_left_2_0=ruleSharkExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getUnaryExpressionRule());
                      							}
                      							set(
                      								current,
                      								"left",
                      								lv_left_2_0,
                      								"com.shark.lang.Dd.SharkExpression");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,RightParenthesis,FOLLOW_41); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getUnaryExpressionAccess().getRightParenthesisKeyword_0_0_3());
                      				
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDdParser.g:1676:4: ( ( (lv_op_4_0= ruleUnaryOperator ) ) otherlv_5= LeftSquareBracket ( (lv_left_6_0= ruleSharkExpression ) ) otherlv_7= RightSquareBracket )
                    {
                    // InternalDdParser.g:1676:4: ( ( (lv_op_4_0= ruleUnaryOperator ) ) otherlv_5= LeftSquareBracket ( (lv_left_6_0= ruleSharkExpression ) ) otherlv_7= RightSquareBracket )
                    // InternalDdParser.g:1677:5: ( (lv_op_4_0= ruleUnaryOperator ) ) otherlv_5= LeftSquareBracket ( (lv_left_6_0= ruleSharkExpression ) ) otherlv_7= RightSquareBracket
                    {
                    // InternalDdParser.g:1677:5: ( (lv_op_4_0= ruleUnaryOperator ) )
                    // InternalDdParser.g:1678:6: (lv_op_4_0= ruleUnaryOperator )
                    {
                    // InternalDdParser.g:1678:6: (lv_op_4_0= ruleUnaryOperator )
                    // InternalDdParser.g:1679:7: lv_op_4_0= ruleUnaryOperator
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getUnaryExpressionAccess().getOpUnaryOperatorEnumRuleCall_0_1_0_0());
                      						
                    }
                    pushFollow(FOLLOW_43);
                    lv_op_4_0=ruleUnaryOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getUnaryExpressionRule());
                      							}
                      							set(
                      								current,
                      								"op",
                      								lv_op_4_0,
                      								"com.shark.lang.Dd.UnaryOperator");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,LeftSquareBracket,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getUnaryExpressionAccess().getLeftSquareBracketKeyword_0_1_1());
                      				
                    }
                    // InternalDdParser.g:1700:5: ( (lv_left_6_0= ruleSharkExpression ) )
                    // InternalDdParser.g:1701:6: (lv_left_6_0= ruleSharkExpression )
                    {
                    // InternalDdParser.g:1701:6: (lv_left_6_0= ruleSharkExpression )
                    // InternalDdParser.g:1702:7: lv_left_6_0= ruleSharkExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getUnaryExpressionAccess().getLeftSharkExpressionParserRuleCall_0_1_2_0());
                      						
                    }
                    pushFollow(FOLLOW_32);
                    lv_left_6_0=ruleSharkExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getUnaryExpressionRule());
                      							}
                      							set(
                      								current,
                      								"left",
                      								lv_left_6_0,
                      								"com.shark.lang.Dd.SharkExpression");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    otherlv_7=(Token)match(input,RightSquareBracket,FOLLOW_41); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_7, grammarAccess.getUnaryExpressionAccess().getRightSquareBracketKeyword_0_1_3());
                      				
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDdParser.g:1725:4: ( ( (lv_op_8_0= ruleUnaryOperator ) ) otherlv_9= LeftCurlyBracket ( (lv_left_10_0= ruleSharkExpression ) ) otherlv_11= RightCurlyBracket )
                    {
                    // InternalDdParser.g:1725:4: ( ( (lv_op_8_0= ruleUnaryOperator ) ) otherlv_9= LeftCurlyBracket ( (lv_left_10_0= ruleSharkExpression ) ) otherlv_11= RightCurlyBracket )
                    // InternalDdParser.g:1726:5: ( (lv_op_8_0= ruleUnaryOperator ) ) otherlv_9= LeftCurlyBracket ( (lv_left_10_0= ruleSharkExpression ) ) otherlv_11= RightCurlyBracket
                    {
                    // InternalDdParser.g:1726:5: ( (lv_op_8_0= ruleUnaryOperator ) )
                    // InternalDdParser.g:1727:6: (lv_op_8_0= ruleUnaryOperator )
                    {
                    // InternalDdParser.g:1727:6: (lv_op_8_0= ruleUnaryOperator )
                    // InternalDdParser.g:1728:7: lv_op_8_0= ruleUnaryOperator
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getUnaryExpressionAccess().getOpUnaryOperatorEnumRuleCall_0_2_0_0());
                      						
                    }
                    pushFollow(FOLLOW_44);
                    lv_op_8_0=ruleUnaryOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getUnaryExpressionRule());
                      							}
                      							set(
                      								current,
                      								"op",
                      								lv_op_8_0,
                      								"com.shark.lang.Dd.UnaryOperator");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    otherlv_9=(Token)match(input,LeftCurlyBracket,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_9, grammarAccess.getUnaryExpressionAccess().getLeftCurlyBracketKeyword_0_2_1());
                      				
                    }
                    // InternalDdParser.g:1749:5: ( (lv_left_10_0= ruleSharkExpression ) )
                    // InternalDdParser.g:1750:6: (lv_left_10_0= ruleSharkExpression )
                    {
                    // InternalDdParser.g:1750:6: (lv_left_10_0= ruleSharkExpression )
                    // InternalDdParser.g:1751:7: lv_left_10_0= ruleSharkExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getUnaryExpressionAccess().getLeftSharkExpressionParserRuleCall_0_2_2_0());
                      						
                    }
                    pushFollow(FOLLOW_42);
                    lv_left_10_0=ruleSharkExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getUnaryExpressionRule());
                      							}
                      							set(
                      								current,
                      								"left",
                      								lv_left_10_0,
                      								"com.shark.lang.Dd.SharkExpression");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    otherlv_11=(Token)match(input,RightCurlyBracket,FOLLOW_41); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_11, grammarAccess.getUnaryExpressionAccess().getRightCurlyBracketKeyword_0_2_3());
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDdParser.g:1774:3: ( ( (lv_exprValue_12_0= RULE_NUL ) ) ( (lv_precision_13_0= RULE_INT ) ) ( (lv_length_14_0= RULE_INT ) ) ( (lv_hasAttribute_15_0= RULE_INT ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_NUL) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalDdParser.g:1775:4: ( (lv_exprValue_12_0= RULE_NUL ) ) ( (lv_precision_13_0= RULE_INT ) ) ( (lv_length_14_0= RULE_INT ) ) ( (lv_hasAttribute_15_0= RULE_INT ) )
                    {
                    // InternalDdParser.g:1775:4: ( (lv_exprValue_12_0= RULE_NUL ) )
                    // InternalDdParser.g:1776:5: (lv_exprValue_12_0= RULE_NUL )
                    {
                    // InternalDdParser.g:1776:5: (lv_exprValue_12_0= RULE_NUL )
                    // InternalDdParser.g:1777:6: lv_exprValue_12_0= RULE_NUL
                    {
                    lv_exprValue_12_0=(Token)match(input,RULE_NUL,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_exprValue_12_0, grammarAccess.getUnaryExpressionAccess().getExprValueNULTerminalRuleCall_1_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getUnaryExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"exprValue",
                      							lv_exprValue_12_0,
                      							"com.shark.lang.Dd.NUL");
                      					
                    }

                    }


                    }

                    // InternalDdParser.g:1793:4: ( (lv_precision_13_0= RULE_INT ) )
                    // InternalDdParser.g:1794:5: (lv_precision_13_0= RULE_INT )
                    {
                    // InternalDdParser.g:1794:5: (lv_precision_13_0= RULE_INT )
                    // InternalDdParser.g:1795:6: lv_precision_13_0= RULE_INT
                    {
                    lv_precision_13_0=(Token)match(input,RULE_INT,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_precision_13_0, grammarAccess.getUnaryExpressionAccess().getPrecisionINTTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getUnaryExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"precision",
                      							lv_precision_13_0,
                      							"com.shark.lang.Dd.INT");
                      					
                    }

                    }


                    }

                    // InternalDdParser.g:1811:4: ( (lv_length_14_0= RULE_INT ) )
                    // InternalDdParser.g:1812:5: (lv_length_14_0= RULE_INT )
                    {
                    // InternalDdParser.g:1812:5: (lv_length_14_0= RULE_INT )
                    // InternalDdParser.g:1813:6: lv_length_14_0= RULE_INT
                    {
                    lv_length_14_0=(Token)match(input,RULE_INT,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_length_14_0, grammarAccess.getUnaryExpressionAccess().getLengthINTTerminalRuleCall_1_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getUnaryExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"length",
                      							lv_length_14_0,
                      							"com.shark.lang.Dd.INT");
                      					
                    }

                    }


                    }

                    // InternalDdParser.g:1829:4: ( (lv_hasAttribute_15_0= RULE_INT ) )
                    // InternalDdParser.g:1830:5: (lv_hasAttribute_15_0= RULE_INT )
                    {
                    // InternalDdParser.g:1830:5: (lv_hasAttribute_15_0= RULE_INT )
                    // InternalDdParser.g:1831:6: lv_hasAttribute_15_0= RULE_INT
                    {
                    lv_hasAttribute_15_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_hasAttribute_15_0, grammarAccess.getUnaryExpressionAccess().getHasAttributeINTTerminalRuleCall_1_3_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getUnaryExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"hasAttribute",
                      							lv_hasAttribute_15_0,
                      							"com.shark.lang.Dd.INT");
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnaryExpression"


    // $ANTLR start "entryRuleAddExpression"
    // InternalDdParser.g:1852:1: entryRuleAddExpression returns [EObject current=null] : iv_ruleAddExpression= ruleAddExpression EOF ;
    public final EObject entryRuleAddExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddExpression = null;


        try {
            // InternalDdParser.g:1852:54: (iv_ruleAddExpression= ruleAddExpression EOF )
            // InternalDdParser.g:1853:2: iv_ruleAddExpression= ruleAddExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAddExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAddExpression=ruleAddExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAddExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAddExpression"


    // $ANTLR start "ruleAddExpression"
    // InternalDdParser.g:1859:1: ruleAddExpression returns [EObject current=null] : ( ( (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_addElts_4_0= ruleAddExpressionElt ) )+ otherlv_5= RightParenthesis ) | (otherlv_6= LeftSquareBracket ( (lv_left_7_0= ruleSharkExpression ) ) ( ( (lv_op_8_1= PlusSign | lv_op_8_2= HyphenMinus ) ) ) ( (lv_right_9_0= ruleSharkExpression ) ) ( (lv_addElts_10_0= ruleAddExpressionElt ) )+ otherlv_11= RightSquareBracket ) | (otherlv_12= LeftCurlyBracket ( (lv_left_13_0= ruleSharkExpression ) ) ( ( (lv_op_14_1= PlusSign | lv_op_14_2= HyphenMinus ) ) ) ( (lv_right_15_0= ruleSharkExpression ) ) ( (lv_addElts_16_0= ruleAddExpressionElt ) )+ otherlv_17= RightCurlyBracket ) ) ( ( (lv_exprValue_18_0= RULE_NUL ) ) ( (lv_precision_19_0= RULE_INT ) ) ( (lv_length_20_0= RULE_INT ) ) ( (lv_hasAttribute_21_0= RULE_INT ) ) )? ) ;
    public final EObject ruleAddExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_op_8_1=null;
        Token lv_op_8_2=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_op_14_1=null;
        Token lv_op_14_2=null;
        Token otherlv_17=null;
        Token lv_exprValue_18_0=null;
        Token lv_precision_19_0=null;
        Token lv_length_20_0=null;
        Token lv_hasAttribute_21_0=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_addElts_4_0 = null;

        EObject lv_left_7_0 = null;

        EObject lv_right_9_0 = null;

        EObject lv_addElts_10_0 = null;

        EObject lv_left_13_0 = null;

        EObject lv_right_15_0 = null;

        EObject lv_addElts_16_0 = null;



        	enterRule();

        try {
            // InternalDdParser.g:1865:2: ( ( ( (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_addElts_4_0= ruleAddExpressionElt ) )+ otherlv_5= RightParenthesis ) | (otherlv_6= LeftSquareBracket ( (lv_left_7_0= ruleSharkExpression ) ) ( ( (lv_op_8_1= PlusSign | lv_op_8_2= HyphenMinus ) ) ) ( (lv_right_9_0= ruleSharkExpression ) ) ( (lv_addElts_10_0= ruleAddExpressionElt ) )+ otherlv_11= RightSquareBracket ) | (otherlv_12= LeftCurlyBracket ( (lv_left_13_0= ruleSharkExpression ) ) ( ( (lv_op_14_1= PlusSign | lv_op_14_2= HyphenMinus ) ) ) ( (lv_right_15_0= ruleSharkExpression ) ) ( (lv_addElts_16_0= ruleAddExpressionElt ) )+ otherlv_17= RightCurlyBracket ) ) ( ( (lv_exprValue_18_0= RULE_NUL ) ) ( (lv_precision_19_0= RULE_INT ) ) ( (lv_length_20_0= RULE_INT ) ) ( (lv_hasAttribute_21_0= RULE_INT ) ) )? ) )
            // InternalDdParser.g:1866:2: ( ( (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_addElts_4_0= ruleAddExpressionElt ) )+ otherlv_5= RightParenthesis ) | (otherlv_6= LeftSquareBracket ( (lv_left_7_0= ruleSharkExpression ) ) ( ( (lv_op_8_1= PlusSign | lv_op_8_2= HyphenMinus ) ) ) ( (lv_right_9_0= ruleSharkExpression ) ) ( (lv_addElts_10_0= ruleAddExpressionElt ) )+ otherlv_11= RightSquareBracket ) | (otherlv_12= LeftCurlyBracket ( (lv_left_13_0= ruleSharkExpression ) ) ( ( (lv_op_14_1= PlusSign | lv_op_14_2= HyphenMinus ) ) ) ( (lv_right_15_0= ruleSharkExpression ) ) ( (lv_addElts_16_0= ruleAddExpressionElt ) )+ otherlv_17= RightCurlyBracket ) ) ( ( (lv_exprValue_18_0= RULE_NUL ) ) ( (lv_precision_19_0= RULE_INT ) ) ( (lv_length_20_0= RULE_INT ) ) ( (lv_hasAttribute_21_0= RULE_INT ) ) )? )
            {
            // InternalDdParser.g:1866:2: ( ( (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_addElts_4_0= ruleAddExpressionElt ) )+ otherlv_5= RightParenthesis ) | (otherlv_6= LeftSquareBracket ( (lv_left_7_0= ruleSharkExpression ) ) ( ( (lv_op_8_1= PlusSign | lv_op_8_2= HyphenMinus ) ) ) ( (lv_right_9_0= ruleSharkExpression ) ) ( (lv_addElts_10_0= ruleAddExpressionElt ) )+ otherlv_11= RightSquareBracket ) | (otherlv_12= LeftCurlyBracket ( (lv_left_13_0= ruleSharkExpression ) ) ( ( (lv_op_14_1= PlusSign | lv_op_14_2= HyphenMinus ) ) ) ( (lv_right_15_0= ruleSharkExpression ) ) ( (lv_addElts_16_0= ruleAddExpressionElt ) )+ otherlv_17= RightCurlyBracket ) ) ( ( (lv_exprValue_18_0= RULE_NUL ) ) ( (lv_precision_19_0= RULE_INT ) ) ( (lv_length_20_0= RULE_INT ) ) ( (lv_hasAttribute_21_0= RULE_INT ) ) )? )
            // InternalDdParser.g:1867:3: ( (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_addElts_4_0= ruleAddExpressionElt ) )+ otherlv_5= RightParenthesis ) | (otherlv_6= LeftSquareBracket ( (lv_left_7_0= ruleSharkExpression ) ) ( ( (lv_op_8_1= PlusSign | lv_op_8_2= HyphenMinus ) ) ) ( (lv_right_9_0= ruleSharkExpression ) ) ( (lv_addElts_10_0= ruleAddExpressionElt ) )+ otherlv_11= RightSquareBracket ) | (otherlv_12= LeftCurlyBracket ( (lv_left_13_0= ruleSharkExpression ) ) ( ( (lv_op_14_1= PlusSign | lv_op_14_2= HyphenMinus ) ) ) ( (lv_right_15_0= ruleSharkExpression ) ) ( (lv_addElts_16_0= ruleAddExpressionElt ) )+ otherlv_17= RightCurlyBracket ) ) ( ( (lv_exprValue_18_0= RULE_NUL ) ) ( (lv_precision_19_0= RULE_INT ) ) ( (lv_length_20_0= RULE_INT ) ) ( (lv_hasAttribute_21_0= RULE_INT ) ) )?
            {
            // InternalDdParser.g:1867:3: ( (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_addElts_4_0= ruleAddExpressionElt ) )+ otherlv_5= RightParenthesis ) | (otherlv_6= LeftSquareBracket ( (lv_left_7_0= ruleSharkExpression ) ) ( ( (lv_op_8_1= PlusSign | lv_op_8_2= HyphenMinus ) ) ) ( (lv_right_9_0= ruleSharkExpression ) ) ( (lv_addElts_10_0= ruleAddExpressionElt ) )+ otherlv_11= RightSquareBracket ) | (otherlv_12= LeftCurlyBracket ( (lv_left_13_0= ruleSharkExpression ) ) ( ( (lv_op_14_1= PlusSign | lv_op_14_2= HyphenMinus ) ) ) ( (lv_right_15_0= ruleSharkExpression ) ) ( (lv_addElts_16_0= ruleAddExpressionElt ) )+ otherlv_17= RightCurlyBracket ) )
            int alt39=3;
            switch ( input.LA(1) ) {
            case LeftParenthesis:
                {
                alt39=1;
                }
                break;
            case LeftSquareBracket:
                {
                alt39=2;
                }
                break;
            case LeftCurlyBracket:
                {
                alt39=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // InternalDdParser.g:1868:4: (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_addElts_4_0= ruleAddExpressionElt ) )+ otherlv_5= RightParenthesis )
                    {
                    // InternalDdParser.g:1868:4: (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_addElts_4_0= ruleAddExpressionElt ) )+ otherlv_5= RightParenthesis )
                    // InternalDdParser.g:1869:5: otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_addElts_4_0= ruleAddExpressionElt ) )+ otherlv_5= RightParenthesis
                    {
                    otherlv_0=(Token)match(input,LeftParenthesis,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_0, grammarAccess.getAddExpressionAccess().getLeftParenthesisKeyword_0_0_0());
                      				
                    }
                    // InternalDdParser.g:1873:5: ( (lv_left_1_0= ruleSharkExpression ) )
                    // InternalDdParser.g:1874:6: (lv_left_1_0= ruleSharkExpression )
                    {
                    // InternalDdParser.g:1874:6: (lv_left_1_0= ruleSharkExpression )
                    // InternalDdParser.g:1875:7: lv_left_1_0= ruleSharkExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getAddExpressionAccess().getLeftSharkExpressionParserRuleCall_0_0_1_0());
                      						
                    }
                    pushFollow(FOLLOW_45);
                    lv_left_1_0=ruleSharkExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getAddExpressionRule());
                      							}
                      							set(
                      								current,
                      								"left",
                      								lv_left_1_0,
                      								"com.shark.lang.Dd.SharkExpression");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalDdParser.g:1892:5: ( ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) ) )
                    // InternalDdParser.g:1893:6: ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) )
                    {
                    // InternalDdParser.g:1893:6: ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) )
                    // InternalDdParser.g:1894:7: (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus )
                    {
                    // InternalDdParser.g:1894:7: (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus )
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==PlusSign) ) {
                        alt33=1;
                    }
                    else if ( (LA33_0==HyphenMinus) ) {
                        alt33=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 33, 0, input);

                        throw nvae;
                    }
                    switch (alt33) {
                        case 1 :
                            // InternalDdParser.g:1895:8: lv_op_2_1= PlusSign
                            {
                            lv_op_2_1=(Token)match(input,PlusSign,FOLLOW_13); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_op_2_1, grammarAccess.getAddExpressionAccess().getOpPlusSignKeyword_0_0_2_0_0());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getAddExpressionRule());
                              								}
                              								setWithLastConsumed(current, "op", lv_op_2_1, null);
                              							
                            }

                            }
                            break;
                        case 2 :
                            // InternalDdParser.g:1906:8: lv_op_2_2= HyphenMinus
                            {
                            lv_op_2_2=(Token)match(input,HyphenMinus,FOLLOW_13); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_op_2_2, grammarAccess.getAddExpressionAccess().getOpHyphenMinusKeyword_0_0_2_0_1());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getAddExpressionRule());
                              								}
                              								setWithLastConsumed(current, "op", lv_op_2_2, null);
                              							
                            }

                            }
                            break;

                    }


                    }


                    }

                    // InternalDdParser.g:1919:5: ( (lv_right_3_0= ruleSharkExpression ) )
                    // InternalDdParser.g:1920:6: (lv_right_3_0= ruleSharkExpression )
                    {
                    // InternalDdParser.g:1920:6: (lv_right_3_0= ruleSharkExpression )
                    // InternalDdParser.g:1921:7: lv_right_3_0= ruleSharkExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getAddExpressionAccess().getRightSharkExpressionParserRuleCall_0_0_3_0());
                      						
                    }
                    pushFollow(FOLLOW_46);
                    lv_right_3_0=ruleSharkExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getAddExpressionRule());
                      							}
                      							set(
                      								current,
                      								"right",
                      								lv_right_3_0,
                      								"com.shark.lang.Dd.SharkExpression");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalDdParser.g:1938:5: ( (lv_addElts_4_0= ruleAddExpressionElt ) )+
                    int cnt34=0;
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==PlusSign) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalDdParser.g:1939:6: (lv_addElts_4_0= ruleAddExpressionElt )
                    	    {
                    	    // InternalDdParser.g:1939:6: (lv_addElts_4_0= ruleAddExpressionElt )
                    	    // InternalDdParser.g:1940:7: lv_addElts_4_0= ruleAddExpressionElt
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getAddExpressionAccess().getAddEltsAddExpressionEltParserRuleCall_0_0_4_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_47);
                    	    lv_addElts_4_0=ruleAddExpressionElt();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getAddExpressionRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"addElts",
                    	      								lv_addElts_4_0,
                    	      								"com.shark.lang.Dd.AddExpressionElt");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt34 >= 1 ) break loop34;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(34, input);
                                throw eee;
                        }
                        cnt34++;
                    } while (true);

                    otherlv_5=(Token)match(input,RightParenthesis,FOLLOW_41); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getAddExpressionAccess().getRightParenthesisKeyword_0_0_5());
                      				
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDdParser.g:1963:4: (otherlv_6= LeftSquareBracket ( (lv_left_7_0= ruleSharkExpression ) ) ( ( (lv_op_8_1= PlusSign | lv_op_8_2= HyphenMinus ) ) ) ( (lv_right_9_0= ruleSharkExpression ) ) ( (lv_addElts_10_0= ruleAddExpressionElt ) )+ otherlv_11= RightSquareBracket )
                    {
                    // InternalDdParser.g:1963:4: (otherlv_6= LeftSquareBracket ( (lv_left_7_0= ruleSharkExpression ) ) ( ( (lv_op_8_1= PlusSign | lv_op_8_2= HyphenMinus ) ) ) ( (lv_right_9_0= ruleSharkExpression ) ) ( (lv_addElts_10_0= ruleAddExpressionElt ) )+ otherlv_11= RightSquareBracket )
                    // InternalDdParser.g:1964:5: otherlv_6= LeftSquareBracket ( (lv_left_7_0= ruleSharkExpression ) ) ( ( (lv_op_8_1= PlusSign | lv_op_8_2= HyphenMinus ) ) ) ( (lv_right_9_0= ruleSharkExpression ) ) ( (lv_addElts_10_0= ruleAddExpressionElt ) )+ otherlv_11= RightSquareBracket
                    {
                    otherlv_6=(Token)match(input,LeftSquareBracket,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getAddExpressionAccess().getLeftSquareBracketKeyword_0_1_0());
                      				
                    }
                    // InternalDdParser.g:1968:5: ( (lv_left_7_0= ruleSharkExpression ) )
                    // InternalDdParser.g:1969:6: (lv_left_7_0= ruleSharkExpression )
                    {
                    // InternalDdParser.g:1969:6: (lv_left_7_0= ruleSharkExpression )
                    // InternalDdParser.g:1970:7: lv_left_7_0= ruleSharkExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getAddExpressionAccess().getLeftSharkExpressionParserRuleCall_0_1_1_0());
                      						
                    }
                    pushFollow(FOLLOW_45);
                    lv_left_7_0=ruleSharkExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getAddExpressionRule());
                      							}
                      							set(
                      								current,
                      								"left",
                      								lv_left_7_0,
                      								"com.shark.lang.Dd.SharkExpression");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalDdParser.g:1987:5: ( ( (lv_op_8_1= PlusSign | lv_op_8_2= HyphenMinus ) ) )
                    // InternalDdParser.g:1988:6: ( (lv_op_8_1= PlusSign | lv_op_8_2= HyphenMinus ) )
                    {
                    // InternalDdParser.g:1988:6: ( (lv_op_8_1= PlusSign | lv_op_8_2= HyphenMinus ) )
                    // InternalDdParser.g:1989:7: (lv_op_8_1= PlusSign | lv_op_8_2= HyphenMinus )
                    {
                    // InternalDdParser.g:1989:7: (lv_op_8_1= PlusSign | lv_op_8_2= HyphenMinus )
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==PlusSign) ) {
                        alt35=1;
                    }
                    else if ( (LA35_0==HyphenMinus) ) {
                        alt35=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 35, 0, input);

                        throw nvae;
                    }
                    switch (alt35) {
                        case 1 :
                            // InternalDdParser.g:1990:8: lv_op_8_1= PlusSign
                            {
                            lv_op_8_1=(Token)match(input,PlusSign,FOLLOW_13); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_op_8_1, grammarAccess.getAddExpressionAccess().getOpPlusSignKeyword_0_1_2_0_0());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getAddExpressionRule());
                              								}
                              								setWithLastConsumed(current, "op", lv_op_8_1, null);
                              							
                            }

                            }
                            break;
                        case 2 :
                            // InternalDdParser.g:2001:8: lv_op_8_2= HyphenMinus
                            {
                            lv_op_8_2=(Token)match(input,HyphenMinus,FOLLOW_13); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_op_8_2, grammarAccess.getAddExpressionAccess().getOpHyphenMinusKeyword_0_1_2_0_1());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getAddExpressionRule());
                              								}
                              								setWithLastConsumed(current, "op", lv_op_8_2, null);
                              							
                            }

                            }
                            break;

                    }


                    }


                    }

                    // InternalDdParser.g:2014:5: ( (lv_right_9_0= ruleSharkExpression ) )
                    // InternalDdParser.g:2015:6: (lv_right_9_0= ruleSharkExpression )
                    {
                    // InternalDdParser.g:2015:6: (lv_right_9_0= ruleSharkExpression )
                    // InternalDdParser.g:2016:7: lv_right_9_0= ruleSharkExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getAddExpressionAccess().getRightSharkExpressionParserRuleCall_0_1_3_0());
                      						
                    }
                    pushFollow(FOLLOW_46);
                    lv_right_9_0=ruleSharkExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getAddExpressionRule());
                      							}
                      							set(
                      								current,
                      								"right",
                      								lv_right_9_0,
                      								"com.shark.lang.Dd.SharkExpression");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalDdParser.g:2033:5: ( (lv_addElts_10_0= ruleAddExpressionElt ) )+
                    int cnt36=0;
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==PlusSign) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalDdParser.g:2034:6: (lv_addElts_10_0= ruleAddExpressionElt )
                    	    {
                    	    // InternalDdParser.g:2034:6: (lv_addElts_10_0= ruleAddExpressionElt )
                    	    // InternalDdParser.g:2035:7: lv_addElts_10_0= ruleAddExpressionElt
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getAddExpressionAccess().getAddEltsAddExpressionEltParserRuleCall_0_1_4_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_48);
                    	    lv_addElts_10_0=ruleAddExpressionElt();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getAddExpressionRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"addElts",
                    	      								lv_addElts_10_0,
                    	      								"com.shark.lang.Dd.AddExpressionElt");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt36 >= 1 ) break loop36;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(36, input);
                                throw eee;
                        }
                        cnt36++;
                    } while (true);

                    otherlv_11=(Token)match(input,RightSquareBracket,FOLLOW_41); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_11, grammarAccess.getAddExpressionAccess().getRightSquareBracketKeyword_0_1_5());
                      				
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDdParser.g:2058:4: (otherlv_12= LeftCurlyBracket ( (lv_left_13_0= ruleSharkExpression ) ) ( ( (lv_op_14_1= PlusSign | lv_op_14_2= HyphenMinus ) ) ) ( (lv_right_15_0= ruleSharkExpression ) ) ( (lv_addElts_16_0= ruleAddExpressionElt ) )+ otherlv_17= RightCurlyBracket )
                    {
                    // InternalDdParser.g:2058:4: (otherlv_12= LeftCurlyBracket ( (lv_left_13_0= ruleSharkExpression ) ) ( ( (lv_op_14_1= PlusSign | lv_op_14_2= HyphenMinus ) ) ) ( (lv_right_15_0= ruleSharkExpression ) ) ( (lv_addElts_16_0= ruleAddExpressionElt ) )+ otherlv_17= RightCurlyBracket )
                    // InternalDdParser.g:2059:5: otherlv_12= LeftCurlyBracket ( (lv_left_13_0= ruleSharkExpression ) ) ( ( (lv_op_14_1= PlusSign | lv_op_14_2= HyphenMinus ) ) ) ( (lv_right_15_0= ruleSharkExpression ) ) ( (lv_addElts_16_0= ruleAddExpressionElt ) )+ otherlv_17= RightCurlyBracket
                    {
                    otherlv_12=(Token)match(input,LeftCurlyBracket,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_12, grammarAccess.getAddExpressionAccess().getLeftCurlyBracketKeyword_0_2_0());
                      				
                    }
                    // InternalDdParser.g:2063:5: ( (lv_left_13_0= ruleSharkExpression ) )
                    // InternalDdParser.g:2064:6: (lv_left_13_0= ruleSharkExpression )
                    {
                    // InternalDdParser.g:2064:6: (lv_left_13_0= ruleSharkExpression )
                    // InternalDdParser.g:2065:7: lv_left_13_0= ruleSharkExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getAddExpressionAccess().getLeftSharkExpressionParserRuleCall_0_2_1_0());
                      						
                    }
                    pushFollow(FOLLOW_45);
                    lv_left_13_0=ruleSharkExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getAddExpressionRule());
                      							}
                      							set(
                      								current,
                      								"left",
                      								lv_left_13_0,
                      								"com.shark.lang.Dd.SharkExpression");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalDdParser.g:2082:5: ( ( (lv_op_14_1= PlusSign | lv_op_14_2= HyphenMinus ) ) )
                    // InternalDdParser.g:2083:6: ( (lv_op_14_1= PlusSign | lv_op_14_2= HyphenMinus ) )
                    {
                    // InternalDdParser.g:2083:6: ( (lv_op_14_1= PlusSign | lv_op_14_2= HyphenMinus ) )
                    // InternalDdParser.g:2084:7: (lv_op_14_1= PlusSign | lv_op_14_2= HyphenMinus )
                    {
                    // InternalDdParser.g:2084:7: (lv_op_14_1= PlusSign | lv_op_14_2= HyphenMinus )
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==PlusSign) ) {
                        alt37=1;
                    }
                    else if ( (LA37_0==HyphenMinus) ) {
                        alt37=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 37, 0, input);

                        throw nvae;
                    }
                    switch (alt37) {
                        case 1 :
                            // InternalDdParser.g:2085:8: lv_op_14_1= PlusSign
                            {
                            lv_op_14_1=(Token)match(input,PlusSign,FOLLOW_13); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_op_14_1, grammarAccess.getAddExpressionAccess().getOpPlusSignKeyword_0_2_2_0_0());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getAddExpressionRule());
                              								}
                              								setWithLastConsumed(current, "op", lv_op_14_1, null);
                              							
                            }

                            }
                            break;
                        case 2 :
                            // InternalDdParser.g:2096:8: lv_op_14_2= HyphenMinus
                            {
                            lv_op_14_2=(Token)match(input,HyphenMinus,FOLLOW_13); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_op_14_2, grammarAccess.getAddExpressionAccess().getOpHyphenMinusKeyword_0_2_2_0_1());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getAddExpressionRule());
                              								}
                              								setWithLastConsumed(current, "op", lv_op_14_2, null);
                              							
                            }

                            }
                            break;

                    }


                    }


                    }

                    // InternalDdParser.g:2109:5: ( (lv_right_15_0= ruleSharkExpression ) )
                    // InternalDdParser.g:2110:6: (lv_right_15_0= ruleSharkExpression )
                    {
                    // InternalDdParser.g:2110:6: (lv_right_15_0= ruleSharkExpression )
                    // InternalDdParser.g:2111:7: lv_right_15_0= ruleSharkExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getAddExpressionAccess().getRightSharkExpressionParserRuleCall_0_2_3_0());
                      						
                    }
                    pushFollow(FOLLOW_46);
                    lv_right_15_0=ruleSharkExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getAddExpressionRule());
                      							}
                      							set(
                      								current,
                      								"right",
                      								lv_right_15_0,
                      								"com.shark.lang.Dd.SharkExpression");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalDdParser.g:2128:5: ( (lv_addElts_16_0= ruleAddExpressionElt ) )+
                    int cnt38=0;
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==PlusSign) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalDdParser.g:2129:6: (lv_addElts_16_0= ruleAddExpressionElt )
                    	    {
                    	    // InternalDdParser.g:2129:6: (lv_addElts_16_0= ruleAddExpressionElt )
                    	    // InternalDdParser.g:2130:7: lv_addElts_16_0= ruleAddExpressionElt
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getAddExpressionAccess().getAddEltsAddExpressionEltParserRuleCall_0_2_4_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_49);
                    	    lv_addElts_16_0=ruleAddExpressionElt();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getAddExpressionRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"addElts",
                    	      								lv_addElts_16_0,
                    	      								"com.shark.lang.Dd.AddExpressionElt");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt38 >= 1 ) break loop38;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(38, input);
                                throw eee;
                        }
                        cnt38++;
                    } while (true);

                    otherlv_17=(Token)match(input,RightCurlyBracket,FOLLOW_41); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_17, grammarAccess.getAddExpressionAccess().getRightCurlyBracketKeyword_0_2_5());
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDdParser.g:2153:3: ( ( (lv_exprValue_18_0= RULE_NUL ) ) ( (lv_precision_19_0= RULE_INT ) ) ( (lv_length_20_0= RULE_INT ) ) ( (lv_hasAttribute_21_0= RULE_INT ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_NUL) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalDdParser.g:2154:4: ( (lv_exprValue_18_0= RULE_NUL ) ) ( (lv_precision_19_0= RULE_INT ) ) ( (lv_length_20_0= RULE_INT ) ) ( (lv_hasAttribute_21_0= RULE_INT ) )
                    {
                    // InternalDdParser.g:2154:4: ( (lv_exprValue_18_0= RULE_NUL ) )
                    // InternalDdParser.g:2155:5: (lv_exprValue_18_0= RULE_NUL )
                    {
                    // InternalDdParser.g:2155:5: (lv_exprValue_18_0= RULE_NUL )
                    // InternalDdParser.g:2156:6: lv_exprValue_18_0= RULE_NUL
                    {
                    lv_exprValue_18_0=(Token)match(input,RULE_NUL,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_exprValue_18_0, grammarAccess.getAddExpressionAccess().getExprValueNULTerminalRuleCall_1_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAddExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"exprValue",
                      							lv_exprValue_18_0,
                      							"com.shark.lang.Dd.NUL");
                      					
                    }

                    }


                    }

                    // InternalDdParser.g:2172:4: ( (lv_precision_19_0= RULE_INT ) )
                    // InternalDdParser.g:2173:5: (lv_precision_19_0= RULE_INT )
                    {
                    // InternalDdParser.g:2173:5: (lv_precision_19_0= RULE_INT )
                    // InternalDdParser.g:2174:6: lv_precision_19_0= RULE_INT
                    {
                    lv_precision_19_0=(Token)match(input,RULE_INT,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_precision_19_0, grammarAccess.getAddExpressionAccess().getPrecisionINTTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAddExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"precision",
                      							lv_precision_19_0,
                      							"com.shark.lang.Dd.INT");
                      					
                    }

                    }


                    }

                    // InternalDdParser.g:2190:4: ( (lv_length_20_0= RULE_INT ) )
                    // InternalDdParser.g:2191:5: (lv_length_20_0= RULE_INT )
                    {
                    // InternalDdParser.g:2191:5: (lv_length_20_0= RULE_INT )
                    // InternalDdParser.g:2192:6: lv_length_20_0= RULE_INT
                    {
                    lv_length_20_0=(Token)match(input,RULE_INT,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_length_20_0, grammarAccess.getAddExpressionAccess().getLengthINTTerminalRuleCall_1_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAddExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"length",
                      							lv_length_20_0,
                      							"com.shark.lang.Dd.INT");
                      					
                    }

                    }


                    }

                    // InternalDdParser.g:2208:4: ( (lv_hasAttribute_21_0= RULE_INT ) )
                    // InternalDdParser.g:2209:5: (lv_hasAttribute_21_0= RULE_INT )
                    {
                    // InternalDdParser.g:2209:5: (lv_hasAttribute_21_0= RULE_INT )
                    // InternalDdParser.g:2210:6: lv_hasAttribute_21_0= RULE_INT
                    {
                    lv_hasAttribute_21_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_hasAttribute_21_0, grammarAccess.getAddExpressionAccess().getHasAttributeINTTerminalRuleCall_1_3_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAddExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"hasAttribute",
                      							lv_hasAttribute_21_0,
                      							"com.shark.lang.Dd.INT");
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddExpression"


    // $ANTLR start "entryRuleAddExpressionElt"
    // InternalDdParser.g:2231:1: entryRuleAddExpressionElt returns [EObject current=null] : iv_ruleAddExpressionElt= ruleAddExpressionElt EOF ;
    public final EObject entryRuleAddExpressionElt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddExpressionElt = null;


        try {
            // InternalDdParser.g:2231:57: (iv_ruleAddExpressionElt= ruleAddExpressionElt EOF )
            // InternalDdParser.g:2232:2: iv_ruleAddExpressionElt= ruleAddExpressionElt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAddExpressionEltRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAddExpressionElt=ruleAddExpressionElt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAddExpressionElt; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAddExpressionElt"


    // $ANTLR start "ruleAddExpressionElt"
    // InternalDdParser.g:2238:1: ruleAddExpressionElt returns [EObject current=null] : ( ( (lv_op_0_0= PlusSign ) ) ( (lv_right_1_0= ruleSharkExpression ) ) ) ;
    public final EObject ruleAddExpressionElt() throws RecognitionException {
        EObject current = null;

        Token lv_op_0_0=null;
        EObject lv_right_1_0 = null;



        	enterRule();

        try {
            // InternalDdParser.g:2244:2: ( ( ( (lv_op_0_0= PlusSign ) ) ( (lv_right_1_0= ruleSharkExpression ) ) ) )
            // InternalDdParser.g:2245:2: ( ( (lv_op_0_0= PlusSign ) ) ( (lv_right_1_0= ruleSharkExpression ) ) )
            {
            // InternalDdParser.g:2245:2: ( ( (lv_op_0_0= PlusSign ) ) ( (lv_right_1_0= ruleSharkExpression ) ) )
            // InternalDdParser.g:2246:3: ( (lv_op_0_0= PlusSign ) ) ( (lv_right_1_0= ruleSharkExpression ) )
            {
            // InternalDdParser.g:2246:3: ( (lv_op_0_0= PlusSign ) )
            // InternalDdParser.g:2247:4: (lv_op_0_0= PlusSign )
            {
            // InternalDdParser.g:2247:4: (lv_op_0_0= PlusSign )
            // InternalDdParser.g:2248:5: lv_op_0_0= PlusSign
            {
            lv_op_0_0=(Token)match(input,PlusSign,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_op_0_0, grammarAccess.getAddExpressionEltAccess().getOpPlusSignKeyword_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getAddExpressionEltRule());
              					}
              					setWithLastConsumed(current, "op", lv_op_0_0, "+");
              				
            }

            }


            }

            // InternalDdParser.g:2260:3: ( (lv_right_1_0= ruleSharkExpression ) )
            // InternalDdParser.g:2261:4: (lv_right_1_0= ruleSharkExpression )
            {
            // InternalDdParser.g:2261:4: (lv_right_1_0= ruleSharkExpression )
            // InternalDdParser.g:2262:5: lv_right_1_0= ruleSharkExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAddExpressionEltAccess().getRightSharkExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_right_1_0=ruleSharkExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAddExpressionEltRule());
              					}
              					set(
              						current,
              						"right",
              						lv_right_1_0,
              						"com.shark.lang.Dd.SharkExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddExpressionElt"


    // $ANTLR start "entryRuleMultExpression"
    // InternalDdParser.g:2283:1: entryRuleMultExpression returns [EObject current=null] : iv_ruleMultExpression= ruleMultExpression EOF ;
    public final EObject entryRuleMultExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultExpression = null;


        try {
            // InternalDdParser.g:2283:55: (iv_ruleMultExpression= ruleMultExpression EOF )
            // InternalDdParser.g:2284:2: iv_ruleMultExpression= ruleMultExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMultExpression=ruleMultExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultExpression"


    // $ANTLR start "ruleMultExpression"
    // InternalDdParser.g:2290:1: ruleMultExpression returns [EObject current=null] : ( ( (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= Asterisk ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_multElts_4_0= ruleMultExpressionElt ) )+ otherlv_5= RightParenthesis ) | (otherlv_6= LeftSquareBracket ( (lv_left_7_0= ruleSharkExpression ) ) ( (lv_op_8_0= Asterisk ) ) ( (lv_right_9_0= ruleSharkExpression ) ) ( (lv_multElts_10_0= ruleMultExpressionElt ) )+ otherlv_11= RightSquareBracket ) | (otherlv_12= LeftCurlyBracket ( (lv_left_13_0= ruleSharkExpression ) ) ( (lv_op_14_0= Asterisk ) ) ( (lv_right_15_0= ruleSharkExpression ) ) ( (lv_multElts_16_0= ruleMultExpressionElt ) )+ otherlv_17= RightCurlyBracket ) ) ( ( (lv_exprValue_18_0= RULE_NUL ) ) ( (lv_precision_19_0= RULE_INT ) ) ( (lv_length_20_0= RULE_INT ) ) ( (lv_hasAttribute_21_0= RULE_INT ) ) )? ) ;
    public final EObject ruleMultExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_op_2_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_op_8_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_op_14_0=null;
        Token otherlv_17=null;
        Token lv_exprValue_18_0=null;
        Token lv_precision_19_0=null;
        Token lv_length_20_0=null;
        Token lv_hasAttribute_21_0=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_multElts_4_0 = null;

        EObject lv_left_7_0 = null;

        EObject lv_right_9_0 = null;

        EObject lv_multElts_10_0 = null;

        EObject lv_left_13_0 = null;

        EObject lv_right_15_0 = null;

        EObject lv_multElts_16_0 = null;



        	enterRule();

        try {
            // InternalDdParser.g:2296:2: ( ( ( (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= Asterisk ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_multElts_4_0= ruleMultExpressionElt ) )+ otherlv_5= RightParenthesis ) | (otherlv_6= LeftSquareBracket ( (lv_left_7_0= ruleSharkExpression ) ) ( (lv_op_8_0= Asterisk ) ) ( (lv_right_9_0= ruleSharkExpression ) ) ( (lv_multElts_10_0= ruleMultExpressionElt ) )+ otherlv_11= RightSquareBracket ) | (otherlv_12= LeftCurlyBracket ( (lv_left_13_0= ruleSharkExpression ) ) ( (lv_op_14_0= Asterisk ) ) ( (lv_right_15_0= ruleSharkExpression ) ) ( (lv_multElts_16_0= ruleMultExpressionElt ) )+ otherlv_17= RightCurlyBracket ) ) ( ( (lv_exprValue_18_0= RULE_NUL ) ) ( (lv_precision_19_0= RULE_INT ) ) ( (lv_length_20_0= RULE_INT ) ) ( (lv_hasAttribute_21_0= RULE_INT ) ) )? ) )
            // InternalDdParser.g:2297:2: ( ( (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= Asterisk ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_multElts_4_0= ruleMultExpressionElt ) )+ otherlv_5= RightParenthesis ) | (otherlv_6= LeftSquareBracket ( (lv_left_7_0= ruleSharkExpression ) ) ( (lv_op_8_0= Asterisk ) ) ( (lv_right_9_0= ruleSharkExpression ) ) ( (lv_multElts_10_0= ruleMultExpressionElt ) )+ otherlv_11= RightSquareBracket ) | (otherlv_12= LeftCurlyBracket ( (lv_left_13_0= ruleSharkExpression ) ) ( (lv_op_14_0= Asterisk ) ) ( (lv_right_15_0= ruleSharkExpression ) ) ( (lv_multElts_16_0= ruleMultExpressionElt ) )+ otherlv_17= RightCurlyBracket ) ) ( ( (lv_exprValue_18_0= RULE_NUL ) ) ( (lv_precision_19_0= RULE_INT ) ) ( (lv_length_20_0= RULE_INT ) ) ( (lv_hasAttribute_21_0= RULE_INT ) ) )? )
            {
            // InternalDdParser.g:2297:2: ( ( (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= Asterisk ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_multElts_4_0= ruleMultExpressionElt ) )+ otherlv_5= RightParenthesis ) | (otherlv_6= LeftSquareBracket ( (lv_left_7_0= ruleSharkExpression ) ) ( (lv_op_8_0= Asterisk ) ) ( (lv_right_9_0= ruleSharkExpression ) ) ( (lv_multElts_10_0= ruleMultExpressionElt ) )+ otherlv_11= RightSquareBracket ) | (otherlv_12= LeftCurlyBracket ( (lv_left_13_0= ruleSharkExpression ) ) ( (lv_op_14_0= Asterisk ) ) ( (lv_right_15_0= ruleSharkExpression ) ) ( (lv_multElts_16_0= ruleMultExpressionElt ) )+ otherlv_17= RightCurlyBracket ) ) ( ( (lv_exprValue_18_0= RULE_NUL ) ) ( (lv_precision_19_0= RULE_INT ) ) ( (lv_length_20_0= RULE_INT ) ) ( (lv_hasAttribute_21_0= RULE_INT ) ) )? )
            // InternalDdParser.g:2298:3: ( (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= Asterisk ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_multElts_4_0= ruleMultExpressionElt ) )+ otherlv_5= RightParenthesis ) | (otherlv_6= LeftSquareBracket ( (lv_left_7_0= ruleSharkExpression ) ) ( (lv_op_8_0= Asterisk ) ) ( (lv_right_9_0= ruleSharkExpression ) ) ( (lv_multElts_10_0= ruleMultExpressionElt ) )+ otherlv_11= RightSquareBracket ) | (otherlv_12= LeftCurlyBracket ( (lv_left_13_0= ruleSharkExpression ) ) ( (lv_op_14_0= Asterisk ) ) ( (lv_right_15_0= ruleSharkExpression ) ) ( (lv_multElts_16_0= ruleMultExpressionElt ) )+ otherlv_17= RightCurlyBracket ) ) ( ( (lv_exprValue_18_0= RULE_NUL ) ) ( (lv_precision_19_0= RULE_INT ) ) ( (lv_length_20_0= RULE_INT ) ) ( (lv_hasAttribute_21_0= RULE_INT ) ) )?
            {
            // InternalDdParser.g:2298:3: ( (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= Asterisk ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_multElts_4_0= ruleMultExpressionElt ) )+ otherlv_5= RightParenthesis ) | (otherlv_6= LeftSquareBracket ( (lv_left_7_0= ruleSharkExpression ) ) ( (lv_op_8_0= Asterisk ) ) ( (lv_right_9_0= ruleSharkExpression ) ) ( (lv_multElts_10_0= ruleMultExpressionElt ) )+ otherlv_11= RightSquareBracket ) | (otherlv_12= LeftCurlyBracket ( (lv_left_13_0= ruleSharkExpression ) ) ( (lv_op_14_0= Asterisk ) ) ( (lv_right_15_0= ruleSharkExpression ) ) ( (lv_multElts_16_0= ruleMultExpressionElt ) )+ otherlv_17= RightCurlyBracket ) )
            int alt44=3;
            switch ( input.LA(1) ) {
            case LeftParenthesis:
                {
                alt44=1;
                }
                break;
            case LeftSquareBracket:
                {
                alt44=2;
                }
                break;
            case LeftCurlyBracket:
                {
                alt44=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // InternalDdParser.g:2299:4: (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= Asterisk ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_multElts_4_0= ruleMultExpressionElt ) )+ otherlv_5= RightParenthesis )
                    {
                    // InternalDdParser.g:2299:4: (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= Asterisk ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_multElts_4_0= ruleMultExpressionElt ) )+ otherlv_5= RightParenthesis )
                    // InternalDdParser.g:2300:5: otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= Asterisk ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_multElts_4_0= ruleMultExpressionElt ) )+ otherlv_5= RightParenthesis
                    {
                    otherlv_0=(Token)match(input,LeftParenthesis,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_0, grammarAccess.getMultExpressionAccess().getLeftParenthesisKeyword_0_0_0());
                      				
                    }
                    // InternalDdParser.g:2304:5: ( (lv_left_1_0= ruleSharkExpression ) )
                    // InternalDdParser.g:2305:6: (lv_left_1_0= ruleSharkExpression )
                    {
                    // InternalDdParser.g:2305:6: (lv_left_1_0= ruleSharkExpression )
                    // InternalDdParser.g:2306:7: lv_left_1_0= ruleSharkExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getMultExpressionAccess().getLeftSharkExpressionParserRuleCall_0_0_1_0());
                      						
                    }
                    pushFollow(FOLLOW_50);
                    lv_left_1_0=ruleSharkExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getMultExpressionRule());
                      							}
                      							set(
                      								current,
                      								"left",
                      								lv_left_1_0,
                      								"com.shark.lang.Dd.SharkExpression");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalDdParser.g:2323:5: ( (lv_op_2_0= Asterisk ) )
                    // InternalDdParser.g:2324:6: (lv_op_2_0= Asterisk )
                    {
                    // InternalDdParser.g:2324:6: (lv_op_2_0= Asterisk )
                    // InternalDdParser.g:2325:7: lv_op_2_0= Asterisk
                    {
                    lv_op_2_0=(Token)match(input,Asterisk,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_op_2_0, grammarAccess.getMultExpressionAccess().getOpAsteriskKeyword_0_0_2_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getMultExpressionRule());
                      							}
                      							setWithLastConsumed(current, "op", lv_op_2_0, "*");
                      						
                    }

                    }


                    }

                    // InternalDdParser.g:2337:5: ( (lv_right_3_0= ruleSharkExpression ) )
                    // InternalDdParser.g:2338:6: (lv_right_3_0= ruleSharkExpression )
                    {
                    // InternalDdParser.g:2338:6: (lv_right_3_0= ruleSharkExpression )
                    // InternalDdParser.g:2339:7: lv_right_3_0= ruleSharkExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getMultExpressionAccess().getRightSharkExpressionParserRuleCall_0_0_3_0());
                      						
                    }
                    pushFollow(FOLLOW_50);
                    lv_right_3_0=ruleSharkExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getMultExpressionRule());
                      							}
                      							set(
                      								current,
                      								"right",
                      								lv_right_3_0,
                      								"com.shark.lang.Dd.SharkExpression");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalDdParser.g:2356:5: ( (lv_multElts_4_0= ruleMultExpressionElt ) )+
                    int cnt41=0;
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==Asterisk) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // InternalDdParser.g:2357:6: (lv_multElts_4_0= ruleMultExpressionElt )
                    	    {
                    	    // InternalDdParser.g:2357:6: (lv_multElts_4_0= ruleMultExpressionElt )
                    	    // InternalDdParser.g:2358:7: lv_multElts_4_0= ruleMultExpressionElt
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getMultExpressionAccess().getMultEltsMultExpressionEltParserRuleCall_0_0_4_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_51);
                    	    lv_multElts_4_0=ruleMultExpressionElt();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getMultExpressionRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"multElts",
                    	      								lv_multElts_4_0,
                    	      								"com.shark.lang.Dd.MultExpressionElt");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt41 >= 1 ) break loop41;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(41, input);
                                throw eee;
                        }
                        cnt41++;
                    } while (true);

                    otherlv_5=(Token)match(input,RightParenthesis,FOLLOW_41); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getMultExpressionAccess().getRightParenthesisKeyword_0_0_5());
                      				
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDdParser.g:2381:4: (otherlv_6= LeftSquareBracket ( (lv_left_7_0= ruleSharkExpression ) ) ( (lv_op_8_0= Asterisk ) ) ( (lv_right_9_0= ruleSharkExpression ) ) ( (lv_multElts_10_0= ruleMultExpressionElt ) )+ otherlv_11= RightSquareBracket )
                    {
                    // InternalDdParser.g:2381:4: (otherlv_6= LeftSquareBracket ( (lv_left_7_0= ruleSharkExpression ) ) ( (lv_op_8_0= Asterisk ) ) ( (lv_right_9_0= ruleSharkExpression ) ) ( (lv_multElts_10_0= ruleMultExpressionElt ) )+ otherlv_11= RightSquareBracket )
                    // InternalDdParser.g:2382:5: otherlv_6= LeftSquareBracket ( (lv_left_7_0= ruleSharkExpression ) ) ( (lv_op_8_0= Asterisk ) ) ( (lv_right_9_0= ruleSharkExpression ) ) ( (lv_multElts_10_0= ruleMultExpressionElt ) )+ otherlv_11= RightSquareBracket
                    {
                    otherlv_6=(Token)match(input,LeftSquareBracket,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getMultExpressionAccess().getLeftSquareBracketKeyword_0_1_0());
                      				
                    }
                    // InternalDdParser.g:2386:5: ( (lv_left_7_0= ruleSharkExpression ) )
                    // InternalDdParser.g:2387:6: (lv_left_7_0= ruleSharkExpression )
                    {
                    // InternalDdParser.g:2387:6: (lv_left_7_0= ruleSharkExpression )
                    // InternalDdParser.g:2388:7: lv_left_7_0= ruleSharkExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getMultExpressionAccess().getLeftSharkExpressionParserRuleCall_0_1_1_0());
                      						
                    }
                    pushFollow(FOLLOW_50);
                    lv_left_7_0=ruleSharkExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getMultExpressionRule());
                      							}
                      							set(
                      								current,
                      								"left",
                      								lv_left_7_0,
                      								"com.shark.lang.Dd.SharkExpression");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalDdParser.g:2405:5: ( (lv_op_8_0= Asterisk ) )
                    // InternalDdParser.g:2406:6: (lv_op_8_0= Asterisk )
                    {
                    // InternalDdParser.g:2406:6: (lv_op_8_0= Asterisk )
                    // InternalDdParser.g:2407:7: lv_op_8_0= Asterisk
                    {
                    lv_op_8_0=(Token)match(input,Asterisk,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_op_8_0, grammarAccess.getMultExpressionAccess().getOpAsteriskKeyword_0_1_2_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getMultExpressionRule());
                      							}
                      							setWithLastConsumed(current, "op", lv_op_8_0, "*");
                      						
                    }

                    }


                    }

                    // InternalDdParser.g:2419:5: ( (lv_right_9_0= ruleSharkExpression ) )
                    // InternalDdParser.g:2420:6: (lv_right_9_0= ruleSharkExpression )
                    {
                    // InternalDdParser.g:2420:6: (lv_right_9_0= ruleSharkExpression )
                    // InternalDdParser.g:2421:7: lv_right_9_0= ruleSharkExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getMultExpressionAccess().getRightSharkExpressionParserRuleCall_0_1_3_0());
                      						
                    }
                    pushFollow(FOLLOW_50);
                    lv_right_9_0=ruleSharkExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getMultExpressionRule());
                      							}
                      							set(
                      								current,
                      								"right",
                      								lv_right_9_0,
                      								"com.shark.lang.Dd.SharkExpression");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalDdParser.g:2438:5: ( (lv_multElts_10_0= ruleMultExpressionElt ) )+
                    int cnt42=0;
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==Asterisk) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // InternalDdParser.g:2439:6: (lv_multElts_10_0= ruleMultExpressionElt )
                    	    {
                    	    // InternalDdParser.g:2439:6: (lv_multElts_10_0= ruleMultExpressionElt )
                    	    // InternalDdParser.g:2440:7: lv_multElts_10_0= ruleMultExpressionElt
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getMultExpressionAccess().getMultEltsMultExpressionEltParserRuleCall_0_1_4_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_52);
                    	    lv_multElts_10_0=ruleMultExpressionElt();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getMultExpressionRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"multElts",
                    	      								lv_multElts_10_0,
                    	      								"com.shark.lang.Dd.MultExpressionElt");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt42 >= 1 ) break loop42;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(42, input);
                                throw eee;
                        }
                        cnt42++;
                    } while (true);

                    otherlv_11=(Token)match(input,RightSquareBracket,FOLLOW_41); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_11, grammarAccess.getMultExpressionAccess().getRightSquareBracketKeyword_0_1_5());
                      				
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDdParser.g:2463:4: (otherlv_12= LeftCurlyBracket ( (lv_left_13_0= ruleSharkExpression ) ) ( (lv_op_14_0= Asterisk ) ) ( (lv_right_15_0= ruleSharkExpression ) ) ( (lv_multElts_16_0= ruleMultExpressionElt ) )+ otherlv_17= RightCurlyBracket )
                    {
                    // InternalDdParser.g:2463:4: (otherlv_12= LeftCurlyBracket ( (lv_left_13_0= ruleSharkExpression ) ) ( (lv_op_14_0= Asterisk ) ) ( (lv_right_15_0= ruleSharkExpression ) ) ( (lv_multElts_16_0= ruleMultExpressionElt ) )+ otherlv_17= RightCurlyBracket )
                    // InternalDdParser.g:2464:5: otherlv_12= LeftCurlyBracket ( (lv_left_13_0= ruleSharkExpression ) ) ( (lv_op_14_0= Asterisk ) ) ( (lv_right_15_0= ruleSharkExpression ) ) ( (lv_multElts_16_0= ruleMultExpressionElt ) )+ otherlv_17= RightCurlyBracket
                    {
                    otherlv_12=(Token)match(input,LeftCurlyBracket,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_12, grammarAccess.getMultExpressionAccess().getLeftCurlyBracketKeyword_0_2_0());
                      				
                    }
                    // InternalDdParser.g:2468:5: ( (lv_left_13_0= ruleSharkExpression ) )
                    // InternalDdParser.g:2469:6: (lv_left_13_0= ruleSharkExpression )
                    {
                    // InternalDdParser.g:2469:6: (lv_left_13_0= ruleSharkExpression )
                    // InternalDdParser.g:2470:7: lv_left_13_0= ruleSharkExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getMultExpressionAccess().getLeftSharkExpressionParserRuleCall_0_2_1_0());
                      						
                    }
                    pushFollow(FOLLOW_50);
                    lv_left_13_0=ruleSharkExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getMultExpressionRule());
                      							}
                      							set(
                      								current,
                      								"left",
                      								lv_left_13_0,
                      								"com.shark.lang.Dd.SharkExpression");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalDdParser.g:2487:5: ( (lv_op_14_0= Asterisk ) )
                    // InternalDdParser.g:2488:6: (lv_op_14_0= Asterisk )
                    {
                    // InternalDdParser.g:2488:6: (lv_op_14_0= Asterisk )
                    // InternalDdParser.g:2489:7: lv_op_14_0= Asterisk
                    {
                    lv_op_14_0=(Token)match(input,Asterisk,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_op_14_0, grammarAccess.getMultExpressionAccess().getOpAsteriskKeyword_0_2_2_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getMultExpressionRule());
                      							}
                      							setWithLastConsumed(current, "op", lv_op_14_0, "*");
                      						
                    }

                    }


                    }

                    // InternalDdParser.g:2501:5: ( (lv_right_15_0= ruleSharkExpression ) )
                    // InternalDdParser.g:2502:6: (lv_right_15_0= ruleSharkExpression )
                    {
                    // InternalDdParser.g:2502:6: (lv_right_15_0= ruleSharkExpression )
                    // InternalDdParser.g:2503:7: lv_right_15_0= ruleSharkExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getMultExpressionAccess().getRightSharkExpressionParserRuleCall_0_2_3_0());
                      						
                    }
                    pushFollow(FOLLOW_50);
                    lv_right_15_0=ruleSharkExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getMultExpressionRule());
                      							}
                      							set(
                      								current,
                      								"right",
                      								lv_right_15_0,
                      								"com.shark.lang.Dd.SharkExpression");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalDdParser.g:2520:5: ( (lv_multElts_16_0= ruleMultExpressionElt ) )+
                    int cnt43=0;
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==Asterisk) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // InternalDdParser.g:2521:6: (lv_multElts_16_0= ruleMultExpressionElt )
                    	    {
                    	    // InternalDdParser.g:2521:6: (lv_multElts_16_0= ruleMultExpressionElt )
                    	    // InternalDdParser.g:2522:7: lv_multElts_16_0= ruleMultExpressionElt
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getMultExpressionAccess().getMultEltsMultExpressionEltParserRuleCall_0_2_4_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_53);
                    	    lv_multElts_16_0=ruleMultExpressionElt();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getMultExpressionRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"multElts",
                    	      								lv_multElts_16_0,
                    	      								"com.shark.lang.Dd.MultExpressionElt");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt43 >= 1 ) break loop43;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(43, input);
                                throw eee;
                        }
                        cnt43++;
                    } while (true);

                    otherlv_17=(Token)match(input,RightCurlyBracket,FOLLOW_41); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_17, grammarAccess.getMultExpressionAccess().getRightCurlyBracketKeyword_0_2_5());
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDdParser.g:2545:3: ( ( (lv_exprValue_18_0= RULE_NUL ) ) ( (lv_precision_19_0= RULE_INT ) ) ( (lv_length_20_0= RULE_INT ) ) ( (lv_hasAttribute_21_0= RULE_INT ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_NUL) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalDdParser.g:2546:4: ( (lv_exprValue_18_0= RULE_NUL ) ) ( (lv_precision_19_0= RULE_INT ) ) ( (lv_length_20_0= RULE_INT ) ) ( (lv_hasAttribute_21_0= RULE_INT ) )
                    {
                    // InternalDdParser.g:2546:4: ( (lv_exprValue_18_0= RULE_NUL ) )
                    // InternalDdParser.g:2547:5: (lv_exprValue_18_0= RULE_NUL )
                    {
                    // InternalDdParser.g:2547:5: (lv_exprValue_18_0= RULE_NUL )
                    // InternalDdParser.g:2548:6: lv_exprValue_18_0= RULE_NUL
                    {
                    lv_exprValue_18_0=(Token)match(input,RULE_NUL,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_exprValue_18_0, grammarAccess.getMultExpressionAccess().getExprValueNULTerminalRuleCall_1_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getMultExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"exprValue",
                      							lv_exprValue_18_0,
                      							"com.shark.lang.Dd.NUL");
                      					
                    }

                    }


                    }

                    // InternalDdParser.g:2564:4: ( (lv_precision_19_0= RULE_INT ) )
                    // InternalDdParser.g:2565:5: (lv_precision_19_0= RULE_INT )
                    {
                    // InternalDdParser.g:2565:5: (lv_precision_19_0= RULE_INT )
                    // InternalDdParser.g:2566:6: lv_precision_19_0= RULE_INT
                    {
                    lv_precision_19_0=(Token)match(input,RULE_INT,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_precision_19_0, grammarAccess.getMultExpressionAccess().getPrecisionINTTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getMultExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"precision",
                      							lv_precision_19_0,
                      							"com.shark.lang.Dd.INT");
                      					
                    }

                    }


                    }

                    // InternalDdParser.g:2582:4: ( (lv_length_20_0= RULE_INT ) )
                    // InternalDdParser.g:2583:5: (lv_length_20_0= RULE_INT )
                    {
                    // InternalDdParser.g:2583:5: (lv_length_20_0= RULE_INT )
                    // InternalDdParser.g:2584:6: lv_length_20_0= RULE_INT
                    {
                    lv_length_20_0=(Token)match(input,RULE_INT,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_length_20_0, grammarAccess.getMultExpressionAccess().getLengthINTTerminalRuleCall_1_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getMultExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"length",
                      							lv_length_20_0,
                      							"com.shark.lang.Dd.INT");
                      					
                    }

                    }


                    }

                    // InternalDdParser.g:2600:4: ( (lv_hasAttribute_21_0= RULE_INT ) )
                    // InternalDdParser.g:2601:5: (lv_hasAttribute_21_0= RULE_INT )
                    {
                    // InternalDdParser.g:2601:5: (lv_hasAttribute_21_0= RULE_INT )
                    // InternalDdParser.g:2602:6: lv_hasAttribute_21_0= RULE_INT
                    {
                    lv_hasAttribute_21_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_hasAttribute_21_0, grammarAccess.getMultExpressionAccess().getHasAttributeINTTerminalRuleCall_1_3_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getMultExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"hasAttribute",
                      							lv_hasAttribute_21_0,
                      							"com.shark.lang.Dd.INT");
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultExpression"


    // $ANTLR start "entryRuleMultExpressionElt"
    // InternalDdParser.g:2623:1: entryRuleMultExpressionElt returns [EObject current=null] : iv_ruleMultExpressionElt= ruleMultExpressionElt EOF ;
    public final EObject entryRuleMultExpressionElt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultExpressionElt = null;


        try {
            // InternalDdParser.g:2623:58: (iv_ruleMultExpressionElt= ruleMultExpressionElt EOF )
            // InternalDdParser.g:2624:2: iv_ruleMultExpressionElt= ruleMultExpressionElt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultExpressionEltRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMultExpressionElt=ruleMultExpressionElt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultExpressionElt; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultExpressionElt"


    // $ANTLR start "ruleMultExpressionElt"
    // InternalDdParser.g:2630:1: ruleMultExpressionElt returns [EObject current=null] : ( ( (lv_op_0_0= Asterisk ) ) ( (lv_right_1_0= ruleSharkExpression ) ) ) ;
    public final EObject ruleMultExpressionElt() throws RecognitionException {
        EObject current = null;

        Token lv_op_0_0=null;
        EObject lv_right_1_0 = null;



        	enterRule();

        try {
            // InternalDdParser.g:2636:2: ( ( ( (lv_op_0_0= Asterisk ) ) ( (lv_right_1_0= ruleSharkExpression ) ) ) )
            // InternalDdParser.g:2637:2: ( ( (lv_op_0_0= Asterisk ) ) ( (lv_right_1_0= ruleSharkExpression ) ) )
            {
            // InternalDdParser.g:2637:2: ( ( (lv_op_0_0= Asterisk ) ) ( (lv_right_1_0= ruleSharkExpression ) ) )
            // InternalDdParser.g:2638:3: ( (lv_op_0_0= Asterisk ) ) ( (lv_right_1_0= ruleSharkExpression ) )
            {
            // InternalDdParser.g:2638:3: ( (lv_op_0_0= Asterisk ) )
            // InternalDdParser.g:2639:4: (lv_op_0_0= Asterisk )
            {
            // InternalDdParser.g:2639:4: (lv_op_0_0= Asterisk )
            // InternalDdParser.g:2640:5: lv_op_0_0= Asterisk
            {
            lv_op_0_0=(Token)match(input,Asterisk,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_op_0_0, grammarAccess.getMultExpressionEltAccess().getOpAsteriskKeyword_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMultExpressionEltRule());
              					}
              					setWithLastConsumed(current, "op", lv_op_0_0, "*");
              				
            }

            }


            }

            // InternalDdParser.g:2652:3: ( (lv_right_1_0= ruleSharkExpression ) )
            // InternalDdParser.g:2653:4: (lv_right_1_0= ruleSharkExpression )
            {
            // InternalDdParser.g:2653:4: (lv_right_1_0= ruleSharkExpression )
            // InternalDdParser.g:2654:5: lv_right_1_0= ruleSharkExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMultExpressionEltAccess().getRightSharkExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_right_1_0=ruleSharkExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMultExpressionEltRule());
              					}
              					set(
              						current,
              						"right",
              						lv_right_1_0,
              						"com.shark.lang.Dd.SharkExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultExpressionElt"


    // $ANTLR start "entryRuleAndExpression"
    // InternalDdParser.g:2675:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // InternalDdParser.g:2675:54: (iv_ruleAndExpression= ruleAndExpression EOF )
            // InternalDdParser.g:2676:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAndExpression=ruleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAndExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // InternalDdParser.g:2682:1: ruleAndExpression returns [EObject current=null] : ( ( (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= And ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_andElts_4_0= ruleAndExpressionElt ) )+ otherlv_5= RightParenthesis ) | (otherlv_6= LeftSquareBracket ( (lv_left_7_0= ruleSharkExpression ) ) ( (lv_op_8_0= And ) ) ( (lv_right_9_0= ruleSharkExpression ) ) ( (lv_andElts_10_0= ruleAndExpressionElt ) )+ otherlv_11= RightSquareBracket ) | (otherlv_12= LeftCurlyBracket ( (lv_left_13_0= ruleSharkExpression ) ) ( (lv_op_14_0= And ) ) ( (lv_right_15_0= ruleSharkExpression ) ) ( (lv_andElts_16_0= ruleAndExpressionElt ) )+ otherlv_17= RightCurlyBracket ) ) ( ( (lv_exprValue_18_0= RULE_NUL ) ) ( (lv_hasAttribute_19_0= RULE_INT ) ) )? ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_op_2_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_op_8_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_op_14_0=null;
        Token otherlv_17=null;
        Token lv_exprValue_18_0=null;
        Token lv_hasAttribute_19_0=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_andElts_4_0 = null;

        EObject lv_left_7_0 = null;

        EObject lv_right_9_0 = null;

        EObject lv_andElts_10_0 = null;

        EObject lv_left_13_0 = null;

        EObject lv_right_15_0 = null;

        EObject lv_andElts_16_0 = null;



        	enterRule();

        try {
            // InternalDdParser.g:2688:2: ( ( ( (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= And ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_andElts_4_0= ruleAndExpressionElt ) )+ otherlv_5= RightParenthesis ) | (otherlv_6= LeftSquareBracket ( (lv_left_7_0= ruleSharkExpression ) ) ( (lv_op_8_0= And ) ) ( (lv_right_9_0= ruleSharkExpression ) ) ( (lv_andElts_10_0= ruleAndExpressionElt ) )+ otherlv_11= RightSquareBracket ) | (otherlv_12= LeftCurlyBracket ( (lv_left_13_0= ruleSharkExpression ) ) ( (lv_op_14_0= And ) ) ( (lv_right_15_0= ruleSharkExpression ) ) ( (lv_andElts_16_0= ruleAndExpressionElt ) )+ otherlv_17= RightCurlyBracket ) ) ( ( (lv_exprValue_18_0= RULE_NUL ) ) ( (lv_hasAttribute_19_0= RULE_INT ) ) )? ) )
            // InternalDdParser.g:2689:2: ( ( (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= And ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_andElts_4_0= ruleAndExpressionElt ) )+ otherlv_5= RightParenthesis ) | (otherlv_6= LeftSquareBracket ( (lv_left_7_0= ruleSharkExpression ) ) ( (lv_op_8_0= And ) ) ( (lv_right_9_0= ruleSharkExpression ) ) ( (lv_andElts_10_0= ruleAndExpressionElt ) )+ otherlv_11= RightSquareBracket ) | (otherlv_12= LeftCurlyBracket ( (lv_left_13_0= ruleSharkExpression ) ) ( (lv_op_14_0= And ) ) ( (lv_right_15_0= ruleSharkExpression ) ) ( (lv_andElts_16_0= ruleAndExpressionElt ) )+ otherlv_17= RightCurlyBracket ) ) ( ( (lv_exprValue_18_0= RULE_NUL ) ) ( (lv_hasAttribute_19_0= RULE_INT ) ) )? )
            {
            // InternalDdParser.g:2689:2: ( ( (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= And ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_andElts_4_0= ruleAndExpressionElt ) )+ otherlv_5= RightParenthesis ) | (otherlv_6= LeftSquareBracket ( (lv_left_7_0= ruleSharkExpression ) ) ( (lv_op_8_0= And ) ) ( (lv_right_9_0= ruleSharkExpression ) ) ( (lv_andElts_10_0= ruleAndExpressionElt ) )+ otherlv_11= RightSquareBracket ) | (otherlv_12= LeftCurlyBracket ( (lv_left_13_0= ruleSharkExpression ) ) ( (lv_op_14_0= And ) ) ( (lv_right_15_0= ruleSharkExpression ) ) ( (lv_andElts_16_0= ruleAndExpressionElt ) )+ otherlv_17= RightCurlyBracket ) ) ( ( (lv_exprValue_18_0= RULE_NUL ) ) ( (lv_hasAttribute_19_0= RULE_INT ) ) )? )
            // InternalDdParser.g:2690:3: ( (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= And ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_andElts_4_0= ruleAndExpressionElt ) )+ otherlv_5= RightParenthesis ) | (otherlv_6= LeftSquareBracket ( (lv_left_7_0= ruleSharkExpression ) ) ( (lv_op_8_0= And ) ) ( (lv_right_9_0= ruleSharkExpression ) ) ( (lv_andElts_10_0= ruleAndExpressionElt ) )+ otherlv_11= RightSquareBracket ) | (otherlv_12= LeftCurlyBracket ( (lv_left_13_0= ruleSharkExpression ) ) ( (lv_op_14_0= And ) ) ( (lv_right_15_0= ruleSharkExpression ) ) ( (lv_andElts_16_0= ruleAndExpressionElt ) )+ otherlv_17= RightCurlyBracket ) ) ( ( (lv_exprValue_18_0= RULE_NUL ) ) ( (lv_hasAttribute_19_0= RULE_INT ) ) )?
            {
            // InternalDdParser.g:2690:3: ( (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= And ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_andElts_4_0= ruleAndExpressionElt ) )+ otherlv_5= RightParenthesis ) | (otherlv_6= LeftSquareBracket ( (lv_left_7_0= ruleSharkExpression ) ) ( (lv_op_8_0= And ) ) ( (lv_right_9_0= ruleSharkExpression ) ) ( (lv_andElts_10_0= ruleAndExpressionElt ) )+ otherlv_11= RightSquareBracket ) | (otherlv_12= LeftCurlyBracket ( (lv_left_13_0= ruleSharkExpression ) ) ( (lv_op_14_0= And ) ) ( (lv_right_15_0= ruleSharkExpression ) ) ( (lv_andElts_16_0= ruleAndExpressionElt ) )+ otherlv_17= RightCurlyBracket ) )
            int alt49=3;
            switch ( input.LA(1) ) {
            case LeftParenthesis:
                {
                alt49=1;
                }
                break;
            case LeftSquareBracket:
                {
                alt49=2;
                }
                break;
            case LeftCurlyBracket:
                {
                alt49=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // InternalDdParser.g:2691:4: (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= And ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_andElts_4_0= ruleAndExpressionElt ) )+ otherlv_5= RightParenthesis )
                    {
                    // InternalDdParser.g:2691:4: (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= And ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_andElts_4_0= ruleAndExpressionElt ) )+ otherlv_5= RightParenthesis )
                    // InternalDdParser.g:2692:5: otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= And ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_andElts_4_0= ruleAndExpressionElt ) )+ otherlv_5= RightParenthesis
                    {
                    otherlv_0=(Token)match(input,LeftParenthesis,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_0, grammarAccess.getAndExpressionAccess().getLeftParenthesisKeyword_0_0_0());
                      				
                    }
                    // InternalDdParser.g:2696:5: ( (lv_left_1_0= ruleSharkExpression ) )
                    // InternalDdParser.g:2697:6: (lv_left_1_0= ruleSharkExpression )
                    {
                    // InternalDdParser.g:2697:6: (lv_left_1_0= ruleSharkExpression )
                    // InternalDdParser.g:2698:7: lv_left_1_0= ruleSharkExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getAndExpressionAccess().getLeftSharkExpressionParserRuleCall_0_0_1_0());
                      						
                    }
                    pushFollow(FOLLOW_54);
                    lv_left_1_0=ruleSharkExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getAndExpressionRule());
                      							}
                      							set(
                      								current,
                      								"left",
                      								lv_left_1_0,
                      								"com.shark.lang.Dd.SharkExpression");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalDdParser.g:2715:5: ( (lv_op_2_0= And ) )
                    // InternalDdParser.g:2716:6: (lv_op_2_0= And )
                    {
                    // InternalDdParser.g:2716:6: (lv_op_2_0= And )
                    // InternalDdParser.g:2717:7: lv_op_2_0= And
                    {
                    lv_op_2_0=(Token)match(input,And,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_op_2_0, grammarAccess.getAndExpressionAccess().getOpAndKeyword_0_0_2_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getAndExpressionRule());
                      							}
                      							setWithLastConsumed(current, "op", lv_op_2_0, "and");
                      						
                    }

                    }


                    }

                    // InternalDdParser.g:2729:5: ( (lv_right_3_0= ruleSharkExpression ) )
                    // InternalDdParser.g:2730:6: (lv_right_3_0= ruleSharkExpression )
                    {
                    // InternalDdParser.g:2730:6: (lv_right_3_0= ruleSharkExpression )
                    // InternalDdParser.g:2731:7: lv_right_3_0= ruleSharkExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getAndExpressionAccess().getRightSharkExpressionParserRuleCall_0_0_3_0());
                      						
                    }
                    pushFollow(FOLLOW_54);
                    lv_right_3_0=ruleSharkExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getAndExpressionRule());
                      							}
                      							set(
                      								current,
                      								"right",
                      								lv_right_3_0,
                      								"com.shark.lang.Dd.SharkExpression");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalDdParser.g:2748:5: ( (lv_andElts_4_0= ruleAndExpressionElt ) )+
                    int cnt46=0;
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==And) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // InternalDdParser.g:2749:6: (lv_andElts_4_0= ruleAndExpressionElt )
                    	    {
                    	    // InternalDdParser.g:2749:6: (lv_andElts_4_0= ruleAndExpressionElt )
                    	    // InternalDdParser.g:2750:7: lv_andElts_4_0= ruleAndExpressionElt
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getAndExpressionAccess().getAndEltsAndExpressionEltParserRuleCall_0_0_4_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_55);
                    	    lv_andElts_4_0=ruleAndExpressionElt();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getAndExpressionRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"andElts",
                    	      								lv_andElts_4_0,
                    	      								"com.shark.lang.Dd.AndExpressionElt");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt46 >= 1 ) break loop46;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(46, input);
                                throw eee;
                        }
                        cnt46++;
                    } while (true);

                    otherlv_5=(Token)match(input,RightParenthesis,FOLLOW_41); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getAndExpressionAccess().getRightParenthesisKeyword_0_0_5());
                      				
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDdParser.g:2773:4: (otherlv_6= LeftSquareBracket ( (lv_left_7_0= ruleSharkExpression ) ) ( (lv_op_8_0= And ) ) ( (lv_right_9_0= ruleSharkExpression ) ) ( (lv_andElts_10_0= ruleAndExpressionElt ) )+ otherlv_11= RightSquareBracket )
                    {
                    // InternalDdParser.g:2773:4: (otherlv_6= LeftSquareBracket ( (lv_left_7_0= ruleSharkExpression ) ) ( (lv_op_8_0= And ) ) ( (lv_right_9_0= ruleSharkExpression ) ) ( (lv_andElts_10_0= ruleAndExpressionElt ) )+ otherlv_11= RightSquareBracket )
                    // InternalDdParser.g:2774:5: otherlv_6= LeftSquareBracket ( (lv_left_7_0= ruleSharkExpression ) ) ( (lv_op_8_0= And ) ) ( (lv_right_9_0= ruleSharkExpression ) ) ( (lv_andElts_10_0= ruleAndExpressionElt ) )+ otherlv_11= RightSquareBracket
                    {
                    otherlv_6=(Token)match(input,LeftSquareBracket,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getAndExpressionAccess().getLeftSquareBracketKeyword_0_1_0());
                      				
                    }
                    // InternalDdParser.g:2778:5: ( (lv_left_7_0= ruleSharkExpression ) )
                    // InternalDdParser.g:2779:6: (lv_left_7_0= ruleSharkExpression )
                    {
                    // InternalDdParser.g:2779:6: (lv_left_7_0= ruleSharkExpression )
                    // InternalDdParser.g:2780:7: lv_left_7_0= ruleSharkExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getAndExpressionAccess().getLeftSharkExpressionParserRuleCall_0_1_1_0());
                      						
                    }
                    pushFollow(FOLLOW_54);
                    lv_left_7_0=ruleSharkExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getAndExpressionRule());
                      							}
                      							set(
                      								current,
                      								"left",
                      								lv_left_7_0,
                      								"com.shark.lang.Dd.SharkExpression");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalDdParser.g:2797:5: ( (lv_op_8_0= And ) )
                    // InternalDdParser.g:2798:6: (lv_op_8_0= And )
                    {
                    // InternalDdParser.g:2798:6: (lv_op_8_0= And )
                    // InternalDdParser.g:2799:7: lv_op_8_0= And
                    {
                    lv_op_8_0=(Token)match(input,And,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_op_8_0, grammarAccess.getAndExpressionAccess().getOpAndKeyword_0_1_2_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getAndExpressionRule());
                      							}
                      							setWithLastConsumed(current, "op", lv_op_8_0, "and");
                      						
                    }

                    }


                    }

                    // InternalDdParser.g:2811:5: ( (lv_right_9_0= ruleSharkExpression ) )
                    // InternalDdParser.g:2812:6: (lv_right_9_0= ruleSharkExpression )
                    {
                    // InternalDdParser.g:2812:6: (lv_right_9_0= ruleSharkExpression )
                    // InternalDdParser.g:2813:7: lv_right_9_0= ruleSharkExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getAndExpressionAccess().getRightSharkExpressionParserRuleCall_0_1_3_0());
                      						
                    }
                    pushFollow(FOLLOW_54);
                    lv_right_9_0=ruleSharkExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getAndExpressionRule());
                      							}
                      							set(
                      								current,
                      								"right",
                      								lv_right_9_0,
                      								"com.shark.lang.Dd.SharkExpression");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalDdParser.g:2830:5: ( (lv_andElts_10_0= ruleAndExpressionElt ) )+
                    int cnt47=0;
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==And) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // InternalDdParser.g:2831:6: (lv_andElts_10_0= ruleAndExpressionElt )
                    	    {
                    	    // InternalDdParser.g:2831:6: (lv_andElts_10_0= ruleAndExpressionElt )
                    	    // InternalDdParser.g:2832:7: lv_andElts_10_0= ruleAndExpressionElt
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getAndExpressionAccess().getAndEltsAndExpressionEltParserRuleCall_0_1_4_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_56);
                    	    lv_andElts_10_0=ruleAndExpressionElt();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getAndExpressionRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"andElts",
                    	      								lv_andElts_10_0,
                    	      								"com.shark.lang.Dd.AndExpressionElt");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt47 >= 1 ) break loop47;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(47, input);
                                throw eee;
                        }
                        cnt47++;
                    } while (true);

                    otherlv_11=(Token)match(input,RightSquareBracket,FOLLOW_41); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_11, grammarAccess.getAndExpressionAccess().getRightSquareBracketKeyword_0_1_5());
                      				
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDdParser.g:2855:4: (otherlv_12= LeftCurlyBracket ( (lv_left_13_0= ruleSharkExpression ) ) ( (lv_op_14_0= And ) ) ( (lv_right_15_0= ruleSharkExpression ) ) ( (lv_andElts_16_0= ruleAndExpressionElt ) )+ otherlv_17= RightCurlyBracket )
                    {
                    // InternalDdParser.g:2855:4: (otherlv_12= LeftCurlyBracket ( (lv_left_13_0= ruleSharkExpression ) ) ( (lv_op_14_0= And ) ) ( (lv_right_15_0= ruleSharkExpression ) ) ( (lv_andElts_16_0= ruleAndExpressionElt ) )+ otherlv_17= RightCurlyBracket )
                    // InternalDdParser.g:2856:5: otherlv_12= LeftCurlyBracket ( (lv_left_13_0= ruleSharkExpression ) ) ( (lv_op_14_0= And ) ) ( (lv_right_15_0= ruleSharkExpression ) ) ( (lv_andElts_16_0= ruleAndExpressionElt ) )+ otherlv_17= RightCurlyBracket
                    {
                    otherlv_12=(Token)match(input,LeftCurlyBracket,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_12, grammarAccess.getAndExpressionAccess().getLeftCurlyBracketKeyword_0_2_0());
                      				
                    }
                    // InternalDdParser.g:2860:5: ( (lv_left_13_0= ruleSharkExpression ) )
                    // InternalDdParser.g:2861:6: (lv_left_13_0= ruleSharkExpression )
                    {
                    // InternalDdParser.g:2861:6: (lv_left_13_0= ruleSharkExpression )
                    // InternalDdParser.g:2862:7: lv_left_13_0= ruleSharkExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getAndExpressionAccess().getLeftSharkExpressionParserRuleCall_0_2_1_0());
                      						
                    }
                    pushFollow(FOLLOW_54);
                    lv_left_13_0=ruleSharkExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getAndExpressionRule());
                      							}
                      							set(
                      								current,
                      								"left",
                      								lv_left_13_0,
                      								"com.shark.lang.Dd.SharkExpression");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalDdParser.g:2879:5: ( (lv_op_14_0= And ) )
                    // InternalDdParser.g:2880:6: (lv_op_14_0= And )
                    {
                    // InternalDdParser.g:2880:6: (lv_op_14_0= And )
                    // InternalDdParser.g:2881:7: lv_op_14_0= And
                    {
                    lv_op_14_0=(Token)match(input,And,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_op_14_0, grammarAccess.getAndExpressionAccess().getOpAndKeyword_0_2_2_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getAndExpressionRule());
                      							}
                      							setWithLastConsumed(current, "op", lv_op_14_0, "and");
                      						
                    }

                    }


                    }

                    // InternalDdParser.g:2893:5: ( (lv_right_15_0= ruleSharkExpression ) )
                    // InternalDdParser.g:2894:6: (lv_right_15_0= ruleSharkExpression )
                    {
                    // InternalDdParser.g:2894:6: (lv_right_15_0= ruleSharkExpression )
                    // InternalDdParser.g:2895:7: lv_right_15_0= ruleSharkExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getAndExpressionAccess().getRightSharkExpressionParserRuleCall_0_2_3_0());
                      						
                    }
                    pushFollow(FOLLOW_54);
                    lv_right_15_0=ruleSharkExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getAndExpressionRule());
                      							}
                      							set(
                      								current,
                      								"right",
                      								lv_right_15_0,
                      								"com.shark.lang.Dd.SharkExpression");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalDdParser.g:2912:5: ( (lv_andElts_16_0= ruleAndExpressionElt ) )+
                    int cnt48=0;
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==And) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // InternalDdParser.g:2913:6: (lv_andElts_16_0= ruleAndExpressionElt )
                    	    {
                    	    // InternalDdParser.g:2913:6: (lv_andElts_16_0= ruleAndExpressionElt )
                    	    // InternalDdParser.g:2914:7: lv_andElts_16_0= ruleAndExpressionElt
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getAndExpressionAccess().getAndEltsAndExpressionEltParserRuleCall_0_2_4_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_57);
                    	    lv_andElts_16_0=ruleAndExpressionElt();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getAndExpressionRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"andElts",
                    	      								lv_andElts_16_0,
                    	      								"com.shark.lang.Dd.AndExpressionElt");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt48 >= 1 ) break loop48;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(48, input);
                                throw eee;
                        }
                        cnt48++;
                    } while (true);

                    otherlv_17=(Token)match(input,RightCurlyBracket,FOLLOW_41); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_17, grammarAccess.getAndExpressionAccess().getRightCurlyBracketKeyword_0_2_5());
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDdParser.g:2937:3: ( ( (lv_exprValue_18_0= RULE_NUL ) ) ( (lv_hasAttribute_19_0= RULE_INT ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_NUL) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalDdParser.g:2938:4: ( (lv_exprValue_18_0= RULE_NUL ) ) ( (lv_hasAttribute_19_0= RULE_INT ) )
                    {
                    // InternalDdParser.g:2938:4: ( (lv_exprValue_18_0= RULE_NUL ) )
                    // InternalDdParser.g:2939:5: (lv_exprValue_18_0= RULE_NUL )
                    {
                    // InternalDdParser.g:2939:5: (lv_exprValue_18_0= RULE_NUL )
                    // InternalDdParser.g:2940:6: lv_exprValue_18_0= RULE_NUL
                    {
                    lv_exprValue_18_0=(Token)match(input,RULE_NUL,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_exprValue_18_0, grammarAccess.getAndExpressionAccess().getExprValueNULTerminalRuleCall_1_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAndExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"exprValue",
                      							lv_exprValue_18_0,
                      							"com.shark.lang.Dd.NUL");
                      					
                    }

                    }


                    }

                    // InternalDdParser.g:2956:4: ( (lv_hasAttribute_19_0= RULE_INT ) )
                    // InternalDdParser.g:2957:5: (lv_hasAttribute_19_0= RULE_INT )
                    {
                    // InternalDdParser.g:2957:5: (lv_hasAttribute_19_0= RULE_INT )
                    // InternalDdParser.g:2958:6: lv_hasAttribute_19_0= RULE_INT
                    {
                    lv_hasAttribute_19_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_hasAttribute_19_0, grammarAccess.getAndExpressionAccess().getHasAttributeINTTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAndExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"hasAttribute",
                      							lv_hasAttribute_19_0,
                      							"com.shark.lang.Dd.INT");
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleAndExpressionElt"
    // InternalDdParser.g:2979:1: entryRuleAndExpressionElt returns [EObject current=null] : iv_ruleAndExpressionElt= ruleAndExpressionElt EOF ;
    public final EObject entryRuleAndExpressionElt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpressionElt = null;


        try {
            // InternalDdParser.g:2979:57: (iv_ruleAndExpressionElt= ruleAndExpressionElt EOF )
            // InternalDdParser.g:2980:2: iv_ruleAndExpressionElt= ruleAndExpressionElt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndExpressionEltRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAndExpressionElt=ruleAndExpressionElt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAndExpressionElt; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAndExpressionElt"


    // $ANTLR start "ruleAndExpressionElt"
    // InternalDdParser.g:2986:1: ruleAndExpressionElt returns [EObject current=null] : ( ( (lv_op_0_0= And ) ) ( (lv_right_1_0= ruleSharkExpression ) ) ) ;
    public final EObject ruleAndExpressionElt() throws RecognitionException {
        EObject current = null;

        Token lv_op_0_0=null;
        EObject lv_right_1_0 = null;



        	enterRule();

        try {
            // InternalDdParser.g:2992:2: ( ( ( (lv_op_0_0= And ) ) ( (lv_right_1_0= ruleSharkExpression ) ) ) )
            // InternalDdParser.g:2993:2: ( ( (lv_op_0_0= And ) ) ( (lv_right_1_0= ruleSharkExpression ) ) )
            {
            // InternalDdParser.g:2993:2: ( ( (lv_op_0_0= And ) ) ( (lv_right_1_0= ruleSharkExpression ) ) )
            // InternalDdParser.g:2994:3: ( (lv_op_0_0= And ) ) ( (lv_right_1_0= ruleSharkExpression ) )
            {
            // InternalDdParser.g:2994:3: ( (lv_op_0_0= And ) )
            // InternalDdParser.g:2995:4: (lv_op_0_0= And )
            {
            // InternalDdParser.g:2995:4: (lv_op_0_0= And )
            // InternalDdParser.g:2996:5: lv_op_0_0= And
            {
            lv_op_0_0=(Token)match(input,And,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_op_0_0, grammarAccess.getAndExpressionEltAccess().getOpAndKeyword_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getAndExpressionEltRule());
              					}
              					setWithLastConsumed(current, "op", lv_op_0_0, "and");
              				
            }

            }


            }

            // InternalDdParser.g:3008:3: ( (lv_right_1_0= ruleSharkExpression ) )
            // InternalDdParser.g:3009:4: (lv_right_1_0= ruleSharkExpression )
            {
            // InternalDdParser.g:3009:4: (lv_right_1_0= ruleSharkExpression )
            // InternalDdParser.g:3010:5: lv_right_1_0= ruleSharkExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAndExpressionEltAccess().getRightSharkExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_right_1_0=ruleSharkExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAndExpressionEltRule());
              					}
              					set(
              						current,
              						"right",
              						lv_right_1_0,
              						"com.shark.lang.Dd.SharkExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAndExpressionElt"


    // $ANTLR start "entryRuleOrExpression"
    // InternalDdParser.g:3031:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // InternalDdParser.g:3031:53: (iv_ruleOrExpression= ruleOrExpression EOF )
            // InternalDdParser.g:3032:2: iv_ruleOrExpression= ruleOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOrExpression=ruleOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrExpression"


    // $ANTLR start "ruleOrExpression"
    // InternalDdParser.g:3038:1: ruleOrExpression returns [EObject current=null] : ( ( (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= Or ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_orElts_4_0= ruleOrExpressionElt ) )+ otherlv_5= RightParenthesis ) | (otherlv_6= LeftSquareBracket ( (lv_left_7_0= ruleSharkExpression ) ) ( (lv_op_8_0= Or ) ) ( (lv_right_9_0= ruleSharkExpression ) ) ( (lv_orElts_10_0= ruleOrExpressionElt ) )+ otherlv_11= RightSquareBracket ) | (otherlv_12= LeftCurlyBracket ( (lv_left_13_0= ruleSharkExpression ) ) ( (lv_op_14_0= Or ) ) ( (lv_right_15_0= ruleSharkExpression ) ) ( (lv_orElts_16_0= ruleOrExpressionElt ) )+ otherlv_17= RightCurlyBracket ) ) ( ( (lv_exprValue_18_0= RULE_NUL ) ) ( (lv_hasAttribute_19_0= RULE_INT ) ) )? ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_op_2_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_op_8_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_op_14_0=null;
        Token otherlv_17=null;
        Token lv_exprValue_18_0=null;
        Token lv_hasAttribute_19_0=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_orElts_4_0 = null;

        EObject lv_left_7_0 = null;

        EObject lv_right_9_0 = null;

        EObject lv_orElts_10_0 = null;

        EObject lv_left_13_0 = null;

        EObject lv_right_15_0 = null;

        EObject lv_orElts_16_0 = null;



        	enterRule();

        try {
            // InternalDdParser.g:3044:2: ( ( ( (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= Or ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_orElts_4_0= ruleOrExpressionElt ) )+ otherlv_5= RightParenthesis ) | (otherlv_6= LeftSquareBracket ( (lv_left_7_0= ruleSharkExpression ) ) ( (lv_op_8_0= Or ) ) ( (lv_right_9_0= ruleSharkExpression ) ) ( (lv_orElts_10_0= ruleOrExpressionElt ) )+ otherlv_11= RightSquareBracket ) | (otherlv_12= LeftCurlyBracket ( (lv_left_13_0= ruleSharkExpression ) ) ( (lv_op_14_0= Or ) ) ( (lv_right_15_0= ruleSharkExpression ) ) ( (lv_orElts_16_0= ruleOrExpressionElt ) )+ otherlv_17= RightCurlyBracket ) ) ( ( (lv_exprValue_18_0= RULE_NUL ) ) ( (lv_hasAttribute_19_0= RULE_INT ) ) )? ) )
            // InternalDdParser.g:3045:2: ( ( (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= Or ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_orElts_4_0= ruleOrExpressionElt ) )+ otherlv_5= RightParenthesis ) | (otherlv_6= LeftSquareBracket ( (lv_left_7_0= ruleSharkExpression ) ) ( (lv_op_8_0= Or ) ) ( (lv_right_9_0= ruleSharkExpression ) ) ( (lv_orElts_10_0= ruleOrExpressionElt ) )+ otherlv_11= RightSquareBracket ) | (otherlv_12= LeftCurlyBracket ( (lv_left_13_0= ruleSharkExpression ) ) ( (lv_op_14_0= Or ) ) ( (lv_right_15_0= ruleSharkExpression ) ) ( (lv_orElts_16_0= ruleOrExpressionElt ) )+ otherlv_17= RightCurlyBracket ) ) ( ( (lv_exprValue_18_0= RULE_NUL ) ) ( (lv_hasAttribute_19_0= RULE_INT ) ) )? )
            {
            // InternalDdParser.g:3045:2: ( ( (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= Or ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_orElts_4_0= ruleOrExpressionElt ) )+ otherlv_5= RightParenthesis ) | (otherlv_6= LeftSquareBracket ( (lv_left_7_0= ruleSharkExpression ) ) ( (lv_op_8_0= Or ) ) ( (lv_right_9_0= ruleSharkExpression ) ) ( (lv_orElts_10_0= ruleOrExpressionElt ) )+ otherlv_11= RightSquareBracket ) | (otherlv_12= LeftCurlyBracket ( (lv_left_13_0= ruleSharkExpression ) ) ( (lv_op_14_0= Or ) ) ( (lv_right_15_0= ruleSharkExpression ) ) ( (lv_orElts_16_0= ruleOrExpressionElt ) )+ otherlv_17= RightCurlyBracket ) ) ( ( (lv_exprValue_18_0= RULE_NUL ) ) ( (lv_hasAttribute_19_0= RULE_INT ) ) )? )
            // InternalDdParser.g:3046:3: ( (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= Or ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_orElts_4_0= ruleOrExpressionElt ) )+ otherlv_5= RightParenthesis ) | (otherlv_6= LeftSquareBracket ( (lv_left_7_0= ruleSharkExpression ) ) ( (lv_op_8_0= Or ) ) ( (lv_right_9_0= ruleSharkExpression ) ) ( (lv_orElts_10_0= ruleOrExpressionElt ) )+ otherlv_11= RightSquareBracket ) | (otherlv_12= LeftCurlyBracket ( (lv_left_13_0= ruleSharkExpression ) ) ( (lv_op_14_0= Or ) ) ( (lv_right_15_0= ruleSharkExpression ) ) ( (lv_orElts_16_0= ruleOrExpressionElt ) )+ otherlv_17= RightCurlyBracket ) ) ( ( (lv_exprValue_18_0= RULE_NUL ) ) ( (lv_hasAttribute_19_0= RULE_INT ) ) )?
            {
            // InternalDdParser.g:3046:3: ( (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= Or ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_orElts_4_0= ruleOrExpressionElt ) )+ otherlv_5= RightParenthesis ) | (otherlv_6= LeftSquareBracket ( (lv_left_7_0= ruleSharkExpression ) ) ( (lv_op_8_0= Or ) ) ( (lv_right_9_0= ruleSharkExpression ) ) ( (lv_orElts_10_0= ruleOrExpressionElt ) )+ otherlv_11= RightSquareBracket ) | (otherlv_12= LeftCurlyBracket ( (lv_left_13_0= ruleSharkExpression ) ) ( (lv_op_14_0= Or ) ) ( (lv_right_15_0= ruleSharkExpression ) ) ( (lv_orElts_16_0= ruleOrExpressionElt ) )+ otherlv_17= RightCurlyBracket ) )
            int alt54=3;
            switch ( input.LA(1) ) {
            case LeftParenthesis:
                {
                alt54=1;
                }
                break;
            case LeftSquareBracket:
                {
                alt54=2;
                }
                break;
            case LeftCurlyBracket:
                {
                alt54=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }

            switch (alt54) {
                case 1 :
                    // InternalDdParser.g:3047:4: (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= Or ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_orElts_4_0= ruleOrExpressionElt ) )+ otherlv_5= RightParenthesis )
                    {
                    // InternalDdParser.g:3047:4: (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= Or ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_orElts_4_0= ruleOrExpressionElt ) )+ otherlv_5= RightParenthesis )
                    // InternalDdParser.g:3048:5: otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= Or ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_orElts_4_0= ruleOrExpressionElt ) )+ otherlv_5= RightParenthesis
                    {
                    otherlv_0=(Token)match(input,LeftParenthesis,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_0, grammarAccess.getOrExpressionAccess().getLeftParenthesisKeyword_0_0_0());
                      				
                    }
                    // InternalDdParser.g:3052:5: ( (lv_left_1_0= ruleSharkExpression ) )
                    // InternalDdParser.g:3053:6: (lv_left_1_0= ruleSharkExpression )
                    {
                    // InternalDdParser.g:3053:6: (lv_left_1_0= ruleSharkExpression )
                    // InternalDdParser.g:3054:7: lv_left_1_0= ruleSharkExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getOrExpressionAccess().getLeftSharkExpressionParserRuleCall_0_0_1_0());
                      						
                    }
                    pushFollow(FOLLOW_58);
                    lv_left_1_0=ruleSharkExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getOrExpressionRule());
                      							}
                      							set(
                      								current,
                      								"left",
                      								lv_left_1_0,
                      								"com.shark.lang.Dd.SharkExpression");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalDdParser.g:3071:5: ( (lv_op_2_0= Or ) )
                    // InternalDdParser.g:3072:6: (lv_op_2_0= Or )
                    {
                    // InternalDdParser.g:3072:6: (lv_op_2_0= Or )
                    // InternalDdParser.g:3073:7: lv_op_2_0= Or
                    {
                    lv_op_2_0=(Token)match(input,Or,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_op_2_0, grammarAccess.getOrExpressionAccess().getOpOrKeyword_0_0_2_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getOrExpressionRule());
                      							}
                      							setWithLastConsumed(current, "op", lv_op_2_0, "or");
                      						
                    }

                    }


                    }

                    // InternalDdParser.g:3085:5: ( (lv_right_3_0= ruleSharkExpression ) )
                    // InternalDdParser.g:3086:6: (lv_right_3_0= ruleSharkExpression )
                    {
                    // InternalDdParser.g:3086:6: (lv_right_3_0= ruleSharkExpression )
                    // InternalDdParser.g:3087:7: lv_right_3_0= ruleSharkExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getOrExpressionAccess().getRightSharkExpressionParserRuleCall_0_0_3_0());
                      						
                    }
                    pushFollow(FOLLOW_58);
                    lv_right_3_0=ruleSharkExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getOrExpressionRule());
                      							}
                      							set(
                      								current,
                      								"right",
                      								lv_right_3_0,
                      								"com.shark.lang.Dd.SharkExpression");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalDdParser.g:3104:5: ( (lv_orElts_4_0= ruleOrExpressionElt ) )+
                    int cnt51=0;
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==Or) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // InternalDdParser.g:3105:6: (lv_orElts_4_0= ruleOrExpressionElt )
                    	    {
                    	    // InternalDdParser.g:3105:6: (lv_orElts_4_0= ruleOrExpressionElt )
                    	    // InternalDdParser.g:3106:7: lv_orElts_4_0= ruleOrExpressionElt
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getOrExpressionAccess().getOrEltsOrExpressionEltParserRuleCall_0_0_4_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_59);
                    	    lv_orElts_4_0=ruleOrExpressionElt();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getOrExpressionRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"orElts",
                    	      								lv_orElts_4_0,
                    	      								"com.shark.lang.Dd.OrExpressionElt");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt51 >= 1 ) break loop51;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(51, input);
                                throw eee;
                        }
                        cnt51++;
                    } while (true);

                    otherlv_5=(Token)match(input,RightParenthesis,FOLLOW_41); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getOrExpressionAccess().getRightParenthesisKeyword_0_0_5());
                      				
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDdParser.g:3129:4: (otherlv_6= LeftSquareBracket ( (lv_left_7_0= ruleSharkExpression ) ) ( (lv_op_8_0= Or ) ) ( (lv_right_9_0= ruleSharkExpression ) ) ( (lv_orElts_10_0= ruleOrExpressionElt ) )+ otherlv_11= RightSquareBracket )
                    {
                    // InternalDdParser.g:3129:4: (otherlv_6= LeftSquareBracket ( (lv_left_7_0= ruleSharkExpression ) ) ( (lv_op_8_0= Or ) ) ( (lv_right_9_0= ruleSharkExpression ) ) ( (lv_orElts_10_0= ruleOrExpressionElt ) )+ otherlv_11= RightSquareBracket )
                    // InternalDdParser.g:3130:5: otherlv_6= LeftSquareBracket ( (lv_left_7_0= ruleSharkExpression ) ) ( (lv_op_8_0= Or ) ) ( (lv_right_9_0= ruleSharkExpression ) ) ( (lv_orElts_10_0= ruleOrExpressionElt ) )+ otherlv_11= RightSquareBracket
                    {
                    otherlv_6=(Token)match(input,LeftSquareBracket,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getOrExpressionAccess().getLeftSquareBracketKeyword_0_1_0());
                      				
                    }
                    // InternalDdParser.g:3134:5: ( (lv_left_7_0= ruleSharkExpression ) )
                    // InternalDdParser.g:3135:6: (lv_left_7_0= ruleSharkExpression )
                    {
                    // InternalDdParser.g:3135:6: (lv_left_7_0= ruleSharkExpression )
                    // InternalDdParser.g:3136:7: lv_left_7_0= ruleSharkExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getOrExpressionAccess().getLeftSharkExpressionParserRuleCall_0_1_1_0());
                      						
                    }
                    pushFollow(FOLLOW_58);
                    lv_left_7_0=ruleSharkExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getOrExpressionRule());
                      							}
                      							set(
                      								current,
                      								"left",
                      								lv_left_7_0,
                      								"com.shark.lang.Dd.SharkExpression");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalDdParser.g:3153:5: ( (lv_op_8_0= Or ) )
                    // InternalDdParser.g:3154:6: (lv_op_8_0= Or )
                    {
                    // InternalDdParser.g:3154:6: (lv_op_8_0= Or )
                    // InternalDdParser.g:3155:7: lv_op_8_0= Or
                    {
                    lv_op_8_0=(Token)match(input,Or,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_op_8_0, grammarAccess.getOrExpressionAccess().getOpOrKeyword_0_1_2_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getOrExpressionRule());
                      							}
                      							setWithLastConsumed(current, "op", lv_op_8_0, "or");
                      						
                    }

                    }


                    }

                    // InternalDdParser.g:3167:5: ( (lv_right_9_0= ruleSharkExpression ) )
                    // InternalDdParser.g:3168:6: (lv_right_9_0= ruleSharkExpression )
                    {
                    // InternalDdParser.g:3168:6: (lv_right_9_0= ruleSharkExpression )
                    // InternalDdParser.g:3169:7: lv_right_9_0= ruleSharkExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getOrExpressionAccess().getRightSharkExpressionParserRuleCall_0_1_3_0());
                      						
                    }
                    pushFollow(FOLLOW_58);
                    lv_right_9_0=ruleSharkExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getOrExpressionRule());
                      							}
                      							set(
                      								current,
                      								"right",
                      								lv_right_9_0,
                      								"com.shark.lang.Dd.SharkExpression");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalDdParser.g:3186:5: ( (lv_orElts_10_0= ruleOrExpressionElt ) )+
                    int cnt52=0;
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==Or) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // InternalDdParser.g:3187:6: (lv_orElts_10_0= ruleOrExpressionElt )
                    	    {
                    	    // InternalDdParser.g:3187:6: (lv_orElts_10_0= ruleOrExpressionElt )
                    	    // InternalDdParser.g:3188:7: lv_orElts_10_0= ruleOrExpressionElt
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getOrExpressionAccess().getOrEltsOrExpressionEltParserRuleCall_0_1_4_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_60);
                    	    lv_orElts_10_0=ruleOrExpressionElt();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getOrExpressionRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"orElts",
                    	      								lv_orElts_10_0,
                    	      								"com.shark.lang.Dd.OrExpressionElt");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt52 >= 1 ) break loop52;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(52, input);
                                throw eee;
                        }
                        cnt52++;
                    } while (true);

                    otherlv_11=(Token)match(input,RightSquareBracket,FOLLOW_41); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_11, grammarAccess.getOrExpressionAccess().getRightSquareBracketKeyword_0_1_5());
                      				
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDdParser.g:3211:4: (otherlv_12= LeftCurlyBracket ( (lv_left_13_0= ruleSharkExpression ) ) ( (lv_op_14_0= Or ) ) ( (lv_right_15_0= ruleSharkExpression ) ) ( (lv_orElts_16_0= ruleOrExpressionElt ) )+ otherlv_17= RightCurlyBracket )
                    {
                    // InternalDdParser.g:3211:4: (otherlv_12= LeftCurlyBracket ( (lv_left_13_0= ruleSharkExpression ) ) ( (lv_op_14_0= Or ) ) ( (lv_right_15_0= ruleSharkExpression ) ) ( (lv_orElts_16_0= ruleOrExpressionElt ) )+ otherlv_17= RightCurlyBracket )
                    // InternalDdParser.g:3212:5: otherlv_12= LeftCurlyBracket ( (lv_left_13_0= ruleSharkExpression ) ) ( (lv_op_14_0= Or ) ) ( (lv_right_15_0= ruleSharkExpression ) ) ( (lv_orElts_16_0= ruleOrExpressionElt ) )+ otherlv_17= RightCurlyBracket
                    {
                    otherlv_12=(Token)match(input,LeftCurlyBracket,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_12, grammarAccess.getOrExpressionAccess().getLeftCurlyBracketKeyword_0_2_0());
                      				
                    }
                    // InternalDdParser.g:3216:5: ( (lv_left_13_0= ruleSharkExpression ) )
                    // InternalDdParser.g:3217:6: (lv_left_13_0= ruleSharkExpression )
                    {
                    // InternalDdParser.g:3217:6: (lv_left_13_0= ruleSharkExpression )
                    // InternalDdParser.g:3218:7: lv_left_13_0= ruleSharkExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getOrExpressionAccess().getLeftSharkExpressionParserRuleCall_0_2_1_0());
                      						
                    }
                    pushFollow(FOLLOW_58);
                    lv_left_13_0=ruleSharkExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getOrExpressionRule());
                      							}
                      							set(
                      								current,
                      								"left",
                      								lv_left_13_0,
                      								"com.shark.lang.Dd.SharkExpression");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalDdParser.g:3235:5: ( (lv_op_14_0= Or ) )
                    // InternalDdParser.g:3236:6: (lv_op_14_0= Or )
                    {
                    // InternalDdParser.g:3236:6: (lv_op_14_0= Or )
                    // InternalDdParser.g:3237:7: lv_op_14_0= Or
                    {
                    lv_op_14_0=(Token)match(input,Or,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_op_14_0, grammarAccess.getOrExpressionAccess().getOpOrKeyword_0_2_2_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getOrExpressionRule());
                      							}
                      							setWithLastConsumed(current, "op", lv_op_14_0, "or");
                      						
                    }

                    }


                    }

                    // InternalDdParser.g:3249:5: ( (lv_right_15_0= ruleSharkExpression ) )
                    // InternalDdParser.g:3250:6: (lv_right_15_0= ruleSharkExpression )
                    {
                    // InternalDdParser.g:3250:6: (lv_right_15_0= ruleSharkExpression )
                    // InternalDdParser.g:3251:7: lv_right_15_0= ruleSharkExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getOrExpressionAccess().getRightSharkExpressionParserRuleCall_0_2_3_0());
                      						
                    }
                    pushFollow(FOLLOW_58);
                    lv_right_15_0=ruleSharkExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getOrExpressionRule());
                      							}
                      							set(
                      								current,
                      								"right",
                      								lv_right_15_0,
                      								"com.shark.lang.Dd.SharkExpression");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalDdParser.g:3268:5: ( (lv_orElts_16_0= ruleOrExpressionElt ) )+
                    int cnt53=0;
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==Or) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // InternalDdParser.g:3269:6: (lv_orElts_16_0= ruleOrExpressionElt )
                    	    {
                    	    // InternalDdParser.g:3269:6: (lv_orElts_16_0= ruleOrExpressionElt )
                    	    // InternalDdParser.g:3270:7: lv_orElts_16_0= ruleOrExpressionElt
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getOrExpressionAccess().getOrEltsOrExpressionEltParserRuleCall_0_2_4_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_61);
                    	    lv_orElts_16_0=ruleOrExpressionElt();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getOrExpressionRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"orElts",
                    	      								lv_orElts_16_0,
                    	      								"com.shark.lang.Dd.OrExpressionElt");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt53 >= 1 ) break loop53;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(53, input);
                                throw eee;
                        }
                        cnt53++;
                    } while (true);

                    otherlv_17=(Token)match(input,RightCurlyBracket,FOLLOW_41); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_17, grammarAccess.getOrExpressionAccess().getRightCurlyBracketKeyword_0_2_5());
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDdParser.g:3293:3: ( ( (lv_exprValue_18_0= RULE_NUL ) ) ( (lv_hasAttribute_19_0= RULE_INT ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_NUL) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalDdParser.g:3294:4: ( (lv_exprValue_18_0= RULE_NUL ) ) ( (lv_hasAttribute_19_0= RULE_INT ) )
                    {
                    // InternalDdParser.g:3294:4: ( (lv_exprValue_18_0= RULE_NUL ) )
                    // InternalDdParser.g:3295:5: (lv_exprValue_18_0= RULE_NUL )
                    {
                    // InternalDdParser.g:3295:5: (lv_exprValue_18_0= RULE_NUL )
                    // InternalDdParser.g:3296:6: lv_exprValue_18_0= RULE_NUL
                    {
                    lv_exprValue_18_0=(Token)match(input,RULE_NUL,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_exprValue_18_0, grammarAccess.getOrExpressionAccess().getExprValueNULTerminalRuleCall_1_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getOrExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"exprValue",
                      							lv_exprValue_18_0,
                      							"com.shark.lang.Dd.NUL");
                      					
                    }

                    }


                    }

                    // InternalDdParser.g:3312:4: ( (lv_hasAttribute_19_0= RULE_INT ) )
                    // InternalDdParser.g:3313:5: (lv_hasAttribute_19_0= RULE_INT )
                    {
                    // InternalDdParser.g:3313:5: (lv_hasAttribute_19_0= RULE_INT )
                    // InternalDdParser.g:3314:6: lv_hasAttribute_19_0= RULE_INT
                    {
                    lv_hasAttribute_19_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_hasAttribute_19_0, grammarAccess.getOrExpressionAccess().getHasAttributeINTTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getOrExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"hasAttribute",
                      							lv_hasAttribute_19_0,
                      							"com.shark.lang.Dd.INT");
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleOrExpressionElt"
    // InternalDdParser.g:3335:1: entryRuleOrExpressionElt returns [EObject current=null] : iv_ruleOrExpressionElt= ruleOrExpressionElt EOF ;
    public final EObject entryRuleOrExpressionElt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpressionElt = null;


        try {
            // InternalDdParser.g:3335:56: (iv_ruleOrExpressionElt= ruleOrExpressionElt EOF )
            // InternalDdParser.g:3336:2: iv_ruleOrExpressionElt= ruleOrExpressionElt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrExpressionEltRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOrExpressionElt=ruleOrExpressionElt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrExpressionElt; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrExpressionElt"


    // $ANTLR start "ruleOrExpressionElt"
    // InternalDdParser.g:3342:1: ruleOrExpressionElt returns [EObject current=null] : ( ( (lv_op_0_0= Or ) ) ( (lv_right_1_0= ruleSharkExpression ) ) ) ;
    public final EObject ruleOrExpressionElt() throws RecognitionException {
        EObject current = null;

        Token lv_op_0_0=null;
        EObject lv_right_1_0 = null;



        	enterRule();

        try {
            // InternalDdParser.g:3348:2: ( ( ( (lv_op_0_0= Or ) ) ( (lv_right_1_0= ruleSharkExpression ) ) ) )
            // InternalDdParser.g:3349:2: ( ( (lv_op_0_0= Or ) ) ( (lv_right_1_0= ruleSharkExpression ) ) )
            {
            // InternalDdParser.g:3349:2: ( ( (lv_op_0_0= Or ) ) ( (lv_right_1_0= ruleSharkExpression ) ) )
            // InternalDdParser.g:3350:3: ( (lv_op_0_0= Or ) ) ( (lv_right_1_0= ruleSharkExpression ) )
            {
            // InternalDdParser.g:3350:3: ( (lv_op_0_0= Or ) )
            // InternalDdParser.g:3351:4: (lv_op_0_0= Or )
            {
            // InternalDdParser.g:3351:4: (lv_op_0_0= Or )
            // InternalDdParser.g:3352:5: lv_op_0_0= Or
            {
            lv_op_0_0=(Token)match(input,Or,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_op_0_0, grammarAccess.getOrExpressionEltAccess().getOpOrKeyword_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getOrExpressionEltRule());
              					}
              					setWithLastConsumed(current, "op", lv_op_0_0, "or");
              				
            }

            }


            }

            // InternalDdParser.g:3364:3: ( (lv_right_1_0= ruleSharkExpression ) )
            // InternalDdParser.g:3365:4: (lv_right_1_0= ruleSharkExpression )
            {
            // InternalDdParser.g:3365:4: (lv_right_1_0= ruleSharkExpression )
            // InternalDdParser.g:3366:5: lv_right_1_0= ruleSharkExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getOrExpressionEltAccess().getRightSharkExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_right_1_0=ruleSharkExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getOrExpressionEltRule());
              					}
              					set(
              						current,
              						"right",
              						lv_right_1_0,
              						"com.shark.lang.Dd.SharkExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrExpressionElt"


    // $ANTLR start "entryRuleCatExpression"
    // InternalDdParser.g:3387:1: entryRuleCatExpression returns [EObject current=null] : iv_ruleCatExpression= ruleCatExpression EOF ;
    public final EObject entryRuleCatExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCatExpression = null;


        try {
            // InternalDdParser.g:3387:54: (iv_ruleCatExpression= ruleCatExpression EOF )
            // InternalDdParser.g:3388:2: iv_ruleCatExpression= ruleCatExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCatExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCatExpression=ruleCatExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCatExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCatExpression"


    // $ANTLR start "ruleCatExpression"
    // InternalDdParser.g:3394:1: ruleCatExpression returns [EObject current=null] : ( ( (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= Ampersand ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_catElts_4_0= ruleCatExpressionElt ) )+ otherlv_5= RightParenthesis ) | (otherlv_6= LeftSquareBracket ( (lv_left_7_0= ruleSharkExpression ) ) ( (lv_op_8_0= Ampersand ) ) ( (lv_right_9_0= ruleSharkExpression ) ) ( (lv_catElts_10_0= ruleCatExpressionElt ) )+ otherlv_11= RightSquareBracket ) | (otherlv_12= LeftCurlyBracket ( (lv_left_13_0= ruleSharkExpression ) ) ( (lv_op_14_0= Ampersand ) ) ( (lv_right_15_0= ruleSharkExpression ) ) ( (lv_catElts_16_0= ruleCatExpressionElt ) )+ otherlv_17= RightCurlyBracket ) ) ( ( (lv_exprValue_18_0= RULE_NUL ) ) ( (lv_length_19_0= RULE_INT ) ) ( (lv_hasAttribute_20_0= RULE_INT ) ) )? ) ;
    public final EObject ruleCatExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_op_2_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_op_8_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_op_14_0=null;
        Token otherlv_17=null;
        Token lv_exprValue_18_0=null;
        Token lv_length_19_0=null;
        Token lv_hasAttribute_20_0=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_catElts_4_0 = null;

        EObject lv_left_7_0 = null;

        EObject lv_right_9_0 = null;

        EObject lv_catElts_10_0 = null;

        EObject lv_left_13_0 = null;

        EObject lv_right_15_0 = null;

        EObject lv_catElts_16_0 = null;



        	enterRule();

        try {
            // InternalDdParser.g:3400:2: ( ( ( (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= Ampersand ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_catElts_4_0= ruleCatExpressionElt ) )+ otherlv_5= RightParenthesis ) | (otherlv_6= LeftSquareBracket ( (lv_left_7_0= ruleSharkExpression ) ) ( (lv_op_8_0= Ampersand ) ) ( (lv_right_9_0= ruleSharkExpression ) ) ( (lv_catElts_10_0= ruleCatExpressionElt ) )+ otherlv_11= RightSquareBracket ) | (otherlv_12= LeftCurlyBracket ( (lv_left_13_0= ruleSharkExpression ) ) ( (lv_op_14_0= Ampersand ) ) ( (lv_right_15_0= ruleSharkExpression ) ) ( (lv_catElts_16_0= ruleCatExpressionElt ) )+ otherlv_17= RightCurlyBracket ) ) ( ( (lv_exprValue_18_0= RULE_NUL ) ) ( (lv_length_19_0= RULE_INT ) ) ( (lv_hasAttribute_20_0= RULE_INT ) ) )? ) )
            // InternalDdParser.g:3401:2: ( ( (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= Ampersand ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_catElts_4_0= ruleCatExpressionElt ) )+ otherlv_5= RightParenthesis ) | (otherlv_6= LeftSquareBracket ( (lv_left_7_0= ruleSharkExpression ) ) ( (lv_op_8_0= Ampersand ) ) ( (lv_right_9_0= ruleSharkExpression ) ) ( (lv_catElts_10_0= ruleCatExpressionElt ) )+ otherlv_11= RightSquareBracket ) | (otherlv_12= LeftCurlyBracket ( (lv_left_13_0= ruleSharkExpression ) ) ( (lv_op_14_0= Ampersand ) ) ( (lv_right_15_0= ruleSharkExpression ) ) ( (lv_catElts_16_0= ruleCatExpressionElt ) )+ otherlv_17= RightCurlyBracket ) ) ( ( (lv_exprValue_18_0= RULE_NUL ) ) ( (lv_length_19_0= RULE_INT ) ) ( (lv_hasAttribute_20_0= RULE_INT ) ) )? )
            {
            // InternalDdParser.g:3401:2: ( ( (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= Ampersand ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_catElts_4_0= ruleCatExpressionElt ) )+ otherlv_5= RightParenthesis ) | (otherlv_6= LeftSquareBracket ( (lv_left_7_0= ruleSharkExpression ) ) ( (lv_op_8_0= Ampersand ) ) ( (lv_right_9_0= ruleSharkExpression ) ) ( (lv_catElts_10_0= ruleCatExpressionElt ) )+ otherlv_11= RightSquareBracket ) | (otherlv_12= LeftCurlyBracket ( (lv_left_13_0= ruleSharkExpression ) ) ( (lv_op_14_0= Ampersand ) ) ( (lv_right_15_0= ruleSharkExpression ) ) ( (lv_catElts_16_0= ruleCatExpressionElt ) )+ otherlv_17= RightCurlyBracket ) ) ( ( (lv_exprValue_18_0= RULE_NUL ) ) ( (lv_length_19_0= RULE_INT ) ) ( (lv_hasAttribute_20_0= RULE_INT ) ) )? )
            // InternalDdParser.g:3402:3: ( (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= Ampersand ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_catElts_4_0= ruleCatExpressionElt ) )+ otherlv_5= RightParenthesis ) | (otherlv_6= LeftSquareBracket ( (lv_left_7_0= ruleSharkExpression ) ) ( (lv_op_8_0= Ampersand ) ) ( (lv_right_9_0= ruleSharkExpression ) ) ( (lv_catElts_10_0= ruleCatExpressionElt ) )+ otherlv_11= RightSquareBracket ) | (otherlv_12= LeftCurlyBracket ( (lv_left_13_0= ruleSharkExpression ) ) ( (lv_op_14_0= Ampersand ) ) ( (lv_right_15_0= ruleSharkExpression ) ) ( (lv_catElts_16_0= ruleCatExpressionElt ) )+ otherlv_17= RightCurlyBracket ) ) ( ( (lv_exprValue_18_0= RULE_NUL ) ) ( (lv_length_19_0= RULE_INT ) ) ( (lv_hasAttribute_20_0= RULE_INT ) ) )?
            {
            // InternalDdParser.g:3402:3: ( (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= Ampersand ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_catElts_4_0= ruleCatExpressionElt ) )+ otherlv_5= RightParenthesis ) | (otherlv_6= LeftSquareBracket ( (lv_left_7_0= ruleSharkExpression ) ) ( (lv_op_8_0= Ampersand ) ) ( (lv_right_9_0= ruleSharkExpression ) ) ( (lv_catElts_10_0= ruleCatExpressionElt ) )+ otherlv_11= RightSquareBracket ) | (otherlv_12= LeftCurlyBracket ( (lv_left_13_0= ruleSharkExpression ) ) ( (lv_op_14_0= Ampersand ) ) ( (lv_right_15_0= ruleSharkExpression ) ) ( (lv_catElts_16_0= ruleCatExpressionElt ) )+ otherlv_17= RightCurlyBracket ) )
            int alt59=3;
            switch ( input.LA(1) ) {
            case LeftParenthesis:
                {
                alt59=1;
                }
                break;
            case LeftSquareBracket:
                {
                alt59=2;
                }
                break;
            case LeftCurlyBracket:
                {
                alt59=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }

            switch (alt59) {
                case 1 :
                    // InternalDdParser.g:3403:4: (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= Ampersand ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_catElts_4_0= ruleCatExpressionElt ) )+ otherlv_5= RightParenthesis )
                    {
                    // InternalDdParser.g:3403:4: (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= Ampersand ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_catElts_4_0= ruleCatExpressionElt ) )+ otherlv_5= RightParenthesis )
                    // InternalDdParser.g:3404:5: otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= Ampersand ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_catElts_4_0= ruleCatExpressionElt ) )+ otherlv_5= RightParenthesis
                    {
                    otherlv_0=(Token)match(input,LeftParenthesis,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_0, grammarAccess.getCatExpressionAccess().getLeftParenthesisKeyword_0_0_0());
                      				
                    }
                    // InternalDdParser.g:3408:5: ( (lv_left_1_0= ruleSharkExpression ) )
                    // InternalDdParser.g:3409:6: (lv_left_1_0= ruleSharkExpression )
                    {
                    // InternalDdParser.g:3409:6: (lv_left_1_0= ruleSharkExpression )
                    // InternalDdParser.g:3410:7: lv_left_1_0= ruleSharkExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getCatExpressionAccess().getLeftSharkExpressionParserRuleCall_0_0_1_0());
                      						
                    }
                    pushFollow(FOLLOW_62);
                    lv_left_1_0=ruleSharkExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getCatExpressionRule());
                      							}
                      							set(
                      								current,
                      								"left",
                      								lv_left_1_0,
                      								"com.shark.lang.Dd.SharkExpression");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalDdParser.g:3427:5: ( (lv_op_2_0= Ampersand ) )
                    // InternalDdParser.g:3428:6: (lv_op_2_0= Ampersand )
                    {
                    // InternalDdParser.g:3428:6: (lv_op_2_0= Ampersand )
                    // InternalDdParser.g:3429:7: lv_op_2_0= Ampersand
                    {
                    lv_op_2_0=(Token)match(input,Ampersand,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_op_2_0, grammarAccess.getCatExpressionAccess().getOpAmpersandKeyword_0_0_2_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getCatExpressionRule());
                      							}
                      							setWithLastConsumed(current, "op", lv_op_2_0, "&");
                      						
                    }

                    }


                    }

                    // InternalDdParser.g:3441:5: ( (lv_right_3_0= ruleSharkExpression ) )
                    // InternalDdParser.g:3442:6: (lv_right_3_0= ruleSharkExpression )
                    {
                    // InternalDdParser.g:3442:6: (lv_right_3_0= ruleSharkExpression )
                    // InternalDdParser.g:3443:7: lv_right_3_0= ruleSharkExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getCatExpressionAccess().getRightSharkExpressionParserRuleCall_0_0_3_0());
                      						
                    }
                    pushFollow(FOLLOW_62);
                    lv_right_3_0=ruleSharkExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getCatExpressionRule());
                      							}
                      							set(
                      								current,
                      								"right",
                      								lv_right_3_0,
                      								"com.shark.lang.Dd.SharkExpression");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalDdParser.g:3460:5: ( (lv_catElts_4_0= ruleCatExpressionElt ) )+
                    int cnt56=0;
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==Ampersand) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // InternalDdParser.g:3461:6: (lv_catElts_4_0= ruleCatExpressionElt )
                    	    {
                    	    // InternalDdParser.g:3461:6: (lv_catElts_4_0= ruleCatExpressionElt )
                    	    // InternalDdParser.g:3462:7: lv_catElts_4_0= ruleCatExpressionElt
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getCatExpressionAccess().getCatEltsCatExpressionEltParserRuleCall_0_0_4_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_63);
                    	    lv_catElts_4_0=ruleCatExpressionElt();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getCatExpressionRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"catElts",
                    	      								lv_catElts_4_0,
                    	      								"com.shark.lang.Dd.CatExpressionElt");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt56 >= 1 ) break loop56;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(56, input);
                                throw eee;
                        }
                        cnt56++;
                    } while (true);

                    otherlv_5=(Token)match(input,RightParenthesis,FOLLOW_41); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getCatExpressionAccess().getRightParenthesisKeyword_0_0_5());
                      				
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDdParser.g:3485:4: (otherlv_6= LeftSquareBracket ( (lv_left_7_0= ruleSharkExpression ) ) ( (lv_op_8_0= Ampersand ) ) ( (lv_right_9_0= ruleSharkExpression ) ) ( (lv_catElts_10_0= ruleCatExpressionElt ) )+ otherlv_11= RightSquareBracket )
                    {
                    // InternalDdParser.g:3485:4: (otherlv_6= LeftSquareBracket ( (lv_left_7_0= ruleSharkExpression ) ) ( (lv_op_8_0= Ampersand ) ) ( (lv_right_9_0= ruleSharkExpression ) ) ( (lv_catElts_10_0= ruleCatExpressionElt ) )+ otherlv_11= RightSquareBracket )
                    // InternalDdParser.g:3486:5: otherlv_6= LeftSquareBracket ( (lv_left_7_0= ruleSharkExpression ) ) ( (lv_op_8_0= Ampersand ) ) ( (lv_right_9_0= ruleSharkExpression ) ) ( (lv_catElts_10_0= ruleCatExpressionElt ) )+ otherlv_11= RightSquareBracket
                    {
                    otherlv_6=(Token)match(input,LeftSquareBracket,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getCatExpressionAccess().getLeftSquareBracketKeyword_0_1_0());
                      				
                    }
                    // InternalDdParser.g:3490:5: ( (lv_left_7_0= ruleSharkExpression ) )
                    // InternalDdParser.g:3491:6: (lv_left_7_0= ruleSharkExpression )
                    {
                    // InternalDdParser.g:3491:6: (lv_left_7_0= ruleSharkExpression )
                    // InternalDdParser.g:3492:7: lv_left_7_0= ruleSharkExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getCatExpressionAccess().getLeftSharkExpressionParserRuleCall_0_1_1_0());
                      						
                    }
                    pushFollow(FOLLOW_62);
                    lv_left_7_0=ruleSharkExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getCatExpressionRule());
                      							}
                      							set(
                      								current,
                      								"left",
                      								lv_left_7_0,
                      								"com.shark.lang.Dd.SharkExpression");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalDdParser.g:3509:5: ( (lv_op_8_0= Ampersand ) )
                    // InternalDdParser.g:3510:6: (lv_op_8_0= Ampersand )
                    {
                    // InternalDdParser.g:3510:6: (lv_op_8_0= Ampersand )
                    // InternalDdParser.g:3511:7: lv_op_8_0= Ampersand
                    {
                    lv_op_8_0=(Token)match(input,Ampersand,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_op_8_0, grammarAccess.getCatExpressionAccess().getOpAmpersandKeyword_0_1_2_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getCatExpressionRule());
                      							}
                      							setWithLastConsumed(current, "op", lv_op_8_0, "&");
                      						
                    }

                    }


                    }

                    // InternalDdParser.g:3523:5: ( (lv_right_9_0= ruleSharkExpression ) )
                    // InternalDdParser.g:3524:6: (lv_right_9_0= ruleSharkExpression )
                    {
                    // InternalDdParser.g:3524:6: (lv_right_9_0= ruleSharkExpression )
                    // InternalDdParser.g:3525:7: lv_right_9_0= ruleSharkExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getCatExpressionAccess().getRightSharkExpressionParserRuleCall_0_1_3_0());
                      						
                    }
                    pushFollow(FOLLOW_62);
                    lv_right_9_0=ruleSharkExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getCatExpressionRule());
                      							}
                      							set(
                      								current,
                      								"right",
                      								lv_right_9_0,
                      								"com.shark.lang.Dd.SharkExpression");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalDdParser.g:3542:5: ( (lv_catElts_10_0= ruleCatExpressionElt ) )+
                    int cnt57=0;
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==Ampersand) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // InternalDdParser.g:3543:6: (lv_catElts_10_0= ruleCatExpressionElt )
                    	    {
                    	    // InternalDdParser.g:3543:6: (lv_catElts_10_0= ruleCatExpressionElt )
                    	    // InternalDdParser.g:3544:7: lv_catElts_10_0= ruleCatExpressionElt
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getCatExpressionAccess().getCatEltsCatExpressionEltParserRuleCall_0_1_4_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_64);
                    	    lv_catElts_10_0=ruleCatExpressionElt();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getCatExpressionRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"catElts",
                    	      								lv_catElts_10_0,
                    	      								"com.shark.lang.Dd.CatExpressionElt");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt57 >= 1 ) break loop57;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(57, input);
                                throw eee;
                        }
                        cnt57++;
                    } while (true);

                    otherlv_11=(Token)match(input,RightSquareBracket,FOLLOW_41); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_11, grammarAccess.getCatExpressionAccess().getRightSquareBracketKeyword_0_1_5());
                      				
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDdParser.g:3567:4: (otherlv_12= LeftCurlyBracket ( (lv_left_13_0= ruleSharkExpression ) ) ( (lv_op_14_0= Ampersand ) ) ( (lv_right_15_0= ruleSharkExpression ) ) ( (lv_catElts_16_0= ruleCatExpressionElt ) )+ otherlv_17= RightCurlyBracket )
                    {
                    // InternalDdParser.g:3567:4: (otherlv_12= LeftCurlyBracket ( (lv_left_13_0= ruleSharkExpression ) ) ( (lv_op_14_0= Ampersand ) ) ( (lv_right_15_0= ruleSharkExpression ) ) ( (lv_catElts_16_0= ruleCatExpressionElt ) )+ otherlv_17= RightCurlyBracket )
                    // InternalDdParser.g:3568:5: otherlv_12= LeftCurlyBracket ( (lv_left_13_0= ruleSharkExpression ) ) ( (lv_op_14_0= Ampersand ) ) ( (lv_right_15_0= ruleSharkExpression ) ) ( (lv_catElts_16_0= ruleCatExpressionElt ) )+ otherlv_17= RightCurlyBracket
                    {
                    otherlv_12=(Token)match(input,LeftCurlyBracket,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_12, grammarAccess.getCatExpressionAccess().getLeftCurlyBracketKeyword_0_2_0());
                      				
                    }
                    // InternalDdParser.g:3572:5: ( (lv_left_13_0= ruleSharkExpression ) )
                    // InternalDdParser.g:3573:6: (lv_left_13_0= ruleSharkExpression )
                    {
                    // InternalDdParser.g:3573:6: (lv_left_13_0= ruleSharkExpression )
                    // InternalDdParser.g:3574:7: lv_left_13_0= ruleSharkExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getCatExpressionAccess().getLeftSharkExpressionParserRuleCall_0_2_1_0());
                      						
                    }
                    pushFollow(FOLLOW_62);
                    lv_left_13_0=ruleSharkExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getCatExpressionRule());
                      							}
                      							set(
                      								current,
                      								"left",
                      								lv_left_13_0,
                      								"com.shark.lang.Dd.SharkExpression");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalDdParser.g:3591:5: ( (lv_op_14_0= Ampersand ) )
                    // InternalDdParser.g:3592:6: (lv_op_14_0= Ampersand )
                    {
                    // InternalDdParser.g:3592:6: (lv_op_14_0= Ampersand )
                    // InternalDdParser.g:3593:7: lv_op_14_0= Ampersand
                    {
                    lv_op_14_0=(Token)match(input,Ampersand,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_op_14_0, grammarAccess.getCatExpressionAccess().getOpAmpersandKeyword_0_2_2_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getCatExpressionRule());
                      							}
                      							setWithLastConsumed(current, "op", lv_op_14_0, "&");
                      						
                    }

                    }


                    }

                    // InternalDdParser.g:3605:5: ( (lv_right_15_0= ruleSharkExpression ) )
                    // InternalDdParser.g:3606:6: (lv_right_15_0= ruleSharkExpression )
                    {
                    // InternalDdParser.g:3606:6: (lv_right_15_0= ruleSharkExpression )
                    // InternalDdParser.g:3607:7: lv_right_15_0= ruleSharkExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getCatExpressionAccess().getRightSharkExpressionParserRuleCall_0_2_3_0());
                      						
                    }
                    pushFollow(FOLLOW_62);
                    lv_right_15_0=ruleSharkExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getCatExpressionRule());
                      							}
                      							set(
                      								current,
                      								"right",
                      								lv_right_15_0,
                      								"com.shark.lang.Dd.SharkExpression");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalDdParser.g:3624:5: ( (lv_catElts_16_0= ruleCatExpressionElt ) )+
                    int cnt58=0;
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==Ampersand) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // InternalDdParser.g:3625:6: (lv_catElts_16_0= ruleCatExpressionElt )
                    	    {
                    	    // InternalDdParser.g:3625:6: (lv_catElts_16_0= ruleCatExpressionElt )
                    	    // InternalDdParser.g:3626:7: lv_catElts_16_0= ruleCatExpressionElt
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getCatExpressionAccess().getCatEltsCatExpressionEltParserRuleCall_0_2_4_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_65);
                    	    lv_catElts_16_0=ruleCatExpressionElt();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getCatExpressionRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"catElts",
                    	      								lv_catElts_16_0,
                    	      								"com.shark.lang.Dd.CatExpressionElt");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt58 >= 1 ) break loop58;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(58, input);
                                throw eee;
                        }
                        cnt58++;
                    } while (true);

                    otherlv_17=(Token)match(input,RightCurlyBracket,FOLLOW_41); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_17, grammarAccess.getCatExpressionAccess().getRightCurlyBracketKeyword_0_2_5());
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDdParser.g:3649:3: ( ( (lv_exprValue_18_0= RULE_NUL ) ) ( (lv_length_19_0= RULE_INT ) ) ( (lv_hasAttribute_20_0= RULE_INT ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_NUL) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalDdParser.g:3650:4: ( (lv_exprValue_18_0= RULE_NUL ) ) ( (lv_length_19_0= RULE_INT ) ) ( (lv_hasAttribute_20_0= RULE_INT ) )
                    {
                    // InternalDdParser.g:3650:4: ( (lv_exprValue_18_0= RULE_NUL ) )
                    // InternalDdParser.g:3651:5: (lv_exprValue_18_0= RULE_NUL )
                    {
                    // InternalDdParser.g:3651:5: (lv_exprValue_18_0= RULE_NUL )
                    // InternalDdParser.g:3652:6: lv_exprValue_18_0= RULE_NUL
                    {
                    lv_exprValue_18_0=(Token)match(input,RULE_NUL,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_exprValue_18_0, grammarAccess.getCatExpressionAccess().getExprValueNULTerminalRuleCall_1_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getCatExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"exprValue",
                      							lv_exprValue_18_0,
                      							"com.shark.lang.Dd.NUL");
                      					
                    }

                    }


                    }

                    // InternalDdParser.g:3668:4: ( (lv_length_19_0= RULE_INT ) )
                    // InternalDdParser.g:3669:5: (lv_length_19_0= RULE_INT )
                    {
                    // InternalDdParser.g:3669:5: (lv_length_19_0= RULE_INT )
                    // InternalDdParser.g:3670:6: lv_length_19_0= RULE_INT
                    {
                    lv_length_19_0=(Token)match(input,RULE_INT,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_length_19_0, grammarAccess.getCatExpressionAccess().getLengthINTTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getCatExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"length",
                      							lv_length_19_0,
                      							"com.shark.lang.Dd.INT");
                      					
                    }

                    }


                    }

                    // InternalDdParser.g:3686:4: ( (lv_hasAttribute_20_0= RULE_INT ) )
                    // InternalDdParser.g:3687:5: (lv_hasAttribute_20_0= RULE_INT )
                    {
                    // InternalDdParser.g:3687:5: (lv_hasAttribute_20_0= RULE_INT )
                    // InternalDdParser.g:3688:6: lv_hasAttribute_20_0= RULE_INT
                    {
                    lv_hasAttribute_20_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_hasAttribute_20_0, grammarAccess.getCatExpressionAccess().getHasAttributeINTTerminalRuleCall_1_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getCatExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"hasAttribute",
                      							lv_hasAttribute_20_0,
                      							"com.shark.lang.Dd.INT");
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCatExpression"


    // $ANTLR start "entryRuleCatExpressionElt"
    // InternalDdParser.g:3709:1: entryRuleCatExpressionElt returns [EObject current=null] : iv_ruleCatExpressionElt= ruleCatExpressionElt EOF ;
    public final EObject entryRuleCatExpressionElt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCatExpressionElt = null;


        try {
            // InternalDdParser.g:3709:57: (iv_ruleCatExpressionElt= ruleCatExpressionElt EOF )
            // InternalDdParser.g:3710:2: iv_ruleCatExpressionElt= ruleCatExpressionElt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCatExpressionEltRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCatExpressionElt=ruleCatExpressionElt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCatExpressionElt; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCatExpressionElt"


    // $ANTLR start "ruleCatExpressionElt"
    // InternalDdParser.g:3716:1: ruleCatExpressionElt returns [EObject current=null] : ( ( (lv_op_0_0= Ampersand ) ) ( (lv_right_1_0= ruleSharkExpression ) ) ) ;
    public final EObject ruleCatExpressionElt() throws RecognitionException {
        EObject current = null;

        Token lv_op_0_0=null;
        EObject lv_right_1_0 = null;



        	enterRule();

        try {
            // InternalDdParser.g:3722:2: ( ( ( (lv_op_0_0= Ampersand ) ) ( (lv_right_1_0= ruleSharkExpression ) ) ) )
            // InternalDdParser.g:3723:2: ( ( (lv_op_0_0= Ampersand ) ) ( (lv_right_1_0= ruleSharkExpression ) ) )
            {
            // InternalDdParser.g:3723:2: ( ( (lv_op_0_0= Ampersand ) ) ( (lv_right_1_0= ruleSharkExpression ) ) )
            // InternalDdParser.g:3724:3: ( (lv_op_0_0= Ampersand ) ) ( (lv_right_1_0= ruleSharkExpression ) )
            {
            // InternalDdParser.g:3724:3: ( (lv_op_0_0= Ampersand ) )
            // InternalDdParser.g:3725:4: (lv_op_0_0= Ampersand )
            {
            // InternalDdParser.g:3725:4: (lv_op_0_0= Ampersand )
            // InternalDdParser.g:3726:5: lv_op_0_0= Ampersand
            {
            lv_op_0_0=(Token)match(input,Ampersand,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_op_0_0, grammarAccess.getCatExpressionEltAccess().getOpAmpersandKeyword_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getCatExpressionEltRule());
              					}
              					setWithLastConsumed(current, "op", lv_op_0_0, "&");
              				
            }

            }


            }

            // InternalDdParser.g:3738:3: ( (lv_right_1_0= ruleSharkExpression ) )
            // InternalDdParser.g:3739:4: (lv_right_1_0= ruleSharkExpression )
            {
            // InternalDdParser.g:3739:4: (lv_right_1_0= ruleSharkExpression )
            // InternalDdParser.g:3740:5: lv_right_1_0= ruleSharkExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCatExpressionEltAccess().getRightSharkExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_right_1_0=ruleSharkExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCatExpressionEltRule());
              					}
              					set(
              						current,
              						"right",
              						lv_right_1_0,
              						"com.shark.lang.Dd.SharkExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCatExpressionElt"


    // $ANTLR start "entryRuleListExpression"
    // InternalDdParser.g:3761:1: entryRuleListExpression returns [EObject current=null] : iv_ruleListExpression= ruleListExpression EOF ;
    public final EObject entryRuleListExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListExpression = null;


        try {
            // InternalDdParser.g:3761:55: (iv_ruleListExpression= ruleListExpression EOF )
            // InternalDdParser.g:3762:2: iv_ruleListExpression= ruleListExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getListExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleListExpression=ruleListExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleListExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleListExpression"


    // $ANTLR start "ruleListExpression"
    // InternalDdParser.g:3768:1: ruleListExpression returns [EObject current=null] : ( ( (lv_op_0_0= LeftParenthesis ) ) ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_ListElts_2_0= ruleListExpressionElt ) )+ otherlv_3= RightParenthesis ( ( (lv_exprValue_4_0= RULE_NUL ) ) ( (lv_hasAttribute_5_0= RULE_INT ) ) )? ) ;
    public final EObject ruleListExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_0_0=null;
        Token otherlv_3=null;
        Token lv_exprValue_4_0=null;
        Token lv_hasAttribute_5_0=null;
        EObject lv_left_1_0 = null;

        EObject lv_ListElts_2_0 = null;



        	enterRule();

        try {
            // InternalDdParser.g:3774:2: ( ( ( (lv_op_0_0= LeftParenthesis ) ) ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_ListElts_2_0= ruleListExpressionElt ) )+ otherlv_3= RightParenthesis ( ( (lv_exprValue_4_0= RULE_NUL ) ) ( (lv_hasAttribute_5_0= RULE_INT ) ) )? ) )
            // InternalDdParser.g:3775:2: ( ( (lv_op_0_0= LeftParenthesis ) ) ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_ListElts_2_0= ruleListExpressionElt ) )+ otherlv_3= RightParenthesis ( ( (lv_exprValue_4_0= RULE_NUL ) ) ( (lv_hasAttribute_5_0= RULE_INT ) ) )? )
            {
            // InternalDdParser.g:3775:2: ( ( (lv_op_0_0= LeftParenthesis ) ) ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_ListElts_2_0= ruleListExpressionElt ) )+ otherlv_3= RightParenthesis ( ( (lv_exprValue_4_0= RULE_NUL ) ) ( (lv_hasAttribute_5_0= RULE_INT ) ) )? )
            // InternalDdParser.g:3776:3: ( (lv_op_0_0= LeftParenthesis ) ) ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_ListElts_2_0= ruleListExpressionElt ) )+ otherlv_3= RightParenthesis ( ( (lv_exprValue_4_0= RULE_NUL ) ) ( (lv_hasAttribute_5_0= RULE_INT ) ) )?
            {
            // InternalDdParser.g:3776:3: ( (lv_op_0_0= LeftParenthesis ) )
            // InternalDdParser.g:3777:4: (lv_op_0_0= LeftParenthesis )
            {
            // InternalDdParser.g:3777:4: (lv_op_0_0= LeftParenthesis )
            // InternalDdParser.g:3778:5: lv_op_0_0= LeftParenthesis
            {
            lv_op_0_0=(Token)match(input,LeftParenthesis,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_op_0_0, grammarAccess.getListExpressionAccess().getOpLeftParenthesisKeyword_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getListExpressionRule());
              					}
              					setWithLastConsumed(current, "op", lv_op_0_0, "(");
              				
            }

            }


            }

            // InternalDdParser.g:3790:3: ( (lv_left_1_0= ruleSharkExpression ) )
            // InternalDdParser.g:3791:4: (lv_left_1_0= ruleSharkExpression )
            {
            // InternalDdParser.g:3791:4: (lv_left_1_0= ruleSharkExpression )
            // InternalDdParser.g:3792:5: lv_left_1_0= ruleSharkExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getListExpressionAccess().getLeftSharkExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_66);
            lv_left_1_0=ruleSharkExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getListExpressionRule());
              					}
              					set(
              						current,
              						"left",
              						lv_left_1_0,
              						"com.shark.lang.Dd.SharkExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalDdParser.g:3809:3: ( (lv_ListElts_2_0= ruleListExpressionElt ) )+
            int cnt61=0;
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==Comma) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // InternalDdParser.g:3810:4: (lv_ListElts_2_0= ruleListExpressionElt )
            	    {
            	    // InternalDdParser.g:3810:4: (lv_ListElts_2_0= ruleListExpressionElt )
            	    // InternalDdParser.g:3811:5: lv_ListElts_2_0= ruleListExpressionElt
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getListExpressionAccess().getListEltsListExpressionEltParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_30);
            	    lv_ListElts_2_0=ruleListExpressionElt();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getListExpressionRule());
            	      					}
            	      					add(
            	      						current,
            	      						"ListElts",
            	      						lv_ListElts_2_0,
            	      						"com.shark.lang.Dd.ListExpressionElt");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt61 >= 1 ) break loop61;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(61, input);
                        throw eee;
                }
                cnt61++;
            } while (true);

            otherlv_3=(Token)match(input,RightParenthesis,FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getListExpressionAccess().getRightParenthesisKeyword_3());
              		
            }
            // InternalDdParser.g:3832:3: ( ( (lv_exprValue_4_0= RULE_NUL ) ) ( (lv_hasAttribute_5_0= RULE_INT ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==RULE_NUL) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalDdParser.g:3833:4: ( (lv_exprValue_4_0= RULE_NUL ) ) ( (lv_hasAttribute_5_0= RULE_INT ) )
                    {
                    // InternalDdParser.g:3833:4: ( (lv_exprValue_4_0= RULE_NUL ) )
                    // InternalDdParser.g:3834:5: (lv_exprValue_4_0= RULE_NUL )
                    {
                    // InternalDdParser.g:3834:5: (lv_exprValue_4_0= RULE_NUL )
                    // InternalDdParser.g:3835:6: lv_exprValue_4_0= RULE_NUL
                    {
                    lv_exprValue_4_0=(Token)match(input,RULE_NUL,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_exprValue_4_0, grammarAccess.getListExpressionAccess().getExprValueNULTerminalRuleCall_4_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getListExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"exprValue",
                      							lv_exprValue_4_0,
                      							"com.shark.lang.Dd.NUL");
                      					
                    }

                    }


                    }

                    // InternalDdParser.g:3851:4: ( (lv_hasAttribute_5_0= RULE_INT ) )
                    // InternalDdParser.g:3852:5: (lv_hasAttribute_5_0= RULE_INT )
                    {
                    // InternalDdParser.g:3852:5: (lv_hasAttribute_5_0= RULE_INT )
                    // InternalDdParser.g:3853:6: lv_hasAttribute_5_0= RULE_INT
                    {
                    lv_hasAttribute_5_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_hasAttribute_5_0, grammarAccess.getListExpressionAccess().getHasAttributeINTTerminalRuleCall_4_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getListExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"hasAttribute",
                      							lv_hasAttribute_5_0,
                      							"com.shark.lang.Dd.INT");
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleListExpression"


    // $ANTLR start "entryRuleListExpressionElt"
    // InternalDdParser.g:3874:1: entryRuleListExpressionElt returns [EObject current=null] : iv_ruleListExpressionElt= ruleListExpressionElt EOF ;
    public final EObject entryRuleListExpressionElt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListExpressionElt = null;


        try {
            // InternalDdParser.g:3874:58: (iv_ruleListExpressionElt= ruleListExpressionElt EOF )
            // InternalDdParser.g:3875:2: iv_ruleListExpressionElt= ruleListExpressionElt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getListExpressionEltRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleListExpressionElt=ruleListExpressionElt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleListExpressionElt; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleListExpressionElt"


    // $ANTLR start "ruleListExpressionElt"
    // InternalDdParser.g:3881:1: ruleListExpressionElt returns [EObject current=null] : ( ( (lv_op_0_0= Comma ) ) ( (lv_right_1_0= ruleSharkExpression ) ) ) ;
    public final EObject ruleListExpressionElt() throws RecognitionException {
        EObject current = null;

        Token lv_op_0_0=null;
        EObject lv_right_1_0 = null;



        	enterRule();

        try {
            // InternalDdParser.g:3887:2: ( ( ( (lv_op_0_0= Comma ) ) ( (lv_right_1_0= ruleSharkExpression ) ) ) )
            // InternalDdParser.g:3888:2: ( ( (lv_op_0_0= Comma ) ) ( (lv_right_1_0= ruleSharkExpression ) ) )
            {
            // InternalDdParser.g:3888:2: ( ( (lv_op_0_0= Comma ) ) ( (lv_right_1_0= ruleSharkExpression ) ) )
            // InternalDdParser.g:3889:3: ( (lv_op_0_0= Comma ) ) ( (lv_right_1_0= ruleSharkExpression ) )
            {
            // InternalDdParser.g:3889:3: ( (lv_op_0_0= Comma ) )
            // InternalDdParser.g:3890:4: (lv_op_0_0= Comma )
            {
            // InternalDdParser.g:3890:4: (lv_op_0_0= Comma )
            // InternalDdParser.g:3891:5: lv_op_0_0= Comma
            {
            lv_op_0_0=(Token)match(input,Comma,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_op_0_0, grammarAccess.getListExpressionEltAccess().getOpCommaKeyword_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getListExpressionEltRule());
              					}
              					setWithLastConsumed(current, "op", lv_op_0_0, ",");
              				
            }

            }


            }

            // InternalDdParser.g:3903:3: ( (lv_right_1_0= ruleSharkExpression ) )
            // InternalDdParser.g:3904:4: (lv_right_1_0= ruleSharkExpression )
            {
            // InternalDdParser.g:3904:4: (lv_right_1_0= ruleSharkExpression )
            // InternalDdParser.g:3905:5: lv_right_1_0= ruleSharkExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getListExpressionEltAccess().getRightSharkExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_right_1_0=ruleSharkExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getListExpressionEltRule());
              					}
              					set(
              						current,
              						"right",
              						lv_right_1_0,
              						"com.shark.lang.Dd.SharkExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleListExpressionElt"


    // $ANTLR start "entryRuleRangeExpression"
    // InternalDdParser.g:3926:1: entryRuleRangeExpression returns [EObject current=null] : iv_ruleRangeExpression= ruleRangeExpression EOF ;
    public final EObject entryRuleRangeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRangeExpression = null;


        try {
            // InternalDdParser.g:3926:56: (iv_ruleRangeExpression= ruleRangeExpression EOF )
            // InternalDdParser.g:3927:2: iv_ruleRangeExpression= ruleRangeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRangeExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRangeExpression=ruleRangeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRangeExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRangeExpression"


    // $ANTLR start "ruleRangeExpression"
    // InternalDdParser.g:3933:1: ruleRangeExpression returns [EObject current=null] : ( ( () otherlv_1= LeftParenthesis ( (lv_range_2_0= RULE_RANGE ) ) otherlv_3= RightParenthesis ) | ( () ( ( LeftParenthesis )=>otherlv_5= LeftParenthesis ) ( (lv_range_6_0= RULE_RANGEINF ) ) otherlv_7= RightParenthesis ) ) ;
    public final EObject ruleRangeExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_range_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_range_6_0=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalDdParser.g:3939:2: ( ( ( () otherlv_1= LeftParenthesis ( (lv_range_2_0= RULE_RANGE ) ) otherlv_3= RightParenthesis ) | ( () ( ( LeftParenthesis )=>otherlv_5= LeftParenthesis ) ( (lv_range_6_0= RULE_RANGEINF ) ) otherlv_7= RightParenthesis ) ) )
            // InternalDdParser.g:3940:2: ( ( () otherlv_1= LeftParenthesis ( (lv_range_2_0= RULE_RANGE ) ) otherlv_3= RightParenthesis ) | ( () ( ( LeftParenthesis )=>otherlv_5= LeftParenthesis ) ( (lv_range_6_0= RULE_RANGEINF ) ) otherlv_7= RightParenthesis ) )
            {
            // InternalDdParser.g:3940:2: ( ( () otherlv_1= LeftParenthesis ( (lv_range_2_0= RULE_RANGE ) ) otherlv_3= RightParenthesis ) | ( () ( ( LeftParenthesis )=>otherlv_5= LeftParenthesis ) ( (lv_range_6_0= RULE_RANGEINF ) ) otherlv_7= RightParenthesis ) )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==LeftParenthesis) ) {
                int LA63_1 = input.LA(2);

                if ( (LA63_1==RULE_RANGE) ) {
                    alt63=1;
                }
                else if ( (LA63_1==RULE_RANGEINF) ) {
                    alt63=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 63, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // InternalDdParser.g:3941:3: ( () otherlv_1= LeftParenthesis ( (lv_range_2_0= RULE_RANGE ) ) otherlv_3= RightParenthesis )
                    {
                    // InternalDdParser.g:3941:3: ( () otherlv_1= LeftParenthesis ( (lv_range_2_0= RULE_RANGE ) ) otherlv_3= RightParenthesis )
                    // InternalDdParser.g:3942:4: () otherlv_1= LeftParenthesis ( (lv_range_2_0= RULE_RANGE ) ) otherlv_3= RightParenthesis
                    {
                    // InternalDdParser.g:3942:4: ()
                    // InternalDdParser.g:3943:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getRangeExpressionAccess().getListExpressionAction_0_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_67); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getRangeExpressionAccess().getLeftParenthesisKeyword_0_1());
                      			
                    }
                    // InternalDdParser.g:3953:4: ( (lv_range_2_0= RULE_RANGE ) )
                    // InternalDdParser.g:3954:5: (lv_range_2_0= RULE_RANGE )
                    {
                    // InternalDdParser.g:3954:5: (lv_range_2_0= RULE_RANGE )
                    // InternalDdParser.g:3955:6: lv_range_2_0= RULE_RANGE
                    {
                    lv_range_2_0=(Token)match(input,RULE_RANGE,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_range_2_0, grammarAccess.getRangeExpressionAccess().getRangeRANGETerminalRuleCall_0_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getRangeExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"range",
                      							lv_range_2_0,
                      							"com.shark.lang.Dd.RANGE");
                      					
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,RightParenthesis,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getRangeExpressionAccess().getRightParenthesisKeyword_0_3());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDdParser.g:3977:3: ( () ( ( LeftParenthesis )=>otherlv_5= LeftParenthesis ) ( (lv_range_6_0= RULE_RANGEINF ) ) otherlv_7= RightParenthesis )
                    {
                    // InternalDdParser.g:3977:3: ( () ( ( LeftParenthesis )=>otherlv_5= LeftParenthesis ) ( (lv_range_6_0= RULE_RANGEINF ) ) otherlv_7= RightParenthesis )
                    // InternalDdParser.g:3978:4: () ( ( LeftParenthesis )=>otherlv_5= LeftParenthesis ) ( (lv_range_6_0= RULE_RANGEINF ) ) otherlv_7= RightParenthesis
                    {
                    // InternalDdParser.g:3978:4: ()
                    // InternalDdParser.g:3979:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getRangeExpressionAccess().getListExpressionAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalDdParser.g:3985:4: ( ( LeftParenthesis )=>otherlv_5= LeftParenthesis )
                    // InternalDdParser.g:3986:5: ( LeftParenthesis )=>otherlv_5= LeftParenthesis
                    {
                    otherlv_5=(Token)match(input,LeftParenthesis,FOLLOW_68); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getRangeExpressionAccess().getLeftParenthesisKeyword_1_1());
                      				
                    }

                    }

                    // InternalDdParser.g:3992:4: ( (lv_range_6_0= RULE_RANGEINF ) )
                    // InternalDdParser.g:3993:5: (lv_range_6_0= RULE_RANGEINF )
                    {
                    // InternalDdParser.g:3993:5: (lv_range_6_0= RULE_RANGEINF )
                    // InternalDdParser.g:3994:6: lv_range_6_0= RULE_RANGEINF
                    {
                    lv_range_6_0=(Token)match(input,RULE_RANGEINF,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_range_6_0, grammarAccess.getRangeExpressionAccess().getRangeRANGEINFTerminalRuleCall_1_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getRangeExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"range",
                      							lv_range_6_0,
                      							"com.shark.lang.Dd.RANGEINF");
                      					
                    }

                    }


                    }

                    otherlv_7=(Token)match(input,RightParenthesis,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getRangeExpressionAccess().getRightParenthesisKeyword_1_3());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRangeExpression"


    // $ANTLR start "entryRuleTerminalExpression"
    // InternalDdParser.g:4019:1: entryRuleTerminalExpression returns [EObject current=null] : iv_ruleTerminalExpression= ruleTerminalExpression EOF ;
    public final EObject entryRuleTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalExpression = null;


        try {
            // InternalDdParser.g:4019:59: (iv_ruleTerminalExpression= ruleTerminalExpression EOF )
            // InternalDdParser.g:4020:2: iv_ruleTerminalExpression= ruleTerminalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTerminalExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTerminalExpression=ruleTerminalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTerminalExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTerminalExpression"


    // $ANTLR start "ruleTerminalExpression"
    // InternalDdParser.g:4026:1: ruleTerminalExpression returns [EObject current=null] : ( ( ( () ( (lv_value_1_0= RULE_STR ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( (lv_value_5_0= RULE_DEC ) ) ) | ( () ( (lv_value_7_0= RULE_CHR ) ) ) | ( () ( (otherlv_9= RULE_CSTID ) ) ( (lv_index_10_0= ruleArraySize ) )? ) | ( () ( (lv_value_12_0= ruleBoolean ) ) ) | ( () ( (lv_value_14_0= ruleUnset ) ) ) | ( () ( ( ruleQualifiedName ) ) ( (lv_index_17_0= ruleArraySize ) )? ) ) ( ( (lv_exprValue_18_0= RULE_NUL ) ) ( (lv_hasAttribute_19_0= RULE_INT ) ) )? ) ;
    public final EObject ruleTerminalExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;
        Token lv_value_5_0=null;
        Token lv_value_7_0=null;
        Token otherlv_9=null;
        Token lv_exprValue_18_0=null;
        Token lv_hasAttribute_19_0=null;
        EObject lv_index_10_0 = null;

        Enumerator lv_value_12_0 = null;

        Enumerator lv_value_14_0 = null;

        EObject lv_index_17_0 = null;



        	enterRule();

        try {
            // InternalDdParser.g:4032:2: ( ( ( ( () ( (lv_value_1_0= RULE_STR ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( (lv_value_5_0= RULE_DEC ) ) ) | ( () ( (lv_value_7_0= RULE_CHR ) ) ) | ( () ( (otherlv_9= RULE_CSTID ) ) ( (lv_index_10_0= ruleArraySize ) )? ) | ( () ( (lv_value_12_0= ruleBoolean ) ) ) | ( () ( (lv_value_14_0= ruleUnset ) ) ) | ( () ( ( ruleQualifiedName ) ) ( (lv_index_17_0= ruleArraySize ) )? ) ) ( ( (lv_exprValue_18_0= RULE_NUL ) ) ( (lv_hasAttribute_19_0= RULE_INT ) ) )? ) )
            // InternalDdParser.g:4033:2: ( ( ( () ( (lv_value_1_0= RULE_STR ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( (lv_value_5_0= RULE_DEC ) ) ) | ( () ( (lv_value_7_0= RULE_CHR ) ) ) | ( () ( (otherlv_9= RULE_CSTID ) ) ( (lv_index_10_0= ruleArraySize ) )? ) | ( () ( (lv_value_12_0= ruleBoolean ) ) ) | ( () ( (lv_value_14_0= ruleUnset ) ) ) | ( () ( ( ruleQualifiedName ) ) ( (lv_index_17_0= ruleArraySize ) )? ) ) ( ( (lv_exprValue_18_0= RULE_NUL ) ) ( (lv_hasAttribute_19_0= RULE_INT ) ) )? )
            {
            // InternalDdParser.g:4033:2: ( ( ( () ( (lv_value_1_0= RULE_STR ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( (lv_value_5_0= RULE_DEC ) ) ) | ( () ( (lv_value_7_0= RULE_CHR ) ) ) | ( () ( (otherlv_9= RULE_CSTID ) ) ( (lv_index_10_0= ruleArraySize ) )? ) | ( () ( (lv_value_12_0= ruleBoolean ) ) ) | ( () ( (lv_value_14_0= ruleUnset ) ) ) | ( () ( ( ruleQualifiedName ) ) ( (lv_index_17_0= ruleArraySize ) )? ) ) ( ( (lv_exprValue_18_0= RULE_NUL ) ) ( (lv_hasAttribute_19_0= RULE_INT ) ) )? )
            // InternalDdParser.g:4034:3: ( ( () ( (lv_value_1_0= RULE_STR ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( (lv_value_5_0= RULE_DEC ) ) ) | ( () ( (lv_value_7_0= RULE_CHR ) ) ) | ( () ( (otherlv_9= RULE_CSTID ) ) ( (lv_index_10_0= ruleArraySize ) )? ) | ( () ( (lv_value_12_0= ruleBoolean ) ) ) | ( () ( (lv_value_14_0= ruleUnset ) ) ) | ( () ( ( ruleQualifiedName ) ) ( (lv_index_17_0= ruleArraySize ) )? ) ) ( ( (lv_exprValue_18_0= RULE_NUL ) ) ( (lv_hasAttribute_19_0= RULE_INT ) ) )?
            {
            // InternalDdParser.g:4034:3: ( ( () ( (lv_value_1_0= RULE_STR ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( (lv_value_5_0= RULE_DEC ) ) ) | ( () ( (lv_value_7_0= RULE_CHR ) ) ) | ( () ( (otherlv_9= RULE_CSTID ) ) ( (lv_index_10_0= ruleArraySize ) )? ) | ( () ( (lv_value_12_0= ruleBoolean ) ) ) | ( () ( (lv_value_14_0= ruleUnset ) ) ) | ( () ( ( ruleQualifiedName ) ) ( (lv_index_17_0= ruleArraySize ) )? ) )
            int alt66=8;
            switch ( input.LA(1) ) {
            case RULE_STR:
                {
                alt66=1;
                }
                break;
            case RULE_INT:
                {
                alt66=2;
                }
                break;
            case RULE_DEC:
                {
                alt66=3;
                }
                break;
            case RULE_CHR:
                {
                alt66=4;
                }
                break;
            case RULE_CSTID:
                {
                alt66=5;
                }
                break;
            case False:
            case True:
                {
                alt66=6;
                }
                break;
            case Unset:
                {
                alt66=7;
                }
                break;
            case RULE_OBJID:
            case RULE_ID:
                {
                alt66=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }

            switch (alt66) {
                case 1 :
                    // InternalDdParser.g:4035:4: ( () ( (lv_value_1_0= RULE_STR ) ) )
                    {
                    // InternalDdParser.g:4035:4: ( () ( (lv_value_1_0= RULE_STR ) ) )
                    // InternalDdParser.g:4036:5: () ( (lv_value_1_0= RULE_STR ) )
                    {
                    // InternalDdParser.g:4036:5: ()
                    // InternalDdParser.g:4037:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElement(
                      							grammarAccess.getTerminalExpressionAccess().getStrValueAction_0_0_0(),
                      							current);
                      					
                    }

                    }

                    // InternalDdParser.g:4043:5: ( (lv_value_1_0= RULE_STR ) )
                    // InternalDdParser.g:4044:6: (lv_value_1_0= RULE_STR )
                    {
                    // InternalDdParser.g:4044:6: (lv_value_1_0= RULE_STR )
                    // InternalDdParser.g:4045:7: lv_value_1_0= RULE_STR
                    {
                    lv_value_1_0=(Token)match(input,RULE_STR,FOLLOW_41); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_value_1_0, grammarAccess.getTerminalExpressionAccess().getValueSTRTerminalRuleCall_0_0_1_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getTerminalExpressionRule());
                      							}
                      							setWithLastConsumed(
                      								current,
                      								"value",
                      								lv_value_1_0,
                      								"com.shark.lang.Dd.STR");
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDdParser.g:4063:4: ( () ( (lv_value_3_0= RULE_INT ) ) )
                    {
                    // InternalDdParser.g:4063:4: ( () ( (lv_value_3_0= RULE_INT ) ) )
                    // InternalDdParser.g:4064:5: () ( (lv_value_3_0= RULE_INT ) )
                    {
                    // InternalDdParser.g:4064:5: ()
                    // InternalDdParser.g:4065:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElement(
                      							grammarAccess.getTerminalExpressionAccess().getIntValueAction_0_1_0(),
                      							current);
                      					
                    }

                    }

                    // InternalDdParser.g:4071:5: ( (lv_value_3_0= RULE_INT ) )
                    // InternalDdParser.g:4072:6: (lv_value_3_0= RULE_INT )
                    {
                    // InternalDdParser.g:4072:6: (lv_value_3_0= RULE_INT )
                    // InternalDdParser.g:4073:7: lv_value_3_0= RULE_INT
                    {
                    lv_value_3_0=(Token)match(input,RULE_INT,FOLLOW_41); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_value_3_0, grammarAccess.getTerminalExpressionAccess().getValueINTTerminalRuleCall_0_1_1_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getTerminalExpressionRule());
                      							}
                      							setWithLastConsumed(
                      								current,
                      								"value",
                      								lv_value_3_0,
                      								"com.shark.lang.Dd.INT");
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalDdParser.g:4091:4: ( () ( (lv_value_5_0= RULE_DEC ) ) )
                    {
                    // InternalDdParser.g:4091:4: ( () ( (lv_value_5_0= RULE_DEC ) ) )
                    // InternalDdParser.g:4092:5: () ( (lv_value_5_0= RULE_DEC ) )
                    {
                    // InternalDdParser.g:4092:5: ()
                    // InternalDdParser.g:4093:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElement(
                      							grammarAccess.getTerminalExpressionAccess().getDecValueAction_0_2_0(),
                      							current);
                      					
                    }

                    }

                    // InternalDdParser.g:4099:5: ( (lv_value_5_0= RULE_DEC ) )
                    // InternalDdParser.g:4100:6: (lv_value_5_0= RULE_DEC )
                    {
                    // InternalDdParser.g:4100:6: (lv_value_5_0= RULE_DEC )
                    // InternalDdParser.g:4101:7: lv_value_5_0= RULE_DEC
                    {
                    lv_value_5_0=(Token)match(input,RULE_DEC,FOLLOW_41); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_value_5_0, grammarAccess.getTerminalExpressionAccess().getValueDECTerminalRuleCall_0_2_1_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getTerminalExpressionRule());
                      							}
                      							setWithLastConsumed(
                      								current,
                      								"value",
                      								lv_value_5_0,
                      								"com.shark.lang.Dd.DEC");
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalDdParser.g:4119:4: ( () ( (lv_value_7_0= RULE_CHR ) ) )
                    {
                    // InternalDdParser.g:4119:4: ( () ( (lv_value_7_0= RULE_CHR ) ) )
                    // InternalDdParser.g:4120:5: () ( (lv_value_7_0= RULE_CHR ) )
                    {
                    // InternalDdParser.g:4120:5: ()
                    // InternalDdParser.g:4121:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElement(
                      							grammarAccess.getTerminalExpressionAccess().getChrValueAction_0_3_0(),
                      							current);
                      					
                    }

                    }

                    // InternalDdParser.g:4127:5: ( (lv_value_7_0= RULE_CHR ) )
                    // InternalDdParser.g:4128:6: (lv_value_7_0= RULE_CHR )
                    {
                    // InternalDdParser.g:4128:6: (lv_value_7_0= RULE_CHR )
                    // InternalDdParser.g:4129:7: lv_value_7_0= RULE_CHR
                    {
                    lv_value_7_0=(Token)match(input,RULE_CHR,FOLLOW_41); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_value_7_0, grammarAccess.getTerminalExpressionAccess().getValueCHRTerminalRuleCall_0_3_1_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getTerminalExpressionRule());
                      							}
                      							setWithLastConsumed(
                      								current,
                      								"value",
                      								lv_value_7_0,
                      								"com.shark.lang.Dd.CHR");
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalDdParser.g:4147:4: ( () ( (otherlv_9= RULE_CSTID ) ) ( (lv_index_10_0= ruleArraySize ) )? )
                    {
                    // InternalDdParser.g:4147:4: ( () ( (otherlv_9= RULE_CSTID ) ) ( (lv_index_10_0= ruleArraySize ) )? )
                    // InternalDdParser.g:4148:5: () ( (otherlv_9= RULE_CSTID ) ) ( (lv_index_10_0= ruleArraySize ) )?
                    {
                    // InternalDdParser.g:4148:5: ()
                    // InternalDdParser.g:4149:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElement(
                      							grammarAccess.getTerminalExpressionAccess().getCstValueAction_0_4_0(),
                      							current);
                      					
                    }

                    }

                    // InternalDdParser.g:4155:5: ( (otherlv_9= RULE_CSTID ) )
                    // InternalDdParser.g:4156:6: (otherlv_9= RULE_CSTID )
                    {
                    // InternalDdParser.g:4156:6: (otherlv_9= RULE_CSTID )
                    // InternalDdParser.g:4157:7: otherlv_9= RULE_CSTID
                    {
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getTerminalExpressionRule());
                      							}
                      						
                    }
                    otherlv_9=(Token)match(input,RULE_CSTID,FOLLOW_69); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(otherlv_9, grammarAccess.getTerminalExpressionAccess().getValueConstantCrossReference_0_4_1_0());
                      						
                    }

                    }


                    }

                    // InternalDdParser.g:4168:5: ( (lv_index_10_0= ruleArraySize ) )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==LeftSquareBracket) ) {
                        alt64=1;
                    }
                    switch (alt64) {
                        case 1 :
                            // InternalDdParser.g:4169:6: (lv_index_10_0= ruleArraySize )
                            {
                            // InternalDdParser.g:4169:6: (lv_index_10_0= ruleArraySize )
                            // InternalDdParser.g:4170:7: lv_index_10_0= ruleArraySize
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getTerminalExpressionAccess().getIndexArraySizeParserRuleCall_0_4_2_0());
                              						
                            }
                            pushFollow(FOLLOW_41);
                            lv_index_10_0=ruleArraySize();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getTerminalExpressionRule());
                              							}
                              							set(
                              								current,
                              								"index",
                              								lv_index_10_0,
                              								"com.shark.lang.Dd.ArraySize");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalDdParser.g:4189:4: ( () ( (lv_value_12_0= ruleBoolean ) ) )
                    {
                    // InternalDdParser.g:4189:4: ( () ( (lv_value_12_0= ruleBoolean ) ) )
                    // InternalDdParser.g:4190:5: () ( (lv_value_12_0= ruleBoolean ) )
                    {
                    // InternalDdParser.g:4190:5: ()
                    // InternalDdParser.g:4191:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElement(
                      							grammarAccess.getTerminalExpressionAccess().getBoolValueAction_0_5_0(),
                      							current);
                      					
                    }

                    }

                    // InternalDdParser.g:4197:5: ( (lv_value_12_0= ruleBoolean ) )
                    // InternalDdParser.g:4198:6: (lv_value_12_0= ruleBoolean )
                    {
                    // InternalDdParser.g:4198:6: (lv_value_12_0= ruleBoolean )
                    // InternalDdParser.g:4199:7: lv_value_12_0= ruleBoolean
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getTerminalExpressionAccess().getValueBooleanEnumRuleCall_0_5_1_0());
                      						
                    }
                    pushFollow(FOLLOW_41);
                    lv_value_12_0=ruleBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getTerminalExpressionRule());
                      							}
                      							set(
                      								current,
                      								"value",
                      								lv_value_12_0,
                      								"com.shark.lang.Dd.Boolean");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalDdParser.g:4218:4: ( () ( (lv_value_14_0= ruleUnset ) ) )
                    {
                    // InternalDdParser.g:4218:4: ( () ( (lv_value_14_0= ruleUnset ) ) )
                    // InternalDdParser.g:4219:5: () ( (lv_value_14_0= ruleUnset ) )
                    {
                    // InternalDdParser.g:4219:5: ()
                    // InternalDdParser.g:4220:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElement(
                      							grammarAccess.getTerminalExpressionAccess().getUnsetValueAction_0_6_0(),
                      							current);
                      					
                    }

                    }

                    // InternalDdParser.g:4226:5: ( (lv_value_14_0= ruleUnset ) )
                    // InternalDdParser.g:4227:6: (lv_value_14_0= ruleUnset )
                    {
                    // InternalDdParser.g:4227:6: (lv_value_14_0= ruleUnset )
                    // InternalDdParser.g:4228:7: lv_value_14_0= ruleUnset
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getTerminalExpressionAccess().getValueUnsetEnumRuleCall_0_6_1_0());
                      						
                    }
                    pushFollow(FOLLOW_41);
                    lv_value_14_0=ruleUnset();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getTerminalExpressionRule());
                      							}
                      							set(
                      								current,
                      								"value",
                      								lv_value_14_0,
                      								"com.shark.lang.Dd.Unset");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalDdParser.g:4247:4: ( () ( ( ruleQualifiedName ) ) ( (lv_index_17_0= ruleArraySize ) )? )
                    {
                    // InternalDdParser.g:4247:4: ( () ( ( ruleQualifiedName ) ) ( (lv_index_17_0= ruleArraySize ) )? )
                    // InternalDdParser.g:4248:5: () ( ( ruleQualifiedName ) ) ( (lv_index_17_0= ruleArraySize ) )?
                    {
                    // InternalDdParser.g:4248:5: ()
                    // InternalDdParser.g:4249:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElement(
                      							grammarAccess.getTerminalExpressionAccess().getAttributeValueAction_0_7_0(),
                      							current);
                      					
                    }

                    }

                    // InternalDdParser.g:4255:5: ( ( ruleQualifiedName ) )
                    // InternalDdParser.g:4256:6: ( ruleQualifiedName )
                    {
                    // InternalDdParser.g:4256:6: ( ruleQualifiedName )
                    // InternalDdParser.g:4257:7: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getTerminalExpressionRule());
                      							}
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getTerminalExpressionAccess().getValueAttributeCrossReference_0_7_1_0());
                      						
                    }
                    pushFollow(FOLLOW_69);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalDdParser.g:4271:5: ( (lv_index_17_0= ruleArraySize ) )?
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==LeftSquareBracket) ) {
                        alt65=1;
                    }
                    switch (alt65) {
                        case 1 :
                            // InternalDdParser.g:4272:6: (lv_index_17_0= ruleArraySize )
                            {
                            // InternalDdParser.g:4272:6: (lv_index_17_0= ruleArraySize )
                            // InternalDdParser.g:4273:7: lv_index_17_0= ruleArraySize
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getTerminalExpressionAccess().getIndexArraySizeParserRuleCall_0_7_2_0());
                              						
                            }
                            pushFollow(FOLLOW_41);
                            lv_index_17_0=ruleArraySize();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getTerminalExpressionRule());
                              							}
                              							set(
                              								current,
                              								"index",
                              								lv_index_17_0,
                              								"com.shark.lang.Dd.ArraySize");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // InternalDdParser.g:4292:3: ( ( (lv_exprValue_18_0= RULE_NUL ) ) ( (lv_hasAttribute_19_0= RULE_INT ) ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==RULE_NUL) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalDdParser.g:4293:4: ( (lv_exprValue_18_0= RULE_NUL ) ) ( (lv_hasAttribute_19_0= RULE_INT ) )
                    {
                    // InternalDdParser.g:4293:4: ( (lv_exprValue_18_0= RULE_NUL ) )
                    // InternalDdParser.g:4294:5: (lv_exprValue_18_0= RULE_NUL )
                    {
                    // InternalDdParser.g:4294:5: (lv_exprValue_18_0= RULE_NUL )
                    // InternalDdParser.g:4295:6: lv_exprValue_18_0= RULE_NUL
                    {
                    lv_exprValue_18_0=(Token)match(input,RULE_NUL,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_exprValue_18_0, grammarAccess.getTerminalExpressionAccess().getExprValueNULTerminalRuleCall_1_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTerminalExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"exprValue",
                      							lv_exprValue_18_0,
                      							"com.shark.lang.Dd.NUL");
                      					
                    }

                    }


                    }

                    // InternalDdParser.g:4311:4: ( (lv_hasAttribute_19_0= RULE_INT ) )
                    // InternalDdParser.g:4312:5: (lv_hasAttribute_19_0= RULE_INT )
                    {
                    // InternalDdParser.g:4312:5: (lv_hasAttribute_19_0= RULE_INT )
                    // InternalDdParser.g:4313:6: lv_hasAttribute_19_0= RULE_INT
                    {
                    lv_hasAttribute_19_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_hasAttribute_19_0, grammarAccess.getTerminalExpressionAccess().getHasAttributeINTTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTerminalExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"hasAttribute",
                      							lv_hasAttribute_19_0,
                      							"com.shark.lang.Dd.INT");
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTerminalExpression"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalDdParser.g:4334:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalDdParser.g:4334:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalDdParser.g:4335:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalDdParser.g:4341:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_OBJID_0= RULE_OBJID kw= FullStop )? this_ID_2= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_OBJID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalDdParser.g:4347:2: ( ( (this_OBJID_0= RULE_OBJID kw= FullStop )? this_ID_2= RULE_ID ) )
            // InternalDdParser.g:4348:2: ( (this_OBJID_0= RULE_OBJID kw= FullStop )? this_ID_2= RULE_ID )
            {
            // InternalDdParser.g:4348:2: ( (this_OBJID_0= RULE_OBJID kw= FullStop )? this_ID_2= RULE_ID )
            // InternalDdParser.g:4349:3: (this_OBJID_0= RULE_OBJID kw= FullStop )? this_ID_2= RULE_ID
            {
            // InternalDdParser.g:4349:3: (this_OBJID_0= RULE_OBJID kw= FullStop )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==RULE_OBJID) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalDdParser.g:4350:4: this_OBJID_0= RULE_OBJID kw= FullStop
                    {
                    this_OBJID_0=(Token)match(input,RULE_OBJID,FOLLOW_70); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_OBJID_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_OBJID_0, grammarAccess.getQualifiedNameAccess().getOBJIDTerminalRuleCall_0_0());
                      			
                    }
                    kw=(Token)match(input,FullStop,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_0_1());
                      			
                    }

                    }
                    break;

            }

            this_ID_2=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_2);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleLineComment"
    // InternalDdParser.g:4374:1: entryRuleLineComment returns [EObject current=null] : iv_ruleLineComment= ruleLineComment EOF ;
    public final EObject entryRuleLineComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLineComment = null;


        try {
            // InternalDdParser.g:4374:52: (iv_ruleLineComment= ruleLineComment EOF )
            // InternalDdParser.g:4375:2: iv_ruleLineComment= ruleLineComment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLineCommentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLineComment=ruleLineComment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLineComment; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLineComment"


    // $ANTLR start "ruleLineComment"
    // InternalDdParser.g:4381:1: ruleLineComment returns [EObject current=null] : ( () ( (lv_line_1_0= RULE_CMT ) ) this_EOL_2= RULE_EOL ) ;
    public final EObject ruleLineComment() throws RecognitionException {
        EObject current = null;

        Token lv_line_1_0=null;
        Token this_EOL_2=null;


        	enterRule();

        try {
            // InternalDdParser.g:4387:2: ( ( () ( (lv_line_1_0= RULE_CMT ) ) this_EOL_2= RULE_EOL ) )
            // InternalDdParser.g:4388:2: ( () ( (lv_line_1_0= RULE_CMT ) ) this_EOL_2= RULE_EOL )
            {
            // InternalDdParser.g:4388:2: ( () ( (lv_line_1_0= RULE_CMT ) ) this_EOL_2= RULE_EOL )
            // InternalDdParser.g:4389:3: () ( (lv_line_1_0= RULE_CMT ) ) this_EOL_2= RULE_EOL
            {
            // InternalDdParser.g:4389:3: ()
            // InternalDdParser.g:4390:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getLineCommentAccess().getCommentAction_0(),
              					current);
              			
            }

            }

            // InternalDdParser.g:4396:3: ( (lv_line_1_0= RULE_CMT ) )
            // InternalDdParser.g:4397:4: (lv_line_1_0= RULE_CMT )
            {
            // InternalDdParser.g:4397:4: (lv_line_1_0= RULE_CMT )
            // InternalDdParser.g:4398:5: lv_line_1_0= RULE_CMT
            {
            lv_line_1_0=(Token)match(input,RULE_CMT,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_line_1_0, grammarAccess.getLineCommentAccess().getLineCMTTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getLineCommentRule());
              					}
              					setWithLastConsumed(
              						current,
              						"line",
              						lv_line_1_0,
              						"com.shark.lang.Dd.CMT");
              				
            }

            }


            }

            this_EOL_2=(Token)match(input,RULE_EOL,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_EOL_2, grammarAccess.getLineCommentAccess().getEOLTerminalRuleCall_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLineComment"


    // $ANTLR start "entryRuleTrailComment"
    // InternalDdParser.g:4422:1: entryRuleTrailComment returns [EObject current=null] : iv_ruleTrailComment= ruleTrailComment EOF ;
    public final EObject entryRuleTrailComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrailComment = null;


        try {
            // InternalDdParser.g:4422:53: (iv_ruleTrailComment= ruleTrailComment EOF )
            // InternalDdParser.g:4423:2: iv_ruleTrailComment= ruleTrailComment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTrailCommentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTrailComment=ruleTrailComment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTrailComment; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTrailComment"


    // $ANTLR start "ruleTrailComment"
    // InternalDdParser.g:4429:1: ruleTrailComment returns [EObject current=null] : ( () ( (lv_line_1_0= RULE_CMT ) ) ) ;
    public final EObject ruleTrailComment() throws RecognitionException {
        EObject current = null;

        Token lv_line_1_0=null;


        	enterRule();

        try {
            // InternalDdParser.g:4435:2: ( ( () ( (lv_line_1_0= RULE_CMT ) ) ) )
            // InternalDdParser.g:4436:2: ( () ( (lv_line_1_0= RULE_CMT ) ) )
            {
            // InternalDdParser.g:4436:2: ( () ( (lv_line_1_0= RULE_CMT ) ) )
            // InternalDdParser.g:4437:3: () ( (lv_line_1_0= RULE_CMT ) )
            {
            // InternalDdParser.g:4437:3: ()
            // InternalDdParser.g:4438:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getTrailCommentAccess().getCommentAction_0(),
              					current);
              			
            }

            }

            // InternalDdParser.g:4444:3: ( (lv_line_1_0= RULE_CMT ) )
            // InternalDdParser.g:4445:4: (lv_line_1_0= RULE_CMT )
            {
            // InternalDdParser.g:4445:4: (lv_line_1_0= RULE_CMT )
            // InternalDdParser.g:4446:5: lv_line_1_0= RULE_CMT
            {
            lv_line_1_0=(Token)match(input,RULE_CMT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_line_1_0, grammarAccess.getTrailCommentAccess().getLineCMTTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTrailCommentRule());
              					}
              					setWithLastConsumed(
              						current,
              						"line",
              						lv_line_1_0,
              						"com.shark.lang.Dd.CMT");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTrailComment"


    // $ANTLR start "ruleBinaryOperator"
    // InternalDdParser.g:4466:1: ruleBinaryOperator returns [Enumerator current=null] : ( (enumLiteral_0= Or ) | (enumLiteral_1= And ) | (enumLiteral_2= PlusSign ) | (enumLiteral_3= HyphenMinus ) | (enumLiteral_4= Asterisk ) | (enumLiteral_5= Solidus ) | (enumLiteral_6= PercentSign ) | (enumLiteral_7= EqualsSignEqualsSign ) | (enumLiteral_8= GreaterThanSign ) | (enumLiteral_9= LessThanSign ) | (enumLiteral_10= LessThanSignEqualsSign ) | (enumLiteral_11= GreaterThanSignEqualsSign ) | (enumLiteral_12= CircumflexAccent ) | (enumLiteral_13= Like ) | (enumLiteral_14= ExclamationMarkEqualsSign ) | (enumLiteral_15= Ampersand ) | (enumLiteral_16= In ) | (enumLiteral_17= Stxt ) | (enumLiteral_18= Round ) ) ;
    public final Enumerator ruleBinaryOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;
        Token enumLiteral_12=null;
        Token enumLiteral_13=null;
        Token enumLiteral_14=null;
        Token enumLiteral_15=null;
        Token enumLiteral_16=null;
        Token enumLiteral_17=null;
        Token enumLiteral_18=null;


        	enterRule();

        try {
            // InternalDdParser.g:4472:2: ( ( (enumLiteral_0= Or ) | (enumLiteral_1= And ) | (enumLiteral_2= PlusSign ) | (enumLiteral_3= HyphenMinus ) | (enumLiteral_4= Asterisk ) | (enumLiteral_5= Solidus ) | (enumLiteral_6= PercentSign ) | (enumLiteral_7= EqualsSignEqualsSign ) | (enumLiteral_8= GreaterThanSign ) | (enumLiteral_9= LessThanSign ) | (enumLiteral_10= LessThanSignEqualsSign ) | (enumLiteral_11= GreaterThanSignEqualsSign ) | (enumLiteral_12= CircumflexAccent ) | (enumLiteral_13= Like ) | (enumLiteral_14= ExclamationMarkEqualsSign ) | (enumLiteral_15= Ampersand ) | (enumLiteral_16= In ) | (enumLiteral_17= Stxt ) | (enumLiteral_18= Round ) ) )
            // InternalDdParser.g:4473:2: ( (enumLiteral_0= Or ) | (enumLiteral_1= And ) | (enumLiteral_2= PlusSign ) | (enumLiteral_3= HyphenMinus ) | (enumLiteral_4= Asterisk ) | (enumLiteral_5= Solidus ) | (enumLiteral_6= PercentSign ) | (enumLiteral_7= EqualsSignEqualsSign ) | (enumLiteral_8= GreaterThanSign ) | (enumLiteral_9= LessThanSign ) | (enumLiteral_10= LessThanSignEqualsSign ) | (enumLiteral_11= GreaterThanSignEqualsSign ) | (enumLiteral_12= CircumflexAccent ) | (enumLiteral_13= Like ) | (enumLiteral_14= ExclamationMarkEqualsSign ) | (enumLiteral_15= Ampersand ) | (enumLiteral_16= In ) | (enumLiteral_17= Stxt ) | (enumLiteral_18= Round ) )
            {
            // InternalDdParser.g:4473:2: ( (enumLiteral_0= Or ) | (enumLiteral_1= And ) | (enumLiteral_2= PlusSign ) | (enumLiteral_3= HyphenMinus ) | (enumLiteral_4= Asterisk ) | (enumLiteral_5= Solidus ) | (enumLiteral_6= PercentSign ) | (enumLiteral_7= EqualsSignEqualsSign ) | (enumLiteral_8= GreaterThanSign ) | (enumLiteral_9= LessThanSign ) | (enumLiteral_10= LessThanSignEqualsSign ) | (enumLiteral_11= GreaterThanSignEqualsSign ) | (enumLiteral_12= CircumflexAccent ) | (enumLiteral_13= Like ) | (enumLiteral_14= ExclamationMarkEqualsSign ) | (enumLiteral_15= Ampersand ) | (enumLiteral_16= In ) | (enumLiteral_17= Stxt ) | (enumLiteral_18= Round ) )
            int alt69=19;
            switch ( input.LA(1) ) {
            case Or:
                {
                alt69=1;
                }
                break;
            case And:
                {
                alt69=2;
                }
                break;
            case PlusSign:
                {
                alt69=3;
                }
                break;
            case HyphenMinus:
                {
                alt69=4;
                }
                break;
            case Asterisk:
                {
                alt69=5;
                }
                break;
            case Solidus:
                {
                alt69=6;
                }
                break;
            case PercentSign:
                {
                alt69=7;
                }
                break;
            case EqualsSignEqualsSign:
                {
                alt69=8;
                }
                break;
            case GreaterThanSign:
                {
                alt69=9;
                }
                break;
            case LessThanSign:
                {
                alt69=10;
                }
                break;
            case LessThanSignEqualsSign:
                {
                alt69=11;
                }
                break;
            case GreaterThanSignEqualsSign:
                {
                alt69=12;
                }
                break;
            case CircumflexAccent:
                {
                alt69=13;
                }
                break;
            case Like:
                {
                alt69=14;
                }
                break;
            case ExclamationMarkEqualsSign:
                {
                alt69=15;
                }
                break;
            case Ampersand:
                {
                alt69=16;
                }
                break;
            case In:
                {
                alt69=17;
                }
                break;
            case Stxt:
                {
                alt69=18;
                }
                break;
            case Round:
                {
                alt69=19;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }

            switch (alt69) {
                case 1 :
                    // InternalDdParser.g:4474:3: (enumLiteral_0= Or )
                    {
                    // InternalDdParser.g:4474:3: (enumLiteral_0= Or )
                    // InternalDdParser.g:4475:4: enumLiteral_0= Or
                    {
                    enumLiteral_0=(Token)match(input,Or,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBinaryOperatorAccess().getOpOrEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getBinaryOperatorAccess().getOpOrEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDdParser.g:4482:3: (enumLiteral_1= And )
                    {
                    // InternalDdParser.g:4482:3: (enumLiteral_1= And )
                    // InternalDdParser.g:4483:4: enumLiteral_1= And
                    {
                    enumLiteral_1=(Token)match(input,And,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBinaryOperatorAccess().getOpAndEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getBinaryOperatorAccess().getOpAndEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDdParser.g:4490:3: (enumLiteral_2= PlusSign )
                    {
                    // InternalDdParser.g:4490:3: (enumLiteral_2= PlusSign )
                    // InternalDdParser.g:4491:4: enumLiteral_2= PlusSign
                    {
                    enumLiteral_2=(Token)match(input,PlusSign,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBinaryOperatorAccess().getOpAddEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getBinaryOperatorAccess().getOpAddEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDdParser.g:4498:3: (enumLiteral_3= HyphenMinus )
                    {
                    // InternalDdParser.g:4498:3: (enumLiteral_3= HyphenMinus )
                    // InternalDdParser.g:4499:4: enumLiteral_3= HyphenMinus
                    {
                    enumLiteral_3=(Token)match(input,HyphenMinus,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBinaryOperatorAccess().getOpMinEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getBinaryOperatorAccess().getOpMinEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalDdParser.g:4506:3: (enumLiteral_4= Asterisk )
                    {
                    // InternalDdParser.g:4506:3: (enumLiteral_4= Asterisk )
                    // InternalDdParser.g:4507:4: enumLiteral_4= Asterisk
                    {
                    enumLiteral_4=(Token)match(input,Asterisk,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBinaryOperatorAccess().getOpMultEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getBinaryOperatorAccess().getOpMultEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalDdParser.g:4514:3: (enumLiteral_5= Solidus )
                    {
                    // InternalDdParser.g:4514:3: (enumLiteral_5= Solidus )
                    // InternalDdParser.g:4515:4: enumLiteral_5= Solidus
                    {
                    enumLiteral_5=(Token)match(input,Solidus,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBinaryOperatorAccess().getOpDivEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getBinaryOperatorAccess().getOpDivEnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalDdParser.g:4522:3: (enumLiteral_6= PercentSign )
                    {
                    // InternalDdParser.g:4522:3: (enumLiteral_6= PercentSign )
                    // InternalDdParser.g:4523:4: enumLiteral_6= PercentSign
                    {
                    enumLiteral_6=(Token)match(input,PercentSign,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBinaryOperatorAccess().getOpModEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_6, grammarAccess.getBinaryOperatorAccess().getOpModEnumLiteralDeclaration_6());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalDdParser.g:4530:3: (enumLiteral_7= EqualsSignEqualsSign )
                    {
                    // InternalDdParser.g:4530:3: (enumLiteral_7= EqualsSignEqualsSign )
                    // InternalDdParser.g:4531:4: enumLiteral_7= EqualsSignEqualsSign
                    {
                    enumLiteral_7=(Token)match(input,EqualsSignEqualsSign,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBinaryOperatorAccess().getOpEqEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_7, grammarAccess.getBinaryOperatorAccess().getOpEqEnumLiteralDeclaration_7());
                      			
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalDdParser.g:4538:3: (enumLiteral_8= GreaterThanSign )
                    {
                    // InternalDdParser.g:4538:3: (enumLiteral_8= GreaterThanSign )
                    // InternalDdParser.g:4539:4: enumLiteral_8= GreaterThanSign
                    {
                    enumLiteral_8=(Token)match(input,GreaterThanSign,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBinaryOperatorAccess().getOpGtEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_8, grammarAccess.getBinaryOperatorAccess().getOpGtEnumLiteralDeclaration_8());
                      			
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalDdParser.g:4546:3: (enumLiteral_9= LessThanSign )
                    {
                    // InternalDdParser.g:4546:3: (enumLiteral_9= LessThanSign )
                    // InternalDdParser.g:4547:4: enumLiteral_9= LessThanSign
                    {
                    enumLiteral_9=(Token)match(input,LessThanSign,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBinaryOperatorAccess().getOpLtEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_9, grammarAccess.getBinaryOperatorAccess().getOpLtEnumLiteralDeclaration_9());
                      			
                    }

                    }


                    }
                    break;
                case 11 :
                    // InternalDdParser.g:4554:3: (enumLiteral_10= LessThanSignEqualsSign )
                    {
                    // InternalDdParser.g:4554:3: (enumLiteral_10= LessThanSignEqualsSign )
                    // InternalDdParser.g:4555:4: enumLiteral_10= LessThanSignEqualsSign
                    {
                    enumLiteral_10=(Token)match(input,LessThanSignEqualsSign,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBinaryOperatorAccess().getOpLteEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_10, grammarAccess.getBinaryOperatorAccess().getOpLteEnumLiteralDeclaration_10());
                      			
                    }

                    }


                    }
                    break;
                case 12 :
                    // InternalDdParser.g:4562:3: (enumLiteral_11= GreaterThanSignEqualsSign )
                    {
                    // InternalDdParser.g:4562:3: (enumLiteral_11= GreaterThanSignEqualsSign )
                    // InternalDdParser.g:4563:4: enumLiteral_11= GreaterThanSignEqualsSign
                    {
                    enumLiteral_11=(Token)match(input,GreaterThanSignEqualsSign,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBinaryOperatorAccess().getOpGteEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_11, grammarAccess.getBinaryOperatorAccess().getOpGteEnumLiteralDeclaration_11());
                      			
                    }

                    }


                    }
                    break;
                case 13 :
                    // InternalDdParser.g:4570:3: (enumLiteral_12= CircumflexAccent )
                    {
                    // InternalDdParser.g:4570:3: (enumLiteral_12= CircumflexAccent )
                    // InternalDdParser.g:4571:4: enumLiteral_12= CircumflexAccent
                    {
                    enumLiteral_12=(Token)match(input,CircumflexAccent,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBinaryOperatorAccess().getOpPowEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_12, grammarAccess.getBinaryOperatorAccess().getOpPowEnumLiteralDeclaration_12());
                      			
                    }

                    }


                    }
                    break;
                case 14 :
                    // InternalDdParser.g:4578:3: (enumLiteral_13= Like )
                    {
                    // InternalDdParser.g:4578:3: (enumLiteral_13= Like )
                    // InternalDdParser.g:4579:4: enumLiteral_13= Like
                    {
                    enumLiteral_13=(Token)match(input,Like,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBinaryOperatorAccess().getOpLikeEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_13, grammarAccess.getBinaryOperatorAccess().getOpLikeEnumLiteralDeclaration_13());
                      			
                    }

                    }


                    }
                    break;
                case 15 :
                    // InternalDdParser.g:4586:3: (enumLiteral_14= ExclamationMarkEqualsSign )
                    {
                    // InternalDdParser.g:4586:3: (enumLiteral_14= ExclamationMarkEqualsSign )
                    // InternalDdParser.g:4587:4: enumLiteral_14= ExclamationMarkEqualsSign
                    {
                    enumLiteral_14=(Token)match(input,ExclamationMarkEqualsSign,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBinaryOperatorAccess().getOpDifEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_14, grammarAccess.getBinaryOperatorAccess().getOpDifEnumLiteralDeclaration_14());
                      			
                    }

                    }


                    }
                    break;
                case 16 :
                    // InternalDdParser.g:4594:3: (enumLiteral_15= Ampersand )
                    {
                    // InternalDdParser.g:4594:3: (enumLiteral_15= Ampersand )
                    // InternalDdParser.g:4595:4: enumLiteral_15= Ampersand
                    {
                    enumLiteral_15=(Token)match(input,Ampersand,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBinaryOperatorAccess().getOpCatEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_15, grammarAccess.getBinaryOperatorAccess().getOpCatEnumLiteralDeclaration_15());
                      			
                    }

                    }


                    }
                    break;
                case 17 :
                    // InternalDdParser.g:4602:3: (enumLiteral_16= In )
                    {
                    // InternalDdParser.g:4602:3: (enumLiteral_16= In )
                    // InternalDdParser.g:4603:4: enumLiteral_16= In
                    {
                    enumLiteral_16=(Token)match(input,In,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBinaryOperatorAccess().getOpInEnumLiteralDeclaration_16().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_16, grammarAccess.getBinaryOperatorAccess().getOpInEnumLiteralDeclaration_16());
                      			
                    }

                    }


                    }
                    break;
                case 18 :
                    // InternalDdParser.g:4610:3: (enumLiteral_17= Stxt )
                    {
                    // InternalDdParser.g:4610:3: (enumLiteral_17= Stxt )
                    // InternalDdParser.g:4611:4: enumLiteral_17= Stxt
                    {
                    enumLiteral_17=(Token)match(input,Stxt,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBinaryOperatorAccess().getOpStxtEnumLiteralDeclaration_17().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_17, grammarAccess.getBinaryOperatorAccess().getOpStxtEnumLiteralDeclaration_17());
                      			
                    }

                    }


                    }
                    break;
                case 19 :
                    // InternalDdParser.g:4618:3: (enumLiteral_18= Round )
                    {
                    // InternalDdParser.g:4618:3: (enumLiteral_18= Round )
                    // InternalDdParser.g:4619:4: enumLiteral_18= Round
                    {
                    enumLiteral_18=(Token)match(input,Round,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBinaryOperatorAccess().getOpRoundEnumLiteralDeclaration_18().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_18, grammarAccess.getBinaryOperatorAccess().getOpRoundEnumLiteralDeclaration_18());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBinaryOperator"


    // $ANTLR start "ruleUnaryOperator"
    // InternalDdParser.g:4629:1: ruleUnaryOperator returns [Enumerator current=null] : ( (enumLiteral_0= Not ) | (enumLiteral_1= HyphenMinus ) | (enumLiteral_2= Str ) | (enumLiteral_3= Int ) | (enumLiteral_4= Dec ) | (enumLiteral_5= Date ) | (enumLiteral_6= Time ) | (enumLiteral_7= Len ) | (enumLiteral_8= Stamp ) ) ;
    public final Enumerator ruleUnaryOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;


        	enterRule();

        try {
            // InternalDdParser.g:4635:2: ( ( (enumLiteral_0= Not ) | (enumLiteral_1= HyphenMinus ) | (enumLiteral_2= Str ) | (enumLiteral_3= Int ) | (enumLiteral_4= Dec ) | (enumLiteral_5= Date ) | (enumLiteral_6= Time ) | (enumLiteral_7= Len ) | (enumLiteral_8= Stamp ) ) )
            // InternalDdParser.g:4636:2: ( (enumLiteral_0= Not ) | (enumLiteral_1= HyphenMinus ) | (enumLiteral_2= Str ) | (enumLiteral_3= Int ) | (enumLiteral_4= Dec ) | (enumLiteral_5= Date ) | (enumLiteral_6= Time ) | (enumLiteral_7= Len ) | (enumLiteral_8= Stamp ) )
            {
            // InternalDdParser.g:4636:2: ( (enumLiteral_0= Not ) | (enumLiteral_1= HyphenMinus ) | (enumLiteral_2= Str ) | (enumLiteral_3= Int ) | (enumLiteral_4= Dec ) | (enumLiteral_5= Date ) | (enumLiteral_6= Time ) | (enumLiteral_7= Len ) | (enumLiteral_8= Stamp ) )
            int alt70=9;
            switch ( input.LA(1) ) {
            case Not:
                {
                alt70=1;
                }
                break;
            case HyphenMinus:
                {
                alt70=2;
                }
                break;
            case Str:
                {
                alt70=3;
                }
                break;
            case Int:
                {
                alt70=4;
                }
                break;
            case Dec:
                {
                alt70=5;
                }
                break;
            case Date:
                {
                alt70=6;
                }
                break;
            case Time:
                {
                alt70=7;
                }
                break;
            case Len:
                {
                alt70=8;
                }
                break;
            case Stamp:
                {
                alt70=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }

            switch (alt70) {
                case 1 :
                    // InternalDdParser.g:4637:3: (enumLiteral_0= Not )
                    {
                    // InternalDdParser.g:4637:3: (enumLiteral_0= Not )
                    // InternalDdParser.g:4638:4: enumLiteral_0= Not
                    {
                    enumLiteral_0=(Token)match(input,Not,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getUnaryOperatorAccess().getOpNotEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getUnaryOperatorAccess().getOpNotEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDdParser.g:4645:3: (enumLiteral_1= HyphenMinus )
                    {
                    // InternalDdParser.g:4645:3: (enumLiteral_1= HyphenMinus )
                    // InternalDdParser.g:4646:4: enumLiteral_1= HyphenMinus
                    {
                    enumLiteral_1=(Token)match(input,HyphenMinus,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getUnaryOperatorAccess().getOpNegEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getUnaryOperatorAccess().getOpNegEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDdParser.g:4653:3: (enumLiteral_2= Str )
                    {
                    // InternalDdParser.g:4653:3: (enumLiteral_2= Str )
                    // InternalDdParser.g:4654:4: enumLiteral_2= Str
                    {
                    enumLiteral_2=(Token)match(input,Str,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getUnaryOperatorAccess().getStrCastEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getUnaryOperatorAccess().getStrCastEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDdParser.g:4661:3: (enumLiteral_3= Int )
                    {
                    // InternalDdParser.g:4661:3: (enumLiteral_3= Int )
                    // InternalDdParser.g:4662:4: enumLiteral_3= Int
                    {
                    enumLiteral_3=(Token)match(input,Int,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getUnaryOperatorAccess().getIntCastEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getUnaryOperatorAccess().getIntCastEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalDdParser.g:4669:3: (enumLiteral_4= Dec )
                    {
                    // InternalDdParser.g:4669:3: (enumLiteral_4= Dec )
                    // InternalDdParser.g:4670:4: enumLiteral_4= Dec
                    {
                    enumLiteral_4=(Token)match(input,Dec,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getUnaryOperatorAccess().getDecCastEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getUnaryOperatorAccess().getDecCastEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalDdParser.g:4677:3: (enumLiteral_5= Date )
                    {
                    // InternalDdParser.g:4677:3: (enumLiteral_5= Date )
                    // InternalDdParser.g:4678:4: enumLiteral_5= Date
                    {
                    enumLiteral_5=(Token)match(input,Date,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getUnaryOperatorAccess().getDateCastEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getUnaryOperatorAccess().getDateCastEnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalDdParser.g:4685:3: (enumLiteral_6= Time )
                    {
                    // InternalDdParser.g:4685:3: (enumLiteral_6= Time )
                    // InternalDdParser.g:4686:4: enumLiteral_6= Time
                    {
                    enumLiteral_6=(Token)match(input,Time,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getUnaryOperatorAccess().getTimeCastEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_6, grammarAccess.getUnaryOperatorAccess().getTimeCastEnumLiteralDeclaration_6());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalDdParser.g:4693:3: (enumLiteral_7= Len )
                    {
                    // InternalDdParser.g:4693:3: (enumLiteral_7= Len )
                    // InternalDdParser.g:4694:4: enumLiteral_7= Len
                    {
                    enumLiteral_7=(Token)match(input,Len,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getUnaryOperatorAccess().getOpLenEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_7, grammarAccess.getUnaryOperatorAccess().getOpLenEnumLiteralDeclaration_7());
                      			
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalDdParser.g:4701:3: (enumLiteral_8= Stamp )
                    {
                    // InternalDdParser.g:4701:3: (enumLiteral_8= Stamp )
                    // InternalDdParser.g:4702:4: enumLiteral_8= Stamp
                    {
                    enumLiteral_8=(Token)match(input,Stamp,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getUnaryOperatorAccess().getStampCastEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_8, grammarAccess.getUnaryOperatorAccess().getStampCastEnumLiteralDeclaration_8());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnaryOperator"


    // $ANTLR start "ruleUnset"
    // InternalDdParser.g:4712:1: ruleUnset returns [Enumerator current=null] : (enumLiteral_0= Unset ) ;
    public final Enumerator ruleUnset() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalDdParser.g:4718:2: ( (enumLiteral_0= Unset ) )
            // InternalDdParser.g:4719:2: (enumLiteral_0= Unset )
            {
            // InternalDdParser.g:4719:2: (enumLiteral_0= Unset )
            // InternalDdParser.g:4720:3: enumLiteral_0= Unset
            {
            enumLiteral_0=(Token)match(input,Unset,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = grammarAccess.getUnsetAccess().getUnsetEnumLiteralDeclaration().getEnumLiteral().getInstance();
              			newLeafNode(enumLiteral_0, grammarAccess.getUnsetAccess().getUnsetEnumLiteralDeclaration());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnset"


    // $ANTLR start "ruleBoolean"
    // InternalDdParser.g:4729:1: ruleBoolean returns [Enumerator current=null] : ( (enumLiteral_0= True ) | (enumLiteral_1= False ) ) ;
    public final Enumerator ruleBoolean() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDdParser.g:4735:2: ( ( (enumLiteral_0= True ) | (enumLiteral_1= False ) ) )
            // InternalDdParser.g:4736:2: ( (enumLiteral_0= True ) | (enumLiteral_1= False ) )
            {
            // InternalDdParser.g:4736:2: ( (enumLiteral_0= True ) | (enumLiteral_1= False ) )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==True) ) {
                alt71=1;
            }
            else if ( (LA71_0==False) ) {
                alt71=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }
            switch (alt71) {
                case 1 :
                    // InternalDdParser.g:4737:3: (enumLiteral_0= True )
                    {
                    // InternalDdParser.g:4737:3: (enumLiteral_0= True )
                    // InternalDdParser.g:4738:4: enumLiteral_0= True
                    {
                    enumLiteral_0=(Token)match(input,True,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBooleanAccess().getTrueCstEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getBooleanAccess().getTrueCstEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDdParser.g:4745:3: (enumLiteral_1= False )
                    {
                    // InternalDdParser.g:4745:3: (enumLiteral_1= False )
                    // InternalDdParser.g:4746:4: enumLiteral_1= False
                    {
                    enumLiteral_1=(Token)match(input,False,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBooleanAccess().getFalseCstEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getBooleanAccess().getFalseCstEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "ruleDataType"
    // InternalDdParser.g:4756:1: ruleDataType returns [Enumerator current=null] : ( (enumLiteral_0= Str ) | (enumLiteral_1= Dec ) | (enumLiteral_2= Date ) | (enumLiteral_3= Time ) | (enumLiteral_4= Chr ) | (enumLiteral_5= Int ) | (enumLiteral_6= Stamp ) | (enumLiteral_7= Bits ) | (enumLiteral_8= Bool ) | (enumLiteral_9= HalfwidthHangulFillerHalfwidthHangulFillerHalfwidthHangulFiller ) ) ;
    public final Enumerator ruleDataType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;


        	enterRule();

        try {
            // InternalDdParser.g:4762:2: ( ( (enumLiteral_0= Str ) | (enumLiteral_1= Dec ) | (enumLiteral_2= Date ) | (enumLiteral_3= Time ) | (enumLiteral_4= Chr ) | (enumLiteral_5= Int ) | (enumLiteral_6= Stamp ) | (enumLiteral_7= Bits ) | (enumLiteral_8= Bool ) | (enumLiteral_9= HalfwidthHangulFillerHalfwidthHangulFillerHalfwidthHangulFiller ) ) )
            // InternalDdParser.g:4763:2: ( (enumLiteral_0= Str ) | (enumLiteral_1= Dec ) | (enumLiteral_2= Date ) | (enumLiteral_3= Time ) | (enumLiteral_4= Chr ) | (enumLiteral_5= Int ) | (enumLiteral_6= Stamp ) | (enumLiteral_7= Bits ) | (enumLiteral_8= Bool ) | (enumLiteral_9= HalfwidthHangulFillerHalfwidthHangulFillerHalfwidthHangulFiller ) )
            {
            // InternalDdParser.g:4763:2: ( (enumLiteral_0= Str ) | (enumLiteral_1= Dec ) | (enumLiteral_2= Date ) | (enumLiteral_3= Time ) | (enumLiteral_4= Chr ) | (enumLiteral_5= Int ) | (enumLiteral_6= Stamp ) | (enumLiteral_7= Bits ) | (enumLiteral_8= Bool ) | (enumLiteral_9= HalfwidthHangulFillerHalfwidthHangulFillerHalfwidthHangulFiller ) )
            int alt72=10;
            switch ( input.LA(1) ) {
            case Str:
                {
                alt72=1;
                }
                break;
            case Dec:
                {
                alt72=2;
                }
                break;
            case Date:
                {
                alt72=3;
                }
                break;
            case Time:
                {
                alt72=4;
                }
                break;
            case Chr:
                {
                alt72=5;
                }
                break;
            case Int:
                {
                alt72=6;
                }
                break;
            case Stamp:
                {
                alt72=7;
                }
                break;
            case Bits:
                {
                alt72=8;
                }
                break;
            case Bool:
                {
                alt72=9;
                }
                break;
            case HalfwidthHangulFillerHalfwidthHangulFillerHalfwidthHangulFiller:
                {
                alt72=10;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }

            switch (alt72) {
                case 1 :
                    // InternalDdParser.g:4764:3: (enumLiteral_0= Str )
                    {
                    // InternalDdParser.g:4764:3: (enumLiteral_0= Str )
                    // InternalDdParser.g:4765:4: enumLiteral_0= Str
                    {
                    enumLiteral_0=(Token)match(input,Str,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDataTypeAccess().getStrEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDataTypeAccess().getStrEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDdParser.g:4772:3: (enumLiteral_1= Dec )
                    {
                    // InternalDdParser.g:4772:3: (enumLiteral_1= Dec )
                    // InternalDdParser.g:4773:4: enumLiteral_1= Dec
                    {
                    enumLiteral_1=(Token)match(input,Dec,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDataTypeAccess().getDecEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getDataTypeAccess().getDecEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDdParser.g:4780:3: (enumLiteral_2= Date )
                    {
                    // InternalDdParser.g:4780:3: (enumLiteral_2= Date )
                    // InternalDdParser.g:4781:4: enumLiteral_2= Date
                    {
                    enumLiteral_2=(Token)match(input,Date,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDataTypeAccess().getDateEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getDataTypeAccess().getDateEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDdParser.g:4788:3: (enumLiteral_3= Time )
                    {
                    // InternalDdParser.g:4788:3: (enumLiteral_3= Time )
                    // InternalDdParser.g:4789:4: enumLiteral_3= Time
                    {
                    enumLiteral_3=(Token)match(input,Time,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDataTypeAccess().getTimeEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getDataTypeAccess().getTimeEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalDdParser.g:4796:3: (enumLiteral_4= Chr )
                    {
                    // InternalDdParser.g:4796:3: (enumLiteral_4= Chr )
                    // InternalDdParser.g:4797:4: enumLiteral_4= Chr
                    {
                    enumLiteral_4=(Token)match(input,Chr,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDataTypeAccess().getChrEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getDataTypeAccess().getChrEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalDdParser.g:4804:3: (enumLiteral_5= Int )
                    {
                    // InternalDdParser.g:4804:3: (enumLiteral_5= Int )
                    // InternalDdParser.g:4805:4: enumLiteral_5= Int
                    {
                    enumLiteral_5=(Token)match(input,Int,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDataTypeAccess().getIntEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getDataTypeAccess().getIntEnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalDdParser.g:4812:3: (enumLiteral_6= Stamp )
                    {
                    // InternalDdParser.g:4812:3: (enumLiteral_6= Stamp )
                    // InternalDdParser.g:4813:4: enumLiteral_6= Stamp
                    {
                    enumLiteral_6=(Token)match(input,Stamp,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDataTypeAccess().getStampEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_6, grammarAccess.getDataTypeAccess().getStampEnumLiteralDeclaration_6());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalDdParser.g:4820:3: (enumLiteral_7= Bits )
                    {
                    // InternalDdParser.g:4820:3: (enumLiteral_7= Bits )
                    // InternalDdParser.g:4821:4: enumLiteral_7= Bits
                    {
                    enumLiteral_7=(Token)match(input,Bits,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDataTypeAccess().getBitsEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_7, grammarAccess.getDataTypeAccess().getBitsEnumLiteralDeclaration_7());
                      			
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalDdParser.g:4828:3: (enumLiteral_8= Bool )
                    {
                    // InternalDdParser.g:4828:3: (enumLiteral_8= Bool )
                    // InternalDdParser.g:4829:4: enumLiteral_8= Bool
                    {
                    enumLiteral_8=(Token)match(input,Bool,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDataTypeAccess().getBoolEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_8, grammarAccess.getDataTypeAccess().getBoolEnumLiteralDeclaration_8());
                      			
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalDdParser.g:4836:3: (enumLiteral_9= HalfwidthHangulFillerHalfwidthHangulFillerHalfwidthHangulFiller )
                    {
                    // InternalDdParser.g:4836:3: (enumLiteral_9= HalfwidthHangulFillerHalfwidthHangulFillerHalfwidthHangulFiller )
                    // InternalDdParser.g:4837:4: enumLiteral_9= HalfwidthHangulFillerHalfwidthHangulFillerHalfwidthHangulFiller
                    {
                    enumLiteral_9=(Token)match(input,HalfwidthHangulFillerHalfwidthHangulFillerHalfwidthHangulFiller,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDataTypeAccess().getUnsetEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_9, grammarAccess.getDataTypeAccess().getUnsetEnumLiteralDeclaration_9());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataType"

    // $ANTLR start synpred1_InternalDdParser
    public final void synpred1_InternalDdParser_fragment() throws RecognitionException {   
        // InternalDdParser.g:1200:4: ( ruleRangeExpression )
        // InternalDdParser.g:1200:5: ruleRangeExpression
        {
        pushFollow(FOLLOW_2);
        ruleRangeExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalDdParser

    // $ANTLR start synpred2_InternalDdParser
    public final void synpred2_InternalDdParser_fragment() throws RecognitionException {   
        // InternalDdParser.g:1212:4: ( ruleAddExpression )
        // InternalDdParser.g:1212:5: ruleAddExpression
        {
        pushFollow(FOLLOW_2);
        ruleAddExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalDdParser

    // $ANTLR start synpred3_InternalDdParser
    public final void synpred3_InternalDdParser_fragment() throws RecognitionException {   
        // InternalDdParser.g:1224:4: ( ruleMultExpression )
        // InternalDdParser.g:1224:5: ruleMultExpression
        {
        pushFollow(FOLLOW_2);
        ruleMultExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_InternalDdParser

    // $ANTLR start synpred4_InternalDdParser
    public final void synpred4_InternalDdParser_fragment() throws RecognitionException {   
        // InternalDdParser.g:1236:4: ( ruleAndExpression )
        // InternalDdParser.g:1236:5: ruleAndExpression
        {
        pushFollow(FOLLOW_2);
        ruleAndExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_InternalDdParser

    // $ANTLR start synpred5_InternalDdParser
    public final void synpred5_InternalDdParser_fragment() throws RecognitionException {   
        // InternalDdParser.g:1248:4: ( ruleOrExpression )
        // InternalDdParser.g:1248:5: ruleOrExpression
        {
        pushFollow(FOLLOW_2);
        ruleOrExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_InternalDdParser

    // $ANTLR start synpred6_InternalDdParser
    public final void synpred6_InternalDdParser_fragment() throws RecognitionException {   
        // InternalDdParser.g:1260:4: ( ruleCatExpression )
        // InternalDdParser.g:1260:5: ruleCatExpression
        {
        pushFollow(FOLLOW_2);
        ruleCatExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred6_InternalDdParser

    // $ANTLR start synpred7_InternalDdParser
    public final void synpred7_InternalDdParser_fragment() throws RecognitionException {   
        // InternalDdParser.g:1272:4: ( ruleListExpression )
        // InternalDdParser.g:1272:5: ruleListExpression
        {
        pushFollow(FOLLOW_2);
        ruleListExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred7_InternalDdParser

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


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA3 dfa3 = new DFA3(this);
    protected DFA10 dfa10 = new DFA10(this);
    protected DFA28 dfa28 = new DFA28(this);
    protected DFA31 dfa31 = new DFA31(this);
    static final String dfa_1s = "\5\uffff";
    static final String dfa_2s = "\1\2\4\uffff";
    static final String dfa_3s = "\1\11\1\71\2\uffff\1\11";
    static final String dfa_4s = "\1\115\1\71\2\uffff\1\115";
    static final String dfa_5s = "\2\uffff\1\2\1\1\1\uffff";
    static final String dfa_6s = "\5\uffff}>";
    static final String[] dfa_7s = {
            "\1\3\1\uffff\3\3\2\uffff\1\3\2\uffff\3\3\3\uffff\2\3\62\uffff\1\1",
            "\1\4",
            "",
            "",
            "\1\3\1\uffff\3\3\2\uffff\1\3\2\uffff\3\3\3\uffff\2\3\52\uffff\1\2\1\uffff\1\2\5\uffff\1\1"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 118:3: ( (lv_constants_4_0= ruleConstant ) )*";
        }
    }
    static final String dfa_8s = "\1\115\1\71\1\uffff\1\105\1\uffff";
    static final String dfa_9s = "\1\115\1\71\1\uffff\1\115\1\uffff";
    static final String dfa_10s = "\2\uffff\1\2\1\uffff\1\1";
    static final String[] dfa_11s = {
            "\1\1",
            "\1\3",
            "",
            "\1\2\1\uffff\1\4\5\uffff\1\1",
            ""
    };
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[][] dfa_11 = unpackEncodedStringArray(dfa_11s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_6;
            this.transition = dfa_11;
        }
        public String getDescription() {
            return "()* loopback of 137:3: ( (lv_entities_5_0= ruleEntity ) )*";
        }
    }
    static final String[] dfa_12s = {
            "\1\3\1\uffff\3\3\2\uffff\1\3\2\uffff\3\3\3\uffff\2\3\13\uffff\1\2\21\uffff\1\2\24\uffff\1\1",
            "\1\4",
            "",
            "",
            "\1\3\1\uffff\3\3\2\uffff\1\3\2\uffff\3\3\3\uffff\2\3\13\uffff\1\2\46\uffff\1\1"
    };
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "()+ loopback of 419:3: ( (lv_attributes_6_0= ruleAttribute ) )+";
        }
    }
    static final String dfa_13s = "\37\uffff";
    static final String dfa_14s = "\1\6\3\0\33\uffff";
    static final String dfa_15s = "\1\112\3\0\33\uffff";
    static final String dfa_16s = "\4\uffff\1\11\10\uffff\1\12\11\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10";
    static final String dfa_17s = "\1\uffff\1\0\1\1\1\2\33\uffff}>";
    static final String[] dfa_18s = {
            "\1\15\2\uffff\1\4\1\15\2\uffff\1\4\2\uffff\1\4\1\15\2\uffff\2\4\1\uffff\3\4\14\uffff\1\1\4\uffff\1\4\6\uffff\1\2\2\uffff\1\3\13\uffff\2\15\3\uffff\5\15",
            "\1\uffff",
            "\1\uffff",
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

    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[][] dfa_18 = unpackEncodedStringArray(dfa_18s);

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = dfa_13;
            this.eof = dfa_13;
            this.min = dfa_14;
            this.max = dfa_15;
            this.accept = dfa_16;
            this.special = dfa_17;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "1198:2: ( ( ( ruleRangeExpression )=>this_RangeExpression_0= ruleRangeExpression ) | ( ( ruleAddExpression )=>this_AddExpression_1= ruleAddExpression ) | ( ( ruleMultExpression )=>this_MultExpression_2= ruleMultExpression ) | ( ( ruleAndExpression )=>this_AndExpression_3= ruleAndExpression ) | ( ( ruleOrExpression )=>this_OrExpression_4= ruleOrExpression ) | ( ( ruleCatExpression )=>this_CatExpression_5= ruleCatExpression ) | ( ( ruleListExpression )=>this_ListExpression_6= ruleListExpression ) | this_BinaryExpression_7= ruleBinaryExpression | this_UnaryExpression_8= ruleUnaryExpression | this_TerminalExpression_9= ruleTerminalExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA28_1 = input.LA(1);

                         
                        int index28_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalDdParser()) ) {s = 23;}

                        else if ( (synpred2_InternalDdParser()) ) {s = 24;}

                        else if ( (synpred3_InternalDdParser()) ) {s = 25;}

                        else if ( (synpred4_InternalDdParser()) ) {s = 26;}

                        else if ( (synpred5_InternalDdParser()) ) {s = 27;}

                        else if ( (synpred6_InternalDdParser()) ) {s = 28;}

                        else if ( (synpred7_InternalDdParser()) ) {s = 29;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index28_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA28_2 = input.LA(1);

                         
                        int index28_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalDdParser()) ) {s = 24;}

                        else if ( (synpred3_InternalDdParser()) ) {s = 25;}

                        else if ( (synpred4_InternalDdParser()) ) {s = 26;}

                        else if ( (synpred5_InternalDdParser()) ) {s = 27;}

                        else if ( (synpred6_InternalDdParser()) ) {s = 28;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index28_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA28_3 = input.LA(1);

                         
                        int index28_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalDdParser()) ) {s = 24;}

                        else if ( (synpred3_InternalDdParser()) ) {s = 25;}

                        else if ( (synpred4_InternalDdParser()) ) {s = 26;}

                        else if ( (synpred5_InternalDdParser()) ) {s = 27;}

                        else if ( (synpred6_InternalDdParser()) ) {s = 28;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index28_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 28, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_19s = "\15\uffff";
    static final String dfa_20s = "\1\11\11\46\3\uffff";
    static final String dfa_21s = "\1\53\11\65\3\uffff";
    static final String dfa_22s = "\12\uffff\1\1\1\3\1\2";
    static final String dfa_23s = "\15\uffff}>";
    static final String[] dfa_24s = {
            "\1\11\3\uffff\1\6\2\uffff\1\7\3\uffff\1\5\1\4\1\uffff\1\10\1\1\1\3\21\uffff\1\2",
            "\1\12\13\uffff\1\14\2\uffff\1\13",
            "\1\12\13\uffff\1\14\2\uffff\1\13",
            "\1\12\13\uffff\1\14\2\uffff\1\13",
            "\1\12\13\uffff\1\14\2\uffff\1\13",
            "\1\12\13\uffff\1\14\2\uffff\1\13",
            "\1\12\13\uffff\1\14\2\uffff\1\13",
            "\1\12\13\uffff\1\14\2\uffff\1\13",
            "\1\12\13\uffff\1\14\2\uffff\1\13",
            "\1\12\13\uffff\1\14\2\uffff\1\13",
            "",
            "",
            ""
    };

    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final char[] dfa_20 = DFA.unpackEncodedStringToUnsignedChars(dfa_20s);
    static final char[] dfa_21 = DFA.unpackEncodedStringToUnsignedChars(dfa_21s);
    static final short[] dfa_22 = DFA.unpackEncodedString(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final short[][] dfa_24 = unpackEncodedStringArray(dfa_24s);

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = dfa_19;
            this.eof = dfa_19;
            this.min = dfa_20;
            this.max = dfa_21;
            this.accept = dfa_22;
            this.special = dfa_23;
            this.transition = dfa_24;
        }
        public String getDescription() {
            return "1626:3: ( ( ( (lv_op_0_0= ruleUnaryOperator ) ) otherlv_1= LeftParenthesis ( (lv_left_2_0= ruleSharkExpression ) ) otherlv_3= RightParenthesis ) | ( ( (lv_op_4_0= ruleUnaryOperator ) ) otherlv_5= LeftSquareBracket ( (lv_left_6_0= ruleSharkExpression ) ) otherlv_7= RightSquareBracket ) | ( ( (lv_op_8_0= ruleUnaryOperator ) ) otherlv_9= LeftCurlyBracket ( (lv_left_10_0= ruleSharkExpression ) ) otherlv_11= RightCurlyBracket ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000080L,0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000006393A82L,0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000082L,0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000006393A80L,0x0000000000002000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0004004000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0004000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0024084003B32640L,0x00000000000007C6L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000080L,0x0000000000002080L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000400010000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0100004006393A80L,0x0000000000002000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0100004000000080L,0x0000000000002000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0004004000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0004000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0001000800400030L,0x0000000000002000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000800400030L,0x0000000000002000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000800000030L,0x0000000000002000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000800000020L,0x0000000000002000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000020L,0x0000000000002000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000048000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000004000000080L,0x0000000000002000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000080L,0x0000000000002020L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000404000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0100000000000080L,0x0000000000002000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000080L,0x0000000000002100L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0012AB36E804C100L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x00000A0000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000028000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0008020000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0040020000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0008010000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0040010000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000008000040000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0008000000040000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0040000000040000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000008400000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0008000400000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0040000400000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x000000A000000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0008002000000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0040002000000000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0404000000000002L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000100000000000L});

}