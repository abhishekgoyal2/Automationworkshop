package tutorial;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.os.WindowsUtils;

public class Miscellaneouscookie {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver;
		 String exePath = "C:/Projects/chromedriver_win32 (1)/chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", exePath);
			driver =new ChromeDriver();
//			driver.get("https://www.google.co.in/");
//			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			WindowsUtils.killByName("excel.exe");
		
//			driver.manage().deleteCookie(arg0);
//			driver.manage().deleteCookieNamed(arg0);
			
		

//			File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//			
//			FileUtils.copyFile(src, new File("D:/udemy prac//screenshot.png"));
//			
//					driver.quit();
	}

}
