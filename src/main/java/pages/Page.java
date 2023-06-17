package pages;

import org.openqa.selenium.WebDriver;

import common.TestBase;

public class Page{
	/**
	 * This is a class which contains all common methods for 1 Website
	 */
	public WebDriver driver;
	public TestBase testBase = new TestBase();
	
	public Page(WebDriver dr) {
		this.driver = dr;
	}
	
	
}
