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
	 * Enter a parse tree produced by {@link BSMLParser#queryProperties}.
	 * @param ctx the parse tree
	 */
	void enterQueryProperties(BSMLParser.QueryPropertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link BSMLParser#queryProperties}.
	 * @param ctx the parse tree
	 */
	void exitQueryProperties(BSMLParser.QueryPropertiesContext ctx);
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