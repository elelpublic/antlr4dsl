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
	 * Enter a parse tree produced by {@link BSMLParser#programLine}.
	 * @param ctx the parse tree
	 */
	void enterProgramLine(BSMLParser.ProgramLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSMLParser#programLine}.
	 * @param ctx the parse tree
	 */
	void exitProgramLine(BSMLParser.ProgramLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSMLParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAction(BSMLParser.ActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSMLParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAction(BSMLParser.ActionContext ctx);
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
	 * Enter a parse tree produced by {@link BSMLParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanExpression(BSMLParser.BooleanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSMLParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanExpression(BSMLParser.BooleanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSMLParser#booleanOperator}.
	 * @param ctx the parse tree
	 */
	void enterBooleanOperator(BSMLParser.BooleanOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSMLParser#booleanOperator}.
	 * @param ctx the parse tree
	 */
	void exitBooleanOperator(BSMLParser.BooleanOperatorContext ctx);
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
	 * Enter a parse tree produced by {@link BSMLParser#fieldPath}.
	 * @param ctx the parse tree
	 */
	void enterFieldPath(BSMLParser.FieldPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSMLParser#fieldPath}.
	 * @param ctx the parse tree
	 */
	void exitFieldPath(BSMLParser.FieldPathContext ctx);
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