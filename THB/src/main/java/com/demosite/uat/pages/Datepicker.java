package com.demosite.uat.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demosite.uat.base.TestBase;

public class Datepicker extends TestBase {
	
	@FindBy (xpath="//input[@id='datepicker1']")
	WebElement datepicer;
	
	@FindBy (xpath="//div[@class='ui-datepicker-title']")
	WebElement month_year;
	
	@FindBy (xpath="//a[@class='ui-datepicker-next ui-corner-all ui-state-hover ui-datepicker-next-hover']")
	WebElement nextarrow;
	
	@FindBy (xpath="//a[@class='ui-datepicker-prev ui-corner-all']")
	WebElement backarrow;
	
	public Datepicker() throws Exception{
		PageFactory.initElements(driver, this);
	}
	
	public void selectDate(String date_value) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('datepicker1').value='"+date_value+"'");
	}

}
