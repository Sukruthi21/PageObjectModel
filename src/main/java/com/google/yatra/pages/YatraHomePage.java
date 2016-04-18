package com.google.yatra.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import com.google.yatra.util.BasePage;
import com.google.yatra.util.WebElements;

public class YatraHomePage extends WebElements {

	private WebDriver driver;
	private WebDriverWait driverWait;
	private BasePage basepage;
	
	 By yatrapage= By.xpath("(//*[contains(text(),'Yatra')])[1]");
	 By playstorePage=By.xpath("//*[@class='id-app-title']");

	
	public YatraHomePage(WebDriver driver, WebDriverWait driverwait,BasePage basePage) {
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
	
	public PlayStore clickPlayStore(String name)
	{
		By playStore= By.xpath("//i[@title='"+name+"']/..");
		click(playStore);
		waitforElement(playstorePage);
		return basepage.PlayStore(driver,driverWait,basepage);
	}

}
