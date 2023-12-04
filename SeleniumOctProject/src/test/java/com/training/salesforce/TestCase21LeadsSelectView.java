package com.training.salesforce;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase21LeadsSelectView {
	 static WebDriver driver;
	public static void main(String[] args) {
		launchapplication();
		login();
		leadsTab();
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
	    	try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            WebElement view=driver.findElement(By.id("fcf"));
            view.click();
            Select select=new Select(view);
            List<WebElement> viewlist=select.getOptions();
            for(WebElement ele:viewlist) {
            	System.out.println(ele.getText());
            	}
           driver.close();
	    }
    
      }
