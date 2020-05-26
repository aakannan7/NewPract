package com.demosite.uat.testref;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.demosite.uat.util.TestUtil;

public class Timesheet {
	static WebDriver driver;
	public static WebElement nextarrow;
	public static WebElement actMonth;
	public static void selectDate(String from_date, String to_date) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('ctl00_MainContent_deFromDate_I').value='"+from_date+"'");
		js.executeScript("document.getElementById('ctl00_MainContent_deToDate_I').value='"+to_date+"'");
	}
	
	public static void datepicker() {
		driver.findElement(By.id("ctl00_MainContent_deFromDate_B-1")).click();
		String expMonth ="May 2020";
		String expday ="11";
		//String actMonth = driver.findElement(By.id("ctl00_MainContent_deFromDate_DDD_C_T")).getText();
		
		boolean flag = false;
		
		for(int i=1; i<12; i++) 
		{
			nextarrow = driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']"));
			actMonth = driver.findElement(By.id("ctl00_MainContent_deFromDate_DDD_C_T"));
			System.out.println(actMonth.getText());
			String actMonth_value = actMonth.getText();
			if(actMonth_value.equals(expMonth)){
				List <WebElement> days = driver.findElements(By.xpath("//tr//td"));
				List<WebElement> weekdays = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_deFromDate_DDD_C_mt']/tbody/tr/td[@class='dxeCalendarDay_Office2010Black']"));
				List<WebElement> weekends = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_deFromDate_DDD_C_mt']/tbody/tr/td[@class='dxeCalendarDay_Office2010Black dxeCalendarWeekend_Office2010Black']"));
				weekdays.addAll(weekends);
				
				System.out.print(weekdays.size());
				for(WebElement alldays:weekdays)
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
		
		/////////////
		if(actMonth.equals(expMonth)) {
			
		} else {
			for(int i=0; i<=12; i++) {
				
				driver.findElement(By.id("ctl00_MainContent_deFromDate_DDD_C_NMC")).click();
				//selectedMonth = driver.findElement(By.id("ctl00_MainContent_deFromDate_DDD_C_T")).getText();
				//if(selectedMonth.equals(expMonth)) {
					List<WebElement> weekdays = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_deFromDate_DDD_C_mt']/tbody/tr/td[@class='dxeCalendarDay_Office2010Black']"));
					List<WebElement> weekends = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_deFromDate_DDD_C_mt']/tbody/tr/td[@class='dxeCalendarDay_Office2010Black dxeCalendarWeekend_Office2010Black']"));
					for (WebElement xtdate : weekdays) {
						String selectdate = xtdate.getText();
						if(xtdate.getText().equals("25")) {
							xtdate.click();
							break;
						}
					//}
				
				
				}
				
			}
		
		}
		
	}
	
	public static void switchWindow() throws Exception {
		driver.findElement(By.id("ctl00_MainContent_gvEmployee_DXCBtn1")).click();
		Thread.sleep(3000);
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> iter = windows.iterator();
		
		String parentwindow = iter.next();
		String childwindow = iter.next();
		//driver.switchTo().window(parentwindow);
		//System.out.println("THe page title is: " + driver.getTitle());
		driver.switchTo().window(childwindow);
		System.out.println("THe page title is: " + driver.getTitle());
	}
	
    public static void enterProjectDetails() {
    	driver.findElement(By.id("ctl00_MainContent_gvAttendanceSummary_DXEditor10_I")).click();
    	driver.findElement(By.id("ctl00_MainContent_gvAttendanceSummary_DXEditor10_I")).sendKeys("HNH Sphinx, Sphinx Project");
    	
    	driver.findElement(By.id("ctl00_MainContent_gvAttendanceSummary_DXEditor11_I")).click();
    	driver.findElement(By.id("ctl00_MainContent_gvAttendanceSummary_DXEditor11_I")).sendKeys("TQA, Testing & QA Activities");
	}
	public static void enterHours() {
		// Monday hours
		driver.findElement(By.id("ctl00_MainContent_gvAttendanceSummary_DXEditor28_I")).click();
		driver.findElement(By.id("ctl00_MainContent_gvAttendanceSummary_DXEditor28_I")).sendKeys("8");
		// Tuesday hours
		driver.findElement(By.id("ctl00_MainContent_gvAttendanceSummary_DXEditor31_I")).click();
		driver.findElement(By.id("ctl00_MainContent_gvAttendanceSummary_DXEditor31_I")).sendKeys("8");
		// Wednesday hours
		driver.findElement(By.id("ctl00_MainContent_gvAttendanceSummary_DXEditor34_I")).click();
		driver.findElement(By.id("ctl00_MainContent_gvAttendanceSummary_DXEditor34_I")).sendKeys("8");
		// Thursday hours
		driver.findElement(By.id("ctl00_MainContent_gvAttendanceSummary_DXEditor37_I")).click();
		driver.findElement(By.id("ctl00_MainContent_gvAttendanceSummary_DXEditor37_I")).sendKeys("8");
		// Friday hours
		driver.findElement(By.id("ctl00_MainContent_gvAttendanceSummary_DXEditor40_I")).click();
		driver.findElement(By.id("ctl00_MainContent_gvAttendanceSummary_DXEditor40_I")).sendKeys("8");
	}
	
	public static void enterComments() {
		driver. findElement(By.id("ctl00_MainContent_txtComments_I")).sendKeys("Sprint1 & Sprint2 activites are being worked and completed. Testing and Test case activities are completed. ");
	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver = new ChromeDriver();
			
		//Maximise browser, clear history, launch greythr.com--------------//
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PageLoadTimeout, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.ImplicitlyWait,TimeUnit.SECONDS);
		driver.get("http://timesheet.hexacorp.com/");
		
		//Enter the Username, Password and hit Sign in button--------------//
		driver.findElement(By.id("txtUserName_I")).sendKeys("HTS324");
		driver.findElement(By.id("txtPassword_I")).sendKeys("Onedrive@123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.xpath("//div[@id='sidebar']//li[3]//a[1]//span[1]")).click();
		//driver.findElement(By.id("ctl00_MainContent_deFromDate_B-1")).click();
		driver.findElement(By.id("ctl00_MainContent_deFromDate_B-1")).click();
		String expMonth ="May 2020";
		String expday ="11";
		//String actMonth = driver.findElement(By.id("ctl00_MainContent_deFromDate_DDD_C_T")).getText();
		
		boolean flag = false;
		
		for(int i=1; i<12; i++) 
		{
			nextarrow = driver.findElement(By.id("ctl00_MainContent_deFromDate_DDD_C_NMC"));
			actMonth = driver.findElement(By.id("ctl00_MainContent_deFromDate_DDD_C_TC"));
			System.out.println(actMonth.getText());
			String actMonth_value = actMonth.getText();
			if(actMonth_value.equals(expMonth)){
				//List <WebElement> days = driver.findElements(By.xpath("//tr//td"));
				List<WebElement> weekdays = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_deFromDate_DDD_C_mt']/tbody/tr/td[@class='dxeCalendarDay_Office2010Black']"));
				List<WebElement> weekends = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_deFromDate_DDD_C_mt']/tbody/tr/td[@class='dxeCalendarDay_Office2010Black dxeCalendarWeekend_Office2010Black']"));
				//weekdays.addAll(weekends);
				
				System.out.println(weekdays.size());
				for(WebElement alldays:weekdays)
				{
					System.out.println(alldays.getText());
					if(alldays.getText().equals(expday)) {
						alldays.click();
						System.out.println("6 is clicked");
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
		
		
		
		
		/*
		//div[@id='sidebar']//li[3]//a[1]//span[1]
		driver.findElement(By.xpath("//div[@id='sidebar']//li[3]//a[1]//span[1]")).click();
		selectDate("04/26/2020", "05/02/2020");
		
		driver.findElement(By.id("ctl00_MainContent_lnkApplyFilter")).click();
		switchWindow();
		
		//to click on NEW button
		driver.findElement(By.id("ctl00_MainContent_btnAttNew")).click();
		*/
		//Thread.sleep(3000);
		//enterProjectDetails();
		//enterHours();
		//enterComments();
		//Submit the request
		//driver.findElement(By.id("ctl00_MainContent_btnSubmitDown")).click();
		
	}

}
