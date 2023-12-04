package com.training.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase25CreateNewContact {
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
	    String actualTitle=driver.getTitle();
	    String expectedTitle="Contacts: Home ~ Salesforce - Developer Edition";
	    Assert.assertEquals(actualTitle, expectedTitle);
        System.out.println("Test completed");
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
	    WebElement lastName=driver.findElement(By.id("name_lastcon2"));
	    lastName.clear();
	    lastName.sendKeys("Rajan1");
	    WebElement accName=driver.findElement(By.id("con4"));
	    accName.clear();
	    accName.sendKeys("Silpa");
	    WebElement saveBtn=driver.findElement(By.xpath("(//input[@title='Save'])[1]"));
	    saveBtn.click();
	    WebElement contactValidn=driver.findElement(By.xpath("//h2[@class='topName']"));
	    String actualContact=contactValidn.getText();
	    String expectedContact="Rajan1";
	     Assert.assertEquals(actualContact, expectedContact);
	    System.out.println("Testcase passed");
	    driver.close();
	    }

}
