package com.training.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase2 {
    static WebDriver driver;
	public static void main(String[] args) {
		launchapplication();
		login();
		homevalidation();
		
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
		String expectedTitle="Login | Salesforce";
		String actualTitle=driver.getTitle();
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("Browser is successfully launched");
		}
		else {
			System.out.println("Testcase failed");
		}
	    }
	    static void login() {
        WebElement username=driver.findElement(By.id("username"));
        username.sendKeys("silu@test.com");
        WebElement password=driver.findElement(By.id("password"));
        password.sendKeys("Ammukutty12");
        WebElement login=driver.findElement(By.name("Login"));
        login.click();
        try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	    }
	    
        static void homevalidation() {
        WebElement validnHome=driver.findElement(By.xpath("//a[@title='Home Tab']"));
        String expectedText="Home";
        String actualText=validnHome.getText();
        compareText(actualText,expectedText);
        	System.out.println("Testcase passed");
        	driver.close();
        }
		private static void compareText(String actualText, String expectedText) {
		Assert.assertEquals(actualText, expectedText);	
			
		}
        
	}


