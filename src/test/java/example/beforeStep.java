package example;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.cucumber.java.en.Given;

public class beforeStep {
    @Given("Открываем сайт {string}")
    public void openWebSite(String url) {
        Configuration.timeout = 6000;
        Selenide.open(url);
    }
}
