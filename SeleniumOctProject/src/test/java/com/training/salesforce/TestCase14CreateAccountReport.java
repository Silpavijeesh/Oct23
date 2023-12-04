package com.training.salesforce;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase14CreateAccountReport {
	static WebDriver driver; 
	public static void main(String[] args)   {
		launchapplication();
		login();
		accounts();
		lastactivity();
		report();
		savebutton();
	}
	   static void launchapplication() {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get("https://login.salesforce.com");

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
	   static void lastactivity() {
        WebElement lastActivity=driver.findElement(By.xpath("//a[contains(text(),'Accounts with')]"));
        lastActivity.click();
	     WebElement unsavedReportvaldn=driver.findElement(By.xpath("//h2[text()='Unsaved Report']"));
        String expectedtxt="Unsaved Report";
        String actualtxt=unsavedReportvaldn.getText();
        if(expectedtxt.equals(actualtxt)) {
        	System.out.println("Unsaved report page is displayed");
        }
        else {
        	System.out.println("unsaved report page is not displayed");
        	}
	   }
	   static void  report() {
        WebElement dateField=driver.findElement(By.id("ext-gen148"));
        dateField.click();
        try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        WebElement cDate=driver.findElement(By.xpath("//div[text()='Created Date']"));
        cDate.click();
        try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        WebElement from=driver.findElement(By.id("ext-gen152"));
        from.click();
         WebElement today=driver.findElement(By.xpath("//button[text()='Today']"));
        today.click();
        WebElement to=driver.findElement(By.id("ext-gen154"));
        to.click();
        try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        WebElement today2=driver.findElement(By.xpath("(//button[contains(text(),'Today')])[2]"));
        today2.click();
       }
	   static void savebutton() {
		   WebElement save=driver.findElement(By.id("ext-gen49"));
		   save.click();
		  
		   driver.switchTo().activeElement();
			WebElement repName=driver.findElement(By.xpath("//input[@id='saveReportDlg_reportNameField']"));	  
			repName.sendKeys("nReport1");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			WebElement repUName=driver.findElement(By.xpath("//input[@id='saveReportDlg_DeveloperName']"));	  
			repUName.sendKeys("nReport13");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			WebElement saveNrun=driver.findElement(By.xpath("//button[contains(text(),'Save and Run Report')]"));	  
			saveNrun.click();
			System.out.println(saveNrun.getText());	
			
			
			driver.switchTo().defaultContent();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		System.out.println("Reportpage with details and report name is displayed");
          driver.close();	  
			  }
			  
		  }
		   

