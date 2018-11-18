package stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObject.HomePage;
import PageObject.LoginJava;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	
	WebDriver driver;
	LoginJava objLogin;
    HomePage objHomePage;
	
	@Given("^I have user name and password$")
	public void i_have_user_name_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/V4/");
		
		
	    
	   // objLogin.loginToGuru99("mgr123", "mgr!23");
	    
	    
	    
	}

	@When("^I successfully login$")
	public void i_successfully_login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		objLogin = new LoginJava(driver);
		String loginPageTitle = objLogin.getLoginTitle();
	    Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru99 bank"));
		objLogin.loginToGuru99("mgr123", "mgr!23");
	   
	}

	@Then("^I should navigate to the home page$")
	public void i_should_navigate_to_the_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		objHomePage = new HomePage(driver);
		
	   Assert.assertTrue(objHomePage.getHomePageDashboardUserName().toLowerCase().contains("manger id : mgr123"));
		
	}
}
