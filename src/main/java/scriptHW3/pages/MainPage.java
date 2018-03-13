package scriptHW3.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {
    private WebDriver driver;
    private By loutIMG= By.id("header_employee_box");
    private By loutBtn= By.id("header_logout");
   // private By ordersTab= By.id("subtab-AdminParentOrders");

    public MainPage(WebDriver driver){this.driver=driver;}
    public void clickloutIMG(){
        WebDriverWait wait=new WebDriverWait(driver,100);
        wait.until(ExpectedConditions.elementToBeClickable(loutIMG));
        driver.findElement(loutIMG).click();}
    public void clickloutBtn(){
        WebDriverWait wait=new WebDriverWait(driver,100);
        wait.until(ExpectedConditions.elementToBeClickable(loutBtn));
        driver.findElement(loutBtn).click();}
}
