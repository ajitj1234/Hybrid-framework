package HybridNew;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class MyMethods extends ExecutonEngine2 {
	
	public static void takesnapshot(WebDriver webdriver, String snapname) throws IOException {
		try {
			String fileWithPath="D:\\Auto input\\SecondHybridInput\\FailureScreenshot\\ajit.png";
			TakesScreenshot scrshot = (TakesScreenshot) webdriver; 
			File SrcFile=scrshot.getScreenshotAs(OutputType.FILE);
			File DestFile=new File(fileWithPath);
			FileUtils.copyFile(SrcFile, DestFile);
			System.out.println("shot taken");
		} catch (WebDriverException e) {
			System.out.println("search error"+e.getMessage());
			e.printStackTrace();
		}
	}

	public static void invokebrowser() throws IOException {
		ExecutonEngine2.invoke();
	}

	public static void open(String xpathname, String input) throws IOException {
		try {
			driver.navigate().to(input);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		} catch (Exception e) {
			takesnapshot(driver, input);
			System.out.println("error msg : "+ e.getMessage());
			//e.printStackTrace();
		}
	}
	
	public static void type(String xpathname, String input) throws IOException {
		try {
			//System.out.println("enter****");
			driver.findElement(By.xpath(xpathname)).sendKeys(input);
		} catch (Exception e) {
			takesnapshot(driver, input);
			System.out.println("error msg : "+ e.getMessage());
			//e.printStackTrace();
		}
	}

	public static void click(String xpathname, String input) throws IOException {
		try {
			//System.out.println("click male");
			driver.findElement(By.xpath(xpathname)).click();
		} catch (Exception e) {
			takesnapshot(driver, input);
			System.out.println("error msg : "+ e.getMessage());
			//e.printStackTrace();
		}
		
	}
	
/*	public static void type1(String xpathname, String input) {
		driver.findElement(By.xpath(xpathname)).sendKeys(input);
	} 
		
	public static void click1(String xpathname, String input) throws IOException {
		System.out.println("exp 3");
		driver.findElement(By.xpath(xpathname)).click();
	}
		
	public static void type2(String xpathname, String input) {
		System.out.println("enter");
		driver.findElement(By.xpath(xpathname)).sendKeys(input);
	}
	
	public static void click2(String xpathname, String input) throws IOException {
		System.out.println("prof auto");
		driver.findElement(By.xpath(xpathname)).click();
	}
	
	public static void select1(String xpathname, String input) throws IOException {

		driver.findElement(By.xpath(xpathname)).click();
	}*/
	
	public static void select(String xpathname, String input) throws IOException {
		//System.out.println("tool selenium");
		driver.findElement(By.xpath(xpathname)).click();
	}
	
	public static void waitfor() throws InterruptedException {
		Thread.sleep(1000);
	}
	public static void goback() {
		 driver.navigate().back();
		
	}
	
	public static void foward() {
		driver.navigate().forward();
	}
	
	public static void winHandle() {
		for(String handle : driver.getWindowHandles()) {
			driver.switchTo().window(handle);
			}
	}
	
	public static void waitforpagetoload() {
		driver.manage().timeouts().pageLoadTimeout(5000, TimeUnit.SECONDS);
	}
	
}
