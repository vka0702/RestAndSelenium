package com.sidenis.qaacademy.selenium.blocks.yandex;

import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.TextInput;

import java.util.List;

@Name("Search block")
@FindBy(css = "div.home-arrow")
public class SearchBlock extends HtmlElement {

    @Name("Other Yandex services btns")
    @FindBy(css = ".home-tabs .home-link")
    public List<Button> servicesBtns;

    @Name("Search input")
    @FindBy(css = "input#text")
    public TextInput input;

    @Name("Keyboard toggle")
    @FindBy(css = ".b-ico-kbd")
    public List<Button> keyboardToggle;

    @Name("Sample hint")
    @FindBy(css = "span.home-arrow__sample-first-word")
    public List<Button> sample;

}
