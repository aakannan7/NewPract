package com.demosite.uat.base;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.demosite.uat.util.TestUtil;

public class Testcase1 implements BeforeItems{
	WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Testcase1 tc1 = new Testcase1();
		tc1.browserlaunchItems();
	}

	public void excelinitiateItems() throws Exception {
		
		File file = new File("C:\\TestLeaf\\New Project\\THB\\src\\main\\resources\\Fileoperations.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
        XSSFSheet sheet = workbook.getSheet("Marks");
        Row row = sheet.getRow(0);
		
	}

	public void browserlaunchItems() {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PageLoadTimeout, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.ImplicitlyWait,TimeUnit.SECONDS);
		
		driver.get("url");
		
	}

}
