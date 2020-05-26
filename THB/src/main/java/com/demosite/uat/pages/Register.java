package com.demosite.uat.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demosite.uat.base.TestBase;

public class Register extends TestBase {
	
		
	//----- Page Objects Initialization: ----------------------------------------------------------//
	public Register() throws Exception {
		PageFactory.initElements(driver, this);
	}
	
	//----- Object Repository: -------------------------------------------------------------------//
	@FindBy(xpath = "//a[@class='navbar-brand']/img']")
	WebElement logo;
	
	@FindBy(xpath = "//input[@placeholder='First Name']")
	WebElement firstName;
	
	@FindBy(xpath = "//input[@placeholder='Last Name']")
	WebElement lastName;
	
	@FindBy(xpath = "//textarea[@class='form-control ng-pristine ng-valid ng-touched']")
	WebElement address;
	
	@FindBy(xpath = "//input[@type='email']")
	WebElement emailAddress;
	
	@FindBy(xpath = "//input[@class='form-control ng-pristine ng-invalid ng-invalid-required ng-valid-pattern ng-touched']']")
	WebElement phone;
	
	@FindBy(xpath = "//input[@id='checkbox1']")
	WebElement hobbies_Cricket;
	
	@FindBy(xpath = "//input[@id='checkbox2']")
	WebElement hobbies_Movies;
	
	@FindBy(xpath = "//input[@id='checkbox3']")
	WebElement hobbies_Hockey;
	
	@FindBy(xpath = "//input[@id='firstpassword']")
	WebElement password;
	
	@FindBy(xpath = "//input[@id='secondpassword']")
	WebElement confirmPassword;
	
	@FindBy(id = "submitbtn")
	WebElement submitButton;
	
	@FindBy(id = "Button1")
	WebElement refresh;
	
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
	
	//----- Navigations WebElements: -------------------------------------------------------------------//
	@FindBy(xpath = "//a[contains(text(),'WebTable')]")
	WebElement webTable_navigation;
	
	@FindBy(xpath = "//a[contains(text(),'SwitchTo')]")
	WebElement switchTo_navigation;
	
	@FindBy(xpath = "//a[contains(text(),'Alerts')]")
	WebElement alerts_navigation;
	
	@FindBy(xpath = "//a[contains(text(),'Windows')]")
	WebElement windows_navigation;
	
	@FindBy(xpath = "//a[contains(text(),'Frames')]")
	WebElement frames_navigation;
	
	@FindBy(xpath = "//a[contains(text(),'Widgets')]")
	WebElement widgets_navigation;
	
	@FindBy(xpath = "//a[contains(text(),'Datepicker')]")
	WebElement datePicker_navigation;
	
	@FindBy(xpath = "//a[contains(text(),'Accordion')]")
	WebElement accordian_navigation;
	
	@FindBy(xpath = "//a[contains(text(),'Slider')]")
	WebElement slider_navigation;
	
	@FindBy(xpath = "//a[contains(text(),'More')]")
	WebElement more_navigation;
	
	@FindBy(xpath = "//a[contains(text(),'File Download')]")
	WebElement fileDownload_navigation;
	
	@FindBy(xpath = "//a[contains(text(),'File Upload')]")
	WebElement fileUpload_navigation;
	
	@FindBy(xpath = "//a[contains(text(),'Modals')]")
	WebElement modals_navigation;
	
	@FindBy(xpath = "//a[contains(text(),'Loader')]")
	WebElement loader_navigation;
	
	@FindBy(xpath = "//li[@class='dropdown open']//li[8]//a[1]")
	WebElement progressbar_navigation;
	
	//----- Register page methods: -------------------------------------------------------------------//
	// Get the title of the page
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	// Check the Logo of the page
	public boolean checkLogo() {
		return logo.isDisplayed();
	}
	
	// Navigate to WebTable page
	public WebTable navigateToWebTable() throws Exception {
		webTable_navigation.click();
		return new WebTable();
	}
	
	// Navigate to Alerts page
	public Alerts navigateToAlerts() throws Exception {
		Actions action = new Actions(driver);
		action.moveToElement(switchTo_navigation).build().perform();
		webTable_navigation.click();
		return new Alerts();
	}
	
	// Navigate to Windows page
	public Windows navigateToWindows() throws Exception {
		Actions action = new Actions(driver);
		action.moveToElement(switchTo_navigation).build().perform();
		webTable_navigation.click();
		return new Windows();
	}
	
	// Navigate to Frames page
	public Frames navigateToFrames() throws Exception {
		Actions action = new Actions(driver);
		action.moveToElement(switchTo_navigation).build().perform();
		webTable_navigation.click();
		return new Frames();
	}
	
	// Navigate to Accordian page
	public Accordian navigateToAccordian() {
		Actions action = new Actions(driver);
		action.moveToElement(widgets_navigation).build().perform();
		webTable_navigation.click();
		return new Accordian();
	}
	
	// Navigate to Slider page
	public Slider navigateToSlider() {
		Actions action = new Actions(driver);
		action.moveToElement(widgets_navigation).build().perform();
		slider_navigation.click();
		return new Slider();
	}
	
	// Navigate to Datepicker page
	public Datepicker navigateToDatepicker() throws Exception {
		Actions action = new Actions(driver);
		action.moveToElement(widgets_navigation).build().perform();
		datePicker_navigation.click();
		return new Datepicker();
	}
	
	// Navigate to FileUpload page
	public FileUpload navigateToFileUpload() throws Exception {
		Actions action = new Actions(driver);
		action.moveToElement(more_navigation).build().perform();
		fileUpload_navigation.click();
		return new FileUpload();
	}	
	
	// Navigate to FileDownload page
	public FileDownload navigateToFileDownload() throws Exception {
		Actions action = new Actions(driver);
		action.moveToElement(more_navigation).build().perform();
		fileDownload_navigation.click();
		return new FileDownload();
	}
	
	// Navigate to Loader page
	public Loader navigateToLoader() {
		Actions action = new Actions(driver);
		action.moveToElement(more_navigation).build().perform();
		loader_navigation.click();
		return new Loader();
	}
		
	// Navigate to Modal page
	public Modals navigateToModal() {
		Actions action = new Actions(driver);
		action.moveToElement(more_navigation).build().perform();
		modals_navigation.click();
		return new Modals();
	}
	
	// Navigate to Progressbar page
	public Progressbar navigateToProgressbar() throws Exception {
		Actions action = new Actions(driver);
		action.moveToElement(more_navigation).build().perform();
		progressbar_navigation.click();
		return new Progressbar();
	}
	
	
	
	
	
	
	
	
	
	
}
