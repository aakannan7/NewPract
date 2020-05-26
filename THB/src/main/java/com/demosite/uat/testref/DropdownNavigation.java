package com.demosite.uat.testref;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.demosite.uat.util.TestUtil;

public class DropdownNavigation {

	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PageLoadTimeout, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.ImplicitlyWait,TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Windows.html");
		
		driver.findElement(By.xpath("//a[contains(text(),'Open New Tabbed Windows')]")).click();
		driver.findElement(By.xpath("//div[@id='Tabbed']//button[@class='btn btn-info'][contains(text(),'click')]")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> iter = windows.iterator();
		
		String parentwindow = iter.next();
		String childwindow = iter.next();
		driver.switchTo().window(parentwindow);
		System.out.println("THe page title is: " + driver.getTitle());
		driver.switchTo().window(childwindow);
		//System.out.println("THe page title is: " + driver.getTitle());
		
		
		/* (switch to alerts accept & dismiss)
		 * WebElement switchTo = driver.findElement(By.xpath("//a[contains(text(),'SwitchTo')]"));
		WebElement alerts = driver.findElement(By.xpath("//a[contains(text(),'Alerts')]"));
		Actions action = new Actions(driver);
		action.moveToElement(switchTo).perform();
		alerts.click();
		
		WebElement slink = driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox')]"));
		WebElement slsbutton = driver.findElement(By.xpath("//button[contains(text(),'click the button to demonstrate the prompt box ')]"));
		slink.click();
		slsbutton.click();
		Alert alert = driver.switchTo().alert();
		
		alert.sendKeys("Prem");
		alert.accept();
		 * */
		
		
		
		
		/* (switch to another dropdown navigation)
		WebElement switchTo = driver.findElement(By.xpath("//a[contains(text(),'SwitchTo')]"));
		WebElement alerts = driver.findElement(By.xpath("//a[contains(text(),'Alerts')]"));
		Actions action = new Actions(driver);
		action.moveToElement(switchTo).perform();
		alerts.click();
		*/
	}

}
