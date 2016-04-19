package com.google.yatra.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class WebElements extends Waits{
	
		WebDriver driver;
		WebDriverWait driverWait;
	 
	public WebElements(WebDriver driver, WebDriverWait driverWait) {
		super(driver, driverWait);
		this.driver=driver;
		this.driverWait = driverWait;
	}
	
	
	public boolean isDisplayed(By by)
	{
		waitforElement(by);
		return driver.findElement(by).isDisplayed();
	}

	public String getpageTitle()
	{
		return driver.getTitle();
	}
	
	public void click(By locator)
	{
		waitforElement(locator);
		driver.findElement(locator).click();
	}
	
	public void enterText(By by,String stext)
	{
		waitforElement(by);
		driver.findElement(by).sendKeys(stext);
	}
	
	public int elements(By by)
	{
		return driver.findElements(by).size();
	}
	
}
