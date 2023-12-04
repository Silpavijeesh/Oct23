package com.training.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase12 {
	static WebDriver driver;
	public static void main(String[] args) {
		launchapplication();
		login();
		accounts();
		viewdropdown();
		edit();
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
	 static void accounts() {
        WebElement accounts=driver.findElement(By.xpath("//a[@title='Accounts Tab']"));
        accounts.click();
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
        static void viewdropdown() {
        WebElement viewDropdwn=driver.findElement(By.id("fcf"));
        Select select=new Select(viewDropdwn);
        select.selectByVisibleText("Silpa4");
        }
        static void edit() {
        WebElement edit=driver.findElement(By.xpath("//a[text()='Edit']"));
        edit.click();
        WebElement editViewValidn=driver.findElement(By.xpath("//h2[text()=' Edit View']"));
        String expectedtxt="Edit View";
        String actuatxt=editViewValidn.getText();
        if(expectedtxt.equals(actuatxt)) {
        	System.out.println("Edit viewname page is displayed");
        }
        else {
        	System.out.println("edit viewname page is not displayed");
        }
        WebElement vName=driver.findElement(By.id("fname"));
        vName.clear();
        vName.sendKeys("Daffodil");
       WebElement vUName=driver.findElement(By.id("devname"));
       vUName.clear();
      vUName.sendKeys("Daf21");
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        
        WebElement filterDrpdwn=driver.findElement(By.id("fcol1"));
        Select filter=new Select(filterDrpdwn); 
        filter.selectByValue("ACCOUNT.NAME");
        WebElement operatorDrpdwn=driver.findElement(By.id("fop1"));
        Select operator=new Select(operatorDrpdwn); 
        operator.selectByVisibleText("contains");
        WebElement value=driver.findElement(By.id("fval1"));
        value.clear();
        value.sendKeys("a");
        WebElement save=driver.findElement(By.xpath("(//input[@title='Save'])[1]"));
        save.click();
        try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	 }
	 static void close() {
	  driver.close();
   }
	
  }

