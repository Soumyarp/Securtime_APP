package com.secutime.app.homepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.secutime.app.base.TestBase;

public class HomePage extends TestBase{

	
	@FindBy(xpath="//b[contains(.,'admin')]")
	WebElement userNameLabel;
	
	/*-----------------Menu Icon--------------------------*/
	
	@FindBy(xpath="//div[@class='col-xs-12 no-padding-left no-padding-right']//div[@title='undefined']")
	WebElement homePageLink;
	
	@FindBy(xpath="//div[@class='col-xs-12 no-padding-left no-padding-right']//div[@title='Time & Attendance']")
	WebElement timeandAttendanceLink;
	
	@FindBy(xpath="//div[@class='col-xs-12 no-padding-left no-padding-right']//div[@title='Absence Management']")
	WebElement absenceManagementLink;
	
	@FindBy(xpath="//div[@class='col-xs-12 no-padding-left no-padding-right']//div[@title='Mobile Application']")
	WebElement mobileApplicationLink;
	
	@FindBy(xpath="//div[@class='col-xs-12 no-padding-left no-padding-right']//div[@title='Kiosk Management']")
	WebElement kioskManagementLink;
	
	@FindBy(xpath="//div[@class='col-xs-12 no-padding-left no-padding-right']//div[@title='Time Sheet']")
	WebElement timeSheetLink;
	
	@FindBy(xpath="//div[@class='col-xs-12 no-padding-left no-padding-right']//div[@title='Alerts & Notifications']")
	WebElement alertandNotificationLink;
	
	/*-------------------SubMenu-----------------------------*/
	
	@FindBy(xpath="//div[@class='col-xs-12 no-padding-left no-padding-right']//div[contains(text(),'Organization')]")
	WebElement organisationLink;
	
	@FindBy(xpath="//div[@class='col-xs-12 no-padding-left no-padding-right']//div[contains(text(),'Access Management')]")
	WebElement accessManagementLink;
	
	@FindBy(xpath="//div[@class='col-xs-12 no-padding-left no-padding-right']//div[contains(text(),'Device Settings')]")
	WebElement deviceSettingLink;
	
	@FindBy(xpath="//div[@class='col-xs-12 no-padding-left no-padding-right']//div[contains(text(),'Transactions')]")
	WebElement transactionsLink;
	
	@FindBy(xpath="//div[@class='col-xs-12 no-padding-left no-padding-right']//div[contains(text(),'Policy Management')]")
	WebElement policyManagementLink;
	
	@FindBy(xpath="//div[@class='col-xs-12 no-padding-left no-padding-right']//div[contains(text(),'Shift Management')]")
	WebElement shiftManagementLink;
	
	@FindBy(xpath="//div[@class='col-xs-12 no-padding-left no-padding-right']//div[contains(text(),'Masters')]")
	WebElement mastersLink;
	
	@FindBy(xpath="//div[@class='col-xs-12 no-padding-left no-padding-right']//div[contains(text(),'Support Tools')]")
	WebElement supportToolsLink;
	
	@FindBy(xpath="//div[@class='col-xs-12 no-padding-left no-padding-right']//div[contains(text(),'Subscriptions')]")
	WebElement subscriptionsLink;
	
	@FindBy(xpath="//div[@class='col-xs-12 no-padding-left no-padding-right']//div[contains(text(),'Alarms')]")
	WebElement alarmsLink;
	
	@FindBy(xpath="//div[@class='col-xs-12 no-padding-left no-padding-right']//div[contains(text(),'Dashboard')]")
	WebElement dashboardLink;
	
	@FindBy(xpath="//div[@class='col-xs-12 no-padding-left no-padding-right']//div[contains(text(),'Settings')]")
	WebElement settingsLink;
	
	
	
	public HomePage(){
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle(){
		return driver.getTitle();
	}
	
	public boolean verifyUserNameLebel(){
		return userNameLabel.isDisplayed();
	}

	public void clickOnHomePageLink(){
		homePageLink.click();
	}
	
	public void clickOnTimeandAttendancLink(){
		timeandAttendanceLink.click();
	}
	
	public void clickOnAbsenceManagementLink(){
		absenceManagementLink.click();
	}
	
	public void clickOnMobileApplicationLink(){
		mobileApplicationLink.click();
	}
	
	public void clickOnKioskManagementLink(){
		kioskManagementLink.click();
	}
	
	public void clickOnTimeSheetLinkLink(){
		timeSheetLink.click();
	}
	
	public void clickOnAlertandNotificationLink(){
		alertandNotificationLink.click();
	}
	
	public void clickOnOrganisationLink(){
		organisationLink.click();
	}
	
	public void clickOnAccessManagementLink(){
		accessManagementLink.click();
	}
	
	public void clickOnDeviceSettingLink(){
		deviceSettingLink.click();
	}
	
	public void clickOnTransactionsLink(){
		transactionsLink.click();
	}
	
	public void clickOnPolicyManagementLink(){
		policyManagementLink.click();
	}
	
	public void clickOnShiftManagementLink(){
		shiftManagementLink.click();
	}
	
	public void clickOnMastersLink(){
		mastersLink.click();
	}
	
	public void clickOnSupportToolsLink(){
		supportToolsLink.click();
	}
	
	public void clickOnSubscriptionLink(){
		subscriptionsLink.click();
	}
	
	public void clickOnAlarmsLink(){
		alarmsLink.click();
	}
	
	public void clickOnDashBoardLink(){
		dashboardLink.click();
	//	return new DashBoardPage();
	}
	
	public void clickOnSettingsLink(){
		settingsLink.click();
	//	return new SettingsPage();
	}
}
