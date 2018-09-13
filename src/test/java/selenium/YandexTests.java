package selenium;

import com.sidenis.qaacademy.common.BaseUITest;
import com.sidenis.qaacademy.common.annotation.UITests;
import com.sidenis.qaacademy.selenium.pageobject.YandexMainPage;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Started by ML on 9/8/2018.
 */
public class YandexTests extends BaseUITest {

    @Test
    @Category({UITests.class})
    public void testMainPageSearchesCats() {
        YandexMainPage page = YandexMainPage.open();
        assertEquals(YandexMainPage.URL, driver.getCurrentUrl());
        assertTrue("Search block is not displayed", page.searchBlock.isDisplayed());
    }
}
