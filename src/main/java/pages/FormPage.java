package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormPage extends Page{
	public By locPracticeForm_Menu = By.xpath("//span[text()='Practice Form']/..");
	public FormPage(WebDriver dr) {
		super(dr);
		driver = dr;
	}
	
	public PracticeFormPage clickPracticeFormMenu() {
		testBase.click(driver, locPracticeForm_Menu);
		return new PracticeFormPage(driver);
	}
}
