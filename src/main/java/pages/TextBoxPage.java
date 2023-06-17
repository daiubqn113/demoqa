package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import common.Utils;

public class TextBoxPage extends Page {
	
	public By locFullName = By.id("userName");
	public By locEmail = By.id("userEmail");
	public By locCurrentAddress = By.xpath("//textarea[@id='currentAddress']");
	public By locPermanentAddress = By.xpath("//textarea[@id='permanentAddress']");
	public By locSubmit = By.id("submit");
	
	public By locName_Displayed = By.id("name");
	public By locEmail_Displayed = By.id("email");
	public By locCurrentAddress_Displayed = By.xpath("//p[@id='currentAddress']");
	public By locPermananetAddress_Displayed = By.xpath("//p[@id='permanentAddress']");

	public TextBoxPage(WebDriver dr) {
		super(dr);
		driver = dr;
	}
	
	public String getTextAfterSubmit(By elementLocator) {
		String fullText = testBase.getText(driver, elementLocator);
		String result = Utils.getSubStringFromCharacter(fullText, ":");
		return result;
	}
	
	

}
