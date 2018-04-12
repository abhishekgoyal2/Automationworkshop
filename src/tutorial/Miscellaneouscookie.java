package tutorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Miscellaneouscookie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		 String exePath = "C:/Projects/chromedriver_win32 (1)/chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", exePath);
			driver =new ChromeDriver();
			driver.get("https://www.google.co.in/");
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
//			driver.manage().deleteCookie(arg0);
//			driver.manage().deleteCookieNamed(arg0);
			
			driver.quit();

	}

}
