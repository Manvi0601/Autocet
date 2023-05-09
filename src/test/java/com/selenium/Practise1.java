package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practise1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		WebElement ele= driver.findElement(By.id("name"));
		ele.sendKeys("Manvi");
		Thread.sleep(2000);
		
		WebElement ele1= driver.findElement(By.id("phone"));
		ele1.sendKeys("9871192668");
		Thread.sleep(2000);
		
		WebElement ele2= driver.findElement(By.id("email"));
		ele2.sendKeys("manvirajput601@gmail.com");
		Thread.sleep(2000);
		
		WebElement ele3= driver.findElement(By.id("password"));
		ele3.sendKeys("honeybee@4567");
		Thread.sleep(2000);
		
		WebElement ele4= driver.findElement(By.id("address"));
		ele4.sendKeys("377 Sector-18");
		Thread.sleep(2000);
		
		driver.findElement(By.name("submit")).click();
		Thread.sleep(2000);
		
		WebElement web=driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/select"));
		valueselect(web,"Norway");
		Thread.sleep(2000);
		
		driver.close();

	}
	
	public static void valueselect(WebElement el, String val)
	{
		Select drp= new Select(el);
		List<WebElement> everyvalue= drp.getOptions();
		for(WebElement value: everyvalue)
		{
			if(value.getText().equals(val))
			{
				value.click();
				break;
			}
		}
	}

}
