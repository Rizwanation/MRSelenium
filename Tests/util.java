import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class util

{
    public static WebDriver driver;
    public static void screenshot(String filename)
    {
        driver = baseClass.driver;
        TakesScreenshot ts = (TakesScreenshot) driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(src,new File(System.getProperty("user.dir") + "//Screenshots//"+filename + ".png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}