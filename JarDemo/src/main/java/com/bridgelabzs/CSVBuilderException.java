package com.bridgelabzs;

public class CSVBuilderException extends Exception {

    public CSVBuilderException(String message, String name) {

        super(message);
        this.type= ExceptionType.valueOf(name);
    }

    public enum ExceptionType {
        FILE_PROBLEM,UNABLE_TO_PARSE,NO_CENSUS_DATA,STATE_CODE_FILE_PROBLEM,NO_STATE_CODE_DATA,INVALID_COUNTRY,HEADER_OR_DELIMITER_PROBLEM
    }

    public ExceptionType type;

    public CSVBuilderException(String message, ExceptionType type) {
        super(message);
        this.type = type;
    }

    public CSVBuilderException(String message, ExceptionType type, Throwable cause) {
        super(message, cause);
        this.type = type;
    }
}
