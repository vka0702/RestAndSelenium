package com.sidenis.qaacademy.selenium.blocks.riskmarket;

import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.*;

@Name("Authorization block")
@FindBy(css = ".login-window__wrap")
public class AuthorisationBlock extends HtmlElement {

    public static final String trueEmail = "Kirill.Vasilyev@sidenis.com";
    public static final String truePass = "LlPewt7DLWLYT";
    public static final String fakeEmail = "Kirill@sidenis.com";
    public static final String fakePass = "brevfas234";
    public static final String messageFailEmail = "Пользователь с таким E-mail не существует";


    @Name("Input Email")
    @FindBy(css = ".login-window__group div.ui-label__wrapper>*>input")
    public TextInput inputEmail;

    @Name("Input Pass")
    @FindBy(css = ".ui-input>div>input")
    public TextInput inputPass;

    @Name("Another's computer")
    @FindBy(css = ".login-window__group .ui-checkbox__label")
    public CheckBox anotherComputer;

    @Name("Login")
    @FindBy(css = ".login-window__btn")
    public Button login;

    @Name("No user with this email")
    @FindBy(css = ".tooltip.tooltip--theme-red")
    public TextBlock errorNoUser;

}
