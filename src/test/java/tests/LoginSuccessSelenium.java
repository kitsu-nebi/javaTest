package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginSuccessSelenium {
    /**
     * конструктор класса, занимающийся инициализацией полей класса
     */
    public WebDriver driver;
    public LoginSuccessSelenium(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }

    @FindBy(xpath = "//h1[text()='Login Success']")
    private WebElement LoginSuccess;

    /**
     * метод для ввода логина
     */
    public boolean isLoginSuccess() {
        return LoginSuccess.isDisplayed();
    }
}