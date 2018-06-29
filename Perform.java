package Keyword;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.sun.deploy.association.Action;

import javafx.scene.chart.PieChart.Data;

public class Perform extends Datainput{
	static WebDriver driver;

	public static void invokebrowser() {
		driver = new FirefoxDriver();
		System.setProperty("webdriver.gecko.driver", "D:\\Automata\\Windows\\geckodriver.exe");
	}
	
	public static void pub(int rownum,int cellnum){
		try {
			String data1=Datainput.getdata(rownum, cellnum);
			WebElement element=driver.findElement(By.xpath(data1));
			if(data1.length()!=0)
			{
			String data=Datainput.getdata(rownum, cellnum+1);
			element.sendKeys(data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void pub1(int rownum,int cellnum) throws IOException{
			String data1=Datainput.getdata(rownum, cellnum);
			driver.findElement(By.xpath(data1)).click();
		
	}
	public static void open() throws IOException {
		try {
			FileReader reader = new FileReader("D:\\Auto Work\\eclipse-workspace\\Iquadra\\src\\config\\configuration.properties");
			Properties props = new Properties();
			props.load(reader);
			 
			String projecturl = props.getProperty("URL");
			driver.get(projecturl);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	}
	
	public static void type(int rownum,int cellnum) throws IOException, InterruptedException {
		pub(rownum,cellnum);
	}
	
	public static void search(int rownum,int cellnum) throws InterruptedException {
		try {
			Thread.sleep(2000);
			pub1(rownum,cellnum);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
/*	public static void search() throws InterruptedException {
		driver.findElement(By.id("nav-search-submit-text")).click();
		Thread.sleep(2000);
	}*/
	
	public static void click(int rownum,int cellnum) throws InterruptedException {
		try {
			pub1(rownum,cellnum);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
/*	public static void clickphone() {
			 
		driver.findElement(By.xpath("//img[@alt=\"Nokia 6.1 (2018) (4GB + 64GB, Blue-Gold)\"]")).click();
		
	}*/

	public static void select(int rownum,int cellnum) throws InterruptedException {
		try {
			Thread.sleep(2000);
			 for(String handle : driver.getWindowHandles()) {
					driver.switchTo().window(handle);
				}
			pub1(rownum,cellnum);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
/*	public static void cart() throws InterruptedException {
		Thread.sleep(2000);
		 for(String handle : driver.getWindowHandles()) {
				driver.switchTo().window(handle);
			}
		
		driver.findElement(By.xpath("//input[@title='Add to Shopping Cart']")).click();
		
	}*/

	
	
	
}
