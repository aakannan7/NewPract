package com.demosite.uat.testref;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import com.demosite.uat.util.TestUtil;

public class Greytattendance {
    public static void attendance() {
    	//Launch Chrome browser--------------//
    			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
    			WebDriver driver = new ChromeDriver();
    				
    			//Maximise browser, clear history, launch greythr.com--------------//
    			driver.manage().window().maximize();
    			driver.manage().deleteAllCookies();
    			driver.manage().timeouts().pageLoadTimeout(TestUtil.PageLoadTimeout, TimeUnit.SECONDS);
    			driver.manage().timeouts().implicitlyWait(TestUtil.ImplicitlyWait,TimeUnit.SECONDS);
    			driver.get("https://hts.greythr.com/");
    			
    			//Enter the Username, Password and hit Sign in button--------------//
    			driver.findElement(By.id("username")).sendKeys("HTS324");
    			driver.findElement(By.id("password")).sendKeys("OnePLus@123");
    			driver.findElement(By.xpath("//button")).click();
    			
    			//Navigate to attendance page--------------//
    			driver.findElement(By.xpath("//div[@class='dashboard-tabs']//li[4]//a")).click();
    			
    			//SignIn & SignOut Attendance--------------//
    			WebElement signout = driver.findElement(By.xpath("//button[contains(text(),'Sign Out')]"));
    			WebElement signin = driver.findElement(By.xpath("//button[contains(text(),'Sign In')]"));
    			Boolean condition1 = signin.isDisplayed();
    			Boolean condition2 = signout.isDisplayed();
    			Boolean defaultcond = true;
    			
    			if(condition1.equals(defaultcond)){
    				signin.click();
    				System.out.println("You are logged in successfully.");
    			} else {
    				signout.click();
    				System.out.println("You are logged out successfully.");
    			}
    		//	driver.close();
    		
    }
	public static void main(String[] args) {
		attendance();
	}

}
