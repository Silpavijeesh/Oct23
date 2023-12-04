package com.training.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase6 {
	static WebDriver driver;
	public static void main(String[] args){
		launchapplication();
		windowmaximize();
		login();
		usermenuDropdown();
		myProfile();
		edit();
		editProfile();
		post();
		fileupload();
		uploadphoto();
		
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
	    static void myProfile() {
        WebElement myprofile=driver.findElement(By.xpath("//a[@title='My Profile']"));
	    myprofile.click(); 
	    }
	    static void edit() {
	    WebElement editButton=driver.findElement(By.xpath("(//img[@alt='Edit Profile'])[1]"));
	    editButton.click();
	  }
	   static void editProfile() {
		   //String mainWindow=driver.getWindowHandle();
	  // WebElement iFrame=driver.findElement(By.xpath("//iframe[@id='contactInfoContentId']"));
        driver.switchTo().frame("contactInfoContentId");
	   WebElement about=driver.findElement(By.xpath("//a[contains(text(),'About')]"));
		about.click();	   
	   WebElement lastname=driver.findElement(By.id("lastName"));
	   lastname.clear();
	   lastname.sendKeys("Rajan1");
	   WebElement saveAll=driver.findElement(By.xpath("//input[@value='Save All']"));
	   saveAll.click();
	   driver.switchTo().defaultContent();
	  // driver.switchTo().window(mainWindow);
	   try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   WebElement changeduname=driver.findElement(By.xpath("//span[@id='tailBreadcrumbNode']"));
	   String actualText=changeduname.getText();
	   String expectedText="Silpa Rajan1 ";
	   System.out.println("actual text is: "+actualText);
	   Assert.assertEquals(actualText, expectedText);
	}
	   static void post() {
	   WebElement post=driver.findElement(By.xpath("//span[text()='Post']"));
        post.click();
        try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   WebElement frameEle=driver.findElement(By.xpath("//iframe[@class='cke_wysiwyg_frame cke_reset']"));
	   driver.switchTo().frame(frameEle);
	   WebElement posttext=driver.findElement(By.xpath("//body[contains(text(),'Share an update, @mention someone...')]"));
	   posttext.sendKeys("Welcome");
	   driver.switchTo().defaultContent();
	   WebElement share=driver.findElement(By.id("publishersharebutton"));
	   share.click();
	   }
	   static void fileupload() {
	  WebElement file=driver.findElement(By.xpath("(//span[@class='publisherattachtext '])[2]"));
	  try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	  file.click(); 
	  WebElement uploadFromcomp=driver.findElement(By.xpath("//td[@id='chatterUploadFileActionPanel']"));
		uploadFromcomp.click();  
	 WebElement chooseFile=driver.findElement(By.xpath("//input[@id='chatterFile']"));
	 chooseFile.sendKeys("D:\\gmailTestcases.xlsx");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   
		WebElement sharebtn=driver.findElement(By.xpath("//input[@id='publishersharebutton']"));
	    sharebtn.click();
	    System.out.println("Test case passed,file uploaded");
	   }
	   static void uploadphoto() {
		   try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
		   Actions action=new Actions(driver); 
		WebElement mhover=driver.findElement(By.xpath("//div[@class='photoUploadSection']"));
		
		 action.moveToElement(mhover).click().build().perform(); 
		 
		  driver.switchTo().frame("uploadPhotoContentId"); 
		WebElement chooseFile=driver.findElement(By.xpath("//input[@id='j_id0:uploadFileForm:uploadInputFile']"));   
	   chooseFile.sendKeys("D:\\1.JPG");
	   try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	WebElement save=driver.findElement(By.xpath("//input[@id='j_id0:uploadFileForm:uploadBtn']"));   
	save.click(); 
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//save the image after croping
	WebElement saveaftercrop=driver.findElement(By.xpath("//input[@id='j_id0:j_id7:save']"));
	saveaftercrop.click();
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 driver.switchTo().defaultContent();
	System.out.println("Test case passed,photo uploaded");
	driver.close();
	   }
}
