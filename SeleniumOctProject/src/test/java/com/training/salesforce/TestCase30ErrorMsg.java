package com.training.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase30ErrorMsg {
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
	     WebElement viewUniqueName=driver.findElement(By.id("devname"));
	     viewUniqueName.sendKeys("EFGH");
	     WebElement save=driver.findElement(By.xpath("(//input[@title='Save'])[1]"));
	     save.click();
	     WebElement errorvalidn=driver.findElement(By.xpath("//div[contains(text(),'You must enter a value')]"));
	     String actualerror=errorvalidn.getText();
	     String expectederror="Error: You must enter a value";
	     Assert.assertEquals(actualerror, expectederror);
	     System.out.println("Testcase passed");
	     driver.close();
        }     
	     
}

