package com.google.yatra.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.facebook.FacebookHomepage;
import com.google.yatra.pages.PlayStore;

public class BasePage {
	private PlayStore playStore;
	private WebDriver driver;
	private WebDriverWait driverWait;
	private BasePage basePage;
	private FacebookHomepage facebookhomepage;
	
	public BasePage() {
	}
	int i = 1;

	public BasePage(WebDriver driver, WebDriverWait driverWait,BasePage basePage) {
		this.driver = driver;
		this.driverWait = driverWait;
		this.basePage = basePage;
	}

	public PlayStore PlayStore(WebDriver driver, WebDriverWait driverWait,BasePage basePage) {
	
		if (playStore==null) {
			playStore= new PlayStore(driver, driverWait,basePage);
		} else {
			return playStore;
		}
		return playStore;
	}

	public FacebookHomepage FacebookHomepage(WebDriver driver2, WebDriverWait driverWait2, BasePage basepage2) {
		// TODO Auto-generated method stub
		if (facebookhomepage==null) {
			facebookhomepage= new FacebookHomepage(driver, driverWait,basePage);
		} else {
			return facebookhomepage;
		}
		return facebookhomepage;
	}
}
