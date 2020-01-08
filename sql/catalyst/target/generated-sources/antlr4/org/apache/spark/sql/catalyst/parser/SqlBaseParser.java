// Generated from org/apache/spark/sql/catalyst/parser/SqlBase.g4 by ANTLR 4.7.1
package org.apache.spark.sql.catalyst.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SqlBaseParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, ADD=11, AFTER=12, ALL=13, ALTER=14, ANALYZE=15, AND=16, ANTI=17, 
		ANY=18, ARCHIVE=19, ARRAY=20, AS=21, ASC=22, AT=23, AUTHORIZATION=24, 
		BETWEEN=25, BOTH=26, BUCKET=27, BUCKETS=28, BY=29, CACHE=30, CASCADE=31, 
		CASE=32, CAST=33, CHANGE=34, CHECK=35, CLEAR=36, CLUSTER=37, CLUSTERED=38, 
		CODEGEN=39, COLLATE=40, COLLECTION=41, COLUMN=42, COLUMNS=43, COMMENT=44, 
		COMMIT=45, COMPACT=46, COMPACTIONS=47, COMPUTE=48, CONCATENATE=49, CONSTRAINT=50, 
		COST=51, CREATE=52, CROSS=53, CUBE=54, CURRENT=55, CURRENT_DATE=56, CURRENT_TIME=57, 
		CURRENT_TIMESTAMP=58, CURRENT_USER=59, DATA=60, DATABASE=61, DATABASES=62, 
		DAY=63, DAYS=64, DBPROPERTIES=65, DEFINED=66, DELETE=67, DELIMITED=68, 
		DESC=69, DESCRIBE=70, DFS=71, DIRECTORIES=72, DIRECTORY=73, DISTINCT=74, 
		DISTRIBUTE=75, DROP=76, ELSE=77, END=78, ESCAPE=79, ESCAPED=80, EXCEPT=81, 
		EXCHANGE=82, EXISTS=83, EXPLAIN=84, EXPORT=85, EXTENDED=86, EXTERNAL=87, 
		EXTRACT=88, FALSE=89, FETCH=90, FIELDS=91, FILEFORMAT=92, FIRST=93, FIRST_VALUE=94, 
		FOLLOWING=95, FOR=96, FOREIGN=97, FORMAT=98, FORMATTED=99, FROM=100, FULL=101, 
		FUNCTION=102, FUNCTIONS=103, GLOBAL=104, GRANT=105, GROUP=106, GROUPING=107, 
		HAVING=108, HOUR=109, HOURS=110, IF=111, IGNORE=112, IMPORT=113, IN=114, 
		INDEX=115, INDEXES=116, INNER=117, INPATH=118, INPUTFORMAT=119, INSERT=120, 
		INTERSECT=121, INTERVAL=122, INTO=123, IS=124, ITEMS=125, JOIN=126, KEYS=127, 
		LAST=128, LAST_VALUE=129, LATERAL=130, LAZY=131, LEADING=132, LEFT=133, 
		LIKE=134, LIMIT=135, LINES=136, LIST=137, LOAD=138, LOCAL=139, LOCATION=140, 
		LOCK=141, LOCKS=142, LOGICAL=143, MACRO=144, MAP=145, MATCHED=146, MERGE=147, 
		MICROSECOND=148, MICROSECONDS=149, MILLISECOND=150, MILLISECONDS=151, 
		MINUTE=152, MINUTES=153, MONTH=154, MONTHS=155, MSCK=156, NAMESPACE=157, 
		NAMESPACES=158, NATURAL=159, NO=160, NOT=161, NULL=162, NULLS=163, OF=164, 
		ON=165, ONLY=166, OPTION=167, OPTIONS=168, OR=169, ORDER=170, OUT=171, 
		OUTER=172, OUTPUTFORMAT=173, OVER=174, OVERLAPS=175, OVERLAY=176, OVERWRITE=177, 
		PARTITION=178, PARTITIONED=179, PARTITIONS=180, PERCENTLIT=181, PIVOT=182, 
		PLACING=183, POSITION=184, PRECEDING=185, PRIMARY=186, PRINCIPALS=187, 
		PROPERTIES=188, PURGE=189, QUERY=190, RANGE=191, RECORDREADER=192, RECORDWRITER=193, 
		RECOVER=194, REDUCE=195, REFERENCES=196, REFRESH=197, RENAME=198, REPAIR=199, 
		REPLACE=200, RESET=201, RESPECT=202, RESTRICT=203, REVOKE=204, RIGHT=205, 
		RLIKE=206, ROLE=207, ROLES=208, ROLLBACK=209, ROLLUP=210, ROW=211, ROWS=212, 
		SCHEMA=213, SECOND=214, SECONDS=215, SELECT=216, SEMI=217, SEPARATED=218, 
		SERDE=219, SERDEPROPERTIES=220, SESSION_USER=221, SET=222, SETMINUS=223, 
		SETS=224, SHOW=225, SKEWED=226, SOME=227, SORT=228, SORTED=229, START=230, 
		STATISTICS=231, STORED=232, STRATIFY=233, STRUCT=234, SUBSTR=235, SUBSTRING=236, 
		TABLE=237, TABLES=238, TABLESAMPLE=239, TBLPROPERTIES=240, TEMPORARY=241, 
		TERMINATED=242, THEN=243, TO=244, TOUCH=245, TRAILING=246, TRANSACTION=247, 
		TRANSACTIONS=248, TRANSFORM=249, TRIM=250, TRUE=251, TRUNCATE=252, TYPE=253, 
		UNARCHIVE=254, UNBOUNDED=255, UNCACHE=256, UNION=257, UNIQUE=258, UNKNOWN=259, 
		UNLOCK=260, UNSET=261, UPDATE=262, USE=263, USER=264, USING=265, VALUES=266, 
		VIEW=267, WEEK=268, WEEKS=269, WHEN=270, WHERE=271, WINDOW=272, WITH=273, 
		YEAR=274, YEARS=275, KNN=276, POINT=277, KNNPRED=278, EQ=279, NSEQ=280, 
		NEQ=281, NEQJ=282, LT=283, LTE=284, GT=285, GTE=286, PLUS=287, MINUS=288, 
		ASTERISK=289, SLASH=290, PERCENT=291, DIV=292, TILDE=293, AMPERSAND=294, 
		PIPE=295, CONCAT_PIPE=296, HAT=297, STRING=298, BIGINT_LITERAL=299, SMALLINT_LITERAL=300, 
		TINYINT_LITERAL=301, INTEGER_VALUE=302, EXPONENT_VALUE=303, DECIMAL_VALUE=304, 
		DOUBLE_LITERAL=305, BIGDECIMAL_LITERAL=306, IDENTIFIER=307, BACKQUOTED_IDENTIFIER=308, 
		SIMPLE_COMMENT=309, BRACKETED_EMPTY_COMMENT=310, BRACKETED_COMMENT=311, 
		WS=312, UNRECOGNIZED=313;
	public static final int
		RULE_singleStatement = 0, RULE_singleExpression = 1, RULE_singleTableIdentifier = 2, 
		RULE_singleMultipartIdentifier = 3, RULE_singleFunctionIdentifier = 4, 
		RULE_singleDataType = 5, RULE_singleTableSchema = 6, RULE_statement = 7, 
		RULE_unsupportedHiveNativeCommands = 8, RULE_createTableHeader = 9, RULE_replaceTableHeader = 10, 
		RULE_bucketSpec = 11, RULE_skewSpec = 12, RULE_locationSpec = 13, RULE_query = 14, 
		RULE_insertInto = 15, RULE_partitionSpecLocation = 16, RULE_partitionSpec = 17, 
		RULE_partitionVal = 18, RULE_database = 19, RULE_describeFuncName = 20, 
		RULE_describeColName = 21, RULE_ctes = 22, RULE_namedQuery = 23, RULE_tableProvider = 24, 
		RULE_createTableClauses = 25, RULE_tablePropertyList = 26, RULE_tableProperty = 27, 
		RULE_tablePropertyKey = 28, RULE_tablePropertyValue = 29, RULE_constantList = 30, 
		RULE_nestedConstantList = 31, RULE_createFileFormat = 32, RULE_fileFormat = 33, 
		RULE_storageHandler = 34, RULE_resource = 35, RULE_dmlStatementNoWith = 36, 
		RULE_queryOrganization = 37, RULE_multiInsertQueryBody = 38, RULE_queryTerm = 39, 
		RULE_queryPrimary = 40, RULE_sortItem = 41, RULE_fromStatement = 42, RULE_fromStatementBody = 43, 
		RULE_querySpecification = 44, RULE_transformClause = 45, RULE_selectClause = 46, 
		RULE_setClause = 47, RULE_matchedClause = 48, RULE_notMatchedClause = 49, 
		RULE_matchedAction = 50, RULE_notMatchedAction = 51, RULE_assignmentList = 52, 
		RULE_assignment = 53, RULE_whereClause = 54, RULE_havingClause = 55, RULE_hint = 56, 
		RULE_hintStatement = 57, RULE_fromClause = 58, RULE_aggregationClause = 59, 
		RULE_groupingSet = 60, RULE_pivotClause = 61, RULE_pivotColumn = 62, RULE_pivotValue = 63, 
		RULE_lateralView = 64, RULE_setQuantifier = 65, RULE_relation = 66, RULE_joinRelation = 67, 
		RULE_joinType = 68, RULE_joinCriteria = 69, RULE_sample = 70, RULE_sampleMethod = 71, 
		RULE_identifierList = 72, RULE_identifierSeq = 73, RULE_orderedIdentifierList = 74, 
		RULE_orderedIdentifier = 75, RULE_identifierCommentList = 76, RULE_identifierComment = 77, 
		RULE_relationPrimary = 78, RULE_inlineTable = 79, RULE_functionTable = 80, 
		RULE_tableAlias = 81, RULE_rowFormat = 82, RULE_multipartIdentifierList = 83, 
		RULE_multipartIdentifier = 84, RULE_tableIdentifier = 85, RULE_functionIdentifier = 86, 
		RULE_namedExpression = 87, RULE_namedExpressionSeq = 88, RULE_transformList = 89, 
		RULE_transform = 90, RULE_transformArgument = 91, RULE_expression = 92, 
		RULE_booleanExpression = 93, RULE_predicate = 94, RULE_myexpressionlist1 = 95, 
		RULE_myexpressionlist2 = 96, RULE_spatialpredicated = 97, RULE_valueExpression = 98, 
		RULE_primaryExpression = 99, RULE_constant = 100, RULE_comparisonOperator = 101, 
		RULE_arithmeticOperator = 102, RULE_predicateOperator = 103, RULE_booleanValue = 104, 
		RULE_interval = 105, RULE_errorCapturingMultiUnitsInterval = 106, RULE_multiUnitsInterval = 107, 
		RULE_errorCapturingUnitToUnitInterval = 108, RULE_unitToUnitInterval = 109, 
		RULE_intervalValue = 110, RULE_intervalUnit = 111, RULE_colPosition = 112, 
		RULE_dataType = 113, RULE_qualifiedColTypeWithPositionList = 114, RULE_qualifiedColTypeWithPosition = 115, 
		RULE_colTypeList = 116, RULE_colType = 117, RULE_complexColTypeList = 118, 
		RULE_complexColType = 119, RULE_whenClause = 120, RULE_windowClause = 121, 
		RULE_namedWindow = 122, RULE_windowSpec = 123, RULE_windowFrame = 124, 
		RULE_frameBound = 125, RULE_qualifiedNameList = 126, RULE_functionName = 127, 
		RULE_qualifiedName = 128, RULE_errorCapturingIdentifier = 129, RULE_errorCapturingIdentifierExtra = 130, 
		RULE_identifier = 131, RULE_strictIdentifier = 132, RULE_quotedIdentifier = 133, 
		RULE_number = 134, RULE_ansiNonReserved = 135, RULE_strictNonReserved = 136, 
		RULE_nonReserved = 137;
	public static final String[] ruleNames = {
		"singleStatement", "singleExpression", "singleTableIdentifier", "singleMultipartIdentifier", 
		"singleFunctionIdentifier", "singleDataType", "singleTableSchema", "statement", 
		"unsupportedHiveNativeCommands", "createTableHeader", "replaceTableHeader", 
		"bucketSpec", "skewSpec", "locationSpec", "query", "insertInto", "partitionSpecLocation", 
		"partitionSpec", "partitionVal", "database", "describeFuncName", "describeColName", 
		"ctes", "namedQuery", "tableProvider", "createTableClauses", "tablePropertyList", 
		"tableProperty", "tablePropertyKey", "tablePropertyValue", "constantList", 
		"nestedConstantList", "createFileFormat", "fileFormat", "storageHandler", 
		"resource", "dmlStatementNoWith", "queryOrganization", "multiInsertQueryBody", 
		"queryTerm", "queryPrimary", "sortItem", "fromStatement", "fromStatementBody", 
		"querySpecification", "transformClause", "selectClause", "setClause", 
		"matchedClause", "notMatchedClause", "matchedAction", "notMatchedAction", 
		"assignmentList", "assignment", "whereClause", "havingClause", "hint", 
		"hintStatement", "fromClause", "aggregationClause", "groupingSet", "pivotClause", 
		"pivotColumn", "pivotValue", "lateralView", "setQuantifier", "relation", 
		"joinRelation", "joinType", "joinCriteria", "sample", "sampleMethod", 
		"identifierList", "identifierSeq", "orderedIdentifierList", "orderedIdentifier", 
		"identifierCommentList", "identifierComment", "relationPrimary", "inlineTable", 
		"functionTable", "tableAlias", "rowFormat", "multipartIdentifierList", 
		"multipartIdentifier", "tableIdentifier", "functionIdentifier", "namedExpression", 
		"namedExpressionSeq", "transformList", "transform", "transformArgument", 
		"expression", "booleanExpression", "predicate", "myexpressionlist1", "myexpressionlist2", 
		"spatialpredicated", "valueExpression", "primaryExpression", "constant", 
		"comparisonOperator", "arithmeticOperator", "predicateOperator", "booleanValue", 
		"interval", "errorCapturingMultiUnitsInterval", "multiUnitsInterval", 
		"errorCapturingUnitToUnitInterval", "unitToUnitInterval", "intervalValue", 
		"intervalUnit", "colPosition", "dataType", "qualifiedColTypeWithPositionList", 
		"qualifiedColTypeWithPosition", "colTypeList", "colType", "complexColTypeList", 
		"complexColType", "whenClause", "windowClause", "namedWindow", "windowSpec", 
		"windowFrame", "frameBound", "qualifiedNameList", "functionName", "qualifiedName", 
		"errorCapturingIdentifier", "errorCapturingIdentifierExtra", "identifier", 
		"strictIdentifier", "quotedIdentifier", "number", "ansiNonReserved", "strictNonReserved", 
		"nonReserved"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "','", "'.'", "'/*+'", "'*/'", "'->'", "'['", "']'", 
		"':'", "'ADD'", "'AFTER'", "'ALL'", "'ALTER'", "'ANALYZE'", "'AND'", "'ANTI'", 
		"'ANY'", "'ARCHIVE'", "'ARRAY'", "'AS'", "'ASC'", "'AT'", "'AUTHORIZATION'", 
		"'BETWEEN'", "'BOTH'", "'BUCKET'", "'BUCKETS'", "'BY'", "'CACHE'", "'CASCADE'", 
		"'CASE'", "'CAST'", "'CHANGE'", "'CHECK'", "'CLEAR'", "'CLUSTER'", "'CLUSTERED'", 
		"'CODEGEN'", "'COLLATE'", "'COLLECTION'", "'COLUMN'", "'COLUMNS'", "'COMMENT'", 
		"'COMMIT'", "'COMPACT'", "'COMPACTIONS'", "'COMPUTE'", "'CONCATENATE'", 
		"'CONSTRAINT'", "'COST'", "'CREATE'", "'CROSS'", "'CUBE'", "'CURRENT'", 
		"'CURRENT_DATE'", "'CURRENT_TIME'", "'CURRENT_TIMESTAMP'", "'CURRENT_USER'", 
		"'DATA'", "'DATABASE'", null, "'DAY'", "'DAYS'", "'DBPROPERTIES'", "'DEFINED'", 
		"'DELETE'", "'DELIMITED'", "'DESC'", "'DESCRIBE'", "'DFS'", "'DIRECTORIES'", 
		"'DIRECTORY'", "'DISTINCT'", "'DISTRIBUTE'", "'DROP'", "'ELSE'", "'END'", 
		"'ESCAPE'", "'ESCAPED'", "'EXCEPT'", "'EXCHANGE'", "'EXISTS'", "'EXPLAIN'", 
		"'EXPORT'", "'EXTENDED'", "'EXTERNAL'", "'EXTRACT'", "'FALSE'", "'FETCH'", 
		"'FIELDS'", "'FILEFORMAT'", "'FIRST'", "'FIRST_VALUE'", "'FOLLOWING'", 
		"'FOR'", "'FOREIGN'", "'FORMAT'", "'FORMATTED'", "'FROM'", "'FULL'", "'FUNCTION'", 
		"'FUNCTIONS'", "'GLOBAL'", "'GRANT'", "'GROUP'", "'GROUPING'", "'HAVING'", 
		"'HOUR'", "'HOURS'", "'IF'", "'IGNORE'", "'IMPORT'", "'IN'", "'INDEX'", 
		"'INDEXES'", "'INNER'", "'INPATH'", "'INPUTFORMAT'", "'INSERT'", "'INTERSECT'", 
		"'INTERVAL'", "'INTO'", "'IS'", "'ITEMS'", "'JOIN'", "'KEYS'", "'LAST'", 
		"'LAST_VALUE'", "'LATERAL'", "'LAZY'", "'LEADING'", "'LEFT'", "'LIKE'", 
		"'LIMIT'", "'LINES'", "'LIST'", "'LOAD'", "'LOCAL'", "'LOCATION'", "'LOCK'", 
		"'LOCKS'", "'LOGICAL'", "'MACRO'", "'MAP'", "'MATCHED'", "'MERGE'", "'MICROSECOND'", 
		"'MICROSECONDS'", "'MILLISECOND'", "'MILLISECONDS'", "'MINUTE'", "'MINUTES'", 
		"'MONTH'", "'MONTHS'", "'MSCK'", "'NAMESPACE'", "'NAMESPACES'", "'NATURAL'", 
		"'NO'", null, "'NULL'", "'NULLS'", "'OF'", "'ON'", "'ONLY'", "'OPTION'", 
		"'OPTIONS'", "'OR'", "'ORDER'", "'OUT'", "'OUTER'", "'OUTPUTFORMAT'", 
		"'OVER'", "'OVERLAPS'", "'OVERLAY'", "'OVERWRITE'", "'PARTITION'", "'PARTITIONED'", 
		"'PARTITIONS'", "'PERCENT'", "'PIVOT'", "'PLACING'", "'POSITION'", "'PRECEDING'", 
		"'PRIMARY'", "'PRINCIPALS'", "'PROPERTIES'", "'PURGE'", "'QUERY'", "'RANGE'", 
		"'RECORDREADER'", "'RECORDWRITER'", "'RECOVER'", "'REDUCE'", "'REFERENCES'", 
		"'REFRESH'", "'RENAME'", "'REPAIR'", "'REPLACE'", "'RESET'", "'RESPECT'", 
		"'RESTRICT'", "'REVOKE'", "'RIGHT'", null, "'ROLE'", "'ROLES'", "'ROLLBACK'", 
		"'ROLLUP'", "'ROW'", "'ROWS'", "'SCHEMA'", "'SECOND'", "'SECONDS'", "'SELECT'", 
		"'SEMI'", "'SEPARATED'", "'SERDE'", "'SERDEPROPERTIES'", "'SESSION_USER'", 
		"'SET'", "'MINUS'", "'SETS'", "'SHOW'", "'SKEWED'", "'SOME'", "'SORT'", 
		"'SORTED'", "'START'", "'STATISTICS'", "'STORED'", "'STRATIFY'", "'STRUCT'", 
		"'SUBSTR'", "'SUBSTRING'", "'TABLE'", "'TABLES'", "'TABLESAMPLE'", "'TBLPROPERTIES'", 
		null, "'TERMINATED'", "'THEN'", "'TO'", "'TOUCH'", "'TRAILING'", "'TRANSACTION'", 
		"'TRANSACTIONS'", "'TRANSFORM'", "'TRIM'", "'TRUE'", "'TRUNCATE'", "'TYPE'", 
		"'UNARCHIVE'", "'UNBOUNDED'", "'UNCACHE'", "'UNION'", "'UNIQUE'", "'UNKNOWN'", 
		"'UNLOCK'", "'UNSET'", "'UPDATE'", "'USE'", "'USER'", "'USING'", "'VALUES'", 
		"'VIEW'", "'WEEK'", "'WEEKS'", "'WHEN'", "'WHERE'", "'WINDOW'", "'WITH'", 
		"'YEAR'", "'YEARS'", "'KNN'", "'POINT'", "'KNNPRED'", null, "'<=>'", "'<>'", 
		"'!='", "'<'", null, "'>'", null, "'+'", "'-'", "'*'", "'/'", "'%'", "'DIV'", 
		"'~'", "'&'", "'|'", "'||'", "'^'", null, null, null, null, null, null, 
		null, null, null, null, null, null, "'/**/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "ADD", 
		"AFTER", "ALL", "ALTER", "ANALYZE", "AND", "ANTI", "ANY", "ARCHIVE", "ARRAY", 
		"AS", "ASC", "AT", "AUTHORIZATION", "BETWEEN", "BOTH", "BUCKET", "BUCKETS", 
		"BY", "CACHE", "CASCADE", "CASE", "CAST", "CHANGE", "CHECK", "CLEAR", 
		"CLUSTER", "CLUSTERED", "CODEGEN", "COLLATE", "COLLECTION", "COLUMN", 
		"COLUMNS", "COMMENT", "COMMIT", "COMPACT", "COMPACTIONS", "COMPUTE", "CONCATENATE", 
		"CONSTRAINT", "COST", "CREATE", "CROSS", "CUBE", "CURRENT", "CURRENT_DATE", 
		"CURRENT_TIME", "CURRENT_TIMESTAMP", "CURRENT_USER", "DATA", "DATABASE", 
		"DATABASES", "DAY", "DAYS", "DBPROPERTIES", "DEFINED", "DELETE", "DELIMITED", 
		"DESC", "DESCRIBE", "DFS", "DIRECTORIES", "DIRECTORY", "DISTINCT", "DISTRIBUTE", 
		"DROP", "ELSE", "END", "ESCAPE", "ESCAPED", "EXCEPT", "EXCHANGE", "EXISTS", 
		"EXPLAIN", "EXPORT", "EXTENDED", "EXTERNAL", "EXTRACT", "FALSE", "FETCH", 
		"FIELDS", "FILEFORMAT", "FIRST", "FIRST_VALUE", "FOLLOWING", "FOR", "FOREIGN", 
		"FORMAT", "FORMATTED", "FROM", "FULL", "FUNCTION", "FUNCTIONS", "GLOBAL", 
		"GRANT", "GROUP", "GROUPING", "HAVING", "HOUR", "HOURS", "IF", "IGNORE", 
		"IMPORT", "IN", "INDEX", "INDEXES", "INNER", "INPATH", "INPUTFORMAT", 
		"INSERT", "INTERSECT", "INTERVAL", "INTO", "IS", "ITEMS", "JOIN", "KEYS", 
		"LAST", "LAST_VALUE", "LATERAL", "LAZY", "LEADING", "LEFT", "LIKE", "LIMIT", 
		"LINES", "LIST", "LOAD", "LOCAL", "LOCATION", "LOCK", "LOCKS", "LOGICAL", 
		"MACRO", "MAP", "MATCHED", "MERGE", "MICROSECOND", "MICROSECONDS", "MILLISECOND", 
		"MILLISECONDS", "MINUTE", "MINUTES", "MONTH", "MONTHS", "MSCK", "NAMESPACE", 
		"NAMESPACES", "NATURAL", "NO", "NOT", "NULL", "NULLS", "OF", "ON", "ONLY", 
		"OPTION", "OPTIONS", "OR", "ORDER", "OUT", "OUTER", "OUTPUTFORMAT", "OVER", 
		"OVERLAPS", "OVERLAY", "OVERWRITE", "PARTITION", "PARTITIONED", "PARTITIONS", 
		"PERCENTLIT", "PIVOT", "PLACING", "POSITION", "PRECEDING", "PRIMARY", 
		"PRINCIPALS", "PROPERTIES", "PURGE", "QUERY", "RANGE", "RECORDREADER", 
		"RECORDWRITER", "RECOVER", "REDUCE", "REFERENCES", "REFRESH", "RENAME", 
		"REPAIR", "REPLACE", "RESET", "RESPECT", "RESTRICT", "REVOKE", "RIGHT", 
		"RLIKE", "ROLE", "ROLES", "ROLLBACK", "ROLLUP", "ROW", "ROWS", "SCHEMA", 
		"SECOND", "SECONDS", "SELECT", "SEMI", "SEPARATED", "SERDE", "SERDEPROPERTIES", 
		"SESSION_USER", "SET", "SETMINUS", "SETS", "SHOW", "SKEWED", "SOME", "SORT", 
		"SORTED", "START", "STATISTICS", "STORED", "STRATIFY", "STRUCT", "SUBSTR", 
		"SUBSTRING", "TABLE", "TABLES", "TABLESAMPLE", "TBLPROPERTIES", "TEMPORARY", 
		"TERMINATED", "THEN", "TO", "TOUCH", "TRAILING", "TRANSACTION", "TRANSACTIONS", 
		"TRANSFORM", "TRIM", "TRUE", "TRUNCATE", "TYPE", "UNARCHIVE", "UNBOUNDED", 
		"UNCACHE", "UNION", "UNIQUE", "UNKNOWN", "UNLOCK", "UNSET", "UPDATE", 
		"USE", "USER", "USING", "VALUES", "VIEW", "WEEK", "WEEKS", "WHEN", "WHERE", 
		"WINDOW", "WITH", "YEAR", "YEARS", "KNN", "POINT", "KNNPRED", "EQ", "NSEQ", 
		"NEQ", "NEQJ", "LT", "LTE", "GT", "GTE", "PLUS", "MINUS", "ASTERISK", 
		"SLASH", "PERCENT", "DIV", "TILDE", "AMPERSAND", "PIPE", "CONCAT_PIPE", 
		"HAT", "STRING", "BIGINT_LITERAL", "SMALLINT_LITERAL", "TINYINT_LITERAL", 
		"INTEGER_VALUE", "EXPONENT_VALUE", "DECIMAL_VALUE", "DOUBLE_LITERAL", 
		"BIGDECIMAL_LITERAL", "IDENTIFIER", "BACKQUOTED_IDENTIFIER", "SIMPLE_COMMENT", 
		"BRACKETED_EMPTY_COMMENT", "BRACKETED_COMMENT", "WS", "UNRECOGNIZED"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SqlBase.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	  /**
	   * When false, INTERSECT is given the greater precedence over the other set
	   * operations (UNION, EXCEPT and MINUS) as per the SQL standard.
	   */
	  public boolean legacy_setops_precedence_enbled = false;

	  /**
	   * When false, a literal with an exponent would be converted into
	   * double type rather than decimal type.
	   */
	  public boolean legacy_exponent_literal_as_decimal_enabled = false;

	  /**
	   * When false, CREATE TABLE syntax without a provider will use
	   * the value of spark.sql.sources.default as its provider.
	   */
	  public boolean legacy_create_hive_table_by_default_enabled = false;

	  /**
	   * Verify whether current token is a valid decimal token (which contains dot).
	   * Returns true if the character that follows the token is not a digit or letter or underscore.
	   *
	   * For example:
	   * For char stream "2.3", "2." is not a valid decimal token, because it is followed by digit '3'.
	   * For char stream "2.3_", "2.3" is not a valid decimal token, because it is followed by '_'.
	   * For char stream "2.3W", "2.3" is not a valid decimal token, because it is followed by 'W'.
	   * For char stream "12.0D 34.E2+0.12 "  12.0D is a valid decimal token because it is followed
	   * by a space. 34.E2 is a valid decimal token because it is followed by symbol '+'
	   * which is not a digit or letter or underscore.
	   */
	  public boolean isValidDecimal() {
	    int nextChar = _input.LA(1);
	    if (nextChar >= 'A' && nextChar <= 'Z' || nextChar >= '0' && nextChar <= '9' ||
	      nextChar == '_') {
	      return false;
	    } else {
	      return true;
	    }
	  }

	  /**
	   * When true, the behavior of keywords follows ANSI SQL standard.
	   */
	  public boolean SQL_standard_keyword_behavior = false;

	public SqlBaseParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SingleStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleStatementContext singleStatement() throws RecognitionException {
		SingleStatementContext _localctx = new SingleStatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_singleStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			statement();
			setState(277);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleExpressionContext extends ParserRuleContext {
		public NamedExpressionContext namedExpression() {
			return getRuleContext(NamedExpressionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleExpressionContext singleExpression() throws RecognitionException {
		SingleExpressionContext _localctx = new SingleExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_singleExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			namedExpression();
			setState(280);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleTableIdentifierContext extends ParserRuleContext {
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleTableIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleTableIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleTableIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleTableIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleTableIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleTableIdentifierContext singleTableIdentifier() throws RecognitionException {
		SingleTableIdentifierContext _localctx = new SingleTableIdentifierContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_singleTableIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			tableIdentifier();
			setState(283);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleMultipartIdentifierContext extends ParserRuleContext {
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleMultipartIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleMultipartIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleMultipartIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleMultipartIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleMultipartIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleMultipartIdentifierContext singleMultipartIdentifier() throws RecognitionException {
		SingleMultipartIdentifierContext _localctx = new SingleMultipartIdentifierContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_singleMultipartIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			multipartIdentifier();
			setState(286);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleFunctionIdentifierContext extends ParserRuleContext {
		public FunctionIdentifierContext functionIdentifier() {
			return getRuleContext(FunctionIdentifierContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleFunctionIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleFunctionIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleFunctionIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleFunctionIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleFunctionIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleFunctionIdentifierContext singleFunctionIdentifier() throws RecognitionException {
		SingleFunctionIdentifierContext _localctx = new SingleFunctionIdentifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_singleFunctionIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			functionIdentifier();
			setState(289);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleDataTypeContext extends ParserRuleContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleDataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleDataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleDataTypeContext singleDataType() throws RecognitionException {
		SingleDataTypeContext _localctx = new SingleDataTypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_singleDataType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			dataType();
			setState(292);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleTableSchemaContext extends ParserRuleContext {
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleTableSchemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleTableSchema; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleTableSchema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleTableSchema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleTableSchema(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleTableSchemaContext singleTableSchema() throws RecognitionException {
		SingleTableSchemaContext _localctx = new SingleTableSchemaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_singleTableSchema);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			colTypeList();
			setState(295);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExplainContext extends StatementContext {
		public TerminalNode EXPLAIN() { return getToken(SqlBaseParser.EXPLAIN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode LOGICAL() { return getToken(SqlBaseParser.LOGICAL, 0); }
		public TerminalNode FORMATTED() { return getToken(SqlBaseParser.FORMATTED, 0); }
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public TerminalNode CODEGEN() { return getToken(SqlBaseParser.CODEGEN, 0); }
		public TerminalNode COST() { return getToken(SqlBaseParser.COST, 0); }
		public ExplainContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExplain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExplain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExplain(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ResetConfigurationContext extends StatementContext {
		public TerminalNode RESET() { return getToken(SqlBaseParser.RESET, 0); }
		public ResetConfigurationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterResetConfiguration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitResetConfiguration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitResetConfiguration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterViewQueryContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public AlterViewQueryContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAlterViewQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAlterViewQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAlterViewQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UseContext extends StatementContext {
		public TerminalNode USE() { return getToken(SqlBaseParser.USE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode NAMESPACE() { return getToken(SqlBaseParser.NAMESPACE, 0); }
		public UseContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropNamespaceContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public DatabaseContext database() {
			return getRuleContext(DatabaseContext.class,0);
		}
		public TerminalNode NAMESPACE() { return getToken(SqlBaseParser.NAMESPACE, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode RESTRICT() { return getToken(SqlBaseParser.RESTRICT, 0); }
		public TerminalNode CASCADE() { return getToken(SqlBaseParser.CASCADE, 0); }
		public DropNamespaceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropNamespace(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateTempViewUsingContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TableProviderContext tableProvider() {
			return getRuleContext(TableProviderContext.class,0);
		}
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode GLOBAL() { return getToken(SqlBaseParser.GLOBAL, 0); }
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TerminalNode OPTIONS() { return getToken(SqlBaseParser.OPTIONS, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public CreateTempViewUsingContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateTempViewUsing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateTempViewUsing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateTempViewUsing(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RenameTableContext extends StatementContext {
		public MultipartIdentifierContext from;
		public MultipartIdentifierContext to;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public List<MultipartIdentifierContext> multipartIdentifier() {
			return getRuleContexts(MultipartIdentifierContext.class);
		}
		public MultipartIdentifierContext multipartIdentifier(int i) {
			return getRuleContext(MultipartIdentifierContext.class,i);
		}
		public RenameTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRenameTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRenameTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRenameTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FailNativeCommandContext extends StatementContext {
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode ROLE() { return getToken(SqlBaseParser.ROLE, 0); }
		public UnsupportedHiveNativeCommandsContext unsupportedHiveNativeCommands() {
			return getRuleContext(UnsupportedHiveNativeCommandsContext.class,0);
		}
		public FailNativeCommandContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFailNativeCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFailNativeCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFailNativeCommand(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ClearCacheContext extends StatementContext {
		public TerminalNode CLEAR() { return getToken(SqlBaseParser.CLEAR, 0); }
		public TerminalNode CACHE() { return getToken(SqlBaseParser.CACHE, 0); }
		public ClearCacheContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterClearCache(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitClearCache(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitClearCache(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropViewContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public DropViewContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropView(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowTablesContext extends StatementContext {
		public Token pattern;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode TABLES() { return getToken(SqlBaseParser.TABLES, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public ShowTablesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowTables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowTables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowTables(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RecoverPartitionsContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode RECOVER() { return getToken(SqlBaseParser.RECOVER, 0); }
		public TerminalNode PARTITIONS() { return getToken(SqlBaseParser.PARTITIONS, 0); }
		public RecoverPartitionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRecoverPartitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRecoverPartitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRecoverPartitions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowCurrentNamespaceContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode CURRENT() { return getToken(SqlBaseParser.CURRENT, 0); }
		public TerminalNode NAMESPACE() { return getToken(SqlBaseParser.NAMESPACE, 0); }
		public ShowCurrentNamespaceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowCurrentNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowCurrentNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowCurrentNamespace(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RenameTablePartitionContext extends StatementContext {
		public PartitionSpecContext from;
		public PartitionSpecContext to;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public List<PartitionSpecContext> partitionSpec() {
			return getRuleContexts(PartitionSpecContext.class);
		}
		public PartitionSpecContext partitionSpec(int i) {
			return getRuleContext(PartitionSpecContext.class,i);
		}
		public RenameTablePartitionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRenameTablePartition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRenameTablePartition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRenameTablePartition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RepairTableContext extends StatementContext {
		public TerminalNode MSCK() { return getToken(SqlBaseParser.MSCK, 0); }
		public TerminalNode REPAIR() { return getToken(SqlBaseParser.REPAIR, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public RepairTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRepairTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRepairTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRepairTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RefreshResourceContext extends StatementContext {
		public TerminalNode REFRESH() { return getToken(SqlBaseParser.REFRESH, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public RefreshResourceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRefreshResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRefreshResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRefreshResource(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowCreateTableContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public ShowCreateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowCreateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowCreateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowCreateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowNamespacesContext extends StatementContext {
		public Token pattern;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode DATABASES() { return getToken(SqlBaseParser.DATABASES, 0); }
		public TerminalNode NAMESPACES() { return getToken(SqlBaseParser.NAMESPACES, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public ShowNamespacesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowNamespaces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowNamespaces(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowNamespaces(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowColumnsContext extends StatementContext {
		public MultipartIdentifierContext table;
		public MultipartIdentifierContext namespace;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public List<TerminalNode> FROM() { return getTokens(SqlBaseParser.FROM); }
		public TerminalNode FROM(int i) {
			return getToken(SqlBaseParser.FROM, i);
		}
		public List<TerminalNode> IN() { return getTokens(SqlBaseParser.IN); }
		public TerminalNode IN(int i) {
			return getToken(SqlBaseParser.IN, i);
		}
		public List<MultipartIdentifierContext> multipartIdentifier() {
			return getRuleContexts(MultipartIdentifierContext.class);
		}
		public MultipartIdentifierContext multipartIdentifier(int i) {
			return getRuleContext(MultipartIdentifierContext.class,i);
		}
		public ShowColumnsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowColumns(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReplaceTableContext extends StatementContext {
		public ReplaceTableHeaderContext replaceTableHeader() {
			return getRuleContext(ReplaceTableHeaderContext.class,0);
		}
		public TableProviderContext tableProvider() {
			return getRuleContext(TableProviderContext.class,0);
		}
		public CreateTableClausesContext createTableClauses() {
			return getRuleContext(CreateTableClausesContext.class,0);
		}
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public ReplaceTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterReplaceTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitReplaceTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitReplaceTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddTablePartitionContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public List<PartitionSpecLocationContext> partitionSpecLocation() {
			return getRuleContexts(PartitionSpecLocationContext.class);
		}
		public PartitionSpecLocationContext partitionSpecLocation(int i) {
			return getRuleContext(PartitionSpecLocationContext.class,i);
		}
		public AddTablePartitionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAddTablePartition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAddTablePartition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAddTablePartition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetNamespaceLocationContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public DatabaseContext database() {
			return getRuleContext(DatabaseContext.class,0);
		}
		public TerminalNode NAMESPACE() { return getToken(SqlBaseParser.NAMESPACE, 0); }
		public SetNamespaceLocationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetNamespaceLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetNamespaceLocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetNamespaceLocation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RefreshTableContext extends StatementContext {
		public TerminalNode REFRESH() { return getToken(SqlBaseParser.REFRESH, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public RefreshTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRefreshTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRefreshTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRefreshTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetNamespacePropertiesContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode DBPROPERTIES() { return getToken(SqlBaseParser.DBPROPERTIES, 0); }
		public TerminalNode PROPERTIES() { return getToken(SqlBaseParser.PROPERTIES, 0); }
		public DatabaseContext database() {
			return getRuleContext(DatabaseContext.class,0);
		}
		public TerminalNode NAMESPACE() { return getToken(SqlBaseParser.NAMESPACE, 0); }
		public SetNamespacePropertiesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetNamespaceProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetNamespaceProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetNamespaceProperties(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ManageResourceContext extends StatementContext {
		public Token op;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode LIST() { return getToken(SqlBaseParser.LIST, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public ManageResourceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterManageResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitManageResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitManageResource(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AnalyzeContext extends StatementContext {
		public TerminalNode ANALYZE() { return getToken(SqlBaseParser.ANALYZE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode COMPUTE() { return getToken(SqlBaseParser.COMPUTE, 0); }
		public TerminalNode STATISTICS() { return getToken(SqlBaseParser.STATISTICS, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public AnalyzeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAnalyze(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAnalyze(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAnalyze(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateHiveTableContext extends StatementContext {
		public ColTypeListContext columns;
		public Token comment;
		public ColTypeListContext partitionColumns;
		public IdentifierListContext partitionColumnNames;
		public TablePropertyListContext tableProps;
		public CreateTableHeaderContext createTableHeader() {
			return getRuleContext(CreateTableHeaderContext.class,0);
		}
		public List<BucketSpecContext> bucketSpec() {
			return getRuleContexts(BucketSpecContext.class);
		}
		public BucketSpecContext bucketSpec(int i) {
			return getRuleContext(BucketSpecContext.class,i);
		}
		public List<SkewSpecContext> skewSpec() {
			return getRuleContexts(SkewSpecContext.class);
		}
		public SkewSpecContext skewSpec(int i) {
			return getRuleContext(SkewSpecContext.class,i);
		}
		public List<RowFormatContext> rowFormat() {
			return getRuleContexts(RowFormatContext.class);
		}
		public RowFormatContext rowFormat(int i) {
			return getRuleContext(RowFormatContext.class,i);
		}
		public List<CreateFileFormatContext> createFileFormat() {
			return getRuleContexts(CreateFileFormatContext.class);
		}
		public CreateFileFormatContext createFileFormat(int i) {
			return getRuleContext(CreateFileFormatContext.class,i);
		}
		public List<LocationSpecContext> locationSpec() {
			return getRuleContexts(LocationSpecContext.class);
		}
		public LocationSpecContext locationSpec(int i) {
			return getRuleContext(LocationSpecContext.class,i);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public List<ColTypeListContext> colTypeList() {
			return getRuleContexts(ColTypeListContext.class);
		}
		public ColTypeListContext colTypeList(int i) {
			return getRuleContext(ColTypeListContext.class,i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(SqlBaseParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(SqlBaseParser.COMMENT, i);
		}
		public List<TerminalNode> PARTITIONED() { return getTokens(SqlBaseParser.PARTITIONED); }
		public TerminalNode PARTITIONED(int i) {
			return getToken(SqlBaseParser.PARTITIONED, i);
		}
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public List<TerminalNode> TBLPROPERTIES() { return getTokens(SqlBaseParser.TBLPROPERTIES); }
		public TerminalNode TBLPROPERTIES(int i) {
			return getToken(SqlBaseParser.TBLPROPERTIES, i);
		}
		public List<TerminalNode> STRING() { return getTokens(SqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SqlBaseParser.STRING, i);
		}
		public List<IdentifierListContext> identifierList() {
			return getRuleContexts(IdentifierListContext.class);
		}
		public IdentifierListContext identifierList(int i) {
			return getRuleContext(IdentifierListContext.class,i);
		}
		public List<TablePropertyListContext> tablePropertyList() {
			return getRuleContexts(TablePropertyListContext.class);
		}
		public TablePropertyListContext tablePropertyList(int i) {
			return getRuleContext(TablePropertyListContext.class,i);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public CreateHiveTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateHiveTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateHiveTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateHiveTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateFunctionContext extends StatementContext {
		public Token className;
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public CreateFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowTableContext extends StatementContext {
		public MultipartIdentifierContext namespace;
		public Token pattern;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public ShowTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateTableContext extends StatementContext {
		public CreateTableHeaderContext createTableHeader() {
			return getRuleContext(CreateTableHeaderContext.class,0);
		}
		public CreateTableClausesContext createTableClauses() {
			return getRuleContext(CreateTableClausesContext.class,0);
		}
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TableProviderContext tableProvider() {
			return getRuleContext(TableProviderContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public CreateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DmlStatementContext extends StatementContext {
		public DmlStatementNoWithContext dmlStatementNoWith() {
			return getRuleContext(DmlStatementNoWithContext.class,0);
		}
		public CtesContext ctes() {
			return getRuleContext(CtesContext.class,0);
		}
		public DmlStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDmlStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDmlStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDmlStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescribeTableContext extends StatementContext {
		public Token option;
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public DescribeColNameContext describeColName() {
			return getRuleContext(DescribeColNameContext.class,0);
		}
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public TerminalNode FORMATTED() { return getToken(SqlBaseParser.FORMATTED, 0); }
		public DescribeTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDescribeTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDescribeTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDescribeTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateTableLikeContext extends StatementContext {
		public TableIdentifierContext target;
		public TableIdentifierContext source;
		public TablePropertyListContext tableProps;
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public List<TableIdentifierContext> tableIdentifier() {
			return getRuleContexts(TableIdentifierContext.class);
		}
		public TableIdentifierContext tableIdentifier(int i) {
			return getRuleContext(TableIdentifierContext.class,i);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public List<TableProviderContext> tableProvider() {
			return getRuleContexts(TableProviderContext.class);
		}
		public TableProviderContext tableProvider(int i) {
			return getRuleContext(TableProviderContext.class,i);
		}
		public List<RowFormatContext> rowFormat() {
			return getRuleContexts(RowFormatContext.class);
		}
		public RowFormatContext rowFormat(int i) {
			return getRuleContext(RowFormatContext.class,i);
		}
		public List<CreateFileFormatContext> createFileFormat() {
			return getRuleContexts(CreateFileFormatContext.class);
		}
		public CreateFileFormatContext createFileFormat(int i) {
			return getRuleContext(CreateFileFormatContext.class,i);
		}
		public List<LocationSpecContext> locationSpec() {
			return getRuleContexts(LocationSpecContext.class);
		}
		public LocationSpecContext locationSpec(int i) {
			return getRuleContext(LocationSpecContext.class,i);
		}
		public List<TerminalNode> TBLPROPERTIES() { return getTokens(SqlBaseParser.TBLPROPERTIES); }
		public TerminalNode TBLPROPERTIES(int i) {
			return getToken(SqlBaseParser.TBLPROPERTIES, i);
		}
		public List<TablePropertyListContext> tablePropertyList() {
			return getRuleContexts(TablePropertyListContext.class);
		}
		public TablePropertyListContext tablePropertyList(int i) {
			return getRuleContext(TablePropertyListContext.class,i);
		}
		public CreateTableLikeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateTableLike(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateTableLike(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateTableLike(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UncacheTableContext extends StatementContext {
		public TerminalNode UNCACHE() { return getToken(SqlBaseParser.UNCACHE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public UncacheTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUncacheTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUncacheTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUncacheTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropFunctionContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public DropFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LoadDataContext extends StatementContext {
		public Token path;
		public TerminalNode LOAD() { return getToken(SqlBaseParser.LOAD, 0); }
		public TerminalNode DATA() { return getToken(SqlBaseParser.DATA, 0); }
		public TerminalNode INPATH() { return getToken(SqlBaseParser.INPATH, 0); }
		public TerminalNode INTO() { return getToken(SqlBaseParser.INTO, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode LOCAL() { return getToken(SqlBaseParser.LOCAL, 0); }
		public TerminalNode OVERWRITE() { return getToken(SqlBaseParser.OVERWRITE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public LoadDataContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLoadData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLoadData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLoadData(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowPartitionsContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode PARTITIONS() { return getToken(SqlBaseParser.PARTITIONS, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public ShowPartitionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowPartitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowPartitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowPartitions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescribeFunctionContext extends StatementContext {
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public DescribeFuncNameContext describeFuncName() {
			return getRuleContext(DescribeFuncNameContext.class,0);
		}
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public DescribeFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDescribeFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDescribeFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDescribeFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RenameTableColumnContext extends StatementContext {
		public MultipartIdentifierContext table;
		public MultipartIdentifierContext from;
		public ErrorCapturingIdentifierContext to;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public List<MultipartIdentifierContext> multipartIdentifier() {
			return getRuleContexts(MultipartIdentifierContext.class);
		}
		public MultipartIdentifierContext multipartIdentifier(int i) {
			return getRuleContext(MultipartIdentifierContext.class,i);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public RenameTableColumnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRenameTableColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRenameTableColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRenameTableColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementDefaultContext extends StatementContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public StatementDefaultContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStatementDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStatementDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStatementDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescribeQueryContext extends StatementContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode QUERY() { return getToken(SqlBaseParser.QUERY, 0); }
		public DescribeQueryContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDescribeQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDescribeQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDescribeQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TruncateTableContext extends StatementContext {
		public TerminalNode TRUNCATE() { return getToken(SqlBaseParser.TRUNCATE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TruncateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTruncateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTruncateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTruncateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetTableSerDeContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode SERDE() { return getToken(SqlBaseParser.SERDE, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SqlBaseParser.SERDEPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public SetTableSerDeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetTableSerDe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetTableSerDe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetTableSerDe(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateViewContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public IdentifierCommentListContext identifierCommentList() {
			return getRuleContext(IdentifierCommentListContext.class,0);
		}
		public List<TerminalNode> COMMENT() { return getTokens(SqlBaseParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(SqlBaseParser.COMMENT, i);
		}
		public List<TerminalNode> STRING() { return getTokens(SqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SqlBaseParser.STRING, i);
		}
		public List<TerminalNode> PARTITIONED() { return getTokens(SqlBaseParser.PARTITIONED); }
		public TerminalNode PARTITIONED(int i) {
			return getToken(SqlBaseParser.PARTITIONED, i);
		}
		public List<TerminalNode> ON() { return getTokens(SqlBaseParser.ON); }
		public TerminalNode ON(int i) {
			return getToken(SqlBaseParser.ON, i);
		}
		public List<IdentifierListContext> identifierList() {
			return getRuleContexts(IdentifierListContext.class);
		}
		public IdentifierListContext identifierList(int i) {
			return getRuleContext(IdentifierListContext.class,i);
		}
		public List<TerminalNode> TBLPROPERTIES() { return getTokens(SqlBaseParser.TBLPROPERTIES); }
		public TerminalNode TBLPROPERTIES(int i) {
			return getToken(SqlBaseParser.TBLPROPERTIES, i);
		}
		public List<TablePropertyListContext> tablePropertyList() {
			return getRuleContexts(TablePropertyListContext.class);
		}
		public TablePropertyListContext tablePropertyList(int i) {
			return getRuleContext(TablePropertyListContext.class,i);
		}
		public TerminalNode GLOBAL() { return getToken(SqlBaseParser.GLOBAL, 0); }
		public CreateViewContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateView(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropTablePartitionsContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public List<PartitionSpecContext> partitionSpec() {
			return getRuleContexts(PartitionSpecContext.class);
		}
		public PartitionSpecContext partitionSpec(int i) {
			return getRuleContext(PartitionSpecContext.class,i);
		}
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode PURGE() { return getToken(SqlBaseParser.PURGE, 0); }
		public DropTablePartitionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropTablePartitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropTablePartitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropTablePartitions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetConfigurationContext extends StatementContext {
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public SetConfigurationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetConfiguration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetConfiguration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetConfiguration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropTableContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode PURGE() { return getToken(SqlBaseParser.PURGE, 0); }
		public DropTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescribeNamespaceContext extends StatementContext {
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public DatabaseContext database() {
			return getRuleContext(DatabaseContext.class,0);
		}
		public TerminalNode NAMESPACE() { return getToken(SqlBaseParser.NAMESPACE, 0); }
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public DescribeNamespaceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDescribeNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDescribeNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDescribeNamespace(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableColumnContext extends StatementContext {
		public MultipartIdentifierContext table;
		public MultipartIdentifierContext column;
		public Token comment;
		public List<TerminalNode> ALTER() { return getTokens(SqlBaseParser.ALTER); }
		public TerminalNode ALTER(int i) {
			return getToken(SqlBaseParser.ALTER, i);
		}
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public List<MultipartIdentifierContext> multipartIdentifier() {
			return getRuleContexts(MultipartIdentifierContext.class);
		}
		public MultipartIdentifierContext multipartIdentifier(int i) {
			return getRuleContext(MultipartIdentifierContext.class,i);
		}
		public TerminalNode CHANGE() { return getToken(SqlBaseParser.CHANGE, 0); }
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public TerminalNode TYPE() { return getToken(SqlBaseParser.TYPE, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public ColPositionContext colPosition() {
			return getRuleContext(ColPositionContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public AlterTableColumnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAlterTableColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAlterTableColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAlterTableColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateNamespaceContext extends StatementContext {
		public Token comment;
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public DatabaseContext database() {
			return getRuleContext(DatabaseContext.class,0);
		}
		public TerminalNode NAMESPACE() { return getToken(SqlBaseParser.NAMESPACE, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public List<LocationSpecContext> locationSpec() {
			return getRuleContexts(LocationSpecContext.class);
		}
		public LocationSpecContext locationSpec(int i) {
			return getRuleContext(LocationSpecContext.class,i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(SqlBaseParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(SqlBaseParser.COMMENT, i);
		}
		public List<TerminalNode> WITH() { return getTokens(SqlBaseParser.WITH); }
		public TerminalNode WITH(int i) {
			return getToken(SqlBaseParser.WITH, i);
		}
		public List<TablePropertyListContext> tablePropertyList() {
			return getRuleContexts(TablePropertyListContext.class);
		}
		public TablePropertyListContext tablePropertyList(int i) {
			return getRuleContext(TablePropertyListContext.class,i);
		}
		public List<TerminalNode> STRING() { return getTokens(SqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SqlBaseParser.STRING, i);
		}
		public List<TerminalNode> DBPROPERTIES() { return getTokens(SqlBaseParser.DBPROPERTIES); }
		public TerminalNode DBPROPERTIES(int i) {
			return getToken(SqlBaseParser.DBPROPERTIES, i);
		}
		public List<TerminalNode> PROPERTIES() { return getTokens(SqlBaseParser.PROPERTIES); }
		public TerminalNode PROPERTIES(int i) {
			return getToken(SqlBaseParser.PROPERTIES, i);
		}
		public CreateNamespaceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateNamespace(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowTblPropertiesContext extends StatementContext {
		public MultipartIdentifierContext table;
		public TablePropertyKeyContext key;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SqlBaseParser.TBLPROPERTIES, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TablePropertyKeyContext tablePropertyKey() {
			return getRuleContext(TablePropertyKeyContext.class,0);
		}
		public ShowTblPropertiesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowTblProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowTblProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowTblProperties(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnsetTablePropertiesContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode UNSET() { return getToken(SqlBaseParser.UNSET, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SqlBaseParser.TBLPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public UnsetTablePropertiesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUnsetTableProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUnsetTableProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUnsetTableProperties(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetTableLocationContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public SetTableLocationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetTableLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetTableLocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetTableLocation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropTableColumnsContext extends StatementContext {
		public MultipartIdentifierListContext columns;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public MultipartIdentifierListContext multipartIdentifierList() {
			return getRuleContext(MultipartIdentifierListContext.class,0);
		}
		public DropTableColumnsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropTableColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropTableColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropTableColumns(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowFunctionsContext extends StatementContext {
		public Token pattern;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode FUNCTIONS() { return getToken(SqlBaseParser.FUNCTIONS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public ShowFunctionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowFunctions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowFunctions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowFunctions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CacheTableContext extends StatementContext {
		public TablePropertyListContext options;
		public TerminalNode CACHE() { return getToken(SqlBaseParser.CACHE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode LAZY() { return getToken(SqlBaseParser.LAZY, 0); }
		public TerminalNode OPTIONS() { return getToken(SqlBaseParser.OPTIONS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public CacheTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCacheTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCacheTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCacheTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddTableColumnsContext extends StatementContext {
		public QualifiedColTypeWithPositionListContext columns;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public QualifiedColTypeWithPositionListContext qualifiedColTypeWithPositionList() {
			return getRuleContext(QualifiedColTypeWithPositionListContext.class,0);
		}
		public AddTableColumnsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAddTableColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAddTableColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAddTableColumns(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetTablePropertiesContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SqlBaseParser.TBLPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public SetTablePropertiesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetTableProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetTableProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetTableProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(989);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				_localctx = new StatementDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(297);
				query();
				}
				break;
			case 2:
				_localctx = new DmlStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(299);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(298);
					ctes();
					}
				}

				setState(301);
				dmlStatementNoWith();
				}
				break;
			case 3:
				_localctx = new UseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(302);
				match(USE);
				setState(304);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(303);
					match(NAMESPACE);
					}
					break;
				}
				setState(306);
				multipartIdentifier();
				}
				break;
			case 4:
				_localctx = new CreateNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(307);
				match(CREATE);
				setState(310);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DATABASE:
				case SCHEMA:
					{
					setState(308);
					database();
					}
					break;
				case NAMESPACE:
					{
					setState(309);
					match(NAMESPACE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(315);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(312);
					match(IF);
					setState(313);
					match(NOT);
					setState(314);
					match(EXISTS);
					}
					break;
				}
				setState(317);
				multipartIdentifier();
				setState(326);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT || _la==LOCATION || _la==WITH) {
					{
					setState(324);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case COMMENT:
						{
						{
						setState(318);
						match(COMMENT);
						setState(319);
						((CreateNamespaceContext)_localctx).comment = match(STRING);
						}
						}
						break;
					case LOCATION:
						{
						setState(320);
						locationSpec();
						}
						break;
					case WITH:
						{
						{
						setState(321);
						match(WITH);
						setState(322);
						_la = _input.LA(1);
						if ( !(_la==DBPROPERTIES || _la==PROPERTIES) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(323);
						tablePropertyList();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(328);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 5:
				_localctx = new SetNamespacePropertiesContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(329);
				match(ALTER);
				setState(332);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DATABASE:
				case SCHEMA:
					{
					setState(330);
					database();
					}
					break;
				case NAMESPACE:
					{
					setState(331);
					match(NAMESPACE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(334);
				multipartIdentifier();
				setState(335);
				match(SET);
				setState(336);
				_la = _input.LA(1);
				if ( !(_la==DBPROPERTIES || _la==PROPERTIES) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(337);
				tablePropertyList();
				}
				break;
			case 6:
				_localctx = new SetNamespaceLocationContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(339);
				match(ALTER);
				setState(342);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DATABASE:
				case SCHEMA:
					{
					setState(340);
					database();
					}
					break;
				case NAMESPACE:
					{
					setState(341);
					match(NAMESPACE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(344);
				multipartIdentifier();
				setState(345);
				match(SET);
				setState(346);
				locationSpec();
				}
				break;
			case 7:
				_localctx = new DropNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(348);
				match(DROP);
				setState(351);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DATABASE:
				case SCHEMA:
					{
					setState(349);
					database();
					}
					break;
				case NAMESPACE:
					{
					setState(350);
					match(NAMESPACE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(355);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(353);
					match(IF);
					setState(354);
					match(EXISTS);
					}
					break;
				}
				setState(357);
				multipartIdentifier();
				setState(359);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CASCADE || _la==RESTRICT) {
					{
					setState(358);
					_la = _input.LA(1);
					if ( !(_la==CASCADE || _la==RESTRICT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				break;
			case 8:
				_localctx = new ShowNamespacesContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(361);
				match(SHOW);
				setState(362);
				_la = _input.LA(1);
				if ( !(_la==DATABASES || _la==NAMESPACES) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(365);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(363);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(364);
					multipartIdentifier();
					}
				}

				setState(371);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE || _la==STRING) {
					{
					setState(368);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LIKE) {
						{
						setState(367);
						match(LIKE);
						}
					}

					setState(370);
					((ShowNamespacesContext)_localctx).pattern = match(STRING);
					}
				}

				}
				break;
			case 9:
				_localctx = new CreateTableContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(373);
				if (!(!legacy_create_hive_table_by_default_enabled)) throw new FailedPredicateException(this, "!legacy_create_hive_table_by_default_enabled");
				setState(374);
				createTableHeader();
				setState(379);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(375);
					match(T__0);
					setState(376);
					colTypeList();
					setState(377);
					match(T__1);
					}
					break;
				}
				setState(382);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(381);
					tableProvider();
					}
				}

				setState(384);
				createTableClauses();
				setState(389);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0 || _la==AS || _la==FROM || _la==MAP || ((((_la - 195)) & ~0x3f) == 0 && ((1L << (_la - 195)) & ((1L << (REDUCE - 195)) | (1L << (SELECT - 195)) | (1L << (TABLE - 195)))) != 0) || _la==VALUES || _la==WITH) {
					{
					setState(386);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(385);
						match(AS);
						}
					}

					setState(388);
					query();
					}
				}

				}
				break;
			case 10:
				_localctx = new CreateTableContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(391);
				if (!(legacy_create_hive_table_by_default_enabled)) throw new FailedPredicateException(this, "legacy_create_hive_table_by_default_enabled");
				setState(392);
				createTableHeader();
				setState(397);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(393);
					match(T__0);
					setState(394);
					colTypeList();
					setState(395);
					match(T__1);
					}
				}

				setState(399);
				tableProvider();
				setState(400);
				createTableClauses();
				setState(405);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0 || _la==AS || _la==FROM || _la==MAP || ((((_la - 195)) & ~0x3f) == 0 && ((1L << (_la - 195)) & ((1L << (REDUCE - 195)) | (1L << (SELECT - 195)) | (1L << (TABLE - 195)))) != 0) || _la==VALUES || _la==WITH) {
					{
					setState(402);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(401);
						match(AS);
						}
					}

					setState(404);
					query();
					}
				}

				}
				break;
			case 11:
				_localctx = new CreateHiveTableContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(407);
				createTableHeader();
				setState(412);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(408);
					match(T__0);
					setState(409);
					((CreateHiveTableContext)_localctx).columns = colTypeList();
					setState(410);
					match(T__1);
					}
					break;
				}
				setState(436);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CLUSTERED || _la==COMMENT || _la==LOCATION || _la==PARTITIONED || ((((_la - 211)) & ~0x3f) == 0 && ((1L << (_la - 211)) & ((1L << (ROW - 211)) | (1L << (SKEWED - 211)) | (1L << (STORED - 211)) | (1L << (TBLPROPERTIES - 211)))) != 0)) {
					{
					setState(434);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case COMMENT:
						{
						{
						setState(414);
						match(COMMENT);
						setState(415);
						((CreateHiveTableContext)_localctx).comment = match(STRING);
						}
						}
						break;
					case PARTITIONED:
						{
						setState(425);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
						case 1:
							{
							setState(416);
							match(PARTITIONED);
							setState(417);
							match(BY);
							setState(418);
							match(T__0);
							setState(419);
							((CreateHiveTableContext)_localctx).partitionColumns = colTypeList();
							setState(420);
							match(T__1);
							}
							break;
						case 2:
							{
							setState(422);
							match(PARTITIONED);
							setState(423);
							match(BY);
							setState(424);
							((CreateHiveTableContext)_localctx).partitionColumnNames = identifierList();
							}
							break;
						}
						}
						break;
					case CLUSTERED:
						{
						setState(427);
						bucketSpec();
						}
						break;
					case SKEWED:
						{
						setState(428);
						skewSpec();
						}
						break;
					case ROW:
						{
						setState(429);
						rowFormat();
						}
						break;
					case STORED:
						{
						setState(430);
						createFileFormat();
						}
						break;
					case LOCATION:
						{
						setState(431);
						locationSpec();
						}
						break;
					case TBLPROPERTIES:
						{
						{
						setState(432);
						match(TBLPROPERTIES);
						setState(433);
						((CreateHiveTableContext)_localctx).tableProps = tablePropertyList();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(438);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(443);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0 || _la==AS || _la==FROM || _la==MAP || ((((_la - 195)) & ~0x3f) == 0 && ((1L << (_la - 195)) & ((1L << (REDUCE - 195)) | (1L << (SELECT - 195)) | (1L << (TABLE - 195)))) != 0) || _la==VALUES || _la==WITH) {
					{
					setState(440);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(439);
						match(AS);
						}
					}

					setState(442);
					query();
					}
				}

				}
				break;
			case 12:
				_localctx = new CreateTableLikeContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(445);
				match(CREATE);
				setState(446);
				match(TABLE);
				setState(450);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(447);
					match(IF);
					setState(448);
					match(NOT);
					setState(449);
					match(EXISTS);
					}
					break;
				}
				setState(452);
				((CreateTableLikeContext)_localctx).target = tableIdentifier();
				setState(453);
				match(LIKE);
				setState(454);
				((CreateTableLikeContext)_localctx).source = tableIdentifier();
				setState(463);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOCATION || ((((_la - 211)) & ~0x3f) == 0 && ((1L << (_la - 211)) & ((1L << (ROW - 211)) | (1L << (STORED - 211)) | (1L << (TBLPROPERTIES - 211)) | (1L << (USING - 211)))) != 0)) {
					{
					setState(461);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case USING:
						{
						setState(455);
						tableProvider();
						}
						break;
					case ROW:
						{
						setState(456);
						rowFormat();
						}
						break;
					case STORED:
						{
						setState(457);
						createFileFormat();
						}
						break;
					case LOCATION:
						{
						setState(458);
						locationSpec();
						}
						break;
					case TBLPROPERTIES:
						{
						{
						setState(459);
						match(TBLPROPERTIES);
						setState(460);
						((CreateTableLikeContext)_localctx).tableProps = tablePropertyList();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(465);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 13:
				_localctx = new ReplaceTableContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(466);
				replaceTableHeader();
				setState(471);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(467);
					match(T__0);
					setState(468);
					colTypeList();
					setState(469);
					match(T__1);
					}
				}

				setState(473);
				tableProvider();
				setState(474);
				createTableClauses();
				setState(479);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0 || _la==AS || _la==FROM || _la==MAP || ((((_la - 195)) & ~0x3f) == 0 && ((1L << (_la - 195)) & ((1L << (REDUCE - 195)) | (1L << (SELECT - 195)) | (1L << (TABLE - 195)))) != 0) || _la==VALUES || _la==WITH) {
					{
					setState(476);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(475);
						match(AS);
						}
					}

					setState(478);
					query();
					}
				}

				}
				break;
			case 14:
				_localctx = new AnalyzeContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(481);
				match(ANALYZE);
				setState(482);
				match(TABLE);
				setState(483);
				multipartIdentifier();
				setState(485);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(484);
					partitionSpec();
					}
				}

				setState(487);
				match(COMPUTE);
				setState(488);
				match(STATISTICS);
				setState(496);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(489);
					identifier();
					}
					break;
				case 2:
					{
					setState(490);
					match(FOR);
					setState(491);
					match(COLUMNS);
					setState(492);
					identifierSeq();
					}
					break;
				case 3:
					{
					setState(493);
					match(FOR);
					setState(494);
					match(ALL);
					setState(495);
					match(COLUMNS);
					}
					break;
				}
				}
				break;
			case 15:
				_localctx = new AddTableColumnsContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(498);
				match(ALTER);
				setState(499);
				match(TABLE);
				setState(500);
				multipartIdentifier();
				setState(501);
				match(ADD);
				setState(502);
				_la = _input.LA(1);
				if ( !(_la==COLUMN || _la==COLUMNS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(503);
				((AddTableColumnsContext)_localctx).columns = qualifiedColTypeWithPositionList();
				}
				break;
			case 16:
				_localctx = new AddTableColumnsContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(505);
				match(ALTER);
				setState(506);
				match(TABLE);
				setState(507);
				multipartIdentifier();
				setState(508);
				match(ADD);
				setState(509);
				_la = _input.LA(1);
				if ( !(_la==COLUMN || _la==COLUMNS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(510);
				match(T__0);
				setState(511);
				((AddTableColumnsContext)_localctx).columns = qualifiedColTypeWithPositionList();
				setState(512);
				match(T__1);
				}
				break;
			case 17:
				_localctx = new RenameTableColumnContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(514);
				match(ALTER);
				setState(515);
				match(TABLE);
				setState(516);
				((RenameTableColumnContext)_localctx).table = multipartIdentifier();
				setState(517);
				match(RENAME);
				setState(518);
				match(COLUMN);
				setState(519);
				((RenameTableColumnContext)_localctx).from = multipartIdentifier();
				setState(520);
				match(TO);
				setState(521);
				((RenameTableColumnContext)_localctx).to = errorCapturingIdentifier();
				}
				break;
			case 18:
				_localctx = new DropTableColumnsContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(523);
				match(ALTER);
				setState(524);
				match(TABLE);
				setState(525);
				multipartIdentifier();
				setState(526);
				match(DROP);
				setState(527);
				_la = _input.LA(1);
				if ( !(_la==COLUMN || _la==COLUMNS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(528);
				match(T__0);
				setState(529);
				((DropTableColumnsContext)_localctx).columns = multipartIdentifierList();
				setState(530);
				match(T__1);
				}
				break;
			case 19:
				_localctx = new DropTableColumnsContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(532);
				match(ALTER);
				setState(533);
				match(TABLE);
				setState(534);
				multipartIdentifier();
				setState(535);
				match(DROP);
				setState(536);
				_la = _input.LA(1);
				if ( !(_la==COLUMN || _la==COLUMNS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(537);
				((DropTableColumnsContext)_localctx).columns = multipartIdentifierList();
				}
				break;
			case 20:
				_localctx = new RenameTableContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(539);
				match(ALTER);
				setState(540);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(541);
				((RenameTableContext)_localctx).from = multipartIdentifier();
				setState(542);
				match(RENAME);
				setState(543);
				match(TO);
				setState(544);
				((RenameTableContext)_localctx).to = multipartIdentifier();
				}
				break;
			case 21:
				_localctx = new SetTablePropertiesContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(546);
				match(ALTER);
				setState(547);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(548);
				multipartIdentifier();
				setState(549);
				match(SET);
				setState(550);
				match(TBLPROPERTIES);
				setState(551);
				tablePropertyList();
				}
				break;
			case 22:
				_localctx = new UnsetTablePropertiesContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(553);
				match(ALTER);
				setState(554);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(555);
				multipartIdentifier();
				setState(556);
				match(UNSET);
				setState(557);
				match(TBLPROPERTIES);
				setState(560);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(558);
					match(IF);
					setState(559);
					match(EXISTS);
					}
				}

				setState(562);
				tablePropertyList();
				}
				break;
			case 23:
				_localctx = new AlterTableColumnContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(564);
				match(ALTER);
				setState(565);
				match(TABLE);
				setState(566);
				((AlterTableColumnContext)_localctx).table = multipartIdentifier();
				setState(567);
				_la = _input.LA(1);
				if ( !(_la==ALTER || _la==CHANGE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(569);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(568);
					match(COLUMN);
					}
					break;
				}
				setState(571);
				((AlterTableColumnContext)_localctx).column = multipartIdentifier();
				setState(574);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TYPE) {
					{
					setState(572);
					match(TYPE);
					setState(573);
					dataType();
					}
				}

				setState(578);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(576);
					match(COMMENT);
					setState(577);
					((AlterTableColumnContext)_localctx).comment = match(STRING);
					}
				}

				setState(581);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AFTER || _la==FIRST) {
					{
					setState(580);
					colPosition();
					}
				}

				}
				break;
			case 24:
				_localctx = new SetTableSerDeContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(583);
				match(ALTER);
				setState(584);
				match(TABLE);
				setState(585);
				multipartIdentifier();
				setState(587);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(586);
					partitionSpec();
					}
				}

				setState(589);
				match(SET);
				setState(590);
				match(SERDE);
				setState(591);
				match(STRING);
				setState(595);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(592);
					match(WITH);
					setState(593);
					match(SERDEPROPERTIES);
					setState(594);
					tablePropertyList();
					}
				}

				}
				break;
			case 25:
				_localctx = new SetTableSerDeContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(597);
				match(ALTER);
				setState(598);
				match(TABLE);
				setState(599);
				multipartIdentifier();
				setState(601);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(600);
					partitionSpec();
					}
				}

				setState(603);
				match(SET);
				setState(604);
				match(SERDEPROPERTIES);
				setState(605);
				tablePropertyList();
				}
				break;
			case 26:
				_localctx = new AddTablePartitionContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(607);
				match(ALTER);
				setState(608);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(609);
				multipartIdentifier();
				setState(610);
				match(ADD);
				setState(614);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(611);
					match(IF);
					setState(612);
					match(NOT);
					setState(613);
					match(EXISTS);
					}
				}

				setState(617); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(616);
					partitionSpecLocation();
					}
					}
					setState(619); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==PARTITION );
				}
				break;
			case 27:
				_localctx = new RenameTablePartitionContext(_localctx);
				enterOuterAlt(_localctx, 27);
				{
				setState(621);
				match(ALTER);
				setState(622);
				match(TABLE);
				setState(623);
				multipartIdentifier();
				setState(624);
				((RenameTablePartitionContext)_localctx).from = partitionSpec();
				setState(625);
				match(RENAME);
				setState(626);
				match(TO);
				setState(627);
				((RenameTablePartitionContext)_localctx).to = partitionSpec();
				}
				break;
			case 28:
				_localctx = new DropTablePartitionsContext(_localctx);
				enterOuterAlt(_localctx, 28);
				{
				setState(629);
				match(ALTER);
				setState(630);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(631);
				multipartIdentifier();
				setState(632);
				match(DROP);
				setState(635);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(633);
					match(IF);
					setState(634);
					match(EXISTS);
					}
				}

				setState(637);
				partitionSpec();
				setState(642);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(638);
					match(T__2);
					setState(639);
					partitionSpec();
					}
					}
					setState(644);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(646);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PURGE) {
					{
					setState(645);
					match(PURGE);
					}
				}

				}
				break;
			case 29:
				_localctx = new SetTableLocationContext(_localctx);
				enterOuterAlt(_localctx, 29);
				{
				setState(648);
				match(ALTER);
				setState(649);
				match(TABLE);
				setState(650);
				multipartIdentifier();
				setState(652);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(651);
					partitionSpec();
					}
				}

				setState(654);
				match(SET);
				setState(655);
				locationSpec();
				}
				break;
			case 30:
				_localctx = new RecoverPartitionsContext(_localctx);
				enterOuterAlt(_localctx, 30);
				{
				setState(657);
				match(ALTER);
				setState(658);
				match(TABLE);
				setState(659);
				multipartIdentifier();
				setState(660);
				match(RECOVER);
				setState(661);
				match(PARTITIONS);
				}
				break;
			case 31:
				_localctx = new DropTableContext(_localctx);
				enterOuterAlt(_localctx, 31);
				{
				setState(663);
				match(DROP);
				setState(664);
				match(TABLE);
				setState(667);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(665);
					match(IF);
					setState(666);
					match(EXISTS);
					}
					break;
				}
				setState(669);
				multipartIdentifier();
				setState(671);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PURGE) {
					{
					setState(670);
					match(PURGE);
					}
				}

				}
				break;
			case 32:
				_localctx = new DropViewContext(_localctx);
				enterOuterAlt(_localctx, 32);
				{
				setState(673);
				match(DROP);
				setState(674);
				match(VIEW);
				setState(677);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(675);
					match(IF);
					setState(676);
					match(EXISTS);
					}
					break;
				}
				setState(679);
				multipartIdentifier();
				}
				break;
			case 33:
				_localctx = new CreateViewContext(_localctx);
				enterOuterAlt(_localctx, 33);
				{
				setState(680);
				match(CREATE);
				setState(683);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(681);
					match(OR);
					setState(682);
					match(REPLACE);
					}
				}

				setState(689);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GLOBAL || _la==TEMPORARY) {
					{
					setState(686);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==GLOBAL) {
						{
						setState(685);
						match(GLOBAL);
						}
					}

					setState(688);
					match(TEMPORARY);
					}
				}

				setState(691);
				match(VIEW);
				setState(695);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
				case 1:
					{
					setState(692);
					match(IF);
					setState(693);
					match(NOT);
					setState(694);
					match(EXISTS);
					}
					break;
				}
				setState(697);
				multipartIdentifier();
				setState(699);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(698);
					identifierCommentList();
					}
				}

				setState(710);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT || _la==PARTITIONED || _la==TBLPROPERTIES) {
					{
					setState(708);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case COMMENT:
						{
						{
						setState(701);
						match(COMMENT);
						setState(702);
						match(STRING);
						}
						}
						break;
					case PARTITIONED:
						{
						{
						setState(703);
						match(PARTITIONED);
						setState(704);
						match(ON);
						setState(705);
						identifierList();
						}
						}
						break;
					case TBLPROPERTIES:
						{
						{
						setState(706);
						match(TBLPROPERTIES);
						setState(707);
						tablePropertyList();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(712);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(713);
				match(AS);
				setState(714);
				query();
				}
				break;
			case 34:
				_localctx = new CreateTempViewUsingContext(_localctx);
				enterOuterAlt(_localctx, 34);
				{
				setState(716);
				match(CREATE);
				setState(719);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(717);
					match(OR);
					setState(718);
					match(REPLACE);
					}
				}

				setState(722);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GLOBAL) {
					{
					setState(721);
					match(GLOBAL);
					}
				}

				setState(724);
				match(TEMPORARY);
				setState(725);
				match(VIEW);
				setState(726);
				tableIdentifier();
				setState(731);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(727);
					match(T__0);
					setState(728);
					colTypeList();
					setState(729);
					match(T__1);
					}
				}

				setState(733);
				tableProvider();
				setState(736);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(734);
					match(OPTIONS);
					setState(735);
					tablePropertyList();
					}
				}

				}
				break;
			case 35:
				_localctx = new AlterViewQueryContext(_localctx);
				enterOuterAlt(_localctx, 35);
				{
				setState(738);
				match(ALTER);
				setState(739);
				match(VIEW);
				setState(740);
				multipartIdentifier();
				setState(742);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(741);
					match(AS);
					}
				}

				setState(744);
				query();
				}
				break;
			case 36:
				_localctx = new CreateFunctionContext(_localctx);
				enterOuterAlt(_localctx, 36);
				{
				setState(746);
				match(CREATE);
				setState(749);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(747);
					match(OR);
					setState(748);
					match(REPLACE);
					}
				}

				setState(752);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TEMPORARY) {
					{
					setState(751);
					match(TEMPORARY);
					}
				}

				setState(754);
				match(FUNCTION);
				setState(758);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
				case 1:
					{
					setState(755);
					match(IF);
					setState(756);
					match(NOT);
					setState(757);
					match(EXISTS);
					}
					break;
				}
				setState(760);
				multipartIdentifier();
				setState(761);
				match(AS);
				setState(762);
				((CreateFunctionContext)_localctx).className = match(STRING);
				setState(772);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(763);
					match(USING);
					setState(764);
					resource();
					setState(769);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(765);
						match(T__2);
						setState(766);
						resource();
						}
						}
						setState(771);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				break;
			case 37:
				_localctx = new DropFunctionContext(_localctx);
				enterOuterAlt(_localctx, 37);
				{
				setState(774);
				match(DROP);
				setState(776);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TEMPORARY) {
					{
					setState(775);
					match(TEMPORARY);
					}
				}

				setState(778);
				match(FUNCTION);
				setState(781);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
				case 1:
					{
					setState(779);
					match(IF);
					setState(780);
					match(EXISTS);
					}
					break;
				}
				setState(783);
				multipartIdentifier();
				}
				break;
			case 38:
				_localctx = new ExplainContext(_localctx);
				enterOuterAlt(_localctx, 38);
				{
				setState(784);
				match(EXPLAIN);
				setState(786);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
				case 1:
					{
					setState(785);
					_la = _input.LA(1);
					if ( !(_la==CODEGEN || _la==COST || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (EXTENDED - 86)) | (1L << (FORMATTED - 86)) | (1L << (LOGICAL - 86)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(788);
				statement();
				}
				break;
			case 39:
				_localctx = new ShowTablesContext(_localctx);
				enterOuterAlt(_localctx, 39);
				{
				setState(789);
				match(SHOW);
				setState(790);
				match(TABLES);
				setState(793);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(791);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(792);
					multipartIdentifier();
					}
				}

				setState(799);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE || _la==STRING) {
					{
					setState(796);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LIKE) {
						{
						setState(795);
						match(LIKE);
						}
					}

					setState(798);
					((ShowTablesContext)_localctx).pattern = match(STRING);
					}
				}

				}
				break;
			case 40:
				_localctx = new ShowTableContext(_localctx);
				enterOuterAlt(_localctx, 40);
				{
				setState(801);
				match(SHOW);
				setState(802);
				match(TABLE);
				setState(803);
				match(EXTENDED);
				setState(806);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(804);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(805);
					((ShowTableContext)_localctx).namespace = multipartIdentifier();
					}
				}

				setState(808);
				match(LIKE);
				setState(809);
				((ShowTableContext)_localctx).pattern = match(STRING);
				setState(811);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(810);
					partitionSpec();
					}
				}

				}
				break;
			case 41:
				_localctx = new ShowTblPropertiesContext(_localctx);
				enterOuterAlt(_localctx, 41);
				{
				setState(813);
				match(SHOW);
				setState(814);
				match(TBLPROPERTIES);
				setState(815);
				((ShowTblPropertiesContext)_localctx).table = multipartIdentifier();
				setState(820);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(816);
					match(T__0);
					setState(817);
					((ShowTblPropertiesContext)_localctx).key = tablePropertyKey();
					setState(818);
					match(T__1);
					}
				}

				}
				break;
			case 42:
				_localctx = new ShowColumnsContext(_localctx);
				enterOuterAlt(_localctx, 42);
				{
				setState(822);
				match(SHOW);
				setState(823);
				match(COLUMNS);
				setState(824);
				_la = _input.LA(1);
				if ( !(_la==FROM || _la==IN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(825);
				((ShowColumnsContext)_localctx).table = multipartIdentifier();
				setState(828);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(826);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(827);
					((ShowColumnsContext)_localctx).namespace = multipartIdentifier();
					}
				}

				}
				break;
			case 43:
				_localctx = new ShowPartitionsContext(_localctx);
				enterOuterAlt(_localctx, 43);
				{
				setState(830);
				match(SHOW);
				setState(831);
				match(PARTITIONS);
				setState(832);
				multipartIdentifier();
				setState(834);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(833);
					partitionSpec();
					}
				}

				}
				break;
			case 44:
				_localctx = new ShowFunctionsContext(_localctx);
				enterOuterAlt(_localctx, 44);
				{
				setState(836);
				match(SHOW);
				setState(838);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
				case 1:
					{
					setState(837);
					identifier();
					}
					break;
				}
				setState(840);
				match(FUNCTIONS);
				setState(848);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
				case 1:
					{
					setState(842);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
					case 1:
						{
						setState(841);
						match(LIKE);
						}
						break;
					}
					setState(846);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
					case 1:
						{
						setState(844);
						multipartIdentifier();
						}
						break;
					case 2:
						{
						setState(845);
						((ShowFunctionsContext)_localctx).pattern = match(STRING);
						}
						break;
					}
					}
					break;
				}
				}
				break;
			case 45:
				_localctx = new ShowCreateTableContext(_localctx);
				enterOuterAlt(_localctx, 45);
				{
				setState(850);
				match(SHOW);
				setState(851);
				match(CREATE);
				setState(852);
				match(TABLE);
				setState(853);
				multipartIdentifier();
				}
				break;
			case 46:
				_localctx = new ShowCurrentNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 46);
				{
				setState(854);
				match(SHOW);
				setState(855);
				match(CURRENT);
				setState(856);
				match(NAMESPACE);
				}
				break;
			case 47:
				_localctx = new DescribeFunctionContext(_localctx);
				enterOuterAlt(_localctx, 47);
				{
				setState(857);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(858);
				match(FUNCTION);
				setState(860);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
				case 1:
					{
					setState(859);
					match(EXTENDED);
					}
					break;
				}
				setState(862);
				describeFuncName();
				}
				break;
			case 48:
				_localctx = new DescribeNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 48);
				{
				setState(863);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(866);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DATABASE:
				case SCHEMA:
					{
					setState(864);
					database();
					}
					break;
				case NAMESPACE:
					{
					setState(865);
					match(NAMESPACE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(869);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
				case 1:
					{
					setState(868);
					match(EXTENDED);
					}
					break;
				}
				setState(871);
				multipartIdentifier();
				}
				break;
			case 49:
				_localctx = new DescribeTableContext(_localctx);
				enterOuterAlt(_localctx, 49);
				{
				setState(872);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(874);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
				case 1:
					{
					setState(873);
					match(TABLE);
					}
					break;
				}
				setState(877);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
				case 1:
					{
					setState(876);
					((DescribeTableContext)_localctx).option = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==EXTENDED || _la==FORMATTED) ) {
						((DescribeTableContext)_localctx).option = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(879);
				multipartIdentifier();
				setState(881);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
				case 1:
					{
					setState(880);
					partitionSpec();
					}
					break;
				}
				setState(884);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
				case 1:
					{
					setState(883);
					describeColName();
					}
					break;
				}
				}
				break;
			case 50:
				_localctx = new DescribeQueryContext(_localctx);
				enterOuterAlt(_localctx, 50);
				{
				setState(886);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(888);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QUERY) {
					{
					setState(887);
					match(QUERY);
					}
				}

				setState(890);
				query();
				}
				break;
			case 51:
				_localctx = new RefreshTableContext(_localctx);
				enterOuterAlt(_localctx, 51);
				{
				setState(891);
				match(REFRESH);
				setState(892);
				match(TABLE);
				setState(893);
				multipartIdentifier();
				}
				break;
			case 52:
				_localctx = new RefreshResourceContext(_localctx);
				enterOuterAlt(_localctx, 52);
				{
				setState(894);
				match(REFRESH);
				setState(902);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
				case 1:
					{
					setState(895);
					match(STRING);
					}
					break;
				case 2:
					{
					setState(899);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
					while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1+1 ) {
							{
							{
							setState(896);
							matchWildcard();
							}
							} 
						}
						setState(901);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
					}
					}
					break;
				}
				}
				break;
			case 53:
				_localctx = new CacheTableContext(_localctx);
				enterOuterAlt(_localctx, 53);
				{
				setState(904);
				match(CACHE);
				setState(906);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LAZY) {
					{
					setState(905);
					match(LAZY);
					}
				}

				setState(908);
				match(TABLE);
				setState(909);
				multipartIdentifier();
				setState(912);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(910);
					match(OPTIONS);
					setState(911);
					((CacheTableContext)_localctx).options = tablePropertyList();
					}
				}

				setState(918);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0 || _la==AS || _la==FROM || _la==MAP || ((((_la - 195)) & ~0x3f) == 0 && ((1L << (_la - 195)) & ((1L << (REDUCE - 195)) | (1L << (SELECT - 195)) | (1L << (TABLE - 195)))) != 0) || _la==VALUES || _la==WITH) {
					{
					setState(915);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(914);
						match(AS);
						}
					}

					setState(917);
					query();
					}
				}

				}
				break;
			case 54:
				_localctx = new UncacheTableContext(_localctx);
				enterOuterAlt(_localctx, 54);
				{
				setState(920);
				match(UNCACHE);
				setState(921);
				match(TABLE);
				setState(924);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
				case 1:
					{
					setState(922);
					match(IF);
					setState(923);
					match(EXISTS);
					}
					break;
				}
				setState(926);
				multipartIdentifier();
				}
				break;
			case 55:
				_localctx = new ClearCacheContext(_localctx);
				enterOuterAlt(_localctx, 55);
				{
				setState(927);
				match(CLEAR);
				setState(928);
				match(CACHE);
				}
				break;
			case 56:
				_localctx = new LoadDataContext(_localctx);
				enterOuterAlt(_localctx, 56);
				{
				setState(929);
				match(LOAD);
				setState(930);
				match(DATA);
				setState(932);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCAL) {
					{
					setState(931);
					match(LOCAL);
					}
				}

				setState(934);
				match(INPATH);
				setState(935);
				((LoadDataContext)_localctx).path = match(STRING);
				setState(937);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OVERWRITE) {
					{
					setState(936);
					match(OVERWRITE);
					}
				}

				setState(939);
				match(INTO);
				setState(940);
				match(TABLE);
				setState(941);
				multipartIdentifier();
				setState(943);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(942);
					partitionSpec();
					}
				}

				}
				break;
			case 57:
				_localctx = new TruncateTableContext(_localctx);
				enterOuterAlt(_localctx, 57);
				{
				setState(945);
				match(TRUNCATE);
				setState(946);
				match(TABLE);
				setState(947);
				multipartIdentifier();
				setState(949);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(948);
					partitionSpec();
					}
				}

				}
				break;
			case 58:
				_localctx = new RepairTableContext(_localctx);
				enterOuterAlt(_localctx, 58);
				{
				setState(951);
				match(MSCK);
				setState(952);
				match(REPAIR);
				setState(953);
				match(TABLE);
				setState(954);
				multipartIdentifier();
				}
				break;
			case 59:
				_localctx = new ManageResourceContext(_localctx);
				enterOuterAlt(_localctx, 59);
				{
				setState(955);
				((ManageResourceContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==LIST) ) {
					((ManageResourceContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(956);
				identifier();
				setState(964);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
				case 1:
					{
					setState(957);
					match(STRING);
					}
					break;
				case 2:
					{
					setState(961);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
					while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1+1 ) {
							{
							{
							setState(958);
							matchWildcard();
							}
							} 
						}
						setState(963);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
					}
					}
					break;
				}
				}
				break;
			case 60:
				_localctx = new FailNativeCommandContext(_localctx);
				enterOuterAlt(_localctx, 60);
				{
				setState(966);
				match(SET);
				setState(967);
				match(ROLE);
				setState(971);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(968);
						matchWildcard();
						}
						} 
					}
					setState(973);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
				}
				}
				break;
			case 61:
				_localctx = new SetConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 61);
				{
				setState(974);
				match(SET);
				setState(978);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(975);
						matchWildcard();
						}
						} 
					}
					setState(980);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
				}
				}
				break;
			case 62:
				_localctx = new ResetConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 62);
				{
				setState(981);
				match(RESET);
				}
				break;
			case 63:
				_localctx = new FailNativeCommandContext(_localctx);
				enterOuterAlt(_localctx, 63);
				{
				setState(982);
				unsupportedHiveNativeCommands();
				setState(986);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(983);
						matchWildcard();
						}
						} 
					}
					setState(988);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnsupportedHiveNativeCommandsContext extends ParserRuleContext {
		public Token kw1;
		public Token kw2;
		public Token kw3;
		public Token kw4;
		public Token kw5;
		public Token kw6;
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode ROLE() { return getToken(SqlBaseParser.ROLE, 0); }
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode GRANT() { return getToken(SqlBaseParser.GRANT, 0); }
		public TerminalNode REVOKE() { return getToken(SqlBaseParser.REVOKE, 0); }
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode PRINCIPALS() { return getToken(SqlBaseParser.PRINCIPALS, 0); }
		public TerminalNode ROLES() { return getToken(SqlBaseParser.ROLES, 0); }
		public TerminalNode CURRENT() { return getToken(SqlBaseParser.CURRENT, 0); }
		public TerminalNode EXPORT() { return getToken(SqlBaseParser.EXPORT, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode IMPORT() { return getToken(SqlBaseParser.IMPORT, 0); }
		public TerminalNode COMPACTIONS() { return getToken(SqlBaseParser.COMPACTIONS, 0); }
		public TerminalNode TRANSACTIONS() { return getToken(SqlBaseParser.TRANSACTIONS, 0); }
		public TerminalNode INDEXES() { return getToken(SqlBaseParser.INDEXES, 0); }
		public TerminalNode LOCKS() { return getToken(SqlBaseParser.LOCKS, 0); }
		public TerminalNode INDEX() { return getToken(SqlBaseParser.INDEX, 0); }
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode LOCK() { return getToken(SqlBaseParser.LOCK, 0); }
		public TerminalNode DATABASE() { return getToken(SqlBaseParser.DATABASE, 0); }
		public TerminalNode UNLOCK() { return getToken(SqlBaseParser.UNLOCK, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode MACRO() { return getToken(SqlBaseParser.MACRO, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode CLUSTERED() { return getToken(SqlBaseParser.CLUSTERED, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public TerminalNode SORTED() { return getToken(SqlBaseParser.SORTED, 0); }
		public TerminalNode SKEWED() { return getToken(SqlBaseParser.SKEWED, 0); }
		public TerminalNode STORED() { return getToken(SqlBaseParser.STORED, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TerminalNode DIRECTORIES() { return getToken(SqlBaseParser.DIRECTORIES, 0); }
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode LOCATION() { return getToken(SqlBaseParser.LOCATION, 0); }
		public TerminalNode EXCHANGE() { return getToken(SqlBaseParser.EXCHANGE, 0); }
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public TerminalNode ARCHIVE() { return getToken(SqlBaseParser.ARCHIVE, 0); }
		public TerminalNode UNARCHIVE() { return getToken(SqlBaseParser.UNARCHIVE, 0); }
		public TerminalNode TOUCH() { return getToken(SqlBaseParser.TOUCH, 0); }
		public TerminalNode COMPACT() { return getToken(SqlBaseParser.COMPACT, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode CONCATENATE() { return getToken(SqlBaseParser.CONCATENATE, 0); }
		public TerminalNode FILEFORMAT() { return getToken(SqlBaseParser.FILEFORMAT, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public TerminalNode START() { return getToken(SqlBaseParser.START, 0); }
		public TerminalNode TRANSACTION() { return getToken(SqlBaseParser.TRANSACTION, 0); }
		public TerminalNode COMMIT() { return getToken(SqlBaseParser.COMMIT, 0); }
		public TerminalNode ROLLBACK() { return getToken(SqlBaseParser.ROLLBACK, 0); }
		public TerminalNode DFS() { return getToken(SqlBaseParser.DFS, 0); }
		public UnsupportedHiveNativeCommandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsupportedHiveNativeCommands; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUnsupportedHiveNativeCommands(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUnsupportedHiveNativeCommands(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUnsupportedHiveNativeCommands(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnsupportedHiveNativeCommandsContext unsupportedHiveNativeCommands() throws RecognitionException {
		UnsupportedHiveNativeCommandsContext _localctx = new UnsupportedHiveNativeCommandsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_unsupportedHiveNativeCommands);
		int _la;
		try {
			setState(1159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(991);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(992);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(993);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(994);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(995);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(GRANT);
				setState(997);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
				case 1:
					{
					setState(996);
					((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(999);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(REVOKE);
				setState(1001);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
				case 1:
					{
					setState(1000);
					((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1003);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1004);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(GRANT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1005);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1006);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				setState(1008);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
				case 1:
					{
					setState(1007);
					((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(GRANT);
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1010);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1011);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(PRINCIPALS);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1012);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1013);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLES);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1014);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1015);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(CURRENT);
				setState(1016);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(ROLES);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1017);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(EXPORT);
				setState(1018);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1019);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(IMPORT);
				setState(1020);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1021);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1022);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(COMPACTIONS);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1023);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1024);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(CREATE);
				setState(1025);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(TABLE);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1026);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1027);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TRANSACTIONS);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1028);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1029);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEXES);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1030);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1031);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(LOCKS);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1032);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(1033);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1034);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(1035);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1036);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1037);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(1038);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(LOCK);
				setState(1039);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(1040);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(LOCK);
				setState(1041);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(DATABASE);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(1042);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(UNLOCK);
				setState(1043);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(1044);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(UNLOCK);
				setState(1045);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(DATABASE);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(1046);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(1047);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TEMPORARY);
				setState(1048);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(MACRO);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(1049);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(1050);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TEMPORARY);
				setState(1051);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(MACRO);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(1052);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1053);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1054);
				tableIdentifier();
				setState(1055);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(1056);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(CLUSTERED);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(1058);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1059);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1060);
				tableIdentifier();
				setState(1061);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(CLUSTERED);
				setState(1062);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(BY);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(1064);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1065);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1066);
				tableIdentifier();
				setState(1067);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(1068);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SORTED);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(1070);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1071);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1072);
				tableIdentifier();
				setState(1073);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SKEWED);
				setState(1074);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(BY);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(1076);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1077);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1078);
				tableIdentifier();
				setState(1079);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(1080);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SKEWED);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(1082);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1083);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1084);
				tableIdentifier();
				setState(1085);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(1086);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(STORED);
				setState(1087);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw5 = match(AS);
				setState(1088);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw6 = match(DIRECTORIES);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(1090);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1091);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1092);
				tableIdentifier();
				setState(1093);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SET);
				setState(1094);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SKEWED);
				setState(1095);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw5 = match(LOCATION);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(1097);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1098);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1099);
				tableIdentifier();
				setState(1100);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(EXCHANGE);
				setState(1101);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(1103);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1104);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1105);
				tableIdentifier();
				setState(1106);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(ARCHIVE);
				setState(1107);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(1109);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1110);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1111);
				tableIdentifier();
				setState(1112);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(UNARCHIVE);
				setState(1113);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(1115);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1116);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1117);
				tableIdentifier();
				setState(1118);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(TOUCH);
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(1120);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1121);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1122);
				tableIdentifier();
				setState(1124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1123);
					partitionSpec();
					}
				}

				setState(1126);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(COMPACT);
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(1128);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1129);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1130);
				tableIdentifier();
				setState(1132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1131);
					partitionSpec();
					}
				}

				setState(1134);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(CONCATENATE);
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(1136);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1137);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1138);
				tableIdentifier();
				setState(1140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1139);
					partitionSpec();
					}
				}

				setState(1142);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SET);
				setState(1143);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(FILEFORMAT);
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(1145);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1146);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1147);
				tableIdentifier();
				setState(1149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1148);
					partitionSpec();
					}
				}

				setState(1151);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(REPLACE);
				setState(1152);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(COLUMNS);
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(1154);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(START);
				setState(1155);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TRANSACTION);
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(1156);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(COMMIT);
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(1157);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ROLLBACK);
				}
				break;
			case 44:
				enterOuterAlt(_localctx, 44);
				{
				setState(1158);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DFS);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateTableHeaderContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode EXTERNAL() { return getToken(SqlBaseParser.EXTERNAL, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public CreateTableHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateTableHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateTableHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateTableHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTableHeaderContext createTableHeader() throws RecognitionException {
		CreateTableHeaderContext _localctx = new CreateTableHeaderContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_createTableHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1161);
			match(CREATE);
			setState(1163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TEMPORARY) {
				{
				setState(1162);
				match(TEMPORARY);
				}
			}

			setState(1166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTERNAL) {
				{
				setState(1165);
				match(EXTERNAL);
				}
			}

			setState(1168);
			match(TABLE);
			setState(1172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				{
				setState(1169);
				match(IF);
				setState(1170);
				match(NOT);
				setState(1171);
				match(EXISTS);
				}
				break;
			}
			setState(1174);
			multipartIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReplaceTableHeaderContext extends ParserRuleContext {
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public ReplaceTableHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_replaceTableHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterReplaceTableHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitReplaceTableHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitReplaceTableHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReplaceTableHeaderContext replaceTableHeader() throws RecognitionException {
		ReplaceTableHeaderContext _localctx = new ReplaceTableHeaderContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_replaceTableHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CREATE) {
				{
				setState(1176);
				match(CREATE);
				setState(1177);
				match(OR);
				}
			}

			setState(1180);
			match(REPLACE);
			setState(1181);
			match(TABLE);
			setState(1182);
			multipartIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BucketSpecContext extends ParserRuleContext {
		public TerminalNode CLUSTERED() { return getToken(SqlBaseParser.CLUSTERED, 0); }
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode INTO() { return getToken(SqlBaseParser.INTO, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode BUCKETS() { return getToken(SqlBaseParser.BUCKETS, 0); }
		public TerminalNode SORTED() { return getToken(SqlBaseParser.SORTED, 0); }
		public OrderedIdentifierListContext orderedIdentifierList() {
			return getRuleContext(OrderedIdentifierListContext.class,0);
		}
		public BucketSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bucketSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBucketSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBucketSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBucketSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BucketSpecContext bucketSpec() throws RecognitionException {
		BucketSpecContext _localctx = new BucketSpecContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_bucketSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1184);
			match(CLUSTERED);
			setState(1185);
			match(BY);
			setState(1186);
			identifierList();
			setState(1190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SORTED) {
				{
				setState(1187);
				match(SORTED);
				setState(1188);
				match(BY);
				setState(1189);
				orderedIdentifierList();
				}
			}

			setState(1192);
			match(INTO);
			setState(1193);
			match(INTEGER_VALUE);
			setState(1194);
			match(BUCKETS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SkewSpecContext extends ParserRuleContext {
		public TerminalNode SKEWED() { return getToken(SqlBaseParser.SKEWED, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public ConstantListContext constantList() {
			return getRuleContext(ConstantListContext.class,0);
		}
		public NestedConstantListContext nestedConstantList() {
			return getRuleContext(NestedConstantListContext.class,0);
		}
		public TerminalNode STORED() { return getToken(SqlBaseParser.STORED, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TerminalNode DIRECTORIES() { return getToken(SqlBaseParser.DIRECTORIES, 0); }
		public SkewSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skewSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSkewSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSkewSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSkewSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SkewSpecContext skewSpec() throws RecognitionException {
		SkewSpecContext _localctx = new SkewSpecContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_skewSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1196);
			match(SKEWED);
			setState(1197);
			match(BY);
			setState(1198);
			identifierList();
			setState(1199);
			match(ON);
			setState(1202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				{
				setState(1200);
				constantList();
				}
				break;
			case 2:
				{
				setState(1201);
				nestedConstantList();
				}
				break;
			}
			setState(1207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				{
				setState(1204);
				match(STORED);
				setState(1205);
				match(AS);
				setState(1206);
				match(DIRECTORIES);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocationSpecContext extends ParserRuleContext {
		public TerminalNode LOCATION() { return getToken(SqlBaseParser.LOCATION, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public LocationSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_locationSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLocationSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLocationSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLocationSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocationSpecContext locationSpec() throws RecognitionException {
		LocationSpecContext _localctx = new LocationSpecContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_locationSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1209);
			match(LOCATION);
			setState(1210);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryContext extends ParserRuleContext {
		public QueryTermContext queryTerm() {
			return getRuleContext(QueryTermContext.class,0);
		}
		public QueryOrganizationContext queryOrganization() {
			return getRuleContext(QueryOrganizationContext.class,0);
		}
		public CtesContext ctes() {
			return getRuleContext(CtesContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1212);
				ctes();
				}
			}

			setState(1215);
			queryTerm(0);
			setState(1216);
			queryOrganization();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InsertIntoContext extends ParserRuleContext {
		public InsertIntoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertInto; }
	 
		public InsertIntoContext() { }
		public void copyFrom(InsertIntoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InsertOverwriteHiveDirContext extends InsertIntoContext {
		public Token path;
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode OVERWRITE() { return getToken(SqlBaseParser.OVERWRITE, 0); }
		public TerminalNode DIRECTORY() { return getToken(SqlBaseParser.DIRECTORY, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode LOCAL() { return getToken(SqlBaseParser.LOCAL, 0); }
		public RowFormatContext rowFormat() {
			return getRuleContext(RowFormatContext.class,0);
		}
		public CreateFileFormatContext createFileFormat() {
			return getRuleContext(CreateFileFormatContext.class,0);
		}
		public InsertOverwriteHiveDirContext(InsertIntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInsertOverwriteHiveDir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInsertOverwriteHiveDir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInsertOverwriteHiveDir(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InsertOverwriteDirContext extends InsertIntoContext {
		public Token path;
		public TablePropertyListContext options;
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode OVERWRITE() { return getToken(SqlBaseParser.OVERWRITE, 0); }
		public TerminalNode DIRECTORY() { return getToken(SqlBaseParser.DIRECTORY, 0); }
		public TableProviderContext tableProvider() {
			return getRuleContext(TableProviderContext.class,0);
		}
		public TerminalNode LOCAL() { return getToken(SqlBaseParser.LOCAL, 0); }
		public TerminalNode OPTIONS() { return getToken(SqlBaseParser.OPTIONS, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public InsertOverwriteDirContext(InsertIntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInsertOverwriteDir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInsertOverwriteDir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInsertOverwriteDir(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InsertOverwriteTableContext extends InsertIntoContext {
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode OVERWRITE() { return getToken(SqlBaseParser.OVERWRITE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public InsertOverwriteTableContext(InsertIntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInsertOverwriteTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInsertOverwriteTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInsertOverwriteTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InsertIntoTableContext extends InsertIntoContext {
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(SqlBaseParser.INTO, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public InsertIntoTableContext(InsertIntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInsertIntoTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInsertIntoTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInsertIntoTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertIntoContext insertInto() throws RecognitionException {
		InsertIntoContext _localctx = new InsertIntoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_insertInto);
		int _la;
		try {
			setState(1273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				_localctx = new InsertOverwriteTableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1218);
				match(INSERT);
				setState(1219);
				match(OVERWRITE);
				setState(1221);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
				case 1:
					{
					setState(1220);
					match(TABLE);
					}
					break;
				}
				setState(1223);
				multipartIdentifier();
				setState(1230);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1224);
					partitionSpec();
					setState(1228);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IF) {
						{
						setState(1225);
						match(IF);
						setState(1226);
						match(NOT);
						setState(1227);
						match(EXISTS);
						}
					}

					}
				}

				}
				break;
			case 2:
				_localctx = new InsertIntoTableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1232);
				match(INSERT);
				setState(1233);
				match(INTO);
				setState(1235);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
				case 1:
					{
					setState(1234);
					match(TABLE);
					}
					break;
				}
				setState(1237);
				multipartIdentifier();
				setState(1239);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1238);
					partitionSpec();
					}
				}

				setState(1244);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(1241);
					match(IF);
					setState(1242);
					match(NOT);
					setState(1243);
					match(EXISTS);
					}
				}

				}
				break;
			case 3:
				_localctx = new InsertOverwriteHiveDirContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1246);
				match(INSERT);
				setState(1247);
				match(OVERWRITE);
				setState(1249);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCAL) {
					{
					setState(1248);
					match(LOCAL);
					}
				}

				setState(1251);
				match(DIRECTORY);
				setState(1252);
				((InsertOverwriteHiveDirContext)_localctx).path = match(STRING);
				setState(1254);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ROW) {
					{
					setState(1253);
					rowFormat();
					}
				}

				setState(1257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STORED) {
					{
					setState(1256);
					createFileFormat();
					}
				}

				}
				break;
			case 4:
				_localctx = new InsertOverwriteDirContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1259);
				match(INSERT);
				setState(1260);
				match(OVERWRITE);
				setState(1262);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCAL) {
					{
					setState(1261);
					match(LOCAL);
					}
				}

				setState(1264);
				match(DIRECTORY);
				setState(1266);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STRING) {
					{
					setState(1265);
					((InsertOverwriteDirContext)_localctx).path = match(STRING);
					}
				}

				setState(1268);
				tableProvider();
				setState(1271);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(1269);
					match(OPTIONS);
					setState(1270);
					((InsertOverwriteDirContext)_localctx).options = tablePropertyList();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionSpecLocationContext extends ParserRuleContext {
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public PartitionSpecLocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionSpecLocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPartitionSpecLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPartitionSpecLocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPartitionSpecLocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionSpecLocationContext partitionSpecLocation() throws RecognitionException {
		PartitionSpecLocationContext _localctx = new PartitionSpecLocationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_partitionSpecLocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1275);
			partitionSpec();
			setState(1277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOCATION) {
				{
				setState(1276);
				locationSpec();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionSpecContext extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public List<PartitionValContext> partitionVal() {
			return getRuleContexts(PartitionValContext.class);
		}
		public PartitionValContext partitionVal(int i) {
			return getRuleContext(PartitionValContext.class,i);
		}
		public PartitionSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPartitionSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPartitionSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPartitionSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionSpecContext partitionSpec() throws RecognitionException {
		PartitionSpecContext _localctx = new PartitionSpecContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_partitionSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1279);
			match(PARTITION);
			setState(1280);
			match(T__0);
			setState(1281);
			partitionVal();
			setState(1286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1282);
				match(T__2);
				setState(1283);
				partitionVal();
				}
				}
				setState(1288);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1289);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionValContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public PartitionValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionVal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPartitionVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPartitionVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPartitionVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionValContext partitionVal() throws RecognitionException {
		PartitionValContext _localctx = new PartitionValContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_partitionVal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1291);
			identifier();
			setState(1294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(1292);
				match(EQ);
				setState(1293);
				constant();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DatabaseContext extends ParserRuleContext {
		public TerminalNode DATABASE() { return getToken(SqlBaseParser.DATABASE, 0); }
		public TerminalNode SCHEMA() { return getToken(SqlBaseParser.SCHEMA, 0); }
		public DatabaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_database; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDatabase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDatabase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDatabase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatabaseContext database() throws RecognitionException {
		DatabaseContext _localctx = new DatabaseContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_database);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1296);
			_la = _input.LA(1);
			if ( !(_la==DATABASE || _la==SCHEMA) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DescribeFuncNameContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public ArithmeticOperatorContext arithmeticOperator() {
			return getRuleContext(ArithmeticOperatorContext.class,0);
		}
		public PredicateOperatorContext predicateOperator() {
			return getRuleContext(PredicateOperatorContext.class,0);
		}
		public DescribeFuncNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_describeFuncName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDescribeFuncName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDescribeFuncName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDescribeFuncName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescribeFuncNameContext describeFuncName() throws RecognitionException {
		DescribeFuncNameContext _localctx = new DescribeFuncNameContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_describeFuncName);
		try {
			setState(1303);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1298);
				qualifiedName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1299);
				match(STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1300);
				comparisonOperator();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1301);
				arithmeticOperator();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1302);
				predicateOperator();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DescribeColNameContext extends ParserRuleContext {
		public IdentifierContext identifier;
		public List<IdentifierContext> nameParts = new ArrayList<IdentifierContext>();
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public DescribeColNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_describeColName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDescribeColName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDescribeColName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDescribeColName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescribeColNameContext describeColName() throws RecognitionException {
		DescribeColNameContext _localctx = new DescribeColNameContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_describeColName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1305);
			((DescribeColNameContext)_localctx).identifier = identifier();
			((DescribeColNameContext)_localctx).nameParts.add(((DescribeColNameContext)_localctx).identifier);
			setState(1310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1306);
				match(T__3);
				setState(1307);
				((DescribeColNameContext)_localctx).identifier = identifier();
				((DescribeColNameContext)_localctx).nameParts.add(((DescribeColNameContext)_localctx).identifier);
				}
				}
				setState(1312);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CtesContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public List<NamedQueryContext> namedQuery() {
			return getRuleContexts(NamedQueryContext.class);
		}
		public NamedQueryContext namedQuery(int i) {
			return getRuleContext(NamedQueryContext.class,i);
		}
		public CtesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCtes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCtes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCtes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CtesContext ctes() throws RecognitionException {
		CtesContext _localctx = new CtesContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_ctes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1313);
			match(WITH);
			setState(1314);
			namedQuery();
			setState(1319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1315);
				match(T__2);
				setState(1316);
				namedQuery();
				}
				}
				setState(1321);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedQueryContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext name;
		public IdentifierListContext columnAliases;
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public NamedQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNamedQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNamedQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNamedQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedQueryContext namedQuery() throws RecognitionException {
		NamedQueryContext _localctx = new NamedQueryContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_namedQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1322);
			((NamedQueryContext)_localctx).name = errorCapturingIdentifier();
			setState(1324);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				{
				setState(1323);
				((NamedQueryContext)_localctx).columnAliases = identifierList();
				}
				break;
			}
			setState(1327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(1326);
				match(AS);
				}
			}

			setState(1329);
			match(T__0);
			setState(1330);
			query();
			setState(1331);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableProviderContext extends ParserRuleContext {
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TableProviderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableProvider; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableProvider(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableProvider(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableProvider(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableProviderContext tableProvider() throws RecognitionException {
		TableProviderContext _localctx = new TableProviderContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_tableProvider);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1333);
			match(USING);
			setState(1334);
			multipartIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateTableClausesContext extends ParserRuleContext {
		public TablePropertyListContext options;
		public TransformListContext partitioning;
		public Token comment;
		public TablePropertyListContext tableProps;
		public List<BucketSpecContext> bucketSpec() {
			return getRuleContexts(BucketSpecContext.class);
		}
		public BucketSpecContext bucketSpec(int i) {
			return getRuleContext(BucketSpecContext.class,i);
		}
		public List<LocationSpecContext> locationSpec() {
			return getRuleContexts(LocationSpecContext.class);
		}
		public LocationSpecContext locationSpec(int i) {
			return getRuleContext(LocationSpecContext.class,i);
		}
		public List<TerminalNode> OPTIONS() { return getTokens(SqlBaseParser.OPTIONS); }
		public TerminalNode OPTIONS(int i) {
			return getToken(SqlBaseParser.OPTIONS, i);
		}
		public List<TerminalNode> PARTITIONED() { return getTokens(SqlBaseParser.PARTITIONED); }
		public TerminalNode PARTITIONED(int i) {
			return getToken(SqlBaseParser.PARTITIONED, i);
		}
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(SqlBaseParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(SqlBaseParser.COMMENT, i);
		}
		public List<TerminalNode> TBLPROPERTIES() { return getTokens(SqlBaseParser.TBLPROPERTIES); }
		public TerminalNode TBLPROPERTIES(int i) {
			return getToken(SqlBaseParser.TBLPROPERTIES, i);
		}
		public List<TablePropertyListContext> tablePropertyList() {
			return getRuleContexts(TablePropertyListContext.class);
		}
		public TablePropertyListContext tablePropertyList(int i) {
			return getRuleContext(TablePropertyListContext.class,i);
		}
		public List<TransformListContext> transformList() {
			return getRuleContexts(TransformListContext.class);
		}
		public TransformListContext transformList(int i) {
			return getRuleContext(TransformListContext.class,i);
		}
		public List<TerminalNode> STRING() { return getTokens(SqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SqlBaseParser.STRING, i);
		}
		public CreateTableClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableClauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateTableClauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateTableClauses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateTableClauses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTableClausesContext createTableClauses() throws RecognitionException {
		CreateTableClausesContext _localctx = new CreateTableClausesContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_createTableClauses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLUSTERED || _la==COMMENT || ((((_la - 140)) & ~0x3f) == 0 && ((1L << (_la - 140)) & ((1L << (LOCATION - 140)) | (1L << (OPTIONS - 140)) | (1L << (PARTITIONED - 140)))) != 0) || _la==TBLPROPERTIES) {
				{
				setState(1347);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPTIONS:
					{
					{
					setState(1336);
					match(OPTIONS);
					setState(1337);
					((CreateTableClausesContext)_localctx).options = tablePropertyList();
					}
					}
					break;
				case PARTITIONED:
					{
					{
					setState(1338);
					match(PARTITIONED);
					setState(1339);
					match(BY);
					setState(1340);
					((CreateTableClausesContext)_localctx).partitioning = transformList();
					}
					}
					break;
				case CLUSTERED:
					{
					setState(1341);
					bucketSpec();
					}
					break;
				case LOCATION:
					{
					setState(1342);
					locationSpec();
					}
					break;
				case COMMENT:
					{
					{
					setState(1343);
					match(COMMENT);
					setState(1344);
					((CreateTableClausesContext)_localctx).comment = match(STRING);
					}
					}
					break;
				case TBLPROPERTIES:
					{
					{
					setState(1345);
					match(TBLPROPERTIES);
					setState(1346);
					((CreateTableClausesContext)_localctx).tableProps = tablePropertyList();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1351);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TablePropertyListContext extends ParserRuleContext {
		public List<TablePropertyContext> tableProperty() {
			return getRuleContexts(TablePropertyContext.class);
		}
		public TablePropertyContext tableProperty(int i) {
			return getRuleContext(TablePropertyContext.class,i);
		}
		public TablePropertyListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePropertyList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTablePropertyList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTablePropertyList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTablePropertyList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyListContext tablePropertyList() throws RecognitionException {
		TablePropertyListContext _localctx = new TablePropertyListContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_tablePropertyList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1352);
			match(T__0);
			setState(1353);
			tableProperty();
			setState(1358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1354);
				match(T__2);
				setState(1355);
				tableProperty();
				}
				}
				setState(1360);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1361);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TablePropertyContext extends ParserRuleContext {
		public TablePropertyKeyContext key;
		public TablePropertyValueContext value;
		public TablePropertyKeyContext tablePropertyKey() {
			return getRuleContext(TablePropertyKeyContext.class,0);
		}
		public TablePropertyValueContext tablePropertyValue() {
			return getRuleContext(TablePropertyValueContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public TablePropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyContext tableProperty() throws RecognitionException {
		TablePropertyContext _localctx = new TablePropertyContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_tableProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1363);
			((TablePropertyContext)_localctx).key = tablePropertyKey();
			setState(1368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FALSE || ((((_la - 251)) & ~0x3f) == 0 && ((1L << (_la - 251)) & ((1L << (TRUE - 251)) | (1L << (EQ - 251)) | (1L << (STRING - 251)) | (1L << (INTEGER_VALUE - 251)) | (1L << (DECIMAL_VALUE - 251)))) != 0)) {
				{
				setState(1365);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ) {
					{
					setState(1364);
					match(EQ);
					}
				}

				setState(1367);
				((TablePropertyContext)_localctx).value = tablePropertyValue();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TablePropertyKeyContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TablePropertyKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePropertyKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTablePropertyKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTablePropertyKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTablePropertyKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyKeyContext tablePropertyKey() throws RecognitionException {
		TablePropertyKeyContext _localctx = new TablePropertyKeyContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_tablePropertyKey);
		int _la;
		try {
			setState(1379);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1370);
				identifier();
				setState(1375);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1371);
					match(T__3);
					setState(1372);
					identifier();
					}
					}
					setState(1377);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1378);
				match(STRING);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TablePropertyValueContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(SqlBaseParser.DECIMAL_VALUE, 0); }
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TablePropertyValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePropertyValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTablePropertyValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTablePropertyValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTablePropertyValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyValueContext tablePropertyValue() throws RecognitionException {
		TablePropertyValueContext _localctx = new TablePropertyValueContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_tablePropertyValue);
		try {
			setState(1385);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1381);
				match(INTEGER_VALUE);
				}
				break;
			case DECIMAL_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1382);
				match(DECIMAL_VALUE);
				}
				break;
			case FALSE:
			case TRUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1383);
				booleanValue();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(1384);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantListContext extends ParserRuleContext {
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public ConstantListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterConstantList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitConstantList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitConstantList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantListContext constantList() throws RecognitionException {
		ConstantListContext _localctx = new ConstantListContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_constantList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1387);
			match(T__0);
			setState(1388);
			constant();
			setState(1393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1389);
				match(T__2);
				setState(1390);
				constant();
				}
				}
				setState(1395);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1396);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NestedConstantListContext extends ParserRuleContext {
		public List<ConstantListContext> constantList() {
			return getRuleContexts(ConstantListContext.class);
		}
		public ConstantListContext constantList(int i) {
			return getRuleContext(ConstantListContext.class,i);
		}
		public NestedConstantListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedConstantList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNestedConstantList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNestedConstantList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNestedConstantList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NestedConstantListContext nestedConstantList() throws RecognitionException {
		NestedConstantListContext _localctx = new NestedConstantListContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_nestedConstantList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1398);
			match(T__0);
			setState(1399);
			constantList();
			setState(1404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1400);
				match(T__2);
				setState(1401);
				constantList();
				}
				}
				setState(1406);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1407);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateFileFormatContext extends ParserRuleContext {
		public TerminalNode STORED() { return getToken(SqlBaseParser.STORED, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public FileFormatContext fileFormat() {
			return getRuleContext(FileFormatContext.class,0);
		}
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public StorageHandlerContext storageHandler() {
			return getRuleContext(StorageHandlerContext.class,0);
		}
		public CreateFileFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createFileFormat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateFileFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateFileFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateFileFormat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateFileFormatContext createFileFormat() throws RecognitionException {
		CreateFileFormatContext _localctx = new CreateFileFormatContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_createFileFormat);
		try {
			setState(1415);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1409);
				match(STORED);
				setState(1410);
				match(AS);
				setState(1411);
				fileFormat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1412);
				match(STORED);
				setState(1413);
				match(BY);
				setState(1414);
				storageHandler();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FileFormatContext extends ParserRuleContext {
		public FileFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileFormat; }
	 
		public FileFormatContext() { }
		public void copyFrom(FileFormatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TableFileFormatContext extends FileFormatContext {
		public Token inFmt;
		public Token outFmt;
		public TerminalNode INPUTFORMAT() { return getToken(SqlBaseParser.INPUTFORMAT, 0); }
		public TerminalNode OUTPUTFORMAT() { return getToken(SqlBaseParser.OUTPUTFORMAT, 0); }
		public List<TerminalNode> STRING() { return getTokens(SqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SqlBaseParser.STRING, i);
		}
		public TableFileFormatContext(FileFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableFileFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableFileFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableFileFormat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GenericFileFormatContext extends FileFormatContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public GenericFileFormatContext(FileFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterGenericFileFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitGenericFileFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitGenericFileFormat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileFormatContext fileFormat() throws RecognitionException {
		FileFormatContext _localctx = new FileFormatContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_fileFormat);
		try {
			setState(1422);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				_localctx = new TableFileFormatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1417);
				match(INPUTFORMAT);
				setState(1418);
				((TableFileFormatContext)_localctx).inFmt = match(STRING);
				setState(1419);
				match(OUTPUTFORMAT);
				setState(1420);
				((TableFileFormatContext)_localctx).outFmt = match(STRING);
				}
				break;
			case 2:
				_localctx = new GenericFileFormatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1421);
				identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StorageHandlerContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SqlBaseParser.SERDEPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public StorageHandlerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageHandler; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStorageHandler(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStorageHandler(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStorageHandler(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StorageHandlerContext storageHandler() throws RecognitionException {
		StorageHandlerContext _localctx = new StorageHandlerContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_storageHandler);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1424);
			match(STRING);
			setState(1428);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
			case 1:
				{
				setState(1425);
				match(WITH);
				setState(1426);
				match(SERDEPROPERTIES);
				setState(1427);
				tablePropertyList();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitResource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_resource);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1430);
			identifier();
			setState(1431);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DmlStatementNoWithContext extends ParserRuleContext {
		public DmlStatementNoWithContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dmlStatementNoWith; }
	 
		public DmlStatementNoWithContext() { }
		public void copyFrom(DmlStatementNoWithContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeleteFromTableContext extends DmlStatementNoWithContext {
		public TerminalNode DELETE() { return getToken(SqlBaseParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public DeleteFromTableContext(DmlStatementNoWithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDeleteFromTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDeleteFromTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDeleteFromTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SingleInsertQueryContext extends DmlStatementNoWithContext {
		public InsertIntoContext insertInto() {
			return getRuleContext(InsertIntoContext.class,0);
		}
		public QueryTermContext queryTerm() {
			return getRuleContext(QueryTermContext.class,0);
		}
		public QueryOrganizationContext queryOrganization() {
			return getRuleContext(QueryOrganizationContext.class,0);
		}
		public SingleInsertQueryContext(DmlStatementNoWithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleInsertQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleInsertQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleInsertQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiInsertQueryContext extends DmlStatementNoWithContext {
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public List<MultiInsertQueryBodyContext> multiInsertQueryBody() {
			return getRuleContexts(MultiInsertQueryBodyContext.class);
		}
		public MultiInsertQueryBodyContext multiInsertQueryBody(int i) {
			return getRuleContext(MultiInsertQueryBodyContext.class,i);
		}
		public MultiInsertQueryContext(DmlStatementNoWithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterMultiInsertQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitMultiInsertQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitMultiInsertQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UpdateTableContext extends DmlStatementNoWithContext {
		public TerminalNode UPDATE() { return getToken(SqlBaseParser.UPDATE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public SetClauseContext setClause() {
			return getRuleContext(SetClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public UpdateTableContext(DmlStatementNoWithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUpdateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUpdateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUpdateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MergeIntoTableContext extends DmlStatementNoWithContext {
		public MultipartIdentifierContext target;
		public TableAliasContext targetAlias;
		public MultipartIdentifierContext source;
		public QueryContext sourceQuery;
		public TableAliasContext sourceAlias;
		public BooleanExpressionContext mergeCondition;
		public TerminalNode MERGE() { return getToken(SqlBaseParser.MERGE, 0); }
		public TerminalNode INTO() { return getToken(SqlBaseParser.INTO, 0); }
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public List<MultipartIdentifierContext> multipartIdentifier() {
			return getRuleContexts(MultipartIdentifierContext.class);
		}
		public MultipartIdentifierContext multipartIdentifier(int i) {
			return getRuleContext(MultipartIdentifierContext.class,i);
		}
		public List<TableAliasContext> tableAlias() {
			return getRuleContexts(TableAliasContext.class);
		}
		public TableAliasContext tableAlias(int i) {
			return getRuleContext(TableAliasContext.class,i);
		}
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public List<MatchedClauseContext> matchedClause() {
			return getRuleContexts(MatchedClauseContext.class);
		}
		public MatchedClauseContext matchedClause(int i) {
			return getRuleContext(MatchedClauseContext.class,i);
		}
		public List<NotMatchedClauseContext> notMatchedClause() {
			return getRuleContexts(NotMatchedClauseContext.class);
		}
		public NotMatchedClauseContext notMatchedClause(int i) {
			return getRuleContext(NotMatchedClauseContext.class,i);
		}
		public MergeIntoTableContext(DmlStatementNoWithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterMergeIntoTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitMergeIntoTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitMergeIntoTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DmlStatementNoWithContext dmlStatementNoWith() throws RecognitionException {
		DmlStatementNoWithContext _localctx = new DmlStatementNoWithContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_dmlStatementNoWith);
		int _la;
		try {
			int _alt;
			setState(1484);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INSERT:
				_localctx = new SingleInsertQueryContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1433);
				insertInto();
				setState(1434);
				queryTerm(0);
				setState(1435);
				queryOrganization();
				}
				break;
			case FROM:
				_localctx = new MultiInsertQueryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1437);
				fromClause();
				setState(1439); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1438);
					multiInsertQueryBody();
					}
					}
					setState(1441); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==INSERT );
				}
				break;
			case DELETE:
				_localctx = new DeleteFromTableContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1443);
				match(DELETE);
				setState(1444);
				match(FROM);
				setState(1445);
				multipartIdentifier();
				setState(1446);
				tableAlias();
				setState(1448);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(1447);
					whereClause();
					}
				}

				}
				break;
			case UPDATE:
				_localctx = new UpdateTableContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1450);
				match(UPDATE);
				setState(1451);
				multipartIdentifier();
				setState(1452);
				tableAlias();
				setState(1453);
				setClause();
				setState(1455);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(1454);
					whereClause();
					}
				}

				}
				break;
			case MERGE:
				_localctx = new MergeIntoTableContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1457);
				match(MERGE);
				setState(1458);
				match(INTO);
				setState(1459);
				((MergeIntoTableContext)_localctx).target = multipartIdentifier();
				setState(1460);
				((MergeIntoTableContext)_localctx).targetAlias = tableAlias();
				setState(1461);
				match(USING);
				setState(1467);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
				case 1:
					{
					setState(1462);
					((MergeIntoTableContext)_localctx).source = multipartIdentifier();
					}
					break;
				case 2:
					{
					setState(1463);
					match(T__0);
					setState(1464);
					((MergeIntoTableContext)_localctx).sourceQuery = query();
					setState(1465);
					match(T__1);
					}
					break;
				}
				setState(1469);
				((MergeIntoTableContext)_localctx).sourceAlias = tableAlias();
				setState(1470);
				match(ON);
				setState(1471);
				((MergeIntoTableContext)_localctx).mergeCondition = booleanExpression(0);
				setState(1475);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,163,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1472);
						matchedClause();
						}
						} 
					}
					setState(1477);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,163,_ctx);
				}
				setState(1481);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHEN) {
					{
					{
					setState(1478);
					notMatchedClause();
					}
					}
					setState(1483);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryOrganizationContext extends ParserRuleContext {
		public SortItemContext sortItem;
		public List<SortItemContext> order = new ArrayList<SortItemContext>();
		public ExpressionContext expression;
		public List<ExpressionContext> clusterBy = new ArrayList<ExpressionContext>();
		public List<ExpressionContext> distributeBy = new ArrayList<ExpressionContext>();
		public List<SortItemContext> sort = new ArrayList<SortItemContext>();
		public ExpressionContext limit;
		public TerminalNode ORDER() { return getToken(SqlBaseParser.ORDER, 0); }
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public TerminalNode CLUSTER() { return getToken(SqlBaseParser.CLUSTER, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(SqlBaseParser.DISTRIBUTE, 0); }
		public TerminalNode SORT() { return getToken(SqlBaseParser.SORT, 0); }
		public WindowClauseContext windowClause() {
			return getRuleContext(WindowClauseContext.class,0);
		}
		public TerminalNode LIMIT() { return getToken(SqlBaseParser.LIMIT, 0); }
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public QueryOrganizationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryOrganization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQueryOrganization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQueryOrganization(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQueryOrganization(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryOrganizationContext queryOrganization() throws RecognitionException {
		QueryOrganizationContext _localctx = new QueryOrganizationContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_queryOrganization);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1496);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
			case 1:
				{
				setState(1486);
				match(ORDER);
				setState(1487);
				match(BY);
				setState(1488);
				((QueryOrganizationContext)_localctx).sortItem = sortItem();
				((QueryOrganizationContext)_localctx).order.add(((QueryOrganizationContext)_localctx).sortItem);
				setState(1493);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,166,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1489);
						match(T__2);
						setState(1490);
						((QueryOrganizationContext)_localctx).sortItem = sortItem();
						((QueryOrganizationContext)_localctx).order.add(((QueryOrganizationContext)_localctx).sortItem);
						}
						} 
					}
					setState(1495);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,166,_ctx);
				}
				}
				break;
			}
			setState(1508);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
			case 1:
				{
				setState(1498);
				match(CLUSTER);
				setState(1499);
				match(BY);
				setState(1500);
				((QueryOrganizationContext)_localctx).expression = expression();
				((QueryOrganizationContext)_localctx).clusterBy.add(((QueryOrganizationContext)_localctx).expression);
				setState(1505);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,168,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1501);
						match(T__2);
						setState(1502);
						((QueryOrganizationContext)_localctx).expression = expression();
						((QueryOrganizationContext)_localctx).clusterBy.add(((QueryOrganizationContext)_localctx).expression);
						}
						} 
					}
					setState(1507);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,168,_ctx);
				}
				}
				break;
			}
			setState(1520);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
			case 1:
				{
				setState(1510);
				match(DISTRIBUTE);
				setState(1511);
				match(BY);
				setState(1512);
				((QueryOrganizationContext)_localctx).expression = expression();
				((QueryOrganizationContext)_localctx).distributeBy.add(((QueryOrganizationContext)_localctx).expression);
				setState(1517);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,170,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1513);
						match(T__2);
						setState(1514);
						((QueryOrganizationContext)_localctx).expression = expression();
						((QueryOrganizationContext)_localctx).distributeBy.add(((QueryOrganizationContext)_localctx).expression);
						}
						} 
					}
					setState(1519);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,170,_ctx);
				}
				}
				break;
			}
			setState(1532);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
			case 1:
				{
				setState(1522);
				match(SORT);
				setState(1523);
				match(BY);
				setState(1524);
				((QueryOrganizationContext)_localctx).sortItem = sortItem();
				((QueryOrganizationContext)_localctx).sort.add(((QueryOrganizationContext)_localctx).sortItem);
				setState(1529);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,172,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1525);
						match(T__2);
						setState(1526);
						((QueryOrganizationContext)_localctx).sortItem = sortItem();
						((QueryOrganizationContext)_localctx).sort.add(((QueryOrganizationContext)_localctx).sortItem);
						}
						} 
					}
					setState(1531);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,172,_ctx);
				}
				}
				break;
			}
			setState(1535);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
			case 1:
				{
				setState(1534);
				windowClause();
				}
				break;
			}
			setState(1542);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
			case 1:
				{
				setState(1537);
				match(LIMIT);
				setState(1540);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
				case 1:
					{
					setState(1538);
					match(ALL);
					}
					break;
				case 2:
					{
					setState(1539);
					((QueryOrganizationContext)_localctx).limit = expression();
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiInsertQueryBodyContext extends ParserRuleContext {
		public InsertIntoContext insertInto() {
			return getRuleContext(InsertIntoContext.class,0);
		}
		public FromStatementBodyContext fromStatementBody() {
			return getRuleContext(FromStatementBodyContext.class,0);
		}
		public MultiInsertQueryBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiInsertQueryBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterMultiInsertQueryBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitMultiInsertQueryBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitMultiInsertQueryBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiInsertQueryBodyContext multiInsertQueryBody() throws RecognitionException {
		MultiInsertQueryBodyContext _localctx = new MultiInsertQueryBodyContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_multiInsertQueryBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1544);
			insertInto();
			setState(1545);
			fromStatementBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryTermContext extends ParserRuleContext {
		public QueryTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryTerm; }
	 
		public QueryTermContext() { }
		public void copyFrom(QueryTermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class QueryTermDefaultContext extends QueryTermContext {
		public QueryPrimaryContext queryPrimary() {
			return getRuleContext(QueryPrimaryContext.class,0);
		}
		public QueryTermDefaultContext(QueryTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQueryTermDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQueryTermDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQueryTermDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetOperationContext extends QueryTermContext {
		public QueryTermContext left;
		public Token operator;
		public QueryTermContext right;
		public List<QueryTermContext> queryTerm() {
			return getRuleContexts(QueryTermContext.class);
		}
		public QueryTermContext queryTerm(int i) {
			return getRuleContext(QueryTermContext.class,i);
		}
		public TerminalNode INTERSECT() { return getToken(SqlBaseParser.INTERSECT, 0); }
		public TerminalNode UNION() { return getToken(SqlBaseParser.UNION, 0); }
		public TerminalNode EXCEPT() { return getToken(SqlBaseParser.EXCEPT, 0); }
		public TerminalNode SETMINUS() { return getToken(SqlBaseParser.SETMINUS, 0); }
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public SetOperationContext(QueryTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryTermContext queryTerm() throws RecognitionException {
		return queryTerm(0);
	}

	private QueryTermContext queryTerm(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		QueryTermContext _localctx = new QueryTermContext(_ctx, _parentState);
		QueryTermContext _prevctx = _localctx;
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_queryTerm, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new QueryTermDefaultContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1548);
			queryPrimary();
			}
			_ctx.stop = _input.LT(-1);
			setState(1573);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,181,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1571);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
					case 1:
						{
						_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
						((SetOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
						setState(1550);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1551);
						if (!(legacy_setops_precedence_enbled)) throw new FailedPredicateException(this, "legacy_setops_precedence_enbled");
						setState(1552);
						((SetOperationContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EXCEPT || _la==INTERSECT || _la==SETMINUS || _la==UNION) ) {
							((SetOperationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1554);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ALL || _la==DISTINCT) {
							{
							setState(1553);
							setQuantifier();
							}
						}

						setState(1556);
						((SetOperationContext)_localctx).right = queryTerm(4);
						}
						break;
					case 2:
						{
						_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
						((SetOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
						setState(1557);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1558);
						if (!(!legacy_setops_precedence_enbled)) throw new FailedPredicateException(this, "!legacy_setops_precedence_enbled");
						setState(1559);
						((SetOperationContext)_localctx).operator = match(INTERSECT);
						setState(1561);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ALL || _la==DISTINCT) {
							{
							setState(1560);
							setQuantifier();
							}
						}

						setState(1563);
						((SetOperationContext)_localctx).right = queryTerm(3);
						}
						break;
					case 3:
						{
						_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
						((SetOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
						setState(1564);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1565);
						if (!(!legacy_setops_precedence_enbled)) throw new FailedPredicateException(this, "!legacy_setops_precedence_enbled");
						setState(1566);
						((SetOperationContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EXCEPT || _la==SETMINUS || _la==UNION) ) {
							((SetOperationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1568);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ALL || _la==DISTINCT) {
							{
							setState(1567);
							setQuantifier();
							}
						}

						setState(1570);
						((SetOperationContext)_localctx).right = queryTerm(2);
						}
						break;
					}
					} 
				}
				setState(1575);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,181,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class QueryPrimaryContext extends ParserRuleContext {
		public QueryPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryPrimary; }
	 
		public QueryPrimaryContext() { }
		public void copyFrom(QueryPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SubqueryContext extends QueryPrimaryContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public SubqueryContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSubquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSubquery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class QueryPrimaryDefaultContext extends QueryPrimaryContext {
		public QuerySpecificationContext querySpecification() {
			return getRuleContext(QuerySpecificationContext.class,0);
		}
		public QueryPrimaryDefaultContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQueryPrimaryDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQueryPrimaryDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQueryPrimaryDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InlineTableDefault1Context extends QueryPrimaryContext {
		public InlineTableContext inlineTable() {
			return getRuleContext(InlineTableContext.class,0);
		}
		public InlineTableDefault1Context(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInlineTableDefault1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInlineTableDefault1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInlineTableDefault1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FromStmtContext extends QueryPrimaryContext {
		public FromStatementContext fromStatement() {
			return getRuleContext(FromStatementContext.class,0);
		}
		public FromStmtContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFromStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFromStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFromStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableContext extends QueryPrimaryContext {
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TableContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryPrimaryContext queryPrimary() throws RecognitionException {
		QueryPrimaryContext _localctx = new QueryPrimaryContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_queryPrimary);
		try {
			setState(1585);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAP:
			case REDUCE:
			case SELECT:
				_localctx = new QueryPrimaryDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1576);
				querySpecification();
				}
				break;
			case FROM:
				_localctx = new FromStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1577);
				fromStatement();
				}
				break;
			case TABLE:
				_localctx = new TableContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1578);
				match(TABLE);
				setState(1579);
				multipartIdentifier();
				}
				break;
			case VALUES:
				_localctx = new InlineTableDefault1Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1580);
				inlineTable();
				}
				break;
			case T__0:
				_localctx = new SubqueryContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1581);
				match(T__0);
				setState(1582);
				query();
				setState(1583);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SortItemContext extends ParserRuleContext {
		public Token ordering;
		public Token nullOrder;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public TerminalNode ASC() { return getToken(SqlBaseParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode LAST() { return getToken(SqlBaseParser.LAST, 0); }
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public SortItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSortItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSortItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSortItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SortItemContext sortItem() throws RecognitionException {
		SortItemContext _localctx = new SortItemContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_sortItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1587);
			expression();
			setState(1589);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
			case 1:
				{
				setState(1588);
				((SortItemContext)_localctx).ordering = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((SortItemContext)_localctx).ordering = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(1593);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
			case 1:
				{
				setState(1591);
				match(NULLS);
				setState(1592);
				((SortItemContext)_localctx).nullOrder = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FIRST || _la==LAST) ) {
					((SortItemContext)_localctx).nullOrder = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FromStatementContext extends ParserRuleContext {
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public List<FromStatementBodyContext> fromStatementBody() {
			return getRuleContexts(FromStatementBodyContext.class);
		}
		public FromStatementBodyContext fromStatementBody(int i) {
			return getRuleContext(FromStatementBodyContext.class,i);
		}
		public FromStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFromStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFromStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFromStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromStatementContext fromStatement() throws RecognitionException {
		FromStatementContext _localctx = new FromStatementContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_fromStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1595);
			fromClause();
			setState(1597); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1596);
					fromStatementBody();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1599); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,185,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FromStatementBodyContext extends ParserRuleContext {
		public TransformClauseContext transformClause() {
			return getRuleContext(TransformClauseContext.class,0);
		}
		public QueryOrganizationContext queryOrganization() {
			return getRuleContext(QueryOrganizationContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public SelectClauseContext selectClause() {
			return getRuleContext(SelectClauseContext.class,0);
		}
		public List<LateralViewContext> lateralView() {
			return getRuleContexts(LateralViewContext.class);
		}
		public LateralViewContext lateralView(int i) {
			return getRuleContext(LateralViewContext.class,i);
		}
		public AggregationClauseContext aggregationClause() {
			return getRuleContext(AggregationClauseContext.class,0);
		}
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public WindowClauseContext windowClause() {
			return getRuleContext(WindowClauseContext.class,0);
		}
		public FromStatementBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromStatementBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFromStatementBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFromStatementBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFromStatementBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromStatementBodyContext fromStatementBody() throws RecognitionException {
		FromStatementBodyContext _localctx = new FromStatementBodyContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_fromStatementBody);
		try {
			int _alt;
			setState(1628);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1601);
				transformClause();
				setState(1603);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
				case 1:
					{
					setState(1602);
					whereClause();
					}
					break;
				}
				setState(1605);
				queryOrganization();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1607);
				selectClause();
				setState(1611);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,187,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1608);
						lateralView();
						}
						} 
					}
					setState(1613);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,187,_ctx);
				}
				setState(1615);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
				case 1:
					{
					setState(1614);
					whereClause();
					}
					break;
				}
				setState(1618);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
				case 1:
					{
					setState(1617);
					aggregationClause();
					}
					break;
				}
				setState(1621);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
				case 1:
					{
					setState(1620);
					havingClause();
					}
					break;
				}
				setState(1624);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
				case 1:
					{
					setState(1623);
					windowClause();
					}
					break;
				}
				setState(1626);
				queryOrganization();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuerySpecificationContext extends ParserRuleContext {
		public QuerySpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_querySpecification; }
	 
		public QuerySpecificationContext() { }
		public void copyFrom(QuerySpecificationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RegularQuerySpecificationContext extends QuerySpecificationContext {
		public SelectClauseContext selectClause() {
			return getRuleContext(SelectClauseContext.class,0);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public List<LateralViewContext> lateralView() {
			return getRuleContexts(LateralViewContext.class);
		}
		public LateralViewContext lateralView(int i) {
			return getRuleContext(LateralViewContext.class,i);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public AggregationClauseContext aggregationClause() {
			return getRuleContext(AggregationClauseContext.class,0);
		}
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public WindowClauseContext windowClause() {
			return getRuleContext(WindowClauseContext.class,0);
		}
		public RegularQuerySpecificationContext(QuerySpecificationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRegularQuerySpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRegularQuerySpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRegularQuerySpecification(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TransformQuerySpecificationContext extends QuerySpecificationContext {
		public TransformClauseContext transformClause() {
			return getRuleContext(TransformClauseContext.class,0);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public TransformQuerySpecificationContext(QuerySpecificationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTransformQuerySpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTransformQuerySpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTransformQuerySpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuerySpecificationContext querySpecification() throws RecognitionException {
		QuerySpecificationContext _localctx = new QuerySpecificationContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_querySpecification);
		try {
			int _alt;
			setState(1659);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
			case 1:
				_localctx = new TransformQuerySpecificationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1630);
				transformClause();
				setState(1632);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
				case 1:
					{
					setState(1631);
					fromClause();
					}
					break;
				}
				setState(1635);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
				case 1:
					{
					setState(1634);
					whereClause();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new RegularQuerySpecificationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1637);
				selectClause();
				setState(1639);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
				case 1:
					{
					setState(1638);
					fromClause();
					}
					break;
				}
				setState(1644);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,196,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1641);
						lateralView();
						}
						} 
					}
					setState(1646);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,196,_ctx);
				}
				setState(1648);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
				case 1:
					{
					setState(1647);
					whereClause();
					}
					break;
				}
				setState(1651);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
				case 1:
					{
					setState(1650);
					aggregationClause();
					}
					break;
				}
				setState(1654);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
				case 1:
					{
					setState(1653);
					havingClause();
					}
					break;
				}
				setState(1657);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
				case 1:
					{
					setState(1656);
					windowClause();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TransformClauseContext extends ParserRuleContext {
		public Token kind;
		public RowFormatContext inRowFormat;
		public Token recordWriter;
		public Token script;
		public RowFormatContext outRowFormat;
		public Token recordReader;
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public List<TerminalNode> STRING() { return getTokens(SqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SqlBaseParser.STRING, i);
		}
		public TerminalNode SELECT() { return getToken(SqlBaseParser.SELECT, 0); }
		public NamedExpressionSeqContext namedExpressionSeq() {
			return getRuleContext(NamedExpressionSeqContext.class,0);
		}
		public TerminalNode TRANSFORM() { return getToken(SqlBaseParser.TRANSFORM, 0); }
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode REDUCE() { return getToken(SqlBaseParser.REDUCE, 0); }
		public TerminalNode RECORDWRITER() { return getToken(SqlBaseParser.RECORDWRITER, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TerminalNode RECORDREADER() { return getToken(SqlBaseParser.RECORDREADER, 0); }
		public List<RowFormatContext> rowFormat() {
			return getRuleContexts(RowFormatContext.class);
		}
		public RowFormatContext rowFormat(int i) {
			return getRuleContext(RowFormatContext.class,i);
		}
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TransformClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transformClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTransformClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTransformClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTransformClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransformClauseContext transformClause() throws RecognitionException {
		TransformClauseContext _localctx = new TransformClauseContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_transformClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1671);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				{
				setState(1661);
				match(SELECT);
				setState(1662);
				((TransformClauseContext)_localctx).kind = match(TRANSFORM);
				setState(1663);
				match(T__0);
				setState(1664);
				namedExpressionSeq();
				setState(1665);
				match(T__1);
				}
				break;
			case MAP:
				{
				setState(1667);
				((TransformClauseContext)_localctx).kind = match(MAP);
				setState(1668);
				namedExpressionSeq();
				}
				break;
			case REDUCE:
				{
				setState(1669);
				((TransformClauseContext)_localctx).kind = match(REDUCE);
				setState(1670);
				namedExpressionSeq();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1674);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ROW) {
				{
				setState(1673);
				((TransformClauseContext)_localctx).inRowFormat = rowFormat();
				}
			}

			setState(1678);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RECORDWRITER) {
				{
				setState(1676);
				match(RECORDWRITER);
				setState(1677);
				((TransformClauseContext)_localctx).recordWriter = match(STRING);
				}
			}

			setState(1680);
			match(USING);
			setState(1681);
			((TransformClauseContext)_localctx).script = match(STRING);
			setState(1694);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
			case 1:
				{
				setState(1682);
				match(AS);
				setState(1692);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
				case 1:
					{
					setState(1683);
					identifierSeq();
					}
					break;
				case 2:
					{
					setState(1684);
					colTypeList();
					}
					break;
				case 3:
					{
					{
					setState(1685);
					match(T__0);
					setState(1688);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
					case 1:
						{
						setState(1686);
						identifierSeq();
						}
						break;
					case 2:
						{
						setState(1687);
						colTypeList();
						}
						break;
					}
					setState(1690);
					match(T__1);
					}
					}
					break;
				}
				}
				break;
			}
			setState(1697);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
			case 1:
				{
				setState(1696);
				((TransformClauseContext)_localctx).outRowFormat = rowFormat();
				}
				break;
			}
			setState(1701);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
			case 1:
				{
				setState(1699);
				match(RECORDREADER);
				setState(1700);
				((TransformClauseContext)_localctx).recordReader = match(STRING);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectClauseContext extends ParserRuleContext {
		public HintContext hint;
		public List<HintContext> hints = new ArrayList<HintContext>();
		public TerminalNode SELECT() { return getToken(SqlBaseParser.SELECT, 0); }
		public NamedExpressionSeqContext namedExpressionSeq() {
			return getRuleContext(NamedExpressionSeqContext.class,0);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public List<HintContext> hint() {
			return getRuleContexts(HintContext.class);
		}
		public HintContext hint(int i) {
			return getRuleContext(HintContext.class,i);
		}
		public SelectClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSelectClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSelectClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSelectClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectClauseContext selectClause() throws RecognitionException {
		SelectClauseContext _localctx = new SelectClauseContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_selectClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1703);
			match(SELECT);
			setState(1707);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,210,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1704);
					((SelectClauseContext)_localctx).hint = hint();
					((SelectClauseContext)_localctx).hints.add(((SelectClauseContext)_localctx).hint);
					}
					} 
				}
				setState(1709);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,210,_ctx);
			}
			setState(1711);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
			case 1:
				{
				setState(1710);
				setQuantifier();
				}
				break;
			}
			setState(1713);
			namedExpressionSeq();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetClauseContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public AssignmentListContext assignmentList() {
			return getRuleContext(AssignmentListContext.class,0);
		}
		public SetClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetClauseContext setClause() throws RecognitionException {
		SetClauseContext _localctx = new SetClauseContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_setClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1715);
			match(SET);
			setState(1716);
			assignmentList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MatchedClauseContext extends ParserRuleContext {
		public BooleanExpressionContext matchedCond;
		public TerminalNode WHEN() { return getToken(SqlBaseParser.WHEN, 0); }
		public TerminalNode MATCHED() { return getToken(SqlBaseParser.MATCHED, 0); }
		public TerminalNode THEN() { return getToken(SqlBaseParser.THEN, 0); }
		public MatchedActionContext matchedAction() {
			return getRuleContext(MatchedActionContext.class,0);
		}
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public MatchedClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchedClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterMatchedClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitMatchedClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitMatchedClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchedClauseContext matchedClause() throws RecognitionException {
		MatchedClauseContext _localctx = new MatchedClauseContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_matchedClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1718);
			match(WHEN);
			setState(1719);
			match(MATCHED);
			setState(1722);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AND) {
				{
				setState(1720);
				match(AND);
				setState(1721);
				((MatchedClauseContext)_localctx).matchedCond = booleanExpression(0);
				}
			}

			setState(1724);
			match(THEN);
			setState(1725);
			matchedAction();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NotMatchedClauseContext extends ParserRuleContext {
		public BooleanExpressionContext notMatchedCond;
		public TerminalNode WHEN() { return getToken(SqlBaseParser.WHEN, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode MATCHED() { return getToken(SqlBaseParser.MATCHED, 0); }
		public TerminalNode THEN() { return getToken(SqlBaseParser.THEN, 0); }
		public NotMatchedActionContext notMatchedAction() {
			return getRuleContext(NotMatchedActionContext.class,0);
		}
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public NotMatchedClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notMatchedClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNotMatchedClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNotMatchedClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNotMatchedClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotMatchedClauseContext notMatchedClause() throws RecognitionException {
		NotMatchedClauseContext _localctx = new NotMatchedClauseContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_notMatchedClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1727);
			match(WHEN);
			setState(1728);
			match(NOT);
			setState(1729);
			match(MATCHED);
			setState(1732);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AND) {
				{
				setState(1730);
				match(AND);
				setState(1731);
				((NotMatchedClauseContext)_localctx).notMatchedCond = booleanExpression(0);
				}
			}

			setState(1734);
			match(THEN);
			setState(1735);
			notMatchedAction();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MatchedActionContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(SqlBaseParser.DELETE, 0); }
		public TerminalNode UPDATE() { return getToken(SqlBaseParser.UPDATE, 0); }
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public AssignmentListContext assignmentList() {
			return getRuleContext(AssignmentListContext.class,0);
		}
		public MatchedActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchedAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterMatchedAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitMatchedAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitMatchedAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchedActionContext matchedAction() throws RecognitionException {
		MatchedActionContext _localctx = new MatchedActionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_matchedAction);
		try {
			setState(1744);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1737);
				match(DELETE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1738);
				match(UPDATE);
				setState(1739);
				match(SET);
				setState(1740);
				match(ASTERISK);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1741);
				match(UPDATE);
				setState(1742);
				match(SET);
				setState(1743);
				assignmentList();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NotMatchedActionContext extends ParserRuleContext {
		public MultipartIdentifierListContext columns;
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public TerminalNode VALUES() { return getToken(SqlBaseParser.VALUES, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MultipartIdentifierListContext multipartIdentifierList() {
			return getRuleContext(MultipartIdentifierListContext.class,0);
		}
		public NotMatchedActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notMatchedAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNotMatchedAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNotMatchedAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNotMatchedAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotMatchedActionContext notMatchedAction() throws RecognitionException {
		NotMatchedActionContext _localctx = new NotMatchedActionContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_notMatchedAction);
		int _la;
		try {
			setState(1764);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1746);
				match(INSERT);
				setState(1747);
				match(ASTERISK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1748);
				match(INSERT);
				setState(1749);
				match(T__0);
				setState(1750);
				((NotMatchedActionContext)_localctx).columns = multipartIdentifierList();
				setState(1751);
				match(T__1);
				setState(1752);
				match(VALUES);
				setState(1753);
				match(T__0);
				setState(1754);
				expression();
				setState(1759);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1755);
					match(T__2);
					setState(1756);
					expression();
					}
					}
					setState(1761);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1762);
				match(T__1);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentListContext extends ParserRuleContext {
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public AssignmentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAssignmentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAssignmentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAssignmentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentListContext assignmentList() throws RecognitionException {
		AssignmentListContext _localctx = new AssignmentListContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_assignmentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1766);
			assignment();
			setState(1771);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1767);
				match(T__2);
				setState(1768);
				assignment();
				}
				}
				setState(1773);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public MultipartIdentifierContext key;
		public ExpressionContext value;
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1774);
			((AssignmentContext)_localctx).key = multipartIdentifier();
			setState(1775);
			match(EQ);
			setState(1776);
			((AssignmentContext)_localctx).value = expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhereClauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(SqlBaseParser.WHERE, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitWhereClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1778);
			match(WHERE);
			setState(1779);
			booleanExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HavingClauseContext extends ParserRuleContext {
		public TerminalNode HAVING() { return getToken(SqlBaseParser.HAVING, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public HavingClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_havingClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterHavingClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitHavingClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitHavingClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HavingClauseContext havingClause() throws RecognitionException {
		HavingClauseContext _localctx = new HavingClauseContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_havingClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1781);
			match(HAVING);
			setState(1782);
			booleanExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HintContext extends ParserRuleContext {
		public HintStatementContext hintStatement;
		public List<HintStatementContext> hintStatements = new ArrayList<HintStatementContext>();
		public List<HintStatementContext> hintStatement() {
			return getRuleContexts(HintStatementContext.class);
		}
		public HintStatementContext hintStatement(int i) {
			return getRuleContext(HintStatementContext.class,i);
		}
		public HintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterHint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitHint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitHint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HintContext hint() throws RecognitionException {
		HintContext _localctx = new HintContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_hint);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1784);
			match(T__4);
			setState(1785);
			((HintContext)_localctx).hintStatement = hintStatement();
			((HintContext)_localctx).hintStatements.add(((HintContext)_localctx).hintStatement);
			setState(1792);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,219,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1787);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
					case 1:
						{
						setState(1786);
						match(T__2);
						}
						break;
					}
					setState(1789);
					((HintContext)_localctx).hintStatement = hintStatement();
					((HintContext)_localctx).hintStatements.add(((HintContext)_localctx).hintStatement);
					}
					} 
				}
				setState(1794);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,219,_ctx);
			}
			setState(1795);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HintStatementContext extends ParserRuleContext {
		public IdentifierContext hintName;
		public PrimaryExpressionContext primaryExpression;
		public List<PrimaryExpressionContext> parameters = new ArrayList<PrimaryExpressionContext>();
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<PrimaryExpressionContext> primaryExpression() {
			return getRuleContexts(PrimaryExpressionContext.class);
		}
		public PrimaryExpressionContext primaryExpression(int i) {
			return getRuleContext(PrimaryExpressionContext.class,i);
		}
		public HintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hintStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterHintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitHintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitHintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HintStatementContext hintStatement() throws RecognitionException {
		HintStatementContext _localctx = new HintStatementContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_hintStatement);
		int _la;
		try {
			setState(1810);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1797);
				((HintStatementContext)_localctx).hintName = identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1798);
				((HintStatementContext)_localctx).hintName = identifier();
				setState(1799);
				match(T__0);
				setState(1800);
				((HintStatementContext)_localctx).primaryExpression = primaryExpression(0);
				((HintStatementContext)_localctx).parameters.add(((HintStatementContext)_localctx).primaryExpression);
				setState(1805);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1801);
					match(T__2);
					setState(1802);
					((HintStatementContext)_localctx).primaryExpression = primaryExpression(0);
					((HintStatementContext)_localctx).parameters.add(((HintStatementContext)_localctx).primaryExpression);
					}
					}
					setState(1807);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1808);
				match(T__1);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FromClauseContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}
		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class,i);
		}
		public List<LateralViewContext> lateralView() {
			return getRuleContexts(LateralViewContext.class);
		}
		public LateralViewContext lateralView(int i) {
			return getRuleContext(LateralViewContext.class,i);
		}
		public PivotClauseContext pivotClause() {
			return getRuleContext(PivotClauseContext.class,0);
		}
		public FromClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFromClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFromClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFromClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_fromClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1812);
			match(FROM);
			setState(1813);
			relation();
			setState(1818);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,222,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1814);
					match(T__2);
					setState(1815);
					relation();
					}
					} 
				}
				setState(1820);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,222,_ctx);
			}
			setState(1824);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,223,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1821);
					lateralView();
					}
					} 
				}
				setState(1826);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,223,_ctx);
			}
			setState(1828);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
			case 1:
				{
				setState(1827);
				pivotClause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AggregationClauseContext extends ParserRuleContext {
		public ExpressionContext expression;
		public List<ExpressionContext> groupingExpressions = new ArrayList<ExpressionContext>();
		public Token kind;
		public TerminalNode GROUP() { return getToken(SqlBaseParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode SETS() { return getToken(SqlBaseParser.SETS, 0); }
		public List<GroupingSetContext> groupingSet() {
			return getRuleContexts(GroupingSetContext.class);
		}
		public GroupingSetContext groupingSet(int i) {
			return getRuleContext(GroupingSetContext.class,i);
		}
		public TerminalNode ROLLUP() { return getToken(SqlBaseParser.ROLLUP, 0); }
		public TerminalNode CUBE() { return getToken(SqlBaseParser.CUBE, 0); }
		public TerminalNode GROUPING() { return getToken(SqlBaseParser.GROUPING, 0); }
		public AggregationClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregationClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAggregationClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAggregationClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAggregationClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregationClauseContext aggregationClause() throws RecognitionException {
		AggregationClauseContext _localctx = new AggregationClauseContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_aggregationClause);
		int _la;
		try {
			int _alt;
			setState(1874);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,229,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1830);
				match(GROUP);
				setState(1831);
				match(BY);
				setState(1832);
				((AggregationClauseContext)_localctx).expression = expression();
				((AggregationClauseContext)_localctx).groupingExpressions.add(((AggregationClauseContext)_localctx).expression);
				setState(1837);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,225,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1833);
						match(T__2);
						setState(1834);
						((AggregationClauseContext)_localctx).expression = expression();
						((AggregationClauseContext)_localctx).groupingExpressions.add(((AggregationClauseContext)_localctx).expression);
						}
						} 
					}
					setState(1839);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,225,_ctx);
				}
				setState(1857);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,227,_ctx) ) {
				case 1:
					{
					setState(1840);
					match(WITH);
					setState(1841);
					((AggregationClauseContext)_localctx).kind = match(ROLLUP);
					}
					break;
				case 2:
					{
					setState(1842);
					match(WITH);
					setState(1843);
					((AggregationClauseContext)_localctx).kind = match(CUBE);
					}
					break;
				case 3:
					{
					setState(1844);
					((AggregationClauseContext)_localctx).kind = match(GROUPING);
					setState(1845);
					match(SETS);
					setState(1846);
					match(T__0);
					setState(1847);
					groupingSet();
					setState(1852);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(1848);
						match(T__2);
						setState(1849);
						groupingSet();
						}
						}
						setState(1854);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1855);
					match(T__1);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1859);
				match(GROUP);
				setState(1860);
				match(BY);
				setState(1861);
				((AggregationClauseContext)_localctx).kind = match(GROUPING);
				setState(1862);
				match(SETS);
				setState(1863);
				match(T__0);
				setState(1864);
				groupingSet();
				setState(1869);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1865);
					match(T__2);
					setState(1866);
					groupingSet();
					}
					}
					setState(1871);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1872);
				match(T__1);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupingSetContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public GroupingSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupingSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterGroupingSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitGroupingSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitGroupingSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupingSetContext groupingSet() throws RecognitionException {
		GroupingSetContext _localctx = new GroupingSetContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_groupingSet);
		int _la;
		try {
			setState(1889);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1876);
				match(T__0);
				setState(1885);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,231,_ctx) ) {
				case 1:
					{
					setState(1877);
					expression();
					setState(1882);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(1878);
						match(T__2);
						setState(1879);
						expression();
						}
						}
						setState(1884);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(1887);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1888);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PivotClauseContext extends ParserRuleContext {
		public NamedExpressionSeqContext aggregates;
		public PivotValueContext pivotValue;
		public List<PivotValueContext> pivotValues = new ArrayList<PivotValueContext>();
		public TerminalNode PIVOT() { return getToken(SqlBaseParser.PIVOT, 0); }
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public PivotColumnContext pivotColumn() {
			return getRuleContext(PivotColumnContext.class,0);
		}
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public NamedExpressionSeqContext namedExpressionSeq() {
			return getRuleContext(NamedExpressionSeqContext.class,0);
		}
		public List<PivotValueContext> pivotValue() {
			return getRuleContexts(PivotValueContext.class);
		}
		public PivotValueContext pivotValue(int i) {
			return getRuleContext(PivotValueContext.class,i);
		}
		public PivotClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pivotClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPivotClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPivotClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPivotClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PivotClauseContext pivotClause() throws RecognitionException {
		PivotClauseContext _localctx = new PivotClauseContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_pivotClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1891);
			match(PIVOT);
			setState(1892);
			match(T__0);
			setState(1893);
			((PivotClauseContext)_localctx).aggregates = namedExpressionSeq();
			setState(1894);
			match(FOR);
			setState(1895);
			pivotColumn();
			setState(1896);
			match(IN);
			setState(1897);
			match(T__0);
			setState(1898);
			((PivotClauseContext)_localctx).pivotValue = pivotValue();
			((PivotClauseContext)_localctx).pivotValues.add(((PivotClauseContext)_localctx).pivotValue);
			setState(1903);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1899);
				match(T__2);
				setState(1900);
				((PivotClauseContext)_localctx).pivotValue = pivotValue();
				((PivotClauseContext)_localctx).pivotValues.add(((PivotClauseContext)_localctx).pivotValue);
				}
				}
				setState(1905);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1906);
			match(T__1);
			setState(1907);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PivotColumnContext extends ParserRuleContext {
		public IdentifierContext identifier;
		public List<IdentifierContext> identifiers = new ArrayList<IdentifierContext>();
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public PivotColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pivotColumn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPivotColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPivotColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPivotColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PivotColumnContext pivotColumn() throws RecognitionException {
		PivotColumnContext _localctx = new PivotColumnContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_pivotColumn);
		int _la;
		try {
			setState(1921);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1909);
				((PivotColumnContext)_localctx).identifier = identifier();
				((PivotColumnContext)_localctx).identifiers.add(((PivotColumnContext)_localctx).identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1910);
				match(T__0);
				setState(1911);
				((PivotColumnContext)_localctx).identifier = identifier();
				((PivotColumnContext)_localctx).identifiers.add(((PivotColumnContext)_localctx).identifier);
				setState(1916);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1912);
					match(T__2);
					setState(1913);
					((PivotColumnContext)_localctx).identifier = identifier();
					((PivotColumnContext)_localctx).identifiers.add(((PivotColumnContext)_localctx).identifier);
					}
					}
					setState(1918);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1919);
				match(T__1);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PivotValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public PivotValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pivotValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPivotValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPivotValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPivotValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PivotValueContext pivotValue() throws RecognitionException {
		PivotValueContext _localctx = new PivotValueContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_pivotValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1923);
			expression();
			setState(1928);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
			case 1:
				{
				setState(1925);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,236,_ctx) ) {
				case 1:
					{
					setState(1924);
					match(AS);
					}
					break;
				}
				setState(1927);
				identifier();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LateralViewContext extends ParserRuleContext {
		public IdentifierContext tblName;
		public IdentifierContext identifier;
		public List<IdentifierContext> colName = new ArrayList<IdentifierContext>();
		public TerminalNode LATERAL() { return getToken(SqlBaseParser.LATERAL, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode OUTER() { return getToken(SqlBaseParser.OUTER, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public LateralViewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lateralView; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLateralView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLateralView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLateralView(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LateralViewContext lateralView() throws RecognitionException {
		LateralViewContext _localctx = new LateralViewContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_lateralView);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1930);
			match(LATERAL);
			setState(1931);
			match(VIEW);
			setState(1933);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,238,_ctx) ) {
			case 1:
				{
				setState(1932);
				match(OUTER);
				}
				break;
			}
			setState(1935);
			qualifiedName();
			setState(1936);
			match(T__0);
			setState(1945);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,240,_ctx) ) {
			case 1:
				{
				setState(1937);
				expression();
				setState(1942);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1938);
					match(T__2);
					setState(1939);
					expression();
					}
					}
					setState(1944);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(1947);
			match(T__1);
			setState(1948);
			((LateralViewContext)_localctx).tblName = identifier();
			setState(1960);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
			case 1:
				{
				setState(1950);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
				case 1:
					{
					setState(1949);
					match(AS);
					}
					break;
				}
				setState(1952);
				((LateralViewContext)_localctx).identifier = identifier();
				((LateralViewContext)_localctx).colName.add(((LateralViewContext)_localctx).identifier);
				setState(1957);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,242,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1953);
						match(T__2);
						setState(1954);
						((LateralViewContext)_localctx).identifier = identifier();
						((LateralViewContext)_localctx).colName.add(((LateralViewContext)_localctx).identifier);
						}
						} 
					}
					setState(1959);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,242,_ctx);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetQuantifierContext extends ParserRuleContext {
		public TerminalNode DISTINCT() { return getToken(SqlBaseParser.DISTINCT, 0); }
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public SetQuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setQuantifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetQuantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetQuantifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetQuantifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetQuantifierContext setQuantifier() throws RecognitionException {
		SetQuantifierContext _localctx = new SetQuantifierContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_setQuantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1962);
			_la = _input.LA(1);
			if ( !(_la==ALL || _la==DISTINCT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationContext extends ParserRuleContext {
		public RelationPrimaryContext relationPrimary() {
			return getRuleContext(RelationPrimaryContext.class,0);
		}
		public List<JoinRelationContext> joinRelation() {
			return getRuleContexts(JoinRelationContext.class);
		}
		public JoinRelationContext joinRelation(int i) {
			return getRuleContext(JoinRelationContext.class,i);
		}
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationContext relation() throws RecognitionException {
		RelationContext _localctx = new RelationContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_relation);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1964);
			relationPrimary();
			setState(1968);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,244,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1965);
					joinRelation();
					}
					} 
				}
				setState(1970);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,244,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinRelationContext extends ParserRuleContext {
		public RelationPrimaryContext right;
		public TerminalNode JOIN() { return getToken(SqlBaseParser.JOIN, 0); }
		public RelationPrimaryContext relationPrimary() {
			return getRuleContext(RelationPrimaryContext.class,0);
		}
		public JoinTypeContext joinType() {
			return getRuleContext(JoinTypeContext.class,0);
		}
		public JoinCriteriaContext joinCriteria() {
			return getRuleContext(JoinCriteriaContext.class,0);
		}
		public TerminalNode NATURAL() { return getToken(SqlBaseParser.NATURAL, 0); }
		public JoinRelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinRelation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterJoinRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitJoinRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitJoinRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinRelationContext joinRelation() throws RecognitionException {
		JoinRelationContext _localctx = new JoinRelationContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_joinRelation);
		try {
			setState(1982);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ANTI:
			case CROSS:
			case FULL:
			case INNER:
			case JOIN:
			case LEFT:
			case RIGHT:
			case SEMI:
			case KNN:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1971);
				joinType();
				}
				setState(1972);
				match(JOIN);
				setState(1973);
				((JoinRelationContext)_localctx).right = relationPrimary();
				setState(1975);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
				case 1:
					{
					setState(1974);
					joinCriteria();
					}
					break;
				}
				}
				break;
			case NATURAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1977);
				match(NATURAL);
				setState(1978);
				joinType();
				setState(1979);
				match(JOIN);
				setState(1980);
				((JoinRelationContext)_localctx).right = relationPrimary();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinTypeContext extends ParserRuleContext {
		public TerminalNode INNER() { return getToken(SqlBaseParser.INNER, 0); }
		public TerminalNode CROSS() { return getToken(SqlBaseParser.CROSS, 0); }
		public TerminalNode LEFT() { return getToken(SqlBaseParser.LEFT, 0); }
		public TerminalNode OUTER() { return getToken(SqlBaseParser.OUTER, 0); }
		public TerminalNode SEMI() { return getToken(SqlBaseParser.SEMI, 0); }
		public TerminalNode RIGHT() { return getToken(SqlBaseParser.RIGHT, 0); }
		public TerminalNode FULL() { return getToken(SqlBaseParser.FULL, 0); }
		public TerminalNode ANTI() { return getToken(SqlBaseParser.ANTI, 0); }
		public TerminalNode KNN() { return getToken(SqlBaseParser.KNN, 0); }
		public JoinTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterJoinType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitJoinType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitJoinType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinTypeContext joinType() throws RecognitionException {
		JoinTypeContext _localctx = new JoinTypeContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_joinType);
		int _la;
		try {
			setState(2009);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,253,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1985);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INNER) {
					{
					setState(1984);
					match(INNER);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1987);
				match(CROSS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1988);
				match(LEFT);
				setState(1990);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(1989);
					match(OUTER);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1993);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT) {
					{
					setState(1992);
					match(LEFT);
					}
				}

				setState(1995);
				match(SEMI);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1996);
				match(RIGHT);
				setState(1998);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(1997);
					match(OUTER);
					}
				}

				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2000);
				match(FULL);
				setState(2002);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(2001);
					match(OUTER);
					}
				}

				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2005);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT) {
					{
					setState(2004);
					match(LEFT);
					}
				}

				setState(2007);
				match(ANTI);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2008);
				match(KNN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinCriteriaContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode POINT() { return getToken(SqlBaseParser.POINT, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public JoinCriteriaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinCriteria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterJoinCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitJoinCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitJoinCriteria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinCriteriaContext joinCriteria() throws RecognitionException {
		JoinCriteriaContext _localctx = new JoinCriteriaContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_joinCriteria);
		int _la;
		try {
			setState(2031);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,256,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2011);
				match(ON);
				setState(2012);
				booleanExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2013);
				match(USING);
				setState(2027);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(2014);
					match(T__0);
					setState(2015);
					identifier();
					setState(2020);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(2016);
						match(T__2);
						setState(2017);
						identifier();
						}
						}
						setState(2022);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2023);
					match(T__1);
					}
					break;
				case POINT:
					{
					setState(2025);
					match(POINT);
					setState(2026);
					booleanExpression(0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2029);
				match(USING);
				setState(2030);
				identifierList();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SampleContext extends ParserRuleContext {
		public TerminalNode TABLESAMPLE() { return getToken(SqlBaseParser.TABLESAMPLE, 0); }
		public SampleMethodContext sampleMethod() {
			return getRuleContext(SampleMethodContext.class,0);
		}
		public SampleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sample; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSample(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSample(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSample(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SampleContext sample() throws RecognitionException {
		SampleContext _localctx = new SampleContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_sample);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2033);
			match(TABLESAMPLE);
			setState(2034);
			match(T__0);
			setState(2036);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,257,_ctx) ) {
			case 1:
				{
				setState(2035);
				sampleMethod();
				}
				break;
			}
			setState(2038);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SampleMethodContext extends ParserRuleContext {
		public SampleMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sampleMethod; }
	 
		public SampleMethodContext() { }
		public void copyFrom(SampleMethodContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SampleByRowsContext extends SampleMethodContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ROWS() { return getToken(SqlBaseParser.ROWS, 0); }
		public SampleByRowsContext(SampleMethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSampleByRows(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSampleByRows(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSampleByRows(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SampleByPercentileContext extends SampleMethodContext {
		public Token negativeSign;
		public Token percentage;
		public TerminalNode PERCENTLIT() { return getToken(SqlBaseParser.PERCENTLIT, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(SqlBaseParser.DECIMAL_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public SampleByPercentileContext(SampleMethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSampleByPercentile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSampleByPercentile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSampleByPercentile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SampleByBucketContext extends SampleMethodContext {
		public Token sampleType;
		public Token numerator;
		public Token denominator;
		public TerminalNode OUT() { return getToken(SqlBaseParser.OUT, 0); }
		public TerminalNode OF() { return getToken(SqlBaseParser.OF, 0); }
		public TerminalNode BUCKET() { return getToken(SqlBaseParser.BUCKET, 0); }
		public List<TerminalNode> INTEGER_VALUE() { return getTokens(SqlBaseParser.INTEGER_VALUE); }
		public TerminalNode INTEGER_VALUE(int i) {
			return getToken(SqlBaseParser.INTEGER_VALUE, i);
		}
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public SampleByBucketContext(SampleMethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSampleByBucket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSampleByBucket(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSampleByBucket(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SampleByBytesContext extends SampleMethodContext {
		public ExpressionContext bytes;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SampleByBytesContext(SampleMethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSampleByBytes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSampleByBytes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSampleByBytes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SampleMethodContext sampleMethod() throws RecognitionException {
		SampleMethodContext _localctx = new SampleMethodContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_sampleMethod);
		int _la;
		try {
			setState(2064);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,261,_ctx) ) {
			case 1:
				_localctx = new SampleByPercentileContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2041);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2040);
					((SampleByPercentileContext)_localctx).negativeSign = match(MINUS);
					}
				}

				setState(2043);
				((SampleByPercentileContext)_localctx).percentage = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INTEGER_VALUE || _la==DECIMAL_VALUE) ) {
					((SampleByPercentileContext)_localctx).percentage = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2044);
				match(PERCENTLIT);
				}
				break;
			case 2:
				_localctx = new SampleByRowsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2045);
				expression();
				setState(2046);
				match(ROWS);
				}
				break;
			case 3:
				_localctx = new SampleByBucketContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2048);
				((SampleByBucketContext)_localctx).sampleType = match(BUCKET);
				setState(2049);
				((SampleByBucketContext)_localctx).numerator = match(INTEGER_VALUE);
				setState(2050);
				match(OUT);
				setState(2051);
				match(OF);
				setState(2052);
				((SampleByBucketContext)_localctx).denominator = match(INTEGER_VALUE);
				setState(2061);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(2053);
					match(ON);
					setState(2059);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,259,_ctx) ) {
					case 1:
						{
						setState(2054);
						identifier();
						}
						break;
					case 2:
						{
						setState(2055);
						qualifiedName();
						setState(2056);
						match(T__0);
						setState(2057);
						match(T__1);
						}
						break;
					}
					}
				}

				}
				break;
			case 4:
				_localctx = new SampleByBytesContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2063);
				((SampleByBytesContext)_localctx).bytes = expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierListContext extends ParserRuleContext {
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_identifierList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2066);
			match(T__0);
			setState(2067);
			identifierSeq();
			setState(2068);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierSeqContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext errorCapturingIdentifier;
		public List<ErrorCapturingIdentifierContext> ident = new ArrayList<ErrorCapturingIdentifierContext>();
		public List<ErrorCapturingIdentifierContext> errorCapturingIdentifier() {
			return getRuleContexts(ErrorCapturingIdentifierContext.class);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier(int i) {
			return getRuleContext(ErrorCapturingIdentifierContext.class,i);
		}
		public IdentifierSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIdentifierSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIdentifierSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIdentifierSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierSeqContext identifierSeq() throws RecognitionException {
		IdentifierSeqContext _localctx = new IdentifierSeqContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_identifierSeq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2070);
			((IdentifierSeqContext)_localctx).errorCapturingIdentifier = errorCapturingIdentifier();
			((IdentifierSeqContext)_localctx).ident.add(((IdentifierSeqContext)_localctx).errorCapturingIdentifier);
			setState(2075);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,262,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2071);
					match(T__2);
					setState(2072);
					((IdentifierSeqContext)_localctx).errorCapturingIdentifier = errorCapturingIdentifier();
					((IdentifierSeqContext)_localctx).ident.add(((IdentifierSeqContext)_localctx).errorCapturingIdentifier);
					}
					} 
				}
				setState(2077);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,262,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderedIdentifierListContext extends ParserRuleContext {
		public List<OrderedIdentifierContext> orderedIdentifier() {
			return getRuleContexts(OrderedIdentifierContext.class);
		}
		public OrderedIdentifierContext orderedIdentifier(int i) {
			return getRuleContext(OrderedIdentifierContext.class,i);
		}
		public OrderedIdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderedIdentifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterOrderedIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitOrderedIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitOrderedIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderedIdentifierListContext orderedIdentifierList() throws RecognitionException {
		OrderedIdentifierListContext _localctx = new OrderedIdentifierListContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_orderedIdentifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2078);
			match(T__0);
			setState(2079);
			orderedIdentifier();
			setState(2084);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(2080);
				match(T__2);
				setState(2081);
				orderedIdentifier();
				}
				}
				setState(2086);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2087);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderedIdentifierContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext ident;
		public Token ordering;
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public TerminalNode ASC() { return getToken(SqlBaseParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public OrderedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderedIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterOrderedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitOrderedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitOrderedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderedIdentifierContext orderedIdentifier() throws RecognitionException {
		OrderedIdentifierContext _localctx = new OrderedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_orderedIdentifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2089);
			((OrderedIdentifierContext)_localctx).ident = errorCapturingIdentifier();
			setState(2091);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(2090);
				((OrderedIdentifierContext)_localctx).ordering = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((OrderedIdentifierContext)_localctx).ordering = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierCommentListContext extends ParserRuleContext {
		public List<IdentifierCommentContext> identifierComment() {
			return getRuleContexts(IdentifierCommentContext.class);
		}
		public IdentifierCommentContext identifierComment(int i) {
			return getRuleContext(IdentifierCommentContext.class,i);
		}
		public IdentifierCommentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierCommentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIdentifierCommentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIdentifierCommentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIdentifierCommentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierCommentListContext identifierCommentList() throws RecognitionException {
		IdentifierCommentListContext _localctx = new IdentifierCommentListContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_identifierCommentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2093);
			match(T__0);
			setState(2094);
			identifierComment();
			setState(2099);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(2095);
				match(T__2);
				setState(2096);
				identifierComment();
				}
				}
				setState(2101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2102);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierCommentContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public IdentifierCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierComment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIdentifierComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIdentifierComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIdentifierComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierCommentContext identifierComment() throws RecognitionException {
		IdentifierCommentContext _localctx = new IdentifierCommentContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_identifierComment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2104);
			identifier();
			setState(2107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(2105);
				match(COMMENT);
				setState(2106);
				match(STRING);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationPrimaryContext extends ParserRuleContext {
		public RelationPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationPrimary; }
	 
		public RelationPrimaryContext() { }
		public void copyFrom(RelationPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TableValuedFunctionContext extends RelationPrimaryContext {
		public FunctionTableContext functionTable() {
			return getRuleContext(FunctionTableContext.class,0);
		}
		public TableValuedFunctionContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableValuedFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableValuedFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableValuedFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InlineTableDefault2Context extends RelationPrimaryContext {
		public InlineTableContext inlineTable() {
			return getRuleContext(InlineTableContext.class,0);
		}
		public InlineTableDefault2Context(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInlineTableDefault2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInlineTableDefault2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInlineTableDefault2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AliasedRelationContext extends RelationPrimaryContext {
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public SampleContext sample() {
			return getRuleContext(SampleContext.class,0);
		}
		public AliasedRelationContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAliasedRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAliasedRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAliasedRelation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AliasedQueryContext extends RelationPrimaryContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public SampleContext sample() {
			return getRuleContext(SampleContext.class,0);
		}
		public AliasedQueryContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAliasedQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAliasedQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAliasedQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableNameContext extends RelationPrimaryContext {
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public SampleContext sample() {
			return getRuleContext(SampleContext.class,0);
		}
		public TableNameContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationPrimaryContext relationPrimary() throws RecognitionException {
		RelationPrimaryContext _localctx = new RelationPrimaryContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_relationPrimary);
		try {
			setState(2133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,270,_ctx) ) {
			case 1:
				_localctx = new TableNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2109);
				multipartIdentifier();
				setState(2111);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,267,_ctx) ) {
				case 1:
					{
					setState(2110);
					sample();
					}
					break;
				}
				setState(2113);
				tableAlias();
				}
				break;
			case 2:
				_localctx = new AliasedQueryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2115);
				match(T__0);
				setState(2116);
				query();
				setState(2117);
				match(T__1);
				setState(2119);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,268,_ctx) ) {
				case 1:
					{
					setState(2118);
					sample();
					}
					break;
				}
				setState(2121);
				tableAlias();
				}
				break;
			case 3:
				_localctx = new AliasedRelationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2123);
				match(T__0);
				setState(2124);
				relation();
				setState(2125);
				match(T__1);
				setState(2127);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,269,_ctx) ) {
				case 1:
					{
					setState(2126);
					sample();
					}
					break;
				}
				setState(2129);
				tableAlias();
				}
				break;
			case 4:
				_localctx = new InlineTableDefault2Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2131);
				inlineTable();
				}
				break;
			case 5:
				_localctx = new TableValuedFunctionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2132);
				functionTable();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InlineTableContext extends ParserRuleContext {
		public TerminalNode VALUES() { return getToken(SqlBaseParser.VALUES, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public InlineTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInlineTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInlineTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInlineTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InlineTableContext inlineTable() throws RecognitionException {
		InlineTableContext _localctx = new InlineTableContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_inlineTable);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2135);
			match(VALUES);
			setState(2136);
			expression();
			setState(2141);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,271,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2137);
					match(T__2);
					setState(2138);
					expression();
					}
					} 
				}
				setState(2143);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,271,_ctx);
			}
			setState(2144);
			tableAlias();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionTableContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext funcName;
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public FunctionTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFunctionTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFunctionTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFunctionTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionTableContext functionTable() throws RecognitionException {
		FunctionTableContext _localctx = new FunctionTableContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_functionTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2146);
			((FunctionTableContext)_localctx).funcName = errorCapturingIdentifier();
			setState(2147);
			match(T__0);
			setState(2156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,273,_ctx) ) {
			case 1:
				{
				setState(2148);
				expression();
				setState(2153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(2149);
					match(T__2);
					setState(2150);
					expression();
					}
					}
					setState(2155);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(2158);
			match(T__1);
			setState(2159);
			tableAlias();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableAliasContext extends ParserRuleContext {
		public StrictIdentifierContext strictIdentifier() {
			return getRuleContext(StrictIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TableAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableAlias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableAliasContext tableAlias() throws RecognitionException {
		TableAliasContext _localctx = new TableAliasContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_tableAlias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,276,_ctx) ) {
			case 1:
				{
				setState(2162);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,274,_ctx) ) {
				case 1:
					{
					setState(2161);
					match(AS);
					}
					break;
				}
				setState(2164);
				strictIdentifier();
				setState(2166);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,275,_ctx) ) {
				case 1:
					{
					setState(2165);
					identifierList();
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RowFormatContext extends ParserRuleContext {
		public RowFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowFormat; }
	 
		public RowFormatContext() { }
		public void copyFrom(RowFormatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RowFormatSerdeContext extends RowFormatContext {
		public Token name;
		public TablePropertyListContext props;
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public TerminalNode FORMAT() { return getToken(SqlBaseParser.FORMAT, 0); }
		public TerminalNode SERDE() { return getToken(SqlBaseParser.SERDE, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SqlBaseParser.SERDEPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public RowFormatSerdeContext(RowFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRowFormatSerde(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRowFormatSerde(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRowFormatSerde(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RowFormatDelimitedContext extends RowFormatContext {
		public Token fieldsTerminatedBy;
		public Token escapedBy;
		public Token collectionItemsTerminatedBy;
		public Token keysTerminatedBy;
		public Token linesSeparatedBy;
		public Token nullDefinedAs;
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public TerminalNode FORMAT() { return getToken(SqlBaseParser.FORMAT, 0); }
		public TerminalNode DELIMITED() { return getToken(SqlBaseParser.DELIMITED, 0); }
		public TerminalNode FIELDS() { return getToken(SqlBaseParser.FIELDS, 0); }
		public List<TerminalNode> TERMINATED() { return getTokens(SqlBaseParser.TERMINATED); }
		public TerminalNode TERMINATED(int i) {
			return getToken(SqlBaseParser.TERMINATED, i);
		}
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public TerminalNode COLLECTION() { return getToken(SqlBaseParser.COLLECTION, 0); }
		public TerminalNode ITEMS() { return getToken(SqlBaseParser.ITEMS, 0); }
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode KEYS() { return getToken(SqlBaseParser.KEYS, 0); }
		public TerminalNode LINES() { return getToken(SqlBaseParser.LINES, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public TerminalNode DEFINED() { return getToken(SqlBaseParser.DEFINED, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public List<TerminalNode> STRING() { return getTokens(SqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SqlBaseParser.STRING, i);
		}
		public TerminalNode ESCAPED() { return getToken(SqlBaseParser.ESCAPED, 0); }
		public RowFormatDelimitedContext(RowFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRowFormatDelimited(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRowFormatDelimited(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRowFormatDelimited(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowFormatContext rowFormat() throws RecognitionException {
		RowFormatContext _localctx = new RowFormatContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_rowFormat);
		try {
			setState(2219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,284,_ctx) ) {
			case 1:
				_localctx = new RowFormatSerdeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2170);
				match(ROW);
				setState(2171);
				match(FORMAT);
				setState(2172);
				match(SERDE);
				setState(2173);
				((RowFormatSerdeContext)_localctx).name = match(STRING);
				setState(2177);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,277,_ctx) ) {
				case 1:
					{
					setState(2174);
					match(WITH);
					setState(2175);
					match(SERDEPROPERTIES);
					setState(2176);
					((RowFormatSerdeContext)_localctx).props = tablePropertyList();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new RowFormatDelimitedContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2179);
				match(ROW);
				setState(2180);
				match(FORMAT);
				setState(2181);
				match(DELIMITED);
				setState(2191);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,279,_ctx) ) {
				case 1:
					{
					setState(2182);
					match(FIELDS);
					setState(2183);
					match(TERMINATED);
					setState(2184);
					match(BY);
					setState(2185);
					((RowFormatDelimitedContext)_localctx).fieldsTerminatedBy = match(STRING);
					setState(2189);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,278,_ctx) ) {
					case 1:
						{
						setState(2186);
						match(ESCAPED);
						setState(2187);
						match(BY);
						setState(2188);
						((RowFormatDelimitedContext)_localctx).escapedBy = match(STRING);
						}
						break;
					}
					}
					break;
				}
				setState(2198);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,280,_ctx) ) {
				case 1:
					{
					setState(2193);
					match(COLLECTION);
					setState(2194);
					match(ITEMS);
					setState(2195);
					match(TERMINATED);
					setState(2196);
					match(BY);
					setState(2197);
					((RowFormatDelimitedContext)_localctx).collectionItemsTerminatedBy = match(STRING);
					}
					break;
				}
				setState(2205);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,281,_ctx) ) {
				case 1:
					{
					setState(2200);
					match(MAP);
					setState(2201);
					match(KEYS);
					setState(2202);
					match(TERMINATED);
					setState(2203);
					match(BY);
					setState(2204);
					((RowFormatDelimitedContext)_localctx).keysTerminatedBy = match(STRING);
					}
					break;
				}
				setState(2211);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,282,_ctx) ) {
				case 1:
					{
					setState(2207);
					match(LINES);
					setState(2208);
					match(TERMINATED);
					setState(2209);
					match(BY);
					setState(2210);
					((RowFormatDelimitedContext)_localctx).linesSeparatedBy = match(STRING);
					}
					break;
				}
				setState(2217);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,283,_ctx) ) {
				case 1:
					{
					setState(2213);
					match(NULL);
					setState(2214);
					match(DEFINED);
					setState(2215);
					match(AS);
					setState(2216);
					((RowFormatDelimitedContext)_localctx).nullDefinedAs = match(STRING);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultipartIdentifierListContext extends ParserRuleContext {
		public List<MultipartIdentifierContext> multipartIdentifier() {
			return getRuleContexts(MultipartIdentifierContext.class);
		}
		public MultipartIdentifierContext multipartIdentifier(int i) {
			return getRuleContext(MultipartIdentifierContext.class,i);
		}
		public MultipartIdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipartIdentifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterMultipartIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitMultipartIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitMultipartIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipartIdentifierListContext multipartIdentifierList() throws RecognitionException {
		MultipartIdentifierListContext _localctx = new MultipartIdentifierListContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_multipartIdentifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2221);
			multipartIdentifier();
			setState(2226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(2222);
				match(T__2);
				setState(2223);
				multipartIdentifier();
				}
				}
				setState(2228);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultipartIdentifierContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext errorCapturingIdentifier;
		public List<ErrorCapturingIdentifierContext> parts = new ArrayList<ErrorCapturingIdentifierContext>();
		public List<ErrorCapturingIdentifierContext> errorCapturingIdentifier() {
			return getRuleContexts(ErrorCapturingIdentifierContext.class);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier(int i) {
			return getRuleContext(ErrorCapturingIdentifierContext.class,i);
		}
		public MultipartIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipartIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterMultipartIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitMultipartIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitMultipartIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipartIdentifierContext multipartIdentifier() throws RecognitionException {
		MultipartIdentifierContext _localctx = new MultipartIdentifierContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_multipartIdentifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2229);
			((MultipartIdentifierContext)_localctx).errorCapturingIdentifier = errorCapturingIdentifier();
			((MultipartIdentifierContext)_localctx).parts.add(((MultipartIdentifierContext)_localctx).errorCapturingIdentifier);
			setState(2234);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,286,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2230);
					match(T__3);
					setState(2231);
					((MultipartIdentifierContext)_localctx).errorCapturingIdentifier = errorCapturingIdentifier();
					((MultipartIdentifierContext)_localctx).parts.add(((MultipartIdentifierContext)_localctx).errorCapturingIdentifier);
					}
					} 
				}
				setState(2236);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,286,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableIdentifierContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext db;
		public ErrorCapturingIdentifierContext table;
		public List<ErrorCapturingIdentifierContext> errorCapturingIdentifier() {
			return getRuleContexts(ErrorCapturingIdentifierContext.class);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier(int i) {
			return getRuleContext(ErrorCapturingIdentifierContext.class,i);
		}
		public TableIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableIdentifierContext tableIdentifier() throws RecognitionException {
		TableIdentifierContext _localctx = new TableIdentifierContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_tableIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,287,_ctx) ) {
			case 1:
				{
				setState(2237);
				((TableIdentifierContext)_localctx).db = errorCapturingIdentifier();
				setState(2238);
				match(T__3);
				}
				break;
			}
			setState(2242);
			((TableIdentifierContext)_localctx).table = errorCapturingIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionIdentifierContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext db;
		public ErrorCapturingIdentifierContext function;
		public List<ErrorCapturingIdentifierContext> errorCapturingIdentifier() {
			return getRuleContexts(ErrorCapturingIdentifierContext.class);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier(int i) {
			return getRuleContext(ErrorCapturingIdentifierContext.class,i);
		}
		public FunctionIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFunctionIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFunctionIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFunctionIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionIdentifierContext functionIdentifier() throws RecognitionException {
		FunctionIdentifierContext _localctx = new FunctionIdentifierContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_functionIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,288,_ctx) ) {
			case 1:
				{
				setState(2244);
				((FunctionIdentifierContext)_localctx).db = errorCapturingIdentifier();
				setState(2245);
				match(T__3);
				}
				break;
			}
			setState(2249);
			((FunctionIdentifierContext)_localctx).function = errorCapturingIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedExpressionContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext name;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public NamedExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNamedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNamedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNamedExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedExpressionContext namedExpression() throws RecognitionException {
		NamedExpressionContext _localctx = new NamedExpressionContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_namedExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2251);
			expression();
			setState(2259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,291,_ctx) ) {
			case 1:
				{
				setState(2253);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,289,_ctx) ) {
				case 1:
					{
					setState(2252);
					match(AS);
					}
					break;
				}
				setState(2257);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,290,_ctx) ) {
				case 1:
					{
					setState(2255);
					((NamedExpressionContext)_localctx).name = errorCapturingIdentifier();
					}
					break;
				case 2:
					{
					setState(2256);
					identifierList();
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedExpressionSeqContext extends ParserRuleContext {
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public NamedExpressionSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedExpressionSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNamedExpressionSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNamedExpressionSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNamedExpressionSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedExpressionSeqContext namedExpressionSeq() throws RecognitionException {
		NamedExpressionSeqContext _localctx = new NamedExpressionSeqContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_namedExpressionSeq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2261);
			namedExpression();
			setState(2266);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,292,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2262);
					match(T__2);
					setState(2263);
					namedExpression();
					}
					} 
				}
				setState(2268);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,292,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TransformListContext extends ParserRuleContext {
		public TransformContext transform;
		public List<TransformContext> transforms = new ArrayList<TransformContext>();
		public List<TransformContext> transform() {
			return getRuleContexts(TransformContext.class);
		}
		public TransformContext transform(int i) {
			return getRuleContext(TransformContext.class,i);
		}
		public TransformListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transformList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTransformList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTransformList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTransformList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransformListContext transformList() throws RecognitionException {
		TransformListContext _localctx = new TransformListContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_transformList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2269);
			match(T__0);
			setState(2270);
			((TransformListContext)_localctx).transform = transform();
			((TransformListContext)_localctx).transforms.add(((TransformListContext)_localctx).transform);
			setState(2275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(2271);
				match(T__2);
				setState(2272);
				((TransformListContext)_localctx).transform = transform();
				((TransformListContext)_localctx).transforms.add(((TransformListContext)_localctx).transform);
				}
				}
				setState(2277);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2278);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TransformContext extends ParserRuleContext {
		public TransformContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transform; }
	 
		public TransformContext() { }
		public void copyFrom(TransformContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdentityTransformContext extends TransformContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public IdentityTransformContext(TransformContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIdentityTransform(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIdentityTransform(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIdentityTransform(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ApplyTransformContext extends TransformContext {
		public IdentifierContext transformName;
		public TransformArgumentContext transformArgument;
		public List<TransformArgumentContext> argument = new ArrayList<TransformArgumentContext>();
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TransformArgumentContext> transformArgument() {
			return getRuleContexts(TransformArgumentContext.class);
		}
		public TransformArgumentContext transformArgument(int i) {
			return getRuleContext(TransformArgumentContext.class,i);
		}
		public ApplyTransformContext(TransformContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterApplyTransform(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitApplyTransform(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitApplyTransform(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransformContext transform() throws RecognitionException {
		TransformContext _localctx = new TransformContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_transform);
		int _la;
		try {
			setState(2293);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,295,_ctx) ) {
			case 1:
				_localctx = new IdentityTransformContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2280);
				qualifiedName();
				}
				break;
			case 2:
				_localctx = new ApplyTransformContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2281);
				((ApplyTransformContext)_localctx).transformName = identifier();
				setState(2282);
				match(T__0);
				setState(2283);
				((ApplyTransformContext)_localctx).transformArgument = transformArgument();
				((ApplyTransformContext)_localctx).argument.add(((ApplyTransformContext)_localctx).transformArgument);
				setState(2288);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(2284);
					match(T__2);
					setState(2285);
					((ApplyTransformContext)_localctx).transformArgument = transformArgument();
					((ApplyTransformContext)_localctx).argument.add(((ApplyTransformContext)_localctx).transformArgument);
					}
					}
					setState(2290);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2291);
				match(T__1);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TransformArgumentContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TransformArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transformArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTransformArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTransformArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTransformArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransformArgumentContext transformArgument() throws RecognitionException {
		TransformArgumentContext _localctx = new TransformArgumentContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_transformArgument);
		try {
			setState(2297);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,296,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2295);
				qualifiedName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2296);
				constant();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2299);
			booleanExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpression; }
	 
		public BooleanExpressionContext() { }
		public void copyFrom(BooleanExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LogicalNotContext extends BooleanExpressionContext {
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public LogicalNotContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLogicalNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLogicalNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLogicalNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PredicatedContext extends BooleanExpressionContext {
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public PredicatedContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPredicated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPredicated(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPredicated(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExistsContext extends BooleanExpressionContext {
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public ExistsContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExists(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExists(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExists(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalBinaryContext extends BooleanExpressionContext {
		public BooleanExpressionContext left;
		public Token operator;
		public BooleanExpressionContext right;
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public LogicalBinaryContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLogicalBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLogicalBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLogicalBinary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		return booleanExpression(0);
	}

	private BooleanExpressionContext booleanExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, _parentState);
		BooleanExpressionContext _prevctx = _localctx;
		int _startState = 186;
		enterRecursionRule(_localctx, 186, RULE_booleanExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2313);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,298,_ctx) ) {
			case 1:
				{
				_localctx = new LogicalNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2302);
				match(NOT);
				setState(2303);
				booleanExpression(5);
				}
				break;
			case 2:
				{
				_localctx = new ExistsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2304);
				match(EXISTS);
				setState(2305);
				match(T__0);
				setState(2306);
				query();
				setState(2307);
				match(T__1);
				}
				break;
			case 3:
				{
				_localctx = new PredicatedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2309);
				valueExpression(0);
				setState(2311);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,297,_ctx) ) {
				case 1:
					{
					setState(2310);
					predicate();
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2323);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,300,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2321);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,299,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(2315);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2316);
						((LogicalBinaryContext)_localctx).operator = match(AND);
						setState(2317);
						((LogicalBinaryContext)_localctx).right = booleanExpression(3);
						}
						break;
					case 2:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(2318);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2319);
						((LogicalBinaryContext)_localctx).operator = match(OR);
						setState(2320);
						((LogicalBinaryContext)_localctx).right = booleanExpression(2);
						}
						break;
					}
					} 
				}
				setState(2325);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,300,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PredicateContext extends ParserRuleContext {
		public Token kind;
		public ValueExpressionContext lower;
		public ValueExpressionContext upper;
		public ValueExpressionContext pattern;
		public Token escapeChar;
		public ValueExpressionContext right;
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public TerminalNode BETWEEN() { return getToken(SqlBaseParser.BETWEEN, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode RLIKE() { return getToken(SqlBaseParser.RLIKE, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public TerminalNode ESCAPE() { return getToken(SqlBaseParser.ESCAPE, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode IS() { return getToken(SqlBaseParser.IS, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public TerminalNode TRUE() { return getToken(SqlBaseParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SqlBaseParser.FALSE, 0); }
		public TerminalNode UNKNOWN() { return getToken(SqlBaseParser.UNKNOWN, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode DISTINCT() { return getToken(SqlBaseParser.DISTINCT, 0); }
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_predicate);
		int _la;
		try {
			setState(2388);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,311,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2327);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2326);
					match(NOT);
					}
				}

				setState(2329);
				((PredicateContext)_localctx).kind = match(BETWEEN);
				setState(2330);
				((PredicateContext)_localctx).lower = valueExpression(0);
				setState(2331);
				match(AND);
				setState(2332);
				((PredicateContext)_localctx).upper = valueExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2335);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2334);
					match(NOT);
					}
				}

				setState(2337);
				((PredicateContext)_localctx).kind = match(IN);
				setState(2338);
				match(T__0);
				setState(2339);
				expression();
				setState(2344);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(2340);
					match(T__2);
					setState(2341);
					expression();
					}
					}
					setState(2346);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2347);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2350);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2349);
					match(NOT);
					}
				}

				setState(2352);
				((PredicateContext)_localctx).kind = match(IN);
				setState(2353);
				match(T__0);
				setState(2354);
				query();
				setState(2355);
				match(T__1);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2358);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2357);
					match(NOT);
					}
				}

				setState(2360);
				((PredicateContext)_localctx).kind = match(RLIKE);
				setState(2361);
				((PredicateContext)_localctx).pattern = valueExpression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2363);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2362);
					match(NOT);
					}
				}

				setState(2365);
				((PredicateContext)_localctx).kind = match(LIKE);
				setState(2366);
				((PredicateContext)_localctx).pattern = valueExpression(0);
				setState(2369);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,307,_ctx) ) {
				case 1:
					{
					setState(2367);
					match(ESCAPE);
					setState(2368);
					((PredicateContext)_localctx).escapeChar = match(STRING);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2371);
				match(IS);
				setState(2373);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2372);
					match(NOT);
					}
				}

				setState(2375);
				((PredicateContext)_localctx).kind = match(NULL);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2376);
				match(IS);
				setState(2378);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2377);
					match(NOT);
					}
				}

				setState(2380);
				((PredicateContext)_localctx).kind = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FALSE || _la==TRUE || _la==UNKNOWN) ) {
					((PredicateContext)_localctx).kind = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2381);
				match(IS);
				setState(2383);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2382);
					match(NOT);
					}
				}

				setState(2385);
				((PredicateContext)_localctx).kind = match(DISTINCT);
				setState(2386);
				match(FROM);
				setState(2387);
				((PredicateContext)_localctx).right = valueExpression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Myexpressionlist1Context extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Myexpressionlist1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_myexpressionlist1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterMyexpressionlist1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitMyexpressionlist1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitMyexpressionlist1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Myexpressionlist1Context myexpressionlist1() throws RecognitionException {
		Myexpressionlist1Context _localctx = new Myexpressionlist1Context(_ctx, getState());
		enterRule(_localctx, 190, RULE_myexpressionlist1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2390);
			match(T__0);
			setState(2391);
			expression();
			setState(2396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(2392);
				match(T__2);
				setState(2393);
				expression();
				}
				}
				setState(2398);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2399);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Myexpressionlist2Context extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Myexpressionlist2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_myexpressionlist2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterMyexpressionlist2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitMyexpressionlist2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitMyexpressionlist2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Myexpressionlist2Context myexpressionlist2() throws RecognitionException {
		Myexpressionlist2Context _localctx = new Myexpressionlist2Context(_ctx, getState());
		enterRule(_localctx, 192, RULE_myexpressionlist2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2401);
			match(T__0);
			setState(2402);
			expression();
			setState(2407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(2403);
				match(T__2);
				setState(2404);
				expression();
				}
				}
				setState(2409);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2410);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpatialpredicatedContext extends ParserRuleContext {
		public Token kind;
		public Myexpressionlist1Context myexpressionlist1() {
			return getRuleContext(Myexpressionlist1Context.class,0);
		}
		public TerminalNode POINT() { return getToken(SqlBaseParser.POINT, 0); }
		public Myexpressionlist2Context myexpressionlist2() {
			return getRuleContext(Myexpressionlist2Context.class,0);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode KNNPRED() { return getToken(SqlBaseParser.KNNPRED, 0); }
		public SpatialpredicatedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spatialpredicated; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSpatialpredicated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSpatialpredicated(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSpatialpredicated(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpatialpredicatedContext spatialpredicated() throws RecognitionException {
		SpatialpredicatedContext _localctx = new SpatialpredicatedContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_spatialpredicated);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2412);
			myexpressionlist1();
			setState(2413);
			((SpatialpredicatedContext)_localctx).kind = match(KNNPRED);
			setState(2414);
			match(T__0);
			setState(2415);
			match(POINT);
			setState(2416);
			myexpressionlist2();
			setState(2417);
			match(T__2);
			setState(2418);
			valueExpression(0);
			setState(2419);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueExpressionContext extends ParserRuleContext {
		public ValueExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueExpression; }
	 
		public ValueExpressionContext() { }
		public void copyFrom(ValueExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValueExpressionDefaultContext extends ValueExpressionContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionDefaultContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterValueExpressionDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitValueExpressionDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitValueExpressionDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparisonContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public ValueExpressionContext right;
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public ComparisonContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticBinaryContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public Token operator;
		public ValueExpressionContext right;
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(SqlBaseParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(SqlBaseParser.PERCENT, 0); }
		public TerminalNode DIV() { return getToken(SqlBaseParser.DIV, 0); }
		public TerminalNode PLUS() { return getToken(SqlBaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public TerminalNode CONCAT_PIPE() { return getToken(SqlBaseParser.CONCAT_PIPE, 0); }
		public TerminalNode AMPERSAND() { return getToken(SqlBaseParser.AMPERSAND, 0); }
		public TerminalNode HAT() { return getToken(SqlBaseParser.HAT, 0); }
		public TerminalNode PIPE() { return getToken(SqlBaseParser.PIPE, 0); }
		public ArithmeticBinaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterArithmeticBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitArithmeticBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitArithmeticBinary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticUnaryContext extends ValueExpressionContext {
		public Token operator;
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(SqlBaseParser.PLUS, 0); }
		public TerminalNode TILDE() { return getToken(SqlBaseParser.TILDE, 0); }
		public ArithmeticUnaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterArithmeticUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitArithmeticUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitArithmeticUnary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueExpressionContext valueExpression() throws RecognitionException {
		return valueExpression(0);
	}

	private ValueExpressionContext valueExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ValueExpressionContext _localctx = new ValueExpressionContext(_ctx, _parentState);
		ValueExpressionContext _prevctx = _localctx;
		int _startState = 196;
		enterRecursionRule(_localctx, 196, RULE_valueExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2425);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,314,_ctx) ) {
			case 1:
				{
				_localctx = new ValueExpressionDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2422);
				primaryExpression(0);
				}
				break;
			case 2:
				{
				_localctx = new ArithmeticUnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2423);
				((ArithmeticUnaryContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 287)) & ~0x3f) == 0 && ((1L << (_la - 287)) & ((1L << (PLUS - 287)) | (1L << (MINUS - 287)) | (1L << (TILDE - 287)))) != 0)) ) {
					((ArithmeticUnaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2424);
				valueExpression(7);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2448);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,316,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2446);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,315,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2427);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(2428);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 289)) & ~0x3f) == 0 && ((1L << (_la - 289)) & ((1L << (ASTERISK - 289)) | (1L << (SLASH - 289)) | (1L << (PERCENT - 289)) | (1L << (DIV - 289)))) != 0)) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2429);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(7);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2430);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(2431);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 287)) & ~0x3f) == 0 && ((1L << (_la - 287)) & ((1L << (PLUS - 287)) | (1L << (MINUS - 287)) | (1L << (CONCAT_PIPE - 287)))) != 0)) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2432);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(6);
						}
						break;
					case 3:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2433);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2434);
						((ArithmeticBinaryContext)_localctx).operator = match(AMPERSAND);
						setState(2435);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(5);
						}
						break;
					case 4:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2436);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2437);
						((ArithmeticBinaryContext)_localctx).operator = match(HAT);
						setState(2438);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(4);
						}
						break;
					case 5:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2439);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2440);
						((ArithmeticBinaryContext)_localctx).operator = match(PIPE);
						setState(2441);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(3);
						}
						break;
					case 6:
						{
						_localctx = new ComparisonContext(new ValueExpressionContext(_parentctx, _parentState));
						((ComparisonContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2442);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2443);
						comparisonOperator();
						setState(2444);
						((ComparisonContext)_localctx).right = valueExpression(2);
						}
						break;
					}
					} 
				}
				setState(2450);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,316,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	 
		public PrimaryExpressionContext() { }
		public void copyFrom(PrimaryExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StructContext extends PrimaryExpressionContext {
		public NamedExpressionContext namedExpression;
		public List<NamedExpressionContext> argument = new ArrayList<NamedExpressionContext>();
		public TerminalNode STRUCT() { return getToken(SqlBaseParser.STRUCT, 0); }
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public StructContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStruct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStruct(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DereferenceContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext base;
		public IdentifierContext fieldName;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DereferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDereference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDereference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDereference(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SimpleCaseContext extends PrimaryExpressionContext {
		public ExpressionContext value;
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(SqlBaseParser.CASE, 0); }
		public TerminalNode END() { return getToken(SqlBaseParser.END, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SqlBaseParser.ELSE, 0); }
		public SimpleCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSimpleCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSimpleCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSimpleCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnReferenceContext extends PrimaryExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColumnReferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterColumnReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitColumnReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitColumnReference(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RowConstructorContext extends PrimaryExpressionContext {
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public RowConstructorContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRowConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRowConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRowConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LastContext extends PrimaryExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LAST() { return getToken(SqlBaseParser.LAST, 0); }
		public TerminalNode LAST_VALUE() { return getToken(SqlBaseParser.LAST_VALUE, 0); }
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public TerminalNode IGNORE() { return getToken(SqlBaseParser.IGNORE, 0); }
		public TerminalNode RESPECT() { return getToken(SqlBaseParser.RESPECT, 0); }
		public LastContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLast(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StarContext extends PrimaryExpressionContext {
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public StarContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OverlayContext extends PrimaryExpressionContext {
		public ValueExpressionContext input;
		public ValueExpressionContext replace;
		public ValueExpressionContext position;
		public ValueExpressionContext length;
		public TerminalNode OVERLAY() { return getToken(SqlBaseParser.OVERLAY, 0); }
		public TerminalNode PLACING() { return getToken(SqlBaseParser.PLACING, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public OverlayContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterOverlay(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitOverlay(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitOverlay(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubscriptContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext value;
		public ValueExpressionContext index;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public SubscriptContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSubscript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSubscript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSubscript(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubqueryExpressionContext extends PrimaryExpressionContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public SubqueryExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSubqueryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSubqueryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSubqueryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubstringContext extends PrimaryExpressionContext {
		public ValueExpressionContext str;
		public ValueExpressionContext pos;
		public ValueExpressionContext len;
		public TerminalNode SUBSTR() { return getToken(SqlBaseParser.SUBSTR, 0); }
		public TerminalNode SUBSTRING() { return getToken(SqlBaseParser.SUBSTRING, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public SubstringContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSubstring(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSubstring(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSubstring(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CurrentDatetimeContext extends PrimaryExpressionContext {
		public Token name;
		public TerminalNode CURRENT_DATE() { return getToken(SqlBaseParser.CURRENT_DATE, 0); }
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(SqlBaseParser.CURRENT_TIMESTAMP, 0); }
		public CurrentDatetimeContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCurrentDatetime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCurrentDatetime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCurrentDatetime(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CastContext extends PrimaryExpressionContext {
		public TerminalNode CAST() { return getToken(SqlBaseParser.CAST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public CastContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCast(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstantDefaultContext extends PrimaryExpressionContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstantDefaultContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterConstantDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitConstantDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitConstantDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LambdaContext extends PrimaryExpressionContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LambdaContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLambda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLambda(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLambda(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesizedExpressionContext extends PrimaryExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenthesizedExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterParenthesizedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitParenthesizedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitParenthesizedExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExtractContext extends PrimaryExpressionContext {
		public IdentifierContext field;
		public ValueExpressionContext source;
		public TerminalNode EXTRACT() { return getToken(SqlBaseParser.EXTRACT, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public ExtractContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExtract(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExtract(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExtract(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrimContext extends PrimaryExpressionContext {
		public Token trimOption;
		public ValueExpressionContext trimStr;
		public ValueExpressionContext srcStr;
		public TerminalNode TRIM() { return getToken(SqlBaseParser.TRIM, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode BOTH() { return getToken(SqlBaseParser.BOTH, 0); }
		public TerminalNode LEADING() { return getToken(SqlBaseParser.LEADING, 0); }
		public TerminalNode TRAILING() { return getToken(SqlBaseParser.TRAILING, 0); }
		public TrimContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTrim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTrim(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTrim(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallContext extends PrimaryExpressionContext {
		public ExpressionContext expression;
		public List<ExpressionContext> argument = new ArrayList<ExpressionContext>();
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public TerminalNode OVER() { return getToken(SqlBaseParser.OVER, 0); }
		public WindowSpecContext windowSpec() {
			return getRuleContext(WindowSpecContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public FunctionCallContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SearchedCaseContext extends PrimaryExpressionContext {
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(SqlBaseParser.CASE, 0); }
		public TerminalNode END() { return getToken(SqlBaseParser.END, 0); }
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SqlBaseParser.ELSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SearchedCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSearchedCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSearchedCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSearchedCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PositionContext extends PrimaryExpressionContext {
		public ValueExpressionContext substr;
		public ValueExpressionContext str;
		public TerminalNode POSITION() { return getToken(SqlBaseParser.POSITION, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public PositionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPosition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPosition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FirstContext extends PrimaryExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public TerminalNode FIRST_VALUE() { return getToken(SqlBaseParser.FIRST_VALUE, 0); }
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public TerminalNode IGNORE() { return getToken(SqlBaseParser.IGNORE, 0); }
		public TerminalNode RESPECT() { return getToken(SqlBaseParser.RESPECT, 0); }
		public FirstContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFirst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFirst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFirst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		return primaryExpression(0);
	}

	private PrimaryExpressionContext primaryExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, _parentState);
		PrimaryExpressionContext _prevctx = _localctx;
		int _startState = 198;
		enterRecursionRule(_localctx, 198, RULE_primaryExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2627);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,335,_ctx) ) {
			case 1:
				{
				_localctx = new CurrentDatetimeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2452);
				((CurrentDatetimeContext)_localctx).name = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==CURRENT_DATE || _la==CURRENT_TIMESTAMP) ) {
					((CurrentDatetimeContext)_localctx).name = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				{
				_localctx = new SearchedCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2453);
				match(CASE);
				setState(2455); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2454);
					whenClause();
					}
					}
					setState(2457); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(2461);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(2459);
					match(ELSE);
					setState(2460);
					((SearchedCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(2463);
				match(END);
				}
				break;
			case 3:
				{
				_localctx = new SimpleCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2465);
				match(CASE);
				setState(2466);
				((SimpleCaseContext)_localctx).value = expression();
				setState(2468); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2467);
					whenClause();
					}
					}
					setState(2470); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(2474);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(2472);
					match(ELSE);
					setState(2473);
					((SimpleCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(2476);
				match(END);
				}
				break;
			case 4:
				{
				_localctx = new CastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2478);
				match(CAST);
				setState(2479);
				match(T__0);
				setState(2480);
				expression();
				setState(2481);
				match(AS);
				setState(2482);
				dataType();
				setState(2483);
				match(T__1);
				}
				break;
			case 5:
				{
				_localctx = new StructContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2485);
				match(STRUCT);
				setState(2486);
				match(T__0);
				setState(2495);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,322,_ctx) ) {
				case 1:
					{
					setState(2487);
					((StructContext)_localctx).namedExpression = namedExpression();
					((StructContext)_localctx).argument.add(((StructContext)_localctx).namedExpression);
					setState(2492);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(2488);
						match(T__2);
						setState(2489);
						((StructContext)_localctx).namedExpression = namedExpression();
						((StructContext)_localctx).argument.add(((StructContext)_localctx).namedExpression);
						}
						}
						setState(2494);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(2497);
				match(T__1);
				}
				break;
			case 6:
				{
				_localctx = new FirstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2498);
				_la = _input.LA(1);
				if ( !(_la==FIRST || _la==FIRST_VALUE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2499);
				match(T__0);
				setState(2500);
				expression();
				setState(2503);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IGNORE || _la==RESPECT) {
					{
					setState(2501);
					_la = _input.LA(1);
					if ( !(_la==IGNORE || _la==RESPECT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2502);
					match(NULLS);
					}
				}

				setState(2505);
				match(T__1);
				}
				break;
			case 7:
				{
				_localctx = new LastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2507);
				_la = _input.LA(1);
				if ( !(_la==LAST || _la==LAST_VALUE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2508);
				match(T__0);
				setState(2509);
				expression();
				setState(2512);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IGNORE || _la==RESPECT) {
					{
					setState(2510);
					_la = _input.LA(1);
					if ( !(_la==IGNORE || _la==RESPECT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2511);
					match(NULLS);
					}
				}

				setState(2514);
				match(T__1);
				}
				break;
			case 8:
				{
				_localctx = new PositionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2516);
				match(POSITION);
				setState(2517);
				match(T__0);
				setState(2518);
				((PositionContext)_localctx).substr = valueExpression(0);
				setState(2519);
				match(IN);
				setState(2520);
				((PositionContext)_localctx).str = valueExpression(0);
				setState(2521);
				match(T__1);
				}
				break;
			case 9:
				{
				_localctx = new ConstantDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2523);
				constant();
				}
				break;
			case 10:
				{
				_localctx = new StarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2524);
				match(ASTERISK);
				}
				break;
			case 11:
				{
				_localctx = new StarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2525);
				qualifiedName();
				setState(2526);
				match(T__3);
				setState(2527);
				match(ASTERISK);
				}
				break;
			case 12:
				{
				_localctx = new RowConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2529);
				match(T__0);
				setState(2530);
				namedExpression();
				setState(2533); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2531);
					match(T__2);
					setState(2532);
					namedExpression();
					}
					}
					setState(2535); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__2 );
				setState(2537);
				match(T__1);
				}
				break;
			case 13:
				{
				_localctx = new SubqueryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2539);
				match(T__0);
				setState(2540);
				query();
				setState(2541);
				match(T__1);
				}
				break;
			case 14:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2543);
				functionName();
				setState(2544);
				match(T__0);
				setState(2556);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,328,_ctx) ) {
				case 1:
					{
					setState(2546);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,326,_ctx) ) {
					case 1:
						{
						setState(2545);
						setQuantifier();
						}
						break;
					}
					setState(2548);
					((FunctionCallContext)_localctx).expression = expression();
					((FunctionCallContext)_localctx).argument.add(((FunctionCallContext)_localctx).expression);
					setState(2553);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(2549);
						match(T__2);
						setState(2550);
						((FunctionCallContext)_localctx).expression = expression();
						((FunctionCallContext)_localctx).argument.add(((FunctionCallContext)_localctx).expression);
						}
						}
						setState(2555);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(2558);
				match(T__1);
				setState(2561);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,329,_ctx) ) {
				case 1:
					{
					setState(2559);
					match(OVER);
					setState(2560);
					windowSpec();
					}
					break;
				}
				}
				break;
			case 15:
				{
				_localctx = new LambdaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2563);
				identifier();
				setState(2564);
				match(T__6);
				setState(2565);
				expression();
				}
				break;
			case 16:
				{
				_localctx = new LambdaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2567);
				match(T__0);
				setState(2568);
				identifier();
				setState(2571); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2569);
					match(T__2);
					setState(2570);
					identifier();
					}
					}
					setState(2573); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__2 );
				setState(2575);
				match(T__1);
				setState(2576);
				match(T__6);
				setState(2577);
				expression();
				}
				break;
			case 17:
				{
				_localctx = new ColumnReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2579);
				identifier();
				}
				break;
			case 18:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2580);
				match(T__0);
				setState(2581);
				expression();
				setState(2582);
				match(T__1);
				}
				break;
			case 19:
				{
				_localctx = new ExtractContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2584);
				match(EXTRACT);
				setState(2585);
				match(T__0);
				setState(2586);
				((ExtractContext)_localctx).field = identifier();
				setState(2587);
				match(FROM);
				setState(2588);
				((ExtractContext)_localctx).source = valueExpression(0);
				setState(2589);
				match(T__1);
				}
				break;
			case 20:
				{
				_localctx = new SubstringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2591);
				_la = _input.LA(1);
				if ( !(_la==SUBSTR || _la==SUBSTRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2592);
				match(T__0);
				setState(2593);
				((SubstringContext)_localctx).str = valueExpression(0);
				setState(2594);
				_la = _input.LA(1);
				if ( !(_la==T__2 || _la==FROM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2595);
				((SubstringContext)_localctx).pos = valueExpression(0);
				setState(2598);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2 || _la==FOR) {
					{
					setState(2596);
					_la = _input.LA(1);
					if ( !(_la==T__2 || _la==FOR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2597);
					((SubstringContext)_localctx).len = valueExpression(0);
					}
				}

				setState(2600);
				match(T__1);
				}
				break;
			case 21:
				{
				_localctx = new TrimContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2602);
				match(TRIM);
				setState(2603);
				match(T__0);
				setState(2605);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,332,_ctx) ) {
				case 1:
					{
					setState(2604);
					((TrimContext)_localctx).trimOption = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==BOTH || _la==LEADING || _la==TRAILING) ) {
						((TrimContext)_localctx).trimOption = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(2608);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,333,_ctx) ) {
				case 1:
					{
					setState(2607);
					((TrimContext)_localctx).trimStr = valueExpression(0);
					}
					break;
				}
				setState(2610);
				match(FROM);
				setState(2611);
				((TrimContext)_localctx).srcStr = valueExpression(0);
				setState(2612);
				match(T__1);
				}
				break;
			case 22:
				{
				_localctx = new OverlayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2614);
				match(OVERLAY);
				setState(2615);
				match(T__0);
				setState(2616);
				((OverlayContext)_localctx).input = valueExpression(0);
				setState(2617);
				match(PLACING);
				setState(2618);
				((OverlayContext)_localctx).replace = valueExpression(0);
				setState(2619);
				match(FROM);
				setState(2620);
				((OverlayContext)_localctx).position = valueExpression(0);
				setState(2623);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FOR) {
					{
					setState(2621);
					match(FOR);
					setState(2622);
					((OverlayContext)_localctx).length = valueExpression(0);
					}
				}

				setState(2625);
				match(T__1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2639);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,337,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2637);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,336,_ctx) ) {
					case 1:
						{
						_localctx = new SubscriptContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((SubscriptContext)_localctx).value = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(2629);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(2630);
						match(T__7);
						setState(2631);
						((SubscriptContext)_localctx).index = valueExpression(0);
						setState(2632);
						match(T__8);
						}
						break;
					case 2:
						{
						_localctx = new DereferenceContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((DereferenceContext)_localctx).base = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(2634);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(2635);
						match(T__3);
						setState(2636);
						((DereferenceContext)_localctx).fieldName = identifier();
						}
						break;
					}
					} 
				}
				setState(2641);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,337,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	 
		public ConstantContext() { }
		public void copyFrom(ConstantContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NullLiteralContext extends ConstantContext {
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public NullLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNullLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNullLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNullLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringLiteralContext extends ConstantContext {
		public List<TerminalNode> STRING() { return getTokens(SqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SqlBaseParser.STRING, i);
		}
		public StringLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeConstructorContext extends ConstantContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TypeConstructorContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTypeConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTypeConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTypeConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntervalLiteralContext extends ConstantContext {
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public IntervalLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIntervalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIntervalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIntervalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumericLiteralContext extends ConstantContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NumericLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNumericLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNumericLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNumericLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanLiteralContext extends ConstantContext {
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public BooleanLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBooleanLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_constant);
		try {
			int _alt;
			setState(2654);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,339,_ctx) ) {
			case 1:
				_localctx = new NullLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2642);
				match(NULL);
				}
				break;
			case 2:
				_localctx = new IntervalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2643);
				interval();
				}
				break;
			case 3:
				_localctx = new TypeConstructorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2644);
				identifier();
				setState(2645);
				match(STRING);
				}
				break;
			case 4:
				_localctx = new NumericLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2647);
				number();
				}
				break;
			case 5:
				_localctx = new BooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2648);
				booleanValue();
				}
				break;
			case 6:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(2650); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2649);
						match(STRING);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2652); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,338,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(SqlBaseParser.NEQ, 0); }
		public TerminalNode NEQJ() { return getToken(SqlBaseParser.NEQJ, 0); }
		public TerminalNode LT() { return getToken(SqlBaseParser.LT, 0); }
		public TerminalNode LTE() { return getToken(SqlBaseParser.LTE, 0); }
		public TerminalNode GT() { return getToken(SqlBaseParser.GT, 0); }
		public TerminalNode GTE() { return getToken(SqlBaseParser.GTE, 0); }
		public TerminalNode NSEQ() { return getToken(SqlBaseParser.NSEQ, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitComparisonOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2656);
			_la = _input.LA(1);
			if ( !(((((_la - 279)) & ~0x3f) == 0 && ((1L << (_la - 279)) & ((1L << (EQ - 279)) | (1L << (NSEQ - 279)) | (1L << (NEQ - 279)) | (1L << (NEQJ - 279)) | (1L << (LT - 279)) | (1L << (LTE - 279)) | (1L << (GT - 279)) | (1L << (GTE - 279)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArithmeticOperatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(SqlBaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(SqlBaseParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(SqlBaseParser.PERCENT, 0); }
		public TerminalNode DIV() { return getToken(SqlBaseParser.DIV, 0); }
		public TerminalNode TILDE() { return getToken(SqlBaseParser.TILDE, 0); }
		public TerminalNode AMPERSAND() { return getToken(SqlBaseParser.AMPERSAND, 0); }
		public TerminalNode PIPE() { return getToken(SqlBaseParser.PIPE, 0); }
		public TerminalNode CONCAT_PIPE() { return getToken(SqlBaseParser.CONCAT_PIPE, 0); }
		public TerminalNode HAT() { return getToken(SqlBaseParser.HAT, 0); }
		public ArithmeticOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterArithmeticOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitArithmeticOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitArithmeticOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticOperatorContext arithmeticOperator() throws RecognitionException {
		ArithmeticOperatorContext _localctx = new ArithmeticOperatorContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_arithmeticOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2658);
			_la = _input.LA(1);
			if ( !(((((_la - 287)) & ~0x3f) == 0 && ((1L << (_la - 287)) & ((1L << (PLUS - 287)) | (1L << (MINUS - 287)) | (1L << (ASTERISK - 287)) | (1L << (SLASH - 287)) | (1L << (PERCENT - 287)) | (1L << (DIV - 287)) | (1L << (TILDE - 287)) | (1L << (AMPERSAND - 287)) | (1L << (PIPE - 287)) | (1L << (CONCAT_PIPE - 287)) | (1L << (HAT - 287)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PredicateOperatorContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public PredicateOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicateOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPredicateOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPredicateOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPredicateOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateOperatorContext predicateOperator() throws RecognitionException {
		PredicateOperatorContext _localctx = new PredicateOperatorContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_predicateOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2660);
			_la = _input.LA(1);
			if ( !(_la==AND || ((((_la - 114)) & ~0x3f) == 0 && ((1L << (_la - 114)) & ((1L << (IN - 114)) | (1L << (NOT - 114)) | (1L << (OR - 114)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanValueContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(SqlBaseParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SqlBaseParser.FALSE, 0); }
		public BooleanValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBooleanValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBooleanValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBooleanValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanValueContext booleanValue() throws RecognitionException {
		BooleanValueContext _localctx = new BooleanValueContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_booleanValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2662);
			_la = _input.LA(1);
			if ( !(_la==FALSE || _la==TRUE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntervalContext extends ParserRuleContext {
		public TerminalNode INTERVAL() { return getToken(SqlBaseParser.INTERVAL, 0); }
		public ErrorCapturingMultiUnitsIntervalContext errorCapturingMultiUnitsInterval() {
			return getRuleContext(ErrorCapturingMultiUnitsIntervalContext.class,0);
		}
		public ErrorCapturingUnitToUnitIntervalContext errorCapturingUnitToUnitInterval() {
			return getRuleContext(ErrorCapturingUnitToUnitIntervalContext.class,0);
		}
		public IntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalContext interval() throws RecognitionException {
		IntervalContext _localctx = new IntervalContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_interval);
		try {
			setState(2674);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,342,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2664);
				match(INTERVAL);
				setState(2667);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,340,_ctx) ) {
				case 1:
					{
					setState(2665);
					errorCapturingMultiUnitsInterval();
					}
					break;
				case 2:
					{
					setState(2666);
					errorCapturingUnitToUnitInterval();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2669);
				if (!(SQL_standard_keyword_behavior)) throw new FailedPredicateException(this, "SQL_standard_keyword_behavior");
				setState(2672);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,341,_ctx) ) {
				case 1:
					{
					setState(2670);
					errorCapturingMultiUnitsInterval();
					}
					break;
				case 2:
					{
					setState(2671);
					errorCapturingUnitToUnitInterval();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ErrorCapturingMultiUnitsIntervalContext extends ParserRuleContext {
		public MultiUnitsIntervalContext multiUnitsInterval() {
			return getRuleContext(MultiUnitsIntervalContext.class,0);
		}
		public UnitToUnitIntervalContext unitToUnitInterval() {
			return getRuleContext(UnitToUnitIntervalContext.class,0);
		}
		public ErrorCapturingMultiUnitsIntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorCapturingMultiUnitsInterval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterErrorCapturingMultiUnitsInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitErrorCapturingMultiUnitsInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitErrorCapturingMultiUnitsInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorCapturingMultiUnitsIntervalContext errorCapturingMultiUnitsInterval() throws RecognitionException {
		ErrorCapturingMultiUnitsIntervalContext _localctx = new ErrorCapturingMultiUnitsIntervalContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_errorCapturingMultiUnitsInterval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2676);
			multiUnitsInterval();
			setState(2678);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,343,_ctx) ) {
			case 1:
				{
				setState(2677);
				unitToUnitInterval();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiUnitsIntervalContext extends ParserRuleContext {
		public List<IntervalValueContext> intervalValue() {
			return getRuleContexts(IntervalValueContext.class);
		}
		public IntervalValueContext intervalValue(int i) {
			return getRuleContext(IntervalValueContext.class,i);
		}
		public List<IntervalUnitContext> intervalUnit() {
			return getRuleContexts(IntervalUnitContext.class);
		}
		public IntervalUnitContext intervalUnit(int i) {
			return getRuleContext(IntervalUnitContext.class,i);
		}
		public MultiUnitsIntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiUnitsInterval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterMultiUnitsInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitMultiUnitsInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitMultiUnitsInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiUnitsIntervalContext multiUnitsInterval() throws RecognitionException {
		MultiUnitsIntervalContext _localctx = new MultiUnitsIntervalContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_multiUnitsInterval);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2683); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2680);
					intervalValue();
					setState(2681);
					intervalUnit();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2685); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,344,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ErrorCapturingUnitToUnitIntervalContext extends ParserRuleContext {
		public UnitToUnitIntervalContext body;
		public MultiUnitsIntervalContext error1;
		public UnitToUnitIntervalContext error2;
		public List<UnitToUnitIntervalContext> unitToUnitInterval() {
			return getRuleContexts(UnitToUnitIntervalContext.class);
		}
		public UnitToUnitIntervalContext unitToUnitInterval(int i) {
			return getRuleContext(UnitToUnitIntervalContext.class,i);
		}
		public MultiUnitsIntervalContext multiUnitsInterval() {
			return getRuleContext(MultiUnitsIntervalContext.class,0);
		}
		public ErrorCapturingUnitToUnitIntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorCapturingUnitToUnitInterval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterErrorCapturingUnitToUnitInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitErrorCapturingUnitToUnitInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitErrorCapturingUnitToUnitInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorCapturingUnitToUnitIntervalContext errorCapturingUnitToUnitInterval() throws RecognitionException {
		ErrorCapturingUnitToUnitIntervalContext _localctx = new ErrorCapturingUnitToUnitIntervalContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_errorCapturingUnitToUnitInterval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2687);
			((ErrorCapturingUnitToUnitIntervalContext)_localctx).body = unitToUnitInterval();
			setState(2690);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,345,_ctx) ) {
			case 1:
				{
				setState(2688);
				((ErrorCapturingUnitToUnitIntervalContext)_localctx).error1 = multiUnitsInterval();
				}
				break;
			case 2:
				{
				setState(2689);
				((ErrorCapturingUnitToUnitIntervalContext)_localctx).error2 = unitToUnitInterval();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnitToUnitIntervalContext extends ParserRuleContext {
		public IntervalValueContext value;
		public IntervalUnitContext from;
		public IntervalUnitContext to;
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public IntervalValueContext intervalValue() {
			return getRuleContext(IntervalValueContext.class,0);
		}
		public List<IntervalUnitContext> intervalUnit() {
			return getRuleContexts(IntervalUnitContext.class);
		}
		public IntervalUnitContext intervalUnit(int i) {
			return getRuleContext(IntervalUnitContext.class,i);
		}
		public UnitToUnitIntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unitToUnitInterval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUnitToUnitInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUnitToUnitInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUnitToUnitInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnitToUnitIntervalContext unitToUnitInterval() throws RecognitionException {
		UnitToUnitIntervalContext _localctx = new UnitToUnitIntervalContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_unitToUnitInterval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2692);
			((UnitToUnitIntervalContext)_localctx).value = intervalValue();
			setState(2693);
			((UnitToUnitIntervalContext)_localctx).from = intervalUnit();
			setState(2694);
			match(TO);
			setState(2695);
			((UnitToUnitIntervalContext)_localctx).to = intervalUnit();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntervalValueContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(SqlBaseParser.DECIMAL_VALUE, 0); }
		public TerminalNode PLUS() { return getToken(SqlBaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public IntervalValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIntervalValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIntervalValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIntervalValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalValueContext intervalValue() throws RecognitionException {
		IntervalValueContext _localctx = new IntervalValueContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_intervalValue);
		int _la;
		try {
			setState(2702);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case INTEGER_VALUE:
			case DECIMAL_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2698);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(2697);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(2700);
				_la = _input.LA(1);
				if ( !(_la==INTEGER_VALUE || _la==DECIMAL_VALUE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(2701);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntervalUnitContext extends ParserRuleContext {
		public TerminalNode DAY() { return getToken(SqlBaseParser.DAY, 0); }
		public TerminalNode DAYS() { return getToken(SqlBaseParser.DAYS, 0); }
		public TerminalNode HOUR() { return getToken(SqlBaseParser.HOUR, 0); }
		public TerminalNode HOURS() { return getToken(SqlBaseParser.HOURS, 0); }
		public TerminalNode MICROSECOND() { return getToken(SqlBaseParser.MICROSECOND, 0); }
		public TerminalNode MICROSECONDS() { return getToken(SqlBaseParser.MICROSECONDS, 0); }
		public TerminalNode MILLISECOND() { return getToken(SqlBaseParser.MILLISECOND, 0); }
		public TerminalNode MILLISECONDS() { return getToken(SqlBaseParser.MILLISECONDS, 0); }
		public TerminalNode MINUTE() { return getToken(SqlBaseParser.MINUTE, 0); }
		public TerminalNode MINUTES() { return getToken(SqlBaseParser.MINUTES, 0); }
		public TerminalNode MONTH() { return getToken(SqlBaseParser.MONTH, 0); }
		public TerminalNode MONTHS() { return getToken(SqlBaseParser.MONTHS, 0); }
		public TerminalNode SECOND() { return getToken(SqlBaseParser.SECOND, 0); }
		public TerminalNode SECONDS() { return getToken(SqlBaseParser.SECONDS, 0); }
		public TerminalNode WEEK() { return getToken(SqlBaseParser.WEEK, 0); }
		public TerminalNode WEEKS() { return getToken(SqlBaseParser.WEEKS, 0); }
		public TerminalNode YEAR() { return getToken(SqlBaseParser.YEAR, 0); }
		public TerminalNode YEARS() { return getToken(SqlBaseParser.YEARS, 0); }
		public IntervalUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIntervalUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIntervalUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIntervalUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalUnitContext intervalUnit() throws RecognitionException {
		IntervalUnitContext _localctx = new IntervalUnitContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_intervalUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2704);
			_la = _input.LA(1);
			if ( !(((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & ((1L << (DAY - 63)) | (1L << (DAYS - 63)) | (1L << (HOUR - 63)) | (1L << (HOURS - 63)))) != 0) || ((((_la - 148)) & ~0x3f) == 0 && ((1L << (_la - 148)) & ((1L << (MICROSECOND - 148)) | (1L << (MICROSECONDS - 148)) | (1L << (MILLISECOND - 148)) | (1L << (MILLISECONDS - 148)) | (1L << (MINUTE - 148)) | (1L << (MINUTES - 148)) | (1L << (MONTH - 148)) | (1L << (MONTHS - 148)))) != 0) || ((((_la - 214)) & ~0x3f) == 0 && ((1L << (_la - 214)) & ((1L << (SECOND - 214)) | (1L << (SECONDS - 214)) | (1L << (WEEK - 214)) | (1L << (WEEKS - 214)) | (1L << (YEAR - 214)) | (1L << (YEARS - 214)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColPositionContext extends ParserRuleContext {
		public Token position;
		public ErrorCapturingIdentifierContext afterCol;
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public TerminalNode AFTER() { return getToken(SqlBaseParser.AFTER, 0); }
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public ColPositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colPosition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterColPosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitColPosition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitColPosition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColPositionContext colPosition() throws RecognitionException {
		ColPositionContext _localctx = new ColPositionContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_colPosition);
		try {
			setState(2709);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FIRST:
				enterOuterAlt(_localctx, 1);
				{
				setState(2706);
				((ColPositionContext)_localctx).position = match(FIRST);
				}
				break;
			case AFTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(2707);
				((ColPositionContext)_localctx).position = match(AFTER);
				setState(2708);
				((ColPositionContext)_localctx).afterCol = errorCapturingIdentifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataTypeContext extends ParserRuleContext {
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
	 
		public DataTypeContext() { }
		public void copyFrom(DataTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ComplexDataTypeContext extends DataTypeContext {
		public Token complex;
		public List<DataTypeContext> dataType() {
			return getRuleContexts(DataTypeContext.class);
		}
		public DataTypeContext dataType(int i) {
			return getRuleContext(DataTypeContext.class,i);
		}
		public TerminalNode ARRAY() { return getToken(SqlBaseParser.ARRAY, 0); }
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode STRUCT() { return getToken(SqlBaseParser.STRUCT, 0); }
		public TerminalNode NEQ() { return getToken(SqlBaseParser.NEQ, 0); }
		public ComplexColTypeListContext complexColTypeList() {
			return getRuleContext(ComplexColTypeListContext.class,0);
		}
		public ComplexDataTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterComplexDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitComplexDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitComplexDataType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimitiveDataTypeContext extends DataTypeContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> INTEGER_VALUE() { return getTokens(SqlBaseParser.INTEGER_VALUE); }
		public TerminalNode INTEGER_VALUE(int i) {
			return getToken(SqlBaseParser.INTEGER_VALUE, i);
		}
		public PrimitiveDataTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPrimitiveDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPrimitiveDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPrimitiveDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_dataType);
		int _la;
		try {
			setState(2745);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,353,_ctx) ) {
			case 1:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2711);
				((ComplexDataTypeContext)_localctx).complex = match(ARRAY);
				setState(2712);
				match(LT);
				setState(2713);
				dataType();
				setState(2714);
				match(GT);
				}
				break;
			case 2:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2716);
				((ComplexDataTypeContext)_localctx).complex = match(MAP);
				setState(2717);
				match(LT);
				setState(2718);
				dataType();
				setState(2719);
				match(T__2);
				setState(2720);
				dataType();
				setState(2721);
				match(GT);
				}
				break;
			case 3:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2723);
				((ComplexDataTypeContext)_localctx).complex = match(STRUCT);
				setState(2730);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LT:
					{
					setState(2724);
					match(LT);
					setState(2726);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,349,_ctx) ) {
					case 1:
						{
						setState(2725);
						complexColTypeList();
						}
						break;
					}
					setState(2728);
					match(GT);
					}
					break;
				case NEQ:
					{
					setState(2729);
					match(NEQ);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 4:
				_localctx = new PrimitiveDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2732);
				identifier();
				setState(2743);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,352,_ctx) ) {
				case 1:
					{
					setState(2733);
					match(T__0);
					setState(2734);
					match(INTEGER_VALUE);
					setState(2739);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(2735);
						match(T__2);
						setState(2736);
						match(INTEGER_VALUE);
						}
						}
						setState(2741);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2742);
					match(T__1);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedColTypeWithPositionListContext extends ParserRuleContext {
		public List<QualifiedColTypeWithPositionContext> qualifiedColTypeWithPosition() {
			return getRuleContexts(QualifiedColTypeWithPositionContext.class);
		}
		public QualifiedColTypeWithPositionContext qualifiedColTypeWithPosition(int i) {
			return getRuleContext(QualifiedColTypeWithPositionContext.class,i);
		}
		public QualifiedColTypeWithPositionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedColTypeWithPositionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQualifiedColTypeWithPositionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQualifiedColTypeWithPositionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQualifiedColTypeWithPositionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedColTypeWithPositionListContext qualifiedColTypeWithPositionList() throws RecognitionException {
		QualifiedColTypeWithPositionListContext _localctx = new QualifiedColTypeWithPositionListContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_qualifiedColTypeWithPositionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2747);
			qualifiedColTypeWithPosition();
			setState(2752);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(2748);
				match(T__2);
				setState(2749);
				qualifiedColTypeWithPosition();
				}
				}
				setState(2754);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedColTypeWithPositionContext extends ParserRuleContext {
		public MultipartIdentifierContext name;
		public Token comment;
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public ColPositionContext colPosition() {
			return getRuleContext(ColPositionContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public QualifiedColTypeWithPositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedColTypeWithPosition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQualifiedColTypeWithPosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQualifiedColTypeWithPosition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQualifiedColTypeWithPosition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedColTypeWithPositionContext qualifiedColTypeWithPosition() throws RecognitionException {
		QualifiedColTypeWithPositionContext _localctx = new QualifiedColTypeWithPositionContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_qualifiedColTypeWithPosition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2755);
			((QualifiedColTypeWithPositionContext)_localctx).name = multipartIdentifier();
			setState(2756);
			dataType();
			setState(2759);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(2757);
				match(COMMENT);
				setState(2758);
				((QualifiedColTypeWithPositionContext)_localctx).comment = match(STRING);
				}
			}

			setState(2762);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AFTER || _la==FIRST) {
				{
				setState(2761);
				colPosition();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColTypeListContext extends ParserRuleContext {
		public List<ColTypeContext> colType() {
			return getRuleContexts(ColTypeContext.class);
		}
		public ColTypeContext colType(int i) {
			return getRuleContext(ColTypeContext.class,i);
		}
		public ColTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterColTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitColTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitColTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColTypeListContext colTypeList() throws RecognitionException {
		ColTypeListContext _localctx = new ColTypeListContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_colTypeList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2764);
			colType();
			setState(2769);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,357,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2765);
					match(T__2);
					setState(2766);
					colType();
					}
					} 
				}
				setState(2771);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,357,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColTypeContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext colName;
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public ColTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterColType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitColType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitColType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColTypeContext colType() throws RecognitionException {
		ColTypeContext _localctx = new ColTypeContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_colType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2772);
			((ColTypeContext)_localctx).colName = errorCapturingIdentifier();
			setState(2773);
			dataType();
			setState(2776);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,358,_ctx) ) {
			case 1:
				{
				setState(2774);
				match(COMMENT);
				setState(2775);
				match(STRING);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComplexColTypeListContext extends ParserRuleContext {
		public List<ComplexColTypeContext> complexColType() {
			return getRuleContexts(ComplexColTypeContext.class);
		}
		public ComplexColTypeContext complexColType(int i) {
			return getRuleContext(ComplexColTypeContext.class,i);
		}
		public ComplexColTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexColTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterComplexColTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitComplexColTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitComplexColTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplexColTypeListContext complexColTypeList() throws RecognitionException {
		ComplexColTypeListContext _localctx = new ComplexColTypeListContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_complexColTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2778);
			complexColType();
			setState(2783);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(2779);
				match(T__2);
				setState(2780);
				complexColType();
				}
				}
				setState(2785);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComplexColTypeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public ComplexColTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexColType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterComplexColType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitComplexColType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitComplexColType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplexColTypeContext complexColType() throws RecognitionException {
		ComplexColTypeContext _localctx = new ComplexColTypeContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_complexColType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2786);
			identifier();
			setState(2787);
			match(T__9);
			setState(2788);
			dataType();
			setState(2791);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(2789);
				match(COMMENT);
				setState(2790);
				match(STRING);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhenClauseContext extends ParserRuleContext {
		public ExpressionContext condition;
		public ExpressionContext result;
		public TerminalNode WHEN() { return getToken(SqlBaseParser.WHEN, 0); }
		public TerminalNode THEN() { return getToken(SqlBaseParser.THEN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public WhenClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterWhenClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitWhenClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitWhenClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenClauseContext whenClause() throws RecognitionException {
		WhenClauseContext _localctx = new WhenClauseContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_whenClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2793);
			match(WHEN);
			setState(2794);
			((WhenClauseContext)_localctx).condition = expression();
			setState(2795);
			match(THEN);
			setState(2796);
			((WhenClauseContext)_localctx).result = expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowClauseContext extends ParserRuleContext {
		public TerminalNode WINDOW() { return getToken(SqlBaseParser.WINDOW, 0); }
		public List<NamedWindowContext> namedWindow() {
			return getRuleContexts(NamedWindowContext.class);
		}
		public NamedWindowContext namedWindow(int i) {
			return getRuleContext(NamedWindowContext.class,i);
		}
		public WindowClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterWindowClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitWindowClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitWindowClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowClauseContext windowClause() throws RecognitionException {
		WindowClauseContext _localctx = new WindowClauseContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_windowClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2798);
			match(WINDOW);
			setState(2799);
			namedWindow();
			setState(2804);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,361,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2800);
					match(T__2);
					setState(2801);
					namedWindow();
					}
					} 
				}
				setState(2806);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,361,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedWindowContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext name;
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public WindowSpecContext windowSpec() {
			return getRuleContext(WindowSpecContext.class,0);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public NamedWindowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedWindow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNamedWindow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNamedWindow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNamedWindow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedWindowContext namedWindow() throws RecognitionException {
		NamedWindowContext _localctx = new NamedWindowContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_namedWindow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2807);
			((NamedWindowContext)_localctx).name = errorCapturingIdentifier();
			setState(2808);
			match(AS);
			setState(2809);
			windowSpec();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowSpecContext extends ParserRuleContext {
		public WindowSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowSpec; }
	 
		public WindowSpecContext() { }
		public void copyFrom(WindowSpecContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WindowRefContext extends WindowSpecContext {
		public ErrorCapturingIdentifierContext name;
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public WindowRefContext(WindowSpecContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterWindowRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitWindowRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitWindowRef(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WindowDefContext extends WindowSpecContext {
		public ExpressionContext expression;
		public List<ExpressionContext> partition = new ArrayList<ExpressionContext>();
		public TerminalNode CLUSTER() { return getToken(SqlBaseParser.CLUSTER, 0); }
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public WindowFrameContext windowFrame() {
			return getRuleContext(WindowFrameContext.class,0);
		}
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(SqlBaseParser.DISTRIBUTE, 0); }
		public TerminalNode ORDER() { return getToken(SqlBaseParser.ORDER, 0); }
		public TerminalNode SORT() { return getToken(SqlBaseParser.SORT, 0); }
		public WindowDefContext(WindowSpecContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterWindowDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitWindowDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitWindowDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowSpecContext windowSpec() throws RecognitionException {
		WindowSpecContext _localctx = new WindowSpecContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_windowSpec);
		int _la;
		try {
			setState(2857);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,369,_ctx) ) {
			case 1:
				_localctx = new WindowRefContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2811);
				((WindowRefContext)_localctx).name = errorCapturingIdentifier();
				}
				break;
			case 2:
				_localctx = new WindowRefContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2812);
				match(T__0);
				setState(2813);
				((WindowRefContext)_localctx).name = errorCapturingIdentifier();
				setState(2814);
				match(T__1);
				}
				break;
			case 3:
				_localctx = new WindowDefContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2816);
				match(T__0);
				setState(2851);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CLUSTER:
					{
					setState(2817);
					match(CLUSTER);
					setState(2818);
					match(BY);
					setState(2819);
					((WindowDefContext)_localctx).expression = expression();
					((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
					setState(2824);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(2820);
						match(T__2);
						setState(2821);
						((WindowDefContext)_localctx).expression = expression();
						((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
						}
						}
						setState(2826);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case T__1:
				case DISTRIBUTE:
				case ORDER:
				case PARTITION:
				case RANGE:
				case ROWS:
				case SORT:
					{
					setState(2837);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==DISTRIBUTE || _la==PARTITION) {
						{
						setState(2827);
						_la = _input.LA(1);
						if ( !(_la==DISTRIBUTE || _la==PARTITION) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2828);
						match(BY);
						setState(2829);
						((WindowDefContext)_localctx).expression = expression();
						((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
						setState(2834);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__2) {
							{
							{
							setState(2830);
							match(T__2);
							setState(2831);
							((WindowDefContext)_localctx).expression = expression();
							((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
							}
							}
							setState(2836);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(2849);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ORDER || _la==SORT) {
						{
						setState(2839);
						_la = _input.LA(1);
						if ( !(_la==ORDER || _la==SORT) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2840);
						match(BY);
						setState(2841);
						sortItem();
						setState(2846);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__2) {
							{
							{
							setState(2842);
							match(T__2);
							setState(2843);
							sortItem();
							}
							}
							setState(2848);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2854);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RANGE || _la==ROWS) {
					{
					setState(2853);
					windowFrame();
					}
				}

				setState(2856);
				match(T__1);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowFrameContext extends ParserRuleContext {
		public Token frameType;
		public FrameBoundContext start;
		public FrameBoundContext end;
		public TerminalNode RANGE() { return getToken(SqlBaseParser.RANGE, 0); }
		public List<FrameBoundContext> frameBound() {
			return getRuleContexts(FrameBoundContext.class);
		}
		public FrameBoundContext frameBound(int i) {
			return getRuleContext(FrameBoundContext.class,i);
		}
		public TerminalNode ROWS() { return getToken(SqlBaseParser.ROWS, 0); }
		public TerminalNode BETWEEN() { return getToken(SqlBaseParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public WindowFrameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFrame; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterWindowFrame(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitWindowFrame(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitWindowFrame(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowFrameContext windowFrame() throws RecognitionException {
		WindowFrameContext _localctx = new WindowFrameContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_windowFrame);
		try {
			setState(2875);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,370,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2859);
				((WindowFrameContext)_localctx).frameType = match(RANGE);
				setState(2860);
				((WindowFrameContext)_localctx).start = frameBound();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2861);
				((WindowFrameContext)_localctx).frameType = match(ROWS);
				setState(2862);
				((WindowFrameContext)_localctx).start = frameBound();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2863);
				((WindowFrameContext)_localctx).frameType = match(RANGE);
				setState(2864);
				match(BETWEEN);
				setState(2865);
				((WindowFrameContext)_localctx).start = frameBound();
				setState(2866);
				match(AND);
				setState(2867);
				((WindowFrameContext)_localctx).end = frameBound();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2869);
				((WindowFrameContext)_localctx).frameType = match(ROWS);
				setState(2870);
				match(BETWEEN);
				setState(2871);
				((WindowFrameContext)_localctx).start = frameBound();
				setState(2872);
				match(AND);
				setState(2873);
				((WindowFrameContext)_localctx).end = frameBound();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FrameBoundContext extends ParserRuleContext {
		public Token boundType;
		public TerminalNode UNBOUNDED() { return getToken(SqlBaseParser.UNBOUNDED, 0); }
		public TerminalNode PRECEDING() { return getToken(SqlBaseParser.PRECEDING, 0); }
		public TerminalNode FOLLOWING() { return getToken(SqlBaseParser.FOLLOWING, 0); }
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public TerminalNode CURRENT() { return getToken(SqlBaseParser.CURRENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FrameBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFrameBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFrameBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFrameBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FrameBoundContext frameBound() throws RecognitionException {
		FrameBoundContext _localctx = new FrameBoundContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_frameBound);
		int _la;
		try {
			setState(2884);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,371,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2877);
				match(UNBOUNDED);
				setState(2878);
				((FrameBoundContext)_localctx).boundType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FOLLOWING || _la==PRECEDING) ) {
					((FrameBoundContext)_localctx).boundType = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2879);
				((FrameBoundContext)_localctx).boundType = match(CURRENT);
				setState(2880);
				match(ROW);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2881);
				expression();
				setState(2882);
				((FrameBoundContext)_localctx).boundType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FOLLOWING || _la==PRECEDING) ) {
					((FrameBoundContext)_localctx).boundType = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameListContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public QualifiedNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQualifiedNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQualifiedNameList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQualifiedNameList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameListContext qualifiedNameList() throws RecognitionException {
		QualifiedNameListContext _localctx = new QualifiedNameListContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_qualifiedNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2886);
			qualifiedName();
			setState(2891);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(2887);
				match(T__2);
				setState(2888);
				qualifiedName();
				}
				}
				setState(2893);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionNameContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode LEFT() { return getToken(SqlBaseParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(SqlBaseParser.RIGHT, 0); }
		public FunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFunctionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFunctionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionNameContext functionName() throws RecognitionException {
		FunctionNameContext _localctx = new FunctionNameContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_functionName);
		try {
			setState(2897);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,373,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2894);
				qualifiedName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2895);
				match(LEFT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2896);
				match(RIGHT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2899);
			identifier();
			setState(2904);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,374,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2900);
					match(T__3);
					setState(2901);
					identifier();
					}
					} 
				}
				setState(2906);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,374,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ErrorCapturingIdentifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ErrorCapturingIdentifierExtraContext errorCapturingIdentifierExtra() {
			return getRuleContext(ErrorCapturingIdentifierExtraContext.class,0);
		}
		public ErrorCapturingIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorCapturingIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterErrorCapturingIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitErrorCapturingIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitErrorCapturingIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorCapturingIdentifierContext errorCapturingIdentifier() throws RecognitionException {
		ErrorCapturingIdentifierContext _localctx = new ErrorCapturingIdentifierContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_errorCapturingIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2907);
			identifier();
			setState(2908);
			errorCapturingIdentifierExtra();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ErrorCapturingIdentifierExtraContext extends ParserRuleContext {
		public ErrorCapturingIdentifierExtraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorCapturingIdentifierExtra; }
	 
		public ErrorCapturingIdentifierExtraContext() { }
		public void copyFrom(ErrorCapturingIdentifierExtraContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ErrorIdentContext extends ErrorCapturingIdentifierExtraContext {
		public List<TerminalNode> MINUS() { return getTokens(SqlBaseParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(SqlBaseParser.MINUS, i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public ErrorIdentContext(ErrorCapturingIdentifierExtraContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterErrorIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitErrorIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitErrorIdent(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RealIdentContext extends ErrorCapturingIdentifierExtraContext {
		public RealIdentContext(ErrorCapturingIdentifierExtraContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRealIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRealIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRealIdent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorCapturingIdentifierExtraContext errorCapturingIdentifierExtra() throws RecognitionException {
		ErrorCapturingIdentifierExtraContext _localctx = new ErrorCapturingIdentifierExtraContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_errorCapturingIdentifierExtra);
		try {
			int _alt;
			setState(2917);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,376,_ctx) ) {
			case 1:
				_localctx = new ErrorIdentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2912); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2910);
						match(MINUS);
						setState(2911);
						identifier();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2914); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,375,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				_localctx = new RealIdentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public StrictIdentifierContext strictIdentifier() {
			return getRuleContext(StrictIdentifierContext.class,0);
		}
		public StrictNonReservedContext strictNonReserved() {
			return getRuleContext(StrictNonReservedContext.class,0);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_identifier);
		try {
			setState(2922);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,377,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2919);
				strictIdentifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2920);
				if (!(!SQL_standard_keyword_behavior)) throw new FailedPredicateException(this, "!SQL_standard_keyword_behavior");
				setState(2921);
				strictNonReserved();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StrictIdentifierContext extends ParserRuleContext {
		public StrictIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strictIdentifier; }
	 
		public StrictIdentifierContext() { }
		public void copyFrom(StrictIdentifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class QuotedIdentifierAlternativeContext extends StrictIdentifierContext {
		public QuotedIdentifierContext quotedIdentifier() {
			return getRuleContext(QuotedIdentifierContext.class,0);
		}
		public QuotedIdentifierAlternativeContext(StrictIdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQuotedIdentifierAlternative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQuotedIdentifierAlternative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQuotedIdentifierAlternative(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnquotedIdentifierContext extends StrictIdentifierContext {
		public TerminalNode IDENTIFIER() { return getToken(SqlBaseParser.IDENTIFIER, 0); }
		public AnsiNonReservedContext ansiNonReserved() {
			return getRuleContext(AnsiNonReservedContext.class,0);
		}
		public NonReservedContext nonReserved() {
			return getRuleContext(NonReservedContext.class,0);
		}
		public UnquotedIdentifierContext(StrictIdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUnquotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUnquotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUnquotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrictIdentifierContext strictIdentifier() throws RecognitionException {
		StrictIdentifierContext _localctx = new StrictIdentifierContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_strictIdentifier);
		try {
			setState(2930);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,378,_ctx) ) {
			case 1:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2924);
				match(IDENTIFIER);
				}
				break;
			case 2:
				_localctx = new QuotedIdentifierAlternativeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2925);
				quotedIdentifier();
				}
				break;
			case 3:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2926);
				if (!(SQL_standard_keyword_behavior)) throw new FailedPredicateException(this, "SQL_standard_keyword_behavior");
				setState(2927);
				ansiNonReserved();
				}
				break;
			case 4:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2928);
				if (!(!SQL_standard_keyword_behavior)) throw new FailedPredicateException(this, "!SQL_standard_keyword_behavior");
				setState(2929);
				nonReserved();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuotedIdentifierContext extends ParserRuleContext {
		public TerminalNode BACKQUOTED_IDENTIFIER() { return getToken(SqlBaseParser.BACKQUOTED_IDENTIFIER, 0); }
		public QuotedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quotedIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQuotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQuotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQuotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuotedIdentifierContext quotedIdentifier() throws RecognitionException {
		QuotedIdentifierContext _localctx = new QuotedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_quotedIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2932);
			match(BACKQUOTED_IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	 
		public NumberContext() { }
		public void copyFrom(NumberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DecimalLiteralContext extends NumberContext {
		public TerminalNode DECIMAL_VALUE() { return getToken(SqlBaseParser.DECIMAL_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public DecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BigIntLiteralContext extends NumberContext {
		public TerminalNode BIGINT_LITERAL() { return getToken(SqlBaseParser.BIGINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public BigIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBigIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBigIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBigIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TinyIntLiteralContext extends NumberContext {
		public TerminalNode TINYINT_LITERAL() { return getToken(SqlBaseParser.TINYINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public TinyIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTinyIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTinyIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTinyIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LegacyDecimalLiteralContext extends NumberContext {
		public TerminalNode EXPONENT_VALUE() { return getToken(SqlBaseParser.EXPONENT_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(SqlBaseParser.DECIMAL_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public LegacyDecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLegacyDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLegacyDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLegacyDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BigDecimalLiteralContext extends NumberContext {
		public TerminalNode BIGDECIMAL_LITERAL() { return getToken(SqlBaseParser.BIGDECIMAL_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public BigDecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBigDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBigDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBigDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExponentLiteralContext extends NumberContext {
		public TerminalNode EXPONENT_VALUE() { return getToken(SqlBaseParser.EXPONENT_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public ExponentLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExponentLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExponentLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExponentLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleLiteralContext extends NumberContext {
		public TerminalNode DOUBLE_LITERAL() { return getToken(SqlBaseParser.DOUBLE_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public DoubleLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDoubleLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDoubleLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDoubleLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerLiteralContext extends NumberContext {
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public IntegerLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SmallIntLiteralContext extends NumberContext {
		public TerminalNode SMALLINT_LITERAL() { return getToken(SqlBaseParser.SMALLINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public SmallIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSmallIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSmallIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSmallIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_number);
		int _la;
		try {
			setState(2973);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,388,_ctx) ) {
			case 1:
				_localctx = new ExponentLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2934);
				if (!(!legacy_exponent_literal_as_decimal_enabled)) throw new FailedPredicateException(this, "!legacy_exponent_literal_as_decimal_enabled");
				setState(2936);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2935);
					match(MINUS);
					}
				}

				setState(2938);
				match(EXPONENT_VALUE);
				}
				break;
			case 2:
				_localctx = new DecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2939);
				if (!(!legacy_exponent_literal_as_decimal_enabled)) throw new FailedPredicateException(this, "!legacy_exponent_literal_as_decimal_enabled");
				setState(2941);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2940);
					match(MINUS);
					}
				}

				setState(2943);
				match(DECIMAL_VALUE);
				}
				break;
			case 3:
				_localctx = new LegacyDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2944);
				if (!(legacy_exponent_literal_as_decimal_enabled)) throw new FailedPredicateException(this, "legacy_exponent_literal_as_decimal_enabled");
				setState(2946);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2945);
					match(MINUS);
					}
				}

				setState(2948);
				_la = _input.LA(1);
				if ( !(_la==EXPONENT_VALUE || _la==DECIMAL_VALUE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 4:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2950);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2949);
					match(MINUS);
					}
				}

				setState(2952);
				match(INTEGER_VALUE);
				}
				break;
			case 5:
				_localctx = new BigIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2954);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2953);
					match(MINUS);
					}
				}

				setState(2956);
				match(BIGINT_LITERAL);
				}
				break;
			case 6:
				_localctx = new SmallIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(2958);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2957);
					match(MINUS);
					}
				}

				setState(2960);
				match(SMALLINT_LITERAL);
				}
				break;
			case 7:
				_localctx = new TinyIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(2962);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2961);
					match(MINUS);
					}
				}

				setState(2964);
				match(TINYINT_LITERAL);
				}
				break;
			case 8:
				_localctx = new DoubleLiteralContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(2966);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2965);
					match(MINUS);
					}
				}

				setState(2968);
				match(DOUBLE_LITERAL);
				}
				break;
			case 9:
				_localctx = new BigDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(2970);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2969);
					match(MINUS);
					}
				}

				setState(2972);
				match(BIGDECIMAL_LITERAL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnsiNonReservedContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode AFTER() { return getToken(SqlBaseParser.AFTER, 0); }
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode ANALYZE() { return getToken(SqlBaseParser.ANALYZE, 0); }
		public TerminalNode ARCHIVE() { return getToken(SqlBaseParser.ARCHIVE, 0); }
		public TerminalNode ARRAY() { return getToken(SqlBaseParser.ARRAY, 0); }
		public TerminalNode ASC() { return getToken(SqlBaseParser.ASC, 0); }
		public TerminalNode AT() { return getToken(SqlBaseParser.AT, 0); }
		public TerminalNode BETWEEN() { return getToken(SqlBaseParser.BETWEEN, 0); }
		public TerminalNode BUCKET() { return getToken(SqlBaseParser.BUCKET, 0); }
		public TerminalNode BUCKETS() { return getToken(SqlBaseParser.BUCKETS, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public TerminalNode CACHE() { return getToken(SqlBaseParser.CACHE, 0); }
		public TerminalNode CASCADE() { return getToken(SqlBaseParser.CASCADE, 0); }
		public TerminalNode CHANGE() { return getToken(SqlBaseParser.CHANGE, 0); }
		public TerminalNode CLEAR() { return getToken(SqlBaseParser.CLEAR, 0); }
		public TerminalNode CLUSTER() { return getToken(SqlBaseParser.CLUSTER, 0); }
		public TerminalNode CLUSTERED() { return getToken(SqlBaseParser.CLUSTERED, 0); }
		public TerminalNode CODEGEN() { return getToken(SqlBaseParser.CODEGEN, 0); }
		public TerminalNode COLLECTION() { return getToken(SqlBaseParser.COLLECTION, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode COMMIT() { return getToken(SqlBaseParser.COMMIT, 0); }
		public TerminalNode COMPACT() { return getToken(SqlBaseParser.COMPACT, 0); }
		public TerminalNode COMPACTIONS() { return getToken(SqlBaseParser.COMPACTIONS, 0); }
		public TerminalNode COMPUTE() { return getToken(SqlBaseParser.COMPUTE, 0); }
		public TerminalNode CONCATENATE() { return getToken(SqlBaseParser.CONCATENATE, 0); }
		public TerminalNode COST() { return getToken(SqlBaseParser.COST, 0); }
		public TerminalNode CUBE() { return getToken(SqlBaseParser.CUBE, 0); }
		public TerminalNode CURRENT() { return getToken(SqlBaseParser.CURRENT, 0); }
		public TerminalNode DATA() { return getToken(SqlBaseParser.DATA, 0); }
		public TerminalNode DATABASE() { return getToken(SqlBaseParser.DATABASE, 0); }
		public TerminalNode DATABASES() { return getToken(SqlBaseParser.DATABASES, 0); }
		public TerminalNode DAYS() { return getToken(SqlBaseParser.DAYS, 0); }
		public TerminalNode DBPROPERTIES() { return getToken(SqlBaseParser.DBPROPERTIES, 0); }
		public TerminalNode DEFINED() { return getToken(SqlBaseParser.DEFINED, 0); }
		public TerminalNode DELETE() { return getToken(SqlBaseParser.DELETE, 0); }
		public TerminalNode DELIMITED() { return getToken(SqlBaseParser.DELIMITED, 0); }
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode DFS() { return getToken(SqlBaseParser.DFS, 0); }
		public TerminalNode DIRECTORIES() { return getToken(SqlBaseParser.DIRECTORIES, 0); }
		public TerminalNode DIRECTORY() { return getToken(SqlBaseParser.DIRECTORY, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(SqlBaseParser.DISTRIBUTE, 0); }
		public TerminalNode DIV() { return getToken(SqlBaseParser.DIV, 0); }
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode ESCAPED() { return getToken(SqlBaseParser.ESCAPED, 0); }
		public TerminalNode EXCHANGE() { return getToken(SqlBaseParser.EXCHANGE, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode EXPLAIN() { return getToken(SqlBaseParser.EXPLAIN, 0); }
		public TerminalNode EXPORT() { return getToken(SqlBaseParser.EXPORT, 0); }
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public TerminalNode EXTERNAL() { return getToken(SqlBaseParser.EXTERNAL, 0); }
		public TerminalNode EXTRACT() { return getToken(SqlBaseParser.EXTRACT, 0); }
		public TerminalNode FIELDS() { return getToken(SqlBaseParser.FIELDS, 0); }
		public TerminalNode FILEFORMAT() { return getToken(SqlBaseParser.FILEFORMAT, 0); }
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public TerminalNode FOLLOWING() { return getToken(SqlBaseParser.FOLLOWING, 0); }
		public TerminalNode FORMAT() { return getToken(SqlBaseParser.FORMAT, 0); }
		public TerminalNode FORMATTED() { return getToken(SqlBaseParser.FORMATTED, 0); }
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public TerminalNode FUNCTIONS() { return getToken(SqlBaseParser.FUNCTIONS, 0); }
		public TerminalNode GLOBAL() { return getToken(SqlBaseParser.GLOBAL, 0); }
		public TerminalNode GROUPING() { return getToken(SqlBaseParser.GROUPING, 0); }
		public TerminalNode HOURS() { return getToken(SqlBaseParser.HOURS, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode IGNORE() { return getToken(SqlBaseParser.IGNORE, 0); }
		public TerminalNode IMPORT() { return getToken(SqlBaseParser.IMPORT, 0); }
		public TerminalNode INDEX() { return getToken(SqlBaseParser.INDEX, 0); }
		public TerminalNode INDEXES() { return getToken(SqlBaseParser.INDEXES, 0); }
		public TerminalNode INPATH() { return getToken(SqlBaseParser.INPATH, 0); }
		public TerminalNode INPUTFORMAT() { return getToken(SqlBaseParser.INPUTFORMAT, 0); }
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode INTERVAL() { return getToken(SqlBaseParser.INTERVAL, 0); }
		public TerminalNode ITEMS() { return getToken(SqlBaseParser.ITEMS, 0); }
		public TerminalNode KEYS() { return getToken(SqlBaseParser.KEYS, 0); }
		public TerminalNode LAST() { return getToken(SqlBaseParser.LAST, 0); }
		public TerminalNode LATERAL() { return getToken(SqlBaseParser.LATERAL, 0); }
		public TerminalNode LAZY() { return getToken(SqlBaseParser.LAZY, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public TerminalNode LIMIT() { return getToken(SqlBaseParser.LIMIT, 0); }
		public TerminalNode LINES() { return getToken(SqlBaseParser.LINES, 0); }
		public TerminalNode LIST() { return getToken(SqlBaseParser.LIST, 0); }
		public TerminalNode LOAD() { return getToken(SqlBaseParser.LOAD, 0); }
		public TerminalNode LOCAL() { return getToken(SqlBaseParser.LOCAL, 0); }
		public TerminalNode LOCATION() { return getToken(SqlBaseParser.LOCATION, 0); }
		public TerminalNode LOCK() { return getToken(SqlBaseParser.LOCK, 0); }
		public TerminalNode LOCKS() { return getToken(SqlBaseParser.LOCKS, 0); }
		public TerminalNode LOGICAL() { return getToken(SqlBaseParser.LOGICAL, 0); }
		public TerminalNode MACRO() { return getToken(SqlBaseParser.MACRO, 0); }
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode MATCHED() { return getToken(SqlBaseParser.MATCHED, 0); }
		public TerminalNode MERGE() { return getToken(SqlBaseParser.MERGE, 0); }
		public TerminalNode MICROSECOND() { return getToken(SqlBaseParser.MICROSECOND, 0); }
		public TerminalNode MICROSECONDS() { return getToken(SqlBaseParser.MICROSECONDS, 0); }
		public TerminalNode MILLISECOND() { return getToken(SqlBaseParser.MILLISECOND, 0); }
		public TerminalNode MILLISECONDS() { return getToken(SqlBaseParser.MILLISECONDS, 0); }
		public TerminalNode MINUTES() { return getToken(SqlBaseParser.MINUTES, 0); }
		public TerminalNode MONTHS() { return getToken(SqlBaseParser.MONTHS, 0); }
		public TerminalNode MSCK() { return getToken(SqlBaseParser.MSCK, 0); }
		public TerminalNode NAMESPACE() { return getToken(SqlBaseParser.NAMESPACE, 0); }
		public TerminalNode NAMESPACES() { return getToken(SqlBaseParser.NAMESPACES, 0); }
		public TerminalNode NO() { return getToken(SqlBaseParser.NO, 0); }
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public TerminalNode OF() { return getToken(SqlBaseParser.OF, 0); }
		public TerminalNode OPTION() { return getToken(SqlBaseParser.OPTION, 0); }
		public TerminalNode OPTIONS() { return getToken(SqlBaseParser.OPTIONS, 0); }
		public TerminalNode OUT() { return getToken(SqlBaseParser.OUT, 0); }
		public TerminalNode OUTPUTFORMAT() { return getToken(SqlBaseParser.OUTPUTFORMAT, 0); }
		public TerminalNode OVER() { return getToken(SqlBaseParser.OVER, 0); }
		public TerminalNode OVERLAY() { return getToken(SqlBaseParser.OVERLAY, 0); }
		public TerminalNode OVERWRITE() { return getToken(SqlBaseParser.OVERWRITE, 0); }
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public TerminalNode PARTITIONED() { return getToken(SqlBaseParser.PARTITIONED, 0); }
		public TerminalNode PARTITIONS() { return getToken(SqlBaseParser.PARTITIONS, 0); }
		public TerminalNode PERCENTLIT() { return getToken(SqlBaseParser.PERCENTLIT, 0); }
		public TerminalNode PIVOT() { return getToken(SqlBaseParser.PIVOT, 0); }
		public TerminalNode PLACING() { return getToken(SqlBaseParser.PLACING, 0); }
		public TerminalNode POSITION() { return getToken(SqlBaseParser.POSITION, 0); }
		public TerminalNode PRECEDING() { return getToken(SqlBaseParser.PRECEDING, 0); }
		public TerminalNode PRINCIPALS() { return getToken(SqlBaseParser.PRINCIPALS, 0); }
		public TerminalNode PROPERTIES() { return getToken(SqlBaseParser.PROPERTIES, 0); }
		public TerminalNode PURGE() { return getToken(SqlBaseParser.PURGE, 0); }
		public TerminalNode QUERY() { return getToken(SqlBaseParser.QUERY, 0); }
		public TerminalNode RANGE() { return getToken(SqlBaseParser.RANGE, 0); }
		public TerminalNode RECORDREADER() { return getToken(SqlBaseParser.RECORDREADER, 0); }
		public TerminalNode RECORDWRITER() { return getToken(SqlBaseParser.RECORDWRITER, 0); }
		public TerminalNode RECOVER() { return getToken(SqlBaseParser.RECOVER, 0); }
		public TerminalNode REDUCE() { return getToken(SqlBaseParser.REDUCE, 0); }
		public TerminalNode REFRESH() { return getToken(SqlBaseParser.REFRESH, 0); }
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode REPAIR() { return getToken(SqlBaseParser.REPAIR, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode RESET() { return getToken(SqlBaseParser.RESET, 0); }
		public TerminalNode RESPECT() { return getToken(SqlBaseParser.RESPECT, 0); }
		public TerminalNode RESTRICT() { return getToken(SqlBaseParser.RESTRICT, 0); }
		public TerminalNode REVOKE() { return getToken(SqlBaseParser.REVOKE, 0); }
		public TerminalNode RLIKE() { return getToken(SqlBaseParser.RLIKE, 0); }
		public TerminalNode ROLE() { return getToken(SqlBaseParser.ROLE, 0); }
		public TerminalNode ROLES() { return getToken(SqlBaseParser.ROLES, 0); }
		public TerminalNode ROLLBACK() { return getToken(SqlBaseParser.ROLLBACK, 0); }
		public TerminalNode ROLLUP() { return getToken(SqlBaseParser.ROLLUP, 0); }
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public TerminalNode ROWS() { return getToken(SqlBaseParser.ROWS, 0); }
		public TerminalNode SCHEMA() { return getToken(SqlBaseParser.SCHEMA, 0); }
		public TerminalNode SECONDS() { return getToken(SqlBaseParser.SECONDS, 0); }
		public TerminalNode SEPARATED() { return getToken(SqlBaseParser.SEPARATED, 0); }
		public TerminalNode SERDE() { return getToken(SqlBaseParser.SERDE, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SqlBaseParser.SERDEPROPERTIES, 0); }
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode SETS() { return getToken(SqlBaseParser.SETS, 0); }
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode SKEWED() { return getToken(SqlBaseParser.SKEWED, 0); }
		public TerminalNode SORT() { return getToken(SqlBaseParser.SORT, 0); }
		public TerminalNode SORTED() { return getToken(SqlBaseParser.SORTED, 0); }
		public TerminalNode START() { return getToken(SqlBaseParser.START, 0); }
		public TerminalNode STATISTICS() { return getToken(SqlBaseParser.STATISTICS, 0); }
		public TerminalNode STORED() { return getToken(SqlBaseParser.STORED, 0); }
		public TerminalNode STRATIFY() { return getToken(SqlBaseParser.STRATIFY, 0); }
		public TerminalNode STRUCT() { return getToken(SqlBaseParser.STRUCT, 0); }
		public TerminalNode SUBSTR() { return getToken(SqlBaseParser.SUBSTR, 0); }
		public TerminalNode SUBSTRING() { return getToken(SqlBaseParser.SUBSTRING, 0); }
		public TerminalNode TABLES() { return getToken(SqlBaseParser.TABLES, 0); }
		public TerminalNode TABLESAMPLE() { return getToken(SqlBaseParser.TABLESAMPLE, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SqlBaseParser.TBLPROPERTIES, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode TERMINATED() { return getToken(SqlBaseParser.TERMINATED, 0); }
		public TerminalNode TOUCH() { return getToken(SqlBaseParser.TOUCH, 0); }
		public TerminalNode TRANSACTION() { return getToken(SqlBaseParser.TRANSACTION, 0); }
		public TerminalNode TRANSACTIONS() { return getToken(SqlBaseParser.TRANSACTIONS, 0); }
		public TerminalNode TRANSFORM() { return getToken(SqlBaseParser.TRANSFORM, 0); }
		public TerminalNode TRIM() { return getToken(SqlBaseParser.TRIM, 0); }
		public TerminalNode TRUE() { return getToken(SqlBaseParser.TRUE, 0); }
		public TerminalNode TRUNCATE() { return getToken(SqlBaseParser.TRUNCATE, 0); }
		public TerminalNode UNARCHIVE() { return getToken(SqlBaseParser.UNARCHIVE, 0); }
		public TerminalNode UNBOUNDED() { return getToken(SqlBaseParser.UNBOUNDED, 0); }
		public TerminalNode UNCACHE() { return getToken(SqlBaseParser.UNCACHE, 0); }
		public TerminalNode UNLOCK() { return getToken(SqlBaseParser.UNLOCK, 0); }
		public TerminalNode UNSET() { return getToken(SqlBaseParser.UNSET, 0); }
		public TerminalNode UPDATE() { return getToken(SqlBaseParser.UPDATE, 0); }
		public TerminalNode USE() { return getToken(SqlBaseParser.USE, 0); }
		public TerminalNode VALUES() { return getToken(SqlBaseParser.VALUES, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TerminalNode WEEK() { return getToken(SqlBaseParser.WEEK, 0); }
		public TerminalNode WEEKS() { return getToken(SqlBaseParser.WEEKS, 0); }
		public TerminalNode WINDOW() { return getToken(SqlBaseParser.WINDOW, 0); }
		public TerminalNode YEARS() { return getToken(SqlBaseParser.YEARS, 0); }
		public AnsiNonReservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ansiNonReserved; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAnsiNonReserved(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAnsiNonReserved(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAnsiNonReserved(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnsiNonReservedContext ansiNonReserved() throws RecognitionException {
		AnsiNonReservedContext _localctx = new AnsiNonReservedContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_ansiNonReserved);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2975);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << AFTER) | (1L << ALTER) | (1L << ANALYZE) | (1L << ARCHIVE) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << BETWEEN) | (1L << BUCKET) | (1L << BUCKETS) | (1L << BY) | (1L << CACHE) | (1L << CASCADE) | (1L << CHANGE) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CLUSTERED) | (1L << CODEGEN) | (1L << COLLECTION) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMPACT) | (1L << COMPACTIONS) | (1L << COMPUTE) | (1L << CONCATENATE) | (1L << COST) | (1L << CUBE) | (1L << CURRENT) | (1L << DATA) | (1L << DATABASE) | (1L << DATABASES))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DAYS - 64)) | (1L << (DBPROPERTIES - 64)) | (1L << (DEFINED - 64)) | (1L << (DELETE - 64)) | (1L << (DELIMITED - 64)) | (1L << (DESC - 64)) | (1L << (DESCRIBE - 64)) | (1L << (DFS - 64)) | (1L << (DIRECTORIES - 64)) | (1L << (DIRECTORY - 64)) | (1L << (DISTRIBUTE - 64)) | (1L << (DROP - 64)) | (1L << (ESCAPED - 64)) | (1L << (EXCHANGE - 64)) | (1L << (EXISTS - 64)) | (1L << (EXPLAIN - 64)) | (1L << (EXPORT - 64)) | (1L << (EXTENDED - 64)) | (1L << (EXTERNAL - 64)) | (1L << (EXTRACT - 64)) | (1L << (FIELDS - 64)) | (1L << (FILEFORMAT - 64)) | (1L << (FIRST - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FORMAT - 64)) | (1L << (FORMATTED - 64)) | (1L << (FUNCTION - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GLOBAL - 64)) | (1L << (GROUPING - 64)) | (1L << (HOURS - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (IMPORT - 64)) | (1L << (INDEX - 64)) | (1L << (INDEXES - 64)) | (1L << (INPATH - 64)) | (1L << (INPUTFORMAT - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)) | (1L << (ITEMS - 64)) | (1L << (KEYS - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (LAST - 128)) | (1L << (LATERAL - 128)) | (1L << (LAZY - 128)) | (1L << (LIKE - 128)) | (1L << (LIMIT - 128)) | (1L << (LINES - 128)) | (1L << (LIST - 128)) | (1L << (LOAD - 128)) | (1L << (LOCAL - 128)) | (1L << (LOCATION - 128)) | (1L << (LOCK - 128)) | (1L << (LOCKS - 128)) | (1L << (LOGICAL - 128)) | (1L << (MACRO - 128)) | (1L << (MAP - 128)) | (1L << (MATCHED - 128)) | (1L << (MERGE - 128)) | (1L << (MICROSECOND - 128)) | (1L << (MICROSECONDS - 128)) | (1L << (MILLISECOND - 128)) | (1L << (MILLISECONDS - 128)) | (1L << (MINUTES - 128)) | (1L << (MONTHS - 128)) | (1L << (MSCK - 128)) | (1L << (NAMESPACE - 128)) | (1L << (NAMESPACES - 128)) | (1L << (NO - 128)) | (1L << (NULLS - 128)) | (1L << (OF - 128)) | (1L << (OPTION - 128)) | (1L << (OPTIONS - 128)) | (1L << (OUT - 128)) | (1L << (OUTPUTFORMAT - 128)) | (1L << (OVER - 128)) | (1L << (OVERLAY - 128)) | (1L << (OVERWRITE - 128)) | (1L << (PARTITION - 128)) | (1L << (PARTITIONED - 128)) | (1L << (PARTITIONS - 128)) | (1L << (PERCENTLIT - 128)) | (1L << (PIVOT - 128)) | (1L << (PLACING - 128)) | (1L << (POSITION - 128)) | (1L << (PRECEDING - 128)) | (1L << (PRINCIPALS - 128)) | (1L << (PROPERTIES - 128)) | (1L << (PURGE - 128)) | (1L << (QUERY - 128)) | (1L << (RANGE - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (RECORDREADER - 192)) | (1L << (RECORDWRITER - 192)) | (1L << (RECOVER - 192)) | (1L << (REDUCE - 192)) | (1L << (REFRESH - 192)) | (1L << (RENAME - 192)) | (1L << (REPAIR - 192)) | (1L << (REPLACE - 192)) | (1L << (RESET - 192)) | (1L << (RESPECT - 192)) | (1L << (RESTRICT - 192)) | (1L << (REVOKE - 192)) | (1L << (RLIKE - 192)) | (1L << (ROLE - 192)) | (1L << (ROLES - 192)) | (1L << (ROLLBACK - 192)) | (1L << (ROLLUP - 192)) | (1L << (ROW - 192)) | (1L << (ROWS - 192)) | (1L << (SCHEMA - 192)) | (1L << (SECONDS - 192)) | (1L << (SEPARATED - 192)) | (1L << (SERDE - 192)) | (1L << (SERDEPROPERTIES - 192)) | (1L << (SET - 192)) | (1L << (SETS - 192)) | (1L << (SHOW - 192)) | (1L << (SKEWED - 192)) | (1L << (SORT - 192)) | (1L << (SORTED - 192)) | (1L << (START - 192)) | (1L << (STATISTICS - 192)) | (1L << (STORED - 192)) | (1L << (STRATIFY - 192)) | (1L << (STRUCT - 192)) | (1L << (SUBSTR - 192)) | (1L << (SUBSTRING - 192)) | (1L << (TABLES - 192)) | (1L << (TABLESAMPLE - 192)) | (1L << (TBLPROPERTIES - 192)) | (1L << (TEMPORARY - 192)) | (1L << (TERMINATED - 192)) | (1L << (TOUCH - 192)) | (1L << (TRANSACTION - 192)) | (1L << (TRANSACTIONS - 192)) | (1L << (TRANSFORM - 192)) | (1L << (TRIM - 192)) | (1L << (TRUE - 192)) | (1L << (TRUNCATE - 192)) | (1L << (UNARCHIVE - 192)) | (1L << (UNBOUNDED - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (UNCACHE - 256)) | (1L << (UNLOCK - 256)) | (1L << (UNSET - 256)) | (1L << (UPDATE - 256)) | (1L << (USE - 256)) | (1L << (VALUES - 256)) | (1L << (VIEW - 256)) | (1L << (WEEK - 256)) | (1L << (WEEKS - 256)) | (1L << (WINDOW - 256)) | (1L << (YEARS - 256)) | (1L << (DIV - 256)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StrictNonReservedContext extends ParserRuleContext {
		public TerminalNode ANTI() { return getToken(SqlBaseParser.ANTI, 0); }
		public TerminalNode CROSS() { return getToken(SqlBaseParser.CROSS, 0); }
		public TerminalNode EXCEPT() { return getToken(SqlBaseParser.EXCEPT, 0); }
		public TerminalNode FULL() { return getToken(SqlBaseParser.FULL, 0); }
		public TerminalNode INNER() { return getToken(SqlBaseParser.INNER, 0); }
		public TerminalNode INTERSECT() { return getToken(SqlBaseParser.INTERSECT, 0); }
		public TerminalNode JOIN() { return getToken(SqlBaseParser.JOIN, 0); }
		public TerminalNode LEFT() { return getToken(SqlBaseParser.LEFT, 0); }
		public TerminalNode NATURAL() { return getToken(SqlBaseParser.NATURAL, 0); }
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public TerminalNode RIGHT() { return getToken(SqlBaseParser.RIGHT, 0); }
		public TerminalNode SEMI() { return getToken(SqlBaseParser.SEMI, 0); }
		public TerminalNode SETMINUS() { return getToken(SqlBaseParser.SETMINUS, 0); }
		public TerminalNode UNION() { return getToken(SqlBaseParser.UNION, 0); }
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public TerminalNode KNN() { return getToken(SqlBaseParser.KNN, 0); }
		public StrictNonReservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strictNonReserved; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStrictNonReserved(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStrictNonReserved(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStrictNonReserved(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrictNonReservedContext strictNonReserved() throws RecognitionException {
		StrictNonReservedContext _localctx = new StrictNonReservedContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_strictNonReserved);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2977);
			_la = _input.LA(1);
			if ( !(_la==ANTI || _la==CROSS || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (EXCEPT - 81)) | (1L << (FULL - 81)) | (1L << (INNER - 81)) | (1L << (INTERSECT - 81)) | (1L << (JOIN - 81)) | (1L << (LEFT - 81)))) != 0) || ((((_la - 159)) & ~0x3f) == 0 && ((1L << (_la - 159)) & ((1L << (NATURAL - 159)) | (1L << (ON - 159)) | (1L << (RIGHT - 159)) | (1L << (SEMI - 159)))) != 0) || ((((_la - 223)) & ~0x3f) == 0 && ((1L << (_la - 223)) & ((1L << (SETMINUS - 223)) | (1L << (UNION - 223)) | (1L << (USING - 223)) | (1L << (KNN - 223)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonReservedContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode AFTER() { return getToken(SqlBaseParser.AFTER, 0); }
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode ANALYZE() { return getToken(SqlBaseParser.ANALYZE, 0); }
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public TerminalNode ANY() { return getToken(SqlBaseParser.ANY, 0); }
		public TerminalNode ARCHIVE() { return getToken(SqlBaseParser.ARCHIVE, 0); }
		public TerminalNode ARRAY() { return getToken(SqlBaseParser.ARRAY, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TerminalNode ASC() { return getToken(SqlBaseParser.ASC, 0); }
		public TerminalNode AT() { return getToken(SqlBaseParser.AT, 0); }
		public TerminalNode AUTHORIZATION() { return getToken(SqlBaseParser.AUTHORIZATION, 0); }
		public TerminalNode BETWEEN() { return getToken(SqlBaseParser.BETWEEN, 0); }
		public TerminalNode BOTH() { return getToken(SqlBaseParser.BOTH, 0); }
		public TerminalNode BUCKET() { return getToken(SqlBaseParser.BUCKET, 0); }
		public TerminalNode BUCKETS() { return getToken(SqlBaseParser.BUCKETS, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public TerminalNode CACHE() { return getToken(SqlBaseParser.CACHE, 0); }
		public TerminalNode CASCADE() { return getToken(SqlBaseParser.CASCADE, 0); }
		public TerminalNode CASE() { return getToken(SqlBaseParser.CASE, 0); }
		public TerminalNode CAST() { return getToken(SqlBaseParser.CAST, 0); }
		public TerminalNode CHANGE() { return getToken(SqlBaseParser.CHANGE, 0); }
		public TerminalNode CHECK() { return getToken(SqlBaseParser.CHECK, 0); }
		public TerminalNode CLEAR() { return getToken(SqlBaseParser.CLEAR, 0); }
		public TerminalNode CLUSTER() { return getToken(SqlBaseParser.CLUSTER, 0); }
		public TerminalNode CLUSTERED() { return getToken(SqlBaseParser.CLUSTERED, 0); }
		public TerminalNode CODEGEN() { return getToken(SqlBaseParser.CODEGEN, 0); }
		public TerminalNode COLLATE() { return getToken(SqlBaseParser.COLLATE, 0); }
		public TerminalNode COLLECTION() { return getToken(SqlBaseParser.COLLECTION, 0); }
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode COMMIT() { return getToken(SqlBaseParser.COMMIT, 0); }
		public TerminalNode COMPACT() { return getToken(SqlBaseParser.COMPACT, 0); }
		public TerminalNode COMPACTIONS() { return getToken(SqlBaseParser.COMPACTIONS, 0); }
		public TerminalNode COMPUTE() { return getToken(SqlBaseParser.COMPUTE, 0); }
		public TerminalNode CONCATENATE() { return getToken(SqlBaseParser.CONCATENATE, 0); }
		public TerminalNode CONSTRAINT() { return getToken(SqlBaseParser.CONSTRAINT, 0); }
		public TerminalNode COST() { return getToken(SqlBaseParser.COST, 0); }
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode CUBE() { return getToken(SqlBaseParser.CUBE, 0); }
		public TerminalNode CURRENT() { return getToken(SqlBaseParser.CURRENT, 0); }
		public TerminalNode CURRENT_DATE() { return getToken(SqlBaseParser.CURRENT_DATE, 0); }
		public TerminalNode CURRENT_TIME() { return getToken(SqlBaseParser.CURRENT_TIME, 0); }
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(SqlBaseParser.CURRENT_TIMESTAMP, 0); }
		public TerminalNode CURRENT_USER() { return getToken(SqlBaseParser.CURRENT_USER, 0); }
		public TerminalNode DATA() { return getToken(SqlBaseParser.DATA, 0); }
		public TerminalNode DATABASE() { return getToken(SqlBaseParser.DATABASE, 0); }
		public TerminalNode DATABASES() { return getToken(SqlBaseParser.DATABASES, 0); }
		public TerminalNode DAY() { return getToken(SqlBaseParser.DAY, 0); }
		public TerminalNode DAYS() { return getToken(SqlBaseParser.DAYS, 0); }
		public TerminalNode DBPROPERTIES() { return getToken(SqlBaseParser.DBPROPERTIES, 0); }
		public TerminalNode DEFINED() { return getToken(SqlBaseParser.DEFINED, 0); }
		public TerminalNode DELETE() { return getToken(SqlBaseParser.DELETE, 0); }
		public TerminalNode DELIMITED() { return getToken(SqlBaseParser.DELIMITED, 0); }
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode DFS() { return getToken(SqlBaseParser.DFS, 0); }
		public TerminalNode DIRECTORIES() { return getToken(SqlBaseParser.DIRECTORIES, 0); }
		public TerminalNode DIRECTORY() { return getToken(SqlBaseParser.DIRECTORY, 0); }
		public TerminalNode DISTINCT() { return getToken(SqlBaseParser.DISTINCT, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(SqlBaseParser.DISTRIBUTE, 0); }
		public TerminalNode DIV() { return getToken(SqlBaseParser.DIV, 0); }
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode ELSE() { return getToken(SqlBaseParser.ELSE, 0); }
		public TerminalNode END() { return getToken(SqlBaseParser.END, 0); }
		public TerminalNode ESCAPE() { return getToken(SqlBaseParser.ESCAPE, 0); }
		public TerminalNode ESCAPED() { return getToken(SqlBaseParser.ESCAPED, 0); }
		public TerminalNode EXCHANGE() { return getToken(SqlBaseParser.EXCHANGE, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode EXPLAIN() { return getToken(SqlBaseParser.EXPLAIN, 0); }
		public TerminalNode EXPORT() { return getToken(SqlBaseParser.EXPORT, 0); }
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public TerminalNode EXTERNAL() { return getToken(SqlBaseParser.EXTERNAL, 0); }
		public TerminalNode EXTRACT() { return getToken(SqlBaseParser.EXTRACT, 0); }
		public TerminalNode FALSE() { return getToken(SqlBaseParser.FALSE, 0); }
		public TerminalNode FETCH() { return getToken(SqlBaseParser.FETCH, 0); }
		public TerminalNode FIELDS() { return getToken(SqlBaseParser.FIELDS, 0); }
		public TerminalNode FILEFORMAT() { return getToken(SqlBaseParser.FILEFORMAT, 0); }
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public TerminalNode FIRST_VALUE() { return getToken(SqlBaseParser.FIRST_VALUE, 0); }
		public TerminalNode FOLLOWING() { return getToken(SqlBaseParser.FOLLOWING, 0); }
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public TerminalNode FOREIGN() { return getToken(SqlBaseParser.FOREIGN, 0); }
		public TerminalNode FORMAT() { return getToken(SqlBaseParser.FORMAT, 0); }
		public TerminalNode FORMATTED() { return getToken(SqlBaseParser.FORMATTED, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public TerminalNode FUNCTIONS() { return getToken(SqlBaseParser.FUNCTIONS, 0); }
		public TerminalNode GLOBAL() { return getToken(SqlBaseParser.GLOBAL, 0); }
		public TerminalNode GRANT() { return getToken(SqlBaseParser.GRANT, 0); }
		public TerminalNode GROUP() { return getToken(SqlBaseParser.GROUP, 0); }
		public TerminalNode GROUPING() { return getToken(SqlBaseParser.GROUPING, 0); }
		public TerminalNode HAVING() { return getToken(SqlBaseParser.HAVING, 0); }
		public TerminalNode HOUR() { return getToken(SqlBaseParser.HOUR, 0); }
		public TerminalNode HOURS() { return getToken(SqlBaseParser.HOURS, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode IGNORE() { return getToken(SqlBaseParser.IGNORE, 0); }
		public TerminalNode IMPORT() { return getToken(SqlBaseParser.IMPORT, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public TerminalNode INDEX() { return getToken(SqlBaseParser.INDEX, 0); }
		public TerminalNode INDEXES() { return getToken(SqlBaseParser.INDEXES, 0); }
		public TerminalNode INPATH() { return getToken(SqlBaseParser.INPATH, 0); }
		public TerminalNode INPUTFORMAT() { return getToken(SqlBaseParser.INPUTFORMAT, 0); }
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode INTERVAL() { return getToken(SqlBaseParser.INTERVAL, 0); }
		public TerminalNode INTO() { return getToken(SqlBaseParser.INTO, 0); }
		public TerminalNode IS() { return getToken(SqlBaseParser.IS, 0); }
		public TerminalNode ITEMS() { return getToken(SqlBaseParser.ITEMS, 0); }
		public TerminalNode KEYS() { return getToken(SqlBaseParser.KEYS, 0); }
		public TerminalNode LAST() { return getToken(SqlBaseParser.LAST, 0); }
		public TerminalNode LAST_VALUE() { return getToken(SqlBaseParser.LAST_VALUE, 0); }
		public TerminalNode LATERAL() { return getToken(SqlBaseParser.LATERAL, 0); }
		public TerminalNode LAZY() { return getToken(SqlBaseParser.LAZY, 0); }
		public TerminalNode LEADING() { return getToken(SqlBaseParser.LEADING, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public TerminalNode LIMIT() { return getToken(SqlBaseParser.LIMIT, 0); }
		public TerminalNode LINES() { return getToken(SqlBaseParser.LINES, 0); }
		public TerminalNode LIST() { return getToken(SqlBaseParser.LIST, 0); }
		public TerminalNode LOAD() { return getToken(SqlBaseParser.LOAD, 0); }
		public TerminalNode LOCAL() { return getToken(SqlBaseParser.LOCAL, 0); }
		public TerminalNode LOCATION() { return getToken(SqlBaseParser.LOCATION, 0); }
		public TerminalNode LOCK() { return getToken(SqlBaseParser.LOCK, 0); }
		public TerminalNode LOCKS() { return getToken(SqlBaseParser.LOCKS, 0); }
		public TerminalNode LOGICAL() { return getToken(SqlBaseParser.LOGICAL, 0); }
		public TerminalNode MACRO() { return getToken(SqlBaseParser.MACRO, 0); }
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode MATCHED() { return getToken(SqlBaseParser.MATCHED, 0); }
		public TerminalNode MERGE() { return getToken(SqlBaseParser.MERGE, 0); }
		public TerminalNode MICROSECOND() { return getToken(SqlBaseParser.MICROSECOND, 0); }
		public TerminalNode MICROSECONDS() { return getToken(SqlBaseParser.MICROSECONDS, 0); }
		public TerminalNode MILLISECOND() { return getToken(SqlBaseParser.MILLISECOND, 0); }
		public TerminalNode MILLISECONDS() { return getToken(SqlBaseParser.MILLISECONDS, 0); }
		public TerminalNode MINUTE() { return getToken(SqlBaseParser.MINUTE, 0); }
		public TerminalNode MINUTES() { return getToken(SqlBaseParser.MINUTES, 0); }
		public TerminalNode MONTH() { return getToken(SqlBaseParser.MONTH, 0); }
		public TerminalNode MONTHS() { return getToken(SqlBaseParser.MONTHS, 0); }
		public TerminalNode MSCK() { return getToken(SqlBaseParser.MSCK, 0); }
		public TerminalNode NAMESPACE() { return getToken(SqlBaseParser.NAMESPACE, 0); }
		public TerminalNode NAMESPACES() { return getToken(SqlBaseParser.NAMESPACES, 0); }
		public TerminalNode NO() { return getToken(SqlBaseParser.NO, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public TerminalNode OF() { return getToken(SqlBaseParser.OF, 0); }
		public TerminalNode ONLY() { return getToken(SqlBaseParser.ONLY, 0); }
		public TerminalNode OPTION() { return getToken(SqlBaseParser.OPTION, 0); }
		public TerminalNode OPTIONS() { return getToken(SqlBaseParser.OPTIONS, 0); }
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public TerminalNode ORDER() { return getToken(SqlBaseParser.ORDER, 0); }
		public TerminalNode OUT() { return getToken(SqlBaseParser.OUT, 0); }
		public TerminalNode OUTER() { return getToken(SqlBaseParser.OUTER, 0); }
		public TerminalNode OUTPUTFORMAT() { return getToken(SqlBaseParser.OUTPUTFORMAT, 0); }
		public TerminalNode OVER() { return getToken(SqlBaseParser.OVER, 0); }
		public TerminalNode OVERLAPS() { return getToken(SqlBaseParser.OVERLAPS, 0); }
		public TerminalNode OVERLAY() { return getToken(SqlBaseParser.OVERLAY, 0); }
		public TerminalNode OVERWRITE() { return getToken(SqlBaseParser.OVERWRITE, 0); }
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public TerminalNode PARTITIONED() { return getToken(SqlBaseParser.PARTITIONED, 0); }
		public TerminalNode PARTITIONS() { return getToken(SqlBaseParser.PARTITIONS, 0); }
		public TerminalNode PERCENTLIT() { return getToken(SqlBaseParser.PERCENTLIT, 0); }
		public TerminalNode PIVOT() { return getToken(SqlBaseParser.PIVOT, 0); }
		public TerminalNode PLACING() { return getToken(SqlBaseParser.PLACING, 0); }
		public TerminalNode POSITION() { return getToken(SqlBaseParser.POSITION, 0); }
		public TerminalNode PRECEDING() { return getToken(SqlBaseParser.PRECEDING, 0); }
		public TerminalNode PRIMARY() { return getToken(SqlBaseParser.PRIMARY, 0); }
		public TerminalNode PRINCIPALS() { return getToken(SqlBaseParser.PRINCIPALS, 0); }
		public TerminalNode PROPERTIES() { return getToken(SqlBaseParser.PROPERTIES, 0); }
		public TerminalNode PURGE() { return getToken(SqlBaseParser.PURGE, 0); }
		public TerminalNode QUERY() { return getToken(SqlBaseParser.QUERY, 0); }
		public TerminalNode RANGE() { return getToken(SqlBaseParser.RANGE, 0); }
		public TerminalNode RECORDREADER() { return getToken(SqlBaseParser.RECORDREADER, 0); }
		public TerminalNode RECORDWRITER() { return getToken(SqlBaseParser.RECORDWRITER, 0); }
		public TerminalNode RECOVER() { return getToken(SqlBaseParser.RECOVER, 0); }
		public TerminalNode REDUCE() { return getToken(SqlBaseParser.REDUCE, 0); }
		public TerminalNode REFERENCES() { return getToken(SqlBaseParser.REFERENCES, 0); }
		public TerminalNode REFRESH() { return getToken(SqlBaseParser.REFRESH, 0); }
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode REPAIR() { return getToken(SqlBaseParser.REPAIR, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode RESET() { return getToken(SqlBaseParser.RESET, 0); }
		public TerminalNode RESPECT() { return getToken(SqlBaseParser.RESPECT, 0); }
		public TerminalNode RESTRICT() { return getToken(SqlBaseParser.RESTRICT, 0); }
		public TerminalNode REVOKE() { return getToken(SqlBaseParser.REVOKE, 0); }
		public TerminalNode RLIKE() { return getToken(SqlBaseParser.RLIKE, 0); }
		public TerminalNode ROLE() { return getToken(SqlBaseParser.ROLE, 0); }
		public TerminalNode ROLES() { return getToken(SqlBaseParser.ROLES, 0); }
		public TerminalNode ROLLBACK() { return getToken(SqlBaseParser.ROLLBACK, 0); }
		public TerminalNode ROLLUP() { return getToken(SqlBaseParser.ROLLUP, 0); }
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public TerminalNode ROWS() { return getToken(SqlBaseParser.ROWS, 0); }
		public TerminalNode SCHEMA() { return getToken(SqlBaseParser.SCHEMA, 0); }
		public TerminalNode SECOND() { return getToken(SqlBaseParser.SECOND, 0); }
		public TerminalNode SECONDS() { return getToken(SqlBaseParser.SECONDS, 0); }
		public TerminalNode SELECT() { return getToken(SqlBaseParser.SELECT, 0); }
		public TerminalNode SEPARATED() { return getToken(SqlBaseParser.SEPARATED, 0); }
		public TerminalNode SERDE() { return getToken(SqlBaseParser.SERDE, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SqlBaseParser.SERDEPROPERTIES, 0); }
		public TerminalNode SESSION_USER() { return getToken(SqlBaseParser.SESSION_USER, 0); }
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode SETS() { return getToken(SqlBaseParser.SETS, 0); }
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode SKEWED() { return getToken(SqlBaseParser.SKEWED, 0); }
		public TerminalNode SOME() { return getToken(SqlBaseParser.SOME, 0); }
		public TerminalNode SORT() { return getToken(SqlBaseParser.SORT, 0); }
		public TerminalNode SORTED() { return getToken(SqlBaseParser.SORTED, 0); }
		public TerminalNode START() { return getToken(SqlBaseParser.START, 0); }
		public TerminalNode STATISTICS() { return getToken(SqlBaseParser.STATISTICS, 0); }
		public TerminalNode STORED() { return getToken(SqlBaseParser.STORED, 0); }
		public TerminalNode STRATIFY() { return getToken(SqlBaseParser.STRATIFY, 0); }
		public TerminalNode STRUCT() { return getToken(SqlBaseParser.STRUCT, 0); }
		public TerminalNode SUBSTR() { return getToken(SqlBaseParser.SUBSTR, 0); }
		public TerminalNode SUBSTRING() { return getToken(SqlBaseParser.SUBSTRING, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode TABLES() { return getToken(SqlBaseParser.TABLES, 0); }
		public TerminalNode TABLESAMPLE() { return getToken(SqlBaseParser.TABLESAMPLE, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SqlBaseParser.TBLPROPERTIES, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode TERMINATED() { return getToken(SqlBaseParser.TERMINATED, 0); }
		public TerminalNode THEN() { return getToken(SqlBaseParser.THEN, 0); }
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public TerminalNode TOUCH() { return getToken(SqlBaseParser.TOUCH, 0); }
		public TerminalNode TRAILING() { return getToken(SqlBaseParser.TRAILING, 0); }
		public TerminalNode TRANSACTION() { return getToken(SqlBaseParser.TRANSACTION, 0); }
		public TerminalNode TRANSACTIONS() { return getToken(SqlBaseParser.TRANSACTIONS, 0); }
		public TerminalNode TRANSFORM() { return getToken(SqlBaseParser.TRANSFORM, 0); }
		public TerminalNode TRIM() { return getToken(SqlBaseParser.TRIM, 0); }
		public TerminalNode TRUE() { return getToken(SqlBaseParser.TRUE, 0); }
		public TerminalNode TRUNCATE() { return getToken(SqlBaseParser.TRUNCATE, 0); }
		public TerminalNode TYPE() { return getToken(SqlBaseParser.TYPE, 0); }
		public TerminalNode UNARCHIVE() { return getToken(SqlBaseParser.UNARCHIVE, 0); }
		public TerminalNode UNBOUNDED() { return getToken(SqlBaseParser.UNBOUNDED, 0); }
		public TerminalNode UNCACHE() { return getToken(SqlBaseParser.UNCACHE, 0); }
		public TerminalNode UNIQUE() { return getToken(SqlBaseParser.UNIQUE, 0); }
		public TerminalNode UNKNOWN() { return getToken(SqlBaseParser.UNKNOWN, 0); }
		public TerminalNode UNLOCK() { return getToken(SqlBaseParser.UNLOCK, 0); }
		public TerminalNode UNSET() { return getToken(SqlBaseParser.UNSET, 0); }
		public TerminalNode UPDATE() { return getToken(SqlBaseParser.UPDATE, 0); }
		public TerminalNode USE() { return getToken(SqlBaseParser.USE, 0); }
		public TerminalNode USER() { return getToken(SqlBaseParser.USER, 0); }
		public TerminalNode VALUES() { return getToken(SqlBaseParser.VALUES, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TerminalNode WEEK() { return getToken(SqlBaseParser.WEEK, 0); }
		public TerminalNode WEEKS() { return getToken(SqlBaseParser.WEEKS, 0); }
		public TerminalNode WHEN() { return getToken(SqlBaseParser.WHEN, 0); }
		public TerminalNode WHERE() { return getToken(SqlBaseParser.WHERE, 0); }
		public TerminalNode WINDOW() { return getToken(SqlBaseParser.WINDOW, 0); }
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode YEAR() { return getToken(SqlBaseParser.YEAR, 0); }
		public TerminalNode YEARS() { return getToken(SqlBaseParser.YEARS, 0); }
		public NonReservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonReserved; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNonReserved(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNonReserved(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNonReserved(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonReservedContext nonReserved() throws RecognitionException {
		NonReservedContext _localctx = new NonReservedContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_nonReserved);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2979);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << AFTER) | (1L << ALL) | (1L << ALTER) | (1L << ANALYZE) | (1L << AND) | (1L << ANY) | (1L << ARCHIVE) | (1L << ARRAY) | (1L << AS) | (1L << ASC) | (1L << AT) | (1L << AUTHORIZATION) | (1L << BETWEEN) | (1L << BOTH) | (1L << BUCKET) | (1L << BUCKETS) | (1L << BY) | (1L << CACHE) | (1L << CASCADE) | (1L << CASE) | (1L << CAST) | (1L << CHANGE) | (1L << CHECK) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CLUSTERED) | (1L << CODEGEN) | (1L << COLLATE) | (1L << COLLECTION) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMPACT) | (1L << COMPACTIONS) | (1L << COMPUTE) | (1L << CONCATENATE) | (1L << CONSTRAINT) | (1L << COST) | (1L << CREATE) | (1L << CUBE) | (1L << CURRENT) | (1L << CURRENT_DATE) | (1L << CURRENT_TIME) | (1L << CURRENT_TIMESTAMP) | (1L << CURRENT_USER) | (1L << DATA) | (1L << DATABASE) | (1L << DATABASES) | (1L << DAY))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DAYS - 64)) | (1L << (DBPROPERTIES - 64)) | (1L << (DEFINED - 64)) | (1L << (DELETE - 64)) | (1L << (DELIMITED - 64)) | (1L << (DESC - 64)) | (1L << (DESCRIBE - 64)) | (1L << (DFS - 64)) | (1L << (DIRECTORIES - 64)) | (1L << (DIRECTORY - 64)) | (1L << (DISTINCT - 64)) | (1L << (DISTRIBUTE - 64)) | (1L << (DROP - 64)) | (1L << (ELSE - 64)) | (1L << (END - 64)) | (1L << (ESCAPE - 64)) | (1L << (ESCAPED - 64)) | (1L << (EXCHANGE - 64)) | (1L << (EXISTS - 64)) | (1L << (EXPLAIN - 64)) | (1L << (EXPORT - 64)) | (1L << (EXTENDED - 64)) | (1L << (EXTERNAL - 64)) | (1L << (EXTRACT - 64)) | (1L << (FALSE - 64)) | (1L << (FETCH - 64)) | (1L << (FIELDS - 64)) | (1L << (FILEFORMAT - 64)) | (1L << (FIRST - 64)) | (1L << (FIRST_VALUE - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FOR - 64)) | (1L << (FOREIGN - 64)) | (1L << (FORMAT - 64)) | (1L << (FORMATTED - 64)) | (1L << (FROM - 64)) | (1L << (FUNCTION - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GLOBAL - 64)) | (1L << (GRANT - 64)) | (1L << (GROUP - 64)) | (1L << (GROUPING - 64)) | (1L << (HAVING - 64)) | (1L << (HOUR - 64)) | (1L << (HOURS - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (IMPORT - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INDEXES - 64)) | (1L << (INPATH - 64)) | (1L << (INPUTFORMAT - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (ITEMS - 64)) | (1L << (KEYS - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (LAST - 128)) | (1L << (LAST_VALUE - 128)) | (1L << (LATERAL - 128)) | (1L << (LAZY - 128)) | (1L << (LEADING - 128)) | (1L << (LIKE - 128)) | (1L << (LIMIT - 128)) | (1L << (LINES - 128)) | (1L << (LIST - 128)) | (1L << (LOAD - 128)) | (1L << (LOCAL - 128)) | (1L << (LOCATION - 128)) | (1L << (LOCK - 128)) | (1L << (LOCKS - 128)) | (1L << (LOGICAL - 128)) | (1L << (MACRO - 128)) | (1L << (MAP - 128)) | (1L << (MATCHED - 128)) | (1L << (MERGE - 128)) | (1L << (MICROSECOND - 128)) | (1L << (MICROSECONDS - 128)) | (1L << (MILLISECOND - 128)) | (1L << (MILLISECONDS - 128)) | (1L << (MINUTE - 128)) | (1L << (MINUTES - 128)) | (1L << (MONTH - 128)) | (1L << (MONTHS - 128)) | (1L << (MSCK - 128)) | (1L << (NAMESPACE - 128)) | (1L << (NAMESPACES - 128)) | (1L << (NO - 128)) | (1L << (NOT - 128)) | (1L << (NULL - 128)) | (1L << (NULLS - 128)) | (1L << (OF - 128)) | (1L << (ONLY - 128)) | (1L << (OPTION - 128)) | (1L << (OPTIONS - 128)) | (1L << (OR - 128)) | (1L << (ORDER - 128)) | (1L << (OUT - 128)) | (1L << (OUTER - 128)) | (1L << (OUTPUTFORMAT - 128)) | (1L << (OVER - 128)) | (1L << (OVERLAPS - 128)) | (1L << (OVERLAY - 128)) | (1L << (OVERWRITE - 128)) | (1L << (PARTITION - 128)) | (1L << (PARTITIONED - 128)) | (1L << (PARTITIONS - 128)) | (1L << (PERCENTLIT - 128)) | (1L << (PIVOT - 128)) | (1L << (PLACING - 128)) | (1L << (POSITION - 128)) | (1L << (PRECEDING - 128)) | (1L << (PRIMARY - 128)) | (1L << (PRINCIPALS - 128)) | (1L << (PROPERTIES - 128)) | (1L << (PURGE - 128)) | (1L << (QUERY - 128)) | (1L << (RANGE - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (RECORDREADER - 192)) | (1L << (RECORDWRITER - 192)) | (1L << (RECOVER - 192)) | (1L << (REDUCE - 192)) | (1L << (REFERENCES - 192)) | (1L << (REFRESH - 192)) | (1L << (RENAME - 192)) | (1L << (REPAIR - 192)) | (1L << (REPLACE - 192)) | (1L << (RESET - 192)) | (1L << (RESPECT - 192)) | (1L << (RESTRICT - 192)) | (1L << (REVOKE - 192)) | (1L << (RLIKE - 192)) | (1L << (ROLE - 192)) | (1L << (ROLES - 192)) | (1L << (ROLLBACK - 192)) | (1L << (ROLLUP - 192)) | (1L << (ROW - 192)) | (1L << (ROWS - 192)) | (1L << (SCHEMA - 192)) | (1L << (SECOND - 192)) | (1L << (SECONDS - 192)) | (1L << (SELECT - 192)) | (1L << (SEPARATED - 192)) | (1L << (SERDE - 192)) | (1L << (SERDEPROPERTIES - 192)) | (1L << (SESSION_USER - 192)) | (1L << (SET - 192)) | (1L << (SETS - 192)) | (1L << (SHOW - 192)) | (1L << (SKEWED - 192)) | (1L << (SOME - 192)) | (1L << (SORT - 192)) | (1L << (SORTED - 192)) | (1L << (START - 192)) | (1L << (STATISTICS - 192)) | (1L << (STORED - 192)) | (1L << (STRATIFY - 192)) | (1L << (STRUCT - 192)) | (1L << (SUBSTR - 192)) | (1L << (SUBSTRING - 192)) | (1L << (TABLE - 192)) | (1L << (TABLES - 192)) | (1L << (TABLESAMPLE - 192)) | (1L << (TBLPROPERTIES - 192)) | (1L << (TEMPORARY - 192)) | (1L << (TERMINATED - 192)) | (1L << (THEN - 192)) | (1L << (TO - 192)) | (1L << (TOUCH - 192)) | (1L << (TRAILING - 192)) | (1L << (TRANSACTION - 192)) | (1L << (TRANSACTIONS - 192)) | (1L << (TRANSFORM - 192)) | (1L << (TRIM - 192)) | (1L << (TRUE - 192)) | (1L << (TRUNCATE - 192)) | (1L << (TYPE - 192)) | (1L << (UNARCHIVE - 192)) | (1L << (UNBOUNDED - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (UNCACHE - 256)) | (1L << (UNIQUE - 256)) | (1L << (UNKNOWN - 256)) | (1L << (UNLOCK - 256)) | (1L << (UNSET - 256)) | (1L << (UPDATE - 256)) | (1L << (USE - 256)) | (1L << (USER - 256)) | (1L << (VALUES - 256)) | (1L << (VIEW - 256)) | (1L << (WEEK - 256)) | (1L << (WEEKS - 256)) | (1L << (WHEN - 256)) | (1L << (WHERE - 256)) | (1L << (WINDOW - 256)) | (1L << (WITH - 256)) | (1L << (YEAR - 256)) | (1L << (YEARS - 256)) | (1L << (DIV - 256)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return statement_sempred((StatementContext)_localctx, predIndex);
		case 39:
			return queryTerm_sempred((QueryTermContext)_localctx, predIndex);
		case 93:
			return booleanExpression_sempred((BooleanExpressionContext)_localctx, predIndex);
		case 98:
			return valueExpression_sempred((ValueExpressionContext)_localctx, predIndex);
		case 99:
			return primaryExpression_sempred((PrimaryExpressionContext)_localctx, predIndex);
		case 105:
			return interval_sempred((IntervalContext)_localctx, predIndex);
		case 131:
			return identifier_sempred((IdentifierContext)_localctx, predIndex);
		case 132:
			return strictIdentifier_sempred((StrictIdentifierContext)_localctx, predIndex);
		case 134:
			return number_sempred((NumberContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean statement_sempred(StatementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return !legacy_create_hive_table_by_default_enabled;
		case 1:
			return legacy_create_hive_table_by_default_enabled;
		}
		return true;
	}
	private boolean queryTerm_sempred(QueryTermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return legacy_setops_precedence_enbled;
		case 4:
			return precpred(_ctx, 2);
		case 5:
			return !legacy_setops_precedence_enbled;
		case 6:
			return precpred(_ctx, 1);
		case 7:
			return !legacy_setops_precedence_enbled;
		}
		return true;
	}
	private boolean booleanExpression_sempred(BooleanExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 2);
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean valueExpression_sempred(ValueExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 6);
		case 11:
			return precpred(_ctx, 5);
		case 12:
			return precpred(_ctx, 4);
		case 13:
			return precpred(_ctx, 3);
		case 14:
			return precpred(_ctx, 2);
		case 15:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean primaryExpression_sempred(PrimaryExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 16:
			return precpred(_ctx, 8);
		case 17:
			return precpred(_ctx, 6);
		}
		return true;
	}
	private boolean interval_sempred(IntervalContext _localctx, int predIndex) {
		switch (predIndex) {
		case 18:
			return SQL_standard_keyword_behavior;
		}
		return true;
	}
	private boolean identifier_sempred(IdentifierContext _localctx, int predIndex) {
		switch (predIndex) {
		case 19:
			return !SQL_standard_keyword_behavior;
		}
		return true;
	}
	private boolean strictIdentifier_sempred(StrictIdentifierContext _localctx, int predIndex) {
		switch (predIndex) {
		case 20:
			return SQL_standard_keyword_behavior;
		case 21:
			return !SQL_standard_keyword_behavior;
		}
		return true;
	}
	private boolean number_sempred(NumberContext _localctx, int predIndex) {
		switch (predIndex) {
		case 22:
			return !legacy_exponent_literal_as_decimal_enabled;
		case 23:
			return !legacy_exponent_literal_as_decimal_enabled;
		case 24:
			return legacy_exponent_literal_as_decimal_enabled;
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u013b\u0ba8\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\5\t\u012e\n\t\3"+
		"\t\3\t\3\t\5\t\u0133\n\t\3\t\3\t\3\t\3\t\5\t\u0139\n\t\3\t\3\t\3\t\5\t"+
		"\u013e\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0147\n\t\f\t\16\t\u014a\13"+
		"\t\3\t\3\t\3\t\5\t\u014f\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0159"+
		"\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0162\n\t\3\t\3\t\5\t\u0166\n\t\3"+
		"\t\3\t\5\t\u016a\n\t\3\t\3\t\3\t\3\t\5\t\u0170\n\t\3\t\5\t\u0173\n\t\3"+
		"\t\5\t\u0176\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u017e\n\t\3\t\5\t\u0181\n"+
		"\t\3\t\3\t\5\t\u0185\n\t\3\t\5\t\u0188\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t"+
		"\u0190\n\t\3\t\3\t\3\t\5\t\u0195\n\t\3\t\5\t\u0198\n\t\3\t\3\t\3\t\3\t"+
		"\3\t\5\t\u019f\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u01ac"+
		"\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u01b5\n\t\f\t\16\t\u01b8\13\t\3\t"+
		"\5\t\u01bb\n\t\3\t\5\t\u01be\n\t\3\t\3\t\3\t\3\t\3\t\5\t\u01c5\n\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u01d0\n\t\f\t\16\t\u01d3\13\t\3\t"+
		"\3\t\3\t\3\t\3\t\5\t\u01da\n\t\3\t\3\t\3\t\5\t\u01df\n\t\3\t\5\t\u01e2"+
		"\n\t\3\t\3\t\3\t\3\t\5\t\u01e8\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\5\t\u01f3\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0233\n\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u023c\n\t\3\t\3\t\3\t\5\t\u0241\n\t\3\t\3"+
		"\t\5\t\u0245\n\t\3\t\5\t\u0248\n\t\3\t\3\t\3\t\3\t\5\t\u024e\n\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\5\t\u0256\n\t\3\t\3\t\3\t\3\t\5\t\u025c\n\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0269\n\t\3\t\6\t\u026c\n\t\r"+
		"\t\16\t\u026d\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\5\t\u027e\n\t\3\t\3\t\3\t\7\t\u0283\n\t\f\t\16\t\u0286\13\t\3\t\5\t\u0289"+
		"\n\t\3\t\3\t\3\t\3\t\5\t\u028f\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\5\t\u029e\n\t\3\t\3\t\5\t\u02a2\n\t\3\t\3\t\3\t\3\t\5"+
		"\t\u02a8\n\t\3\t\3\t\3\t\3\t\5\t\u02ae\n\t\3\t\5\t\u02b1\n\t\3\t\5\t\u02b4"+
		"\n\t\3\t\3\t\3\t\3\t\5\t\u02ba\n\t\3\t\3\t\5\t\u02be\n\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\7\t\u02c7\n\t\f\t\16\t\u02ca\13\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\5\t\u02d2\n\t\3\t\5\t\u02d5\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u02de"+
		"\n\t\3\t\3\t\3\t\5\t\u02e3\n\t\3\t\3\t\3\t\3\t\5\t\u02e9\n\t\3\t\3\t\3"+
		"\t\3\t\3\t\5\t\u02f0\n\t\3\t\5\t\u02f3\n\t\3\t\3\t\3\t\3\t\5\t\u02f9\n"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0302\n\t\f\t\16\t\u0305\13\t\5\t\u0307"+
		"\n\t\3\t\3\t\5\t\u030b\n\t\3\t\3\t\3\t\5\t\u0310\n\t\3\t\3\t\3\t\5\t\u0315"+
		"\n\t\3\t\3\t\3\t\3\t\3\t\5\t\u031c\n\t\3\t\5\t\u031f\n\t\3\t\5\t\u0322"+
		"\n\t\3\t\3\t\3\t\3\t\3\t\5\t\u0329\n\t\3\t\3\t\3\t\5\t\u032e\n\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\5\t\u0337\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u033f"+
		"\n\t\3\t\3\t\3\t\3\t\5\t\u0345\n\t\3\t\3\t\5\t\u0349\n\t\3\t\3\t\5\t\u034d"+
		"\n\t\3\t\3\t\5\t\u0351\n\t\5\t\u0353\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\5\t\u035f\n\t\3\t\3\t\3\t\3\t\5\t\u0365\n\t\3\t\5\t\u0368\n"+
		"\t\3\t\3\t\3\t\5\t\u036d\n\t\3\t\5\t\u0370\n\t\3\t\3\t\5\t\u0374\n\t\3"+
		"\t\5\t\u0377\n\t\3\t\3\t\5\t\u037b\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t"+
		"\u0384\n\t\f\t\16\t\u0387\13\t\5\t\u0389\n\t\3\t\3\t\5\t\u038d\n\t\3\t"+
		"\3\t\3\t\3\t\5\t\u0393\n\t\3\t\5\t\u0396\n\t\3\t\5\t\u0399\n\t\3\t\3\t"+
		"\3\t\3\t\5\t\u039f\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u03a7\n\t\3\t\3\t\3"+
		"\t\5\t\u03ac\n\t\3\t\3\t\3\t\3\t\5\t\u03b2\n\t\3\t\3\t\3\t\3\t\5\t\u03b8"+
		"\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u03c2\n\t\f\t\16\t\u03c5\13\t"+
		"\5\t\u03c7\n\t\3\t\3\t\3\t\7\t\u03cc\n\t\f\t\16\t\u03cf\13\t\3\t\3\t\7"+
		"\t\u03d3\n\t\f\t\16\t\u03d6\13\t\3\t\3\t\3\t\7\t\u03db\n\t\f\t\16\t\u03de"+
		"\13\t\5\t\u03e0\n\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u03e8\n\n\3\n\3\n\5\n"+
		"\u03ec\n\n\3\n\3\n\3\n\3\n\3\n\5\n\u03f3\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\5\n\u0467\n\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u046f\n\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\5\n\u0477\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0480\n"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u048a\n\n\3\13\3\13\5\13\u048e"+
		"\n\13\3\13\5\13\u0491\n\13\3\13\3\13\3\13\3\13\5\13\u0497\n\13\3\13\3"+
		"\13\3\f\3\f\5\f\u049d\n\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r"+
		"\u04a9\n\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u04b5\n"+
		"\16\3\16\3\16\3\16\5\16\u04ba\n\16\3\17\3\17\3\17\3\20\5\20\u04c0\n\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\5\21\u04c8\n\21\3\21\3\21\3\21\3\21\3\21"+
		"\5\21\u04cf\n\21\5\21\u04d1\n\21\3\21\3\21\3\21\5\21\u04d6\n\21\3\21\3"+
		"\21\5\21\u04da\n\21\3\21\3\21\3\21\5\21\u04df\n\21\3\21\3\21\3\21\5\21"+
		"\u04e4\n\21\3\21\3\21\3\21\5\21\u04e9\n\21\3\21\5\21\u04ec\n\21\3\21\3"+
		"\21\3\21\5\21\u04f1\n\21\3\21\3\21\5\21\u04f5\n\21\3\21\3\21\3\21\5\21"+
		"\u04fa\n\21\5\21\u04fc\n\21\3\22\3\22\5\22\u0500\n\22\3\23\3\23\3\23\3"+
		"\23\3\23\7\23\u0507\n\23\f\23\16\23\u050a\13\23\3\23\3\23\3\24\3\24\3"+
		"\24\5\24\u0511\n\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\5\26\u051a\n\26"+
		"\3\27\3\27\3\27\7\27\u051f\n\27\f\27\16\27\u0522\13\27\3\30\3\30\3\30"+
		"\3\30\7\30\u0528\n\30\f\30\16\30\u052b\13\30\3\31\3\31\5\31\u052f\n\31"+
		"\3\31\5\31\u0532\n\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u0546\n\33\f\33\16\33\u0549"+
		"\13\33\3\34\3\34\3\34\3\34\7\34\u054f\n\34\f\34\16\34\u0552\13\34\3\34"+
		"\3\34\3\35\3\35\5\35\u0558\n\35\3\35\5\35\u055b\n\35\3\36\3\36\3\36\7"+
		"\36\u0560\n\36\f\36\16\36\u0563\13\36\3\36\5\36\u0566\n\36\3\37\3\37\3"+
		"\37\3\37\5\37\u056c\n\37\3 \3 \3 \3 \7 \u0572\n \f \16 \u0575\13 \3 \3"+
		" \3!\3!\3!\3!\7!\u057d\n!\f!\16!\u0580\13!\3!\3!\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\5\"\u058a\n\"\3#\3#\3#\3#\3#\5#\u0591\n#\3$\3$\3$\3$\5$\u0597\n$\3"+
		"%\3%\3%\3&\3&\3&\3&\3&\3&\6&\u05a2\n&\r&\16&\u05a3\3&\3&\3&\3&\3&\5&\u05ab"+
		"\n&\3&\3&\3&\3&\3&\5&\u05b2\n&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u05be"+
		"\n&\3&\3&\3&\3&\7&\u05c4\n&\f&\16&\u05c7\13&\3&\7&\u05ca\n&\f&\16&\u05cd"+
		"\13&\5&\u05cf\n&\3\'\3\'\3\'\3\'\3\'\7\'\u05d6\n\'\f\'\16\'\u05d9\13\'"+
		"\5\'\u05db\n\'\3\'\3\'\3\'\3\'\3\'\7\'\u05e2\n\'\f\'\16\'\u05e5\13\'\5"+
		"\'\u05e7\n\'\3\'\3\'\3\'\3\'\3\'\7\'\u05ee\n\'\f\'\16\'\u05f1\13\'\5\'"+
		"\u05f3\n\'\3\'\3\'\3\'\3\'\3\'\7\'\u05fa\n\'\f\'\16\'\u05fd\13\'\5\'\u05ff"+
		"\n\'\3\'\5\'\u0602\n\'\3\'\3\'\3\'\5\'\u0607\n\'\5\'\u0609\n\'\3(\3(\3"+
		"(\3)\3)\3)\3)\3)\3)\3)\5)\u0615\n)\3)\3)\3)\3)\3)\5)\u061c\n)\3)\3)\3"+
		")\3)\3)\5)\u0623\n)\3)\7)\u0626\n)\f)\16)\u0629\13)\3*\3*\3*\3*\3*\3*"+
		"\3*\3*\3*\5*\u0634\n*\3+\3+\5+\u0638\n+\3+\3+\5+\u063c\n+\3,\3,\6,\u0640"+
		"\n,\r,\16,\u0641\3-\3-\5-\u0646\n-\3-\3-\3-\3-\7-\u064c\n-\f-\16-\u064f"+
		"\13-\3-\5-\u0652\n-\3-\5-\u0655\n-\3-\5-\u0658\n-\3-\5-\u065b\n-\3-\3"+
		"-\5-\u065f\n-\3.\3.\5.\u0663\n.\3.\5.\u0666\n.\3.\3.\5.\u066a\n.\3.\7"+
		".\u066d\n.\f.\16.\u0670\13.\3.\5.\u0673\n.\3.\5.\u0676\n.\3.\5.\u0679"+
		"\n.\3.\5.\u067c\n.\5.\u067e\n.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u068a"+
		"\n/\3/\5/\u068d\n/\3/\3/\5/\u0691\n/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u069b"+
		"\n/\3/\3/\5/\u069f\n/\5/\u06a1\n/\3/\5/\u06a4\n/\3/\3/\5/\u06a8\n/\3\60"+
		"\3\60\7\60\u06ac\n\60\f\60\16\60\u06af\13\60\3\60\5\60\u06b2\n\60\3\60"+
		"\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\62\5\62\u06bd\n\62\3\62\3\62\3\62"+
		"\3\63\3\63\3\63\3\63\3\63\5\63\u06c7\n\63\3\63\3\63\3\63\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\5\64\u06d3\n\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\7\65\u06e0\n\65\f\65\16\65\u06e3\13\65\3\65\3\65"+
		"\5\65\u06e7\n\65\3\66\3\66\3\66\7\66\u06ec\n\66\f\66\16\66\u06ef\13\66"+
		"\3\67\3\67\3\67\3\67\38\38\38\39\39\39\3:\3:\3:\5:\u06fe\n:\3:\7:\u0701"+
		"\n:\f:\16:\u0704\13:\3:\3:\3;\3;\3;\3;\3;\3;\7;\u070e\n;\f;\16;\u0711"+
		"\13;\3;\3;\5;\u0715\n;\3<\3<\3<\3<\7<\u071b\n<\f<\16<\u071e\13<\3<\7<"+
		"\u0721\n<\f<\16<\u0724\13<\3<\5<\u0727\n<\3=\3=\3=\3=\3=\7=\u072e\n=\f"+
		"=\16=\u0731\13=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\7=\u073d\n=\f=\16=\u0740"+
		"\13=\3=\3=\5=\u0744\n=\3=\3=\3=\3=\3=\3=\3=\3=\7=\u074e\n=\f=\16=\u0751"+
		"\13=\3=\3=\5=\u0755\n=\3>\3>\3>\3>\7>\u075b\n>\f>\16>\u075e\13>\5>\u0760"+
		"\n>\3>\3>\5>\u0764\n>\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\7?\u0770\n?\f?\16"+
		"?\u0773\13?\3?\3?\3?\3@\3@\3@\3@\3@\7@\u077d\n@\f@\16@\u0780\13@\3@\3"+
		"@\5@\u0784\n@\3A\3A\5A\u0788\nA\3A\5A\u078b\nA\3B\3B\3B\5B\u0790\nB\3"+
		"B\3B\3B\3B\3B\7B\u0797\nB\fB\16B\u079a\13B\5B\u079c\nB\3B\3B\3B\5B\u07a1"+
		"\nB\3B\3B\3B\7B\u07a6\nB\fB\16B\u07a9\13B\5B\u07ab\nB\3C\3C\3D\3D\7D\u07b1"+
		"\nD\fD\16D\u07b4\13D\3E\3E\3E\3E\5E\u07ba\nE\3E\3E\3E\3E\3E\5E\u07c1\n"+
		"E\3F\5F\u07c4\nF\3F\3F\3F\5F\u07c9\nF\3F\5F\u07cc\nF\3F\3F\3F\5F\u07d1"+
		"\nF\3F\3F\5F\u07d5\nF\3F\5F\u07d8\nF\3F\3F\5F\u07dc\nF\3G\3G\3G\3G\3G"+
		"\3G\3G\7G\u07e5\nG\fG\16G\u07e8\13G\3G\3G\3G\3G\5G\u07ee\nG\3G\3G\5G\u07f2"+
		"\nG\3H\3H\3H\5H\u07f7\nH\3H\3H\3I\5I\u07fc\nI\3I\3I\3I\3I\3I\3I\3I\3I"+
		"\3I\3I\3I\3I\3I\3I\3I\3I\5I\u080e\nI\5I\u0810\nI\3I\5I\u0813\nI\3J\3J"+
		"\3J\3J\3K\3K\3K\7K\u081c\nK\fK\16K\u081f\13K\3L\3L\3L\3L\7L\u0825\nL\f"+
		"L\16L\u0828\13L\3L\3L\3M\3M\5M\u082e\nM\3N\3N\3N\3N\7N\u0834\nN\fN\16"+
		"N\u0837\13N\3N\3N\3O\3O\3O\5O\u083e\nO\3P\3P\5P\u0842\nP\3P\3P\3P\3P\3"+
		"P\3P\5P\u084a\nP\3P\3P\3P\3P\3P\3P\5P\u0852\nP\3P\3P\3P\3P\5P\u0858\n"+
		"P\3Q\3Q\3Q\3Q\7Q\u085e\nQ\fQ\16Q\u0861\13Q\3Q\3Q\3R\3R\3R\3R\3R\7R\u086a"+
		"\nR\fR\16R\u086d\13R\5R\u086f\nR\3R\3R\3R\3S\5S\u0875\nS\3S\3S\5S\u0879"+
		"\nS\5S\u087b\nS\3T\3T\3T\3T\3T\3T\3T\5T\u0884\nT\3T\3T\3T\3T\3T\3T\3T"+
		"\3T\3T\3T\5T\u0890\nT\5T\u0892\nT\3T\3T\3T\3T\3T\5T\u0899\nT\3T\3T\3T"+
		"\3T\3T\5T\u08a0\nT\3T\3T\3T\3T\5T\u08a6\nT\3T\3T\3T\3T\5T\u08ac\nT\5T"+
		"\u08ae\nT\3U\3U\3U\7U\u08b3\nU\fU\16U\u08b6\13U\3V\3V\3V\7V\u08bb\nV\f"+
		"V\16V\u08be\13V\3W\3W\3W\5W\u08c3\nW\3W\3W\3X\3X\3X\5X\u08ca\nX\3X\3X"+
		"\3Y\3Y\5Y\u08d0\nY\3Y\3Y\5Y\u08d4\nY\5Y\u08d6\nY\3Z\3Z\3Z\7Z\u08db\nZ"+
		"\fZ\16Z\u08de\13Z\3[\3[\3[\3[\7[\u08e4\n[\f[\16[\u08e7\13[\3[\3[\3\\\3"+
		"\\\3\\\3\\\3\\\3\\\7\\\u08f1\n\\\f\\\16\\\u08f4\13\\\3\\\3\\\5\\\u08f8"+
		"\n\\\3]\3]\5]\u08fc\n]\3^\3^\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\5_\u090a\n"+
		"_\5_\u090c\n_\3_\3_\3_\3_\3_\3_\7_\u0914\n_\f_\16_\u0917\13_\3`\5`\u091a"+
		"\n`\3`\3`\3`\3`\3`\3`\5`\u0922\n`\3`\3`\3`\3`\3`\7`\u0929\n`\f`\16`\u092c"+
		"\13`\3`\3`\3`\5`\u0931\n`\3`\3`\3`\3`\3`\3`\5`\u0939\n`\3`\3`\3`\5`\u093e"+
		"\n`\3`\3`\3`\3`\5`\u0944\n`\3`\3`\5`\u0948\n`\3`\3`\3`\5`\u094d\n`\3`"+
		"\3`\3`\5`\u0952\n`\3`\3`\3`\5`\u0957\n`\3a\3a\3a\3a\7a\u095d\na\fa\16"+
		"a\u0960\13a\3a\3a\3b\3b\3b\3b\7b\u0968\nb\fb\16b\u096b\13b\3b\3b\3c\3"+
		"c\3c\3c\3c\3c\3c\3c\3c\3d\3d\3d\3d\5d\u097c\nd\3d\3d\3d\3d\3d\3d\3d\3"+
		"d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\7d\u0991\nd\fd\16d\u0994\13d\3e\3e"+
		"\3e\3e\6e\u099a\ne\re\16e\u099b\3e\3e\5e\u09a0\ne\3e\3e\3e\3e\3e\6e\u09a7"+
		"\ne\re\16e\u09a8\3e\3e\5e\u09ad\ne\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3"+
		"e\3e\3e\7e\u09bd\ne\fe\16e\u09c0\13e\5e\u09c2\ne\3e\3e\3e\3e\3e\3e\5e"+
		"\u09ca\ne\3e\3e\3e\3e\3e\3e\3e\5e\u09d3\ne\3e\3e\3e\3e\3e\3e\3e\3e\3e"+
		"\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\6e\u09e8\ne\re\16e\u09e9\3e\3e\3e\3e\3"+
		"e\3e\3e\3e\3e\5e\u09f5\ne\3e\3e\3e\7e\u09fa\ne\fe\16e\u09fd\13e\5e\u09ff"+
		"\ne\3e\3e\3e\5e\u0a04\ne\3e\3e\3e\3e\3e\3e\3e\3e\6e\u0a0e\ne\re\16e\u0a0f"+
		"\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e"+
		"\5e\u0a29\ne\3e\3e\3e\3e\3e\5e\u0a30\ne\3e\5e\u0a33\ne\3e\3e\3e\3e\3e"+
		"\3e\3e\3e\3e\3e\3e\3e\3e\5e\u0a42\ne\3e\3e\5e\u0a46\ne\3e\3e\3e\3e\3e"+
		"\3e\3e\3e\7e\u0a50\ne\fe\16e\u0a53\13e\3f\3f\3f\3f\3f\3f\3f\3f\6f\u0a5d"+
		"\nf\rf\16f\u0a5e\5f\u0a61\nf\3g\3g\3h\3h\3i\3i\3j\3j\3k\3k\3k\5k\u0a6e"+
		"\nk\3k\3k\3k\5k\u0a73\nk\5k\u0a75\nk\3l\3l\5l\u0a79\nl\3m\3m\3m\6m\u0a7e"+
		"\nm\rm\16m\u0a7f\3n\3n\3n\5n\u0a85\nn\3o\3o\3o\3o\3o\3p\5p\u0a8d\np\3"+
		"p\3p\5p\u0a91\np\3q\3q\3r\3r\3r\5r\u0a98\nr\3s\3s\3s\3s\3s\3s\3s\3s\3"+
		"s\3s\3s\3s\3s\3s\3s\5s\u0aa9\ns\3s\3s\5s\u0aad\ns\3s\3s\3s\3s\3s\7s\u0ab4"+
		"\ns\fs\16s\u0ab7\13s\3s\5s\u0aba\ns\5s\u0abc\ns\3t\3t\3t\7t\u0ac1\nt\f"+
		"t\16t\u0ac4\13t\3u\3u\3u\3u\5u\u0aca\nu\3u\5u\u0acd\nu\3v\3v\3v\7v\u0ad2"+
		"\nv\fv\16v\u0ad5\13v\3w\3w\3w\3w\5w\u0adb\nw\3x\3x\3x\7x\u0ae0\nx\fx\16"+
		"x\u0ae3\13x\3y\3y\3y\3y\3y\5y\u0aea\ny\3z\3z\3z\3z\3z\3{\3{\3{\3{\7{\u0af5"+
		"\n{\f{\16{\u0af8\13{\3|\3|\3|\3|\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\7}\u0b09"+
		"\n}\f}\16}\u0b0c\13}\3}\3}\3}\3}\3}\7}\u0b13\n}\f}\16}\u0b16\13}\5}\u0b18"+
		"\n}\3}\3}\3}\3}\3}\7}\u0b1f\n}\f}\16}\u0b22\13}\5}\u0b24\n}\5}\u0b26\n"+
		"}\3}\5}\u0b29\n}\3}\5}\u0b2c\n}\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3"+
		"~\3~\3~\3~\5~\u0b3e\n~\3\177\3\177\3\177\3\177\3\177\3\177\3\177\5\177"+
		"\u0b47\n\177\3\u0080\3\u0080\3\u0080\7\u0080\u0b4c\n\u0080\f\u0080\16"+
		"\u0080\u0b4f\13\u0080\3\u0081\3\u0081\3\u0081\5\u0081\u0b54\n\u0081\3"+
		"\u0082\3\u0082\3\u0082\7\u0082\u0b59\n\u0082\f\u0082\16\u0082\u0b5c\13"+
		"\u0082\3\u0083\3\u0083\3\u0083\3\u0084\3\u0084\6\u0084\u0b63\n\u0084\r"+
		"\u0084\16\u0084\u0b64\3\u0084\5\u0084\u0b68\n\u0084\3\u0085\3\u0085\3"+
		"\u0085\5\u0085\u0b6d\n\u0085\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3"+
		"\u0086\5\u0086\u0b75\n\u0086\3\u0087\3\u0087\3\u0088\3\u0088\5\u0088\u0b7b"+
		"\n\u0088\3\u0088\3\u0088\3\u0088\5\u0088\u0b80\n\u0088\3\u0088\3\u0088"+
		"\3\u0088\5\u0088\u0b85\n\u0088\3\u0088\3\u0088\5\u0088\u0b89\n\u0088\3"+
		"\u0088\3\u0088\5\u0088\u0b8d\n\u0088\3\u0088\3\u0088\5\u0088\u0b91\n\u0088"+
		"\3\u0088\3\u0088\5\u0088\u0b95\n\u0088\3\u0088\3\u0088\5\u0088\u0b99\n"+
		"\u0088\3\u0088\3\u0088\5\u0088\u0b9d\n\u0088\3\u0088\5\u0088\u0ba0\n\u0088"+
		"\3\u0089\3\u0089\3\u008a\3\u008a\3\u008b\3\u008b\3\u008b\7\u0385\u03c3"+
		"\u03cd\u03d4\u03dc\6P\u00bc\u00c6\u00c8\u008c\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtv"+
		"xz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094"+
		"\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac"+
		"\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4"+
		"\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc"+
		"\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4"+
		"\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c"+
		"\u010e\u0110\u0112\u0114\2-\4\2CC\u00be\u00be\4\2!!\u00cd\u00cd\4\2@@"+
		"\u00a0\u00a0\4\2fftt\3\2,-\4\2\u00ef\u00ef\u010d\u010d\4\2\20\20$$\7\2"+
		"))\65\65XXee\u0091\u0091\3\2GH\4\2XXee\4\2\r\r\u008b\u008b\4\2??\u00d7"+
		"\u00d7\6\2SS{{\u00e1\u00e1\u0103\u0103\5\2SS\u00e1\u00e1\u0103\u0103\4"+
		"\2\30\30GG\4\2__\u0082\u0082\4\2\17\17LL\4\2\u0130\u0130\u0132\u0132\5"+
		"\2[[\u00fd\u00fd\u0105\u0105\4\2\u0121\u0122\u0127\u0127\3\2\u0123\u0126"+
		"\4\2\u0121\u0122\u012a\u012a\4\2::<<\3\2_`\4\2rr\u00cc\u00cc\3\2\u0082"+
		"\u0083\3\2\u00ed\u00ee\4\2\5\5ff\4\2\5\5bb\5\2\34\34\u0086\u0086\u00f8"+
		"\u00f8\3\2\u0119\u0120\3\2\u0121\u012b\6\2\22\22tt\u00a3\u00a3\u00ab\u00ab"+
		"\4\2[[\u00fd\u00fd\3\2\u0121\u0122\b\2ABop\u0096\u009d\u00d8\u00d9\u010e"+
		"\u010f\u0114\u0115\4\2MM\u00b4\u00b4\4\2\u00ac\u00ac\u00e6\u00e6\4\2a"+
		"a\u00bb\u00bb\3\2\u0131\u01329\2\r\16\20\21\25\26\30\31\33\33\35!$$&)"+
		"++-\63\65\6589>@BKMNRRTZ]_aadehjmmpsuvxz||\177\177\u0081\u0082\u0084\u0085"+
		"\u0088\u0099\u009b\u009b\u009d\u00a0\u00a2\u00a2\u00a5\u00a6\u00a9\u00aa"+
		"\u00ad\u00ad\u00af\u00b0\u00b2\u00bb\u00bd\u00c5\u00c7\u00ce\u00d0\u00d7"+
		"\u00d9\u00d9\u00dc\u00de\u00e0\u00e0\u00e2\u00e4\u00e6\u00ee\u00f0\u00f4"+
		"\u00f7\u00f7\u00f9\u00fe\u0100\u0102\u0106\u0109\u010c\u010f\u0112\u0112"+
		"\u0115\u0115\u0126\u0126\22\2\23\23\67\67SSggww{{\u0080\u0080\u0087\u0087"+
		"\u00a1\u00a1\u00a7\u00a7\u00cf\u00cf\u00db\u00db\u00e1\u00e1\u0103\u0103"+
		"\u010b\u010b\u0116\u0116\23\2\r\22\24\668RTfhvxz|\177\u0081\u0086\u0088"+
		"\u00a0\u00a2\u00a6\u00a8\u00ce\u00d0\u00da\u00dc\u00e0\u00e2\u0102\u0104"+
		"\u010a\u010c\u0115\u0126\u0126\2\u0d6e\2\u0116\3\2\2\2\4\u0119\3\2\2\2"+
		"\6\u011c\3\2\2\2\b\u011f\3\2\2\2\n\u0122\3\2\2\2\f\u0125\3\2\2\2\16\u0128"+
		"\3\2\2\2\20\u03df\3\2\2\2\22\u0489\3\2\2\2\24\u048b\3\2\2\2\26\u049c\3"+
		"\2\2\2\30\u04a2\3\2\2\2\32\u04ae\3\2\2\2\34\u04bb\3\2\2\2\36\u04bf\3\2"+
		"\2\2 \u04fb\3\2\2\2\"\u04fd\3\2\2\2$\u0501\3\2\2\2&\u050d\3\2\2\2(\u0512"+
		"\3\2\2\2*\u0519\3\2\2\2,\u051b\3\2\2\2.\u0523\3\2\2\2\60\u052c\3\2\2\2"+
		"\62\u0537\3\2\2\2\64\u0547\3\2\2\2\66\u054a\3\2\2\28\u0555\3\2\2\2:\u0565"+
		"\3\2\2\2<\u056b\3\2\2\2>\u056d\3\2\2\2@\u0578\3\2\2\2B\u0589\3\2\2\2D"+
		"\u0590\3\2\2\2F\u0592\3\2\2\2H\u0598\3\2\2\2J\u05ce\3\2\2\2L\u05da\3\2"+
		"\2\2N\u060a\3\2\2\2P\u060d\3\2\2\2R\u0633\3\2\2\2T\u0635\3\2\2\2V\u063d"+
		"\3\2\2\2X\u065e\3\2\2\2Z\u067d\3\2\2\2\\\u0689\3\2\2\2^\u06a9\3\2\2\2"+
		"`\u06b5\3\2\2\2b\u06b8\3\2\2\2d\u06c1\3\2\2\2f\u06d2\3\2\2\2h\u06e6\3"+
		"\2\2\2j\u06e8\3\2\2\2l\u06f0\3\2\2\2n\u06f4\3\2\2\2p\u06f7\3\2\2\2r\u06fa"+
		"\3\2\2\2t\u0714\3\2\2\2v\u0716\3\2\2\2x\u0754\3\2\2\2z\u0763\3\2\2\2|"+
		"\u0765\3\2\2\2~\u0783\3\2\2\2\u0080\u0785\3\2\2\2\u0082\u078c\3\2\2\2"+
		"\u0084\u07ac\3\2\2\2\u0086\u07ae\3\2\2\2\u0088\u07c0\3\2\2\2\u008a\u07db"+
		"\3\2\2\2\u008c\u07f1\3\2\2\2\u008e\u07f3\3\2\2\2\u0090\u0812\3\2\2\2\u0092"+
		"\u0814\3\2\2\2\u0094\u0818\3\2\2\2\u0096\u0820\3\2\2\2\u0098\u082b\3\2"+
		"\2\2\u009a\u082f\3\2\2\2\u009c\u083a\3\2\2\2\u009e\u0857\3\2\2\2\u00a0"+
		"\u0859\3\2\2\2\u00a2\u0864\3\2\2\2\u00a4\u087a\3\2\2\2\u00a6\u08ad\3\2"+
		"\2\2\u00a8\u08af\3\2\2\2\u00aa\u08b7\3\2\2\2\u00ac\u08c2\3\2\2\2\u00ae"+
		"\u08c9\3\2\2\2\u00b0\u08cd\3\2\2\2\u00b2\u08d7\3\2\2\2\u00b4\u08df\3\2"+
		"\2\2\u00b6\u08f7\3\2\2\2\u00b8\u08fb\3\2\2\2\u00ba\u08fd\3\2\2\2\u00bc"+
		"\u090b\3\2\2\2\u00be\u0956\3\2\2\2\u00c0\u0958\3\2\2\2\u00c2\u0963\3\2"+
		"\2\2\u00c4\u096e\3\2\2\2\u00c6\u097b\3\2\2\2\u00c8\u0a45\3\2\2\2\u00ca"+
		"\u0a60\3\2\2\2\u00cc\u0a62\3\2\2\2\u00ce\u0a64\3\2\2\2\u00d0\u0a66\3\2"+
		"\2\2\u00d2\u0a68\3\2\2\2\u00d4\u0a74\3\2\2\2\u00d6\u0a76\3\2\2\2\u00d8"+
		"\u0a7d\3\2\2\2\u00da\u0a81\3\2\2\2\u00dc\u0a86\3\2\2\2\u00de\u0a90\3\2"+
		"\2\2\u00e0\u0a92\3\2\2\2\u00e2\u0a97\3\2\2\2\u00e4\u0abb\3\2\2\2\u00e6"+
		"\u0abd\3\2\2\2\u00e8\u0ac5\3\2\2\2\u00ea\u0ace\3\2\2\2\u00ec\u0ad6\3\2"+
		"\2\2\u00ee\u0adc\3\2\2\2\u00f0\u0ae4\3\2\2\2\u00f2\u0aeb\3\2\2\2\u00f4"+
		"\u0af0\3\2\2\2\u00f6\u0af9\3\2\2\2\u00f8\u0b2b\3\2\2\2\u00fa\u0b3d\3\2"+
		"\2\2\u00fc\u0b46\3\2\2\2\u00fe\u0b48\3\2\2\2\u0100\u0b53\3\2\2\2\u0102"+
		"\u0b55\3\2\2\2\u0104\u0b5d\3\2\2\2\u0106\u0b67\3\2\2\2\u0108\u0b6c\3\2"+
		"\2\2\u010a\u0b74\3\2\2\2\u010c\u0b76\3\2\2\2\u010e\u0b9f\3\2\2\2\u0110"+
		"\u0ba1\3\2\2\2\u0112\u0ba3\3\2\2\2\u0114\u0ba5\3\2\2\2\u0116\u0117\5\20"+
		"\t\2\u0117\u0118\7\2\2\3\u0118\3\3\2\2\2\u0119\u011a\5\u00b0Y\2\u011a"+
		"\u011b\7\2\2\3\u011b\5\3\2\2\2\u011c\u011d\5\u00acW\2\u011d\u011e\7\2"+
		"\2\3\u011e\7\3\2\2\2\u011f\u0120\5\u00aaV\2\u0120\u0121\7\2\2\3\u0121"+
		"\t\3\2\2\2\u0122\u0123\5\u00aeX\2\u0123\u0124\7\2\2\3\u0124\13\3\2\2\2"+
		"\u0125\u0126\5\u00e4s\2\u0126\u0127\7\2\2\3\u0127\r\3\2\2\2\u0128\u0129"+
		"\5\u00eav\2\u0129\u012a\7\2\2\3\u012a\17\3\2\2\2\u012b\u03e0\5\36\20\2"+
		"\u012c\u012e\5.\30\2\u012d\u012c\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012f"+
		"\3\2\2\2\u012f\u03e0\5J&\2\u0130\u0132\7\u0109\2\2\u0131\u0133\7\u009f"+
		"\2\2\u0132\u0131\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0134\3\2\2\2\u0134"+
		"\u03e0\5\u00aaV\2\u0135\u0138\7\66\2\2\u0136\u0139\5(\25\2\u0137\u0139"+
		"\7\u009f\2\2\u0138\u0136\3\2\2\2\u0138\u0137\3\2\2\2\u0139\u013d\3\2\2"+
		"\2\u013a\u013b\7q\2\2\u013b\u013c\7\u00a3\2\2\u013c\u013e\7U\2\2\u013d"+
		"\u013a\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0148\5\u00aa"+
		"V\2\u0140\u0141\7.\2\2\u0141\u0147\7\u012c\2\2\u0142\u0147\5\34\17\2\u0143"+
		"\u0144\7\u0113\2\2\u0144\u0145\t\2\2\2\u0145\u0147\5\66\34\2\u0146\u0140"+
		"\3\2\2\2\u0146\u0142\3\2\2\2\u0146\u0143\3\2\2\2\u0147\u014a\3\2\2\2\u0148"+
		"\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u03e0\3\2\2\2\u014a\u0148\3\2"+
		"\2\2\u014b\u014e\7\20\2\2\u014c\u014f\5(\25\2\u014d\u014f\7\u009f\2\2"+
		"\u014e\u014c\3\2\2\2\u014e\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0151"+
		"\5\u00aaV\2\u0151\u0152\7\u00e0\2\2\u0152\u0153\t\2\2\2\u0153\u0154\5"+
		"\66\34\2\u0154\u03e0\3\2\2\2\u0155\u0158\7\20\2\2\u0156\u0159\5(\25\2"+
		"\u0157\u0159\7\u009f\2\2\u0158\u0156\3\2\2\2\u0158\u0157\3\2\2\2\u0159"+
		"\u015a\3\2\2\2\u015a\u015b\5\u00aaV\2\u015b\u015c\7\u00e0\2\2\u015c\u015d"+
		"\5\34\17\2\u015d\u03e0\3\2\2\2\u015e\u0161\7N\2\2\u015f\u0162\5(\25\2"+
		"\u0160\u0162\7\u009f\2\2\u0161\u015f\3\2\2\2\u0161\u0160\3\2\2\2\u0162"+
		"\u0165\3\2\2\2\u0163\u0164\7q\2\2\u0164\u0166\7U\2\2\u0165\u0163\3\2\2"+
		"\2\u0165\u0166\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0169\5\u00aaV\2\u0168"+
		"\u016a\t\3\2\2\u0169\u0168\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u03e0\3\2"+
		"\2\2\u016b\u016c\7\u00e3\2\2\u016c\u016f\t\4\2\2\u016d\u016e\t\5\2\2\u016e"+
		"\u0170\5\u00aaV\2\u016f\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0175"+
		"\3\2\2\2\u0171\u0173\7\u0088\2\2\u0172\u0171\3\2\2\2\u0172\u0173\3\2\2"+
		"\2\u0173\u0174\3\2\2\2\u0174\u0176\7\u012c\2\2\u0175\u0172\3\2\2\2\u0175"+
		"\u0176\3\2\2\2\u0176\u03e0\3\2\2\2\u0177\u0178\6\t\2\2\u0178\u017d\5\24"+
		"\13\2\u0179\u017a\7\3\2\2\u017a\u017b\5\u00eav\2\u017b\u017c\7\4\2\2\u017c"+
		"\u017e\3\2\2\2\u017d\u0179\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u0180\3\2"+
		"\2\2\u017f\u0181\5\62\32\2\u0180\u017f\3\2\2\2\u0180\u0181\3\2\2\2\u0181"+
		"\u0182\3\2\2\2\u0182\u0187\5\64\33\2\u0183\u0185\7\27\2\2\u0184\u0183"+
		"\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0188\5\36\20\2"+
		"\u0187\u0184\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u03e0\3\2\2\2\u0189\u018a"+
		"\6\t\3\2\u018a\u018f\5\24\13\2\u018b\u018c\7\3\2\2\u018c\u018d\5\u00ea"+
		"v\2\u018d\u018e\7\4\2\2\u018e\u0190\3\2\2\2\u018f\u018b\3\2\2\2\u018f"+
		"\u0190\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0192\5\62\32\2\u0192\u0197\5"+
		"\64\33\2\u0193\u0195\7\27\2\2\u0194\u0193\3\2\2\2\u0194\u0195\3\2\2\2"+
		"\u0195\u0196\3\2\2\2\u0196\u0198\5\36\20\2\u0197\u0194\3\2\2\2\u0197\u0198"+
		"\3\2\2\2\u0198\u03e0\3\2\2\2\u0199\u019e\5\24\13\2\u019a\u019b\7\3\2\2"+
		"\u019b\u019c\5\u00eav\2\u019c\u019d\7\4\2\2\u019d\u019f\3\2\2\2\u019e"+
		"\u019a\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01b6\3\2\2\2\u01a0\u01a1\7."+
		"\2\2\u01a1\u01b5\7\u012c\2\2\u01a2\u01a3\7\u00b5\2\2\u01a3\u01a4\7\37"+
		"\2\2\u01a4\u01a5\7\3\2\2\u01a5\u01a6\5\u00eav\2\u01a6\u01a7\7\4\2\2\u01a7"+
		"\u01ac\3\2\2\2\u01a8\u01a9\7\u00b5\2\2\u01a9\u01aa\7\37\2\2\u01aa\u01ac"+
		"\5\u0092J\2\u01ab\u01a2\3\2\2\2\u01ab\u01a8\3\2\2\2\u01ac\u01b5\3\2\2"+
		"\2\u01ad\u01b5\5\30\r\2\u01ae\u01b5\5\32\16\2\u01af\u01b5\5\u00a6T\2\u01b0"+
		"\u01b5\5B\"\2\u01b1\u01b5\5\34\17\2\u01b2\u01b3\7\u00f2\2\2\u01b3\u01b5"+
		"\5\66\34\2\u01b4\u01a0\3\2\2\2\u01b4\u01ab\3\2\2\2\u01b4\u01ad\3\2\2\2"+
		"\u01b4\u01ae\3\2\2\2\u01b4\u01af\3\2\2\2\u01b4\u01b0\3\2\2\2\u01b4\u01b1"+
		"\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b5\u01b8\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b6"+
		"\u01b7\3\2\2\2\u01b7\u01bd\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b9\u01bb\7\27"+
		"\2\2\u01ba\u01b9\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc"+
		"\u01be\5\36\20\2\u01bd\u01ba\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u03e0\3"+
		"\2\2\2\u01bf\u01c0\7\66\2\2\u01c0\u01c4\7\u00ef\2\2\u01c1\u01c2\7q\2\2"+
		"\u01c2\u01c3\7\u00a3\2\2\u01c3\u01c5\7U\2\2\u01c4\u01c1\3\2\2\2\u01c4"+
		"\u01c5\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c7\5\u00acW\2\u01c7\u01c8"+
		"\7\u0088\2\2\u01c8\u01d1\5\u00acW\2\u01c9\u01d0\5\62\32\2\u01ca\u01d0"+
		"\5\u00a6T\2\u01cb\u01d0\5B\"\2\u01cc\u01d0\5\34\17\2\u01cd\u01ce\7\u00f2"+
		"\2\2\u01ce\u01d0\5\66\34\2\u01cf\u01c9\3\2\2\2\u01cf\u01ca\3\2\2\2\u01cf"+
		"\u01cb\3\2\2\2\u01cf\u01cc\3\2\2\2\u01cf\u01cd\3\2\2\2\u01d0\u01d3\3\2"+
		"\2\2\u01d1\u01cf\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u03e0\3\2\2\2\u01d3"+
		"\u01d1\3\2\2\2\u01d4\u01d9\5\26\f\2\u01d5\u01d6\7\3\2\2\u01d6\u01d7\5"+
		"\u00eav\2\u01d7\u01d8\7\4\2\2\u01d8\u01da\3\2\2\2\u01d9\u01d5\3\2\2\2"+
		"\u01d9\u01da\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u01dc\5\62\32\2\u01dc\u01e1"+
		"\5\64\33\2\u01dd\u01df\7\27\2\2\u01de\u01dd\3\2\2\2\u01de\u01df\3\2\2"+
		"\2\u01df\u01e0\3\2\2\2\u01e0\u01e2\5\36\20\2\u01e1\u01de\3\2\2\2\u01e1"+
		"\u01e2\3\2\2\2\u01e2\u03e0\3\2\2\2\u01e3\u01e4\7\21\2\2\u01e4\u01e5\7"+
		"\u00ef\2\2\u01e5\u01e7\5\u00aaV\2\u01e6\u01e8\5$\23\2\u01e7\u01e6\3\2"+
		"\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01ea\7\62\2\2\u01ea"+
		"\u01f2\7\u00e9\2\2\u01eb\u01f3\5\u0108\u0085\2\u01ec\u01ed\7b\2\2\u01ed"+
		"\u01ee\7-\2\2\u01ee\u01f3\5\u0094K\2\u01ef\u01f0\7b\2\2\u01f0\u01f1\7"+
		"\17\2\2\u01f1\u01f3\7-\2\2\u01f2\u01eb\3\2\2\2\u01f2\u01ec\3\2\2\2\u01f2"+
		"\u01ef\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u03e0\3\2\2\2\u01f4\u01f5\7\20"+
		"\2\2\u01f5\u01f6\7\u00ef\2\2\u01f6\u01f7\5\u00aaV\2\u01f7\u01f8\7\r\2"+
		"\2\u01f8\u01f9\t\6\2\2\u01f9\u01fa\5\u00e6t\2\u01fa\u03e0\3\2\2\2\u01fb"+
		"\u01fc\7\20\2\2\u01fc\u01fd\7\u00ef\2\2\u01fd\u01fe\5\u00aaV\2\u01fe\u01ff"+
		"\7\r\2\2\u01ff\u0200\t\6\2\2\u0200\u0201\7\3\2\2\u0201\u0202\5\u00e6t"+
		"\2\u0202\u0203\7\4\2\2\u0203\u03e0\3\2\2\2\u0204\u0205\7\20\2\2\u0205"+
		"\u0206\7\u00ef\2\2\u0206\u0207\5\u00aaV\2\u0207\u0208\7\u00c8\2\2\u0208"+
		"\u0209\7,\2\2\u0209\u020a\5\u00aaV\2\u020a\u020b\7\u00f6\2\2\u020b\u020c"+
		"\5\u0104\u0083\2\u020c\u03e0\3\2\2\2\u020d\u020e\7\20\2\2\u020e\u020f"+
		"\7\u00ef\2\2\u020f\u0210\5\u00aaV\2\u0210\u0211\7N\2\2\u0211\u0212\t\6"+
		"\2\2\u0212\u0213\7\3\2\2\u0213\u0214\5\u00a8U\2\u0214\u0215\7\4\2\2\u0215"+
		"\u03e0\3\2\2\2\u0216\u0217\7\20\2\2\u0217\u0218\7\u00ef\2\2\u0218\u0219"+
		"\5\u00aaV\2\u0219\u021a\7N\2\2\u021a\u021b\t\6\2\2\u021b\u021c\5\u00a8"+
		"U\2\u021c\u03e0\3\2\2\2\u021d\u021e\7\20\2\2\u021e\u021f\t\7\2\2\u021f"+
		"\u0220\5\u00aaV\2\u0220\u0221\7\u00c8\2\2\u0221\u0222\7\u00f6\2\2\u0222"+
		"\u0223\5\u00aaV\2\u0223\u03e0\3\2\2\2\u0224\u0225\7\20\2\2\u0225\u0226"+
		"\t\7\2\2\u0226\u0227\5\u00aaV\2\u0227\u0228\7\u00e0\2\2\u0228\u0229\7"+
		"\u00f2\2\2\u0229\u022a\5\66\34\2\u022a\u03e0\3\2\2\2\u022b\u022c\7\20"+
		"\2\2\u022c\u022d\t\7\2\2\u022d\u022e\5\u00aaV\2\u022e\u022f\7\u0107\2"+
		"\2\u022f\u0232\7\u00f2\2\2\u0230\u0231\7q\2\2\u0231\u0233\7U\2\2\u0232"+
		"\u0230\3\2\2\2\u0232\u0233\3\2\2\2\u0233\u0234\3\2\2\2\u0234\u0235\5\66"+
		"\34\2\u0235\u03e0\3\2\2\2\u0236\u0237\7\20\2\2\u0237\u0238\7\u00ef\2\2"+
		"\u0238\u0239\5\u00aaV\2\u0239\u023b\t\b\2\2\u023a\u023c\7,\2\2\u023b\u023a"+
		"\3\2\2\2\u023b\u023c\3\2\2\2\u023c\u023d\3\2\2\2\u023d\u0240\5\u00aaV"+
		"\2\u023e\u023f\7\u00ff\2\2\u023f\u0241\5\u00e4s\2\u0240\u023e\3\2\2\2"+
		"\u0240\u0241\3\2\2\2\u0241\u0244\3\2\2\2\u0242\u0243\7.\2\2\u0243\u0245"+
		"\7\u012c\2\2\u0244\u0242\3\2\2\2\u0244\u0245\3\2\2\2\u0245\u0247\3\2\2"+
		"\2\u0246\u0248\5\u00e2r\2\u0247\u0246\3\2\2\2\u0247\u0248\3\2\2\2\u0248"+
		"\u03e0\3\2\2\2\u0249\u024a\7\20\2\2\u024a\u024b\7\u00ef\2\2\u024b\u024d"+
		"\5\u00aaV\2\u024c\u024e\5$\23\2\u024d\u024c\3\2\2\2\u024d\u024e\3\2\2"+
		"\2\u024e\u024f\3\2\2\2\u024f\u0250\7\u00e0\2\2\u0250\u0251\7\u00dd\2\2"+
		"\u0251\u0255\7\u012c\2\2\u0252\u0253\7\u0113\2\2\u0253\u0254\7\u00de\2"+
		"\2\u0254\u0256\5\66\34\2\u0255\u0252\3\2\2\2\u0255\u0256\3\2\2\2\u0256"+
		"\u03e0\3\2\2\2\u0257\u0258\7\20\2\2\u0258\u0259\7\u00ef\2\2\u0259\u025b"+
		"\5\u00aaV\2\u025a\u025c\5$\23\2\u025b\u025a\3\2\2\2\u025b\u025c\3\2\2"+
		"\2\u025c\u025d\3\2\2\2\u025d\u025e\7\u00e0\2\2\u025e\u025f\7\u00de\2\2"+
		"\u025f\u0260\5\66\34\2\u0260\u03e0\3\2\2\2\u0261\u0262\7\20\2\2\u0262"+
		"\u0263\t\7\2\2\u0263\u0264\5\u00aaV\2\u0264\u0268\7\r\2\2\u0265\u0266"+
		"\7q\2\2\u0266\u0267\7\u00a3\2\2\u0267\u0269\7U\2\2\u0268\u0265\3\2\2\2"+
		"\u0268\u0269\3\2\2\2\u0269\u026b\3\2\2\2\u026a\u026c\5\"\22\2\u026b\u026a"+
		"\3\2\2\2\u026c\u026d\3\2\2\2\u026d\u026b\3\2\2\2\u026d\u026e\3\2\2\2\u026e"+
		"\u03e0\3\2\2\2\u026f\u0270\7\20\2\2\u0270\u0271\7\u00ef\2\2\u0271\u0272"+
		"\5\u00aaV\2\u0272\u0273\5$\23\2\u0273\u0274\7\u00c8\2\2\u0274\u0275\7"+
		"\u00f6\2\2\u0275\u0276\5$\23\2\u0276\u03e0\3\2\2\2\u0277\u0278\7\20\2"+
		"\2\u0278\u0279\t\7\2\2\u0279\u027a\5\u00aaV\2\u027a\u027d\7N\2\2\u027b"+
		"\u027c\7q\2\2\u027c\u027e\7U\2\2\u027d\u027b\3\2\2\2\u027d\u027e\3\2\2"+
		"\2\u027e\u027f\3\2\2\2\u027f\u0284\5$\23\2\u0280\u0281\7\5\2\2\u0281\u0283"+
		"\5$\23\2\u0282\u0280\3\2\2\2\u0283\u0286\3\2\2\2\u0284\u0282\3\2\2\2\u0284"+
		"\u0285\3\2\2\2\u0285\u0288\3\2\2\2\u0286\u0284\3\2\2\2\u0287\u0289\7\u00bf"+
		"\2\2\u0288\u0287\3\2\2\2\u0288\u0289\3\2\2\2\u0289\u03e0\3\2\2\2\u028a"+
		"\u028b\7\20\2\2\u028b\u028c\7\u00ef\2\2\u028c\u028e\5\u00aaV\2\u028d\u028f"+
		"\5$\23\2\u028e\u028d\3\2\2\2\u028e\u028f\3\2\2\2\u028f\u0290\3\2\2\2\u0290"+
		"\u0291\7\u00e0\2\2\u0291\u0292\5\34\17\2\u0292\u03e0\3\2\2\2\u0293\u0294"+
		"\7\20\2\2\u0294\u0295\7\u00ef\2\2\u0295\u0296\5\u00aaV\2\u0296\u0297\7"+
		"\u00c4\2\2\u0297\u0298\7\u00b6\2\2\u0298\u03e0\3\2\2\2\u0299\u029a\7N"+
		"\2\2\u029a\u029d\7\u00ef\2\2\u029b\u029c\7q\2\2\u029c\u029e\7U\2\2\u029d"+
		"\u029b\3\2\2\2\u029d\u029e\3\2\2\2\u029e\u029f\3\2\2\2\u029f\u02a1\5\u00aa"+
		"V\2\u02a0\u02a2\7\u00bf\2\2\u02a1\u02a0\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2"+
		"\u03e0\3\2\2\2\u02a3\u02a4\7N\2\2\u02a4\u02a7\7\u010d\2\2\u02a5\u02a6"+
		"\7q\2\2\u02a6\u02a8\7U\2\2\u02a7\u02a5\3\2\2\2\u02a7\u02a8\3\2\2\2\u02a8"+
		"\u02a9\3\2\2\2\u02a9\u03e0\5\u00aaV\2\u02aa\u02ad\7\66\2\2\u02ab\u02ac"+
		"\7\u00ab\2\2\u02ac\u02ae\7\u00ca\2\2\u02ad\u02ab\3\2\2\2\u02ad\u02ae\3"+
		"\2\2\2\u02ae\u02b3\3\2\2\2\u02af\u02b1\7j\2\2\u02b0\u02af\3\2\2\2\u02b0"+
		"\u02b1\3\2\2\2\u02b1\u02b2\3\2\2\2\u02b2\u02b4\7\u00f3\2\2\u02b3\u02b0"+
		"\3\2\2\2\u02b3\u02b4\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5\u02b9\7\u010d\2"+
		"\2\u02b6\u02b7\7q\2\2\u02b7\u02b8\7\u00a3\2\2\u02b8\u02ba\7U\2\2\u02b9"+
		"\u02b6\3\2\2\2\u02b9\u02ba\3\2\2\2\u02ba\u02bb\3\2\2\2\u02bb\u02bd\5\u00aa"+
		"V\2\u02bc\u02be\5\u009aN\2\u02bd\u02bc\3\2\2\2\u02bd\u02be\3\2\2\2\u02be"+
		"\u02c8\3\2\2\2\u02bf\u02c0\7.\2\2\u02c0\u02c7\7\u012c\2\2\u02c1\u02c2"+
		"\7\u00b5\2\2\u02c2\u02c3\7\u00a7\2\2\u02c3\u02c7\5\u0092J\2\u02c4\u02c5"+
		"\7\u00f2\2\2\u02c5\u02c7\5\66\34\2\u02c6\u02bf\3\2\2\2\u02c6\u02c1\3\2"+
		"\2\2\u02c6\u02c4\3\2\2\2\u02c7\u02ca\3\2\2\2\u02c8\u02c6\3\2\2\2\u02c8"+
		"\u02c9\3\2\2\2\u02c9\u02cb\3\2\2\2\u02ca\u02c8\3\2\2\2\u02cb\u02cc\7\27"+
		"\2\2\u02cc\u02cd\5\36\20\2\u02cd\u03e0\3\2\2\2\u02ce\u02d1\7\66\2\2\u02cf"+
		"\u02d0\7\u00ab\2\2\u02d0\u02d2\7\u00ca\2\2\u02d1\u02cf\3\2\2\2\u02d1\u02d2"+
		"\3\2\2\2\u02d2\u02d4\3\2\2\2\u02d3\u02d5\7j\2\2\u02d4\u02d3\3\2\2\2\u02d4"+
		"\u02d5\3\2\2\2\u02d5\u02d6\3\2\2\2\u02d6\u02d7\7\u00f3\2\2\u02d7\u02d8"+
		"\7\u010d\2\2\u02d8\u02dd\5\u00acW\2\u02d9\u02da\7\3\2\2\u02da\u02db\5"+
		"\u00eav\2\u02db\u02dc\7\4\2\2\u02dc\u02de\3\2\2\2\u02dd\u02d9\3\2\2\2"+
		"\u02dd\u02de\3\2\2\2\u02de\u02df\3\2\2\2\u02df\u02e2\5\62\32\2\u02e0\u02e1"+
		"\7\u00aa\2\2\u02e1\u02e3\5\66\34\2\u02e2\u02e0\3\2\2\2\u02e2\u02e3\3\2"+
		"\2\2\u02e3\u03e0\3\2\2\2\u02e4\u02e5\7\20\2\2\u02e5\u02e6\7\u010d\2\2"+
		"\u02e6\u02e8\5\u00aaV\2\u02e7\u02e9\7\27\2\2\u02e8\u02e7\3\2\2\2\u02e8"+
		"\u02e9\3\2\2\2\u02e9\u02ea\3\2\2\2\u02ea\u02eb\5\36\20\2\u02eb\u03e0\3"+
		"\2\2\2\u02ec\u02ef\7\66\2\2\u02ed\u02ee\7\u00ab\2\2\u02ee\u02f0\7\u00ca"+
		"\2\2\u02ef\u02ed\3\2\2\2\u02ef\u02f0\3\2\2\2\u02f0\u02f2\3\2\2\2\u02f1"+
		"\u02f3\7\u00f3\2\2\u02f2\u02f1\3\2\2\2\u02f2\u02f3\3\2\2\2\u02f3\u02f4"+
		"\3\2\2\2\u02f4\u02f8\7h\2\2\u02f5\u02f6\7q\2\2\u02f6\u02f7\7\u00a3\2\2"+
		"\u02f7\u02f9\7U\2\2\u02f8\u02f5\3\2\2\2\u02f8\u02f9\3\2\2\2\u02f9\u02fa"+
		"\3\2\2\2\u02fa\u02fb\5\u00aaV\2\u02fb\u02fc\7\27\2\2\u02fc\u0306\7\u012c"+
		"\2\2\u02fd\u02fe\7\u010b\2\2\u02fe\u0303\5H%\2\u02ff\u0300\7\5\2\2\u0300"+
		"\u0302\5H%\2\u0301\u02ff\3\2\2\2\u0302\u0305\3\2\2\2\u0303\u0301\3\2\2"+
		"\2\u0303\u0304\3\2\2\2\u0304\u0307\3\2\2\2\u0305\u0303\3\2\2\2\u0306\u02fd"+
		"\3\2\2\2\u0306\u0307\3\2\2\2\u0307\u03e0\3\2\2\2\u0308\u030a\7N\2\2\u0309"+
		"\u030b\7\u00f3\2\2\u030a\u0309\3\2\2\2\u030a\u030b\3\2\2\2\u030b\u030c"+
		"\3\2\2\2\u030c\u030f\7h\2\2\u030d\u030e\7q\2\2\u030e\u0310\7U\2\2\u030f"+
		"\u030d\3\2\2\2\u030f\u0310\3\2\2\2\u0310\u0311\3\2\2\2\u0311\u03e0\5\u00aa"+
		"V\2\u0312\u0314\7V\2\2\u0313\u0315\t\t\2\2\u0314\u0313\3\2\2\2\u0314\u0315"+
		"\3\2\2\2\u0315\u0316\3\2\2\2\u0316\u03e0\5\20\t\2\u0317\u0318\7\u00e3"+
		"\2\2\u0318\u031b\7\u00f0\2\2\u0319\u031a\t\5\2\2\u031a\u031c\5\u00aaV"+
		"\2\u031b\u0319\3\2\2\2\u031b\u031c\3\2\2\2\u031c\u0321\3\2\2\2\u031d\u031f"+
		"\7\u0088\2\2\u031e\u031d\3\2\2\2\u031e\u031f\3\2\2\2\u031f\u0320\3\2\2"+
		"\2\u0320\u0322\7\u012c\2\2\u0321\u031e\3\2\2\2\u0321\u0322\3\2\2\2\u0322"+
		"\u03e0\3\2\2\2\u0323\u0324\7\u00e3\2\2\u0324\u0325\7\u00ef\2\2\u0325\u0328"+
		"\7X\2\2\u0326\u0327\t\5\2\2\u0327\u0329\5\u00aaV\2\u0328\u0326\3\2\2\2"+
		"\u0328\u0329\3\2\2\2\u0329\u032a\3\2\2\2\u032a\u032b\7\u0088\2\2\u032b"+
		"\u032d\7\u012c\2\2\u032c\u032e\5$\23\2\u032d\u032c\3\2\2\2\u032d\u032e"+
		"\3\2\2\2\u032e\u03e0\3\2\2\2\u032f\u0330\7\u00e3\2\2\u0330\u0331\7\u00f2"+
		"\2\2\u0331\u0336\5\u00aaV\2\u0332\u0333\7\3\2\2\u0333\u0334\5:\36\2\u0334"+
		"\u0335\7\4\2\2\u0335\u0337\3\2\2\2\u0336\u0332\3\2\2\2\u0336\u0337\3\2"+
		"\2\2\u0337\u03e0\3\2\2\2\u0338\u0339\7\u00e3\2\2\u0339\u033a\7-\2\2\u033a"+
		"\u033b\t\5\2\2\u033b\u033e\5\u00aaV\2\u033c\u033d\t\5\2\2\u033d\u033f"+
		"\5\u00aaV\2\u033e\u033c\3\2\2\2\u033e\u033f\3\2\2\2\u033f\u03e0\3\2\2"+
		"\2\u0340\u0341\7\u00e3\2\2\u0341\u0342\7\u00b6\2\2\u0342\u0344\5\u00aa"+
		"V\2\u0343\u0345\5$\23\2\u0344\u0343\3\2\2\2\u0344\u0345\3\2\2\2\u0345"+
		"\u03e0\3\2\2\2\u0346\u0348\7\u00e3\2\2\u0347\u0349\5\u0108\u0085\2\u0348"+
		"\u0347\3\2\2\2\u0348\u0349\3\2\2\2\u0349\u034a\3\2\2\2\u034a\u0352\7i"+
		"\2\2\u034b\u034d\7\u0088\2\2\u034c\u034b\3\2\2\2\u034c\u034d\3\2\2\2\u034d"+
		"\u0350\3\2\2\2\u034e\u0351\5\u00aaV\2\u034f\u0351\7\u012c\2\2\u0350\u034e"+
		"\3\2\2\2\u0350\u034f\3\2\2\2\u0351\u0353\3\2\2\2\u0352\u034c\3\2\2\2\u0352"+
		"\u0353\3\2\2\2\u0353\u03e0\3\2\2\2\u0354\u0355\7\u00e3\2\2\u0355\u0356"+
		"\7\66\2\2\u0356\u0357\7\u00ef\2\2\u0357\u03e0\5\u00aaV\2\u0358\u0359\7"+
		"\u00e3\2\2\u0359\u035a\79\2\2\u035a\u03e0\7\u009f\2\2\u035b\u035c\t\n"+
		"\2\2\u035c\u035e\7h\2\2\u035d\u035f\7X\2\2\u035e\u035d\3\2\2\2\u035e\u035f"+
		"\3\2\2\2\u035f\u0360\3\2\2\2\u0360\u03e0\5*\26\2\u0361\u0364\t\n\2\2\u0362"+
		"\u0365\5(\25\2\u0363\u0365\7\u009f\2\2\u0364\u0362\3\2\2\2\u0364\u0363"+
		"\3\2\2\2\u0365\u0367\3\2\2\2\u0366\u0368\7X\2\2\u0367\u0366\3\2\2\2\u0367"+
		"\u0368\3\2\2\2\u0368\u0369\3\2\2\2\u0369\u03e0\5\u00aaV\2\u036a\u036c"+
		"\t\n\2\2\u036b\u036d\7\u00ef\2\2\u036c\u036b\3\2\2\2\u036c\u036d\3\2\2"+
		"\2\u036d\u036f\3\2\2\2\u036e\u0370\t\13\2\2\u036f\u036e\3\2\2\2\u036f"+
		"\u0370\3\2\2\2\u0370\u0371\3\2\2\2\u0371\u0373\5\u00aaV\2\u0372\u0374"+
		"\5$\23\2\u0373\u0372\3\2\2\2\u0373\u0374\3\2\2\2\u0374\u0376\3\2\2\2\u0375"+
		"\u0377\5,\27\2\u0376\u0375\3\2\2\2\u0376\u0377\3\2\2\2\u0377\u03e0\3\2"+
		"\2\2\u0378\u037a\t\n\2\2\u0379\u037b\7\u00c0\2\2\u037a\u0379\3\2\2\2\u037a"+
		"\u037b\3\2\2\2\u037b\u037c\3\2\2\2\u037c\u03e0\5\36\20\2\u037d\u037e\7"+
		"\u00c7\2\2\u037e\u037f\7\u00ef\2\2\u037f\u03e0\5\u00aaV\2\u0380\u0388"+
		"\7\u00c7\2\2\u0381\u0389\7\u012c\2\2\u0382\u0384\13\2\2\2\u0383\u0382"+
		"\3\2\2\2\u0384\u0387\3\2\2\2\u0385\u0386\3\2\2\2\u0385\u0383\3\2\2\2\u0386"+
		"\u0389\3\2\2\2\u0387\u0385\3\2\2\2\u0388\u0381\3\2\2\2\u0388\u0385\3\2"+
		"\2\2\u0389\u03e0\3\2\2\2\u038a\u038c\7 \2\2\u038b\u038d\7\u0085\2\2\u038c"+
		"\u038b\3\2\2\2\u038c\u038d\3\2\2\2\u038d\u038e\3\2\2\2\u038e\u038f\7\u00ef"+
		"\2\2\u038f\u0392\5\u00aaV\2\u0390\u0391\7\u00aa\2\2\u0391\u0393\5\66\34"+
		"\2\u0392\u0390\3\2\2\2\u0392\u0393\3\2\2\2\u0393\u0398\3\2\2\2\u0394\u0396"+
		"\7\27\2\2\u0395\u0394\3\2\2\2\u0395\u0396\3\2\2\2\u0396\u0397\3\2\2\2"+
		"\u0397\u0399\5\36\20\2\u0398\u0395\3\2\2\2\u0398\u0399\3\2\2\2\u0399\u03e0"+
		"\3\2\2\2\u039a\u039b\7\u0102\2\2\u039b\u039e\7\u00ef\2\2\u039c\u039d\7"+
		"q\2\2\u039d\u039f\7U\2\2\u039e\u039c\3\2\2\2\u039e\u039f\3\2\2\2\u039f"+
		"\u03a0\3\2\2\2\u03a0\u03e0\5\u00aaV\2\u03a1\u03a2\7&\2\2\u03a2\u03e0\7"+
		" \2\2\u03a3\u03a4\7\u008c\2\2\u03a4\u03a6\7>\2\2\u03a5\u03a7\7\u008d\2"+
		"\2\u03a6\u03a5\3\2\2\2\u03a6\u03a7\3\2\2\2\u03a7\u03a8\3\2\2\2\u03a8\u03a9"+
		"\7x\2\2\u03a9\u03ab\7\u012c\2\2\u03aa\u03ac\7\u00b3\2\2\u03ab\u03aa\3"+
		"\2\2\2\u03ab\u03ac\3\2\2\2\u03ac\u03ad\3\2\2\2\u03ad\u03ae\7}\2\2\u03ae"+
		"\u03af\7\u00ef\2\2\u03af\u03b1\5\u00aaV\2\u03b0\u03b2\5$\23\2\u03b1\u03b0"+
		"\3\2\2\2\u03b1\u03b2\3\2\2\2\u03b2\u03e0\3\2\2\2\u03b3\u03b4\7\u00fe\2"+
		"\2\u03b4\u03b5\7\u00ef\2\2\u03b5\u03b7\5\u00aaV\2\u03b6\u03b8\5$\23\2"+
		"\u03b7\u03b6\3\2\2\2\u03b7\u03b8\3\2\2\2\u03b8\u03e0\3\2\2\2\u03b9\u03ba"+
		"\7\u009e\2\2\u03ba\u03bb\7\u00c9\2\2\u03bb\u03bc\7\u00ef\2\2\u03bc\u03e0"+
		"\5\u00aaV\2\u03bd\u03be\t\f\2\2\u03be\u03c6\5\u0108\u0085\2\u03bf\u03c7"+
		"\7\u012c\2\2\u03c0\u03c2\13\2\2\2\u03c1\u03c0\3\2\2\2\u03c2\u03c5\3\2"+
		"\2\2\u03c3\u03c4\3\2\2\2\u03c3\u03c1\3\2\2\2\u03c4\u03c7\3\2\2\2\u03c5"+
		"\u03c3\3\2\2\2\u03c6\u03bf\3\2\2\2\u03c6\u03c3\3\2\2\2\u03c7\u03e0\3\2"+
		"\2\2\u03c8\u03c9\7\u00e0\2\2\u03c9\u03cd\7\u00d1\2\2\u03ca\u03cc\13\2"+
		"\2\2\u03cb\u03ca\3\2\2\2\u03cc\u03cf\3\2\2\2\u03cd\u03ce\3\2\2\2\u03cd"+
		"\u03cb\3\2\2\2\u03ce\u03e0\3\2\2\2\u03cf\u03cd\3\2\2\2\u03d0\u03d4\7\u00e0"+
		"\2\2\u03d1\u03d3\13\2\2\2\u03d2\u03d1\3\2\2\2\u03d3\u03d6\3\2\2\2\u03d4"+
		"\u03d5\3\2\2\2\u03d4\u03d2\3\2\2\2\u03d5\u03e0\3\2\2\2\u03d6\u03d4\3\2"+
		"\2\2\u03d7\u03e0\7\u00cb\2\2\u03d8\u03dc\5\22\n\2\u03d9\u03db\13\2\2\2"+
		"\u03da\u03d9\3\2\2\2\u03db\u03de\3\2\2\2\u03dc\u03dd\3\2\2\2\u03dc\u03da"+
		"\3\2\2\2\u03dd\u03e0\3\2\2\2\u03de\u03dc\3\2\2\2\u03df\u012b\3\2\2\2\u03df"+
		"\u012d\3\2\2\2\u03df\u0130\3\2\2\2\u03df\u0135\3\2\2\2\u03df\u014b\3\2"+
		"\2\2\u03df\u0155\3\2\2\2\u03df\u015e\3\2\2\2\u03df\u016b\3\2\2\2\u03df"+
		"\u0177\3\2\2\2\u03df\u0189\3\2\2\2\u03df\u0199\3\2\2\2\u03df\u01bf\3\2"+
		"\2\2\u03df\u01d4\3\2\2\2\u03df\u01e3\3\2\2\2\u03df\u01f4\3\2\2\2\u03df"+
		"\u01fb\3\2\2\2\u03df\u0204\3\2\2\2\u03df\u020d\3\2\2\2\u03df\u0216\3\2"+
		"\2\2\u03df\u021d\3\2\2\2\u03df\u0224\3\2\2\2\u03df\u022b\3\2\2\2\u03df"+
		"\u0236\3\2\2\2\u03df\u0249\3\2\2\2\u03df\u0257\3\2\2\2\u03df\u0261\3\2"+
		"\2\2\u03df\u026f\3\2\2\2\u03df\u0277\3\2\2\2\u03df\u028a\3\2\2\2\u03df"+
		"\u0293\3\2\2\2\u03df\u0299\3\2\2\2\u03df\u02a3\3\2\2\2\u03df\u02aa\3\2"+
		"\2\2\u03df\u02ce\3\2\2\2\u03df\u02e4\3\2\2\2\u03df\u02ec\3\2\2\2\u03df"+
		"\u0308\3\2\2\2\u03df\u0312\3\2\2\2\u03df\u0317\3\2\2\2\u03df\u0323\3\2"+
		"\2\2\u03df\u032f\3\2\2\2\u03df\u0338\3\2\2\2\u03df\u0340\3\2\2\2\u03df"+
		"\u0346\3\2\2\2\u03df\u0354\3\2\2\2\u03df\u0358\3\2\2\2\u03df\u035b\3\2"+
		"\2\2\u03df\u0361\3\2\2\2\u03df\u036a\3\2\2\2\u03df\u0378\3\2\2\2\u03df"+
		"\u037d\3\2\2\2\u03df\u0380\3\2\2\2\u03df\u038a\3\2\2\2\u03df\u039a\3\2"+
		"\2\2\u03df\u03a1\3\2\2\2\u03df\u03a3\3\2\2\2\u03df\u03b3\3\2\2\2\u03df"+
		"\u03b9\3\2\2\2\u03df\u03bd\3\2\2\2\u03df\u03c8\3\2\2\2\u03df\u03d0\3\2"+
		"\2\2\u03df\u03d7\3\2\2\2\u03df\u03d8\3\2\2\2\u03e0\21\3\2\2\2\u03e1\u03e2"+
		"\7\66\2\2\u03e2\u048a\7\u00d1\2\2\u03e3\u03e4\7N\2\2\u03e4\u048a\7\u00d1"+
		"\2\2\u03e5\u03e7\7k\2\2\u03e6\u03e8\7\u00d1\2\2\u03e7\u03e6\3\2\2\2\u03e7"+
		"\u03e8\3\2\2\2\u03e8\u048a\3\2\2\2\u03e9\u03eb\7\u00ce\2\2\u03ea\u03ec"+
		"\7\u00d1\2\2\u03eb\u03ea\3\2\2\2\u03eb\u03ec\3\2\2\2\u03ec\u048a\3\2\2"+
		"\2\u03ed\u03ee\7\u00e3\2\2\u03ee\u048a\7k\2\2\u03ef\u03f0\7\u00e3\2\2"+
		"\u03f0\u03f2\7\u00d1\2\2\u03f1\u03f3\7k\2\2\u03f2\u03f1\3\2\2\2\u03f2"+
		"\u03f3\3\2\2\2\u03f3\u048a\3\2\2\2\u03f4\u03f5\7\u00e3\2\2\u03f5\u048a"+
		"\7\u00bd\2\2\u03f6\u03f7\7\u00e3\2\2\u03f7\u048a\7\u00d2\2\2\u03f8\u03f9"+
		"\7\u00e3\2\2\u03f9\u03fa\79\2\2\u03fa\u048a\7\u00d2\2\2\u03fb\u03fc\7"+
		"W\2\2\u03fc\u048a\7\u00ef\2\2\u03fd\u03fe\7s\2\2\u03fe\u048a\7\u00ef\2"+
		"\2\u03ff\u0400\7\u00e3\2\2\u0400\u048a\7\61\2\2\u0401\u0402\7\u00e3\2"+
		"\2\u0402\u0403\7\66\2\2\u0403\u048a\7\u00ef\2\2\u0404\u0405\7\u00e3\2"+
		"\2\u0405\u048a\7\u00fa\2\2\u0406\u0407\7\u00e3\2\2\u0407\u048a\7v\2\2"+
		"\u0408\u0409\7\u00e3\2\2\u0409\u048a\7\u0090\2\2\u040a\u040b\7\66\2\2"+
		"\u040b\u048a\7u\2\2\u040c\u040d\7N\2\2\u040d\u048a\7u\2\2\u040e\u040f"+
		"\7\20\2\2\u040f\u048a\7u\2\2\u0410\u0411\7\u008f\2\2\u0411\u048a\7\u00ef"+
		"\2\2\u0412\u0413\7\u008f\2\2\u0413\u048a\7?\2\2\u0414\u0415\7\u0106\2"+
		"\2\u0415\u048a\7\u00ef\2\2\u0416\u0417\7\u0106\2\2\u0417\u048a\7?\2\2"+
		"\u0418\u0419\7\66\2\2\u0419\u041a\7\u00f3\2\2\u041a\u048a\7\u0092\2\2"+
		"\u041b\u041c\7N\2\2\u041c\u041d\7\u00f3\2\2\u041d\u048a\7\u0092\2\2\u041e"+
		"\u041f\7\20\2\2\u041f\u0420\7\u00ef\2\2\u0420\u0421\5\u00acW\2\u0421\u0422"+
		"\7\u00a3\2\2\u0422\u0423\7(\2\2\u0423\u048a\3\2\2\2\u0424\u0425\7\20\2"+
		"\2\u0425\u0426\7\u00ef\2\2\u0426\u0427\5\u00acW\2\u0427\u0428\7(\2\2\u0428"+
		"\u0429\7\37\2\2\u0429\u048a\3\2\2\2\u042a\u042b\7\20\2\2\u042b\u042c\7"+
		"\u00ef\2\2\u042c\u042d\5\u00acW\2\u042d\u042e\7\u00a3\2\2\u042e\u042f"+
		"\7\u00e7\2\2\u042f\u048a\3\2\2\2\u0430\u0431\7\20\2\2\u0431\u0432\7\u00ef"+
		"\2\2\u0432\u0433\5\u00acW\2\u0433\u0434\7\u00e4\2\2\u0434\u0435\7\37\2"+
		"\2\u0435\u048a\3\2\2\2\u0436\u0437\7\20\2\2\u0437\u0438\7\u00ef\2\2\u0438"+
		"\u0439\5\u00acW\2\u0439\u043a\7\u00a3\2\2\u043a\u043b\7\u00e4\2\2\u043b"+
		"\u048a\3\2\2\2\u043c\u043d\7\20\2\2\u043d\u043e\7\u00ef\2\2\u043e\u043f"+
		"\5\u00acW\2\u043f\u0440\7\u00a3\2\2\u0440\u0441\7\u00ea\2\2\u0441\u0442"+
		"\7\27\2\2\u0442\u0443\7J\2\2\u0443\u048a\3\2\2\2\u0444\u0445\7\20\2\2"+
		"\u0445\u0446\7\u00ef\2\2\u0446\u0447\5\u00acW\2\u0447\u0448\7\u00e0\2"+
		"\2\u0448\u0449\7\u00e4\2\2\u0449\u044a\7\u008e\2\2\u044a\u048a\3\2\2\2"+
		"\u044b\u044c\7\20\2\2\u044c\u044d\7\u00ef\2\2\u044d\u044e\5\u00acW\2\u044e"+
		"\u044f\7T\2\2\u044f\u0450\7\u00b4\2\2\u0450\u048a\3\2\2\2\u0451\u0452"+
		"\7\20\2\2\u0452\u0453\7\u00ef\2\2\u0453\u0454\5\u00acW\2\u0454\u0455\7"+
		"\25\2\2\u0455\u0456\7\u00b4\2\2\u0456\u048a\3\2\2\2\u0457\u0458\7\20\2"+
		"\2\u0458\u0459\7\u00ef\2\2\u0459\u045a\5\u00acW\2\u045a\u045b\7\u0100"+
		"\2\2\u045b\u045c\7\u00b4\2\2\u045c\u048a\3\2\2\2\u045d\u045e\7\20\2\2"+
		"\u045e\u045f\7\u00ef\2\2\u045f\u0460\5\u00acW\2\u0460\u0461\7\u00f7\2"+
		"\2\u0461\u048a\3\2\2\2\u0462\u0463\7\20\2\2\u0463\u0464\7\u00ef\2\2\u0464"+
		"\u0466\5\u00acW\2\u0465\u0467\5$\23\2\u0466\u0465\3\2\2\2\u0466\u0467"+
		"\3\2\2\2\u0467\u0468\3\2\2\2\u0468\u0469\7\60\2\2\u0469\u048a\3\2\2\2"+
		"\u046a\u046b\7\20\2\2\u046b\u046c\7\u00ef\2\2\u046c\u046e\5\u00acW\2\u046d"+
		"\u046f\5$\23\2\u046e\u046d\3\2\2\2\u046e\u046f\3\2\2\2\u046f\u0470\3\2"+
		"\2\2\u0470\u0471\7\63\2\2\u0471\u048a\3\2\2\2\u0472\u0473\7\20\2\2\u0473"+
		"\u0474\7\u00ef\2\2\u0474\u0476\5\u00acW\2\u0475\u0477\5$\23\2\u0476\u0475"+
		"\3\2\2\2\u0476\u0477\3\2\2\2\u0477\u0478\3\2\2\2\u0478\u0479\7\u00e0\2"+
		"\2\u0479\u047a\7^\2\2\u047a\u048a\3\2\2\2\u047b\u047c\7\20\2\2\u047c\u047d"+
		"\7\u00ef\2\2\u047d\u047f\5\u00acW\2\u047e\u0480\5$\23\2\u047f\u047e\3"+
		"\2\2\2\u047f\u0480\3\2\2\2\u0480\u0481\3\2\2\2\u0481\u0482\7\u00ca\2\2"+
		"\u0482\u0483\7-\2\2\u0483\u048a\3\2\2\2\u0484\u0485\7\u00e8\2\2\u0485"+
		"\u048a\7\u00f9\2\2\u0486\u048a\7/\2\2\u0487\u048a\7\u00d3\2\2\u0488\u048a"+
		"\7I\2\2\u0489\u03e1\3\2\2\2\u0489\u03e3\3\2\2\2\u0489\u03e5\3\2\2\2\u0489"+
		"\u03e9\3\2\2\2\u0489\u03ed\3\2\2\2\u0489\u03ef\3\2\2\2\u0489\u03f4\3\2"+
		"\2\2\u0489\u03f6\3\2\2\2\u0489\u03f8\3\2\2\2\u0489\u03fb\3\2\2\2\u0489"+
		"\u03fd\3\2\2\2\u0489\u03ff\3\2\2\2\u0489\u0401\3\2\2\2\u0489\u0404\3\2"+
		"\2\2\u0489\u0406\3\2\2\2\u0489\u0408\3\2\2\2\u0489\u040a\3\2\2\2\u0489"+
		"\u040c\3\2\2\2\u0489\u040e\3\2\2\2\u0489\u0410\3\2\2\2\u0489\u0412\3\2"+
		"\2\2\u0489\u0414\3\2\2\2\u0489\u0416\3\2\2\2\u0489\u0418\3\2\2\2\u0489"+
		"\u041b\3\2\2\2\u0489\u041e\3\2\2\2\u0489\u0424\3\2\2\2\u0489\u042a\3\2"+
		"\2\2\u0489\u0430\3\2\2\2\u0489\u0436\3\2\2\2\u0489\u043c\3\2\2\2\u0489"+
		"\u0444\3\2\2\2\u0489\u044b\3\2\2\2\u0489\u0451\3\2\2\2\u0489\u0457\3\2"+
		"\2\2\u0489\u045d\3\2\2\2\u0489\u0462\3\2\2\2\u0489\u046a\3\2\2\2\u0489"+
		"\u0472\3\2\2\2\u0489\u047b\3\2\2\2\u0489\u0484\3\2\2\2\u0489\u0486\3\2"+
		"\2\2\u0489\u0487\3\2\2\2\u0489\u0488\3\2\2\2\u048a\23\3\2\2\2\u048b\u048d"+
		"\7\66\2\2\u048c\u048e\7\u00f3\2\2\u048d\u048c\3\2\2\2\u048d\u048e\3\2"+
		"\2\2\u048e\u0490\3\2\2\2\u048f\u0491\7Y\2\2\u0490\u048f\3\2\2\2\u0490"+
		"\u0491\3\2\2\2\u0491\u0492\3\2\2\2\u0492\u0496\7\u00ef\2\2\u0493\u0494"+
		"\7q\2\2\u0494\u0495\7\u00a3\2\2\u0495\u0497\7U\2\2\u0496\u0493\3\2\2\2"+
		"\u0496\u0497\3\2\2\2\u0497\u0498\3\2\2\2\u0498\u0499\5\u00aaV\2\u0499"+
		"\25\3\2\2\2\u049a\u049b\7\66\2\2\u049b\u049d\7\u00ab\2\2\u049c\u049a\3"+
		"\2\2\2\u049c\u049d\3\2\2\2\u049d\u049e\3\2\2\2\u049e\u049f\7\u00ca\2\2"+
		"\u049f\u04a0\7\u00ef\2\2\u04a0\u04a1\5\u00aaV\2\u04a1\27\3\2\2\2\u04a2"+
		"\u04a3\7(\2\2\u04a3\u04a4\7\37\2\2\u04a4\u04a8\5\u0092J\2\u04a5\u04a6"+
		"\7\u00e7\2\2\u04a6\u04a7\7\37\2\2\u04a7\u04a9\5\u0096L\2\u04a8\u04a5\3"+
		"\2\2\2\u04a8\u04a9\3\2\2\2\u04a9\u04aa\3\2\2\2\u04aa\u04ab\7}\2\2\u04ab"+
		"\u04ac\7\u0130\2\2\u04ac\u04ad\7\36\2\2\u04ad\31\3\2\2\2\u04ae\u04af\7"+
		"\u00e4\2\2\u04af\u04b0\7\37\2\2\u04b0\u04b1\5\u0092J\2\u04b1\u04b4\7\u00a7"+
		"\2\2\u04b2\u04b5\5> \2\u04b3\u04b5\5@!\2\u04b4\u04b2\3\2\2\2\u04b4\u04b3"+
		"\3\2\2\2\u04b5\u04b9\3\2\2\2\u04b6\u04b7\7\u00ea\2\2\u04b7\u04b8\7\27"+
		"\2\2\u04b8\u04ba\7J\2\2\u04b9\u04b6\3\2\2\2\u04b9\u04ba\3\2\2\2\u04ba"+
		"\33\3\2\2\2\u04bb\u04bc\7\u008e\2\2\u04bc\u04bd\7\u012c\2\2\u04bd\35\3"+
		"\2\2\2\u04be\u04c0\5.\30\2\u04bf\u04be\3\2\2\2\u04bf\u04c0\3\2\2\2\u04c0"+
		"\u04c1\3\2\2\2\u04c1\u04c2\5P)\2\u04c2\u04c3\5L\'\2\u04c3\37\3\2\2\2\u04c4"+
		"\u04c5\7z\2\2\u04c5\u04c7\7\u00b3\2\2\u04c6\u04c8\7\u00ef\2\2\u04c7\u04c6"+
		"\3\2\2\2\u04c7\u04c8\3\2\2\2\u04c8\u04c9\3\2\2\2\u04c9\u04d0\5\u00aaV"+
		"\2\u04ca\u04ce\5$\23\2\u04cb\u04cc\7q\2\2\u04cc\u04cd\7\u00a3\2\2\u04cd"+
		"\u04cf\7U\2\2\u04ce\u04cb\3\2\2\2\u04ce\u04cf\3\2\2\2\u04cf\u04d1\3\2"+
		"\2\2\u04d0\u04ca\3\2\2\2\u04d0\u04d1\3\2\2\2\u04d1\u04fc\3\2\2\2\u04d2"+
		"\u04d3\7z\2\2\u04d3\u04d5\7}\2\2\u04d4\u04d6\7\u00ef\2\2\u04d5\u04d4\3"+
		"\2\2\2\u04d5\u04d6\3\2\2\2\u04d6\u04d7\3\2\2\2\u04d7\u04d9\5\u00aaV\2"+
		"\u04d8\u04da\5$\23\2\u04d9\u04d8\3\2\2\2\u04d9\u04da\3\2\2\2\u04da\u04de"+
		"\3\2\2\2\u04db\u04dc\7q\2\2\u04dc\u04dd\7\u00a3\2\2\u04dd\u04df\7U\2\2"+
		"\u04de\u04db\3\2\2\2\u04de\u04df\3\2\2\2\u04df\u04fc\3\2\2\2\u04e0\u04e1"+
		"\7z\2\2\u04e1\u04e3\7\u00b3\2\2\u04e2\u04e4\7\u008d\2\2\u04e3\u04e2\3"+
		"\2\2\2\u04e3\u04e4\3\2\2\2\u04e4\u04e5\3\2\2\2\u04e5\u04e6\7K\2\2\u04e6"+
		"\u04e8\7\u012c\2\2\u04e7\u04e9\5\u00a6T\2\u04e8\u04e7\3\2\2\2\u04e8\u04e9"+
		"\3\2\2\2\u04e9\u04eb\3\2\2\2\u04ea\u04ec\5B\"\2\u04eb\u04ea\3\2\2\2\u04eb"+
		"\u04ec\3\2\2\2\u04ec\u04fc\3\2\2\2\u04ed\u04ee\7z\2\2\u04ee\u04f0\7\u00b3"+
		"\2\2\u04ef\u04f1\7\u008d\2\2\u04f0\u04ef\3\2\2\2\u04f0\u04f1\3\2\2\2\u04f1"+
		"\u04f2\3\2\2\2\u04f2\u04f4\7K\2\2\u04f3\u04f5\7\u012c\2\2\u04f4\u04f3"+
		"\3\2\2\2\u04f4\u04f5\3\2\2\2\u04f5\u04f6\3\2\2\2\u04f6\u04f9\5\62\32\2"+
		"\u04f7\u04f8\7\u00aa\2\2\u04f8\u04fa\5\66\34\2\u04f9\u04f7\3\2\2\2\u04f9"+
		"\u04fa\3\2\2\2\u04fa\u04fc\3\2\2\2\u04fb\u04c4\3\2\2\2\u04fb\u04d2\3\2"+
		"\2\2\u04fb\u04e0\3\2\2\2\u04fb\u04ed\3\2\2\2\u04fc!\3\2\2\2\u04fd\u04ff"+
		"\5$\23\2\u04fe\u0500\5\34\17\2\u04ff\u04fe\3\2\2\2\u04ff\u0500\3\2\2\2"+
		"\u0500#\3\2\2\2\u0501\u0502\7\u00b4\2\2\u0502\u0503\7\3\2\2\u0503\u0508"+
		"\5&\24\2\u0504\u0505\7\5\2\2\u0505\u0507\5&\24\2\u0506\u0504\3\2\2\2\u0507"+
		"\u050a\3\2\2\2\u0508\u0506\3\2\2\2\u0508\u0509\3\2\2\2\u0509\u050b\3\2"+
		"\2\2\u050a\u0508\3\2\2\2\u050b\u050c\7\4\2\2\u050c%\3\2\2\2\u050d\u0510"+
		"\5\u0108\u0085\2\u050e\u050f\7\u0119\2\2\u050f\u0511\5\u00caf\2\u0510"+
		"\u050e\3\2\2\2\u0510\u0511\3\2\2\2\u0511\'\3\2\2\2\u0512\u0513\t\r\2\2"+
		"\u0513)\3\2\2\2\u0514\u051a\5\u0102\u0082\2\u0515\u051a\7\u012c\2\2\u0516"+
		"\u051a\5\u00ccg\2\u0517\u051a\5\u00ceh\2\u0518\u051a\5\u00d0i\2\u0519"+
		"\u0514\3\2\2\2\u0519\u0515\3\2\2\2\u0519\u0516\3\2\2\2\u0519\u0517\3\2"+
		"\2\2\u0519\u0518\3\2\2\2\u051a+\3\2\2\2\u051b\u0520\5\u0108\u0085\2\u051c"+
		"\u051d\7\6\2\2\u051d\u051f\5\u0108\u0085\2\u051e\u051c\3\2\2\2\u051f\u0522"+
		"\3\2\2\2\u0520\u051e\3\2\2\2\u0520\u0521\3\2\2\2\u0521-\3\2\2\2\u0522"+
		"\u0520\3\2\2\2\u0523\u0524\7\u0113\2\2\u0524\u0529\5\60\31\2\u0525\u0526"+
		"\7\5\2\2\u0526\u0528\5\60\31\2\u0527\u0525\3\2\2\2\u0528\u052b\3\2\2\2"+
		"\u0529\u0527\3\2\2\2\u0529\u052a\3\2\2\2\u052a/\3\2\2\2\u052b\u0529\3"+
		"\2\2\2\u052c\u052e\5\u0104\u0083\2\u052d\u052f\5\u0092J\2\u052e\u052d"+
		"\3\2\2\2\u052e\u052f\3\2\2\2\u052f\u0531\3\2\2\2\u0530\u0532\7\27\2\2"+
		"\u0531\u0530\3\2\2\2\u0531\u0532\3\2\2\2\u0532\u0533\3\2\2\2\u0533\u0534"+
		"\7\3\2\2\u0534\u0535\5\36\20\2\u0535\u0536\7\4\2\2\u0536\61\3\2\2\2\u0537"+
		"\u0538\7\u010b\2\2\u0538\u0539\5\u00aaV\2\u0539\63\3\2\2\2\u053a\u053b"+
		"\7\u00aa\2\2\u053b\u0546\5\66\34\2\u053c\u053d\7\u00b5\2\2\u053d\u053e"+
		"\7\37\2\2\u053e\u0546\5\u00b4[\2\u053f\u0546\5\30\r\2\u0540\u0546\5\34"+
		"\17\2\u0541\u0542\7.\2\2\u0542\u0546\7\u012c\2\2\u0543\u0544\7\u00f2\2"+
		"\2\u0544\u0546\5\66\34\2\u0545\u053a\3\2\2\2\u0545\u053c\3\2\2\2\u0545"+
		"\u053f\3\2\2\2\u0545\u0540\3\2\2\2\u0545\u0541\3\2\2\2\u0545\u0543\3\2"+
		"\2\2\u0546\u0549\3\2\2\2\u0547\u0545\3\2\2\2\u0547\u0548\3\2\2\2\u0548"+
		"\65\3\2\2\2\u0549\u0547\3\2\2\2\u054a\u054b\7\3\2\2\u054b\u0550\58\35"+
		"\2\u054c\u054d\7\5\2\2\u054d\u054f\58\35\2\u054e\u054c\3\2\2\2\u054f\u0552"+
		"\3\2\2\2\u0550\u054e\3\2\2\2\u0550\u0551\3\2\2\2\u0551\u0553\3\2\2\2\u0552"+
		"\u0550\3\2\2\2\u0553\u0554\7\4\2\2\u0554\67\3\2\2\2\u0555\u055a\5:\36"+
		"\2\u0556\u0558\7\u0119\2\2\u0557\u0556\3\2\2\2\u0557\u0558\3\2\2\2\u0558"+
		"\u0559\3\2\2\2\u0559\u055b\5<\37\2\u055a\u0557\3\2\2\2\u055a\u055b\3\2"+
		"\2\2\u055b9\3\2\2\2\u055c\u0561\5\u0108\u0085\2\u055d\u055e\7\6\2\2\u055e"+
		"\u0560\5\u0108\u0085\2\u055f\u055d\3\2\2\2\u0560\u0563\3\2\2\2\u0561\u055f"+
		"\3\2\2\2\u0561\u0562\3\2\2\2\u0562\u0566\3\2\2\2\u0563\u0561\3\2\2\2\u0564"+
		"\u0566\7\u012c\2\2\u0565\u055c\3\2\2\2\u0565\u0564\3\2\2\2\u0566;\3\2"+
		"\2\2\u0567\u056c\7\u0130\2\2\u0568\u056c\7\u0132\2\2\u0569\u056c\5\u00d2"+
		"j\2\u056a\u056c\7\u012c\2\2\u056b\u0567\3\2\2\2\u056b\u0568\3\2\2\2\u056b"+
		"\u0569\3\2\2\2\u056b\u056a\3\2\2\2\u056c=\3\2\2\2\u056d\u056e\7\3\2\2"+
		"\u056e\u0573\5\u00caf\2\u056f\u0570\7\5\2\2\u0570\u0572\5\u00caf\2\u0571"+
		"\u056f\3\2\2\2\u0572\u0575\3\2\2\2\u0573\u0571\3\2\2\2\u0573\u0574\3\2"+
		"\2\2\u0574\u0576\3\2\2\2\u0575\u0573\3\2\2\2\u0576\u0577\7\4\2\2\u0577"+
		"?\3\2\2\2\u0578\u0579\7\3\2\2\u0579\u057e\5> \2\u057a\u057b\7\5\2\2\u057b"+
		"\u057d\5> \2\u057c\u057a\3\2\2\2\u057d\u0580\3\2\2\2\u057e\u057c\3\2\2"+
		"\2\u057e\u057f\3\2\2\2\u057f\u0581\3\2\2\2\u0580\u057e\3\2\2\2\u0581\u0582"+
		"\7\4\2\2\u0582A\3\2\2\2\u0583\u0584\7\u00ea\2\2\u0584\u0585\7\27\2\2\u0585"+
		"\u058a\5D#\2\u0586\u0587\7\u00ea\2\2\u0587\u0588\7\37\2\2\u0588\u058a"+
		"\5F$\2\u0589\u0583\3\2\2\2\u0589\u0586\3\2\2\2\u058aC\3\2\2\2\u058b\u058c"+
		"\7y\2\2\u058c\u058d\7\u012c\2\2\u058d\u058e\7\u00af\2\2\u058e\u0591\7"+
		"\u012c\2\2\u058f\u0591\5\u0108\u0085\2\u0590\u058b\3\2\2\2\u0590\u058f"+
		"\3\2\2\2\u0591E\3\2\2\2\u0592\u0596\7\u012c\2\2\u0593\u0594\7\u0113\2"+
		"\2\u0594\u0595\7\u00de\2\2\u0595\u0597\5\66\34\2\u0596\u0593\3\2\2\2\u0596"+
		"\u0597\3\2\2\2\u0597G\3\2\2\2\u0598\u0599\5\u0108\u0085\2\u0599\u059a"+
		"\7\u012c\2\2\u059aI\3\2\2\2\u059b\u059c\5 \21\2\u059c\u059d\5P)\2\u059d"+
		"\u059e\5L\'\2\u059e\u05cf\3\2\2\2\u059f\u05a1\5v<\2\u05a0\u05a2\5N(\2"+
		"\u05a1\u05a0\3\2\2\2\u05a2\u05a3\3\2\2\2\u05a3\u05a1\3\2\2\2\u05a3\u05a4"+
		"\3\2\2\2\u05a4\u05cf\3\2\2\2\u05a5\u05a6\7E\2\2\u05a6\u05a7\7f\2\2\u05a7"+
		"\u05a8\5\u00aaV\2\u05a8\u05aa\5\u00a4S\2\u05a9\u05ab\5n8\2\u05aa\u05a9"+
		"\3\2\2\2\u05aa\u05ab\3\2\2\2\u05ab\u05cf\3\2\2\2\u05ac\u05ad\7\u0108\2"+
		"\2\u05ad\u05ae\5\u00aaV\2\u05ae\u05af\5\u00a4S\2\u05af\u05b1\5`\61\2\u05b0"+
		"\u05b2\5n8\2\u05b1\u05b0\3\2\2\2\u05b1\u05b2\3\2\2\2\u05b2\u05cf\3\2\2"+
		"\2\u05b3\u05b4\7\u0095\2\2\u05b4\u05b5\7}\2\2\u05b5\u05b6\5\u00aaV\2\u05b6"+
		"\u05b7\5\u00a4S\2\u05b7\u05bd\7\u010b\2\2\u05b8\u05be\5\u00aaV\2\u05b9"+
		"\u05ba\7\3\2\2\u05ba\u05bb\5\36\20\2\u05bb\u05bc\7\4\2\2\u05bc\u05be\3"+
		"\2\2\2\u05bd\u05b8\3\2\2\2\u05bd\u05b9\3\2\2\2\u05be\u05bf\3\2\2\2\u05bf"+
		"\u05c0\5\u00a4S\2\u05c0\u05c1\7\u00a7\2\2\u05c1\u05c5\5\u00bc_\2\u05c2"+
		"\u05c4\5b\62\2\u05c3\u05c2\3\2\2\2\u05c4\u05c7\3\2\2\2\u05c5\u05c3\3\2"+
		"\2\2\u05c5\u05c6\3\2\2\2\u05c6\u05cb\3\2\2\2\u05c7\u05c5\3\2\2\2\u05c8"+
		"\u05ca\5d\63\2\u05c9\u05c8\3\2\2\2\u05ca\u05cd\3\2\2\2\u05cb\u05c9\3\2"+
		"\2\2\u05cb\u05cc\3\2\2\2\u05cc\u05cf\3\2\2\2\u05cd\u05cb\3\2\2\2\u05ce"+
		"\u059b\3\2\2\2\u05ce\u059f\3\2\2\2\u05ce\u05a5\3\2\2\2\u05ce\u05ac\3\2"+
		"\2\2\u05ce\u05b3\3\2\2\2\u05cfK\3\2\2\2\u05d0\u05d1\7\u00ac\2\2\u05d1"+
		"\u05d2\7\37\2\2\u05d2\u05d7\5T+\2\u05d3\u05d4\7\5\2\2\u05d4\u05d6\5T+"+
		"\2\u05d5\u05d3\3\2\2\2\u05d6\u05d9\3\2\2\2\u05d7\u05d5\3\2\2\2\u05d7\u05d8"+
		"\3\2\2\2\u05d8\u05db\3\2\2\2\u05d9\u05d7\3\2\2\2\u05da\u05d0\3\2\2\2\u05da"+
		"\u05db\3\2\2\2\u05db\u05e6\3\2\2\2\u05dc\u05dd\7\'\2\2\u05dd\u05de\7\37"+
		"\2\2\u05de\u05e3\5\u00ba^\2\u05df\u05e0\7\5\2\2\u05e0\u05e2\5\u00ba^\2"+
		"\u05e1\u05df\3\2\2\2\u05e2\u05e5\3\2\2\2\u05e3\u05e1\3\2\2\2\u05e3\u05e4"+
		"\3\2\2\2\u05e4\u05e7\3\2\2\2\u05e5\u05e3\3\2\2\2\u05e6\u05dc\3\2\2\2\u05e6"+
		"\u05e7\3\2\2\2\u05e7\u05f2\3\2\2\2\u05e8\u05e9\7M\2\2\u05e9\u05ea\7\37"+
		"\2\2\u05ea\u05ef\5\u00ba^\2\u05eb\u05ec\7\5\2\2\u05ec\u05ee\5\u00ba^\2"+
		"\u05ed\u05eb\3\2\2\2\u05ee\u05f1\3\2\2\2\u05ef\u05ed\3\2\2\2\u05ef\u05f0"+
		"\3\2\2\2\u05f0\u05f3\3\2\2\2\u05f1\u05ef\3\2\2\2\u05f2\u05e8\3\2\2\2\u05f2"+
		"\u05f3\3\2\2\2\u05f3\u05fe\3\2\2\2\u05f4\u05f5\7\u00e6\2\2\u05f5\u05f6"+
		"\7\37\2\2\u05f6\u05fb\5T+\2\u05f7\u05f8\7\5\2\2\u05f8\u05fa\5T+\2\u05f9"+
		"\u05f7\3\2\2\2\u05fa\u05fd\3\2\2\2\u05fb\u05f9\3\2\2\2\u05fb\u05fc\3\2"+
		"\2\2\u05fc\u05ff\3\2\2\2\u05fd\u05fb\3\2\2\2\u05fe\u05f4\3\2\2\2\u05fe"+
		"\u05ff\3\2\2\2\u05ff\u0601\3\2\2\2\u0600\u0602\5\u00f4{\2\u0601\u0600"+
		"\3\2\2\2\u0601\u0602\3\2\2\2\u0602\u0608\3\2\2\2\u0603\u0606\7\u0089\2"+
		"\2\u0604\u0607\7\17\2\2\u0605\u0607\5\u00ba^\2\u0606\u0604\3\2\2\2\u0606"+
		"\u0605\3\2\2\2\u0607\u0609\3\2\2\2\u0608\u0603\3\2\2\2\u0608\u0609\3\2"+
		"\2\2\u0609M\3\2\2\2\u060a\u060b\5 \21\2\u060b\u060c\5X-\2\u060cO\3\2\2"+
		"\2\u060d\u060e\b)\1\2\u060e\u060f\5R*\2\u060f\u0627\3\2\2\2\u0610\u0611"+
		"\f\5\2\2\u0611\u0612\6)\5\2\u0612\u0614\t\16\2\2\u0613\u0615\5\u0084C"+
		"\2\u0614\u0613\3\2\2\2\u0614\u0615\3\2\2\2\u0615\u0616\3\2\2\2\u0616\u0626"+
		"\5P)\6\u0617\u0618\f\4\2\2\u0618\u0619\6)\7\2\u0619\u061b\7{\2\2\u061a"+
		"\u061c\5\u0084C\2\u061b\u061a\3\2\2\2\u061b\u061c\3\2\2\2\u061c\u061d"+
		"\3\2\2\2\u061d\u0626\5P)\5\u061e\u061f\f\3\2\2\u061f\u0620\6)\t\2\u0620"+
		"\u0622\t\17\2\2\u0621\u0623\5\u0084C\2\u0622\u0621\3\2\2\2\u0622\u0623"+
		"\3\2\2\2\u0623\u0624\3\2\2\2\u0624\u0626\5P)\4\u0625\u0610\3\2\2\2\u0625"+
		"\u0617\3\2\2\2\u0625\u061e\3\2\2\2\u0626\u0629\3\2\2\2\u0627\u0625\3\2"+
		"\2\2\u0627\u0628\3\2\2\2\u0628Q\3\2\2\2\u0629\u0627\3\2\2\2\u062a\u0634"+
		"\5Z.\2\u062b\u0634\5V,\2\u062c\u062d\7\u00ef\2\2\u062d\u0634\5\u00aaV"+
		"\2\u062e\u0634\5\u00a0Q\2\u062f\u0630\7\3\2\2\u0630\u0631\5\36\20\2\u0631"+
		"\u0632\7\4\2\2\u0632\u0634\3\2\2\2\u0633\u062a\3\2\2\2\u0633\u062b\3\2"+
		"\2\2\u0633\u062c\3\2\2\2\u0633\u062e\3\2\2\2\u0633\u062f\3\2\2\2\u0634"+
		"S\3\2\2\2\u0635\u0637\5\u00ba^\2\u0636\u0638\t\20\2\2\u0637\u0636\3\2"+
		"\2\2\u0637\u0638\3\2\2\2\u0638\u063b\3\2\2\2\u0639\u063a\7\u00a5\2\2\u063a"+
		"\u063c\t\21\2\2\u063b\u0639\3\2\2\2\u063b\u063c\3\2\2\2\u063cU\3\2\2\2"+
		"\u063d\u063f\5v<\2\u063e\u0640\5X-\2\u063f\u063e\3\2\2\2\u0640\u0641\3"+
		"\2\2\2\u0641\u063f\3\2\2\2\u0641\u0642\3\2\2\2\u0642W\3\2\2\2\u0643\u0645"+
		"\5\\/\2\u0644\u0646\5n8\2\u0645\u0644\3\2\2\2\u0645\u0646\3\2\2\2\u0646"+
		"\u0647\3\2\2\2\u0647\u0648\5L\'\2\u0648\u065f\3\2\2\2\u0649\u064d\5^\60"+
		"\2\u064a\u064c\5\u0082B\2\u064b\u064a\3\2\2\2\u064c\u064f\3\2\2\2\u064d"+
		"\u064b\3\2\2\2\u064d\u064e\3\2\2\2\u064e\u0651\3\2\2\2\u064f\u064d\3\2"+
		"\2\2\u0650\u0652\5n8\2\u0651\u0650\3\2\2\2\u0651\u0652\3\2\2\2\u0652\u0654"+
		"\3\2\2\2\u0653\u0655\5x=\2\u0654\u0653\3\2\2\2\u0654\u0655\3\2\2\2\u0655"+
		"\u0657\3\2\2\2\u0656\u0658\5p9\2\u0657\u0656\3\2\2\2\u0657\u0658\3\2\2"+
		"\2\u0658\u065a\3\2\2\2\u0659\u065b\5\u00f4{\2\u065a\u0659\3\2\2\2\u065a"+
		"\u065b\3\2\2\2\u065b\u065c\3\2\2\2\u065c\u065d\5L\'\2\u065d\u065f\3\2"+
		"\2\2\u065e\u0643\3\2\2\2\u065e\u0649\3\2\2\2\u065fY\3\2\2\2\u0660\u0662"+
		"\5\\/\2\u0661\u0663\5v<\2\u0662\u0661\3\2\2\2\u0662\u0663\3\2\2\2\u0663"+
		"\u0665\3\2\2\2\u0664\u0666\5n8\2\u0665\u0664\3\2\2\2\u0665\u0666\3\2\2"+
		"\2\u0666\u067e\3\2\2\2\u0667\u0669\5^\60\2\u0668\u066a\5v<\2\u0669\u0668"+
		"\3\2\2\2\u0669\u066a\3\2\2\2\u066a\u066e\3\2\2\2\u066b\u066d\5\u0082B"+
		"\2\u066c\u066b\3\2\2\2\u066d\u0670\3\2\2\2\u066e\u066c\3\2\2\2\u066e\u066f"+
		"\3\2\2\2\u066f\u0672\3\2\2\2\u0670\u066e\3\2\2\2\u0671\u0673\5n8\2\u0672"+
		"\u0671\3\2\2\2\u0672\u0673\3\2\2\2\u0673\u0675\3\2\2\2\u0674\u0676\5x"+
		"=\2\u0675\u0674\3\2\2\2\u0675\u0676\3\2\2\2\u0676\u0678\3\2\2\2\u0677"+
		"\u0679\5p9\2\u0678\u0677\3\2\2\2\u0678\u0679\3\2\2\2\u0679\u067b\3\2\2"+
		"\2\u067a\u067c\5\u00f4{\2\u067b\u067a\3\2\2\2\u067b\u067c\3\2\2\2\u067c"+
		"\u067e\3\2\2\2\u067d\u0660\3\2\2\2\u067d\u0667\3\2\2\2\u067e[\3\2\2\2"+
		"\u067f\u0680\7\u00da\2\2\u0680\u0681\7\u00fb\2\2\u0681\u0682\7\3\2\2\u0682"+
		"\u0683\5\u00b2Z\2\u0683\u0684\7\4\2\2\u0684\u068a\3\2\2\2\u0685\u0686"+
		"\7\u0093\2\2\u0686\u068a\5\u00b2Z\2\u0687\u0688\7\u00c5\2\2\u0688\u068a"+
		"\5\u00b2Z\2\u0689\u067f\3\2\2\2\u0689\u0685\3\2\2\2\u0689\u0687\3\2\2"+
		"\2\u068a\u068c\3\2\2\2\u068b\u068d\5\u00a6T\2\u068c\u068b\3\2\2\2\u068c"+
		"\u068d\3\2\2\2\u068d\u0690\3\2\2\2\u068e\u068f\7\u00c3\2\2\u068f\u0691"+
		"\7\u012c\2\2\u0690\u068e\3\2\2\2\u0690\u0691\3\2\2\2\u0691\u0692\3\2\2"+
		"\2\u0692\u0693\7\u010b\2\2\u0693\u06a0\7\u012c\2\2\u0694\u069e\7\27\2"+
		"\2\u0695\u069f\5\u0094K\2\u0696\u069f\5\u00eav\2\u0697\u069a\7\3\2\2\u0698"+
		"\u069b\5\u0094K\2\u0699\u069b\5\u00eav\2\u069a\u0698\3\2\2\2\u069a\u0699"+
		"\3\2\2\2\u069b\u069c\3\2\2\2\u069c\u069d\7\4\2\2\u069d\u069f\3\2\2\2\u069e"+
		"\u0695\3\2\2\2\u069e\u0696\3\2\2\2\u069e\u0697\3\2\2\2\u069f\u06a1\3\2"+
		"\2\2\u06a0\u0694\3\2\2\2\u06a0\u06a1\3\2\2\2\u06a1\u06a3\3\2\2\2\u06a2"+
		"\u06a4\5\u00a6T\2\u06a3\u06a2\3\2\2\2\u06a3\u06a4\3\2\2\2\u06a4\u06a7"+
		"\3\2\2\2\u06a5\u06a6\7\u00c2\2\2\u06a6\u06a8\7\u012c\2\2\u06a7\u06a5\3"+
		"\2\2\2\u06a7\u06a8\3\2\2\2\u06a8]\3\2\2\2\u06a9\u06ad\7\u00da\2\2\u06aa"+
		"\u06ac\5r:\2\u06ab\u06aa\3\2\2\2\u06ac\u06af\3\2\2\2\u06ad\u06ab\3\2\2"+
		"\2\u06ad\u06ae\3\2\2\2\u06ae\u06b1\3\2\2\2\u06af\u06ad\3\2\2\2\u06b0\u06b2"+
		"\5\u0084C\2\u06b1\u06b0\3\2\2\2\u06b1\u06b2\3\2\2\2\u06b2\u06b3\3\2\2"+
		"\2\u06b3\u06b4\5\u00b2Z\2\u06b4_\3\2\2\2\u06b5\u06b6\7\u00e0\2\2\u06b6"+
		"\u06b7\5j\66\2\u06b7a\3\2\2\2\u06b8\u06b9\7\u0110\2\2\u06b9\u06bc\7\u0094"+
		"\2\2\u06ba\u06bb\7\22\2\2\u06bb\u06bd\5\u00bc_\2\u06bc\u06ba\3\2\2\2\u06bc"+
		"\u06bd\3\2\2\2\u06bd\u06be\3\2\2\2\u06be\u06bf\7\u00f5\2\2\u06bf\u06c0"+
		"\5f\64\2\u06c0c\3\2\2\2\u06c1\u06c2\7\u0110\2\2\u06c2\u06c3\7\u00a3\2"+
		"\2\u06c3\u06c6\7\u0094\2\2\u06c4\u06c5\7\22\2\2\u06c5\u06c7\5\u00bc_\2"+
		"\u06c6\u06c4\3\2\2\2\u06c6\u06c7\3\2\2\2\u06c7\u06c8\3\2\2\2\u06c8\u06c9"+
		"\7\u00f5\2\2\u06c9\u06ca\5h\65\2\u06cae\3\2\2\2\u06cb\u06d3\7E\2\2\u06cc"+
		"\u06cd\7\u0108\2\2\u06cd\u06ce\7\u00e0\2\2\u06ce\u06d3\7\u0123\2\2\u06cf"+
		"\u06d0\7\u0108\2\2\u06d0\u06d1\7\u00e0\2\2\u06d1\u06d3\5j\66\2\u06d2\u06cb"+
		"\3\2\2\2\u06d2\u06cc\3\2\2\2\u06d2\u06cf\3\2\2\2\u06d3g\3\2\2\2\u06d4"+
		"\u06d5\7z\2\2\u06d5\u06e7\7\u0123\2\2\u06d6\u06d7\7z\2\2\u06d7\u06d8\7"+
		"\3\2\2\u06d8\u06d9\5\u00a8U\2\u06d9\u06da\7\4\2\2\u06da\u06db\7\u010c"+
		"\2\2\u06db\u06dc\7\3\2\2\u06dc\u06e1\5\u00ba^\2\u06dd\u06de\7\5\2\2\u06de"+
		"\u06e0\5\u00ba^\2\u06df\u06dd\3\2\2\2\u06e0\u06e3\3\2\2\2\u06e1\u06df"+
		"\3\2\2\2\u06e1\u06e2\3\2\2\2\u06e2\u06e4\3\2\2\2\u06e3\u06e1\3\2\2\2\u06e4"+
		"\u06e5\7\4\2\2\u06e5\u06e7\3\2\2\2\u06e6\u06d4\3\2\2\2\u06e6\u06d6\3\2"+
		"\2\2\u06e7i\3\2\2\2\u06e8\u06ed\5l\67\2\u06e9\u06ea\7\5\2\2\u06ea\u06ec"+
		"\5l\67\2\u06eb\u06e9\3\2\2\2\u06ec\u06ef\3\2\2\2\u06ed\u06eb\3\2\2\2\u06ed"+
		"\u06ee\3\2\2\2\u06eek\3\2\2\2\u06ef\u06ed\3\2\2\2\u06f0\u06f1\5\u00aa"+
		"V\2\u06f1\u06f2\7\u0119\2\2\u06f2\u06f3\5\u00ba^\2\u06f3m\3\2\2\2\u06f4"+
		"\u06f5\7\u0111\2\2\u06f5\u06f6\5\u00bc_\2\u06f6o\3\2\2\2\u06f7\u06f8\7"+
		"n\2\2\u06f8\u06f9\5\u00bc_\2\u06f9q\3\2\2\2\u06fa\u06fb\7\7\2\2\u06fb"+
		"\u0702\5t;\2\u06fc\u06fe\7\5\2\2\u06fd\u06fc\3\2\2\2\u06fd\u06fe\3\2\2"+
		"\2\u06fe\u06ff\3\2\2\2\u06ff\u0701\5t;\2\u0700\u06fd\3\2\2\2\u0701\u0704"+
		"\3\2\2\2\u0702\u0700\3\2\2\2\u0702\u0703\3\2\2\2\u0703\u0705\3\2\2\2\u0704"+
		"\u0702\3\2\2\2\u0705\u0706\7\b\2\2\u0706s\3\2\2\2\u0707\u0715\5\u0108"+
		"\u0085\2\u0708\u0709\5\u0108\u0085\2\u0709\u070a\7\3\2\2\u070a\u070f\5"+
		"\u00c8e\2\u070b\u070c\7\5\2\2\u070c\u070e\5\u00c8e\2\u070d\u070b\3\2\2"+
		"\2\u070e\u0711\3\2\2\2\u070f\u070d\3\2\2\2\u070f\u0710\3\2\2\2\u0710\u0712"+
		"\3\2\2\2\u0711\u070f\3\2\2\2\u0712\u0713\7\4\2\2\u0713\u0715\3\2\2\2\u0714"+
		"\u0707\3\2\2\2\u0714\u0708\3\2\2\2\u0715u\3\2\2\2\u0716\u0717\7f\2\2\u0717"+
		"\u071c\5\u0086D\2\u0718\u0719\7\5\2\2\u0719\u071b\5\u0086D\2\u071a\u0718"+
		"\3\2\2\2\u071b\u071e\3\2\2\2\u071c\u071a\3\2\2\2\u071c\u071d\3\2\2\2\u071d"+
		"\u0722\3\2\2\2\u071e\u071c\3\2\2\2\u071f\u0721\5\u0082B\2\u0720\u071f"+
		"\3\2\2\2\u0721\u0724\3\2\2\2\u0722\u0720\3\2\2\2\u0722\u0723\3\2\2\2\u0723"+
		"\u0726\3\2\2\2\u0724\u0722\3\2\2\2\u0725\u0727\5|?\2\u0726\u0725\3\2\2"+
		"\2\u0726\u0727\3\2\2\2\u0727w\3\2\2\2\u0728\u0729\7l\2\2\u0729\u072a\7"+
		"\37\2\2\u072a\u072f\5\u00ba^\2\u072b\u072c\7\5\2\2\u072c\u072e\5\u00ba"+
		"^\2\u072d\u072b\3\2\2\2\u072e\u0731\3\2\2\2\u072f\u072d\3\2\2\2\u072f"+
		"\u0730\3\2\2\2\u0730\u0743\3\2\2\2\u0731\u072f\3\2\2\2\u0732\u0733\7\u0113"+
		"\2\2\u0733\u0744\7\u00d4\2\2\u0734\u0735\7\u0113\2\2\u0735\u0744\78\2"+
		"\2\u0736\u0737\7m\2\2\u0737\u0738\7\u00e2\2\2\u0738\u0739\7\3\2\2\u0739"+
		"\u073e\5z>\2\u073a\u073b\7\5\2\2\u073b\u073d\5z>\2\u073c\u073a\3\2\2\2"+
		"\u073d\u0740\3\2\2\2\u073e\u073c\3\2\2\2\u073e\u073f\3\2\2\2\u073f\u0741"+
		"\3\2\2\2\u0740\u073e\3\2\2\2\u0741\u0742\7\4\2\2\u0742\u0744\3\2\2\2\u0743"+
		"\u0732\3\2\2\2\u0743\u0734\3\2\2\2\u0743\u0736\3\2\2\2\u0743\u0744\3\2"+
		"\2\2\u0744\u0755\3\2\2\2\u0745\u0746\7l\2\2\u0746\u0747\7\37\2\2\u0747"+
		"\u0748\7m\2\2\u0748\u0749\7\u00e2\2\2\u0749\u074a\7\3\2\2\u074a\u074f"+
		"\5z>\2\u074b\u074c\7\5\2\2\u074c\u074e\5z>\2\u074d\u074b\3\2\2\2\u074e"+
		"\u0751\3\2\2\2\u074f\u074d\3\2\2\2\u074f\u0750\3\2\2\2\u0750\u0752\3\2"+
		"\2\2\u0751\u074f\3\2\2\2\u0752\u0753\7\4\2\2\u0753\u0755\3\2\2\2\u0754"+
		"\u0728\3\2\2\2\u0754\u0745\3\2\2\2\u0755y\3\2\2\2\u0756\u075f\7\3\2\2"+
		"\u0757\u075c\5\u00ba^\2\u0758\u0759\7\5\2\2\u0759\u075b\5\u00ba^\2\u075a"+
		"\u0758\3\2\2\2\u075b\u075e\3\2\2\2\u075c\u075a\3\2\2\2\u075c\u075d\3\2"+
		"\2\2\u075d\u0760\3\2\2\2\u075e\u075c\3\2\2\2\u075f\u0757\3\2\2\2\u075f"+
		"\u0760\3\2\2\2\u0760\u0761\3\2\2\2\u0761\u0764\7\4\2\2\u0762\u0764\5\u00ba"+
		"^\2\u0763\u0756\3\2\2\2\u0763\u0762\3\2\2\2\u0764{\3\2\2\2\u0765\u0766"+
		"\7\u00b8\2\2\u0766\u0767\7\3\2\2\u0767\u0768\5\u00b2Z\2\u0768\u0769\7"+
		"b\2\2\u0769\u076a\5~@\2\u076a\u076b\7t\2\2\u076b\u076c\7\3\2\2\u076c\u0771"+
		"\5\u0080A\2\u076d\u076e\7\5\2\2\u076e\u0770\5\u0080A\2\u076f\u076d\3\2"+
		"\2\2\u0770\u0773\3\2\2\2\u0771\u076f\3\2\2\2\u0771\u0772\3\2\2\2\u0772"+
		"\u0774\3\2\2\2\u0773\u0771\3\2\2\2\u0774\u0775\7\4\2\2\u0775\u0776\7\4"+
		"\2\2\u0776}\3\2\2\2\u0777\u0784\5\u0108\u0085\2\u0778\u0779\7\3\2\2\u0779"+
		"\u077e\5\u0108\u0085\2\u077a\u077b\7\5\2\2\u077b\u077d\5\u0108\u0085\2"+
		"\u077c\u077a\3\2\2\2\u077d\u0780\3\2\2\2\u077e\u077c\3\2\2\2\u077e\u077f"+
		"\3\2\2\2\u077f\u0781\3\2\2\2\u0780\u077e\3\2\2\2\u0781\u0782\7\4\2\2\u0782"+
		"\u0784\3\2\2\2\u0783\u0777\3\2\2\2\u0783\u0778\3\2\2\2\u0784\177\3\2\2"+
		"\2\u0785\u078a\5\u00ba^\2\u0786\u0788\7\27\2\2\u0787\u0786\3\2\2\2\u0787"+
		"\u0788\3\2\2\2\u0788\u0789\3\2\2\2\u0789\u078b\5\u0108\u0085\2\u078a\u0787"+
		"\3\2\2\2\u078a\u078b\3\2\2\2\u078b\u0081\3\2\2\2\u078c\u078d\7\u0084\2"+
		"\2\u078d\u078f\7\u010d\2\2\u078e\u0790\7\u00ae\2\2\u078f\u078e\3\2\2\2"+
		"\u078f\u0790\3\2\2\2\u0790\u0791\3\2\2\2\u0791\u0792\5\u0102\u0082\2\u0792"+
		"\u079b\7\3\2\2\u0793\u0798\5\u00ba^\2\u0794\u0795\7\5\2\2\u0795\u0797"+
		"\5\u00ba^\2\u0796\u0794\3\2\2\2\u0797\u079a\3\2\2\2\u0798\u0796\3\2\2"+
		"\2\u0798\u0799\3\2\2\2\u0799\u079c\3\2\2\2\u079a\u0798\3\2\2\2\u079b\u0793"+
		"\3\2\2\2\u079b\u079c\3\2\2\2\u079c\u079d\3\2\2\2\u079d\u079e\7\4\2\2\u079e"+
		"\u07aa\5\u0108\u0085\2\u079f\u07a1\7\27\2\2\u07a0\u079f\3\2\2\2\u07a0"+
		"\u07a1\3\2\2\2\u07a1\u07a2\3\2\2\2\u07a2\u07a7\5\u0108\u0085\2\u07a3\u07a4"+
		"\7\5\2\2\u07a4\u07a6\5\u0108\u0085\2\u07a5\u07a3\3\2\2\2\u07a6\u07a9\3"+
		"\2\2\2\u07a7\u07a5\3\2\2\2\u07a7\u07a8\3\2\2\2\u07a8\u07ab\3\2\2\2\u07a9"+
		"\u07a7\3\2\2\2\u07aa\u07a0\3\2\2\2\u07aa\u07ab\3\2\2\2\u07ab\u0083\3\2"+
		"\2\2\u07ac\u07ad\t\22\2\2\u07ad\u0085\3\2\2\2\u07ae\u07b2\5\u009eP\2\u07af"+
		"\u07b1\5\u0088E\2\u07b0\u07af\3\2\2\2\u07b1\u07b4\3\2\2\2\u07b2\u07b0"+
		"\3\2\2\2\u07b2\u07b3\3\2\2\2\u07b3\u0087\3\2\2\2\u07b4\u07b2\3\2\2\2\u07b5"+
		"\u07b6\5\u008aF\2\u07b6\u07b7\7\u0080\2\2\u07b7\u07b9\5\u009eP\2\u07b8"+
		"\u07ba\5\u008cG\2\u07b9\u07b8\3\2\2\2\u07b9\u07ba\3\2\2\2\u07ba\u07c1"+
		"\3\2\2\2\u07bb\u07bc\7\u00a1\2\2\u07bc\u07bd\5\u008aF\2\u07bd\u07be\7"+
		"\u0080\2\2\u07be\u07bf\5\u009eP\2\u07bf\u07c1\3\2\2\2\u07c0\u07b5\3\2"+
		"\2\2\u07c0\u07bb\3\2\2\2\u07c1\u0089\3\2\2\2\u07c2\u07c4\7w\2\2\u07c3"+
		"\u07c2\3\2\2\2\u07c3\u07c4\3\2\2\2\u07c4\u07dc\3\2\2\2\u07c5\u07dc\7\67"+
		"\2\2\u07c6\u07c8\7\u0087\2\2\u07c7\u07c9\7\u00ae\2\2\u07c8\u07c7\3\2\2"+
		"\2\u07c8\u07c9\3\2\2\2\u07c9\u07dc\3\2\2\2\u07ca\u07cc\7\u0087\2\2\u07cb"+
		"\u07ca\3\2\2\2\u07cb\u07cc\3\2\2\2\u07cc\u07cd\3\2\2\2\u07cd\u07dc\7\u00db"+
		"\2\2\u07ce\u07d0\7\u00cf\2\2\u07cf\u07d1\7\u00ae\2\2\u07d0\u07cf\3\2\2"+
		"\2\u07d0\u07d1\3\2\2\2\u07d1\u07dc\3\2\2\2\u07d2\u07d4\7g\2\2\u07d3\u07d5"+
		"\7\u00ae\2\2\u07d4\u07d3\3\2\2\2\u07d4\u07d5\3\2\2\2\u07d5\u07dc\3\2\2"+
		"\2\u07d6\u07d8\7\u0087\2\2\u07d7\u07d6\3\2\2\2\u07d7\u07d8\3\2\2\2\u07d8"+
		"\u07d9\3\2\2\2\u07d9\u07dc\7\23\2\2\u07da\u07dc\7\u0116\2\2\u07db\u07c3"+
		"\3\2\2\2\u07db\u07c5\3\2\2\2\u07db\u07c6\3\2\2\2\u07db\u07cb\3\2\2\2\u07db"+
		"\u07ce\3\2\2\2\u07db\u07d2\3\2\2\2\u07db\u07d7\3\2\2\2\u07db\u07da\3\2"+
		"\2\2\u07dc\u008b\3\2\2\2\u07dd\u07de\7\u00a7\2\2\u07de\u07f2\5\u00bc_"+
		"\2\u07df\u07ed\7\u010b\2\2\u07e0\u07e1\7\3\2\2\u07e1\u07e6\5\u0108\u0085"+
		"\2\u07e2\u07e3\7\5\2\2\u07e3\u07e5\5\u0108\u0085\2\u07e4\u07e2\3\2\2\2"+
		"\u07e5\u07e8\3\2\2\2\u07e6\u07e4\3\2\2\2\u07e6\u07e7\3\2\2\2\u07e7\u07e9"+
		"\3\2\2\2\u07e8\u07e6\3\2\2\2\u07e9\u07ea\7\4\2\2\u07ea\u07ee\3\2\2\2\u07eb"+
		"\u07ec\7\u0117\2\2\u07ec\u07ee\5\u00bc_\2\u07ed\u07e0\3\2\2\2\u07ed\u07eb"+
		"\3\2\2\2\u07ee\u07f2\3\2\2\2\u07ef\u07f0\7\u010b\2\2\u07f0\u07f2\5\u0092"+
		"J\2\u07f1\u07dd\3\2\2\2\u07f1\u07df\3\2\2\2\u07f1\u07ef\3\2\2\2\u07f2"+
		"\u008d\3\2\2\2\u07f3\u07f4\7\u00f1\2\2\u07f4\u07f6\7\3\2\2\u07f5\u07f7"+
		"\5\u0090I\2\u07f6\u07f5\3\2\2\2\u07f6\u07f7\3\2\2\2\u07f7\u07f8\3\2\2"+
		"\2\u07f8\u07f9\7\4\2\2\u07f9\u008f\3\2\2\2\u07fa\u07fc\7\u0122\2\2\u07fb"+
		"\u07fa\3\2\2\2\u07fb\u07fc\3\2\2\2\u07fc\u07fd\3\2\2\2\u07fd\u07fe\t\23"+
		"\2\2\u07fe\u0813\7\u00b7\2\2\u07ff\u0800\5\u00ba^\2\u0800\u0801\7\u00d6"+
		"\2\2\u0801\u0813\3\2\2\2\u0802\u0803\7\35\2\2\u0803\u0804\7\u0130\2\2"+
		"\u0804\u0805\7\u00ad\2\2\u0805\u0806\7\u00a6\2\2\u0806\u080f\7\u0130\2"+
		"\2\u0807\u080d\7\u00a7\2\2\u0808\u080e\5\u0108\u0085\2\u0809\u080a\5\u0102"+
		"\u0082\2\u080a\u080b\7\3\2\2\u080b\u080c\7\4\2\2\u080c\u080e\3\2\2\2\u080d"+
		"\u0808\3\2\2\2\u080d\u0809\3\2\2\2\u080e\u0810\3\2\2\2\u080f\u0807\3\2"+
		"\2\2\u080f\u0810\3\2\2\2\u0810\u0813\3\2\2\2\u0811\u0813\5\u00ba^\2\u0812"+
		"\u07fb\3\2\2\2\u0812\u07ff\3\2\2\2\u0812\u0802\3\2\2\2\u0812\u0811\3\2"+
		"\2\2\u0813\u0091\3\2\2\2\u0814\u0815\7\3\2\2\u0815\u0816\5\u0094K\2\u0816"+
		"\u0817\7\4\2\2\u0817\u0093\3\2\2\2\u0818\u081d\5\u0104\u0083\2\u0819\u081a"+
		"\7\5\2\2\u081a\u081c\5\u0104\u0083\2\u081b\u0819\3\2\2\2\u081c\u081f\3"+
		"\2\2\2\u081d\u081b\3\2\2\2\u081d\u081e\3\2\2\2\u081e\u0095\3\2\2\2\u081f"+
		"\u081d\3\2\2\2\u0820\u0821\7\3\2\2\u0821\u0826\5\u0098M\2\u0822\u0823"+
		"\7\5\2\2\u0823\u0825\5\u0098M\2\u0824\u0822\3\2\2\2\u0825\u0828\3\2\2"+
		"\2\u0826\u0824\3\2\2\2\u0826\u0827\3\2\2\2\u0827\u0829\3\2\2\2\u0828\u0826"+
		"\3\2\2\2\u0829\u082a\7\4\2\2\u082a\u0097\3\2\2\2\u082b\u082d\5\u0104\u0083"+
		"\2\u082c\u082e\t\20\2\2\u082d\u082c\3\2\2\2\u082d\u082e\3\2\2\2\u082e"+
		"\u0099\3\2\2\2\u082f\u0830\7\3\2\2\u0830\u0835\5\u009cO\2\u0831\u0832"+
		"\7\5\2\2\u0832\u0834\5\u009cO\2\u0833\u0831\3\2\2\2\u0834\u0837\3\2\2"+
		"\2\u0835\u0833\3\2\2\2\u0835\u0836\3\2\2\2\u0836\u0838\3\2\2\2\u0837\u0835"+
		"\3\2\2\2\u0838\u0839\7\4\2\2\u0839\u009b\3\2\2\2\u083a\u083d\5\u0108\u0085"+
		"\2\u083b\u083c\7.\2\2\u083c\u083e\7\u012c\2\2\u083d\u083b\3\2\2\2\u083d"+
		"\u083e\3\2\2\2\u083e\u009d\3\2\2\2\u083f\u0841\5\u00aaV\2\u0840\u0842"+
		"\5\u008eH\2\u0841\u0840\3\2\2\2\u0841\u0842\3\2\2\2\u0842\u0843\3\2\2"+
		"\2\u0843\u0844\5\u00a4S\2\u0844\u0858\3\2\2\2\u0845\u0846\7\3\2\2\u0846"+
		"\u0847\5\36\20\2\u0847\u0849\7\4\2\2\u0848\u084a\5\u008eH\2\u0849\u0848"+
		"\3\2\2\2\u0849\u084a\3\2\2\2\u084a\u084b\3\2\2\2\u084b\u084c\5\u00a4S"+
		"\2\u084c\u0858\3\2\2\2\u084d\u084e\7\3\2\2\u084e\u084f\5\u0086D\2\u084f"+
		"\u0851\7\4\2\2\u0850\u0852\5\u008eH\2\u0851\u0850\3\2\2\2\u0851\u0852"+
		"\3\2\2\2\u0852\u0853\3\2\2\2\u0853\u0854\5\u00a4S\2\u0854\u0858\3\2\2"+
		"\2\u0855\u0858\5\u00a0Q\2\u0856\u0858\5\u00a2R\2\u0857\u083f\3\2\2\2\u0857"+
		"\u0845\3\2\2\2\u0857\u084d\3\2\2\2\u0857\u0855\3\2\2\2\u0857\u0856\3\2"+
		"\2\2\u0858\u009f\3\2\2\2\u0859\u085a\7\u010c\2\2\u085a\u085f\5\u00ba^"+
		"\2\u085b\u085c\7\5\2\2\u085c\u085e\5\u00ba^\2\u085d\u085b\3\2\2\2\u085e"+
		"\u0861\3\2\2\2\u085f\u085d\3\2\2\2\u085f\u0860\3\2\2\2\u0860\u0862\3\2"+
		"\2\2\u0861\u085f\3\2\2\2\u0862\u0863\5\u00a4S\2\u0863\u00a1\3\2\2\2\u0864"+
		"\u0865\5\u0104\u0083\2\u0865\u086e\7\3\2\2\u0866\u086b\5\u00ba^\2\u0867"+
		"\u0868\7\5\2\2\u0868\u086a\5\u00ba^\2\u0869\u0867\3\2\2\2\u086a\u086d"+
		"\3\2\2\2\u086b\u0869\3\2\2\2\u086b\u086c\3\2\2\2\u086c\u086f\3\2\2\2\u086d"+
		"\u086b\3\2\2\2\u086e\u0866\3\2\2\2\u086e\u086f\3\2\2\2\u086f\u0870\3\2"+
		"\2\2\u0870\u0871\7\4\2\2\u0871\u0872\5\u00a4S\2\u0872\u00a3\3\2\2\2\u0873"+
		"\u0875\7\27\2\2\u0874\u0873\3\2\2\2\u0874\u0875\3\2\2\2\u0875\u0876\3"+
		"\2\2\2\u0876\u0878\5\u010a\u0086\2\u0877\u0879\5\u0092J\2\u0878\u0877"+
		"\3\2\2\2\u0878\u0879\3\2\2\2\u0879\u087b\3\2\2\2\u087a\u0874\3\2\2\2\u087a"+
		"\u087b\3\2\2\2\u087b\u00a5\3\2\2\2\u087c\u087d\7\u00d5\2\2\u087d\u087e"+
		"\7d\2\2\u087e\u087f\7\u00dd\2\2\u087f\u0883\7\u012c\2\2\u0880\u0881\7"+
		"\u0113\2\2\u0881\u0882\7\u00de\2\2\u0882\u0884\5\66\34\2\u0883\u0880\3"+
		"\2\2\2\u0883\u0884\3\2\2\2\u0884\u08ae\3\2\2\2\u0885\u0886";
	private static final String _serializedATNSegment1 =
		"\7\u00d5\2\2\u0886\u0887\7d\2\2\u0887\u0891\7F\2\2\u0888\u0889\7]\2\2"+
		"\u0889\u088a\7\u00f4\2\2\u088a\u088b\7\37\2\2\u088b\u088f\7\u012c\2\2"+
		"\u088c\u088d\7R\2\2\u088d\u088e\7\37\2\2\u088e\u0890\7\u012c\2\2\u088f"+
		"\u088c\3\2\2\2\u088f\u0890\3\2\2\2\u0890\u0892\3\2\2\2\u0891\u0888\3\2"+
		"\2\2\u0891\u0892\3\2\2\2\u0892\u0898\3\2\2\2\u0893\u0894\7+\2\2\u0894"+
		"\u0895\7\177\2\2\u0895\u0896\7\u00f4\2\2\u0896\u0897\7\37\2\2\u0897\u0899"+
		"\7\u012c\2\2\u0898\u0893\3\2\2\2\u0898\u0899\3\2\2\2\u0899\u089f\3\2\2"+
		"\2\u089a\u089b\7\u0093\2\2\u089b\u089c\7\u0081\2\2\u089c\u089d\7\u00f4"+
		"\2\2\u089d\u089e\7\37\2\2\u089e\u08a0\7\u012c\2\2\u089f\u089a\3\2\2\2"+
		"\u089f\u08a0\3\2\2\2\u08a0\u08a5\3\2\2\2\u08a1\u08a2\7\u008a\2\2\u08a2"+
		"\u08a3\7\u00f4\2\2\u08a3\u08a4\7\37\2\2\u08a4\u08a6\7\u012c\2\2\u08a5"+
		"\u08a1\3\2\2\2\u08a5\u08a6\3\2\2\2\u08a6\u08ab\3\2\2\2\u08a7\u08a8\7\u00a4"+
		"\2\2\u08a8\u08a9\7D\2\2\u08a9\u08aa\7\27\2\2\u08aa\u08ac\7\u012c\2\2\u08ab"+
		"\u08a7\3\2\2\2\u08ab\u08ac\3\2\2\2\u08ac\u08ae\3\2\2\2\u08ad\u087c\3\2"+
		"\2\2\u08ad\u0885\3\2\2\2\u08ae\u00a7\3\2\2\2\u08af\u08b4\5\u00aaV\2\u08b0"+
		"\u08b1\7\5\2\2\u08b1\u08b3\5\u00aaV\2\u08b2\u08b0\3\2\2\2\u08b3\u08b6"+
		"\3\2\2\2\u08b4\u08b2\3\2\2\2\u08b4\u08b5\3\2\2\2\u08b5\u00a9\3\2\2\2\u08b6"+
		"\u08b4\3\2\2\2\u08b7\u08bc\5\u0104\u0083\2\u08b8\u08b9\7\6\2\2\u08b9\u08bb"+
		"\5\u0104\u0083\2\u08ba\u08b8\3\2\2\2\u08bb\u08be\3\2\2\2\u08bc\u08ba\3"+
		"\2\2\2\u08bc\u08bd\3\2\2\2\u08bd\u00ab\3\2\2\2\u08be\u08bc\3\2\2\2\u08bf"+
		"\u08c0\5\u0104\u0083\2\u08c0\u08c1\7\6\2\2\u08c1\u08c3\3\2\2\2\u08c2\u08bf"+
		"\3\2\2\2\u08c2\u08c3\3\2\2\2\u08c3\u08c4\3\2\2\2\u08c4\u08c5\5\u0104\u0083"+
		"\2\u08c5\u00ad\3\2\2\2\u08c6\u08c7\5\u0104\u0083\2\u08c7\u08c8\7\6\2\2"+
		"\u08c8\u08ca\3\2\2\2\u08c9\u08c6\3\2\2\2\u08c9\u08ca\3\2\2\2\u08ca\u08cb"+
		"\3\2\2\2\u08cb\u08cc\5\u0104\u0083\2\u08cc\u00af\3\2\2\2\u08cd\u08d5\5"+
		"\u00ba^\2\u08ce\u08d0\7\27\2\2\u08cf\u08ce\3\2\2\2\u08cf\u08d0\3\2\2\2"+
		"\u08d0\u08d3\3\2\2\2\u08d1\u08d4\5\u0104\u0083\2\u08d2\u08d4\5\u0092J"+
		"\2\u08d3\u08d1\3\2\2\2\u08d3\u08d2\3\2\2\2\u08d4\u08d6\3\2\2\2\u08d5\u08cf"+
		"\3\2\2\2\u08d5\u08d6\3\2\2\2\u08d6\u00b1\3\2\2\2\u08d7\u08dc\5\u00b0Y"+
		"\2\u08d8\u08d9\7\5\2\2\u08d9\u08db\5\u00b0Y\2\u08da\u08d8\3\2\2\2\u08db"+
		"\u08de\3\2\2\2\u08dc\u08da\3\2\2\2\u08dc\u08dd\3\2\2\2\u08dd\u00b3\3\2"+
		"\2\2\u08de\u08dc\3\2\2\2\u08df\u08e0\7\3\2\2\u08e0\u08e5\5\u00b6\\\2\u08e1"+
		"\u08e2\7\5\2\2\u08e2\u08e4\5\u00b6\\\2\u08e3\u08e1\3\2\2\2\u08e4\u08e7"+
		"\3\2\2\2\u08e5\u08e3\3\2\2\2\u08e5\u08e6\3\2\2\2\u08e6\u08e8\3\2\2\2\u08e7"+
		"\u08e5\3\2\2\2\u08e8\u08e9\7\4\2\2\u08e9\u00b5\3\2\2\2\u08ea\u08f8\5\u0102"+
		"\u0082\2\u08eb\u08ec\5\u0108\u0085\2\u08ec\u08ed\7\3\2\2\u08ed\u08f2\5"+
		"\u00b8]\2\u08ee\u08ef\7\5\2\2\u08ef\u08f1\5\u00b8]\2\u08f0\u08ee\3\2\2"+
		"\2\u08f1\u08f4\3\2\2\2\u08f2\u08f0\3\2\2\2\u08f2\u08f3\3\2\2\2\u08f3\u08f5"+
		"\3\2\2\2\u08f4\u08f2\3\2\2\2\u08f5\u08f6\7\4\2\2\u08f6\u08f8\3\2\2\2\u08f7"+
		"\u08ea\3\2\2\2\u08f7\u08eb\3\2\2\2\u08f8\u00b7\3\2\2\2\u08f9\u08fc\5\u0102"+
		"\u0082\2\u08fa\u08fc\5\u00caf\2\u08fb\u08f9\3\2\2\2\u08fb\u08fa\3\2\2"+
		"\2\u08fc\u00b9\3\2\2\2\u08fd\u08fe\5\u00bc_\2\u08fe\u00bb\3\2\2\2\u08ff"+
		"\u0900\b_\1\2\u0900\u0901\7\u00a3\2\2\u0901\u090c\5\u00bc_\7\u0902\u0903"+
		"\7U\2\2\u0903\u0904\7\3\2\2\u0904\u0905\5\36\20\2\u0905\u0906\7\4\2\2"+
		"\u0906\u090c\3\2\2\2\u0907\u0909\5\u00c6d\2\u0908\u090a\5\u00be`\2\u0909"+
		"\u0908\3\2\2\2\u0909\u090a\3\2\2\2\u090a\u090c\3\2\2\2\u090b\u08ff\3\2"+
		"\2\2\u090b\u0902\3\2\2\2\u090b\u0907\3\2\2\2\u090c\u0915\3\2\2\2\u090d"+
		"\u090e\f\4\2\2\u090e\u090f\7\22\2\2\u090f\u0914\5\u00bc_\5\u0910\u0911"+
		"\f\3\2\2\u0911\u0912\7\u00ab\2\2\u0912\u0914\5\u00bc_\4\u0913\u090d\3"+
		"\2\2\2\u0913\u0910\3\2\2\2\u0914\u0917\3\2\2\2\u0915\u0913\3\2\2\2\u0915"+
		"\u0916\3\2\2\2\u0916\u00bd\3\2\2\2\u0917\u0915\3\2\2\2\u0918\u091a\7\u00a3"+
		"\2\2\u0919\u0918\3\2\2\2\u0919\u091a\3\2\2\2\u091a\u091b\3\2\2\2\u091b"+
		"\u091c\7\33\2\2\u091c\u091d\5\u00c6d\2\u091d\u091e\7\22\2\2\u091e\u091f"+
		"\5\u00c6d\2\u091f\u0957\3\2\2\2\u0920\u0922\7\u00a3\2\2\u0921\u0920\3"+
		"\2\2\2\u0921\u0922\3\2\2\2\u0922\u0923\3\2\2\2\u0923\u0924\7t\2\2\u0924"+
		"\u0925\7\3\2\2\u0925\u092a\5\u00ba^\2\u0926\u0927\7\5\2\2\u0927\u0929"+
		"\5\u00ba^\2\u0928\u0926\3\2\2\2\u0929\u092c\3\2\2\2\u092a\u0928\3\2\2"+
		"\2\u092a\u092b\3\2\2\2\u092b\u092d\3\2\2\2\u092c\u092a\3\2\2\2\u092d\u092e"+
		"\7\4\2\2\u092e\u0957\3\2\2\2\u092f\u0931\7\u00a3\2\2\u0930\u092f\3\2\2"+
		"\2\u0930\u0931\3\2\2\2\u0931\u0932\3\2\2\2\u0932\u0933\7t\2\2\u0933\u0934"+
		"\7\3\2\2\u0934\u0935\5\36\20\2\u0935\u0936\7\4\2\2\u0936\u0957\3\2\2\2"+
		"\u0937\u0939\7\u00a3\2\2\u0938\u0937\3\2\2\2\u0938\u0939\3\2\2\2\u0939"+
		"\u093a\3\2\2\2\u093a\u093b\7\u00d0\2\2\u093b\u0957\5\u00c6d\2\u093c\u093e"+
		"\7\u00a3\2\2\u093d\u093c\3\2\2\2\u093d\u093e\3\2\2\2\u093e\u093f\3\2\2"+
		"\2\u093f\u0940\7\u0088\2\2\u0940\u0943\5\u00c6d\2\u0941\u0942\7Q\2\2\u0942"+
		"\u0944\7\u012c\2\2\u0943\u0941\3\2\2\2\u0943\u0944\3\2\2\2\u0944\u0957"+
		"\3\2\2\2\u0945\u0947\7~\2\2\u0946\u0948\7\u00a3\2\2\u0947\u0946\3\2\2"+
		"\2\u0947\u0948\3\2\2\2\u0948\u0949\3\2\2\2\u0949\u0957\7\u00a4\2\2\u094a"+
		"\u094c\7~\2\2\u094b\u094d\7\u00a3\2\2\u094c\u094b\3\2\2\2\u094c\u094d"+
		"\3\2\2\2\u094d\u094e\3\2\2\2\u094e\u0957\t\24\2\2\u094f\u0951\7~\2\2\u0950"+
		"\u0952\7\u00a3\2\2\u0951\u0950\3\2\2\2\u0951\u0952\3\2\2\2\u0952\u0953"+
		"\3\2\2\2\u0953\u0954\7L\2\2\u0954\u0955\7f\2\2\u0955\u0957\5\u00c6d\2"+
		"\u0956\u0919\3\2\2\2\u0956\u0921\3\2\2\2\u0956\u0930\3\2\2\2\u0956\u0938"+
		"\3\2\2\2\u0956\u093d\3\2\2\2\u0956\u0945\3\2\2\2\u0956\u094a\3\2\2\2\u0956"+
		"\u094f\3\2\2\2\u0957\u00bf\3\2\2\2\u0958\u0959\7\3\2\2\u0959\u095e\5\u00ba"+
		"^\2\u095a\u095b\7\5\2\2\u095b\u095d\5\u00ba^\2\u095c\u095a\3\2\2\2\u095d"+
		"\u0960\3\2\2\2\u095e\u095c\3\2\2\2\u095e\u095f\3\2\2\2\u095f\u0961\3\2"+
		"\2\2\u0960\u095e\3\2\2\2\u0961\u0962\7\4\2\2\u0962\u00c1\3\2\2\2\u0963"+
		"\u0964\7\3\2\2\u0964\u0969\5\u00ba^\2\u0965\u0966\7\5\2\2\u0966\u0968"+
		"\5\u00ba^\2\u0967\u0965\3\2\2\2\u0968\u096b\3\2\2\2\u0969\u0967\3\2\2"+
		"\2\u0969\u096a\3\2\2\2\u096a\u096c\3\2\2\2\u096b\u0969\3\2\2\2\u096c\u096d"+
		"\7\4\2\2\u096d\u00c3\3\2\2\2\u096e\u096f\5\u00c0a\2\u096f\u0970\7\u0118"+
		"\2\2\u0970\u0971\7\3\2\2\u0971\u0972\7\u0117\2\2\u0972\u0973\5\u00c2b"+
		"\2\u0973\u0974\7\5\2\2\u0974\u0975\5\u00c6d\2\u0975\u0976\7\4\2\2\u0976"+
		"\u00c5\3\2\2\2\u0977\u0978\bd\1\2\u0978\u097c\5\u00c8e\2\u0979\u097a\t"+
		"\25\2\2\u097a\u097c\5\u00c6d\t\u097b\u0977\3\2\2\2\u097b\u0979\3\2\2\2"+
		"\u097c\u0992\3\2\2\2\u097d\u097e\f\b\2\2\u097e\u097f\t\26\2\2\u097f\u0991"+
		"\5\u00c6d\t\u0980\u0981\f\7\2\2\u0981\u0982\t\27\2\2\u0982\u0991\5\u00c6"+
		"d\b\u0983\u0984\f\6\2\2\u0984\u0985\7\u0128\2\2\u0985\u0991\5\u00c6d\7"+
		"\u0986\u0987\f\5\2\2\u0987\u0988\7\u012b\2\2\u0988\u0991\5\u00c6d\6\u0989"+
		"\u098a\f\4\2\2\u098a\u098b\7\u0129\2\2\u098b\u0991\5\u00c6d\5\u098c\u098d"+
		"\f\3\2\2\u098d\u098e\5\u00ccg\2\u098e\u098f\5\u00c6d\4\u098f\u0991\3\2"+
		"\2\2\u0990\u097d\3\2\2\2\u0990\u0980\3\2\2\2\u0990\u0983\3\2\2\2\u0990"+
		"\u0986\3\2\2\2\u0990\u0989\3\2\2\2\u0990\u098c\3\2\2\2\u0991\u0994\3\2"+
		"\2\2\u0992\u0990\3\2\2\2\u0992\u0993\3\2\2\2\u0993\u00c7\3\2\2\2\u0994"+
		"\u0992\3\2\2\2\u0995\u0996\be\1\2\u0996\u0a46\t\30\2\2\u0997\u0999\7\""+
		"\2\2\u0998\u099a\5\u00f2z\2\u0999\u0998\3\2\2\2\u099a\u099b\3\2\2\2\u099b"+
		"\u0999\3\2\2\2\u099b\u099c\3\2\2\2\u099c\u099f\3\2\2\2\u099d\u099e\7O"+
		"\2\2\u099e\u09a0\5\u00ba^\2\u099f\u099d\3\2\2\2\u099f\u09a0\3\2\2\2\u09a0"+
		"\u09a1\3\2\2\2\u09a1\u09a2\7P\2\2\u09a2\u0a46\3\2\2\2\u09a3\u09a4\7\""+
		"\2\2\u09a4\u09a6\5\u00ba^\2\u09a5\u09a7\5\u00f2z\2\u09a6\u09a5\3\2\2\2"+
		"\u09a7\u09a8\3\2\2\2\u09a8\u09a6\3\2\2\2\u09a8\u09a9\3\2\2\2\u09a9\u09ac"+
		"\3\2\2\2\u09aa\u09ab\7O\2\2\u09ab\u09ad\5\u00ba^\2\u09ac\u09aa\3\2\2\2"+
		"\u09ac\u09ad\3\2\2\2\u09ad\u09ae\3\2\2\2\u09ae\u09af\7P\2\2\u09af\u0a46"+
		"\3\2\2\2\u09b0\u09b1\7#\2\2\u09b1\u09b2\7\3\2\2\u09b2\u09b3\5\u00ba^\2"+
		"\u09b3\u09b4\7\27\2\2\u09b4\u09b5\5\u00e4s\2\u09b5\u09b6\7\4\2\2\u09b6"+
		"\u0a46\3\2\2\2\u09b7\u09b8\7\u00ec\2\2\u09b8\u09c1\7\3\2\2\u09b9\u09be"+
		"\5\u00b0Y\2\u09ba\u09bb\7\5\2\2\u09bb\u09bd\5\u00b0Y\2\u09bc\u09ba\3\2"+
		"\2\2\u09bd\u09c0\3\2\2\2\u09be\u09bc\3\2\2\2\u09be\u09bf\3\2\2\2\u09bf"+
		"\u09c2\3\2\2\2\u09c0\u09be\3\2\2\2\u09c1\u09b9\3\2\2\2\u09c1\u09c2\3\2"+
		"\2\2\u09c2\u09c3\3\2\2\2\u09c3\u0a46\7\4\2\2\u09c4\u09c5\t\31\2\2\u09c5"+
		"\u09c6\7\3\2\2\u09c6\u09c9\5\u00ba^\2\u09c7\u09c8\t\32\2\2\u09c8\u09ca"+
		"\7\u00a5\2\2\u09c9\u09c7\3\2\2\2\u09c9\u09ca\3\2\2\2\u09ca\u09cb\3\2\2"+
		"\2\u09cb\u09cc\7\4\2\2\u09cc\u0a46\3\2\2\2\u09cd\u09ce\t\33\2\2\u09ce"+
		"\u09cf\7\3\2\2\u09cf\u09d2\5\u00ba^\2\u09d0\u09d1\t\32\2\2\u09d1\u09d3"+
		"\7\u00a5\2\2\u09d2\u09d0\3\2\2\2\u09d2\u09d3\3\2\2\2\u09d3\u09d4\3\2\2"+
		"\2\u09d4\u09d5\7\4\2\2\u09d5\u0a46\3\2\2\2\u09d6\u09d7\7\u00ba\2\2\u09d7"+
		"\u09d8\7\3\2\2\u09d8\u09d9\5\u00c6d\2\u09d9\u09da\7t\2\2\u09da\u09db\5"+
		"\u00c6d\2\u09db\u09dc\7\4\2\2\u09dc\u0a46\3\2\2\2\u09dd\u0a46\5\u00ca"+
		"f\2\u09de\u0a46\7\u0123\2\2\u09df\u09e0\5\u0102\u0082\2\u09e0\u09e1\7"+
		"\6\2\2\u09e1\u09e2\7\u0123\2\2\u09e2\u0a46\3\2\2\2\u09e3\u09e4\7\3\2\2"+
		"\u09e4\u09e7\5\u00b0Y\2\u09e5\u09e6\7\5\2\2\u09e6\u09e8\5\u00b0Y\2\u09e7"+
		"\u09e5\3\2\2\2\u09e8\u09e9\3\2\2\2\u09e9\u09e7\3\2\2\2\u09e9\u09ea\3\2"+
		"\2\2\u09ea\u09eb\3\2\2\2\u09eb\u09ec\7\4\2\2\u09ec\u0a46\3\2\2\2\u09ed"+
		"\u09ee\7\3\2\2\u09ee\u09ef\5\36\20\2\u09ef\u09f0\7\4\2\2\u09f0\u0a46\3"+
		"\2\2\2\u09f1\u09f2\5\u0100\u0081\2\u09f2\u09fe\7\3\2\2\u09f3\u09f5\5\u0084"+
		"C\2\u09f4\u09f3\3\2\2\2\u09f4\u09f5\3\2\2\2\u09f5\u09f6\3\2\2\2\u09f6"+
		"\u09fb\5\u00ba^\2\u09f7\u09f8\7\5\2\2\u09f8\u09fa\5\u00ba^\2\u09f9\u09f7"+
		"\3\2\2\2\u09fa\u09fd\3\2\2\2\u09fb\u09f9\3\2\2\2\u09fb\u09fc\3\2\2\2\u09fc"+
		"\u09ff\3\2\2\2\u09fd\u09fb\3\2\2\2\u09fe\u09f4\3\2\2\2\u09fe\u09ff\3\2"+
		"\2\2\u09ff\u0a00\3\2\2\2\u0a00\u0a03\7\4\2\2\u0a01\u0a02\7\u00b0\2\2\u0a02"+
		"\u0a04\5\u00f8}\2\u0a03\u0a01\3\2\2\2\u0a03\u0a04\3\2\2\2\u0a04\u0a46"+
		"\3\2\2\2\u0a05\u0a06\5\u0108\u0085\2\u0a06\u0a07\7\t\2\2\u0a07\u0a08\5"+
		"\u00ba^\2\u0a08\u0a46\3\2\2\2\u0a09\u0a0a\7\3\2\2\u0a0a\u0a0d\5\u0108"+
		"\u0085\2\u0a0b\u0a0c\7\5\2\2\u0a0c\u0a0e\5\u0108\u0085\2\u0a0d\u0a0b\3"+
		"\2\2\2\u0a0e\u0a0f\3\2\2\2\u0a0f\u0a0d\3\2\2\2\u0a0f\u0a10\3\2\2\2\u0a10"+
		"\u0a11\3\2\2\2\u0a11\u0a12\7\4\2\2\u0a12\u0a13\7\t\2\2\u0a13\u0a14\5\u00ba"+
		"^\2\u0a14\u0a46\3\2\2\2\u0a15\u0a46\5\u0108\u0085\2\u0a16\u0a17\7\3\2"+
		"\2\u0a17\u0a18\5\u00ba^\2\u0a18\u0a19\7\4\2\2\u0a19\u0a46\3\2\2\2\u0a1a"+
		"\u0a1b\7Z\2\2\u0a1b\u0a1c\7\3\2\2\u0a1c\u0a1d\5\u0108\u0085\2\u0a1d\u0a1e"+
		"\7f\2\2\u0a1e\u0a1f\5\u00c6d\2\u0a1f\u0a20\7\4\2\2\u0a20\u0a46\3\2\2\2"+
		"\u0a21\u0a22\t\34\2\2\u0a22\u0a23\7\3\2\2\u0a23\u0a24\5\u00c6d\2\u0a24"+
		"\u0a25\t\35\2\2\u0a25\u0a28\5\u00c6d\2\u0a26\u0a27\t\36\2\2\u0a27\u0a29"+
		"\5\u00c6d\2\u0a28\u0a26\3\2\2\2\u0a28\u0a29\3\2\2\2\u0a29\u0a2a\3\2\2"+
		"\2\u0a2a\u0a2b\7\4\2\2\u0a2b\u0a46\3\2\2\2\u0a2c\u0a2d\7\u00fc\2\2\u0a2d"+
		"\u0a2f\7\3\2\2\u0a2e\u0a30\t\37\2\2\u0a2f\u0a2e\3\2\2\2\u0a2f\u0a30\3"+
		"\2\2\2\u0a30\u0a32\3\2\2\2\u0a31\u0a33\5\u00c6d\2\u0a32\u0a31\3\2\2\2"+
		"\u0a32\u0a33\3\2\2\2\u0a33\u0a34\3\2\2\2\u0a34\u0a35\7f\2\2\u0a35\u0a36"+
		"\5\u00c6d\2\u0a36\u0a37\7\4\2\2\u0a37\u0a46\3\2\2\2\u0a38\u0a39\7\u00b2"+
		"\2\2\u0a39\u0a3a\7\3\2\2\u0a3a\u0a3b\5\u00c6d\2\u0a3b\u0a3c\7\u00b9\2"+
		"\2\u0a3c\u0a3d\5\u00c6d\2\u0a3d\u0a3e\7f\2\2\u0a3e\u0a41\5\u00c6d\2\u0a3f"+
		"\u0a40\7b\2\2\u0a40\u0a42\5\u00c6d\2\u0a41\u0a3f\3\2\2\2\u0a41\u0a42\3"+
		"\2\2\2\u0a42\u0a43\3\2\2\2\u0a43\u0a44\7\4\2\2\u0a44\u0a46\3\2\2\2\u0a45"+
		"\u0995\3\2\2\2\u0a45\u0997\3\2\2\2\u0a45\u09a3\3\2\2\2\u0a45\u09b0\3\2"+
		"\2\2\u0a45\u09b7\3\2\2\2\u0a45\u09c4\3\2\2\2\u0a45\u09cd\3\2\2\2\u0a45"+
		"\u09d6\3\2\2\2\u0a45\u09dd\3\2\2\2\u0a45\u09de\3\2\2\2\u0a45\u09df\3\2"+
		"\2\2\u0a45\u09e3\3\2\2\2\u0a45\u09ed\3\2\2\2\u0a45\u09f1\3\2\2\2\u0a45"+
		"\u0a05\3\2\2\2\u0a45\u0a09\3\2\2\2\u0a45\u0a15\3\2\2\2\u0a45\u0a16\3\2"+
		"\2\2\u0a45\u0a1a\3\2\2\2\u0a45\u0a21\3\2\2\2\u0a45\u0a2c\3\2\2\2\u0a45"+
		"\u0a38\3\2\2\2\u0a46\u0a51\3\2\2\2\u0a47\u0a48\f\n\2\2\u0a48\u0a49\7\n"+
		"\2\2\u0a49\u0a4a\5\u00c6d\2\u0a4a\u0a4b\7\13\2\2\u0a4b\u0a50\3\2\2\2\u0a4c"+
		"\u0a4d\f\b\2\2\u0a4d\u0a4e\7\6\2\2\u0a4e\u0a50\5\u0108\u0085\2\u0a4f\u0a47"+
		"\3\2\2\2\u0a4f\u0a4c\3\2\2\2\u0a50\u0a53\3\2\2\2\u0a51\u0a4f\3\2\2\2\u0a51"+
		"\u0a52\3\2\2\2\u0a52\u00c9\3\2\2\2\u0a53\u0a51\3\2\2\2\u0a54\u0a61\7\u00a4"+
		"\2\2\u0a55\u0a61\5\u00d4k\2\u0a56\u0a57\5\u0108\u0085\2\u0a57\u0a58\7"+
		"\u012c\2\2\u0a58\u0a61\3\2\2\2\u0a59\u0a61\5\u010e\u0088\2\u0a5a\u0a61"+
		"\5\u00d2j\2\u0a5b\u0a5d\7\u012c\2\2\u0a5c\u0a5b\3\2\2\2\u0a5d\u0a5e\3"+
		"\2\2\2\u0a5e\u0a5c\3\2\2\2\u0a5e\u0a5f\3\2\2\2\u0a5f\u0a61\3\2\2\2\u0a60"+
		"\u0a54\3\2\2\2\u0a60\u0a55\3\2\2\2\u0a60\u0a56\3\2\2\2\u0a60\u0a59\3\2"+
		"\2\2\u0a60\u0a5a\3\2\2\2\u0a60\u0a5c\3\2\2\2\u0a61\u00cb\3\2\2\2\u0a62"+
		"\u0a63\t \2\2\u0a63\u00cd\3\2\2\2\u0a64\u0a65\t!\2\2\u0a65\u00cf\3\2\2"+
		"\2\u0a66\u0a67\t\"\2\2\u0a67\u00d1\3\2\2\2\u0a68\u0a69\t#\2\2\u0a69\u00d3"+
		"\3\2\2\2\u0a6a\u0a6d\7|\2\2\u0a6b\u0a6e\5\u00d6l\2\u0a6c\u0a6e\5\u00da"+
		"n\2\u0a6d\u0a6b\3\2\2\2\u0a6d\u0a6c\3\2\2\2\u0a6d\u0a6e\3\2\2\2\u0a6e"+
		"\u0a75\3\2\2\2\u0a6f\u0a72\6k\24\2\u0a70\u0a73\5\u00d6l\2\u0a71\u0a73"+
		"\5\u00dan\2\u0a72\u0a70\3\2\2\2\u0a72\u0a71\3\2\2\2\u0a73\u0a75\3\2\2"+
		"\2\u0a74\u0a6a\3\2\2\2\u0a74\u0a6f\3\2\2\2\u0a75\u00d5\3\2\2\2\u0a76\u0a78"+
		"\5\u00d8m\2\u0a77\u0a79\5\u00dco\2\u0a78\u0a77\3\2\2\2\u0a78\u0a79\3\2"+
		"\2\2\u0a79\u00d7\3\2\2\2\u0a7a\u0a7b\5\u00dep\2\u0a7b\u0a7c\5\u00e0q\2"+
		"\u0a7c\u0a7e\3\2\2\2\u0a7d\u0a7a\3\2\2\2\u0a7e\u0a7f\3\2\2\2\u0a7f\u0a7d"+
		"\3\2\2\2\u0a7f\u0a80\3\2\2\2\u0a80\u00d9\3\2\2\2\u0a81\u0a84\5\u00dco"+
		"\2\u0a82\u0a85\5\u00d8m\2\u0a83\u0a85\5\u00dco\2\u0a84\u0a82\3\2\2\2\u0a84"+
		"\u0a83\3\2\2\2\u0a84\u0a85\3\2\2\2\u0a85\u00db\3\2\2\2\u0a86\u0a87\5\u00de"+
		"p\2\u0a87\u0a88\5\u00e0q\2\u0a88\u0a89\7\u00f6\2\2\u0a89\u0a8a\5\u00e0"+
		"q\2\u0a8a\u00dd\3\2\2\2\u0a8b\u0a8d\t$\2\2\u0a8c\u0a8b\3\2\2\2\u0a8c\u0a8d"+
		"\3\2\2\2\u0a8d\u0a8e\3\2\2\2\u0a8e\u0a91\t\23\2\2\u0a8f\u0a91\7\u012c"+
		"\2\2\u0a90\u0a8c\3\2\2\2\u0a90\u0a8f\3\2\2\2\u0a91\u00df\3\2\2\2\u0a92"+
		"\u0a93\t%\2\2\u0a93\u00e1\3\2\2\2\u0a94\u0a98\7_\2\2\u0a95\u0a96\7\16"+
		"\2\2\u0a96\u0a98\5\u0104\u0083\2\u0a97\u0a94\3\2\2\2\u0a97\u0a95\3\2\2"+
		"\2\u0a98\u00e3\3\2\2\2\u0a99\u0a9a\7\26\2\2\u0a9a\u0a9b\7\u011d\2\2\u0a9b"+
		"\u0a9c\5\u00e4s\2\u0a9c\u0a9d\7\u011f\2\2\u0a9d\u0abc\3\2\2\2\u0a9e\u0a9f"+
		"\7\u0093\2\2\u0a9f\u0aa0\7\u011d\2\2\u0aa0\u0aa1\5\u00e4s\2\u0aa1\u0aa2"+
		"\7\5\2\2\u0aa2\u0aa3\5\u00e4s\2\u0aa3\u0aa4\7\u011f\2\2\u0aa4\u0abc\3"+
		"\2\2\2\u0aa5\u0aac\7\u00ec\2\2\u0aa6\u0aa8\7\u011d\2\2\u0aa7\u0aa9\5\u00ee"+
		"x\2\u0aa8\u0aa7\3\2\2\2\u0aa8\u0aa9\3\2\2\2\u0aa9\u0aaa\3\2\2\2\u0aaa"+
		"\u0aad\7\u011f\2\2\u0aab\u0aad\7\u011b\2\2\u0aac\u0aa6\3\2\2\2\u0aac\u0aab"+
		"\3\2\2\2\u0aad\u0abc\3\2\2\2\u0aae\u0ab9\5\u0108\u0085\2\u0aaf\u0ab0\7"+
		"\3\2\2\u0ab0\u0ab5\7\u0130\2\2\u0ab1\u0ab2\7\5\2\2\u0ab2\u0ab4\7\u0130"+
		"\2\2\u0ab3\u0ab1\3\2\2\2\u0ab4\u0ab7\3\2\2\2\u0ab5\u0ab3\3\2\2\2\u0ab5"+
		"\u0ab6\3\2\2\2\u0ab6\u0ab8\3\2\2\2\u0ab7\u0ab5\3\2\2\2\u0ab8\u0aba\7\4"+
		"\2\2\u0ab9\u0aaf\3\2\2\2\u0ab9\u0aba\3\2\2\2\u0aba\u0abc\3\2\2\2\u0abb"+
		"\u0a99\3\2\2\2\u0abb\u0a9e\3\2\2\2\u0abb\u0aa5\3\2\2\2\u0abb\u0aae\3\2"+
		"\2\2\u0abc\u00e5\3\2\2\2\u0abd\u0ac2\5\u00e8u\2\u0abe\u0abf\7\5\2\2\u0abf"+
		"\u0ac1\5\u00e8u\2\u0ac0\u0abe\3\2\2\2\u0ac1\u0ac4\3\2\2\2\u0ac2\u0ac0"+
		"\3\2\2\2\u0ac2\u0ac3\3\2\2\2\u0ac3\u00e7\3\2\2\2\u0ac4\u0ac2\3\2\2\2\u0ac5"+
		"\u0ac6\5\u00aaV\2\u0ac6\u0ac9\5\u00e4s\2\u0ac7\u0ac8\7.\2\2\u0ac8\u0aca"+
		"\7\u012c\2\2\u0ac9\u0ac7\3\2\2\2\u0ac9\u0aca\3\2\2\2\u0aca\u0acc\3\2\2"+
		"\2\u0acb\u0acd\5\u00e2r\2\u0acc\u0acb\3\2\2\2\u0acc\u0acd\3\2\2\2\u0acd"+
		"\u00e9\3\2\2\2\u0ace\u0ad3\5\u00ecw\2\u0acf\u0ad0\7\5\2\2\u0ad0\u0ad2"+
		"\5\u00ecw\2\u0ad1\u0acf\3\2\2\2\u0ad2\u0ad5\3\2\2\2\u0ad3\u0ad1\3\2\2"+
		"\2\u0ad3\u0ad4\3\2\2\2\u0ad4\u00eb\3\2\2\2\u0ad5\u0ad3\3\2\2\2\u0ad6\u0ad7"+
		"\5\u0104\u0083\2\u0ad7\u0ada\5\u00e4s\2\u0ad8\u0ad9\7.\2\2\u0ad9\u0adb"+
		"\7\u012c\2\2\u0ada\u0ad8\3\2\2\2\u0ada\u0adb\3\2\2\2\u0adb\u00ed\3\2\2"+
		"\2\u0adc\u0ae1\5\u00f0y\2\u0add\u0ade\7\5\2\2\u0ade\u0ae0\5\u00f0y\2\u0adf"+
		"\u0add\3\2\2\2\u0ae0\u0ae3\3\2\2\2\u0ae1\u0adf\3\2\2\2\u0ae1\u0ae2\3\2"+
		"\2\2\u0ae2\u00ef\3\2\2\2\u0ae3\u0ae1\3\2\2\2\u0ae4\u0ae5\5\u0108\u0085"+
		"\2\u0ae5\u0ae6\7\f\2\2\u0ae6\u0ae9\5\u00e4s\2\u0ae7\u0ae8\7.\2\2\u0ae8"+
		"\u0aea\7\u012c\2\2\u0ae9\u0ae7\3\2\2\2\u0ae9\u0aea\3\2\2\2\u0aea\u00f1"+
		"\3\2\2\2\u0aeb\u0aec\7\u0110\2\2\u0aec\u0aed\5\u00ba^\2\u0aed\u0aee\7"+
		"\u00f5\2\2\u0aee\u0aef\5\u00ba^\2\u0aef\u00f3\3\2\2\2\u0af0\u0af1\7\u0112"+
		"\2\2\u0af1\u0af6\5\u00f6|\2\u0af2\u0af3\7\5\2\2\u0af3\u0af5\5\u00f6|\2"+
		"\u0af4\u0af2\3\2\2\2\u0af5\u0af8\3\2\2\2\u0af6\u0af4\3\2\2\2\u0af6\u0af7"+
		"\3\2\2\2\u0af7\u00f5\3\2\2\2\u0af8\u0af6\3\2\2\2\u0af9\u0afa\5\u0104\u0083"+
		"\2\u0afa\u0afb\7\27\2\2\u0afb\u0afc\5\u00f8}\2\u0afc\u00f7\3\2\2\2\u0afd"+
		"\u0b2c\5\u0104\u0083\2\u0afe\u0aff\7\3\2\2\u0aff\u0b00\5\u0104\u0083\2"+
		"\u0b00\u0b01\7\4\2\2\u0b01\u0b2c\3\2\2\2\u0b02\u0b25\7\3\2\2\u0b03\u0b04"+
		"\7\'\2\2\u0b04\u0b05\7\37\2\2\u0b05\u0b0a\5\u00ba^\2\u0b06\u0b07\7\5\2"+
		"\2\u0b07\u0b09\5\u00ba^\2\u0b08\u0b06\3\2\2\2\u0b09\u0b0c\3\2\2\2\u0b0a"+
		"\u0b08\3\2\2\2\u0b0a\u0b0b\3\2\2\2\u0b0b\u0b26\3\2\2\2\u0b0c\u0b0a\3\2"+
		"\2\2\u0b0d\u0b0e\t&\2\2\u0b0e\u0b0f\7\37\2\2\u0b0f\u0b14\5\u00ba^\2\u0b10"+
		"\u0b11\7\5\2\2\u0b11\u0b13\5\u00ba^\2\u0b12\u0b10\3\2\2\2\u0b13\u0b16"+
		"\3\2\2\2\u0b14\u0b12\3\2\2\2\u0b14\u0b15\3\2\2\2\u0b15\u0b18\3\2\2\2\u0b16"+
		"\u0b14\3\2\2\2\u0b17\u0b0d\3\2\2\2\u0b17\u0b18\3\2\2\2\u0b18\u0b23\3\2"+
		"\2\2\u0b19\u0b1a\t\'\2\2\u0b1a\u0b1b\7\37\2\2\u0b1b\u0b20\5T+\2\u0b1c"+
		"\u0b1d\7\5\2\2\u0b1d\u0b1f\5T+\2\u0b1e\u0b1c\3\2\2\2\u0b1f\u0b22\3\2\2"+
		"\2\u0b20\u0b1e\3\2\2\2\u0b20\u0b21\3\2\2\2\u0b21\u0b24\3\2\2\2\u0b22\u0b20"+
		"\3\2\2\2\u0b23\u0b19\3\2\2\2\u0b23\u0b24\3\2\2\2\u0b24\u0b26\3\2\2\2\u0b25"+
		"\u0b03\3\2\2\2\u0b25\u0b17\3\2\2\2\u0b26\u0b28\3\2\2\2\u0b27\u0b29\5\u00fa"+
		"~\2\u0b28\u0b27\3\2\2\2\u0b28\u0b29\3\2\2\2\u0b29\u0b2a\3\2\2\2\u0b2a"+
		"\u0b2c\7\4\2\2\u0b2b\u0afd\3\2\2\2\u0b2b\u0afe\3\2\2\2\u0b2b\u0b02\3\2"+
		"\2\2\u0b2c\u00f9\3\2\2\2\u0b2d\u0b2e\7\u00c1\2\2\u0b2e\u0b3e\5\u00fc\177"+
		"\2\u0b2f\u0b30\7\u00d6\2\2\u0b30\u0b3e\5\u00fc\177\2\u0b31\u0b32\7\u00c1"+
		"\2\2\u0b32\u0b33\7\33\2\2\u0b33\u0b34\5\u00fc\177\2\u0b34\u0b35\7\22\2"+
		"\2\u0b35\u0b36\5\u00fc\177\2\u0b36\u0b3e\3\2\2\2\u0b37\u0b38\7\u00d6\2"+
		"\2\u0b38\u0b39\7\33\2\2\u0b39\u0b3a\5\u00fc\177\2\u0b3a\u0b3b\7\22\2\2"+
		"\u0b3b\u0b3c\5\u00fc\177\2\u0b3c\u0b3e\3\2\2\2\u0b3d\u0b2d\3\2\2\2\u0b3d"+
		"\u0b2f\3\2\2\2\u0b3d\u0b31\3\2\2\2\u0b3d\u0b37\3\2\2\2\u0b3e\u00fb\3\2"+
		"\2\2\u0b3f\u0b40\7\u0101\2\2\u0b40\u0b47\t(\2\2\u0b41\u0b42\79\2\2\u0b42"+
		"\u0b47\7\u00d5\2\2\u0b43\u0b44\5\u00ba^\2\u0b44\u0b45\t(\2\2\u0b45\u0b47"+
		"\3\2\2\2\u0b46\u0b3f\3\2\2\2\u0b46\u0b41\3\2\2\2\u0b46\u0b43\3\2\2\2\u0b47"+
		"\u00fd\3\2\2\2\u0b48\u0b4d\5\u0102\u0082\2\u0b49\u0b4a\7\5\2\2\u0b4a\u0b4c"+
		"\5\u0102\u0082\2\u0b4b\u0b49\3\2\2\2\u0b4c\u0b4f\3\2\2\2\u0b4d\u0b4b\3"+
		"\2\2\2\u0b4d\u0b4e\3\2\2\2\u0b4e\u00ff\3\2\2\2\u0b4f\u0b4d\3\2\2\2\u0b50"+
		"\u0b54\5\u0102\u0082\2\u0b51\u0b54\7\u0087\2\2\u0b52\u0b54\7\u00cf\2\2"+
		"\u0b53\u0b50\3\2\2\2\u0b53\u0b51\3\2\2\2\u0b53\u0b52\3\2\2\2\u0b54\u0101"+
		"\3\2\2\2\u0b55\u0b5a\5\u0108\u0085\2\u0b56\u0b57\7\6\2\2\u0b57\u0b59\5"+
		"\u0108\u0085\2\u0b58\u0b56\3\2\2\2\u0b59\u0b5c\3\2\2\2\u0b5a\u0b58\3\2"+
		"\2\2\u0b5a\u0b5b\3\2\2\2\u0b5b\u0103\3\2\2\2\u0b5c\u0b5a\3\2\2\2\u0b5d"+
		"\u0b5e\5\u0108\u0085\2\u0b5e\u0b5f\5\u0106\u0084\2\u0b5f\u0105\3\2\2\2"+
		"\u0b60\u0b61\7\u0122\2\2\u0b61\u0b63\5\u0108\u0085\2\u0b62\u0b60\3\2\2"+
		"\2\u0b63\u0b64\3\2\2\2\u0b64\u0b62\3\2\2\2\u0b64\u0b65\3\2\2\2\u0b65\u0b68"+
		"\3\2\2\2\u0b66\u0b68\3\2\2\2\u0b67\u0b62\3\2\2\2\u0b67\u0b66\3\2\2\2\u0b68"+
		"\u0107\3\2\2\2\u0b69\u0b6d\5\u010a\u0086\2\u0b6a\u0b6b\6\u0085\25\2\u0b6b"+
		"\u0b6d\5\u0112\u008a\2\u0b6c\u0b69\3\2\2\2\u0b6c\u0b6a\3\2\2\2\u0b6d\u0109"+
		"\3\2\2\2\u0b6e\u0b75\7\u0135\2\2\u0b6f\u0b75\5\u010c\u0087\2\u0b70\u0b71"+
		"\6\u0086\26\2\u0b71\u0b75\5\u0110\u0089\2\u0b72\u0b73\6\u0086\27\2\u0b73"+
		"\u0b75\5\u0114\u008b\2\u0b74\u0b6e\3\2\2\2\u0b74\u0b6f\3\2\2\2\u0b74\u0b70"+
		"\3\2\2\2\u0b74\u0b72\3\2\2\2\u0b75\u010b\3\2\2\2\u0b76\u0b77\7\u0136\2"+
		"\2\u0b77\u010d\3\2\2\2\u0b78\u0b7a\6\u0088\30\2\u0b79\u0b7b\7\u0122\2"+
		"\2\u0b7a\u0b79\3\2\2\2\u0b7a\u0b7b\3\2\2\2\u0b7b\u0b7c\3\2\2\2\u0b7c\u0ba0"+
		"\7\u0131\2\2\u0b7d\u0b7f\6\u0088\31\2\u0b7e\u0b80\7\u0122\2\2\u0b7f\u0b7e"+
		"\3\2\2\2\u0b7f\u0b80\3\2\2\2\u0b80\u0b81\3\2\2\2\u0b81\u0ba0\7\u0132\2"+
		"\2\u0b82\u0b84\6\u0088\32\2\u0b83\u0b85\7\u0122\2\2\u0b84\u0b83\3\2\2"+
		"\2\u0b84\u0b85\3\2\2\2\u0b85\u0b86\3\2\2\2\u0b86\u0ba0\t)\2\2\u0b87\u0b89"+
		"\7\u0122\2\2\u0b88\u0b87\3\2\2\2\u0b88\u0b89\3\2\2\2\u0b89\u0b8a\3\2\2"+
		"\2\u0b8a\u0ba0\7\u0130\2\2\u0b8b\u0b8d\7\u0122\2\2\u0b8c\u0b8b\3\2\2\2"+
		"\u0b8c\u0b8d\3\2\2\2\u0b8d\u0b8e\3\2\2\2\u0b8e\u0ba0\7\u012d\2\2\u0b8f"+
		"\u0b91\7\u0122\2\2\u0b90\u0b8f\3\2\2\2\u0b90\u0b91\3\2\2\2\u0b91\u0b92"+
		"\3\2\2\2\u0b92\u0ba0\7\u012e\2\2\u0b93\u0b95\7\u0122\2\2\u0b94\u0b93\3"+
		"\2\2\2\u0b94\u0b95\3\2\2\2\u0b95\u0b96\3\2\2\2\u0b96\u0ba0\7\u012f\2\2"+
		"\u0b97\u0b99\7\u0122\2\2\u0b98\u0b97\3\2\2\2\u0b98\u0b99\3\2\2\2\u0b99"+
		"\u0b9a\3\2\2\2\u0b9a\u0ba0\7\u0133\2\2\u0b9b\u0b9d\7\u0122\2\2\u0b9c\u0b9b"+
		"\3\2\2\2\u0b9c\u0b9d\3\2\2\2\u0b9d\u0b9e\3\2\2\2\u0b9e\u0ba0\7\u0134\2"+
		"\2\u0b9f\u0b78\3\2\2\2\u0b9f\u0b7d\3\2\2\2\u0b9f\u0b82\3\2\2\2\u0b9f\u0b88"+
		"\3\2\2\2\u0b9f\u0b8c\3\2\2\2\u0b9f\u0b90\3\2\2\2\u0b9f\u0b94\3\2\2\2\u0b9f"+
		"\u0b98\3\2\2\2\u0b9f\u0b9c\3\2\2\2\u0ba0\u010f\3\2\2\2\u0ba1\u0ba2\t*"+
		"\2\2\u0ba2\u0111\3\2\2\2\u0ba3\u0ba4\t+\2\2\u0ba4\u0113\3\2\2\2\u0ba5"+
		"\u0ba6\t,\2\2\u0ba6\u0115\3\2\2\2\u0187\u012d\u0132\u0138\u013d\u0146"+
		"\u0148\u014e\u0158\u0161\u0165\u0169\u016f\u0172\u0175\u017d\u0180\u0184"+
		"\u0187\u018f\u0194\u0197\u019e\u01ab\u01b4\u01b6\u01ba\u01bd\u01c4\u01cf"+
		"\u01d1\u01d9\u01de\u01e1\u01e7\u01f2\u0232\u023b\u0240\u0244\u0247\u024d"+
		"\u0255\u025b\u0268\u026d\u027d\u0284\u0288\u028e\u029d\u02a1\u02a7\u02ad"+
		"\u02b0\u02b3\u02b9\u02bd\u02c6\u02c8\u02d1\u02d4\u02dd\u02e2\u02e8\u02ef"+
		"\u02f2\u02f8\u0303\u0306\u030a\u030f\u0314\u031b\u031e\u0321\u0328\u032d"+
		"\u0336\u033e\u0344\u0348\u034c\u0350\u0352\u035e\u0364\u0367\u036c\u036f"+
		"\u0373\u0376\u037a\u0385\u0388\u038c\u0392\u0395\u0398\u039e\u03a6\u03ab"+
		"\u03b1\u03b7\u03c3\u03c6\u03cd\u03d4\u03dc\u03df\u03e7\u03eb\u03f2\u0466"+
		"\u046e\u0476\u047f\u0489\u048d\u0490\u0496\u049c\u04a8\u04b4\u04b9\u04bf"+
		"\u04c7\u04ce\u04d0\u04d5\u04d9\u04de\u04e3\u04e8\u04eb\u04f0\u04f4\u04f9"+
		"\u04fb\u04ff\u0508\u0510\u0519\u0520\u0529\u052e\u0531\u0545\u0547\u0550"+
		"\u0557\u055a\u0561\u0565\u056b\u0573\u057e\u0589\u0590\u0596\u05a3\u05aa"+
		"\u05b1\u05bd\u05c5\u05cb\u05ce\u05d7\u05da\u05e3\u05e6\u05ef\u05f2\u05fb"+
		"\u05fe\u0601\u0606\u0608\u0614\u061b\u0622\u0625\u0627\u0633\u0637\u063b"+
		"\u0641\u0645\u064d\u0651\u0654\u0657\u065a\u065e\u0662\u0665\u0669\u066e"+
		"\u0672\u0675\u0678\u067b\u067d\u0689\u068c\u0690\u069a\u069e\u06a0\u06a3"+
		"\u06a7\u06ad\u06b1\u06bc\u06c6\u06d2\u06e1\u06e6\u06ed\u06fd\u0702\u070f"+
		"\u0714\u071c\u0722\u0726\u072f\u073e\u0743\u074f\u0754\u075c\u075f\u0763"+
		"\u0771\u077e\u0783\u0787\u078a\u078f\u0798\u079b\u07a0\u07a7\u07aa\u07b2"+
		"\u07b9\u07c0\u07c3\u07c8\u07cb\u07d0\u07d4\u07d7\u07db\u07e6\u07ed\u07f1"+
		"\u07f6\u07fb\u080d\u080f\u0812\u081d\u0826\u082d\u0835\u083d\u0841\u0849"+
		"\u0851\u0857\u085f\u086b\u086e\u0874\u0878\u087a\u0883\u088f\u0891\u0898"+
		"\u089f\u08a5\u08ab\u08ad\u08b4\u08bc\u08c2\u08c9\u08cf\u08d3\u08d5\u08dc"+
		"\u08e5\u08f2\u08f7\u08fb\u0909\u090b\u0913\u0915\u0919\u0921\u092a\u0930"+
		"\u0938\u093d\u0943\u0947\u094c\u0951\u0956\u095e\u0969\u097b\u0990\u0992"+
		"\u099b\u099f\u09a8\u09ac\u09be\u09c1\u09c9\u09d2\u09e9\u09f4\u09fb\u09fe"+
		"\u0a03\u0a0f\u0a28\u0a2f\u0a32\u0a41\u0a45\u0a4f\u0a51\u0a5e\u0a60\u0a6d"+
		"\u0a72\u0a74\u0a78\u0a7f\u0a84\u0a8c\u0a90\u0a97\u0aa8\u0aac\u0ab5\u0ab9"+
		"\u0abb\u0ac2\u0ac9\u0acc\u0ad3\u0ada\u0ae1\u0ae9\u0af6\u0b0a\u0b14\u0b17"+
		"\u0b20\u0b23\u0b25\u0b28\u0b2b\u0b3d\u0b46\u0b4d\u0b53\u0b5a\u0b64\u0b67"+
		"\u0b6c\u0b74\u0b7a\u0b7f\u0b84\u0b88\u0b8c\u0b90\u0b94\u0b98\u0b9c\u0b9f";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}