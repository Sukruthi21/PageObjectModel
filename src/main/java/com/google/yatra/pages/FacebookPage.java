package com.google.yatra.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import com.google.facebook.FacebookHomepage;
import com.google.yatra.dao.FacebookloginPage;
import com.google.yatra.util.BasePage;
import com.google.yatra.util.WebElements;

public class FacebookPage extends WebElements {

	private WebDriver driver;
	private WebDriverWait driverWait;
	private BasePage basepage;
	
	 By yatrapage= By.xpath("(//*[contains(text(),'Yatra')])[1]");
	 By playstorePage=By.xpath("//*[@class='id-app-title']");

	 By username =By.id("email");
	 By loginbutton=By.id("u_0_w");
	 By password=By.id("pass");
	
	public FacebookPage(WebDriver driver, WebDriverWait driverwait,BasePage basePage) {
		super(driver, driverwait);
		this.driver=driver;
		this.driverWait = driverwait;
		this.basepage = basePage;
	}
	
	public String verifyHomePage()
	{
		Reporter.log("Title of the page Home is visible"+ getpageTitle());
	//	System.out.println("@@@"+waitforElement(yatrapage));
		return getpageTitle();
	}
	
	
	public FacebookHomepage login(FacebookloginPage facebookloginPage)
	{
		enterText(username, facebookloginPage.getsUsername());
		enterText(password, facebookloginPage.getSpassword());
		click(loginbutton);
		return basepage.FacebookHomepage(driver,driverWait,basepage);
	}

}
