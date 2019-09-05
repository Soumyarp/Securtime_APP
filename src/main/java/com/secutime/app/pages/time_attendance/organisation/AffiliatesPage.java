package com.secutime.app.pages.time_attendance.organisation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.secutime.app.base.TestBase;

public class AffiliatesPage extends TestBase {
	
	@FindBy(xpath="//div[@class='col-xs-12 no-padding-left no-padding-right']//a[contains(.,'Affiliates')]")
	WebElement affiliatePageLink;
	
	@FindBy(xpath="//span[contains(text(),'Affiliates')]")
	WebElement affliateLabel;
	
	@FindBy(xpath="//span[contains(text(),'New Affiliate')]")
	WebElement affiliateButton;
	
	@FindBy(xpath="//h4[contains(text(),'Create Affiliate')]")
	WebElement createAffiliateLabel;
	
	@FindBy(xpath="//input[@placeholder='Name']")
	WebElement affiliateNameTextBox;
	
	@FindBy(xpath="//input[@placeholder='Phone Number']")
	WebElement contactNoTextBox;
	
	@FindBy(xpath="//input[@id='mapInput']")
	WebElement addressTextBox;
	
	@FindBy(xpath="//button[contains(text(),'SAVE')]")
	WebElement saveButton;
	
	public AffiliatesPage(){
		PageFactory.initElements(driver, this);
	}
	
	

}
