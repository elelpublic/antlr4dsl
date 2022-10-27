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
		ENDS_WITH=14, LIKE=15, CONTAINS=16, LCURLY=17, RCURLY=18, DOT=19, FIELD=20, 
		PROPERTY_NAME=21, COLON=22, NEWLINE=23, WHITESPACE=24, LINE_COMMENT=25, 
		VALUE=26, EOL=27;
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
			"LIKE", "CONTAINS", "LCURLY", "RCURLY", "DOT", "FIELD", "PROPERTY_NAME", 
			"COLON", "NEWLINE", "WHITESPACE", "LINE_COMMENT", "VALUE", "EOL"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'QUERY'", "'WHERE'", "'OR'", "'AND'", "'NOT'", "'ACTION'", "'<'", 
			"'<='", "'='", "'!='", "'>'", "'>='", "'STARTS_WITH'", "'ENDS_WITH'", 
			"'LIKE'", "'CONTAINS'", "'{'", "'}'", "'.'", null, null, "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "QUERY", "WHERE", "OR", "AND", "NOT", "ACTION", "LESS", "LESS_OR_EQUAL", 
			"EQUAL", "NOT_EQUAL", "GREATER", "GREATER_OR_EQUAL", "STARTS_WITH", "ENDS_WITH", 
			"LIKE", "CONTAINS", "LCURLY", "RCURLY", "DOT", "FIELD", "PROPERTY_NAME", 
			"COLON", "NEWLINE", "WHITESPACE", "LINE_COMMENT", "VALUE", "EOL"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\35\u00d6\b\1\b\1"+
		"\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t"+
		"\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4"+
		"\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4"+
		"\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\7\25\u00a8\n\25\f\25\16\25\u00ab"+
		"\13\25\3\26\3\26\7\26\u00af\n\26\f\26\16\26\u00b2\13\26\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\7\32"+
		"\u00c4\n\32\f\32\16\32\u00c7\13\32\3\32\3\32\3\33\7\33\u00cc\n\33\f\33"+
		"\16\33\u00cf\13\33\3\33\3\33\3\33\3\33\3\34\3\34\3\u00cd\2\35\4\3\6\4"+
		"\b\5\n\6\f\7\16\b\20\t\22\n\24\13\26\f\30\r\32\16\34\17\36\20 \21\"\22"+
		"$\23&\24(\25*\26,\27.\30\60\31\62\32\64\33\66\348\35\4\2\3\6\4\2C\\c|"+
		"\5\2\62;C\\c|\4\2\f\f\17\17\4\2\13\13\"\"\2\u00d8\2\4\3\2\2\2\2\6\3\2"+
		"\2\2\2\b\3\2\2\2\2\n\3\2\2\2\2\f\3\2\2\2\2\16\3\2\2\2\2\20\3\2\2\2\2\22"+
		"\3\2\2\2\2\24\3\2\2\2\2\26\3\2\2\2\2\30\3\2\2\2\2\32\3\2\2\2\2\34\3\2"+
		"\2\2\2\36\3\2\2\2\2 \3\2\2\2\2\"\3\2\2\2\2$\3\2\2\2\2&\3\2\2\2\2(\3\2"+
		"\2\2\2*\3\2\2\2\2,\3\2\2\2\2.\3\2\2\2\2\60\3\2\2\2\2\62\3\2\2\2\2\64\3"+
		"\2\2\2\3\66\3\2\2\2\38\3\2\2\2\4:\3\2\2\2\6@\3\2\2\2\bF\3\2\2\2\nI\3\2"+
		"\2\2\fM\3\2\2\2\16Q\3\2\2\2\20X\3\2\2\2\22\\\3\2\2\2\24a\3\2\2\2\26e\3"+
		"\2\2\2\30j\3\2\2\2\32n\3\2\2\2\34s\3\2\2\2\36\u0081\3\2\2\2 \u008d\3\2"+
		"\2\2\"\u0094\3\2\2\2$\u009f\3\2\2\2&\u00a1\3\2\2\2(\u00a3\3\2\2\2*\u00a5"+
		"\3\2\2\2,\u00ac\3\2\2\2.\u00b3\3\2\2\2\60\u00b7\3\2\2\2\62\u00bb\3\2\2"+
		"\2\64\u00bf\3\2\2\2\66\u00cd\3\2\2\28\u00d4\3\2\2\2:;\7S\2\2;<\7W\2\2"+
		"<=\7G\2\2=>\7T\2\2>?\7[\2\2?\5\3\2\2\2@A\7Y\2\2AB\7J\2\2BC\7G\2\2CD\7"+
		"T\2\2DE\7G\2\2E\7\3\2\2\2FG\7Q\2\2GH\7T\2\2H\t\3\2\2\2IJ\7C\2\2JK\7P\2"+
		"\2KL\7F\2\2L\13\3\2\2\2MN\7P\2\2NO\7Q\2\2OP\7V\2\2P\r\3\2\2\2QR\7C\2\2"+
		"RS\7E\2\2ST\7V\2\2TU\7K\2\2UV\7Q\2\2VW\7P\2\2W\17\3\2\2\2XY\7>\2\2YZ\3"+
		"\2\2\2Z[\b\b\2\2[\21\3\2\2\2\\]\7>\2\2]^\7?\2\2^_\3\2\2\2_`\b\t\2\2`\23"+
		"\3\2\2\2ab\7?\2\2bc\3\2\2\2cd\b\n\2\2d\25\3\2\2\2ef\7#\2\2fg\7?\2\2gh"+
		"\3\2\2\2hi\b\13\2\2i\27\3\2\2\2jk\7@\2\2kl\3\2\2\2lm\b\f\2\2m\31\3\2\2"+
		"\2no\7@\2\2op\7?\2\2pq\3\2\2\2qr\b\r\2\2r\33\3\2\2\2st\7U\2\2tu\7V\2\2"+
		"uv\7C\2\2vw\7T\2\2wx\7V\2\2xy\7U\2\2yz\7a\2\2z{\7Y\2\2{|\7K\2\2|}\7V\2"+
		"\2}~\7J\2\2~\177\3\2\2\2\177\u0080\b\16\2\2\u0080\35\3\2\2\2\u0081\u0082"+
		"\7G\2\2\u0082\u0083\7P\2\2\u0083\u0084\7F\2\2\u0084\u0085\7U\2\2\u0085"+
		"\u0086\7a\2\2\u0086\u0087\7Y\2\2\u0087\u0088\7K\2\2\u0088\u0089\7V\2\2"+
		"\u0089\u008a\7J\2\2\u008a\u008b\3\2\2\2\u008b\u008c\b\17\2\2\u008c\37"+
		"\3\2\2\2\u008d\u008e\7N\2\2\u008e\u008f\7K\2\2\u008f\u0090\7M\2\2\u0090"+
		"\u0091\7G\2\2\u0091\u0092\3\2\2\2\u0092\u0093\b\20\2\2\u0093!\3\2\2\2"+
		"\u0094\u0095\7E\2\2\u0095\u0096\7Q\2\2\u0096\u0097\7P\2\2\u0097\u0098"+
		"\7V\2\2\u0098\u0099\7C\2\2\u0099\u009a\7K\2\2\u009a\u009b\7P\2\2\u009b"+
		"\u009c\7U\2\2\u009c\u009d\3\2\2\2\u009d\u009e\b\21\2\2\u009e#\3\2\2\2"+
		"\u009f\u00a0\7}\2\2\u00a0%\3\2\2\2\u00a1\u00a2\7\177\2\2\u00a2\'\3\2\2"+
		"\2\u00a3\u00a4\7\60\2\2\u00a4)\3\2\2\2\u00a5\u00a9\t\2\2\2\u00a6\u00a8"+
		"\t\3\2\2\u00a7\u00a6\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9"+
		"\u00aa\3\2\2\2\u00aa+\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00b0\t\2\2\2"+
		"\u00ad\u00af\t\3\2\2\u00ae\u00ad\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae"+
		"\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1-\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3"+
		"\u00b4\7<\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\b\27\2\2\u00b6/\3\2\2\2"+
		"\u00b7\u00b8\t\4\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\b\30\3\2\u00ba\61"+
		"\3\2\2\2\u00bb\u00bc\t\5\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\b\31\3\2"+
		"\u00be\63\3\2\2\2\u00bf\u00c0\7\61\2\2\u00c0\u00c1\7\61\2\2\u00c1\u00c5"+
		"\3\2\2\2\u00c2\u00c4\n\4\2\2\u00c3\u00c2\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5"+
		"\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00c5\3\2"+
		"\2\2\u00c8\u00c9\b\32\3\2\u00c9\65\3\2\2\2\u00ca\u00cc\13\2\2\2\u00cb"+
		"\u00ca\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00ce\3\2\2\2\u00cd\u00cb\3\2"+
		"\2\2\u00ce\u00d0\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d1\58\34\2\u00d1"+
		"\u00d2\3\2\2\2\u00d2\u00d3\b\33\4\2\u00d3\67\3\2\2\2\u00d4\u00d5\t\4\2"+
		"\2\u00d59\3\2\2\2\b\2\3\u00a9\u00b0\u00c5\u00cd\5\7\3\2\b\2\2\6\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}