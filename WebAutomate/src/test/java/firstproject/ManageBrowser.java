package firstproject;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;


public class ManageBrowser extends DriverSetup{
    @Test
    public void testBrowserTask() throws InterruptedException{

        driver.get("https://google.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.manage().window().minimize();
        Thread.sleep(2000);
        driver.manage().window().fullscreen();
        Thread.sleep(2000);
        driver.manage().window().maximize();
        driver.navigate().back();
        Thread.sleep(2000);

        driver.navigate().to("https://youtube.com");
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);

        driver.switchTo().newWindow(WindowType.TAB);
        Thread.sleep(2000);
        driver.get("https://mvnrepository.com/");

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.linkedin.com/");

        String currentTabHandle = driver.getWindowHandle();
        System.out.println(currentTabHandle);
        driver.getWindowHandles();
        List<String> handles = new ArrayList<>(driver.getWindowHandles());

        for(String handle:handles){
            System.out.println(handle);
        }
        driver.switchTo().window(handles.get(0));
        System.out.println(driver.getTitle());
        Thread.sleep(2000);
        driver.switchTo().window(handles.get(1));
        System.out.println(driver.getTitle());
        Thread.sleep(2000);
        driver.quit();



    }
}
