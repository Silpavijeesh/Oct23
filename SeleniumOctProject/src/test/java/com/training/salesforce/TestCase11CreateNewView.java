package com.training.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase11CreateNewView {
	static WebDriver driver;
	public static void main(String[] args) {
		launchapplication();
		login();
		account();
		createnewview();
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
	static void account() {
        WebElement accounts=driver.findElement(By.xpath("//a[@title='Accounts Tab']"));
        accounts.click();
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        WebElement accountHome=driver.findElement(By.xpath("//h2[text()=' Home']"));
        String Expected="Home";
        String actual=accountHome.getText();
        if(Expected.equals(actual)) {
        	System.out.println("Account homepage is displayed");
        }
        else {
        	System.out.println("Account homepage is not displayed");
        }
	}
	    static void createnewview() {
        WebElement createNView=driver.findElement(By.xpath("//a[text()='Create New View']"));
        createNView.click();
        WebElement vname=driver.findElement(By.id("fname"));
        vname.clear();
        vname.sendKeys("Silpa");
        WebElement vuniqueName=driver.findElement(By.id("devname"));
        vuniqueName.clear();
        vuniqueName.sendKeys("Silpa13");
        WebElement save=driver.findElement(By.xpath("(//input[@name='save'])[1]"));
        save.click();
        System.out.println("newly added view is displayed in the account viewlist");
       
       }
     static void close() {
    	 driver.close();
     }
   }


