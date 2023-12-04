package com.training.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase12EditView {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com");
		Thread.sleep(5000);
        WebElement username=driver.findElement(By.id("username"));
        username.sendKeys("silu@test.com");
        WebElement password=driver.findElement(By.id("password"));
        password.sendKeys("Ammukutty12");
        WebElement login=driver.findElement(By.name("Login"));
        login.click();
        WebElement accounts=driver.findElement(By.xpath("//a[@title='Accounts Tab']"));
        accounts.click();
        Thread.sleep(2000);
        WebElement viewDropdwn=driver.findElement(By.id("fcf"));
        Select select=new Select(viewDropdwn);
        select.selectByVisibleText("Silpa11");
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
        vName.sendKeys("silpa1133");
       WebElement vUName=driver.findElement(By.id("devname"));
       vUName.clear();
       vUName.sendKeys("silpa12cc");
        Thread.sleep(2000);
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
        Thread.sleep(5000);
        WebElement newVDropdwn=driver.findElement(By.id("00BHu00000HSLLl_listSelect"));
        String expectedNview="silpa1133";
        String actualNview=newVDropdwn.getText();
        if(expectedNview.equals(actualNview)) {
        	   	System.out.println("New view is displayed");
        }
        else {
        	System.out.println("New view is not displayed");
        }
        
        
        
	}

	
	
	
	
	
	
	
	
 }
