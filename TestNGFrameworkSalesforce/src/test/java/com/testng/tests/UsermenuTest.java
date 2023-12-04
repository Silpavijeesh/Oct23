package com.testng.tests;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.testng.base.BaseTest;
import com.testng.log.Log;
import com.testng.pages.LoginPage;
import com.testng.pages.UsermenuPage;

public class UsermenuTest extends BaseTest {
	WebDriver driver;
	LoginPage loginpage;
	UsermenuPage usermenupage;
	
	@BeforeMethod
	public void beforemethod() { 
		driver=getDriver();
		launchapp(driver);
		loginpage= new LoginPage(driver);
		usermenupage=new UsermenuPage(driver);
		DOMConfigurator.configure("log4j.xml");
	}
	@Test
	public void selectUsermenufromusermenudropdown() {
    Log.startTestCase("Select username from usermenudropdown");
	loginpage.enterintoUsername("silu@test.com");
	Log.info("Successfully entered username");
	loginpage.enterintoPassword("Ammukutty12");
	Log.info("Successfully entered password");
	loginpage.clicklogin();
	Log.info("successfully login into salesforce");
	String expectedText="Home";
	loginpage.homevalidation(expectedText);
	String expectedusermenu="Silpa Rajan1";
	usermenupage.checkforusermenu(expectedusermenu);
	usermenupage.clickonusermenudropdown();
	usermenupage.dropdownlistitems();
	String expectedProfile="My Profile";
	usermenupage.usermenudpdownvalidn(expectedProfile);
	String expectedsettings="My Settings";
	usermenupage.mysettingsvalidn(expectedsettings);
	String expectedDconsole="Developer Console";
	usermenupage.developerconsolevalidn(expectedDconsole);
	String expectedLexp="Switch to Lightning Experience";
	usermenupage.switchToLexpvalidn(expectedLexp);
	String expectedLogout="Logout";
	usermenupage.logoutvalidn(expectedLogout);
	Log.endTestCase("Select usermenu from usermenu dropdown");
	}
	@Test
	public void selectmyprofilefromusermenu() {
	Log.startTestCase("Select myprofile from usermenudropdown");
	loginpage.enterintoUsername("silu@test.com");
	Log.info("Successfully entered username");
	loginpage.enterintoPassword("Ammukutty12");
	Log.info("Successfully entered password");
	loginpage.clicklogin();
	Log.info("successfully login into salesforce");
	String expectedText="Home";
	loginpage.homevalidation(expectedText);
	String expectedusermenu="Silpa Rajan1";
	usermenupage.checkforusermenu(expectedusermenu);
	usermenupage.clickonusermenudropdown();
	usermenupage.dropdownlistitems();
	usermenupage.clickonmyprofile();
	usermenupage.clickonedit();
	usermenupage.switchframe(driver);
	usermenupage.clickonabout();
	usermenupage.clearlastname();
	usermenupage.enterintolastname("Rajan1");
	usermenupage.clickonsaveall();
	usermenupage.switchtooriginalpage(driver);
	//String expectedlname="Silpa Rajan1";
	//usermenupage.chanedlnamevalidn(expectedlname);
	usermenupage.clickonpost();
	usermenupage.switchtoframe(driver);
	usermenupage.enterintoposttext("Welcome");
	usermenupage.switchtooriginalpage(driver);
	usermenupage.clicksharebutton();
	usermenupage.clickonfilelink();
	usermenupage.clickonuploadfromcomputer();
	usermenupage.enterintochooseFile("D:\\\\gmailTestcases.xlsx");
	usermenupage.clickonsharebtn();
	driver.switchTo().defaultContent();
	Log.info("successfullyuploaded the file");
	usermenupage.mousehover(driver);
	usermenupage.clickonaddphoto(driver);
	driver.switchTo().frame("uploadPhotoContentId");
	usermenupage.enterintoChooseFile("D:\\1.JPG");
	usermenupage.clickSaveButton();
	usermenupage.clicksaveaftercroping();
	usermenupage.switchtooriginalpage(driver);
	Log.info("Successfully uploaded photo");
	Log.endTestCase("Select MyProfile from UserMenu dropdown");
}
	@Test
	public void selectmysettingsfromusermenu() {
		Log.startTestCase("Select mysettings from usermenudropdown");
		loginpage.enterintoUsername("silu@test.com");
		Log.info("Successfully entered username");
		loginpage.enterintoPassword("Ammukutty12");
		Log.info("Successfully entered password");
		loginpage.clicklogin();
		Log.info("successfully login into salesforce");	
		usermenupage.clickonusermenudropdown();
		usermenupage.dropdownlistitems();
	    usermenupage.clickonmysettings();
	    String expected="My Settings";
	    usermenupage.mysettingsValidation(expected);
	    usermenupage.clickonpersonal();
	    usermenupage.clickonloginhistory();
	    String expectedHistory="Login History";
	    usermenupage.loginhistoryvalidn(expectedHistory);
	    usermenupage.clickondisplayandlayout();
	    usermenupage.clickoncustomizetabs();
	    usermenupage.selectSalesforcechatterfromCustomdrpdwn("Salesforce Chatter");
	    usermenupage.clickonreports();
	    usermenupage.clickonadd();
	    usermenupage.clickonsave();
	    usermenupage.clickonEmail();
	    usermenupage.clickonmyEmailSettings();
	    usermenupage.clearemailname();
	    usermenupage.enteremailname("Silpa Vijeesh");
	    usermenupage.clearemailaddress();
	    usermenupage.enteremailaddress("silpapinagote@gmail.com");
	    usermenupage.clickonradiobtn();
	    usermenupage.clickonSavebtn();
	    String expectedmsg="Your settings have been successfully saved.";
	    usermenupage.valdationmessage(expectedmsg);
	    usermenupage.clickoncalReminder() ;
	    usermenupage.clickonactivityreminder();
	    usermenupage.clickonopentestreminder(driver);
	    Log.endTestCase("Select mysettings from usermenudropdown");
	    
	
	
	}
	@Test
	public void selectdevconsolefromusernamedropdwn() {
		Log.startTestCase("Select developer console from usermenudropdown");
		loginpage.enterintoUsername("silu@test.com");
		Log.info("Successfully entered username");
		loginpage.enterintoPassword("Ammukutty12");
		Log.info("Successfully entered password");
		loginpage.clicklogin();
		Log.info("successfully login into salesforce");	
		usermenupage.clickonusermenudropdown();
		usermenupage.dropdownlistitems();
		usermenupage.clickondevcosole(driver);
		Log.endTestCase("Select developer console from usermenudropdown");
	}

	    @Test
        public void selectlogoutfromusermenudropdown() { 
		Log.startTestCase("Select logout from usermenudropdown");
		loginpage.enterintoUsername("silu@test.com");
		Log.info("Successfully entered username");
		loginpage.enterintoPassword("Ammukutty12");
		Log.info("Successfully entered password");
		loginpage.clicklogin();
		Log.info("successfully login into salesforce");	
		usermenupage.clickonusermenudropdown();
		//usermenupage.dropdownlistitems();
		loginpage.clickLogout();
	    Log.info("click logout from usermenu dropdown");
	    String expectedloginTitle="Login | Salesforce";
	    Log.info(expectedloginTitle);
		//usermenupage.logoutvalidation(expectedloginTitle);
		Log.endTestCase("Select logout from usermenudropdown");
		}
	@AfterMethod
	public void teardown() {
		takescreenshot(driver,"Salesforce");
		close();
	}
  }
	
	


