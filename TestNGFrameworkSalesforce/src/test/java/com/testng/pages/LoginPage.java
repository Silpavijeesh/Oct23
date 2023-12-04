package com.testng.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.testng.base.BasePage;

public class LoginPage extends BasePage {
	
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="username")
	WebElement Username;
	
     @FindBy(id="password")
     WebElement password;
     
     @FindBy(name="Login")
     WebElement login;
     
     @FindBy(xpath="//a[@title='Home Tab']")
     WebElement home;
     
     @FindBy(xpath="//div[@id='error']")
     WebElement loginError;
     
     @FindBy(id="rememberUn")
     WebElement rememberMe;
     
     @FindBy(id="userNav-arrow")
     WebElement usermenudropdown;
     @FindBy(xpath="//a[@title='Logout']")
     WebElement logout;
     @FindBy(id="idcard-identity")
     WebElement usernamevalidn;
     
     @FindBy(xpath="//a[text()='Forgot Your Password?']")
     WebElement forgotPassword;
     @FindBy(xpath="//h1[text()='Forgot Your Password']")
     WebElement forgotpasswdValidn;
     @FindBy(id="un")
     WebElement usernameFgtPwd;
     @FindBy(id="continue")
     WebElement Continue;
     @FindBy(xpath="//h1[text()='Check Your Email']")
     WebElement checkyourEmail;
     
     
     @FindBy(id="username")
     WebElement wrongUsername;
     @FindBy(id="password")
     WebElement wrongPassword; 
     
     @FindBy(id="error")
     WebElement errormsgvalidn;

	
     
     public void enterintoUsername(String strusername) {
     waitforElement(Username);
     Username.sendKeys(strusername);		
     }
     
    public void enterintoPassword(String strpassword) {
       password.sendKeys(strpassword);
    }
     public void clicklogin() {
    	 login.click();
     }
     
     public void loginerror(String expectedError) {
    	 String actualError=loginError.getText();
    	 compareText(actualError,expectedError);
    	 }
     public void homevalidation(String expectedText) {
    	 String actualText=home.getText();
    	 compareText(actualText,expectedText);
     }
     
     public void clickRememberMe() {
    	 rememberMe.click();
     }
     public void clickUsermenudropdown() { 
    	 usermenudropdown.click();
    	 }
     public void clickLogout() {
    	 logout.click();
     }
     
     public void usernameValidation(String expecteduname) {
    	 waitforElement(usernamevalidn);
    	 String actualuname=usernamevalidn.getText();
    	 compareText(actualuname,expecteduname);
     }
     public void clickonforgotpassword() {
    	 forgotPassword.click();
    	  }
     public void forgotpasswordValidation(String expectedText) {
    	 String actualText=forgotpasswdValidn.getText();
    	 compareText(actualText,expectedText);
     }
    /* public void logoutvalidation(String expectedloginTitle) {
    	 compareTitle(expectedloginTitle);
     }	*/


public void enterintoFpUsername(String strunameforgotpwd) {
	 waitforElement(usernameFgtPwd);
	   usernameFgtPwd.sendKeys("silu@test.com");
 }
   public void clickoncontinueButton() {
	   Continue.click();
   }
   public void emailValidation(String expectedemail) {
	 String actualemail=checkyourEmail.getText();
	   compareText(actualemail,expectedemail);
   }
   
   public void enterwrongusername(String strwusername){
	   wrongUsername.sendKeys("123");
   }
   public void enterintowrongpassword(String strwpassword) {
	   wrongPassword.sendKeys("22131");
   }
   
   public void loginerrorValidation(String expectederror) {
    String actualerror=errormsgvalidn.getText();
    compareText(actualerror,expectederror);
   }
   
   }

