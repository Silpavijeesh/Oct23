package com.testng.tests;

import java.util.Set;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.testng.base.BaseTest;
import com.testng.log.Log;
import com.testng.pages.AccountsPage;
import com.testng.pages.LoginPage;
import com.testng.pages.OpportunityPage;
import com.testng.pages.UsermenuPage;

public class OpportunityTest extends BaseTest {

	WebDriver driver;
	LoginPage loginpage;
	UsermenuPage usermenupage;
	AccountsPage accountspage;
	OpportunityPage opportunitypage;
	@BeforeMethod
	public void beforemethod() { 
		driver=getDriver();
		launchapp(driver);
		loginpage= new LoginPage(driver);
		usermenupage=new UsermenuPage(driver);
		accountspage=new AccountsPage(driver);
		opportunitypage=new OpportunityPage(driver);
		DOMConfigurator.configure("log4j.xml");
	}
	@Test
	public void opportunitiesdropdown() {
	Log.startTestCase("opportunies dropdown");
	loginpage.enterintoUsername("silu@test.com");
	Log.info("Successfully entered username");
	loginpage.enterintoPassword("Ammukutty12");
	loginpage.clicklogin();
	Log.info("Scueessfully click on login button");
	opportunitypage.clickonopportunitytab();
	String expectedTitle="Opportunities: Home ~ Salesforce - Developer Edition";
	opportunitypage.optytitlevalidn(expectedTitle);
	Log.info("Successfully validate the title");
	opportunitypage.optydropdwn();
	Log.info("opportunity dropdown is displayed");
	Log.endTestCase("opportunity dropdown");
	}
	@Test
	public void createnewopportunity() {
		Log.startTestCase("opportunies dropdown");
		loginpage.enterintoUsername("silu@test.com");
		Log.info("Successfully entered username");
		loginpage.enterintoPassword("Ammukutty12");
		loginpage.clicklogin();
		Log.info("Scueessfully click on login button");
		opportunitypage.clickonopportunitytab();
		String expectedTitle="Opportunities: Home ~ Salesforce - Developer Edition";
		opportunitypage.optytitlevalidn(expectedTitle);
		Log.info("Successfully validate the title");
		opportunitypage.clickonnewbutton();
		opportunitypage.enterintoopportunitynamefield("Opty1");
		opportunitypage.enterintoaccountname("Silpa");
		opportunitypage.selectfromleadsource("Phone Inquiry");
		opportunitypage.clickonclosedate();
		opportunitypage.clickontoday();
		opportunitypage.selectfromstagedropdown("Needs Analysis");
		opportunitypage.enterintoprobability("50");
	    opportunitypage.clickonprimarycampaign(driver);
	    opportunitypage.clickonsavebutton();
	    String expectednTitle1="Opportunity: Opty1 ~ Salesforce - Developer Edition";
	    opportunitypage.newopportunityvalidation(expectednTitle1);
	    Log.info("Successfully validate the title");
		Log.endTestCase("create new opportunity");
	}
	@Test
	public void testopportunitypipelinereport() {
		Log.startTestCase("opportunity pipelinereport");
		loginpage.enterintoUsername("silu@test.com");
		Log.info("Successfully entered username");
		loginpage.enterintoPassword("Ammukutty12");
		loginpage.clicklogin();
		Log.info("Scueessfully click on login button");
		opportunitypage.clickonopportunitytab();
		String expectedTitle="Opportunities: Home ~ Salesforce - Developer Edition";
		opportunitypage.optytitlevalidn(expectedTitle);
		Log.info("Successfully validate the title");	
		opportunitypage.clickonopportunitypipeline();
		String expectedpTitle="Opportunity Pipeline ~ Salesforce - Developer Edition";
		opportunitypage.optypipelinetitlevalidn(expectedpTitle);
		Log.info("Successfully validate the title");
		Log.endTestCase("opportunity pipelinereport");
	}
	
	@Test
	public void teststuckopportunityreport() {
		Log.startTestCase("Test stuckopportunity report ");
		loginpage.enterintoUsername("silu@test.com");
		Log.info("Successfully entered username");
		loginpage.enterintoPassword("Ammukutty12");
		loginpage.clicklogin();
		Log.info("Scueessfully click on login button");
		opportunitypage.clickonopportunitytab();
		String expectedTitle="Opportunities: Home ~ Salesforce - Developer Edition";
		opportunitypage.optytitlevalidn(expectedTitle);
		Log.info("Successfully validate the title");
		opportunitypage.clickonstuckopty();
		String expectedstTitle="Stuck Opportunities ~ Salesforce - Developer Edition";
		opportunitypage.stuckoptyvalidn(expectedstTitle);
		Log.info("Successfully validate the title");
		Log.endTestCase(" Stuck opportunity report");
		}
	@Test
	public void quarterlysummerreport() {
		Log.startTestCase("Test Quarterly summer report ");
		loginpage.enterintoUsername("silu@test.com");
		Log.info("Successfully entered username");
		loginpage.enterintoPassword("Ammukutty12");
		loginpage.clicklogin();
		Log.info("Scueessfully click on login button");
		opportunitypage.clickonopportunitytab();
		String expectedTitle="Opportunities: Home ~ Salesforce - Developer Edition";
		opportunitypage.optytitlevalidn(expectedTitle);
		Log.info("Successfully validate the title");
		opportunitypage.slectfromintervaldropdown("Next FQ");
		opportunitypage.selectfromincludedropdown("Closed Opportunities");
		Log.info("Successfully selected from dropdowns");
		opportunitypage.clickonrunreport();
		String expectedRTitle="Opportunity Report ~ Salesforce - Developer Edition";
		opportunitypage.optyreportvalidation(expectedRTitle);
		Log.info("Report page with the opportunities that satisfies the search criteria is displayed");
		Log.endTestCase("Quarterly summary report");
		}
	
	
	
	
	
	
	
	@AfterMethod
	public void teardown() {
		takescreenshot(driver,"Salesforce");
		close();
		
	}	
	
}
