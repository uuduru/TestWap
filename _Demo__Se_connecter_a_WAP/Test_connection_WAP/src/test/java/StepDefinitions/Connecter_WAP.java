package StepDefinitions;

import io.cucumber.java.en.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Connecter_WAP {

	WebDriver driver = null;
	

@Given("Que le navigateur est ouvert")  
public void que_le_navigateur_est_ouvert() throws MalformedURLException {
	//System.setProperty("webdriver.firefox.driver", "C:\\Users\\Y9G22V706\\Downloads\\Software_Ugo\\geckodriver.exe");
	//driver = new FirefoxDriver();
	FirefoxOptions firefoxOptions = new FirefoxOptions();
	firefoxOptions.setCapability("platform", Platform.ANY);
	driver = new RemoteWebDriver(new URL("http://159.122.175.120:30723"),firefoxOptions);
}

@And("Je cherche URL de WAP")
public void je_cherche_url_de_wap() {
	
	driver.get("https://staging.wap.ibminteractive.fr/collaborateurs");
    
}

@And("Je rentre le nom utilisateur et son mot de passe")
public void je_rentre_le_nom_utilisateur_et_son_mot_de_passe() throws InterruptedException {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60)); 
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#email")));
    driver.findElement(By.cssSelector("#email")).sendKeys("fake.user@yopmail.com");  
}

@Then("Je clique sur le bouton sign in")
public void je_clique_sur_le_bouton_sign_in() {

	driver.findElement(By.cssSelector("#cd_login_button")).click(); 
	driver.quit();
    
}


}
