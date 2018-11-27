package Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.*;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

import PageObject.HomePage;
import PageObject.Login;
import PageObject.NewCustomer;
import PageObject.Register;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {
		WebDriver driver;
		Login objLogin;
	    HomePage objHomePage;
	    NewCustomer objNewCustomer;
	    Register objRegister;

	    @BeforeTest

	    public void setup()
	    {

	       // System.setProperty("webdriver.chrome.driver","C:\\chromedrv\\chromedriver.exe");
	    	WebDriverManager.chromedriver().setup();
	      // driver = new ChromeDriver();
	        
	    	//Maximize Window Opt 01
	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("--start-maximized");
	        driver = new ChromeDriver(options);
	        
	        //Maximize Window Opt 02
	        // driver.manage().window().maximize();

	        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	        driver.get("http://demo.guru99.com/insurance/v1/index.php");

	    }

	    /**

	     * This test go to http://demo.guru99.com/V4/

	     * Verify login page title as guru99 bank

	     * Login to application

	     * Verify the home page using Dashboard message

	     */

	    @org.testng.annotations.Test(priority=0)

	    public void test_Home_Page_Appear_Correct(){

	        //Create Login Page object
	    	
	   // objRegister = new Register(driver);
	    
	    objNewCustomer = new NewCustomer (driver);
	    objNewCustomer.navigateNewCustomer(driver);
	    objNewCustomer.createNewCustomer();
	    
	    
	    

	    objLogin = new Login(driver);

	    //Verify login page title

//	    String loginPageTitle = objLogin.getLoginTitle();

//	    Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru99 bank"));

	    //login to application

    objLogin.loginToGuru99("nilmie.gamhewa@gmail.com", "1234");

	    // go the next page

    objHomePage = new HomePage(driver);

	    //Verify home page
	   	    
	    
	  
	  Assert.assertTrue(objHomePage.getHomePageDashboardUserName().toLowerCase().contains("nilmie.gamhewa@gmail.com : 1234"));

	    }
}
