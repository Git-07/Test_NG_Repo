package Test_NG_Package2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org. openqa.selenium.WebDriver;
public class Test_NG_Class21 {

		@Test (groups={"smoke"})
		public void auto(){
			System.out.println("Auto Test cases from Package2 Class21");
			System.setProperty("webdriver.chrome.driver","D:\\software\\chromedriver_win320\\chromedriver.exe");			
			ChromeOptions options = new ChromeOptions();
		    options.setExperimentalOption("useAutomationExtension", false);
		    options.addArguments("start-maximized");
		    WebDriver driver = new ChromeDriver(options);
		    driver.manage().window().maximize();
			driver.get("https://google.com");			
			//driver.close();
			
		}
		
/*		@Test
		public void boat(){
			System.out.println("Boat Test cases from Package2 Class21");
		}*/
/*		@BeforeTest
		public void beforeTest(){
			System.out.println("Before Test method from Package2 Class21");
			
		}
		@AfterTest
		public void afterTest(){
			System.out.println("After Test method from Package2 Class21");
			
		}
		@BeforeSuite
		public void beforeSuite(){
			System.out.println("Set global environment details of Package2 Class21");
		}
		@AfterSuite
		public void afterSuite(){
			System.out.println("Delete global environment details of Package2 Class21");
		}
		@BeforeClass
		public void beforeClass(){
			System.out.println("Before executing any method of the Package2 Class21");
		}	*/
		
				
}
