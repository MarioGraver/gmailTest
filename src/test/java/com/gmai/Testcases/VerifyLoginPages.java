package com.gmai.Testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pomTest.LoginPages;

public class VerifyLoginPages

{
	@Test
	public void verifyLogin()
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.gmail.com");
		
		LoginPages login = new LoginPages(driver);
		
		login.typeUserName();
		login.siguienteButton();
		
		 driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		 
		login.typePassword();
		
		login.clickOnLoginButton();
		
	}
	
	
}
