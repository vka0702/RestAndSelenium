package com.sidenis.qaacademy.selenium;

import com.sidenis.qaacademy.common.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

/**
 * Started by ML on 9/2/2018.
 */
public class DriverManager {

    private static final String PATH_TO_FF_BINARY = "C:/Program Files/Mozilla Firefox/firefox.exe";
    private static final String PATH_TO_CHROME_BINARY = "src/main/resources/geckodriver.exe";
    private static final String PATH_TO_GECKO = "src/main/resources/geckodriver.exe";
    private static final int IMPLICITY_WAIT = 5;
    private static final int PAGE_LOAD_TIMEOUT = 15;
    private static final int SCRIPT_TIMEOUT = 15;
    private static WebDriver driver;

    public static WebDriver createDriver() {
        driver = null;
        return createDriver(Constants.BROWSER);
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            driver = createDriver(Constants.BROWSER);
        }
        return driver;
    }

    private static WebDriver createDriver(String browser) {
        switch (browser) {
//            case "FF_GECKO":
//                System.setProperty("webdriver.gecko.driver", PATH_TO_GECKO);
//                FirefoxOptions options = new FirefoxOptions().
//                        setBinary(PATH_TO_FF_BINARY).
//                        addArguments("-console").
//                        addPreference("browser.cache.disk.enable", false);
//                driver = new FirefoxDriver(options);
//                break;
            case "FF_OLD":
                DesiredCapabilities caps = new DesiredCapabilities();
                caps.setCapability("browser.cache.disk.enable", false);
                caps.setCapability("acceptSslCerts", true);
                caps.setCapability("firefox_binary", PATH_TO_FF_BINARY);
                driver = new FirefoxDriver();
                break;
            case "CHROME":
                System.setProperty("webdriver.chrome.driver", PATH_TO_CHROME_BINARY);
                driver = new ChromeDriver(DesiredCapabilities.chrome());
                break;
            default:
                throw new IllegalStateException("Unknown browser type specified");
        }
        setTimeouts(driver);
        driver.manage().window().maximize();
        return driver;
    }

    private static void setTimeouts(WebDriver driver) {
        driver.manage().timeouts().implicitlyWait(IMPLICITY_WAIT, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(SCRIPT_TIMEOUT, TimeUnit.SECONDS);
    }
}
