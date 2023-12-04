package com.testng.tests;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.testng.base.BaseTest;
import com.testng.log.Log;
import com.testng.pages.LoginPage;
import com.testng.pages.UsermenuPage;

public class LoginTest extends BaseTest {
	WebDriver driver;
	LoginPage loginpage;

	@BeforeMethod
	public void beforemethod() { 
		driver=getDriver();
		launchapp(driver);
		loginpage= new LoginPage(driver);
		DOMConfigurator.configure("log4j.xml");
	}
		
		
	
	
	@Test
	 public void loginerror() {
		Log.startTestCase("Loginerror");
		loginpage.enterintoUsername("silu@test.com");
		Log.info("Successfully entered usernme");
		loginpage.clicklogin();
		String expectedError="Please enter your password.";
		loginpage.loginerror(expectedError);
		Log.endTestCase("Loginerror");
	}
	
	@Test
	public void logintoapplication() {
		Log.startTestCase("Logintoapplication");
		loginpage.enterintoUsername("silu@test.com");
		Log.info("Successfully entered username");
		loginpage.enterintoPassword("Ammukutty12");
		loginpage.clicklogin();
		String expectedText="Home";
		loginpage.homevalidation(expectedText);
		Log.info("Successfully Logged");
		Log.endTestCase("Logintoapplication");
		
	}
	@Test
	public void checkRememberMe() {
		Log.startTestCase("Check Remember me");
		loginpage.enterintoUsername("Silu@test.com");
		Log.info("Successfully entered username");
		loginpage.enterintoPassword("Ammukutty12");
		loginpage.clickRememberMe();
		loginpage.clicklogin();
		Log.info("Successfully logged into application");
		loginpage.clickUsermenudropdown();
		Log.info("Successfully click on usermenudropdown");
		loginpage.clickLogout();
		Log.info("click logout from usermenu dropdown");
		String expecteduname="silu@test.com";
		loginpage.usernameValidation(expecteduname);
		Log.endTestCase("check remember me");
	}
	@Test
	public void forgotPassword() {
		Log.startTestCase("Forgot password");
		loginpage.clickonforgotpassword();
		Log.info(" Click on forgot password link");
		String expectedText="Forgot Your Password";
		loginpage.forgotpasswordValidation(expectedText);
		loginpage.enterintoFpUsername("silu@test.com");
		Log.info("Enter value into forgot password");
		loginpage.clickoncontinueButton();
		String expectedemail="Check Your Email";
		loginpage.emailValidation(expectedemail);
		Log.endTestCase("Forgot password");
		}
	
	@Test
	public void validateloginErrorMessage() {
		Log.startTestCase("Validate Login Error message");
		loginpage.enterwrongusername("123");
		Log.info("Enter wrong username into usernameTextbox");
		loginpage.enterintowrongpassword("22131");
		Log.info("Enter wrong password into passwordTextbox");
		loginpage.clicklogin();
	    String expectederror="Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
		 loginpage.loginerrorValidation(expectederror);
		Log.endTestCase("Validate Login Error message");
		
		}
	
  @AfterMethod	
	public void teardown() {
	takescreenshot(driver,"Salesforce");
     close();
}
}
