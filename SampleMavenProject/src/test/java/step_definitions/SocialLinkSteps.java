package step_definitions;

import org.openqa.selenium.WebDriver;

import pageobjects.LoginPage;
import cucumber.api.java.en.Then;

public class SocialLinkSteps {


	    public WebDriver driver;


	    public SocialLinkSteps()
	    {
	        driver = Hooks.driver;
	    }

	    @Then("^I perform Social link actions$")
	    public void i_perform_Social_link_actions() throws Throwable {
	    	LoginPage._twitter_link.click();
	    }
	    

	}
