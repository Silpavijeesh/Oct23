package com.training.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase17TestOptyReport {
  static WebDriver driver;
	public static void main(String[] args) {
	launchapplication();	
	login();
	oppotunity();
	optyPipeline();
	close();
	
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
	    static void oppotunity() {
	        WebElement opty=driver.findElement(By.xpath("//a[@title='Opportunities Tab']"));
	        opty.click();
	        try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
		    }
   static void optyPipeline() {
	   WebElement pipeline=driver.findElement(By.xpath("//a[contains(text(),'Opportunity Pipeline')]"));
       pipeline.click();
      WebElement optyPipelineValidn=driver.findElement(By.xpath("//h1[text()='Opportunity Pipeline']"));
        String actualText=optyPipelineValidn.getText();
        System.out.println("Actual report is: "+actualText);
       // Assert.assertEquals(actualText,"Opportunity Pipeline");
   }
   static void close() {
	   driver.close();
   }
}
