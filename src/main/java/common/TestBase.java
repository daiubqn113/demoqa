package common;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBase {
	/**
	 * This is a class which contains all common handling related to Selenium
	 */

	public WebDriver driver;

	public void openWebWithSingleBrowser(String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"E:\\AutomationTest\\01Tools\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			// TODO
		} else if (browserName.equalsIgnoreCase("edge")) {
			// TODO
		}

		driver.get("https://demoqa.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
	}

	public void inputText(WebDriver dr, String inputData, By elementLocator) {
		// Explicit wait: Chờ đến khi element hiển thị thì clear data
		WebElement element = waitForDisplay(dr,10, elementLocator);
		element.clear();
		element.sendKeys(inputData);
	}
	
	//Left click
	public void click(WebDriver dr, By elementLocator) {
		WebElement element = waitForDisplay(dr, 3, elementLocator);
		element.click();
	}
	
	public String getText(WebDriver dr, By elementLocator) {
		WebElement element = waitForDisplay(dr, 3, elementLocator);
		String result = element.getText();
		return result;
	}
	

	//Scroll
	
	public WebElement waitForDisplay(WebDriver dr, long timeOutInSecond, By elementLocator) {
		WebElement element=null;
		try {
			element = new WebDriverWait(dr, Duration.ofSeconds(timeOutInSecond))
					.until(newDriver ->dr.findElement(elementLocator));
		} catch(Exception e) {
			System.out.println("Can not find element");
		}
		
		return element;
	}

	public void scrollToEndPage() {
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

}
