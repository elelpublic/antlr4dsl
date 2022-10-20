// Generated from java-escape by ANTLR 4.11.1
package com.infodesire.bsml.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BSMLParser}.
 */
public interface BSMLParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BSMLParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(BSMLParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSMLParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(BSMLParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSMLParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(BSMLParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSMLParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(BSMLParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSMLParser#where}.
	 * @param ctx the parse tree
	 */
	void enterWhere(BSMLParser.WhereContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSMLParser#where}.
	 * @param ctx the parse tree
	 */
	void exitWhere(BSMLParser.WhereContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSMLParser#queryExpression}.
	 * @param ctx the parse tree
	 */
	void enterQueryExpression(BSMLParser.QueryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSMLParser#queryExpression}.
	 * @param ctx the parse tree
	 */
	void exitQueryExpression(BSMLParser.QueryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSMLParser#orExpression}.
	 * @param ctx the parse tree
	 */
	void enterOrExpression(BSMLParser.OrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSMLParser#orExpression}.
	 * @param ctx the parse tree
	 */
	void exitOrExpression(BSMLParser.OrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSMLParser#comparator}.
	 * @param ctx the parse tree
	 */
	void enterComparator(BSMLParser.ComparatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSMLParser#comparator}.
	 * @param ctx the parse tree
	 */
	void exitComparator(BSMLParser.ComparatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSMLParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(BSMLParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSMLParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(BSMLParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSMLParser#queryPropertyLine}.
	 * @param ctx the parse tree
	 */
	void enterQueryPropertyLine(BSMLParser.QueryPropertyLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSMLParser#queryPropertyLine}.
	 * @param ctx the parse tree
	 */
	void exitQueryPropertyLine(BSMLParser.QueryPropertyLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSMLParser#emptyLine}.
	 * @param ctx the parse tree
	 */
	void enterEmptyLine(BSMLParser.EmptyLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSMLParser#emptyLine}.
	 * @param ctx the parse tree
	 */
	void exitEmptyLine(BSMLParser.EmptyLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSMLParser#queryProperty}.
	 * @param ctx the parse tree
	 */
	void enterQueryProperty(BSMLParser.QueryPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSMLParser#queryProperty}.
	 * @param ctx the parse tree
	 */
	void exitQueryProperty(BSMLParser.QueryPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSMLParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(BSMLParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSMLParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(BSMLParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSMLParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(BSMLParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSMLParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(BSMLParser.ValueContext ctx);
}