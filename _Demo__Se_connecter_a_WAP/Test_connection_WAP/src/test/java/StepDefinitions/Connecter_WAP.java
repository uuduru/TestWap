package StepDefinitions;

import io.cucumber.java.en.*;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Connecter_WAP {

	WebDriver driver = null;

@Given("Que le navigateur est ouvert")  
public void que_le_navigateur_est_ouvert() throws MalformedURLException {
	 System.setProperty("webdriver.gecko.driver", "_Demo__Se_connecter_a_WAP/geckodriver");
	 driver = new FirefoxDriver();
	//FirefoxOptions firefoxOptions = new FirefoxOptions();	
	//WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444"),firefoxOptions);
}

@And("Je cherche URL de WAP")
public void je_cherche_url_de_wap() {
	
	driver.get("https://staging.wap.ibminteractive.fr/collaborateurs");
    
}

@And("Je rentre le nom utilisateur et son mot de passe")
public void je_rentre_le_nom_utilisateur_et_son_mot_de_passe() throws InterruptedException {
    Thread.sleep(3000);
    driver.findElement(By.cssSelector("#email")).sendKeys("fake.user@yopmail.com");
    driver.findElement(By.cssSelector("#password")).sendKeys("root1234");      
}

@Then("Je clique sur le bouton sign in")
public void je_clique_sur_le_bouton_sign_in() {

	driver.findElement(By.cssSelector("#cd_login_button")).click(); 
	driver.quit();
    
}


}
