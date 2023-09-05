package com.syscho.pattern.behavioral.chain;

public class InfoLogProcessor extends LogProcessor {
    InfoLogProcessor(LogProcessor logProcessor) {
        super(logProcessor);
    }

    @Override
    void log(LogLevel logLevel, String message) {

        if (LogLevel.INFO == logLevel) {
            System.out.println("Info level logging");
            System.out.println(message);
            System.out.println("-----------------");
        } else {
            super.log(logLevel, message);
        }

    }
}
