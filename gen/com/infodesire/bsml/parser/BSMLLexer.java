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
		QUERY=1, WHERE=2, OR=3, AND=4, NOT=5, ACTION=6, LESS=7, LESS_OR_EQUAL=8, 
		EQUAL=9, NOT_EQUAL=10, GREATER=11, GREATER_OR_EQUAL=12, STARTS_WITH=13, 
		ENDS_WITH=14, LIKE=15, CONTAINS=16, LCURLY=17, RCURLY=18, IDENTIFIER=19, 
		COLON=20, NEWLINE=21, WHITESPACE=22, LINE_COMMENT=23, VALUE=24, EOL=25;
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
			"QUERY", "WHERE", "OR", "AND", "NOT", "ACTION", "LESS", "LESS_OR_EQUAL", 
			"EQUAL", "NOT_EQUAL", "GREATER", "GREATER_OR_EQUAL", "STARTS_WITH", "ENDS_WITH", 
			"LIKE", "CONTAINS", "LCURLY", "RCURLY", "IDENTIFIER", "COLON", "NEWLINE", 
			"WHITESPACE", "LINE_COMMENT", "VALUE", "EOL"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'QUERY'", "'WHERE'", "'OR'", "'AND'", "'NOT'", "'ACTION'", "'<'", 
			"'<='", "'='", "'!='", "'>'", "'>='", "'STARTS_WITH'", "'ENDS_WITH'", 
			"'LIKE'", "'CONTAINS'", "'{'", "'}'", null, "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "QUERY", "WHERE", "OR", "AND", "NOT", "ACTION", "LESS", "LESS_OR_EQUAL", 
			"EQUAL", "NOT_EQUAL", "GREATER", "GREATER_OR_EQUAL", "STARTS_WITH", "ENDS_WITH", 
			"LIKE", "CONTAINS", "LCURLY", "RCURLY", "IDENTIFIER", "COLON", "NEWLINE", 
			"WHITESPACE", "LINE_COMMENT", "VALUE", "EOL"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\33\u00c9\b\1\b\1"+
		"\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t"+
		"\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4"+
		"\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4"+
		"\31\t\31\4\32\t\32\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23"+
		"\3\24\3\24\7\24\u00a2\n\24\f\24\16\24\u00a5\13\24\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\7\30\u00b7"+
		"\n\30\f\30\16\30\u00ba\13\30\3\30\3\30\3\31\7\31\u00bf\n\31\f\31\16\31"+
		"\u00c2\13\31\3\31\3\31\3\31\3\31\3\32\3\32\3\u00c0\2\33\4\3\6\4\b\5\n"+
		"\6\f\7\16\b\20\t\22\n\24\13\26\f\30\r\32\16\34\17\36\20 \21\"\22$\23&"+
		"\24(\25*\26,\27.\30\60\31\62\32\64\33\4\2\3\6\4\2C\\c|\6\2\60\60\62;C"+
		"\\c|\4\2\f\f\17\17\4\2\13\13\"\"\2\u00ca\2\4\3\2\2\2\2\6\3\2\2\2\2\b\3"+
		"\2\2\2\2\n\3\2\2\2\2\f\3\2\2\2\2\16\3\2\2\2\2\20\3\2\2\2\2\22\3\2\2\2"+
		"\2\24\3\2\2\2\2\26\3\2\2\2\2\30\3\2\2\2\2\32\3\2\2\2\2\34\3\2\2\2\2\36"+
		"\3\2\2\2\2 \3\2\2\2\2\"\3\2\2\2\2$\3\2\2\2\2&\3\2\2\2\2(\3\2\2\2\2*\3"+
		"\2\2\2\2,\3\2\2\2\2.\3\2\2\2\2\60\3\2\2\2\3\62\3\2\2\2\3\64\3\2\2\2\4"+
		"\66\3\2\2\2\6<\3\2\2\2\bB\3\2\2\2\nE\3\2\2\2\fI\3\2\2\2\16M\3\2\2\2\20"+
		"T\3\2\2\2\22X\3\2\2\2\24]\3\2\2\2\26a\3\2\2\2\30f\3\2\2\2\32j\3\2\2\2"+
		"\34o\3\2\2\2\36}\3\2\2\2 \u0089\3\2\2\2\"\u0090\3\2\2\2$\u009b\3\2\2\2"+
		"&\u009d\3\2\2\2(\u009f\3\2\2\2*\u00a6\3\2\2\2,\u00aa\3\2\2\2.\u00ae\3"+
		"\2\2\2\60\u00b2\3\2\2\2\62\u00c0\3\2\2\2\64\u00c7\3\2\2\2\66\67\7S\2\2"+
		"\678\7W\2\289\7G\2\29:\7T\2\2:;\7[\2\2;\5\3\2\2\2<=\7Y\2\2=>\7J\2\2>?"+
		"\7G\2\2?@\7T\2\2@A\7G\2\2A\7\3\2\2\2BC\7Q\2\2CD\7T\2\2D\t\3\2\2\2EF\7"+
		"C\2\2FG\7P\2\2GH\7F\2\2H\13\3\2\2\2IJ\7P\2\2JK\7Q\2\2KL\7V\2\2L\r\3\2"+
		"\2\2MN\7C\2\2NO\7E\2\2OP\7V\2\2PQ\7K\2\2QR\7Q\2\2RS\7P\2\2S\17\3\2\2\2"+
		"TU\7>\2\2UV\3\2\2\2VW\b\b\2\2W\21\3\2\2\2XY\7>\2\2YZ\7?\2\2Z[\3\2\2\2"+
		"[\\\b\t\2\2\\\23\3\2\2\2]^\7?\2\2^_\3\2\2\2_`\b\n\2\2`\25\3\2\2\2ab\7"+
		"#\2\2bc\7?\2\2cd\3\2\2\2de\b\13\2\2e\27\3\2\2\2fg\7@\2\2gh\3\2\2\2hi\b"+
		"\f\2\2i\31\3\2\2\2jk\7@\2\2kl\7?\2\2lm\3\2\2\2mn\b\r\2\2n\33\3\2\2\2o"+
		"p\7U\2\2pq\7V\2\2qr\7C\2\2rs\7T\2\2st\7V\2\2tu\7U\2\2uv\7a\2\2vw\7Y\2"+
		"\2wx\7K\2\2xy\7V\2\2yz\7J\2\2z{\3\2\2\2{|\b\16\2\2|\35\3\2\2\2}~\7G\2"+
		"\2~\177\7P\2\2\177\u0080\7F\2\2\u0080\u0081\7U\2\2\u0081\u0082\7a\2\2"+
		"\u0082\u0083\7Y\2\2\u0083\u0084\7K\2\2\u0084\u0085\7V\2\2\u0085\u0086"+
		"\7J\2\2\u0086\u0087\3\2\2\2\u0087\u0088\b\17\2\2\u0088\37\3\2\2\2\u0089"+
		"\u008a\7N\2\2\u008a\u008b\7K\2\2\u008b\u008c\7M\2\2\u008c\u008d\7G\2\2"+
		"\u008d\u008e\3\2\2\2\u008e\u008f\b\20\2\2\u008f!\3\2\2\2\u0090\u0091\7"+
		"E\2\2\u0091\u0092\7Q\2\2\u0092\u0093\7P\2\2\u0093\u0094\7V\2\2\u0094\u0095"+
		"\7C\2\2\u0095\u0096\7K\2\2\u0096\u0097\7P\2\2\u0097\u0098\7U\2\2\u0098"+
		"\u0099\3\2\2\2\u0099\u009a\b\21\2\2\u009a#\3\2\2\2\u009b\u009c\7}\2\2"+
		"\u009c%\3\2\2\2\u009d\u009e\7\177\2\2\u009e\'\3\2\2\2\u009f\u00a3\t\2"+
		"\2\2\u00a0\u00a2\t\3\2\2\u00a1\u00a0\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3"+
		"\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4)\3\2\2\2\u00a5\u00a3\3\2\2\2"+
		"\u00a6\u00a7\7<\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\b\25\2\2\u00a9+\3"+
		"\2\2\2\u00aa\u00ab\t\4\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\b\26\3\2\u00ad"+
		"-\3\2\2\2\u00ae\u00af\t\5\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\b\27\3\2"+
		"\u00b1/\3\2\2\2\u00b2\u00b3\7\61\2\2\u00b3\u00b4\7\61\2\2\u00b4\u00b8"+
		"\3\2\2\2\u00b5\u00b7\n\4\2\2\u00b6\u00b5\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8"+
		"\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bb\3\2\2\2\u00ba\u00b8\3\2"+
		"\2\2\u00bb\u00bc\b\30\3\2\u00bc\61\3\2\2\2\u00bd\u00bf\13\2\2\2\u00be"+
		"\u00bd\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c0\u00be\3\2"+
		"\2\2\u00c1\u00c3\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c4\5\64\32\2\u00c4"+
		"\u00c5\3\2\2\2\u00c5\u00c6\b\31\4\2\u00c6\63\3\2\2\2\u00c7\u00c8\t\4\2"+
		"\2\u00c8\65\3\2\2\2\7\2\3\u00a3\u00b8\u00c0\5\7\3\2\b\2\2\6\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}