package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day1 {
   
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.facebook.com/login");
		String Expectedurl= "https://www.facebook.com/login";
		String Actualurl= driver.getCurrentUrl();
		if(Expectedurl.equals(Actualurl))
		{
			System.out.println("Correct page");
		}
		else
		{
			System.out.println("Incorrect page");
		}
		String Expectedtitle= "Log in to Facebook";
		String Actualtitle= driver.getTitle();
		if(Expectedtitle.equals(Actualtitle))
		{
			System.out.println("correct pagee");
		}
		else
		{
			System.out.println("Incorrect pagee");
		}
		Thread.sleep(5000);
		
		WebElement ele= driver.findElement(By.id("email"));
		ele.sendKeys("rajputmanvi337@gmail.com");
		Thread.sleep(5000);
		
		WebElement ele1= driver.findElement(By.id("pass"));
		ele1.sendKeys("Honeybee@4567");
		Thread.sleep(5000);

		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(5000);
		
		driver.close();
	}
}
