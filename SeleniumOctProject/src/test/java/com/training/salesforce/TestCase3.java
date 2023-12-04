package com.training.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase3 {
	static WebDriver driver;
	public static void main(String[] args)  {
		launchapplication();
		RememberUsernameAndlogin();
		homevalidation();
		usermenuDropdown();
		logout();
		usernameValidation();
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
	    static void RememberUsernameAndlogin() {
        WebElement username=driver.findElement(By.id("username"));
        username.sendKeys("silu@test.com");
        WebElement password=driver.findElement(By.id("password"));
        password.sendKeys("Ammukutty12");
        WebElement rememberMe=driver.findElement(By.id("rememberUn"));
        rememberMe.click();
        WebElement login=driver.findElement(By.name("Login"));
        login.click();
	    }
	    
	    static void homevalidation() {
        WebElement validnHome=driver.findElement(By.xpath("//a[@title='Home Tab']"));
        String expectedText="Home";
        String actualText=validnHome.getText();
        if(expectedText.equals(actualText)) {
        	System.out.println("Testcase passed");
        }
        else {
        	System.out.println("Testcase failed");
        }
	    }
	    static void usermenuDropdown() {
        WebElement usermenuDrpdown=driver.findElement(By.id("userNav-arrow"));
         usermenuDrpdown.click();
         try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    }
	    static void logout() {
        WebElement logout=driver.findElement(By.xpath("//a[@title='Logout']"));
        logout.click();
        try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    }
	    static void usernameValidation() {
        WebElement usernameValidn=driver.findElement(By.id("idcard-identity"));
        String expectedUnameText="silu@test.com";
        String actualUnameText=usernameValidn.getText();
        if(expectedUnameText.equals(actualUnameText)) {
        	System.out.println("Validation is correct");
        }
        else {
        	System.out.println("Validation is not correct");
        }
        driver.close();
        }
	}




