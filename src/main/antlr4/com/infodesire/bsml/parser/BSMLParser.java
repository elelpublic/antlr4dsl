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
		QUERY=1, WHERE=2, OR=3, LESS=4, LESS_OR_EQUAL=5, EQUAL=6, NOT_EQUAL=7, 
		GREATER=8, GREATER_OR_EQUAL=9, LCURLY=10, RCURLY=11, IDENTIFIER=12, COLON=13, 
		NEWLINE=14, WHITESPACE=15, LINE_COMMENT=16, VALUE=17, EOL=18;
	public static final int
		RULE_prog = 0, RULE_query = 1, RULE_where = 2, RULE_queryExpression = 3, 
		RULE_orExpression = 4, RULE_comparator = 5, RULE_field = 6, RULE_queryPropertyLine = 7, 
		RULE_emptyLine = 8, RULE_queryProperty = 9, RULE_name = 10, RULE_value = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "query", "where", "queryExpression", "orExpression", "comparator", 
			"field", "queryPropertyLine", "emptyLine", "queryProperty", "name", "value"
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
			setState(28);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				match(EOF);
				}
				break;
			case QUERY:
				enterOuterAlt(_localctx, 2);
				{
				setState(25);
				query();
				setState(26);
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
		public TerminalNode LCURLY() { return getToken(BSMLParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(BSMLParser.RCURLY, 0); }
		public List<QueryPropertyLineContext> queryPropertyLine() {
			return getRuleContexts(QueryPropertyLineContext.class);
		}
		public QueryPropertyLineContext queryPropertyLine(int i) {
			return getRuleContext(QueryPropertyLineContext.class,i);
		}
		public WhereContext where() {
			return getRuleContext(WhereContext.class,0);
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
			setState(30);
			match(QUERY);
			setState(31);
			match(LCURLY);
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 53248L) != 0) {
				{
				{
				setState(32);
				queryPropertyLine();
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(38);
				where();
				}
			}

			setState(41);
			match(RCURLY);
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
	public static class WhereContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(BSMLParser.WHERE, 0); }
		public TerminalNode LCURLY() { return getToken(BSMLParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(BSMLParser.RCURLY, 0); }
		public List<QueryExpressionContext> queryExpression() {
			return getRuleContexts(QueryExpressionContext.class);
		}
		public QueryExpressionContext queryExpression(int i) {
			return getRuleContext(QueryExpressionContext.class,i);
		}
		public WhereContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BSMLParserListener ) ((BSMLParserListener)listener).enterWhere(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BSMLParserListener ) ((BSMLParserListener)listener).exitWhere(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BSMLParserVisitor ) return ((BSMLParserVisitor<? extends T>)visitor).visitWhere(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereContext where() throws RecognitionException {
		WhereContext _localctx = new WhereContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_where);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(WHERE);
			setState(44);
			match(LCURLY);
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR || _la==IDENTIFIER) {
				{
				{
				setState(45);
				queryExpression();
				}
				}
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(51);
			match(RCURLY);
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
	public static class QueryExpressionContext extends ParserRuleContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public ComparatorContext comparator() {
			return getRuleContext(ComparatorContext.class,0);
		}
		public TerminalNode VALUE() { return getToken(BSMLParser.VALUE, 0); }
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
		public QueryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BSMLParserListener ) ((BSMLParserListener)listener).enterQueryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BSMLParserListener ) ((BSMLParserListener)listener).exitQueryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BSMLParserVisitor ) return ((BSMLParserVisitor<? extends T>)visitor).visitQueryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryExpressionContext queryExpression() throws RecognitionException {
		QueryExpressionContext _localctx = new QueryExpressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_queryExpression);
		try {
			setState(58);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				field();
				setState(54);
				comparator();
				setState(55);
				match(VALUE);
				}
				break;
			case OR:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				orExpression();
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
	public static class OrExpressionContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(BSMLParser.OR, 0); }
		public TerminalNode LCURLY() { return getToken(BSMLParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(BSMLParser.RCURLY, 0); }
		public List<QueryExpressionContext> queryExpression() {
			return getRuleContexts(QueryExpressionContext.class);
		}
		public QueryExpressionContext queryExpression(int i) {
			return getRuleContext(QueryExpressionContext.class,i);
		}
		public OrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BSMLParserListener ) ((BSMLParserListener)listener).enterOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BSMLParserListener ) ((BSMLParserListener)listener).exitOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BSMLParserVisitor ) return ((BSMLParserVisitor<? extends T>)visitor).visitOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrExpressionContext orExpression() throws RecognitionException {
		OrExpressionContext _localctx = new OrExpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_orExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(OR);
			setState(61);
			match(LCURLY);
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR || _la==IDENTIFIER) {
				{
				{
				setState(62);
				queryExpression();
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(68);
			match(RCURLY);
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
	public static class ComparatorContext extends ParserRuleContext {
		public TerminalNode LESS() { return getToken(BSMLParser.LESS, 0); }
		public TerminalNode LESS_OR_EQUAL() { return getToken(BSMLParser.LESS_OR_EQUAL, 0); }
		public TerminalNode EQUAL() { return getToken(BSMLParser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(BSMLParser.NOT_EQUAL, 0); }
		public TerminalNode GREATER() { return getToken(BSMLParser.GREATER, 0); }
		public TerminalNode GREATER_OR_EQUAL() { return getToken(BSMLParser.GREATER_OR_EQUAL, 0); }
		public ComparatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BSMLParserListener ) ((BSMLParserListener)listener).enterComparator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BSMLParserListener ) ((BSMLParserListener)listener).exitComparator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BSMLParserVisitor ) return ((BSMLParserVisitor<? extends T>)visitor).visitComparator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparatorContext comparator() throws RecognitionException {
		ComparatorContext _localctx = new ComparatorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_comparator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 1008L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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
	public static class FieldContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(BSMLParser.IDENTIFIER, 0); }
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BSMLParserListener ) ((BSMLParserListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BSMLParserListener ) ((BSMLParserListener)listener).exitField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BSMLParserVisitor ) return ((BSMLParserVisitor<? extends T>)visitor).visitField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(IDENTIFIER);
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
	public static class QueryPropertyLineContext extends ParserRuleContext {
		public QueryPropertyContext queryProperty() {
			return getRuleContext(QueryPropertyContext.class,0);
		}
		public EmptyLineContext emptyLine() {
			return getRuleContext(EmptyLineContext.class,0);
		}
		public QueryPropertyLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryPropertyLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BSMLParserListener ) ((BSMLParserListener)listener).enterQueryPropertyLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BSMLParserListener ) ((BSMLParserListener)listener).exitQueryPropertyLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BSMLParserVisitor ) return ((BSMLParserVisitor<? extends T>)visitor).visitQueryPropertyLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryPropertyLineContext queryPropertyLine() throws RecognitionException {
		QueryPropertyLineContext _localctx = new QueryPropertyLineContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_queryPropertyLine);
		try {
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				queryProperty();
				}
				break;
			case NEWLINE:
			case WHITESPACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				emptyLine();
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
	public static class EmptyLineContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(BSMLParser.NEWLINE, 0); }
		public List<TerminalNode> WHITESPACE() { return getTokens(BSMLParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(BSMLParser.WHITESPACE, i);
		}
		public EmptyLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BSMLParserListener ) ((BSMLParserListener)listener).enterEmptyLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BSMLParserListener ) ((BSMLParserListener)listener).exitEmptyLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BSMLParserVisitor ) return ((BSMLParserVisitor<? extends T>)visitor).visitEmptyLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptyLineContext emptyLine() throws RecognitionException {
		EmptyLineContext _localctx = new EmptyLineContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_emptyLine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(78);
				match(WHITESPACE);
				}
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(84);
			match(NEWLINE);
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
	public static class QueryPropertyContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode COLON() { return getToken(BSMLParser.COLON, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
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
		enterRule(_localctx, 18, RULE_queryProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			name();
			setState(87);
			match(COLON);
			setState(88);
			value();
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
		enterRule(_localctx, 20, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(IDENTIFIER);
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
		enterRule(_localctx, 22, RULE_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(VALUE);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0012_\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u001d\b\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0005\u0001\"\b\u0001\n\u0001\f\u0001%"+
		"\t\u0001\u0001\u0001\u0003\u0001(\b\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0005\u0002/\b\u0002\n\u0002\f\u00022\t"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003;\b\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0005\u0004@\b\u0004\n\u0004\f\u0004C\t\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0003\u0007M\b\u0007\u0001\b\u0005\bP\b\b\n\b\f\bS\t\b\u0001\b"+
		"\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0000\u0000\f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0000\u0001\u0001\u0000\u0004\tZ\u0000\u001c\u0001"+
		"\u0000\u0000\u0000\u0002\u001e\u0001\u0000\u0000\u0000\u0004+\u0001\u0000"+
		"\u0000\u0000\u0006:\u0001\u0000\u0000\u0000\b<\u0001\u0000\u0000\u0000"+
		"\nF\u0001\u0000\u0000\u0000\fH\u0001\u0000\u0000\u0000\u000eL\u0001\u0000"+
		"\u0000\u0000\u0010Q\u0001\u0000\u0000\u0000\u0012V\u0001\u0000\u0000\u0000"+
		"\u0014Z\u0001\u0000\u0000\u0000\u0016\\\u0001\u0000\u0000\u0000\u0018"+
		"\u001d\u0005\u0000\u0000\u0001\u0019\u001a\u0003\u0002\u0001\u0000\u001a"+
		"\u001b\u0005\u0000\u0000\u0001\u001b\u001d\u0001\u0000\u0000\u0000\u001c"+
		"\u0018\u0001\u0000\u0000\u0000\u001c\u0019\u0001\u0000\u0000\u0000\u001d"+
		"\u0001\u0001\u0000\u0000\u0000\u001e\u001f\u0005\u0001\u0000\u0000\u001f"+
		"#\u0005\n\u0000\u0000 \"\u0003\u000e\u0007\u0000! \u0001\u0000\u0000\u0000"+
		"\"%\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000"+
		"\u0000$\'\u0001\u0000\u0000\u0000%#\u0001\u0000\u0000\u0000&(\u0003\u0004"+
		"\u0002\u0000\'&\u0001\u0000\u0000\u0000\'(\u0001\u0000\u0000\u0000()\u0001"+
		"\u0000\u0000\u0000)*\u0005\u000b\u0000\u0000*\u0003\u0001\u0000\u0000"+
		"\u0000+,\u0005\u0002\u0000\u0000,0\u0005\n\u0000\u0000-/\u0003\u0006\u0003"+
		"\u0000.-\u0001\u0000\u0000\u0000/2\u0001\u0000\u0000\u00000.\u0001\u0000"+
		"\u0000\u000001\u0001\u0000\u0000\u000013\u0001\u0000\u0000\u000020\u0001"+
		"\u0000\u0000\u000034\u0005\u000b\u0000\u00004\u0005\u0001\u0000\u0000"+
		"\u000056\u0003\f\u0006\u000067\u0003\n\u0005\u000078\u0005\u0011\u0000"+
		"\u00008;\u0001\u0000\u0000\u00009;\u0003\b\u0004\u0000:5\u0001\u0000\u0000"+
		"\u0000:9\u0001\u0000\u0000\u0000;\u0007\u0001\u0000\u0000\u0000<=\u0005"+
		"\u0003\u0000\u0000=A\u0005\n\u0000\u0000>@\u0003\u0006\u0003\u0000?>\u0001"+
		"\u0000\u0000\u0000@C\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000"+
		"AB\u0001\u0000\u0000\u0000BD\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000"+
		"\u0000DE\u0005\u000b\u0000\u0000E\t\u0001\u0000\u0000\u0000FG\u0007\u0000"+
		"\u0000\u0000G\u000b\u0001\u0000\u0000\u0000HI\u0005\f\u0000\u0000I\r\u0001"+
		"\u0000\u0000\u0000JM\u0003\u0012\t\u0000KM\u0003\u0010\b\u0000LJ\u0001"+
		"\u0000\u0000\u0000LK\u0001\u0000\u0000\u0000M\u000f\u0001\u0000\u0000"+
		"\u0000NP\u0005\u000f\u0000\u0000ON\u0001\u0000\u0000\u0000PS\u0001\u0000"+
		"\u0000\u0000QO\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000RT\u0001"+
		"\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000TU\u0005\u000e\u0000\u0000"+
		"U\u0011\u0001\u0000\u0000\u0000VW\u0003\u0014\n\u0000WX\u0005\r\u0000"+
		"\u0000XY\u0003\u0016\u000b\u0000Y\u0013\u0001\u0000\u0000\u0000Z[\u0005"+
		"\f\u0000\u0000[\u0015\u0001\u0000\u0000\u0000\\]\u0005\u0011\u0000\u0000"+
		"]\u0017\u0001\u0000\u0000\u0000\b\u001c#\'0:ALQ";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}