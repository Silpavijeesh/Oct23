package com.training.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase18StuckOpty {
	static WebDriver driver; 
	public static void main(String[] args) {
		launchapplication();
		login();
		oppotunity();
		stuckOpty();
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
	static void stuckOpty() {
	   WebElement stuckopty=driver.findElement(By.xpath("//a[text()='Stuck Opportunities']"));
	    stuckopty.click();
	    WebElement validn=driver.findElement(By.xpath("//h1[text()='Stuck Opportunities']"));
	    String actualvalidn=validn.getText();
	    System.out.println("actual validation is: "+actualvalidn);
	}
	static void close() {
		driver.close();
	}
}
