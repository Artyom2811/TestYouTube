package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {

    private WebDriver webDriver;

    public MainPage(WebDriver driver) {
        this.webDriver = driver;
    }

    private By searchField = By.id("search");
    private By listElementsSearchDropbox = By.cssSelector(".sbsb_b li");

    public MainPage setSearchField(String value) {
        webDriver.findElement(searchField).click();
        webDriver.findElement(searchField).sendKeys(value);
        return this;
    }

    public SearchResultPage selectSearchDropbox(int numberField) {
        webDriver.findElements(listElementsSearchDropbox).get(numberField - 1).click();
        return new SearchResultPage(webDriver);
    }
}
