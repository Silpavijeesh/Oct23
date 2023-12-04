package com.training.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase22DefaultView {
	static WebDriver driver;
	public static void main(String[] args) {
		launchapplication();
		login();
		leadsTab();
		todaysLeads();
		usermenuDropdown();
		logout();
		login1();
		leadsTab1();
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
	    static void leadsTab() {
	    	WebElement leads=driver.findElement(By.xpath("//a[@title='Leads Tab']"));  
	    	leads.click(); 
	    	
	    }
	    static void todaysLeads() {
	    	WebElement view=driver.findElement(By.id("fcf"));
	    	view.click();
	    	try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            Select select=new Select(view);
            select.selectByVisibleText("Today's Leads");
	    }
	    static void usermenuDropdown() {
	        WebElement usermenuDrpdown=driver.findElement(By.id("userNav-arrow"));
	         usermenuDrpdown.click();
	         try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    }
		    static void logout() {
	        WebElement logout=driver.findElement(By.xpath("//a[@title='Logout']"));
	        logout.click();
	        try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    }
		    static void login1() {
		        WebElement username=driver.findElement(By.id("username"));
		        username.sendKeys("silu@test.com");
		        WebElement password=driver.findElement(By.id("password"));
		        password.sendKeys("Ammukutty12");
		        WebElement login=driver.findElement(By.name("Login"));
		        login.click();
		        }
			    static void leadsTab1() {
			    	WebElement leads=driver.findElement(By.xpath("//a[@title='Leads Tab']"));  
			    	leads.click(); 
			    	WebElement go=driver.findElement(By.xpath("//input[@title='Go!']"));
			    	go.click();
			    	driver.close();
			    }
			     
			   }
 