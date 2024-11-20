package tests.ya.ru;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class HomePage {
    private String searchInput = "//input[@type='text']";
    private String searchButton = "//input[@value='Search']";
    private String searchResult = "//*[contains(text(),'BBDeeee')]";

    @Step("Ввод строки для поиска")
    public void writeSearch(String str){
        $x(searchInput).setValue(str);
    }

    @Step("Нажатие кнопки")
    public void clickSearchButton(){
        $x(searchButton).click();
    }

    @Step("Проверка отображения ответа")
    public void checkResult() throws InterruptedException {
        $x(searchResult).shouldHave(visible);
    }

}
