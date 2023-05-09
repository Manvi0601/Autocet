package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
	List<WebElement> checkbox= driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
        System.out.println(checkbox.size());
        for(WebElement box: checkbox)
        {
        	String ele= box.getAttribute("id");
        	System.out.println(ele);
        	if(ele.equals("monday")|| ele.equals("tuesday"))
        	{
        	box.click();
        	}
        }
        	
        Thread.sleep(2000);
        driver.close();
	}

}
