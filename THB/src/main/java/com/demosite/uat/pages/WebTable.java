package com.demosite.uat.pages;

import org.openqa.selenium.support.PageFactory;

import com.demosite.uat.base.TestBase;

public class WebTable extends TestBase {

	public WebTable() throws Exception {
		PageFactory.initElements(driver, this);
	}

}
