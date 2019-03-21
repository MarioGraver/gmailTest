package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogoutPage {
	WebElement logOutField;
	WebDriver driver;
	
	
	
	public void logOut() {
		logOutField = driver.findElement(By.xpath
				("/html//header[@id='gb']/div[2]/div[3]/div/div[2]/div/a[@role='button']/"
						+ "span[@class='gb_ya gbii']"));
		logOutField.click();

}}
