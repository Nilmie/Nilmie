package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Register {
	
	 WebDriver driver;
	 
 
	 public Register(WebDriver driver)
	 {

	        this.driver = driver;
	        //driver.findElement(By.xpath("//a[contains(@href='register.php')]")).click();
	        driver.findElement(By.xpath("//a[@href='register.php']")).click();

	      
	  }
	 
	  //public void clickRegister()
	 // {
	 // driver.findElement(By.xpath("//a[contains(@href='register.php')]")).click();
	  
	//  }
	  

	  
}
