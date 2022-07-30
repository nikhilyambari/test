package test_pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom_package.LogIn;

public class TestClass {       // this class contain test cases 

	
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Nilkhil\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
  driver.navigate().to("https://opensource-demo.orangehrmlive.com/");

   System.out.println("Validate Login functionality");   // these codes for test case1 
  LogIn login = new LogIn(driver);
  login.sendUsername();
  login.sendPassword();
  login.clickOnSignInButton();
 
  	
	}
}
