package pom_package;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	WebDriver driver;
	WebDriverWait wait;
    @FindBy(xpath="//*[text()='Admin']")  
    private WebElement Admin;
    
    @FindBy(xpath="//*[text()='PIM']")
    private WebElement PIM;
    
    @FindBy(xpath="//a[@id='welcome']")
    private WebElement Avtar;  // component called as  Avtar
    
    @FindBy(xpath="//a[text()='Logout']")
    private WebElement Logout;
    
    public HomePage(WebDriver driver)  // constrcutor name same as classname 
    
    {
	  this.driver = driver;
    	PageFactory.initElements(driver,this);  
    	
    	wait = new WebDriverWait(driver,Duration.ofSeconds(20));
    	}
    
    public void validateAdminTab()
    {
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Admin']")));
    	Admin.isDisplayed();          
    }

    public void validatePIMTab()
    {
    	
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='PIM']")));
  
    	PIM.isDisplayed();
    }
    
    public void ClickOnAvtar()
    {
     	Avtar.click();
    }

    public void ClickOnLogout()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Logout']"))); // wait applied to find element without error
    	  Logout.click();
    }
	
	
	
	
}	

