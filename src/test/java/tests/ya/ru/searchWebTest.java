package tests.ya.ru;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

@DisplayName("UI тесты")
public class searchWebTest {
    @BeforeAll
    public static void beforeAll(){
        WebDriverManager.chromedriver().setup();
        open("https://authenticationtest.com/xssDemo/");
        getWebDriver().manage().window().maximize();
    }

    HomePage home = new HomePage();
    @Test
    @Description("Проверка поиска")
    @DisplayName("Ввод строки для поиска")
    @Step("Проверка отображения ответа")
    public void fillInputSearch() throws InterruptedException {
        home.writeSearch("BBDeeee");
        home.clickSearchButton();
        home.checkResult();
    }
}
