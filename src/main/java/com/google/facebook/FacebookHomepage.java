package com.google.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.yatra.dao.FacebookloginPage;
import com.google.yatra.util.BasePage;
import com.google.yatra.util.WebElements;

public class FacebookHomepage extends WebElements{
	
	private WebDriver driver;
	private WebDriverWait driverWait;
	private BasePage basepage;

	public FacebookHomepage(WebDriver driver, WebDriverWait driverWait, BasePage basePage) {

		super(driver, driverWait);
		this.driver=driver;
		this.driverWait = driverWait;
		this.basepage = basePage;
}
	
	public int verifyuserPresent(FacebookloginPage facebookloginPage)
	{
		By firstName=By.xpath("//*[contains(text(),'"+facebookloginPage.getsFirstName()+"')]");
		return elements(firstName);
	}
	
}