package tests;

import common.TestBase;

public class TestCase {
	// Global variable
	public TestBase testBase = new TestBase();
	
	public void openWebsite() {
		//call method from TestBase.java
		testBase.openWebWithSingleBrowser("chrome");
	}

}
