package com.demosite.uat.testref;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import com.demosite.uat.util.TestUtil;

public class Calendarsample {
		
	public static WebElement nextarrow;
	public static WebElement month_year;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String month = "September 2020";
		String expday = "21";
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PageLoadTimeout, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.ImplicitlyWait,TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Datepicker.html");
		
		WebElement datepicker = driver.findElement(By.xpath("//div[@class='col-xs-4']/input"));
		
		
		//boolean flag = datepicker.isDisplayed();
		//System.out.println(flag);
		datepicker.click();
		
		//System.out.println(month_year.getText());
		
		boolean flag = false;
		
		Thread.sleep(2000);
		for(int i=1; i<12; i++) 
		{
			nextarrow = driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']"));
			month_year = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));
			System.out.println(month_year.getText());
			String month_year_value = month_year.getText();
			if(month_year_value.equals(month)){
				List <WebElement> days = driver.findElements(By.xpath("//tr//td"));
				for(WebElement alldays:days)
				{
					//System.out.println(alldays.getText());
					if(alldays.getText().equals(expday)) {
						alldays.click();
						return;
					}
				}
				flag = true;
				break;
			}
			else
			{
				nextarrow.click();
			}
		}
		
		System.out.println("-----------");
		
		
		
		/*
		String datex = "09/08/2020";
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('datepicker1').value='"+datex+"'");
		*/
	}

}
