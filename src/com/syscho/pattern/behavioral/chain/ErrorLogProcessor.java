package com.syscho.pattern.behavioral.chain;

public class ErrorLogProcessor extends LogProcessor {
    ErrorLogProcessor(LogProcessor logProcessor) {
        super(logProcessor);
    }

    @Override
    void log(LogLevel logLevel, String message) {

        if (LogLevel.ERROR == logLevel) {
            System.out.println("Error level logging");
            System.out.println(message);
            System.out.println("-----------------");
        } else {
            super.log(logLevel, message);
        }

    }
}
