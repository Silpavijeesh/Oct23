package com.training.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase26CreatenewView {
	static WebDriver driver;
	public static void main(String[] args) {
	launchapplication();	
	login();	
	contactsTab();
	createNewview();
		
		
		
		
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
	   static void createNewview() {
	   WebElement createNewview=driver.findElement(By.xpath("//a[contains(text(),'Create New View')]"));
       createNewview.click();
	   WebElement vName=driver.findElement(By.id("fname"));
	   vName.clear();
	   vName.sendKeys("SilpaVRaj");
	   try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   WebElement vUnqName=driver.findElement(By.id("devname"));
	   vUnqName.clear();
	   vUnqName.sendKeys("diamond_123");
	   WebElement savebtn=driver.findElement(By.xpath("(//input[@title='Save'])[1]"));
	   savebtn.click();
	   String actualTitle=driver.getTitle();
	   String ExpectedTitle="Contacts ~ Salesforce - Developer Edition";
	   Assert.assertEquals(actualTitle, ExpectedTitle);
	   System.out.println("Test completed");
	   driver.close();
	   }

}

