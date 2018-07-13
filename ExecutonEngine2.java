package HybridNew;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ExecutonEngine2 {
	//declare method class object
	public static MyMethods mymethod;
	//declare string object
	public static String command;
	public static String object;
	public static String objectname;
	public static String xpathname;
	public static String input;
	//public static String sheet;
	//declare method list 
	public static Method[] m1; 
	static WebDriver driver;
	
	public static void invoke() throws IOException {
		if(Getdatainput.testplan(0, 2, 0).equals("Y") && (Getdatainput.testplan(0, 2, 1).equals("firefox"))) {
		driver = new FirefoxDriver();
		}
		else if(Getdatainput.testplan(0, 1, 0).equals("Y") && (Getdatainput.testplan(0, 1, 1).equals("chrome"))) {
		driver = new ChromeDriver();
		}
		else if(Getdatainput.testplan(0, 3, 0).equals("Y") && (Getdatainput.testplan(0, 3, 1).equals("iexplore"))) {
		driver = new InternetExplorerDriver();
		System.setProperty("webdriver.ie.driver", "D:\\Automata\\Windows\\IEDriverServer_64.exe");
		}
	}
	
	
	public static void main(String[] args) throws IOException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		String path="D:\\Auto input\\SecondHybridInput\\TestScript.xlsx";
		
		//create method class object
		mymethod = new MyMethods();
		//load all the method into array of methods
		Method[] m1=mymethod.getClass().getMethods();
		//run the loop for keyword and store it in string
		//int i=
		for(int i=4;i<20;i++) {
			command=Getdatainput.input(path, 2, i, 0);
			object=Getdatainput.input(path, 2, i, 1);
			//System.out.println("script sheet"+object);
			objectname=Getdatainput.objectrepo(2, i, 0);
			xpathname=Getdatainput.objectrepo(2, i, 1);
			input=Getdatainput.input(path, 2, i, 2);
			//System.out.println(input);
			//System.out.println(xpathname);
			//System.out.println(" object sheet " + objectname);
			if(object.equals(objectname)) {
				//System.out.println("inside condition");
			for(int j=0;j<m1.length;j++) {
				if(m1[j].getName().equals(command)){
					//System.out.println("equals");
					System.out.println(m1[j].getName());
					if (xpathname == "" && input == "") {
						m1[j].invoke(mymethod);
					
				    }
					else {
							m1[j].invoke(mymethod, xpathname, input);
				    }
				}
					
			}
				
			}
		}
	}
	
}
