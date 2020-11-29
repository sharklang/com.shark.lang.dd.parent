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
    // InternalDdParser.g:65:1: ruleDataModelFragment returns [EObject current=null] : ( ( (lv_constants_0_0= ruleConstant ) )* ( (lv_entities_1_0= ruleEntity ) )* ( (lv_constraints_2_0= ruleConstraint ) )* ) ;
    public final EObject ruleDataModelFragment() throws RecognitionException {
        EObject current = null;

        EObject lv_constants_0_0 = null;

        EObject lv_entities_1_0 = null;

        EObject lv_constraints_2_0 = null;



        	enterRule();

        try {
            // InternalDdParser.g:71:2: ( ( ( (lv_constants_0_0= ruleConstant ) )* ( (lv_entities_1_0= ruleEntity ) )* ( (lv_constraints_2_0= ruleConstraint ) )* ) )
            // InternalDdParser.g:72:2: ( ( (lv_constants_0_0= ruleConstant ) )* ( (lv_entities_1_0= ruleEntity ) )* ( (lv_constraints_2_0= ruleConstraint ) )* )
            {
            // InternalDdParser.g:72:2: ( ( (lv_constants_0_0= ruleConstant ) )* ( (lv_entities_1_0= ruleEntity ) )* ( (lv_constraints_2_0= ruleConstraint ) )* )
            // InternalDdParser.g:73:3: ( (lv_constants_0_0= ruleConstant ) )* ( (lv_entities_1_0= ruleEntity ) )* ( (lv_constraints_2_0= ruleConstraint ) )*
            {
            // InternalDdParser.g:73:3: ( (lv_constants_0_0= ruleConstant ) )*
            loop1:
            do {
                int alt1=2;
                alt1 = dfa1.predict(input);
                switch (alt1) {
            	case 1 :
            	    // InternalDdParser.g:74:4: (lv_constants_0_0= ruleConstant )
            	    {
            	    // InternalDdParser.g:74:4: (lv_constants_0_0= ruleConstant )
            	    // InternalDdParser.g:75:5: lv_constants_0_0= ruleConstant
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDataModelFragmentAccess().getConstantsConstantParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_constants_0_0=ruleConstant();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDataModelFragmentRule());
            	      					}
            	      					add(
            	      						current,
            	      						"constants",
            	      						lv_constants_0_0,
            	      						"com.shark.lang.Dd.Constant");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalDdParser.g:92:3: ( (lv_entities_1_0= ruleEntity ) )*
            loop2:
            do {
                int alt2=2;
                alt2 = dfa2.predict(input);
                switch (alt2) {
            	case 1 :
            	    // InternalDdParser.g:93:4: (lv_entities_1_0= ruleEntity )
            	    {
            	    // InternalDdParser.g:93:4: (lv_entities_1_0= ruleEntity )
            	    // InternalDdParser.g:94:5: lv_entities_1_0= ruleEntity
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDataModelFragmentAccess().getEntitiesEntityParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_entities_1_0=ruleEntity();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDataModelFragmentRule());
            	      					}
            	      					add(
            	      						current,
            	      						"entities",
            	      						lv_entities_1_0,
            	      						"com.shark.lang.Dd.Entity");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalDdParser.g:111:3: ( (lv_constraints_2_0= ruleConstraint ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_CMT) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDdParser.g:112:4: (lv_constraints_2_0= ruleConstraint )
            	    {
            	    // InternalDdParser.g:112:4: (lv_constraints_2_0= ruleConstraint )
            	    // InternalDdParser.g:113:5: lv_constraints_2_0= ruleConstraint
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDataModelFragmentAccess().getConstraintsConstraintParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_constraints_2_0=ruleConstraint();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDataModelFragmentRule());
            	      					}
            	      					add(
            	      						current,
            	      						"constraints",
            	      						lv_constraints_2_0,
            	      						"com.shark.lang.Dd.Constraint");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // InternalDdParser.g:134:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // InternalDdParser.g:134:49: (iv_ruleConstant= ruleConstant EOF )
            // InternalDdParser.g:135:2: iv_ruleConstant= ruleConstant EOF
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
    // InternalDdParser.g:141:1: ruleConstant returns [EObject current=null] : ( ( (lv_extraAttrDesc_0_0= ruleLineComment ) )* ( (lv_dataType_1_0= ruleDataType ) ) ( (lv_attributeSize_2_0= ruleAttributeSize ) )? ( (lv_arraySize_3_0= ruleArraySize ) )? ( (lv_name_4_0= RULE_CSTID ) ) (otherlv_5= EqualsSign ( (lv_defaultValue_6_0= ruleSharkExpression ) ) ) ( (lv_attrDesc_7_0= ruleTrailComment ) ) this_EOL_8= RULE_EOL ) ;
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
            // InternalDdParser.g:147:2: ( ( ( (lv_extraAttrDesc_0_0= ruleLineComment ) )* ( (lv_dataType_1_0= ruleDataType ) ) ( (lv_attributeSize_2_0= ruleAttributeSize ) )? ( (lv_arraySize_3_0= ruleArraySize ) )? ( (lv_name_4_0= RULE_CSTID ) ) (otherlv_5= EqualsSign ( (lv_defaultValue_6_0= ruleSharkExpression ) ) ) ( (lv_attrDesc_7_0= ruleTrailComment ) ) this_EOL_8= RULE_EOL ) )
            // InternalDdParser.g:148:2: ( ( (lv_extraAttrDesc_0_0= ruleLineComment ) )* ( (lv_dataType_1_0= ruleDataType ) ) ( (lv_attributeSize_2_0= ruleAttributeSize ) )? ( (lv_arraySize_3_0= ruleArraySize ) )? ( (lv_name_4_0= RULE_CSTID ) ) (otherlv_5= EqualsSign ( (lv_defaultValue_6_0= ruleSharkExpression ) ) ) ( (lv_attrDesc_7_0= ruleTrailComment ) ) this_EOL_8= RULE_EOL )
            {
            // InternalDdParser.g:148:2: ( ( (lv_extraAttrDesc_0_0= ruleLineComment ) )* ( (lv_dataType_1_0= ruleDataType ) ) ( (lv_attributeSize_2_0= ruleAttributeSize ) )? ( (lv_arraySize_3_0= ruleArraySize ) )? ( (lv_name_4_0= RULE_CSTID ) ) (otherlv_5= EqualsSign ( (lv_defaultValue_6_0= ruleSharkExpression ) ) ) ( (lv_attrDesc_7_0= ruleTrailComment ) ) this_EOL_8= RULE_EOL )
            // InternalDdParser.g:149:3: ( (lv_extraAttrDesc_0_0= ruleLineComment ) )* ( (lv_dataType_1_0= ruleDataType ) ) ( (lv_attributeSize_2_0= ruleAttributeSize ) )? ( (lv_arraySize_3_0= ruleArraySize ) )? ( (lv_name_4_0= RULE_CSTID ) ) (otherlv_5= EqualsSign ( (lv_defaultValue_6_0= ruleSharkExpression ) ) ) ( (lv_attrDesc_7_0= ruleTrailComment ) ) this_EOL_8= RULE_EOL
            {
            // InternalDdParser.g:149:3: ( (lv_extraAttrDesc_0_0= ruleLineComment ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_CMT) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDdParser.g:150:4: (lv_extraAttrDesc_0_0= ruleLineComment )
            	    {
            	    // InternalDdParser.g:150:4: (lv_extraAttrDesc_0_0= ruleLineComment )
            	    // InternalDdParser.g:151:5: lv_extraAttrDesc_0_0= ruleLineComment
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getConstantAccess().getExtraAttrDescLineCommentParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_5);
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
            	    break loop4;
                }
            } while (true);

            // InternalDdParser.g:168:3: ( (lv_dataType_1_0= ruleDataType ) )
            // InternalDdParser.g:169:4: (lv_dataType_1_0= ruleDataType )
            {
            // InternalDdParser.g:169:4: (lv_dataType_1_0= ruleDataType )
            // InternalDdParser.g:170:5: lv_dataType_1_0= ruleDataType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConstantAccess().getDataTypeDataTypeEnumRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_6);
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

            // InternalDdParser.g:187:3: ( (lv_attributeSize_2_0= ruleAttributeSize ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==LeftParenthesis) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalDdParser.g:188:4: (lv_attributeSize_2_0= ruleAttributeSize )
                    {
                    // InternalDdParser.g:188:4: (lv_attributeSize_2_0= ruleAttributeSize )
                    // InternalDdParser.g:189:5: lv_attributeSize_2_0= ruleAttributeSize
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getConstantAccess().getAttributeSizeAttributeSizeParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_7);
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

            // InternalDdParser.g:206:3: ( (lv_arraySize_3_0= ruleArraySize ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==LeftSquareBracket) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDdParser.g:207:4: (lv_arraySize_3_0= ruleArraySize )
                    {
                    // InternalDdParser.g:207:4: (lv_arraySize_3_0= ruleArraySize )
                    // InternalDdParser.g:208:5: lv_arraySize_3_0= ruleArraySize
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getConstantAccess().getArraySizeArraySizeParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_8);
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

            // InternalDdParser.g:225:3: ( (lv_name_4_0= RULE_CSTID ) )
            // InternalDdParser.g:226:4: (lv_name_4_0= RULE_CSTID )
            {
            // InternalDdParser.g:226:4: (lv_name_4_0= RULE_CSTID )
            // InternalDdParser.g:227:5: lv_name_4_0= RULE_CSTID
            {
            lv_name_4_0=(Token)match(input,RULE_CSTID,FOLLOW_9); if (state.failed) return current;
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

            // InternalDdParser.g:243:3: (otherlv_5= EqualsSign ( (lv_defaultValue_6_0= ruleSharkExpression ) ) )
            // InternalDdParser.g:244:4: otherlv_5= EqualsSign ( (lv_defaultValue_6_0= ruleSharkExpression ) )
            {
            otherlv_5=(Token)match(input,EqualsSign,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_5, grammarAccess.getConstantAccess().getEqualsSignKeyword_5_0());
              			
            }
            // InternalDdParser.g:248:4: ( (lv_defaultValue_6_0= ruleSharkExpression ) )
            // InternalDdParser.g:249:5: (lv_defaultValue_6_0= ruleSharkExpression )
            {
            // InternalDdParser.g:249:5: (lv_defaultValue_6_0= ruleSharkExpression )
            // InternalDdParser.g:250:6: lv_defaultValue_6_0= ruleSharkExpression
            {
            if ( state.backtracking==0 ) {

              						newCompositeNode(grammarAccess.getConstantAccess().getDefaultValueSharkExpressionParserRuleCall_5_1_0());
              					
            }
            pushFollow(FOLLOW_11);
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

            // InternalDdParser.g:268:3: ( (lv_attrDesc_7_0= ruleTrailComment ) )
            // InternalDdParser.g:269:4: (lv_attrDesc_7_0= ruleTrailComment )
            {
            // InternalDdParser.g:269:4: (lv_attrDesc_7_0= ruleTrailComment )
            // InternalDdParser.g:270:5: lv_attrDesc_7_0= ruleTrailComment
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConstantAccess().getAttrDescTrailCommentParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_12);
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
    // InternalDdParser.g:295:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalDdParser.g:295:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalDdParser.g:296:2: iv_ruleEntity= ruleEntity EOF
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
    // InternalDdParser.g:302:1: ruleEntity returns [EObject current=null] : ( ( (lv_entityDescLines_0_0= ruleLineComment ) )+ ( (lv_name_1_0= RULE_OBJID ) ) (otherlv_2= HyphenMinusGreaterThanSign ( (otherlv_3= RULE_ID ) ) )? otherlv_4= Colon this_BEGIN_5= RULE_BEGIN ( (lv_attributes_6_0= ruleAttribute ) )+ ( (lv_relationships_7_0= ruleRelationship ) )* this_END_8= RULE_END ) ;
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
            // InternalDdParser.g:308:2: ( ( ( (lv_entityDescLines_0_0= ruleLineComment ) )+ ( (lv_name_1_0= RULE_OBJID ) ) (otherlv_2= HyphenMinusGreaterThanSign ( (otherlv_3= RULE_ID ) ) )? otherlv_4= Colon this_BEGIN_5= RULE_BEGIN ( (lv_attributes_6_0= ruleAttribute ) )+ ( (lv_relationships_7_0= ruleRelationship ) )* this_END_8= RULE_END ) )
            // InternalDdParser.g:309:2: ( ( (lv_entityDescLines_0_0= ruleLineComment ) )+ ( (lv_name_1_0= RULE_OBJID ) ) (otherlv_2= HyphenMinusGreaterThanSign ( (otherlv_3= RULE_ID ) ) )? otherlv_4= Colon this_BEGIN_5= RULE_BEGIN ( (lv_attributes_6_0= ruleAttribute ) )+ ( (lv_relationships_7_0= ruleRelationship ) )* this_END_8= RULE_END )
            {
            // InternalDdParser.g:309:2: ( ( (lv_entityDescLines_0_0= ruleLineComment ) )+ ( (lv_name_1_0= RULE_OBJID ) ) (otherlv_2= HyphenMinusGreaterThanSign ( (otherlv_3= RULE_ID ) ) )? otherlv_4= Colon this_BEGIN_5= RULE_BEGIN ( (lv_attributes_6_0= ruleAttribute ) )+ ( (lv_relationships_7_0= ruleRelationship ) )* this_END_8= RULE_END )
            // InternalDdParser.g:310:3: ( (lv_entityDescLines_0_0= ruleLineComment ) )+ ( (lv_name_1_0= RULE_OBJID ) ) (otherlv_2= HyphenMinusGreaterThanSign ( (otherlv_3= RULE_ID ) ) )? otherlv_4= Colon this_BEGIN_5= RULE_BEGIN ( (lv_attributes_6_0= ruleAttribute ) )+ ( (lv_relationships_7_0= ruleRelationship ) )* this_END_8= RULE_END
            {
            // InternalDdParser.g:310:3: ( (lv_entityDescLines_0_0= ruleLineComment ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_CMT) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDdParser.g:311:4: (lv_entityDescLines_0_0= ruleLineComment )
            	    {
            	    // InternalDdParser.g:311:4: (lv_entityDescLines_0_0= ruleLineComment )
            	    // InternalDdParser.g:312:5: lv_entityDescLines_0_0= ruleLineComment
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getEntityAccess().getEntityDescLinesLineCommentParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_13);
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
            	    if ( cnt7 >= 1 ) break loop7;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            // InternalDdParser.g:329:3: ( (lv_name_1_0= RULE_OBJID ) )
            // InternalDdParser.g:330:4: (lv_name_1_0= RULE_OBJID )
            {
            // InternalDdParser.g:330:4: (lv_name_1_0= RULE_OBJID )
            // InternalDdParser.g:331:5: lv_name_1_0= RULE_OBJID
            {
            lv_name_1_0=(Token)match(input,RULE_OBJID,FOLLOW_14); if (state.failed) return current;
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

            // InternalDdParser.g:347:3: (otherlv_2= HyphenMinusGreaterThanSign ( (otherlv_3= RULE_ID ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==HyphenMinusGreaterThanSign) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDdParser.g:348:4: otherlv_2= HyphenMinusGreaterThanSign ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,HyphenMinusGreaterThanSign,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getHyphenMinusGreaterThanSignKeyword_2_0());
                      			
                    }
                    // InternalDdParser.g:352:4: ( (otherlv_3= RULE_ID ) )
                    // InternalDdParser.g:353:5: (otherlv_3= RULE_ID )
                    {
                    // InternalDdParser.g:353:5: (otherlv_3= RULE_ID )
                    // InternalDdParser.g:354:6: otherlv_3= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getEntityRule());
                      						}
                      					
                    }
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getExtendsEntityCrossReference_2_1_0());
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,Colon,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getColonKeyword_3());
              		
            }
            this_BEGIN_5=(Token)match(input,RULE_BEGIN,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_BEGIN_5, grammarAccess.getEntityAccess().getBEGINTerminalRuleCall_4());
              		
            }
            // InternalDdParser.g:374:3: ( (lv_attributes_6_0= ruleAttribute ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==Stamp||(LA9_0>=Bits && LA9_0<=Date)||LA9_0==Time||(LA9_0>=Chr && LA9_0<=Int)||(LA9_0>=Str && LA9_0<=HalfwidthHangulFillerHalfwidthHangulFillerHalfwidthHangulFiller)||LA9_0==RULE_CMT) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDdParser.g:375:4: (lv_attributes_6_0= ruleAttribute )
            	    {
            	    // InternalDdParser.g:375:4: (lv_attributes_6_0= ruleAttribute )
            	    // InternalDdParser.g:376:5: lv_attributes_6_0= ruleAttribute
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_19);
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
            	    if ( cnt9 >= 1 ) break loop9;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            // InternalDdParser.g:393:3: ( (lv_relationships_7_0= ruleRelationship ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==LeftParenthesis) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDdParser.g:394:4: (lv_relationships_7_0= ruleRelationship )
            	    {
            	    // InternalDdParser.g:394:4: (lv_relationships_7_0= ruleRelationship )
            	    // InternalDdParser.g:395:5: lv_relationships_7_0= ruleRelationship
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getEntityAccess().getRelationshipsRelationshipParserRuleCall_6_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_20);
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
            	    break loop10;
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
    // InternalDdParser.g:420:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalDdParser.g:420:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalDdParser.g:421:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalDdParser.g:427:1: ruleAttribute returns [EObject current=null] : ( ( (lv_extraAttrDesc_0_0= ruleLineComment ) )* ( (lv_dataType_1_0= ruleDataType ) ) ( (lv_attributeSize_2_0= ruleAttributeSize ) )? ( (lv_arraySize_3_0= ruleArraySize ) )? ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= EqualsSign ( (lv_defaultValue_6_0= ruleSharkExpression ) ) )? ( (lv_primaryKey_7_0= Pk ) )? ( (lv_mandatory_8_0= ExclamationMark ) )? ( (lv_attrDesc_9_0= ruleTrailComment ) ) this_EOL_10= RULE_EOL ) ;
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
            // InternalDdParser.g:433:2: ( ( ( (lv_extraAttrDesc_0_0= ruleLineComment ) )* ( (lv_dataType_1_0= ruleDataType ) ) ( (lv_attributeSize_2_0= ruleAttributeSize ) )? ( (lv_arraySize_3_0= ruleArraySize ) )? ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= EqualsSign ( (lv_defaultValue_6_0= ruleSharkExpression ) ) )? ( (lv_primaryKey_7_0= Pk ) )? ( (lv_mandatory_8_0= ExclamationMark ) )? ( (lv_attrDesc_9_0= ruleTrailComment ) ) this_EOL_10= RULE_EOL ) )
            // InternalDdParser.g:434:2: ( ( (lv_extraAttrDesc_0_0= ruleLineComment ) )* ( (lv_dataType_1_0= ruleDataType ) ) ( (lv_attributeSize_2_0= ruleAttributeSize ) )? ( (lv_arraySize_3_0= ruleArraySize ) )? ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= EqualsSign ( (lv_defaultValue_6_0= ruleSharkExpression ) ) )? ( (lv_primaryKey_7_0= Pk ) )? ( (lv_mandatory_8_0= ExclamationMark ) )? ( (lv_attrDesc_9_0= ruleTrailComment ) ) this_EOL_10= RULE_EOL )
            {
            // InternalDdParser.g:434:2: ( ( (lv_extraAttrDesc_0_0= ruleLineComment ) )* ( (lv_dataType_1_0= ruleDataType ) ) ( (lv_attributeSize_2_0= ruleAttributeSize ) )? ( (lv_arraySize_3_0= ruleArraySize ) )? ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= EqualsSign ( (lv_defaultValue_6_0= ruleSharkExpression ) ) )? ( (lv_primaryKey_7_0= Pk ) )? ( (lv_mandatory_8_0= ExclamationMark ) )? ( (lv_attrDesc_9_0= ruleTrailComment ) ) this_EOL_10= RULE_EOL )
            // InternalDdParser.g:435:3: ( (lv_extraAttrDesc_0_0= ruleLineComment ) )* ( (lv_dataType_1_0= ruleDataType ) ) ( (lv_attributeSize_2_0= ruleAttributeSize ) )? ( (lv_arraySize_3_0= ruleArraySize ) )? ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= EqualsSign ( (lv_defaultValue_6_0= ruleSharkExpression ) ) )? ( (lv_primaryKey_7_0= Pk ) )? ( (lv_mandatory_8_0= ExclamationMark ) )? ( (lv_attrDesc_9_0= ruleTrailComment ) ) this_EOL_10= RULE_EOL
            {
            // InternalDdParser.g:435:3: ( (lv_extraAttrDesc_0_0= ruleLineComment ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_CMT) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDdParser.g:436:4: (lv_extraAttrDesc_0_0= ruleLineComment )
            	    {
            	    // InternalDdParser.g:436:4: (lv_extraAttrDesc_0_0= ruleLineComment )
            	    // InternalDdParser.g:437:5: lv_extraAttrDesc_0_0= ruleLineComment
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getAttributeAccess().getExtraAttrDescLineCommentParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_18);
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
            	    break loop11;
                }
            } while (true);

            // InternalDdParser.g:454:3: ( (lv_dataType_1_0= ruleDataType ) )
            // InternalDdParser.g:455:4: (lv_dataType_1_0= ruleDataType )
            {
            // InternalDdParser.g:455:4: (lv_dataType_1_0= ruleDataType )
            // InternalDdParser.g:456:5: lv_dataType_1_0= ruleDataType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAttributeAccess().getDataTypeDataTypeEnumRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_21);
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

            // InternalDdParser.g:473:3: ( (lv_attributeSize_2_0= ruleAttributeSize ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==LeftParenthesis) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDdParser.g:474:4: (lv_attributeSize_2_0= ruleAttributeSize )
                    {
                    // InternalDdParser.g:474:4: (lv_attributeSize_2_0= ruleAttributeSize )
                    // InternalDdParser.g:475:5: lv_attributeSize_2_0= ruleAttributeSize
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getAttributeAccess().getAttributeSizeAttributeSizeParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_22);
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

            // InternalDdParser.g:492:3: ( (lv_arraySize_3_0= ruleArraySize ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==LeftSquareBracket) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDdParser.g:493:4: (lv_arraySize_3_0= ruleArraySize )
                    {
                    // InternalDdParser.g:493:4: (lv_arraySize_3_0= ruleArraySize )
                    // InternalDdParser.g:494:5: lv_arraySize_3_0= ruleArraySize
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getAttributeAccess().getArraySizeArraySizeParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_15);
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

            // InternalDdParser.g:511:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalDdParser.g:512:4: (lv_name_4_0= RULE_ID )
            {
            // InternalDdParser.g:512:4: (lv_name_4_0= RULE_ID )
            // InternalDdParser.g:513:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_23); if (state.failed) return current;
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

            // InternalDdParser.g:529:3: (otherlv_5= EqualsSign ( (lv_defaultValue_6_0= ruleSharkExpression ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==EqualsSign) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDdParser.g:530:4: otherlv_5= EqualsSign ( (lv_defaultValue_6_0= ruleSharkExpression ) )
                    {
                    otherlv_5=(Token)match(input,EqualsSign,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getAttributeAccess().getEqualsSignKeyword_5_0());
                      			
                    }
                    // InternalDdParser.g:534:4: ( (lv_defaultValue_6_0= ruleSharkExpression ) )
                    // InternalDdParser.g:535:5: (lv_defaultValue_6_0= ruleSharkExpression )
                    {
                    // InternalDdParser.g:535:5: (lv_defaultValue_6_0= ruleSharkExpression )
                    // InternalDdParser.g:536:6: lv_defaultValue_6_0= ruleSharkExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAttributeAccess().getDefaultValueSharkExpressionParserRuleCall_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_24);
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

            // InternalDdParser.g:554:3: ( (lv_primaryKey_7_0= Pk ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==Pk) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDdParser.g:555:4: (lv_primaryKey_7_0= Pk )
                    {
                    // InternalDdParser.g:555:4: (lv_primaryKey_7_0= Pk )
                    // InternalDdParser.g:556:5: lv_primaryKey_7_0= Pk
                    {
                    lv_primaryKey_7_0=(Token)match(input,Pk,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_primaryKey_7_0, grammarAccess.getAttributeAccess().getPrimaryKeyPkKeyword_6_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getAttributeRule());
                      					}
                      					setWithLastConsumed(current, "primaryKey", lv_primaryKey_7_0 != null, "pk");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDdParser.g:568:3: ( (lv_mandatory_8_0= ExclamationMark ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==ExclamationMark) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalDdParser.g:569:4: (lv_mandatory_8_0= ExclamationMark )
                    {
                    // InternalDdParser.g:569:4: (lv_mandatory_8_0= ExclamationMark )
                    // InternalDdParser.g:570:5: lv_mandatory_8_0= ExclamationMark
                    {
                    lv_mandatory_8_0=(Token)match(input,ExclamationMark,FOLLOW_11); if (state.failed) return current;
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

            // InternalDdParser.g:582:3: ( (lv_attrDesc_9_0= ruleTrailComment ) )
            // InternalDdParser.g:583:4: (lv_attrDesc_9_0= ruleTrailComment )
            {
            // InternalDdParser.g:583:4: (lv_attrDesc_9_0= ruleTrailComment )
            // InternalDdParser.g:584:5: lv_attrDesc_9_0= ruleTrailComment
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAttributeAccess().getAttrDescTrailCommentParserRuleCall_8_0());
              				
            }
            pushFollow(FOLLOW_12);
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
    // InternalDdParser.g:609:1: entryRuleAttributeSize returns [EObject current=null] : iv_ruleAttributeSize= ruleAttributeSize EOF ;
    public final EObject entryRuleAttributeSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeSize = null;


        try {
            // InternalDdParser.g:609:54: (iv_ruleAttributeSize= ruleAttributeSize EOF )
            // InternalDdParser.g:610:2: iv_ruleAttributeSize= ruleAttributeSize EOF
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
    // InternalDdParser.g:616:1: ruleAttributeSize returns [EObject current=null] : (otherlv_0= LeftParenthesis ( (lv_length_1_0= RULE_INT ) ) (otherlv_2= Comma ( (lv_precision_3_0= RULE_INT ) ) )? otherlv_4= RightParenthesis ) ;
    public final EObject ruleAttributeSize() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_length_1_0=null;
        Token otherlv_2=null;
        Token lv_precision_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalDdParser.g:622:2: ( (otherlv_0= LeftParenthesis ( (lv_length_1_0= RULE_INT ) ) (otherlv_2= Comma ( (lv_precision_3_0= RULE_INT ) ) )? otherlv_4= RightParenthesis ) )
            // InternalDdParser.g:623:2: (otherlv_0= LeftParenthesis ( (lv_length_1_0= RULE_INT ) ) (otherlv_2= Comma ( (lv_precision_3_0= RULE_INT ) ) )? otherlv_4= RightParenthesis )
            {
            // InternalDdParser.g:623:2: (otherlv_0= LeftParenthesis ( (lv_length_1_0= RULE_INT ) ) (otherlv_2= Comma ( (lv_precision_3_0= RULE_INT ) ) )? otherlv_4= RightParenthesis )
            // InternalDdParser.g:624:3: otherlv_0= LeftParenthesis ( (lv_length_1_0= RULE_INT ) ) (otherlv_2= Comma ( (lv_precision_3_0= RULE_INT ) ) )? otherlv_4= RightParenthesis
            {
            otherlv_0=(Token)match(input,LeftParenthesis,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAttributeSizeAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalDdParser.g:628:3: ( (lv_length_1_0= RULE_INT ) )
            // InternalDdParser.g:629:4: (lv_length_1_0= RULE_INT )
            {
            // InternalDdParser.g:629:4: (lv_length_1_0= RULE_INT )
            // InternalDdParser.g:630:5: lv_length_1_0= RULE_INT
            {
            lv_length_1_0=(Token)match(input,RULE_INT,FOLLOW_27); if (state.failed) return current;
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

            // InternalDdParser.g:646:3: (otherlv_2= Comma ( (lv_precision_3_0= RULE_INT ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==Comma) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalDdParser.g:647:4: otherlv_2= Comma ( (lv_precision_3_0= RULE_INT ) )
                    {
                    otherlv_2=(Token)match(input,Comma,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getAttributeSizeAccess().getCommaKeyword_2_0());
                      			
                    }
                    // InternalDdParser.g:651:4: ( (lv_precision_3_0= RULE_INT ) )
                    // InternalDdParser.g:652:5: (lv_precision_3_0= RULE_INT )
                    {
                    // InternalDdParser.g:652:5: (lv_precision_3_0= RULE_INT )
                    // InternalDdParser.g:653:6: lv_precision_3_0= RULE_INT
                    {
                    lv_precision_3_0=(Token)match(input,RULE_INT,FOLLOW_28); if (state.failed) return current;
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
    // InternalDdParser.g:678:1: entryRuleArraySize returns [EObject current=null] : iv_ruleArraySize= ruleArraySize EOF ;
    public final EObject entryRuleArraySize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArraySize = null;


        try {
            // InternalDdParser.g:678:50: (iv_ruleArraySize= ruleArraySize EOF )
            // InternalDdParser.g:679:2: iv_ruleArraySize= ruleArraySize EOF
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
    // InternalDdParser.g:685:1: ruleArraySize returns [EObject current=null] : (otherlv_0= LeftSquareBracket ( (lv_size_1_0= RULE_INT ) ) otherlv_2= RightSquareBracket ) ;
    public final EObject ruleArraySize() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_size_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalDdParser.g:691:2: ( (otherlv_0= LeftSquareBracket ( (lv_size_1_0= RULE_INT ) ) otherlv_2= RightSquareBracket ) )
            // InternalDdParser.g:692:2: (otherlv_0= LeftSquareBracket ( (lv_size_1_0= RULE_INT ) ) otherlv_2= RightSquareBracket )
            {
            // InternalDdParser.g:692:2: (otherlv_0= LeftSquareBracket ( (lv_size_1_0= RULE_INT ) ) otherlv_2= RightSquareBracket )
            // InternalDdParser.g:693:3: otherlv_0= LeftSquareBracket ( (lv_size_1_0= RULE_INT ) ) otherlv_2= RightSquareBracket
            {
            otherlv_0=(Token)match(input,LeftSquareBracket,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getArraySizeAccess().getLeftSquareBracketKeyword_0());
              		
            }
            // InternalDdParser.g:697:3: ( (lv_size_1_0= RULE_INT ) )
            // InternalDdParser.g:698:4: (lv_size_1_0= RULE_INT )
            {
            // InternalDdParser.g:698:4: (lv_size_1_0= RULE_INT )
            // InternalDdParser.g:699:5: lv_size_1_0= RULE_INT
            {
            lv_size_1_0=(Token)match(input,RULE_INT,FOLLOW_29); if (state.failed) return current;
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
    // InternalDdParser.g:723:1: entryRuleRelationship returns [EObject current=null] : iv_ruleRelationship= ruleRelationship EOF ;
    public final EObject entryRuleRelationship() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationship = null;


        try {
            // InternalDdParser.g:723:53: (iv_ruleRelationship= ruleRelationship EOF )
            // InternalDdParser.g:724:2: iv_ruleRelationship= ruleRelationship EOF
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
    // InternalDdParser.g:730:1: ruleRelationship returns [EObject current=null] : ( ( (lv_cardi1_0_0= ruleRangeExpression ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_cardi2_2_0= ruleRangeExpression ) ) ( (otherlv_3= RULE_OBJID ) ) ( (lv_relDesc_4_0= ruleTrailComment ) ) this_EOL_5= RULE_EOL ) ;
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
            // InternalDdParser.g:736:2: ( ( ( (lv_cardi1_0_0= ruleRangeExpression ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_cardi2_2_0= ruleRangeExpression ) ) ( (otherlv_3= RULE_OBJID ) ) ( (lv_relDesc_4_0= ruleTrailComment ) ) this_EOL_5= RULE_EOL ) )
            // InternalDdParser.g:737:2: ( ( (lv_cardi1_0_0= ruleRangeExpression ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_cardi2_2_0= ruleRangeExpression ) ) ( (otherlv_3= RULE_OBJID ) ) ( (lv_relDesc_4_0= ruleTrailComment ) ) this_EOL_5= RULE_EOL )
            {
            // InternalDdParser.g:737:2: ( ( (lv_cardi1_0_0= ruleRangeExpression ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_cardi2_2_0= ruleRangeExpression ) ) ( (otherlv_3= RULE_OBJID ) ) ( (lv_relDesc_4_0= ruleTrailComment ) ) this_EOL_5= RULE_EOL )
            // InternalDdParser.g:738:3: ( (lv_cardi1_0_0= ruleRangeExpression ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_cardi2_2_0= ruleRangeExpression ) ) ( (otherlv_3= RULE_OBJID ) ) ( (lv_relDesc_4_0= ruleTrailComment ) ) this_EOL_5= RULE_EOL
            {
            // InternalDdParser.g:738:3: ( (lv_cardi1_0_0= ruleRangeExpression ) )
            // InternalDdParser.g:739:4: (lv_cardi1_0_0= ruleRangeExpression )
            {
            // InternalDdParser.g:739:4: (lv_cardi1_0_0= ruleRangeExpression )
            // InternalDdParser.g:740:5: lv_cardi1_0_0= ruleRangeExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRelationshipAccess().getCardi1RangeExpressionParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_15);
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

            // InternalDdParser.g:757:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDdParser.g:758:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDdParser.g:758:4: (lv_name_1_0= RULE_ID )
            // InternalDdParser.g:759:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_30); if (state.failed) return current;
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

            // InternalDdParser.g:775:3: ( (lv_cardi2_2_0= ruleRangeExpression ) )
            // InternalDdParser.g:776:4: (lv_cardi2_2_0= ruleRangeExpression )
            {
            // InternalDdParser.g:776:4: (lv_cardi2_2_0= ruleRangeExpression )
            // InternalDdParser.g:777:5: lv_cardi2_2_0= ruleRangeExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRelationshipAccess().getCardi2RangeExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_31);
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

            // InternalDdParser.g:794:3: ( (otherlv_3= RULE_OBJID ) )
            // InternalDdParser.g:795:4: (otherlv_3= RULE_OBJID )
            {
            // InternalDdParser.g:795:4: (otherlv_3= RULE_OBJID )
            // InternalDdParser.g:796:5: otherlv_3= RULE_OBJID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRelationshipRule());
              					}
              				
            }
            otherlv_3=(Token)match(input,RULE_OBJID,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_3, grammarAccess.getRelationshipAccess().getLinkToEntityCrossReference_3_0());
              				
            }

            }


            }

            // InternalDdParser.g:807:3: ( (lv_relDesc_4_0= ruleTrailComment ) )
            // InternalDdParser.g:808:4: (lv_relDesc_4_0= ruleTrailComment )
            {
            // InternalDdParser.g:808:4: (lv_relDesc_4_0= ruleTrailComment )
            // InternalDdParser.g:809:5: lv_relDesc_4_0= ruleTrailComment
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRelationshipAccess().getRelDescTrailCommentParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_12);
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
    // InternalDdParser.g:834:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // InternalDdParser.g:834:51: (iv_ruleConstraint= ruleConstraint EOF )
            // InternalDdParser.g:835:2: iv_ruleConstraint= ruleConstraint EOF
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
    // InternalDdParser.g:841:1: ruleConstraint returns [EObject current=null] : ( ( (lv_chkDescLines_0_0= ruleLineComment ) )+ ( (lv_name_1_0= RULE_CHKID ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_check_4_0= ruleCheckExpression ) )+ this_END_5= RULE_END ) ;
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
            // InternalDdParser.g:847:2: ( ( ( (lv_chkDescLines_0_0= ruleLineComment ) )+ ( (lv_name_1_0= RULE_CHKID ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_check_4_0= ruleCheckExpression ) )+ this_END_5= RULE_END ) )
            // InternalDdParser.g:848:2: ( ( (lv_chkDescLines_0_0= ruleLineComment ) )+ ( (lv_name_1_0= RULE_CHKID ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_check_4_0= ruleCheckExpression ) )+ this_END_5= RULE_END )
            {
            // InternalDdParser.g:848:2: ( ( (lv_chkDescLines_0_0= ruleLineComment ) )+ ( (lv_name_1_0= RULE_CHKID ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_check_4_0= ruleCheckExpression ) )+ this_END_5= RULE_END )
            // InternalDdParser.g:849:3: ( (lv_chkDescLines_0_0= ruleLineComment ) )+ ( (lv_name_1_0= RULE_CHKID ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_check_4_0= ruleCheckExpression ) )+ this_END_5= RULE_END
            {
            // InternalDdParser.g:849:3: ( (lv_chkDescLines_0_0= ruleLineComment ) )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_CMT) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalDdParser.g:850:4: (lv_chkDescLines_0_0= ruleLineComment )
            	    {
            	    // InternalDdParser.g:850:4: (lv_chkDescLines_0_0= ruleLineComment )
            	    // InternalDdParser.g:851:5: lv_chkDescLines_0_0= ruleLineComment
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
            	    if ( cnt18 >= 1 ) break loop18;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);

            // InternalDdParser.g:868:3: ( (lv_name_1_0= RULE_CHKID ) )
            // InternalDdParser.g:869:4: (lv_name_1_0= RULE_CHKID )
            {
            // InternalDdParser.g:869:4: (lv_name_1_0= RULE_CHKID )
            // InternalDdParser.g:870:5: lv_name_1_0= RULE_CHKID
            {
            lv_name_1_0=(Token)match(input,RULE_CHKID,FOLLOW_16); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,Colon,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getConstraintAccess().getColonKeyword_2());
              		
            }
            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_BEGIN_3, grammarAccess.getConstraintAccess().getBEGINTerminalRuleCall_3());
              		
            }
            // InternalDdParser.g:894:3: ( (lv_check_4_0= ruleCheckExpression ) )+
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
            	    // InternalDdParser.g:895:4: (lv_check_4_0= ruleCheckExpression )
            	    {
            	    // InternalDdParser.g:895:4: (lv_check_4_0= ruleCheckExpression )
            	    // InternalDdParser.g:896:5: lv_check_4_0= ruleCheckExpression
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
            	    if ( cnt19 >= 1 ) break loop19;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
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
    // InternalDdParser.g:921:1: entryRuleCheckExpression returns [EObject current=null] : iv_ruleCheckExpression= ruleCheckExpression EOF ;
    public final EObject entryRuleCheckExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckExpression = null;


        try {
            // InternalDdParser.g:921:56: (iv_ruleCheckExpression= ruleCheckExpression EOF )
            // InternalDdParser.g:922:2: iv_ruleCheckExpression= ruleCheckExpression EOF
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
    // InternalDdParser.g:928:1: ruleCheckExpression returns [EObject current=null] : ( ( (lv_chkDesc_0_0= ruleLineComment ) )+ ( (lv_name_1_0= RULE_ID ) ) ( (lv_expr_2_0= ruleSharkExpression ) ) this_EOL_3= RULE_EOL ) ;
    public final EObject ruleCheckExpression() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token this_EOL_3=null;
        EObject lv_chkDesc_0_0 = null;

        EObject lv_expr_2_0 = null;



        	enterRule();

        try {
            // InternalDdParser.g:934:2: ( ( ( (lv_chkDesc_0_0= ruleLineComment ) )+ ( (lv_name_1_0= RULE_ID ) ) ( (lv_expr_2_0= ruleSharkExpression ) ) this_EOL_3= RULE_EOL ) )
            // InternalDdParser.g:935:2: ( ( (lv_chkDesc_0_0= ruleLineComment ) )+ ( (lv_name_1_0= RULE_ID ) ) ( (lv_expr_2_0= ruleSharkExpression ) ) this_EOL_3= RULE_EOL )
            {
            // InternalDdParser.g:935:2: ( ( (lv_chkDesc_0_0= ruleLineComment ) )+ ( (lv_name_1_0= RULE_ID ) ) ( (lv_expr_2_0= ruleSharkExpression ) ) this_EOL_3= RULE_EOL )
            // InternalDdParser.g:936:3: ( (lv_chkDesc_0_0= ruleLineComment ) )+ ( (lv_name_1_0= RULE_ID ) ) ( (lv_expr_2_0= ruleSharkExpression ) ) this_EOL_3= RULE_EOL
            {
            // InternalDdParser.g:936:3: ( (lv_chkDesc_0_0= ruleLineComment ) )+
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
            	    // InternalDdParser.g:937:4: (lv_chkDesc_0_0= ruleLineComment )
            	    {
            	    // InternalDdParser.g:937:4: (lv_chkDesc_0_0= ruleLineComment )
            	    // InternalDdParser.g:938:5: lv_chkDesc_0_0= ruleLineComment
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
            	    if ( cnt20 >= 1 ) break loop20;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);

            // InternalDdParser.g:955:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDdParser.g:956:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDdParser.g:956:4: (lv_name_1_0= RULE_ID )
            // InternalDdParser.g:957:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); if (state.failed) return current;
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

            // InternalDdParser.g:973:3: ( (lv_expr_2_0= ruleSharkExpression ) )
            // InternalDdParser.g:974:4: (lv_expr_2_0= ruleSharkExpression )
            {
            // InternalDdParser.g:974:4: (lv_expr_2_0= ruleSharkExpression )
            // InternalDdParser.g:975:5: lv_expr_2_0= ruleSharkExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCheckExpressionAccess().getExprSharkExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_12);
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
    // InternalDdParser.g:1000:1: entryRuleSharkExpression returns [EObject current=null] : iv_ruleSharkExpression= ruleSharkExpression EOF ;
    public final EObject entryRuleSharkExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSharkExpression = null;


        try {
            // InternalDdParser.g:1000:56: (iv_ruleSharkExpression= ruleSharkExpression EOF )
            // InternalDdParser.g:1001:2: iv_ruleSharkExpression= ruleSharkExpression EOF
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
    // InternalDdParser.g:1007:1: ruleSharkExpression returns [EObject current=null] : ( ( ( ruleRangeExpression )=>this_RangeExpression_0= ruleRangeExpression ) | ( ( ruleAddExpression )=>this_AddExpression_1= ruleAddExpression ) | ( ( ruleMultExpression )=>this_MultExpression_2= ruleMultExpression ) | ( ( ruleAndExpression )=>this_AndExpression_3= ruleAndExpression ) | ( ( ruleOrExpression )=>this_OrExpression_4= ruleOrExpression ) | ( ( ruleCatExpression )=>this_CatExpression_5= ruleCatExpression ) | ( ( ruleListExpression )=>this_ListExpression_6= ruleListExpression ) | this_BinaryExpression_7= ruleBinaryExpression | this_UnaryExpression_8= ruleUnaryExpression | this_TerminalExpression_9= ruleTerminalExpression | this_IdentifierExpression_10= ruleIdentifierExpression ) ;
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
            // InternalDdParser.g:1013:2: ( ( ( ( ruleRangeExpression )=>this_RangeExpression_0= ruleRangeExpression ) | ( ( ruleAddExpression )=>this_AddExpression_1= ruleAddExpression ) | ( ( ruleMultExpression )=>this_MultExpression_2= ruleMultExpression ) | ( ( ruleAndExpression )=>this_AndExpression_3= ruleAndExpression ) | ( ( ruleOrExpression )=>this_OrExpression_4= ruleOrExpression ) | ( ( ruleCatExpression )=>this_CatExpression_5= ruleCatExpression ) | ( ( ruleListExpression )=>this_ListExpression_6= ruleListExpression ) | this_BinaryExpression_7= ruleBinaryExpression | this_UnaryExpression_8= ruleUnaryExpression | this_TerminalExpression_9= ruleTerminalExpression | this_IdentifierExpression_10= ruleIdentifierExpression ) )
            // InternalDdParser.g:1014:2: ( ( ( ruleRangeExpression )=>this_RangeExpression_0= ruleRangeExpression ) | ( ( ruleAddExpression )=>this_AddExpression_1= ruleAddExpression ) | ( ( ruleMultExpression )=>this_MultExpression_2= ruleMultExpression ) | ( ( ruleAndExpression )=>this_AndExpression_3= ruleAndExpression ) | ( ( ruleOrExpression )=>this_OrExpression_4= ruleOrExpression ) | ( ( ruleCatExpression )=>this_CatExpression_5= ruleCatExpression ) | ( ( ruleListExpression )=>this_ListExpression_6= ruleListExpression ) | this_BinaryExpression_7= ruleBinaryExpression | this_UnaryExpression_8= ruleUnaryExpression | this_TerminalExpression_9= ruleTerminalExpression | this_IdentifierExpression_10= ruleIdentifierExpression )
            {
            // InternalDdParser.g:1014:2: ( ( ( ruleRangeExpression )=>this_RangeExpression_0= ruleRangeExpression ) | ( ( ruleAddExpression )=>this_AddExpression_1= ruleAddExpression ) | ( ( ruleMultExpression )=>this_MultExpression_2= ruleMultExpression ) | ( ( ruleAndExpression )=>this_AndExpression_3= ruleAndExpression ) | ( ( ruleOrExpression )=>this_OrExpression_4= ruleOrExpression ) | ( ( ruleCatExpression )=>this_CatExpression_5= ruleCatExpression ) | ( ( ruleListExpression )=>this_ListExpression_6= ruleListExpression ) | this_BinaryExpression_7= ruleBinaryExpression | this_UnaryExpression_8= ruleUnaryExpression | this_TerminalExpression_9= ruleTerminalExpression | this_IdentifierExpression_10= ruleIdentifierExpression )
            int alt21=11;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // InternalDdParser.g:1015:3: ( ( ruleRangeExpression )=>this_RangeExpression_0= ruleRangeExpression )
                    {
                    // InternalDdParser.g:1015:3: ( ( ruleRangeExpression )=>this_RangeExpression_0= ruleRangeExpression )
                    // InternalDdParser.g:1016:4: ( ruleRangeExpression )=>this_RangeExpression_0= ruleRangeExpression
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
                    // InternalDdParser.g:1027:3: ( ( ruleAddExpression )=>this_AddExpression_1= ruleAddExpression )
                    {
                    // InternalDdParser.g:1027:3: ( ( ruleAddExpression )=>this_AddExpression_1= ruleAddExpression )
                    // InternalDdParser.g:1028:4: ( ruleAddExpression )=>this_AddExpression_1= ruleAddExpression
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
                    // InternalDdParser.g:1039:3: ( ( ruleMultExpression )=>this_MultExpression_2= ruleMultExpression )
                    {
                    // InternalDdParser.g:1039:3: ( ( ruleMultExpression )=>this_MultExpression_2= ruleMultExpression )
                    // InternalDdParser.g:1040:4: ( ruleMultExpression )=>this_MultExpression_2= ruleMultExpression
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
                    // InternalDdParser.g:1051:3: ( ( ruleAndExpression )=>this_AndExpression_3= ruleAndExpression )
                    {
                    // InternalDdParser.g:1051:3: ( ( ruleAndExpression )=>this_AndExpression_3= ruleAndExpression )
                    // InternalDdParser.g:1052:4: ( ruleAndExpression )=>this_AndExpression_3= ruleAndExpression
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
                    // InternalDdParser.g:1063:3: ( ( ruleOrExpression )=>this_OrExpression_4= ruleOrExpression )
                    {
                    // InternalDdParser.g:1063:3: ( ( ruleOrExpression )=>this_OrExpression_4= ruleOrExpression )
                    // InternalDdParser.g:1064:4: ( ruleOrExpression )=>this_OrExpression_4= ruleOrExpression
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
                    // InternalDdParser.g:1075:3: ( ( ruleCatExpression )=>this_CatExpression_5= ruleCatExpression )
                    {
                    // InternalDdParser.g:1075:3: ( ( ruleCatExpression )=>this_CatExpression_5= ruleCatExpression )
                    // InternalDdParser.g:1076:4: ( ruleCatExpression )=>this_CatExpression_5= ruleCatExpression
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
                    // InternalDdParser.g:1087:3: ( ( ruleListExpression )=>this_ListExpression_6= ruleListExpression )
                    {
                    // InternalDdParser.g:1087:3: ( ( ruleListExpression )=>this_ListExpression_6= ruleListExpression )
                    // InternalDdParser.g:1088:4: ( ruleListExpression )=>this_ListExpression_6= ruleListExpression
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
                    // InternalDdParser.g:1099:3: this_BinaryExpression_7= ruleBinaryExpression
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
                    // InternalDdParser.g:1108:3: this_UnaryExpression_8= ruleUnaryExpression
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
                    // InternalDdParser.g:1117:3: this_TerminalExpression_9= ruleTerminalExpression
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
                    // InternalDdParser.g:1126:3: this_IdentifierExpression_10= ruleIdentifierExpression
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
    // InternalDdParser.g:1138:1: entryRuleBinaryExpression returns [EObject current=null] : iv_ruleBinaryExpression= ruleBinaryExpression EOF ;
    public final EObject entryRuleBinaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryExpression = null;


        try {
            // InternalDdParser.g:1138:57: (iv_ruleBinaryExpression= ruleBinaryExpression EOF )
            // InternalDdParser.g:1139:2: iv_ruleBinaryExpression= ruleBinaryExpression EOF
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
    // InternalDdParser.g:1145:1: ruleBinaryExpression returns [EObject current=null] : (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= ruleBinaryOperator ) ) ( (lv_right_3_0= ruleSharkExpression ) ) otherlv_4= RightParenthesis ( ( (lv_numType_5_0= RULE_NULL ) ) ( (lv_strType_6_0= RULE_NULL ) ) ( (lv_dateType_7_0= RULE_NULL ) ) ( (lv_boolType_8_0= RULE_NULL ) ) )? ) ;
    public final EObject ruleBinaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        Token lv_numType_5_0=null;
        Token lv_strType_6_0=null;
        Token lv_dateType_7_0=null;
        Token lv_boolType_8_0=null;
        EObject lv_left_1_0 = null;

        Enumerator lv_op_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalDdParser.g:1151:2: ( (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= ruleBinaryOperator ) ) ( (lv_right_3_0= ruleSharkExpression ) ) otherlv_4= RightParenthesis ( ( (lv_numType_5_0= RULE_NULL ) ) ( (lv_strType_6_0= RULE_NULL ) ) ( (lv_dateType_7_0= RULE_NULL ) ) ( (lv_boolType_8_0= RULE_NULL ) ) )? ) )
            // InternalDdParser.g:1152:2: (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= ruleBinaryOperator ) ) ( (lv_right_3_0= ruleSharkExpression ) ) otherlv_4= RightParenthesis ( ( (lv_numType_5_0= RULE_NULL ) ) ( (lv_strType_6_0= RULE_NULL ) ) ( (lv_dateType_7_0= RULE_NULL ) ) ( (lv_boolType_8_0= RULE_NULL ) ) )? )
            {
            // InternalDdParser.g:1152:2: (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= ruleBinaryOperator ) ) ( (lv_right_3_0= ruleSharkExpression ) ) otherlv_4= RightParenthesis ( ( (lv_numType_5_0= RULE_NULL ) ) ( (lv_strType_6_0= RULE_NULL ) ) ( (lv_dateType_7_0= RULE_NULL ) ) ( (lv_boolType_8_0= RULE_NULL ) ) )? )
            // InternalDdParser.g:1153:3: otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= ruleBinaryOperator ) ) ( (lv_right_3_0= ruleSharkExpression ) ) otherlv_4= RightParenthesis ( ( (lv_numType_5_0= RULE_NULL ) ) ( (lv_strType_6_0= RULE_NULL ) ) ( (lv_dateType_7_0= RULE_NULL ) ) ( (lv_boolType_8_0= RULE_NULL ) ) )?
            {
            otherlv_0=(Token)match(input,LeftParenthesis,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getBinaryExpressionAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalDdParser.g:1157:3: ( (lv_left_1_0= ruleSharkExpression ) )
            // InternalDdParser.g:1158:4: (lv_left_1_0= ruleSharkExpression )
            {
            // InternalDdParser.g:1158:4: (lv_left_1_0= ruleSharkExpression )
            // InternalDdParser.g:1159:5: lv_left_1_0= ruleSharkExpression
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

            // InternalDdParser.g:1176:3: ( (lv_op_2_0= ruleBinaryOperator ) )
            // InternalDdParser.g:1177:4: (lv_op_2_0= ruleBinaryOperator )
            {
            // InternalDdParser.g:1177:4: (lv_op_2_0= ruleBinaryOperator )
            // InternalDdParser.g:1178:5: lv_op_2_0= ruleBinaryOperator
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBinaryExpressionAccess().getOpBinaryOperatorEnumRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_10);
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

            // InternalDdParser.g:1195:3: ( (lv_right_3_0= ruleSharkExpression ) )
            // InternalDdParser.g:1196:4: (lv_right_3_0= ruleSharkExpression )
            {
            // InternalDdParser.g:1196:4: (lv_right_3_0= ruleSharkExpression )
            // InternalDdParser.g:1197:5: lv_right_3_0= ruleSharkExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBinaryExpressionAccess().getRightSharkExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_28);
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
            // InternalDdParser.g:1218:3: ( ( (lv_numType_5_0= RULE_NULL ) ) ( (lv_strType_6_0= RULE_NULL ) ) ( (lv_dateType_7_0= RULE_NULL ) ) ( (lv_boolType_8_0= RULE_NULL ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_NULL) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalDdParser.g:1219:4: ( (lv_numType_5_0= RULE_NULL ) ) ( (lv_strType_6_0= RULE_NULL ) ) ( (lv_dateType_7_0= RULE_NULL ) ) ( (lv_boolType_8_0= RULE_NULL ) )
                    {
                    // InternalDdParser.g:1219:4: ( (lv_numType_5_0= RULE_NULL ) )
                    // InternalDdParser.g:1220:5: (lv_numType_5_0= RULE_NULL )
                    {
                    // InternalDdParser.g:1220:5: (lv_numType_5_0= RULE_NULL )
                    // InternalDdParser.g:1221:6: lv_numType_5_0= RULE_NULL
                    {
                    lv_numType_5_0=(Token)match(input,RULE_NULL,FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_numType_5_0, grammarAccess.getBinaryExpressionAccess().getNumTypeNULLTerminalRuleCall_5_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getBinaryExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"numType",
                      							lv_numType_5_0 != null,
                      							"com.shark.lang.Dd.NULL");
                      					
                    }

                    }


                    }

                    // InternalDdParser.g:1237:4: ( (lv_strType_6_0= RULE_NULL ) )
                    // InternalDdParser.g:1238:5: (lv_strType_6_0= RULE_NULL )
                    {
                    // InternalDdParser.g:1238:5: (lv_strType_6_0= RULE_NULL )
                    // InternalDdParser.g:1239:6: lv_strType_6_0= RULE_NULL
                    {
                    lv_strType_6_0=(Token)match(input,RULE_NULL,FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_strType_6_0, grammarAccess.getBinaryExpressionAccess().getStrTypeNULLTerminalRuleCall_5_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getBinaryExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"strType",
                      							lv_strType_6_0 != null,
                      							"com.shark.lang.Dd.NULL");
                      					
                    }

                    }


                    }

                    // InternalDdParser.g:1255:4: ( (lv_dateType_7_0= RULE_NULL ) )
                    // InternalDdParser.g:1256:5: (lv_dateType_7_0= RULE_NULL )
                    {
                    // InternalDdParser.g:1256:5: (lv_dateType_7_0= RULE_NULL )
                    // InternalDdParser.g:1257:6: lv_dateType_7_0= RULE_NULL
                    {
                    lv_dateType_7_0=(Token)match(input,RULE_NULL,FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_dateType_7_0, grammarAccess.getBinaryExpressionAccess().getDateTypeNULLTerminalRuleCall_5_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getBinaryExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"dateType",
                      							lv_dateType_7_0 != null,
                      							"com.shark.lang.Dd.NULL");
                      					
                    }

                    }


                    }

                    // InternalDdParser.g:1273:4: ( (lv_boolType_8_0= RULE_NULL ) )
                    // InternalDdParser.g:1274:5: (lv_boolType_8_0= RULE_NULL )
                    {
                    // InternalDdParser.g:1274:5: (lv_boolType_8_0= RULE_NULL )
                    // InternalDdParser.g:1275:6: lv_boolType_8_0= RULE_NULL
                    {
                    lv_boolType_8_0=(Token)match(input,RULE_NULL,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_boolType_8_0, grammarAccess.getBinaryExpressionAccess().getBoolTypeNULLTerminalRuleCall_5_3_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getBinaryExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"boolType",
                      							lv_boolType_8_0 != null,
                      							"com.shark.lang.Dd.NULL");
                      					
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
    // InternalDdParser.g:1296:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // InternalDdParser.g:1296:56: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // InternalDdParser.g:1297:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
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
    // InternalDdParser.g:1303:1: ruleUnaryExpression returns [EObject current=null] : ( ( (lv_op_0_0= ruleUnaryOperator ) ) otherlv_1= LeftParenthesis ( (lv_left_2_0= ruleSharkExpression ) ) otherlv_3= RightParenthesis ( ( (lv_numType_4_0= RULE_NULL ) ) ( (lv_strType_5_0= RULE_NULL ) ) ( (lv_dateType_6_0= RULE_NULL ) ) ( (lv_boolType_7_0= RULE_NULL ) ) )? ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_numType_4_0=null;
        Token lv_strType_5_0=null;
        Token lv_dateType_6_0=null;
        Token lv_boolType_7_0=null;
        Enumerator lv_op_0_0 = null;

        EObject lv_left_2_0 = null;



        	enterRule();

        try {
            // InternalDdParser.g:1309:2: ( ( ( (lv_op_0_0= ruleUnaryOperator ) ) otherlv_1= LeftParenthesis ( (lv_left_2_0= ruleSharkExpression ) ) otherlv_3= RightParenthesis ( ( (lv_numType_4_0= RULE_NULL ) ) ( (lv_strType_5_0= RULE_NULL ) ) ( (lv_dateType_6_0= RULE_NULL ) ) ( (lv_boolType_7_0= RULE_NULL ) ) )? ) )
            // InternalDdParser.g:1310:2: ( ( (lv_op_0_0= ruleUnaryOperator ) ) otherlv_1= LeftParenthesis ( (lv_left_2_0= ruleSharkExpression ) ) otherlv_3= RightParenthesis ( ( (lv_numType_4_0= RULE_NULL ) ) ( (lv_strType_5_0= RULE_NULL ) ) ( (lv_dateType_6_0= RULE_NULL ) ) ( (lv_boolType_7_0= RULE_NULL ) ) )? )
            {
            // InternalDdParser.g:1310:2: ( ( (lv_op_0_0= ruleUnaryOperator ) ) otherlv_1= LeftParenthesis ( (lv_left_2_0= ruleSharkExpression ) ) otherlv_3= RightParenthesis ( ( (lv_numType_4_0= RULE_NULL ) ) ( (lv_strType_5_0= RULE_NULL ) ) ( (lv_dateType_6_0= RULE_NULL ) ) ( (lv_boolType_7_0= RULE_NULL ) ) )? )
            // InternalDdParser.g:1311:3: ( (lv_op_0_0= ruleUnaryOperator ) ) otherlv_1= LeftParenthesis ( (lv_left_2_0= ruleSharkExpression ) ) otherlv_3= RightParenthesis ( ( (lv_numType_4_0= RULE_NULL ) ) ( (lv_strType_5_0= RULE_NULL ) ) ( (lv_dateType_6_0= RULE_NULL ) ) ( (lv_boolType_7_0= RULE_NULL ) ) )?
            {
            // InternalDdParser.g:1311:3: ( (lv_op_0_0= ruleUnaryOperator ) )
            // InternalDdParser.g:1312:4: (lv_op_0_0= ruleUnaryOperator )
            {
            // InternalDdParser.g:1312:4: (lv_op_0_0= ruleUnaryOperator )
            // InternalDdParser.g:1313:5: lv_op_0_0= ruleUnaryOperator
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getUnaryExpressionAccess().getOpUnaryOperatorEnumRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_30);
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

            otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getUnaryExpressionAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalDdParser.g:1334:3: ( (lv_left_2_0= ruleSharkExpression ) )
            // InternalDdParser.g:1335:4: (lv_left_2_0= ruleSharkExpression )
            {
            // InternalDdParser.g:1335:4: (lv_left_2_0= ruleSharkExpression )
            // InternalDdParser.g:1336:5: lv_left_2_0= ruleSharkExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getUnaryExpressionAccess().getLeftSharkExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_28);
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
            // InternalDdParser.g:1357:3: ( ( (lv_numType_4_0= RULE_NULL ) ) ( (lv_strType_5_0= RULE_NULL ) ) ( (lv_dateType_6_0= RULE_NULL ) ) ( (lv_boolType_7_0= RULE_NULL ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_NULL) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalDdParser.g:1358:4: ( (lv_numType_4_0= RULE_NULL ) ) ( (lv_strType_5_0= RULE_NULL ) ) ( (lv_dateType_6_0= RULE_NULL ) ) ( (lv_boolType_7_0= RULE_NULL ) )
                    {
                    // InternalDdParser.g:1358:4: ( (lv_numType_4_0= RULE_NULL ) )
                    // InternalDdParser.g:1359:5: (lv_numType_4_0= RULE_NULL )
                    {
                    // InternalDdParser.g:1359:5: (lv_numType_4_0= RULE_NULL )
                    // InternalDdParser.g:1360:6: lv_numType_4_0= RULE_NULL
                    {
                    lv_numType_4_0=(Token)match(input,RULE_NULL,FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_numType_4_0, grammarAccess.getUnaryExpressionAccess().getNumTypeNULLTerminalRuleCall_4_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getUnaryExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"numType",
                      							lv_numType_4_0 != null,
                      							"com.shark.lang.Dd.NULL");
                      					
                    }

                    }


                    }

                    // InternalDdParser.g:1376:4: ( (lv_strType_5_0= RULE_NULL ) )
                    // InternalDdParser.g:1377:5: (lv_strType_5_0= RULE_NULL )
                    {
                    // InternalDdParser.g:1377:5: (lv_strType_5_0= RULE_NULL )
                    // InternalDdParser.g:1378:6: lv_strType_5_0= RULE_NULL
                    {
                    lv_strType_5_0=(Token)match(input,RULE_NULL,FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_strType_5_0, grammarAccess.getUnaryExpressionAccess().getStrTypeNULLTerminalRuleCall_4_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getUnaryExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"strType",
                      							lv_strType_5_0 != null,
                      							"com.shark.lang.Dd.NULL");
                      					
                    }

                    }


                    }

                    // InternalDdParser.g:1394:4: ( (lv_dateType_6_0= RULE_NULL ) )
                    // InternalDdParser.g:1395:5: (lv_dateType_6_0= RULE_NULL )
                    {
                    // InternalDdParser.g:1395:5: (lv_dateType_6_0= RULE_NULL )
                    // InternalDdParser.g:1396:6: lv_dateType_6_0= RULE_NULL
                    {
                    lv_dateType_6_0=(Token)match(input,RULE_NULL,FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_dateType_6_0, grammarAccess.getUnaryExpressionAccess().getDateTypeNULLTerminalRuleCall_4_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getUnaryExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"dateType",
                      							lv_dateType_6_0 != null,
                      							"com.shark.lang.Dd.NULL");
                      					
                    }

                    }


                    }

                    // InternalDdParser.g:1412:4: ( (lv_boolType_7_0= RULE_NULL ) )
                    // InternalDdParser.g:1413:5: (lv_boolType_7_0= RULE_NULL )
                    {
                    // InternalDdParser.g:1413:5: (lv_boolType_7_0= RULE_NULL )
                    // InternalDdParser.g:1414:6: lv_boolType_7_0= RULE_NULL
                    {
                    lv_boolType_7_0=(Token)match(input,RULE_NULL,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_boolType_7_0, grammarAccess.getUnaryExpressionAccess().getBoolTypeNULLTerminalRuleCall_4_3_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getUnaryExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"boolType",
                      							lv_boolType_7_0 != null,
                      							"com.shark.lang.Dd.NULL");
                      					
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
    // InternalDdParser.g:1435:1: entryRuleAddExpression returns [EObject current=null] : iv_ruleAddExpression= ruleAddExpression EOF ;
    public final EObject entryRuleAddExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddExpression = null;


        try {
            // InternalDdParser.g:1435:54: (iv_ruleAddExpression= ruleAddExpression EOF )
            // InternalDdParser.g:1436:2: iv_ruleAddExpression= ruleAddExpression EOF
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
    // InternalDdParser.g:1442:1: ruleAddExpression returns [EObject current=null] : (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_addElts_4_0= ruleAddExpressionElt ) )+ otherlv_5= RightParenthesis ( (lv_checked_6_0= RULE_NULL ) )? ) ;
    public final EObject ruleAddExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token otherlv_5=null;
        Token lv_checked_6_0=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_addElts_4_0 = null;



        	enterRule();

        try {
            // InternalDdParser.g:1448:2: ( (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_addElts_4_0= ruleAddExpressionElt ) )+ otherlv_5= RightParenthesis ( (lv_checked_6_0= RULE_NULL ) )? ) )
            // InternalDdParser.g:1449:2: (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_addElts_4_0= ruleAddExpressionElt ) )+ otherlv_5= RightParenthesis ( (lv_checked_6_0= RULE_NULL ) )? )
            {
            // InternalDdParser.g:1449:2: (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_addElts_4_0= ruleAddExpressionElt ) )+ otherlv_5= RightParenthesis ( (lv_checked_6_0= RULE_NULL ) )? )
            // InternalDdParser.g:1450:3: otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_addElts_4_0= ruleAddExpressionElt ) )+ otherlv_5= RightParenthesis ( (lv_checked_6_0= RULE_NULL ) )?
            {
            otherlv_0=(Token)match(input,LeftParenthesis,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAddExpressionAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalDdParser.g:1454:3: ( (lv_left_1_0= ruleSharkExpression ) )
            // InternalDdParser.g:1455:4: (lv_left_1_0= ruleSharkExpression )
            {
            // InternalDdParser.g:1455:4: (lv_left_1_0= ruleSharkExpression )
            // InternalDdParser.g:1456:5: lv_left_1_0= ruleSharkExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAddExpressionAccess().getLeftSharkExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_38);
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

            // InternalDdParser.g:1473:3: ( ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) ) )
            // InternalDdParser.g:1474:4: ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) )
            {
            // InternalDdParser.g:1474:4: ( (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus ) )
            // InternalDdParser.g:1475:5: (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus )
            {
            // InternalDdParser.g:1475:5: (lv_op_2_1= PlusSign | lv_op_2_2= HyphenMinus )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==PlusSign) ) {
                alt24=1;
            }
            else if ( (LA24_0==HyphenMinus) ) {
                alt24=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalDdParser.g:1476:6: lv_op_2_1= PlusSign
                    {
                    lv_op_2_1=(Token)match(input,PlusSign,FOLLOW_10); if (state.failed) return current;
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
                    // InternalDdParser.g:1487:6: lv_op_2_2= HyphenMinus
                    {
                    lv_op_2_2=(Token)match(input,HyphenMinus,FOLLOW_10); if (state.failed) return current;
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

            // InternalDdParser.g:1500:3: ( (lv_right_3_0= ruleSharkExpression ) )
            // InternalDdParser.g:1501:4: (lv_right_3_0= ruleSharkExpression )
            {
            // InternalDdParser.g:1501:4: (lv_right_3_0= ruleSharkExpression )
            // InternalDdParser.g:1502:5: lv_right_3_0= ruleSharkExpression
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

            // InternalDdParser.g:1519:3: ( (lv_addElts_4_0= ruleAddExpressionElt ) )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==PlusSign||LA25_0==HyphenMinus) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalDdParser.g:1520:4: (lv_addElts_4_0= ruleAddExpressionElt )
            	    {
            	    // InternalDdParser.g:1520:4: (lv_addElts_4_0= ruleAddExpressionElt )
            	    // InternalDdParser.g:1521:5: lv_addElts_4_0= ruleAddExpressionElt
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
            	    if ( cnt25 >= 1 ) break loop25;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
            } while (true);

            otherlv_5=(Token)match(input,RightParenthesis,FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getAddExpressionAccess().getRightParenthesisKeyword_5());
              		
            }
            // InternalDdParser.g:1542:3: ( (lv_checked_6_0= RULE_NULL ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_NULL) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalDdParser.g:1543:4: (lv_checked_6_0= RULE_NULL )
                    {
                    // InternalDdParser.g:1543:4: (lv_checked_6_0= RULE_NULL )
                    // InternalDdParser.g:1544:5: lv_checked_6_0= RULE_NULL
                    {
                    lv_checked_6_0=(Token)match(input,RULE_NULL,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_checked_6_0, grammarAccess.getAddExpressionAccess().getCheckedNULLTerminalRuleCall_6_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getAddExpressionRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"checked",
                      						lv_checked_6_0 != null,
                      						"com.shark.lang.Dd.NULL");
                      				
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
    // InternalDdParser.g:1564:1: entryRuleAddExpressionElt returns [EObject current=null] : iv_ruleAddExpressionElt= ruleAddExpressionElt EOF ;
    public final EObject entryRuleAddExpressionElt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddExpressionElt = null;


        try {
            // InternalDdParser.g:1564:57: (iv_ruleAddExpressionElt= ruleAddExpressionElt EOF )
            // InternalDdParser.g:1565:2: iv_ruleAddExpressionElt= ruleAddExpressionElt EOF
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
    // InternalDdParser.g:1571:1: ruleAddExpressionElt returns [EObject current=null] : ( ( ( (lv_op_0_1= PlusSign | lv_op_0_2= HyphenMinus ) ) ) ( (lv_right_1_0= ruleSharkExpression ) ) ) ;
    public final EObject ruleAddExpressionElt() throws RecognitionException {
        EObject current = null;

        Token lv_op_0_1=null;
        Token lv_op_0_2=null;
        EObject lv_right_1_0 = null;



        	enterRule();

        try {
            // InternalDdParser.g:1577:2: ( ( ( ( (lv_op_0_1= PlusSign | lv_op_0_2= HyphenMinus ) ) ) ( (lv_right_1_0= ruleSharkExpression ) ) ) )
            // InternalDdParser.g:1578:2: ( ( ( (lv_op_0_1= PlusSign | lv_op_0_2= HyphenMinus ) ) ) ( (lv_right_1_0= ruleSharkExpression ) ) )
            {
            // InternalDdParser.g:1578:2: ( ( ( (lv_op_0_1= PlusSign | lv_op_0_2= HyphenMinus ) ) ) ( (lv_right_1_0= ruleSharkExpression ) ) )
            // InternalDdParser.g:1579:3: ( ( (lv_op_0_1= PlusSign | lv_op_0_2= HyphenMinus ) ) ) ( (lv_right_1_0= ruleSharkExpression ) )
            {
            // InternalDdParser.g:1579:3: ( ( (lv_op_0_1= PlusSign | lv_op_0_2= HyphenMinus ) ) )
            // InternalDdParser.g:1580:4: ( (lv_op_0_1= PlusSign | lv_op_0_2= HyphenMinus ) )
            {
            // InternalDdParser.g:1580:4: ( (lv_op_0_1= PlusSign | lv_op_0_2= HyphenMinus ) )
            // InternalDdParser.g:1581:5: (lv_op_0_1= PlusSign | lv_op_0_2= HyphenMinus )
            {
            // InternalDdParser.g:1581:5: (lv_op_0_1= PlusSign | lv_op_0_2= HyphenMinus )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==PlusSign) ) {
                alt27=1;
            }
            else if ( (LA27_0==HyphenMinus) ) {
                alt27=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalDdParser.g:1582:6: lv_op_0_1= PlusSign
                    {
                    lv_op_0_1=(Token)match(input,PlusSign,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_op_0_1, grammarAccess.getAddExpressionEltAccess().getOpPlusSignKeyword_0_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAddExpressionEltRule());
                      						}
                      						setWithLastConsumed(current, "op", lv_op_0_1, null);
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalDdParser.g:1593:6: lv_op_0_2= HyphenMinus
                    {
                    lv_op_0_2=(Token)match(input,HyphenMinus,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_op_0_2, grammarAccess.getAddExpressionEltAccess().getOpHyphenMinusKeyword_0_0_1());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAddExpressionEltRule());
                      						}
                      						setWithLastConsumed(current, "op", lv_op_0_2, null);
                      					
                    }

                    }
                    break;

            }


            }


            }

            // InternalDdParser.g:1606:3: ( (lv_right_1_0= ruleSharkExpression ) )
            // InternalDdParser.g:1607:4: (lv_right_1_0= ruleSharkExpression )
            {
            // InternalDdParser.g:1607:4: (lv_right_1_0= ruleSharkExpression )
            // InternalDdParser.g:1608:5: lv_right_1_0= ruleSharkExpression
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
    // InternalDdParser.g:1629:1: entryRuleMultExpression returns [EObject current=null] : iv_ruleMultExpression= ruleMultExpression EOF ;
    public final EObject entryRuleMultExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultExpression = null;


        try {
            // InternalDdParser.g:1629:55: (iv_ruleMultExpression= ruleMultExpression EOF )
            // InternalDdParser.g:1630:2: iv_ruleMultExpression= ruleMultExpression EOF
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
    // InternalDdParser.g:1636:1: ruleMultExpression returns [EObject current=null] : (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= Asterisk ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_multElts_4_0= ruleMultExpressionElt ) )+ otherlv_5= RightParenthesis ( (lv_checked_6_0= RULE_NULL ) )? ) ;
    public final EObject ruleMultExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_op_2_0=null;
        Token otherlv_5=null;
        Token lv_checked_6_0=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_multElts_4_0 = null;



        	enterRule();

        try {
            // InternalDdParser.g:1642:2: ( (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= Asterisk ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_multElts_4_0= ruleMultExpressionElt ) )+ otherlv_5= RightParenthesis ( (lv_checked_6_0= RULE_NULL ) )? ) )
            // InternalDdParser.g:1643:2: (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= Asterisk ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_multElts_4_0= ruleMultExpressionElt ) )+ otherlv_5= RightParenthesis ( (lv_checked_6_0= RULE_NULL ) )? )
            {
            // InternalDdParser.g:1643:2: (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= Asterisk ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_multElts_4_0= ruleMultExpressionElt ) )+ otherlv_5= RightParenthesis ( (lv_checked_6_0= RULE_NULL ) )? )
            // InternalDdParser.g:1644:3: otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= Asterisk ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_multElts_4_0= ruleMultExpressionElt ) )+ otherlv_5= RightParenthesis ( (lv_checked_6_0= RULE_NULL ) )?
            {
            otherlv_0=(Token)match(input,LeftParenthesis,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMultExpressionAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalDdParser.g:1648:3: ( (lv_left_1_0= ruleSharkExpression ) )
            // InternalDdParser.g:1649:4: (lv_left_1_0= ruleSharkExpression )
            {
            // InternalDdParser.g:1649:4: (lv_left_1_0= ruleSharkExpression )
            // InternalDdParser.g:1650:5: lv_left_1_0= ruleSharkExpression
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

            // InternalDdParser.g:1667:3: ( (lv_op_2_0= Asterisk ) )
            // InternalDdParser.g:1668:4: (lv_op_2_0= Asterisk )
            {
            // InternalDdParser.g:1668:4: (lv_op_2_0= Asterisk )
            // InternalDdParser.g:1669:5: lv_op_2_0= Asterisk
            {
            lv_op_2_0=(Token)match(input,Asterisk,FOLLOW_10); if (state.failed) return current;
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

            // InternalDdParser.g:1681:3: ( (lv_right_3_0= ruleSharkExpression ) )
            // InternalDdParser.g:1682:4: (lv_right_3_0= ruleSharkExpression )
            {
            // InternalDdParser.g:1682:4: (lv_right_3_0= ruleSharkExpression )
            // InternalDdParser.g:1683:5: lv_right_3_0= ruleSharkExpression
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

            // InternalDdParser.g:1700:3: ( (lv_multElts_4_0= ruleMultExpressionElt ) )+
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
            	    // InternalDdParser.g:1701:4: (lv_multElts_4_0= ruleMultExpressionElt )
            	    {
            	    // InternalDdParser.g:1701:4: (lv_multElts_4_0= ruleMultExpressionElt )
            	    // InternalDdParser.g:1702:5: lv_multElts_4_0= ruleMultExpressionElt
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
            // InternalDdParser.g:1723:3: ( (lv_checked_6_0= RULE_NULL ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_NULL) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalDdParser.g:1724:4: (lv_checked_6_0= RULE_NULL )
                    {
                    // InternalDdParser.g:1724:4: (lv_checked_6_0= RULE_NULL )
                    // InternalDdParser.g:1725:5: lv_checked_6_0= RULE_NULL
                    {
                    lv_checked_6_0=(Token)match(input,RULE_NULL,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_checked_6_0, grammarAccess.getMultExpressionAccess().getCheckedNULLTerminalRuleCall_6_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getMultExpressionRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"checked",
                      						lv_checked_6_0 != null,
                      						"com.shark.lang.Dd.NULL");
                      				
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
    // InternalDdParser.g:1745:1: entryRuleMultExpressionElt returns [EObject current=null] : iv_ruleMultExpressionElt= ruleMultExpressionElt EOF ;
    public final EObject entryRuleMultExpressionElt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultExpressionElt = null;


        try {
            // InternalDdParser.g:1745:58: (iv_ruleMultExpressionElt= ruleMultExpressionElt EOF )
            // InternalDdParser.g:1746:2: iv_ruleMultExpressionElt= ruleMultExpressionElt EOF
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
    // InternalDdParser.g:1752:1: ruleMultExpressionElt returns [EObject current=null] : ( ( (lv_op_0_0= Asterisk ) ) ( (lv_right_1_0= ruleSharkExpression ) ) ) ;
    public final EObject ruleMultExpressionElt() throws RecognitionException {
        EObject current = null;

        Token lv_op_0_0=null;
        EObject lv_right_1_0 = null;



        	enterRule();

        try {
            // InternalDdParser.g:1758:2: ( ( ( (lv_op_0_0= Asterisk ) ) ( (lv_right_1_0= ruleSharkExpression ) ) ) )
            // InternalDdParser.g:1759:2: ( ( (lv_op_0_0= Asterisk ) ) ( (lv_right_1_0= ruleSharkExpression ) ) )
            {
            // InternalDdParser.g:1759:2: ( ( (lv_op_0_0= Asterisk ) ) ( (lv_right_1_0= ruleSharkExpression ) ) )
            // InternalDdParser.g:1760:3: ( (lv_op_0_0= Asterisk ) ) ( (lv_right_1_0= ruleSharkExpression ) )
            {
            // InternalDdParser.g:1760:3: ( (lv_op_0_0= Asterisk ) )
            // InternalDdParser.g:1761:4: (lv_op_0_0= Asterisk )
            {
            // InternalDdParser.g:1761:4: (lv_op_0_0= Asterisk )
            // InternalDdParser.g:1762:5: lv_op_0_0= Asterisk
            {
            lv_op_0_0=(Token)match(input,Asterisk,FOLLOW_10); if (state.failed) return current;
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

            // InternalDdParser.g:1774:3: ( (lv_right_1_0= ruleSharkExpression ) )
            // InternalDdParser.g:1775:4: (lv_right_1_0= ruleSharkExpression )
            {
            // InternalDdParser.g:1775:4: (lv_right_1_0= ruleSharkExpression )
            // InternalDdParser.g:1776:5: lv_right_1_0= ruleSharkExpression
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
    // InternalDdParser.g:1797:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // InternalDdParser.g:1797:54: (iv_ruleAndExpression= ruleAndExpression EOF )
            // InternalDdParser.g:1798:2: iv_ruleAndExpression= ruleAndExpression EOF
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
    // InternalDdParser.g:1804:1: ruleAndExpression returns [EObject current=null] : (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= And ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_andElts_4_0= ruleAndExpressionElt ) )+ otherlv_5= RightParenthesis ( (lv_checked_6_0= RULE_NULL ) )? ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_op_2_0=null;
        Token otherlv_5=null;
        Token lv_checked_6_0=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_andElts_4_0 = null;



        	enterRule();

        try {
            // InternalDdParser.g:1810:2: ( (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= And ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_andElts_4_0= ruleAndExpressionElt ) )+ otherlv_5= RightParenthesis ( (lv_checked_6_0= RULE_NULL ) )? ) )
            // InternalDdParser.g:1811:2: (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= And ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_andElts_4_0= ruleAndExpressionElt ) )+ otherlv_5= RightParenthesis ( (lv_checked_6_0= RULE_NULL ) )? )
            {
            // InternalDdParser.g:1811:2: (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= And ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_andElts_4_0= ruleAndExpressionElt ) )+ otherlv_5= RightParenthesis ( (lv_checked_6_0= RULE_NULL ) )? )
            // InternalDdParser.g:1812:3: otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= And ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_andElts_4_0= ruleAndExpressionElt ) )+ otherlv_5= RightParenthesis ( (lv_checked_6_0= RULE_NULL ) )?
            {
            otherlv_0=(Token)match(input,LeftParenthesis,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAndExpressionAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalDdParser.g:1816:3: ( (lv_left_1_0= ruleSharkExpression ) )
            // InternalDdParser.g:1817:4: (lv_left_1_0= ruleSharkExpression )
            {
            // InternalDdParser.g:1817:4: (lv_left_1_0= ruleSharkExpression )
            // InternalDdParser.g:1818:5: lv_left_1_0= ruleSharkExpression
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

            // InternalDdParser.g:1835:3: ( (lv_op_2_0= And ) )
            // InternalDdParser.g:1836:4: (lv_op_2_0= And )
            {
            // InternalDdParser.g:1836:4: (lv_op_2_0= And )
            // InternalDdParser.g:1837:5: lv_op_2_0= And
            {
            lv_op_2_0=(Token)match(input,And,FOLLOW_10); if (state.failed) return current;
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

            // InternalDdParser.g:1849:3: ( (lv_right_3_0= ruleSharkExpression ) )
            // InternalDdParser.g:1850:4: (lv_right_3_0= ruleSharkExpression )
            {
            // InternalDdParser.g:1850:4: (lv_right_3_0= ruleSharkExpression )
            // InternalDdParser.g:1851:5: lv_right_3_0= ruleSharkExpression
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

            // InternalDdParser.g:1868:3: ( (lv_andElts_4_0= ruleAndExpressionElt ) )+
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
            	    // InternalDdParser.g:1869:4: (lv_andElts_4_0= ruleAndExpressionElt )
            	    {
            	    // InternalDdParser.g:1869:4: (lv_andElts_4_0= ruleAndExpressionElt )
            	    // InternalDdParser.g:1870:5: lv_andElts_4_0= ruleAndExpressionElt
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

            otherlv_5=(Token)match(input,RightParenthesis,FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getAndExpressionAccess().getRightParenthesisKeyword_5());
              		
            }
            // InternalDdParser.g:1891:3: ( (lv_checked_6_0= RULE_NULL ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_NULL) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalDdParser.g:1892:4: (lv_checked_6_0= RULE_NULL )
                    {
                    // InternalDdParser.g:1892:4: (lv_checked_6_0= RULE_NULL )
                    // InternalDdParser.g:1893:5: lv_checked_6_0= RULE_NULL
                    {
                    lv_checked_6_0=(Token)match(input,RULE_NULL,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_checked_6_0, grammarAccess.getAndExpressionAccess().getCheckedNULLTerminalRuleCall_6_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getAndExpressionRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"checked",
                      						lv_checked_6_0 != null,
                      						"com.shark.lang.Dd.NULL");
                      				
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
    // InternalDdParser.g:1913:1: entryRuleAndExpressionElt returns [EObject current=null] : iv_ruleAndExpressionElt= ruleAndExpressionElt EOF ;
    public final EObject entryRuleAndExpressionElt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpressionElt = null;


        try {
            // InternalDdParser.g:1913:57: (iv_ruleAndExpressionElt= ruleAndExpressionElt EOF )
            // InternalDdParser.g:1914:2: iv_ruleAndExpressionElt= ruleAndExpressionElt EOF
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
    // InternalDdParser.g:1920:1: ruleAndExpressionElt returns [EObject current=null] : ( ( (lv_op_0_0= And ) ) ( (lv_right_1_0= ruleSharkExpression ) ) ) ;
    public final EObject ruleAndExpressionElt() throws RecognitionException {
        EObject current = null;

        Token lv_op_0_0=null;
        EObject lv_right_1_0 = null;



        	enterRule();

        try {
            // InternalDdParser.g:1926:2: ( ( ( (lv_op_0_0= And ) ) ( (lv_right_1_0= ruleSharkExpression ) ) ) )
            // InternalDdParser.g:1927:2: ( ( (lv_op_0_0= And ) ) ( (lv_right_1_0= ruleSharkExpression ) ) )
            {
            // InternalDdParser.g:1927:2: ( ( (lv_op_0_0= And ) ) ( (lv_right_1_0= ruleSharkExpression ) ) )
            // InternalDdParser.g:1928:3: ( (lv_op_0_0= And ) ) ( (lv_right_1_0= ruleSharkExpression ) )
            {
            // InternalDdParser.g:1928:3: ( (lv_op_0_0= And ) )
            // InternalDdParser.g:1929:4: (lv_op_0_0= And )
            {
            // InternalDdParser.g:1929:4: (lv_op_0_0= And )
            // InternalDdParser.g:1930:5: lv_op_0_0= And
            {
            lv_op_0_0=(Token)match(input,And,FOLLOW_10); if (state.failed) return current;
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

            // InternalDdParser.g:1942:3: ( (lv_right_1_0= ruleSharkExpression ) )
            // InternalDdParser.g:1943:4: (lv_right_1_0= ruleSharkExpression )
            {
            // InternalDdParser.g:1943:4: (lv_right_1_0= ruleSharkExpression )
            // InternalDdParser.g:1944:5: lv_right_1_0= ruleSharkExpression
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
    // InternalDdParser.g:1965:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // InternalDdParser.g:1965:53: (iv_ruleOrExpression= ruleOrExpression EOF )
            // InternalDdParser.g:1966:2: iv_ruleOrExpression= ruleOrExpression EOF
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
    // InternalDdParser.g:1972:1: ruleOrExpression returns [EObject current=null] : (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= Or ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_orElts_4_0= ruleOrExpressionElt ) )+ otherlv_5= RightParenthesis ( (lv_checked_6_0= RULE_NULL ) )? ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_op_2_0=null;
        Token otherlv_5=null;
        Token lv_checked_6_0=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_orElts_4_0 = null;



        	enterRule();

        try {
            // InternalDdParser.g:1978:2: ( (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= Or ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_orElts_4_0= ruleOrExpressionElt ) )+ otherlv_5= RightParenthesis ( (lv_checked_6_0= RULE_NULL ) )? ) )
            // InternalDdParser.g:1979:2: (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= Or ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_orElts_4_0= ruleOrExpressionElt ) )+ otherlv_5= RightParenthesis ( (lv_checked_6_0= RULE_NULL ) )? )
            {
            // InternalDdParser.g:1979:2: (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= Or ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_orElts_4_0= ruleOrExpressionElt ) )+ otherlv_5= RightParenthesis ( (lv_checked_6_0= RULE_NULL ) )? )
            // InternalDdParser.g:1980:3: otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= Or ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_orElts_4_0= ruleOrExpressionElt ) )+ otherlv_5= RightParenthesis ( (lv_checked_6_0= RULE_NULL ) )?
            {
            otherlv_0=(Token)match(input,LeftParenthesis,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getOrExpressionAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalDdParser.g:1984:3: ( (lv_left_1_0= ruleSharkExpression ) )
            // InternalDdParser.g:1985:4: (lv_left_1_0= ruleSharkExpression )
            {
            // InternalDdParser.g:1985:4: (lv_left_1_0= ruleSharkExpression )
            // InternalDdParser.g:1986:5: lv_left_1_0= ruleSharkExpression
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

            // InternalDdParser.g:2003:3: ( (lv_op_2_0= Or ) )
            // InternalDdParser.g:2004:4: (lv_op_2_0= Or )
            {
            // InternalDdParser.g:2004:4: (lv_op_2_0= Or )
            // InternalDdParser.g:2005:5: lv_op_2_0= Or
            {
            lv_op_2_0=(Token)match(input,Or,FOLLOW_10); if (state.failed) return current;
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

            // InternalDdParser.g:2017:3: ( (lv_right_3_0= ruleSharkExpression ) )
            // InternalDdParser.g:2018:4: (lv_right_3_0= ruleSharkExpression )
            {
            // InternalDdParser.g:2018:4: (lv_right_3_0= ruleSharkExpression )
            // InternalDdParser.g:2019:5: lv_right_3_0= ruleSharkExpression
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

            // InternalDdParser.g:2036:3: ( (lv_orElts_4_0= ruleOrExpressionElt ) )+
            int cnt32=0;
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==Or) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalDdParser.g:2037:4: (lv_orElts_4_0= ruleOrExpressionElt )
            	    {
            	    // InternalDdParser.g:2037:4: (lv_orElts_4_0= ruleOrExpressionElt )
            	    // InternalDdParser.g:2038:5: lv_orElts_4_0= ruleOrExpressionElt
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

              			newLeafNode(otherlv_5, grammarAccess.getOrExpressionAccess().getRightParenthesisKeyword_5());
              		
            }
            // InternalDdParser.g:2059:3: ( (lv_checked_6_0= RULE_NULL ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_NULL) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalDdParser.g:2060:4: (lv_checked_6_0= RULE_NULL )
                    {
                    // InternalDdParser.g:2060:4: (lv_checked_6_0= RULE_NULL )
                    // InternalDdParser.g:2061:5: lv_checked_6_0= RULE_NULL
                    {
                    lv_checked_6_0=(Token)match(input,RULE_NULL,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_checked_6_0, grammarAccess.getOrExpressionAccess().getCheckedNULLTerminalRuleCall_6_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getOrExpressionRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"checked",
                      						lv_checked_6_0 != null,
                      						"com.shark.lang.Dd.NULL");
                      				
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
    // InternalDdParser.g:2081:1: entryRuleOrExpressionElt returns [EObject current=null] : iv_ruleOrExpressionElt= ruleOrExpressionElt EOF ;
    public final EObject entryRuleOrExpressionElt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpressionElt = null;


        try {
            // InternalDdParser.g:2081:56: (iv_ruleOrExpressionElt= ruleOrExpressionElt EOF )
            // InternalDdParser.g:2082:2: iv_ruleOrExpressionElt= ruleOrExpressionElt EOF
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
    // InternalDdParser.g:2088:1: ruleOrExpressionElt returns [EObject current=null] : ( ( (lv_op_0_0= Or ) ) ( (lv_right_1_0= ruleSharkExpression ) ) ) ;
    public final EObject ruleOrExpressionElt() throws RecognitionException {
        EObject current = null;

        Token lv_op_0_0=null;
        EObject lv_right_1_0 = null;



        	enterRule();

        try {
            // InternalDdParser.g:2094:2: ( ( ( (lv_op_0_0= Or ) ) ( (lv_right_1_0= ruleSharkExpression ) ) ) )
            // InternalDdParser.g:2095:2: ( ( (lv_op_0_0= Or ) ) ( (lv_right_1_0= ruleSharkExpression ) ) )
            {
            // InternalDdParser.g:2095:2: ( ( (lv_op_0_0= Or ) ) ( (lv_right_1_0= ruleSharkExpression ) ) )
            // InternalDdParser.g:2096:3: ( (lv_op_0_0= Or ) ) ( (lv_right_1_0= ruleSharkExpression ) )
            {
            // InternalDdParser.g:2096:3: ( (lv_op_0_0= Or ) )
            // InternalDdParser.g:2097:4: (lv_op_0_0= Or )
            {
            // InternalDdParser.g:2097:4: (lv_op_0_0= Or )
            // InternalDdParser.g:2098:5: lv_op_0_0= Or
            {
            lv_op_0_0=(Token)match(input,Or,FOLLOW_10); if (state.failed) return current;
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

            // InternalDdParser.g:2110:3: ( (lv_right_1_0= ruleSharkExpression ) )
            // InternalDdParser.g:2111:4: (lv_right_1_0= ruleSharkExpression )
            {
            // InternalDdParser.g:2111:4: (lv_right_1_0= ruleSharkExpression )
            // InternalDdParser.g:2112:5: lv_right_1_0= ruleSharkExpression
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
    // InternalDdParser.g:2133:1: entryRuleCatExpression returns [EObject current=null] : iv_ruleCatExpression= ruleCatExpression EOF ;
    public final EObject entryRuleCatExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCatExpression = null;


        try {
            // InternalDdParser.g:2133:54: (iv_ruleCatExpression= ruleCatExpression EOF )
            // InternalDdParser.g:2134:2: iv_ruleCatExpression= ruleCatExpression EOF
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
    // InternalDdParser.g:2140:1: ruleCatExpression returns [EObject current=null] : (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= Ampersand ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_catElts_4_0= ruleCatExpressionElt ) )+ otherlv_5= RightParenthesis ( (lv_checked_6_0= RULE_NULL ) )? ) ;
    public final EObject ruleCatExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_op_2_0=null;
        Token otherlv_5=null;
        Token lv_checked_6_0=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_catElts_4_0 = null;



        	enterRule();

        try {
            // InternalDdParser.g:2146:2: ( (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= Ampersand ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_catElts_4_0= ruleCatExpressionElt ) )+ otherlv_5= RightParenthesis ( (lv_checked_6_0= RULE_NULL ) )? ) )
            // InternalDdParser.g:2147:2: (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= Ampersand ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_catElts_4_0= ruleCatExpressionElt ) )+ otherlv_5= RightParenthesis ( (lv_checked_6_0= RULE_NULL ) )? )
            {
            // InternalDdParser.g:2147:2: (otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= Ampersand ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_catElts_4_0= ruleCatExpressionElt ) )+ otherlv_5= RightParenthesis ( (lv_checked_6_0= RULE_NULL ) )? )
            // InternalDdParser.g:2148:3: otherlv_0= LeftParenthesis ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_op_2_0= Ampersand ) ) ( (lv_right_3_0= ruleSharkExpression ) ) ( (lv_catElts_4_0= ruleCatExpressionElt ) )+ otherlv_5= RightParenthesis ( (lv_checked_6_0= RULE_NULL ) )?
            {
            otherlv_0=(Token)match(input,LeftParenthesis,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getCatExpressionAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalDdParser.g:2152:3: ( (lv_left_1_0= ruleSharkExpression ) )
            // InternalDdParser.g:2153:4: (lv_left_1_0= ruleSharkExpression )
            {
            // InternalDdParser.g:2153:4: (lv_left_1_0= ruleSharkExpression )
            // InternalDdParser.g:2154:5: lv_left_1_0= ruleSharkExpression
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

            // InternalDdParser.g:2171:3: ( (lv_op_2_0= Ampersand ) )
            // InternalDdParser.g:2172:4: (lv_op_2_0= Ampersand )
            {
            // InternalDdParser.g:2172:4: (lv_op_2_0= Ampersand )
            // InternalDdParser.g:2173:5: lv_op_2_0= Ampersand
            {
            lv_op_2_0=(Token)match(input,Ampersand,FOLLOW_10); if (state.failed) return current;
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

            // InternalDdParser.g:2185:3: ( (lv_right_3_0= ruleSharkExpression ) )
            // InternalDdParser.g:2186:4: (lv_right_3_0= ruleSharkExpression )
            {
            // InternalDdParser.g:2186:4: (lv_right_3_0= ruleSharkExpression )
            // InternalDdParser.g:2187:5: lv_right_3_0= ruleSharkExpression
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

            // InternalDdParser.g:2204:3: ( (lv_catElts_4_0= ruleCatExpressionElt ) )+
            int cnt34=0;
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==Ampersand) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalDdParser.g:2205:4: (lv_catElts_4_0= ruleCatExpressionElt )
            	    {
            	    // InternalDdParser.g:2205:4: (lv_catElts_4_0= ruleCatExpressionElt )
            	    // InternalDdParser.g:2206:5: lv_catElts_4_0= ruleCatExpressionElt
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
            	    if ( cnt34 >= 1 ) break loop34;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(34, input);
                        throw eee;
                }
                cnt34++;
            } while (true);

            otherlv_5=(Token)match(input,RightParenthesis,FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getCatExpressionAccess().getRightParenthesisKeyword_5());
              		
            }
            // InternalDdParser.g:2227:3: ( (lv_checked_6_0= RULE_NULL ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_NULL) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalDdParser.g:2228:4: (lv_checked_6_0= RULE_NULL )
                    {
                    // InternalDdParser.g:2228:4: (lv_checked_6_0= RULE_NULL )
                    // InternalDdParser.g:2229:5: lv_checked_6_0= RULE_NULL
                    {
                    lv_checked_6_0=(Token)match(input,RULE_NULL,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_checked_6_0, grammarAccess.getCatExpressionAccess().getCheckedNULLTerminalRuleCall_6_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getCatExpressionRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"checked",
                      						lv_checked_6_0 != null,
                      						"com.shark.lang.Dd.NULL");
                      				
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
    // InternalDdParser.g:2249:1: entryRuleCatExpressionElt returns [EObject current=null] : iv_ruleCatExpressionElt= ruleCatExpressionElt EOF ;
    public final EObject entryRuleCatExpressionElt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCatExpressionElt = null;


        try {
            // InternalDdParser.g:2249:57: (iv_ruleCatExpressionElt= ruleCatExpressionElt EOF )
            // InternalDdParser.g:2250:2: iv_ruleCatExpressionElt= ruleCatExpressionElt EOF
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
    // InternalDdParser.g:2256:1: ruleCatExpressionElt returns [EObject current=null] : ( ( (lv_op_0_0= Ampersand ) ) ( (lv_right_1_0= ruleSharkExpression ) ) ) ;
    public final EObject ruleCatExpressionElt() throws RecognitionException {
        EObject current = null;

        Token lv_op_0_0=null;
        EObject lv_right_1_0 = null;



        	enterRule();

        try {
            // InternalDdParser.g:2262:2: ( ( ( (lv_op_0_0= Ampersand ) ) ( (lv_right_1_0= ruleSharkExpression ) ) ) )
            // InternalDdParser.g:2263:2: ( ( (lv_op_0_0= Ampersand ) ) ( (lv_right_1_0= ruleSharkExpression ) ) )
            {
            // InternalDdParser.g:2263:2: ( ( (lv_op_0_0= Ampersand ) ) ( (lv_right_1_0= ruleSharkExpression ) ) )
            // InternalDdParser.g:2264:3: ( (lv_op_0_0= Ampersand ) ) ( (lv_right_1_0= ruleSharkExpression ) )
            {
            // InternalDdParser.g:2264:3: ( (lv_op_0_0= Ampersand ) )
            // InternalDdParser.g:2265:4: (lv_op_0_0= Ampersand )
            {
            // InternalDdParser.g:2265:4: (lv_op_0_0= Ampersand )
            // InternalDdParser.g:2266:5: lv_op_0_0= Ampersand
            {
            lv_op_0_0=(Token)match(input,Ampersand,FOLLOW_10); if (state.failed) return current;
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

            // InternalDdParser.g:2278:3: ( (lv_right_1_0= ruleSharkExpression ) )
            // InternalDdParser.g:2279:4: (lv_right_1_0= ruleSharkExpression )
            {
            // InternalDdParser.g:2279:4: (lv_right_1_0= ruleSharkExpression )
            // InternalDdParser.g:2280:5: lv_right_1_0= ruleSharkExpression
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
    // InternalDdParser.g:2301:1: entryRuleListExpression returns [EObject current=null] : iv_ruleListExpression= ruleListExpression EOF ;
    public final EObject entryRuleListExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListExpression = null;


        try {
            // InternalDdParser.g:2301:55: (iv_ruleListExpression= ruleListExpression EOF )
            // InternalDdParser.g:2302:2: iv_ruleListExpression= ruleListExpression EOF
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
    // InternalDdParser.g:2308:1: ruleListExpression returns [EObject current=null] : ( ( (lv_op_0_0= LeftParenthesis ) ) ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_ListElts_2_0= ruleListExpressionElt ) )+ otherlv_3= RightParenthesis ( ( (lv_numType_4_0= RULE_NULL ) ) ( (lv_strType_5_0= RULE_NULL ) ) ( (lv_dateType_6_0= RULE_NULL ) ) ( (lv_boolType_7_0= RULE_NULL ) ) )? ) ;
    public final EObject ruleListExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_0_0=null;
        Token otherlv_3=null;
        Token lv_numType_4_0=null;
        Token lv_strType_5_0=null;
        Token lv_dateType_6_0=null;
        Token lv_boolType_7_0=null;
        EObject lv_left_1_0 = null;

        EObject lv_ListElts_2_0 = null;



        	enterRule();

        try {
            // InternalDdParser.g:2314:2: ( ( ( (lv_op_0_0= LeftParenthesis ) ) ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_ListElts_2_0= ruleListExpressionElt ) )+ otherlv_3= RightParenthesis ( ( (lv_numType_4_0= RULE_NULL ) ) ( (lv_strType_5_0= RULE_NULL ) ) ( (lv_dateType_6_0= RULE_NULL ) ) ( (lv_boolType_7_0= RULE_NULL ) ) )? ) )
            // InternalDdParser.g:2315:2: ( ( (lv_op_0_0= LeftParenthesis ) ) ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_ListElts_2_0= ruleListExpressionElt ) )+ otherlv_3= RightParenthesis ( ( (lv_numType_4_0= RULE_NULL ) ) ( (lv_strType_5_0= RULE_NULL ) ) ( (lv_dateType_6_0= RULE_NULL ) ) ( (lv_boolType_7_0= RULE_NULL ) ) )? )
            {
            // InternalDdParser.g:2315:2: ( ( (lv_op_0_0= LeftParenthesis ) ) ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_ListElts_2_0= ruleListExpressionElt ) )+ otherlv_3= RightParenthesis ( ( (lv_numType_4_0= RULE_NULL ) ) ( (lv_strType_5_0= RULE_NULL ) ) ( (lv_dateType_6_0= RULE_NULL ) ) ( (lv_boolType_7_0= RULE_NULL ) ) )? )
            // InternalDdParser.g:2316:3: ( (lv_op_0_0= LeftParenthesis ) ) ( (lv_left_1_0= ruleSharkExpression ) ) ( (lv_ListElts_2_0= ruleListExpressionElt ) )+ otherlv_3= RightParenthesis ( ( (lv_numType_4_0= RULE_NULL ) ) ( (lv_strType_5_0= RULE_NULL ) ) ( (lv_dateType_6_0= RULE_NULL ) ) ( (lv_boolType_7_0= RULE_NULL ) ) )?
            {
            // InternalDdParser.g:2316:3: ( (lv_op_0_0= LeftParenthesis ) )
            // InternalDdParser.g:2317:4: (lv_op_0_0= LeftParenthesis )
            {
            // InternalDdParser.g:2317:4: (lv_op_0_0= LeftParenthesis )
            // InternalDdParser.g:2318:5: lv_op_0_0= LeftParenthesis
            {
            lv_op_0_0=(Token)match(input,LeftParenthesis,FOLLOW_10); if (state.failed) return current;
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

            // InternalDdParser.g:2330:3: ( (lv_left_1_0= ruleSharkExpression ) )
            // InternalDdParser.g:2331:4: (lv_left_1_0= ruleSharkExpression )
            {
            // InternalDdParser.g:2331:4: (lv_left_1_0= ruleSharkExpression )
            // InternalDdParser.g:2332:5: lv_left_1_0= ruleSharkExpression
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

            // InternalDdParser.g:2349:3: ( (lv_ListElts_2_0= ruleListExpressionElt ) )+
            int cnt36=0;
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==Comma) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalDdParser.g:2350:4: (lv_ListElts_2_0= ruleListExpressionElt )
            	    {
            	    // InternalDdParser.g:2350:4: (lv_ListElts_2_0= ruleListExpressionElt )
            	    // InternalDdParser.g:2351:5: lv_ListElts_2_0= ruleListExpressionElt
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getListExpressionAccess().getListEltsListExpressionEltParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_27);
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
            	    if ( cnt36 >= 1 ) break loop36;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(36, input);
                        throw eee;
                }
                cnt36++;
            } while (true);

            otherlv_3=(Token)match(input,RightParenthesis,FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getListExpressionAccess().getRightParenthesisKeyword_3());
              		
            }
            // InternalDdParser.g:2372:3: ( ( (lv_numType_4_0= RULE_NULL ) ) ( (lv_strType_5_0= RULE_NULL ) ) ( (lv_dateType_6_0= RULE_NULL ) ) ( (lv_boolType_7_0= RULE_NULL ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_NULL) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalDdParser.g:2373:4: ( (lv_numType_4_0= RULE_NULL ) ) ( (lv_strType_5_0= RULE_NULL ) ) ( (lv_dateType_6_0= RULE_NULL ) ) ( (lv_boolType_7_0= RULE_NULL ) )
                    {
                    // InternalDdParser.g:2373:4: ( (lv_numType_4_0= RULE_NULL ) )
                    // InternalDdParser.g:2374:5: (lv_numType_4_0= RULE_NULL )
                    {
                    // InternalDdParser.g:2374:5: (lv_numType_4_0= RULE_NULL )
                    // InternalDdParser.g:2375:6: lv_numType_4_0= RULE_NULL
                    {
                    lv_numType_4_0=(Token)match(input,RULE_NULL,FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_numType_4_0, grammarAccess.getListExpressionAccess().getNumTypeNULLTerminalRuleCall_4_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getListExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"numType",
                      							lv_numType_4_0 != null,
                      							"com.shark.lang.Dd.NULL");
                      					
                    }

                    }


                    }

                    // InternalDdParser.g:2391:4: ( (lv_strType_5_0= RULE_NULL ) )
                    // InternalDdParser.g:2392:5: (lv_strType_5_0= RULE_NULL )
                    {
                    // InternalDdParser.g:2392:5: (lv_strType_5_0= RULE_NULL )
                    // InternalDdParser.g:2393:6: lv_strType_5_0= RULE_NULL
                    {
                    lv_strType_5_0=(Token)match(input,RULE_NULL,FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_strType_5_0, grammarAccess.getListExpressionAccess().getStrTypeNULLTerminalRuleCall_4_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getListExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"strType",
                      							lv_strType_5_0 != null,
                      							"com.shark.lang.Dd.NULL");
                      					
                    }

                    }


                    }

                    // InternalDdParser.g:2409:4: ( (lv_dateType_6_0= RULE_NULL ) )
                    // InternalDdParser.g:2410:5: (lv_dateType_6_0= RULE_NULL )
                    {
                    // InternalDdParser.g:2410:5: (lv_dateType_6_0= RULE_NULL )
                    // InternalDdParser.g:2411:6: lv_dateType_6_0= RULE_NULL
                    {
                    lv_dateType_6_0=(Token)match(input,RULE_NULL,FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_dateType_6_0, grammarAccess.getListExpressionAccess().getDateTypeNULLTerminalRuleCall_4_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getListExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"dateType",
                      							lv_dateType_6_0 != null,
                      							"com.shark.lang.Dd.NULL");
                      					
                    }

                    }


                    }

                    // InternalDdParser.g:2427:4: ( (lv_boolType_7_0= RULE_NULL ) )
                    // InternalDdParser.g:2428:5: (lv_boolType_7_0= RULE_NULL )
                    {
                    // InternalDdParser.g:2428:5: (lv_boolType_7_0= RULE_NULL )
                    // InternalDdParser.g:2429:6: lv_boolType_7_0= RULE_NULL
                    {
                    lv_boolType_7_0=(Token)match(input,RULE_NULL,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_boolType_7_0, grammarAccess.getListExpressionAccess().getBoolTypeNULLTerminalRuleCall_4_3_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getListExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"boolType",
                      							lv_boolType_7_0 != null,
                      							"com.shark.lang.Dd.NULL");
                      					
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
    // InternalDdParser.g:2450:1: entryRuleListExpressionElt returns [EObject current=null] : iv_ruleListExpressionElt= ruleListExpressionElt EOF ;
    public final EObject entryRuleListExpressionElt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListExpressionElt = null;


        try {
            // InternalDdParser.g:2450:58: (iv_ruleListExpressionElt= ruleListExpressionElt EOF )
            // InternalDdParser.g:2451:2: iv_ruleListExpressionElt= ruleListExpressionElt EOF
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
    // InternalDdParser.g:2457:1: ruleListExpressionElt returns [EObject current=null] : ( ( (lv_op_0_0= Comma ) ) ( (lv_right_1_0= ruleSharkExpression ) ) ) ;
    public final EObject ruleListExpressionElt() throws RecognitionException {
        EObject current = null;

        Token lv_op_0_0=null;
        EObject lv_right_1_0 = null;



        	enterRule();

        try {
            // InternalDdParser.g:2463:2: ( ( ( (lv_op_0_0= Comma ) ) ( (lv_right_1_0= ruleSharkExpression ) ) ) )
            // InternalDdParser.g:2464:2: ( ( (lv_op_0_0= Comma ) ) ( (lv_right_1_0= ruleSharkExpression ) ) )
            {
            // InternalDdParser.g:2464:2: ( ( (lv_op_0_0= Comma ) ) ( (lv_right_1_0= ruleSharkExpression ) ) )
            // InternalDdParser.g:2465:3: ( (lv_op_0_0= Comma ) ) ( (lv_right_1_0= ruleSharkExpression ) )
            {
            // InternalDdParser.g:2465:3: ( (lv_op_0_0= Comma ) )
            // InternalDdParser.g:2466:4: (lv_op_0_0= Comma )
            {
            // InternalDdParser.g:2466:4: (lv_op_0_0= Comma )
            // InternalDdParser.g:2467:5: lv_op_0_0= Comma
            {
            lv_op_0_0=(Token)match(input,Comma,FOLLOW_10); if (state.failed) return current;
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

            // InternalDdParser.g:2479:3: ( (lv_right_1_0= ruleSharkExpression ) )
            // InternalDdParser.g:2480:4: (lv_right_1_0= ruleSharkExpression )
            {
            // InternalDdParser.g:2480:4: (lv_right_1_0= ruleSharkExpression )
            // InternalDdParser.g:2481:5: lv_right_1_0= ruleSharkExpression
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
    // InternalDdParser.g:2502:1: entryRuleRangeExpression returns [EObject current=null] : iv_ruleRangeExpression= ruleRangeExpression EOF ;
    public final EObject entryRuleRangeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRangeExpression = null;


        try {
            // InternalDdParser.g:2502:56: (iv_ruleRangeExpression= ruleRangeExpression EOF )
            // InternalDdParser.g:2503:2: iv_ruleRangeExpression= ruleRangeExpression EOF
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
    // InternalDdParser.g:2509:1: ruleRangeExpression returns [EObject current=null] : ( ( () otherlv_1= LeftParenthesis ( (lv_range_2_0= RULE_RANGE ) ) otherlv_3= RightParenthesis ( ( (lv_numType_4_0= RULE_NULL ) ) ( (lv_strType_5_0= RULE_NULL ) ) ( (lv_dateType_6_0= RULE_NULL ) ) ( (lv_boolType_7_0= RULE_NULL ) ) )? ) | ( () ( ( LeftParenthesis )=>otherlv_9= LeftParenthesis ) ( (lv_range_10_0= RULE_RANGEINF ) ) otherlv_11= RightParenthesis ( ( (lv_numType_12_0= RULE_NULL ) ) ( (lv_strType_13_0= RULE_NULL ) ) ( (lv_dateType_14_0= RULE_NULL ) ) ( (lv_boolType_15_0= RULE_NULL ) ) )? ) ) ;
    public final EObject ruleRangeExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_range_2_0=null;
        Token otherlv_3=null;
        Token lv_numType_4_0=null;
        Token lv_strType_5_0=null;
        Token lv_dateType_6_0=null;
        Token lv_boolType_7_0=null;
        Token otherlv_9=null;
        Token lv_range_10_0=null;
        Token otherlv_11=null;
        Token lv_numType_12_0=null;
        Token lv_strType_13_0=null;
        Token lv_dateType_14_0=null;
        Token lv_boolType_15_0=null;


        	enterRule();

        try {
            // InternalDdParser.g:2515:2: ( ( ( () otherlv_1= LeftParenthesis ( (lv_range_2_0= RULE_RANGE ) ) otherlv_3= RightParenthesis ( ( (lv_numType_4_0= RULE_NULL ) ) ( (lv_strType_5_0= RULE_NULL ) ) ( (lv_dateType_6_0= RULE_NULL ) ) ( (lv_boolType_7_0= RULE_NULL ) ) )? ) | ( () ( ( LeftParenthesis )=>otherlv_9= LeftParenthesis ) ( (lv_range_10_0= RULE_RANGEINF ) ) otherlv_11= RightParenthesis ( ( (lv_numType_12_0= RULE_NULL ) ) ( (lv_strType_13_0= RULE_NULL ) ) ( (lv_dateType_14_0= RULE_NULL ) ) ( (lv_boolType_15_0= RULE_NULL ) ) )? ) ) )
            // InternalDdParser.g:2516:2: ( ( () otherlv_1= LeftParenthesis ( (lv_range_2_0= RULE_RANGE ) ) otherlv_3= RightParenthesis ( ( (lv_numType_4_0= RULE_NULL ) ) ( (lv_strType_5_0= RULE_NULL ) ) ( (lv_dateType_6_0= RULE_NULL ) ) ( (lv_boolType_7_0= RULE_NULL ) ) )? ) | ( () ( ( LeftParenthesis )=>otherlv_9= LeftParenthesis ) ( (lv_range_10_0= RULE_RANGEINF ) ) otherlv_11= RightParenthesis ( ( (lv_numType_12_0= RULE_NULL ) ) ( (lv_strType_13_0= RULE_NULL ) ) ( (lv_dateType_14_0= RULE_NULL ) ) ( (lv_boolType_15_0= RULE_NULL ) ) )? ) )
            {
            // InternalDdParser.g:2516:2: ( ( () otherlv_1= LeftParenthesis ( (lv_range_2_0= RULE_RANGE ) ) otherlv_3= RightParenthesis ( ( (lv_numType_4_0= RULE_NULL ) ) ( (lv_strType_5_0= RULE_NULL ) ) ( (lv_dateType_6_0= RULE_NULL ) ) ( (lv_boolType_7_0= RULE_NULL ) ) )? ) | ( () ( ( LeftParenthesis )=>otherlv_9= LeftParenthesis ) ( (lv_range_10_0= RULE_RANGEINF ) ) otherlv_11= RightParenthesis ( ( (lv_numType_12_0= RULE_NULL ) ) ( (lv_strType_13_0= RULE_NULL ) ) ( (lv_dateType_14_0= RULE_NULL ) ) ( (lv_boolType_15_0= RULE_NULL ) ) )? ) )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==LeftParenthesis) ) {
                int LA40_1 = input.LA(2);

                if ( (LA40_1==RULE_RANGE) ) {
                    alt40=1;
                }
                else if ( (LA40_1==RULE_RANGEINF) ) {
                    alt40=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 40, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalDdParser.g:2517:3: ( () otherlv_1= LeftParenthesis ( (lv_range_2_0= RULE_RANGE ) ) otherlv_3= RightParenthesis ( ( (lv_numType_4_0= RULE_NULL ) ) ( (lv_strType_5_0= RULE_NULL ) ) ( (lv_dateType_6_0= RULE_NULL ) ) ( (lv_boolType_7_0= RULE_NULL ) ) )? )
                    {
                    // InternalDdParser.g:2517:3: ( () otherlv_1= LeftParenthesis ( (lv_range_2_0= RULE_RANGE ) ) otherlv_3= RightParenthesis ( ( (lv_numType_4_0= RULE_NULL ) ) ( (lv_strType_5_0= RULE_NULL ) ) ( (lv_dateType_6_0= RULE_NULL ) ) ( (lv_boolType_7_0= RULE_NULL ) ) )? )
                    // InternalDdParser.g:2518:4: () otherlv_1= LeftParenthesis ( (lv_range_2_0= RULE_RANGE ) ) otherlv_3= RightParenthesis ( ( (lv_numType_4_0= RULE_NULL ) ) ( (lv_strType_5_0= RULE_NULL ) ) ( (lv_dateType_6_0= RULE_NULL ) ) ( (lv_boolType_7_0= RULE_NULL ) ) )?
                    {
                    // InternalDdParser.g:2518:4: ()
                    // InternalDdParser.g:2519:5: 
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
                    // InternalDdParser.g:2529:4: ( (lv_range_2_0= RULE_RANGE ) )
                    // InternalDdParser.g:2530:5: (lv_range_2_0= RULE_RANGE )
                    {
                    // InternalDdParser.g:2530:5: (lv_range_2_0= RULE_RANGE )
                    // InternalDdParser.g:2531:6: lv_range_2_0= RULE_RANGE
                    {
                    lv_range_2_0=(Token)match(input,RULE_RANGE,FOLLOW_28); if (state.failed) return current;
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

                    otherlv_3=(Token)match(input,RightParenthesis,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getRangeExpressionAccess().getRightParenthesisKeyword_0_3());
                      			
                    }
                    // InternalDdParser.g:2551:4: ( ( (lv_numType_4_0= RULE_NULL ) ) ( (lv_strType_5_0= RULE_NULL ) ) ( (lv_dateType_6_0= RULE_NULL ) ) ( (lv_boolType_7_0= RULE_NULL ) ) )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==RULE_NULL) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // InternalDdParser.g:2552:5: ( (lv_numType_4_0= RULE_NULL ) ) ( (lv_strType_5_0= RULE_NULL ) ) ( (lv_dateType_6_0= RULE_NULL ) ) ( (lv_boolType_7_0= RULE_NULL ) )
                            {
                            // InternalDdParser.g:2552:5: ( (lv_numType_4_0= RULE_NULL ) )
                            // InternalDdParser.g:2553:6: (lv_numType_4_0= RULE_NULL )
                            {
                            // InternalDdParser.g:2553:6: (lv_numType_4_0= RULE_NULL )
                            // InternalDdParser.g:2554:7: lv_numType_4_0= RULE_NULL
                            {
                            lv_numType_4_0=(Token)match(input,RULE_NULL,FOLLOW_37); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_numType_4_0, grammarAccess.getRangeExpressionAccess().getNumTypeNULLTerminalRuleCall_0_4_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getRangeExpressionRule());
                              							}
                              							setWithLastConsumed(
                              								current,
                              								"numType",
                              								lv_numType_4_0 != null,
                              								"com.shark.lang.Dd.NULL");
                              						
                            }

                            }


                            }

                            // InternalDdParser.g:2570:5: ( (lv_strType_5_0= RULE_NULL ) )
                            // InternalDdParser.g:2571:6: (lv_strType_5_0= RULE_NULL )
                            {
                            // InternalDdParser.g:2571:6: (lv_strType_5_0= RULE_NULL )
                            // InternalDdParser.g:2572:7: lv_strType_5_0= RULE_NULL
                            {
                            lv_strType_5_0=(Token)match(input,RULE_NULL,FOLLOW_37); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_strType_5_0, grammarAccess.getRangeExpressionAccess().getStrTypeNULLTerminalRuleCall_0_4_1_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getRangeExpressionRule());
                              							}
                              							setWithLastConsumed(
                              								current,
                              								"strType",
                              								lv_strType_5_0 != null,
                              								"com.shark.lang.Dd.NULL");
                              						
                            }

                            }


                            }

                            // InternalDdParser.g:2588:5: ( (lv_dateType_6_0= RULE_NULL ) )
                            // InternalDdParser.g:2589:6: (lv_dateType_6_0= RULE_NULL )
                            {
                            // InternalDdParser.g:2589:6: (lv_dateType_6_0= RULE_NULL )
                            // InternalDdParser.g:2590:7: lv_dateType_6_0= RULE_NULL
                            {
                            lv_dateType_6_0=(Token)match(input,RULE_NULL,FOLLOW_37); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_dateType_6_0, grammarAccess.getRangeExpressionAccess().getDateTypeNULLTerminalRuleCall_0_4_2_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getRangeExpressionRule());
                              							}
                              							setWithLastConsumed(
                              								current,
                              								"dateType",
                              								lv_dateType_6_0 != null,
                              								"com.shark.lang.Dd.NULL");
                              						
                            }

                            }


                            }

                            // InternalDdParser.g:2606:5: ( (lv_boolType_7_0= RULE_NULL ) )
                            // InternalDdParser.g:2607:6: (lv_boolType_7_0= RULE_NULL )
                            {
                            // InternalDdParser.g:2607:6: (lv_boolType_7_0= RULE_NULL )
                            // InternalDdParser.g:2608:7: lv_boolType_7_0= RULE_NULL
                            {
                            lv_boolType_7_0=(Token)match(input,RULE_NULL,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_boolType_7_0, grammarAccess.getRangeExpressionAccess().getBoolTypeNULLTerminalRuleCall_0_4_3_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getRangeExpressionRule());
                              							}
                              							setWithLastConsumed(
                              								current,
                              								"boolType",
                              								lv_boolType_7_0 != null,
                              								"com.shark.lang.Dd.NULL");
                              						
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDdParser.g:2627:3: ( () ( ( LeftParenthesis )=>otherlv_9= LeftParenthesis ) ( (lv_range_10_0= RULE_RANGEINF ) ) otherlv_11= RightParenthesis ( ( (lv_numType_12_0= RULE_NULL ) ) ( (lv_strType_13_0= RULE_NULL ) ) ( (lv_dateType_14_0= RULE_NULL ) ) ( (lv_boolType_15_0= RULE_NULL ) ) )? )
                    {
                    // InternalDdParser.g:2627:3: ( () ( ( LeftParenthesis )=>otherlv_9= LeftParenthesis ) ( (lv_range_10_0= RULE_RANGEINF ) ) otherlv_11= RightParenthesis ( ( (lv_numType_12_0= RULE_NULL ) ) ( (lv_strType_13_0= RULE_NULL ) ) ( (lv_dateType_14_0= RULE_NULL ) ) ( (lv_boolType_15_0= RULE_NULL ) ) )? )
                    // InternalDdParser.g:2628:4: () ( ( LeftParenthesis )=>otherlv_9= LeftParenthesis ) ( (lv_range_10_0= RULE_RANGEINF ) ) otherlv_11= RightParenthesis ( ( (lv_numType_12_0= RULE_NULL ) ) ( (lv_strType_13_0= RULE_NULL ) ) ( (lv_dateType_14_0= RULE_NULL ) ) ( (lv_boolType_15_0= RULE_NULL ) ) )?
                    {
                    // InternalDdParser.g:2628:4: ()
                    // InternalDdParser.g:2629:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getRangeExpressionAccess().getListExpressionAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalDdParser.g:2635:4: ( ( LeftParenthesis )=>otherlv_9= LeftParenthesis )
                    // InternalDdParser.g:2636:5: ( LeftParenthesis )=>otherlv_9= LeftParenthesis
                    {
                    otherlv_9=(Token)match(input,LeftParenthesis,FOLLOW_50); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_9, grammarAccess.getRangeExpressionAccess().getLeftParenthesisKeyword_1_1());
                      				
                    }

                    }

                    // InternalDdParser.g:2642:4: ( (lv_range_10_0= RULE_RANGEINF ) )
                    // InternalDdParser.g:2643:5: (lv_range_10_0= RULE_RANGEINF )
                    {
                    // InternalDdParser.g:2643:5: (lv_range_10_0= RULE_RANGEINF )
                    // InternalDdParser.g:2644:6: lv_range_10_0= RULE_RANGEINF
                    {
                    lv_range_10_0=(Token)match(input,RULE_RANGEINF,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_range_10_0, grammarAccess.getRangeExpressionAccess().getRangeRANGEINFTerminalRuleCall_1_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getRangeExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"range",
                      							lv_range_10_0,
                      							"com.shark.lang.Dd.RANGEINF");
                      					
                    }

                    }


                    }

                    otherlv_11=(Token)match(input,RightParenthesis,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getRangeExpressionAccess().getRightParenthesisKeyword_1_3());
                      			
                    }
                    // InternalDdParser.g:2664:4: ( ( (lv_numType_12_0= RULE_NULL ) ) ( (lv_strType_13_0= RULE_NULL ) ) ( (lv_dateType_14_0= RULE_NULL ) ) ( (lv_boolType_15_0= RULE_NULL ) ) )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==RULE_NULL) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // InternalDdParser.g:2665:5: ( (lv_numType_12_0= RULE_NULL ) ) ( (lv_strType_13_0= RULE_NULL ) ) ( (lv_dateType_14_0= RULE_NULL ) ) ( (lv_boolType_15_0= RULE_NULL ) )
                            {
                            // InternalDdParser.g:2665:5: ( (lv_numType_12_0= RULE_NULL ) )
                            // InternalDdParser.g:2666:6: (lv_numType_12_0= RULE_NULL )
                            {
                            // InternalDdParser.g:2666:6: (lv_numType_12_0= RULE_NULL )
                            // InternalDdParser.g:2667:7: lv_numType_12_0= RULE_NULL
                            {
                            lv_numType_12_0=(Token)match(input,RULE_NULL,FOLLOW_37); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_numType_12_0, grammarAccess.getRangeExpressionAccess().getNumTypeNULLTerminalRuleCall_1_4_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getRangeExpressionRule());
                              							}
                              							setWithLastConsumed(
                              								current,
                              								"numType",
                              								lv_numType_12_0 != null,
                              								"com.shark.lang.Dd.NULL");
                              						
                            }

                            }


                            }

                            // InternalDdParser.g:2683:5: ( (lv_strType_13_0= RULE_NULL ) )
                            // InternalDdParser.g:2684:6: (lv_strType_13_0= RULE_NULL )
                            {
                            // InternalDdParser.g:2684:6: (lv_strType_13_0= RULE_NULL )
                            // InternalDdParser.g:2685:7: lv_strType_13_0= RULE_NULL
                            {
                            lv_strType_13_0=(Token)match(input,RULE_NULL,FOLLOW_37); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_strType_13_0, grammarAccess.getRangeExpressionAccess().getStrTypeNULLTerminalRuleCall_1_4_1_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getRangeExpressionRule());
                              							}
                              							setWithLastConsumed(
                              								current,
                              								"strType",
                              								lv_strType_13_0 != null,
                              								"com.shark.lang.Dd.NULL");
                              						
                            }

                            }


                            }

                            // InternalDdParser.g:2701:5: ( (lv_dateType_14_0= RULE_NULL ) )
                            // InternalDdParser.g:2702:6: (lv_dateType_14_0= RULE_NULL )
                            {
                            // InternalDdParser.g:2702:6: (lv_dateType_14_0= RULE_NULL )
                            // InternalDdParser.g:2703:7: lv_dateType_14_0= RULE_NULL
                            {
                            lv_dateType_14_0=(Token)match(input,RULE_NULL,FOLLOW_37); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_dateType_14_0, grammarAccess.getRangeExpressionAccess().getDateTypeNULLTerminalRuleCall_1_4_2_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getRangeExpressionRule());
                              							}
                              							setWithLastConsumed(
                              								current,
                              								"dateType",
                              								lv_dateType_14_0 != null,
                              								"com.shark.lang.Dd.NULL");
                              						
                            }

                            }


                            }

                            // InternalDdParser.g:2719:5: ( (lv_boolType_15_0= RULE_NULL ) )
                            // InternalDdParser.g:2720:6: (lv_boolType_15_0= RULE_NULL )
                            {
                            // InternalDdParser.g:2720:6: (lv_boolType_15_0= RULE_NULL )
                            // InternalDdParser.g:2721:7: lv_boolType_15_0= RULE_NULL
                            {
                            lv_boolType_15_0=(Token)match(input,RULE_NULL,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_boolType_15_0, grammarAccess.getRangeExpressionAccess().getBoolTypeNULLTerminalRuleCall_1_4_3_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getRangeExpressionRule());
                              							}
                              							setWithLastConsumed(
                              								current,
                              								"boolType",
                              								lv_boolType_15_0 != null,
                              								"com.shark.lang.Dd.NULL");
                              						
                            }

                            }


                            }


                            }
                            break;

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
    // InternalDdParser.g:2743:1: entryRuleTerminalExpression returns [EObject current=null] : iv_ruleTerminalExpression= ruleTerminalExpression EOF ;
    public final EObject entryRuleTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalExpression = null;


        try {
            // InternalDdParser.g:2743:59: (iv_ruleTerminalExpression= ruleTerminalExpression EOF )
            // InternalDdParser.g:2744:2: iv_ruleTerminalExpression= ruleTerminalExpression EOF
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
    // InternalDdParser.g:2750:1: ruleTerminalExpression returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_STR ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( (lv_value_5_0= RULE_DEC ) ) ) | ( () ( (lv_value_7_0= RULE_CHR ) ) ) | ( () ( (otherlv_9= RULE_CSTID ) ) ) | ( () ( (lv_value_11_0= ruleBoolean ) ) ) | ( () ( (lv_value_13_0= ruleUnset ) ) ) ) ;
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
            // InternalDdParser.g:2756:2: ( ( ( () ( (lv_value_1_0= RULE_STR ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( (lv_value_5_0= RULE_DEC ) ) ) | ( () ( (lv_value_7_0= RULE_CHR ) ) ) | ( () ( (otherlv_9= RULE_CSTID ) ) ) | ( () ( (lv_value_11_0= ruleBoolean ) ) ) | ( () ( (lv_value_13_0= ruleUnset ) ) ) ) )
            // InternalDdParser.g:2757:2: ( ( () ( (lv_value_1_0= RULE_STR ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( (lv_value_5_0= RULE_DEC ) ) ) | ( () ( (lv_value_7_0= RULE_CHR ) ) ) | ( () ( (otherlv_9= RULE_CSTID ) ) ) | ( () ( (lv_value_11_0= ruleBoolean ) ) ) | ( () ( (lv_value_13_0= ruleUnset ) ) ) )
            {
            // InternalDdParser.g:2757:2: ( ( () ( (lv_value_1_0= RULE_STR ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( (lv_value_5_0= RULE_DEC ) ) ) | ( () ( (lv_value_7_0= RULE_CHR ) ) ) | ( () ( (otherlv_9= RULE_CSTID ) ) ) | ( () ( (lv_value_11_0= ruleBoolean ) ) ) | ( () ( (lv_value_13_0= ruleUnset ) ) ) )
            int alt41=7;
            switch ( input.LA(1) ) {
            case RULE_STR:
                {
                alt41=1;
                }
                break;
            case RULE_INT:
                {
                alt41=2;
                }
                break;
            case RULE_DEC:
                {
                alt41=3;
                }
                break;
            case RULE_CHR:
                {
                alt41=4;
                }
                break;
            case RULE_CSTID:
                {
                alt41=5;
                }
                break;
            case False:
            case True:
                {
                alt41=6;
                }
                break;
            case Unset:
                {
                alt41=7;
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
                    // InternalDdParser.g:2758:3: ( () ( (lv_value_1_0= RULE_STR ) ) )
                    {
                    // InternalDdParser.g:2758:3: ( () ( (lv_value_1_0= RULE_STR ) ) )
                    // InternalDdParser.g:2759:4: () ( (lv_value_1_0= RULE_STR ) )
                    {
                    // InternalDdParser.g:2759:4: ()
                    // InternalDdParser.g:2760:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalExpressionAccess().getStrValueAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalDdParser.g:2766:4: ( (lv_value_1_0= RULE_STR ) )
                    // InternalDdParser.g:2767:5: (lv_value_1_0= RULE_STR )
                    {
                    // InternalDdParser.g:2767:5: (lv_value_1_0= RULE_STR )
                    // InternalDdParser.g:2768:6: lv_value_1_0= RULE_STR
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
                    // InternalDdParser.g:2786:3: ( () ( (lv_value_3_0= RULE_INT ) ) )
                    {
                    // InternalDdParser.g:2786:3: ( () ( (lv_value_3_0= RULE_INT ) ) )
                    // InternalDdParser.g:2787:4: () ( (lv_value_3_0= RULE_INT ) )
                    {
                    // InternalDdParser.g:2787:4: ()
                    // InternalDdParser.g:2788:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalExpressionAccess().getIntValueAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalDdParser.g:2794:4: ( (lv_value_3_0= RULE_INT ) )
                    // InternalDdParser.g:2795:5: (lv_value_3_0= RULE_INT )
                    {
                    // InternalDdParser.g:2795:5: (lv_value_3_0= RULE_INT )
                    // InternalDdParser.g:2796:6: lv_value_3_0= RULE_INT
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
                    // InternalDdParser.g:2814:3: ( () ( (lv_value_5_0= RULE_DEC ) ) )
                    {
                    // InternalDdParser.g:2814:3: ( () ( (lv_value_5_0= RULE_DEC ) ) )
                    // InternalDdParser.g:2815:4: () ( (lv_value_5_0= RULE_DEC ) )
                    {
                    // InternalDdParser.g:2815:4: ()
                    // InternalDdParser.g:2816:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalExpressionAccess().getDecValueAction_2_0(),
                      						current);
                      				
                    }

                    }

                    // InternalDdParser.g:2822:4: ( (lv_value_5_0= RULE_DEC ) )
                    // InternalDdParser.g:2823:5: (lv_value_5_0= RULE_DEC )
                    {
                    // InternalDdParser.g:2823:5: (lv_value_5_0= RULE_DEC )
                    // InternalDdParser.g:2824:6: lv_value_5_0= RULE_DEC
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
                    // InternalDdParser.g:2842:3: ( () ( (lv_value_7_0= RULE_CHR ) ) )
                    {
                    // InternalDdParser.g:2842:3: ( () ( (lv_value_7_0= RULE_CHR ) ) )
                    // InternalDdParser.g:2843:4: () ( (lv_value_7_0= RULE_CHR ) )
                    {
                    // InternalDdParser.g:2843:4: ()
                    // InternalDdParser.g:2844:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalExpressionAccess().getChrValueAction_3_0(),
                      						current);
                      				
                    }

                    }

                    // InternalDdParser.g:2850:4: ( (lv_value_7_0= RULE_CHR ) )
                    // InternalDdParser.g:2851:5: (lv_value_7_0= RULE_CHR )
                    {
                    // InternalDdParser.g:2851:5: (lv_value_7_0= RULE_CHR )
                    // InternalDdParser.g:2852:6: lv_value_7_0= RULE_CHR
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
                    // InternalDdParser.g:2870:3: ( () ( (otherlv_9= RULE_CSTID ) ) )
                    {
                    // InternalDdParser.g:2870:3: ( () ( (otherlv_9= RULE_CSTID ) ) )
                    // InternalDdParser.g:2871:4: () ( (otherlv_9= RULE_CSTID ) )
                    {
                    // InternalDdParser.g:2871:4: ()
                    // InternalDdParser.g:2872:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalExpressionAccess().getCstValueAction_4_0(),
                      						current);
                      				
                    }

                    }

                    // InternalDdParser.g:2878:4: ( (otherlv_9= RULE_CSTID ) )
                    // InternalDdParser.g:2879:5: (otherlv_9= RULE_CSTID )
                    {
                    // InternalDdParser.g:2879:5: (otherlv_9= RULE_CSTID )
                    // InternalDdParser.g:2880:6: otherlv_9= RULE_CSTID
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
                    // InternalDdParser.g:2893:3: ( () ( (lv_value_11_0= ruleBoolean ) ) )
                    {
                    // InternalDdParser.g:2893:3: ( () ( (lv_value_11_0= ruleBoolean ) ) )
                    // InternalDdParser.g:2894:4: () ( (lv_value_11_0= ruleBoolean ) )
                    {
                    // InternalDdParser.g:2894:4: ()
                    // InternalDdParser.g:2895:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalExpressionAccess().getBoolValueAction_5_0(),
                      						current);
                      				
                    }

                    }

                    // InternalDdParser.g:2901:4: ( (lv_value_11_0= ruleBoolean ) )
                    // InternalDdParser.g:2902:5: (lv_value_11_0= ruleBoolean )
                    {
                    // InternalDdParser.g:2902:5: (lv_value_11_0= ruleBoolean )
                    // InternalDdParser.g:2903:6: lv_value_11_0= ruleBoolean
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
                    // InternalDdParser.g:2922:3: ( () ( (lv_value_13_0= ruleUnset ) ) )
                    {
                    // InternalDdParser.g:2922:3: ( () ( (lv_value_13_0= ruleUnset ) ) )
                    // InternalDdParser.g:2923:4: () ( (lv_value_13_0= ruleUnset ) )
                    {
                    // InternalDdParser.g:2923:4: ()
                    // InternalDdParser.g:2924:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalExpressionAccess().getUnsetValueAction_6_0(),
                      						current);
                      				
                    }

                    }

                    // InternalDdParser.g:2930:4: ( (lv_value_13_0= ruleUnset ) )
                    // InternalDdParser.g:2931:5: (lv_value_13_0= ruleUnset )
                    {
                    // InternalDdParser.g:2931:5: (lv_value_13_0= ruleUnset )
                    // InternalDdParser.g:2932:6: lv_value_13_0= ruleUnset
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
    // InternalDdParser.g:2954:1: entryRuleIdentifierExpression returns [EObject current=null] : iv_ruleIdentifierExpression= ruleIdentifierExpression EOF ;
    public final EObject entryRuleIdentifierExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdentifierExpression = null;


        try {
            // InternalDdParser.g:2954:61: (iv_ruleIdentifierExpression= ruleIdentifierExpression EOF )
            // InternalDdParser.g:2955:2: iv_ruleIdentifierExpression= ruleIdentifierExpression EOF
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
    // InternalDdParser.g:2961:1: ruleIdentifierExpression returns [EObject current=null] : ( () ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleIdentifierExpression() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalDdParser.g:2967:2: ( ( () ( ( ruleQualifiedName ) ) ) )
            // InternalDdParser.g:2968:2: ( () ( ( ruleQualifiedName ) ) )
            {
            // InternalDdParser.g:2968:2: ( () ( ( ruleQualifiedName ) ) )
            // InternalDdParser.g:2969:3: () ( ( ruleQualifiedName ) )
            {
            // InternalDdParser.g:2969:3: ()
            // InternalDdParser.g:2970:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getIdentifierExpressionAccess().getIdentifierExpressionAction_0(),
              					current);
              			
            }

            }

            // InternalDdParser.g:2976:3: ( ( ruleQualifiedName ) )
            // InternalDdParser.g:2977:4: ( ruleQualifiedName )
            {
            // InternalDdParser.g:2977:4: ( ruleQualifiedName )
            // InternalDdParser.g:2978:5: ruleQualifiedName
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
    // InternalDdParser.g:2996:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalDdParser.g:2996:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalDdParser.g:2997:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalDdParser.g:3003:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_OBJID_0= RULE_OBJID kw= FullStop )? this_ID_2= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_OBJID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalDdParser.g:3009:2: ( ( (this_OBJID_0= RULE_OBJID kw= FullStop )? this_ID_2= RULE_ID ) )
            // InternalDdParser.g:3010:2: ( (this_OBJID_0= RULE_OBJID kw= FullStop )? this_ID_2= RULE_ID )
            {
            // InternalDdParser.g:3010:2: ( (this_OBJID_0= RULE_OBJID kw= FullStop )? this_ID_2= RULE_ID )
            // InternalDdParser.g:3011:3: (this_OBJID_0= RULE_OBJID kw= FullStop )? this_ID_2= RULE_ID
            {
            // InternalDdParser.g:3011:3: (this_OBJID_0= RULE_OBJID kw= FullStop )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_OBJID) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalDdParser.g:3012:4: this_OBJID_0= RULE_OBJID kw= FullStop
                    {
                    this_OBJID_0=(Token)match(input,RULE_OBJID,FOLLOW_51); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_OBJID_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_OBJID_0, grammarAccess.getQualifiedNameAccess().getOBJIDTerminalRuleCall_0_0());
                      			
                    }
                    kw=(Token)match(input,FullStop,FOLLOW_15); if (state.failed) return current;
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
    // InternalDdParser.g:3036:1: entryRuleLineComment returns [EObject current=null] : iv_ruleLineComment= ruleLineComment EOF ;
    public final EObject entryRuleLineComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLineComment = null;


        try {
            // InternalDdParser.g:3036:52: (iv_ruleLineComment= ruleLineComment EOF )
            // InternalDdParser.g:3037:2: iv_ruleLineComment= ruleLineComment EOF
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
    // InternalDdParser.g:3043:1: ruleLineComment returns [EObject current=null] : ( () ( (lv_line_1_0= RULE_CMT ) ) this_EOL_2= RULE_EOL ) ;
    public final EObject ruleLineComment() throws RecognitionException {
        EObject current = null;

        Token lv_line_1_0=null;
        Token this_EOL_2=null;


        	enterRule();

        try {
            // InternalDdParser.g:3049:2: ( ( () ( (lv_line_1_0= RULE_CMT ) ) this_EOL_2= RULE_EOL ) )
            // InternalDdParser.g:3050:2: ( () ( (lv_line_1_0= RULE_CMT ) ) this_EOL_2= RULE_EOL )
            {
            // InternalDdParser.g:3050:2: ( () ( (lv_line_1_0= RULE_CMT ) ) this_EOL_2= RULE_EOL )
            // InternalDdParser.g:3051:3: () ( (lv_line_1_0= RULE_CMT ) ) this_EOL_2= RULE_EOL
            {
            // InternalDdParser.g:3051:3: ()
            // InternalDdParser.g:3052:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getLineCommentAccess().getCommentAction_0(),
              					current);
              			
            }

            }

            // InternalDdParser.g:3058:3: ( (lv_line_1_0= RULE_CMT ) )
            // InternalDdParser.g:3059:4: (lv_line_1_0= RULE_CMT )
            {
            // InternalDdParser.g:3059:4: (lv_line_1_0= RULE_CMT )
            // InternalDdParser.g:3060:5: lv_line_1_0= RULE_CMT
            {
            lv_line_1_0=(Token)match(input,RULE_CMT,FOLLOW_12); if (state.failed) return current;
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
    // InternalDdParser.g:3084:1: entryRuleTrailComment returns [EObject current=null] : iv_ruleTrailComment= ruleTrailComment EOF ;
    public final EObject entryRuleTrailComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrailComment = null;


        try {
            // InternalDdParser.g:3084:53: (iv_ruleTrailComment= ruleTrailComment EOF )
            // InternalDdParser.g:3085:2: iv_ruleTrailComment= ruleTrailComment EOF
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
    // InternalDdParser.g:3091:1: ruleTrailComment returns [EObject current=null] : ( () ( (lv_line_1_0= RULE_CMT ) ) ) ;
    public final EObject ruleTrailComment() throws RecognitionException {
        EObject current = null;

        Token lv_line_1_0=null;


        	enterRule();

        try {
            // InternalDdParser.g:3097:2: ( ( () ( (lv_line_1_0= RULE_CMT ) ) ) )
            // InternalDdParser.g:3098:2: ( () ( (lv_line_1_0= RULE_CMT ) ) )
            {
            // InternalDdParser.g:3098:2: ( () ( (lv_line_1_0= RULE_CMT ) ) )
            // InternalDdParser.g:3099:3: () ( (lv_line_1_0= RULE_CMT ) )
            {
            // InternalDdParser.g:3099:3: ()
            // InternalDdParser.g:3100:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getTrailCommentAccess().getCommentAction_0(),
              					current);
              			
            }

            }

            // InternalDdParser.g:3106:3: ( (lv_line_1_0= RULE_CMT ) )
            // InternalDdParser.g:3107:4: (lv_line_1_0= RULE_CMT )
            {
            // InternalDdParser.g:3107:4: (lv_line_1_0= RULE_CMT )
            // InternalDdParser.g:3108:5: lv_line_1_0= RULE_CMT
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
    // InternalDdParser.g:3128:1: ruleBinaryOperator returns [Enumerator current=null] : ( (enumLiteral_0= Or ) | (enumLiteral_1= And ) | (enumLiteral_2= PlusSign ) | (enumLiteral_3= HyphenMinus ) | (enumLiteral_4= Asterisk ) | (enumLiteral_5= Solidus ) | (enumLiteral_6= PercentSign ) | (enumLiteral_7= EqualsSignEqualsSign ) | (enumLiteral_8= GreaterThanSign ) | (enumLiteral_9= LessThanSign ) | (enumLiteral_10= LessThanSignEqualsSign ) | (enumLiteral_11= GreaterThanSignEqualsSign ) | (enumLiteral_12= CircumflexAccent ) | (enumLiteral_13= Like ) | (enumLiteral_14= ExclamationMarkEqualsSign ) | (enumLiteral_15= Ampersand ) | (enumLiteral_16= In ) | (enumLiteral_17= Stxt ) | (enumLiteral_18= Round ) ) ;
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
            // InternalDdParser.g:3134:2: ( ( (enumLiteral_0= Or ) | (enumLiteral_1= And ) | (enumLiteral_2= PlusSign ) | (enumLiteral_3= HyphenMinus ) | (enumLiteral_4= Asterisk ) | (enumLiteral_5= Solidus ) | (enumLiteral_6= PercentSign ) | (enumLiteral_7= EqualsSignEqualsSign ) | (enumLiteral_8= GreaterThanSign ) | (enumLiteral_9= LessThanSign ) | (enumLiteral_10= LessThanSignEqualsSign ) | (enumLiteral_11= GreaterThanSignEqualsSign ) | (enumLiteral_12= CircumflexAccent ) | (enumLiteral_13= Like ) | (enumLiteral_14= ExclamationMarkEqualsSign ) | (enumLiteral_15= Ampersand ) | (enumLiteral_16= In ) | (enumLiteral_17= Stxt ) | (enumLiteral_18= Round ) ) )
            // InternalDdParser.g:3135:2: ( (enumLiteral_0= Or ) | (enumLiteral_1= And ) | (enumLiteral_2= PlusSign ) | (enumLiteral_3= HyphenMinus ) | (enumLiteral_4= Asterisk ) | (enumLiteral_5= Solidus ) | (enumLiteral_6= PercentSign ) | (enumLiteral_7= EqualsSignEqualsSign ) | (enumLiteral_8= GreaterThanSign ) | (enumLiteral_9= LessThanSign ) | (enumLiteral_10= LessThanSignEqualsSign ) | (enumLiteral_11= GreaterThanSignEqualsSign ) | (enumLiteral_12= CircumflexAccent ) | (enumLiteral_13= Like ) | (enumLiteral_14= ExclamationMarkEqualsSign ) | (enumLiteral_15= Ampersand ) | (enumLiteral_16= In ) | (enumLiteral_17= Stxt ) | (enumLiteral_18= Round ) )
            {
            // InternalDdParser.g:3135:2: ( (enumLiteral_0= Or ) | (enumLiteral_1= And ) | (enumLiteral_2= PlusSign ) | (enumLiteral_3= HyphenMinus ) | (enumLiteral_4= Asterisk ) | (enumLiteral_5= Solidus ) | (enumLiteral_6= PercentSign ) | (enumLiteral_7= EqualsSignEqualsSign ) | (enumLiteral_8= GreaterThanSign ) | (enumLiteral_9= LessThanSign ) | (enumLiteral_10= LessThanSignEqualsSign ) | (enumLiteral_11= GreaterThanSignEqualsSign ) | (enumLiteral_12= CircumflexAccent ) | (enumLiteral_13= Like ) | (enumLiteral_14= ExclamationMarkEqualsSign ) | (enumLiteral_15= Ampersand ) | (enumLiteral_16= In ) | (enumLiteral_17= Stxt ) | (enumLiteral_18= Round ) )
            int alt43=19;
            switch ( input.LA(1) ) {
            case Or:
                {
                alt43=1;
                }
                break;
            case And:
                {
                alt43=2;
                }
                break;
            case PlusSign:
                {
                alt43=3;
                }
                break;
            case HyphenMinus:
                {
                alt43=4;
                }
                break;
            case Asterisk:
                {
                alt43=5;
                }
                break;
            case Solidus:
                {
                alt43=6;
                }
                break;
            case PercentSign:
                {
                alt43=7;
                }
                break;
            case EqualsSignEqualsSign:
                {
                alt43=8;
                }
                break;
            case GreaterThanSign:
                {
                alt43=9;
                }
                break;
            case LessThanSign:
                {
                alt43=10;
                }
                break;
            case LessThanSignEqualsSign:
                {
                alt43=11;
                }
                break;
            case GreaterThanSignEqualsSign:
                {
                alt43=12;
                }
                break;
            case CircumflexAccent:
                {
                alt43=13;
                }
                break;
            case Like:
                {
                alt43=14;
                }
                break;
            case ExclamationMarkEqualsSign:
                {
                alt43=15;
                }
                break;
            case Ampersand:
                {
                alt43=16;
                }
                break;
            case In:
                {
                alt43=17;
                }
                break;
            case Stxt:
                {
                alt43=18;
                }
                break;
            case Round:
                {
                alt43=19;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // InternalDdParser.g:3136:3: (enumLiteral_0= Or )
                    {
                    // InternalDdParser.g:3136:3: (enumLiteral_0= Or )
                    // InternalDdParser.g:3137:4: enumLiteral_0= Or
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
                    // InternalDdParser.g:3144:3: (enumLiteral_1= And )
                    {
                    // InternalDdParser.g:3144:3: (enumLiteral_1= And )
                    // InternalDdParser.g:3145:4: enumLiteral_1= And
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
                    // InternalDdParser.g:3152:3: (enumLiteral_2= PlusSign )
                    {
                    // InternalDdParser.g:3152:3: (enumLiteral_2= PlusSign )
                    // InternalDdParser.g:3153:4: enumLiteral_2= PlusSign
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
                    // InternalDdParser.g:3160:3: (enumLiteral_3= HyphenMinus )
                    {
                    // InternalDdParser.g:3160:3: (enumLiteral_3= HyphenMinus )
                    // InternalDdParser.g:3161:4: enumLiteral_3= HyphenMinus
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
                    // InternalDdParser.g:3168:3: (enumLiteral_4= Asterisk )
                    {
                    // InternalDdParser.g:3168:3: (enumLiteral_4= Asterisk )
                    // InternalDdParser.g:3169:4: enumLiteral_4= Asterisk
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
                    // InternalDdParser.g:3176:3: (enumLiteral_5= Solidus )
                    {
                    // InternalDdParser.g:3176:3: (enumLiteral_5= Solidus )
                    // InternalDdParser.g:3177:4: enumLiteral_5= Solidus
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
                    // InternalDdParser.g:3184:3: (enumLiteral_6= PercentSign )
                    {
                    // InternalDdParser.g:3184:3: (enumLiteral_6= PercentSign )
                    // InternalDdParser.g:3185:4: enumLiteral_6= PercentSign
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
                    // InternalDdParser.g:3192:3: (enumLiteral_7= EqualsSignEqualsSign )
                    {
                    // InternalDdParser.g:3192:3: (enumLiteral_7= EqualsSignEqualsSign )
                    // InternalDdParser.g:3193:4: enumLiteral_7= EqualsSignEqualsSign
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
                    // InternalDdParser.g:3200:3: (enumLiteral_8= GreaterThanSign )
                    {
                    // InternalDdParser.g:3200:3: (enumLiteral_8= GreaterThanSign )
                    // InternalDdParser.g:3201:4: enumLiteral_8= GreaterThanSign
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
                    // InternalDdParser.g:3208:3: (enumLiteral_9= LessThanSign )
                    {
                    // InternalDdParser.g:3208:3: (enumLiteral_9= LessThanSign )
                    // InternalDdParser.g:3209:4: enumLiteral_9= LessThanSign
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
                    // InternalDdParser.g:3216:3: (enumLiteral_10= LessThanSignEqualsSign )
                    {
                    // InternalDdParser.g:3216:3: (enumLiteral_10= LessThanSignEqualsSign )
                    // InternalDdParser.g:3217:4: enumLiteral_10= LessThanSignEqualsSign
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
                    // InternalDdParser.g:3224:3: (enumLiteral_11= GreaterThanSignEqualsSign )
                    {
                    // InternalDdParser.g:3224:3: (enumLiteral_11= GreaterThanSignEqualsSign )
                    // InternalDdParser.g:3225:4: enumLiteral_11= GreaterThanSignEqualsSign
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
                    // InternalDdParser.g:3232:3: (enumLiteral_12= CircumflexAccent )
                    {
                    // InternalDdParser.g:3232:3: (enumLiteral_12= CircumflexAccent )
                    // InternalDdParser.g:3233:4: enumLiteral_12= CircumflexAccent
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
                    // InternalDdParser.g:3240:3: (enumLiteral_13= Like )
                    {
                    // InternalDdParser.g:3240:3: (enumLiteral_13= Like )
                    // InternalDdParser.g:3241:4: enumLiteral_13= Like
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
                    // InternalDdParser.g:3248:3: (enumLiteral_14= ExclamationMarkEqualsSign )
                    {
                    // InternalDdParser.g:3248:3: (enumLiteral_14= ExclamationMarkEqualsSign )
                    // InternalDdParser.g:3249:4: enumLiteral_14= ExclamationMarkEqualsSign
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
                    // InternalDdParser.g:3256:3: (enumLiteral_15= Ampersand )
                    {
                    // InternalDdParser.g:3256:3: (enumLiteral_15= Ampersand )
                    // InternalDdParser.g:3257:4: enumLiteral_15= Ampersand
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
                    // InternalDdParser.g:3264:3: (enumLiteral_16= In )
                    {
                    // InternalDdParser.g:3264:3: (enumLiteral_16= In )
                    // InternalDdParser.g:3265:4: enumLiteral_16= In
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
                    // InternalDdParser.g:3272:3: (enumLiteral_17= Stxt )
                    {
                    // InternalDdParser.g:3272:3: (enumLiteral_17= Stxt )
                    // InternalDdParser.g:3273:4: enumLiteral_17= Stxt
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
                    // InternalDdParser.g:3280:3: (enumLiteral_18= Round )
                    {
                    // InternalDdParser.g:3280:3: (enumLiteral_18= Round )
                    // InternalDdParser.g:3281:4: enumLiteral_18= Round
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
    // InternalDdParser.g:3291:1: ruleUnaryOperator returns [Enumerator current=null] : ( (enumLiteral_0= Not ) | (enumLiteral_1= HyphenMinus ) | (enumLiteral_2= Str ) | (enumLiteral_3= Int ) | (enumLiteral_4= Dec ) | (enumLiteral_5= Date ) | (enumLiteral_6= Time ) | (enumLiteral_7= Len ) | (enumLiteral_8= Stamp ) ) ;
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
            // InternalDdParser.g:3297:2: ( ( (enumLiteral_0= Not ) | (enumLiteral_1= HyphenMinus ) | (enumLiteral_2= Str ) | (enumLiteral_3= Int ) | (enumLiteral_4= Dec ) | (enumLiteral_5= Date ) | (enumLiteral_6= Time ) | (enumLiteral_7= Len ) | (enumLiteral_8= Stamp ) ) )
            // InternalDdParser.g:3298:2: ( (enumLiteral_0= Not ) | (enumLiteral_1= HyphenMinus ) | (enumLiteral_2= Str ) | (enumLiteral_3= Int ) | (enumLiteral_4= Dec ) | (enumLiteral_5= Date ) | (enumLiteral_6= Time ) | (enumLiteral_7= Len ) | (enumLiteral_8= Stamp ) )
            {
            // InternalDdParser.g:3298:2: ( (enumLiteral_0= Not ) | (enumLiteral_1= HyphenMinus ) | (enumLiteral_2= Str ) | (enumLiteral_3= Int ) | (enumLiteral_4= Dec ) | (enumLiteral_5= Date ) | (enumLiteral_6= Time ) | (enumLiteral_7= Len ) | (enumLiteral_8= Stamp ) )
            int alt44=9;
            switch ( input.LA(1) ) {
            case Not:
                {
                alt44=1;
                }
                break;
            case HyphenMinus:
                {
                alt44=2;
                }
                break;
            case Str:
                {
                alt44=3;
                }
                break;
            case Int:
                {
                alt44=4;
                }
                break;
            case Dec:
                {
                alt44=5;
                }
                break;
            case Date:
                {
                alt44=6;
                }
                break;
            case Time:
                {
                alt44=7;
                }
                break;
            case Len:
                {
                alt44=8;
                }
                break;
            case Stamp:
                {
                alt44=9;
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
                    // InternalDdParser.g:3299:3: (enumLiteral_0= Not )
                    {
                    // InternalDdParser.g:3299:3: (enumLiteral_0= Not )
                    // InternalDdParser.g:3300:4: enumLiteral_0= Not
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
                    // InternalDdParser.g:3307:3: (enumLiteral_1= HyphenMinus )
                    {
                    // InternalDdParser.g:3307:3: (enumLiteral_1= HyphenMinus )
                    // InternalDdParser.g:3308:4: enumLiteral_1= HyphenMinus
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
                    // InternalDdParser.g:3315:3: (enumLiteral_2= Str )
                    {
                    // InternalDdParser.g:3315:3: (enumLiteral_2= Str )
                    // InternalDdParser.g:3316:4: enumLiteral_2= Str
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
                    // InternalDdParser.g:3323:3: (enumLiteral_3= Int )
                    {
                    // InternalDdParser.g:3323:3: (enumLiteral_3= Int )
                    // InternalDdParser.g:3324:4: enumLiteral_3= Int
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
                    // InternalDdParser.g:3331:3: (enumLiteral_4= Dec )
                    {
                    // InternalDdParser.g:3331:3: (enumLiteral_4= Dec )
                    // InternalDdParser.g:3332:4: enumLiteral_4= Dec
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
                    // InternalDdParser.g:3339:3: (enumLiteral_5= Date )
                    {
                    // InternalDdParser.g:3339:3: (enumLiteral_5= Date )
                    // InternalDdParser.g:3340:4: enumLiteral_5= Date
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
                    // InternalDdParser.g:3347:3: (enumLiteral_6= Time )
                    {
                    // InternalDdParser.g:3347:3: (enumLiteral_6= Time )
                    // InternalDdParser.g:3348:4: enumLiteral_6= Time
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
                    // InternalDdParser.g:3355:3: (enumLiteral_7= Len )
                    {
                    // InternalDdParser.g:3355:3: (enumLiteral_7= Len )
                    // InternalDdParser.g:3356:4: enumLiteral_7= Len
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
                    // InternalDdParser.g:3363:3: (enumLiteral_8= Stamp )
                    {
                    // InternalDdParser.g:3363:3: (enumLiteral_8= Stamp )
                    // InternalDdParser.g:3364:4: enumLiteral_8= Stamp
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
    // InternalDdParser.g:3374:1: ruleUnset returns [Enumerator current=null] : (enumLiteral_0= Unset ) ;
    public final Enumerator ruleUnset() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalDdParser.g:3380:2: ( (enumLiteral_0= Unset ) )
            // InternalDdParser.g:3381:2: (enumLiteral_0= Unset )
            {
            // InternalDdParser.g:3381:2: (enumLiteral_0= Unset )
            // InternalDdParser.g:3382:3: enumLiteral_0= Unset
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
    // InternalDdParser.g:3391:1: ruleBoolean returns [Enumerator current=null] : ( (enumLiteral_0= True ) | (enumLiteral_1= False ) ) ;
    public final Enumerator ruleBoolean() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDdParser.g:3397:2: ( ( (enumLiteral_0= True ) | (enumLiteral_1= False ) ) )
            // InternalDdParser.g:3398:2: ( (enumLiteral_0= True ) | (enumLiteral_1= False ) )
            {
            // InternalDdParser.g:3398:2: ( (enumLiteral_0= True ) | (enumLiteral_1= False ) )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==True) ) {
                alt45=1;
            }
            else if ( (LA45_0==False) ) {
                alt45=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // InternalDdParser.g:3399:3: (enumLiteral_0= True )
                    {
                    // InternalDdParser.g:3399:3: (enumLiteral_0= True )
                    // InternalDdParser.g:3400:4: enumLiteral_0= True
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
                    // InternalDdParser.g:3407:3: (enumLiteral_1= False )
                    {
                    // InternalDdParser.g:3407:3: (enumLiteral_1= False )
                    // InternalDdParser.g:3408:4: enumLiteral_1= False
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
    // InternalDdParser.g:3418:1: ruleDataType returns [Enumerator current=null] : ( (enumLiteral_0= Str ) | (enumLiteral_1= Dec ) | (enumLiteral_2= Date ) | (enumLiteral_3= Time ) | (enumLiteral_4= Chr ) | (enumLiteral_5= Int ) | (enumLiteral_6= Stamp ) | (enumLiteral_7= Bits ) | (enumLiteral_8= Bool ) | (enumLiteral_9= HalfwidthHangulFillerHalfwidthHangulFillerHalfwidthHangulFiller ) ) ;
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
            // InternalDdParser.g:3424:2: ( ( (enumLiteral_0= Str ) | (enumLiteral_1= Dec ) | (enumLiteral_2= Date ) | (enumLiteral_3= Time ) | (enumLiteral_4= Chr ) | (enumLiteral_5= Int ) | (enumLiteral_6= Stamp ) | (enumLiteral_7= Bits ) | (enumLiteral_8= Bool ) | (enumLiteral_9= HalfwidthHangulFillerHalfwidthHangulFillerHalfwidthHangulFiller ) ) )
            // InternalDdParser.g:3425:2: ( (enumLiteral_0= Str ) | (enumLiteral_1= Dec ) | (enumLiteral_2= Date ) | (enumLiteral_3= Time ) | (enumLiteral_4= Chr ) | (enumLiteral_5= Int ) | (enumLiteral_6= Stamp ) | (enumLiteral_7= Bits ) | (enumLiteral_8= Bool ) | (enumLiteral_9= HalfwidthHangulFillerHalfwidthHangulFillerHalfwidthHangulFiller ) )
            {
            // InternalDdParser.g:3425:2: ( (enumLiteral_0= Str ) | (enumLiteral_1= Dec ) | (enumLiteral_2= Date ) | (enumLiteral_3= Time ) | (enumLiteral_4= Chr ) | (enumLiteral_5= Int ) | (enumLiteral_6= Stamp ) | (enumLiteral_7= Bits ) | (enumLiteral_8= Bool ) | (enumLiteral_9= HalfwidthHangulFillerHalfwidthHangulFillerHalfwidthHangulFiller ) )
            int alt46=10;
            switch ( input.LA(1) ) {
            case Str:
                {
                alt46=1;
                }
                break;
            case Dec:
                {
                alt46=2;
                }
                break;
            case Date:
                {
                alt46=3;
                }
                break;
            case Time:
                {
                alt46=4;
                }
                break;
            case Chr:
                {
                alt46=5;
                }
                break;
            case Int:
                {
                alt46=6;
                }
                break;
            case Stamp:
                {
                alt46=7;
                }
                break;
            case Bits:
                {
                alt46=8;
                }
                break;
            case Bool:
                {
                alt46=9;
                }
                break;
            case HalfwidthHangulFillerHalfwidthHangulFillerHalfwidthHangulFiller:
                {
                alt46=10;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // InternalDdParser.g:3426:3: (enumLiteral_0= Str )
                    {
                    // InternalDdParser.g:3426:3: (enumLiteral_0= Str )
                    // InternalDdParser.g:3427:4: enumLiteral_0= Str
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
                    // InternalDdParser.g:3434:3: (enumLiteral_1= Dec )
                    {
                    // InternalDdParser.g:3434:3: (enumLiteral_1= Dec )
                    // InternalDdParser.g:3435:4: enumLiteral_1= Dec
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
                    // InternalDdParser.g:3442:3: (enumLiteral_2= Date )
                    {
                    // InternalDdParser.g:3442:3: (enumLiteral_2= Date )
                    // InternalDdParser.g:3443:4: enumLiteral_2= Date
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
                    // InternalDdParser.g:3450:3: (enumLiteral_3= Time )
                    {
                    // InternalDdParser.g:3450:3: (enumLiteral_3= Time )
                    // InternalDdParser.g:3451:4: enumLiteral_3= Time
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
                    // InternalDdParser.g:3458:3: (enumLiteral_4= Chr )
                    {
                    // InternalDdParser.g:3458:3: (enumLiteral_4= Chr )
                    // InternalDdParser.g:3459:4: enumLiteral_4= Chr
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
                    // InternalDdParser.g:3466:3: (enumLiteral_5= Int )
                    {
                    // InternalDdParser.g:3466:3: (enumLiteral_5= Int )
                    // InternalDdParser.g:3467:4: enumLiteral_5= Int
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
                    // InternalDdParser.g:3474:3: (enumLiteral_6= Stamp )
                    {
                    // InternalDdParser.g:3474:3: (enumLiteral_6= Stamp )
                    // InternalDdParser.g:3475:4: enumLiteral_6= Stamp
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
                    // InternalDdParser.g:3482:3: (enumLiteral_7= Bits )
                    {
                    // InternalDdParser.g:3482:3: (enumLiteral_7= Bits )
                    // InternalDdParser.g:3483:4: enumLiteral_7= Bits
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
                    // InternalDdParser.g:3490:3: (enumLiteral_8= Bool )
                    {
                    // InternalDdParser.g:3490:3: (enumLiteral_8= Bool )
                    // InternalDdParser.g:3491:4: enumLiteral_8= Bool
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
                    // InternalDdParser.g:3498:3: (enumLiteral_9= HalfwidthHangulFillerHalfwidthHangulFillerHalfwidthHangulFiller )
                    {
                    // InternalDdParser.g:3498:3: (enumLiteral_9= HalfwidthHangulFillerHalfwidthHangulFillerHalfwidthHangulFiller )
                    // InternalDdParser.g:3499:4: enumLiteral_9= HalfwidthHangulFillerHalfwidthHangulFillerHalfwidthHangulFiller
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
        // InternalDdParser.g:1016:4: ( ruleRangeExpression )
        // InternalDdParser.g:1016:5: ruleRangeExpression
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
        // InternalDdParser.g:1028:4: ( ruleAddExpression )
        // InternalDdParser.g:1028:5: ruleAddExpression
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
        // InternalDdParser.g:1040:4: ( ruleMultExpression )
        // InternalDdParser.g:1040:5: ruleMultExpression
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
        // InternalDdParser.g:1052:4: ( ruleAndExpression )
        // InternalDdParser.g:1052:5: ruleAndExpression
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
        // InternalDdParser.g:1064:4: ( ruleOrExpression )
        // InternalDdParser.g:1064:5: ruleOrExpression
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
        // InternalDdParser.g:1076:4: ( ruleCatExpression )
        // InternalDdParser.g:1076:5: ruleCatExpression
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
        // InternalDdParser.g:1088:4: ( ruleListExpression )
        // InternalDdParser.g:1088:5: ruleListExpression
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


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA2 dfa2 = new DFA2(this);
    protected DFA21 dfa21 = new DFA21(this);
    static final String dfa_1s = "\5\uffff";
    static final String dfa_2s = "\1\2\4\uffff";
    static final String dfa_3s = "\1\6\1\63\2\uffff\1\6";
    static final String dfa_4s = "\1\107\1\63\2\uffff\1\107";
    static final String dfa_5s = "\2\uffff\1\2\1\1\1\uffff";
    static final String dfa_6s = "\5\uffff}>";
    static final String[] dfa_7s = {
            "\1\3\1\uffff\3\3\2\uffff\1\3\2\uffff\3\3\2\uffff\2\3\60\uffff\1\1",
            "\1\4",
            "",
            "",
            "\1\3\1\uffff\3\3\2\uffff\1\3\2\uffff\3\3\2\uffff\2\3\50\uffff\1\2\1\uffff\1\2\5\uffff\1\1"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 73:3: ( (lv_constants_0_0= ruleConstant ) )*";
        }
    }
    static final String dfa_8s = "\1\107\1\63\1\uffff\1\77\1\uffff";
    static final String dfa_9s = "\1\107\1\63\1\uffff\1\107\1\uffff";
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

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_6;
            this.transition = dfa_11;
        }
        public String getDescription() {
            return "()* loopback of 92:3: ( (lv_entities_1_0= ruleEntity ) )*";
        }
    }
    static final String dfa_12s = "\35\uffff";
    static final String dfa_13s = "\1\4\1\0\33\uffff";
    static final String dfa_14s = "\1\104\1\0\33\uffff";
    static final String dfa_15s = "\2\uffff\1\11\10\uffff\1\12\7\uffff\1\13\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10";
    static final String dfa_16s = "\1\uffff\1\0\33\uffff}>";
    static final String[] dfa_17s = {
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

    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final char[] dfa_13 = DFA.unpackEncodedStringToUnsignedChars(dfa_13s);
    static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final short[][] dfa_17 = unpackEncodedStringArray(dfa_17s);

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = dfa_12;
            this.eof = dfa_12;
            this.min = dfa_13;
            this.max = dfa_14;
            this.accept = dfa_15;
            this.special = dfa_16;
            this.transition = dfa_17;
        }
        public String getDescription() {
            return "1014:2: ( ( ( ruleRangeExpression )=>this_RangeExpression_0= ruleRangeExpression ) | ( ( ruleAddExpression )=>this_AddExpression_1= ruleAddExpression ) | ( ( ruleMultExpression )=>this_MultExpression_2= ruleMultExpression ) | ( ( ruleAndExpression )=>this_AndExpression_3= ruleAndExpression ) | ( ( ruleOrExpression )=>this_OrExpression_4= ruleOrExpression ) | ( ( ruleCatExpression )=>this_CatExpression_5= ruleCatExpression ) | ( ( ruleListExpression )=>this_ListExpression_6= ruleListExpression ) | this_BinaryExpression_7= ruleBinaryExpression | this_UnaryExpression_8= ruleUnaryExpression | this_TerminalExpression_9= ruleTerminalExpression | this_IdentifierExpression_10= ruleIdentifierExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA21_1 = input.LA(1);

                         
                        int index21_1 = input.index();
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

                         
                        input.seek(index21_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 21, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000672742L,0x0000000000000080L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000400400672740L,0x0000000000000081L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000400400000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x18000084003E64D0L,0x000000000000001FL});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000082L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000040001000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000400400672740L,0x0000000000000084L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0004400400672740L,0x0000000000000084L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0004000400000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000400400000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00001000C0000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000000C0000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000004800000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0004000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000084L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00012AB33E809820L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x000000A000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x000000A800000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000800008000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000820000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000A00000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000010000000000L});

}