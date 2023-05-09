package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verifylogin {
	WebDriver driver;
	 
	 @BeforeTest
	 public void beforeTest()
	 {
		 WebDriverManager.chromedriver().setup();
		 driver= new ChromeDriver();
		 driver.get("https://www.saucedemo.com/");
	 }
	 @Test(priority=3)
	 public void login() throws InterruptedException
	 {
		 WebElement ele= driver.findElement(By.id("user-name"));
			ele.sendKeys("standard_user");
			Thread.sleep(2000);
			
			WebElement ele1= driver.findElement(By.id("password"));
			ele1.sendKeys("secret_sauce");
			Thread.sleep(2000);

			driver.findElement(By.id("login-button")).click();
			Thread.sleep(2000); 
	 }
	 @AfterTest
	 public void tearDown() throws InterruptedException
	 {
		 Thread.sleep(2000);
		 driver.close();
	 }
}
