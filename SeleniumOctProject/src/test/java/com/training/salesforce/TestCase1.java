package com.training.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase1 {
	static WebDriver driver; 
	public static void main(String[] args) {
		launchapplication();
		loginerror();
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
	    
		static void loginerror() {
        WebElement username=driver.findElement(By.id("username"));
        username.sendKeys("silu@test.com");
        WebElement password=driver.findElement(By.id("password"));
        password.clear();
        WebElement login=driver.findElement(By.name("Login"));
        login.click();
        WebElement loginError=driver.findElement(By.xpath("//div[@id='error']"));
    	String expectedText="Please enter your password.";
        String acualText=loginError.getText();
        if(expectedText.equals(acualText)) {
        	System.out.println("login error Testcase passed");
        }
        	else {
        		System.out.println("login error Testcase failed ");
        	}
        driver.close();
	}

}


