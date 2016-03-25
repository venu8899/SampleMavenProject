package modules;

import org.openqa.selenium.WebDriver;

import pageobjects.LoginPage;

public class SignoutAction {
	
	public static void Execute(WebDriver driver) throws Exception{
		LoginPage._signoutLink.click();
	}

}
