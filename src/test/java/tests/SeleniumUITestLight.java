package tests;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SeleniumUITestLight {
    public static WebDriver driver = new ChromeDriver();
    @BeforeEach
    public void start(){
        //окно разворачивается на полный экран
        driver.manage().window().maximize();
        // устанавливаем неяные ожидания
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //получение ссылки на страницу входа из файла настроек
        driver.get("https://authenticationtest.com/simpleFormAuth/");
    }

    @AfterEach
    public void after(){
        driver.close();
    }

    @Test
    @Tag("ui-auth-selenium-light")
    @DisplayName("Selenium: login")
    public void loginTest() {
        //вводим логин
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("simpleForm@authenticationtest.com");
        //вводим пароль
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("pa$$w0rd");
        //нажимаем на кнопку
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        //Проверяем отображение страницы
        assertTrue(driver.findElement(By.xpath("//h1[text()='Login Success']")).isDisplayed());
    }
}