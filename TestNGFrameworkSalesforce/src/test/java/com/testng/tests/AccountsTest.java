package com.testng.tests;

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
import com.testng.pages.LoginPage;
import com.testng.pages.UsermenuPage;

public class AccountsTest extends BaseTest {
	
		WebDriver driver;
		LoginPage loginpage;
		UsermenuPage usermenupage;
		AccountsPage accountspage;
		@BeforeMethod
		public void beforemethod() { 
			driver=getDriver();
			launchapp(driver);
			loginpage= new LoginPage(driver);
			usermenupage=new UsermenuPage(driver);
			accountspage=new AccountsPage(driver);
			DOMConfigurator.configure("log4j.xml");
		}
		@Test
		public void createaccount() {
			Log.startTestCase("createaccount");
			loginpage.enterintoUsername("silu@test.com");
			Log.info("Successfully entered username");
			loginpage.enterintoPassword("Ammukutty12");
			loginpage.clicklogin();
			String expectedText="Home";
			loginpage.homevalidation(expectedText);	
			accountspage.clickonaccounts();
			String expectedaccount="Home";
			accountspage.accounthomevalidation(expectedaccount);
			accountspage.clickoncreatenew();
			accountspage.clickonnaccount();
			String expectednaccount="New Account";
			accountspage.newaccountvalidation(expectednaccount);
			accountspage.enterintoaccountname("accDaffodil");
			accountspage.accounttypedropdwn("Technology Partner");
			accountspage.customerprioritydpdown("High");
			accountspage.clickonsaveBtn();
			String expectednTitle="Account: accDaffodil ~ Salesforce - Developer Edition";
			accountspage.newaccountValdation(expectednTitle);
			Log.info("Testcase passed");
			Log.endTestCase("Successfully completed create account");
		}
		@Test
		public void createnewview() {
			Log.startTestCase("createnewview");
			loginpage.enterintoUsername("silu@test.com");
			Log.info("Successfully entered username");
			loginpage.enterintoPassword("Ammukutty12");
			loginpage.clicklogin();
			String expectedText="Home";
			loginpage.homevalidation(expectedText);	
			accountspage.clickonaccounts();
			String expectedaccount="Home";
			accountspage.accounthomevalidation(expectedaccount);
			accountspage.clickoncreatenview();
			accountspage.enterintoviewname("Silpa");
			accountspage.enterintovuniquename("Silpa13");
            accountspage.clicksavebtn();
            Log.info("newly added view is displayed in the account viewlist");
            Log.endTestCase("createnewview");
		}
		@Test
		public void editview() {
			Log.startTestCase("edit view");
			loginpage.enterintoUsername("silu@test.com");
			Log.info("Successfully entered username");
			loginpage.enterintoPassword("Ammukutty12");
			loginpage.clicklogin();
			String expectedText="Home";
			loginpage.homevalidation(expectedText);	
			accountspage.clickonaccounts();
			String expectedaccount="Home";
			accountspage.accounthomevalidation(expectedaccount);
			accountspage.selectfromdropdown("Daffodils1");
			accountspage.clickonedit();
			String expectedtxt="Edit View";
			accountspage.editviewvalidation(expectedtxt);
			accountspage.enterintoViewname("Daffodils2");
			accountspage.enterintoviewUniquename("Daf_2");
			accountspage.selectfromfilterdropdown("ACCOUNT.NAME");
			accountspage.selectfromoperatordropdown("contains");
			accountspage.enterintovalue("a");
			accountspage.clickonSave();
			Log.endTestCase("Edit view");
			}
		@Test
      public void mergeaccounts() {
			Log.startTestCase("merge accounts");
			loginpage.enterintoUsername("silu@test.com");
			Log.info("Successfully entered username");
			loginpage.enterintoPassword("Ammukutty12");
			loginpage.clicklogin();
			String expectedText="Home";
			loginpage.homevalidation(expectedText);	
			accountspage.clickonaccounts();
			String expectedaccount="Home";
			accountspage.accounthomevalidation(expectedaccount);	
			Log.info(expectedaccount);
			accountspage.clickonmergeaccount();
			accountspage.enterintotextbox("acc");
			accountspage.clickonfindaccount();
			accountspage.clickonaccount1();
			accountspage.clickonaccount2();
			accountspage.clickonnext();
			String expectedStep="Step 2. Select the values to retain";
			accountspage.mergevalidation(expectedStep);
			accountspage.clickonmergebtn();
			accountspage.acceptalert(driver);
			Log.info("accpted the alert");
			Log.endTestCase("Merge accounts");
			}
		@Test
		public void createaccountreport() {
			Log.startTestCase("create account report");
			loginpage.enterintoUsername("silu@test.com");
			Log.info("Successfully entered username");
			loginpage.enterintoPassword("Ammukutty12");
			loginpage.clicklogin();
			String expectedText="Home";
			loginpage.homevalidation(expectedText);	
			accountspage.clickonaccounts();
			String expectedaccount="Home";
			accountspage.accounthomevalidation(expectedaccount);
			Log.info(expectedaccount);
			accountspage.clickonlastactivity();
			String expectedTitle="Unsaved Report ~ Salesforce - Developer Edition";
			accountspage.unsavedreportvalidation(expectedTitle);
			Log.info("unsaved report page is displayed");
			accountspage.clickondatefield();
			accountspage.clickoncurrentdate();
			accountspage.clickonfromfield();
			accountspage.clickontoday();
			accountspage.clickontofield();
			accountspage.clickontoday2();
			Log.info("List of accounts qualified is displayed");
			accountspage.clickonsave1();
			accountspage.switchtoactiveelement(driver);
			accountspage.enterintoreportname("nReport1");
			accountspage.enterintorepuname("nReport13");
			accountspage.clickonsavenrun();
			accountspage.switchtooriginalpage();
			//driver.switchTo().defaultContent();
			Log.info("new report nreport1 is created with details");
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		@AfterMethod
		public void teardown() {
			takescreenshot(driver,"Salesforce");
			close();
		}	
}
