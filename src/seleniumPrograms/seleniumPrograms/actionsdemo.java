package seleniumPrograms.seleniumPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsdemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;

String exePath = "C:/Projects/chromedriver_win32 (1)/chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", exePath);
			
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.com/");
			driver.manage().window().maximize();
			
			Actions a =new Actions(driver);
			a.moveToElement(driver.findElement(By.cssSelector("span[class='nav-line-2']"))).contextClick().build().perform();
			Thread.sleep(1000);
			
			a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
			Thread.sleep(2000);
			
			driver.quit();
	}

}
