package com.testng.tests;

import java.util.List;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.testng.base.BaseTest;
import com.testng.log.Log;
import com.testng.pages.AccountsPage;
import com.testng.pages.LeadsPage;
import com.testng.pages.LoginPage;
import com.testng.pages.UsermenuPage;

public class LeadsTest extends BaseTest {
	    WebDriver driver;
		LoginPage loginpage;
		UsermenuPage usermenupage;
		AccountsPage accountspage;
		LeadsPage leadspage;
		@BeforeMethod
		public void beforemethod() { 
			driver=getDriver();
			launchapp(driver);
			loginpage= new LoginPage(driver);
			usermenupage=new UsermenuPage(driver);
			accountspage=new AccountsPage(driver);
			leadspage=new LeadsPage(driver);
			DOMConfigurator.configure("log4j.xml");
		}
	@Test
	public void leadstab() {
		Log.startTestCase("Leads Tab");
		loginpage.enterintoUsername("silu@test.com");
		Log.info("Successfully entered username");
		loginpage.enterintoPassword("Ammukutty12");
		loginpage.clicklogin();
		Log.info("Scueessfully click on login button");
		leadspage.clickonleads();
		String expectedHTitle="Leads: Home ~ Salesforce - Developer Edition";
		leadspage.leadshomevalidn(expectedHTitle);
		Log.info("Successfully validate 'LeadsHome' title");
		Log.endTestCase("Leads Tab");
	}
	@Test
	public void leadsselectview() {
		Log.startTestCase("Leads select view");
		loginpage.enterintoUsername("silu@test.com");
		Log.info("Successfully entered username");
		loginpage.enterintoPassword("Ammukutty12");
		loginpage.clicklogin();
		Log.info("Scueessfully click on login button");
		leadspage.clickonleads();
		String expectedHTitle="Leads: Home ~ Salesforce - Developer Edition";
		leadspage.leadshomevalidn(expectedHTitle);
		Log.info("Successfully validate 'LeadsHome' title");
		leadspage.clickonview();
		leadspage.selectfromviewdropdown();
		Log.info("dropdown with All open leads,My unread leads,Recently viewed leds andTodays leads is displayed"); 
		Log.endTestCase("Leads select view");
		}
	@Test
public void defaultview() {
	Log.startTestCase("default view ");
	loginpage.enterintoUsername("silu@test.com");
	Log.info("Successfully entered username");
	loginpage.enterintoPassword("Ammukutty12");
	loginpage.clicklogin();
	Log.info("Scueessfully click on login button");
	leadspage.clickonleads();
	String expectedHTitle="Leads: Home ~ Salesforce - Developer Edition";
	leadspage.leadshomevalidn(expectedHTitle);
	Log.info("Successfully validate 'LeadsHome' title");
	leadspage.clickonview();
	leadspage.selecttodayfromviewdropdown("Today's Leads");
	usermenupage.clickonusermenudropdown();
	usermenupage.dropdownlistitems();
	usermenupage.clickonlogout();
    Log.info("click logout from usermenu dropdown");
	loginpage.enterintoUsername("silu@test.com");
	loginpage.enterintoPassword("Ammukutty12");
	loginpage.clicklogin();
	leadspage.clickonLeadsTab1();
	leadspage.clickonGo();
	Log.info("view page is displayed with 'Todays leads' view");
	Log.endTestCase("Default view");
}
	@Test
	public void selecttodaysleadsfromviewdropdown() {
		Log.startTestCase("Select Today's Leads from view dropdown");
		loginpage.enterintoUsername("silu@test.com");
		Log.info("Successfully entered username");
		loginpage.enterintoPassword("Ammukutty12");
		loginpage.clicklogin();
		Log.info("Scueessfully click on login button");
		leadspage.clickonleads();
		String expectedHTitle="Leads: Home ~ Salesforce - Developer Edition";
		leadspage.leadshomevalidn(expectedHTitle);
		Log.info("Successfully validate 'LeadsHome' title");
		leadspage.clickonview();
		leadspage.selecttodayfromviewdropdown("Today's Leads");	
		Log.info("Successfully selected Todays leads from view dropdown");
		Log.endTestCase("Select Today's Leads from view dropdown");
		}
	
	@Test
	public void checknewbuttononleadshome() {
		Log.startTestCase("Check new button on Leads home");
		loginpage.enterintoUsername("silu@test.com");
		Log.info("Successfully entered username");
		loginpage.enterintoPassword("Ammukutty12");
		loginpage.clicklogin();
		Log.info("Scueessfully click on login button");
		leadspage.clickonleads();
		String expectedHTitle="Leads: Home ~ Salesforce - Developer Edition";
		leadspage.leadshomevalidn(expectedHTitle);
		leadspage.clickonnew();
		String expectednewlTitle="Lead Edit: New Lead ~ Salesforce - Developer Edition";
		leadspage.newleadvalidn(expectednewlTitle);
		leadspage.enterintolastname("ABCD");
		leadspage.enterintocompanyname("ABCD");
		leadspage.clickonsavebutton();
		String expectednewTitle="Lead: ABCD ~ Salesforce - Developer Edition";
		leadspage.newleadValidn(expectednewTitle);
		Log.info("Sucessfully validate the new title");
		Log.endTestCase("Check new button on Leads home");
	}
	
	
	
	
	
	
	
	
		@AfterMethod
		public void teardown() {
			takescreenshot(driver,"Salesforce");
			close();
		}
	
}
