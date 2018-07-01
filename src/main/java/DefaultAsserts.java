import org.openqa.selenium.WebDriver;

import static org.testng.Assert.assertEquals;

public class DefaultAsserts {

    private WebDriver webDriver;

    DefaultAsserts(WebDriver webDriver){
        this.webDriver = webDriver;
    }

    public void assertTabName (String checkName) {
        assertEquals(webDriver.getTitle(), checkName,
                "Имя вкладки браузера " + webDriver.getTitle() + "не соответствует ожидаемой " + checkName);
    }
}
