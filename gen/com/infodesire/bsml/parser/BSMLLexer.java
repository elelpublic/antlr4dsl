// Generated from /Users/lars/workspaces/main/poc/antlr4dsl/src/main/antlr4/com/infodesire/bsml/parser/BSMLLexer.g4 by ANTLR 4.9.2
package com.infodesire.bsml.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BSMLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24\u0080\b\1\b\1"+
		"\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t"+
		"\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4"+
		"\22\t\22\4\23\t\23\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3"+
		"\r\7\rY\n\r\f\r\16\r\\\13\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3"+
		"\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\7\21n\n\21\f\21\16\21q\13\21\3"+
		"\21\3\21\3\22\7\22v\n\22\f\22\16\22y\13\22\3\22\3\22\3\22\3\22\3\23\3"+
		"\23\3w\2\24\4\3\6\4\b\5\n\6\f\7\16\b\20\t\22\n\24\13\26\f\30\r\32\16\34"+
		"\17\36\20 \21\"\22$\23&\24\4\2\3\6\4\2C\\c|\5\2\62;C\\c|\4\2\f\f\17\17"+
		"\4\2\13\13\"\"\2\u0081\2\4\3\2\2\2\2\6\3\2\2\2\2\b\3\2\2\2\2\n\3\2\2\2"+
		"\2\f\3\2\2\2\2\16\3\2\2\2\2\20\3\2\2\2\2\22\3\2\2\2\2\24\3\2\2\2\2\26"+
		"\3\2\2\2\2\30\3\2\2\2\2\32\3\2\2\2\2\34\3\2\2\2\2\36\3\2\2\2\2 \3\2\2"+
		"\2\2\"\3\2\2\2\3$\3\2\2\2\3&\3\2\2\2\4(\3\2\2\2\6.\3\2\2\2\b\64\3\2\2"+
		"\2\n\67\3\2\2\2\f;\3\2\2\2\16@\3\2\2\2\20D\3\2\2\2\22I\3\2\2\2\24M\3\2"+
		"\2\2\26R\3\2\2\2\30T\3\2\2\2\32V\3\2\2\2\34]\3\2\2\2\36a\3\2\2\2 e\3\2"+
		"\2\2\"i\3\2\2\2$w\3\2\2\2&~\3\2\2\2()\7s\2\2)*\7w\2\2*+\7g\2\2+,\7t\2"+
		"\2,-\7{\2\2-\5\3\2\2\2./\7y\2\2/\60\7j\2\2\60\61\7g\2\2\61\62\7t\2\2\62"+
		"\63\7g\2\2\63\7\3\2\2\2\64\65\7q\2\2\65\66\7t\2\2\66\t\3\2\2\2\678\7>"+
		"\2\289\3\2\2\29:\b\5\2\2:\13\3\2\2\2;<\7>\2\2<=\7?\2\2=>\3\2\2\2>?\b\6"+
		"\2\2?\r\3\2\2\2@A\7?\2\2AB\3\2\2\2BC\b\7\2\2C\17\3\2\2\2DE\7#\2\2EF\7"+
		"?\2\2FG\3\2\2\2GH\b\b\2\2H\21\3\2\2\2IJ\7@\2\2JK\3\2\2\2KL\b\t\2\2L\23"+
		"\3\2\2\2MN\7@\2\2NO\7?\2\2OP\3\2\2\2PQ\b\n\2\2Q\25\3\2\2\2RS\7}\2\2S\27"+
		"\3\2\2\2TU\7\177\2\2U\31\3\2\2\2VZ\t\2\2\2WY\t\3\2\2XW\3\2\2\2Y\\\3\2"+
		"\2\2ZX\3\2\2\2Z[\3\2\2\2[\33\3\2\2\2\\Z\3\2\2\2]^\7<\2\2^_\3\2\2\2_`\b"+
		"\16\2\2`\35\3\2\2\2ab\t\4\2\2bc\3\2\2\2cd\b\17\3\2d\37\3\2\2\2ef\t\5\2"+
		"\2fg\3\2\2\2gh\b\20\3\2h!\3\2\2\2ij\7\61\2\2jk\7\61\2\2ko\3\2\2\2ln\n"+
		"\4\2\2ml\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2pr\3\2\2\2qo\3\2\2\2rs\b"+
		"\21\3\2s#\3\2\2\2tv\13\2\2\2ut\3\2\2\2vy\3\2\2\2wx\3\2\2\2wu\3\2\2\2x"+
		"z\3\2\2\2yw\3\2\2\2z{\5&\23\2{|\3\2\2\2|}\b\22\4\2}%\3\2\2\2~\177\t\4"+
		"\2\2\177\'\3\2\2\2\7\2\3Zow\5\7\3\2\b\2\2\6\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}