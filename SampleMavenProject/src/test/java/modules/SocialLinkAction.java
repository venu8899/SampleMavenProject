package modules;

import org.openqa.selenium.WebDriver;

import pageobjects.LoginPage;

public class SocialLinkAction {
	@SuppressWarnings("deprecation")
	public static void Execute(WebDriver driver) throws Exception{
		LoginPage._twitter_link.click();
	}
}
