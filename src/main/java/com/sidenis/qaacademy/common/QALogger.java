package com.sidenis.qaacademy.common;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Started by ML on 9/2/2018.
 */
public class QALogger {
    public static Logger qaLogger = LoggerFactory.getLogger(QALogger.class);

    public static void log(String message) {
        qaLogger.info(message);
    }
}
