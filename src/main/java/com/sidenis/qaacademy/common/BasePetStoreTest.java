package com.sidenis.qaacademy.common;

import io.restassured.RestAssured;
import org.apache.commons.io.FileUtils;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.rules.DisableOnDebug;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.rules.Timeout;
import org.junit.runner.Description;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;

import static com.sidenis.qaacademy.common.QALogger.log;
import static com.sidenis.qaacademy.selenium.DriverManager.createDriver;
import static java.util.concurrent.TimeUnit.MINUTES;

/**
 * Started by ML on 9/8/2018.
 */
public class BasePetStoreTest {
    static {
        RestAssured.baseURI = "https://petstore.swagger.io/v2";
    }
}
