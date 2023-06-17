package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementsPage extends Page{

	public By locTextBox_Menu = By.xpath("//span[text()='Text Box']/..");
	public By locWebTable_Menu = By.xpath("//span[text()='Web Tables']/..");
	public ElementsPage(WebDriver dr) {
		super(dr);
		driver = dr;
	}
	
	public TextBoxPage clickOnTextBoxMenu() {
		testBase.click(driver, locTextBox_Menu);
		return new TextBoxPage(driver);
	}
	
	public WebTablePage clickOnWebTableMenu() {
		testBase.click(driver, locWebTable_Menu);
		return new WebTablePage(driver);
	}
	
	

}
