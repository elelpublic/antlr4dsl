// Generated from java-escape by ANTLR 4.11.1
package com.infodesire.poc.antlr4dsl.parser;
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
		IDENTIFIER=1, COLON=2, WHITESPACE=3, NEWLINE=4, VALUE=5, EOL=6;
	public static final int
		RULE_prog = 0, RULE_lines = 1, RULE_line = 2, RULE_name = 3, RULE_value = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "lines", "line", "name", "value"
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
		public LinesContext lines() {
			return getRuleContext(LinesContext.class,0);
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
			setState(14);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
				enterOuterAlt(_localctx, 1);
				{
				setState(10);
				match(EOF);
				}
				break;
			case IDENTIFIER:
			case WHITESPACE:
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(11);
				lines(0);
				setState(12);
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
	public static class LinesContext extends ParserRuleContext {
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
		}
		public LinesContext lines() {
			return getRuleContext(LinesContext.class,0);
		}
		public LinesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lines; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BSMLParserListener ) ((BSMLParserListener)listener).enterLines(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BSMLParserListener ) ((BSMLParserListener)listener).exitLines(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BSMLParserVisitor ) return ((BSMLParserVisitor<? extends T>)visitor).visitLines(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LinesContext lines() throws RecognitionException {
		return lines(0);
	}

	private LinesContext lines(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LinesContext _localctx = new LinesContext(_ctx, _parentState);
		LinesContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_lines, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(17);
			line();
			}
			_ctx.stop = _input.LT(-1);
			setState(23);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LinesContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_lines);
					setState(19);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(20);
					line();
					}
					} 
				}
				setState(25);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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
	public static class LineContext extends ParserRuleContext {
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
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BSMLParserListener ) ((BSMLParserListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BSMLParserListener ) ((BSMLParserListener)listener).exitLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BSMLParserVisitor ) return ((BSMLParserVisitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_line);
		int _la;
		try {
			setState(42);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				name();
				setState(27);
				match(EOL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(29);
				name();
				setState(30);
				match(EOF);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(32);
				name();
				setState(33);
				value();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITESPACE) {
					{
					{
					setState(35);
					match(WHITESPACE);
					}
					}
					setState(40);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(41);
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
		enterRule(_localctx, 6, RULE_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(IDENTIFIER);
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(45);
				match(WHITESPACE);
				}
				}
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(51);
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
		enterRule(_localctx, 8, RULE_value);
		try {
			setState(57);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				match(VALUE);
				setState(54);
				match(EOL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				match(VALUE);
				setState(56);
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
		case 1:
			return lines_sempred((LinesContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean lines_sempred(LinesContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0006<\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u000f\b\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u0016"+
		"\b\u0001\n\u0001\f\u0001\u0019\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0005\u0002%\b\u0002\n\u0002\f\u0002(\t\u0002\u0001\u0002"+
		"\u0003\u0002+\b\u0002\u0001\u0003\u0001\u0003\u0005\u0003/\b\u0003\n\u0003"+
		"\f\u00032\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004:\b\u0004\u0001\u0004\u0000\u0001\u0002"+
		"\u0005\u0000\u0002\u0004\u0006\b\u0000\u0000>\u0000\u000e\u0001\u0000"+
		"\u0000\u0000\u0002\u0010\u0001\u0000\u0000\u0000\u0004*\u0001\u0000\u0000"+
		"\u0000\u0006,\u0001\u0000\u0000\u0000\b9\u0001\u0000\u0000\u0000\n\u000f"+
		"\u0005\u0000\u0000\u0001\u000b\f\u0003\u0002\u0001\u0000\f\r\u0005\u0000"+
		"\u0000\u0001\r\u000f\u0001\u0000\u0000\u0000\u000e\n\u0001\u0000\u0000"+
		"\u0000\u000e\u000b\u0001\u0000\u0000\u0000\u000f\u0001\u0001\u0000\u0000"+
		"\u0000\u0010\u0011\u0006\u0001\uffff\uffff\u0000\u0011\u0012\u0003\u0004"+
		"\u0002\u0000\u0012\u0017\u0001\u0000\u0000\u0000\u0013\u0014\n\u0001\u0000"+
		"\u0000\u0014\u0016\u0003\u0004\u0002\u0000\u0015\u0013\u0001\u0000\u0000"+
		"\u0000\u0016\u0019\u0001\u0000\u0000\u0000\u0017\u0015\u0001\u0000\u0000"+
		"\u0000\u0017\u0018\u0001\u0000\u0000\u0000\u0018\u0003\u0001\u0000\u0000"+
		"\u0000\u0019\u0017\u0001\u0000\u0000\u0000\u001a\u001b\u0003\u0006\u0003"+
		"\u0000\u001b\u001c\u0005\u0006\u0000\u0000\u001c+\u0001\u0000\u0000\u0000"+
		"\u001d\u001e\u0003\u0006\u0003\u0000\u001e\u001f\u0005\u0000\u0000\u0001"+
		"\u001f+\u0001\u0000\u0000\u0000 !\u0003\u0006\u0003\u0000!\"\u0003\b\u0004"+
		"\u0000\"+\u0001\u0000\u0000\u0000#%\u0005\u0003\u0000\u0000$#\u0001\u0000"+
		"\u0000\u0000%(\u0001\u0000\u0000\u0000&$\u0001\u0000\u0000\u0000&\'\u0001"+
		"\u0000\u0000\u0000\')\u0001\u0000\u0000\u0000(&\u0001\u0000\u0000\u0000"+
		")+\u0005\u0004\u0000\u0000*\u001a\u0001\u0000\u0000\u0000*\u001d\u0001"+
		"\u0000\u0000\u0000* \u0001\u0000\u0000\u0000*&\u0001\u0000\u0000\u0000"+
		"+\u0005\u0001\u0000\u0000\u0000,0\u0005\u0001\u0000\u0000-/\u0005\u0003"+
		"\u0000\u0000.-\u0001\u0000\u0000\u0000/2\u0001\u0000\u0000\u00000.\u0001"+
		"\u0000\u0000\u000001\u0001\u0000\u0000\u000013\u0001\u0000\u0000\u0000"+
		"20\u0001\u0000\u0000\u000034\u0005\u0002\u0000\u00004\u0007\u0001\u0000"+
		"\u0000\u000056\u0005\u0005\u0000\u00006:\u0005\u0006\u0000\u000078\u0005"+
		"\u0005\u0000\u00008:\u0005\u0000\u0000\u000195\u0001\u0000\u0000\u0000"+
		"97\u0001\u0000\u0000\u0000:\t\u0001\u0000\u0000\u0000\u0006\u000e\u0017"+
		"&*09";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}