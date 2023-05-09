package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class saucedemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.saucedemo.com/");
		String Expectedurl= "https://www.saucedemo.com/";
		String Actualurl= driver.getCurrentUrl();
		if(Expectedurl.equals(Actualurl))
		{
			System.out.println("Correct page");
		}
		else
		{
			System.out.println("Incorrect page");
		}
		String Expectedtitle= "Swag Labs";
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
		
		WebElement ele= driver.findElement(By.id("user-name"));
		ele.sendKeys("standard_user");
		Thread.sleep(5000);
		
		WebElement ele1= driver.findElement(By.id("password"));
		ele1.sendKeys("secret_sauce");
		Thread.sleep(5000);

		driver.findElement(By.id("login-button")).click();
		Thread.sleep(5000);
		
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.id("checkout")).click();
		Thread.sleep(5000);
		
		WebElement ele2= driver.findElement(By.id("first-name"));
		ele2.sendKeys("Manvi");
		Thread.sleep(5000);
		WebElement ele3= driver.findElement(By.id("last-name"));
		ele3.sendKeys("Rajput");
		Thread.sleep(5000);
		WebElement ele4= driver.findElement(By.id("postal-code"));
		ele4.sendKeys("121002");
		Thread.sleep(5000);
		driver.findElement(By.id("continue")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.id("finish")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.id("back-to-products")).click();
		Thread.sleep(5000);
		
		driver.close();

	}

}
