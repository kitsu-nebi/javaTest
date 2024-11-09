package tests;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Duration;

public class SeleniumUITest {
    public static WebDriver driver = new ChromeDriver();
    LoginPageSelenium loginPage = new LoginPageSelenium(driver);
    LoginSuccessSelenium successPage = new LoginSuccessSelenium(driver);

    @BeforeEach
    public void start(){
        //окно разворачивается на полный экран
        driver.manage().window().maximize();
        // устанавливаем неяные ожидания
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //получение ссылки на страницу входа из файла настроек
        driver.get(ConfProperties.getProperty("loginpage"));
    }

    @AfterEach
    public void after(){
        driver.close();
    }

    @Test
    @Tag("ui-auth-selenium")
    @DisplayName("Selenium: login")
    public void loginTest() {
        //вводим логин
        loginPage.inputLogin(ConfProperties.getProperty("login"));
        // driver.findElement(By.ByName("email")).sendKeys("login");
        //вводим пароль
        loginPage.inputPasswd(ConfProperties.getProperty("password"));
        //нажимаем кнопку входа
        loginPage.clickLoginBtn();
        //проверяем рузультат
        assertTrue(successPage.isLoginSuccess());
    }
}