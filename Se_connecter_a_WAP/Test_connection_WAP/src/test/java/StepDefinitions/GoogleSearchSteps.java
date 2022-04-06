package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
public class GoogleSearchSteps {
	
	WebDriver driver = null;
	
	@Given("browser is open")
	public void browser_is_open() {
		
		System.setProperty("webdriver.firefox.driver", "C:\\Users\\Y9G22V706\\Downloads\\Selenium Webdrivers\\geckodriver.exe");
		driver = new FirefoxDriver();	
	}

	@And("user is on search page")
	public void user_is_on_search_page() {
		driver.get("https://www.google.com/");
	    driver.findElement(By.cssSelector("#L2AGLb")).click();
	}

	@When("user enters a Wap in search box")
	public void user_enters_a_text_in_search_box() {
		driver.get("https://staging.wap.ibminteractive.fr/collaborateurs");
	}
	
	@Then("User gets to the page")
	public void user_his_enters() throws InterruptedException {
		Thread.sleep(1000);
		driver.quit();
	}
		

}
