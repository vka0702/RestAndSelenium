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

    public YandexMusicSearchBlock yandexMusicSearchBlockFromMain;
    public YandexMusicPage yandexMusicPage;
    public MailBlock mailBlock;
    public NewsBlock newsBlock;
    public SearchBlock searchBlock;
    public TrafficBlock trafficBlock;
    public WeatherBlock weatherBlock;
    public SmallLogoBlock smallLogoBlock;

    @Name("Ads on the right")
    @FindBy(css = ".desk-notif-card:not(.desk-notif-card_type_login)")
    public Button adsOnTheRight;

    @Name("Ads under the search bar")
    @FindBy(css = "canvas#canvas")
    public Button adUnderSearch;

    @Name("TV Online")
    @FindBy(css = ".home-link.media-stream__title.media-service__title-text.stream-control__link.home-link_pseudo_yes")
    public Button tvOnlineButton;

    @Name("Yandex music")
    @FindBy(xpath = "html/body/div[1]/div[3]/div[2]/div[2]/div/div[2]/div/div[1]/div/a[7]")
    public Button yandexMusic;

    @Name("Small Logo type")
    @FindBy(css = ".logo.logo_type_link")
    public Button logo;

    public static YandexMainPage open() {
        getDriver().get(URL);
        return new YandexMainPage();
    }


    public YandexMainPage() {
        HtmlElementLoader.populatePageObject(this, getDriver());
    }
}
