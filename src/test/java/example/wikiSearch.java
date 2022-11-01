package example;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$x;

public class wikiSearch {
    private final SelenideElement searchBar = $x("//input[@id='searchInput']");
    private final SelenideElement firstSearchElement = $x("//a[@data-serp-pos=\"0\"]");
    private final SelenideElement contentsM1Ultra = $x("//span[contains(text(),'Apple M1 Ultra')]");
    private final SelenideElement autorisation = $x("//span[contains(text(),'Войти')]");
    private final SelenideElement login = $x("//input[@id='wpName1']");
    private final SelenideElement password = $x("//input[@id='wpPassword1']");
    private final SelenideElement loginAttempt = $x("//button[@id='wpLoginAttempt']");
    private final SelenideElement logout = $x("//a[@data-mw=\"interface\"]//span[text()='Выйти']");


    @When("Авторизируемся на сайте с логином {string} и паролем {string}")
    public void autorisation(String log, String pass) {
        Configuration.timeout = 6000;
        autorisation.click();
        Configuration.timeout = 6000;
        login.sendKeys(log);
        Configuration.timeout = 6000;
        password.sendKeys(pass);
        Configuration.timeout = 6000;
        loginAttempt.click();
        Configuration.timeout = 6000;
    }

    @And("На главной странице находим строку поиска")
    public void findSearchBar() {
        searchBar.click();
        Configuration.timeout = 6000;
    }

    @And("В строке поиска вводим текст {string}")
    public void searchText(String arg0) {
        searchBar.sendKeys(arg0);
        Configuration.timeout = 6000;
        searchBar.sendKeys(Keys.ENTER);
        Configuration.timeout = 6000;
    }

    @And("Перейти в первый элемент списка результатов поиска")
    public void firstSearchElement() throws InterruptedException {
        Thread.sleep(4000);
        firstSearchElement.click();
    }

    @And("Переходим по содержанию Apple M1 Ultra")
    public void contentsM1Ultra() throws InterruptedException {
        Thread.sleep(4000);
        contentsM1Ultra.click();
        Thread.sleep(4000);
    }
    
    @Then("Выходим из учетной записи")
    public void logout() throws InterruptedException {
        logout.click();
        Thread.sleep(4000);
    }
}
