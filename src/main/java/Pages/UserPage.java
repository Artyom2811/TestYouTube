package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.testng.Assert.assertEquals;

public class UserPage {

    private WebDriver webDriver;

    public UserPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    private By subcribeButtonr = By.cssSelector("#channel-header #subscribe-button");
    private By enterButton = By.cssSelector("iron-dropdown paper-button");

    public UserPage clickOnSubcribeButton() {
        webDriver.findElement(subcribeButtonr).click();
        return this;
    }

    public UserPage checkEnterButton() {
        assertEquals(webDriver.findElement(enterButton).getText(), "ВОЙТИ", "Некорректный текст кнопки войти");
        return this;
    }

}
