package com.demosite.uat.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demosite.uat.base.TestBase;

public class Frames extends TestBase{

	//Object Repository -----------------------------------------------
		@FindBy(xpath = "//a[contains(text(),'Single Iframe')]")
		WebElement singleFrame_Link;
		
		@FindBy(xpath = "//div[@class='col-xs-6 col-xs-offset-5']//input")
		WebElement singleFrame_Input;
		
		@FindBy(xpath = "//a[contains(text(),'Iframe with in an Iframe')]")
		WebElement withinFrame_Link;
		
		@FindBy(xpath = "//div[@class='col-xs-6 col-xs-offset-5']//input")
		WebElement withinFrame_Input;
	
	//Page Object Initialization ---------------------------------------------
	public Frames() throws Exception {
		PageFactory.initElements(driver, this);
	}
	
	//----- Frames page methods: -------------------------------------------------------------------//
		public void open_SingleFrame() throws InterruptedException {
			singleFrame_Link.click();
			driver.switchTo().frame(0);
			Thread.sleep(2000);
			singleFrame_Input.sendKeys("Hello Good Morning!");;
		}
		
		public void open_WithinFrame() throws InterruptedException {
			withinFrame_Link.click();
			driver.switchTo().frame(1);
			driver.switchTo().frame(0);
			Thread.sleep(2000);
			withinFrame_Input.click();
		}
}
