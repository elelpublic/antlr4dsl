// Generated from /Users/lars/workspaces/main/poc/antlr4dsl/src/main/antlr4/com/infodesire/poc/antlr4dsl/parser/Dummy.g4 by ANTLR 4.9.2
package com.infodesire.poc.antlr4dsl.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Dummy extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

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


	public Dummy(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Dummy.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\b+\b\1\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\7\2\23\n\2\f\2\16\2"+
		"\26\13\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\6\7\6#\n\6\f\6\16\6"+
		"&\13\6\3\7\3\7\3\7\3\7\3$\2\b\4\3\6\4\b\5\n\6\f\7\16\b\4\2\3\6\4\2C\\"+
		"c|\5\2\62;C\\c|\4\2\13\13\"\"\4\2\f\f\17\17\2+\2\4\3\2\2\2\2\6\3\2\2\2"+
		"\2\b\3\2\2\2\2\n\3\2\2\2\3\f\3\2\2\2\3\16\3\2\2\2\4\20\3\2\2\2\6\27\3"+
		"\2\2\2\b\33\3\2\2\2\n\37\3\2\2\2\f$\3\2\2\2\16\'\3\2\2\2\20\24\t\2\2\2"+
		"\21\23\t\3\2\2\22\21\3\2\2\2\23\26\3\2\2\2\24\22\3\2\2\2\24\25\3\2\2\2"+
		"\25\5\3\2\2\2\26\24\3\2\2\2\27\30\7<\2\2\30\31\3\2\2\2\31\32\b\3\2\2\32"+
		"\7\3\2\2\2\33\34\t\4\2\2\34\35\3\2\2\2\35\36\b\4\3\2\36\t\3\2\2\2\37 "+
		"\t\5\2\2 \13\3\2\2\2!#\13\2\2\2\"!\3\2\2\2#&\3\2\2\2$%\3\2\2\2$\"\3\2"+
		"\2\2%\r\3\2\2\2&$\3\2\2\2\'(\t\5\2\2()\3\2\2\2)*\b\7\4\2*\17\3\2\2\2\6"+
		"\2\3\24$\5\7\3\2\b\2\2\6\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}