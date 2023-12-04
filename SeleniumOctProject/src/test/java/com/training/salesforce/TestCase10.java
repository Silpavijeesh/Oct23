package com.training.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase10 {
	static WebDriver driver;
public static void main(String[] args)  {
	launchapplication();
	login();
	accountslink();
	createNewAccount();
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
   static void accountslink() {
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
   static void createNewAccount() {
    WebElement createNew=driver.findElement(By.id("createNewButton"));
    createNew.click();
    WebElement account=driver.findElement(By.xpath("//a[@class='accountMru menuButtonMenuLink']"));
    account.click();
    try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    WebElement newAccountValdn=driver.findElement(By.xpath("//h2[text()=' New Account']"));
    String expectedAccount="New Account";
    String actualAccount=newAccountValdn.getText();
    if(expectedAccount.equals(actualAccount)) {
    	System.out.println("New Account page is displayed with account details");
    }
    else {
    System.out.println("New Account page is not displayed");
    
    }
    WebElement accName=driver.findElement(By.id("acc2"));
    accName.sendKeys("accDaffodil");
    WebElement acctype=driver.findElement(By.id("acc6"));
    Select type=new Select(acctype);
    try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    type.selectByVisibleText("Technology Partner");
    
    WebElement custPriority=driver.findElement(By.id("00NHu00000NHgvi"));
    Select select=new Select(custPriority);
    select.selectByVisibleText("High");
    
   WebElement saveBtn=driver.findElement(By.xpath("(//input[@title='Save'])[1]"));
   saveBtn.click();
   try {
	Thread.sleep(5000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
    WebElement newaccvalidn=driver.findElement(By.xpath("//h2[contains(text(),'accDaffodil')]"));
    String expectednAccount="accDaffodil";
    String actualnAccount=newaccvalidn.getText();
    if(expectednAccount.equals(actualnAccount)) {
    	System.out.println("New Account page is displayed with account details");
    }
    else {
    System.out.println("New Account page is not displayed");
    
    }
 }  
static void close() {
	   driver.close();
   }
 }




