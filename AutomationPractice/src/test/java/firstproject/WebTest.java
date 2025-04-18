package firstproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.Assert;


public class WebTest extends DriverSetup {
   /* public static void main (String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        Thread.sleep(2000);
        driver.close();

    }*/
    @Test
   /* public void testPageTitle(){
        driver.get("https://www.google.com");
        driver.get("https://www.google.com/");
        Assert.assertEquals(driver.getTitle(),"Google");
        //driver.close();

    }*/
    public void testPageUrl(){
        driver.get("https://www.google.com/");
        System.out.println(driver.getCurrentUrl());
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.google.com/");

    }

}
