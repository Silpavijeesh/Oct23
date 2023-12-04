package com.testng.pages;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.testng.base.BasePage;

public class OpportunityPage extends BasePage {
	
	  public OpportunityPage(WebDriver driver){
		super(driver);
		}
	@FindBy(xpath="//a[@title='Opportunities Tab']")
	 WebElement opty;
	@FindBy(id="fcf")
	WebElement optyDropdwn;
	@FindBy(xpath="//input[@title='New']")
	WebElement newbtn;
	@FindBy(id="opp3")
	 WebElement optyName;
	@FindBy(id="opp4")
	WebElement acctName;
	@FindBy(id="opp6")
	WebElement leadSource;
	@FindBy(id="opp9")
	WebElement closeDate;
	@FindBy(xpath="//a[contains(text(),'Today')]")
	WebElement Today;
	@FindBy(id="opp11")
	WebElement stage;
	@FindBy(id="opp12")
	WebElement probability;
	@FindBy(xpath="//img[@alt='Primary Campaign Source Lookup (New Window)']")
	WebElement pcampaign;
	@FindBy(xpath="//input[@placeholder='Search...']")
	 WebElement searchbtn;
	@FindBy(name="go")
	 WebElement go;
	@FindBy(xpath="//a[contains(text(),'International')]")
	 WebElement cname;
	@FindBy(xpath="(//input[@title='Save'])[1]")
	 WebElement savebtn;
	@FindBy(xpath="//a[contains(text(),'Opportunity Pipeline')]")
	WebElement pipeline;
	@FindBy(xpath="//a[text()='Stuck Opportunities']")
	WebElement stuckopty;
	@FindBy(id="quarter_q")
	 WebElement interval;
	@FindBy(id="open")
	 WebElement include;
	@FindBy(xpath="//input[@title='Run Report']")
	WebElement runReport;
	public void clickonopportunitytab() {
		opty.click();
		}
	public void optytitlevalidn(String expectedTitle) {
		compareTitle(expectedTitle);
	}
	public void optydropdwn() {
		 Select select=new Select(optyDropdwn);
	        List<WebElement> optyList=select.getOptions();
	        for(WebElement ele:optyList) {
	        	System.out.println(ele.getText());	
	           }
              }
	public void clickonnewbutton() {
		 newbtn.click();	
	}
    public void enterintoopportunitynamefield(String stroptyName) {
    	optyName.sendKeys(stroptyName);	
    }
 public void enterintoaccountname(String straccname) {
	 acctName.sendKeys(straccname);
 }
public void selectfromleadsource(String text) {
	Select leadDpdwn=new Select(leadSource);
    leadDpdwn.selectByVisibleText(text);
}
public void clickonclosedate() {
	 closeDate.click();	
}
public void clickontoday() {
	Today.click();	
}
public void selectfromstagedropdown(String text) {
	Select stageDpdwn=new Select(stage);
    stageDpdwn.selectByVisibleText(text);
}
public void enterintoprobability(String strprobname) {
	waitforElement(probability);
	probability.clear();
	probability.sendKeys(strprobname);
}
public void clickonprimarycampaign(WebDriver driver) {
	 String parentHandle=driver.getWindowHandle();
	  pcampaign.click();	
	

	    Set<String>handles=driver.getWindowHandles();
	    for(String handle:handles) {
	    	System.out.println(handle);
	    	if(!handle.equals(parentHandle)) {
	    		driver.switchTo().window(handle);
	    	    driver.switchTo().frame("searchFrame");
	    	     searchbtn.sendKeys("*sa*");
	    	     go.click();
	    	     driver.switchTo().defaultContent();
	    	     driver.switchTo().frame("resultsFrame");
	    	     cname.click();
	    	     
	    	     }	
	    }
	   driver.switchTo().window(parentHandle);
	   System.out.println(driver.getTitle());
	}

     public void clickonsavebutton() {
     savebtn.click(); 
}
/*public void enterintosearchbtn(String strsearch) {
	   searchbtn.sendKeys(strsearch);  
  }
  public void clickongo(WebDriver driver) {
	  waitforElement(go);
	   go.click();
	   driver.switchTo().defaultContent();
	    }
 public void clickoncampaignname(WebDriver driver) {
	 driver.switchTo().frame("resultsFrame"); 
	  cname.click();
 }
 public void clickonsavebutton() {
	// driver.switchTo().window(); 
 }*/
     
     
public void newopportunityvalidation(String expectednTitle1) {
	compareTitle(expectednTitle1);	
}
public void clickonopportunitypipeline() {
	pipeline.click();
}
public void optypipelinetitlevalidn(String expectedpTitle) {
	compareTitle(expectedpTitle);
}
public void clickonstuckopty() {
	stuckopty.click();
}
 public void stuckoptyvalidn(String expectedstTitle) {
	 compareTitle(expectedstTitle);
}  
public void slectfromintervaldropdown(String text) {	
	Select inervaldropdwn=new Select(interval);
	  inervaldropdwn.selectByVisibleText(text);
	}	
public void selectfromincludedropdown(String text) {
	  Select includedropdwn=new Select(include);
	  includedropdwn.selectByVisibleText(text);	
}
public void clickonrunreport() {
	runReport.click();
}
public void optyreportvalidation(String expectedRTitle) {
	 compareTitle(expectedRTitle);
}	
}	
	
	
	
	


