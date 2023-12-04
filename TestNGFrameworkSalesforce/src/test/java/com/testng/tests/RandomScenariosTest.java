package com.testng.tests;

import java.util.Set;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.testng.base.BaseTest;
import com.testng.log.Log;
import com.testng.pages.AccountsPage;
import com.testng.pages.ContactsPage;
import com.testng.pages.LeadsPage;
import com.testng.pages.LoginPage;
import com.testng.pages.OpportunityPage;
import com.testng.pages.RandomScenariosPage;
import com.testng.pages.UsermenuPage;

public class RandomScenariosTest extends BaseTest {
	WebDriver driver;
	LoginPage loginpage;
	UsermenuPage usermenupage;
	AccountsPage accountspage;
	LeadsPage leadspage;
	OpportunityPage opportunitypage;
	ContactsPage contactspage;
	RandomScenariosPage randomscenariospage;

	@BeforeMethod
	public void beforemethod() {
		driver = getDriver();
		launchapp(driver);
		loginpage = new LoginPage(driver);
		usermenupage = new UsermenuPage(driver);
		accountspage = new AccountsPage(driver);
		leadspage = new LeadsPage(driver);
		contactspage = new ContactsPage(driver);
		opportunitypage = new OpportunityPage(driver);
		randomscenariospage = new RandomScenariosPage(driver);
		DOMConfigurator.configure("log4j.xml");
	}

	@Test
	public void verifyfirstnameandlastnameoftheloggedinuser() {
		Log.startTestCase("Verify firstname and lastname");
		loginpage.enterintoUsername("silu@test.com");
		Log.info("Successfully entered username");
		loginpage.enterintoPassword("Ammukutty12");
		loginpage.clicklogin();
		String expectedText = "Home";
		loginpage.homevalidation(expectedText);
		Log.info("Successfully validate the home page");
		randomscenariospage.clickonhometab();
		String expectedname = "Silpa Abcd";
		randomscenariospage.namevalidation(expectedname);
		randomscenariospage.clickonfnmelnamelink();
		String expectedflname = "User: Silpa Abcd ~ Salesforce - Developer Edition";
		randomscenariospage.firstnamelastnametpagevalidn(expectedflname);
		String expectedusermenu = "Silpa Abcd";
		usermenupage.checkforusermenu(expectedusermenu);
		usermenupage.clickonusermenudropdown();
		usermenupage.dropdownlistitems();
		usermenupage.clickonmyprofile();
		String expectedproname = "User: Silpa Abcd ~ Salesforce - Developer Edition";
		randomscenariospage.myprofilenamevalidation(expectedproname);
		Log.info("Suceessfully validate myprofilepage title");
		Log.endTestCase(expectedproname);
	}

	@Test
	public void verifyeditedlastnameisupdated() {
		Log.startTestCase("Verify firstname and lastname");
		loginpage.enterintoUsername("silu@test.com");
		Log.info("Successfully entered username");
		loginpage.enterintoPassword("Ammukutty12");
		loginpage.clicklogin();
		String expectedText = "Home";
		loginpage.homevalidation(expectedText);
		Log.info("Successfully validate the home page");
		randomscenariospage.clickonhometab();
		String expectedname = "Silpa Abcd";
		randomscenariospage.namevalidation(expectedname);
		randomscenariospage.clickonfnmelnamelink();
		String expectedflname = "User: Silpa Abcd ~ Salesforce - Developer Edition";
		randomscenariospage.firstnamelastnametpagevalidn(expectedflname);
		randomscenariospage.clickoneditlink();
		driver.switchTo().frame("contactInfoContentId");
		randomscenariospage.clickonabout();
		randomscenariospage.enterintolastname("Abcd");
		randomscenariospage.clickonsaveall();
		driver.switchTo().defaultContent();
		Log.info("Edit profile popup is closed after clicing saveall button");
		String expectedupdtdname = "User: Silpa Abcd ~ Salesforce - Developer Edition";
		randomscenariospage.updatdnamepagevalidn(expectedupdtdname);
		String expectedusername = "Silpa Abcd";
		randomscenariospage.updatedusernamenamevalidation(expectedusername);
		String updtdflpage = "User: Silpa Abcd ~ Salesforce - Developer Edition";
		randomscenariospage.updatdflpagevalidn(updtdflpage);
		Log.info("Successfully validate the firstnamelastname page");
		Log.endTestCase("Verify firstname and lastname");
	}

	@Test
	public void verifythetabcustomization() {
		Log.startTestCase("Verify the Tab customization");
		loginpage.enterintoUsername("silu@test.com");
		Log.info("Successfully entered username");
		loginpage.enterintoPassword("Ammukutty12");
		loginpage.clicklogin();
		String expectedText = "Home";
		loginpage.homevalidation(expectedText);
		Log.info("Successfully validate the home page");
		randomscenariospage.clickonalltabs();
		String expectedAllTabTitle = "All Tabs ~ Salesforce - Developer Edition";
		randomscenariospage.alltabspagevalidation(expectedAllTabTitle);
		Log.info("All Tabs page is displayed");
		randomscenariospage.clickoncustomizemytabs();
		randomscenariospage.clickonsubscription();
		randomscenariospage.clickonremove();
		Log.info("subscription tab is removed from 'Selected Tabs' and moved to 'available Tabs' section");
		randomscenariospage.clickonsave();
		String expectedTitle = "All Tabs ~ Salesforce - Developer Edition";
		randomscenariospage.titlevalidationaftersave(expectedTitle);
		Log.info("Successfully validate the title");
		randomscenariospage.clickonusermenudropdown();
		randomscenariospage.clickonlogout();
		String expTitle = "Login | Salesforce";
		// randomscenariospage.Salesforcevaldn(expTitle);
		loginpage.enterintoUsername("silu@test.com");
		loginpage.enterintoPassword("Ammukutty12");
		loginpage.clicklogin();
		String expectedhomeTitle = "Home Page ~ Salesforce - Developer Edition";
		randomscenariospage.homepagevaldn(expectedhomeTitle);
		Log.info("Removed tab is not displayed in the Tab bar");
		Log.endTestCase("Verify the Tab customization");
	}

	@Test
	public void blockinganeventinthecalender() {

		Log.startTestCase("Blocking an event in the Calender");
		loginpage.enterintoUsername("silu@test.com");
		Log.info("Successfully entered username");
		loginpage.enterintoPassword("Ammukutty12");
		loginpage.clicklogin();
		String expectedText = "Home";
		loginpage.homevalidation(expectedText);
		Log.info("Successfully validate the home page");
		Log.info("Current date is displayed as a link below firstmame and lastname");
		randomscenariospage.clickonhometab();
		String expecteddate="Sunday December 3, 2023";
		randomscenariospage.datevalidn(expecteddate);
		randomscenariospage.clickoncurrentdatelink();
		String expectedcalender="Calendar for Silpa Abcd ~ Salesforce - Developer Edition";
		randomscenariospage.calendernamevalidn(expectedcalender);
		randomscenariospage.clickontime();
		String ExpcalenderTitle="Calendar: New Event ~ Salesforce - Developer Edition";
		randomscenariospage.calenderneweventpagevalidn(ExpcalenderTitle);
		Log.info("Calender newevent page is displayed with cursor at the subject");
		String parentHandle=driver.getWindowHandle();
		randomscenariospage.clickonsubjectcomboicon();
		Set<String>handles=driver.getWindowHandles();
		for(String handle:handles) {
			 System.out.println(handle);
			if(!handle.equals(parentHandle)) {
				driver.switchTo().window(handle);
				randomscenariospage.clickonother();
				}
			}
		driver.switchTo().window(parentHandle);
		Log.info("combo box pop closed and other is entered into subject");
		randomscenariospage.clickonendtimefield(); 
		Log.info("dropdown is displayed");
		randomscenariospage.selecttimefromdropdown(); 
		randomscenariospage.clickonSaveButton(); 
		String expectedCalTitle="Calendar for Silpa Abcd ~ Salesforce - Developer Edition" ;
		randomscenariospage.calenderpagevalidation(expectedCalTitle);
		Log.info("Calender for firestnamelastname page is displayed with other event in the timeslot 8:00 pm to 9:00 pm as a link"); 
		Log.endTestCase("Blocking an event in the Calender");
		 }
	
	@Test
	public void blockinganeventinthecalenderwithweeklyrecurrenace() {
		Log.startTestCase("Blocking an event in the calender with weekly recurrence");
		loginpage.enterintoUsername("silu@test.com");
		Log.info("Successfully entered username");
		loginpage.enterintoPassword("Ammukutty12");
		loginpage.clicklogin();
		String expectedText = "Home";
		loginpage.homevalidation(expectedText);
		Log.info("Successfully validate the home page");
		Log.info("Current date is displayed as a link below firstmame and lastname");
		randomscenariospage.clickonhometab();
		//String expecteddate="Sunday December 3, 2023";
		//randomscenariospage.datevalidn(expecteddate);
		randomscenariospage.clickoncurrentdatelink();
		String expectedcalender="Calendar for Silpa Abcd ~ Salesforce - Developer Edition";
		randomscenariospage.calendernamevalidn(expectedcalender);	
		randomscenariospage.clickontimelink();
		String ExpcalenderTitle="Calendar: New Event ~ Salesforce - Developer Edition";
		randomscenariospage.calenderneweventpagevalidn(ExpcalenderTitle);
		Log.info("Calender newevent page is displayed with cursor at the subject");
		String parentHandle=driver.getWindowHandle();
		Log.info(parentHandle);
		randomscenariospage.clickoncombopopup();
		 Set<String>handles=driver.getWindowHandles();
		 for(String handle:handles) {
			 System.out.println(handle);
			if(!handle.equals(parentHandle)) {
				driver.switchTo().window(handle);
				randomscenariospage.clickonother();
	         }
		  }
		 driver.switchTo().window(parentHandle);
		Log.info("combo box pop closed and other is entered into subject");
		randomscenariospage.clickonendtimefield(); 
		Log.info("dropdown is displayed");
		randomscenariospage.clickonendtime();
		randomscenariospage.clickonrecurrence();
		Log.info("check box is checked, frequency,start date,end date sectionsare displayed");
		randomscenariospage.clickonweeklybutton();
		Log.info("weekly radiobutton is selected and 1 entered in Recurs every field and Current day of the week is selected");
		randomscenariospage.clickonrecurrenceenddate();
		randomscenariospage.selectfrommonthdropdown("December");
		randomscenariospage.clickonrecurrenceend();
		Log.info("The end date is selected and the calender is closed");
		randomscenariospage.clickonSave3();
		String expectedcTitle="Calendar for Silpa Abcd ~ Salesforce - Developer Edition";
		randomscenariospage.caltitlevalidation(expectedcTitle);
		randomscenariospage.clickonmonthview();
		String monthviewTitle="Calendar for Silpa Abcd - Month View ~ Salesforce - Developer Edition";
		randomscenariospage.monthviewvalidn(monthviewTitle);
		Log.info("Calender for firstname lastname month view page is displayed");
		Log.info("Current date and a week from current date should have the other event blocked");
		Log.endTestCase("Blocking an event in the calender with weekly recurrence");
		}
	@AfterMethod
	public void teardown() {
		takescreenshot(driver, "Salesforce");
		close();
	}
}
