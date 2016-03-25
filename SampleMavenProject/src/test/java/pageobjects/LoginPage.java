package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
	@FindBy(how=How.LINK_TEXT, using="Sign in")
	public static WebElement _signInLink;
	
	@FindBy(how=How.ID, using="email")
	public static WebElement _emailTextField;
	
	@FindBy(how=How.ID, using="passwd")
	public static WebElement _passwordTextField;
	
	@FindBy(how=How.ID, using="SubmitLogin")
	public static WebElement _submitLoginButton;
	
	@FindBy(how=How.LINK_TEXT, using="Sign out")
	public static WebElement _signoutLink;
	
	@FindBy(how=How.XPATH, using="//img[@alt='My Store']")
	public static WebElement _logoImage;
	
	@FindBy(how=How.LINK_TEXT, using="Contact us")
	public static WebElement _contact_us;
	
	@FindBy(how=How.LINK_TEXT, using="Women")
	public static WebElement _twitter_link;

}
