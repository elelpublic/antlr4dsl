// Generated from java-escape by ANTLR 4.11.1
package com.infodesire.bsml.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BSMLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BSMLParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link BSMLParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(BSMLParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSMLParser#programLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramLine(BSMLParser.ProgramLineContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSMLParser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAction(BSMLParser.ActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSMLParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(BSMLParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSMLParser#where}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere(BSMLParser.WhereContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSMLParser#queryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryExpression(BSMLParser.QueryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSMLParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanExpression(BSMLParser.BooleanExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSMLParser#booleanOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanOperator(BSMLParser.BooleanOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSMLParser#comparator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparator(BSMLParser.ComparatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSMLParser#fieldPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldPath(BSMLParser.FieldPathContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSMLParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(BSMLParser.FieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSMLParser#queryPropertyLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryPropertyLine(BSMLParser.QueryPropertyLineContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSMLParser#emptyLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyLine(BSMLParser.EmptyLineContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSMLParser#queryProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryProperty(BSMLParser.QueryPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSMLParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(BSMLParser.ValueContext ctx);
}