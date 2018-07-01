import Pages.MainPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class YouTubeTests {

    WebDriver webDriver;
    DefaultAsserts defaultAsserts;
    MainPage mainPage;

    public YouTubeTests() {
        ChromeWebDriver sw = new ChromeWebDriver();
        webDriver = sw.webDriver;
        defaultAsserts = new DefaultAsserts(webDriver);
        mainPage = new MainPage(webDriver);
    }

    @AfterTest
    public void closeBrowser() {
        webDriver.quit();
    }

    @Test
    public void checkTitleElements() {
        webDriver.get("https://www.youtube.com/");

        defaultAsserts.assertTabName("YouTube");

        String randomValue = String.valueOf((int) (Math.random() * 9990 + 10));

        mainPage.setSearchField(randomValue);

        webDriver.manage().window().maximize();

        mainPage.selectSearchDropbox(2)
                .selectVideoInResultList(4)
                .clickOnAutorAvatar()
                .clickOnSubcribeButton()
                .checkEnterButton();
    }
}
