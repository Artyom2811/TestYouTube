package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VideoPage {

    private WebDriver webDriver;

    public VideoPage (WebDriver webDriver){
        this.webDriver = webDriver;
    }

    private By authorAvatar = By.cssSelector("ytd-video-secondary-info-renderer #avatar");

    public UserPage clickOnAutorAvatar(){
        WebElement elem = webDriver.findElement(authorAvatar);
         new WebDriverWait(webDriver, 5)
                .until(ExpectedConditions.visibilityOf(elem));
        elem.click();
        return new UserPage(webDriver);
    }
}
