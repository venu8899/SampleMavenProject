package modules;


import org.openqa.selenium.WebDriver;
import pageobjects.LoginPage;

public class SignInAction {
	public static void Execute(WebDriver driver) throws Exception{
		LoginPage._signInLink.click();
		LoginPage._emailTextField.sendKeys("rohittech@mailinator.com");
		LoginPage._passwordTextField.sendKeys("12345");
		LoginPage._submitLoginButton.click();
	}

}
