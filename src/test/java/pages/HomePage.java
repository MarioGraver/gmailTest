package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomePage {
		
	 WebElement searchField;
	 WebElement searchButton;
 
	    WebDriver driver;
	
	    public HomePage(WebDriver testDriver) {
	        	 driver = testDriver;
	         }
	         
	  	
		public void searchEmailKeword(String Promociones) {
			
			searchField = driver.findElement(By.xpath("//form[@id='aso_search_form_anchor']//input[@name='q']"));
			searchField.sendKeys("Promociones");
			searchButton = driver.findElement(By.className("//*[@class ='gb_bf gb_cf']"));
			searchButton.click();
			
		}

}

