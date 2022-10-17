// Generated from java-escape by ANTLR 4.11.1
package com.infodesire.poc.antlr4dsl.parser;
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
		IDENTIFIER=1, COLON=2, WHITESPACE=3, NEWLINE=4, VALUE=5, EOL=6;
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
			"IDENTIFIER", "COLON", "WHITESPACE", "NEWLINE", "VALUE", "EOL"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IDENTIFIER", "COLON", "WHITESPACE", "NEWLINE", "VALUE", "EOL"
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
		"\u0004\u0000\u0006)\u0006\uffff\uffff\u0006\uffff\uffff\u0002\u0000\u0007"+
		"\u0000\u0002\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007"+
		"\u0003\u0002\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0001\u0000\u0001"+
		"\u0000\u0005\u0000\u0011\b\u0000\n\u0000\f\u0000\u0014\t\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0005\u0004!\b\u0004"+
		"\n\u0004\f\u0004$\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0000\u0000\u0006\u0002\u0001\u0004\u0002\u0006\u0003\b\u0004\n\u0005"+
		"\f\u0006\u0002\u0000\u0001\u0004\u0002\u0000AZaz\u0003\u000009AZaz\u0002"+
		"\u0000\t\t  \u0002\u0000\n\n\r\r)\u0000\u0002\u0001\u0000\u0000\u0000"+
		"\u0000\u0004\u0001\u0000\u0000\u0000\u0000\u0006\u0001\u0000\u0000\u0000"+
		"\u0000\b\u0001\u0000\u0000\u0000\u0001\n\u0001\u0000\u0000\u0000\u0001"+
		"\f\u0001\u0000\u0000\u0000\u0002\u000e\u0001\u0000\u0000\u0000\u0004\u0015"+
		"\u0001\u0000\u0000\u0000\u0006\u0019\u0001\u0000\u0000\u0000\b\u001d\u0001"+
		"\u0000\u0000\u0000\n\"\u0001\u0000\u0000\u0000\f%\u0001\u0000\u0000\u0000"+
		"\u000e\u0012\u0007\u0000\u0000\u0000\u000f\u0011\u0007\u0001\u0000\u0000"+
		"\u0010\u000f\u0001\u0000\u0000\u0000\u0011\u0014\u0001\u0000\u0000\u0000"+
		"\u0012\u0010\u0001\u0000\u0000\u0000\u0012\u0013\u0001\u0000\u0000\u0000"+
		"\u0013\u0003\u0001\u0000\u0000\u0000\u0014\u0012\u0001\u0000\u0000\u0000"+
		"\u0015\u0016\u0005:\u0000\u0000\u0016\u0017\u0001\u0000\u0000\u0000\u0017"+
		"\u0018\u0006\u0001\u0000\u0000\u0018\u0005\u0001\u0000\u0000\u0000\u0019"+
		"\u001a\u0007\u0002\u0000\u0000\u001a\u001b\u0001\u0000\u0000\u0000\u001b"+
		"\u001c\u0006\u0002\u0001\u0000\u001c\u0007\u0001\u0000\u0000\u0000\u001d"+
		"\u001e\u0007\u0003\u0000\u0000\u001e\t\u0001\u0000\u0000\u0000\u001f!"+
		"\b\u0003\u0000\u0000 \u001f\u0001\u0000\u0000\u0000!$\u0001\u0000\u0000"+
		"\u0000\" \u0001\u0000\u0000\u0000\"#\u0001\u0000\u0000\u0000#\u000b\u0001"+
		"\u0000\u0000\u0000$\"\u0001\u0000\u0000\u0000%&\u0007\u0003\u0000\u0000"+
		"&\'\u0001\u0000\u0000\u0000\'(\u0006\u0005\u0002\u0000(\r\u0001\u0000"+
		"\u0000\u0000\u0004\u0000\u0001\u0012\"\u0003\u0005\u0001\u0000\u0006\u0000"+
		"\u0000\u0004\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}