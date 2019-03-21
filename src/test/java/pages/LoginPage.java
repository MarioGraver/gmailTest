package pages;

import static java.util.concurrent.TimeUnit.SECONDS;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class LoginPage {

	//@FindBy(how = How.ID, using = "identifierId")
	WebElement emailField;
	//@FindBy(how = How.NAME, using = "password")
	WebElement siguenteButton;
	WebElement passwordField;
	//@FindBy(how = How.XPATH, using = "//div[@id='passwordNext']//span[@class='RveJvd snByac']")
	WebElement loginButton;
	WebDriver driver;
	
	public LoginPage(WebDriver testDriver) {
		driver = testDriver;
	}
	
	public void login(String user, String password) {
		emailField = driver.findElement(By.id("identifierId"));
		emailField.sendKeys("MarviniMarvin11111@gmail.com");
		
		siguenteButton = driver.findElement(By.id("passwordNext"));
		siguenteButton.click();
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		/*WebElement passButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("password")));*/
            
		passwordField = driver.findElement(By.name("password"));
		passwordField.clear();
		passwordField.sendKeys("M@rvinini");
		loginButton = driver.findElement(By.xpath("//div[@id='passwordNext']//span[@class='RveJvd snByac']"));
		loginButton.click();
		
		
	}
	
/*	public void login(String user, String password) {
	}
	public void login(String user, String password) {
	}*/
	
	}

