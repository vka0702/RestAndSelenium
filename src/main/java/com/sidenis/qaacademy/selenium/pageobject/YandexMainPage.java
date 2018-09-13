package com.sidenis.qaacademy.selenium.pageobject;

import com.sidenis.qaacademy.selenium.blocks.yandex.*;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.loader.HtmlElementLoader;

import static com.sidenis.qaacademy.selenium.DriverManager.getDriver;

/**
 * Started by ML on 9/8/2018.
 */
public class YandexMainPage {
    public static final String URL = "https://yandex.ru/";

    public MailBlock mailBlock;
    public NewsBlock newsBlock;
    public SearchBlock searchBlock;
    public TrafficBlock trafficBlock;
    public WeatherBlock weatherBlock;

    @Name("Ads on the right")
    @FindBy(css = ".desk-notif-card:not(.desk-notif-card_type_login)")
    public Button adsOnTheRight;

    @Name("Ads under the search bar")
    @FindBy(css = "canvas#canvas")
    public Button adUnderSearch;

    public static YandexMainPage open() {
        getDriver().get(URL);
        return new YandexMainPage();
    }

    public YandexMainPage() {
        HtmlElementLoader.populatePageObject(this, getDriver());
    }
}
