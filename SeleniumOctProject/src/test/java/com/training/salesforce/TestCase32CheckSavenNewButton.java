package com.training.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase32CheckSavenNewButton {
	static WebDriver driver;
	public static void main(String[] args) {
		launchapplication();
		login();
		contactsTab();
		newButton();
		
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
	static void login() {
        WebElement username=driver.findElement(By.id("username"));
        username.sendKeys("silu@test.com");
        WebElement password=driver.findElement(By.id("password"));
        password.sendKeys("Ammukutty12");
        WebElement login=driver.findElement(By.name("Login"));
        login.click();
       }
	 static void contactsTab() {
	 	   WebElement contacts=driver.findElement(By.xpath("//a[text()='Contacts']"));
	 	   contacts.click();
	 	   try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    }
	 static void newButton() {
	        WebElement newBtn=driver.findElement(By.xpath("//input[@title='New']"));
		    newBtn.click(); 
		    WebElement lName=driver.findElement(By.id("name_lastcon2"));
		    lName.sendKeys("Indian");
		    WebElement accName=driver.findElement(By.id("con4"));
		    accName.sendKeys("Global Media");
		    WebElement saveNew=driver.findElement(By.xpath("(//input[@value='Save & New'])[1]"));
		    saveNew.click();
		    System.out.println("Fail: New contact is not created");
		    driver.close();
		    
  }
  }