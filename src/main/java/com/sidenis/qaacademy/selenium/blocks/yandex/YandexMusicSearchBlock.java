package com.sidenis.qaacademy.selenium.blocks.yandex;

import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.TextInput;

@Name("Music search panel")
@FindBy(css = "div.head__left")
public class YandexMusicSearchBlock extends HtmlElement {

    @Name("Search music input")
    @FindBy(css = "input.d-input__field.deco-input_suggest")
    public TextInput musicInput;

    @Name("Search music button")
    @FindBy (css = ".head__search button")
    public Button musicSearchButton;
}
