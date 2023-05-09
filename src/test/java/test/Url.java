package test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Url {
	WebDriver driver;
	 
	 @BeforeTest
	 public void beforeTest()
	 {
		 WebDriverManager.chromedriver().setup();
		 driver= new ChromeDriver();
		 driver.get("https://www.saucedemo.com/");
	 }
	 @Test(priority=3)
	 public void urls()
	 {
		 String Expectedurl= "https://www.saucedemo.com/";
			String Actualurl= driver.getCurrentUrl();
			assertEquals(Expectedurl,Actualurl);
			assertTrue(true);
	 }
	 @AfterTest
	 public void tearDown() throws InterruptedException
	 {
		 Thread.sleep(2000);
		 driver.close();
	 }
}
