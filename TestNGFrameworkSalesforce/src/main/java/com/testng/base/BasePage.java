package com.testng.base;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BasePage {
	 WebDriver driver;
	
public BasePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
public void compareText(String actualText, String expectedText) {
			Assert.assertEquals(actualText, expectedText);	
			}
public void compareTitle(String expectedTitle) {
	Assert.assertEquals(driver.getTitle(), expectedTitle);	
	}

public void switchtooriginalpage(WebDriver driver) {
	 driver.switchTo().defaultContent();
}
public void windowhandle(WebDriver driver) {
	String parentHandle=driver.getWindowHandle();
    Set<String>handles=driver.getWindowHandles();
    for(String handle:handles) {
    	System.out.println(handle);
    	if(!handle.equals(parentHandle)) {
    		driver.switchTo().window(handle);
    	
    	driver.close();
    	}	
    }
   driver.switchTo().window(parentHandle);
   System.out.println(driver.getTitle());
}


public void waitforElement(WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	}
