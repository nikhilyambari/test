package pom_package;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogIn {      // This class contain different declared methods maintained 

	WebDriver driver;
	WebDriverWait wait;  // gloabally declared 
    @FindBy(xpath="//input[@id='txtUsername']")  // @ is annotation for find something
    private WebElement UserName;
    
    @FindBy(xpath="//input[@id='txtPassword']")
    private WebElement Password;
    
    @FindBy(xpath="//input[@id='btnLogin']")
    private WebElement SignInButton;
    
    public LogIn(WebDriver driver)  //given public access specifier as we are calling it from outside the package 
    // parameterized constructor called with args to equal the driver value 
    
    {
	  this.driver = driver;
    	PageFactory.initElements(driver,this);  // Login constructor and it's method. "This" keyword points to
	  // global data members in 1st class LogIn. With help of initelements elements automatically locate and
	  //initialize their values without throwing an error
    	
    	wait = new WebDriverWait(driver,Duration.ofSeconds(20));//wait value initiated in this constructor
	}
    
    public void sendUsername()
    {
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='txtUsername']")));
    	UserName.sendKeys("Admin");            
    }

    public void sendPassword()
    {
    	
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='txtPassword']")));
  
    	Password.sendKeys("admin123");
    }
    
    public void clickOnSignInButton()
    {
    	SignInButton.click();
}

}



