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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Partitionkey", "Deprecated", "False", "Model", "Round", "Stamp", "Unset", "Bits", "Bool", "Date", "Like", "Stxt", "Time", "True", "And", "Chr", "Dec", "Int", "Key", "Len", "Not", "Str", "HalfwidthHangulFillerHalfwidthHangulFillerHalfwidthHangulFiller", "ExclamationMarkEqualsSign", "HyphenMinusGreaterThanSign", "LessThanSignEqualsSign", "EqualsSignEqualsSign", "GreaterThanSignEqualsSign", "LeftSquareBracketRightSquareBracket", "In", "Or", "ExclamationMark", "PercentSign", "Ampersand", "LeftParenthesis", "RightParenthesis", "Asterisk", "PlusSign", "Comma", "HyphenMinus", "FullStop", "Solidus", "Colon", "LessThanSign", "EqualsSign", "GreaterThanSign", "LeftSquareBracket", "RightSquareBracket", "CircumflexAccent", "RULE_BEGIN", "RULE_END", "RULE_EOL", "RULE_NUL", "RULE_HEX", "RULE_NUM", "RULE_UNI", "RULE_ESC", "RULE_ASCII", "RULE_NL", "RULE_STR", "RULE_CHR", "RULE_RANGEINF", "RULE_RANGE", "RULE_CHKID", "RULE_CSTID", "RULE_OBJID", "RULE_ID", "RULE_DEC", "RULE_INT", "RULE_CONT", "RULE_IDENT", "RULE_CMT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_HEX=57;
    public static final int Or=34;
    public static final int RULE_BEGIN=53;
    public static final int True=17;
    public static final int RULE_CHKID=67;
    public static final int False=6;
    public static final int Chr=19;
    public static final int LessThanSign=47;
    public static final int Str=25;
    public static final int PercentSign=36;
    public static final int Like=14;
    public static final int LeftParenthesis=38;
    public static final int RULE_OBJID=69;
    public static final int Bool=12;
    public static final int RULE_NUM=58;
    public static final int RULE_NUL=56;
    public static final int Stxt=15;
    public static final int Ampersand=37;
    public static final int RightSquareBracket=51;
    public static final int ExclamationMark=35;
    public static final int GreaterThanSign=49;
    public static final int RULE_ID=70;
    public static final int RULE_EOL=55;
    public static final int RULE_RANGEINF=65;
    public static final int RULE_DEC=71;
    public static final int RightParenthesis=39;
    public static final int RULE_ESC=60;
    public static final int RULE_IDENT=74;
    public static final int GreaterThanSignEqualsSign=31;
    public static final int EqualsSignEqualsSign=30;
    public static final int Not=24;
    public static final int RULE_CONT=73;
    public static final int And=18;
    public static final int PlusSign=41;
    public static final int RULE_UNI=59;
    public static final int RULE_INT=72;
    public static final int Bits=11;
    public static final int LeftSquareBracket=50;
    public static final int HalfwidthHangulFillerHalfwidthHangulFillerHalfwidthHangulFiller=26;
    public static final int Key=22;
    public static final int RULE_END=54;
    public static final int In=33;
    public static final int Time=16;
    public static final int Int=21;
    public static final int Comma=42;
    public static final int EqualsSign=48;
    public static final int HyphenMinus=43;
    public static final int RULE_ASCII=61;
    public static final int LeftSquareBracketRightSquareBracket=32;
    public static final int Deprecated=5;
    public static final int Partitionkey=4;
    public static final int Round=8;
    public static final int LessThanSignEqualsSign=29;
    public static final int Solidus=45;
    public static final int Colon=46;
    public static final int EOF=-1;
    public static final int Asterisk=40;
    public static final int RULE_CMT=75;
    public static final int FullStop=44;
    public static final int Dec=20;
    public static final int Stamp=9;
    public static final int RULE_CSTID=68;
    public static final int RULE_WS=76;
    public static final int Unset=10;
    public static final int RULE_ANY_OTHER=77;
    public static final int Date=13;
    public static final int CircumflexAccent=52;
    public static final int RULE_CHR=64;
    public static final int Len=23;
    public static final int RULE_STR=63;
    public static final int Model=7;
    public static final int ExclamationMarkEqualsSign=27;
    public static final int RULE_NL=62;
    public static final int HyphenMinusGreaterThanSign=28;
    public static final int RULE_RANGE=66;

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
    // InternalDdParser.g:1320:1: ruleBinaryExpression returns [EObject current=null] : (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= ruleBinaryOperator ) ) ( (lv_right_3_0= ruleSharkExpression ) ) otherlv_4= RightParenthesis ( ( (lv_exprValue_5_0= RULE_NUL ) ) ( (lv_precision_6_0= RULE_INT ) ) ( (lv_length_7_0= RULE_INT ) ) ( (lv_hasAttribute_8_0= RULE_INT ) ) )? ) ;
    public final EObject ruleBinaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        Token lv_exprValue_5_0=null;
        Token lv_precision_6_0=null;
        Token lv_length_7_0=null;
        Token lv_hasAttribute_8_0=null;
        EObject lv_left_1_0 = null;

        Enumerator lv_op_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalDdParser.g:1326:2: ( (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= ruleBinaryOperator ) ) ( (lv_right_3_0= ruleSharkExpression ) ) otherlv_4= RightParenthesis ( ( (lv_exprValue_5_0= RULE_NUL ) ) ( (lv_precision_6_0= RULE_INT ) ) ( (lv_length_7_0= RULE_INT ) ) ( (lv_hasAttribute_8_0= RULE_INT ) ) )? ) )
            // InternalDdParser.g:1327:2: (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= ruleBinaryOperator ) ) ( (lv_right_3_0= ruleSharkExpression ) ) otherlv_4= RightParenthesis ( ( (lv_exprValue_5_0= RULE_NUL ) ) ( (lv_precision_6_0= RULE_INT ) ) ( (lv_length_7_0= RULE_INT ) ) ( (lv_hasAttribute_8_0= RULE_INT ) ) )? )
            {
            // InternalDdParser.g:1327:2: (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= ruleBinaryOperator ) ) ( (lv_right_3_0= ruleSharkExpression ) ) otherlv_4= RightParenthesis ( ( (lv_exprValue_5_0= RULE_NUL ) ) ( (lv_precision_6_0= RULE_INT ) ) ( (lv_length_7_0= RULE_INT ) ) ( (lv_hasAttribute_8_0= RULE_INT ) ) )? )
            // InternalDdParser.g:1328:3: otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= ruleBinaryOperator ) ) ( (lv_right_3_0= ruleSharkExpression ) ) otherlv_4= RightParenthesis ( ( (lv_exprValue_5_0= RULE_NUL ) ) ( (lv_precision_6_0= RULE_INT ) ) ( (lv_length_7_0= RULE_INT ) ) ( (lv_hasAttribute_8_0= RULE_INT ) ) )?
            {
            otherlv_0=(Token)match(input,LeftParenthesis,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getBinaryExpressionAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalDdParser.g:1332:3: ( (lv_left_1_0= ruleSharkExpression ) )
            // InternalDdParser.g:1333:4: (lv_left_1_0= ruleSharkExpression )
            {
            // InternalDdParser.g:1333:4: (lv_left_1_0= ruleSharkExpression )
            // InternalDdParser.g:1334:5: lv_left_1_0= ruleSharkExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBinaryExpressionAccess().getLeftSharkExpressionParserRuleCall_1_0());
              				
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

            // InternalDdParser.g:1351:3: ( (lv_op_2_0= ruleBinaryOperator ) )
            // InternalDdParser.g:1352:4: (lv_op_2_0= ruleBinaryOperator )
            {
            // InternalDdParser.g:1352:4: (lv_op_2_0= ruleBinaryOperator )
            // InternalDdParser.g:1353:5: lv_op_2_0= ruleBinaryOperator
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBinaryExpressionAccess().getOpBinaryOperatorEnumRuleCall_2_0());
              				
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

            // InternalDdParser.g:1370:3: ( (lv_right_3_0= ruleSharkExpression ) )
            // InternalDdParser.g:1371:4: (lv_right_3_0= ruleSharkExpression )
            {
            // InternalDdParser.g:1371:4: (lv_right_3_0= ruleSharkExpression )
            // InternalDdParser.g:1372:5: lv_right_3_0= ruleSharkExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBinaryExpressionAccess().getRightSharkExpressionParserRuleCall_3_0());
              				
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

              			newLeafNode(otherlv_4, grammarAccess.getBinaryExpressionAccess().getRightParenthesisKeyword_4());
              		
            }
            // InternalDdParser.g:1393:3: ( ( (lv_exprValue_5_0= RULE_NUL ) ) ( (lv_precision_6_0= RULE_INT ) ) ( (lv_length_7_0= RULE_INT ) ) ( (lv_hasAttribute_8_0= RULE_INT ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_NUL) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalDdParser.g:1394:4: ( (lv_exprValue_5_0= RULE_NUL ) ) ( (lv_precision_6_0= RULE_INT ) ) ( (lv_length_7_0= RULE_INT ) ) ( (lv_hasAttribute_8_0= RULE_INT ) )
                    {
                    // InternalDdParser.g:1394:4: ( (lv_exprValue_5_0= RULE_NUL ) )
                    // InternalDdParser.g:1395:5: (lv_exprValue_5_0= RULE_NUL )
                    {
                    // InternalDdParser.g:1395:5: (lv_exprValue_5_0= RULE_NUL )
                    // InternalDdParser.g:1396:6: lv_exprValue_5_0= RULE_NUL
                    {
                    lv_exprValue_5_0=(Token)match(input,RULE_NUL,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_exprValue_5_0, grammarAccess.getBinaryExpressionAccess().getExprValueNULTerminalRuleCall_5_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getBinaryExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"exprValue",
                      							lv_exprValue_5_0,
                      							"com.shark.lang.Dd.NUL");
                      					
                    }

                    }


                    }

                    // InternalDdParser.g:1412:4: ( (lv_precision_6_0= RULE_INT ) )
                    // InternalDdParser.g:1413:5: (lv_precision_6_0= RULE_INT )
                    {
                    // InternalDdParser.g:1413:5: (lv_precision_6_0= RULE_INT )
                    // InternalDdParser.g:1414:6: lv_precision_6_0= RULE_INT
                    {
                    lv_precision_6_0=(Token)match(input,RULE_INT,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_precision_6_0, grammarAccess.getBinaryExpressionAccess().getPrecisionINTTerminalRuleCall_5_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getBinaryExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"precision",
                      							lv_precision_6_0,
                      							"com.shark.lang.Dd.INT");
                      					
                    }

                    }


                    }

                    // InternalDdParser.g:1430:4: ( (lv_length_7_0= RULE_INT ) )
                    // InternalDdParser.g:1431:5: (lv_length_7_0= RULE_INT )
                    {
                    // InternalDdParser.g:1431:5: (lv_length_7_0= RULE_INT )
                    // InternalDdParser.g:1432:6: lv_length_7_0= RULE_INT
                    {
                    lv_length_7_0=(Token)match(input,RULE_INT,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_length_7_0, grammarAccess.getBinaryExpressionAccess().getLengthINTTerminalRuleCall_5_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getBinaryExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"length",
                      							lv_length_7_0,
                      							"com.shark.lang.Dd.INT");
                      					
                    }

                    }


                    }

                    // InternalDdParser.g:1448:4: ( (lv_hasAttribute_8_0= RULE_INT ) )
                    // InternalDdParser.g:1449:5: (lv_hasAttribute_8_0= RULE_INT )
                    {
                    // InternalDdParser.g:1449:5: (lv_hasAttribute_8_0= RULE_INT )
                    // InternalDdParser.g:1450:6: lv_hasAttribute_8_0= RULE_INT
                    {
                    lv_hasAttribute_8_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_hasAttribute_8_0, grammarAccess.getBinaryExpressionAccess().getHasAttributeINTTerminalRuleCall_5_3_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getBinaryExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"hasAttribute",
                      							lv_hasAttribute_8_0,
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
    // InternalDdParser.g:1471:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // InternalDdParser.g:1471:56: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // InternalDdParser.g:1472:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
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
    // InternalDdParser.g:1478:1: ruleUnaryExpression returns [EObject current=null] : ( ( (lv_op_0_0= ruleUnaryOperator ) ) otherlv_1= LeftParenthesis ( (lv_left_2_0= ruleSharkExpression ) ) otherlv_3= RightParenthesis ( ( (lv_exprValue_4_0= RULE_NUL ) ) ( (lv_precision_5_0= RULE_INT ) ) ( (lv_length_6_0= RULE_INT ) ) ( (lv_hasAttribute_7_0= RULE_INT ) ) )? ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_exprValue_4_0=null;
        Token lv_precision_5_0=null;
        Token lv_length_6_0=null;
        Token lv_hasAttribute_7_0=null;
        Enumerator lv_op_0_0 = null;

        EObject lv_left_2_0 = null;



        	enterRule();

        try {
            // InternalDdParser.g:1484:2: ( ( ( (lv_op_0_0= ruleUnaryOperator ) ) otherlv_1= LeftParenthesis ( (lv_left_2_0= ruleSharkExpression ) ) otherlv_3= RightParenthesis ( ( (lv_exprValue_4_0= RULE_NUL ) ) ( (lv_precision_5_0= RULE_INT ) ) ( (lv_length_6_0= RULE_INT ) ) ( (lv_hasAttribute_7_0= RULE_INT ) ) )? ) )
            // InternalDdParser.g:1485:2: ( ( (lv_op_0_0= ruleUnaryOperator ) ) otherlv_1= LeftParenthesis ( (lv_left_2_0= ruleSharkExpression ) ) otherlv_3= RightParenthesis ( ( (lv_exprValue_4_0= RULE_NUL ) ) ( (lv_precision_5_0= RULE_INT ) ) ( (lv_length_6_0= RULE_INT ) ) ( (lv_hasAttribute_7_0= RULE_INT ) ) )? )
            {
            // InternalDdParser.g:1485:2: ( ( (lv_op_0_0= ruleUnaryOperator ) ) otherlv_1= LeftParenthesis ( (lv_left_2_0= ruleSharkExpression ) ) otherlv_3= RightParenthesis ( ( (lv_exprValue_4_0= RULE_NUL ) ) ( (lv_precision_5_0= RULE_INT ) ) ( (lv_length_6_0= RULE_INT ) ) ( (lv_hasAttribute_7_0= RULE_INT ) ) )? )
            // InternalDdParser.g:1486:3: ( (lv_op_0_0= ruleUnaryOperator ) ) otherlv_1= LeftParenthesis ( (lv_left_2_0= ruleSharkExpression ) ) otherlv_3= RightParenthesis ( ( (lv_exprValue_4_0= RULE_NUL ) ) ( (lv_precision_5_0= RULE_INT ) ) ( (lv_length_6_0= RULE_INT ) ) ( (lv_hasAttribute_7_0= RULE_INT ) ) )?
            {
            // InternalDdParser.g:1486:3: ( (lv_op_0_0= ruleUnaryOperator ) )
            // InternalDdParser.g:1487:4: (lv_op_0_0= ruleUnaryOperator )
            {
            // InternalDdParser.g:1487:4: (lv_op_0_0= ruleUnaryOperator )
            // InternalDdParser.g:1488:5: lv_op_0_0= ruleUnaryOperator
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getUnaryExpressionAccess().getOpUnaryOperatorEnumRuleCall_0_0());
              				
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

              			newLeafNode(otherlv_1, grammarAccess.getUnaryExpressionAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalDdParser.g:1509:3: ( (lv_left_2_0= ruleSharkExpression ) )
            // InternalDdParser.g:1510:4: (lv_left_2_0= ruleSharkExpression )
            {
            // InternalDdParser.g:1510:4: (lv_left_2_0= ruleSharkExpression )
            // InternalDdParser.g:1511:5: lv_left_2_0= ruleSharkExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getUnaryExpressionAccess().getLeftSharkExpressionParserRuleCall_2_0());
              				
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

              			newLeafNode(otherlv_3, grammarAccess.getUnaryExpressionAccess().getRightParenthesisKeyword_3());
              		
            }
            // InternalDdParser.g:1532:3: ( ( (lv_exprValue_4_0= RULE_NUL ) ) ( (lv_precision_5_0= RULE_INT ) ) ( (lv_length_6_0= RULE_INT ) ) ( (lv_hasAttribute_7_0= RULE_INT ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_NUL) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalDdParser.g:1533:4: ( (lv_exprValue_4_0= RULE_NUL ) ) ( (lv_precision_5_0= RULE_INT ) ) ( (lv_length_6_0= RULE_INT ) ) ( (lv_hasAttribute_7_0= RULE_INT ) )
                    {
                    // InternalDdParser.g:1533:4: ( (lv_exprValue_4_0= RULE_NUL ) )
                    // InternalDdParser.g:1534:5: (lv_exprValue_4_0= RULE_NUL )
                    {
                    // InternalDdParser.g:1534:5: (lv_exprValue_4_0= RULE_NUL )
                    // InternalDdParser.g:1535:6: lv_exprValue_4_0= RULE_NUL
                    {
                    lv_exprValue_4_0=(Token)match(input,RULE_NUL,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_exprValue_4_0, grammarAccess.getUnaryExpressionAccess().getExprValueNULTerminalRuleCall_4_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getUnaryExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"exprValue",
                      							lv_exprValue_4_0,
                      							"com.shark.lang.Dd.NUL");
                      					
                    }

                    }


                    }

                    // InternalDdParser.g:1551:4: ( (lv_precision_5_0= RULE_INT ) )
                    // InternalDdParser.g:1552:5: (lv_precision_5_0= RULE_INT )
                    {
                    // InternalDdParser.g:1552:5: (lv_precision_5_0= RULE_INT )
                    // InternalDdParser.g:1553:6: lv_precision_5_0= RULE_INT
                    {
                    lv_precision_5_0=(Token)match(input,RULE_INT,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_precision_5_0, grammarAccess.getUnaryExpressionAccess().getPrecisionINTTerminalRuleCall_4_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getUnaryExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"precision",
                      							lv_precision_5_0,
                      							"com.shark.lang.Dd.INT");
                      					
                    }

                    }


                    }

                    // InternalDdParser.g:1569:4: ( (lv_length_6_0= RULE_INT ) )
                    // InternalDdParser.g:1570:5: (lv_length_6_0= RULE_INT )
                    {
                    // InternalDdParser.g:1570:5: (lv_length_6_0= RULE_INT )
                    // InternalDdParser.g:1571:6: lv_length_6_0= RULE_INT
                    {
                    lv_length_6_0=(Token)match(input,RULE_INT,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_length_6_0, grammarAccess.getUnaryExpressionAccess().getLengthINTTerminalRuleCall_4_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getUnaryExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"length",
                      							lv_length_6_0,
                      							"com.shark.lang.Dd.INT");
                      					
                    }

                    }


                    }

                    // InternalDdParser.g:1587:4: ( (lv_hasAttribute_7_0= RULE_INT ) )
                    // InternalDdParser.g:1588:5: (lv_hasAttribute_7_0= RULE_INT )
                    {
                    // InternalDdParser.g:1588:5: (lv_hasAttribute_7_0= RULE_INT )
                    // InternalDdParser.g:1589:6: lv_hasAttribute_7_0= RULE_INT
                    {
                    lv_hasAttribute_7_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_hasAttribute_7_0, grammarAccess.getUnaryExpressionAccess().getHasAttributeINTTerminalRuleCall_4_3_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getUnaryExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"hasAttribute",
                      							lv_hasAttribute_7_0,
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
    // InternalDdParser.g:1610:1: entryRuleAddExpression returns [EObject current=null] : iv_ruleAddExpression= ruleAddExpression EOF ;
    public final EObject entryRuleAddExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddExpression = null;


        try {
            // InternalDdParser.g:1610:54: (iv_ruleAddExpression= ruleAddExpression EOF )
            // InternalDdParser.g:1611:2: iv_ruleAddExpression= ruleAddExpression EOF
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
    // InternalDdParser.g:1617:1: ruleAddExpression returns [EObject current=null] : (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_addElts_4_0= ruleAddExpressionElt ) )+ otherlv_5= RightParenthesis ( ( (lv_exprValue_6_0= RULE_NUL ) ) ( (lv_precision_7_0= RULE_INT ) ) ( (lv_length_8_0= RULE_INT ) ) ( (lv_hasAttribute_9_0= RULE_INT ) ) )? ) ;
    public final EObject ruleAddExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token otherlv_5=null;
        Token lv_exprValue_6_0=null;
        Token lv_precision_7_0=null;
        Token lv_length_8_0=null;
        Token lv_hasAttribute_9_0=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_addElts_4_0 = null;



        	enterRule();

        try {
            // InternalDdParser.g:1623:2: ( (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_addElts_4_0= ruleAddExpressionElt ) )+ otherlv_5= RightParenthesis ( ( (lv_exprValue_6_0= RULE_NUL ) ) ( (lv_precision_7_0= RULE_INT ) ) ( (lv_length_8_0= RULE_INT ) ) ( (lv_hasAttribute_9_0= RULE_INT ) ) )? ) )
            // InternalDdParser.g:1624:2: (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_addElts_4_0= ruleAddExpressionElt ) )+ otherlv_5= RightParenthesis ( ( (lv_exprValue_6_0= RULE_NUL ) ) ( (lv_precision_7_0= RULE_INT ) ) ( (lv_length_8_0= RULE_INT ) ) ( (lv_hasAttribute_9_0= RULE_INT ) ) )? )
            {
            // InternalDdParser.g:1624:2: (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_addElts_4_0= ruleAddExpressionElt ) )+ otherlv_5= RightParenthesis ( ( (lv_exprValue_6_0= RULE_NUL ) ) ( (lv_precision_7_0= RULE_INT ) ) ( (lv_length_8_0= RULE_INT ) ) ( (lv_hasAttribute_9_0= RULE_INT ) ) )? )
            // InternalDdParser.g:1625:3: otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_addElts_4_0= ruleAddExpressionElt ) )+ otherlv_5= RightParenthesis ( ( (lv_exprValue_6_0= RULE_NUL ) ) ( (lv_precision_7_0= RULE_INT ) ) ( (lv_length_8_0= RULE_INT ) ) ( (lv_hasAttribute_9_0= RULE_INT ) ) )?
            {
            otherlv_0=(Token)match(input,LeftParenthesis,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAddExpressionAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalDdParser.g:1629:3: ( (lv_left_1_0= ruleSharkExpression ) )
            // InternalDdParser.g:1630:4: (lv_left_1_0= ruleSharkExpression )
            {
            // InternalDdParser.g:1630:4: (lv_left_1_0= ruleSharkExpression )
            // InternalDdParser.g:1631:5: lv_left_1_0= ruleSharkExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAddExpressionAccess().getLeftSharkExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_42);
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

            // InternalDdParser.g:1648:3: ( ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) ) )
            // InternalDdParser.g:1649:4: ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) )
            {
            // InternalDdParser.g:1649:4: ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) )
            // InternalDdParser.g:1650:5: (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus )
            {
            // InternalDdParser.g:1650:5: (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==PlusSign) ) {
                alt31=1;
            }
            else if ( (LA31_0==HyphenMinus) ) {
                alt31=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalDdParser.g:1651:6: lv_op_2_1= PlusSign
                    {
                    lv_op_2_1=(Token)match(input,PlusSign,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_op_2_1, grammarAccess.getAddExpressionAccess().getOpPlusSignKeyword_2_0_0());
                      					
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
                    // InternalDdParser.g:1662:6: lv_op_2_2= HyphenMinus
                    {
                    lv_op_2_2=(Token)match(input,HyphenMinus,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_op_2_2, grammarAccess.getAddExpressionAccess().getOpHyphenMinusKeyword_2_0_1());
                      					
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

            // InternalDdParser.g:1675:3: ( (lv_right_3_0= ruleSharkExpression ) )
            // InternalDdParser.g:1676:4: (lv_right_3_0= ruleSharkExpression )
            {
            // InternalDdParser.g:1676:4: (lv_right_3_0= ruleSharkExpression )
            // InternalDdParser.g:1677:5: lv_right_3_0= ruleSharkExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAddExpressionAccess().getRightSharkExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_43);
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

            // InternalDdParser.g:1694:3: ( (lv_addElts_4_0= ruleAddExpressionElt ) )+
            int cnt32=0;
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==PlusSign) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalDdParser.g:1695:4: (lv_addElts_4_0= ruleAddExpressionElt )
            	    {
            	    // InternalDdParser.g:1695:4: (lv_addElts_4_0= ruleAddExpressionElt )
            	    // InternalDdParser.g:1696:5: lv_addElts_4_0= ruleAddExpressionElt
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getAddExpressionAccess().getAddEltsAddExpressionEltParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_44);
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
            	    if ( cnt32 >= 1 ) break loop32;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(32, input);
                        throw eee;
                }
                cnt32++;
            } while (true);

            otherlv_5=(Token)match(input,RightParenthesis,FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getAddExpressionAccess().getRightParenthesisKeyword_5());
              		
            }
            // InternalDdParser.g:1717:3: ( ( (lv_exprValue_6_0= RULE_NUL ) ) ( (lv_precision_7_0= RULE_INT ) ) ( (lv_length_8_0= RULE_INT ) ) ( (lv_hasAttribute_9_0= RULE_INT ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_NUL) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalDdParser.g:1718:4: ( (lv_exprValue_6_0= RULE_NUL ) ) ( (lv_precision_7_0= RULE_INT ) ) ( (lv_length_8_0= RULE_INT ) ) ( (lv_hasAttribute_9_0= RULE_INT ) )
                    {
                    // InternalDdParser.g:1718:4: ( (lv_exprValue_6_0= RULE_NUL ) )
                    // InternalDdParser.g:1719:5: (lv_exprValue_6_0= RULE_NUL )
                    {
                    // InternalDdParser.g:1719:5: (lv_exprValue_6_0= RULE_NUL )
                    // InternalDdParser.g:1720:6: lv_exprValue_6_0= RULE_NUL
                    {
                    lv_exprValue_6_0=(Token)match(input,RULE_NUL,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_exprValue_6_0, grammarAccess.getAddExpressionAccess().getExprValueNULTerminalRuleCall_6_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAddExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"exprValue",
                      							lv_exprValue_6_0,
                      							"com.shark.lang.Dd.NUL");
                      					
                    }

                    }


                    }

                    // InternalDdParser.g:1736:4: ( (lv_precision_7_0= RULE_INT ) )
                    // InternalDdParser.g:1737:5: (lv_precision_7_0= RULE_INT )
                    {
                    // InternalDdParser.g:1737:5: (lv_precision_7_0= RULE_INT )
                    // InternalDdParser.g:1738:6: lv_precision_7_0= RULE_INT
                    {
                    lv_precision_7_0=(Token)match(input,RULE_INT,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_precision_7_0, grammarAccess.getAddExpressionAccess().getPrecisionINTTerminalRuleCall_6_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAddExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"precision",
                      							lv_precision_7_0,
                      							"com.shark.lang.Dd.INT");
                      					
                    }

                    }


                    }

                    // InternalDdParser.g:1754:4: ( (lv_length_8_0= RULE_INT ) )
                    // InternalDdParser.g:1755:5: (lv_length_8_0= RULE_INT )
                    {
                    // InternalDdParser.g:1755:5: (lv_length_8_0= RULE_INT )
                    // InternalDdParser.g:1756:6: lv_length_8_0= RULE_INT
                    {
                    lv_length_8_0=(Token)match(input,RULE_INT,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_length_8_0, grammarAccess.getAddExpressionAccess().getLengthINTTerminalRuleCall_6_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAddExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"length",
                      							lv_length_8_0,
                      							"com.shark.lang.Dd.INT");
                      					
                    }

                    }


                    }

                    // InternalDdParser.g:1772:4: ( (lv_hasAttribute_9_0= RULE_INT ) )
                    // InternalDdParser.g:1773:5: (lv_hasAttribute_9_0= RULE_INT )
                    {
                    // InternalDdParser.g:1773:5: (lv_hasAttribute_9_0= RULE_INT )
                    // InternalDdParser.g:1774:6: lv_hasAttribute_9_0= RULE_INT
                    {
                    lv_hasAttribute_9_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_hasAttribute_9_0, grammarAccess.getAddExpressionAccess().getHasAttributeINTTerminalRuleCall_6_3_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAddExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"hasAttribute",
                      							lv_hasAttribute_9_0,
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
    // InternalDdParser.g:1795:1: entryRuleAddExpressionElt returns [EObject current=null] : iv_ruleAddExpressionElt= ruleAddExpressionElt EOF ;
    public final EObject entryRuleAddExpressionElt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddExpressionElt = null;


        try {
            // InternalDdParser.g:1795:57: (iv_ruleAddExpressionElt= ruleAddExpressionElt EOF )
            // InternalDdParser.g:1796:2: iv_ruleAddExpressionElt= ruleAddExpressionElt EOF
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
    // InternalDdParser.g:1802:1: ruleAddExpressionElt returns [EObject current=null] : ( ( (lv_op_0_0= PlusSign ) ) ( (lv_right_1_0= ruleSharkExpression ) ) ) ;
    public final EObject ruleAddExpressionElt() throws RecognitionException {
        EObject current = null;

        Token lv_op_0_0=null;
        EObject lv_right_1_0 = null;



        	enterRule();

        try {
            // InternalDdParser.g:1808:2: ( ( ( (lv_op_0_0= PlusSign ) ) ( (lv_right_1_0= ruleSharkExpression ) ) ) )
            // InternalDdParser.g:1809:2: ( ( (lv_op_0_0= PlusSign ) ) ( (lv_right_1_0= ruleSharkExpression ) ) )
            {
            // InternalDdParser.g:1809:2: ( ( (lv_op_0_0= PlusSign ) ) ( (lv_right_1_0= ruleSharkExpression ) ) )
            // InternalDdParser.g:1810:3: ( (lv_op_0_0= PlusSign ) ) ( (lv_right_1_0= ruleSharkExpression ) )
            {
            // InternalDdParser.g:1810:3: ( (lv_op_0_0= PlusSign ) )
            // InternalDdParser.g:1811:4: (lv_op_0_0= PlusSign )
            {
            // InternalDdParser.g:1811:4: (lv_op_0_0= PlusSign )
            // InternalDdParser.g:1812:5: lv_op_0_0= PlusSign
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

            // InternalDdParser.g:1824:3: ( (lv_right_1_0= ruleSharkExpression ) )
            // InternalDdParser.g:1825:4: (lv_right_1_0= ruleSharkExpression )
            {
            // InternalDdParser.g:1825:4: (lv_right_1_0= ruleSharkExpression )
            // InternalDdParser.g:1826:5: lv_right_1_0= ruleSharkExpression
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
    // InternalDdParser.g:1847:1: entryRuleMultExpression returns [EObject current=null] : iv_ruleMultExpression= ruleMultExpression EOF ;
    public final EObject entryRuleMultExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultExpression = null;


        try {
            // InternalDdParser.g:1847:55: (iv_ruleMultExpression= ruleMultExpression EOF )
            // InternalDdParser.g:1848:2: iv_ruleMultExpression= ruleMultExpression EOF
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
    // InternalDdParser.g:1854:1: ruleMultExpression returns [EObject current=null] : (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= Asterisk ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_multElts_4_0= ruleMultExpressionElt ) )+ otherlv_5= RightParenthesis ( ( (lv_exprValue_6_0= RULE_NUL ) ) ( (lv_precision_7_0= RULE_INT ) ) ( (lv_length_8_0= RULE_INT ) ) ( (lv_hasAttribute_9_0= RULE_INT ) ) )? ) ;
    public final EObject ruleMultExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_op_2_0=null;
        Token otherlv_5=null;
        Token lv_exprValue_6_0=null;
        Token lv_precision_7_0=null;
        Token lv_length_8_0=null;
        Token lv_hasAttribute_9_0=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_multElts_4_0 = null;



        	enterRule();

        try {
            // InternalDdParser.g:1860:2: ( (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= Asterisk ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_multElts_4_0= ruleMultExpressionElt ) )+ otherlv_5= RightParenthesis ( ( (lv_exprValue_6_0= RULE_NUL ) ) ( (lv_precision_7_0= RULE_INT ) ) ( (lv_length_8_0= RULE_INT ) ) ( (lv_hasAttribute_9_0= RULE_INT ) ) )? ) )
            // InternalDdParser.g:1861:2: (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= Asterisk ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_multElts_4_0= ruleMultExpressionElt ) )+ otherlv_5= RightParenthesis ( ( (lv_exprValue_6_0= RULE_NUL ) ) ( (lv_precision_7_0= RULE_INT ) ) ( (lv_length_8_0= RULE_INT ) ) ( (lv_hasAttribute_9_0= RULE_INT ) ) )? )
            {
            // InternalDdParser.g:1861:2: (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= Asterisk ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_multElts_4_0= ruleMultExpressionElt ) )+ otherlv_5= RightParenthesis ( ( (lv_exprValue_6_0= RULE_NUL ) ) ( (lv_precision_7_0= RULE_INT ) ) ( (lv_length_8_0= RULE_INT ) ) ( (lv_hasAttribute_9_0= RULE_INT ) ) )? )
            // InternalDdParser.g:1862:3: otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= Asterisk ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_multElts_4_0= ruleMultExpressionElt ) )+ otherlv_5= RightParenthesis ( ( (lv_exprValue_6_0= RULE_NUL ) ) ( (lv_precision_7_0= RULE_INT ) ) ( (lv_length_8_0= RULE_INT ) ) ( (lv_hasAttribute_9_0= RULE_INT ) ) )?
            {
            otherlv_0=(Token)match(input,LeftParenthesis,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMultExpressionAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalDdParser.g:1866:3: ( (lv_left_1_0= ruleSharkExpression ) )
            // InternalDdParser.g:1867:4: (lv_left_1_0= ruleSharkExpression )
            {
            // InternalDdParser.g:1867:4: (lv_left_1_0= ruleSharkExpression )
            // InternalDdParser.g:1868:5: lv_left_1_0= ruleSharkExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMultExpressionAccess().getLeftSharkExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_45);
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

            // InternalDdParser.g:1885:3: ( (lv_op_2_0= Asterisk ) )
            // InternalDdParser.g:1886:4: (lv_op_2_0= Asterisk )
            {
            // InternalDdParser.g:1886:4: (lv_op_2_0= Asterisk )
            // InternalDdParser.g:1887:5: lv_op_2_0= Asterisk
            {
            lv_op_2_0=(Token)match(input,Asterisk,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_op_2_0, grammarAccess.getMultExpressionAccess().getOpAsteriskKeyword_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMultExpressionRule());
              					}
              					setWithLastConsumed(current, "op", lv_op_2_0, "*");
              				
            }

            }


            }

            // InternalDdParser.g:1899:3: ( (lv_right_3_0= ruleSharkExpression ) )
            // InternalDdParser.g:1900:4: (lv_right_3_0= ruleSharkExpression )
            {
            // InternalDdParser.g:1900:4: (lv_right_3_0= ruleSharkExpression )
            // InternalDdParser.g:1901:5: lv_right_3_0= ruleSharkExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMultExpressionAccess().getRightSharkExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_45);
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

            // InternalDdParser.g:1918:3: ( (lv_multElts_4_0= ruleMultExpressionElt ) )+
            int cnt34=0;
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==Asterisk) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalDdParser.g:1919:4: (lv_multElts_4_0= ruleMultExpressionElt )
            	    {
            	    // InternalDdParser.g:1919:4: (lv_multElts_4_0= ruleMultExpressionElt )
            	    // InternalDdParser.g:1920:5: lv_multElts_4_0= ruleMultExpressionElt
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getMultExpressionAccess().getMultEltsMultExpressionEltParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_46);
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

              			newLeafNode(otherlv_5, grammarAccess.getMultExpressionAccess().getRightParenthesisKeyword_5());
              		
            }
            // InternalDdParser.g:1941:3: ( ( (lv_exprValue_6_0= RULE_NUL ) ) ( (lv_precision_7_0= RULE_INT ) ) ( (lv_length_8_0= RULE_INT ) ) ( (lv_hasAttribute_9_0= RULE_INT ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_NUL) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalDdParser.g:1942:4: ( (lv_exprValue_6_0= RULE_NUL ) ) ( (lv_precision_7_0= RULE_INT ) ) ( (lv_length_8_0= RULE_INT ) ) ( (lv_hasAttribute_9_0= RULE_INT ) )
                    {
                    // InternalDdParser.g:1942:4: ( (lv_exprValue_6_0= RULE_NUL ) )
                    // InternalDdParser.g:1943:5: (lv_exprValue_6_0= RULE_NUL )
                    {
                    // InternalDdParser.g:1943:5: (lv_exprValue_6_0= RULE_NUL )
                    // InternalDdParser.g:1944:6: lv_exprValue_6_0= RULE_NUL
                    {
                    lv_exprValue_6_0=(Token)match(input,RULE_NUL,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_exprValue_6_0, grammarAccess.getMultExpressionAccess().getExprValueNULTerminalRuleCall_6_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getMultExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"exprValue",
                      							lv_exprValue_6_0,
                      							"com.shark.lang.Dd.NUL");
                      					
                    }

                    }


                    }

                    // InternalDdParser.g:1960:4: ( (lv_precision_7_0= RULE_INT ) )
                    // InternalDdParser.g:1961:5: (lv_precision_7_0= RULE_INT )
                    {
                    // InternalDdParser.g:1961:5: (lv_precision_7_0= RULE_INT )
                    // InternalDdParser.g:1962:6: lv_precision_7_0= RULE_INT
                    {
                    lv_precision_7_0=(Token)match(input,RULE_INT,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_precision_7_0, grammarAccess.getMultExpressionAccess().getPrecisionINTTerminalRuleCall_6_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getMultExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"precision",
                      							lv_precision_7_0,
                      							"com.shark.lang.Dd.INT");
                      					
                    }

                    }


                    }

                    // InternalDdParser.g:1978:4: ( (lv_length_8_0= RULE_INT ) )
                    // InternalDdParser.g:1979:5: (lv_length_8_0= RULE_INT )
                    {
                    // InternalDdParser.g:1979:5: (lv_length_8_0= RULE_INT )
                    // InternalDdParser.g:1980:6: lv_length_8_0= RULE_INT
                    {
                    lv_length_8_0=(Token)match(input,RULE_INT,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_length_8_0, grammarAccess.getMultExpressionAccess().getLengthINTTerminalRuleCall_6_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getMultExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"length",
                      							lv_length_8_0,
                      							"com.shark.lang.Dd.INT");
                      					
                    }

                    }


                    }

                    // InternalDdParser.g:1996:4: ( (lv_hasAttribute_9_0= RULE_INT ) )
                    // InternalDdParser.g:1997:5: (lv_hasAttribute_9_0= RULE_INT )
                    {
                    // InternalDdParser.g:1997:5: (lv_hasAttribute_9_0= RULE_INT )
                    // InternalDdParser.g:1998:6: lv_hasAttribute_9_0= RULE_INT
                    {
                    lv_hasAttribute_9_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_hasAttribute_9_0, grammarAccess.getMultExpressionAccess().getHasAttributeINTTerminalRuleCall_6_3_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getMultExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"hasAttribute",
                      							lv_hasAttribute_9_0,
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
    // InternalDdParser.g:2019:1: entryRuleMultExpressionElt returns [EObject current=null] : iv_ruleMultExpressionElt= ruleMultExpressionElt EOF ;
    public final EObject entryRuleMultExpressionElt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultExpressionElt = null;


        try {
            // InternalDdParser.g:2019:58: (iv_ruleMultExpressionElt= ruleMultExpressionElt EOF )
            // InternalDdParser.g:2020:2: iv_ruleMultExpressionElt= ruleMultExpressionElt EOF
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
    // InternalDdParser.g:2026:1: ruleMultExpressionElt returns [EObject current=null] : ( ( (lv_op_0_0= Asterisk ) ) ( (lv_right_1_0= ruleSharkExpression ) ) ) ;
    public final EObject ruleMultExpressionElt() throws RecognitionException {
        EObject current = null;

        Token lv_op_0_0=null;
        EObject lv_right_1_0 = null;



        	enterRule();

        try {
            // InternalDdParser.g:2032:2: ( ( ( (lv_op_0_0= Asterisk ) ) ( (lv_right_1_0= ruleSharkExpression ) ) ) )
            // InternalDdParser.g:2033:2: ( ( (lv_op_0_0= Asterisk ) ) ( (lv_right_1_0= ruleSharkExpression ) ) )
            {
            // InternalDdParser.g:2033:2: ( ( (lv_op_0_0= Asterisk ) ) ( (lv_right_1_0= ruleSharkExpression ) ) )
            // InternalDdParser.g:2034:3: ( (lv_op_0_0= Asterisk ) ) ( (lv_right_1_0= ruleSharkExpression ) )
            {
            // InternalDdParser.g:2034:3: ( (lv_op_0_0= Asterisk ) )
            // InternalDdParser.g:2035:4: (lv_op_0_0= Asterisk )
            {
            // InternalDdParser.g:2035:4: (lv_op_0_0= Asterisk )
            // InternalDdParser.g:2036:5: lv_op_0_0= Asterisk
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

            // InternalDdParser.g:2048:3: ( (lv_right_1_0= ruleSharkExpression ) )
            // InternalDdParser.g:2049:4: (lv_right_1_0= ruleSharkExpression )
            {
            // InternalDdParser.g:2049:4: (lv_right_1_0= ruleSharkExpression )
            // InternalDdParser.g:2050:5: lv_right_1_0= ruleSharkExpression
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
    // InternalDdParser.g:2071:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // InternalDdParser.g:2071:54: (iv_ruleAndExpression= ruleAndExpression EOF )
            // InternalDdParser.g:2072:2: iv_ruleAndExpression= ruleAndExpression EOF
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
    // InternalDdParser.g:2078:1: ruleAndExpression returns [EObject current=null] : (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= And ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_andElts_4_0= ruleAndExpressionElt ) )+ otherlv_5= RightParenthesis ( ( (lv_exprValue_6_0= RULE_NUL ) ) ( (lv_hasAttribute_7_0= RULE_INT ) ) )? ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_op_2_0=null;
        Token otherlv_5=null;
        Token lv_exprValue_6_0=null;
        Token lv_hasAttribute_7_0=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_andElts_4_0 = null;



        	enterRule();

        try {
            // InternalDdParser.g:2084:2: ( (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= And ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_andElts_4_0= ruleAndExpressionElt ) )+ otherlv_5= RightParenthesis ( ( (lv_exprValue_6_0= RULE_NUL ) ) ( (lv_hasAttribute_7_0= RULE_INT ) ) )? ) )
            // InternalDdParser.g:2085:2: (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= And ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_andElts_4_0= ruleAndExpressionElt ) )+ otherlv_5= RightParenthesis ( ( (lv_exprValue_6_0= RULE_NUL ) ) ( (lv_hasAttribute_7_0= RULE_INT ) ) )? )
            {
            // InternalDdParser.g:2085:2: (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= And ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_andElts_4_0= ruleAndExpressionElt ) )+ otherlv_5= RightParenthesis ( ( (lv_exprValue_6_0= RULE_NUL ) ) ( (lv_hasAttribute_7_0= RULE_INT ) ) )? )
            // InternalDdParser.g:2086:3: otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= And ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_andElts_4_0= ruleAndExpressionElt ) )+ otherlv_5= RightParenthesis ( ( (lv_exprValue_6_0= RULE_NUL ) ) ( (lv_hasAttribute_7_0= RULE_INT ) ) )?
            {
            otherlv_0=(Token)match(input,LeftParenthesis,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAndExpressionAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalDdParser.g:2090:3: ( (lv_left_1_0= ruleSharkExpression ) )
            // InternalDdParser.g:2091:4: (lv_left_1_0= ruleSharkExpression )
            {
            // InternalDdParser.g:2091:4: (lv_left_1_0= ruleSharkExpression )
            // InternalDdParser.g:2092:5: lv_left_1_0= ruleSharkExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAndExpressionAccess().getLeftSharkExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_47);
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

            // InternalDdParser.g:2109:3: ( (lv_op_2_0= And ) )
            // InternalDdParser.g:2110:4: (lv_op_2_0= And )
            {
            // InternalDdParser.g:2110:4: (lv_op_2_0= And )
            // InternalDdParser.g:2111:5: lv_op_2_0= And
            {
            lv_op_2_0=(Token)match(input,And,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_op_2_0, grammarAccess.getAndExpressionAccess().getOpAndKeyword_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getAndExpressionRule());
              					}
              					setWithLastConsumed(current, "op", lv_op_2_0, "and");
              				
            }

            }


            }

            // InternalDdParser.g:2123:3: ( (lv_right_3_0= ruleSharkExpression ) )
            // InternalDdParser.g:2124:4: (lv_right_3_0= ruleSharkExpression )
            {
            // InternalDdParser.g:2124:4: (lv_right_3_0= ruleSharkExpression )
            // InternalDdParser.g:2125:5: lv_right_3_0= ruleSharkExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAndExpressionAccess().getRightSharkExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_47);
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

            // InternalDdParser.g:2142:3: ( (lv_andElts_4_0= ruleAndExpressionElt ) )+
            int cnt36=0;
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==And) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalDdParser.g:2143:4: (lv_andElts_4_0= ruleAndExpressionElt )
            	    {
            	    // InternalDdParser.g:2143:4: (lv_andElts_4_0= ruleAndExpressionElt )
            	    // InternalDdParser.g:2144:5: lv_andElts_4_0= ruleAndExpressionElt
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getAndExpressionAccess().getAndEltsAndExpressionEltParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_48);
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
            	    if ( cnt36 >= 1 ) break loop36;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(36, input);
                        throw eee;
                }
                cnt36++;
            } while (true);

            otherlv_5=(Token)match(input,RightParenthesis,FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getAndExpressionAccess().getRightParenthesisKeyword_5());
              		
            }
            // InternalDdParser.g:2165:3: ( ( (lv_exprValue_6_0= RULE_NUL ) ) ( (lv_hasAttribute_7_0= RULE_INT ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_NUL) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalDdParser.g:2166:4: ( (lv_exprValue_6_0= RULE_NUL ) ) ( (lv_hasAttribute_7_0= RULE_INT ) )
                    {
                    // InternalDdParser.g:2166:4: ( (lv_exprValue_6_0= RULE_NUL ) )
                    // InternalDdParser.g:2167:5: (lv_exprValue_6_0= RULE_NUL )
                    {
                    // InternalDdParser.g:2167:5: (lv_exprValue_6_0= RULE_NUL )
                    // InternalDdParser.g:2168:6: lv_exprValue_6_0= RULE_NUL
                    {
                    lv_exprValue_6_0=(Token)match(input,RULE_NUL,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_exprValue_6_0, grammarAccess.getAndExpressionAccess().getExprValueNULTerminalRuleCall_6_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAndExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"exprValue",
                      							lv_exprValue_6_0,
                      							"com.shark.lang.Dd.NUL");
                      					
                    }

                    }


                    }

                    // InternalDdParser.g:2184:4: ( (lv_hasAttribute_7_0= RULE_INT ) )
                    // InternalDdParser.g:2185:5: (lv_hasAttribute_7_0= RULE_INT )
                    {
                    // InternalDdParser.g:2185:5: (lv_hasAttribute_7_0= RULE_INT )
                    // InternalDdParser.g:2186:6: lv_hasAttribute_7_0= RULE_INT
                    {
                    lv_hasAttribute_7_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_hasAttribute_7_0, grammarAccess.getAndExpressionAccess().getHasAttributeINTTerminalRuleCall_6_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAndExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"hasAttribute",
                      							lv_hasAttribute_7_0,
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
    // InternalDdParser.g:2207:1: entryRuleAndExpressionElt returns [EObject current=null] : iv_ruleAndExpressionElt= ruleAndExpressionElt EOF ;
    public final EObject entryRuleAndExpressionElt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpressionElt = null;


        try {
            // InternalDdParser.g:2207:57: (iv_ruleAndExpressionElt= ruleAndExpressionElt EOF )
            // InternalDdParser.g:2208:2: iv_ruleAndExpressionElt= ruleAndExpressionElt EOF
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
    // InternalDdParser.g:2214:1: ruleAndExpressionElt returns [EObject current=null] : ( ( (lv_op_0_0= And ) ) ( (lv_right_1_0= ruleSharkExpression ) ) ) ;
    public final EObject ruleAndExpressionElt() throws RecognitionException {
        EObject current = null;

        Token lv_op_0_0=null;
        EObject lv_right_1_0 = null;



        	enterRule();

        try {
            // InternalDdParser.g:2220:2: ( ( ( (lv_op_0_0= And ) ) ( (lv_right_1_0= ruleSharkExpression ) ) ) )
            // InternalDdParser.g:2221:2: ( ( (lv_op_0_0= And ) ) ( (lv_right_1_0= ruleSharkExpression ) ) )
            {
            // InternalDdParser.g:2221:2: ( ( (lv_op_0_0= And ) ) ( (lv_right_1_0= ruleSharkExpression ) ) )
            // InternalDdParser.g:2222:3: ( (lv_op_0_0= And ) ) ( (lv_right_1_0= ruleSharkExpression ) )
            {
            // InternalDdParser.g:2222:3: ( (lv_op_0_0= And ) )
            // InternalDdParser.g:2223:4: (lv_op_0_0= And )
            {
            // InternalDdParser.g:2223:4: (lv_op_0_0= And )
            // InternalDdParser.g:2224:5: lv_op_0_0= And
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

            // InternalDdParser.g:2236:3: ( (lv_right_1_0= ruleSharkExpression ) )
            // InternalDdParser.g:2237:4: (lv_right_1_0= ruleSharkExpression )
            {
            // InternalDdParser.g:2237:4: (lv_right_1_0= ruleSharkExpression )
            // InternalDdParser.g:2238:5: lv_right_1_0= ruleSharkExpression
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
    // InternalDdParser.g:2259:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // InternalDdParser.g:2259:53: (iv_ruleOrExpression= ruleOrExpression EOF )
            // InternalDdParser.g:2260:2: iv_ruleOrExpression= ruleOrExpression EOF
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
    // InternalDdParser.g:2266:1: ruleOrExpression returns [EObject current=null] : (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= Or ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_orElts_4_0= ruleOrExpressionElt ) )+ otherlv_5= RightParenthesis ( ( (lv_exprValue_6_0= RULE_NUL ) ) ( (lv_hasAttribute_7_0= RULE_INT ) ) )? ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_op_2_0=null;
        Token otherlv_5=null;
        Token lv_exprValue_6_0=null;
        Token lv_hasAttribute_7_0=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_orElts_4_0 = null;



        	enterRule();

        try {
            // InternalDdParser.g:2272:2: ( (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= Or ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_orElts_4_0= ruleOrExpressionElt ) )+ otherlv_5= RightParenthesis ( ( (lv_exprValue_6_0= RULE_NUL ) ) ( (lv_hasAttribute_7_0= RULE_INT ) ) )? ) )
            // InternalDdParser.g:2273:2: (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= Or ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_orElts_4_0= ruleOrExpressionElt ) )+ otherlv_5= RightParenthesis ( ( (lv_exprValue_6_0= RULE_NUL ) ) ( (lv_hasAttribute_7_0= RULE_INT ) ) )? )
            {
            // InternalDdParser.g:2273:2: (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= Or ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_orElts_4_0= ruleOrExpressionElt ) )+ otherlv_5= RightParenthesis ( ( (lv_exprValue_6_0= RULE_NUL ) ) ( (lv_hasAttribute_7_0= RULE_INT ) ) )? )
            // InternalDdParser.g:2274:3: otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= Or ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_orElts_4_0= ruleOrExpressionElt ) )+ otherlv_5= RightParenthesis ( ( (lv_exprValue_6_0= RULE_NUL ) ) ( (lv_hasAttribute_7_0= RULE_INT ) ) )?
            {
            otherlv_0=(Token)match(input,LeftParenthesis,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getOrExpressionAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalDdParser.g:2278:3: ( (lv_left_1_0= ruleSharkExpression ) )
            // InternalDdParser.g:2279:4: (lv_left_1_0= ruleSharkExpression )
            {
            // InternalDdParser.g:2279:4: (lv_left_1_0= ruleSharkExpression )
            // InternalDdParser.g:2280:5: lv_left_1_0= ruleSharkExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getOrExpressionAccess().getLeftSharkExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_49);
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

            // InternalDdParser.g:2297:3: ( (lv_op_2_0= Or ) )
            // InternalDdParser.g:2298:4: (lv_op_2_0= Or )
            {
            // InternalDdParser.g:2298:4: (lv_op_2_0= Or )
            // InternalDdParser.g:2299:5: lv_op_2_0= Or
            {
            lv_op_2_0=(Token)match(input,Or,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_op_2_0, grammarAccess.getOrExpressionAccess().getOpOrKeyword_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getOrExpressionRule());
              					}
              					setWithLastConsumed(current, "op", lv_op_2_0, "or");
              				
            }

            }


            }

            // InternalDdParser.g:2311:3: ( (lv_right_3_0= ruleSharkExpression ) )
            // InternalDdParser.g:2312:4: (lv_right_3_0= ruleSharkExpression )
            {
            // InternalDdParser.g:2312:4: (lv_right_3_0= ruleSharkExpression )
            // InternalDdParser.g:2313:5: lv_right_3_0= ruleSharkExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getOrExpressionAccess().getRightSharkExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_49);
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

            // InternalDdParser.g:2330:3: ( (lv_orElts_4_0= ruleOrExpressionElt ) )+
            int cnt38=0;
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==Or) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalDdParser.g:2331:4: (lv_orElts_4_0= ruleOrExpressionElt )
            	    {
            	    // InternalDdParser.g:2331:4: (lv_orElts_4_0= ruleOrExpressionElt )
            	    // InternalDdParser.g:2332:5: lv_orElts_4_0= ruleOrExpressionElt
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getOrExpressionAccess().getOrEltsOrExpressionEltParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_50);
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
            	    if ( cnt38 >= 1 ) break loop38;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(38, input);
                        throw eee;
                }
                cnt38++;
            } while (true);

            otherlv_5=(Token)match(input,RightParenthesis,FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getOrExpressionAccess().getRightParenthesisKeyword_5());
              		
            }
            // InternalDdParser.g:2353:3: ( ( (lv_exprValue_6_0= RULE_NUL ) ) ( (lv_hasAttribute_7_0= RULE_INT ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_NUL) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalDdParser.g:2354:4: ( (lv_exprValue_6_0= RULE_NUL ) ) ( (lv_hasAttribute_7_0= RULE_INT ) )
                    {
                    // InternalDdParser.g:2354:4: ( (lv_exprValue_6_0= RULE_NUL ) )
                    // InternalDdParser.g:2355:5: (lv_exprValue_6_0= RULE_NUL )
                    {
                    // InternalDdParser.g:2355:5: (lv_exprValue_6_0= RULE_NUL )
                    // InternalDdParser.g:2356:6: lv_exprValue_6_0= RULE_NUL
                    {
                    lv_exprValue_6_0=(Token)match(input,RULE_NUL,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_exprValue_6_0, grammarAccess.getOrExpressionAccess().getExprValueNULTerminalRuleCall_6_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getOrExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"exprValue",
                      							lv_exprValue_6_0,
                      							"com.shark.lang.Dd.NUL");
                      					
                    }

                    }


                    }

                    // InternalDdParser.g:2372:4: ( (lv_hasAttribute_7_0= RULE_INT ) )
                    // InternalDdParser.g:2373:5: (lv_hasAttribute_7_0= RULE_INT )
                    {
                    // InternalDdParser.g:2373:5: (lv_hasAttribute_7_0= RULE_INT )
                    // InternalDdParser.g:2374:6: lv_hasAttribute_7_0= RULE_INT
                    {
                    lv_hasAttribute_7_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_hasAttribute_7_0, grammarAccess.getOrExpressionAccess().getHasAttributeINTTerminalRuleCall_6_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getOrExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"hasAttribute",
                      							lv_hasAttribute_7_0,
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
    // InternalDdParser.g:2395:1: entryRuleOrExpressionElt returns [EObject current=null] : iv_ruleOrExpressionElt= ruleOrExpressionElt EOF ;
    public final EObject entryRuleOrExpressionElt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpressionElt = null;


        try {
            // InternalDdParser.g:2395:56: (iv_ruleOrExpressionElt= ruleOrExpressionElt EOF )
            // InternalDdParser.g:2396:2: iv_ruleOrExpressionElt= ruleOrExpressionElt EOF
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
    // InternalDdParser.g:2402:1: ruleOrExpressionElt returns [EObject current=null] : ( ( (lv_op_0_0= Or ) ) ( (lv_right_1_0= ruleSharkExpression ) ) ) ;
    public final EObject ruleOrExpressionElt() throws RecognitionException {
        EObject current = null;

        Token lv_op_0_0=null;
        EObject lv_right_1_0 = null;



        	enterRule();

        try {
            // InternalDdParser.g:2408:2: ( ( ( (lv_op_0_0= Or ) ) ( (lv_right_1_0= ruleSharkExpression ) ) ) )
            // InternalDdParser.g:2409:2: ( ( (lv_op_0_0= Or ) ) ( (lv_right_1_0= ruleSharkExpression ) ) )
            {
            // InternalDdParser.g:2409:2: ( ( (lv_op_0_0= Or ) ) ( (lv_right_1_0= ruleSharkExpression ) ) )
            // InternalDdParser.g:2410:3: ( (lv_op_0_0= Or ) ) ( (lv_right_1_0= ruleSharkExpression ) )
            {
            // InternalDdParser.g:2410:3: ( (lv_op_0_0= Or ) )
            // InternalDdParser.g:2411:4: (lv_op_0_0= Or )
            {
            // InternalDdParser.g:2411:4: (lv_op_0_0= Or )
            // InternalDdParser.g:2412:5: lv_op_0_0= Or
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

            // InternalDdParser.g:2424:3: ( (lv_right_1_0= ruleSharkExpression ) )
            // InternalDdParser.g:2425:4: (lv_right_1_0= ruleSharkExpression )
            {
            // InternalDdParser.g:2425:4: (lv_right_1_0= ruleSharkExpression )
            // InternalDdParser.g:2426:5: lv_right_1_0= ruleSharkExpression
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
    // InternalDdParser.g:2447:1: entryRuleCatExpression returns [EObject current=null] : iv_ruleCatExpression= ruleCatExpression EOF ;
    public final EObject entryRuleCatExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCatExpression = null;


        try {
            // InternalDdParser.g:2447:54: (iv_ruleCatExpression= ruleCatExpression EOF )
            // InternalDdParser.g:2448:2: iv_ruleCatExpression= ruleCatExpression EOF
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
    // InternalDdParser.g:2454:1: ruleCatExpression returns [EObject current=null] : (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= Ampersand ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_catElts_4_0= ruleCatExpressionElt ) )+ otherlv_5= RightParenthesis ( ( (lv_exprValue_6_0= RULE_NUL ) ) ( (lv_length_7_0= RULE_INT ) ) ( (lv_hasAttribute_8_0= RULE_INT ) ) )? ) ;
    public final EObject ruleCatExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_op_2_0=null;
        Token otherlv_5=null;
        Token lv_exprValue_6_0=null;
        Token lv_length_7_0=null;
        Token lv_hasAttribute_8_0=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_catElts_4_0 = null;



        	enterRule();

        try {
            // InternalDdParser.g:2460:2: ( (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= Ampersand ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_catElts_4_0= ruleCatExpressionElt ) )+ otherlv_5= RightParenthesis ( ( (lv_exprValue_6_0= RULE_NUL ) ) ( (lv_length_7_0= RULE_INT ) ) ( (lv_hasAttribute_8_0= RULE_INT ) ) )? ) )
            // InternalDdParser.g:2461:2: (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= Ampersand ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_catElts_4_0= ruleCatExpressionElt ) )+ otherlv_5= RightParenthesis ( ( (lv_exprValue_6_0= RULE_NUL ) ) ( (lv_length_7_0= RULE_INT ) ) ( (lv_hasAttribute_8_0= RULE_INT ) ) )? )
            {
            // InternalDdParser.g:2461:2: (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= Ampersand ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_catElts_4_0= ruleCatExpressionElt ) )+ otherlv_5= RightParenthesis ( ( (lv_exprValue_6_0= RULE_NUL ) ) ( (lv_length_7_0= RULE_INT ) ) ( (lv_hasAttribute_8_0= RULE_INT ) ) )? )
            // InternalDdParser.g:2462:3: otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= Ampersand ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_catElts_4_0= ruleCatExpressionElt ) )+ otherlv_5= RightParenthesis ( ( (lv_exprValue_6_0= RULE_NUL ) ) ( (lv_length_7_0= RULE_INT ) ) ( (lv_hasAttribute_8_0= RULE_INT ) ) )?
            {
            otherlv_0=(Token)match(input,LeftParenthesis,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getCatExpressionAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalDdParser.g:2466:3: ( (lv_left_1_0= ruleSharkExpression ) )
            // InternalDdParser.g:2467:4: (lv_left_1_0= ruleSharkExpression )
            {
            // InternalDdParser.g:2467:4: (lv_left_1_0= ruleSharkExpression )
            // InternalDdParser.g:2468:5: lv_left_1_0= ruleSharkExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCatExpressionAccess().getLeftSharkExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_51);
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

            // InternalDdParser.g:2485:3: ( (lv_op_2_0= Ampersand ) )
            // InternalDdParser.g:2486:4: (lv_op_2_0= Ampersand )
            {
            // InternalDdParser.g:2486:4: (lv_op_2_0= Ampersand )
            // InternalDdParser.g:2487:5: lv_op_2_0= Ampersand
            {
            lv_op_2_0=(Token)match(input,Ampersand,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_op_2_0, grammarAccess.getCatExpressionAccess().getOpAmpersandKeyword_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getCatExpressionRule());
              					}
              					setWithLastConsumed(current, "op", lv_op_2_0, "&");
              				
            }

            }


            }

            // InternalDdParser.g:2499:3: ( (lv_right_3_0= ruleSharkExpression ) )
            // InternalDdParser.g:2500:4: (lv_right_3_0= ruleSharkExpression )
            {
            // InternalDdParser.g:2500:4: (lv_right_3_0= ruleSharkExpression )
            // InternalDdParser.g:2501:5: lv_right_3_0= ruleSharkExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCatExpressionAccess().getRightSharkExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_51);
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

            // InternalDdParser.g:2518:3: ( (lv_catElts_4_0= ruleCatExpressionElt ) )+
            int cnt40=0;
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==Ampersand) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalDdParser.g:2519:4: (lv_catElts_4_0= ruleCatExpressionElt )
            	    {
            	    // InternalDdParser.g:2519:4: (lv_catElts_4_0= ruleCatExpressionElt )
            	    // InternalDdParser.g:2520:5: lv_catElts_4_0= ruleCatExpressionElt
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getCatExpressionAccess().getCatEltsCatExpressionEltParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_52);
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
            	    if ( cnt40 >= 1 ) break loop40;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(40, input);
                        throw eee;
                }
                cnt40++;
            } while (true);

            otherlv_5=(Token)match(input,RightParenthesis,FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getCatExpressionAccess().getRightParenthesisKeyword_5());
              		
            }
            // InternalDdParser.g:2541:3: ( ( (lv_exprValue_6_0= RULE_NUL ) ) ( (lv_length_7_0= RULE_INT ) ) ( (lv_hasAttribute_8_0= RULE_INT ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_NUL) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalDdParser.g:2542:4: ( (lv_exprValue_6_0= RULE_NUL ) ) ( (lv_length_7_0= RULE_INT ) ) ( (lv_hasAttribute_8_0= RULE_INT ) )
                    {
                    // InternalDdParser.g:2542:4: ( (lv_exprValue_6_0= RULE_NUL ) )
                    // InternalDdParser.g:2543:5: (lv_exprValue_6_0= RULE_NUL )
                    {
                    // InternalDdParser.g:2543:5: (lv_exprValue_6_0= RULE_NUL )
                    // InternalDdParser.g:2544:6: lv_exprValue_6_0= RULE_NUL
                    {
                    lv_exprValue_6_0=(Token)match(input,RULE_NUL,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_exprValue_6_0, grammarAccess.getCatExpressionAccess().getExprValueNULTerminalRuleCall_6_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getCatExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"exprValue",
                      							lv_exprValue_6_0,
                      							"com.shark.lang.Dd.NUL");
                      					
                    }

                    }


                    }

                    // InternalDdParser.g:2560:4: ( (lv_length_7_0= RULE_INT ) )
                    // InternalDdParser.g:2561:5: (lv_length_7_0= RULE_INT )
                    {
                    // InternalDdParser.g:2561:5: (lv_length_7_0= RULE_INT )
                    // InternalDdParser.g:2562:6: lv_length_7_0= RULE_INT
                    {
                    lv_length_7_0=(Token)match(input,RULE_INT,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_length_7_0, grammarAccess.getCatExpressionAccess().getLengthINTTerminalRuleCall_6_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getCatExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"length",
                      							lv_length_7_0,
                      							"com.shark.lang.Dd.INT");
                      					
                    }

                    }


                    }

                    // InternalDdParser.g:2578:4: ( (lv_hasAttribute_8_0= RULE_INT ) )
                    // InternalDdParser.g:2579:5: (lv_hasAttribute_8_0= RULE_INT )
                    {
                    // InternalDdParser.g:2579:5: (lv_hasAttribute_8_0= RULE_INT )
                    // InternalDdParser.g:2580:6: lv_hasAttribute_8_0= RULE_INT
                    {
                    lv_hasAttribute_8_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_hasAttribute_8_0, grammarAccess.getCatExpressionAccess().getHasAttributeINTTerminalRuleCall_6_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getCatExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"hasAttribute",
                      							lv_hasAttribute_8_0,
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
    // InternalDdParser.g:2601:1: entryRuleCatExpressionElt returns [EObject current=null] : iv_ruleCatExpressionElt= ruleCatExpressionElt EOF ;
    public final EObject entryRuleCatExpressionElt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCatExpressionElt = null;


        try {
            // InternalDdParser.g:2601:57: (iv_ruleCatExpressionElt= ruleCatExpressionElt EOF )
            // InternalDdParser.g:2602:2: iv_ruleCatExpressionElt= ruleCatExpressionElt EOF
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
    // InternalDdParser.g:2608:1: ruleCatExpressionElt returns [EObject current=null] : ( ( (lv_op_0_0= Ampersand ) ) ( (lv_right_1_0= ruleSharkExpression ) ) ) ;
    public final EObject ruleCatExpressionElt() throws RecognitionException {
        EObject current = null;

        Token lv_op_0_0=null;
        EObject lv_right_1_0 = null;



        	enterRule();

        try {
            // InternalDdParser.g:2614:2: ( ( ( (lv_op_0_0= Ampersand ) ) ( (lv_right_1_0= ruleSharkExpression ) ) ) )
            // InternalDdParser.g:2615:2: ( ( (lv_op_0_0= Ampersand ) ) ( (lv_right_1_0= ruleSharkExpression ) ) )
            {
            // InternalDdParser.g:2615:2: ( ( (lv_op_0_0= Ampersand ) ) ( (lv_right_1_0= ruleSharkExpression ) ) )
            // InternalDdParser.g:2616:3: ( (lv_op_0_0= Ampersand ) ) ( (lv_right_1_0= ruleSharkExpression ) )
            {
            // InternalDdParser.g:2616:3: ( (lv_op_0_0= Ampersand ) )
            // InternalDdParser.g:2617:4: (lv_op_0_0= Ampersand )
            {
            // InternalDdParser.g:2617:4: (lv_op_0_0= Ampersand )
            // InternalDdParser.g:2618:5: lv_op_0_0= Ampersand
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

            // InternalDdParser.g:2630:3: ( (lv_right_1_0= ruleSharkExpression ) )
            // InternalDdParser.g:2631:4: (lv_right_1_0= ruleSharkExpression )
            {
            // InternalDdParser.g:2631:4: (lv_right_1_0= ruleSharkExpression )
            // InternalDdParser.g:2632:5: lv_right_1_0= ruleSharkExpression
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
    // InternalDdParser.g:2653:1: entryRuleListExpression returns [EObject current=null] : iv_ruleListExpression= ruleListExpression EOF ;
    public final EObject entryRuleListExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListExpression = null;


        try {
            // InternalDdParser.g:2653:55: (iv_ruleListExpression= ruleListExpression EOF )
            // InternalDdParser.g:2654:2: iv_ruleListExpression= ruleListExpression EOF
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
    // InternalDdParser.g:2660:1: ruleListExpression returns [EObject current=null] : ( ( (lv_op_0_0= LeftParenthesis ) ) ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_ListElts_2_0= ruleListExpressionElt ) )+ otherlv_3= RightParenthesis ( ( (lv_exprValue_4_0= RULE_NUL ) ) ( (lv_hasAttribute_5_0= RULE_INT ) ) )? ) ;
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
            // InternalDdParser.g:2666:2: ( ( ( (lv_op_0_0= LeftParenthesis ) ) ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_ListElts_2_0= ruleListExpressionElt ) )+ otherlv_3= RightParenthesis ( ( (lv_exprValue_4_0= RULE_NUL ) ) ( (lv_hasAttribute_5_0= RULE_INT ) ) )? ) )
            // InternalDdParser.g:2667:2: ( ( (lv_op_0_0= LeftParenthesis ) ) ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_ListElts_2_0= ruleListExpressionElt ) )+ otherlv_3= RightParenthesis ( ( (lv_exprValue_4_0= RULE_NUL ) ) ( (lv_hasAttribute_5_0= RULE_INT ) ) )? )
            {
            // InternalDdParser.g:2667:2: ( ( (lv_op_0_0= LeftParenthesis ) ) ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_ListElts_2_0= ruleListExpressionElt ) )+ otherlv_3= RightParenthesis ( ( (lv_exprValue_4_0= RULE_NUL ) ) ( (lv_hasAttribute_5_0= RULE_INT ) ) )? )
            // InternalDdParser.g:2668:3: ( (lv_op_0_0= LeftParenthesis ) ) ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_ListElts_2_0= ruleListExpressionElt ) )+ otherlv_3= RightParenthesis ( ( (lv_exprValue_4_0= RULE_NUL ) ) ( (lv_hasAttribute_5_0= RULE_INT ) ) )?
            {
            // InternalDdParser.g:2668:3: ( (lv_op_0_0= LeftParenthesis ) )
            // InternalDdParser.g:2669:4: (lv_op_0_0= LeftParenthesis )
            {
            // InternalDdParser.g:2669:4: (lv_op_0_0= LeftParenthesis )
            // InternalDdParser.g:2670:5: lv_op_0_0= LeftParenthesis
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

            // InternalDdParser.g:2682:3: ( (lv_left_1_0= ruleSharkExpression ) )
            // InternalDdParser.g:2683:4: (lv_left_1_0= ruleSharkExpression )
            {
            // InternalDdParser.g:2683:4: (lv_left_1_0= ruleSharkExpression )
            // InternalDdParser.g:2684:5: lv_left_1_0= ruleSharkExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getListExpressionAccess().getLeftSharkExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_53);
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

            // InternalDdParser.g:2701:3: ( (lv_ListElts_2_0= ruleListExpressionElt ) )+
            int cnt42=0;
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==Comma) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalDdParser.g:2702:4: (lv_ListElts_2_0= ruleListExpressionElt )
            	    {
            	    // InternalDdParser.g:2702:4: (lv_ListElts_2_0= ruleListExpressionElt )
            	    // InternalDdParser.g:2703:5: lv_ListElts_2_0= ruleListExpressionElt
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
            	    if ( cnt42 >= 1 ) break loop42;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(42, input);
                        throw eee;
                }
                cnt42++;
            } while (true);

            otherlv_3=(Token)match(input,RightParenthesis,FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getListExpressionAccess().getRightParenthesisKeyword_3());
              		
            }
            // InternalDdParser.g:2724:3: ( ( (lv_exprValue_4_0= RULE_NUL ) ) ( (lv_hasAttribute_5_0= RULE_INT ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_NUL) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalDdParser.g:2725:4: ( (lv_exprValue_4_0= RULE_NUL ) ) ( (lv_hasAttribute_5_0= RULE_INT ) )
                    {
                    // InternalDdParser.g:2725:4: ( (lv_exprValue_4_0= RULE_NUL ) )
                    // InternalDdParser.g:2726:5: (lv_exprValue_4_0= RULE_NUL )
                    {
                    // InternalDdParser.g:2726:5: (lv_exprValue_4_0= RULE_NUL )
                    // InternalDdParser.g:2727:6: lv_exprValue_4_0= RULE_NUL
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

                    // InternalDdParser.g:2743:4: ( (lv_hasAttribute_5_0= RULE_INT ) )
                    // InternalDdParser.g:2744:5: (lv_hasAttribute_5_0= RULE_INT )
                    {
                    // InternalDdParser.g:2744:5: (lv_hasAttribute_5_0= RULE_INT )
                    // InternalDdParser.g:2745:6: lv_hasAttribute_5_0= RULE_INT
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
    // InternalDdParser.g:2766:1: entryRuleListExpressionElt returns [EObject current=null] : iv_ruleListExpressionElt= ruleListExpressionElt EOF ;
    public final EObject entryRuleListExpressionElt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListExpressionElt = null;


        try {
            // InternalDdParser.g:2766:58: (iv_ruleListExpressionElt= ruleListExpressionElt EOF )
            // InternalDdParser.g:2767:2: iv_ruleListExpressionElt= ruleListExpressionElt EOF
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
    // InternalDdParser.g:2773:1: ruleListExpressionElt returns [EObject current=null] : ( ( (lv_op_0_0= Comma ) ) ( (lv_right_1_0= ruleSharkExpression ) ) ) ;
    public final EObject ruleListExpressionElt() throws RecognitionException {
        EObject current = null;

        Token lv_op_0_0=null;
        EObject lv_right_1_0 = null;



        	enterRule();

        try {
            // InternalDdParser.g:2779:2: ( ( ( (lv_op_0_0= Comma ) ) ( (lv_right_1_0= ruleSharkExpression ) ) ) )
            // InternalDdParser.g:2780:2: ( ( (lv_op_0_0= Comma ) ) ( (lv_right_1_0= ruleSharkExpression ) ) )
            {
            // InternalDdParser.g:2780:2: ( ( (lv_op_0_0= Comma ) ) ( (lv_right_1_0= ruleSharkExpression ) ) )
            // InternalDdParser.g:2781:3: ( (lv_op_0_0= Comma ) ) ( (lv_right_1_0= ruleSharkExpression ) )
            {
            // InternalDdParser.g:2781:3: ( (lv_op_0_0= Comma ) )
            // InternalDdParser.g:2782:4: (lv_op_0_0= Comma )
            {
            // InternalDdParser.g:2782:4: (lv_op_0_0= Comma )
            // InternalDdParser.g:2783:5: lv_op_0_0= Comma
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

            // InternalDdParser.g:2795:3: ( (lv_right_1_0= ruleSharkExpression ) )
            // InternalDdParser.g:2796:4: (lv_right_1_0= ruleSharkExpression )
            {
            // InternalDdParser.g:2796:4: (lv_right_1_0= ruleSharkExpression )
            // InternalDdParser.g:2797:5: lv_right_1_0= ruleSharkExpression
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
    // InternalDdParser.g:2818:1: entryRuleRangeExpression returns [EObject current=null] : iv_ruleRangeExpression= ruleRangeExpression EOF ;
    public final EObject entryRuleRangeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRangeExpression = null;


        try {
            // InternalDdParser.g:2818:56: (iv_ruleRangeExpression= ruleRangeExpression EOF )
            // InternalDdParser.g:2819:2: iv_ruleRangeExpression= ruleRangeExpression EOF
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
    // InternalDdParser.g:2825:1: ruleRangeExpression returns [EObject current=null] : ( ( () otherlv_1= LeftParenthesis ( (lv_range_2_0= RULE_RANGE ) ) otherlv_3= RightParenthesis ) | ( () ( ( LeftParenthesis )=>otherlv_5= LeftParenthesis ) ( (lv_range_6_0= RULE_RANGEINF ) ) otherlv_7= RightParenthesis ) ) ;
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
            // InternalDdParser.g:2831:2: ( ( ( () otherlv_1= LeftParenthesis ( (lv_range_2_0= RULE_RANGE ) ) otherlv_3= RightParenthesis ) | ( () ( ( LeftParenthesis )=>otherlv_5= LeftParenthesis ) ( (lv_range_6_0= RULE_RANGEINF ) ) otherlv_7= RightParenthesis ) ) )
            // InternalDdParser.g:2832:2: ( ( () otherlv_1= LeftParenthesis ( (lv_range_2_0= RULE_RANGE ) ) otherlv_3= RightParenthesis ) | ( () ( ( LeftParenthesis )=>otherlv_5= LeftParenthesis ) ( (lv_range_6_0= RULE_RANGEINF ) ) otherlv_7= RightParenthesis ) )
            {
            // InternalDdParser.g:2832:2: ( ( () otherlv_1= LeftParenthesis ( (lv_range_2_0= RULE_RANGE ) ) otherlv_3= RightParenthesis ) | ( () ( ( LeftParenthesis )=>otherlv_5= LeftParenthesis ) ( (lv_range_6_0= RULE_RANGEINF ) ) otherlv_7= RightParenthesis ) )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==LeftParenthesis) ) {
                int LA44_1 = input.LA(2);

                if ( (LA44_1==RULE_RANGE) ) {
                    alt44=1;
                }
                else if ( (LA44_1==RULE_RANGEINF) ) {
                    alt44=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 44, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalDdParser.g:2833:3: ( () otherlv_1= LeftParenthesis ( (lv_range_2_0= RULE_RANGE ) ) otherlv_3= RightParenthesis )
                    {
                    // InternalDdParser.g:2833:3: ( () otherlv_1= LeftParenthesis ( (lv_range_2_0= RULE_RANGE ) ) otherlv_3= RightParenthesis )
                    // InternalDdParser.g:2834:4: () otherlv_1= LeftParenthesis ( (lv_range_2_0= RULE_RANGE ) ) otherlv_3= RightParenthesis
                    {
                    // InternalDdParser.g:2834:4: ()
                    // InternalDdParser.g:2835:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getRangeExpressionAccess().getListExpressionAction_0_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_54); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getRangeExpressionAccess().getLeftParenthesisKeyword_0_1());
                      			
                    }
                    // InternalDdParser.g:2845:4: ( (lv_range_2_0= RULE_RANGE ) )
                    // InternalDdParser.g:2846:5: (lv_range_2_0= RULE_RANGE )
                    {
                    // InternalDdParser.g:2846:5: (lv_range_2_0= RULE_RANGE )
                    // InternalDdParser.g:2847:6: lv_range_2_0= RULE_RANGE
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
                    // InternalDdParser.g:2869:3: ( () ( ( LeftParenthesis )=>otherlv_5= LeftParenthesis ) ( (lv_range_6_0= RULE_RANGEINF ) ) otherlv_7= RightParenthesis )
                    {
                    // InternalDdParser.g:2869:3: ( () ( ( LeftParenthesis )=>otherlv_5= LeftParenthesis ) ( (lv_range_6_0= RULE_RANGEINF ) ) otherlv_7= RightParenthesis )
                    // InternalDdParser.g:2870:4: () ( ( LeftParenthesis )=>otherlv_5= LeftParenthesis ) ( (lv_range_6_0= RULE_RANGEINF ) ) otherlv_7= RightParenthesis
                    {
                    // InternalDdParser.g:2870:4: ()
                    // InternalDdParser.g:2871:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getRangeExpressionAccess().getListExpressionAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalDdParser.g:2877:4: ( ( LeftParenthesis )=>otherlv_5= LeftParenthesis )
                    // InternalDdParser.g:2878:5: ( LeftParenthesis )=>otherlv_5= LeftParenthesis
                    {
                    otherlv_5=(Token)match(input,LeftParenthesis,FOLLOW_55); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getRangeExpressionAccess().getLeftParenthesisKeyword_1_1());
                      				
                    }

                    }

                    // InternalDdParser.g:2884:4: ( (lv_range_6_0= RULE_RANGEINF ) )
                    // InternalDdParser.g:2885:5: (lv_range_6_0= RULE_RANGEINF )
                    {
                    // InternalDdParser.g:2885:5: (lv_range_6_0= RULE_RANGEINF )
                    // InternalDdParser.g:2886:6: lv_range_6_0= RULE_RANGEINF
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
    // InternalDdParser.g:2911:1: entryRuleTerminalExpression returns [EObject current=null] : iv_ruleTerminalExpression= ruleTerminalExpression EOF ;
    public final EObject entryRuleTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalExpression = null;


        try {
            // InternalDdParser.g:2911:59: (iv_ruleTerminalExpression= ruleTerminalExpression EOF )
            // InternalDdParser.g:2912:2: iv_ruleTerminalExpression= ruleTerminalExpression EOF
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
    // InternalDdParser.g:2918:1: ruleTerminalExpression returns [EObject current=null] : ( ( ( () ( (lv_value_1_0= RULE_STR ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( (lv_value_5_0= RULE_DEC ) ) ) | ( () ( (lv_value_7_0= RULE_CHR ) ) ) | ( () ( (otherlv_9= RULE_CSTID ) ) ( (lv_index_10_0= ruleArraySize ) )? ) | ( () ( (lv_value_12_0= ruleBoolean ) ) ) | ( () ( (lv_value_14_0= ruleUnset ) ) ) | ( () ( ( ruleQualifiedName ) ) ( (lv_index_17_0= ruleArraySize ) )? ) ) ( ( (lv_exprValue_18_0= RULE_NUL ) ) ( (lv_hasAttribute_19_0= RULE_INT ) ) )? ) ;
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
            // InternalDdParser.g:2924:2: ( ( ( ( () ( (lv_value_1_0= RULE_STR ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( (lv_value_5_0= RULE_DEC ) ) ) | ( () ( (lv_value_7_0= RULE_CHR ) ) ) | ( () ( (otherlv_9= RULE_CSTID ) ) ( (lv_index_10_0= ruleArraySize ) )? ) | ( () ( (lv_value_12_0= ruleBoolean ) ) ) | ( () ( (lv_value_14_0= ruleUnset ) ) ) | ( () ( ( ruleQualifiedName ) ) ( (lv_index_17_0= ruleArraySize ) )? ) ) ( ( (lv_exprValue_18_0= RULE_NUL ) ) ( (lv_hasAttribute_19_0= RULE_INT ) ) )? ) )
            // InternalDdParser.g:2925:2: ( ( ( () ( (lv_value_1_0= RULE_STR ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( (lv_value_5_0= RULE_DEC ) ) ) | ( () ( (lv_value_7_0= RULE_CHR ) ) ) | ( () ( (otherlv_9= RULE_CSTID ) ) ( (lv_index_10_0= ruleArraySize ) )? ) | ( () ( (lv_value_12_0= ruleBoolean ) ) ) | ( () ( (lv_value_14_0= ruleUnset ) ) ) | ( () ( ( ruleQualifiedName ) ) ( (lv_index_17_0= ruleArraySize ) )? ) ) ( ( (lv_exprValue_18_0= RULE_NUL ) ) ( (lv_hasAttribute_19_0= RULE_INT ) ) )? )
            {
            // InternalDdParser.g:2925:2: ( ( ( () ( (lv_value_1_0= RULE_STR ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( (lv_value_5_0= RULE_DEC ) ) ) | ( () ( (lv_value_7_0= RULE_CHR ) ) ) | ( () ( (otherlv_9= RULE_CSTID ) ) ( (lv_index_10_0= ruleArraySize ) )? ) | ( () ( (lv_value_12_0= ruleBoolean ) ) ) | ( () ( (lv_value_14_0= ruleUnset ) ) ) | ( () ( ( ruleQualifiedName ) ) ( (lv_index_17_0= ruleArraySize ) )? ) ) ( ( (lv_exprValue_18_0= RULE_NUL ) ) ( (lv_hasAttribute_19_0= RULE_INT ) ) )? )
            // InternalDdParser.g:2926:3: ( ( () ( (lv_value_1_0= RULE_STR ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( (lv_value_5_0= RULE_DEC ) ) ) | ( () ( (lv_value_7_0= RULE_CHR ) ) ) | ( () ( (otherlv_9= RULE_CSTID ) ) ( (lv_index_10_0= ruleArraySize ) )? ) | ( () ( (lv_value_12_0= ruleBoolean ) ) ) | ( () ( (lv_value_14_0= ruleUnset ) ) ) | ( () ( ( ruleQualifiedName ) ) ( (lv_index_17_0= ruleArraySize ) )? ) ) ( ( (lv_exprValue_18_0= RULE_NUL ) ) ( (lv_hasAttribute_19_0= RULE_INT ) ) )?
            {
            // InternalDdParser.g:2926:3: ( ( () ( (lv_value_1_0= RULE_STR ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( (lv_value_5_0= RULE_DEC ) ) ) | ( () ( (lv_value_7_0= RULE_CHR ) ) ) | ( () ( (otherlv_9= RULE_CSTID ) ) ( (lv_index_10_0= ruleArraySize ) )? ) | ( () ( (lv_value_12_0= ruleBoolean ) ) ) | ( () ( (lv_value_14_0= ruleUnset ) ) ) | ( () ( ( ruleQualifiedName ) ) ( (lv_index_17_0= ruleArraySize ) )? ) )
            int alt47=8;
            switch ( input.LA(1) ) {
            case RULE_STR:
                {
                alt47=1;
                }
                break;
            case RULE_INT:
                {
                alt47=2;
                }
                break;
            case RULE_DEC:
                {
                alt47=3;
                }
                break;
            case RULE_CHR:
                {
                alt47=4;
                }
                break;
            case RULE_CSTID:
                {
                alt47=5;
                }
                break;
            case False:
            case True:
                {
                alt47=6;
                }
                break;
            case Unset:
                {
                alt47=7;
                }
                break;
            case RULE_OBJID:
            case RULE_ID:
                {
                alt47=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // InternalDdParser.g:2927:4: ( () ( (lv_value_1_0= RULE_STR ) ) )
                    {
                    // InternalDdParser.g:2927:4: ( () ( (lv_value_1_0= RULE_STR ) ) )
                    // InternalDdParser.g:2928:5: () ( (lv_value_1_0= RULE_STR ) )
                    {
                    // InternalDdParser.g:2928:5: ()
                    // InternalDdParser.g:2929:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElement(
                      							grammarAccess.getTerminalExpressionAccess().getStrValueAction_0_0_0(),
                      							current);
                      					
                    }

                    }

                    // InternalDdParser.g:2935:5: ( (lv_value_1_0= RULE_STR ) )
                    // InternalDdParser.g:2936:6: (lv_value_1_0= RULE_STR )
                    {
                    // InternalDdParser.g:2936:6: (lv_value_1_0= RULE_STR )
                    // InternalDdParser.g:2937:7: lv_value_1_0= RULE_STR
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
                    // InternalDdParser.g:2955:4: ( () ( (lv_value_3_0= RULE_INT ) ) )
                    {
                    // InternalDdParser.g:2955:4: ( () ( (lv_value_3_0= RULE_INT ) ) )
                    // InternalDdParser.g:2956:5: () ( (lv_value_3_0= RULE_INT ) )
                    {
                    // InternalDdParser.g:2956:5: ()
                    // InternalDdParser.g:2957:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElement(
                      							grammarAccess.getTerminalExpressionAccess().getIntValueAction_0_1_0(),
                      							current);
                      					
                    }

                    }

                    // InternalDdParser.g:2963:5: ( (lv_value_3_0= RULE_INT ) )
                    // InternalDdParser.g:2964:6: (lv_value_3_0= RULE_INT )
                    {
                    // InternalDdParser.g:2964:6: (lv_value_3_0= RULE_INT )
                    // InternalDdParser.g:2965:7: lv_value_3_0= RULE_INT
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
                    // InternalDdParser.g:2983:4: ( () ( (lv_value_5_0= RULE_DEC ) ) )
                    {
                    // InternalDdParser.g:2983:4: ( () ( (lv_value_5_0= RULE_DEC ) ) )
                    // InternalDdParser.g:2984:5: () ( (lv_value_5_0= RULE_DEC ) )
                    {
                    // InternalDdParser.g:2984:5: ()
                    // InternalDdParser.g:2985:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElement(
                      							grammarAccess.getTerminalExpressionAccess().getDecValueAction_0_2_0(),
                      							current);
                      					
                    }

                    }

                    // InternalDdParser.g:2991:5: ( (lv_value_5_0= RULE_DEC ) )
                    // InternalDdParser.g:2992:6: (lv_value_5_0= RULE_DEC )
                    {
                    // InternalDdParser.g:2992:6: (lv_value_5_0= RULE_DEC )
                    // InternalDdParser.g:2993:7: lv_value_5_0= RULE_DEC
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
                    // InternalDdParser.g:3011:4: ( () ( (lv_value_7_0= RULE_CHR ) ) )
                    {
                    // InternalDdParser.g:3011:4: ( () ( (lv_value_7_0= RULE_CHR ) ) )
                    // InternalDdParser.g:3012:5: () ( (lv_value_7_0= RULE_CHR ) )
                    {
                    // InternalDdParser.g:3012:5: ()
                    // InternalDdParser.g:3013:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElement(
                      							grammarAccess.getTerminalExpressionAccess().getChrValueAction_0_3_0(),
                      							current);
                      					
                    }

                    }

                    // InternalDdParser.g:3019:5: ( (lv_value_7_0= RULE_CHR ) )
                    // InternalDdParser.g:3020:6: (lv_value_7_0= RULE_CHR )
                    {
                    // InternalDdParser.g:3020:6: (lv_value_7_0= RULE_CHR )
                    // InternalDdParser.g:3021:7: lv_value_7_0= RULE_CHR
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
                    // InternalDdParser.g:3039:4: ( () ( (otherlv_9= RULE_CSTID ) ) ( (lv_index_10_0= ruleArraySize ) )? )
                    {
                    // InternalDdParser.g:3039:4: ( () ( (otherlv_9= RULE_CSTID ) ) ( (lv_index_10_0= ruleArraySize ) )? )
                    // InternalDdParser.g:3040:5: () ( (otherlv_9= RULE_CSTID ) ) ( (lv_index_10_0= ruleArraySize ) )?
                    {
                    // InternalDdParser.g:3040:5: ()
                    // InternalDdParser.g:3041:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElement(
                      							grammarAccess.getTerminalExpressionAccess().getCstValueAction_0_4_0(),
                      							current);
                      					
                    }

                    }

                    // InternalDdParser.g:3047:5: ( (otherlv_9= RULE_CSTID ) )
                    // InternalDdParser.g:3048:6: (otherlv_9= RULE_CSTID )
                    {
                    // InternalDdParser.g:3048:6: (otherlv_9= RULE_CSTID )
                    // InternalDdParser.g:3049:7: otherlv_9= RULE_CSTID
                    {
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getTerminalExpressionRule());
                      							}
                      						
                    }
                    otherlv_9=(Token)match(input,RULE_CSTID,FOLLOW_56); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(otherlv_9, grammarAccess.getTerminalExpressionAccess().getValueConstantCrossReference_0_4_1_0());
                      						
                    }

                    }


                    }

                    // InternalDdParser.g:3060:5: ( (lv_index_10_0= ruleArraySize ) )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==LeftSquareBracket) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // InternalDdParser.g:3061:6: (lv_index_10_0= ruleArraySize )
                            {
                            // InternalDdParser.g:3061:6: (lv_index_10_0= ruleArraySize )
                            // InternalDdParser.g:3062:7: lv_index_10_0= ruleArraySize
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
                    // InternalDdParser.g:3081:4: ( () ( (lv_value_12_0= ruleBoolean ) ) )
                    {
                    // InternalDdParser.g:3081:4: ( () ( (lv_value_12_0= ruleBoolean ) ) )
                    // InternalDdParser.g:3082:5: () ( (lv_value_12_0= ruleBoolean ) )
                    {
                    // InternalDdParser.g:3082:5: ()
                    // InternalDdParser.g:3083:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElement(
                      							grammarAccess.getTerminalExpressionAccess().getBoolValueAction_0_5_0(),
                      							current);
                      					
                    }

                    }

                    // InternalDdParser.g:3089:5: ( (lv_value_12_0= ruleBoolean ) )
                    // InternalDdParser.g:3090:6: (lv_value_12_0= ruleBoolean )
                    {
                    // InternalDdParser.g:3090:6: (lv_value_12_0= ruleBoolean )
                    // InternalDdParser.g:3091:7: lv_value_12_0= ruleBoolean
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
                    // InternalDdParser.g:3110:4: ( () ( (lv_value_14_0= ruleUnset ) ) )
                    {
                    // InternalDdParser.g:3110:4: ( () ( (lv_value_14_0= ruleUnset ) ) )
                    // InternalDdParser.g:3111:5: () ( (lv_value_14_0= ruleUnset ) )
                    {
                    // InternalDdParser.g:3111:5: ()
                    // InternalDdParser.g:3112:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElement(
                      							grammarAccess.getTerminalExpressionAccess().getUnsetValueAction_0_6_0(),
                      							current);
                      					
                    }

                    }

                    // InternalDdParser.g:3118:5: ( (lv_value_14_0= ruleUnset ) )
                    // InternalDdParser.g:3119:6: (lv_value_14_0= ruleUnset )
                    {
                    // InternalDdParser.g:3119:6: (lv_value_14_0= ruleUnset )
                    // InternalDdParser.g:3120:7: lv_value_14_0= ruleUnset
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
                    // InternalDdParser.g:3139:4: ( () ( ( ruleQualifiedName ) ) ( (lv_index_17_0= ruleArraySize ) )? )
                    {
                    // InternalDdParser.g:3139:4: ( () ( ( ruleQualifiedName ) ) ( (lv_index_17_0= ruleArraySize ) )? )
                    // InternalDdParser.g:3140:5: () ( ( ruleQualifiedName ) ) ( (lv_index_17_0= ruleArraySize ) )?
                    {
                    // InternalDdParser.g:3140:5: ()
                    // InternalDdParser.g:3141:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElement(
                      							grammarAccess.getTerminalExpressionAccess().getAttributeValueAction_0_7_0(),
                      							current);
                      					
                    }

                    }

                    // InternalDdParser.g:3147:5: ( ( ruleQualifiedName ) )
                    // InternalDdParser.g:3148:6: ( ruleQualifiedName )
                    {
                    // InternalDdParser.g:3148:6: ( ruleQualifiedName )
                    // InternalDdParser.g:3149:7: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getTerminalExpressionRule());
                      							}
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getTerminalExpressionAccess().getValueAttributeCrossReference_0_7_1_0());
                      						
                    }
                    pushFollow(FOLLOW_56);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalDdParser.g:3163:5: ( (lv_index_17_0= ruleArraySize ) )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==LeftSquareBracket) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // InternalDdParser.g:3164:6: (lv_index_17_0= ruleArraySize )
                            {
                            // InternalDdParser.g:3164:6: (lv_index_17_0= ruleArraySize )
                            // InternalDdParser.g:3165:7: lv_index_17_0= ruleArraySize
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

            // InternalDdParser.g:3184:3: ( ( (lv_exprValue_18_0= RULE_NUL ) ) ( (lv_hasAttribute_19_0= RULE_INT ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_NUL) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalDdParser.g:3185:4: ( (lv_exprValue_18_0= RULE_NUL ) ) ( (lv_hasAttribute_19_0= RULE_INT ) )
                    {
                    // InternalDdParser.g:3185:4: ( (lv_exprValue_18_0= RULE_NUL ) )
                    // InternalDdParser.g:3186:5: (lv_exprValue_18_0= RULE_NUL )
                    {
                    // InternalDdParser.g:3186:5: (lv_exprValue_18_0= RULE_NUL )
                    // InternalDdParser.g:3187:6: lv_exprValue_18_0= RULE_NUL
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

                    // InternalDdParser.g:3203:4: ( (lv_hasAttribute_19_0= RULE_INT ) )
                    // InternalDdParser.g:3204:5: (lv_hasAttribute_19_0= RULE_INT )
                    {
                    // InternalDdParser.g:3204:5: (lv_hasAttribute_19_0= RULE_INT )
                    // InternalDdParser.g:3205:6: lv_hasAttribute_19_0= RULE_INT
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
    // InternalDdParser.g:3226:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalDdParser.g:3226:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalDdParser.g:3227:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalDdParser.g:3233:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_OBJID_0= RULE_OBJID kw= FullStop )? this_ID_2= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_OBJID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalDdParser.g:3239:2: ( ( (this_OBJID_0= RULE_OBJID kw= FullStop )? this_ID_2= RULE_ID ) )
            // InternalDdParser.g:3240:2: ( (this_OBJID_0= RULE_OBJID kw= FullStop )? this_ID_2= RULE_ID )
            {
            // InternalDdParser.g:3240:2: ( (this_OBJID_0= RULE_OBJID kw= FullStop )? this_ID_2= RULE_ID )
            // InternalDdParser.g:3241:3: (this_OBJID_0= RULE_OBJID kw= FullStop )? this_ID_2= RULE_ID
            {
            // InternalDdParser.g:3241:3: (this_OBJID_0= RULE_OBJID kw= FullStop )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_OBJID) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalDdParser.g:3242:4: this_OBJID_0= RULE_OBJID kw= FullStop
                    {
                    this_OBJID_0=(Token)match(input,RULE_OBJID,FOLLOW_57); if (state.failed) return current;
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
    // InternalDdParser.g:3266:1: entryRuleLineComment returns [EObject current=null] : iv_ruleLineComment= ruleLineComment EOF ;
    public final EObject entryRuleLineComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLineComment = null;


        try {
            // InternalDdParser.g:3266:52: (iv_ruleLineComment= ruleLineComment EOF )
            // InternalDdParser.g:3267:2: iv_ruleLineComment= ruleLineComment EOF
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
    // InternalDdParser.g:3273:1: ruleLineComment returns [EObject current=null] : ( () ( (lv_line_1_0= RULE_CMT ) ) this_EOL_2= RULE_EOL ) ;
    public final EObject ruleLineComment() throws RecognitionException {
        EObject current = null;

        Token lv_line_1_0=null;
        Token this_EOL_2=null;


        	enterRule();

        try {
            // InternalDdParser.g:3279:2: ( ( () ( (lv_line_1_0= RULE_CMT ) ) this_EOL_2= RULE_EOL ) )
            // InternalDdParser.g:3280:2: ( () ( (lv_line_1_0= RULE_CMT ) ) this_EOL_2= RULE_EOL )
            {
            // InternalDdParser.g:3280:2: ( () ( (lv_line_1_0= RULE_CMT ) ) this_EOL_2= RULE_EOL )
            // InternalDdParser.g:3281:3: () ( (lv_line_1_0= RULE_CMT ) ) this_EOL_2= RULE_EOL
            {
            // InternalDdParser.g:3281:3: ()
            // InternalDdParser.g:3282:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getLineCommentAccess().getCommentAction_0(),
              					current);
              			
            }

            }

            // InternalDdParser.g:3288:3: ( (lv_line_1_0= RULE_CMT ) )
            // InternalDdParser.g:3289:4: (lv_line_1_0= RULE_CMT )
            {
            // InternalDdParser.g:3289:4: (lv_line_1_0= RULE_CMT )
            // InternalDdParser.g:3290:5: lv_line_1_0= RULE_CMT
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
    // InternalDdParser.g:3314:1: entryRuleTrailComment returns [EObject current=null] : iv_ruleTrailComment= ruleTrailComment EOF ;
    public final EObject entryRuleTrailComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrailComment = null;


        try {
            // InternalDdParser.g:3314:53: (iv_ruleTrailComment= ruleTrailComment EOF )
            // InternalDdParser.g:3315:2: iv_ruleTrailComment= ruleTrailComment EOF
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
    // InternalDdParser.g:3321:1: ruleTrailComment returns [EObject current=null] : ( () ( (lv_line_1_0= RULE_CMT ) ) ) ;
    public final EObject ruleTrailComment() throws RecognitionException {
        EObject current = null;

        Token lv_line_1_0=null;


        	enterRule();

        try {
            // InternalDdParser.g:3327:2: ( ( () ( (lv_line_1_0= RULE_CMT ) ) ) )
            // InternalDdParser.g:3328:2: ( () ( (lv_line_1_0= RULE_CMT ) ) )
            {
            // InternalDdParser.g:3328:2: ( () ( (lv_line_1_0= RULE_CMT ) ) )
            // InternalDdParser.g:3329:3: () ( (lv_line_1_0= RULE_CMT ) )
            {
            // InternalDdParser.g:3329:3: ()
            // InternalDdParser.g:3330:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getTrailCommentAccess().getCommentAction_0(),
              					current);
              			
            }

            }

            // InternalDdParser.g:3336:3: ( (lv_line_1_0= RULE_CMT ) )
            // InternalDdParser.g:3337:4: (lv_line_1_0= RULE_CMT )
            {
            // InternalDdParser.g:3337:4: (lv_line_1_0= RULE_CMT )
            // InternalDdParser.g:3338:5: lv_line_1_0= RULE_CMT
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
    // InternalDdParser.g:3358:1: ruleBinaryOperator returns [Enumerator current=null] : ( (enumLiteral_0= Or ) | (enumLiteral_1= And ) | (enumLiteral_2= PlusSign ) | (enumLiteral_3= HyphenMinus ) | (enumLiteral_4= Asterisk ) | (enumLiteral_5= Solidus ) | (enumLiteral_6= PercentSign ) | (enumLiteral_7= EqualsSignEqualsSign ) | (enumLiteral_8= GreaterThanSign ) | (enumLiteral_9= LessThanSign ) | (enumLiteral_10= LessThanSignEqualsSign ) | (enumLiteral_11= GreaterThanSignEqualsSign ) | (enumLiteral_12= CircumflexAccent ) | (enumLiteral_13= Like ) | (enumLiteral_14= ExclamationMarkEqualsSign ) | (enumLiteral_15= Ampersand ) | (enumLiteral_16= In ) | (enumLiteral_17= Stxt ) | (enumLiteral_18= Round ) ) ;
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
            // InternalDdParser.g:3364:2: ( ( (enumLiteral_0= Or ) | (enumLiteral_1= And ) | (enumLiteral_2= PlusSign ) | (enumLiteral_3= HyphenMinus ) | (enumLiteral_4= Asterisk ) | (enumLiteral_5= Solidus ) | (enumLiteral_6= PercentSign ) | (enumLiteral_7= EqualsSignEqualsSign ) | (enumLiteral_8= GreaterThanSign ) | (enumLiteral_9= LessThanSign ) | (enumLiteral_10= LessThanSignEqualsSign ) | (enumLiteral_11= GreaterThanSignEqualsSign ) | (enumLiteral_12= CircumflexAccent ) | (enumLiteral_13= Like ) | (enumLiteral_14= ExclamationMarkEqualsSign ) | (enumLiteral_15= Ampersand ) | (enumLiteral_16= In ) | (enumLiteral_17= Stxt ) | (enumLiteral_18= Round ) ) )
            // InternalDdParser.g:3365:2: ( (enumLiteral_0= Or ) | (enumLiteral_1= And ) | (enumLiteral_2= PlusSign ) | (enumLiteral_3= HyphenMinus ) | (enumLiteral_4= Asterisk ) | (enumLiteral_5= Solidus ) | (enumLiteral_6= PercentSign ) | (enumLiteral_7= EqualsSignEqualsSign ) | (enumLiteral_8= GreaterThanSign ) | (enumLiteral_9= LessThanSign ) | (enumLiteral_10= LessThanSignEqualsSign ) | (enumLiteral_11= GreaterThanSignEqualsSign ) | (enumLiteral_12= CircumflexAccent ) | (enumLiteral_13= Like ) | (enumLiteral_14= ExclamationMarkEqualsSign ) | (enumLiteral_15= Ampersand ) | (enumLiteral_16= In ) | (enumLiteral_17= Stxt ) | (enumLiteral_18= Round ) )
            {
            // InternalDdParser.g:3365:2: ( (enumLiteral_0= Or ) | (enumLiteral_1= And ) | (enumLiteral_2= PlusSign ) | (enumLiteral_3= HyphenMinus ) | (enumLiteral_4= Asterisk ) | (enumLiteral_5= Solidus ) | (enumLiteral_6= PercentSign ) | (enumLiteral_7= EqualsSignEqualsSign ) | (enumLiteral_8= GreaterThanSign ) | (enumLiteral_9= LessThanSign ) | (enumLiteral_10= LessThanSignEqualsSign ) | (enumLiteral_11= GreaterThanSignEqualsSign ) | (enumLiteral_12= CircumflexAccent ) | (enumLiteral_13= Like ) | (enumLiteral_14= ExclamationMarkEqualsSign ) | (enumLiteral_15= Ampersand ) | (enumLiteral_16= In ) | (enumLiteral_17= Stxt ) | (enumLiteral_18= Round ) )
            int alt50=19;
            switch ( input.LA(1) ) {
            case Or:
                {
                alt50=1;
                }
                break;
            case And:
                {
                alt50=2;
                }
                break;
            case PlusSign:
                {
                alt50=3;
                }
                break;
            case HyphenMinus:
                {
                alt50=4;
                }
                break;
            case Asterisk:
                {
                alt50=5;
                }
                break;
            case Solidus:
                {
                alt50=6;
                }
                break;
            case PercentSign:
                {
                alt50=7;
                }
                break;
            case EqualsSignEqualsSign:
                {
                alt50=8;
                }
                break;
            case GreaterThanSign:
                {
                alt50=9;
                }
                break;
            case LessThanSign:
                {
                alt50=10;
                }
                break;
            case LessThanSignEqualsSign:
                {
                alt50=11;
                }
                break;
            case GreaterThanSignEqualsSign:
                {
                alt50=12;
                }
                break;
            case CircumflexAccent:
                {
                alt50=13;
                }
                break;
            case Like:
                {
                alt50=14;
                }
                break;
            case ExclamationMarkEqualsSign:
                {
                alt50=15;
                }
                break;
            case Ampersand:
                {
                alt50=16;
                }
                break;
            case In:
                {
                alt50=17;
                }
                break;
            case Stxt:
                {
                alt50=18;
                }
                break;
            case Round:
                {
                alt50=19;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // InternalDdParser.g:3366:3: (enumLiteral_0= Or )
                    {
                    // InternalDdParser.g:3366:3: (enumLiteral_0= Or )
                    // InternalDdParser.g:3367:4: enumLiteral_0= Or
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
                    // InternalDdParser.g:3374:3: (enumLiteral_1= And )
                    {
                    // InternalDdParser.g:3374:3: (enumLiteral_1= And )
                    // InternalDdParser.g:3375:4: enumLiteral_1= And
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
                    // InternalDdParser.g:3382:3: (enumLiteral_2= PlusSign )
                    {
                    // InternalDdParser.g:3382:3: (enumLiteral_2= PlusSign )
                    // InternalDdParser.g:3383:4: enumLiteral_2= PlusSign
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
                    // InternalDdParser.g:3390:3: (enumLiteral_3= HyphenMinus )
                    {
                    // InternalDdParser.g:3390:3: (enumLiteral_3= HyphenMinus )
                    // InternalDdParser.g:3391:4: enumLiteral_3= HyphenMinus
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
                    // InternalDdParser.g:3398:3: (enumLiteral_4= Asterisk )
                    {
                    // InternalDdParser.g:3398:3: (enumLiteral_4= Asterisk )
                    // InternalDdParser.g:3399:4: enumLiteral_4= Asterisk
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
                    // InternalDdParser.g:3406:3: (enumLiteral_5= Solidus )
                    {
                    // InternalDdParser.g:3406:3: (enumLiteral_5= Solidus )
                    // InternalDdParser.g:3407:4: enumLiteral_5= Solidus
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
                    // InternalDdParser.g:3414:3: (enumLiteral_6= PercentSign )
                    {
                    // InternalDdParser.g:3414:3: (enumLiteral_6= PercentSign )
                    // InternalDdParser.g:3415:4: enumLiteral_6= PercentSign
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
                    // InternalDdParser.g:3422:3: (enumLiteral_7= EqualsSignEqualsSign )
                    {
                    // InternalDdParser.g:3422:3: (enumLiteral_7= EqualsSignEqualsSign )
                    // InternalDdParser.g:3423:4: enumLiteral_7= EqualsSignEqualsSign
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
                    // InternalDdParser.g:3430:3: (enumLiteral_8= GreaterThanSign )
                    {
                    // InternalDdParser.g:3430:3: (enumLiteral_8= GreaterThanSign )
                    // InternalDdParser.g:3431:4: enumLiteral_8= GreaterThanSign
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
                    // InternalDdParser.g:3438:3: (enumLiteral_9= LessThanSign )
                    {
                    // InternalDdParser.g:3438:3: (enumLiteral_9= LessThanSign )
                    // InternalDdParser.g:3439:4: enumLiteral_9= LessThanSign
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
                    // InternalDdParser.g:3446:3: (enumLiteral_10= LessThanSignEqualsSign )
                    {
                    // InternalDdParser.g:3446:3: (enumLiteral_10= LessThanSignEqualsSign )
                    // InternalDdParser.g:3447:4: enumLiteral_10= LessThanSignEqualsSign
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
                    // InternalDdParser.g:3454:3: (enumLiteral_11= GreaterThanSignEqualsSign )
                    {
                    // InternalDdParser.g:3454:3: (enumLiteral_11= GreaterThanSignEqualsSign )
                    // InternalDdParser.g:3455:4: enumLiteral_11= GreaterThanSignEqualsSign
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
                    // InternalDdParser.g:3462:3: (enumLiteral_12= CircumflexAccent )
                    {
                    // InternalDdParser.g:3462:3: (enumLiteral_12= CircumflexAccent )
                    // InternalDdParser.g:3463:4: enumLiteral_12= CircumflexAccent
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
                    // InternalDdParser.g:3470:3: (enumLiteral_13= Like )
                    {
                    // InternalDdParser.g:3470:3: (enumLiteral_13= Like )
                    // InternalDdParser.g:3471:4: enumLiteral_13= Like
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
                    // InternalDdParser.g:3478:3: (enumLiteral_14= ExclamationMarkEqualsSign )
                    {
                    // InternalDdParser.g:3478:3: (enumLiteral_14= ExclamationMarkEqualsSign )
                    // InternalDdParser.g:3479:4: enumLiteral_14= ExclamationMarkEqualsSign
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
                    // InternalDdParser.g:3486:3: (enumLiteral_15= Ampersand )
                    {
                    // InternalDdParser.g:3486:3: (enumLiteral_15= Ampersand )
                    // InternalDdParser.g:3487:4: enumLiteral_15= Ampersand
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
                    // InternalDdParser.g:3494:3: (enumLiteral_16= In )
                    {
                    // InternalDdParser.g:3494:3: (enumLiteral_16= In )
                    // InternalDdParser.g:3495:4: enumLiteral_16= In
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
                    // InternalDdParser.g:3502:3: (enumLiteral_17= Stxt )
                    {
                    // InternalDdParser.g:3502:3: (enumLiteral_17= Stxt )
                    // InternalDdParser.g:3503:4: enumLiteral_17= Stxt
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
                    // InternalDdParser.g:3510:3: (enumLiteral_18= Round )
                    {
                    // InternalDdParser.g:3510:3: (enumLiteral_18= Round )
                    // InternalDdParser.g:3511:4: enumLiteral_18= Round
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
    // InternalDdParser.g:3521:1: ruleUnaryOperator returns [Enumerator current=null] : ( (enumLiteral_0= Not ) | (enumLiteral_1= HyphenMinus ) | (enumLiteral_2= Str ) | (enumLiteral_3= Int ) | (enumLiteral_4= Dec ) | (enumLiteral_5= Date ) | (enumLiteral_6= Time ) | (enumLiteral_7= Len ) | (enumLiteral_8= Stamp ) ) ;
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
            // InternalDdParser.g:3527:2: ( ( (enumLiteral_0= Not ) | (enumLiteral_1= HyphenMinus ) | (enumLiteral_2= Str ) | (enumLiteral_3= Int ) | (enumLiteral_4= Dec ) | (enumLiteral_5= Date ) | (enumLiteral_6= Time ) | (enumLiteral_7= Len ) | (enumLiteral_8= Stamp ) ) )
            // InternalDdParser.g:3528:2: ( (enumLiteral_0= Not ) | (enumLiteral_1= HyphenMinus ) | (enumLiteral_2= Str ) | (enumLiteral_3= Int ) | (enumLiteral_4= Dec ) | (enumLiteral_5= Date ) | (enumLiteral_6= Time ) | (enumLiteral_7= Len ) | (enumLiteral_8= Stamp ) )
            {
            // InternalDdParser.g:3528:2: ( (enumLiteral_0= Not ) | (enumLiteral_1= HyphenMinus ) | (enumLiteral_2= Str ) | (enumLiteral_3= Int ) | (enumLiteral_4= Dec ) | (enumLiteral_5= Date ) | (enumLiteral_6= Time ) | (enumLiteral_7= Len ) | (enumLiteral_8= Stamp ) )
            int alt51=9;
            switch ( input.LA(1) ) {
            case Not:
                {
                alt51=1;
                }
                break;
            case HyphenMinus:
                {
                alt51=2;
                }
                break;
            case Str:
                {
                alt51=3;
                }
                break;
            case Int:
                {
                alt51=4;
                }
                break;
            case Dec:
                {
                alt51=5;
                }
                break;
            case Date:
                {
                alt51=6;
                }
                break;
            case Time:
                {
                alt51=7;
                }
                break;
            case Len:
                {
                alt51=8;
                }
                break;
            case Stamp:
                {
                alt51=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // InternalDdParser.g:3529:3: (enumLiteral_0= Not )
                    {
                    // InternalDdParser.g:3529:3: (enumLiteral_0= Not )
                    // InternalDdParser.g:3530:4: enumLiteral_0= Not
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
                    // InternalDdParser.g:3537:3: (enumLiteral_1= HyphenMinus )
                    {
                    // InternalDdParser.g:3537:3: (enumLiteral_1= HyphenMinus )
                    // InternalDdParser.g:3538:4: enumLiteral_1= HyphenMinus
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
                    // InternalDdParser.g:3545:3: (enumLiteral_2= Str )
                    {
                    // InternalDdParser.g:3545:3: (enumLiteral_2= Str )
                    // InternalDdParser.g:3546:4: enumLiteral_2= Str
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
                    // InternalDdParser.g:3553:3: (enumLiteral_3= Int )
                    {
                    // InternalDdParser.g:3553:3: (enumLiteral_3= Int )
                    // InternalDdParser.g:3554:4: enumLiteral_3= Int
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
                    // InternalDdParser.g:3561:3: (enumLiteral_4= Dec )
                    {
                    // InternalDdParser.g:3561:3: (enumLiteral_4= Dec )
                    // InternalDdParser.g:3562:4: enumLiteral_4= Dec
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
                    // InternalDdParser.g:3569:3: (enumLiteral_5= Date )
                    {
                    // InternalDdParser.g:3569:3: (enumLiteral_5= Date )
                    // InternalDdParser.g:3570:4: enumLiteral_5= Date
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
                    // InternalDdParser.g:3577:3: (enumLiteral_6= Time )
                    {
                    // InternalDdParser.g:3577:3: (enumLiteral_6= Time )
                    // InternalDdParser.g:3578:4: enumLiteral_6= Time
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
                    // InternalDdParser.g:3585:3: (enumLiteral_7= Len )
                    {
                    // InternalDdParser.g:3585:3: (enumLiteral_7= Len )
                    // InternalDdParser.g:3586:4: enumLiteral_7= Len
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
                    // InternalDdParser.g:3593:3: (enumLiteral_8= Stamp )
                    {
                    // InternalDdParser.g:3593:3: (enumLiteral_8= Stamp )
                    // InternalDdParser.g:3594:4: enumLiteral_8= Stamp
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
    // InternalDdParser.g:3604:1: ruleUnset returns [Enumerator current=null] : (enumLiteral_0= Unset ) ;
    public final Enumerator ruleUnset() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalDdParser.g:3610:2: ( (enumLiteral_0= Unset ) )
            // InternalDdParser.g:3611:2: (enumLiteral_0= Unset )
            {
            // InternalDdParser.g:3611:2: (enumLiteral_0= Unset )
            // InternalDdParser.g:3612:3: enumLiteral_0= Unset
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
    // InternalDdParser.g:3621:1: ruleBoolean returns [Enumerator current=null] : ( (enumLiteral_0= True ) | (enumLiteral_1= False ) ) ;
    public final Enumerator ruleBoolean() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDdParser.g:3627:2: ( ( (enumLiteral_0= True ) | (enumLiteral_1= False ) ) )
            // InternalDdParser.g:3628:2: ( (enumLiteral_0= True ) | (enumLiteral_1= False ) )
            {
            // InternalDdParser.g:3628:2: ( (enumLiteral_0= True ) | (enumLiteral_1= False ) )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==True) ) {
                alt52=1;
            }
            else if ( (LA52_0==False) ) {
                alt52=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // InternalDdParser.g:3629:3: (enumLiteral_0= True )
                    {
                    // InternalDdParser.g:3629:3: (enumLiteral_0= True )
                    // InternalDdParser.g:3630:4: enumLiteral_0= True
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
                    // InternalDdParser.g:3637:3: (enumLiteral_1= False )
                    {
                    // InternalDdParser.g:3637:3: (enumLiteral_1= False )
                    // InternalDdParser.g:3638:4: enumLiteral_1= False
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
    // InternalDdParser.g:3648:1: ruleDataType returns [Enumerator current=null] : ( (enumLiteral_0= Str ) | (enumLiteral_1= Dec ) | (enumLiteral_2= Date ) | (enumLiteral_3= Time ) | (enumLiteral_4= Chr ) | (enumLiteral_5= Int ) | (enumLiteral_6= Stamp ) | (enumLiteral_7= Bits ) | (enumLiteral_8= Bool ) | (enumLiteral_9= HalfwidthHangulFillerHalfwidthHangulFillerHalfwidthHangulFiller ) ) ;
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
            // InternalDdParser.g:3654:2: ( ( (enumLiteral_0= Str ) | (enumLiteral_1= Dec ) | (enumLiteral_2= Date ) | (enumLiteral_3= Time ) | (enumLiteral_4= Chr ) | (enumLiteral_5= Int ) | (enumLiteral_6= Stamp ) | (enumLiteral_7= Bits ) | (enumLiteral_8= Bool ) | (enumLiteral_9= HalfwidthHangulFillerHalfwidthHangulFillerHalfwidthHangulFiller ) ) )
            // InternalDdParser.g:3655:2: ( (enumLiteral_0= Str ) | (enumLiteral_1= Dec ) | (enumLiteral_2= Date ) | (enumLiteral_3= Time ) | (enumLiteral_4= Chr ) | (enumLiteral_5= Int ) | (enumLiteral_6= Stamp ) | (enumLiteral_7= Bits ) | (enumLiteral_8= Bool ) | (enumLiteral_9= HalfwidthHangulFillerHalfwidthHangulFillerHalfwidthHangulFiller ) )
            {
            // InternalDdParser.g:3655:2: ( (enumLiteral_0= Str ) | (enumLiteral_1= Dec ) | (enumLiteral_2= Date ) | (enumLiteral_3= Time ) | (enumLiteral_4= Chr ) | (enumLiteral_5= Int ) | (enumLiteral_6= Stamp ) | (enumLiteral_7= Bits ) | (enumLiteral_8= Bool ) | (enumLiteral_9= HalfwidthHangulFillerHalfwidthHangulFillerHalfwidthHangulFiller ) )
            int alt53=10;
            switch ( input.LA(1) ) {
            case Str:
                {
                alt53=1;
                }
                break;
            case Dec:
                {
                alt53=2;
                }
                break;
            case Date:
                {
                alt53=3;
                }
                break;
            case Time:
                {
                alt53=4;
                }
                break;
            case Chr:
                {
                alt53=5;
                }
                break;
            case Int:
                {
                alt53=6;
                }
                break;
            case Stamp:
                {
                alt53=7;
                }
                break;
            case Bits:
                {
                alt53=8;
                }
                break;
            case Bool:
                {
                alt53=9;
                }
                break;
            case HalfwidthHangulFillerHalfwidthHangulFillerHalfwidthHangulFiller:
                {
                alt53=10;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // InternalDdParser.g:3656:3: (enumLiteral_0= Str )
                    {
                    // InternalDdParser.g:3656:3: (enumLiteral_0= Str )
                    // InternalDdParser.g:3657:4: enumLiteral_0= Str
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
                    // InternalDdParser.g:3664:3: (enumLiteral_1= Dec )
                    {
                    // InternalDdParser.g:3664:3: (enumLiteral_1= Dec )
                    // InternalDdParser.g:3665:4: enumLiteral_1= Dec
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
                    // InternalDdParser.g:3672:3: (enumLiteral_2= Date )
                    {
                    // InternalDdParser.g:3672:3: (enumLiteral_2= Date )
                    // InternalDdParser.g:3673:4: enumLiteral_2= Date
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
                    // InternalDdParser.g:3680:3: (enumLiteral_3= Time )
                    {
                    // InternalDdParser.g:3680:3: (enumLiteral_3= Time )
                    // InternalDdParser.g:3681:4: enumLiteral_3= Time
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
                    // InternalDdParser.g:3688:3: (enumLiteral_4= Chr )
                    {
                    // InternalDdParser.g:3688:3: (enumLiteral_4= Chr )
                    // InternalDdParser.g:3689:4: enumLiteral_4= Chr
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
                    // InternalDdParser.g:3696:3: (enumLiteral_5= Int )
                    {
                    // InternalDdParser.g:3696:3: (enumLiteral_5= Int )
                    // InternalDdParser.g:3697:4: enumLiteral_5= Int
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
                    // InternalDdParser.g:3704:3: (enumLiteral_6= Stamp )
                    {
                    // InternalDdParser.g:3704:3: (enumLiteral_6= Stamp )
                    // InternalDdParser.g:3705:4: enumLiteral_6= Stamp
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
                    // InternalDdParser.g:3712:3: (enumLiteral_7= Bits )
                    {
                    // InternalDdParser.g:3712:3: (enumLiteral_7= Bits )
                    // InternalDdParser.g:3713:4: enumLiteral_7= Bits
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
                    // InternalDdParser.g:3720:3: (enumLiteral_8= Bool )
                    {
                    // InternalDdParser.g:3720:3: (enumLiteral_8= Bool )
                    // InternalDdParser.g:3721:4: enumLiteral_8= Bool
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
                    // InternalDdParser.g:3728:3: (enumLiteral_9= HalfwidthHangulFillerHalfwidthHangulFillerHalfwidthHangulFiller )
                    {
                    // InternalDdParser.g:3728:3: (enumLiteral_9= HalfwidthHangulFillerHalfwidthHangulFillerHalfwidthHangulFiller )
                    // InternalDdParser.g:3729:4: enumLiteral_9= HalfwidthHangulFillerHalfwidthHangulFillerHalfwidthHangulFiller
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
    static final String dfa_1s = "\5\uffff";
    static final String dfa_2s = "\1\2\4\uffff";
    static final String dfa_3s = "\1\11\1\67\2\uffff\1\11";
    static final String dfa_4s = "\1\113\1\67\2\uffff\1\113";
    static final String dfa_5s = "\2\uffff\1\2\1\1\1\uffff";
    static final String dfa_6s = "\5\uffff}>";
    static final String[] dfa_7s = {
            "\1\3\1\uffff\3\3\2\uffff\1\3\2\uffff\3\3\3\uffff\2\3\60\uffff\1\1",
            "\1\4",
            "",
            "",
            "\1\3\1\uffff\3\3\2\uffff\1\3\2\uffff\3\3\3\uffff\2\3\50\uffff\1\2\1\uffff\1\2\5\uffff\1\1"
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
    static final String dfa_8s = "\1\113\1\67\1\uffff\1\103\1\uffff";
    static final String dfa_9s = "\1\113\1\67\1\uffff\1\113\1\uffff";
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
            "\1\3\1\uffff\3\3\2\uffff\1\3\2\uffff\3\3\3\uffff\2\3\13\uffff\1\2\17\uffff\1\2\24\uffff\1\1",
            "\1\4",
            "",
            "",
            "\1\3\1\uffff\3\3\2\uffff\1\3\2\uffff\3\3\3\uffff\2\3\13\uffff\1\2\44\uffff\1\1"
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
    static final String dfa_13s = "\35\uffff";
    static final String dfa_14s = "\1\6\1\0\33\uffff";
    static final String dfa_15s = "\1\110\1\0\33\uffff";
    static final String dfa_16s = "\2\uffff\1\11\10\uffff\1\12\11\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10";
    static final String dfa_17s = "\1\uffff\1\0\33\uffff}>";
    static final String[] dfa_18s = {
            "\1\13\2\uffff\1\2\1\13\2\uffff\1\2\2\uffff\1\2\1\13\2\uffff\2\2\1\uffff\3\2\14\uffff\1\1\4\uffff\1\2\23\uffff\2\13\3\uffff\5\13",
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
                        if ( (synpred1_InternalDdParser()) ) {s = 21;}

                        else if ( (synpred2_InternalDdParser()) ) {s = 22;}

                        else if ( (synpred3_InternalDdParser()) ) {s = 23;}

                        else if ( (synpred4_InternalDdParser()) ) {s = 24;}

                        else if ( (synpred5_InternalDdParser()) ) {s = 25;}

                        else if ( (synpred6_InternalDdParser()) ) {s = 26;}

                        else if ( (synpred7_InternalDdParser()) ) {s = 27;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index28_1);
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
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000080L,0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000006393A82L,0x0000000000000800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000082L,0x0000000000000800L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000006393A80L,0x0000000000000800L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0004004000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0004000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x8000084003B32640L,0x00000000000001F1L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000080L,0x0000000000000820L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000400010000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0040004006393A80L,0x0000000000000800L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0040004000000080L,0x0000000000000800L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0004004000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0004000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0001000800400030L,0x0000000000000800L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000800400030L,0x0000000000000800L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000800000030L,0x0000000000000800L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000800000020L,0x0000000000000800L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000020L,0x0000000000000800L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000048000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000004000000080L,0x0000000000000800L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000080L,0x0000000000000808L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000404000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0040000000000080L,0x0000000000000800L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000080L,0x0000000000000840L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0012AB36E804C100L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x00000A0000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000028000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000008000040000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000008400000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x000000A000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0104000000000002L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000100000000000L});

}