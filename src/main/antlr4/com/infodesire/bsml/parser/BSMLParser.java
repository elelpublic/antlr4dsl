// Generated from java-escape by ANTLR 4.11.1
package com.infodesire.bsml.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class BSMLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		QUERY=1, OPEN=2, CLOSE=3, IDENTIFIER=4, COLON=5, WHITESPACE=6, NEWLINE=7, 
		VALUE=8, EOL=9;
	public static final int
		RULE_prog = 0, RULE_query = 1, RULE_queryProperties = 2, RULE_queryProperty = 3, 
		RULE_name = 4, RULE_value = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "query", "queryProperties", "queryProperty", "name", "value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'query'", "'{'", "'}'", null, "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "QUERY", "OPEN", "CLOSE", "IDENTIFIER", "COLON", "WHITESPACE", 
			"NEWLINE", "VALUE", "EOL"
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

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BSMLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(BSMLParser.EOF, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BSMLParserListener ) ((BSMLParserListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BSMLParserListener ) ((BSMLParserListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BSMLParserVisitor ) return ((BSMLParserVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			setState(16);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
				enterOuterAlt(_localctx, 1);
				{
				setState(12);
				match(EOF);
				}
				break;
			case QUERY:
				enterOuterAlt(_localctx, 2);
				{
				setState(13);
				query();
				setState(14);
				match(EOF);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QueryContext extends ParserRuleContext {
		public TerminalNode QUERY() { return getToken(BSMLParser.QUERY, 0); }
		public TerminalNode OPEN() { return getToken(BSMLParser.OPEN, 0); }
		public TerminalNode CLOSE() { return getToken(BSMLParser.CLOSE, 0); }
		public List<QueryPropertiesContext> queryProperties() {
			return getRuleContexts(QueryPropertiesContext.class);
		}
		public QueryPropertiesContext queryProperties(int i) {
			return getRuleContext(QueryPropertiesContext.class,i);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BSMLParserListener ) ((BSMLParserListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BSMLParserListener ) ((BSMLParserListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BSMLParserVisitor ) return ((BSMLParserVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			match(QUERY);
			setState(19);
			match(OPEN);
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 208L) != 0) {
				{
				{
				setState(20);
				queryProperties(0);
				}
				}
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(26);
			match(CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QueryPropertiesContext extends ParserRuleContext {
		public QueryPropertyContext queryProperty() {
			return getRuleContext(QueryPropertyContext.class,0);
		}
		public QueryPropertiesContext queryProperties() {
			return getRuleContext(QueryPropertiesContext.class,0);
		}
		public QueryPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryProperties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BSMLParserListener ) ((BSMLParserListener)listener).enterQueryProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BSMLParserListener ) ((BSMLParserListener)listener).exitQueryProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BSMLParserVisitor ) return ((BSMLParserVisitor<? extends T>)visitor).visitQueryProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryPropertiesContext queryProperties() throws RecognitionException {
		return queryProperties(0);
	}

	private QueryPropertiesContext queryProperties(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		QueryPropertiesContext _localctx = new QueryPropertiesContext(_ctx, _parentState);
		QueryPropertiesContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_queryProperties, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(29);
			queryProperty();
			}
			_ctx.stop = _input.LT(-1);
			setState(35);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new QueryPropertiesContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_queryProperties);
					setState(31);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(32);
					queryProperty();
					}
					} 
				}
				setState(37);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QueryPropertyContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode EOL() { return getToken(BSMLParser.EOL, 0); }
		public TerminalNode EOF() { return getToken(BSMLParser.EOF, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(BSMLParser.NEWLINE, 0); }
		public List<TerminalNode> WHITESPACE() { return getTokens(BSMLParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(BSMLParser.WHITESPACE, i);
		}
		public QueryPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BSMLParserListener ) ((BSMLParserListener)listener).enterQueryProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BSMLParserListener ) ((BSMLParserListener)listener).exitQueryProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BSMLParserVisitor ) return ((BSMLParserVisitor<? extends T>)visitor).visitQueryProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryPropertyContext queryProperty() throws RecognitionException {
		QueryPropertyContext _localctx = new QueryPropertyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_queryProperty);
		int _la;
		try {
			setState(54);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				name();
				setState(39);
				match(EOL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				name();
				setState(42);
				match(EOF);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(44);
				name();
				setState(45);
				value();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITESPACE) {
					{
					{
					setState(47);
					match(WHITESPACE);
					}
					}
					setState(52);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(53);
				match(NEWLINE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(BSMLParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(BSMLParser.COLON, 0); }
		public List<TerminalNode> WHITESPACE() { return getTokens(BSMLParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(BSMLParser.WHITESPACE, i);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BSMLParserListener ) ((BSMLParserListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BSMLParserListener ) ((BSMLParserListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BSMLParserVisitor ) return ((BSMLParserVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(IDENTIFIER);
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(57);
				match(WHITESPACE);
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63);
			match(COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public TerminalNode VALUE() { return getToken(BSMLParser.VALUE, 0); }
		public TerminalNode EOL() { return getToken(BSMLParser.EOL, 0); }
		public TerminalNode EOF() { return getToken(BSMLParser.EOF, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BSMLParserListener ) ((BSMLParserListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BSMLParserListener ) ((BSMLParserListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BSMLParserVisitor ) return ((BSMLParserVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_value);
		try {
			setState(69);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				match(VALUE);
				setState(66);
				match(EOL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				match(VALUE);
				setState(68);
				match(EOF);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return queryProperties_sempred((QueryPropertiesContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean queryProperties_sempred(QueryPropertiesContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\tH\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003"+
		"\u0000\u0011\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u0016"+
		"\b\u0001\n\u0001\f\u0001\u0019\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002\"\b\u0002"+
		"\n\u0002\f\u0002%\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0005\u00031\b\u0003\n\u0003\f\u00034\t\u0003\u0001\u0003\u0003\u0003"+
		"7\b\u0003\u0001\u0004\u0001\u0004\u0005\u0004;\b\u0004\n\u0004\f\u0004"+
		">\t\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005F\b\u0005\u0001\u0005\u0000\u0001\u0004\u0006"+
		"\u0000\u0002\u0004\u0006\b\n\u0000\u0000J\u0000\u0010\u0001\u0000\u0000"+
		"\u0000\u0002\u0012\u0001\u0000\u0000\u0000\u0004\u001c\u0001\u0000\u0000"+
		"\u0000\u00066\u0001\u0000\u0000\u0000\b8\u0001\u0000\u0000\u0000\nE\u0001"+
		"\u0000\u0000\u0000\f\u0011\u0005\u0000\u0000\u0001\r\u000e\u0003\u0002"+
		"\u0001\u0000\u000e\u000f\u0005\u0000\u0000\u0001\u000f\u0011\u0001\u0000"+
		"\u0000\u0000\u0010\f\u0001\u0000\u0000\u0000\u0010\r\u0001\u0000\u0000"+
		"\u0000\u0011\u0001\u0001\u0000\u0000\u0000\u0012\u0013\u0005\u0001\u0000"+
		"\u0000\u0013\u0017\u0005\u0002\u0000\u0000\u0014\u0016\u0003\u0004\u0002"+
		"\u0000\u0015\u0014\u0001\u0000\u0000\u0000\u0016\u0019\u0001\u0000\u0000"+
		"\u0000\u0017\u0015\u0001\u0000\u0000\u0000\u0017\u0018\u0001\u0000\u0000"+
		"\u0000\u0018\u001a\u0001\u0000\u0000\u0000\u0019\u0017\u0001\u0000\u0000"+
		"\u0000\u001a\u001b\u0005\u0003\u0000\u0000\u001b\u0003\u0001\u0000\u0000"+
		"\u0000\u001c\u001d\u0006\u0002\uffff\uffff\u0000\u001d\u001e\u0003\u0006"+
		"\u0003\u0000\u001e#\u0001\u0000\u0000\u0000\u001f \n\u0001\u0000\u0000"+
		" \"\u0003\u0006\u0003\u0000!\u001f\u0001\u0000\u0000\u0000\"%\u0001\u0000"+
		"\u0000\u0000#!\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$\u0005"+
		"\u0001\u0000\u0000\u0000%#\u0001\u0000\u0000\u0000&\'\u0003\b\u0004\u0000"+
		"\'(\u0005\t\u0000\u0000(7\u0001\u0000\u0000\u0000)*\u0003\b\u0004\u0000"+
		"*+\u0005\u0000\u0000\u0001+7\u0001\u0000\u0000\u0000,-\u0003\b\u0004\u0000"+
		"-.\u0003\n\u0005\u0000.7\u0001\u0000\u0000\u0000/1\u0005\u0006\u0000\u0000"+
		"0/\u0001\u0000\u0000\u000014\u0001\u0000\u0000\u000020\u0001\u0000\u0000"+
		"\u000023\u0001\u0000\u0000\u000035\u0001\u0000\u0000\u000042\u0001\u0000"+
		"\u0000\u000057\u0005\u0007\u0000\u00006&\u0001\u0000\u0000\u00006)\u0001"+
		"\u0000\u0000\u00006,\u0001\u0000\u0000\u000062\u0001\u0000\u0000\u0000"+
		"7\u0007\u0001\u0000\u0000\u00008<\u0005\u0004\u0000\u00009;\u0005\u0006"+
		"\u0000\u0000:9\u0001\u0000\u0000\u0000;>\u0001\u0000\u0000\u0000<:\u0001"+
		"\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=?\u0001\u0000\u0000\u0000"+
		"><\u0001\u0000\u0000\u0000?@\u0005\u0005\u0000\u0000@\t\u0001\u0000\u0000"+
		"\u0000AB\u0005\b\u0000\u0000BF\u0005\t\u0000\u0000CD\u0005\b\u0000\u0000"+
		"DF\u0005\u0000\u0000\u0001EA\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000"+
		"\u0000F\u000b\u0001\u0000\u0000\u0000\u0007\u0010\u0017#26<E";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}