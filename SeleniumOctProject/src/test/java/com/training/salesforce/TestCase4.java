package com.training.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase4 {
	 static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		launchapplication();
		forgotPassword();
		forgotpwdValidation();
		testForgotPassword();
		emailValidation();
	}
	static void launchapplication() { 
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get("https://login.salesforce.com");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    }
	
	static void forgotPassword() {
		WebElement forgotPassword=driver.findElement(By.xpath("//a[text()='Forgot Your Password?']"));
       forgotPassword.click();
	}
	static void forgotpwdValidation() {
       WebElement forgotpwdValidn=driver.findElement(By.xpath("//h1[text()='Forgot Your Password']"));
       String expectedtxt="Forgot Your Password";
       String actualtxt=forgotpwdValidn.getText();
       if(expectedtxt.equals(actualtxt)) {
    	   System.out.println("validation of forgot your password is correct");
       }
       else {
    	   System.out.println("validation of forgot your password failed");
       }
       try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
	}
	   static void testForgotPassword() {
       WebElement usernameFpswd=driver.findElement(By.id("un"));
       usernameFpswd.sendKeys("silu@test.com");
       WebElement Continue=driver.findElement(By.id("continue"));
       Continue.click();
	   }
	   
	   static void emailValidation() {
       WebElement checkYourEmail=driver.findElement(By.xpath("//h1[text()='Check Your Email']"));
       String expectedtext="Check Your Email";
       String actualtext=checkYourEmail.getText();
       if(expectedtext.equals(actualtext)) {
    	   System.out.println("check your email is present");
       }
       else {
    	   System.out.println("check your email is not present");
       }
       driver.close();
       
       
	}

}

