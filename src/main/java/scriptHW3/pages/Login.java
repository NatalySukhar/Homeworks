package scriptHW3.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class Login {
    private WebDriver driver;
    private By eInput= By.id("email");
    private By pInput= By.id("passwd");
    private By loginBtn= By.name("submitLogin");
    private String email="webinar.test@gmail.com";
    private String password="Xcg7299bnSmMuRLp9ITw";
    public Login(WebDriver driver){this.driver=driver;}

    public void open(){ driver.navigate().to("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");}//driver.get(Properties.getBaseAdminDir());}
    public void makeEInput(){driver.findElement(eInput).sendKeys(email);}
    public void makePInput(){driver.findElement(pInput).sendKeys(password);}
    public void submitLogin(){driver.findElement(loginBtn).click();}

}
