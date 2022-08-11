package genaric;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


	public class base_Test 
	{
		public WebDriver driver;
		@BeforeClass(alwaysRun=true)
		public void browser_Setup()
		{
		    System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		}
	
		
		@AfterClass(alwaysRun=true)
		public void browser_tear_down()
		{
			driver.quit();
		}
	}


