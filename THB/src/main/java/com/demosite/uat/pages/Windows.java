package com.demosite.uat.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demosite.uat.base.TestBase;

public class Windows extends TestBase{

	//Object Repository -----------------------------------------------
		@FindBy(xpath = "//a[contains(text(),'Open New Tabbed Windows')]")
		WebElement new_Tab_Window_Link;
		
		@FindBy(xpath = "//div[@id='Tabbed']//button[@class='btn btn-info'][contains(text(),'click')]")
		WebElement new_Tab_Window_Button;
		
		@FindBy(xpath = "//a[contains(text(),'Open New Seperate Windows')]")
		WebElement new_Separate_Window_Link;
		
		@FindBy(xpath = "//button[@class='btn btn-primary']")
		WebElement new_Separate_Window_Button;
		
		@FindBy(xpath = "//a[contains(text(),'Open Seperate Multiple Windows')]")
		WebElement new_Separate_Mulitple_Window_Link;
		
		@FindBy(xpath = "//div[@id='Multiple']//button[@class='btn btn-info'][contains(text(),'click')]")
		WebElement new_Separate_Mulitple_Window_button;
		
		//Page Object Initialization ---------------------------------------------
		public Windows() throws Exception {
			PageFactory.initElements(driver, this);
		}
		
		//----- Windows page methods: -------------------------------------------------------------------//
		public void open_NewTab_parentTab() {
			new_Tab_Window_Link.click();
			new_Tab_Window_Button.click();
			Set<String> windows = driver.getWindowHandles();
			Iterator<String> iter = windows.iterator();
			
			String parentwindow = iter.next();
			String childwindow = iter.next();
			driver.switchTo().window(parentwindow);
			System.out.println("THe page title is: " + driver.getTitle());
			driver.switchTo().window(childwindow);
		}
		
		public void open_NewTab_childTab() {
			new_Separate_Window_Link.click();
			new_Separate_Window_Button.click();
			Set<String> windows = driver.getWindowHandles();
			Iterator<String> iter = windows.iterator();
			
			String parentwindow = iter.next();
			String childwindow = iter.next();
			driver.switchTo().window(parentwindow);
			System.out.println("THe page title is: " + driver.getTitle());
			driver.switchTo().window(childwindow);
			System.out.println("THe page title is: " + driver.getTitle());
		}
		
		public void open_MultipleWindow() {
			new_Separate_Mulitple_Window_Link.click();
			new_Separate_Mulitple_Window_button.click();
		}
}
