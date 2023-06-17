package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends Page {
	
	public HomePage(WebDriver dr) {
		super(dr);
		driver = dr;
	}

	//Click on Elements item, return ElementsPage
	public ElementsPage clickOnElementsMenu() {
		driver.findElement(By.xpath("//div[@class='category-cards']/div[1]//div[@class='card-up']")).click();
		return new ElementsPage(driver);
		
	}
	
	public FormPage clickOnFormMenu() {
		driver.findElement(By.xpath("//div[@class='category-cards']/div[2]//div[@class='card-up']")).click();
		return new FormPage(driver);
		
	}
}
