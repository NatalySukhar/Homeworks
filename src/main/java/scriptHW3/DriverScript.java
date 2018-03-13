package scriptHW3;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import javax.security.auth.login.Configuration;
import java.beans.EventHandler;
import java.io.File;

import java.util.concurrent.TimeUnit;


public abstract class DriverScript {
    public static WebDriver getDriver(){
        WebDriver driver;
       System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "/drivers/chromedriver.exe");
        driver= new ChromeDriver();
       /* String browser= "chrome";

        {
            System.setProperty("webdriver.chrome.driver", new File(DriverScript.class.getResource("/chromedriver.exe").getFile()).getPath());
            driver = new ChromeDriver();
        }
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);*/
//driver.manage().window().maximize();
        return driver;
    }
public static EventFiringWebDriver getConfiguredDriver(){
    WebDriver driver=getDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
EventFiringWebDriver wrappedDriver= new EventFiringWebDriver(driver);
    wrappedDriver.register(new scriptHW3.utils.EventHandler());
return wrappedDriver;
}
    public static void quitDriver(WebDriver driver) {driver.quit();

    }

}
