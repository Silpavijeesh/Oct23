package com.training.salesforce;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase8 {
	static WebDriver driver;
public static void main(String[] args) {
	launchapplication();
	login();
	usermenu();
	developerConsole();
	
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
    try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
  static void usermenu() {
    WebElement usermenuDrpdown=driver.findElement(By.id("userNavLabel"));
    usermenuDrpdown.click();
    
  }
  static void developerConsole() {
    WebElement developerConsole=driver.findElement(By.xpath("//a[@title='Developer Console (New Window)']"));
    String parentHandle=driver.getWindowHandle();
    developerConsole.click();
    Set<String>handles=driver.getWindowHandles();
    for(String handle:handles) {
    	System.out.println(handle);
    	if(!handle.equals(parentHandle)) {
    		driver.switchTo().window(handle);
    	try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	driver.close();
    	}	
    }
   driver.switchTo().window(parentHandle);
   System.out.println(driver.getTitle());
   try {
	Thread.sleep(5000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
  driver.close(); 
 }
}

