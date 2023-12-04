package com.training.salesforce;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase15OpptyDrpdwn {
	static WebDriver driver; 
	public static void main(String[] args)  {
		launchapplication();
		login();
		opportunity();
		
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
	    static void opportunity() {
        WebElement opty=driver.findElement(By.xpath("//a[@title='Opportunities Tab']"));
        opty.click();
        try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        WebElement optyHomevalidn=driver.findElement(By.xpath("//h2[text()=' Home']"));
        String expectedtext="Home";
        String actualtext=optyHomevalidn.getText();
        if(expectedtext.equals(actualtext)) {
        	System.out.println("Opportunity home page is displayed");
        }
        else {
        	System.out.println("Opportunity home page is not displayed");
        }
        WebElement optyDropdwn=driver.findElement(By.id("fcf")); 
        Select select=new Select(optyDropdwn);
        List<WebElement> optyList=select.getOptions();
        for(WebElement ele:optyList) {
        	System.out.println(ele.getText());
        }
        driver.close();

	}

}

