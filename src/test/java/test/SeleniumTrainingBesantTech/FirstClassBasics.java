package test.SeleniumTrainingBesantTech;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class FirstClassBasics {
	
	public void seleniumBasics() {
		
		/* Browser Launch */
		WebDriver browser1 = new EdgeDriver();
		WebDriver browser2 = new FirefoxDriver();
		WebDriver browser3 = new SafariDriver();
		WebDriver browser = new ChromeDriver();
		
		
		/* Maximize & Minimize */		
		browser.manage().window().maximize();
//		browser.manage().window().minimize();
		
		/* Enter URL */
		browser.navigate().to("https://www.amazon.com/");
		browser.navigate().to("https://www.facebook.com/");
				
		/* Backward, Forward,Refresh */
		browser.navigate().back();
		browser.navigate().forward();
		browser.navigate().refresh();
		
		/* Closing Browser- Close/Quit */
		browser.close();
		browser.quit();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirstClassBasics basic = new FirstClassBasics();
		basic.seleniumBasics();
		

	}

}
