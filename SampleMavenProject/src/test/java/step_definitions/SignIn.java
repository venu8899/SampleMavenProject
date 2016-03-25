package step_definitions;

import java.util.concurrent.TimeUnit;

import modules.ContactUsAction;
import modules.SignInAction;
import modules.SignoutAction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import pageobjects.LoginPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class SignIn {
	
	public WebDriver driver;
	
	
	
	
	public SignIn(){
		driver = Hooks.driver;
		//System.setProperty("webdriver.chrome.driver","C://selenium-2.44.0/chromedriver.exe");
    	//driver = new ChromeDriver();
    	driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
		
	@When("^I open automationpractice website$")
    public void i_open_automationpractice_website() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	driver.get("http://automationpractice.com");
    }

    @When("^I sign in$")
    public void i_sign_in() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
		PageFactory.initElements(driver, LoginPage.class);
		SignInAction.Execute(driver);
    }

    @Then("^I sign out$")
    public void i_sign_out() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	SignoutAction.Execute(driver);
    }
    
    @Then("^I perform contact us actions$")
    public void I_perform_contact_us_actions() throws Throwable {
        ContactUsAction.Execute(driver);

    }
}