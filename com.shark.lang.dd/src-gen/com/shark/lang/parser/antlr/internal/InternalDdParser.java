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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "False", "Model", "Round", "Stamp", "Unset", "Bits", "Bool", "Date", "Like", "Stxt", "Time", "True", "And", "Chr", "Dec", "Int", "Key", "Len", "Not", "Str", "HalfwidthHangulFillerHalfwidthHangulFillerHalfwidthHangulFiller", "ExclamationMarkEqualsSign", "HyphenMinusGreaterThanSign", "LessThanSignEqualsSign", "EqualsSignEqualsSign", "GreaterThanSignEqualsSign", "In", "Or", "ExclamationMark", "PercentSign", "Ampersand", "LeftParenthesis", "RightParenthesis", "Asterisk", "PlusSign", "Comma", "HyphenMinus", "FullStop", "Solidus", "Colon", "LessThanSign", "EqualsSign", "GreaterThanSign", "LeftSquareBracket", "RightSquareBracket", "CircumflexAccent", "RULE_BEGIN", "RULE_END", "RULE_EOL", "RULE_NUL", "RULE_HEX", "RULE_NUM", "RULE_UNI", "RULE_ESC", "RULE_ASCII", "RULE_NL", "RULE_CHR", "RULE_STR", "RULE_RANGEINF", "RULE_RANGE", "RULE_CHKID", "RULE_CSTID", "RULE_OBJID", "RULE_ID", "RULE_DEC", "RULE_INT", "RULE_CONT", "RULE_IDENT", "RULE_CMT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_HEX=54;
    public static final int Or=31;
    public static final int RULE_BEGIN=50;
    public static final int True=15;
    public static final int RULE_CHKID=64;
    public static final int False=4;
    public static final int Chr=17;
    public static final int LessThanSign=44;
    public static final int Str=23;
    public static final int PercentSign=33;
    public static final int Like=12;
    public static final int LeftParenthesis=35;
    public static final int RULE_OBJID=66;
    public static final int Bool=10;
    public static final int RULE_NUM=55;
    public static final int RULE_NUL=53;
    public static final int Stxt=13;
    public static final int Ampersand=34;
    public static final int RightSquareBracket=48;
    public static final int ExclamationMark=32;
    public static final int GreaterThanSign=46;
    public static final int RULE_ID=67;
    public static final int RULE_EOL=52;
    public static final int RULE_RANGEINF=62;
    public static final int RULE_DEC=68;
    public static final int RightParenthesis=36;
    public static final int RULE_ESC=57;
    public static final int RULE_IDENT=71;
    public static final int GreaterThanSignEqualsSign=29;
    public static final int EqualsSignEqualsSign=28;
    public static final int Not=22;
    public static final int RULE_CONT=70;
    public static final int And=16;
    public static final int PlusSign=38;
    public static final int RULE_UNI=56;
    public static final int RULE_INT=69;
    public static final int Bits=9;
    public static final int LeftSquareBracket=47;
    public static final int HalfwidthHangulFillerHalfwidthHangulFillerHalfwidthHangulFiller=24;
    public static final int Key=20;
    public static final int RULE_END=51;
    public static final int In=30;
    public static final int Time=14;
    public static final int Int=19;
    public static final int Comma=39;
    public static final int EqualsSign=45;
    public static final int HyphenMinus=40;
    public static final int RULE_ASCII=58;
    public static final int Round=6;
    public static final int LessThanSignEqualsSign=27;
    public static final int Solidus=42;
    public static final int Colon=43;
    public static final int EOF=-1;
    public static final int Asterisk=37;
    public static final int RULE_CMT=72;
    public static final int FullStop=41;
    public static final int Dec=18;
    public static final int Stamp=7;
    public static final int RULE_CSTID=65;
    public static final int RULE_WS=73;
    public static final int Unset=8;
    public static final int RULE_ANY_OTHER=74;
    public static final int Date=11;
    public static final int CircumflexAccent=49;
    public static final int RULE_CHR=60;
    public static final int Len=21;
    public static final int RULE_STR=61;
    public static final int Model=5;
    public static final int ExclamationMarkEqualsSign=25;
    public static final int RULE_NL=59;
    public static final int HyphenMinusGreaterThanSign=26;
    public static final int RULE_RANGE=63;

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
                int LA10_0 = input.LA(1);

                if ( (LA10_0==Stamp||(LA10_0>=Bits && LA10_0<=Date)||LA10_0==Time||(LA10_0>=Chr && LA10_0<=Int)||(LA10_0>=Str && LA10_0<=HalfwidthHangulFillerHalfwidthHangulFillerHalfwidthHangulFiller)||LA10_0==RULE_CMT) ) {
                    alt10=1;
                }


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

                if ( (LA11_0==LeftParenthesis) ) {
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
    // InternalDdParser.g:472:1: ruleAttribute returns [EObject current=null] : ( ( (lv_extraAttrDesc_0_0= ruleLineComment ) )* ( (lv_dataType_1_0= ruleDataType ) ) ( (lv_attributeSize_2_0= ruleAttributeSize ) )? ( (lv_arraySize_3_0= ruleArraySize ) )? ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= EqualsSign ( (lv_defaultValue_6_0= ruleSharkExpression ) ) )? ( (lv_primaryKey_7_0= Key ) )? ( (lv_mandatory_8_0= ExclamationMark ) )? ( (lv_attrDesc_9_0= ruleTrailComment ) ) this_EOL_10= RULE_EOL ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token lv_primaryKey_7_0=null;
        Token lv_mandatory_8_0=null;
        Token this_EOL_10=null;
        EObject lv_extraAttrDesc_0_0 = null;

        Enumerator lv_dataType_1_0 = null;

        EObject lv_attributeSize_2_0 = null;

        EObject lv_arraySize_3_0 = null;

        EObject lv_defaultValue_6_0 = null;

        EObject lv_attrDesc_9_0 = null;



        	enterRule();

        try {
            // InternalDdParser.g:478:2: ( ( ( (lv_extraAttrDesc_0_0= ruleLineComment ) )* ( (lv_dataType_1_0= ruleDataType ) ) ( (lv_attributeSize_2_0= ruleAttributeSize ) )? ( (lv_arraySize_3_0= ruleArraySize ) )? ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= EqualsSign ( (lv_defaultValue_6_0= ruleSharkExpression ) ) )? ( (lv_primaryKey_7_0= Key ) )? ( (lv_mandatory_8_0= ExclamationMark ) )? ( (lv_attrDesc_9_0= ruleTrailComment ) ) this_EOL_10= RULE_EOL ) )
            // InternalDdParser.g:479:2: ( ( (lv_extraAttrDesc_0_0= ruleLineComment ) )* ( (lv_dataType_1_0= ruleDataType ) ) ( (lv_attributeSize_2_0= ruleAttributeSize ) )? ( (lv_arraySize_3_0= ruleArraySize ) )? ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= EqualsSign ( (lv_defaultValue_6_0= ruleSharkExpression ) ) )? ( (lv_primaryKey_7_0= Key ) )? ( (lv_mandatory_8_0= ExclamationMark ) )? ( (lv_attrDesc_9_0= ruleTrailComment ) ) this_EOL_10= RULE_EOL )
            {
            // InternalDdParser.g:479:2: ( ( (lv_extraAttrDesc_0_0= ruleLineComment ) )* ( (lv_dataType_1_0= ruleDataType ) ) ( (lv_attributeSize_2_0= ruleAttributeSize ) )? ( (lv_arraySize_3_0= ruleArraySize ) )? ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= EqualsSign ( (lv_defaultValue_6_0= ruleSharkExpression ) ) )? ( (lv_primaryKey_7_0= Key ) )? ( (lv_mandatory_8_0= ExclamationMark ) )? ( (lv_attrDesc_9_0= ruleTrailComment ) ) this_EOL_10= RULE_EOL )
            // InternalDdParser.g:480:3: ( (lv_extraAttrDesc_0_0= ruleLineComment ) )* ( (lv_dataType_1_0= ruleDataType ) ) ( (lv_attributeSize_2_0= ruleAttributeSize ) )? ( (lv_arraySize_3_0= ruleArraySize ) )? ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= EqualsSign ( (lv_defaultValue_6_0= ruleSharkExpression ) ) )? ( (lv_primaryKey_7_0= Key ) )? ( (lv_mandatory_8_0= ExclamationMark ) )? ( (lv_attrDesc_9_0= ruleTrailComment ) ) this_EOL_10= RULE_EOL
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

            // InternalDdParser.g:613:3: ( (lv_mandatory_8_0= ExclamationMark ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==ExclamationMark) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalDdParser.g:614:4: (lv_mandatory_8_0= ExclamationMark )
                    {
                    // InternalDdParser.g:614:4: (lv_mandatory_8_0= ExclamationMark )
                    // InternalDdParser.g:615:5: lv_mandatory_8_0= ExclamationMark
                    {
                    lv_mandatory_8_0=(Token)match(input,ExclamationMark,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_mandatory_8_0, grammarAccess.getAttributeAccess().getMandatoryExclamationMarkKeyword_7_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getAttributeRule());
                      					}
                      					setWithLastConsumed(current, "mandatory", lv_mandatory_8_0 != null, "!");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDdParser.g:627:3: ( (lv_attrDesc_9_0= ruleTrailComment ) )
            // InternalDdParser.g:628:4: (lv_attrDesc_9_0= ruleTrailComment )
            {
            // InternalDdParser.g:628:4: (lv_attrDesc_9_0= ruleTrailComment )
            // InternalDdParser.g:629:5: lv_attrDesc_9_0= ruleTrailComment
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAttributeAccess().getAttrDescTrailCommentParserRuleCall_8_0());
              				
            }
            pushFollow(FOLLOW_5);
            lv_attrDesc_9_0=ruleTrailComment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAttributeRule());
              					}
              					set(
              						current,
              						"attrDesc",
              						lv_attrDesc_9_0,
              						"com.shark.lang.Dd.TrailComment");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            this_EOL_10=(Token)match(input,RULE_EOL,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_EOL_10, grammarAccess.getAttributeAccess().getEOLTerminalRuleCall_9());
              		
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
    // InternalDdParser.g:654:1: entryRuleAttributeSize returns [EObject current=null] : iv_ruleAttributeSize= ruleAttributeSize EOF ;
    public final EObject entryRuleAttributeSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeSize = null;


        try {
            // InternalDdParser.g:654:54: (iv_ruleAttributeSize= ruleAttributeSize EOF )
            // InternalDdParser.g:655:2: iv_ruleAttributeSize= ruleAttributeSize EOF
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
    // InternalDdParser.g:661:1: ruleAttributeSize returns [EObject current=null] : (otherlv_0= LeftParenthesis ( (lv_length_1_0= RULE_INT ) ) (otherlv_2= Comma ( (lv_precision_3_0= RULE_INT ) ) )? otherlv_4= RightParenthesis ) ;
    public final EObject ruleAttributeSize() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_length_1_0=null;
        Token otherlv_2=null;
        Token lv_precision_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalDdParser.g:667:2: ( (otherlv_0= LeftParenthesis ( (lv_length_1_0= RULE_INT ) ) (otherlv_2= Comma ( (lv_precision_3_0= RULE_INT ) ) )? otherlv_4= RightParenthesis ) )
            // InternalDdParser.g:668:2: (otherlv_0= LeftParenthesis ( (lv_length_1_0= RULE_INT ) ) (otherlv_2= Comma ( (lv_precision_3_0= RULE_INT ) ) )? otherlv_4= RightParenthesis )
            {
            // InternalDdParser.g:668:2: (otherlv_0= LeftParenthesis ( (lv_length_1_0= RULE_INT ) ) (otherlv_2= Comma ( (lv_precision_3_0= RULE_INT ) ) )? otherlv_4= RightParenthesis )
            // InternalDdParser.g:669:3: otherlv_0= LeftParenthesis ( (lv_length_1_0= RULE_INT ) ) (otherlv_2= Comma ( (lv_precision_3_0= RULE_INT ) ) )? otherlv_4= RightParenthesis
            {
            otherlv_0=(Token)match(input,LeftParenthesis,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAttributeSizeAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalDdParser.g:673:3: ( (lv_length_1_0= RULE_INT ) )
            // InternalDdParser.g:674:4: (lv_length_1_0= RULE_INT )
            {
            // InternalDdParser.g:674:4: (lv_length_1_0= RULE_INT )
            // InternalDdParser.g:675:5: lv_length_1_0= RULE_INT
            {
            lv_length_1_0=(Token)match(input,RULE_INT,FOLLOW_28); if (state.failed) return current;
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

            // InternalDdParser.g:691:3: (otherlv_2= Comma ( (lv_precision_3_0= RULE_INT ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==Comma) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalDdParser.g:692:4: otherlv_2= Comma ( (lv_precision_3_0= RULE_INT ) )
                    {
                    otherlv_2=(Token)match(input,Comma,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getAttributeSizeAccess().getCommaKeyword_2_0());
                      			
                    }
                    // InternalDdParser.g:696:4: ( (lv_precision_3_0= RULE_INT ) )
                    // InternalDdParser.g:697:5: (lv_precision_3_0= RULE_INT )
                    {
                    // InternalDdParser.g:697:5: (lv_precision_3_0= RULE_INT )
                    // InternalDdParser.g:698:6: lv_precision_3_0= RULE_INT
                    {
                    lv_precision_3_0=(Token)match(input,RULE_INT,FOLLOW_29); if (state.failed) return current;
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
    // InternalDdParser.g:723:1: entryRuleArraySize returns [EObject current=null] : iv_ruleArraySize= ruleArraySize EOF ;
    public final EObject entryRuleArraySize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArraySize = null;


        try {
            // InternalDdParser.g:723:50: (iv_ruleArraySize= ruleArraySize EOF )
            // InternalDdParser.g:724:2: iv_ruleArraySize= ruleArraySize EOF
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
    // InternalDdParser.g:730:1: ruleArraySize returns [EObject current=null] : (otherlv_0= LeftSquareBracket ( (lv_size_1_0= RULE_INT ) ) otherlv_2= RightSquareBracket ) ;
    public final EObject ruleArraySize() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_size_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalDdParser.g:736:2: ( (otherlv_0= LeftSquareBracket ( (lv_size_1_0= RULE_INT ) ) otherlv_2= RightSquareBracket ) )
            // InternalDdParser.g:737:2: (otherlv_0= LeftSquareBracket ( (lv_size_1_0= RULE_INT ) ) otherlv_2= RightSquareBracket )
            {
            // InternalDdParser.g:737:2: (otherlv_0= LeftSquareBracket ( (lv_size_1_0= RULE_INT ) ) otherlv_2= RightSquareBracket )
            // InternalDdParser.g:738:3: otherlv_0= LeftSquareBracket ( (lv_size_1_0= RULE_INT ) ) otherlv_2= RightSquareBracket
            {
            otherlv_0=(Token)match(input,LeftSquareBracket,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getArraySizeAccess().getLeftSquareBracketKeyword_0());
              		
            }
            // InternalDdParser.g:742:3: ( (lv_size_1_0= RULE_INT ) )
            // InternalDdParser.g:743:4: (lv_size_1_0= RULE_INT )
            {
            // InternalDdParser.g:743:4: (lv_size_1_0= RULE_INT )
            // InternalDdParser.g:744:5: lv_size_1_0= RULE_INT
            {
            lv_size_1_0=(Token)match(input,RULE_INT,FOLLOW_30); if (state.failed) return current;
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
    // InternalDdParser.g:768:1: entryRuleRelationship returns [EObject current=null] : iv_ruleRelationship= ruleRelationship EOF ;
    public final EObject entryRuleRelationship() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationship = null;


        try {
            // InternalDdParser.g:768:53: (iv_ruleRelationship= ruleRelationship EOF )
            // InternalDdParser.g:769:2: iv_ruleRelationship= ruleRelationship EOF
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
    // InternalDdParser.g:775:1: ruleRelationship returns [EObject current=null] : ( ( (lv_cardi1_0_0= ruleRangeExpression ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_cardi2_2_0= ruleRangeExpression ) ) ( (otherlv_3= RULE_OBJID ) ) ( (lv_relDesc_4_0= ruleTrailComment ) ) this_EOL_5= RULE_EOL ) ;
    public final EObject ruleRelationship() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token this_EOL_5=null;
        EObject lv_cardi1_0_0 = null;

        EObject lv_cardi2_2_0 = null;

        EObject lv_relDesc_4_0 = null;



        	enterRule();

        try {
            // InternalDdParser.g:781:2: ( ( ( (lv_cardi1_0_0= ruleRangeExpression ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_cardi2_2_0= ruleRangeExpression ) ) ( (otherlv_3= RULE_OBJID ) ) ( (lv_relDesc_4_0= ruleTrailComment ) ) this_EOL_5= RULE_EOL ) )
            // InternalDdParser.g:782:2: ( ( (lv_cardi1_0_0= ruleRangeExpression ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_cardi2_2_0= ruleRangeExpression ) ) ( (otherlv_3= RULE_OBJID ) ) ( (lv_relDesc_4_0= ruleTrailComment ) ) this_EOL_5= RULE_EOL )
            {
            // InternalDdParser.g:782:2: ( ( (lv_cardi1_0_0= ruleRangeExpression ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_cardi2_2_0= ruleRangeExpression ) ) ( (otherlv_3= RULE_OBJID ) ) ( (lv_relDesc_4_0= ruleTrailComment ) ) this_EOL_5= RULE_EOL )
            // InternalDdParser.g:783:3: ( (lv_cardi1_0_0= ruleRangeExpression ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_cardi2_2_0= ruleRangeExpression ) ) ( (otherlv_3= RULE_OBJID ) ) ( (lv_relDesc_4_0= ruleTrailComment ) ) this_EOL_5= RULE_EOL
            {
            // InternalDdParser.g:783:3: ( (lv_cardi1_0_0= ruleRangeExpression ) )
            // InternalDdParser.g:784:4: (lv_cardi1_0_0= ruleRangeExpression )
            {
            // InternalDdParser.g:784:4: (lv_cardi1_0_0= ruleRangeExpression )
            // InternalDdParser.g:785:5: lv_cardi1_0_0= ruleRangeExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRelationshipAccess().getCardi1RangeExpressionParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_17);
            lv_cardi1_0_0=ruleRangeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRelationshipRule());
              					}
              					set(
              						current,
              						"cardi1",
              						lv_cardi1_0_0,
              						"com.shark.lang.Dd.RangeExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalDdParser.g:802:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDdParser.g:803:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDdParser.g:803:4: (lv_name_1_0= RULE_ID )
            // InternalDdParser.g:804:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getRelationshipAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRelationshipRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"com.shark.lang.Dd.ID");
              				
            }

            }


            }

            // InternalDdParser.g:820:3: ( (lv_cardi2_2_0= ruleRangeExpression ) )
            // InternalDdParser.g:821:4: (lv_cardi2_2_0= ruleRangeExpression )
            {
            // InternalDdParser.g:821:4: (lv_cardi2_2_0= ruleRangeExpression )
            // InternalDdParser.g:822:5: lv_cardi2_2_0= ruleRangeExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRelationshipAccess().getCardi2RangeExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_4);
            lv_cardi2_2_0=ruleRangeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRelationshipRule());
              					}
              					set(
              						current,
              						"cardi2",
              						lv_cardi2_2_0,
              						"com.shark.lang.Dd.RangeExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalDdParser.g:839:3: ( (otherlv_3= RULE_OBJID ) )
            // InternalDdParser.g:840:4: (otherlv_3= RULE_OBJID )
            {
            // InternalDdParser.g:840:4: (otherlv_3= RULE_OBJID )
            // InternalDdParser.g:841:5: otherlv_3= RULE_OBJID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRelationshipRule());
              					}
              				
            }
            otherlv_3=(Token)match(input,RULE_OBJID,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_3, grammarAccess.getRelationshipAccess().getLinkToEntityCrossReference_3_0());
              				
            }

            }


            }

            // InternalDdParser.g:852:3: ( (lv_relDesc_4_0= ruleTrailComment ) )
            // InternalDdParser.g:853:4: (lv_relDesc_4_0= ruleTrailComment )
            {
            // InternalDdParser.g:853:4: (lv_relDesc_4_0= ruleTrailComment )
            // InternalDdParser.g:854:5: lv_relDesc_4_0= ruleTrailComment
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRelationshipAccess().getRelDescTrailCommentParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_5);
            lv_relDesc_4_0=ruleTrailComment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRelationshipRule());
              					}
              					set(
              						current,
              						"relDesc",
              						lv_relDesc_4_0,
              						"com.shark.lang.Dd.TrailComment");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            this_EOL_5=(Token)match(input,RULE_EOL,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_EOL_5, grammarAccess.getRelationshipAccess().getEOLTerminalRuleCall_5());
              		
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
    // InternalDdParser.g:879:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // InternalDdParser.g:879:51: (iv_ruleConstraint= ruleConstraint EOF )
            // InternalDdParser.g:880:2: iv_ruleConstraint= ruleConstraint EOF
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
    // InternalDdParser.g:886:1: ruleConstraint returns [EObject current=null] : ( ( (lv_chkDescLines_0_0= ruleLineComment ) )+ ( (lv_name_1_0= RULE_CHKID ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_check_4_0= ruleCheckExpression ) )+ this_END_5= RULE_END ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token this_BEGIN_3=null;
        Token this_END_5=null;
        EObject lv_chkDescLines_0_0 = null;

        EObject lv_check_4_0 = null;



        	enterRule();

        try {
            // InternalDdParser.g:892:2: ( ( ( (lv_chkDescLines_0_0= ruleLineComment ) )+ ( (lv_name_1_0= RULE_CHKID ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_check_4_0= ruleCheckExpression ) )+ this_END_5= RULE_END ) )
            // InternalDdParser.g:893:2: ( ( (lv_chkDescLines_0_0= ruleLineComment ) )+ ( (lv_name_1_0= RULE_CHKID ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_check_4_0= ruleCheckExpression ) )+ this_END_5= RULE_END )
            {
            // InternalDdParser.g:893:2: ( ( (lv_chkDescLines_0_0= ruleLineComment ) )+ ( (lv_name_1_0= RULE_CHKID ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_check_4_0= ruleCheckExpression ) )+ this_END_5= RULE_END )
            // InternalDdParser.g:894:3: ( (lv_chkDescLines_0_0= ruleLineComment ) )+ ( (lv_name_1_0= RULE_CHKID ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_check_4_0= ruleCheckExpression ) )+ this_END_5= RULE_END
            {
            // InternalDdParser.g:894:3: ( (lv_chkDescLines_0_0= ruleLineComment ) )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_CMT) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalDdParser.g:895:4: (lv_chkDescLines_0_0= ruleLineComment )
            	    {
            	    // InternalDdParser.g:895:4: (lv_chkDescLines_0_0= ruleLineComment )
            	    // InternalDdParser.g:896:5: lv_chkDescLines_0_0= ruleLineComment
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getConstraintAccess().getChkDescLinesLineCommentParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_32);
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
            	    if ( cnt19 >= 1 ) break loop19;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
            } while (true);

            // InternalDdParser.g:913:3: ( (lv_name_1_0= RULE_CHKID ) )
            // InternalDdParser.g:914:4: (lv_name_1_0= RULE_CHKID )
            {
            // InternalDdParser.g:914:4: (lv_name_1_0= RULE_CHKID )
            // InternalDdParser.g:915:5: lv_name_1_0= RULE_CHKID
            {
            lv_name_1_0=(Token)match(input,RULE_CHKID,FOLLOW_18); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,Colon,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getConstraintAccess().getColonKeyword_2());
              		
            }
            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_BEGIN_3, grammarAccess.getConstraintAccess().getBEGINTerminalRuleCall_3());
              		
            }
            // InternalDdParser.g:939:3: ( (lv_check_4_0= ruleCheckExpression ) )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_CMT) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalDdParser.g:940:4: (lv_check_4_0= ruleCheckExpression )
            	    {
            	    // InternalDdParser.g:940:4: (lv_check_4_0= ruleCheckExpression )
            	    // InternalDdParser.g:941:5: lv_check_4_0= ruleCheckExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getConstraintAccess().getCheckCheckExpressionParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_33);
            	    lv_check_4_0=ruleCheckExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getConstraintRule());
            	      					}
            	      					add(
            	      						current,
            	      						"check",
            	      						lv_check_4_0,
            	      						"com.shark.lang.Dd.CheckExpression");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);

            this_END_5=(Token)match(input,RULE_END,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_END_5, grammarAccess.getConstraintAccess().getENDTerminalRuleCall_5());
              		
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


    // $ANTLR start "entryRuleCheckExpression"
    // InternalDdParser.g:966:1: entryRuleCheckExpression returns [EObject current=null] : iv_ruleCheckExpression= ruleCheckExpression EOF ;
    public final EObject entryRuleCheckExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckExpression = null;


        try {
            // InternalDdParser.g:966:56: (iv_ruleCheckExpression= ruleCheckExpression EOF )
            // InternalDdParser.g:967:2: iv_ruleCheckExpression= ruleCheckExpression EOF
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
    // InternalDdParser.g:973:1: ruleCheckExpression returns [EObject current=null] : ( ( (lv_chkDesc_0_0= ruleLineComment ) )+ ( (lv_name_1_0= RULE_ID ) ) ( (lv_expr_2_0= ruleSharkExpression ) ) this_EOL_3= RULE_EOL ) ;
    public final EObject ruleCheckExpression() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token this_EOL_3=null;
        EObject lv_chkDesc_0_0 = null;

        EObject lv_expr_2_0 = null;



        	enterRule();

        try {
            // InternalDdParser.g:979:2: ( ( ( (lv_chkDesc_0_0= ruleLineComment ) )+ ( (lv_name_1_0= RULE_ID ) ) ( (lv_expr_2_0= ruleSharkExpression ) ) this_EOL_3= RULE_EOL ) )
            // InternalDdParser.g:980:2: ( ( (lv_chkDesc_0_0= ruleLineComment ) )+ ( (lv_name_1_0= RULE_ID ) ) ( (lv_expr_2_0= ruleSharkExpression ) ) this_EOL_3= RULE_EOL )
            {
            // InternalDdParser.g:980:2: ( ( (lv_chkDesc_0_0= ruleLineComment ) )+ ( (lv_name_1_0= RULE_ID ) ) ( (lv_expr_2_0= ruleSharkExpression ) ) this_EOL_3= RULE_EOL )
            // InternalDdParser.g:981:3: ( (lv_chkDesc_0_0= ruleLineComment ) )+ ( (lv_name_1_0= RULE_ID ) ) ( (lv_expr_2_0= ruleSharkExpression ) ) this_EOL_3= RULE_EOL
            {
            // InternalDdParser.g:981:3: ( (lv_chkDesc_0_0= ruleLineComment ) )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_CMT) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalDdParser.g:982:4: (lv_chkDesc_0_0= ruleLineComment )
            	    {
            	    // InternalDdParser.g:982:4: (lv_chkDesc_0_0= ruleLineComment )
            	    // InternalDdParser.g:983:5: lv_chkDesc_0_0= ruleLineComment
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getCheckExpressionAccess().getChkDescLineCommentParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_34);
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
            	    if ( cnt21 >= 1 ) break loop21;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);

            // InternalDdParser.g:1000:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDdParser.g:1001:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDdParser.g:1001:4: (lv_name_1_0= RULE_ID )
            // InternalDdParser.g:1002:5: lv_name_1_0= RULE_ID
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

            // InternalDdParser.g:1018:3: ( (lv_expr_2_0= ruleSharkExpression ) )
            // InternalDdParser.g:1019:4: (lv_expr_2_0= ruleSharkExpression )
            {
            // InternalDdParser.g:1019:4: (lv_expr_2_0= ruleSharkExpression )
            // InternalDdParser.g:1020:5: lv_expr_2_0= ruleSharkExpression
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
    // InternalDdParser.g:1045:1: entryRuleSharkExpression returns [EObject current=null] : iv_ruleSharkExpression= ruleSharkExpression EOF ;
    public final EObject entryRuleSharkExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSharkExpression = null;


        try {
            // InternalDdParser.g:1045:56: (iv_ruleSharkExpression= ruleSharkExpression EOF )
            // InternalDdParser.g:1046:2: iv_ruleSharkExpression= ruleSharkExpression EOF
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
    // InternalDdParser.g:1052:1: ruleSharkExpression returns [EObject current=null] : ( ( ( ruleRangeExpression )=>this_RangeExpression_0= ruleRangeExpression ) | ( ( ruleAddExpression )=>this_AddExpression_1= ruleAddExpression ) | ( ( ruleMultExpression )=>this_MultExpression_2= ruleMultExpression ) | ( ( ruleAndExpression )=>this_AndExpression_3= ruleAndExpression ) | ( ( ruleOrExpression )=>this_OrExpression_4= ruleOrExpression ) | ( ( ruleCatExpression )=>this_CatExpression_5= ruleCatExpression ) | ( ( ruleListExpression )=>this_ListExpression_6= ruleListExpression ) | this_BinaryExpression_7= ruleBinaryExpression | this_UnaryExpression_8= ruleUnaryExpression | this_TerminalExpression_9= ruleTerminalExpression | this_IdentifierExpression_10= ruleIdentifierExpression ) ;
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

        EObject this_IdentifierExpression_10 = null;



        	enterRule();

        try {
            // InternalDdParser.g:1058:2: ( ( ( ( ruleRangeExpression )=>this_RangeExpression_0= ruleRangeExpression ) | ( ( ruleAddExpression )=>this_AddExpression_1= ruleAddExpression ) | ( ( ruleMultExpression )=>this_MultExpression_2= ruleMultExpression ) | ( ( ruleAndExpression )=>this_AndExpression_3= ruleAndExpression ) | ( ( ruleOrExpression )=>this_OrExpression_4= ruleOrExpression ) | ( ( ruleCatExpression )=>this_CatExpression_5= ruleCatExpression ) | ( ( ruleListExpression )=>this_ListExpression_6= ruleListExpression ) | this_BinaryExpression_7= ruleBinaryExpression | this_UnaryExpression_8= ruleUnaryExpression | this_TerminalExpression_9= ruleTerminalExpression | this_IdentifierExpression_10= ruleIdentifierExpression ) )
            // InternalDdParser.g:1059:2: ( ( ( ruleRangeExpression )=>this_RangeExpression_0= ruleRangeExpression ) | ( ( ruleAddExpression )=>this_AddExpression_1= ruleAddExpression ) | ( ( ruleMultExpression )=>this_MultExpression_2= ruleMultExpression ) | ( ( ruleAndExpression )=>this_AndExpression_3= ruleAndExpression ) | ( ( ruleOrExpression )=>this_OrExpression_4= ruleOrExpression ) | ( ( ruleCatExpression )=>this_CatExpression_5= ruleCatExpression ) | ( ( ruleListExpression )=>this_ListExpression_6= ruleListExpression ) | this_BinaryExpression_7= ruleBinaryExpression | this_UnaryExpression_8= ruleUnaryExpression | this_TerminalExpression_9= ruleTerminalExpression | this_IdentifierExpression_10= ruleIdentifierExpression )
            {
            // InternalDdParser.g:1059:2: ( ( ( ruleRangeExpression )=>this_RangeExpression_0= ruleRangeExpression ) | ( ( ruleAddExpression )=>this_AddExpression_1= ruleAddExpression ) | ( ( ruleMultExpression )=>this_MultExpression_2= ruleMultExpression ) | ( ( ruleAndExpression )=>this_AndExpression_3= ruleAndExpression ) | ( ( ruleOrExpression )=>this_OrExpression_4= ruleOrExpression ) | ( ( ruleCatExpression )=>this_CatExpression_5= ruleCatExpression ) | ( ( ruleListExpression )=>this_ListExpression_6= ruleListExpression ) | this_BinaryExpression_7= ruleBinaryExpression | this_UnaryExpression_8= ruleUnaryExpression | this_TerminalExpression_9= ruleTerminalExpression | this_IdentifierExpression_10= ruleIdentifierExpression )
            int alt22=11;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // InternalDdParser.g:1060:3: ( ( ruleRangeExpression )=>this_RangeExpression_0= ruleRangeExpression )
                    {
                    // InternalDdParser.g:1060:3: ( ( ruleRangeExpression )=>this_RangeExpression_0= ruleRangeExpression )
                    // InternalDdParser.g:1061:4: ( ruleRangeExpression )=>this_RangeExpression_0= ruleRangeExpression
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
                    // InternalDdParser.g:1072:3: ( ( ruleAddExpression )=>this_AddExpression_1= ruleAddExpression )
                    {
                    // InternalDdParser.g:1072:3: ( ( ruleAddExpression )=>this_AddExpression_1= ruleAddExpression )
                    // InternalDdParser.g:1073:4: ( ruleAddExpression )=>this_AddExpression_1= ruleAddExpression
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
                    // InternalDdParser.g:1084:3: ( ( ruleMultExpression )=>this_MultExpression_2= ruleMultExpression )
                    {
                    // InternalDdParser.g:1084:3: ( ( ruleMultExpression )=>this_MultExpression_2= ruleMultExpression )
                    // InternalDdParser.g:1085:4: ( ruleMultExpression )=>this_MultExpression_2= ruleMultExpression
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
                    // InternalDdParser.g:1096:3: ( ( ruleAndExpression )=>this_AndExpression_3= ruleAndExpression )
                    {
                    // InternalDdParser.g:1096:3: ( ( ruleAndExpression )=>this_AndExpression_3= ruleAndExpression )
                    // InternalDdParser.g:1097:4: ( ruleAndExpression )=>this_AndExpression_3= ruleAndExpression
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
                    // InternalDdParser.g:1108:3: ( ( ruleOrExpression )=>this_OrExpression_4= ruleOrExpression )
                    {
                    // InternalDdParser.g:1108:3: ( ( ruleOrExpression )=>this_OrExpression_4= ruleOrExpression )
                    // InternalDdParser.g:1109:4: ( ruleOrExpression )=>this_OrExpression_4= ruleOrExpression
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
                    // InternalDdParser.g:1120:3: ( ( ruleCatExpression )=>this_CatExpression_5= ruleCatExpression )
                    {
                    // InternalDdParser.g:1120:3: ( ( ruleCatExpression )=>this_CatExpression_5= ruleCatExpression )
                    // InternalDdParser.g:1121:4: ( ruleCatExpression )=>this_CatExpression_5= ruleCatExpression
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
                    // InternalDdParser.g:1132:3: ( ( ruleListExpression )=>this_ListExpression_6= ruleListExpression )
                    {
                    // InternalDdParser.g:1132:3: ( ( ruleListExpression )=>this_ListExpression_6= ruleListExpression )
                    // InternalDdParser.g:1133:4: ( ruleListExpression )=>this_ListExpression_6= ruleListExpression
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
                    // InternalDdParser.g:1144:3: this_BinaryExpression_7= ruleBinaryExpression
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
                    // InternalDdParser.g:1153:3: this_UnaryExpression_8= ruleUnaryExpression
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
                    // InternalDdParser.g:1162:3: this_TerminalExpression_9= ruleTerminalExpression
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
                case 11 :
                    // InternalDdParser.g:1171:3: this_IdentifierExpression_10= ruleIdentifierExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSharkExpressionAccess().getIdentifierExpressionParserRuleCall_10());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_IdentifierExpression_10=ruleIdentifierExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_IdentifierExpression_10;
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
    // InternalDdParser.g:1183:1: entryRuleBinaryExpression returns [EObject current=null] : iv_ruleBinaryExpression= ruleBinaryExpression EOF ;
    public final EObject entryRuleBinaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryExpression = null;


        try {
            // InternalDdParser.g:1183:57: (iv_ruleBinaryExpression= ruleBinaryExpression EOF )
            // InternalDdParser.g:1184:2: iv_ruleBinaryExpression= ruleBinaryExpression EOF
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
    // InternalDdParser.g:1190:1: ruleBinaryExpression returns [EObject current=null] : (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= ruleBinaryOperator ) ) ( (lv_right_3_0= ruleSharkExpression ) ) otherlv_4= RightParenthesis ( ( (lv_value_5_0= RULE_NUL ) ) ( (lv_precision_6_0= RULE_INT ) ) ( (lv_length_7_0= RULE_INT ) ) )? ) ;
    public final EObject ruleBinaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        Token lv_value_5_0=null;
        Token lv_precision_6_0=null;
        Token lv_length_7_0=null;
        EObject lv_left_1_0 = null;

        Enumerator lv_op_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalDdParser.g:1196:2: ( (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= ruleBinaryOperator ) ) ( (lv_right_3_0= ruleSharkExpression ) ) otherlv_4= RightParenthesis ( ( (lv_value_5_0= RULE_NUL ) ) ( (lv_precision_6_0= RULE_INT ) ) ( (lv_length_7_0= RULE_INT ) ) )? ) )
            // InternalDdParser.g:1197:2: (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= ruleBinaryOperator ) ) ( (lv_right_3_0= ruleSharkExpression ) ) otherlv_4= RightParenthesis ( ( (lv_value_5_0= RULE_NUL ) ) ( (lv_precision_6_0= RULE_INT ) ) ( (lv_length_7_0= RULE_INT ) ) )? )
            {
            // InternalDdParser.g:1197:2: (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= ruleBinaryOperator ) ) ( (lv_right_3_0= ruleSharkExpression ) ) otherlv_4= RightParenthesis ( ( (lv_value_5_0= RULE_NUL ) ) ( (lv_precision_6_0= RULE_INT ) ) ( (lv_length_7_0= RULE_INT ) ) )? )
            // InternalDdParser.g:1198:3: otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= ruleBinaryOperator ) ) ( (lv_right_3_0= ruleSharkExpression ) ) otherlv_4= RightParenthesis ( ( (lv_value_5_0= RULE_NUL ) ) ( (lv_precision_6_0= RULE_INT ) ) ( (lv_length_7_0= RULE_INT ) ) )?
            {
            otherlv_0=(Token)match(input,LeftParenthesis,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getBinaryExpressionAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalDdParser.g:1202:3: ( (lv_left_1_0= ruleSharkExpression ) )
            // InternalDdParser.g:1203:4: (lv_left_1_0= ruleSharkExpression )
            {
            // InternalDdParser.g:1203:4: (lv_left_1_0= ruleSharkExpression )
            // InternalDdParser.g:1204:5: lv_left_1_0= ruleSharkExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBinaryExpressionAccess().getLeftSharkExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_35);
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

            // InternalDdParser.g:1221:3: ( (lv_op_2_0= ruleBinaryOperator ) )
            // InternalDdParser.g:1222:4: (lv_op_2_0= ruleBinaryOperator )
            {
            // InternalDdParser.g:1222:4: (lv_op_2_0= ruleBinaryOperator )
            // InternalDdParser.g:1223:5: lv_op_2_0= ruleBinaryOperator
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

            // InternalDdParser.g:1240:3: ( (lv_right_3_0= ruleSharkExpression ) )
            // InternalDdParser.g:1241:4: (lv_right_3_0= ruleSharkExpression )
            {
            // InternalDdParser.g:1241:4: (lv_right_3_0= ruleSharkExpression )
            // InternalDdParser.g:1242:5: lv_right_3_0= ruleSharkExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBinaryExpressionAccess().getRightSharkExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_29);
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

            otherlv_4=(Token)match(input,RightParenthesis,FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getBinaryExpressionAccess().getRightParenthesisKeyword_4());
              		
            }
            // InternalDdParser.g:1263:3: ( ( (lv_value_5_0= RULE_NUL ) ) ( (lv_precision_6_0= RULE_INT ) ) ( (lv_length_7_0= RULE_INT ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_NUL) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalDdParser.g:1264:4: ( (lv_value_5_0= RULE_NUL ) ) ( (lv_precision_6_0= RULE_INT ) ) ( (lv_length_7_0= RULE_INT ) )
                    {
                    // InternalDdParser.g:1264:4: ( (lv_value_5_0= RULE_NUL ) )
                    // InternalDdParser.g:1265:5: (lv_value_5_0= RULE_NUL )
                    {
                    // InternalDdParser.g:1265:5: (lv_value_5_0= RULE_NUL )
                    // InternalDdParser.g:1266:6: lv_value_5_0= RULE_NUL
                    {
                    lv_value_5_0=(Token)match(input,RULE_NUL,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_5_0, grammarAccess.getBinaryExpressionAccess().getValueNULTerminalRuleCall_5_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getBinaryExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_5_0,
                      							"com.shark.lang.Dd.NUL");
                      					
                    }

                    }


                    }

                    // InternalDdParser.g:1282:4: ( (lv_precision_6_0= RULE_INT ) )
                    // InternalDdParser.g:1283:5: (lv_precision_6_0= RULE_INT )
                    {
                    // InternalDdParser.g:1283:5: (lv_precision_6_0= RULE_INT )
                    // InternalDdParser.g:1284:6: lv_precision_6_0= RULE_INT
                    {
                    lv_precision_6_0=(Token)match(input,RULE_INT,FOLLOW_27); if (state.failed) return current;
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

                    // InternalDdParser.g:1300:4: ( (lv_length_7_0= RULE_INT ) )
                    // InternalDdParser.g:1301:5: (lv_length_7_0= RULE_INT )
                    {
                    // InternalDdParser.g:1301:5: (lv_length_7_0= RULE_INT )
                    // InternalDdParser.g:1302:6: lv_length_7_0= RULE_INT
                    {
                    lv_length_7_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
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
    // InternalDdParser.g:1323:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // InternalDdParser.g:1323:56: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // InternalDdParser.g:1324:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
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
    // InternalDdParser.g:1330:1: ruleUnaryExpression returns [EObject current=null] : ( ( (lv_op_0_0= ruleUnaryOperator ) ) otherlv_1= LeftParenthesis ( (lv_left_2_0= ruleSharkExpression ) ) otherlv_3= RightParenthesis ( ( (lv_value_4_0= RULE_NUL ) ) ( (lv_precision_5_0= RULE_INT ) ) ( (lv_length_6_0= RULE_INT ) ) )? ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_value_4_0=null;
        Token lv_precision_5_0=null;
        Token lv_length_6_0=null;
        Enumerator lv_op_0_0 = null;

        EObject lv_left_2_0 = null;



        	enterRule();

        try {
            // InternalDdParser.g:1336:2: ( ( ( (lv_op_0_0= ruleUnaryOperator ) ) otherlv_1= LeftParenthesis ( (lv_left_2_0= ruleSharkExpression ) ) otherlv_3= RightParenthesis ( ( (lv_value_4_0= RULE_NUL ) ) ( (lv_precision_5_0= RULE_INT ) ) ( (lv_length_6_0= RULE_INT ) ) )? ) )
            // InternalDdParser.g:1337:2: ( ( (lv_op_0_0= ruleUnaryOperator ) ) otherlv_1= LeftParenthesis ( (lv_left_2_0= ruleSharkExpression ) ) otherlv_3= RightParenthesis ( ( (lv_value_4_0= RULE_NUL ) ) ( (lv_precision_5_0= RULE_INT ) ) ( (lv_length_6_0= RULE_INT ) ) )? )
            {
            // InternalDdParser.g:1337:2: ( ( (lv_op_0_0= ruleUnaryOperator ) ) otherlv_1= LeftParenthesis ( (lv_left_2_0= ruleSharkExpression ) ) otherlv_3= RightParenthesis ( ( (lv_value_4_0= RULE_NUL ) ) ( (lv_precision_5_0= RULE_INT ) ) ( (lv_length_6_0= RULE_INT ) ) )? )
            // InternalDdParser.g:1338:3: ( (lv_op_0_0= ruleUnaryOperator ) ) otherlv_1= LeftParenthesis ( (lv_left_2_0= ruleSharkExpression ) ) otherlv_3= RightParenthesis ( ( (lv_value_4_0= RULE_NUL ) ) ( (lv_precision_5_0= RULE_INT ) ) ( (lv_length_6_0= RULE_INT ) ) )?
            {
            // InternalDdParser.g:1338:3: ( (lv_op_0_0= ruleUnaryOperator ) )
            // InternalDdParser.g:1339:4: (lv_op_0_0= ruleUnaryOperator )
            {
            // InternalDdParser.g:1339:4: (lv_op_0_0= ruleUnaryOperator )
            // InternalDdParser.g:1340:5: lv_op_0_0= ruleUnaryOperator
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getUnaryExpressionAccess().getOpUnaryOperatorEnumRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_31);
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
            // InternalDdParser.g:1361:3: ( (lv_left_2_0= ruleSharkExpression ) )
            // InternalDdParser.g:1362:4: (lv_left_2_0= ruleSharkExpression )
            {
            // InternalDdParser.g:1362:4: (lv_left_2_0= ruleSharkExpression )
            // InternalDdParser.g:1363:5: lv_left_2_0= ruleSharkExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getUnaryExpressionAccess().getLeftSharkExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_29);
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

            otherlv_3=(Token)match(input,RightParenthesis,FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getUnaryExpressionAccess().getRightParenthesisKeyword_3());
              		
            }
            // InternalDdParser.g:1384:3: ( ( (lv_value_4_0= RULE_NUL ) ) ( (lv_precision_5_0= RULE_INT ) ) ( (lv_length_6_0= RULE_INT ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_NUL) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalDdParser.g:1385:4: ( (lv_value_4_0= RULE_NUL ) ) ( (lv_precision_5_0= RULE_INT ) ) ( (lv_length_6_0= RULE_INT ) )
                    {
                    // InternalDdParser.g:1385:4: ( (lv_value_4_0= RULE_NUL ) )
                    // InternalDdParser.g:1386:5: (lv_value_4_0= RULE_NUL )
                    {
                    // InternalDdParser.g:1386:5: (lv_value_4_0= RULE_NUL )
                    // InternalDdParser.g:1387:6: lv_value_4_0= RULE_NUL
                    {
                    lv_value_4_0=(Token)match(input,RULE_NUL,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_4_0, grammarAccess.getUnaryExpressionAccess().getValueNULTerminalRuleCall_4_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getUnaryExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_4_0,
                      							"com.shark.lang.Dd.NUL");
                      					
                    }

                    }


                    }

                    // InternalDdParser.g:1403:4: ( (lv_precision_5_0= RULE_INT ) )
                    // InternalDdParser.g:1404:5: (lv_precision_5_0= RULE_INT )
                    {
                    // InternalDdParser.g:1404:5: (lv_precision_5_0= RULE_INT )
                    // InternalDdParser.g:1405:6: lv_precision_5_0= RULE_INT
                    {
                    lv_precision_5_0=(Token)match(input,RULE_INT,FOLLOW_27); if (state.failed) return current;
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

                    // InternalDdParser.g:1421:4: ( (lv_length_6_0= RULE_INT ) )
                    // InternalDdParser.g:1422:5: (lv_length_6_0= RULE_INT )
                    {
                    // InternalDdParser.g:1422:5: (lv_length_6_0= RULE_INT )
                    // InternalDdParser.g:1423:6: lv_length_6_0= RULE_INT
                    {
                    lv_length_6_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
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
    // InternalDdParser.g:1444:1: entryRuleAddExpression returns [EObject current=null] : iv_ruleAddExpression= ruleAddExpression EOF ;
    public final EObject entryRuleAddExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddExpression = null;


        try {
            // InternalDdParser.g:1444:54: (iv_ruleAddExpression= ruleAddExpression EOF )
            // InternalDdParser.g:1445:2: iv_ruleAddExpression= ruleAddExpression EOF
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
    // InternalDdParser.g:1451:1: ruleAddExpression returns [EObject current=null] : (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_addElts_4_0= ruleAddExpressionElt ) )+ otherlv_5= RightParenthesis ( ( (lv_value_6_0= RULE_NUL ) ) ( (lv_precision_7_0= RULE_INT ) ) ( (lv_length_8_0= RULE_INT ) ) )? ) ;
    public final EObject ruleAddExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token otherlv_5=null;
        Token lv_value_6_0=null;
        Token lv_precision_7_0=null;
        Token lv_length_8_0=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_addElts_4_0 = null;



        	enterRule();

        try {
            // InternalDdParser.g:1457:2: ( (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_addElts_4_0= ruleAddExpressionElt ) )+ otherlv_5= RightParenthesis ( ( (lv_value_6_0= RULE_NUL ) ) ( (lv_precision_7_0= RULE_INT ) ) ( (lv_length_8_0= RULE_INT ) ) )? ) )
            // InternalDdParser.g:1458:2: (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_addElts_4_0= ruleAddExpressionElt ) )+ otherlv_5= RightParenthesis ( ( (lv_value_6_0= RULE_NUL ) ) ( (lv_precision_7_0= RULE_INT ) ) ( (lv_length_8_0= RULE_INT ) ) )? )
            {
            // InternalDdParser.g:1458:2: (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_addElts_4_0= ruleAddExpressionElt ) )+ otherlv_5= RightParenthesis ( ( (lv_value_6_0= RULE_NUL ) ) ( (lv_precision_7_0= RULE_INT ) ) ( (lv_length_8_0= RULE_INT ) ) )? )
            // InternalDdParser.g:1459:3: otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_addElts_4_0= ruleAddExpressionElt ) )+ otherlv_5= RightParenthesis ( ( (lv_value_6_0= RULE_NUL ) ) ( (lv_precision_7_0= RULE_INT ) ) ( (lv_length_8_0= RULE_INT ) ) )?
            {
            otherlv_0=(Token)match(input,LeftParenthesis,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAddExpressionAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalDdParser.g:1463:3: ( (lv_left_1_0= ruleSharkExpression ) )
            // InternalDdParser.g:1464:4: (lv_left_1_0= ruleSharkExpression )
            {
            // InternalDdParser.g:1464:4: (lv_left_1_0= ruleSharkExpression )
            // InternalDdParser.g:1465:5: lv_left_1_0= ruleSharkExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAddExpressionAccess().getLeftSharkExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_37);
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

            // InternalDdParser.g:1482:3: ( ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) ) )
            // InternalDdParser.g:1483:4: ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) )
            {
            // InternalDdParser.g:1483:4: ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) )
            // InternalDdParser.g:1484:5: (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus )
            {
            // InternalDdParser.g:1484:5: (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==PlusSign) ) {
                alt25=1;
            }
            else if ( (LA25_0==HyphenMinus) ) {
                alt25=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalDdParser.g:1485:6: lv_op_2_1= PlusSign
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
                    // InternalDdParser.g:1496:6: lv_op_2_2= HyphenMinus
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

            // InternalDdParser.g:1509:3: ( (lv_right_3_0= ruleSharkExpression ) )
            // InternalDdParser.g:1510:4: (lv_right_3_0= ruleSharkExpression )
            {
            // InternalDdParser.g:1510:4: (lv_right_3_0= ruleSharkExpression )
            // InternalDdParser.g:1511:5: lv_right_3_0= ruleSharkExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAddExpressionAccess().getRightSharkExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_38);
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

            // InternalDdParser.g:1528:3: ( (lv_addElts_4_0= ruleAddExpressionElt ) )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==PlusSign) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalDdParser.g:1529:4: (lv_addElts_4_0= ruleAddExpressionElt )
            	    {
            	    // InternalDdParser.g:1529:4: (lv_addElts_4_0= ruleAddExpressionElt )
            	    // InternalDdParser.g:1530:5: lv_addElts_4_0= ruleAddExpressionElt
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getAddExpressionAccess().getAddEltsAddExpressionEltParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_39);
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
            	    if ( cnt26 >= 1 ) break loop26;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
            } while (true);

            otherlv_5=(Token)match(input,RightParenthesis,FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getAddExpressionAccess().getRightParenthesisKeyword_5());
              		
            }
            // InternalDdParser.g:1551:3: ( ( (lv_value_6_0= RULE_NUL ) ) ( (lv_precision_7_0= RULE_INT ) ) ( (lv_length_8_0= RULE_INT ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_NUL) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalDdParser.g:1552:4: ( (lv_value_6_0= RULE_NUL ) ) ( (lv_precision_7_0= RULE_INT ) ) ( (lv_length_8_0= RULE_INT ) )
                    {
                    // InternalDdParser.g:1552:4: ( (lv_value_6_0= RULE_NUL ) )
                    // InternalDdParser.g:1553:5: (lv_value_6_0= RULE_NUL )
                    {
                    // InternalDdParser.g:1553:5: (lv_value_6_0= RULE_NUL )
                    // InternalDdParser.g:1554:6: lv_value_6_0= RULE_NUL
                    {
                    lv_value_6_0=(Token)match(input,RULE_NUL,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_6_0, grammarAccess.getAddExpressionAccess().getValueNULTerminalRuleCall_6_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAddExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_6_0,
                      							"com.shark.lang.Dd.NUL");
                      					
                    }

                    }


                    }

                    // InternalDdParser.g:1570:4: ( (lv_precision_7_0= RULE_INT ) )
                    // InternalDdParser.g:1571:5: (lv_precision_7_0= RULE_INT )
                    {
                    // InternalDdParser.g:1571:5: (lv_precision_7_0= RULE_INT )
                    // InternalDdParser.g:1572:6: lv_precision_7_0= RULE_INT
                    {
                    lv_precision_7_0=(Token)match(input,RULE_INT,FOLLOW_27); if (state.failed) return current;
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

                    // InternalDdParser.g:1588:4: ( (lv_length_8_0= RULE_INT ) )
                    // InternalDdParser.g:1589:5: (lv_length_8_0= RULE_INT )
                    {
                    // InternalDdParser.g:1589:5: (lv_length_8_0= RULE_INT )
                    // InternalDdParser.g:1590:6: lv_length_8_0= RULE_INT
                    {
                    lv_length_8_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
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
    // InternalDdParser.g:1611:1: entryRuleAddExpressionElt returns [EObject current=null] : iv_ruleAddExpressionElt= ruleAddExpressionElt EOF ;
    public final EObject entryRuleAddExpressionElt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddExpressionElt = null;


        try {
            // InternalDdParser.g:1611:57: (iv_ruleAddExpressionElt= ruleAddExpressionElt EOF )
            // InternalDdParser.g:1612:2: iv_ruleAddExpressionElt= ruleAddExpressionElt EOF
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
    // InternalDdParser.g:1618:1: ruleAddExpressionElt returns [EObject current=null] : ( ( (lv_op_0_0= PlusSign ) ) ( (lv_right_1_0= ruleSharkExpression ) ) ) ;
    public final EObject ruleAddExpressionElt() throws RecognitionException {
        EObject current = null;

        Token lv_op_0_0=null;
        EObject lv_right_1_0 = null;



        	enterRule();

        try {
            // InternalDdParser.g:1624:2: ( ( ( (lv_op_0_0= PlusSign ) ) ( (lv_right_1_0= ruleSharkExpression ) ) ) )
            // InternalDdParser.g:1625:2: ( ( (lv_op_0_0= PlusSign ) ) ( (lv_right_1_0= ruleSharkExpression ) ) )
            {
            // InternalDdParser.g:1625:2: ( ( (lv_op_0_0= PlusSign ) ) ( (lv_right_1_0= ruleSharkExpression ) ) )
            // InternalDdParser.g:1626:3: ( (lv_op_0_0= PlusSign ) ) ( (lv_right_1_0= ruleSharkExpression ) )
            {
            // InternalDdParser.g:1626:3: ( (lv_op_0_0= PlusSign ) )
            // InternalDdParser.g:1627:4: (lv_op_0_0= PlusSign )
            {
            // InternalDdParser.g:1627:4: (lv_op_0_0= PlusSign )
            // InternalDdParser.g:1628:5: lv_op_0_0= PlusSign
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

            // InternalDdParser.g:1640:3: ( (lv_right_1_0= ruleSharkExpression ) )
            // InternalDdParser.g:1641:4: (lv_right_1_0= ruleSharkExpression )
            {
            // InternalDdParser.g:1641:4: (lv_right_1_0= ruleSharkExpression )
            // InternalDdParser.g:1642:5: lv_right_1_0= ruleSharkExpression
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
    // InternalDdParser.g:1663:1: entryRuleMultExpression returns [EObject current=null] : iv_ruleMultExpression= ruleMultExpression EOF ;
    public final EObject entryRuleMultExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultExpression = null;


        try {
            // InternalDdParser.g:1663:55: (iv_ruleMultExpression= ruleMultExpression EOF )
            // InternalDdParser.g:1664:2: iv_ruleMultExpression= ruleMultExpression EOF
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
    // InternalDdParser.g:1670:1: ruleMultExpression returns [EObject current=null] : (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= Asterisk ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_multElts_4_0= ruleMultExpressionElt ) )+ otherlv_5= RightParenthesis ( ( (lv_value_6_0= RULE_NUL ) ) ( (lv_precision_7_0= RULE_INT ) ) ( (lv_length_8_0= RULE_INT ) ) )? ) ;
    public final EObject ruleMultExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_op_2_0=null;
        Token otherlv_5=null;
        Token lv_value_6_0=null;
        Token lv_precision_7_0=null;
        Token lv_length_8_0=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_multElts_4_0 = null;



        	enterRule();

        try {
            // InternalDdParser.g:1676:2: ( (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= Asterisk ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_multElts_4_0= ruleMultExpressionElt ) )+ otherlv_5= RightParenthesis ( ( (lv_value_6_0= RULE_NUL ) ) ( (lv_precision_7_0= RULE_INT ) ) ( (lv_length_8_0= RULE_INT ) ) )? ) )
            // InternalDdParser.g:1677:2: (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= Asterisk ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_multElts_4_0= ruleMultExpressionElt ) )+ otherlv_5= RightParenthesis ( ( (lv_value_6_0= RULE_NUL ) ) ( (lv_precision_7_0= RULE_INT ) ) ( (lv_length_8_0= RULE_INT ) ) )? )
            {
            // InternalDdParser.g:1677:2: (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= Asterisk ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_multElts_4_0= ruleMultExpressionElt ) )+ otherlv_5= RightParenthesis ( ( (lv_value_6_0= RULE_NUL ) ) ( (lv_precision_7_0= RULE_INT ) ) ( (lv_length_8_0= RULE_INT ) ) )? )
            // InternalDdParser.g:1678:3: otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= Asterisk ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_multElts_4_0= ruleMultExpressionElt ) )+ otherlv_5= RightParenthesis ( ( (lv_value_6_0= RULE_NUL ) ) ( (lv_precision_7_0= RULE_INT ) ) ( (lv_length_8_0= RULE_INT ) ) )?
            {
            otherlv_0=(Token)match(input,LeftParenthesis,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMultExpressionAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalDdParser.g:1682:3: ( (lv_left_1_0= ruleSharkExpression ) )
            // InternalDdParser.g:1683:4: (lv_left_1_0= ruleSharkExpression )
            {
            // InternalDdParser.g:1683:4: (lv_left_1_0= ruleSharkExpression )
            // InternalDdParser.g:1684:5: lv_left_1_0= ruleSharkExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMultExpressionAccess().getLeftSharkExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_40);
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

            // InternalDdParser.g:1701:3: ( (lv_op_2_0= Asterisk ) )
            // InternalDdParser.g:1702:4: (lv_op_2_0= Asterisk )
            {
            // InternalDdParser.g:1702:4: (lv_op_2_0= Asterisk )
            // InternalDdParser.g:1703:5: lv_op_2_0= Asterisk
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

            // InternalDdParser.g:1715:3: ( (lv_right_3_0= ruleSharkExpression ) )
            // InternalDdParser.g:1716:4: (lv_right_3_0= ruleSharkExpression )
            {
            // InternalDdParser.g:1716:4: (lv_right_3_0= ruleSharkExpression )
            // InternalDdParser.g:1717:5: lv_right_3_0= ruleSharkExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMultExpressionAccess().getRightSharkExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_40);
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

            // InternalDdParser.g:1734:3: ( (lv_multElts_4_0= ruleMultExpressionElt ) )+
            int cnt28=0;
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==Asterisk) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalDdParser.g:1735:4: (lv_multElts_4_0= ruleMultExpressionElt )
            	    {
            	    // InternalDdParser.g:1735:4: (lv_multElts_4_0= ruleMultExpressionElt )
            	    // InternalDdParser.g:1736:5: lv_multElts_4_0= ruleMultExpressionElt
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getMultExpressionAccess().getMultEltsMultExpressionEltParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_41);
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
            	    if ( cnt28 >= 1 ) break loop28;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(28, input);
                        throw eee;
                }
                cnt28++;
            } while (true);

            otherlv_5=(Token)match(input,RightParenthesis,FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getMultExpressionAccess().getRightParenthesisKeyword_5());
              		
            }
            // InternalDdParser.g:1757:3: ( ( (lv_value_6_0= RULE_NUL ) ) ( (lv_precision_7_0= RULE_INT ) ) ( (lv_length_8_0= RULE_INT ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_NUL) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalDdParser.g:1758:4: ( (lv_value_6_0= RULE_NUL ) ) ( (lv_precision_7_0= RULE_INT ) ) ( (lv_length_8_0= RULE_INT ) )
                    {
                    // InternalDdParser.g:1758:4: ( (lv_value_6_0= RULE_NUL ) )
                    // InternalDdParser.g:1759:5: (lv_value_6_0= RULE_NUL )
                    {
                    // InternalDdParser.g:1759:5: (lv_value_6_0= RULE_NUL )
                    // InternalDdParser.g:1760:6: lv_value_6_0= RULE_NUL
                    {
                    lv_value_6_0=(Token)match(input,RULE_NUL,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_6_0, grammarAccess.getMultExpressionAccess().getValueNULTerminalRuleCall_6_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getMultExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_6_0,
                      							"com.shark.lang.Dd.NUL");
                      					
                    }

                    }


                    }

                    // InternalDdParser.g:1776:4: ( (lv_precision_7_0= RULE_INT ) )
                    // InternalDdParser.g:1777:5: (lv_precision_7_0= RULE_INT )
                    {
                    // InternalDdParser.g:1777:5: (lv_precision_7_0= RULE_INT )
                    // InternalDdParser.g:1778:6: lv_precision_7_0= RULE_INT
                    {
                    lv_precision_7_0=(Token)match(input,RULE_INT,FOLLOW_27); if (state.failed) return current;
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

                    // InternalDdParser.g:1794:4: ( (lv_length_8_0= RULE_INT ) )
                    // InternalDdParser.g:1795:5: (lv_length_8_0= RULE_INT )
                    {
                    // InternalDdParser.g:1795:5: (lv_length_8_0= RULE_INT )
                    // InternalDdParser.g:1796:6: lv_length_8_0= RULE_INT
                    {
                    lv_length_8_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
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
    // InternalDdParser.g:1817:1: entryRuleMultExpressionElt returns [EObject current=null] : iv_ruleMultExpressionElt= ruleMultExpressionElt EOF ;
    public final EObject entryRuleMultExpressionElt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultExpressionElt = null;


        try {
            // InternalDdParser.g:1817:58: (iv_ruleMultExpressionElt= ruleMultExpressionElt EOF )
            // InternalDdParser.g:1818:2: iv_ruleMultExpressionElt= ruleMultExpressionElt EOF
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
    // InternalDdParser.g:1824:1: ruleMultExpressionElt returns [EObject current=null] : ( ( (lv_op_0_0= Asterisk ) ) ( (lv_right_1_0= ruleSharkExpression ) ) ) ;
    public final EObject ruleMultExpressionElt() throws RecognitionException {
        EObject current = null;

        Token lv_op_0_0=null;
        EObject lv_right_1_0 = null;



        	enterRule();

        try {
            // InternalDdParser.g:1830:2: ( ( ( (lv_op_0_0= Asterisk ) ) ( (lv_right_1_0= ruleSharkExpression ) ) ) )
            // InternalDdParser.g:1831:2: ( ( (lv_op_0_0= Asterisk ) ) ( (lv_right_1_0= ruleSharkExpression ) ) )
            {
            // InternalDdParser.g:1831:2: ( ( (lv_op_0_0= Asterisk ) ) ( (lv_right_1_0= ruleSharkExpression ) ) )
            // InternalDdParser.g:1832:3: ( (lv_op_0_0= Asterisk ) ) ( (lv_right_1_0= ruleSharkExpression ) )
            {
            // InternalDdParser.g:1832:3: ( (lv_op_0_0= Asterisk ) )
            // InternalDdParser.g:1833:4: (lv_op_0_0= Asterisk )
            {
            // InternalDdParser.g:1833:4: (lv_op_0_0= Asterisk )
            // InternalDdParser.g:1834:5: lv_op_0_0= Asterisk
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

            // InternalDdParser.g:1846:3: ( (lv_right_1_0= ruleSharkExpression ) )
            // InternalDdParser.g:1847:4: (lv_right_1_0= ruleSharkExpression )
            {
            // InternalDdParser.g:1847:4: (lv_right_1_0= ruleSharkExpression )
            // InternalDdParser.g:1848:5: lv_right_1_0= ruleSharkExpression
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
    // InternalDdParser.g:1869:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // InternalDdParser.g:1869:54: (iv_ruleAndExpression= ruleAndExpression EOF )
            // InternalDdParser.g:1870:2: iv_ruleAndExpression= ruleAndExpression EOF
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
    // InternalDdParser.g:1876:1: ruleAndExpression returns [EObject current=null] : (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= And ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_andElts_4_0= ruleAndExpressionElt ) )+ otherlv_5= RightParenthesis ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_op_2_0=null;
        Token otherlv_5=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_andElts_4_0 = null;



        	enterRule();

        try {
            // InternalDdParser.g:1882:2: ( (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= And ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_andElts_4_0= ruleAndExpressionElt ) )+ otherlv_5= RightParenthesis ) )
            // InternalDdParser.g:1883:2: (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= And ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_andElts_4_0= ruleAndExpressionElt ) )+ otherlv_5= RightParenthesis )
            {
            // InternalDdParser.g:1883:2: (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= And ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_andElts_4_0= ruleAndExpressionElt ) )+ otherlv_5= RightParenthesis )
            // InternalDdParser.g:1884:3: otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= And ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_andElts_4_0= ruleAndExpressionElt ) )+ otherlv_5= RightParenthesis
            {
            otherlv_0=(Token)match(input,LeftParenthesis,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAndExpressionAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalDdParser.g:1888:3: ( (lv_left_1_0= ruleSharkExpression ) )
            // InternalDdParser.g:1889:4: (lv_left_1_0= ruleSharkExpression )
            {
            // InternalDdParser.g:1889:4: (lv_left_1_0= ruleSharkExpression )
            // InternalDdParser.g:1890:5: lv_left_1_0= ruleSharkExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAndExpressionAccess().getLeftSharkExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_42);
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

            // InternalDdParser.g:1907:3: ( (lv_op_2_0= And ) )
            // InternalDdParser.g:1908:4: (lv_op_2_0= And )
            {
            // InternalDdParser.g:1908:4: (lv_op_2_0= And )
            // InternalDdParser.g:1909:5: lv_op_2_0= And
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

            // InternalDdParser.g:1921:3: ( (lv_right_3_0= ruleSharkExpression ) )
            // InternalDdParser.g:1922:4: (lv_right_3_0= ruleSharkExpression )
            {
            // InternalDdParser.g:1922:4: (lv_right_3_0= ruleSharkExpression )
            // InternalDdParser.g:1923:5: lv_right_3_0= ruleSharkExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAndExpressionAccess().getRightSharkExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_42);
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

            // InternalDdParser.g:1940:3: ( (lv_andElts_4_0= ruleAndExpressionElt ) )+
            int cnt30=0;
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==And) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalDdParser.g:1941:4: (lv_andElts_4_0= ruleAndExpressionElt )
            	    {
            	    // InternalDdParser.g:1941:4: (lv_andElts_4_0= ruleAndExpressionElt )
            	    // InternalDdParser.g:1942:5: lv_andElts_4_0= ruleAndExpressionElt
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getAndExpressionAccess().getAndEltsAndExpressionEltParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_43);
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
            	    if ( cnt30 >= 1 ) break loop30;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(30, input);
                        throw eee;
                }
                cnt30++;
            } while (true);

            otherlv_5=(Token)match(input,RightParenthesis,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getAndExpressionAccess().getRightParenthesisKeyword_5());
              		
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
    // InternalDdParser.g:1967:1: entryRuleAndExpressionElt returns [EObject current=null] : iv_ruleAndExpressionElt= ruleAndExpressionElt EOF ;
    public final EObject entryRuleAndExpressionElt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpressionElt = null;


        try {
            // InternalDdParser.g:1967:57: (iv_ruleAndExpressionElt= ruleAndExpressionElt EOF )
            // InternalDdParser.g:1968:2: iv_ruleAndExpressionElt= ruleAndExpressionElt EOF
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
    // InternalDdParser.g:1974:1: ruleAndExpressionElt returns [EObject current=null] : ( ( (lv_op_0_0= And ) ) ( (lv_right_1_0= ruleSharkExpression ) ) ) ;
    public final EObject ruleAndExpressionElt() throws RecognitionException {
        EObject current = null;

        Token lv_op_0_0=null;
        EObject lv_right_1_0 = null;



        	enterRule();

        try {
            // InternalDdParser.g:1980:2: ( ( ( (lv_op_0_0= And ) ) ( (lv_right_1_0= ruleSharkExpression ) ) ) )
            // InternalDdParser.g:1981:2: ( ( (lv_op_0_0= And ) ) ( (lv_right_1_0= ruleSharkExpression ) ) )
            {
            // InternalDdParser.g:1981:2: ( ( (lv_op_0_0= And ) ) ( (lv_right_1_0= ruleSharkExpression ) ) )
            // InternalDdParser.g:1982:3: ( (lv_op_0_0= And ) ) ( (lv_right_1_0= ruleSharkExpression ) )
            {
            // InternalDdParser.g:1982:3: ( (lv_op_0_0= And ) )
            // InternalDdParser.g:1983:4: (lv_op_0_0= And )
            {
            // InternalDdParser.g:1983:4: (lv_op_0_0= And )
            // InternalDdParser.g:1984:5: lv_op_0_0= And
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

            // InternalDdParser.g:1996:3: ( (lv_right_1_0= ruleSharkExpression ) )
            // InternalDdParser.g:1997:4: (lv_right_1_0= ruleSharkExpression )
            {
            // InternalDdParser.g:1997:4: (lv_right_1_0= ruleSharkExpression )
            // InternalDdParser.g:1998:5: lv_right_1_0= ruleSharkExpression
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
    // InternalDdParser.g:2019:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // InternalDdParser.g:2019:53: (iv_ruleOrExpression= ruleOrExpression EOF )
            // InternalDdParser.g:2020:2: iv_ruleOrExpression= ruleOrExpression EOF
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
    // InternalDdParser.g:2026:1: ruleOrExpression returns [EObject current=null] : (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= Or ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_orElts_4_0= ruleOrExpressionElt ) )+ otherlv_5= RightParenthesis ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_op_2_0=null;
        Token otherlv_5=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_orElts_4_0 = null;



        	enterRule();

        try {
            // InternalDdParser.g:2032:2: ( (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= Or ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_orElts_4_0= ruleOrExpressionElt ) )+ otherlv_5= RightParenthesis ) )
            // InternalDdParser.g:2033:2: (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= Or ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_orElts_4_0= ruleOrExpressionElt ) )+ otherlv_5= RightParenthesis )
            {
            // InternalDdParser.g:2033:2: (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= Or ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_orElts_4_0= ruleOrExpressionElt ) )+ otherlv_5= RightParenthesis )
            // InternalDdParser.g:2034:3: otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= Or ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_orElts_4_0= ruleOrExpressionElt ) )+ otherlv_5= RightParenthesis
            {
            otherlv_0=(Token)match(input,LeftParenthesis,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getOrExpressionAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalDdParser.g:2038:3: ( (lv_left_1_0= ruleSharkExpression ) )
            // InternalDdParser.g:2039:4: (lv_left_1_0= ruleSharkExpression )
            {
            // InternalDdParser.g:2039:4: (lv_left_1_0= ruleSharkExpression )
            // InternalDdParser.g:2040:5: lv_left_1_0= ruleSharkExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getOrExpressionAccess().getLeftSharkExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_44);
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

            // InternalDdParser.g:2057:3: ( (lv_op_2_0= Or ) )
            // InternalDdParser.g:2058:4: (lv_op_2_0= Or )
            {
            // InternalDdParser.g:2058:4: (lv_op_2_0= Or )
            // InternalDdParser.g:2059:5: lv_op_2_0= Or
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

            // InternalDdParser.g:2071:3: ( (lv_right_3_0= ruleSharkExpression ) )
            // InternalDdParser.g:2072:4: (lv_right_3_0= ruleSharkExpression )
            {
            // InternalDdParser.g:2072:4: (lv_right_3_0= ruleSharkExpression )
            // InternalDdParser.g:2073:5: lv_right_3_0= ruleSharkExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getOrExpressionAccess().getRightSharkExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_44);
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

            // InternalDdParser.g:2090:3: ( (lv_orElts_4_0= ruleOrExpressionElt ) )+
            int cnt31=0;
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==Or) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalDdParser.g:2091:4: (lv_orElts_4_0= ruleOrExpressionElt )
            	    {
            	    // InternalDdParser.g:2091:4: (lv_orElts_4_0= ruleOrExpressionElt )
            	    // InternalDdParser.g:2092:5: lv_orElts_4_0= ruleOrExpressionElt
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getOrExpressionAccess().getOrEltsOrExpressionEltParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_45);
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
            	    if ( cnt31 >= 1 ) break loop31;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(31, input);
                        throw eee;
                }
                cnt31++;
            } while (true);

            otherlv_5=(Token)match(input,RightParenthesis,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getOrExpressionAccess().getRightParenthesisKeyword_5());
              		
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
    // InternalDdParser.g:2117:1: entryRuleOrExpressionElt returns [EObject current=null] : iv_ruleOrExpressionElt= ruleOrExpressionElt EOF ;
    public final EObject entryRuleOrExpressionElt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpressionElt = null;


        try {
            // InternalDdParser.g:2117:56: (iv_ruleOrExpressionElt= ruleOrExpressionElt EOF )
            // InternalDdParser.g:2118:2: iv_ruleOrExpressionElt= ruleOrExpressionElt EOF
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
    // InternalDdParser.g:2124:1: ruleOrExpressionElt returns [EObject current=null] : ( ( (lv_op_0_0= Or ) ) ( (lv_right_1_0= ruleSharkExpression ) ) ) ;
    public final EObject ruleOrExpressionElt() throws RecognitionException {
        EObject current = null;

        Token lv_op_0_0=null;
        EObject lv_right_1_0 = null;



        	enterRule();

        try {
            // InternalDdParser.g:2130:2: ( ( ( (lv_op_0_0= Or ) ) ( (lv_right_1_0= ruleSharkExpression ) ) ) )
            // InternalDdParser.g:2131:2: ( ( (lv_op_0_0= Or ) ) ( (lv_right_1_0= ruleSharkExpression ) ) )
            {
            // InternalDdParser.g:2131:2: ( ( (lv_op_0_0= Or ) ) ( (lv_right_1_0= ruleSharkExpression ) ) )
            // InternalDdParser.g:2132:3: ( (lv_op_0_0= Or ) ) ( (lv_right_1_0= ruleSharkExpression ) )
            {
            // InternalDdParser.g:2132:3: ( (lv_op_0_0= Or ) )
            // InternalDdParser.g:2133:4: (lv_op_0_0= Or )
            {
            // InternalDdParser.g:2133:4: (lv_op_0_0= Or )
            // InternalDdParser.g:2134:5: lv_op_0_0= Or
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

            // InternalDdParser.g:2146:3: ( (lv_right_1_0= ruleSharkExpression ) )
            // InternalDdParser.g:2147:4: (lv_right_1_0= ruleSharkExpression )
            {
            // InternalDdParser.g:2147:4: (lv_right_1_0= ruleSharkExpression )
            // InternalDdParser.g:2148:5: lv_right_1_0= ruleSharkExpression
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
    // InternalDdParser.g:2169:1: entryRuleCatExpression returns [EObject current=null] : iv_ruleCatExpression= ruleCatExpression EOF ;
    public final EObject entryRuleCatExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCatExpression = null;


        try {
            // InternalDdParser.g:2169:54: (iv_ruleCatExpression= ruleCatExpression EOF )
            // InternalDdParser.g:2170:2: iv_ruleCatExpression= ruleCatExpression EOF
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
    // InternalDdParser.g:2176:1: ruleCatExpression returns [EObject current=null] : (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= Ampersand ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_catElts_4_0= ruleCatExpressionElt ) )+ otherlv_5= RightParenthesis ( ( (lv_value_6_0= RULE_NUL ) ) ( (lv_length_7_0= RULE_INT ) ) )? ) ;
    public final EObject ruleCatExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_op_2_0=null;
        Token otherlv_5=null;
        Token lv_value_6_0=null;
        Token lv_length_7_0=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_catElts_4_0 = null;



        	enterRule();

        try {
            // InternalDdParser.g:2182:2: ( (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= Ampersand ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_catElts_4_0= ruleCatExpressionElt ) )+ otherlv_5= RightParenthesis ( ( (lv_value_6_0= RULE_NUL ) ) ( (lv_length_7_0= RULE_INT ) ) )? ) )
            // InternalDdParser.g:2183:2: (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= Ampersand ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_catElts_4_0= ruleCatExpressionElt ) )+ otherlv_5= RightParenthesis ( ( (lv_value_6_0= RULE_NUL ) ) ( (lv_length_7_0= RULE_INT ) ) )? )
            {
            // InternalDdParser.g:2183:2: (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= Ampersand ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_catElts_4_0= ruleCatExpressionElt ) )+ otherlv_5= RightParenthesis ( ( (lv_value_6_0= RULE_NUL ) ) ( (lv_length_7_0= RULE_INT ) ) )? )
            // InternalDdParser.g:2184:3: otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= Ampersand ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_catElts_4_0= ruleCatExpressionElt ) )+ otherlv_5= RightParenthesis ( ( (lv_value_6_0= RULE_NUL ) ) ( (lv_length_7_0= RULE_INT ) ) )?
            {
            otherlv_0=(Token)match(input,LeftParenthesis,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getCatExpressionAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalDdParser.g:2188:3: ( (lv_left_1_0= ruleSharkExpression ) )
            // InternalDdParser.g:2189:4: (lv_left_1_0= ruleSharkExpression )
            {
            // InternalDdParser.g:2189:4: (lv_left_1_0= ruleSharkExpression )
            // InternalDdParser.g:2190:5: lv_left_1_0= ruleSharkExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCatExpressionAccess().getLeftSharkExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_46);
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

            // InternalDdParser.g:2207:3: ( (lv_op_2_0= Ampersand ) )
            // InternalDdParser.g:2208:4: (lv_op_2_0= Ampersand )
            {
            // InternalDdParser.g:2208:4: (lv_op_2_0= Ampersand )
            // InternalDdParser.g:2209:5: lv_op_2_0= Ampersand
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

            // InternalDdParser.g:2221:3: ( (lv_right_3_0= ruleSharkExpression ) )
            // InternalDdParser.g:2222:4: (lv_right_3_0= ruleSharkExpression )
            {
            // InternalDdParser.g:2222:4: (lv_right_3_0= ruleSharkExpression )
            // InternalDdParser.g:2223:5: lv_right_3_0= ruleSharkExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCatExpressionAccess().getRightSharkExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_46);
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

            // InternalDdParser.g:2240:3: ( (lv_catElts_4_0= ruleCatExpressionElt ) )+
            int cnt32=0;
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==Ampersand) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalDdParser.g:2241:4: (lv_catElts_4_0= ruleCatExpressionElt )
            	    {
            	    // InternalDdParser.g:2241:4: (lv_catElts_4_0= ruleCatExpressionElt )
            	    // InternalDdParser.g:2242:5: lv_catElts_4_0= ruleCatExpressionElt
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getCatExpressionAccess().getCatEltsCatExpressionEltParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_47);
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
            	    if ( cnt32 >= 1 ) break loop32;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(32, input);
                        throw eee;
                }
                cnt32++;
            } while (true);

            otherlv_5=(Token)match(input,RightParenthesis,FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getCatExpressionAccess().getRightParenthesisKeyword_5());
              		
            }
            // InternalDdParser.g:2263:3: ( ( (lv_value_6_0= RULE_NUL ) ) ( (lv_length_7_0= RULE_INT ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_NUL) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalDdParser.g:2264:4: ( (lv_value_6_0= RULE_NUL ) ) ( (lv_length_7_0= RULE_INT ) )
                    {
                    // InternalDdParser.g:2264:4: ( (lv_value_6_0= RULE_NUL ) )
                    // InternalDdParser.g:2265:5: (lv_value_6_0= RULE_NUL )
                    {
                    // InternalDdParser.g:2265:5: (lv_value_6_0= RULE_NUL )
                    // InternalDdParser.g:2266:6: lv_value_6_0= RULE_NUL
                    {
                    lv_value_6_0=(Token)match(input,RULE_NUL,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_6_0, grammarAccess.getCatExpressionAccess().getValueNULTerminalRuleCall_6_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getCatExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_6_0,
                      							"com.shark.lang.Dd.NUL");
                      					
                    }

                    }


                    }

                    // InternalDdParser.g:2282:4: ( (lv_length_7_0= RULE_INT ) )
                    // InternalDdParser.g:2283:5: (lv_length_7_0= RULE_INT )
                    {
                    // InternalDdParser.g:2283:5: (lv_length_7_0= RULE_INT )
                    // InternalDdParser.g:2284:6: lv_length_7_0= RULE_INT
                    {
                    lv_length_7_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
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
    // InternalDdParser.g:2305:1: entryRuleCatExpressionElt returns [EObject current=null] : iv_ruleCatExpressionElt= ruleCatExpressionElt EOF ;
    public final EObject entryRuleCatExpressionElt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCatExpressionElt = null;


        try {
            // InternalDdParser.g:2305:57: (iv_ruleCatExpressionElt= ruleCatExpressionElt EOF )
            // InternalDdParser.g:2306:2: iv_ruleCatExpressionElt= ruleCatExpressionElt EOF
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
    // InternalDdParser.g:2312:1: ruleCatExpressionElt returns [EObject current=null] : ( ( (lv_op_0_0= Ampersand ) ) ( (lv_right_1_0= ruleSharkExpression ) ) ) ;
    public final EObject ruleCatExpressionElt() throws RecognitionException {
        EObject current = null;

        Token lv_op_0_0=null;
        EObject lv_right_1_0 = null;



        	enterRule();

        try {
            // InternalDdParser.g:2318:2: ( ( ( (lv_op_0_0= Ampersand ) ) ( (lv_right_1_0= ruleSharkExpression ) ) ) )
            // InternalDdParser.g:2319:2: ( ( (lv_op_0_0= Ampersand ) ) ( (lv_right_1_0= ruleSharkExpression ) ) )
            {
            // InternalDdParser.g:2319:2: ( ( (lv_op_0_0= Ampersand ) ) ( (lv_right_1_0= ruleSharkExpression ) ) )
            // InternalDdParser.g:2320:3: ( (lv_op_0_0= Ampersand ) ) ( (lv_right_1_0= ruleSharkExpression ) )
            {
            // InternalDdParser.g:2320:3: ( (lv_op_0_0= Ampersand ) )
            // InternalDdParser.g:2321:4: (lv_op_0_0= Ampersand )
            {
            // InternalDdParser.g:2321:4: (lv_op_0_0= Ampersand )
            // InternalDdParser.g:2322:5: lv_op_0_0= Ampersand
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

            // InternalDdParser.g:2334:3: ( (lv_right_1_0= ruleSharkExpression ) )
            // InternalDdParser.g:2335:4: (lv_right_1_0= ruleSharkExpression )
            {
            // InternalDdParser.g:2335:4: (lv_right_1_0= ruleSharkExpression )
            // InternalDdParser.g:2336:5: lv_right_1_0= ruleSharkExpression
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
    // InternalDdParser.g:2357:1: entryRuleListExpression returns [EObject current=null] : iv_ruleListExpression= ruleListExpression EOF ;
    public final EObject entryRuleListExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListExpression = null;


        try {
            // InternalDdParser.g:2357:55: (iv_ruleListExpression= ruleListExpression EOF )
            // InternalDdParser.g:2358:2: iv_ruleListExpression= ruleListExpression EOF
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
    // InternalDdParser.g:2364:1: ruleListExpression returns [EObject current=null] : ( ( (lv_op_0_0= LeftParenthesis ) ) ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_ListElts_2_0= ruleListExpressionElt ) )+ otherlv_3= RightParenthesis ) ;
    public final EObject ruleListExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_0_0=null;
        Token otherlv_3=null;
        EObject lv_left_1_0 = null;

        EObject lv_ListElts_2_0 = null;



        	enterRule();

        try {
            // InternalDdParser.g:2370:2: ( ( ( (lv_op_0_0= LeftParenthesis ) ) ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_ListElts_2_0= ruleListExpressionElt ) )+ otherlv_3= RightParenthesis ) )
            // InternalDdParser.g:2371:2: ( ( (lv_op_0_0= LeftParenthesis ) ) ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_ListElts_2_0= ruleListExpressionElt ) )+ otherlv_3= RightParenthesis )
            {
            // InternalDdParser.g:2371:2: ( ( (lv_op_0_0= LeftParenthesis ) ) ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_ListElts_2_0= ruleListExpressionElt ) )+ otherlv_3= RightParenthesis )
            // InternalDdParser.g:2372:3: ( (lv_op_0_0= LeftParenthesis ) ) ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_ListElts_2_0= ruleListExpressionElt ) )+ otherlv_3= RightParenthesis
            {
            // InternalDdParser.g:2372:3: ( (lv_op_0_0= LeftParenthesis ) )
            // InternalDdParser.g:2373:4: (lv_op_0_0= LeftParenthesis )
            {
            // InternalDdParser.g:2373:4: (lv_op_0_0= LeftParenthesis )
            // InternalDdParser.g:2374:5: lv_op_0_0= LeftParenthesis
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

            // InternalDdParser.g:2386:3: ( (lv_left_1_0= ruleSharkExpression ) )
            // InternalDdParser.g:2387:4: (lv_left_1_0= ruleSharkExpression )
            {
            // InternalDdParser.g:2387:4: (lv_left_1_0= ruleSharkExpression )
            // InternalDdParser.g:2388:5: lv_left_1_0= ruleSharkExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getListExpressionAccess().getLeftSharkExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_48);
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

            // InternalDdParser.g:2405:3: ( (lv_ListElts_2_0= ruleListExpressionElt ) )+
            int cnt34=0;
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==Comma) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalDdParser.g:2406:4: (lv_ListElts_2_0= ruleListExpressionElt )
            	    {
            	    // InternalDdParser.g:2406:4: (lv_ListElts_2_0= ruleListExpressionElt )
            	    // InternalDdParser.g:2407:5: lv_ListElts_2_0= ruleListExpressionElt
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getListExpressionAccess().getListEltsListExpressionEltParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_28);
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
            	    if ( cnt34 >= 1 ) break loop34;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(34, input);
                        throw eee;
                }
                cnt34++;
            } while (true);

            otherlv_3=(Token)match(input,RightParenthesis,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getListExpressionAccess().getRightParenthesisKeyword_3());
              		
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
    // InternalDdParser.g:2432:1: entryRuleListExpressionElt returns [EObject current=null] : iv_ruleListExpressionElt= ruleListExpressionElt EOF ;
    public final EObject entryRuleListExpressionElt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListExpressionElt = null;


        try {
            // InternalDdParser.g:2432:58: (iv_ruleListExpressionElt= ruleListExpressionElt EOF )
            // InternalDdParser.g:2433:2: iv_ruleListExpressionElt= ruleListExpressionElt EOF
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
    // InternalDdParser.g:2439:1: ruleListExpressionElt returns [EObject current=null] : ( ( (lv_op_0_0= Comma ) ) ( (lv_right_1_0= ruleSharkExpression ) ) ) ;
    public final EObject ruleListExpressionElt() throws RecognitionException {
        EObject current = null;

        Token lv_op_0_0=null;
        EObject lv_right_1_0 = null;



        	enterRule();

        try {
            // InternalDdParser.g:2445:2: ( ( ( (lv_op_0_0= Comma ) ) ( (lv_right_1_0= ruleSharkExpression ) ) ) )
            // InternalDdParser.g:2446:2: ( ( (lv_op_0_0= Comma ) ) ( (lv_right_1_0= ruleSharkExpression ) ) )
            {
            // InternalDdParser.g:2446:2: ( ( (lv_op_0_0= Comma ) ) ( (lv_right_1_0= ruleSharkExpression ) ) )
            // InternalDdParser.g:2447:3: ( (lv_op_0_0= Comma ) ) ( (lv_right_1_0= ruleSharkExpression ) )
            {
            // InternalDdParser.g:2447:3: ( (lv_op_0_0= Comma ) )
            // InternalDdParser.g:2448:4: (lv_op_0_0= Comma )
            {
            // InternalDdParser.g:2448:4: (lv_op_0_0= Comma )
            // InternalDdParser.g:2449:5: lv_op_0_0= Comma
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

            // InternalDdParser.g:2461:3: ( (lv_right_1_0= ruleSharkExpression ) )
            // InternalDdParser.g:2462:4: (lv_right_1_0= ruleSharkExpression )
            {
            // InternalDdParser.g:2462:4: (lv_right_1_0= ruleSharkExpression )
            // InternalDdParser.g:2463:5: lv_right_1_0= ruleSharkExpression
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
    // InternalDdParser.g:2484:1: entryRuleRangeExpression returns [EObject current=null] : iv_ruleRangeExpression= ruleRangeExpression EOF ;
    public final EObject entryRuleRangeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRangeExpression = null;


        try {
            // InternalDdParser.g:2484:56: (iv_ruleRangeExpression= ruleRangeExpression EOF )
            // InternalDdParser.g:2485:2: iv_ruleRangeExpression= ruleRangeExpression EOF
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
    // InternalDdParser.g:2491:1: ruleRangeExpression returns [EObject current=null] : ( ( () otherlv_1= LeftParenthesis ( (lv_range_2_0= RULE_RANGE ) ) otherlv_3= RightParenthesis ) | ( () ( ( LeftParenthesis )=>otherlv_5= LeftParenthesis ) ( (lv_range_6_0= RULE_RANGEINF ) ) otherlv_7= RightParenthesis ) ) ;
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
            // InternalDdParser.g:2497:2: ( ( ( () otherlv_1= LeftParenthesis ( (lv_range_2_0= RULE_RANGE ) ) otherlv_3= RightParenthesis ) | ( () ( ( LeftParenthesis )=>otherlv_5= LeftParenthesis ) ( (lv_range_6_0= RULE_RANGEINF ) ) otherlv_7= RightParenthesis ) ) )
            // InternalDdParser.g:2498:2: ( ( () otherlv_1= LeftParenthesis ( (lv_range_2_0= RULE_RANGE ) ) otherlv_3= RightParenthesis ) | ( () ( ( LeftParenthesis )=>otherlv_5= LeftParenthesis ) ( (lv_range_6_0= RULE_RANGEINF ) ) otherlv_7= RightParenthesis ) )
            {
            // InternalDdParser.g:2498:2: ( ( () otherlv_1= LeftParenthesis ( (lv_range_2_0= RULE_RANGE ) ) otherlv_3= RightParenthesis ) | ( () ( ( LeftParenthesis )=>otherlv_5= LeftParenthesis ) ( (lv_range_6_0= RULE_RANGEINF ) ) otherlv_7= RightParenthesis ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==LeftParenthesis) ) {
                int LA35_1 = input.LA(2);

                if ( (LA35_1==RULE_RANGE) ) {
                    alt35=1;
                }
                else if ( (LA35_1==RULE_RANGEINF) ) {
                    alt35=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 35, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalDdParser.g:2499:3: ( () otherlv_1= LeftParenthesis ( (lv_range_2_0= RULE_RANGE ) ) otherlv_3= RightParenthesis )
                    {
                    // InternalDdParser.g:2499:3: ( () otherlv_1= LeftParenthesis ( (lv_range_2_0= RULE_RANGE ) ) otherlv_3= RightParenthesis )
                    // InternalDdParser.g:2500:4: () otherlv_1= LeftParenthesis ( (lv_range_2_0= RULE_RANGE ) ) otherlv_3= RightParenthesis
                    {
                    // InternalDdParser.g:2500:4: ()
                    // InternalDdParser.g:2501:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getRangeExpressionAccess().getListExpressionAction_0_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_49); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getRangeExpressionAccess().getLeftParenthesisKeyword_0_1());
                      			
                    }
                    // InternalDdParser.g:2511:4: ( (lv_range_2_0= RULE_RANGE ) )
                    // InternalDdParser.g:2512:5: (lv_range_2_0= RULE_RANGE )
                    {
                    // InternalDdParser.g:2512:5: (lv_range_2_0= RULE_RANGE )
                    // InternalDdParser.g:2513:6: lv_range_2_0= RULE_RANGE
                    {
                    lv_range_2_0=(Token)match(input,RULE_RANGE,FOLLOW_29); if (state.failed) return current;
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
                    // InternalDdParser.g:2535:3: ( () ( ( LeftParenthesis )=>otherlv_5= LeftParenthesis ) ( (lv_range_6_0= RULE_RANGEINF ) ) otherlv_7= RightParenthesis )
                    {
                    // InternalDdParser.g:2535:3: ( () ( ( LeftParenthesis )=>otherlv_5= LeftParenthesis ) ( (lv_range_6_0= RULE_RANGEINF ) ) otherlv_7= RightParenthesis )
                    // InternalDdParser.g:2536:4: () ( ( LeftParenthesis )=>otherlv_5= LeftParenthesis ) ( (lv_range_6_0= RULE_RANGEINF ) ) otherlv_7= RightParenthesis
                    {
                    // InternalDdParser.g:2536:4: ()
                    // InternalDdParser.g:2537:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getRangeExpressionAccess().getListExpressionAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalDdParser.g:2543:4: ( ( LeftParenthesis )=>otherlv_5= LeftParenthesis )
                    // InternalDdParser.g:2544:5: ( LeftParenthesis )=>otherlv_5= LeftParenthesis
                    {
                    otherlv_5=(Token)match(input,LeftParenthesis,FOLLOW_50); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getRangeExpressionAccess().getLeftParenthesisKeyword_1_1());
                      				
                    }

                    }

                    // InternalDdParser.g:2550:4: ( (lv_range_6_0= RULE_RANGEINF ) )
                    // InternalDdParser.g:2551:5: (lv_range_6_0= RULE_RANGEINF )
                    {
                    // InternalDdParser.g:2551:5: (lv_range_6_0= RULE_RANGEINF )
                    // InternalDdParser.g:2552:6: lv_range_6_0= RULE_RANGEINF
                    {
                    lv_range_6_0=(Token)match(input,RULE_RANGEINF,FOLLOW_29); if (state.failed) return current;
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
    // InternalDdParser.g:2577:1: entryRuleTerminalExpression returns [EObject current=null] : iv_ruleTerminalExpression= ruleTerminalExpression EOF ;
    public final EObject entryRuleTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalExpression = null;


        try {
            // InternalDdParser.g:2577:59: (iv_ruleTerminalExpression= ruleTerminalExpression EOF )
            // InternalDdParser.g:2578:2: iv_ruleTerminalExpression= ruleTerminalExpression EOF
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
    // InternalDdParser.g:2584:1: ruleTerminalExpression returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_STR ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( (lv_value_5_0= RULE_DEC ) ) ) | ( () ( (lv_value_7_0= RULE_CHR ) ) ) | ( () ( (otherlv_9= RULE_CSTID ) ) ) | ( () ( (lv_value_11_0= ruleBoolean ) ) ) | ( () ( (lv_value_13_0= ruleUnset ) ) ) ) ;
    public final EObject ruleTerminalExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;
        Token lv_value_5_0=null;
        Token lv_value_7_0=null;
        Token otherlv_9=null;
        Enumerator lv_value_11_0 = null;

        Enumerator lv_value_13_0 = null;



        	enterRule();

        try {
            // InternalDdParser.g:2590:2: ( ( ( () ( (lv_value_1_0= RULE_STR ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( (lv_value_5_0= RULE_DEC ) ) ) | ( () ( (lv_value_7_0= RULE_CHR ) ) ) | ( () ( (otherlv_9= RULE_CSTID ) ) ) | ( () ( (lv_value_11_0= ruleBoolean ) ) ) | ( () ( (lv_value_13_0= ruleUnset ) ) ) ) )
            // InternalDdParser.g:2591:2: ( ( () ( (lv_value_1_0= RULE_STR ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( (lv_value_5_0= RULE_DEC ) ) ) | ( () ( (lv_value_7_0= RULE_CHR ) ) ) | ( () ( (otherlv_9= RULE_CSTID ) ) ) | ( () ( (lv_value_11_0= ruleBoolean ) ) ) | ( () ( (lv_value_13_0= ruleUnset ) ) ) )
            {
            // InternalDdParser.g:2591:2: ( ( () ( (lv_value_1_0= RULE_STR ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( (lv_value_5_0= RULE_DEC ) ) ) | ( () ( (lv_value_7_0= RULE_CHR ) ) ) | ( () ( (otherlv_9= RULE_CSTID ) ) ) | ( () ( (lv_value_11_0= ruleBoolean ) ) ) | ( () ( (lv_value_13_0= ruleUnset ) ) ) )
            int alt36=7;
            switch ( input.LA(1) ) {
            case RULE_STR:
                {
                alt36=1;
                }
                break;
            case RULE_INT:
                {
                alt36=2;
                }
                break;
            case RULE_DEC:
                {
                alt36=3;
                }
                break;
            case RULE_CHR:
                {
                alt36=4;
                }
                break;
            case RULE_CSTID:
                {
                alt36=5;
                }
                break;
            case False:
            case True:
                {
                alt36=6;
                }
                break;
            case Unset:
                {
                alt36=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // InternalDdParser.g:2592:3: ( () ( (lv_value_1_0= RULE_STR ) ) )
                    {
                    // InternalDdParser.g:2592:3: ( () ( (lv_value_1_0= RULE_STR ) ) )
                    // InternalDdParser.g:2593:4: () ( (lv_value_1_0= RULE_STR ) )
                    {
                    // InternalDdParser.g:2593:4: ()
                    // InternalDdParser.g:2594:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalExpressionAccess().getStrValueAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalDdParser.g:2600:4: ( (lv_value_1_0= RULE_STR ) )
                    // InternalDdParser.g:2601:5: (lv_value_1_0= RULE_STR )
                    {
                    // InternalDdParser.g:2601:5: (lv_value_1_0= RULE_STR )
                    // InternalDdParser.g:2602:6: lv_value_1_0= RULE_STR
                    {
                    lv_value_1_0=(Token)match(input,RULE_STR,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_1_0, grammarAccess.getTerminalExpressionAccess().getValueSTRTerminalRuleCall_0_1_0());
                      					
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
                    // InternalDdParser.g:2620:3: ( () ( (lv_value_3_0= RULE_INT ) ) )
                    {
                    // InternalDdParser.g:2620:3: ( () ( (lv_value_3_0= RULE_INT ) ) )
                    // InternalDdParser.g:2621:4: () ( (lv_value_3_0= RULE_INT ) )
                    {
                    // InternalDdParser.g:2621:4: ()
                    // InternalDdParser.g:2622:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalExpressionAccess().getIntValueAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalDdParser.g:2628:4: ( (lv_value_3_0= RULE_INT ) )
                    // InternalDdParser.g:2629:5: (lv_value_3_0= RULE_INT )
                    {
                    // InternalDdParser.g:2629:5: (lv_value_3_0= RULE_INT )
                    // InternalDdParser.g:2630:6: lv_value_3_0= RULE_INT
                    {
                    lv_value_3_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_3_0, grammarAccess.getTerminalExpressionAccess().getValueINTTerminalRuleCall_1_1_0());
                      					
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
                    // InternalDdParser.g:2648:3: ( () ( (lv_value_5_0= RULE_DEC ) ) )
                    {
                    // InternalDdParser.g:2648:3: ( () ( (lv_value_5_0= RULE_DEC ) ) )
                    // InternalDdParser.g:2649:4: () ( (lv_value_5_0= RULE_DEC ) )
                    {
                    // InternalDdParser.g:2649:4: ()
                    // InternalDdParser.g:2650:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalExpressionAccess().getDecValueAction_2_0(),
                      						current);
                      				
                    }

                    }

                    // InternalDdParser.g:2656:4: ( (lv_value_5_0= RULE_DEC ) )
                    // InternalDdParser.g:2657:5: (lv_value_5_0= RULE_DEC )
                    {
                    // InternalDdParser.g:2657:5: (lv_value_5_0= RULE_DEC )
                    // InternalDdParser.g:2658:6: lv_value_5_0= RULE_DEC
                    {
                    lv_value_5_0=(Token)match(input,RULE_DEC,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_5_0, grammarAccess.getTerminalExpressionAccess().getValueDECTerminalRuleCall_2_1_0());
                      					
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
                    // InternalDdParser.g:2676:3: ( () ( (lv_value_7_0= RULE_CHR ) ) )
                    {
                    // InternalDdParser.g:2676:3: ( () ( (lv_value_7_0= RULE_CHR ) ) )
                    // InternalDdParser.g:2677:4: () ( (lv_value_7_0= RULE_CHR ) )
                    {
                    // InternalDdParser.g:2677:4: ()
                    // InternalDdParser.g:2678:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalExpressionAccess().getChrValueAction_3_0(),
                      						current);
                      				
                    }

                    }

                    // InternalDdParser.g:2684:4: ( (lv_value_7_0= RULE_CHR ) )
                    // InternalDdParser.g:2685:5: (lv_value_7_0= RULE_CHR )
                    {
                    // InternalDdParser.g:2685:5: (lv_value_7_0= RULE_CHR )
                    // InternalDdParser.g:2686:6: lv_value_7_0= RULE_CHR
                    {
                    lv_value_7_0=(Token)match(input,RULE_CHR,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_7_0, grammarAccess.getTerminalExpressionAccess().getValueCHRTerminalRuleCall_3_1_0());
                      					
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
                    // InternalDdParser.g:2704:3: ( () ( (otherlv_9= RULE_CSTID ) ) )
                    {
                    // InternalDdParser.g:2704:3: ( () ( (otherlv_9= RULE_CSTID ) ) )
                    // InternalDdParser.g:2705:4: () ( (otherlv_9= RULE_CSTID ) )
                    {
                    // InternalDdParser.g:2705:4: ()
                    // InternalDdParser.g:2706:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalExpressionAccess().getCstValueAction_4_0(),
                      						current);
                      				
                    }

                    }

                    // InternalDdParser.g:2712:4: ( (otherlv_9= RULE_CSTID ) )
                    // InternalDdParser.g:2713:5: (otherlv_9= RULE_CSTID )
                    {
                    // InternalDdParser.g:2713:5: (otherlv_9= RULE_CSTID )
                    // InternalDdParser.g:2714:6: otherlv_9= RULE_CSTID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTerminalExpressionRule());
                      						}
                      					
                    }
                    otherlv_9=(Token)match(input,RULE_CSTID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_9, grammarAccess.getTerminalExpressionAccess().getValueConstantCrossReference_4_1_0());
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalDdParser.g:2727:3: ( () ( (lv_value_11_0= ruleBoolean ) ) )
                    {
                    // InternalDdParser.g:2727:3: ( () ( (lv_value_11_0= ruleBoolean ) ) )
                    // InternalDdParser.g:2728:4: () ( (lv_value_11_0= ruleBoolean ) )
                    {
                    // InternalDdParser.g:2728:4: ()
                    // InternalDdParser.g:2729:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalExpressionAccess().getBoolValueAction_5_0(),
                      						current);
                      				
                    }

                    }

                    // InternalDdParser.g:2735:4: ( (lv_value_11_0= ruleBoolean ) )
                    // InternalDdParser.g:2736:5: (lv_value_11_0= ruleBoolean )
                    {
                    // InternalDdParser.g:2736:5: (lv_value_11_0= ruleBoolean )
                    // InternalDdParser.g:2737:6: lv_value_11_0= ruleBoolean
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTerminalExpressionAccess().getValueBooleanEnumRuleCall_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_value_11_0=ruleBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTerminalExpressionRule());
                      						}
                      						set(
                      							current,
                      							"value",
                      							lv_value_11_0,
                      							"com.shark.lang.Dd.Boolean");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalDdParser.g:2756:3: ( () ( (lv_value_13_0= ruleUnset ) ) )
                    {
                    // InternalDdParser.g:2756:3: ( () ( (lv_value_13_0= ruleUnset ) ) )
                    // InternalDdParser.g:2757:4: () ( (lv_value_13_0= ruleUnset ) )
                    {
                    // InternalDdParser.g:2757:4: ()
                    // InternalDdParser.g:2758:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalExpressionAccess().getUnsetValueAction_6_0(),
                      						current);
                      				
                    }

                    }

                    // InternalDdParser.g:2764:4: ( (lv_value_13_0= ruleUnset ) )
                    // InternalDdParser.g:2765:5: (lv_value_13_0= ruleUnset )
                    {
                    // InternalDdParser.g:2765:5: (lv_value_13_0= ruleUnset )
                    // InternalDdParser.g:2766:6: lv_value_13_0= ruleUnset
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTerminalExpressionAccess().getValueUnsetEnumRuleCall_6_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_value_13_0=ruleUnset();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTerminalExpressionRule());
                      						}
                      						set(
                      							current,
                      							"value",
                      							lv_value_13_0,
                      							"com.shark.lang.Dd.Unset");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


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
    // $ANTLR end "ruleTerminalExpression"


    // $ANTLR start "entryRuleIdentifierExpression"
    // InternalDdParser.g:2788:1: entryRuleIdentifierExpression returns [EObject current=null] : iv_ruleIdentifierExpression= ruleIdentifierExpression EOF ;
    public final EObject entryRuleIdentifierExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdentifierExpression = null;


        try {
            // InternalDdParser.g:2788:61: (iv_ruleIdentifierExpression= ruleIdentifierExpression EOF )
            // InternalDdParser.g:2789:2: iv_ruleIdentifierExpression= ruleIdentifierExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdentifierExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIdentifierExpression=ruleIdentifierExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdentifierExpression; 
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
    // $ANTLR end "entryRuleIdentifierExpression"


    // $ANTLR start "ruleIdentifierExpression"
    // InternalDdParser.g:2795:1: ruleIdentifierExpression returns [EObject current=null] : ( () ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleIdentifierExpression() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalDdParser.g:2801:2: ( ( () ( ( ruleQualifiedName ) ) ) )
            // InternalDdParser.g:2802:2: ( () ( ( ruleQualifiedName ) ) )
            {
            // InternalDdParser.g:2802:2: ( () ( ( ruleQualifiedName ) ) )
            // InternalDdParser.g:2803:3: () ( ( ruleQualifiedName ) )
            {
            // InternalDdParser.g:2803:3: ()
            // InternalDdParser.g:2804:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getIdentifierExpressionAccess().getIdentifierExpressionAction_0(),
              					current);
              			
            }

            }

            // InternalDdParser.g:2810:3: ( ( ruleQualifiedName ) )
            // InternalDdParser.g:2811:4: ( ruleQualifiedName )
            {
            // InternalDdParser.g:2811:4: ( ruleQualifiedName )
            // InternalDdParser.g:2812:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getIdentifierExpressionRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIdentifierExpressionAccess().getValueAttributeCrossReference_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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
    // $ANTLR end "ruleIdentifierExpression"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalDdParser.g:2830:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalDdParser.g:2830:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalDdParser.g:2831:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalDdParser.g:2837:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_OBJID_0= RULE_OBJID kw= FullStop )? this_ID_2= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_OBJID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalDdParser.g:2843:2: ( ( (this_OBJID_0= RULE_OBJID kw= FullStop )? this_ID_2= RULE_ID ) )
            // InternalDdParser.g:2844:2: ( (this_OBJID_0= RULE_OBJID kw= FullStop )? this_ID_2= RULE_ID )
            {
            // InternalDdParser.g:2844:2: ( (this_OBJID_0= RULE_OBJID kw= FullStop )? this_ID_2= RULE_ID )
            // InternalDdParser.g:2845:3: (this_OBJID_0= RULE_OBJID kw= FullStop )? this_ID_2= RULE_ID
            {
            // InternalDdParser.g:2845:3: (this_OBJID_0= RULE_OBJID kw= FullStop )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_OBJID) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalDdParser.g:2846:4: this_OBJID_0= RULE_OBJID kw= FullStop
                    {
                    this_OBJID_0=(Token)match(input,RULE_OBJID,FOLLOW_51); if (state.failed) return current;
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
    // InternalDdParser.g:2870:1: entryRuleLineComment returns [EObject current=null] : iv_ruleLineComment= ruleLineComment EOF ;
    public final EObject entryRuleLineComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLineComment = null;


        try {
            // InternalDdParser.g:2870:52: (iv_ruleLineComment= ruleLineComment EOF )
            // InternalDdParser.g:2871:2: iv_ruleLineComment= ruleLineComment EOF
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
    // InternalDdParser.g:2877:1: ruleLineComment returns [EObject current=null] : ( () ( (lv_line_1_0= RULE_CMT ) ) this_EOL_2= RULE_EOL ) ;
    public final EObject ruleLineComment() throws RecognitionException {
        EObject current = null;

        Token lv_line_1_0=null;
        Token this_EOL_2=null;


        	enterRule();

        try {
            // InternalDdParser.g:2883:2: ( ( () ( (lv_line_1_0= RULE_CMT ) ) this_EOL_2= RULE_EOL ) )
            // InternalDdParser.g:2884:2: ( () ( (lv_line_1_0= RULE_CMT ) ) this_EOL_2= RULE_EOL )
            {
            // InternalDdParser.g:2884:2: ( () ( (lv_line_1_0= RULE_CMT ) ) this_EOL_2= RULE_EOL )
            // InternalDdParser.g:2885:3: () ( (lv_line_1_0= RULE_CMT ) ) this_EOL_2= RULE_EOL
            {
            // InternalDdParser.g:2885:3: ()
            // InternalDdParser.g:2886:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getLineCommentAccess().getCommentAction_0(),
              					current);
              			
            }

            }

            // InternalDdParser.g:2892:3: ( (lv_line_1_0= RULE_CMT ) )
            // InternalDdParser.g:2893:4: (lv_line_1_0= RULE_CMT )
            {
            // InternalDdParser.g:2893:4: (lv_line_1_0= RULE_CMT )
            // InternalDdParser.g:2894:5: lv_line_1_0= RULE_CMT
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
    // InternalDdParser.g:2918:1: entryRuleTrailComment returns [EObject current=null] : iv_ruleTrailComment= ruleTrailComment EOF ;
    public final EObject entryRuleTrailComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrailComment = null;


        try {
            // InternalDdParser.g:2918:53: (iv_ruleTrailComment= ruleTrailComment EOF )
            // InternalDdParser.g:2919:2: iv_ruleTrailComment= ruleTrailComment EOF
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
    // InternalDdParser.g:2925:1: ruleTrailComment returns [EObject current=null] : ( () ( (lv_line_1_0= RULE_CMT ) ) ) ;
    public final EObject ruleTrailComment() throws RecognitionException {
        EObject current = null;

        Token lv_line_1_0=null;


        	enterRule();

        try {
            // InternalDdParser.g:2931:2: ( ( () ( (lv_line_1_0= RULE_CMT ) ) ) )
            // InternalDdParser.g:2932:2: ( () ( (lv_line_1_0= RULE_CMT ) ) )
            {
            // InternalDdParser.g:2932:2: ( () ( (lv_line_1_0= RULE_CMT ) ) )
            // InternalDdParser.g:2933:3: () ( (lv_line_1_0= RULE_CMT ) )
            {
            // InternalDdParser.g:2933:3: ()
            // InternalDdParser.g:2934:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getTrailCommentAccess().getCommentAction_0(),
              					current);
              			
            }

            }

            // InternalDdParser.g:2940:3: ( (lv_line_1_0= RULE_CMT ) )
            // InternalDdParser.g:2941:4: (lv_line_1_0= RULE_CMT )
            {
            // InternalDdParser.g:2941:4: (lv_line_1_0= RULE_CMT )
            // InternalDdParser.g:2942:5: lv_line_1_0= RULE_CMT
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
    // InternalDdParser.g:2962:1: ruleBinaryOperator returns [Enumerator current=null] : ( (enumLiteral_0= Or ) | (enumLiteral_1= And ) | (enumLiteral_2= PlusSign ) | (enumLiteral_3= HyphenMinus ) | (enumLiteral_4= Asterisk ) | (enumLiteral_5= Solidus ) | (enumLiteral_6= PercentSign ) | (enumLiteral_7= EqualsSignEqualsSign ) | (enumLiteral_8= GreaterThanSign ) | (enumLiteral_9= LessThanSign ) | (enumLiteral_10= LessThanSignEqualsSign ) | (enumLiteral_11= GreaterThanSignEqualsSign ) | (enumLiteral_12= CircumflexAccent ) | (enumLiteral_13= Like ) | (enumLiteral_14= ExclamationMarkEqualsSign ) | (enumLiteral_15= Ampersand ) | (enumLiteral_16= In ) | (enumLiteral_17= Stxt ) | (enumLiteral_18= Round ) ) ;
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
            // InternalDdParser.g:2968:2: ( ( (enumLiteral_0= Or ) | (enumLiteral_1= And ) | (enumLiteral_2= PlusSign ) | (enumLiteral_3= HyphenMinus ) | (enumLiteral_4= Asterisk ) | (enumLiteral_5= Solidus ) | (enumLiteral_6= PercentSign ) | (enumLiteral_7= EqualsSignEqualsSign ) | (enumLiteral_8= GreaterThanSign ) | (enumLiteral_9= LessThanSign ) | (enumLiteral_10= LessThanSignEqualsSign ) | (enumLiteral_11= GreaterThanSignEqualsSign ) | (enumLiteral_12= CircumflexAccent ) | (enumLiteral_13= Like ) | (enumLiteral_14= ExclamationMarkEqualsSign ) | (enumLiteral_15= Ampersand ) | (enumLiteral_16= In ) | (enumLiteral_17= Stxt ) | (enumLiteral_18= Round ) ) )
            // InternalDdParser.g:2969:2: ( (enumLiteral_0= Or ) | (enumLiteral_1= And ) | (enumLiteral_2= PlusSign ) | (enumLiteral_3= HyphenMinus ) | (enumLiteral_4= Asterisk ) | (enumLiteral_5= Solidus ) | (enumLiteral_6= PercentSign ) | (enumLiteral_7= EqualsSignEqualsSign ) | (enumLiteral_8= GreaterThanSign ) | (enumLiteral_9= LessThanSign ) | (enumLiteral_10= LessThanSignEqualsSign ) | (enumLiteral_11= GreaterThanSignEqualsSign ) | (enumLiteral_12= CircumflexAccent ) | (enumLiteral_13= Like ) | (enumLiteral_14= ExclamationMarkEqualsSign ) | (enumLiteral_15= Ampersand ) | (enumLiteral_16= In ) | (enumLiteral_17= Stxt ) | (enumLiteral_18= Round ) )
            {
            // InternalDdParser.g:2969:2: ( (enumLiteral_0= Or ) | (enumLiteral_1= And ) | (enumLiteral_2= PlusSign ) | (enumLiteral_3= HyphenMinus ) | (enumLiteral_4= Asterisk ) | (enumLiteral_5= Solidus ) | (enumLiteral_6= PercentSign ) | (enumLiteral_7= EqualsSignEqualsSign ) | (enumLiteral_8= GreaterThanSign ) | (enumLiteral_9= LessThanSign ) | (enumLiteral_10= LessThanSignEqualsSign ) | (enumLiteral_11= GreaterThanSignEqualsSign ) | (enumLiteral_12= CircumflexAccent ) | (enumLiteral_13= Like ) | (enumLiteral_14= ExclamationMarkEqualsSign ) | (enumLiteral_15= Ampersand ) | (enumLiteral_16= In ) | (enumLiteral_17= Stxt ) | (enumLiteral_18= Round ) )
            int alt38=19;
            switch ( input.LA(1) ) {
            case Or:
                {
                alt38=1;
                }
                break;
            case And:
                {
                alt38=2;
                }
                break;
            case PlusSign:
                {
                alt38=3;
                }
                break;
            case HyphenMinus:
                {
                alt38=4;
                }
                break;
            case Asterisk:
                {
                alt38=5;
                }
                break;
            case Solidus:
                {
                alt38=6;
                }
                break;
            case PercentSign:
                {
                alt38=7;
                }
                break;
            case EqualsSignEqualsSign:
                {
                alt38=8;
                }
                break;
            case GreaterThanSign:
                {
                alt38=9;
                }
                break;
            case LessThanSign:
                {
                alt38=10;
                }
                break;
            case LessThanSignEqualsSign:
                {
                alt38=11;
                }
                break;
            case GreaterThanSignEqualsSign:
                {
                alt38=12;
                }
                break;
            case CircumflexAccent:
                {
                alt38=13;
                }
                break;
            case Like:
                {
                alt38=14;
                }
                break;
            case ExclamationMarkEqualsSign:
                {
                alt38=15;
                }
                break;
            case Ampersand:
                {
                alt38=16;
                }
                break;
            case In:
                {
                alt38=17;
                }
                break;
            case Stxt:
                {
                alt38=18;
                }
                break;
            case Round:
                {
                alt38=19;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // InternalDdParser.g:2970:3: (enumLiteral_0= Or )
                    {
                    // InternalDdParser.g:2970:3: (enumLiteral_0= Or )
                    // InternalDdParser.g:2971:4: enumLiteral_0= Or
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
                    // InternalDdParser.g:2978:3: (enumLiteral_1= And )
                    {
                    // InternalDdParser.g:2978:3: (enumLiteral_1= And )
                    // InternalDdParser.g:2979:4: enumLiteral_1= And
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
                    // InternalDdParser.g:2986:3: (enumLiteral_2= PlusSign )
                    {
                    // InternalDdParser.g:2986:3: (enumLiteral_2= PlusSign )
                    // InternalDdParser.g:2987:4: enumLiteral_2= PlusSign
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
                    // InternalDdParser.g:2994:3: (enumLiteral_3= HyphenMinus )
                    {
                    // InternalDdParser.g:2994:3: (enumLiteral_3= HyphenMinus )
                    // InternalDdParser.g:2995:4: enumLiteral_3= HyphenMinus
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
                    // InternalDdParser.g:3002:3: (enumLiteral_4= Asterisk )
                    {
                    // InternalDdParser.g:3002:3: (enumLiteral_4= Asterisk )
                    // InternalDdParser.g:3003:4: enumLiteral_4= Asterisk
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
                    // InternalDdParser.g:3010:3: (enumLiteral_5= Solidus )
                    {
                    // InternalDdParser.g:3010:3: (enumLiteral_5= Solidus )
                    // InternalDdParser.g:3011:4: enumLiteral_5= Solidus
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
                    // InternalDdParser.g:3018:3: (enumLiteral_6= PercentSign )
                    {
                    // InternalDdParser.g:3018:3: (enumLiteral_6= PercentSign )
                    // InternalDdParser.g:3019:4: enumLiteral_6= PercentSign
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
                    // InternalDdParser.g:3026:3: (enumLiteral_7= EqualsSignEqualsSign )
                    {
                    // InternalDdParser.g:3026:3: (enumLiteral_7= EqualsSignEqualsSign )
                    // InternalDdParser.g:3027:4: enumLiteral_7= EqualsSignEqualsSign
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
                    // InternalDdParser.g:3034:3: (enumLiteral_8= GreaterThanSign )
                    {
                    // InternalDdParser.g:3034:3: (enumLiteral_8= GreaterThanSign )
                    // InternalDdParser.g:3035:4: enumLiteral_8= GreaterThanSign
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
                    // InternalDdParser.g:3042:3: (enumLiteral_9= LessThanSign )
                    {
                    // InternalDdParser.g:3042:3: (enumLiteral_9= LessThanSign )
                    // InternalDdParser.g:3043:4: enumLiteral_9= LessThanSign
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
                    // InternalDdParser.g:3050:3: (enumLiteral_10= LessThanSignEqualsSign )
                    {
                    // InternalDdParser.g:3050:3: (enumLiteral_10= LessThanSignEqualsSign )
                    // InternalDdParser.g:3051:4: enumLiteral_10= LessThanSignEqualsSign
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
                    // InternalDdParser.g:3058:3: (enumLiteral_11= GreaterThanSignEqualsSign )
                    {
                    // InternalDdParser.g:3058:3: (enumLiteral_11= GreaterThanSignEqualsSign )
                    // InternalDdParser.g:3059:4: enumLiteral_11= GreaterThanSignEqualsSign
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
                    // InternalDdParser.g:3066:3: (enumLiteral_12= CircumflexAccent )
                    {
                    // InternalDdParser.g:3066:3: (enumLiteral_12= CircumflexAccent )
                    // InternalDdParser.g:3067:4: enumLiteral_12= CircumflexAccent
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
                    // InternalDdParser.g:3074:3: (enumLiteral_13= Like )
                    {
                    // InternalDdParser.g:3074:3: (enumLiteral_13= Like )
                    // InternalDdParser.g:3075:4: enumLiteral_13= Like
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
                    // InternalDdParser.g:3082:3: (enumLiteral_14= ExclamationMarkEqualsSign )
                    {
                    // InternalDdParser.g:3082:3: (enumLiteral_14= ExclamationMarkEqualsSign )
                    // InternalDdParser.g:3083:4: enumLiteral_14= ExclamationMarkEqualsSign
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
                    // InternalDdParser.g:3090:3: (enumLiteral_15= Ampersand )
                    {
                    // InternalDdParser.g:3090:3: (enumLiteral_15= Ampersand )
                    // InternalDdParser.g:3091:4: enumLiteral_15= Ampersand
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
                    // InternalDdParser.g:3098:3: (enumLiteral_16= In )
                    {
                    // InternalDdParser.g:3098:3: (enumLiteral_16= In )
                    // InternalDdParser.g:3099:4: enumLiteral_16= In
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
                    // InternalDdParser.g:3106:3: (enumLiteral_17= Stxt )
                    {
                    // InternalDdParser.g:3106:3: (enumLiteral_17= Stxt )
                    // InternalDdParser.g:3107:4: enumLiteral_17= Stxt
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
                    // InternalDdParser.g:3114:3: (enumLiteral_18= Round )
                    {
                    // InternalDdParser.g:3114:3: (enumLiteral_18= Round )
                    // InternalDdParser.g:3115:4: enumLiteral_18= Round
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
    // InternalDdParser.g:3125:1: ruleUnaryOperator returns [Enumerator current=null] : ( (enumLiteral_0= Not ) | (enumLiteral_1= HyphenMinus ) | (enumLiteral_2= Str ) | (enumLiteral_3= Int ) | (enumLiteral_4= Dec ) | (enumLiteral_5= Date ) | (enumLiteral_6= Time ) | (enumLiteral_7= Len ) | (enumLiteral_8= Stamp ) ) ;
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
            // InternalDdParser.g:3131:2: ( ( (enumLiteral_0= Not ) | (enumLiteral_1= HyphenMinus ) | (enumLiteral_2= Str ) | (enumLiteral_3= Int ) | (enumLiteral_4= Dec ) | (enumLiteral_5= Date ) | (enumLiteral_6= Time ) | (enumLiteral_7= Len ) | (enumLiteral_8= Stamp ) ) )
            // InternalDdParser.g:3132:2: ( (enumLiteral_0= Not ) | (enumLiteral_1= HyphenMinus ) | (enumLiteral_2= Str ) | (enumLiteral_3= Int ) | (enumLiteral_4= Dec ) | (enumLiteral_5= Date ) | (enumLiteral_6= Time ) | (enumLiteral_7= Len ) | (enumLiteral_8= Stamp ) )
            {
            // InternalDdParser.g:3132:2: ( (enumLiteral_0= Not ) | (enumLiteral_1= HyphenMinus ) | (enumLiteral_2= Str ) | (enumLiteral_3= Int ) | (enumLiteral_4= Dec ) | (enumLiteral_5= Date ) | (enumLiteral_6= Time ) | (enumLiteral_7= Len ) | (enumLiteral_8= Stamp ) )
            int alt39=9;
            switch ( input.LA(1) ) {
            case Not:
                {
                alt39=1;
                }
                break;
            case HyphenMinus:
                {
                alt39=2;
                }
                break;
            case Str:
                {
                alt39=3;
                }
                break;
            case Int:
                {
                alt39=4;
                }
                break;
            case Dec:
                {
                alt39=5;
                }
                break;
            case Date:
                {
                alt39=6;
                }
                break;
            case Time:
                {
                alt39=7;
                }
                break;
            case Len:
                {
                alt39=8;
                }
                break;
            case Stamp:
                {
                alt39=9;
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
                    // InternalDdParser.g:3133:3: (enumLiteral_0= Not )
                    {
                    // InternalDdParser.g:3133:3: (enumLiteral_0= Not )
                    // InternalDdParser.g:3134:4: enumLiteral_0= Not
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
                    // InternalDdParser.g:3141:3: (enumLiteral_1= HyphenMinus )
                    {
                    // InternalDdParser.g:3141:3: (enumLiteral_1= HyphenMinus )
                    // InternalDdParser.g:3142:4: enumLiteral_1= HyphenMinus
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
                    // InternalDdParser.g:3149:3: (enumLiteral_2= Str )
                    {
                    // InternalDdParser.g:3149:3: (enumLiteral_2= Str )
                    // InternalDdParser.g:3150:4: enumLiteral_2= Str
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
                    // InternalDdParser.g:3157:3: (enumLiteral_3= Int )
                    {
                    // InternalDdParser.g:3157:3: (enumLiteral_3= Int )
                    // InternalDdParser.g:3158:4: enumLiteral_3= Int
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
                    // InternalDdParser.g:3165:3: (enumLiteral_4= Dec )
                    {
                    // InternalDdParser.g:3165:3: (enumLiteral_4= Dec )
                    // InternalDdParser.g:3166:4: enumLiteral_4= Dec
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
                    // InternalDdParser.g:3173:3: (enumLiteral_5= Date )
                    {
                    // InternalDdParser.g:3173:3: (enumLiteral_5= Date )
                    // InternalDdParser.g:3174:4: enumLiteral_5= Date
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
                    // InternalDdParser.g:3181:3: (enumLiteral_6= Time )
                    {
                    // InternalDdParser.g:3181:3: (enumLiteral_6= Time )
                    // InternalDdParser.g:3182:4: enumLiteral_6= Time
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
                    // InternalDdParser.g:3189:3: (enumLiteral_7= Len )
                    {
                    // InternalDdParser.g:3189:3: (enumLiteral_7= Len )
                    // InternalDdParser.g:3190:4: enumLiteral_7= Len
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
                    // InternalDdParser.g:3197:3: (enumLiteral_8= Stamp )
                    {
                    // InternalDdParser.g:3197:3: (enumLiteral_8= Stamp )
                    // InternalDdParser.g:3198:4: enumLiteral_8= Stamp
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
    // InternalDdParser.g:3208:1: ruleUnset returns [Enumerator current=null] : (enumLiteral_0= Unset ) ;
    public final Enumerator ruleUnset() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalDdParser.g:3214:2: ( (enumLiteral_0= Unset ) )
            // InternalDdParser.g:3215:2: (enumLiteral_0= Unset )
            {
            // InternalDdParser.g:3215:2: (enumLiteral_0= Unset )
            // InternalDdParser.g:3216:3: enumLiteral_0= Unset
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
    // InternalDdParser.g:3225:1: ruleBoolean returns [Enumerator current=null] : ( (enumLiteral_0= True ) | (enumLiteral_1= False ) ) ;
    public final Enumerator ruleBoolean() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDdParser.g:3231:2: ( ( (enumLiteral_0= True ) | (enumLiteral_1= False ) ) )
            // InternalDdParser.g:3232:2: ( (enumLiteral_0= True ) | (enumLiteral_1= False ) )
            {
            // InternalDdParser.g:3232:2: ( (enumLiteral_0= True ) | (enumLiteral_1= False ) )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==True) ) {
                alt40=1;
            }
            else if ( (LA40_0==False) ) {
                alt40=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalDdParser.g:3233:3: (enumLiteral_0= True )
                    {
                    // InternalDdParser.g:3233:3: (enumLiteral_0= True )
                    // InternalDdParser.g:3234:4: enumLiteral_0= True
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
                    // InternalDdParser.g:3241:3: (enumLiteral_1= False )
                    {
                    // InternalDdParser.g:3241:3: (enumLiteral_1= False )
                    // InternalDdParser.g:3242:4: enumLiteral_1= False
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
    // InternalDdParser.g:3252:1: ruleDataType returns [Enumerator current=null] : ( (enumLiteral_0= Str ) | (enumLiteral_1= Dec ) | (enumLiteral_2= Date ) | (enumLiteral_3= Time ) | (enumLiteral_4= Chr ) | (enumLiteral_5= Int ) | (enumLiteral_6= Stamp ) | (enumLiteral_7= Bits ) | (enumLiteral_8= Bool ) | (enumLiteral_9= HalfwidthHangulFillerHalfwidthHangulFillerHalfwidthHangulFiller ) ) ;
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
            // InternalDdParser.g:3258:2: ( ( (enumLiteral_0= Str ) | (enumLiteral_1= Dec ) | (enumLiteral_2= Date ) | (enumLiteral_3= Time ) | (enumLiteral_4= Chr ) | (enumLiteral_5= Int ) | (enumLiteral_6= Stamp ) | (enumLiteral_7= Bits ) | (enumLiteral_8= Bool ) | (enumLiteral_9= HalfwidthHangulFillerHalfwidthHangulFillerHalfwidthHangulFiller ) ) )
            // InternalDdParser.g:3259:2: ( (enumLiteral_0= Str ) | (enumLiteral_1= Dec ) | (enumLiteral_2= Date ) | (enumLiteral_3= Time ) | (enumLiteral_4= Chr ) | (enumLiteral_5= Int ) | (enumLiteral_6= Stamp ) | (enumLiteral_7= Bits ) | (enumLiteral_8= Bool ) | (enumLiteral_9= HalfwidthHangulFillerHalfwidthHangulFillerHalfwidthHangulFiller ) )
            {
            // InternalDdParser.g:3259:2: ( (enumLiteral_0= Str ) | (enumLiteral_1= Dec ) | (enumLiteral_2= Date ) | (enumLiteral_3= Time ) | (enumLiteral_4= Chr ) | (enumLiteral_5= Int ) | (enumLiteral_6= Stamp ) | (enumLiteral_7= Bits ) | (enumLiteral_8= Bool ) | (enumLiteral_9= HalfwidthHangulFillerHalfwidthHangulFillerHalfwidthHangulFiller ) )
            int alt41=10;
            switch ( input.LA(1) ) {
            case Str:
                {
                alt41=1;
                }
                break;
            case Dec:
                {
                alt41=2;
                }
                break;
            case Date:
                {
                alt41=3;
                }
                break;
            case Time:
                {
                alt41=4;
                }
                break;
            case Chr:
                {
                alt41=5;
                }
                break;
            case Int:
                {
                alt41=6;
                }
                break;
            case Stamp:
                {
                alt41=7;
                }
                break;
            case Bits:
                {
                alt41=8;
                }
                break;
            case Bool:
                {
                alt41=9;
                }
                break;
            case HalfwidthHangulFillerHalfwidthHangulFillerHalfwidthHangulFiller:
                {
                alt41=10;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // InternalDdParser.g:3260:3: (enumLiteral_0= Str )
                    {
                    // InternalDdParser.g:3260:3: (enumLiteral_0= Str )
                    // InternalDdParser.g:3261:4: enumLiteral_0= Str
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
                    // InternalDdParser.g:3268:3: (enumLiteral_1= Dec )
                    {
                    // InternalDdParser.g:3268:3: (enumLiteral_1= Dec )
                    // InternalDdParser.g:3269:4: enumLiteral_1= Dec
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
                    // InternalDdParser.g:3276:3: (enumLiteral_2= Date )
                    {
                    // InternalDdParser.g:3276:3: (enumLiteral_2= Date )
                    // InternalDdParser.g:3277:4: enumLiteral_2= Date
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
                    // InternalDdParser.g:3284:3: (enumLiteral_3= Time )
                    {
                    // InternalDdParser.g:3284:3: (enumLiteral_3= Time )
                    // InternalDdParser.g:3285:4: enumLiteral_3= Time
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
                    // InternalDdParser.g:3292:3: (enumLiteral_4= Chr )
                    {
                    // InternalDdParser.g:3292:3: (enumLiteral_4= Chr )
                    // InternalDdParser.g:3293:4: enumLiteral_4= Chr
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
                    // InternalDdParser.g:3300:3: (enumLiteral_5= Int )
                    {
                    // InternalDdParser.g:3300:3: (enumLiteral_5= Int )
                    // InternalDdParser.g:3301:4: enumLiteral_5= Int
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
                    // InternalDdParser.g:3308:3: (enumLiteral_6= Stamp )
                    {
                    // InternalDdParser.g:3308:3: (enumLiteral_6= Stamp )
                    // InternalDdParser.g:3309:4: enumLiteral_6= Stamp
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
                    // InternalDdParser.g:3316:3: (enumLiteral_7= Bits )
                    {
                    // InternalDdParser.g:3316:3: (enumLiteral_7= Bits )
                    // InternalDdParser.g:3317:4: enumLiteral_7= Bits
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
                    // InternalDdParser.g:3324:3: (enumLiteral_8= Bool )
                    {
                    // InternalDdParser.g:3324:3: (enumLiteral_8= Bool )
                    // InternalDdParser.g:3325:4: enumLiteral_8= Bool
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
                    // InternalDdParser.g:3332:3: (enumLiteral_9= HalfwidthHangulFillerHalfwidthHangulFillerHalfwidthHangulFiller )
                    {
                    // InternalDdParser.g:3332:3: (enumLiteral_9= HalfwidthHangulFillerHalfwidthHangulFillerHalfwidthHangulFiller )
                    // InternalDdParser.g:3333:4: enumLiteral_9= HalfwidthHangulFillerHalfwidthHangulFillerHalfwidthHangulFiller
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
        // InternalDdParser.g:1061:4: ( ruleRangeExpression )
        // InternalDdParser.g:1061:5: ruleRangeExpression
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
        // InternalDdParser.g:1073:4: ( ruleAddExpression )
        // InternalDdParser.g:1073:5: ruleAddExpression
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
        // InternalDdParser.g:1085:4: ( ruleMultExpression )
        // InternalDdParser.g:1085:5: ruleMultExpression
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
        // InternalDdParser.g:1097:4: ( ruleAndExpression )
        // InternalDdParser.g:1097:5: ruleAndExpression
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
        // InternalDdParser.g:1109:4: ( ruleOrExpression )
        // InternalDdParser.g:1109:5: ruleOrExpression
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
        // InternalDdParser.g:1121:4: ( ruleCatExpression )
        // InternalDdParser.g:1121:5: ruleCatExpression
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
        // InternalDdParser.g:1133:4: ( ruleListExpression )
        // InternalDdParser.g:1133:5: ruleListExpression
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
    protected DFA22 dfa22 = new DFA22(this);
    static final String dfa_1s = "\5\uffff";
    static final String dfa_2s = "\1\2\4\uffff";
    static final String dfa_3s = "\1\7\1\64\2\uffff\1\7";
    static final String dfa_4s = "\1\110\1\64\2\uffff\1\110";
    static final String dfa_5s = "\2\uffff\1\2\1\1\1\uffff";
    static final String dfa_6s = "\5\uffff}>";
    static final String[] dfa_7s = {
            "\1\3\1\uffff\3\3\2\uffff\1\3\2\uffff\3\3\3\uffff\2\3\57\uffff\1\1",
            "\1\4",
            "",
            "",
            "\1\3\1\uffff\3\3\2\uffff\1\3\2\uffff\3\3\3\uffff\2\3\47\uffff\1\2\1\uffff\1\2\5\uffff\1\1"
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
    static final String dfa_8s = "\1\110\1\64\1\uffff\1\100\1\uffff";
    static final String dfa_9s = "\1\110\1\64\1\uffff\1\110\1\uffff";
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
    static final String dfa_12s = "\35\uffff";
    static final String dfa_13s = "\1\4\1\0\33\uffff";
    static final String dfa_14s = "\1\105\1\0\33\uffff";
    static final String dfa_15s = "\2\uffff\1\11\10\uffff\1\12\7\uffff\1\13\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10";
    static final String dfa_16s = "\1\uffff\1\0\33\uffff}>";
    static final String[] dfa_17s = {
            "\1\13\2\uffff\1\2\1\13\2\uffff\1\2\2\uffff\1\2\1\13\2\uffff\2\2\1\uffff\3\2\13\uffff\1\1\4\uffff\1\2\23\uffff\2\13\3\uffff\1\13\2\23\2\13",
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

    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final char[] dfa_13 = DFA.unpackEncodedStringToUnsignedChars(dfa_13s);
    static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final short[][] dfa_17 = unpackEncodedStringArray(dfa_17s);

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = dfa_12;
            this.eof = dfa_12;
            this.min = dfa_13;
            this.max = dfa_14;
            this.accept = dfa_15;
            this.special = dfa_16;
            this.transition = dfa_17;
        }
        public String getDescription() {
            return "1059:2: ( ( ( ruleRangeExpression )=>this_RangeExpression_0= ruleRangeExpression ) | ( ( ruleAddExpression )=>this_AddExpression_1= ruleAddExpression ) | ( ( ruleMultExpression )=>this_MultExpression_2= ruleMultExpression ) | ( ( ruleAndExpression )=>this_AndExpression_3= ruleAndExpression ) | ( ( ruleOrExpression )=>this_OrExpression_4= ruleOrExpression ) | ( ( ruleCatExpression )=>this_CatExpression_5= ruleCatExpression ) | ( ( ruleListExpression )=>this_ListExpression_6= ruleListExpression ) | this_BinaryExpression_7= ruleBinaryExpression | this_UnaryExpression_8= ruleUnaryExpression | this_TerminalExpression_9= ruleTerminalExpression | this_IdentifierExpression_10= ruleIdentifierExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA22_1 = input.LA(1);

                         
                        int index22_1 = input.index();
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

                         
                        input.seek(index22_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 22, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L,0x0000000000000100L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000018E4EA2L,0x0000000000000100L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000022L,0x0000000000000100L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000018E4EA0L,0x0000000000000100L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000800800000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x3000010800ECC990L,0x000000000000003EL});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000020L,0x0000000000000104L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000080004000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00080008018E4EA0L,0x0000000000000100L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0008000800000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000800800000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000200100100000L,0x0000000000000100L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100100000L,0x0000000000000100L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000100000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000009000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000020L,0x0000000000000101L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0008000000000020L,0x0000000000000100L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000020L,0x0000000000000108L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00025566FA013040L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000014000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000005000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000001000010000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000001080000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000001400000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000020000000000L});

}