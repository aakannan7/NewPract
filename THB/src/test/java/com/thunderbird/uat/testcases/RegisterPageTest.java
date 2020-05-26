package com.thunderbird.uat.testcases;

//import org.testng.Assert;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;

import com.demosite.uat.base.TestBase;
import com.demosite.uat.pages.Alerts;
import com.demosite.uat.pages.Register;

public class RegisterPageTest extends TestBase {
	Register register;
	Alerts alerts;
	public RegisterPageTest() throws Exception {
		super();
	}
	
	//@BeforeMethod
	public void setup() throws Exception {
		initialization();
		register = new Register();
	}
	
	//@Test
	public void registerpage_TitleTest() {
		String pgTitle = register.getPageTitle();
		//Assert.assertEquals(pgTitle, "Register"); 
	}
	
	//@Test
	public void registerpage_LogoTest() {
		boolean logo = register.checkLogo();
		//Assert.assertTrue(logo);
	}
	
	//@Test
	public void navigateToAlertTest() throws Exception {
		alerts = register.navigateToAlerts();
	}
	
	//@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
}
