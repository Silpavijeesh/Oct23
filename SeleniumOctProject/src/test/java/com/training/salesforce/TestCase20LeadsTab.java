package com.training.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase20LeadsTab {
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
	 WebElement leadshomevalidn=driver.findElement(By.xpath("//h2[contains(text(),'Home')]"));
	 String leadsHome=leadshomevalidn.getText();
	  System.out.println("LeadsHome validation is: "+leadsHome);
	  driver.close();
	 
  }
}
