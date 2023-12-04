package com.testng.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.testng.base.BasePage;

public class LeadsPage extends BasePage {
	
	 public LeadsPage(WebDriver driver) {
		 super(driver);
		}	
	
	@FindBy(xpath="//a[@title='Leads Tab']")
	WebElement leads;
	@FindBy(id="fcf")
	WebElement view;
	@FindBy(xpath="//input[@title='Go!']")
	WebElement go;
	@FindBy(xpath="//a[@title='Leads Tab']")
	WebElement leadsl;
	@FindBy(xpath="//input[@title='New']")
	WebElement newbtn;
	@FindBy(id="name_lastlea2")
	WebElement lastName;
	@FindBy(id="lea3")
	 WebElement companyName;
	@FindBy(xpath="(//input[@title='Save'])[1]")
	WebElement savebtn;
	
	
	public void clickonleads() {
		waitforElement(leads);
		leads.click(); 	
	}
	public void leadshomevalidn(String expectedHTitle) {
		compareTitle(expectedHTitle);	
	}
	public void clickonview() {
		view.click();	
	}
	public void selectfromviewdropdown() {
		  Select select=new Select(view);
          List<WebElement> viewlist=select.getOptions();
          for(WebElement ele:viewlist) {
          	System.out.println(ele.getText());
          	}	
	}
	public void selecttodayfromviewdropdown(String text) {
		  Select select=new Select(view);
          select.selectByVisibleText(text);
	}
	public void clickonLeadsTab1() {
		waitforElement(leadsl);
		leadsl.click();
	}
	public void clickonGo() {
		go.click();
	}
	public void clickonnew() {
		newbtn.click();
	}
	public void newleadvalidn(String expectednewlTitle) {
	compareTitle(expectednewlTitle);	
	}
	public void enterintolastname(String strlname) {
		lastName.clear();
		lastName.sendKeys(strlname);
	}
	public void enterintocompanyname(String strcname) {
		companyName.clear();
        companyName.sendKeys(strcname);
	}
	public void clickonsavebutton() {
		 savebtn.click();
	}
	public void newleadValidn(String expectednewTitle) {
	compareTitle(expectednewTitle);	
	}
	
	
	

}
		
	
	
	
	
	
	
	
	
	
	
	
	


