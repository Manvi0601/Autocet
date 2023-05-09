import java.io.File;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Flightpurchase {
	public static void main(String[] args) throws Exception {
		ScreenRecorderUtil.startRecord("main");
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("https://blazedemo.com/");
		Thread.sleep(2000);
		WebElement web=driver.findElement(By.xpath("/html/body/div[3]/form/select[1]"));
		valueselect(web,"Boston");
		Thread.sleep(2000);
		WebElement web1=driver.findElement(By.xpath("/html/body/div[3]/form/select[2]"));
		valueselect(web1,"London");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/form/div/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[1]/td[1]/input")).click();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.id("inputName"));
		ele.sendKeys("Manvi Rajput");
		Thread.sleep(2000);
		WebElement ele1 = driver.findElement(By.id("address"));
		ele1.sendKeys("377 Sector-18");
		Thread.sleep(2000);
		WebElement ele2 = driver.findElement(By.id("city"));
		ele2.sendKeys("Faridabad");
		Thread.sleep(2000);
		WebElement ele3 = driver.findElement(By.id("state"));
		ele3.sendKeys("Haryana");
		Thread.sleep(2000);
		WebElement ele4 = driver.findElement(By.id("zipCode"));
		ele4.sendKeys("121002");
		Thread.sleep(2000);
		WebElement web2=driver.findElement(By.xpath("/html/body/div[2]/form/div[6]/div/select"));
		valueselect(web2,"American Express");
		WebElement ele5 = driver.findElement(By.id("creditCardNumber"));
		ele5.sendKeys("1234 5678 9000");
		Thread.sleep(2000);
		WebElement ele6 = driver.findElement(By.id("creditCardMonth"));
		ele6.sendKeys("January");
		Thread.sleep(2000);
		WebElement ele7 = driver.findElement(By.id("creditCardYear"));
		ele7.sendKeys("2024");
		Thread.sleep(2000);
		WebElement ele8 = driver.findElement(By.id("nameOnCard"));
		ele8.sendKeys("Manvi Rajput");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/form/div[11]/div/input")).click();
		Thread.sleep(2000);
		
		TakesScreenshot sc= ((TakesScreenshot)driver);
		File src= sc.getScreenshotAs(OutputType.FILE);
		File f2= new File("C:\\image\\image1.png");
		FileUtils.copyFile(src, f2);
		ScreenRecorderUtil.stopRecord();
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
