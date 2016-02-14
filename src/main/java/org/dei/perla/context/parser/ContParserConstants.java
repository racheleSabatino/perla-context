/* Generated By:JavaCC: Do not edit this line. ContParserConstants.java */
package org.dei.perla.context.parser;


/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface ContParserConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int KEYWORD_CREATE = 8;
  /** RegularExpression Id. */
  int KEYWORD_CONTEXT = 9;
  /** RegularExpression Id. */
  int KEYWORD_DOT = 10;
  /** RegularExpression Id. */
  int KEYWORD_ACTIVE = 11;
  /** RegularExpression Id. */
  int KEYWORD_IF = 12;
  /** RegularExpression Id. */
  int KEYWORD_DROP = 13;
  /** RegularExpression Id. */
  int KEYWORD_ALTER = 14;
  /** RegularExpression Id. */
  int KEYWORD_IS = 15;
  /** RegularExpression Id. */
  int KEYWORD_BETWEEN = 16;
  /** RegularExpression Id. */
  int KEYWORD_LIKE = 17;
  /** RegularExpression Id. */
  int OPERATOR_MULTIPLY = 18;
  /** RegularExpression Id. */
  int OPERATOR_DIVIDE = 19;
  /** RegularExpression Id. */
  int OPERATOR_MODULO = 20;
  /** RegularExpression Id. */
  int OPERATOR_PLUS = 21;
  /** RegularExpression Id. */
  int OPERATOR_MINUS = 22;
  /** RegularExpression Id. */
  int OPERATOR_NOT = 23;
  /** RegularExpression Id. */
  int OPERATOR_XOR = 24;
  /** RegularExpression Id. */
  int OPERATOR_AND = 25;
  /** RegularExpression Id. */
  int OPERATOR_OR = 26;
  /** RegularExpression Id. */
  int OPERATOR_BITWISE_NOT = 27;
  /** RegularExpression Id. */
  int OPERATOR_BITWISE_LSH = 28;
  /** RegularExpression Id. */
  int OPERATOR_BITWISE_RSH = 29;
  /** RegularExpression Id. */
  int OPERATOR_BITWISE_XOR = 30;
  /** RegularExpression Id. */
  int OPERATOR_BITWISE_AND = 31;
  /** RegularExpression Id. */
  int OPERATOR_BITWISE_OR = 32;
  /** RegularExpression Id. */
  int OPERATOR_GREATER = 33;
  /** RegularExpression Id. */
  int OPERATOR_LESS = 34;
  /** RegularExpression Id. */
  int OPERATOR_GREATER_EQUAL = 35;
  /** RegularExpression Id. */
  int OPERATOR_LESS_EQUAL = 36;
  /** RegularExpression Id. */
  int OPERATOR_EQUAL = 37;
  /** RegularExpression Id. */
  int OPERATOR_NOT_EQUAL = 38;
  /** RegularExpression Id. */
  int TYPE_ID = 39;
  /** RegularExpression Id. */
  int TYPE_TIMESTAMP = 40;
  /** RegularExpression Id. */
  int TYPE_BOOLEAN = 41;
  /** RegularExpression Id. */
  int TYPE_INTEGER = 42;
  /** RegularExpression Id. */
  int TYPE_FLOAT = 43;
  /** RegularExpression Id. */
  int TYPE_STRING = 44;
  /** RegularExpression Id. */
  int TYPE_ANY = 45;
  /** RegularExpression Id. */
  int CONSTANT_NULL = 46;
  /** RegularExpression Id. */
  int CONSTANT_BOOLEAN_TRUE = 47;
  /** RegularExpression Id. */
  int CONSTANT_BOOLEAN_FALSE = 48;
  /** RegularExpression Id. */
  int CONSTANT_BOOLEAN_UNKNOWN = 49;
  /** RegularExpression Id. */
  int CONSTANT_INTEGER_10 = 50;
  /** RegularExpression Id. */
  int CONSTANT_INTEGER_16 = 51;
  /** RegularExpression Id. */
  int CONSTANT_FLOAT = 52;
  /** RegularExpression Id. */
  int CONSTANT_SINGLE_QUOTED_STRING_START = 53;
  /** RegularExpression Id. */
  int CONSTANT_DOUBLE_QUOTED_STRING_START = 54;
  /** RegularExpression Id. */
  int CONSTANT_SINGLE_QUOTED_STRING_VALUE = 55;
  /** RegularExpression Id. */
  int CONSTANT_DOUBLE_QUOTED_STRING_VALUE = 56;
  /** RegularExpression Id. */
  int CONSTANT_SINGLE_QUOTED_STRING_END = 57;
  /** RegularExpression Id. */
  int CONSTANT_DOUBLE_QUOTED_STRING_END = 58;
  /** RegularExpression Id. */
  int DIGIT = 59;
  /** RegularExpression Id. */
  int LITERAL = 60;
  /** RegularExpression Id. */
  int UNDERSCORE = 61;
  /** RegularExpression Id. */
  int HEXADECIMAL = 62;
  /** RegularExpression Id. */
  int IDENTIFIER = 63;

  /** Lexical state. */
  int DEFAULT = 0;
  /** Lexical state. */
  int COMMENT = 1;
  /** Lexical state. */
  int NON_SINGLE_QUOTED_STRING = 2;
  /** Lexical state. */
  int NON_DOUBLE_QUOTED_STRING = 3;
  /** Lexical state. */
  int NON_SINGLE_QUOTED_STRING_END = 4;
  /** Lexical state. */
  int NON_DOUBLE_QUOTED_STRING_END = 5;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\r\"",
    "\"\\t\"",
    "\"\\n\"",
    "\"/*\"",
    "<token of kind 6>",
    "\"*/\"",
    "\"CREATE\"",
    "\"CONTEXT\"",
    "\".\"",
    "\"ACTIVE\"",
    "\"IF\"",
    "\"DROP\"",
    "\"ALTER\"",
    "\"IS\"",
    "\"BETWEEN\"",
    "\"LIKE\"",
    "\"*\"",
    "\"/\"",
    "\"%\"",
    "\"+\"",
    "\"-\"",
    "\"NOT\"",
    "\"XOR\"",
    "\"AND\"",
    "\"OR\"",
    "\"~\"",
    "\"<<\"",
    "\">>\"",
    "\"^\"",
    "\"&\"",
    "\"|\"",
    "\">\"",
    "\"<\"",
    "\">=\"",
    "\"<=\"",
    "\"=\"",
    "<OPERATOR_NOT_EQUAL>",
    "\"ID\"",
    "\"TIMESTAMP\"",
    "\"BOOLEAN\"",
    "\"INTEGER\"",
    "\"FLOAT\"",
    "\"STRING\"",
    "\"ANY\"",
    "\"NULL\"",
    "\"TRUE\"",
    "\"FALSE\"",
    "\"UNKNOWN\"",
    "<CONSTANT_INTEGER_10>",
    "<CONSTANT_INTEGER_16>",
    "<CONSTANT_FLOAT>",
    "\"\\\'\"",
    "\"\\\"\"",
    "<CONSTANT_SINGLE_QUOTED_STRING_VALUE>",
    "<CONSTANT_DOUBLE_QUOTED_STRING_VALUE>",
    "\"\\\'\"",
    "\"\\\"\"",
    "<DIGIT>",
    "<LITERAL>",
    "\"_\"",
    "<HEXADECIMAL>",
    "<IDENTIFIER>",
    "\"(\"",
    "\")\"",
    "\":\"",
  };

}
