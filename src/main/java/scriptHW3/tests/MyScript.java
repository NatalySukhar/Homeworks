package scriptHW3.tests;

import org.openqa.selenium.WebDriver;
import scriptHW3.pages.Login;
import scriptHW3.pages.MainPage;
import scriptHW3.utils.DriverScript;

public class MyScript extends DriverScript {
    public static void main(String[] args)  {
        WebDriver driver=getDriver();
        Login login=new Login(driver);
        login.open();
        login.makeEInput();
        login.makePInput();
        login.submitLogin();
        MainPage mainPage=new MainPage(driver);
        mainPage.clickloutIMG();
        mainPage.clickloutBtn();
        quitDriver(driver);
}}
