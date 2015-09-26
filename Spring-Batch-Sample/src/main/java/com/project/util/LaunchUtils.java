package com.project.util;

public interface LaunchUtils {

	//Job Parameter Keys
	public static final String INPUT_FILE_NAME_KEY = "inputFileName";
	public static final String OUTPUT_FILE_NAME_KEY = "outputFileName";
	public static final String INPUT_DELIMITER_KEY = "inputDelimiter";
	public static final String OUTPUT_DELIMITER_KEY = "outputDelimiter";
	public static final String SQL_QUERY_KEY="sqlQuery";
	
	//Job Parameter Values
	public static final String INPUT_FILE_LOC = "src/main/resources/data";
	public static final String OUTPUT_FILE_LOC = "src/main/resources/dataOutput/";
	
	
	//Delimeter Types
	public static final String PIPE_DELIMITER= "|";
	public static final String COMMA_DELIMITER = ",";
	
	//File Append
	public static final String APPEND = "true";
	public static final String DO_NO_APPEND = "false";
}
