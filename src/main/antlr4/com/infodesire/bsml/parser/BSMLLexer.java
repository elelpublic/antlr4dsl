// Generated from java-escape by ANTLR 4.11.1
package com.infodesire.bsml.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class BSMLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		QUERY=1, WHERE=2, OR=3, LESS=4, LESS_OR_EQUAL=5, EQUAL=6, NOT_EQUAL=7, 
		GREATER=8, GREATER_OR_EQUAL=9, LCURLY=10, RCURLY=11, IDENTIFIER=12, COLON=13, 
		NEWLINE=14, WHITESPACE=15, LINE_COMMENT=16, VALUE=17, EOL=18;
	public static final int
		UNTIL_EOL=1;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "UNTIL_EOL"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"QUERY", "WHERE", "OR", "LESS", "LESS_OR_EQUAL", "EQUAL", "NOT_EQUAL", 
			"GREATER", "GREATER_OR_EQUAL", "LCURLY", "RCURLY", "IDENTIFIER", "COLON", 
			"NEWLINE", "WHITESPACE", "LINE_COMMENT", "VALUE", "EOL"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'query'", "'where'", "'or'", "'<'", "'<='", "'='", "'!='", "'>'", 
			"'>='", "'{'", "'}'", null, "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "QUERY", "WHERE", "OR", "LESS", "LESS_OR_EQUAL", "EQUAL", "NOT_EQUAL", 
			"GREATER", "GREATER_OR_EQUAL", "LCURLY", "RCURLY", "IDENTIFIER", "COLON", 
			"NEWLINE", "WHITESPACE", "LINE_COMMENT", "VALUE", "EOL"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public BSMLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "BSMLLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0012~\u0006\uffff\uffff\u0006\uffff\uffff\u0002\u0000\u0007"+
		"\u0000\u0002\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007"+
		"\u0003\u0002\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007"+
		"\u0006\u0002\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n"+
		"\u0007\n\u0002\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002"+
		"\u000e\u0007\u000e\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002"+
		"\u0011\u0007\u0011\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0005\u000bW"+
		"\b\u000b\n\u000b\f\u000bZ\t\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000fl\b\u000f"+
		"\n\u000f\f\u000fo\t\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0005\u0010"+
		"t\b\u0010\n\u0010\f\u0010w\t\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001u\u0000\u0012\u0002\u0001\u0004"+
		"\u0002\u0006\u0003\b\u0004\n\u0005\f\u0006\u000e\u0007\u0010\b\u0012\t"+
		"\u0014\n\u0016\u000b\u0018\f\u001a\r\u001c\u000e\u001e\u000f \u0010\""+
		"\u0011$\u0012\u0002\u0000\u0001\u0004\u0002\u0000AZaz\u0003\u000009AZ"+
		"az\u0002\u0000\n\n\r\r\u0002\u0000\t\t  \u007f\u0000\u0002\u0001\u0000"+
		"\u0000\u0000\u0000\u0004\u0001\u0000\u0000\u0000\u0000\u0006\u0001\u0000"+
		"\u0000\u0000\u0000\b\u0001\u0000\u0000\u0000\u0000\n\u0001\u0000\u0000"+
		"\u0000\u0000\f\u0001\u0000\u0000\u0000\u0000\u000e\u0001\u0000\u0000\u0000"+
		"\u0000\u0010\u0001\u0000\u0000\u0000\u0000\u0012\u0001\u0000\u0000\u0000"+
		"\u0000\u0014\u0001\u0000\u0000\u0000\u0000\u0016\u0001\u0000\u0000\u0000"+
		"\u0000\u0018\u0001\u0000\u0000\u0000\u0000\u001a\u0001\u0000\u0000\u0000"+
		"\u0000\u001c\u0001\u0000\u0000\u0000\u0000\u001e\u0001\u0000\u0000\u0000"+
		"\u0000 \u0001\u0000\u0000\u0000\u0001\"\u0001\u0000\u0000\u0000\u0001"+
		"$\u0001\u0000\u0000\u0000\u0002&\u0001\u0000\u0000\u0000\u0004,\u0001"+
		"\u0000\u0000\u0000\u00062\u0001\u0000\u0000\u0000\b5\u0001\u0000\u0000"+
		"\u0000\n9\u0001\u0000\u0000\u0000\f>\u0001\u0000\u0000\u0000\u000eB\u0001"+
		"\u0000\u0000\u0000\u0010G\u0001\u0000\u0000\u0000\u0012K\u0001\u0000\u0000"+
		"\u0000\u0014P\u0001\u0000\u0000\u0000\u0016R\u0001\u0000\u0000\u0000\u0018"+
		"T\u0001\u0000\u0000\u0000\u001a[\u0001\u0000\u0000\u0000\u001c_\u0001"+
		"\u0000\u0000\u0000\u001ec\u0001\u0000\u0000\u0000 g\u0001\u0000\u0000"+
		"\u0000\"u\u0001\u0000\u0000\u0000$|\u0001\u0000\u0000\u0000&\'\u0005q"+
		"\u0000\u0000\'(\u0005u\u0000\u0000()\u0005e\u0000\u0000)*\u0005r\u0000"+
		"\u0000*+\u0005y\u0000\u0000+\u0003\u0001\u0000\u0000\u0000,-\u0005w\u0000"+
		"\u0000-.\u0005h\u0000\u0000./\u0005e\u0000\u0000/0\u0005r\u0000\u0000"+
		"01\u0005e\u0000\u00001\u0005\u0001\u0000\u0000\u000023\u0005o\u0000\u0000"+
		"34\u0005r\u0000\u00004\u0007\u0001\u0000\u0000\u000056\u0005<\u0000\u0000"+
		"67\u0001\u0000\u0000\u000078\u0006\u0003\u0000\u00008\t\u0001\u0000\u0000"+
		"\u00009:\u0005<\u0000\u0000:;\u0005=\u0000\u0000;<\u0001\u0000\u0000\u0000"+
		"<=\u0006\u0004\u0000\u0000=\u000b\u0001\u0000\u0000\u0000>?\u0005=\u0000"+
		"\u0000?@\u0001\u0000\u0000\u0000@A\u0006\u0005\u0000\u0000A\r\u0001\u0000"+
		"\u0000\u0000BC\u0005!\u0000\u0000CD\u0005=\u0000\u0000DE\u0001\u0000\u0000"+
		"\u0000EF\u0006\u0006\u0000\u0000F\u000f\u0001\u0000\u0000\u0000GH\u0005"+
		">\u0000\u0000HI\u0001\u0000\u0000\u0000IJ\u0006\u0007\u0000\u0000J\u0011"+
		"\u0001\u0000\u0000\u0000KL\u0005>\u0000\u0000LM\u0005=\u0000\u0000MN\u0001"+
		"\u0000\u0000\u0000NO\u0006\b\u0000\u0000O\u0013\u0001\u0000\u0000\u0000"+
		"PQ\u0005{\u0000\u0000Q\u0015\u0001\u0000\u0000\u0000RS\u0005}\u0000\u0000"+
		"S\u0017\u0001\u0000\u0000\u0000TX\u0007\u0000\u0000\u0000UW\u0007\u0001"+
		"\u0000\u0000VU\u0001\u0000\u0000\u0000WZ\u0001\u0000\u0000\u0000XV\u0001"+
		"\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000Y\u0019\u0001\u0000\u0000"+
		"\u0000ZX\u0001\u0000\u0000\u0000[\\\u0005:\u0000\u0000\\]\u0001\u0000"+
		"\u0000\u0000]^\u0006\f\u0000\u0000^\u001b\u0001\u0000\u0000\u0000_`\u0007"+
		"\u0002\u0000\u0000`a\u0001\u0000\u0000\u0000ab\u0006\r\u0001\u0000b\u001d"+
		"\u0001\u0000\u0000\u0000cd\u0007\u0003\u0000\u0000de\u0001\u0000\u0000"+
		"\u0000ef\u0006\u000e\u0001\u0000f\u001f\u0001\u0000\u0000\u0000gh\u0005"+
		"/\u0000\u0000hi\u0005/\u0000\u0000im\u0001\u0000\u0000\u0000jl\b\u0002"+
		"\u0000\u0000kj\u0001\u0000\u0000\u0000lo\u0001\u0000\u0000\u0000mk\u0001"+
		"\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000np\u0001\u0000\u0000\u0000"+
		"om\u0001\u0000\u0000\u0000pq\u0006\u000f\u0001\u0000q!\u0001\u0000\u0000"+
		"\u0000rt\t\u0000\u0000\u0000sr\u0001\u0000\u0000\u0000tw\u0001\u0000\u0000"+
		"\u0000uv\u0001\u0000\u0000\u0000us\u0001\u0000\u0000\u0000vx\u0001\u0000"+
		"\u0000\u0000wu\u0001\u0000\u0000\u0000xy\u0003$\u0011\u0000yz\u0001\u0000"+
		"\u0000\u0000z{\u0006\u0010\u0002\u0000{#\u0001\u0000\u0000\u0000|}\u0007"+
		"\u0002\u0000\u0000}%\u0001\u0000\u0000\u0000\u0005\u0000\u0001Xmu\u0003"+
		"\u0005\u0001\u0000\u0006\u0000\u0000\u0004\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}