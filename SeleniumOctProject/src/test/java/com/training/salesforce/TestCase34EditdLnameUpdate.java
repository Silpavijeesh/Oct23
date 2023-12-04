package com.training.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase34EditdLnameUpdate {
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
	         WebElement flnamelink=driver.findElement(By.xpath("//h1[@class='currentStatusUserName']"));	
	         flnamelink.click();
	         WebElement edit=driver.findElement(By.xpath("(//img[@title='Edit Profile'])[1]"));
             edit.click();
             driver.switchTo().frame("contactInfoContentId");
             WebElement about=driver.findElement(By.xpath("//a[contains(text(),'About')]"));
             about.click();
             WebElement lastName=driver.findElement(By.id("lastName"));
             lastName.clear();
             lastName.sendKeys("Abcd");
             WebElement saveAll=driver.findElement(By.xpath("//input[@value='Save All']"));
             saveAll.click();
             driver.switchTo().defaultContent();
             try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
             WebElement updatedLName=driver.findElement(By.id("tailBreadcrumbNode"));
             String actuallName=updatedLName.getText();
             System.out.println("Users firstname and lastname is displayed as: "+actuallName);
             WebElement updatedUsemenu=driver.findElement(By.id("userNavLabel"));
             String actualTextName=updatedLName.getText();
             System.out.println("Updated usermenu for Firstname Lastname menu button is: "+actualTextName);
            driver.close();
	    }
	    
		}

      