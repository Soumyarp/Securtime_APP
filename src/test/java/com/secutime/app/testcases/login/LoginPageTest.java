package com.secutime.app.testcases.login;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.secutime.app.base.TestBase;
import com.secutime.app.homepage.HomePage;
import com.secutime.app.pages.login.LoginPage;

public class LoginPageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	
	public LoginPageTest(){
		super();
	}
	
	@BeforeClass
	public void setUp(){
		iniatilization();
		loginPage= new LoginPage();
	}
	
	@Test(priority=1)
	public void loginPageTitleTest(){
		String title=loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "Securtime - SecurAX Tech Solutions");
	}
	
	@Test(priority=2)
	public void loginTest(){
		homePage= loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	
//	@AfterClass
	public void tearDown(){
		driver.quit();
	}
	

}
