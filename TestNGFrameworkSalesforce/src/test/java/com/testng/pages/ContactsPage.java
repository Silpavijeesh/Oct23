package com.testng.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.testng.base.BasePage;

public class ContactsPage extends BasePage {
	public ContactsPage(WebDriver driver) {
		super(driver);
}

	@FindBy(xpath="//a[text()='Contacts']")
	WebElement contacts;
	@FindBy(xpath="//input[@title='New']")
	WebElement newBtn;
	@FindBy(id="name_lastcon2")
	WebElement lastName;
	@FindBy(id="con4")
	WebElement accName;
	@FindBy(xpath="(//input[@title='Save'])[1]")
	WebElement saveBtn;
	@FindBy(xpath="//a[contains(text(),'Create New View')]")
	WebElement createNewview;
	@FindBy(id="fname")
	WebElement vName;
	@FindBy(id="devname")
	WebElement vUnqName;
	@FindBy(xpath="(//input[@title='Save'])[1]")
	WebElement savebtn;
	@FindBy(xpath="//select[@id='hotlist_mode']")
	WebElement recentlyCreated;
	@FindBy(id="fcf")
	WebElement view;
	@FindBy(xpath="//a[contains(text(),'dev')]")
	WebElement Name;
	@FindBy(id="devname")
	WebElement viewUniqueName;
	@FindBy(xpath="(//input[@title='Save'])[1]")
	WebElement save;
	@FindBy(xpath="//div[contains(text(),'You must enter a value')]")
	WebElement errorvalidn;
	@FindBy(id="fname")
	WebElement viewName;
	@FindBy(id="devname")
	WebElement viewuniqueName;
	@FindBy(xpath="(//input[@title='Cancel'])[1]")
	WebElement cancelbtn;
	@FindBy(id="name_lastcon2")
	WebElement lName;
	@FindBy(id="con4")
	WebElement accountName;
	@FindBy(xpath="(//input[@value='Save & New'])[1]")
	WebElement saveNew;
	
	public void clickoncontactstab() {
		   contacts.click();	
	}
	public void contactshomevalidn(String expectedchmetitle) {
		compareTitle(expectedchmetitle);
	}
	public void clickonnewbutton() {
		newBtn.click(); 
	}
	public void enterintolastname(String strlname) {
		 lastName.clear();
		 lastName.sendKeys(strlname);	
	}
	public void enterintoaccountname(String stracname) {
		accName.clear();
	    accName.sendKeys(stracname);
	}
	public void clicksavebtn() {
		saveBtn.click();	
	}
	public void newcontactvalidn(String expectedname) {
	compareTitle(expectedname);
	}
	public void clickoncreatenewview() {
		 createNewview.click();	
	}
	public void enterintoviewname(String strvname) {
		  vName.clear();
		  vName.sendKeys(strvname);	
	}
	public void enterintoviewuniquename(String strvuname) {
		 vUnqName.clear();
		 vUnqName.sendKeys(strvuname);	
	}
	public void clickonsavebutton1() 
	{
		waitforElement(savebtn);
		savebtn.click();
	}
	public void contacthomepagevalidn(String expectedctitle) {
	compareTitle(expectedctitle);	
	}
	public void clickonrecentlycreated() {
		recentlyCreated.click();	
	}
	public void selectfromrecentlycreateddropdown(String text) {
		 Select select=new Select(recentlyCreated);
		 select.selectByVisibleText(text);	
	}
	public void clickonview() {
		 view.click();	
	}
	public void selectfromviewdropdown(String text) {
		  Select viewdrpdwn=new Select(view);
	      viewdrpdwn.selectByVisibleText(text);	
	}
	public void clickanyname() {
		Name.click();	
	}
	public void titlevalidn(String expectednameTitle) {
	compareTitle(expectednameTitle);	
	}
	public void enterintoviewuniquenamefield(String strvunname) {
	viewUniqueName.sendKeys(strvunname);	
	}
	public void clickSaveBtn() {
	save.click();	
	}
	public void errorvalidation(String expectederror) {
		String actualerror=errorvalidn.getText();
		compareText(actualerror, expectederror);
	}
	public void enterintoViewName(String strVName) {
		 viewName.clear();
	     viewName.sendKeys(strVName);	
	}
	public void enterintoViewUniqueName(String strVUName) {
		viewuniqueName.clear();
		viewuniqueName.sendKeys(strVUName);
	}
	public void clickoncancelbutton() {
		cancelbtn.click();
	}
	public void enterintoLastname(String strlastname) {
		lName.sendKeys(strlastname);	
	}
	public void enterintoAccountName(String straccName) {
		 accountName.sendKeys(straccName);	
	}
	public void clickonSaveandNew() {
		saveNew.click();	
	}
	
	
}