package com.secutime.app.pages.time_attendance.organisation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.secutime.app.base.TestBase;

public class DepartmentsPage extends TestBase{
	
	@FindBy(xpath="//div[@class='col-xs-12 no-padding-left no-padding-right']//a[contains(.,'Departments')]")
	WebElement departmentPageLink;
	
	@FindBy(xpath="//span[contains(text(),'Departments')]")
	WebElement departmentLabel;
	
	@FindBy(xpath="//span[contains(text(),''New Department')]")
	WebElement departmentButton;
	
	@FindBy(xpath="//h4[contains(text(),'Create Department')]")
	WebElement createDepartmentLabel;
	
	@FindBy(xpath="//span[contains(text(),'Select Affiliate')]")
	WebElement selectAffiliateDropdown;
	
	@FindBy(xpath="//input[@placeholder='Name']")
	WebElement departmentNameTextBox;
	
	@FindBy(xpath="//button[contains(text(),'SAVE')]")
	WebElement saveButton;
	
	public DepartmentsPage(){
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnDepartmentPageLink(){
		departmentPageLink.click();
	}
	
	public boolean verifyDepartmentPageLabelName(){
		return departmentLabel.isDisplayed();
	}
	
	public void clickOnNewDepartment(){
		departmentButton.click();
	}
	
	public boolean verifyCreateDepartmentLabelName(){
		return createDepartmentLabel.isDisplayed();
	}
	
	public void clickOnSelectAffiliate(){
		selectAffiliateDropdown.click();
	}
	
	public void enterDepartmentName(String deptname){
		departmentNameTextBox.sendKeys(deptname);
	}
	
	public void clickOnSaveButton(){
		saveButton.click();
	}

}
