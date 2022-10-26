// Generated from java-escape by ANTLR 4.11.1
package com.infodesire.wiki.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link WikiParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface WikiParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link WikiParser#page}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPage(WikiParser.PageContext ctx);
	/**
	 * Visit a parse tree produced by {@link WikiParser#wiki}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWiki(WikiParser.WikiContext ctx);
}