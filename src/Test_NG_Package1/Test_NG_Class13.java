package Test_NG_Package1;

import org.testng.annotations.Test;
import org.testng.annotations.Test;


public class Test_NG_Class13 {
	@Test
	public void homeOwners(){
		System.out.println("Home Test cases from Package1 Class13");
	}
	
	@Test(groups={"smoke"})
	public void condiminium(){
		System.out.println("Condo Test cases from Package1 Class13");
	}
	
	@Test
	public void renters(){
		System.out.println("Renters test cases from Package1 Class13");
	}

}
