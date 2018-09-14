package com.sidenis.qaacademy.selenium.pageobject;

import com.sidenis.qaacademy.selenium.blocks.yandex.*;
import ru.yandex.qatools.htmlelements.loader.HtmlElementLoader;

import static com.sidenis.qaacademy.selenium.DriverManager.getDriver;

public class YandexMusicPage {
    public YandexMusicSearchBlock yandexMusicSearchBlock;

    public static YandexMusicPage open() {
        getDriver().get("https://music.yandex.ru");
        return new YandexMusicPage();
    }

    public YandexMusicPage() {
        HtmlElementLoader.populatePageObject(this, getDriver());
    }
}
