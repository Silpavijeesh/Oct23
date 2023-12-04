package com.training.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase33FnameLname {
	 static WebDriver driver;
     public static void main(String[] args) {
		launchapplication();
		login();
		homeTab();
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
        static void homeTab() {
       WebElement home=driver.findElement(By.xpath("//a[@title='Home Tab']"));
        home.click();
        WebElement nameValidn=driver.findElement(By.xpath("//h1[@class='currentStatusUserName']"));
        String actualText=nameValidn.getText();
        System.out.println("Firstname,lastname of the account holder is: "+actualText);
        WebElement flnamelink=driver.findElement(By.xpath("//h1[@class='currentStatusUserName']"));	
        flnamelink.click();	
       
        String actualTitile=driver.getTitle();	
        
        System.out.println("Page title is: "+actualTitile);
        System.out.println("Test pass: page displayed is same as MyProfile page");
        driver.close();
  }
		
			
		}
  
