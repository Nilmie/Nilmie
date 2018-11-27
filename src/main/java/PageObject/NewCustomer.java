package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.codearte.jfairy.Fairy;

public class NewCustomer {
	
	WebDriver driver;
	Fairy fairy = Fairy.create();
	
	//  By Title = By.name("title");
	//  By firstname = By.name("firstname");
	//  By lastname = By.name("lastname");
	//  By phone = By.name("phone");
	 // By BirthYear = By.name("year");
	//  By BirthMonth = By.name("month");
	//  By BirthDate = By.name("date");
	//  By LicenseType = By.name("licencetype");
	//  By licenceperiod = By.name("licenceperiod");
	//  By occupation = By.name("occupation");
	//  By address = By.name("street");
	//  By city = By.name("city");
	//  By County = By.name("county");
	//  By post_code = By.name("post_code");
	//  By email = By.name("email");
	 // By password = By.name("password");
	//  By c_password = By.name("c_password");
	  By createUserButton = By.name("submit");

	  
    public NewCustomer(WebDriver driver){

        this.driver = driver;

      
    }
    
    public void createNewCustomer()
    {
  //  	Person person = fairy.person();
    	
		Select Title = new Select(driver.findElement(By.id("user_title")));
		Title.selectByVisibleText("Mrs");
		Title.selectByIndex(1);
		
		driver.findElement(By.id("user_firstname")).sendKeys("Nilmie");
		driver.findElement(By.id("user_surname")).sendKeys("Gamhewa");
		driver.findElement(By.id("user_phone")).sendKeys("0772273515");
		
		
		Select BirthYear = new Select(driver.findElement(By.id("user_dateofbirth_1i")));
		BirthYear.selectByVisibleText("1988");
		
		Select BirthMonth = new Select(driver.findElement(By.id("user_dateofbirth_2i")));
		BirthMonth.selectByVisibleText("January");
		
		Select BirthDate = new Select(driver.findElement(By.id("user_dateofbirth_3i")));
		BirthDate.selectByVisibleText("21");
		
		//driver.findElement(By.id("licencetype_t")).sendKeys("Full");
		driver.findElement(By.xpath("//label[@for='licencetype_t']")).click();
		
		
		//WebElement Full = driver.findElement(By.id("licencetype_t"));
		//WebElement Provisional = driver.findElement(By.id("licencetype_f"));
		
		//Provisional.click();
		
	
		Select licenceperiod = new Select(driver.findElement(By.id("user_licenceperiod")));
		licenceperiod.selectByVisibleText("1");

		Select occupation = new Select(driver.findElement(By.id("user_occupation_id")));
		occupation.selectByVisibleText("Student");
		
		driver.findElement(By.id("user_address_attributes_street")).sendKeys("Pannipitiya");
		driver.findElement(By.id("user_address_attributes_city")).sendKeys("Maharagama");
		driver.findElement(By.id("user_address_attributes_county")).sendKeys("Sri Lanka");
		driver.findElement(By.id("user_address_attributes_postcode")).sendKeys("10230");
		driver.findElement(By.id("user_user_detail_attributes_email")).sendKeys("nilmie.gamhewa@gmail.com");
		driver.findElement(By.id("user_user_detail_attributes_password")).sendKeys("1234");
		driver.findElement(By.id("user_user_detail_attributes_password_confirmation")).sendKeys("1234");
    	driver.findElement(createUserButton).click();
  
    }
    
    public void navigateNewCustomer(WebDriver driver)
    {
    	driver.navigate().to("http://demo.guru99.com/insurance/v1/register.php");
    }
    

}