package firstproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class DriverSetup {
    public WebDriver driver;
    @BeforeSuite
    public void openBrowser(){
        driver = new ChromeDriver();

    }
    @AfterSuite
    public void closeBrowser(){
        driver.quit();

    }
}
