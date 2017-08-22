package fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class loadPropety 
{
	
	static String filelocation="Recources//configuration.txt";
	public static WebDriver driver;
	
	public static void main( String[] args ) throws IOException
    {
		getValue("url");
		getBrowser("browser");
		
    }
	
	
	public static String getValue(String parm) throws IOException
	{
		
		String str = null;
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream(filelocation);
		p.load(fis);
		str=p.getProperty(parm);
		
		System.out.println(str);
	
		return str;
		
	}
	
	public static WebDriver getBrowser(String parm) throws IOException
	{
		String str = null;
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream(filelocation);
		p.load(fis);
		str=p.getProperty(parm);
		System.out.println(str);
		
		if(str.equals("firefox"))
		{
			System.setProperty("webdriver.firefox.marionette","D:\\Automation_Software\\Selenium Jars\\geckodriver.exe");  
		    driver = new FirefoxDriver();
		}
		else if (str.equals("chorme"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Automation_Software\\Selenium Jars\\chromedriver.exe");
			driver = new ChromeDriver();

		}
		
	return driver;
		
	}
	
}
