package com.inetbanking.testCases;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;

public class TestCase_001 extends BaseClass {
	
	@Test
	public void loginTest() {
		driver.get(baseURL);
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(userName);
		logger.info("Entered username");
				
		lp.setPassword(password);
		lp.clickLogin(baseURL);
		logger.info("Entered password");
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			Assert.assertTrue(true);
			logger.info("login test passed");
			System.out.println("passed");
		}
		else {
			Assert.assertTrue(false);
			logger.info("login test failed");
		}
	}	

}
