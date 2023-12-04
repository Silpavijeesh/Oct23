package com.training.salesforce;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase36BlockeventinCalender {
	 static WebDriver driver;
	public static void main(String[] args) {
		launchapplication();
		login();
		homeTab();
		endTime();
		
		
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
	 WebElement currentDatelink=driver.findElement(By.xpath("//span[@class='pageDescription']/a"));
     currentDatelink.click();
	 System.out.println("calender of firstname lastname page is displayed");
	 WebElement time=driver.findElement(By.xpath("//a[contains(text(),'8:00 PM')]"));
	 time.click();
	System.out.println("Calender:New event page is displayed,cursor at the subject field");
	 WebElement comboicon=driver.findElement(By.xpath("//img[@class='comboboxIcon']"));
	 String parentHandle=driver.getWindowHandle();
	 comboicon.click();
	 System.out.println("combobox popup is displayed");
	
	 try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 Set<String>handles=driver.getWindowHandles();
	 for(String handle:handles) {
		 System.out.println(handle);
		if(!handle.equals(parentHandle)) {
			driver.switchTo().window(handle);
			WebElement other=driver.findElement(By.xpath("//a[text()='Other']")); 
			 other.click();
			 System.out.println("combo box pop closed and other is entered into subject");
		}
	 }
		driver.switchTo().window(parentHandle);	
		
	}
	static void endTime() {
	WebElement endTimefld=driver.findElement(By.id("EndDateTime_time"));
	endTimefld.click();
	
	System.out.println("dropdown is displayed");
	WebElement etime=driver.findElement(By.id("timePickerItem_42"));
	etime.click();
   WebElement save=driver.findElement(By.xpath("(//input[@title='Save'])[1]"));
   save.click();
   String actualTitle=driver.getTitle();
   String expectedTitle="Calendar for Silpa Rajan1 ~ Salesforce - Developer Edition";
  // Assert.assertEquals(actualTitle, expectedTitle);
   compareText(actualTitle, expectedTitle);
   System.out.println("Test completed");
   driver.close();
	 }
	private static void compareText(String actualText, String expectedText) {
		Assert.assertEquals(actualText, expectedText);
 }
}	 
	 
	 
 
