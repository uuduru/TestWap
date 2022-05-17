package StepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.internal.Version;

public class Connecter_WAP {

	WebDriver driver;
	
	@Before
public void SecondSD() throws MalformedURLException {
	String string = "chrome";	
	
		if(string =="firefox")
		{
		 FirefoxOptions firefoxOptions = new FirefoxOptions();
		 firefoxOptions.setCapability("browserName","firefox");
		 firefoxOptions.setCapability("platform", Platform.ANY);
		 driver = new RemoteWebDriver(new URL("https://selenium.wap-test-platform-iks-086d0feb796ce72f6b820703a879a158-0000.eu-de.containers.appdomain.cloud"),firefoxOptions);
		}
	else if (string =="chrome")
		{
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.setCapability("browserName","chrome");
			chromeOptions.setCapability("platform", Platform.ANY);
			driver = new RemoteWebDriver(new URL("https://selenium.wap-test-platform-iks-086d0feb796ce72f6b820703a879a158-0000.eu-de.containers.appdomain.cloud"), chromeOptions);	
		}
	 
	}
	
@Given("Que le navigateur est ouvert")  
public void que_le_navigateur_est_ouvert() throws MalformedURLException {
	System.out.println("Navigateur est ouvert");	
}

@And("Je cherche URL de WAP")
public void je_cherche_url_de_wap() {
	
	driver.get("https://staging.wap.ibminteractive.fr/collaborateurs"); 
	System.out.println("L'URL de WAP trouvé");
	}


@And("Je rentre {string} et mon mot de passe")
public void je_rentre_le_et_son_mot_de_passe(String string) {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1600)); 
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#email"))).sendKeys(string);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#password"))).sendKeys("root1234");
	System.out.println(string);
    }


@And("Je clique sur le bouton sign in")
public void je_clique_sur_le_bouton_sign_in() {
	driver.findElement(By.cssSelector("#cd_login_button")).click(); 
	System.out.println("Ok4");
    }


@Then("Je verifie que je suis connecté")
public void je_verifie_que_je_suis_connecte() throws InterruptedException {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1600));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='router-link-exact-active router-link-active']")));
	System.out.println("Test_Terminé");
	Thread.sleep(5000);
	driver.quit();
    
}

}

