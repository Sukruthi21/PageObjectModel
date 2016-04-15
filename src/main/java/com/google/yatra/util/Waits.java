package com.google.yatra.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Waits {
	 WebDriver driver;
	 WebDriverWait driverWait;
	 
	public Waits(WebDriver driver, WebDriverWait driverWait) {
		this.driver=driver;
		this.driverWait = driverWait;
	}
	
	public boolean waitforElement(By locator)
	{
		return driverWait.until(ExpectedConditions.presenceOfElementLocated(locator)).isDisplayed(); //expl
	}

}
