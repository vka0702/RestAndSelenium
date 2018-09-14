package com.sidenis.qaacademy.selenium.blocks.riskmarket;

import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.TextBlock;
import ru.yandex.qatools.htmlelements.element.TextInput;

@Name("Right block for authorized users")
@FindBy(css = ".sidebar__controls--logged-user")
public class AuthorizedRightAreaBlock extends UnauthorizedRightAreaBlock  {

    @Name("Bonus score")
    @FindBy(css = ".sidebar__btn-label")
    public TextBlock bonusScore;

}
