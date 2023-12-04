package com.training.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase28MyContactView {
	static WebDriver driver; 
	public static void main(String[] args)  {
	launchapplication();
	login();
	contactsTab();
	myContacts();
		
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
	    static void myContacts() {
	    WebElement view=driver.findElement(By.id("fcf"));
         view.click();
         Select viewdrpdwn=new Select(view);
         viewdrpdwn.selectByVisibleText("My Contacts");
         System.out.println("My contacts view is displayed");
         driver.close();
  }
   }
