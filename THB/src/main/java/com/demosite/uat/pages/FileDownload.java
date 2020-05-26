package com.demosite.uat.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demosite.uat.base.TestBase;

public class FileDownload extends TestBase{
	
	@FindBy (xpath ="//textarea[@id='textbox']")
	WebElement textbox;
	
	@FindBy (xpath ="//a[@type='button']")
	WebElement download_button;
	
	public FileDownload() throws Exception {
		PageFactory.initElements(driver, this);
	}
	
	public void enterData(String data) {
		textbox.sendKeys(data);
	}
	
	public void downloadFile() {
		download_button.click();
	}
	
	
}
