package com.demosite.uat.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demosite.uat.base.TestBase;

public class Alerts extends TestBase {
	
	//Object Repository -----------------------------------------------
	@FindBy(xpath = "//li[@class='active']//a[@class='analystic'][contains(text(),'Alert with OK')]")
	WebElement alertWithOk_Link;
	
	@FindBy(xpath = "//button[contains(text(),'click the button to display an  alert box:')]")
	WebElement alert_with_OK_Button;
	
	@FindBy(xpath = "//li[@class='active']//a[@class='analystic'][contains(text(),'Alert with OK & Cancel ')]")
	WebElement alertWithOk_Cancel_Link;
	
	@FindBy(xpath = "//button[contains(text(),'click the button to display a confirm box ')]")
	WebElement alertWithOk_Cancel_Button;
	
	@FindBy(xpath = "//p[text() = 'You pressed Ok']")
	WebElement alertWithOk_Cancel_paratext;
	
	@FindBy(xpath = "//a[contains(text(),'Alert with Textbox')]")
	WebElement alertWithOk_Textbox_Link;
	
	@FindBy(xpath = "//button[contains(text(),'click the button to demonstrate the prompt box ')]")
	WebElement alertWithOk_Textbox_Button;
	
	@FindBy(xpath = "//p[contains(text(),'How are you today')]")
	WebElement alertWithOk_Textbox_paratext;
	
	@FindBy(className = "link facebook")
	WebElement facebookLink;
	
	@FindBy(className = "fa fa-twitter-square")
	WebElement twitterLink;
	
	@FindBy(className = "fa fa-linkedin-square")
	WebElement linkedinLink;
	
	@FindBy(className = "fa fa-google-plus-square")
	WebElement googleplusLink;
	
	@FindBy(className = "fa fa-youtube-square")
	WebElement youtubeLink;
	
	//Page Object Initialization ---------------------------------------------
	public Alerts() throws Exception {
		PageFactory.initElements(driver, this);
	}
	
	//----- Register page methods: -------------------------------------------------------------------//
	// Get the title of the page
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public void clickOn(WebElement elem) {
		elem.click();
	}
	
	public void getAlert_with_OK() {
		alertWithOk_Link.click();
		alert_with_OK_Button.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	
	public void getAlert_with_OK_Cancel() {
		alertWithOk_Cancel_Link.click();
		alert_with_OK_Button.click();
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}
	
	public void getAlert_with_OK_Textbox() {
		alertWithOk_Textbox_Link.click();
		alertWithOk_Textbox_Button.click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Accepted");
		alert.accept();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
