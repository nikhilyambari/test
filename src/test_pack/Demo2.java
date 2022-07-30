package test_pack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo2 {       // Please refer testing.xml program for ref. This class Demo2 and Demo1 are at a time executed with the help of TestNG Suite
	// We have converted our whole project on right click and "convert to TestNG". This suite is used to execute multiple classes 
   
   @BeforeSuite
   public void beforeSuite() {
	   System.out.println("beforeSuite_Demo2");  // Runs from start of suite  in XML code
   }
   
   @BeforeTest
   public void beforeTest() {
	   System.out.println("beforeTest_Demo2");  // Runs from start of test tagname  in XML code
   }
	
	@BeforeClass    
	public void beforeClass()   
	{
		System.out.println("beforeClass_Demo2");
	}	
	
	@BeforeMethod 
	public void beforeMethod() {   
	
		System.out.println("beforeMethod_Demo2");
	}
	
	@Test  
	public void test1() {   
		       
		System.out.println("test1_Demo2");
	}
	
	@Test
	public void test2()  {   
		       
		System.out.println("test2_Demo2");
		}
	
	@AfterMethod
	public void afterMethod() {
		
		System.out.println("afterMethod_Demo2");		
	}
	
	@AfterClass
	public void afterClass() {
		
		System.out.println("afterClass_Demo2");
		
	}
	
	@AfterTest
	   public void AfterTest() {
		   System.out.println("afterTest_Demo2");  // Runs from start of test tagname  in XML code
	   }
		
	@AfterSuite                  // Runs after end of suite in XML code
	   public void afterSuite() {
		   System.out.println("afterSuite_Demo2");
	   }
	
}
