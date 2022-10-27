package com.infodesire.bsml;

import com.infodesire.bsml.model.Action;
import com.infodesire.bsml.model.BooleanOperator;
import com.infodesire.bsml.model.Comparator;
import com.infodesire.bsml.model.FieldPath;
import com.infodesire.bsml.model.ProgramLine;
import com.infodesire.bsml.model.Query;
import com.infodesire.bsml.model.QueryExpression;
import com.infodesire.bsml.model.Where;
import com.infodesire.bsml.parser.BSMLLexer;
import com.infodesire.bsml.parser.BSMLParser;
import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import static com.infodesire.bsml.parser.BSMLParser.*;

public class BsmlCompiler {


  public List<ProgramLine> compile( File file, Charset encoding ) throws IOException {

    Reader reader = new InputStreamReader( new FileInputStream( file ), encoding );
    CharStream input = CharStreams.fromReader( reader );
    return compile( input );

  }

  private List<ProgramLine> compile( CharStream input ) {

    ANTLRErrorListener listener = new ErrorListener();

    BSMLLexer lexer = new BSMLLexer( input );
    lexer.removeErrorListeners();
    lexer.addErrorListener( listener );

    BSMLParser parser = new BSMLParser( new CommonTokenStream( lexer ) );
    parser.removeErrorListeners();
    parser.addErrorListener( listener );

    ParseTree tree = parser.prog();
    return new BsmlCompiler().compile( tree, parser );

  }


  public List<ProgramLine> compile( String code ) {

    CharStream input = CharStreams.fromString( code );
    return compile( input );

  }


  class ErrorListener extends BaseErrorListener {

    public void syntaxError( Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine,
                             String msg, RecognitionException e ) {
      throw new BsmlException( recognizer, msg, offendingSymbol, line, charPositionInLine, e );
    }

  }


  public List<ProgramLine> compile( ParseTree node, Parser parser ) {

    List<ProgramLine> programLines = new ArrayList<>();

    if( node instanceof ProgContext  ) {
      for( ParseTree programLine :( (ProgContext) node ).children ) {
        for( ParseTree child : (( ProgramLineContext) programLine).children ) {
          if( child instanceof QueryContext ) {
            Query query = query( (QueryContext) child, parser );
            programLines.add( query );
          }
          else if( child instanceof ActionContext ) {
            Action action = action( (ActionContext) child, parser );
            programLines.add( action );
          }
          else {
            throw new BsmlVersionException( node, parser );
          }
        }
      }
    }

    return programLines;

  }

  private Query query( QueryContext queryContext, Parser parser ) {
    Query query = new Query();
    for( ParseTree queryChild : queryContext.children ) {
      if( queryChild instanceof TerminalNode ) {
        // ignore
      }
      else if( queryChild instanceof EmptyLineContext) {
        // ignore
      }
      else if( queryChild instanceof QueryPropertyLineContext ) {
        for( ParseTree propertyLineChild : ( (QueryPropertyLineContext) queryChild ).children ) {
          if( propertyLineChild instanceof EmptyLineContext ) {
            // ignore
          }
          else if( propertyLineChild instanceof QueryPropertyContext ) {
            queryProperty( query, (QueryPropertyContext) propertyLineChild, parser );
          }
          else {
            throw new BsmlVersionException( propertyLineChild, parser );
          }
        }
      }
      else if( queryChild instanceof WhereContext ) {
        query.where = where( (WhereContext) queryChild, parser );
      }
      else {
        throw new BsmlVersionException( queryChild, parser );
      }
    }
    return query;
  }

  private void queryProperty( Query query, QueryPropertyContext queryPropertyContext, Parser parser ) {
    String name = queryPropertyContext.children.get( 0 ).getText();
    String value = queryPropertyContext.children.get( 2 ).getText();
    if( name.equals( "name" ) ) {
      query.name = value.trim();
    }
    else if( name.equals( "type" ) ) {
      query.type = value.trim();
    }
    else if( name.equals( "language" ) ) {
      query.language = value.trim();
    }
    else {
      throw new BsmlException( "Invalid query property '" + name + "'" );
    }
  }

  private Where where( WhereContext whereContext, Parser parser ) {
    Where query = new Where();
    for( ParseTree queryChild : whereContext.children ) {
      if( queryChild instanceof TerminalNode ) {
        // ignore "where" "{" "}"
      }
      else if( queryChild instanceof QueryExpressionContext ) {
        QueryExpression expression = queryExpression( (QueryExpressionContext) queryChild, parser );
        if( expression != null ) { // null if empty line
          query.expressions.add( expression );
        }
      }
      else {
        throw new BsmlVersionException( queryChild, parser );
      }
    }
    return query;

  }

  private QueryExpression queryExpression( QueryExpressionContext queryExpressionContext, Parser parser ) {
    ParseTree firstChild = queryExpressionContext.children.get( 0 );
    if( firstChild instanceof BooleanExpressionContext ) {
      return booleanExpression( (BooleanExpressionContext) firstChild, parser );
    }
    else if( firstChild instanceof EmptyLineContext ) {
      return null;
    }
    else if( firstChild instanceof FieldPathContext ) {
      FieldPathContext fieldPathContext = (FieldPathContext) firstChild;
      ComparatorContext comparatorContext = (ComparatorContext) queryExpressionContext.children.get( 1 );
      ValueContext valueContext = (ValueContext) queryExpressionContext.children.get( 2 );
      try {
        FieldPath fieldPath = new FieldPath();
        for( ParseTree pathElement : fieldPathContext.children ) {
          if( pathElement instanceof FieldContext ) {
            fieldPath.names.add( pathElement.getText() );
          }
        }
        return new QueryExpression( fieldPath, Comparator.fromToken( comparatorContext.getText()),
          valueContext.getText().trim() );
      }
      catch( ClassNotFoundException ex ) {
        throw new BsmlVersionException( comparatorContext, parser, ex.getMessage() );
      }
    }
    else {
      throw new BsmlVersionException( queryExpressionContext, parser );
    }
  }

  private QueryExpression booleanExpression( BooleanExpressionContext booleanExpressionContext, Parser parser ) {
    QueryExpression expression = null;
    for( ParseTree child : booleanExpressionContext.children ) {
      if( child instanceof TerminalNode ) {} // ignore curlies
      else if( child instanceof BooleanOperatorContext ) {
        try {
          BooleanOperator operator = BooleanOperator.fromToken( child.getText() );
          expression = new QueryExpression( operator );
        }
        catch( ClassNotFoundException ex ) {
          throw new BsmlVersionException( child, parser, ex.getMessage() );
        }
      }
      else if( child instanceof QueryExpressionContext ) {
        QueryExpression subExpression = queryExpression( (QueryExpressionContext) child, parser );
        expression.add( subExpression );
      }
    }
    return expression;
  }

  private Action action( ActionContext query, Parser parser ) {
    return new Action();
  }

}

