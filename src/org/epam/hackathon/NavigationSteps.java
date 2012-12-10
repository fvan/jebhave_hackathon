package org.epam.hackathon;

import org.jbehave.core.annotations.AfterScenario;
import org.jbehave.core.annotations.BeforeScenario;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NavigationSteps {

	WebDriver driver;
	
	
	@BeforeScenario
	public void createWebDriver() {
		ChromeOptions crOptions = new ChromeOptions();
		crOptions.addArguments("--user-data-dir=/maintainableprops"); 
		try{
		driver = new ChromeDriver(crOptions);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@When("I go to google")
	public void goToGoogle () {
		driver.get("https://google.com");
	}
	
	@AfterScenario
	public void exitWebDriver() {
		try{driver.close();}catch(Exception e) {}
		try{driver.quit();}catch(Exception e) {}
	}
	
}
