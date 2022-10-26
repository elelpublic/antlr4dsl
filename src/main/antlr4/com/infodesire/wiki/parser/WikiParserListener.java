// Generated from java-escape by ANTLR 4.11.1
package com.infodesire.wiki.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link WikiParser}.
 */
public interface WikiParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link WikiParser#page}.
	 * @param ctx the parse tree
	 */
	void enterPage(WikiParser.PageContext ctx);
	/**
	 * Exit a parse tree produced by {@link WikiParser#page}.
	 * @param ctx the parse tree
	 */
	void exitPage(WikiParser.PageContext ctx);
	/**
	 * Enter a parse tree produced by {@link WikiParser#wiki}.
	 * @param ctx the parse tree
	 */
	void enterWiki(WikiParser.WikiContext ctx);
	/**
	 * Exit a parse tree produced by {@link WikiParser#wiki}.
	 * @param ctx the parse tree
	 */
	void exitWiki(WikiParser.WikiContext ctx);
}