package com.testng.tests;

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
import com.testng.pages.UsermenuPage;

public class ContactsTest extends BaseTest {
	WebDriver driver;
	LoginPage loginpage;
	UsermenuPage usermenupage;
	AccountsPage accountspage;
	LeadsPage leadspage;
	ContactsPage contactspage;
	@BeforeMethod
	public void beforemethod() { 
		driver=getDriver();
		launchapp(driver);
		loginpage= new LoginPage(driver);
		usermenupage=new UsermenuPage(driver);
		accountspage=new AccountsPage(driver);
		leadspage=new LeadsPage(driver);
		contactspage=new ContactsPage(driver);
		DOMConfigurator.configure("log4j.xml");
	}
	@Test
	public void createnewcontact() {
		Log.startTestCase("Create new contact");
		loginpage.enterintoUsername("silu@test.com");
		Log.info("Successfully entered username");
		loginpage.enterintoPassword("Ammukutty12");
		loginpage.clicklogin();
		String expectedText="Home";
		loginpage.homevalidation(expectedText);	
		contactspage.clickoncontactstab();
		String expectedchmeTitle="Contacts: Home ~ Salesforce - Developer Edition";
		contactspage.contactshomevalidn(expectedchmeTitle);
		Log.info("Successfully validate contacts home title");
		contactspage.clickonnewbutton();
		contactspage.enterintolastname("Rajan1");
		contactspage.enterintoaccountname("Silpa");
		contactspage.clicksavebtn();
		String expectedname="Contact: Rajan1 ~ Salesforce - Developer Edition";
		contactspage.newcontactvalidn(expectedname);
		Log.info("Successfully validate the new title");
		Log.endTestCase("Create new contact");
		}
	
	@Test
	public void createnewviewinthecontactpage() {
		Log.startTestCase("Create new view in the contact page");
		loginpage.enterintoUsername("silu@test.com");
		Log.info("Successfully entered username");
		loginpage.enterintoPassword("Ammukutty12");
		loginpage.clicklogin();
		String expectedText="Home";
		loginpage.homevalidation(expectedText);	
		contactspage.clickoncontactstab();
		String expectedchmeTitle="Contacts: Home ~ Salesforce - Developer Edition";
		contactspage.contactshomevalidn(expectedchmeTitle);
		Log.info("Successfully validate contacts home title");	
		contactspage.clickoncreatenewview();
		contactspage.enterintoviewname("Silpa_Raj");
		contactspage.enterintoviewuniquename("diamond_123");
		contactspage.clickonsavebutton1();
		String expectedctitle="Contacts ~ Salesforce - Developer Edition";
		contactspage.contacthomepagevalidn(expectedctitle);
		Log.info("Successfully validate the contacts home title");
		Log.endTestCase("Create new view in the contact page");
		
	}
	@Test
	public void checkrecentlycreatedcontact() {
		Log.startTestCase("Check recently created contact");
		loginpage.enterintoUsername("silu@test.com");
		Log.info("Successfully entered username");
		loginpage.enterintoPassword("Ammukutty12");
		loginpage.clicklogin();
		String expectedText="Home";
		loginpage.homevalidation(expectedText);	
		contactspage.clickoncontactstab();
		String expectedchmeTitle="Contacts: Home ~ Salesforce - Developer Edition";
		contactspage.contactshomevalidn(expectedchmeTitle);
		Log.info("Successfully validate contacts home title");	
		contactspage.clickonrecentlycreated();
		contactspage.selectfromrecentlycreateddropdown("Recently Created");
		Log.info("Recently created contact is displayed ");
		Log.endTestCase("Check recently created contact");
	}
	
	@Test
	public void checkMyContactsinthecontactpage() {
		Log.startTestCase("Check My contacs in the contact page");
		loginpage.enterintoUsername("silu@test.com");
		Log.info("Successfully entered username");
		loginpage.enterintoPassword("Ammukutty12");
		loginpage.clicklogin();
		String expectedText="Home";
		loginpage.homevalidation(expectedText);	
		contactspage.clickoncontactstab();
		String expectedchmeTitle="Contacts: Home ~ Salesforce - Developer Edition";
		contactspage.contactshomevalidn(expectedchmeTitle);
		Log.info("Successfully validate contacts home title");	
		contactspage.clickonview();
		contactspage.selectfromviewdropdown("My Contacts");
		Log.info("My contacts is selected from view dropdown");
		Log.endTestCase("Check my contacts in the contact page");
		}
		
   @Test
   public void viewacontactinthecontactpage() {
	   Log.startTestCase("View a contact in the contact page");
		loginpage.enterintoUsername("silu@test.com");
		Log.info("Successfully entered username");
		loginpage.enterintoPassword("Ammukutty12");
		loginpage.clicklogin();
		String expectedText="Home";
		loginpage.homevalidation(expectedText);	
		contactspage.clickoncontactstab();
		String expectedchmeTitle="Contacts: Home ~ Salesforce - Developer Edition";
		contactspage.contactshomevalidn(expectedchmeTitle);
		Log.info("Successfully validate contacts home title"); 
	    contactspage.clickanyname();
	    String expectednameTitle="Contact: dev ~ Salesforce - Developer Edition";
	    contactspage.titlevalidn(expectednameTitle);
	   Log.info("Successfully validate the selected name title");
	   Log.endTestCase("View a contact in the contact page");
	   }
   @Test
   public void errormessage() {
	    Log.startTestCase("Error message");
		loginpage.enterintoUsername("silu@test.com");
		Log.info("Successfully entered username");
		loginpage.enterintoPassword("Ammukutty12");
		loginpage.clicklogin();
		String expectedText="Home";
		loginpage.homevalidation(expectedText);	
		contactspage.clickoncontactstab();
		String expectedchmeTitle="Contacts: Home ~ Salesforce - Developer Edition";
		contactspage.contactshomevalidn(expectedchmeTitle);
		Log.info("Successfully validate contacts home title");   
		contactspage.clickoncreatenewview();
	    contactspage.enterintoviewuniquenamefield("EFGH");
	    contactspage.clickSaveBtn();
	    String expectederror="Error: You must enter a value";
	    contactspage.errorvalidation(expectederror);
	    Log.info("Successfully validate Errormessage");
	    Log.endTestCase("Error message");
   }
   @Test
   public void checkcancelbutton() {
	   Log.startTestCase("Check cancel button");
		loginpage.enterintoUsername("silu@test.com");
		Log.info("Successfully entered username");
		loginpage.enterintoPassword("Ammukutty12");
		loginpage.clicklogin();
		String expectedText="Home";
		loginpage.homevalidation(expectedText);	
		contactspage.clickoncontactstab();
		String expectedchmeTitle="Contacts: Home ~ Salesforce - Developer Edition";
		contactspage.contactshomevalidn(expectedchmeTitle);
		Log.info("Successfully validate contacts home title");   
		contactspage.clickoncreatenewview();
	    contactspage.enterintoViewName("ABCD");
	    contactspage.enterintoViewUniqueName("EFGH");
	    contactspage.clickoncancelbutton();
	    Log.info("Contacts Home page is displayed and View ABCD is not created");
	    Log.endTestCase("Check cancel button");
        }
		
	@Test
	public void checksaveandnewbutton() {
		Log.startTestCase("Check save and new button");
		loginpage.enterintoUsername("silu@test.com");
		Log.info("Successfully entered username");
		loginpage.enterintoPassword("Ammukutty12");
		loginpage.clicklogin();
		String expectedText="Home";
		loginpage.homevalidation(expectedText);	
		contactspage.clickoncontactstab();
		String expectedchmeTitle="Contacts: Home ~ Salesforce - Developer Edition";
		contactspage.contactshomevalidn(expectedchmeTitle);
		Log.info("Successfully validate contacts home title");
		contactspage.clickonnewbutton();
		contactspage.enterintoLastname("Indian");
		contactspage.enterintoAccountName("Global Media");
		contactspage.clickonSaveandNew();
		Log.info("Test case failed: new contact is not created");
		Log.endTestCase("Ckeck save and new button");
		}
	
	@AfterMethod
	public void teardown() {
		takescreenshot(driver,"Salesforce");
		close();
		
	}	
	

}
