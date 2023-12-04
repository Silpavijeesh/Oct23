package com.training.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase4b {
	static WebDriver driver;
	public static void main(String[] args)  {
		launchapplication();
		titleValidation();
		wrongUsernamePasswordLogin();
		loginErrorValidation();
		
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
	    
	    static void titleValidation() {
		String expectedTitle="Login | Salesforce";
		String actualTitle=driver.getTitle();
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("Browser is successfully launched");
		}
		else {
			System.out.println("Testcase failed");
		}
	    }
	    static void wrongUsernamePasswordLogin() {
        WebElement username=driver.findElement(By.id("username"));
        username.sendKeys("123");
        WebElement password=driver.findElement(By.id("password"));
        password.sendKeys("22131");
        WebElement login=driver.findElement(By.name("Login"));
        login.click();
        try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    }
	    static void loginErrorValidation() {
        WebElement validation=driver.findElement(By.id("error"));	
        String expectedText="Please check your username and password. If you still can't log in, contact your Salesforce administrator.";		
	    String actualText=validation.getText();
	    if(expectedText.equals(actualText)) {
	    	System.out.println("Errormessage,Testcase passed");
	    }
	    else {
	    	System.out.println("error message,Testcase failed");
	    }
        driver.close();

        }
}

