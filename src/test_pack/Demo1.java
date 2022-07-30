package test_pack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo1 {
	
	@BeforeClass    
	public void beforeClass()   
	{
		System.out.println("beforeClass_Demo1");
	}	
	
	@BeforeMethod 
	public void beforeMethod() {   
	
		System.out.println("beforeMethod_Demo1");
	}
	
	@Test  
	public void test1() {   
		       
		System.out.println("test1_Demo1");
	}
	
	@Test
	public void test2()  {   
		       
		System.out.println("test2_Demo1");
		
	}
	
	
	@AfterMethod
	public void afterMethod() {
		
		System.out.println("afterMethod_Demo1");		
	}
	
	@AfterClass
	public void afterClass() {
		
		System.out.println("afterClass_Demo1");
		
	}
	
}
	
	
	
	
	
	
	




