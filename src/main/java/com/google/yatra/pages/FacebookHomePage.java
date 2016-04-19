package com.google.yatra.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.facebook.FacebookHomepage;
import com.google.yatra.dao.FacebookloginPage;
import com.google.yatra.util.BasePage;
import com.google.yatra.util.WebElements;

public class FacebookHomePage extends WebElements{

	private WebDriver driver;
	private WebDriverWait driverWait;
	private BasePage basepage;
	
	public FacebookHomePage(WebDriver driver, WebDriverWait driverwait,BasePage basePage) {
		super(driver, driverwait);
		this.driver=driver;
		this.driverWait = driverwait;
		this.basepage = basePage;
	}
	
	
	

}
