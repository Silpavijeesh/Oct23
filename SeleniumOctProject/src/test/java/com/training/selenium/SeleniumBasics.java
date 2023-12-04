package com.training.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumBasics {

	public static void main(String[] args) {
		//launching the browser
   WebDriverManager.firefoxdriver().setup();
   //create an object of WebDriver
    WebDriver driver=new FirefoxDriver();
    //Enter url
     driver.get("https://login.facebook.com");
   //Enter the value into the username textbox
   WebElement email=driver.findElement(By.id("email"));
   email.sendKeys("abcd@gamil.com");
   WebElement password=driver.findElement(By.id("pass"));
   password.sendKeys("abcd");
  WebElement login= driver.findElement(By.xpath("//button[@type='submit']"));
  login.click();
   
   
   
	}

}
