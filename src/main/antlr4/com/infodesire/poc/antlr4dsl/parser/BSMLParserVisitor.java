// Generated from java-escape by ANTLR 4.11.1
package com.infodesire.poc.antlr4dsl.parser;
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
	 * Visit a parse tree produced by {@link BSMLParser#lines}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLines(BSMLParser.LinesContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSMLParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(BSMLParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSMLParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(BSMLParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link BSMLParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(BSMLParser.ValueContext ctx);
}