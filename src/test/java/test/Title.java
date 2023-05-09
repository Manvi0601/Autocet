package test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Title {
	WebDriver driver;
	 
	 @BeforeTest
	 public void beforeTest()
	 {
		 WebDriverManager.chromedriver().setup();
		 driver= new ChromeDriver();
		 driver.get("https://www.saucedemo.com/");
	 }
	 @Test(priority=3)
	 public void title()
	 {
		 String Expectedtitle= "Swag Labs";
	     String Actualtitle= driver.getTitle();
	     assertEquals(Expectedtitle,Actualtitle);
			assertTrue(true);
	 }
	 @AfterTest
	 public void tearDown() throws InterruptedException
	 {
		 Thread.sleep(2000);
		 driver.close();
	 }
}
