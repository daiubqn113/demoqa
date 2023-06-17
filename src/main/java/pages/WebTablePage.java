package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebTablePage extends Page{

	public By locaddNewRecordButton = By.id("addNewRecordButton");
	public By locFirstName = By.id("firstName");
	public By locLastName = By.id("lastName");
	public By locEmail = By.id("userEmail");
	public By locAge = By.id("age");
	public By locSalary = By.id("salary");
	public By locDepartment = By.id("department");
	public By locSubmit = By.id("submit");
	
	public By locFirstName_Displayed = By.id("firstName");
	public By locLastName_Displayed = By.id("lastName");
	public By locEmail_Displayed = By.id("userEmail");
	public By locAge_Displayed = By.id("age");
	public By locSalary_Displayed = By.id("salary");
	public By locDepartment_Displayed = By.id("department");

	public WebTablePage(WebDriver dr) {
		super(dr);
		driver = dr;
	}
}
