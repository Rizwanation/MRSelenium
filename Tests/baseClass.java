import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class baseClass {

    public static WebDriver driver;
    @BeforeTest
    public void initializeDriver()
    {
        System.setProperty("web.driver.chromedriver",System.getProperty("User.dir") + "//WebDrivers//chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @AfterTest
    public void clear()
    {
        driver.quit();
    }

}
