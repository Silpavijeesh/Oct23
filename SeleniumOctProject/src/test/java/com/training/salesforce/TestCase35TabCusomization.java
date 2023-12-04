package com.training.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase35TabCusomization {
	static WebDriver driver;

	public static void main(String[] args) {
       launchapplication();
       login();
		allTabs();
		logout();
		launchandlogin();
		
		
	}

	static void launchapplication() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://login.salesforce.com");
         try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	static void login() {
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("silu@test.com");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Ammukutty12");
		WebElement login = driver.findElement(By.name("Login"));
		login.click();
        }
	static void allTabs() {
   WebElement alltabs=driver.findElement(By.xpath("//img[@class='allTabsArrow']"));
   alltabs.click();
   System.out.println("All Tabs page is displayed");
   WebElement customizeMytabs=driver.findElement(By.xpath("//input[@value='Customize My Tabs']"));
   customizeMytabs.click();
   System.out.println("Customize My Tabs page is displayed");
   try {
	Thread.sleep(5000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
     
   WebElement subscription=driver.findElement(By.xpath("//option[text()='Subscriptions']"));
   subscription.click();
   WebElement remove=driver.findElement(By.xpath("//img[@title='Remove']"));
   remove.click();
   System.out.println("subscription tabis removed from 'Selected Tabs' and moved to 'available Tabs' section");
   WebElement save=driver.findElement(By.xpath("//input[@value=' Save ']"));
   save.click();
   String actualTitlle=driver.getTitle();
   String expectedTitle="All Tabs ~ Salesforce - Developer Edition";
   compareText(actualTitlle,expectedTitle);
   System.out.println("actual Title is: "+actualTitlle);
   System.out.println("Testcase pass-Subscription tabe is removed from 'All Tab' page");
	}
	static void logout() {
		
	         WebElement usermenuDrpdown=driver.findElement(By.id("userNav-arrow"));
	         usermenuDrpdown.click();
	         
		    WebElement logout=driver.findElement(By.xpath("//a[@title='Logout']"));
	        logout.click();
	        try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        String actualPage=driver.getTitle();
	        String expectedPage="Login | Salesforce";
	        compareText(actualPage,expectedPage);
	        System.out.println("Displayed page is: "+actualPage);
		    }	
		static void launchandlogin() {
			WebElement username=driver.findElement(By.id("username"));
		    username.sendKeys("silu@test.com");
		    WebElement password=driver.findElement(By.id("password"));
		    password.sendKeys("Ammukutty12");
		    try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    WebElement login=driver.findElement(By.name("Login"));
		    login.click();
		    System.out.println("Tab removed before login is not displayed in the Tab bar");
		    driver.close();
		}
		
	private static void compareText(String actualText, String expectedText) {
	Assert.assertEquals(actualText, expectedText);
		}
}
 