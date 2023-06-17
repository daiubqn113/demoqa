package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class PracticeFormPage extends Page{
	public By locFirstName = By.id("firstName");
	public By locLastName = By.id("lastName");
	public By locEmail = By.id("userEmail");
	public By locPhoneNumber = By.id("userNumber");
	public By locGender = By.xpath("//label[text()='Male']/parent::*");
	public By locHobies = By.xpath("//label[text()='Sports']/parent::*");
	public By locUploadFile = By.id("uploadPicture");
	public By locCurrentAddress = By.id("currentAddress");
	public By locBtnSubmit = By.id("submit");
	public By locDataSubmited = By.xpath("//tbody/tr/td[2]");
	public By locSubjects = By.id("subjectsInput");
	public By locSubjectsListData = By.xpath("//div[contains(@id,'react-select-2-option')]");
//	public By locDateOfBirth = By.id("dateOfBirthInput");
//	public By locYear = By.className("react-datepicker__year-select");
//	public By locMonth = By.className("react-datepicker__month-select");
//	public By locDay = By.xpath("//div[@role ='option' and not(contains(@class,'outside-month'))]");
//	public By locState = By.id("state");
//	public By locStateList = By.xpath("//div[contains(@id,'react-select-3')]");
//	public By locCity = By.id("city");
//	public By locCityList = By.xpath("//div[contains(@id,'react-select-4')]");
	

	public PracticeFormPage(WebDriver dr) {
		super(dr);
		driver = dr;
	}
	
}
