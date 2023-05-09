package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Radiobutton1 {
	WebDriver driver;
	 @BeforeClass
	 public void beforeClass()
	 {
		 System.out.println("before class");
	 }
	 @BeforeMethod
	 public void beforeMethod()
	 {
		 System.out.println("before method");
	 }
	 @BeforeTest
	 public void beforeTest()
	 {
		 WebDriverManager.chromedriver().setup();
		 driver= new ChromeDriver();
		 driver.get("https://itera-qa.azurewebsites.net/home/automation");
		 System.out.println("before test");
	 }
	 @Test
	 public void radio1()
	 {
		 List<WebElement> radio= driver.findElements(By.xpath("//input[@type='radio' and contains(@id,'ale')]"));
	        System.out.println(radio.size());
	        for(WebElement btn: radio)
	        {
	        	String ele= btn.getAttribute("id");
	        	System.out.println(ele);
	        	if(ele.equals("female"))
	        	{
	        	btn.click();
	        	}
	        }
	 }
	 @AfterClass
	 public void afterClass()
	 {
		 System.out.println("after class");
	 }
	 @AfterMethod
	 public void aferMethod()
	 {
		 System.out.println("after method");
	 }
	 @AfterTest
	 public void tearDown() throws InterruptedException
	 {
		 Thread.sleep(2000);
		 driver.close();
		 System.out.println("after test");
	 }
	 
}
