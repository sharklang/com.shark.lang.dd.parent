package com.shark.lang.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDdLexer extends Lexer {
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

    public InternalDdLexer() {;} 
    public InternalDdLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalDdLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalDdLexer.g"; }

    // $ANTLR start "Partitionkey"
    public final void mPartitionkey() throws RecognitionException {
        try {
            int _type = Partitionkey;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDdLexer.g:14:14: ( 'partitionkey' )
            // InternalDdLexer.g:14:16: 'partitionkey'
            {
            match("partitionkey"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Partitionkey"

    // $ANTLR start "Deprecated"
    public final void mDeprecated() throws RecognitionException {
        try {
            int _type = Deprecated;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDdLexer.g:16:12: ( 'deprecated' )
            // InternalDdLexer.g:16:14: 'deprecated'
            {
            match("deprecated"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Deprecated"

    // $ANTLR start "False"
    public final void mFalse() throws RecognitionException {
        try {
            int _type = False;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDdLexer.g:18:7: ( 'false' )
            // InternalDdLexer.g:18:9: 'false'
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

    // $ANTLR start "Model"
    public final void mModel() throws RecognitionException {
        try {
            int _type = Model;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDdLexer.g:20:7: ( 'model' )
            // InternalDdLexer.g:20:9: 'model'
            {
            match("model"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Model"

    // $ANTLR start "Round"
    public final void mRound() throws RecognitionException {
        try {
            int _type = Round;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDdLexer.g:22:7: ( 'round' )
            // InternalDdLexer.g:22:9: 'round'
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
            // InternalDdLexer.g:24:7: ( 'stamp' )
            // InternalDdLexer.g:24:9: 'stamp'
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
            // InternalDdLexer.g:26:7: ( 'unset' )
            // InternalDdLexer.g:26:9: 'unset'
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
            // InternalDdLexer.g:28:6: ( 'bits' )
            // InternalDdLexer.g:28:8: 'bits'
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
            // InternalDdLexer.g:30:6: ( 'bool' )
            // InternalDdLexer.g:30:8: 'bool'
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
            // InternalDdLexer.g:32:6: ( 'date' )
            // InternalDdLexer.g:32:8: 'date'
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
            // InternalDdLexer.g:34:6: ( 'like' )
            // InternalDdLexer.g:34:8: 'like'
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
            // InternalDdLexer.g:36:6: ( 'stxt' )
            // InternalDdLexer.g:36:8: 'stxt'
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
            // InternalDdLexer.g:38:6: ( 'time' )
            // InternalDdLexer.g:38:8: 'time'
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
            // InternalDdLexer.g:40:6: ( 'true' )
            // InternalDdLexer.g:40:8: 'true'
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
            // InternalDdLexer.g:42:5: ( 'and' )
            // InternalDdLexer.g:42:7: 'and'
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
            // InternalDdLexer.g:44:5: ( 'chr' )
            // InternalDdLexer.g:44:7: 'chr'
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
            // InternalDdLexer.g:46:5: ( 'dec' )
            // InternalDdLexer.g:46:7: 'dec'
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
            // InternalDdLexer.g:48:5: ( 'int' )
            // InternalDdLexer.g:48:7: 'int'
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

    // $ANTLR start "Key"
    public final void mKey() throws RecognitionException {
        try {
            int _type = Key;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDdLexer.g:50:5: ( 'key' )
            // InternalDdLexer.g:50:7: 'key'
            {
            match("key"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Key"

    // $ANTLR start "Len"
    public final void mLen() throws RecognitionException {
        try {
            int _type = Len;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDdLexer.g:52:5: ( 'len' )
            // InternalDdLexer.g:52:7: 'len'
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
            // InternalDdLexer.g:54:5: ( 'not' )
            // InternalDdLexer.g:54:7: 'not'
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
            // InternalDdLexer.g:56:5: ( 'str' )
            // InternalDdLexer.g:56:7: 'str'
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
            // InternalDdLexer.g:58:65: ( '\\uFFA0\\uFFA0\\uFFA0' )
            // InternalDdLexer.g:58:67: '\\uFFA0\\uFFA0\\uFFA0'
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
            // InternalDdLexer.g:60:27: ( '!=' )
            // InternalDdLexer.g:60:29: '!='
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
            // InternalDdLexer.g:62:28: ( '->' )
            // InternalDdLexer.g:62:30: '->'
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
            // InternalDdLexer.g:64:24: ( '<=' )
            // InternalDdLexer.g:64:26: '<='
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
            // InternalDdLexer.g:66:22: ( '==' )
            // InternalDdLexer.g:66:24: '=='
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
            // InternalDdLexer.g:68:27: ( '>=' )
            // InternalDdLexer.g:68:29: '>='
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

    // $ANTLR start "LeftSquareBracketRightSquareBracket"
    public final void mLeftSquareBracketRightSquareBracket() throws RecognitionException {
        try {
            int _type = LeftSquareBracketRightSquareBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDdLexer.g:70:37: ( '[]' )
            // InternalDdLexer.g:70:39: '[]'
            {
            match("[]"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftSquareBracketRightSquareBracket"

    // $ANTLR start "In"
    public final void mIn() throws RecognitionException {
        try {
            int _type = In;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDdLexer.g:72:4: ( 'in' )
            // InternalDdLexer.g:72:6: 'in'
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
            // InternalDdLexer.g:74:4: ( 'or' )
            // InternalDdLexer.g:74:6: 'or'
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

    // $ANTLR start "ExclamationMark"
    public final void mExclamationMark() throws RecognitionException {
        try {
            int _type = ExclamationMark;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDdLexer.g:76:17: ( '!' )
            // InternalDdLexer.g:76:19: '!'
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
            // InternalDdLexer.g:78:13: ( '%' )
            // InternalDdLexer.g:78:15: '%'
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
            // InternalDdLexer.g:80:11: ( '&' )
            // InternalDdLexer.g:80:13: '&'
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
            // InternalDdLexer.g:82:17: ( '(' )
            // InternalDdLexer.g:82:19: '('
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
            // InternalDdLexer.g:84:18: ( ')' )
            // InternalDdLexer.g:84:20: ')'
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
            // InternalDdLexer.g:86:10: ( '*' )
            // InternalDdLexer.g:86:12: '*'
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
            // InternalDdLexer.g:88:10: ( '+' )
            // InternalDdLexer.g:88:12: '+'
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
            // InternalDdLexer.g:90:7: ( ',' )
            // InternalDdLexer.g:90:9: ','
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
            // InternalDdLexer.g:92:13: ( '-' )
            // InternalDdLexer.g:92:15: '-'
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
            // InternalDdLexer.g:94:10: ( '.' )
            // InternalDdLexer.g:94:12: '.'
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
            // InternalDdLexer.g:96:9: ( '/' )
            // InternalDdLexer.g:96:11: '/'
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
            // InternalDdLexer.g:98:7: ( ':' )
            // InternalDdLexer.g:98:9: ':'
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
            // InternalDdLexer.g:100:14: ( '<' )
            // InternalDdLexer.g:100:16: '<'
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
            // InternalDdLexer.g:102:12: ( '=' )
            // InternalDdLexer.g:102:14: '='
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
            // InternalDdLexer.g:104:17: ( '>' )
            // InternalDdLexer.g:104:19: '>'
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
            // InternalDdLexer.g:106:19: ( '[' )
            // InternalDdLexer.g:106:21: '['
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
            // InternalDdLexer.g:108:20: ( ']' )
            // InternalDdLexer.g:108:22: ']'
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
            // InternalDdLexer.g:110:18: ( '^' )
            // InternalDdLexer.g:110:20: '^'
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

    // $ANTLR start "LeftCurlyBracket"
    public final void mLeftCurlyBracket() throws RecognitionException {
        try {
            int _type = LeftCurlyBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDdLexer.g:112:18: ( '{' )
            // InternalDdLexer.g:112:20: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftCurlyBracket"

    // $ANTLR start "RightCurlyBracket"
    public final void mRightCurlyBracket() throws RecognitionException {
        try {
            int _type = RightCurlyBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDdLexer.g:114:19: ( '}' )
            // InternalDdLexer.g:114:21: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightCurlyBracket"

    // $ANTLR start "RULE_BEGIN"
    public final void mRULE_BEGIN() throws RecognitionException {
        try {
            // InternalDdLexer.g:116:21: ()
            // InternalDdLexer.g:116:23: 
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
            // InternalDdLexer.g:118:19: ()
            // InternalDdLexer.g:118:21: 
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
            // InternalDdLexer.g:120:19: ()
            // InternalDdLexer.g:120:21: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_EOL"

    // $ANTLR start "RULE_NUL"
    public final void mRULE_NUL() throws RecognitionException {
        try {
            // InternalDdLexer.g:122:19: ()
            // InternalDdLexer.g:122:21: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_NUL"

    // $ANTLR start "RULE_HEX"
    public final void mRULE_HEX() throws RecognitionException {
        try {
            // InternalDdLexer.g:124:19: ( ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) )
            // InternalDdLexer.g:124:21: ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' )
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
            // InternalDdLexer.g:126:19: ( ( '0' .. '9' )+ )
            // InternalDdLexer.g:126:21: ( '0' .. '9' )+
            {
            // InternalDdLexer.g:126:21: ( '0' .. '9' )+
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
            	    // InternalDdLexer.g:126:22: '0' .. '9'
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
            // InternalDdLexer.g:128:19: ( 'u' RULE_HEX RULE_HEX RULE_HEX RULE_HEX )
            // InternalDdLexer.g:128:21: 'u' RULE_HEX RULE_HEX RULE_HEX RULE_HEX
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
            // InternalDdLexer.g:130:19: ( '\\\\' ( 't' | 'n' | 'r' | '\"' | '\\\\' | RULE_UNI ) )
            // InternalDdLexer.g:130:21: '\\\\' ( 't' | 'n' | 'r' | '\"' | '\\\\' | RULE_UNI )
            {
            match('\\'); 
            // InternalDdLexer.g:130:26: ( 't' | 'n' | 'r' | '\"' | '\\\\' | RULE_UNI )
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
                    // InternalDdLexer.g:130:27: 't'
                    {
                    match('t'); 

                    }
                    break;
                case 2 :
                    // InternalDdLexer.g:130:31: 'n'
                    {
                    match('n'); 

                    }
                    break;
                case 3 :
                    // InternalDdLexer.g:130:35: 'r'
                    {
                    match('r'); 

                    }
                    break;
                case 4 :
                    // InternalDdLexer.g:130:39: '\"'
                    {
                    match('\"'); 

                    }
                    break;
                case 5 :
                    // InternalDdLexer.g:130:43: '\\\\'
                    {
                    match('\\'); 

                    }
                    break;
                case 6 :
                    // InternalDdLexer.g:130:48: RULE_UNI
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
            // InternalDdLexer.g:132:21: ( ( '!' | '#' | '$' | '%' | '&' | '\\'' | '(' | ')' | '*' | '+' | ',' | '-' | '.' | '/' | '0' .. '9' | ' ' | ':' | ';' | '<' | '=' | '>' | '?' | '@' | 'A' .. 'Z' | '[' | ']' | '^' | '_' | '`' | 'a' .. 'z' | '{' | '|' | '}' | '~' ) )
            // InternalDdLexer.g:132:23: ( '!' | '#' | '$' | '%' | '&' | '\\'' | '(' | ')' | '*' | '+' | ',' | '-' | '.' | '/' | '0' .. '9' | ' ' | ':' | ';' | '<' | '=' | '>' | '?' | '@' | 'A' .. 'Z' | '[' | ']' | '^' | '_' | '`' | 'a' .. 'z' | '{' | '|' | '}' | '~' )
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
            // InternalDdLexer.g:134:18: ( ( '\\r' )? '\\n' )
            // InternalDdLexer.g:134:20: ( '\\r' )? '\\n'
            {
            // InternalDdLexer.g:134:20: ( '\\r' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\r') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalDdLexer.g:134:20: '\\r'
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

    // $ANTLR start "RULE_STR"
    public final void mRULE_STR() throws RecognitionException {
        try {
            int _type = RULE_STR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDdLexer.g:136:10: ( '\"' ( RULE_ESC | RULE_ASCII ) ( RULE_ESC | RULE_ASCII ) ( RULE_ESC | RULE_ASCII )* '\"' )
            // InternalDdLexer.g:136:12: '\"' ( RULE_ESC | RULE_ASCII ) ( RULE_ESC | RULE_ASCII ) ( RULE_ESC | RULE_ASCII )* '\"'
            {
            match('\"'); 
            // InternalDdLexer.g:136:16: ( RULE_ESC | RULE_ASCII )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\\') ) {
                alt4=1;
            }
            else if ( ((LA4_0>=' ' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='~')) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalDdLexer.g:136:17: RULE_ESC
                    {
                    mRULE_ESC(); 

                    }
                    break;
                case 2 :
                    // InternalDdLexer.g:136:26: RULE_ASCII
                    {
                    mRULE_ASCII(); 

                    }
                    break;

            }

            // InternalDdLexer.g:136:38: ( RULE_ESC | RULE_ASCII )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='\\') ) {
                alt5=1;
            }
            else if ( ((LA5_0>=' ' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='~')) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalDdLexer.g:136:39: RULE_ESC
                    {
                    mRULE_ESC(); 

                    }
                    break;
                case 2 :
                    // InternalDdLexer.g:136:48: RULE_ASCII
                    {
                    mRULE_ASCII(); 

                    }
                    break;

            }

            // InternalDdLexer.g:136:60: ( RULE_ESC | RULE_ASCII )*
            loop6:
            do {
                int alt6=3;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='\\') ) {
                    alt6=1;
                }
                else if ( ((LA6_0>=' ' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='~')) ) {
                    alt6=2;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDdLexer.g:136:61: RULE_ESC
            	    {
            	    mRULE_ESC(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalDdLexer.g:136:70: RULE_ASCII
            	    {
            	    mRULE_ASCII(); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
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

    // $ANTLR start "RULE_CHR"
    public final void mRULE_CHR() throws RecognitionException {
        try {
            int _type = RULE_CHR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDdLexer.g:138:10: ( '\"' ( RULE_ESC | RULE_ASCII )? '\"' )
            // InternalDdLexer.g:138:12: '\"' ( RULE_ESC | RULE_ASCII )? '\"'
            {
            match('\"'); 
            // InternalDdLexer.g:138:16: ( RULE_ESC | RULE_ASCII )?
            int alt7=3;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\\') ) {
                alt7=1;
            }
            else if ( ((LA7_0>=' ' && LA7_0<='!')||(LA7_0>='#' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='~')) ) {
                alt7=2;
            }
            switch (alt7) {
                case 1 :
                    // InternalDdLexer.g:138:17: RULE_ESC
                    {
                    mRULE_ESC(); 

                    }
                    break;
                case 2 :
                    // InternalDdLexer.g:138:26: RULE_ASCII
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

    // $ANTLR start "RULE_RANGEINF"
    public final void mRULE_RANGEINF() throws RecognitionException {
        try {
            int _type = RULE_RANGEINF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDdLexer.g:140:15: ( RULE_NUM '..n' )
            // InternalDdLexer.g:140:17: RULE_NUM '..n'
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
            // InternalDdLexer.g:142:12: ( RULE_NUM '..' RULE_NUM )
            // InternalDdLexer.g:142:14: RULE_NUM '..' RULE_NUM
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
            // InternalDdLexer.g:144:12: ( '#' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalDdLexer.g:144:14: '#' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            match('#'); 
            // InternalDdLexer.g:144:18: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
    // $ANTLR end "RULE_CHKID"

    // $ANTLR start "RULE_CSTID"
    public final void mRULE_CSTID() throws RecognitionException {
        try {
            int _type = RULE_CSTID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDdLexer.g:146:12: ( 'A' .. 'Z' ( 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalDdLexer.g:146:14: 'A' .. 'Z' ( 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            matchRange('A','Z'); 
            // InternalDdLexer.g:146:23: ( 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')||(LA9_0>='A' && LA9_0<='Z')||LA9_0=='_') ) {
                    alt9=1;
                }


                switch (alt9) {
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
    // $ANTLR end "RULE_CSTID"

    // $ANTLR start "RULE_OBJID"
    public final void mRULE_OBJID() throws RecognitionException {
        try {
            int _type = RULE_OBJID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDdLexer.g:148:12: ( 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalDdLexer.g:148:14: 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            matchRange('A','Z'); 
            // InternalDdLexer.g:148:23: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='0' && LA10_0<='9')||(LA10_0>='A' && LA10_0<='Z')||LA10_0=='_'||(LA10_0>='a' && LA10_0<='z')) ) {
                    alt10=1;
                }


                switch (alt10) {
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
            	    break loop10;
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
            // InternalDdLexer.g:150:9: ( ( 'a' .. 'z' | '_' | '~' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalDdLexer.g:150:11: ( 'a' .. 'z' | '_' | '~' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||input.LA(1)=='~' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalDdLexer.g:150:30: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')||(LA11_0>='A' && LA11_0<='Z')||LA11_0=='_'||(LA11_0>='a' && LA11_0<='z')) ) {
                    alt11=1;
                }


                switch (alt11) {
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
            	    break loop11;
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
            // InternalDdLexer.g:152:10: ( ( '-' )? RULE_NUM '.' RULE_NUM )
            // InternalDdLexer.g:152:12: ( '-' )? RULE_NUM '.' RULE_NUM
            {
            // InternalDdLexer.g:152:12: ( '-' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='-') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDdLexer.g:152:12: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

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
            // InternalDdLexer.g:154:10: ( ( '-' )? RULE_NUM )
            // InternalDdLexer.g:154:12: ( '-' )? RULE_NUM
            {
            // InternalDdLexer.g:154:12: ( '-' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='-') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDdLexer.g:154:12: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

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
            // InternalDdLexer.g:156:11: ( '\\\\' ( RULE_NL )+ )
            // InternalDdLexer.g:156:13: '\\\\' ( RULE_NL )+
            {
            match('\\'); 
            // InternalDdLexer.g:156:18: ( RULE_NL )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0=='\n'||LA14_0=='\r') ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalDdLexer.g:156:18: RULE_NL
            	    {
            	    mRULE_NL(); 

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
    // $ANTLR end "RULE_CONT"

    // $ANTLR start "RULE_IDENT"
    public final void mRULE_IDENT() throws RecognitionException {
        try {
            int _type = RULE_IDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDdLexer.g:158:12: ( ( RULE_NL )+ ( '\\t' )* )
            // InternalDdLexer.g:158:14: ( RULE_NL )+ ( '\\t' )*
            {
            // InternalDdLexer.g:158:14: ( RULE_NL )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0=='\n'||LA15_0=='\r') ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalDdLexer.g:158:14: RULE_NL
            	    {
            	    mRULE_NL(); 

            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);

            // InternalDdLexer.g:158:23: ( '\\t' )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0=='\t') ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalDdLexer.g:158:23: '\\t'
            	    {
            	    match('\t'); 

            	    }
            	    break;

            	default :
            	    break loop16;
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
            // InternalDdLexer.g:160:10: ( '\\'' (~ ( ( '\\r' | '\\n' ) ) )* )
            // InternalDdLexer.g:160:12: '\\'' (~ ( ( '\\r' | '\\n' ) ) )*
            {
            match('\''); 
            // InternalDdLexer.g:160:17: (~ ( ( '\\r' | '\\n' ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='\u0000' && LA17_0<='\t')||(LA17_0>='\u000B' && LA17_0<='\f')||(LA17_0>='\u000E' && LA17_0<='\uFFFF')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalDdLexer.g:160:17: ~ ( ( '\\r' | '\\n' ) )
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
            	    break loop17;
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
            // InternalDdLexer.g:162:9: ( ( ' ' | '\\t' )+ )
            // InternalDdLexer.g:162:11: ( ' ' | '\\t' )+
            {
            // InternalDdLexer.g:162:11: ( ' ' | '\\t' )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0=='\t'||LA18_0==' ') ) {
                    alt18=1;
                }


                switch (alt18) {
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
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
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
            // InternalDdLexer.g:164:16: ( . )
            // InternalDdLexer.g:164:18: .
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
        // InternalDdLexer.g:1:8: ( Partitionkey | Deprecated | False | Model | Round | Stamp | Unset | Bits | Bool | Date | Like | Stxt | Time | True | And | Chr | Dec | Int | Key | Len | Not | Str | HalfwidthHangulFillerHalfwidthHangulFillerHalfwidthHangulFiller | ExclamationMarkEqualsSign | HyphenMinusGreaterThanSign | LessThanSignEqualsSign | EqualsSignEqualsSign | GreaterThanSignEqualsSign | LeftSquareBracketRightSquareBracket | In | Or | ExclamationMark | PercentSign | Ampersand | LeftParenthesis | RightParenthesis | Asterisk | PlusSign | Comma | HyphenMinus | FullStop | Solidus | Colon | LessThanSign | EqualsSign | GreaterThanSign | LeftSquareBracket | RightSquareBracket | CircumflexAccent | LeftCurlyBracket | RightCurlyBracket | RULE_STR | RULE_CHR | RULE_RANGEINF | RULE_RANGE | RULE_CHKID | RULE_CSTID | RULE_OBJID | RULE_ID | RULE_DEC | RULE_INT | RULE_CONT | RULE_IDENT | RULE_CMT | RULE_WS | RULE_ANY_OTHER )
        int alt19=66;
        alt19 = dfa19.predict(input);
        switch (alt19) {
            case 1 :
                // InternalDdLexer.g:1:10: Partitionkey
                {
                mPartitionkey(); 

                }
                break;
            case 2 :
                // InternalDdLexer.g:1:23: Deprecated
                {
                mDeprecated(); 

                }
                break;
            case 3 :
                // InternalDdLexer.g:1:34: False
                {
                mFalse(); 

                }
                break;
            case 4 :
                // InternalDdLexer.g:1:40: Model
                {
                mModel(); 

                }
                break;
            case 5 :
                // InternalDdLexer.g:1:46: Round
                {
                mRound(); 

                }
                break;
            case 6 :
                // InternalDdLexer.g:1:52: Stamp
                {
                mStamp(); 

                }
                break;
            case 7 :
                // InternalDdLexer.g:1:58: Unset
                {
                mUnset(); 

                }
                break;
            case 8 :
                // InternalDdLexer.g:1:64: Bits
                {
                mBits(); 

                }
                break;
            case 9 :
                // InternalDdLexer.g:1:69: Bool
                {
                mBool(); 

                }
                break;
            case 10 :
                // InternalDdLexer.g:1:74: Date
                {
                mDate(); 

                }
                break;
            case 11 :
                // InternalDdLexer.g:1:79: Like
                {
                mLike(); 

                }
                break;
            case 12 :
                // InternalDdLexer.g:1:84: Stxt
                {
                mStxt(); 

                }
                break;
            case 13 :
                // InternalDdLexer.g:1:89: Time
                {
                mTime(); 

                }
                break;
            case 14 :
                // InternalDdLexer.g:1:94: True
                {
                mTrue(); 

                }
                break;
            case 15 :
                // InternalDdLexer.g:1:99: And
                {
                mAnd(); 

                }
                break;
            case 16 :
                // InternalDdLexer.g:1:103: Chr
                {
                mChr(); 

                }
                break;
            case 17 :
                // InternalDdLexer.g:1:107: Dec
                {
                mDec(); 

                }
                break;
            case 18 :
                // InternalDdLexer.g:1:111: Int
                {
                mInt(); 

                }
                break;
            case 19 :
                // InternalDdLexer.g:1:115: Key
                {
                mKey(); 

                }
                break;
            case 20 :
                // InternalDdLexer.g:1:119: Len
                {
                mLen(); 

                }
                break;
            case 21 :
                // InternalDdLexer.g:1:123: Not
                {
                mNot(); 

                }
                break;
            case 22 :
                // InternalDdLexer.g:1:127: Str
                {
                mStr(); 

                }
                break;
            case 23 :
                // InternalDdLexer.g:1:131: HalfwidthHangulFillerHalfwidthHangulFillerHalfwidthHangulFiller
                {
                mHalfwidthHangulFillerHalfwidthHangulFillerHalfwidthHangulFiller(); 

                }
                break;
            case 24 :
                // InternalDdLexer.g:1:195: ExclamationMarkEqualsSign
                {
                mExclamationMarkEqualsSign(); 

                }
                break;
            case 25 :
                // InternalDdLexer.g:1:221: HyphenMinusGreaterThanSign
                {
                mHyphenMinusGreaterThanSign(); 

                }
                break;
            case 26 :
                // InternalDdLexer.g:1:248: LessThanSignEqualsSign
                {
                mLessThanSignEqualsSign(); 

                }
                break;
            case 27 :
                // InternalDdLexer.g:1:271: EqualsSignEqualsSign
                {
                mEqualsSignEqualsSign(); 

                }
                break;
            case 28 :
                // InternalDdLexer.g:1:292: GreaterThanSignEqualsSign
                {
                mGreaterThanSignEqualsSign(); 

                }
                break;
            case 29 :
                // InternalDdLexer.g:1:318: LeftSquareBracketRightSquareBracket
                {
                mLeftSquareBracketRightSquareBracket(); 

                }
                break;
            case 30 :
                // InternalDdLexer.g:1:354: In
                {
                mIn(); 

                }
                break;
            case 31 :
                // InternalDdLexer.g:1:357: Or
                {
                mOr(); 

                }
                break;
            case 32 :
                // InternalDdLexer.g:1:360: ExclamationMark
                {
                mExclamationMark(); 

                }
                break;
            case 33 :
                // InternalDdLexer.g:1:376: PercentSign
                {
                mPercentSign(); 

                }
                break;
            case 34 :
                // InternalDdLexer.g:1:388: Ampersand
                {
                mAmpersand(); 

                }
                break;
            case 35 :
                // InternalDdLexer.g:1:398: LeftParenthesis
                {
                mLeftParenthesis(); 

                }
                break;
            case 36 :
                // InternalDdLexer.g:1:414: RightParenthesis
                {
                mRightParenthesis(); 

                }
                break;
            case 37 :
                // InternalDdLexer.g:1:431: Asterisk
                {
                mAsterisk(); 

                }
                break;
            case 38 :
                // InternalDdLexer.g:1:440: PlusSign
                {
                mPlusSign(); 

                }
                break;
            case 39 :
                // InternalDdLexer.g:1:449: Comma
                {
                mComma(); 

                }
                break;
            case 40 :
                // InternalDdLexer.g:1:455: HyphenMinus
                {
                mHyphenMinus(); 

                }
                break;
            case 41 :
                // InternalDdLexer.g:1:467: FullStop
                {
                mFullStop(); 

                }
                break;
            case 42 :
                // InternalDdLexer.g:1:476: Solidus
                {
                mSolidus(); 

                }
                break;
            case 43 :
                // InternalDdLexer.g:1:484: Colon
                {
                mColon(); 

                }
                break;
            case 44 :
                // InternalDdLexer.g:1:490: LessThanSign
                {
                mLessThanSign(); 

                }
                break;
            case 45 :
                // InternalDdLexer.g:1:503: EqualsSign
                {
                mEqualsSign(); 

                }
                break;
            case 46 :
                // InternalDdLexer.g:1:514: GreaterThanSign
                {
                mGreaterThanSign(); 

                }
                break;
            case 47 :
                // InternalDdLexer.g:1:530: LeftSquareBracket
                {
                mLeftSquareBracket(); 

                }
                break;
            case 48 :
                // InternalDdLexer.g:1:548: RightSquareBracket
                {
                mRightSquareBracket(); 

                }
                break;
            case 49 :
                // InternalDdLexer.g:1:567: CircumflexAccent
                {
                mCircumflexAccent(); 

                }
                break;
            case 50 :
                // InternalDdLexer.g:1:584: LeftCurlyBracket
                {
                mLeftCurlyBracket(); 

                }
                break;
            case 51 :
                // InternalDdLexer.g:1:601: RightCurlyBracket
                {
                mRightCurlyBracket(); 

                }
                break;
            case 52 :
                // InternalDdLexer.g:1:619: RULE_STR
                {
                mRULE_STR(); 

                }
                break;
            case 53 :
                // InternalDdLexer.g:1:628: RULE_CHR
                {
                mRULE_CHR(); 

                }
                break;
            case 54 :
                // InternalDdLexer.g:1:637: RULE_RANGEINF
                {
                mRULE_RANGEINF(); 

                }
                break;
            case 55 :
                // InternalDdLexer.g:1:651: RULE_RANGE
                {
                mRULE_RANGE(); 

                }
                break;
            case 56 :
                // InternalDdLexer.g:1:662: RULE_CHKID
                {
                mRULE_CHKID(); 

                }
                break;
            case 57 :
                // InternalDdLexer.g:1:673: RULE_CSTID
                {
                mRULE_CSTID(); 

                }
                break;
            case 58 :
                // InternalDdLexer.g:1:684: RULE_OBJID
                {
                mRULE_OBJID(); 

                }
                break;
            case 59 :
                // InternalDdLexer.g:1:695: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 60 :
                // InternalDdLexer.g:1:703: RULE_DEC
                {
                mRULE_DEC(); 

                }
                break;
            case 61 :
                // InternalDdLexer.g:1:712: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 62 :
                // InternalDdLexer.g:1:721: RULE_CONT
                {
                mRULE_CONT(); 

                }
                break;
            case 63 :
                // InternalDdLexer.g:1:731: RULE_IDENT
                {
                mRULE_IDENT(); 

                }
                break;
            case 64 :
                // InternalDdLexer.g:1:742: RULE_CMT
                {
                mRULE_CMT(); 

                }
                break;
            case 65 :
                // InternalDdLexer.g:1:751: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 66 :
                // InternalDdLexer.g:1:759: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA19 dfa19 = new DFA19(this);
    static final String DFA19_eotS =
        "\1\uffff\17\62\1\60\1\107\1\112\1\114\1\116\1\120\1\122\1\62\16\uffff\1\60\1\145\1\uffff\1\152\1\uffff\2\60\4\uffff\1\62\1\uffff\17\62\1\u0084\2\62\4\uffff\1\145\11\uffff\1\u0088\23\uffff\1\145\1\uffff\1\152\6\uffff\2\62\1\u0093\6\62\1\u009a\4\62\1\u009f\2\62\1\u00a2\1\u00a3\1\u00a4\1\uffff\1\u00a5\1\u00a6\12\uffff\2\62\1\uffff\1\u00ac\4\62\1\u00b1\1\uffff\1\62\1\u00b3\1\u00b4\1\u00b5\1\uffff\1\u00b6\1\u00b7\10\uffff\2\62\1\uffff\1\u00bb\1\u00bc\1\u00bd\1\u00be\1\uffff\1\u00bf\6\uffff\2\62\6\uffff\2\62\1\uffff\5\62\1\u00cb\1\62\1\uffff\1\u00cd\1\uffff";
    static final String DFA19_eofS =
        "\u00ce\uffff";
    static final String DFA19_minS =
        "\1\0\3\141\2\157\1\164\1\156\1\151\1\145\1\151\1\156\1\150\1\156\1\145\1\157\1\uffa0\1\75\1\60\3\75\1\135\1\162\16\uffff\1\40\1\56\1\uffff\1\60\1\uffff\2\12\4\uffff\1\162\1\uffff\1\143\1\164\1\154\1\144\1\165\1\141\1\163\1\164\1\157\1\153\1\156\1\155\1\165\1\144\1\162\1\60\1\171\1\164\4\uffff\1\56\11\uffff\1\60\16\uffff\1\42\1\40\2\uffff\2\56\1\uffff\1\60\6\uffff\1\164\1\162\1\60\1\145\1\163\1\145\1\156\1\155\1\164\1\60\1\145\1\163\1\154\1\145\1\60\2\145\3\60\1\uffff\2\60\2\uffff\5\40\1\60\1\uffff\1\60\1\151\1\145\1\uffff\1\60\1\145\1\154\1\144\1\160\1\60\1\uffff\1\164\3\60\1\uffff\2\60\5\uffff\1\60\2\uffff\1\164\1\143\1\uffff\4\60\1\uffff\1\60\5\uffff\1\60\1\151\1\141\5\uffff\1\60\1\157\1\164\1\40\1\156\1\145\1\153\1\144\1\145\1\60\1\171\1\uffff\1\60\1\uffff";
    static final String DFA19_maxS =
        "\1\uffff\1\141\1\145\1\141\2\157\1\164\1\156\1\157\1\151\1\162\1\156\1\150\1\156\1\145\1\157\1\uffa0\1\75\1\76\3\75\1\135\1\162\16\uffff\1\176\1\71\1\uffff\1\172\1\uffff\1\15\1\12\4\uffff\1\162\1\uffff\1\160\1\164\1\154\1\144\1\165\1\170\1\163\1\164\1\157\1\153\1\156\1\155\1\165\1\144\1\162\1\172\1\171\1\164\4\uffff\1\71\11\uffff\1\172\16\uffff\1\165\1\176\2\uffff\2\71\1\uffff\1\172\6\uffff\1\164\1\162\1\172\1\145\1\163\1\145\1\156\1\155\1\164\1\172\1\145\1\163\1\154\1\145\1\172\2\145\3\172\1\uffff\2\172\2\uffff\5\176\1\146\1\uffff\1\156\1\151\1\145\1\uffff\1\172\1\145\1\154\1\144\1\160\1\172\1\uffff\1\164\3\172\1\uffff\2\172\5\uffff\1\146\2\uffff\1\164\1\143\1\uffff\4\172\1\uffff\1\172\5\uffff\1\146\1\151\1\141\5\uffff\1\146\1\157\1\164\1\176\1\156\1\145\1\153\1\144\1\145\1\172\1\171\1\uffff\1\172\1\uffff";
    static final String DFA19_acceptS =
        "\30\uffff\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\51\1\52\1\53\1\60\1\61\1\62\1\63\2\uffff\1\70\1\uffff\1\73\2\uffff\1\77\1\100\1\101\1\102\1\uffff\1\73\22\uffff\1\27\1\30\1\40\1\31\1\uffff\1\50\1\32\1\54\1\33\1\55\1\34\1\56\1\35\1\57\1\uffff\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\51\1\52\1\53\1\60\1\61\1\62\1\63\2\uffff\1\65\1\75\2\uffff\1\70\1\uffff\1\71\1\72\1\76\1\77\1\100\1\101\24\uffff\1\36\2\uffff\1\74\1\37\6\uffff\1\64\3\uffff\1\21\6\uffff\1\26\4\uffff\1\24\2\uffff\1\17\1\20\1\22\1\23\1\25\1\uffff\1\66\1\67\2\uffff\1\12\4\uffff\1\14\1\uffff\1\10\1\11\1\13\1\15\1\16\3\uffff\1\3\1\4\1\5\1\6\1\7\13\uffff\1\2\1\uffff\1\1";
    static final String DFA19_specialS =
        "\1\0\u00cd\uffff}>";
    static final String[] DFA19_transitionS = {
            "\11\60\1\57\1\55\2\60\1\54\22\60\1\57\1\21\1\46\1\50\1\60\1\30\1\31\1\56\1\32\1\33\1\34\1\35\1\36\1\22\1\37\1\40\12\47\1\41\1\60\1\23\1\24\1\25\2\60\32\51\1\26\1\53\1\42\1\43\1\52\1\60\1\13\1\10\1\14\1\2\1\52\1\3\2\52\1\15\1\52\1\16\1\11\1\4\1\17\1\27\1\1\1\52\1\5\1\6\1\12\1\7\5\52\1\44\1\60\1\45\1\52\uff21\60\1\20\137\60",
            "\1\61",
            "\1\64\3\uffff\1\63",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72\5\uffff\1\73",
            "\1\75\3\uffff\1\74",
            "\1\76\10\uffff\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\12\111\4\uffff\1\110",
            "\1\113",
            "\1\115",
            "\1\117",
            "\1\121",
            "\1\123",
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
            "\2\143\1\144\71\143\1\142\42\143",
            "\1\146\1\uffff\12\147",
            "",
            "\12\151\7\uffff\32\151\4\uffff\1\151\1\uffff\32\153",
            "",
            "\1\154\2\uffff\1\154",
            "\1\155",
            "",
            "",
            "",
            "",
            "\1\160",
            "",
            "\1\162\14\uffff\1\161",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167\20\uffff\1\171\5\uffff\1\170",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u0083\6\62",
            "\1\u0085",
            "\1\u0086",
            "",
            "",
            "",
            "",
            "\1\u0087\1\uffff\12\111",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
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
            "\1\u008c\71\uffff\1\u008d\21\uffff\1\u008a\3\uffff\1\u008b\1\uffff\1\u0089\1\u008e",
            "\2\u008f\1\144\134\u008f",
            "",
            "",
            "\1\u0090\1\uffff\12\u0087",
            "\1\146\1\uffff\12\147",
            "",
            "\12\151\7\uffff\32\151\4\uffff\1\151\1\uffff\32\153",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0091",
            "\1\u0092",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u00a0",
            "\1\u00a1",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "",
            "\2\u008f\1\144\134\u008f",
            "\2\u008f\1\144\134\u008f",
            "\2\u008f\1\144\134\u008f",
            "\2\u008f\1\144\134\u008f",
            "\2\u008f\1\144\134\u008f",
            "\12\u00a7\7\uffff\6\u00a7\32\uffff\6\u00a7",
            "",
            "\12\u00a9\64\uffff\1\u00a8",
            "\1\u00aa",
            "\1\u00ab",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\1\u00b2",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "",
            "",
            "",
            "",
            "\12\u00b8\7\uffff\6\u00b8\32\uffff\6\u00b8",
            "",
            "",
            "\1\u00b9",
            "\1\u00ba",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "",
            "",
            "",
            "",
            "\12\u00c0\7\uffff\6\u00c0\32\uffff\6\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "",
            "",
            "",
            "",
            "",
            "\12\u00c3\7\uffff\6\u00c3\32\uffff\6\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\2\u008f\1\144\134\u008f",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u00cc",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            ""
    };

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( Partitionkey | Deprecated | False | Model | Round | Stamp | Unset | Bits | Bool | Date | Like | Stxt | Time | True | And | Chr | Dec | Int | Key | Len | Not | Str | HalfwidthHangulFillerHalfwidthHangulFillerHalfwidthHangulFiller | ExclamationMarkEqualsSign | HyphenMinusGreaterThanSign | LessThanSignEqualsSign | EqualsSignEqualsSign | GreaterThanSignEqualsSign | LeftSquareBracketRightSquareBracket | In | Or | ExclamationMark | PercentSign | Ampersand | LeftParenthesis | RightParenthesis | Asterisk | PlusSign | Comma | HyphenMinus | FullStop | Solidus | Colon | LessThanSign | EqualsSign | GreaterThanSign | LeftSquareBracket | RightSquareBracket | CircumflexAccent | LeftCurlyBracket | RightCurlyBracket | RULE_STR | RULE_CHR | RULE_RANGEINF | RULE_RANGE | RULE_CHKID | RULE_CSTID | RULE_OBJID | RULE_ID | RULE_DEC | RULE_INT | RULE_CONT | RULE_IDENT | RULE_CMT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA19_0 = input.LA(1);

                        s = -1;
                        if ( (LA19_0=='p') ) {s = 1;}

                        else if ( (LA19_0=='d') ) {s = 2;}

                        else if ( (LA19_0=='f') ) {s = 3;}

                        else if ( (LA19_0=='m') ) {s = 4;}

                        else if ( (LA19_0=='r') ) {s = 5;}

                        else if ( (LA19_0=='s') ) {s = 6;}

                        else if ( (LA19_0=='u') ) {s = 7;}

                        else if ( (LA19_0=='b') ) {s = 8;}

                        else if ( (LA19_0=='l') ) {s = 9;}

                        else if ( (LA19_0=='t') ) {s = 10;}

                        else if ( (LA19_0=='a') ) {s = 11;}

                        else if ( (LA19_0=='c') ) {s = 12;}

                        else if ( (LA19_0=='i') ) {s = 13;}

                        else if ( (LA19_0=='k') ) {s = 14;}

                        else if ( (LA19_0=='n') ) {s = 15;}

                        else if ( (LA19_0=='\uFFA0') ) {s = 16;}

                        else if ( (LA19_0=='!') ) {s = 17;}

                        else if ( (LA19_0=='-') ) {s = 18;}

                        else if ( (LA19_0=='<') ) {s = 19;}

                        else if ( (LA19_0=='=') ) {s = 20;}

                        else if ( (LA19_0=='>') ) {s = 21;}

                        else if ( (LA19_0=='[') ) {s = 22;}

                        else if ( (LA19_0=='o') ) {s = 23;}

                        else if ( (LA19_0=='%') ) {s = 24;}

                        else if ( (LA19_0=='&') ) {s = 25;}

                        else if ( (LA19_0=='(') ) {s = 26;}

                        else if ( (LA19_0==')') ) {s = 27;}

                        else if ( (LA19_0=='*') ) {s = 28;}

                        else if ( (LA19_0=='+') ) {s = 29;}

                        else if ( (LA19_0==',') ) {s = 30;}

                        else if ( (LA19_0=='.') ) {s = 31;}

                        else if ( (LA19_0=='/') ) {s = 32;}

                        else if ( (LA19_0==':') ) {s = 33;}

                        else if ( (LA19_0==']') ) {s = 34;}

                        else if ( (LA19_0=='^') ) {s = 35;}

                        else if ( (LA19_0=='{') ) {s = 36;}

                        else if ( (LA19_0=='}') ) {s = 37;}

                        else if ( (LA19_0=='\"') ) {s = 38;}

                        else if ( ((LA19_0>='0' && LA19_0<='9')) ) {s = 39;}

                        else if ( (LA19_0=='#') ) {s = 40;}

                        else if ( ((LA19_0>='A' && LA19_0<='Z')) ) {s = 41;}

                        else if ( (LA19_0=='_'||LA19_0=='e'||(LA19_0>='g' && LA19_0<='h')||LA19_0=='j'||LA19_0=='q'||(LA19_0>='v' && LA19_0<='z')||LA19_0=='~') ) {s = 42;}

                        else if ( (LA19_0=='\\') ) {s = 43;}

                        else if ( (LA19_0=='\r') ) {s = 44;}

                        else if ( (LA19_0=='\n') ) {s = 45;}

                        else if ( (LA19_0=='\'') ) {s = 46;}

                        else if ( (LA19_0=='\t'||LA19_0==' ') ) {s = 47;}

                        else if ( ((LA19_0>='\u0000' && LA19_0<='\b')||(LA19_0>='\u000B' && LA19_0<='\f')||(LA19_0>='\u000E' && LA19_0<='\u001F')||LA19_0=='$'||LA19_0==';'||(LA19_0>='?' && LA19_0<='@')||LA19_0=='`'||LA19_0=='|'||(LA19_0>='\u007F' && LA19_0<='\uFF9F')||(LA19_0>='\uFFA1' && LA19_0<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 19, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}