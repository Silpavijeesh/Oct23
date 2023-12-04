package com.testng.pages;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.testng.base.BasePage;

public class UsermenuPage extends BasePage {
	
	 public UsermenuPage(WebDriver driver) {
	 super(driver);
	}
	 
	@FindBy(id="userNavLabel")
	WebElement usermenudropdwn;
	@FindBy(id="userNavMenu")
	List<WebElement> dropdownlist;		
	@FindBy(xpath="//a[@title='My Profile']")
	WebElement myprofile;
	@FindBy(xpath="//a[@title='Developer Console (New Window)']")
	WebElement developerConsole;
	@FindBy(xpath="//a[@title='My Settings']")
	WebElement mySettings;
	@FindBy(xpath="//a[@class='switch-to-lightning']")
    WebElement switchtoLExp;		
	@FindBy(xpath="//a[@title='Logout']")		
	 WebElement logout;
	@FindBy(xpath="(//img[@alt='Edit Profile'])[1]")
	WebElement edit;
	@FindBy(id="contactInfoContentId")
	WebElement frame;
	@FindBy(xpath="//a[contains(text(),'About')]")
	WebElement about;
	@FindBy(id="lastName")
	WebElement lname;
	@FindBy(xpath="//input[@value='Save All']")
	WebElement saveAll;
	@FindBy(xpath="//span[@id='tailBreadcrumbNode']")
	WebElement changedlname;
	@FindBy(xpath="//span[text()='Post']")
	WebElement post;
	@FindBy(xpath="//iframe[@class='cke_wysiwyg_frame cke_reset']")
	WebElement frameEle;
	@FindBy(xpath="//body[contains(text(),'Share an update, @mention someone...')]")
	WebElement posttext;
	@FindBy(id="publishersharebutton")
	WebElement share;
	@FindBy(xpath="(//span[@class='publisherattachtext '])[2]")
	 WebElement file;
	@FindBy(xpath="//td[@id='chatterUploadFileActionPanel']")
	WebElement uploadFromcomp;
	@FindBy(xpath="//input[@id='chatterFile']")
	WebElement chooseFile;
	@FindBy(xpath="//input[@id='publishersharebutton']")
	WebElement sharebtn;
	@FindBy(className="chatter-photo")
	WebElement photo;
	@FindBy(id="uploadLink")
	WebElement addphoto;
	@FindBy(xpath="//input[@id='j_id0:uploadFileForm:uploadInputFile']")
	WebElement ChooseFile;
	@FindBy(xpath="//iframe[@id='uploadPhotoContentId']")
	WebElement frameElement;
	@FindBy(xpath="//input[@id='j_id0:uploadFileForm:uploadBtn']")
	WebElement Save;
	@FindBy(xpath="//input[@id='j_id0:j_id7:save']")
	WebElement saveaftercrop;
	
	
	
	
	@FindBy(xpath="//span[text()='My Settings']")
	WebElement mySettingsValidn; 
	@FindBy(id="PersonalInfo_font")
	WebElement personal;
	@FindBy(id="LoginHistory_font")
	WebElement loginHistory;
	@FindBy(xpath="//h1[text()='Login History']")
	WebElement loginhistoryValidn; 
	@FindBy(id="DisplayAndLayout_font")
	WebElement displayLayout; 
	@FindBy(id="CustomizeTabs_font")
	WebElement customizeTabs;
	@FindBy(id="p4")
	WebElement customDropdwn;
	@FindBy(xpath="//option[@value='report']")
	WebElement Reports;
	@FindBy(xpath="//img[@title='Add']")
	WebElement Add;
	@FindBy(xpath="//input[@class='btn primary']")
	WebElement save;
	@FindBy(id="EmailSetup_font")
	WebElement Email;
	@FindBy(id="EmailSettings_font")
	WebElement myEmailsettings;
	@FindBy(id="sender_name")
	WebElement emailName;
	@FindBy(id="sender_email")
	WebElement emailAddress;
	@FindBy(id="auto_bcc1")
	WebElement radiobtn;
	@FindBy(xpath="//input[@name='save']")
	WebElement savebtn;
	@FindBy(xpath="//div[contains(text(),'Your settings')]")
	WebElement validnmessg;
	@FindBy(id="CalendarAndReminders_font")
	 WebElement calReminder;
	@FindBy(id="Reminders_font")
	WebElement ActivityRem;
	@FindBy(id="testbtn")
	WebElement OpenTestRem;
	
	
	
	
	
	
	
	
	
	
	public void checkforusermenu(String expectedusermenu) {
	String actualusermenu=usermenudropdwn.getText();
	compareText(actualusermenu,expectedusermenu);
	}
	public void clickonusermenudropdown() {
	usermenudropdwn.click();	
	}
	public void dropdownlistitems(){
	List<WebElement> actuallist= (List<WebElement>) dropdownlist;	
	for(WebElement element: actuallist)	{
		String text=element.getText();
        System.out.println(text);	
		List<String> expectedlist=Arrays.asList("My Profile", "My Settings","Developer Console","Switch to Lightning Experience","Logout" );
		if(expectedlist.contains(text)) {
		System.out.println("Found: "+text);
		}
	}
	}
   public void usermenudpdownvalidn(String expectedprofile ) {
	   String actualProfile=myprofile.getText();  
	   compareText(actualProfile,expectedprofile);
   }
   public void mysettingsvalidn(String expectedsettings) {
	   String actualSettings=mySettings.getText();
	   compareText(actualSettings,expectedsettings);
   }
  public void developerconsolevalidn(String expectedDconsole) {
	  String actualDconsole=developerConsole.getText(); 
      compareText(actualDconsole,expectedDconsole);
  }
 public void switchToLexpvalidn(String expectedLexp) {	   
	 String actualLexp=switchtoLExp.getText();
     compareText(actualLexp,expectedLexp);
 }
 public void logoutvalidn(String expectedLogout) {
	 String actualLogout=logout.getText();
     compareText(actualLogout,expectedLogout);
	  }
 public void clickonmyprofile() {
	 myprofile.click();
	 }
 public void clickonedit() {
	 waitforElement(edit);
	 edit.click();
 }
 public void switchframe(WebDriver driver) {
	 driver.switchTo().frame("contactInfoContentId");
 }
 public void clickonabout() {
 about.click();
  }
 public void clearlastname() {
 lname.clear();
 }
 public void enterintolastname(String strlname) {
 lname.sendKeys(strlname);
  }
 public void clickonsaveall() {
	 saveAll.click();
 }
 /*public void switchtooriginalpage(WebDriver driver) {
	 driver.switchTo().defaultContent();
 }*/
 public void chanedlnamevalidn(String expectedlname) {
	 //waitforElement(changedlname);
	String actuallname=changedlname.getText();
	 compareText(actuallname,expectedlname);
 }
 public void clickonpost() {
	 post.click();
 }
 public void switchtoframe(WebDriver driver) {
	 driver.switchTo().frame(frameEle);
 }
 public void enterintoposttext(String strposttext) {
	 waitforElement(posttext);
	 posttext.sendKeys(strposttext);
 }
 public void clicksharebutton() {
	 share.click(); 
 }
public void clickonfilelink() {
	file.click();
}
public void clickonuploadfromcomputer() {
	uploadFromcomp.click();
 }
public void enterintochooseFile(String filename) {
	waitforElement(chooseFile);
	chooseFile.sendKeys(filename);	
}
public void clickonsharebtn() {
	waitforElement(sharebtn);
	sharebtn.click();
	
}
public void mousehover(WebDriver driver) {
	waitforElement(photo);
Actions action=new Actions(driver);
 action.moveToElement(photo).build().perform();
}
public void clickonaddphoto(WebDriver driver) {
	addphoto.click();
	// driver.switchTo().frame("uploadPhotoContentId");
	 }

 public void enterintoChooseFile(String strcfile) {
	 //waitforElement(frameElement);
	 ChooseFile.sendKeys(strcfile);	 
 }
public void clickSaveButton() {
	Save.click();
}
public void clicksaveaftercroping() {
	waitforElement(saveaftercrop);
	saveaftercrop.click();	
}
	
public void switchtoFrame(WebDriver driver) {
	waitforElement(frameElement);
driver.switchTo().frame(frameElement); 	 
}
 
public void clickonmysettings() {
	mySettings.click();
}
public void mysettingsValidation(String expected) {
	 String actual=mySettingsValidn.getText();
	 compareText(actual,expected);
}
public void clickonpersonal() {
	waitforElement(personal);
	personal.click();
	}
public void clickonloginhistory() {
	loginHistory.click();	 
}
public void loginhistoryvalidn(String expectedHistory) {
	String actualHistory=loginhistoryValidn.getText();
    compareText(actualHistory, expectedHistory);
}
public void clickondisplayandlayout() {
	displayLayout.click();
}
public void clickoncustomizetabs() {
	 customizeTabs.click();
}
public void selectSalesforcechatterfromCustomdrpdwn(String text) {
	Select content=new Select(customDropdwn);
    content.selectByVisibleText(text);
    }
public void clickonreports() {
	Reports.click();	
}
public void clickonadd() {
	Add.click();
}
public void clickonsave() {
	 save.click();	
}
public void clickonEmail() {
	waitforElement(Email);
	 Email.click();	
}
public void clickonmyEmailSettings() {
myEmailsettings.click();
}
public void clearemailname() {
	 emailName.clear();
}
public void enteremailname(String ename) {
    emailName.sendKeys(ename);
}
public void clearemailaddress() {
	emailAddress.clear();	
 }
public void enteremailaddress(String eaddress) {
	waitforElement(emailAddress);
	 emailAddress.sendKeys(eaddress);
}
public void clickonradiobtn() {
	radiobtn.click();	
}
public void clickonSavebtn() {
	savebtn.click();
}
public void valdationmessage(String expectedmsg) {
	String actualmsg=validnmessg.getText();
	compareText(actualmsg, expectedmsg);
}
public void clickoncalReminder() {
	calReminder.click();
}
public void clickonactivityreminder() {
	ActivityRem.click();
}
public void clickonopentestreminder(WebDriver driver) {
	 OpenTestRem.click();
	 windowhandle(driver);
}
public void logoutvalidation(String expectedloginTitle) {
	 compareTitle(expectedloginTitle);
}	
public void clickondevcosole(WebDriver driver) {
 developerConsole.click();
 windowhandle(driver);
 }
public void clickonlogout() {
	waitforElement(logout);
	logout.click();
}

	
	
}

	
  
 

	


	
	
	
	
	


