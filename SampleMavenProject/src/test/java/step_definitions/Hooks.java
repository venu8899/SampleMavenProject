package step_definitions;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.Before;


public class Hooks {
	
	
    public static WebDriver driver=new FirefoxDriver();
    
    /*
    @Before
	public void openBrowser() throws MalformedURLException {
		System.setProperty("webdriver.chrome.driver","C://selenium-2.44.0/chromedriver.exe");
    	driver = new ChromeDriver();
    	System.out.println("Called openBrowser1");
    	driver.manage().window().maximize();
    }
    */
    
}