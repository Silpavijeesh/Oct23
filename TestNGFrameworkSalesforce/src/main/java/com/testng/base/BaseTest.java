package com.testng.base;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
  WebDriver driver;
 
  public WebDriver getDriver() {
	
	  if(driver==null) {
		  WebDriverManager.chromedriver().setup();
		  driver=new ChromeDriver();
	  }
	  return driver;
  } 
  public void launchapp(WebDriver driver) {
  driver.get("https://login.salesforce.com");
 }
 
  public void takescreenshot(WebDriver driver,String methodName) {
  
  //TakeScreenShot interface and create object of the screen
	  TakesScreenshot screenshot=((TakesScreenshot)driver);
	  
	  //store this in sourcefile 
  File srcFile=screenshot.getScreenshotAs(OutputType.FILE);
  Date current=new Date();
  String timestamp=new SimpleDateFormat("YYYY-MM-dd HH-mm-ss").format(current);
  String reportFileName="Salesforce"+timestamp+"jpeg";
  String fileSeparator=System.getProperty("file.separator");
  String reportFilepath=System.getProperty("user.dir")+fileSeparator+"newscreenshots";
  String reportFilelocation=reportFilepath+fileSeparator+reportFileName;	
 // String filepath="C:\\Users\\silpa\\eclipse-workspace\\TestNGFrameworkSalesforce\\screenshots\\"+methodName+timestamp+".jpeg";
  File destFile= new File(reportFilelocation);	
  
  try {
	FileUtils.copyFile(srcFile, destFile);
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	
}

  public void close() {
	  driver.close();
	  driver=null;
	 }	
	
}

	
	
	
	
	
	
	
	 
	
	
	
	
	
	

