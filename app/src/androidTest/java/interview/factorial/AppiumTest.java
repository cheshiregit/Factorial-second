package interview.factorial;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.*;
import java.net.MalformedURLException;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AppiumTest {

    //protected AndroidDriver Driver;
    protected WebDriver Driver;
/*
    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Pixel");
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "Android");
        capabilities.setCapability(CapabilityType.VERSION, "8.1");
        capabilities.setCapability("app-package", "interview.factorial"); //Replace with your app package
        capabilities.setCapability("app-activity", "interview.factorial.MainActivity"); //Replace with app Activity
        Driver =  new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
*/
    @Test
    public void test_appium() throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Pixel");
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "Android");
        capabilities.setCapability(CapabilityType.VERSION, "8.1");
        capabilities.setCapability("app-package", "interview.factorial"); //Replace with your app package
        capabilities.setCapability("app-activity", "interview.factorial.MainActivity"); //Replace with app Activity
        Driver =  new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        Driver.findElement(By.id("text_input"));
        //Driver.findElementById("text_input").click();
        //MobileElement text = (MobileElement) Driver.findElementById("text_input");
        WebElement text = Driver.findElement(By.id("text_input"));
        text.click();
        text.sendKeys("3");
        WebElement button = Driver.findElement(By.id("fab"));
        //WebElement button = Driver.findElementById("fab");
        button.click();

        Driver.quit();
    }
/*
    @After
    public void tearDown() {
        Driver.quit();
    }*/
}
