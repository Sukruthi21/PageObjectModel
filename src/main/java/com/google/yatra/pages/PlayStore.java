package com.google.yatra.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.yatra.util.BasePage;
import com.google.yatra.util.WebElements;

public class PlayStore extends WebElements{
	 WebDriver driver;
	 WebDriverWait driverWait;
	 BasePage basePage;
	 final static Logger logger = Logger.getLogger(PlayStore.class);

	 By searchId=By.id("gbqfq");
	 By searchButton=By.xpath(".//*[@class='gbqfi gb_Pb']");
	 //("gbqfb");

	 
	 
	public PlayStore(WebDriver driver, WebDriverWait driverWait,BasePage basePage) {
		super(driver, driverWait);
		this.driver=driver;
		this.driverWait = driverWait;
		this.basePage=basePage;
		
	}
	
	public void searchBox(String stext)
	{	
		enterText(searchId, stext);
	}

	
	public void searchButton(String stext)
	{
		click(searchButton);
	}
	

	
}
