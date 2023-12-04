package com.training.salesforce;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase5 {
	static WebDriver driver;
public static void main(String[] args)  {
	launchapplication();
	windowmaximize();
	login();
	homevalidation();
	usermenu();
	usermenudropdownValidation();
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
    static void homevalidation() {
    WebElement validnHome=driver.findElement(By.xpath("//a[@title='Home Tab']"));
    String expectedText="Home";
    String actualText=validnHome.getText();
    if(expectedText.equals(actualText)) {
    	System.out.println("Testcase passed");
    }
    else {
    	System.out.println("Testcase failed");
    }
    try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    }
    static void usermenu() {
    WebElement usermenuDrpdown=driver.findElement(By.id("userNavLabel"));
    String expectedTxt="Silpa Rajan";
    String actualTxt=usermenuDrpdown.getText();
    if(expectedTxt.equals(actualTxt)){
    	System.out.println("username dropdown is present");
    }
    else {
    	System.out.println("username dropdown is not present");
    }
     usermenuDrpdown.click(); 
    }
    static void usermenudropdownValidation() {
    WebElement myprofile=driver.findElement(By.xpath("//a[@title='My Profile']"));
    String expectedProfile="My Profile";
    String actualProfile=myprofile.getText();
     if(expectedProfile.equals(actualProfile)) {
     	System.out.println("MyProfile is present in the dropdown");
     }
     else {
     	System.out.println("MyProfile is not present in the dropdown");
     }
     
     WebElement mySettings=driver.findElement(By.xpath("//a[@title='My Settings']"));
     String expectedSettings="My Settings";
     String actualSettings=mySettings.getText();
      if(expectedSettings.equals(actualSettings)) {
      	System.out.println("MySettings is present in the dropdown");
      }
      else {
      	System.out.println("MySettings is not present in the dropdown");
      }
      
      WebElement developerConsole=driver.findElement(By.xpath("//a[@title='Developer Console (New Window)']"));
      String expectedDconsole="Developer Console";
      String actualDconsole=developerConsole.getText();
       if(expectedDconsole.equals(actualDconsole)) {
       	System.out.println("Developer Console is present in the dropdown");
       }
       else {
       	System.out.println("Developer Console is not present in the dropdown");
       }
    
       WebElement switchtoLExp=driver.findElement(By.xpath("//a[@class='switch-to-lightning']"));
       String expectedLexp="Switch to Lightning Experience";
       String actualLexp=switchtoLExp.getText();
        if(expectedLexp.equals(actualLexp)) {
        	System.out.println("Lexperience is present in the dropdown");
        }
        else {
        	System.out.println("Lexperience is not present in the dropdown");
        }
    
        WebElement logout=driver.findElement(By.xpath("//a[@title='Logout']"));
        String expectedLogout="Logout";
        String actualLogout=logout.getText();
         if(expectedLogout.equals(actualLogout)) {
         	System.out.println("Logout is present in the dropdown");
         }
         else {
         	System.out.println("Logout is not present in the dropdown");
         }
         driver.close();
    }
}

