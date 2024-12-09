package test.SeleniumTrainingBesantTech;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserLaunch {
	
	WebDriver browser = null;
	
	public void launchBrowser(String browserURL) {		
		
		if (browserURL.equalsIgnoreCase("chrome")) {
			browser = new ChromeDriver();
		}
		
		if (browserURL.equalsIgnoreCase("edge")) {
			browser = new EdgeDriver();
		}
		
		if (browserURL.equalsIgnoreCase("firefox")) {
			browser = new FirefoxDriver();
		}
		
		if (browserURL.equalsIgnoreCase("safari")) {
			browser = new SafariDriver();	
		}
		
		browser.manage().window().maximize(); //Maximize		
			
	}
	
	public void url(String applicationURL) {
		
		if (applicationURL.equalsIgnoreCase("facebook")) {	
			browser.navigate().to("https://www.facebook.com/");
			
		}
		
		if (applicationURL.equalsIgnoreCase("amazon")) {			
			browser.navigate().to("https://www.amazon.in/");
			
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BrowserLaunch launch = new BrowserLaunch();
		launch.launchBrowser("chrome");
		launch.url("facebook");

	}

}
