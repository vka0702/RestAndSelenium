package com.sidenis.qaacademy.selenium.blocks.riskmarket;

import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.TextBlock;
import ru.yandex.qatools.htmlelements.element.TextInput;

import java.util.List;

@Name("Main search block")
@FindBy(css = ".home-intro__form-container")
public class MainSearchBlock extends HtmlElement {

    @Name("Input countries")
    @FindBy(css = ".ui-select__field")
    public TextInput inputCountries;

    @Name("Popup coutries list")
    @FindBy(css = ".ui-select__options--open")
    public List<TextBlock> popupCountriesList;

    @Name("First element in popup")
    @FindBy(xpath = "//ul/li[1]/span")
    public TextBlock firstCountryInList;


}
