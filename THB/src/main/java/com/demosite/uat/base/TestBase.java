package com.demosite.uat.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.demosite.uat.util.TestUtil;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	String a1, a2;
	Cell cell, cell2;
	Row row;
	
	public TestBase() throws Exception {
	try {	
		 prop = new Properties();
		FileInputStream ip = new FileInputStream("C:\\\\TestLeaf\\\\New Project\\\\THB\\\\src\\\\main\\\\resources\\\\config.properties");
		prop.load(ip);
		File file = new File("C:\\TestLeaf\\New Project\\THB\\src\\main\\resources\\Fileoperations.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
        XSSFSheet sheet = workbook.getSheet("Marks");
        row = sheet.getRow(0);
            
         
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	}
	
	public String getCellValue() {
		
		cell = row.getCell(0);
		cell2 = row.getCell(1);
		a1 = cell.getStringCellValue();
		a2 = cell2.getStringCellValue();
		System.out.println(a1 + " " + a2);
		return null;
	}
	
	public static void initialization() {
		String browsername = prop.getProperty("browser");
		
		if(browsername.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PageLoadTimeout, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.ImplicitlyWait,TimeUnit.SECONDS);
		
		driver.get("http://demo.automationtesting.in/Register.html");
	}
	
	public static void main(String[] args) throws Exception {
		TestBase tbase = new TestBase();
		tbase.getCellValue();
		tbase.initialization();
	}
}
