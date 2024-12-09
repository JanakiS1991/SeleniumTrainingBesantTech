package test.SeleniumTrainingBesantTech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsImplementation {
	
	/* *****Locators******* 
	 * 1. By id --> syntax: driver.findElement(By.id("element id"));
	 * 2. By Name --> syntax: driver.findElement(By.name("element name"));
	 * 3. By ClassName --> syntax: driver.findElement(By.className("element class name"));
	 * 4. By TagName --> syntax: driver.findElement(By.tagName("element html tag name"));
	 * 5. By Link Text --> syntax: driver.findElement(By.linkText("element link text"));
	 * 6. By Partial Link Text --> syntax: driver.findElement(By.partialLinkText("partial link text"));
	 * 7. By CSS --> syntax: driver.findElement(By.cssSelector("css selector"));
	 * 8. By Xpath--> syntax: driver.findElement(By.xpath("xpath"));
	 */
				
	/******CSS Selector****
	 * This is the fastest locator
	 * 7 types
	 * 1. Tag & id --> syntax: driver.findElement(By.cssSelector("tag#id"));
	 * 2. Tag & Class--> syntax: driver.findElement(By.cssSelector("tag.class"));
	 * 3. Tag & attribute--> syntax: driver.findElement(By.cssSelector("tag[attribute=value]"));
	 * 4. Tag, Class & attribute--> syntax: driver.findElement(By.cssSelector("tag.class[attribute=value]"));
	 * 5. starts with--> syntax: driver.findElement(By.cssSelector("tagname[attribute^='starting value']")); or [attribute^='staring value']
	 * 6. ends with--> syntax: driver.findElement(By.cssSelector("tagname[attribute$='ending value']""));
	 * 7. contains--> syntax: driver.findElement(By.cssSelector("tagname[attribute*='any value']""));
	 * 
	 * */
	
	/****** Xpath **********
	 * 2 types:
	 * Absolute Xpath --> starts with single forward slash /
	 * Relative Xpath --> starts with double forward slash //
	 * syntax: driver.findElement(By.xpath("xpath"));
	 * */
	
	/****** Relative Xpath *******
	 * 5 different types 
	 * 1. Basic xpath --> xpath = (//tagname[@attribute='value'])
	 * 2. And or      --> xpath = (//tagname[@attribute1='value1' or @attribute2='value2'])
	 * 				  --> xpath = (//tagname[@attribute1='value1' and @attribute2='value2'])
	 * 3. Starts-with --> xpath = (//tagname[starts-with(@attribute,'starting value of the attribute'])
	 * 4. contains    --> xpath = (//tagname[contains(@attribute,'partial value of the attribute'])
	 * 5. text()      --> xpath = (//tagname[text()='text of the web element'])
	 */
	
	/******* Xpath axes methods *******
	 * If there is no attribute or the attribute value gets change dynamically
	 * 1. Following: 		Xpath = //tagname[@attribute='value']//following::tagname of current mode
	 * 2. Following-sibling:Xpath = //tagname[@attribute='text']//following-sibling::tagname of current mode
	 * 3. Parent: Xpath = //tagname[@attribute='text']//parent::tagname of current mode
	 * 4. Child: Xpath = //tagname[@attribute='text']//child::tagname of current mode
	 * 5. Preceding: Xpath = //tagname[@attribute='text']//proceding::tagname of current mode
	 * 6. Ancestor: Xpath = //tagname[@attribute='text']//anchestor::tagname of current mode
	 * 7. Descendant: Xpath = //tagname[@attribute='text']//descendant::tagname of current mode
	 * */
	
	public void locators() {
		
		WebDriver browser = new ChromeDriver();
		browser.navigate().to("https://www.facebook.com/");
		//By id --> syntax: driver.findElement(By.id("element id"));
		WebElement userName = browser.findElement(By.id("email"));
		userName.sendKeys("xyz123"); 
		userName.clear();
		userName.sendKeys("selenium"); 
		//By Name --> syntax: driver.findElement(By.name("element name"));
		browser.findElement(By.name("pass")).sendKeys("123456789");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocatorsImplementation element = new LocatorsImplementation();
		element.locators();
		/*
		 * BrowserLaunch launch = new BrowserLaunch(); launch.launchBrowser("Chrome");
		 * launch.url("facebook");
		 */
		

	}

}
