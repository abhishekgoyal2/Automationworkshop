package seleniumPrograms.seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		String exePath = "C:/Projects/chromedriver_win32 (1)/chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", exePath);
			
		driver =new ChromeDriver();
			driver.get("https://ksrtc.in/oprs-web/");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys("Beng");
			driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
			
	}

}
