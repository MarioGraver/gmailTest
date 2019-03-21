package testGmail;

import org.testng.annotations.Test ;

import pages.HomePage;
import pages.LoginPage;
import pages.LogoutPage;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
   
public class GmailTest {
	public WebDriver driver ;
	
  @Test
  public void loginMail() {
	  LoginPage login = new LoginPage(driver);
			  login.login("user", "password");
			  
	  HomePage home = new HomePage(driver);
	  home.searchEmailKeword("Promociones");
	  
	  LogoutPage logout = new LogoutPage();
	  logout.logOut();
  }
	 
	
  @BeforeMethod
  public void beforeMethod() {
	 
		driver = new ChromeDriver();
		driver.get("http://www.gmail.com");
		
  }

  @AfterMethod
  public void afterMethod() {
	 //driver.close();
  }

}
