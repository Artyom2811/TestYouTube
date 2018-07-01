package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultPage {

    private WebDriver webDriver;

    SearchResultPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    private By searchResultList = By.cssSelector("ytd-two-column-search-results-renderer ytd-item-section-renderer");
    private By elementsSearchResultList = By.id("thumbnail");

    public VideoPage selectVideoInResultList(int numberVideo) {
        webDriver.findElement(searchResultList).findElements(elementsSearchResultList).get(numberVideo - 1).click();
        return new VideoPage(webDriver);
    }
}

