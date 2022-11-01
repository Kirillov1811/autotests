package example;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$x;

public class yandexMarketStep {

    private final SelenideElement searchBar = $x("//input[@placeholder='Искать на Ozon']");
    private final SelenideElement filterBar = $x("//div[@class='aba8 filter-block']");
    private final SelenideElement checkBox16Gb = $x("//span[contains(text(),\'16 ГБ\')]");
    private final SelenideElement searchButton = $x("//button[@class='f6aa']");

    @When("Заходим в учетную запись")
    public void login() {
        searchBar.click();


        //loginInputField.click();
    }

    @And("В строке поиска вводим {string}")
    public void searchEdit(String arg0) {
        searchBar.sendKeys(arg0);
    }

    @And("Нажимаем кнопку поиска")
    public void pressSearchButton() {
        searchButton.click();

    }

    //@And("Указываем объем оперативной памяти шестнадцать Gb")
    //public void checkBox() {
      //  if(filterBar.isDisplayed()){
      //      checkBox16Gb.click();
       // }
   // }
    }


