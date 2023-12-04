package com.testng.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.testng.base.BasePage;

public class RandomScenariosPage extends BasePage { 
	
	public RandomScenariosPage(WebDriver driver) {
		super(driver);
}
@FindBy(xpath="//a[@title='Home Tab']")	
WebElement home;	
@FindBy(xpath="//h1[@class='currentStatusUserName']")	
WebElement nameValidn;	
@FindBy(xpath="//h1[@class='currentStatusUserName']")
WebElement flnamelink;
@FindBy(xpath="(//img[@title='Edit Profile'])[1]")
WebElement edit;
@FindBy(xpath="//a[contains(text(),'About')]")
WebElement about;
@FindBy(id="lastName")
WebElement lastName;
@FindBy(xpath="//input[@value='Save All']")
WebElement saveAll;
@FindBy(id="tailBreadcrumbNode")
WebElement updatedLName;
@FindBy(id="userNavButton")
WebElement updtedumenu;
@FindBy(xpath="//img[@class='allTabsArrow']")
WebElement alltabs;
@FindBy(xpath="//input[@value='Customize My Tabs']")
WebElement customizeMytabs;
@FindBy(xpath="//option[text()='Subscriptions']")
WebElement subscription;
@FindBy(xpath="//img[@title='Remove']")
WebElement remove;
@FindBy(xpath="//input[@value=' Save ']")
WebElement save;
@FindBy(id="userNav-arrow")
WebElement usermenuDrpdown;
@FindBy(xpath="//a[@title='Logout']")
WebElement logout;
@FindBy(xpath="//img[@id='logo']")
WebElement SFlogo;
@FindBy(id="username")
WebElement username;
@FindBy(id="password")
WebElement password;
@FindBy(name="Login")
WebElement login;
@FindBy(xpath="//span[@class='pageDescription']/a")
WebElement currentDatelink;
@FindBy(xpath="//a[contains(text(),'8:00 PM')]")
WebElement time;
@FindBy(xpath="//img[@class='comboboxIcon']")
WebElement comboicon;
@FindBy(xpath="//a[text()='Other']")
WebElement other;
@FindBy(id="EndDateTime_time")
WebElement endTimefld;
@FindBy(id="timePickerItem_42")
WebElement etime;
@FindBy(xpath="(//input[@title='Save'])[1]")
WebElement save1;
@FindBy(xpath="//a[contains(text(),'4:00 PM')]")
WebElement timelink;
@FindBy(xpath="//img[@title='Subject Combo (New Window)']")
WebElement combopopUp;
@FindBy(id="timePickerItem_38")
WebElement endtime;
@FindBy(id="IsRecurrence")
WebElement recurrence;
@FindBy(id="rectypeftw")
WebElement weeklyRButton;
@FindBy(id="RecurrenceEndDateOnly")
WebElement rEndDate;
@FindBy(id="calMonthPicker")
WebElement monthdpdwn;
@FindBy(xpath="//td[text()='17']")
WebElement rEnd;
@FindBy(xpath="(//input[@title='Save'])[2]")
WebElement save3;
@FindBy(xpath="//img[@class='monthViewIcon']")
WebElement monthview;

public void clickonhometab() {	
	 home.click();	
}
public void namevalidation(String expectedname) {
String actualname=nameValidn.getText();	
compareText(actualname, expectedname);
}
public void clickonfnmelnamelink() {
	  flnamelink.click();	
}
public void firstnamelastnametpagevalidn(String expectedflname) {
	compareTitle(expectedflname);
	
}
public void myprofilenamevalidation(String expectedproname) {
	compareTitle(expectedproname);
}
public void clickoneditlink() {
	  edit.click();
}
public void clickonabout() {
	about.click();
}
public void enterintolastname(String strLName) {
	lastName.clear();
    lastName.sendKeys(strLName);
}
public void clickonsaveall() {
	 saveAll.click();	
}
public void updatdnamepagevalidn(String expectedupdtdname) {
	compareTitle(expectedupdtdname);
	}	
public void updatedusernamenamevalidation(String expectedusername) {
String actualusername=updtedumenu.getText();	
compareText(actualusername,expectedusername );
}
public void updatdflpagevalidn(String updtdflpage ) {
	compareTitle(updtdflpage);
	}	
public void clickonalltabs() {
	 alltabs.click();
}
public void alltabspagevalidation(String expectedAllTabTitle) {
	compareTitle(expectedAllTabTitle);
}
public void clickoncustomizemytabs() {
	waitforElement(customizeMytabs);
	 customizeMytabs.click();
}
public void clickonsubscription() {
	subscription.click();
}
public void clickonremove() {
	 remove.click();	
}
public void clickonsave() {
	save.click();
}
public void titlevalidationaftersave(String expectedTitle) {
	compareTitle(expectedTitle);
}
public void clickonusermenudropdown() {	
	 usermenuDrpdown.click();
}
public void clickonlogout() {
	logout.click();
}
public void Salesforcevaldn(String expTitle) {
compareTitle(expTitle);
}
public void homepagevaldn(String expectedhomeTitle) {
compareTitle(expectedhomeTitle);
 }
public void datevalidn(String expecteddate) {
	String actualdate=currentDatelink.getText();	
	compareText(actualdate,expecteddate );	
}
public void clickoncurrentdatelink() {
	waitforElement(currentDatelink);
	currentDatelink.click();
}
public void calendernamevalidn(String expectedcalender) {
	compareTitle(expectedcalender);
}
public void clickontime() {
	 time.click();	
}
public void calenderneweventpagevalidn(String ExpcalenderTitle) {
compareTitle(ExpcalenderTitle);	
}
public void clickonsubjectcomboicon() {
	comboicon.click();
}
public void clickonother() {
	other.click();	
}
public void clickonendtimefield() {
	endTimefld.click();	
}
public void selecttimefromdropdown() {
	etime.click();
}
public void clickonSaveButton() {
	save1.click();	
}
public void calenderpagevalidation(String expectedCalTitle) {
compareTitle(expectedCalTitle);	
}
public void clickontimelink() {
	 timelink.click();
}
public void clickoncombopopup() {
	combopopUp.click();	
}
public void clickonendtime() {
	endtime.click();
}
public void clickonrecurrence() {
	recurrence.click();
}
public void clickonweeklybutton() {
	weeklyRButton.click();
}
public void clickonrecurrenceenddate() {
	rEndDate.click();
}
public void selectfrommonthdropdown(String text) {
	Select select=new Select(monthdpdwn);
	select.selectByVisibleText(text);
}
public void clickonrecurrenceend() {
	rEnd.click();	
}
public void clickonSave3() {
	save3.click();
}
public void caltitlevalidation(String expectedcTitle) {
compareTitle(expectedcTitle);	
}
public void clickonmonthview() {
	monthview.click();	
}
public void monthviewvalidn(String monthviewTitle) {
compareTitle(monthviewTitle);	
}

}

