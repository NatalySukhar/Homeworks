package scriptHW3.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import scriptHW3.pages.Login;
import scriptHW3.pages.MainPage;
import scriptHW3.DriverScript;

public class MyScript extends DriverScript {
    public static void main(String[] args)  {
        WebDriver driver=getDriver();
        Login login=new Login(driver);
        login.open();
        login.makeEInput();
        login.makePInput();
        login.submitLogin();
        MainPage mainPage=new MainPage(driver);
        mainPage.selectCategory();
        mainPage.addCategory();
        mainPage.nameCategory();
        mainPage.submitCategory();
        mainPage.alertSuccess();
        mainPage.filterCategory();
        mainPage.waitCategory();
        quitDriver(driver);

}}
