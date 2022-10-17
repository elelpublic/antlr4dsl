// Generated from java-escape by ANTLR 4.11.1
package com.infodesire.poc.antlr4dsl.parser;
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
	 * Enter a parse tree produced by {@link BSMLParser#lines}.
	 * @param ctx the parse tree
	 */
	void enterLines(BSMLParser.LinesContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSMLParser#lines}.
	 * @param ctx the parse tree
	 */
	void exitLines(BSMLParser.LinesContext ctx);
	/**
	 * Enter a parse tree produced by {@link BSMLParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(BSMLParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSMLParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(BSMLParser.LineContext ctx);
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