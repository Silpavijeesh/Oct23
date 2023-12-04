package com.training.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase27CheckRecentContact {
	static WebDriver driver; 
	public static void main(String[] args) {
	launchapplication();
	login();
	contactsTab();
	recentlycreated();
		
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
	     static void recentlycreated() {
	    WebElement recentlyCreated=driver.findElement(By.xpath("//select[@id='hotlist_mode']"));
	    recentlyCreated.click();
	    Select select=new Select(recentlyCreated);
	    select.selectByVisibleText("Recently Created");
	    WebElement rcontactValidn=driver.findElement(By.xpath("//h3[contains(text(),'Recent Contacts')]"));
	    String actualText=rcontactValidn.getText();
        System.out.println("actualtext is: "+actualText);
        driver.close();
	    
	    }

 }




