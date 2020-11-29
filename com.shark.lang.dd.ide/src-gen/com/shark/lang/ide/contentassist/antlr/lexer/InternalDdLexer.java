package com.shark.lang.ide.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDdLexer extends Lexer {
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

    public InternalDdLexer() {;} 
    public InternalDdLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalDdLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalDdLexer.g"; }

    // $ANTLR start "False"
    public final void mFalse() throws RecognitionException {
        try {
            int _type = False;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDdLexer.g:14:7: ( 'false' )
            // InternalDdLexer.g:14:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "False"

    // $ANTLR start "Round"
    public final void mRound() throws RecognitionException {
        try {
            int _type = Round;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDdLexer.g:16:7: ( 'round' )
            // InternalDdLexer.g:16:9: 'round'
            {
            match("round"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Round"

    // $ANTLR start "Stamp"
    public final void mStamp() throws RecognitionException {
        try {
            int _type = Stamp;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDdLexer.g:18:7: ( 'stamp' )
            // InternalDdLexer.g:18:9: 'stamp'
            {
            match("stamp"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Stamp"

    // $ANTLR start "Unset"
    public final void mUnset() throws RecognitionException {
        try {
            int _type = Unset;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDdLexer.g:20:7: ( 'unset' )
            // InternalDdLexer.g:20:9: 'unset'
            {
            match("unset"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Unset"

    // $ANTLR start "Bits"
    public final void mBits() throws RecognitionException {
        try {
            int _type = Bits;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDdLexer.g:22:6: ( 'bits' )
            // InternalDdLexer.g:22:8: 'bits'
            {
            match("bits"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Bits"

    // $ANTLR start "Bool"
    public final void mBool() throws RecognitionException {
        try {
            int _type = Bool;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDdLexer.g:24:6: ( 'bool' )
            // InternalDdLexer.g:24:8: 'bool'
            {
            match("bool"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Bool"

    // $ANTLR start "Date"
    public final void mDate() throws RecognitionException {
        try {
            int _type = Date;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDdLexer.g:26:6: ( 'date' )
            // InternalDdLexer.g:26:8: 'date'
            {
            match("date"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Date"

    // $ANTLR start "Like"
    public final void mLike() throws RecognitionException {
        try {
            int _type = Like;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDdLexer.g:28:6: ( 'like' )
            // InternalDdLexer.g:28:8: 'like'
            {
            match("like"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Like"

    // $ANTLR start "Stxt"
    public final void mStxt() throws RecognitionException {
        try {
            int _type = Stxt;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDdLexer.g:30:6: ( 'stxt' )
            // InternalDdLexer.g:30:8: 'stxt'
            {
            match("stxt"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Stxt"

    // $ANTLR start "Time"
    public final void mTime() throws RecognitionException {
        try {
            int _type = Time;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDdLexer.g:32:6: ( 'time' )
            // InternalDdLexer.g:32:8: 'time'
            {
            match("time"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Time"

    // $ANTLR start "True"
    public final void mTrue() throws RecognitionException {
        try {
            int _type = True;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDdLexer.g:34:6: ( 'true' )
            // InternalDdLexer.g:34:8: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "True"

    // $ANTLR start "And"
    public final void mAnd() throws RecognitionException {
        try {
            int _type = And;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDdLexer.g:36:5: ( 'and' )
            // InternalDdLexer.g:36:7: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "And"

    // $ANTLR start "Chr"
    public final void mChr() throws RecognitionException {
        try {
            int _type = Chr;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDdLexer.g:38:5: ( 'chr' )
            // InternalDdLexer.g:38:7: 'chr'
            {
            match("chr"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Chr"

    // $ANTLR start "Dec"
    public final void mDec() throws RecognitionException {
        try {
            int _type = Dec;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDdLexer.g:40:5: ( 'dec' )
            // InternalDdLexer.g:40:7: 'dec'
            {
            match("dec"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Dec"

    // $ANTLR start "Int"
    public final void mInt() throws RecognitionException {
        try {
            int _type = Int;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDdLexer.g:42:5: ( 'int' )
            // InternalDdLexer.g:42:7: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Int"

    // $ANTLR start "Len"
    public final void mLen() throws RecognitionException {
        try {
            int _type = Len;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDdLexer.g:44:5: ( 'len' )
            // InternalDdLexer.g:44:7: 'len'
            {
            match("len"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Len"

    // $ANTLR start "Not"
    public final void mNot() throws RecognitionException {
        try {
            int _type = Not;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDdLexer.g:46:5: ( 'not' )
            // InternalDdLexer.g:46:7: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Not"

    // $ANTLR start "Str"
    public final void mStr() throws RecognitionException {
        try {
            int _type = Str;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDdLexer.g:48:5: ( 'str' )
            // InternalDdLexer.g:48:7: 'str'
            {
            match("str"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Str"

    // $ANTLR start "HalfwidthHangulFillerHalfwidthHangulFillerHalfwidthHangulFiller"
    public final void mHalfwidthHangulFillerHalfwidthHangulFillerHalfwidthHangulFiller() throws RecognitionException {
        try {
            int _type = HalfwidthHangulFillerHalfwidthHangulFillerHalfwidthHangulFiller;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDdLexer.g:50:65: ( '\\uFFA0\\uFFA0\\uFFA0' )
            // InternalDdLexer.g:50:67: '\\uFFA0\\uFFA0\\uFFA0'
            {
            match("\uFFA0\uFFA0\uFFA0"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HalfwidthHangulFillerHalfwidthHangulFillerHalfwidthHangulFiller"

    // $ANTLR start "ExclamationMarkEqualsSign"
    public final void mExclamationMarkEqualsSign() throws RecognitionException {
        try {
            int _type = ExclamationMarkEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDdLexer.g:52:27: ( '!=' )
            // InternalDdLexer.g:52:29: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ExclamationMarkEqualsSign"

    // $ANTLR start "HyphenMinusGreaterThanSign"
    public final void mHyphenMinusGreaterThanSign() throws RecognitionException {
        try {
            int _type = HyphenMinusGreaterThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDdLexer.g:54:28: ( '->' )
            // InternalDdLexer.g:54:30: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HyphenMinusGreaterThanSign"

    // $ANTLR start "LessThanSignEqualsSign"
    public final void mLessThanSignEqualsSign() throws RecognitionException {
        try {
            int _type = LessThanSignEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDdLexer.g:56:24: ( '<=' )
            // InternalDdLexer.g:56:26: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LessThanSignEqualsSign"

    // $ANTLR start "EqualsSignEqualsSign"
    public final void mEqualsSignEqualsSign() throws RecognitionException {
        try {
            int _type = EqualsSignEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDdLexer.g:58:22: ( '==' )
            // InternalDdLexer.g:58:24: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EqualsSignEqualsSign"

    // $ANTLR start "GreaterThanSignEqualsSign"
    public final void mGreaterThanSignEqualsSign() throws RecognitionException {
        try {
            int _type = GreaterThanSignEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDdLexer.g:60:27: ( '>=' )
            // InternalDdLexer.g:60:29: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GreaterThanSignEqualsSign"

    // $ANTLR start "In"
    public final void mIn() throws RecognitionException {
        try {
            int _type = In;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDdLexer.g:62:4: ( 'in' )
            // InternalDdLexer.g:62:6: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "In"

    // $ANTLR start "Or"
    public final void mOr() throws RecognitionException {
        try {
            int _type = Or;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDdLexer.g:64:4: ( 'or' )
            // InternalDdLexer.g:64:6: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Or"

    // $ANTLR start "Pk"
    public final void mPk() throws RecognitionException {
        try {
            int _type = Pk;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDdLexer.g:66:4: ( 'pk' )
            // InternalDdLexer.g:66:6: 'pk'
            {
            match("pk"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Pk"

    // $ANTLR start "ExclamationMark"
    public final void mExclamationMark() throws RecognitionException {
        try {
            int _type = ExclamationMark;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDdLexer.g:68:17: ( '!' )
            // InternalDdLexer.g:68:19: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ExclamationMark"

    // $ANTLR start "PercentSign"
    public final void mPercentSign() throws RecognitionException {
        try {
            int _type = PercentSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDdLexer.g:70:13: ( '%' )
            // InternalDdLexer.g:70:15: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PercentSign"

    // $ANTLR start "Ampersand"
    public final void mAmpersand() throws RecognitionException {
        try {
            int _type = Ampersand;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDdLexer.g:72:11: ( '&' )
            // InternalDdLexer.g:72:13: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Ampersand"

    // $ANTLR start "LeftParenthesis"
    public final void mLeftParenthesis() throws RecognitionException {
        try {
            int _type = LeftParenthesis;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDdLexer.g:74:17: ( '(' )
            // InternalDdLexer.g:74:19: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftParenthesis"

    // $ANTLR start "RightParenthesis"
    public final void mRightParenthesis() throws RecognitionException {
        try {
            int _type = RightParenthesis;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDdLexer.g:76:18: ( ')' )
            // InternalDdLexer.g:76:20: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightParenthesis"

    // $ANTLR start "Asterisk"
    public final void mAsterisk() throws RecognitionException {
        try {
            int _type = Asterisk;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDdLexer.g:78:10: ( '*' )
            // InternalDdLexer.g:78:12: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Asterisk"

    // $ANTLR start "PlusSign"
    public final void mPlusSign() throws RecognitionException {
        try {
            int _type = PlusSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDdLexer.g:80:10: ( '+' )
            // InternalDdLexer.g:80:12: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PlusSign"

    // $ANTLR start "Comma"
    public final void mComma() throws RecognitionException {
        try {
            int _type = Comma;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDdLexer.g:82:7: ( ',' )
            // InternalDdLexer.g:82:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Comma"

    // $ANTLR start "HyphenMinus"
    public final void mHyphenMinus() throws RecognitionException {
        try {
            int _type = HyphenMinus;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDdLexer.g:84:13: ( '-' )
            // InternalDdLexer.g:84:15: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HyphenMinus"

    // $ANTLR start "FullStop"
    public final void mFullStop() throws RecognitionException {
        try {
            int _type = FullStop;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDdLexer.g:86:10: ( '.' )
            // InternalDdLexer.g:86:12: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FullStop"

    // $ANTLR start "Solidus"
    public final void mSolidus() throws RecognitionException {
        try {
            int _type = Solidus;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDdLexer.g:88:9: ( '/' )
            // InternalDdLexer.g:88:11: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Solidus"

    // $ANTLR start "Colon"
    public final void mColon() throws RecognitionException {
        try {
            int _type = Colon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDdLexer.g:90:7: ( ':' )
            // InternalDdLexer.g:90:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Colon"

    // $ANTLR start "LessThanSign"
    public final void mLessThanSign() throws RecognitionException {
        try {
            int _type = LessThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDdLexer.g:92:14: ( '<' )
            // InternalDdLexer.g:92:16: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LessThanSign"

    // $ANTLR start "EqualsSign"
    public final void mEqualsSign() throws RecognitionException {
        try {
            int _type = EqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDdLexer.g:94:12: ( '=' )
            // InternalDdLexer.g:94:14: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EqualsSign"

    // $ANTLR start "GreaterThanSign"
    public final void mGreaterThanSign() throws RecognitionException {
        try {
            int _type = GreaterThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDdLexer.g:96:17: ( '>' )
            // InternalDdLexer.g:96:19: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GreaterThanSign"

    // $ANTLR start "LeftSquareBracket"
    public final void mLeftSquareBracket() throws RecognitionException {
        try {
            int _type = LeftSquareBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDdLexer.g:98:19: ( '[' )
            // InternalDdLexer.g:98:21: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftSquareBracket"

    // $ANTLR start "RightSquareBracket"
    public final void mRightSquareBracket() throws RecognitionException {
        try {
            int _type = RightSquareBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDdLexer.g:100:20: ( ']' )
            // InternalDdLexer.g:100:22: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightSquareBracket"

    // $ANTLR start "CircumflexAccent"
    public final void mCircumflexAccent() throws RecognitionException {
        try {
            int _type = CircumflexAccent;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDdLexer.g:102:18: ( '^' )
            // InternalDdLexer.g:102:20: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CircumflexAccent"

    // $ANTLR start "RULE_BEGIN"
    public final void mRULE_BEGIN() throws RecognitionException {
        try {
            // InternalDdLexer.g:104:21: ()
            // InternalDdLexer.g:104:23: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_BEGIN"

    // $ANTLR start "RULE_END"
    public final void mRULE_END() throws RecognitionException {
        try {
            // InternalDdLexer.g:106:19: ()
            // InternalDdLexer.g:106:21: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_END"

    // $ANTLR start "RULE_EOL"
    public final void mRULE_EOL() throws RecognitionException {
        try {
            // InternalDdLexer.g:108:19: ()
            // InternalDdLexer.g:108:21: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_EOL"

    // $ANTLR start "RULE_NULL"
    public final void mRULE_NULL() throws RecognitionException {
        try {
            // InternalDdLexer.g:110:20: ()
            // InternalDdLexer.g:110:22: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_NULL"

    // $ANTLR start "RULE_HEX"
    public final void mRULE_HEX() throws RecognitionException {
        try {
            // InternalDdLexer.g:112:19: ( ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) )
            // InternalDdLexer.g:112:21: ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEX"

    // $ANTLR start "RULE_NUM"
    public final void mRULE_NUM() throws RecognitionException {
        try {
            // InternalDdLexer.g:114:19: ( ( '0' .. '9' )+ )
            // InternalDdLexer.g:114:21: ( '0' .. '9' )+
            {
            // InternalDdLexer.g:114:21: ( '0' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDdLexer.g:114:22: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_NUM"

    // $ANTLR start "RULE_UNI"
    public final void mRULE_UNI() throws RecognitionException {
        try {
            // InternalDdLexer.g:116:19: ( 'u' RULE_HEX RULE_HEX RULE_HEX RULE_HEX )
            // InternalDdLexer.g:116:21: 'u' RULE_HEX RULE_HEX RULE_HEX RULE_HEX
            {
            match('u'); 
            mRULE_HEX(); 
            mRULE_HEX(); 
            mRULE_HEX(); 
            mRULE_HEX(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_UNI"

    // $ANTLR start "RULE_ESC"
    public final void mRULE_ESC() throws RecognitionException {
        try {
            // InternalDdLexer.g:118:19: ( '\\\\' ( 't' | 'n' | 'r' | '\"' | '\\\\' | RULE_UNI ) )
            // InternalDdLexer.g:118:21: '\\\\' ( 't' | 'n' | 'r' | '\"' | '\\\\' | RULE_UNI )
            {
            match('\\'); 
            // InternalDdLexer.g:118:26: ( 't' | 'n' | 'r' | '\"' | '\\\\' | RULE_UNI )
            int alt2=6;
            switch ( input.LA(1) ) {
            case 't':
                {
                alt2=1;
                }
                break;
            case 'n':
                {
                alt2=2;
                }
                break;
            case 'r':
                {
                alt2=3;
                }
                break;
            case '\"':
                {
                alt2=4;
                }
                break;
            case '\\':
                {
                alt2=5;
                }
                break;
            case 'u':
                {
                alt2=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalDdLexer.g:118:27: 't'
                    {
                    match('t'); 

                    }
                    break;
                case 2 :
                    // InternalDdLexer.g:118:31: 'n'
                    {
                    match('n'); 

                    }
                    break;
                case 3 :
                    // InternalDdLexer.g:118:35: 'r'
                    {
                    match('r'); 

                    }
                    break;
                case 4 :
                    // InternalDdLexer.g:118:39: '\"'
                    {
                    match('\"'); 

                    }
                    break;
                case 5 :
                    // InternalDdLexer.g:118:43: '\\\\'
                    {
                    match('\\'); 

                    }
                    break;
                case 6 :
                    // InternalDdLexer.g:118:48: RULE_UNI
                    {
                    mRULE_UNI(); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_ESC"

    // $ANTLR start "RULE_ASCII"
    public final void mRULE_ASCII() throws RecognitionException {
        try {
            // InternalDdLexer.g:120:21: ( ( '!' | '#' | '$' | '%' | '&' | '\\'' | '(' | ')' | '*' | '+' | ',' | '-' | '.' | '/' | '0' .. '9' | ' ' | ':' | ';' | '<' | '=' | '>' | '?' | '@' | 'A' .. 'Z' | '[' | ']' | '^' | '_' | '`' | 'a' .. 'z' | '{' | '|' | '}' | '~' ) )
            // InternalDdLexer.g:120:23: ( '!' | '#' | '$' | '%' | '&' | '\\'' | '(' | ')' | '*' | '+' | ',' | '-' | '.' | '/' | '0' .. '9' | ' ' | ':' | ';' | '<' | '=' | '>' | '?' | '@' | 'A' .. 'Z' | '[' | ']' | '^' | '_' | '`' | 'a' .. 'z' | '{' | '|' | '}' | '~' )
            {
            if ( (input.LA(1)>=' ' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='~') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_ASCII"

    // $ANTLR start "RULE_NL"
    public final void mRULE_NL() throws RecognitionException {
        try {
            // InternalDdLexer.g:122:18: ( ( '\\r' )? '\\n' )
            // InternalDdLexer.g:122:20: ( '\\r' )? '\\n'
            {
            // InternalDdLexer.g:122:20: ( '\\r' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\r') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalDdLexer.g:122:20: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_NL"

    // $ANTLR start "RULE_CHR"
    public final void mRULE_CHR() throws RecognitionException {
        try {
            int _type = RULE_CHR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDdLexer.g:124:10: ( '\"' ( RULE_ESC | RULE_ASCII )? '\"' )
            // InternalDdLexer.g:124:12: '\"' ( RULE_ESC | RULE_ASCII )? '\"'
            {
            match('\"'); 
            // InternalDdLexer.g:124:16: ( RULE_ESC | RULE_ASCII )?
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\\') ) {
                alt4=1;
            }
            else if ( ((LA4_0>=' ' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='~')) ) {
                alt4=2;
            }
            switch (alt4) {
                case 1 :
                    // InternalDdLexer.g:124:17: RULE_ESC
                    {
                    mRULE_ESC(); 

                    }
                    break;
                case 2 :
                    // InternalDdLexer.g:124:26: RULE_ASCII
                    {
                    mRULE_ASCII(); 

                    }
                    break;

            }

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CHR"

    // $ANTLR start "RULE_STR"
    public final void mRULE_STR() throws RecognitionException {
        try {
            int _type = RULE_STR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDdLexer.g:126:10: ( '\"' ( RULE_ESC | RULE_ASCII )+ '\"' )
            // InternalDdLexer.g:126:12: '\"' ( RULE_ESC | RULE_ASCII )+ '\"'
            {
            match('\"'); 
            // InternalDdLexer.g:126:16: ( RULE_ESC | RULE_ASCII )+
            int cnt5=0;
            loop5:
            do {
                int alt5=3;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='\\') ) {
                    alt5=1;
                }
                else if ( ((LA5_0>=' ' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='~')) ) {
                    alt5=2;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDdLexer.g:126:17: RULE_ESC
            	    {
            	    mRULE_ESC(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalDdLexer.g:126:26: RULE_ASCII
            	    {
            	    mRULE_ASCII(); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STR"

    // $ANTLR start "RULE_RANGEINF"
    public final void mRULE_RANGEINF() throws RecognitionException {
        try {
            int _type = RULE_RANGEINF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDdLexer.g:128:15: ( RULE_NUM '..n' )
            // InternalDdLexer.g:128:17: RULE_NUM '..n'
            {
            mRULE_NUM(); 
            match("..n"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RANGEINF"

    // $ANTLR start "RULE_RANGE"
    public final void mRULE_RANGE() throws RecognitionException {
        try {
            int _type = RULE_RANGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDdLexer.g:130:12: ( RULE_NUM '..' RULE_NUM )
            // InternalDdLexer.g:130:14: RULE_NUM '..' RULE_NUM
            {
            mRULE_NUM(); 
            match(".."); 

            mRULE_NUM(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RANGE"

    // $ANTLR start "RULE_CHKID"
    public final void mRULE_CHKID() throws RecognitionException {
        try {
            int _type = RULE_CHKID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDdLexer.g:132:12: ( '#' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalDdLexer.g:132:14: '#' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            match('#'); 
            // InternalDdLexer.g:132:18: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDdLexer.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CHKID"

    // $ANTLR start "RULE_CSTID"
    public final void mRULE_CSTID() throws RecognitionException {
        try {
            int _type = RULE_CSTID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDdLexer.g:134:12: ( 'A' .. 'Z' ( 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalDdLexer.g:134:14: 'A' .. 'Z' ( 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            matchRange('A','Z'); 
            // InternalDdLexer.g:134:23: ( 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')||(LA7_0>='A' && LA7_0<='Z')||LA7_0=='_') ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDdLexer.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CSTID"

    // $ANTLR start "RULE_OBJID"
    public final void mRULE_OBJID() throws RecognitionException {
        try {
            int _type = RULE_OBJID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDdLexer.g:136:12: ( 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalDdLexer.g:136:14: 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            matchRange('A','Z'); 
            // InternalDdLexer.g:136:23: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')||(LA8_0>='A' && LA8_0<='Z')||LA8_0=='_'||(LA8_0>='a' && LA8_0<='z')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDdLexer.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OBJID"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDdLexer.g:138:9: ( ( 'a' .. 'z' | '_' | '~' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalDdLexer.g:138:11: ( 'a' .. 'z' | '_' | '~' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||input.LA(1)=='~' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalDdLexer.g:138:30: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')||(LA9_0>='A' && LA9_0<='Z')||LA9_0=='_'||(LA9_0>='a' && LA9_0<='z')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDdLexer.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_DEC"
    public final void mRULE_DEC() throws RecognitionException {
        try {
            int _type = RULE_DEC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDdLexer.g:140:10: ( RULE_NUM '.' RULE_NUM )
            // InternalDdLexer.g:140:12: RULE_NUM '.' RULE_NUM
            {
            mRULE_NUM(); 
            match('.'); 
            mRULE_NUM(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DEC"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDdLexer.g:142:10: ( RULE_NUM )
            // InternalDdLexer.g:142:12: RULE_NUM
            {
            mRULE_NUM(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_CONT"
    public final void mRULE_CONT() throws RecognitionException {
        try {
            int _type = RULE_CONT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDdLexer.g:144:11: ( '\\\\' ( RULE_NL )+ )
            // InternalDdLexer.g:144:13: '\\\\' ( RULE_NL )+
            {
            match('\\'); 
            // InternalDdLexer.g:144:18: ( RULE_NL )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDdLexer.g:144:18: RULE_NL
            	    {
            	    mRULE_NL(); 

            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CONT"

    // $ANTLR start "RULE_IDENT"
    public final void mRULE_IDENT() throws RecognitionException {
        try {
            int _type = RULE_IDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDdLexer.g:146:12: ( ( RULE_NL )+ ( '\\t' )* )
            // InternalDdLexer.g:146:14: ( RULE_NL )+ ( '\\t' )*
            {
            // InternalDdLexer.g:146:14: ( RULE_NL )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDdLexer.g:146:14: RULE_NL
            	    {
            	    mRULE_NL(); 

            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

            // InternalDdLexer.g:146:23: ( '\\t' )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0=='\t') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDdLexer.g:146:23: '\\t'
            	    {
            	    match('\t'); 

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IDENT"

    // $ANTLR start "RULE_CMT"
    public final void mRULE_CMT() throws RecognitionException {
        try {
            int _type = RULE_CMT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDdLexer.g:148:10: ( '\\'' (~ ( ( '\\r' | '\\n' ) ) )* )
            // InternalDdLexer.g:148:12: '\\'' (~ ( ( '\\r' | '\\n' ) ) )*
            {
            match('\''); 
            // InternalDdLexer.g:148:17: (~ ( ( '\\r' | '\\n' ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\u0000' && LA13_0<='\t')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalDdLexer.g:148:17: ~ ( ( '\\r' | '\\n' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CMT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDdLexer.g:150:9: ( ( ' ' | '\\t' )+ )
            // InternalDdLexer.g:150:11: ( ' ' | '\\t' )+
            {
            // InternalDdLexer.g:150:11: ( ' ' | '\\t' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0=='\t'||LA14_0==' ') ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalDdLexer.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDdLexer.g:152:16: ( . )
            // InternalDdLexer.g:152:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalDdLexer.g:1:8: ( False | Round | Stamp | Unset | Bits | Bool | Date | Like | Stxt | Time | True | And | Chr | Dec | Int | Len | Not | Str | HalfwidthHangulFillerHalfwidthHangulFillerHalfwidthHangulFiller | ExclamationMarkEqualsSign | HyphenMinusGreaterThanSign | LessThanSignEqualsSign | EqualsSignEqualsSign | GreaterThanSignEqualsSign | In | Or | Pk | ExclamationMark | PercentSign | Ampersand | LeftParenthesis | RightParenthesis | Asterisk | PlusSign | Comma | HyphenMinus | FullStop | Solidus | Colon | LessThanSign | EqualsSign | GreaterThanSign | LeftSquareBracket | RightSquareBracket | CircumflexAccent | RULE_CHR | RULE_STR | RULE_RANGEINF | RULE_RANGE | RULE_CHKID | RULE_CSTID | RULE_OBJID | RULE_ID | RULE_DEC | RULE_INT | RULE_CONT | RULE_IDENT | RULE_CMT | RULE_WS | RULE_ANY_OTHER )
        int alt15=60;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // InternalDdLexer.g:1:10: False
                {
                mFalse(); 

                }
                break;
            case 2 :
                // InternalDdLexer.g:1:16: Round
                {
                mRound(); 

                }
                break;
            case 3 :
                // InternalDdLexer.g:1:22: Stamp
                {
                mStamp(); 

                }
                break;
            case 4 :
                // InternalDdLexer.g:1:28: Unset
                {
                mUnset(); 

                }
                break;
            case 5 :
                // InternalDdLexer.g:1:34: Bits
                {
                mBits(); 

                }
                break;
            case 6 :
                // InternalDdLexer.g:1:39: Bool
                {
                mBool(); 

                }
                break;
            case 7 :
                // InternalDdLexer.g:1:44: Date
                {
                mDate(); 

                }
                break;
            case 8 :
                // InternalDdLexer.g:1:49: Like
                {
                mLike(); 

                }
                break;
            case 9 :
                // InternalDdLexer.g:1:54: Stxt
                {
                mStxt(); 

                }
                break;
            case 10 :
                // InternalDdLexer.g:1:59: Time
                {
                mTime(); 

                }
                break;
            case 11 :
                // InternalDdLexer.g:1:64: True
                {
                mTrue(); 

                }
                break;
            case 12 :
                // InternalDdLexer.g:1:69: And
                {
                mAnd(); 

                }
                break;
            case 13 :
                // InternalDdLexer.g:1:73: Chr
                {
                mChr(); 

                }
                break;
            case 14 :
                // InternalDdLexer.g:1:77: Dec
                {
                mDec(); 

                }
                break;
            case 15 :
                // InternalDdLexer.g:1:81: Int
                {
                mInt(); 

                }
                break;
            case 16 :
                // InternalDdLexer.g:1:85: Len
                {
                mLen(); 

                }
                break;
            case 17 :
                // InternalDdLexer.g:1:89: Not
                {
                mNot(); 

                }
                break;
            case 18 :
                // InternalDdLexer.g:1:93: Str
                {
                mStr(); 

                }
                break;
            case 19 :
                // InternalDdLexer.g:1:97: HalfwidthHangulFillerHalfwidthHangulFillerHalfwidthHangulFiller
                {
                mHalfwidthHangulFillerHalfwidthHangulFillerHalfwidthHangulFiller(); 

                }
                break;
            case 20 :
                // InternalDdLexer.g:1:161: ExclamationMarkEqualsSign
                {
                mExclamationMarkEqualsSign(); 

                }
                break;
            case 21 :
                // InternalDdLexer.g:1:187: HyphenMinusGreaterThanSign
                {
                mHyphenMinusGreaterThanSign(); 

                }
                break;
            case 22 :
                // InternalDdLexer.g:1:214: LessThanSignEqualsSign
                {
                mLessThanSignEqualsSign(); 

                }
                break;
            case 23 :
                // InternalDdLexer.g:1:237: EqualsSignEqualsSign
                {
                mEqualsSignEqualsSign(); 

                }
                break;
            case 24 :
                // InternalDdLexer.g:1:258: GreaterThanSignEqualsSign
                {
                mGreaterThanSignEqualsSign(); 

                }
                break;
            case 25 :
                // InternalDdLexer.g:1:284: In
                {
                mIn(); 

                }
                break;
            case 26 :
                // InternalDdLexer.g:1:287: Or
                {
                mOr(); 

                }
                break;
            case 27 :
                // InternalDdLexer.g:1:290: Pk
                {
                mPk(); 

                }
                break;
            case 28 :
                // InternalDdLexer.g:1:293: ExclamationMark
                {
                mExclamationMark(); 

                }
                break;
            case 29 :
                // InternalDdLexer.g:1:309: PercentSign
                {
                mPercentSign(); 

                }
                break;
            case 30 :
                // InternalDdLexer.g:1:321: Ampersand
                {
                mAmpersand(); 

                }
                break;
            case 31 :
                // InternalDdLexer.g:1:331: LeftParenthesis
                {
                mLeftParenthesis(); 

                }
                break;
            case 32 :
                // InternalDdLexer.g:1:347: RightParenthesis
                {
                mRightParenthesis(); 

                }
                break;
            case 33 :
                // InternalDdLexer.g:1:364: Asterisk
                {
                mAsterisk(); 

                }
                break;
            case 34 :
                // InternalDdLexer.g:1:373: PlusSign
                {
                mPlusSign(); 

                }
                break;
            case 35 :
                // InternalDdLexer.g:1:382: Comma
                {
                mComma(); 

                }
                break;
            case 36 :
                // InternalDdLexer.g:1:388: HyphenMinus
                {
                mHyphenMinus(); 

                }
                break;
            case 37 :
                // InternalDdLexer.g:1:400: FullStop
                {
                mFullStop(); 

                }
                break;
            case 38 :
                // InternalDdLexer.g:1:409: Solidus
                {
                mSolidus(); 

                }
                break;
            case 39 :
                // InternalDdLexer.g:1:417: Colon
                {
                mColon(); 

                }
                break;
            case 40 :
                // InternalDdLexer.g:1:423: LessThanSign
                {
                mLessThanSign(); 

                }
                break;
            case 41 :
                // InternalDdLexer.g:1:436: EqualsSign
                {
                mEqualsSign(); 

                }
                break;
            case 42 :
                // InternalDdLexer.g:1:447: GreaterThanSign
                {
                mGreaterThanSign(); 

                }
                break;
            case 43 :
                // InternalDdLexer.g:1:463: LeftSquareBracket
                {
                mLeftSquareBracket(); 

                }
                break;
            case 44 :
                // InternalDdLexer.g:1:481: RightSquareBracket
                {
                mRightSquareBracket(); 

                }
                break;
            case 45 :
                // InternalDdLexer.g:1:500: CircumflexAccent
                {
                mCircumflexAccent(); 

                }
                break;
            case 46 :
                // InternalDdLexer.g:1:517: RULE_CHR
                {
                mRULE_CHR(); 

                }
                break;
            case 47 :
                // InternalDdLexer.g:1:526: RULE_STR
                {
                mRULE_STR(); 

                }
                break;
            case 48 :
                // InternalDdLexer.g:1:535: RULE_RANGEINF
                {
                mRULE_RANGEINF(); 

                }
                break;
            case 49 :
                // InternalDdLexer.g:1:549: RULE_RANGE
                {
                mRULE_RANGE(); 

                }
                break;
            case 50 :
                // InternalDdLexer.g:1:560: RULE_CHKID
                {
                mRULE_CHKID(); 

                }
                break;
            case 51 :
                // InternalDdLexer.g:1:571: RULE_CSTID
                {
                mRULE_CSTID(); 

                }
                break;
            case 52 :
                // InternalDdLexer.g:1:582: RULE_OBJID
                {
                mRULE_OBJID(); 

                }
                break;
            case 53 :
                // InternalDdLexer.g:1:593: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 54 :
                // InternalDdLexer.g:1:601: RULE_DEC
                {
                mRULE_DEC(); 

                }
                break;
            case 55 :
                // InternalDdLexer.g:1:610: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 56 :
                // InternalDdLexer.g:1:619: RULE_CONT
                {
                mRULE_CONT(); 

                }
                break;
            case 57 :
                // InternalDdLexer.g:1:629: RULE_IDENT
                {
                mRULE_IDENT(); 

                }
                break;
            case 58 :
                // InternalDdLexer.g:1:640: RULE_CMT
                {
                mRULE_CMT(); 

                }
                break;
            case 59 :
                // InternalDdLexer.g:1:649: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 60 :
                // InternalDdLexer.g:1:657: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\1\uffff\14\56\1\54\1\100\1\102\1\104\1\106\1\110\2\56\15\uffff\1\54\1\133\1\uffff\1\140\1\uffff\2\54\4\uffff\1\56\1\uffff\15\56\1\167\1\56\13\uffff\1\171\1\172\21\uffff\1\133\2\uffff\1\140\6\uffff\4\56\1\u0089\4\56\1\u008e\1\56\1\u0090\2\56\1\u0093\1\u0094\1\u0095\1\uffff\1\u0096\14\uffff\3\56\1\u009d\1\uffff\1\56\1\u009f\1\u00a0\1\u00a1\1\uffff\1\u00a2\1\uffff\1\u00a3\1\u00a4\7\uffff\1\u00a6\1\u00a7\1\u00a8\1\uffff\1\u00a9\15\uffff";
    static final String DFA15_eofS =
        "\u00ac\uffff";
    static final String DFA15_minS =
        "\1\0\1\141\1\157\1\164\1\156\1\151\1\141\1\145\1\151\1\156\1\150\1\156\1\157\1\uffa0\1\75\1\76\3\75\1\162\1\153\15\uffff\1\40\1\56\1\uffff\1\60\1\uffff\2\12\4\uffff\1\154\1\uffff\1\165\1\141\1\163\1\164\1\157\1\164\1\143\1\153\1\156\1\155\1\165\1\144\1\162\1\60\1\164\13\uffff\2\60\15\uffff\1\42\1\40\2\uffff\2\56\1\uffff\1\60\6\uffff\1\163\1\156\1\155\1\164\1\60\1\145\1\163\1\154\1\145\1\60\1\145\1\60\2\145\3\60\1\uffff\1\60\2\uffff\5\40\1\60\2\uffff\1\60\1\uffff\1\145\1\144\1\160\1\60\1\uffff\1\164\3\60\1\uffff\1\60\1\uffff\2\60\4\uffff\1\60\2\uffff\3\60\1\uffff\1\60\6\uffff\1\60\4\uffff\1\60\1\40";
    static final String DFA15_maxS =
        "\1\uffff\1\141\1\157\1\164\1\156\1\157\1\145\1\151\1\162\1\156\1\150\1\156\1\157\1\uffa0\1\75\1\76\3\75\1\162\1\153\15\uffff\1\176\1\71\1\uffff\1\172\1\uffff\1\15\1\12\4\uffff\1\154\1\uffff\1\165\1\170\1\163\1\164\1\157\1\164\1\143\1\153\1\156\1\155\1\165\1\144\1\162\1\172\1\164\13\uffff\2\172\15\uffff\1\165\1\176\2\uffff\2\71\1\uffff\1\172\6\uffff\1\163\1\156\1\155\1\164\1\172\1\145\1\163\1\154\1\145\1\172\1\145\1\172\2\145\3\172\1\uffff\1\172\2\uffff\5\176\1\146\2\uffff\1\156\1\uffff\1\145\1\144\1\160\1\172\1\uffff\1\164\3\172\1\uffff\1\172\1\uffff\2\172\4\uffff\1\146\2\uffff\3\172\1\uffff\1\172\6\uffff\1\146\4\uffff\1\146\1\176";
    static final String DFA15_acceptS =
        "\25\uffff\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\45\1\46\1\47\1\53\1\54\1\55\2\uffff\1\62\1\uffff\1\65\2\uffff\1\71\1\72\1\73\1\74\1\uffff\1\65\17\uffff\1\23\1\24\1\34\1\25\1\44\1\26\1\50\1\27\1\51\1\30\1\52\2\uffff\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\45\1\46\1\47\1\53\1\54\1\55\2\uffff\1\56\1\67\2\uffff\1\62\1\uffff\1\63\1\64\1\70\1\71\1\72\1\73\21\uffff\1\31\1\uffff\1\32\1\33\6\uffff\1\56\1\57\1\uffff\1\66\4\uffff\1\22\4\uffff\1\16\1\uffff\1\20\2\uffff\1\14\1\15\1\17\1\21\1\uffff\1\60\1\61\3\uffff\1\11\1\uffff\1\5\1\6\1\7\1\10\1\12\1\13\1\uffff\1\1\1\2\1\3\1\4\2\uffff";
    static final String DFA15_specialS =
        "\1\0\u00ab\uffff}>";
    static final String[] DFA15_transitionS = {
            "\11\54\1\53\1\51\2\54\1\50\22\54\1\53\1\16\1\42\1\44\1\54\1\25\1\26\1\52\1\27\1\30\1\31\1\32\1\33\1\17\1\34\1\35\12\43\1\36\1\54\1\20\1\21\1\22\2\54\32\45\1\37\1\47\1\40\1\41\1\46\1\54\1\11\1\5\1\12\1\6\1\46\1\1\2\46\1\13\2\46\1\7\1\46\1\14\1\23\1\24\1\46\1\2\1\3\1\10\1\4\5\46\3\54\1\46\uff21\54\1\15\137\54",
            "\1\55",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62\5\uffff\1\63",
            "\1\64\3\uffff\1\65",
            "\1\67\3\uffff\1\66",
            "\1\70\10\uffff\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\101",
            "\1\103",
            "\1\105",
            "\1\107",
            "\1\111",
            "\1\112",
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
            "\2\131\1\132\71\131\1\130\42\131",
            "\1\135\1\uffff\12\134",
            "",
            "\12\137\7\uffff\32\137\4\uffff\1\137\1\uffff\32\141",
            "",
            "\1\142\2\uffff\1\142",
            "\1\143",
            "",
            "",
            "",
            "",
            "\1\146",
            "",
            "\1\147",
            "\1\150\20\uffff\1\152\5\uffff\1\151",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\166\6\56",
            "\1\170",
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
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
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
            "\1\176\71\uffff\1\177\21\uffff\1\174\3\uffff\1\175\1\uffff\1\173\1\u0080",
            "\2\u0082\1\u0081\134\u0082",
            "",
            "",
            "\1\135\1\uffff\12\134",
            "\1\u0083\1\uffff\12\u0084",
            "",
            "\12\137\7\uffff\32\137\4\uffff\1\137\1\uffff\32\141",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u008f",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0091",
            "\1\u0092",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "\2\u0082\1\u0081\134\u0082",
            "\2\u0082\1\u0081\134\u0082",
            "\2\u0082\1\u0081\134\u0082",
            "\2\u0082\1\u0081\134\u0082",
            "\2\u0082\1\u0081\134\u0082",
            "\12\u0097\7\uffff\6\u0097\32\uffff\6\u0097",
            "",
            "",
            "\12\u0099\64\uffff\1\u0098",
            "",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\u009e",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "",
            "",
            "\12\u00a5\7\uffff\6\u00a5\32\uffff\6\u00a5",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\u00aa\7\uffff\6\u00aa\32\uffff\6\u00aa",
            "",
            "",
            "",
            "",
            "\12\u00ab\7\uffff\6\u00ab\32\uffff\6\u00ab",
            "\2\u0082\1\u0081\134\u0082"
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( False | Round | Stamp | Unset | Bits | Bool | Date | Like | Stxt | Time | True | And | Chr | Dec | Int | Len | Not | Str | HalfwidthHangulFillerHalfwidthHangulFillerHalfwidthHangulFiller | ExclamationMarkEqualsSign | HyphenMinusGreaterThanSign | LessThanSignEqualsSign | EqualsSignEqualsSign | GreaterThanSignEqualsSign | In | Or | Pk | ExclamationMark | PercentSign | Ampersand | LeftParenthesis | RightParenthesis | Asterisk | PlusSign | Comma | HyphenMinus | FullStop | Solidus | Colon | LessThanSign | EqualsSign | GreaterThanSign | LeftSquareBracket | RightSquareBracket | CircumflexAccent | RULE_CHR | RULE_STR | RULE_RANGEINF | RULE_RANGE | RULE_CHKID | RULE_CSTID | RULE_OBJID | RULE_ID | RULE_DEC | RULE_INT | RULE_CONT | RULE_IDENT | RULE_CMT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_0 = input.LA(1);

                        s = -1;
                        if ( (LA15_0=='f') ) {s = 1;}

                        else if ( (LA15_0=='r') ) {s = 2;}

                        else if ( (LA15_0=='s') ) {s = 3;}

                        else if ( (LA15_0=='u') ) {s = 4;}

                        else if ( (LA15_0=='b') ) {s = 5;}

                        else if ( (LA15_0=='d') ) {s = 6;}

                        else if ( (LA15_0=='l') ) {s = 7;}

                        else if ( (LA15_0=='t') ) {s = 8;}

                        else if ( (LA15_0=='a') ) {s = 9;}

                        else if ( (LA15_0=='c') ) {s = 10;}

                        else if ( (LA15_0=='i') ) {s = 11;}

                        else if ( (LA15_0=='n') ) {s = 12;}

                        else if ( (LA15_0=='\uFFA0') ) {s = 13;}

                        else if ( (LA15_0=='!') ) {s = 14;}

                        else if ( (LA15_0=='-') ) {s = 15;}

                        else if ( (LA15_0=='<') ) {s = 16;}

                        else if ( (LA15_0=='=') ) {s = 17;}

                        else if ( (LA15_0=='>') ) {s = 18;}

                        else if ( (LA15_0=='o') ) {s = 19;}

                        else if ( (LA15_0=='p') ) {s = 20;}

                        else if ( (LA15_0=='%') ) {s = 21;}

                        else if ( (LA15_0=='&') ) {s = 22;}

                        else if ( (LA15_0=='(') ) {s = 23;}

                        else if ( (LA15_0==')') ) {s = 24;}

                        else if ( (LA15_0=='*') ) {s = 25;}

                        else if ( (LA15_0=='+') ) {s = 26;}

                        else if ( (LA15_0==',') ) {s = 27;}

                        else if ( (LA15_0=='.') ) {s = 28;}

                        else if ( (LA15_0=='/') ) {s = 29;}

                        else if ( (LA15_0==':') ) {s = 30;}

                        else if ( (LA15_0=='[') ) {s = 31;}

                        else if ( (LA15_0==']') ) {s = 32;}

                        else if ( (LA15_0=='^') ) {s = 33;}

                        else if ( (LA15_0=='\"') ) {s = 34;}

                        else if ( ((LA15_0>='0' && LA15_0<='9')) ) {s = 35;}

                        else if ( (LA15_0=='#') ) {s = 36;}

                        else if ( ((LA15_0>='A' && LA15_0<='Z')) ) {s = 37;}

                        else if ( (LA15_0=='_'||LA15_0=='e'||(LA15_0>='g' && LA15_0<='h')||(LA15_0>='j' && LA15_0<='k')||LA15_0=='m'||LA15_0=='q'||(LA15_0>='v' && LA15_0<='z')||LA15_0=='~') ) {s = 38;}

                        else if ( (LA15_0=='\\') ) {s = 39;}

                        else if ( (LA15_0=='\r') ) {s = 40;}

                        else if ( (LA15_0=='\n') ) {s = 41;}

                        else if ( (LA15_0=='\'') ) {s = 42;}

                        else if ( (LA15_0=='\t'||LA15_0==' ') ) {s = 43;}

                        else if ( ((LA15_0>='\u0000' && LA15_0<='\b')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\u001F')||LA15_0=='$'||LA15_0==';'||(LA15_0>='?' && LA15_0<='@')||LA15_0=='`'||(LA15_0>='{' && LA15_0<='}')||(LA15_0>='\u007F' && LA15_0<='\uFF9F')||(LA15_0>='\uFFA1' && LA15_0<='\uFFFF')) ) {s = 44;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}