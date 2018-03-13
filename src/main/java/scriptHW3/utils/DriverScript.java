package scriptHW3.utils;


import com.sun.xml.internal.stream.buffer.sax.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;


public abstract class DriverScript {
    public static WebDriver getDriver(){
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "/drivers/chromedriver.exe");
        driver= new ChromeDriver();
        /*String browser= Properties.getBrowser();
        switch (browser){
            case "chrome":
                default:
                    System.setProperty("webdriver.chrome.driver", new File(DriverScript.class.getResource("/chromedriver.exe").getFile()).getPath());
                    driver= new ChromeDriver();
        }*/
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.manage().window().maximize();
        return driver;
    }

    public static void quitDriver(WebDriver driver) {driver.quit();

    }

}
