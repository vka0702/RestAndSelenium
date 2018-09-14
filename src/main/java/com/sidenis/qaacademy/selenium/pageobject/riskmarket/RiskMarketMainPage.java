package com.sidenis.qaacademy.selenium.pageobject.riskmarket;

import com.sidenis.qaacademy.selenium.blocks.riskmarket.*;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.loader.HtmlElementLoader;

import static com.sidenis.qaacademy.selenium.DriverManager.getDriver;

public class RiskMarketMainPage {

    public static final String URL = "https://riskmarket.ru/";

    public MainSearchBlock mainSearchBlock;
    public TagsBlock tagsBlock;
    public AuthorisationBlock authorisationBlock;
    public UnauthorizedRightAreaBlock unauthorizedRightAreaBlock;
    public AuthorizedRightAreaBlock authorizedRightAreaBlock;

    @Name("Entry")
    @FindBy(css = ".login-btn")
    public Button entry;

    @Name("About servise")
    @FindBy(xpath = "//nav/a[1]")
    public Button aboutServise;

    @Name("Contacts")
    @FindBy(xpath = "//nav/a[2]")
    public Button contacts;

    public static RiskMarketMainPage open() {
        getDriver().get(URL);
        return new RiskMarketMainPage();
    }

    public RiskMarketMainPage() {
        HtmlElementLoader.populatePageObject(this, getDriver());
    }
}
