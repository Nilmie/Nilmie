package ReadExcel;
import org.testng.Assert;
import org.testng.annotations.Test;

import ReadExcel.ExcelRead;

import java.io.IOException;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Read {

@Test
	
	public void testSearch() throws IOException
	{
	WebDriver driver;
	ExcelRead excel = new ExcelRead();
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	//driver.get("http://www.google.lk");
	driver.get(excel.readExcel(1,0, ".\\Data\\data.xlsx","Sheet1"));
	
		
	driver.findElement(By.id("lst-ib")).sendKeys(excel.readExcel(1, 1, ".\\Data\\data.xlsx", "Sheet1"));
	driver.findElement(By.name("btnK")).click();
	
	
		//driver.findElement(By.linkText("Selenium - Web Browser Automation"));
		//driver.findElement(By.xpath("//h3[@class='LC20lb']")).click();
		//String webTitle = driver.getTitle();
		//Assert.assertEquals(webTitle, "Selenium - Web Browser Automation");
		driver.close();
		driver.quit();
		
	}
}
