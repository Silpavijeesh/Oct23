package com.training.salesforce;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase37BlockEventWithWeelyrecurrance {
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
		driver.manage().window().maximize();
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
		 WebElement timelink=driver.findElement(By.xpath("//a[contains(text(),'4:00 PM')]"));
         timelink.click();
		 System.out.println("calender of new event pageis displayed");
		 try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 String parentHandle=driver.getWindowHandle();
		 System.out.println(parentHandle);
		WebElement combopopUp=driver.findElement(By.xpath("//img[@title='Subject Combo (New Window)']")); 
		combopopUp.click();	
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
	WebElement endTimefld=driver.findElement(By.xpath("//input[@id='EndDateTime_time']"));
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	endTimefld.click();
	System.out.println("dropdown is displayed with time");	
	WebElement endtime=driver.findElement(By.id("timePickerItem_38"));
	endtime.click();
	WebElement recurrence=driver.findElement(By.id("IsRecurrence"));
	recurrence.click();
	System.out.println("check box is checked, frequency,start date,end date sectionsare displayed");
	WebElement weeklyRButton=driver.findElement(By.id("rectypeftw"));
	weeklyRButton.click();
	System.out.println("weekly radiobutton is selected and 1 entered in Recurs every field and Current day of the week is selected");
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	WebElement rEndDate=driver.findElement(By.id("RecurrenceEndDateOnly"));
	rEndDate.click();
	WebElement monthdpdwn=driver.findElement(By.id("calMonthPicker"));
	Select select=new Select(monthdpdwn);
	select.selectByVisibleText("December");
	WebElement rEnd=driver.findElement(By.xpath("//td[text()='8']"));
	rEnd.click();
	WebElement save=driver.findElement(By.xpath("(//input[@title='Save'])[2]"));
	save.click();
	System.out.println("calender of firstname,Lastname page is displayed" );
	WebElement monthview=driver.findElement(By.xpath("//img[@class='monthViewIcon']"));
	monthview.click();
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	String expectedTitle="Calendar for Silpa Rajan1 - Month View ~ Salesforce - Developer Edition";
	String actualTitle=driver.getTitle();
	compareText(actualTitle, expectedTitle);
	System.out.println("Test case passed");
	driver.close();
		}
	private static void compareText(String actualText, String expectedText) {
		Assert.assertEquals(actualText, expectedText);
		
	} 
	
 }


