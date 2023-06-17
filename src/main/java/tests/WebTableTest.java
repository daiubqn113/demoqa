package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.ElementsPage;
import pages.HomePage;
import pages.WebTablePage;

public class WebTableTest extends TestCase{
	@Test(description = "TC1 - Submit successfully", dataProvider = "InputData")
	public void submitSuccessfully(String inputFirstName, String inputLastName, String inputUserEmail,
			String inputAge, String inputSalary, String inputDepartment) {
//		public By locaddNewRecordButton = By.id("addNewRecordButton");
//		public By locFirstName = By.id("firstName");
//		public By locLastName = By.id("lastName");
//		public By locEmail = By.id("userEmail");
//		public By locAge = By.id("age");
//		public By locSalary = By.id("salary");
//		public By locDepartment = By.id("department");
//		public By locSubmit = By.id("submit");
		openWebsite();
		HomePage homePage = new HomePage(testBase.driver);
		ElementsPage elementsPage = homePage.clickOnElementsMenu();
		WebTablePage webTablePage = elementsPage.clickOnWebTableMenu();
		webTablePage.testBase.click(testBase.driver,webTablePage.locaddNewRecordButton);
		webTablePage.testBase.inputText(testBase.driver, inputFirstName, webTablePage.locFirstName);
		webTablePage.testBase.inputText(testBase.driver, inputLastName, webTablePage.locLastName);
		webTablePage.testBase.inputText(testBase.driver, inputUserEmail, webTablePage.locEmail);
		webTablePage.testBase.inputText(testBase.driver, inputAge, webTablePage.locAge);
		webTablePage.testBase.inputText(testBase.driver, inputSalary, webTablePage.locSalary);
		webTablePage.testBase.inputText(testBase.driver, inputDepartment, webTablePage.locDepartment);
		webTablePage.testBase.click(testBase.driver,webTablePage.locSubmit);

		assertEquals(webTablePage.locFirstName_Displayed, inputFirstName);
		assertEquals(webTablePage.locLastName_Displayed, inputLastName);
		assertEquals(webTablePage.locEmail_Displayed, inputUserEmail);
		assertEquals(webTablePage.locAge_Displayed, inputAge);
		assertEquals(webTablePage.locSalary_Displayed, inputSalary);
		assertEquals(webTablePage.locDepartment_Displayed, inputDepartment);

	}



	@DataProvider(name = "InputData")
	public String[][] inputTestData() {
		String[][] testData = new String[1][6];
		testData[0][0] = "Cao Trần";
		testData[0][1] = "Đại";
		testData[0][2] = "dai@gmail.com";
		testData[0][3] = "18";
		testData[0][4] = "10000000";
		testData[0][5] = "Kỹ thuật";
		return testData;
	}
}
