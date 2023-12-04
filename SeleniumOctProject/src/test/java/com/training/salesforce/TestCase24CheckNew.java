package com.training.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase24CheckNew {
	 static WebDriver driver;
	public static void main(String[] args) {
		launchapplication();
		login();
		leadsTab();
		newbutton();
		
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
	    	try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	}
	    static void newbutton() {
	    	WebElement newbtn=driver.findElement(By.xpath("//input[@title='New']"));
	    	newbtn.click();
	    	WebElement newLeadValidn=driver.findElement(By.xpath("//h2[contains(text(),' New Lead')]"));
	        String actualText=newLeadValidn.getText();
	        System.out.println("The new Lead page is: "+actualText);
	       WebElement lastName=driver.findElement(By.id("name_lastlea2"));
	       lastName.clear();
	        lastName.sendKeys("ABCD");
	        WebElement companyName=driver.findElement(By.id("lea3"));
	        companyName.clear();
	        companyName.sendKeys("ABCD");
	        WebElement savebtn=driver.findElement(By.xpath("(//input[@title='Save'])[1]"));
	        savebtn.click();
	        String actualtitle=driver.getTitle();
	        String expectedTitle="Lead: ABCD ~ Salesforce - Developer Edition";
	        Assert.assertEquals(actualtitle, expectedTitle);
	        System.out.println("Test completed");
	        driver.close();
	    }

}

