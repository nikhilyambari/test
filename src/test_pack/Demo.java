package test_pack;

import org.testng.Assert;  // imported for Assert.fail
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Demo {
	
	@BeforeClass    // @ annotation to do something etc. Added and imported if from TestNG lib.
	public void beforeClass()   // these class name can be anything
	{
		System.out.println("beforeClass");
	}	
	
	@BeforeMethod 
	public void beforeMethod() {   
	
		System.out.println("beforeMethod");
	}
	
//	@Test (priority=3)  //  In case, priority of test cases are same then goes alphabetical order
//	@Test(dependsOnMethods= {"test3"}) // this test depends on test3 that means test3 should run first and then this one for checking dependancy
	// for ex.test3 has login and test1 has homepage to check 
	@Test (enabled=false)  // =false Means diabled.If we don't wanna run this test or it's under progress has some bugs or breaks functionality etc.
	public void test1() {   
		       
		System.out.println("test1");
	}
	
//	@Test (priority=2 , invocationCount=2)  // invocationCount is used to execute no. of times test can execute
	// we can also write comma separated priority 
	// priority keyword is used when we need to execute test case by priority.
	@Test(timeOut=2000) // TimeOut is given to this test for 2 sec and then timed out
	public void test2() throws InterruptedException {   
		       
		System.out.println("test2");
		Thread.sleep(3000);
	}
	
	@Test (priority=-2)
	// Less the number higher will be the priority of that test case.0 is high and 1 is next to it then 2 & so on.
	public void test3() {   
		       
		System.out.println("test3"); // this has by default 0 priority if not given
// Assert.fail(); // if we want to fail the test case this method used and test1 is depended on test3 so that it was skipped
		// assert.fail executed after printing "test3" here as java works from left to right
		// Assert class also imported from testNG automatically
	}
	
	@AfterMethod
	public void afterMethod() {
		
		System.out.println("afterMethod");		
	}
	
	@AfterClass
	public void afterClass() {
		
		System.out.println("afterClass");
		
	}
	
	
}

	
	

