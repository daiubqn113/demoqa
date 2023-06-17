package tests;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.FormPage;
import pages.PracticeFormPage;
//,
//String inputGender, String inputPhoneNumber, String inputCurrentAddress, String inputSubjects,
//String inputSubjectsListData
public class PractiveFormTest extends TestCase{

	@Test(description = "TC2 - Submit successfully")
	public void submitSuccessfully() {
	openWebsite();
	HomePage homePage = new HomePage(testBase.driver);
	FormPage formPage = homePage.clickOnFormMenu();
	PracticeFormPage practiceFormPage = formPage.clickPracticeFormMenu();
	practiceFormPage.testBase.inputText(testBase.driver, "Cao", practiceFormPage.locLastName);
	practiceFormPage.testBase.inputText(testBase.driver, "Đại", practiceFormPage.locFirstName);
	practiceFormPage.testBase.inputText(testBase.driver, "dai@gmail.com", practiceFormPage.locEmail);
	practiceFormPage.testBase.click(testBase.driver,practiceFormPage.locGender);
	practiceFormPage.testBase.inputText(testBase.driver, "0393366664", practiceFormPage.locPhoneNumber);
	practiceFormPage.testBase.click(testBase.driver,practiceFormPage.locHobies);
	practiceFormPage.testBase.inputText(testBase.driver, "Nội dung", practiceFormPage.locCurrentAddress);
	practiceFormPage.testBase.inputText(testBase.driver, "Math", practiceFormPage.locSubjects);
	practiceFormPage.testBase.click(testBase.driver, practiceFormPage.locSubjectsListData);
//	practiceFormPage.testBase.click(testBase.driver,practiceFormPage.locState);
//	practiceFormPage.testBase.click(testBase.driver,practiceFormPage.locStateList);
//	practiceFormPage.testBase.click(testBase.driver,practiceFormPage.locCity);
//	practiceFormPage.testBase.click(testBase.driver,practiceFormPage.locCityList);
//	practiceFormPage.testBase.inputText(testBase.driver, inputSubjects, practiceFormPage.locSubjects);
//	practiceFormPage.testBase.inputText(testBase.driver, inputSubjectsListData, practiceFormPage.locSubjectsListData);
//	practiceFormPage.testBase.inputText(testBase.driver, inputPermanentAddress, practiceFormPage.locPermanentAddress);
//	practiceFormPage.testBase.click(testBase.driver,practiceFormPage.locSubmit);

	}
}
