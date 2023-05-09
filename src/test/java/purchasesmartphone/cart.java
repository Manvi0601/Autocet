package purchasesmartphone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class cart {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/cart.html");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button")).click();

		Thread.sleep(2000);

		WebElement ele = driver.findElement(By.id("name"));

		ele.sendKeys("Nutan");
		
		Thread.sleep(2000);

		WebElement ele1 = driver.findElement(By.id("country"));

		ele1.sendKeys("India");
		
		Thread.sleep(2000);

		WebElement ele3 = driver.findElement(By.id("city"));

		ele3.sendKeys("Noida");
		
		Thread.sleep(2000);

		WebElement ele4 = driver.findElement(By.id("card"));

		ele4.sendKeys("Visa");
		
		Thread.sleep(2000);

		WebElement ele5 = driver.findElement(By.id("month"));

		ele5.sendKeys("agugust");
		
		Thread.sleep(2000);

		WebElement ele6 = driver.findElement(By.id("year"));

		ele6.sendKeys("2023");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]")).click();
		
		Thread.sleep(2000);
		driver.close();

	}
}
