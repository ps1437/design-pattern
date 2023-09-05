package com.syscho.pattern.behavioral.chain;

public class LoggerClient {
    public static void main(String[] args) {

        LogProcessor logProcessor = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
        logProcessor.log(LogLevel.ERROR, "ERROR");
        logProcessor.log(LogLevel.DEBUG, "DEBUG");
        logProcessor.log(LogLevel.INFO, "INFO");
    }
}
