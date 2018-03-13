package scriptHW3.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class MainPage {
    private WebDriver driver;
    private By category= By.id("subtab-AdminCatalog");
    private By newCategory= By.id("page-header-desc-category-new_category");
   private By nameCategory= By.id("name_1");
    private String name="Бытовая техника";
    private By submitCategory= By.id("category_form_submit_btn");
    private By alertMes= By.className("alert-success");
    private By filtrCategory= By.className("title_box");
    private By waitCategory= By.className("pointer");


    public MainPage(WebDriver driver){this.driver=driver;}
    public void nameCategory(){
        WebDriverWait wait=new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.elementToBeClickable(nameCategory));
        driver.findElement(nameCategory).sendKeys(name);}
    public void alertSuccess(){
        WebDriverWait wait=new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.elementToBeClickable(alertMes));
        if (driver.findElement(alertMes).getText().equals("Создано"));
        System.out.println("Категория "+name+" создана");}
    public void addCategory(){
        WebDriverWait wait=new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.elementToBeClickable(newCategory));
        driver.findElement(newCategory).click();}
    public void submitCategory(){
        WebDriverWait wait=new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.elementToBeClickable(submitCategory));
        driver.findElement(submitCategory).click();}
    public void filterCategory(){
                driver.findElements(filtrCategory).get(1).click();}
    public void waitCategory(){
        WebDriverWait wait=new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.elementToBeClickable(waitCategory));
        List<WebElement> elements =driver.findElements(waitCategory);
        ArrayList<String> names=new ArrayList<String>();
        for(WebElement x : elements)
        {
            names.add(x.getText());}
        for (String x: names){

      if(x.equals(name))
          System.out.println("Категория "+name+" отфильтрована");}}

    public void selectCategory(){
        WebDriverWait wait=new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.elementToBeClickable(category));
        WebElement element=driver.findElement(category);
    Actions actions=new Actions(driver);
    actions.moveToElement(element).build().perform();
    element.findElements(By.cssSelector("li")).get(1).click();}
}
