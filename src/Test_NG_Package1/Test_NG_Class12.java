package Test_NG_Package1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.Test;


public class Test_NG_Class12 {
	
	@Test(groups={"smoke"})
	public void homeOwners(){
		System.out.println("Home Test cases from Package1 Class12");
	}
	
	@Test
	public void condiminium(){
		System.out.println("Condo Test cases from Package1 Class12");
	}
	
	@Test
	public void renters(){
		System.out.println("Renters test cases from Package1 Class12");
	}
	@DataProvider
	public Object[][] getData(){		
		// when we need to test with multiple data combinations.
		Object[][] data = new Object[3][2];
		data[0][0] = "Mohit";
		data[0][1] = "Password";
		data[1][0] = "Latwal";
		data[1][1] = "Pass";
		data[2][0] = "Singh";
		data[2][1] = "password";
		return data;
	}
	   
		@Test(dataProvider="getData")
		public void  enterUserNameAndPass(String str1, String str2){
			System.out.println(str1);
			System.out.println(str2);
			
		}

}
