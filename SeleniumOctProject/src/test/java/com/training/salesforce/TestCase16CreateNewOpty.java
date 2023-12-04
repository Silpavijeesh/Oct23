package com.training.salesforce;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase16CreateNewOpty {
	static WebDriver driver; 
	public static void main(String[] args) {
		launchapplication();
		login();
		oppotunity();
		createnewOppotunity();
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
	    static void oppotunity() {
        WebElement opty=driver.findElement(By.xpath("//a[@title='Opportunities Tab']"));
        opty.click();
        try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    }
	    static void createnewOppotunity() {
        WebElement newbtn=driver.findElement(By.xpath("//input[@title='New']"));
        newbtn.click();
        WebElement optyName=driver.findElement(By.id("opp3"));
        optyName.sendKeys("Opty1");
        
        WebElement acctName=driver.findElement(By.id("opp4"));
        		acctName.sendKeys("Silpa");
         WebElement leadSource=driver.findElement(By.id("opp6"));
         Select leadDpdwn=new Select(leadSource);
         leadDpdwn.selectByVisibleText("Phone Inquiry");
       WebElement closeDate= driver.findElement(By.id("opp9"));
       closeDate.click();
       WebElement Today= driver.findElement(By.xpath("//a[contains(text(),'Today')]"));
      Today.click();
      WebElement stage= driver.findElement(By.id("opp11"));
      Select stageDpdwn=new Select(stage);
      stageDpdwn.selectByVisibleText("Needs Analysis");
      
      WebElement probability=  driver.findElement(By.id("opp12"));
      probability.clear();
      probability.sendKeys("50");
       try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
       String parentWindow=driver.getWindowHandle();
       System.out.println(parentWindow);
       WebElement pcampaign=driver.findElement(By.xpath("//img[@alt='Primary Campaign Source Lookup (New Window)']"));
       pcampaign.click();
       Set<String>handles=driver.getWindowHandles();
       Iterator<String> it=handles.iterator();
       String parentwindowId=it.next();
       System.out.println("parent window id is: "+parentwindowId);
       String childwindowId=it.next();
       System.out.println("Child window id is: "+childwindowId);
       driver.switchTo().window(childwindowId);
       System.out.println("childwindowId is: "+driver.getTitle());
       
       driver.switchTo().frame("searchFrame");
       WebElement searchbtn=driver.findElement(By.xpath("//input[@placeholder='Search...']"));
       searchbtn.sendKeys("*sa*");
       try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
       WebElement go=driver.findElement(By.name("go"));
       go.click();
       driver.switchTo().defaultContent();
       driver.switchTo().frame("resultsFrame");
       WebElement cname=driver.findElement(By.xpath("//a[contains(text(),'International')]"));
       cname.click();
       driver.switchTo().window(parentwindowId);
       try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
       WebElement savebtn=driver.findElement(By.xpath("(//input[@title='Save'])[1]"));   
      savebtn.click();  
     WebElement newoptyValidn=driver.findElement(By.className("pageDescription"));    
        String actualText=newoptyValidn.getText();
        System.out.println("actualtext is: "+actualText);
        System.out.println("New opportunity page is displayed with opty details");
	}
     static void close() {
    	 driver.close();
     }
	
}
