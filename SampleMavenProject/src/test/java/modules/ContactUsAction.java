package modules;

import org.openqa.selenium.WebDriver;
import pageobjects.LoginPage;

public class ContactUsAction {
	public static void Execute(WebDriver driver) throws Exception{
		LoginPage._contact_us.click();
		
	}
}
