package selenium.riskmarket;

import com.sidenis.qaacademy.common.BaseUITest;
import com.sidenis.qaacademy.common.annotation.UITests;
import com.sidenis.qaacademy.selenium.DriverManager;
import com.sidenis.qaacademy.selenium.blocks.riskmarket.AuthorisationBlock;
import com.sidenis.qaacademy.selenium.pageobject.riskmarket.RiskMarketMainPage;
import org.junit.After;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.apache.commons.io.FileUtils.waitFor;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class RiskMarketUITest extends BaseUITest {

    @Test
    @Category({UITests.class})
    public void testAutorisationWithTrueLoginAndPass() {
        RiskMarketMainPage page = RiskMarketMainPage.open();
        page.entry.click();
        DriverManager.waitFor(ExpectedConditions.visibilityOfAllElements(page.authorisationBlock.inputEmail, page.authorisationBlock.inputPass, page.authorisationBlock.anotherComputer));
        page.authorisationBlock.inputEmail.click();
        page.authorisationBlock.inputEmail.sendKeys(AuthorisationBlock.trueEmail);
        page.authorisationBlock.inputPass.click();
        page.authorisationBlock.inputPass.sendKeys(AuthorisationBlock.truePass);
        assertTrue("No checkbox", page.authorisationBlock.anotherComputer.isDisplayed());
        page.authorisationBlock.anotherComputer.click();
        page.authorisationBlock.login.click();
        DriverManager.waitFor(ExpectedConditions.visibilityOf(page.authorizedRightAreaBlock.bonusScore));
        assertTrue("No bonus, you unauthorized" ,page.authorizedRightAreaBlock.bonusScore.isDisplayed());
        assertTrue("No button queries", page.authorizedRightAreaBlock.queries.isDisplayed());
    }

    @Test
    @Category({UITests.class})
    public void testAuthorisationWithFakeLogin() {
        RiskMarketMainPage page = RiskMarketMainPage.open();
        page.entry.click();
        DriverManager.waitFor(ExpectedConditions.visibilityOfAllElements(page.authorisationBlock.inputEmail, page.authorisationBlock.inputPass, page.authorisationBlock.anotherComputer));
        page.authorisationBlock.inputEmail.click();
        page.authorisationBlock.inputEmail.sendKeys(AuthorisationBlock.fakeEmail);
        DriverManager.waitFor(ExpectedConditions.visibilityOf(page.authorisationBlock.errorNoUser));
        String errorText = page.authorisationBlock.errorNoUser.getText();
        assertEquals(AuthorisationBlock.messageFailEmail, errorText);
    }

    @Test
    @Category({UITests.class})
    public void testSearchCountryInPopup() {
        RiskMarketMainPage page = RiskMarketMainPage.open();
        DriverManager.waitFor(ExpectedConditions.visibilityOf(page.mainSearchBlock.inputCountries));
        page.mainSearchBlock.inputCountries.click();
        page.mainSearchBlock.inputCountries.sendKeys("Рос");
        DriverManager.waitFor(ExpectedConditions.visibilityOf(page.mainSearchBlock.firstCountryInList));
        String country = page.mainSearchBlock.firstCountryInList.getText();
        assertEquals("Россия", country);

    }

    @After
    public void clearCookies() {
        driver.manage().deleteAllCookies();
    }
}
