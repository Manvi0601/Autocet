package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown1 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("https://blazedemo.com/");
		Thread.sleep(2000);
		WebElement web=driver.findElement(By.className("form-inline"));
		Thread.sleep(2000);
        Select drpvalue= new Select(web);
        drpvalue.selectByValue("San Diego");
		Thread.sleep(2000);
		drpvalue.selectByValue("Paris");
		Thread.sleep(2000);
		drpvalue.selectByValue("Mexico City");
		Thread.sleep(2000);
		
		driver.quit();
		
	}
}
