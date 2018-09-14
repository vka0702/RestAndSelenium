package com.sidenis.qaacademy.common;

import com.sidenis.qaacademy.selenium.DriverManager;
import com.sidenis.qaacademy.selenium.pageobject.YandexMainPage;
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
import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * Started by ML on 9/8/2018.
 */
public class BaseUITest {
    protected static WebDriver driver = null;

    @Rule
    public TestRule testTimeout = new DisableOnDebug(new Timeout(10, MINUTES));

    @Rule
    public TestWatcher screenshotRule = new TestWatcher() {
        @Override
        protected void failed(Throwable e, Description description) {
            takeScreenshot(driver, description);
        }
    };

    @BeforeClass
    public static void setup() {
        driver = createDriver();
    }

    @AfterClass
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    private void takeScreenshot(WebDriver driver, Description description) {
        String fileName = String.format("target/screenshot/%s_%s_%s.png", description.getTestClass().getSimpleName(),
                description.getMethodName(), LocalDate.now().toString());
        File scrFile = null;
        try {
            scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        } catch (UnhandledAlertException uae) {
            log("[Can't take screenshot because of alert]");
        }
        if (scrFile != null) {
            File destFile = new File(fileName);
            try {
                FileUtils.copyFile(scrFile, destFile);
            } catch (IOException ioe) {
                log("[Failed to write screenshot in file]");
            }
        }
    }
}
