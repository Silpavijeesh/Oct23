package com.training.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase13MergeAccounts {
	static WebDriver driver; 
	public static void main(String[] args) {
	launchapplication();	
	login();
	account();
	mergeaccount();
	alertpopup();
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
        }
	  static void mergeaccount() {  
        WebElement mergeAcc=driver.findElement(By.xpath("//a[text()='Merge Accounts']"));
        mergeAcc.click();
        WebElement txtbox=driver.findElement(By.id("srch"));
        txtbox.sendKeys("acc"); 
        try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        WebElement findAcc=driver.findElement(By.xpath("//input[@value='Find Accounts']"));
        findAcc.click();
        WebElement acc1= driver.findElement(By.name("cid"));
        acc1.click();
        WebElement acc2=driver.findElement(By.id("cid1"));
        acc2.click();
        WebElement next=driver.findElement(By.xpath("(//input[@value=' Next '])[1]"));
        next.click();
        WebElement MergeValidn=driver.findElement(By.xpath("//h2[contains(text(),'Step 2')]"));
        String expectedStep="Step 2. Select the values to retain";
        String actualStep=MergeValidn.getText();
        if(expectedStep.equals(actualStep)) {
        	System.out.println("Step2 is displayed");
        }
        else {
        	System.out.println("Step2 is not displayed");
        }
        try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        WebElement merge=driver.findElement(By.xpath("(//input[@title='Merge'])[1]"));
        merge.click();
	  }
        static void alertpopup() {
        String alertText=driver.switchTo().alert().getText();
        System.out.println(alertText); 
        driver.switchTo().alert().accept();
        }
        static void close() {
        driver.close();
        
        }

}



