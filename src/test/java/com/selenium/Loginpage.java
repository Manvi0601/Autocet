package com.selenium;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Loginpage {
 WebDriver driver;
 
 @BeforeTest
 public void setup()
 {
	 WebDriverManager.chromedriver().setup();
	 driver= new ChromeDriver();
	 driver.get("https://www.saucedemo.com/");
 }
 @Test(priority=3)
 public void verifyUrl()
 {
	 String Expectedurl= "https://www.saucedemo.com/";
		String Actualurl= driver.getCurrentUrl();
		assertEquals(Expectedurl,Actualurl);
		assertTrue(true);
 }
 @Test(priority=2)
 public void verifyTitle()
 {
	 String Expectedtitle= "Swag Labs";
     String Actualtitle= driver.getTitle();
     assertEquals(Expectedtitle,Actualtitle);
		assertTrue(true);
 }
 @Test(priority=1)
 public void login() throws InterruptedException
 {
	 WebElement ele= driver.findElement(By.id("user-name"));
		ele.sendKeys("standard_user");
		Thread.sleep(5000);
		
		WebElement ele1= driver.findElement(By.id("password"));
		ele1.sendKeys("secret_sauce");
		Thread.sleep(5000);

		driver.findElement(By.id("login-button")).click();
		Thread.sleep(5000);
 }
 @AfterTest
 public void tearDown()
 {
	 driver.close();
 }
}
