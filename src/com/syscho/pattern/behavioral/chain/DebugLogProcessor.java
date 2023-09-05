package com.syscho.pattern.behavioral.chain;

public class DebugLogProcessor extends LogProcessor {
    DebugLogProcessor(LogProcessor logProcessor) {
        super(logProcessor);
    }

    @Override
    void log(LogLevel logLevel, String message) {

        if (LogLevel.DEBUG == logLevel) {
            System.out.println("Debug level logging");
            System.out.println(message);
            System.out.println("-----------------");
        } else {
            super.log(logLevel, message);
        }

    }
}
