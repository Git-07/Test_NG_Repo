package Test_NG_Package1;

import org.testng.annotations.Test;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Test_NG_Class11 {
	

    @Parameters({"URL","Name"})
	@Test (invocationCount =2 , priority =1)
	public void homeOwners(String urlName, String Name){
		System.out.println("Home Test cases from Package1 Class11");
		System.out.println(urlName);
		System.out.println(Name);
	}
	
	@Test(dependsOnMethods={"renters"})
	public void condiminium(){
		System.out.println("Condo Test cases from Package1 Class11");
	}
	//(groups={"smoke"})
	@Parameters({"URL","Name"})
	@Test
	public void renters(String urlName ,String Name){
		System.out.println("Renters test cases from Package1 Class11");
		System.out.println(urlName);
		System.out.println(Name);
	}
	
	@BeforeTest
	public void beforeTest(){
		System.out.println("Before Test method from Package1 Class11");
		
	}
	@AfterTest
	public void afterTest(){
		System.out.println("After Test method from Package1 Class11");
		
	}
	@BeforeSuite
	public void beforeSuite(){
		System.out.println("Set global environment details of Package1 Class11");
	}
	@AfterSuite
	public void afterSuite(){
		System.out.println("Delete global environment details of Package1 Class11");
	}
	@BeforeClass
	public void beforeClass(){
		System.out.println("Before executing any method of the Package1 Class11");
	}
		
}
