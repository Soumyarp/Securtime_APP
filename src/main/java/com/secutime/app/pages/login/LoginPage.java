package com.secutime.app.pages.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.secutime.app.base.TestBase;
import com.secutime.app.homepage.HomePage;

public class LoginPage extends TestBase {
	
	@FindBy(xpath="//input[@type='email']")
	WebElement userNameTextBox;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement passWordTextBox;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement signInButton;
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
	public HomePage login(String username, String password){
		userNameTextBox.sendKeys(username);
		passWordTextBox.sendKeys(password);
		signInButton.click();
		 
		return new HomePage(); 
		
	}

}
