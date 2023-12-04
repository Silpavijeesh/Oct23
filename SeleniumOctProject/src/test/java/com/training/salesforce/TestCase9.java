package com.training.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase9 {
	static WebDriver driver;
	public static void main(String[] args) {
		launchapplication();
		login();
		usermenu();
		logout();
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
	  static void usermenu() {
        WebElement usermenuDrpdown=driver.findElement(By.id("userNavLabel"));
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
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        String expectedTitle="Login | Salesforce";
        String actualTitle=driver.getTitle();
        if(expectedTitle.equals(actualTitle)) {
        	System.out.println("Testcase passed");
        	}
        else {
        	System.out.println("Testcase failed");
        }
	}
  static void close() {
	  driver.close();
  }
}






