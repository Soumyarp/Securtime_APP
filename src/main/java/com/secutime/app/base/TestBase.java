package com.secutime.app.base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.securtime.app.util.TestUtil;

public class TestBase {
	protected static Properties prop;
	protected static WebDriver driver;
	
	public TestBase(){
		try {
			prop= new Properties();
		    FileInputStream fp = new FileInputStream(System.getProperty("user.dir")+"/src/main/java/com/secutime/app/config/config.properties");
		    prop.load(fp);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void iniatilization(){
		String browserName = prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("Chrome")){
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
				driver = new ChromeDriver();
		}
		
		else if (browserName.equalsIgnoreCase("Firefox")){
				System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/drivers/geckodriver.exe");
				driver = new FirefoxDriver();
	}
		
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		
	driver.get(prop.getProperty("url"));	

}
}