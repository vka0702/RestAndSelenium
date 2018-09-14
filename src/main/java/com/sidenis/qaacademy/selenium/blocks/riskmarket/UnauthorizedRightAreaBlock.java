package com.sidenis.qaacademy.selenium.blocks.riskmarket;

import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.HtmlElement;

@Name("Right block for unauthorized user")
@FindBy(css = ".sidebar__controls")
public class UnauthorizedRightAreaBlock extends HtmlElement {

    @Name ("Queries")
    @FindBy(xpath = "//nav/button[1]")
    public Button queries;

    @Name ("Drafts")
    @FindBy(xpath = "//nav/button[2]")
    public Button drafts;

}
