package com.google.yatra.sprint01;

import org.testng.annotations.Test;

import com.google.yatra.dataFactory.DataFactory;
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

public class Sprint01_AV702  implements Setup{
	final static Logger logger = Logger.getLogger(Sprint01_AV702.class);
	
	private WebDriver driver;
	private WebDriverWait driverWait;
	long TIMEINSEC=20;
	private final String sURL="http://www.yatra.com";
	private YatraHomePage yatrahomePage;
	private BasePage basePage;
	private com.google.yatra.dao.YatraHomePage homePage;
	private DataFactory dataFactory;
	
	@BeforeClass
	public void beforeClass()
	{
		 homePage = new com.google.yatra.dao.YatraHomePage();
		 dataFactory = new DataFactory();
		dataFactory.homePage(homePage);
	}
	
	
	@BeforeMethod
	public void beforeMethod() {
		driver = new FirefoxDriver();
		driverWait = new WebDriverWait(driver, TIMEINSEC);
		basePage= new BasePage(driver, driverWait,new BasePage());
		yatrahomePage = new YatraHomePage(driver,driverWait,basePage);
		driver.get(sURL);
		
	}
  @Test
  public void verify_yatrapageDisplayed_TC_01() {
	  Reporter.log("Launch browser "+sURL);
	  Reporter.log("Expected:::"+yatrahomePage.verifyHomePage());
	  Assert.assertEquals(true, yatrahomePage.verifyHomePage().contains("Yatra"));
	  Reporter.log("Actual:::"+yatrahomePage.verifyHomePage().contains("Yatra"));
	  PlayStore playStore=yatrahomePage.clickPlayStore(homePage.getXpathExample());
	  playStore.searchBox(homePage.getSorgin());;
//	  PlayStore playStore1=yatrahomePage.clickPlayStore();
	  logger.info("Error Message");
	  
  }


}
