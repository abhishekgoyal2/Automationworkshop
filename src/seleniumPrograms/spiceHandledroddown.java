package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class spiceHandledroddown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		String exePath = "C:/Projects/chromedriver_win32 (1)/chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", exePath);
			
		driver =new ChromeDriver();
			driver.get("http://spicejet.com/");
			driver.manage().window().maximize();
			Select s =new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
			Thread.sleep(2500);
			s.selectByValue("2");
			Thread.sleep(2500);
			System.out.println("test pass");
			driver.quit();
			
	}

}
