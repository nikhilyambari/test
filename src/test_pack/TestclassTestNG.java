package test_pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom_package.HomePage;
import pom_package.LogIn;

public class TestclassTestNG {

WebDriver driver;  // Globally declared 
	
	@BeforeClass    // @ annotation to do something etc. Added and imported if from TestNG lib.
	public void beforeClass()   // these class name can be anything
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Nilkhil\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	
	}	
	
	@BeforeMethod 
	public void Login() {   // these class name can be anything
		//System.out.println("BeforeMethod");
	
		 LogIn login = new LogIn(driver);
		  login.sendUsername();
		  login.sendPassword();
		  login.clickOnSignInButton();
		}
	
	@Test
	public void ValidateHomePage() {   // only one test case ran and it's to validate HomePage
		       
		HomePage home = new HomePage(driver);
		home.validateAdminTab();
		home.validatePIMTab();
	}
		
	@AfterMethod
	public void afterMethod() {
		
		HomePage home = new HomePage(driver);
		home.ClickOnAvtar();
		home.ClickOnLogout();		
	}
	
	@AfterClass
	public void afterClass() {
		driver.quit(); // completely closes the browser
	}
	
	
}
