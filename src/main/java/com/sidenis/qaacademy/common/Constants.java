package com.sidenis.qaacademy.common;

import java.io.IOException;
import java.util.Properties;

import static com.google.common.base.Strings.isNullOrEmpty;
import static com.sidenis.qaacademy.common.QALogger.qaLogger;

/**
 * Started by ML on 9/2/2018.
 */
public class Constants {
    private static final String PROPERTIES_FILE = "/application.properties";
    private static final String JENKINS_JOB_NAME;
    public static final String BASE_URI = "";
    public static final String USERNAME;
    public static final String PASSWORD;
    public static final String BROWSER;


    static {
        JENKINS_JOB_NAME = System.getenv("JOB_NAME");
        USERNAME = getProperty("user.name");
        PASSWORD = getProperty("user.password");
        BROWSER = getProperty("browser.type");
    }

    private static String getProperty(String propertyName) {
        if (isNullOrEmpty(JENKINS_JOB_NAME)) {
            return loadProperty(propertyName);
        }
        return System.getProperty(propertyName);
    }

    private static String loadProperty(String propertyName) {
        Properties props = new Properties();
        try {
            props.load(Constants.class.getResourceAsStream(PROPERTIES_FILE));
        } catch (IOException e) {
            qaLogger.info("Can't find 'application.properties'. Please make sure it's available in src/resources");
            e.printStackTrace();
        }
        return props.getProperty(propertyName);
    }
}
