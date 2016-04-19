package com.facebook.sprint02;

import org.testng.annotations.Test;

import com.google.facebook.FacebookHomepage;
import com.google.facebook.Constants.Setup;
import com.google.yatra.dao.FacebookloginPage;
import com.google.yatra.dataFactory.DataFactory;
import com.google.yatra.pages.FacebookPage;
import com.google.yatra.pages.PlayStore;
import com.google.yatra.pages.YatraHomePage;
import com.google.yatra.util.BasePage;

import org.testng.annotations.BeforeMethod;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;

public class Facebook_AV702  implements Setup{
	final static Logger logger = Logger.getLogger(Facebook_AV702.class);
	
	private WebDriver driver;
	private WebDriverWait driverWait;
	long TIMEINSEC=20;
	private final String sURL="http://www.facebook.com";
	private FacebookPage facebookPage;
	private FacebookHomepage homepage2;
	private BasePage basePage;
	private com.google.yatra.dao.YatraHomePage homePage;
	private FacebookloginPage facebookloginPage;
	private DataFactory dataFactory;
	
	@BeforeClass
	public void beforeClass()
	{
		 homePage = new com.google.yatra.dao.YatraHomePage();
		 facebookloginPage = new FacebookloginPage();
		 dataFactory = new DataFactory();
		dataFactory.homePage(homePage);
		dataFactory.FacebookloginPage(facebookloginPage);
	}
	
	
	@BeforeMethod
	public void beforeMethod() {
		driver = new FirefoxDriver();
		driverWait = new WebDriverWait(driver, TIMEINSEC);
		basePage= new BasePage(driver, driverWait,new BasePage());
		facebookPage = new FacebookPage(driver,driverWait,basePage);
		driver.get(sURL);
		driver.manage().window().maximize();
		
	}
  @Test
  public void verify_yatrapageDisplayed_TC_01() {
	  homepage2= facebookPage.login(facebookloginPage);
	  Assert.assertEquals(true, homepage2.verifyuserPresent(facebookloginPage)>1);
  }


}
