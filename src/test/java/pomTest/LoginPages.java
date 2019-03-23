package pomTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//This class locate will store all the locators and methods of login page
             
public class LoginPages {
	
	 WebDriver driver;
	 //Three locators
	   By username = By.id("identifierId");
	   By Siguente = By.id("identifierNext");
	   By PPassword = By.xpath("(//div[@class ='AxOyFc snByac'])[1]");
	   By loginButton = By.xpath("//div[@id='passwordNext']//span[@class='RveJvd snByac']");
	
      //One Construtors
	   public LoginPages(WebDriver driver) 
	   {
		   this.driver=driver;
	   }
	   //three methods
	   public void typeUserName()
	   {
		   driver.findElement(username).sendKeys("MarviniMarvin11111@gmail.com");
	   }
	   public void siguienteButton()
	   {
		   driver.findElement(Siguente).click();
	   }
	   public void typePassword()
	   {
		   driver.findElement(PPassword).sendKeys("M@rvinini");
	   }
	   public void clickOnLoginButton()
	   {
		   driver.findElement(loginButton).click();
	   }
	

}
