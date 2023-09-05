package com.syscho.pattern.behavioral.chain;

public abstract class LogProcessor {

    LogProcessor nextLogProcessor;

    LogProcessor(LogProcessor logProcessor) {
        this.nextLogProcessor = logProcessor;
    }

    void log(LogLevel logLevel, String message) {
        if (nextLogProcessor != null) {
            nextLogProcessor.log(logLevel, message);
        }

    }

}

enum LogLevel {
    INFO,
    DEBUG,
    ERROR
}