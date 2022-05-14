package StepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.internal.Version;

public class Connecter_WAP {

	WebDriver driver;
	
	@Before
public void SecondSD() throws MalformedURLException {
	
	 FirefoxOptions firefoxOptions = new FirefoxOptions();
	 firefoxOptions.setCapability("browserName","firefox");
	 firefoxOptions.setCapability("browserVersion", "99.0");
	 //firefoxOptions.setCapability("platform", Platform.ANY);
	 firefoxOptions.setCapability("platformName", "Linux");
	 driver = new RemoteWebDriver(new URL("http://159.122.175.120:30723"),firefoxOptions);
	 //driver = new RemoteWebDriver(new URL("http://localhost:4444"),firefoxOptions);
	}
	
@Given("Que le navigateur est ouvert")  
public void que_le_navigateur_est_ouvert() throws MalformedURLException {
	System.out.println("Ok1");
	//System.setProperty("webdriver.firefox.driver", "C:\\Users\\Y9G22V706\\Downloads\\Software_Ugo\\geckodriver.exe");
	driver = new FirefoxDriver();
	//FirefoxOptions firefoxOptions = new FirefoxOptions();
	//firefoxOptions.setCapability("platform", Platform.ANY);
	//driver = new RemoteWebDriver(new URL("http://159.122.175.120:30723/"),firefoxOptions);
	//driver = new RemoteWebDriver(new URL("http://localhost:4444"),firefoxOptions);
	//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	
}

@And("Je cherche URL de WAP")
public void je_cherche_url_de_wap() {
	
	driver.get("https://staging.wap.ibminteractive.fr/collaborateurs"); 
	//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1600)); 
	//wait.until(ExpectedConditions.urlToBe("
	}

/*@And("Je rentre le \"nom_utilisateur\" et son mot de passe")
public void je_rentre_le_nom_utilisateur_et_son_mot_de_passe() throws InterruptedException {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1600)); 
	System.out.println("Ok3");
      
}*/

@And("Je rentre le {string} et son mot de passe")
public void je_rentre_le_et_son_mot_de_passe(String string) {

	System.out.println(string);
	
    }
    
    
    

@Then("Je clique sur le bouton sign in")
public void je_clique_sur_le_bouton_sign_in() {

	driver.findElement(By.cssSelector("#cd_login_button")).click(); 
	System.out.println("Ok4");
	driver.quit();
    
}


}
