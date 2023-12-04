package com.training.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase31CancelButtonFunctionality {
	static WebDriver driver;
	public static void main(String[] args) {
		launchapplication();
		login();
		contactsTab();
		createNewView();
		
		
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
	    static void createNewView() {
		     WebElement createNView=driver.findElement(By.xpath("//a[contains(text(),'Create New View')]"));
		     createNView.click();
		     WebElement viewName=driver.findElement(By.id("fname"));
		    viewName.clear();
		     viewName.sendKeys("ABCD");
	    
		     WebElement viewUniqueName=driver.findElement(By.id("devname"));
		      viewUniqueName.clear();
		      try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		     viewUniqueName.sendKeys("EFGH");
		     WebElement cancelbtn=driver.findElement(By.xpath("(//input[@title='Cancel'])[1]"));
	         cancelbtn.click();
	         System.out.println("Contacts Home page is displayed and View ABCD is not created");
	         driver.close();
	    }
}

