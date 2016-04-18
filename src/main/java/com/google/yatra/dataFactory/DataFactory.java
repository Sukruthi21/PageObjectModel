package com.google.yatra.dataFactory;

import org.apache.commons.lang3.RandomStringUtils;

import com.google.yatra.dao.YatraHomePage;

public class DataFactory {
	
	
	
	public void homePage(YatraHomePage homePage)
	{
		homePage.setSDestination("USA");
		homePage.setSorgin("India");
		homePage.setXpathExample("Sukruthi"+RandomStringUtils.randomAlphanumeric(3));
	}

}
