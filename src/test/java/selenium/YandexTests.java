package selenium;

import com.sidenis.qaacademy.common.BaseUITest;
import com.sidenis.qaacademy.common.annotation.UITests;
import com.sidenis.qaacademy.selenium.blocks.yandex.SearchBlock;
import com.sidenis.qaacademy.selenium.blocks.yandex.YandexMusicSearchBlock;
import com.sidenis.qaacademy.selenium.pageobject.YandexMainPage;
import com.sidenis.qaacademy.selenium.pageobject.YandexMusicPage;
import net.bytebuddy.asm.Advice;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Started by ML on 9/8/2018.
 */
public class YandexTests extends BaseUITest {


    @Test
    public void testFromMainToMusic() throws InterruptedException {
        YandexMainPage page = YandexMainPage.open();
        page.yandexMusic.click();
        //YandexMusicPage musicPage = new YandexMusicPage();
        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
        assertEquals("https://music.yandex.ru/home", driver.getCurrentUrl());
        assertTrue("No field for music search!!!", page.yandexMusicSearchBlockFromMain.musicInput.isDisplayed());
        page.yandexMusicSearchBlockFromMain.musicInput.click();
        page.yandexMusicSearchBlockFromMain.musicInput.sendKeys("Кровосток");
        //page.yandexMusicSearchBlockFromMain.musicInput.click();
        assertTrue("No button for music search!!!", page.yandexMusicSearchBlockFromMain.musicSearchButton.isDisplayed());
        page.yandexMusicSearchBlockFromMain.musicInput.sendKeys(Keys.ENTER);
        //page.yandexMusicSearchBlockFromMain.musicSearchButton.click();
        Thread.sleep(5000);
    }

//    @Test
//    @Category({UITests.class})
//    public void testMainPageSearchesCats() throws InterruptedException {
//        YandexMainPage page = YandexMainPage.open();
//        assertEquals(YandexMainPage.URL, driver.getCurrentUrl());
//        assertTrue("Search block is not displayed", page.searchBlock.isDisplayed());
//        //assertTrue("Bug #1", page.logo.isDisplayed());
//        page.searchBlock.input.sendKeys("Cat");
//        page.searchBlock.input.sendKeys(Keys.ENTER);
//        Thread.sleep(10000);
//        assertTrue("Bug is..",page.logo.isDisplayed());
//    }

//    @Test
//    public void testTvOnlineButton() throws InterruptedException {
//        YandexMainPage mainPage = YandexMainPage.open();
//        mainPage.yandexMusic.click();
//        //mainPage.tvOnlineButton.click();
//        Thread.sleep(6000);
//    }
}
