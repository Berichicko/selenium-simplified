import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JTest1 {

    @Test
    public void chromeSession() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://seleniumsimplified.com");
        Assert.assertTrue("title should start differently",
        driver.getTitle().startsWith("Selenium Simplified"));
        driver.close();
        driver.quit();
    }
}