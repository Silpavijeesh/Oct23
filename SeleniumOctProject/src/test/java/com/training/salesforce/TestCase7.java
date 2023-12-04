package com.training.salesforce;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase7 {
	static WebDriver driver;
public static void main(String[] args)  {
	launchapplication();
	windowmaximize();
	login();
	usermenuDropdown();
	mySettings();
	mySettingsValidation();
	personal();
	loginHistory();
	displayandlayout();
	email();
	calAndRemainders();
	
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
    static void windowmaximize() {
	driver.manage().window().maximize();
    }
    static void login() {
    WebElement username=driver.findElement(By.id("username"));
    username.sendKeys("silu@test.com");
    WebElement password=driver.findElement(By.id("password"));
    password.sendKeys("Ammukutty12");
    WebElement login=driver.findElement(By.name("Login"));
    login.click();
    }
    static void usermenuDropdown() {
    WebElement usermenuDrpdown=driver.findElement(By.id("userNavLabel"));
    usermenuDrpdown.click();
    try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    }
    static void mySettings() {
    WebElement mySettings=driver.findElement(By.xpath("//a[@title='My Settings']"));
    mySettings.click();
    }
    static void mySettingsValidation() {
    WebElement mySettingsValidn=driver.findElement(By.xpath("//span[text()='My Settings']"));
    String expected="My Settings";
    String actual=mySettingsValidn.getText();
    if(expected.equals(actual)) {
    	System.out.println("My settings page is displayed");
    }
    else {
    	System.out.println("My settings page is not displayed");
    }
    }
    static void personal() {
     WebElement personal=driver.findElement(By.id("PersonalInfo_font"));
    personal.click();
    }
    static void loginHistory() {
    WebElement loginHistory=driver.findElement(By.id("LoginHistory_font"));
    loginHistory.click();
    WebElement loginhistoryValidn=driver.findElement(By.xpath("//h1[text()='Login History']"));
    String expectedHistory="Login History";
    String actualHistory=loginhistoryValidn.getText();
    if(expectedHistory.equals(actualHistory)) {
    	System.out.println("login history page is displayed");
    }
    else {
    	System.out.println("login history page is not displayed");
    }
    try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    }
    static void displayandlayout() {
    WebElement displayLayout=driver.findElement(By.id("DisplayAndLayout_font"));
    displayLayout.click();
    WebElement customizeTabs=driver.findElement(By.id("CustomizeTabs_font"));
    customizeTabs.click();
    WebElement customDropdwn=driver.findElement(By.id("p4"));
    Select content=new Select(customDropdwn);
    content.selectByVisibleText("Salesforce Chatter");
    WebElement Reports=driver.findElement(By.xpath("//option[@value='report']"));
    Reports.click();
    WebElement Add=driver.findElement(By.xpath("//img[@title='Add']"));
    Add.click();
    WebElement save=driver.findElement(By.xpath("//input[@class='btn primary']"));
    save.click();
    try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    }
    static void email() {
    WebElement Email=driver.findElement(By.id("EmailSetup_font"));
    Email.click();
    WebElement myEmailsettings=driver.findElement(By.id("EmailSettings_font"));
    myEmailsettings.click();
    WebElement emailName=driver.findElement(By.id("sender_name"));
    emailName.clear();
    emailName.sendKeys("Silpa Vijeesh");
    WebElement emailAddress=driver.findElement(By.id("sender_email"));
    emailAddress.clear();
    emailAddress.sendKeys("Silpapinagote@gmail.com");
    try {
		Thread.sleep(5000);
	} catch (InterruptedException e2) {
		// TODO Auto-generated catch block
		e2.printStackTrace();
	}
    WebElement radiobtn=driver.findElement(By.id("auto_bcc1"));
     radiobtn.click();
    
    WebElement savebtn=driver.findElement(By.xpath("//input[@name='save']"));
    savebtn.click();
    WebElement validnmessg=driver.findElement(By.xpath("//div[contains(text(),'Your settings')]"));
    String expectedmsg="Your settings have been successfully saved.";		
    String actualmsg=validnmessg.getText();
    if(expectedmsg.equals(actualmsg)) {
    	System.out.println("your settings have been succssfully saved msg displayed");
    }
    else {
    	System.out.println("your settings have not been succssfully saved msg displayed");
    }
    try {
		Thread.sleep(5000);
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
    }
    static void calAndRemainders() {
    WebElement calReminder=driver.findElement(By.id("CalendarAndReminders_font"));
    calReminder.click();		
   WebElement ActivityRem=driver.findElement(By.id("Reminders_font"));
    ActivityRem.click();
    String parentWindow=driver.getWindowHandle();
    System.out.println(parentWindow);
    WebElement OpenTestRem=driver.findElement(By.id("testbtn"));
    OpenTestRem.click();
   
    try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    Set<String>handles=driver.getWindowHandles();
  //getting Iterator from Set to traverse elements
    Iterator<String> it=handles.iterator();
    String parentwindowId=it.next();
    System.out.println("parent window id: "+parentwindowId);
    String childwindowId=it.next();
    System.out.println("child window id: "+childwindowId);
    driver.switchTo().window(childwindowId);
    try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   System.out.println("child window popUp title="+driver.getTitle());
   driver.close();
   driver.switchTo().window(parentwindowId);
   System.out.println(driver.getTitle());
   driver.close();
   }
   }
 


