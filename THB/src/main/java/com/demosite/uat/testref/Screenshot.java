package com.demosite.uat.testref;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.demosite.uat.util.TestUtil;

public class Screenshot {

	public static void main(String[] args) throws IOException {
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
		String screenshotName = null;
		TakesScreenshot tsc = (TakesScreenshot)driver;
		File file = tsc.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("./Screenshots/abc.png"));
		
		
	}

}
