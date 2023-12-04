package com.training.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase19QuarterlySumReport {
  static WebDriver driver; 
	public static void main(String[] args)  {
	launchapplication();
	login();
	oppotunity();
	quarterlysummary();	
		
		
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
	static void quarterlysummary() {
  WebElement interval=driver.findElement(By.id("quarter_q"));
  Select inervaldropdwn=new Select(interval);
  inervaldropdwn.selectByVisibleText("Next FQ");
  WebElement include=driver.findElement(By.id("open"));
  Select includedropdwn=new Select(include);
  includedropdwn.selectByVisibleText("Closed Opportunities");
  WebElement runReport=driver.findElement(By.xpath("//input[@title='Run Report']"));
  runReport.click();
  WebElement optyReportvalidn=driver.findElement(By.xpath("//h1[text()='Opportunity Report']"));
  String actualReport=optyReportvalidn.getText();
  System.out.println("actualreport validation is: "+actualReport);
  driver.close();
  }

}
