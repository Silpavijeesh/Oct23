package com.testng.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.testng.base.BasePage;

public class AccountsPage extends BasePage {
	
	 public AccountsPage(WebDriver driver) {
		 super(driver);
		}
	
	@FindBy(xpath="//a[@title='Accounts Tab']")
	WebElement accounts;
	@FindBy(xpath="//h2[text()=' Home']")
	 WebElement accountHome;
	@FindBy(id="createNewButton")
	WebElement createNew;
	@FindBy(xpath="//a[@class='accountMru menuButtonMenuLink']")
	 WebElement naccount;
	@FindBy(xpath="//h2[text()=' New Account']")
	 WebElement newAccountValdn;
	@FindBy(id="acc2")
	WebElement accName;
	@FindBy(id="acc6")
	 WebElement acctype;
	@FindBy(id="00NHu00000NHgvi")
	WebElement custPriority;
	@FindBy(xpath="(//input[@title='Save'])[1]")
	WebElement saveBtn;
	@FindBy(xpath="//h2[contains(text(),'accDaffodil')]")
	WebElement newaccvalidn;
	@FindBy(xpath="//a[text()='Create New View']")
	WebElement createNView;
	@FindBy(id="fname")
	WebElement vname;
	@FindBy(id="devname")
	WebElement vuniqueName;
	@FindBy(xpath="(//input[@name='save'])[1]")
	WebElement save;
	@FindBy(id="fcf")
	WebElement viewDropdwn;
	@FindBy(xpath="//a[text()='Edit']")
	 WebElement edit;
	@FindBy(xpath="//h2[text()=' Edit View']")
	 WebElement editViewValidn;
	@FindBy(id="fname")
	WebElement vName;
	@FindBy(id="devname")
	WebElement vUName;
	@FindBy(id="fcol1")
	WebElement filterDrpdwn;
	@FindBy(id="fop1")
	WebElement operatorDrpdwn;
	@FindBy(id="fval1")
	WebElement value;
	@FindBy(xpath="(//input[@title='Save'])[1]")
	WebElement Save;
	@FindBy(xpath="//a[text()='Merge Accounts']")
	WebElement mergeAcc;
	@FindBy(id="srch")
	WebElement txtbox;
	@FindBy(xpath="//input[@value='Find Accounts']")
	WebElement findAcc;
	@FindBy(name="cid")
	WebElement acc1;
	@FindBy(id="cid1")
	WebElement acc2;
	@FindBy(xpath="(//input[@value=' Next '])[1]")
	WebElement next;
	@FindBy(xpath="//h2[contains(text(),'Step 2')]")
	WebElement MergeValidn;
	@FindBy(xpath="(//input[@title='Merge'])[1]")
	WebElement merge;
	@FindBy(xpath="//a[contains(text(),'Accounts with')]")
	WebElement lastActivity;
	@FindBy(xpath="//h2[text()='Unsaved Report']")
	WebElement unsavedReportvaldn;
	@FindBy(id="ext-gen148")
	WebElement dateField;
	
	@FindBy(xpath="//div[text()='Created Date']")
	WebElement cDate;
	@FindBy(id="ext-gen152")
	WebElement from;
	@FindBy(xpath="//button[text()='Today']")
	WebElement today;
	@FindBy(id="ext-gen154")
	WebElement to;
	@FindBy(xpath="(//button[contains(text(),'Today')])[2]")
	WebElement today2;
	@FindBy(id="ext-gen49")
	WebElement save1;
	@FindBy(xpath="//input[@id='saveReportDlg_reportNameField']")
	WebElement repName;
	@FindBy(xpath="//input[@id='saveReportDlg_DeveloperName']")
	WebElement repUName;
	@FindBy(xpath="//button[contains(text(),'Save and Run Report')]")
	WebElement saveNrun;
	
	public void clickonaccounts() {
		accounts.click();
		}
	 public void accounthomevalidation(String expectedaccount) {
    	 String actualaccountt=accountHome.getText();
    	 compareText(actualaccountt,expectedaccount);
     }
	public void clickoncreatenew() {
	createNew.click();
	}
	public void clickonnaccount() {
		waitforElement(naccount);
		naccount.click();
	}
	public void newaccountvalidation(String expectednaccount) {
		String actualnaccount=newAccountValdn.getText();
   	 compareText(actualnaccount,expectednaccount);	
	}
	public void enterintoaccountname(String straccname) {
		waitforElement(accName);
	accName.sendKeys(straccname);
	}
	public void accounttypedropdwn(String text) {
		Select type=new Select(acctype);
		type.selectByVisibleText(text);
	    }
	public void customerprioritydpdown(String text) {
	  Select select=new Select(custPriority);
	  select.selectByVisibleText(text);
	}
	public void clickonsaveBtn() {
		  saveBtn.click();	
	}
	public void newaccountValdation(String expectedTitle) {
		//waitforElement(unsavedReportvaldn);
		 	
		 compareTitle(expectedTitle);
		
	}
	public void clickoncreatenview() {
		createNView.click();	
	}
	
	public void enterintoviewname(String strvname) {
    vname.clear();
	vname.sendKeys(strvname);	
		}
	public void enterintovuniquename(String strvuniquename) {
    vuniqueName.clear();
	vuniqueName.sendKeys(strvuniquename);	
	}
	public void clicksavebtn() {
	save.click();	
	}
	public void selectfromdropdown(String text) {
    waitforElement(viewDropdwn);
	Select select=new Select(viewDropdwn);
	select.selectByVisibleText(text);
	}
	public void clickonedit() {
		edit.click();	
	}
	public void editviewvalidation(String expectedtxt) {
		 String actuatxt=editViewValidn.getText();
		 compareText(actuatxt, expectedtxt);
	}
	public void enterintoViewname(String strvname) {
		 vName.clear();
	     vName.sendKeys(strvname);	
	}
	public void enterintoviewUniquename(String strvuname) {
		vUName.clear();
	    vUName.sendKeys(strvuname);
	}
	public void selectfromfilterdropdown(String value) {
		Select filter=new Select(filterDrpdwn); 
        filter.selectByValue(value);   
    }
	public void selectfromoperatordropdown(String text) {
		 Select operator=new Select(operatorDrpdwn); 
	        operator.selectByVisibleText(text);
	}
	public void enterintovalue(String strvalue) {
		value.clear();
        value.sendKeys(strvalue);
	}
	public void clickonSave() {
		Save.click();
	}
	public void clickonmergeaccount() {
		 mergeAcc.click();	
	}
	public void enterintotextbox(String strtxt) {
		waitforElement(txtbox);
		txtbox.sendKeys(strtxt);	
	}
	public void clickonfindaccount() {
		findAcc.click();	
	}
	public void clickonaccount1() {
		acc1.click();	
	}
	public void clickonaccount2() {
		acc2.click();
	}
	public void clickonnext() {
		next.click();
    }
	public void mergevalidation(String expectedStep) {
		 String actualStep=MergeValidn.getText();
		 compareText(actualStep, expectedStep);
	}
	public void clickonmergebtn() {
		 merge.click();	
	}
	public void acceptalert(WebDriver driver) {
		String alertText=driver.switchTo().alert().getText();
        System.out.println(alertText); 
		driver.switchTo().alert().accept();	
	}
	public void clickonlastactivity() {
		lastActivity.click();	
	}
	public void unsavedreportvalidation(String expectedTitle) {
		compareTitle(expectedTitle);
	}
	public void clickondatefield() {
		waitforElement(dateField);
		 dateField.click();	
	}
	public void clickoncurrentdate() {
		cDate.click();	
	}
	public void clickonfromfield() {
		 from.click();
	}
	public void clickontoday() {
		 today.click();	
	}
	public void clickontofield() {
		 to.click();
	}
	public void clickontoday2() {
		 today2.click();	
	}
	public void clickonsave1() {
		save1.click();	
	}
	public void switchtoactiveelement(WebDriver driver) {
	driver.switchTo().activeElement();	
		}
	public void enterintoreportname(String strrepname) {
		repName.sendKeys(strrepname);	
	}
	public void enterintorepuname(String strrepuname) {
		repUName.sendKeys(strrepuname);	
	}
	public void switchtooriginalpage() {
		
	}
	public void clickonsavenrun() {
		saveNrun.click();
	}
	
}
