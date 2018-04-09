package seleniumPrograms.seleniumPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class synchonization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;

String exePath = "C:/Projects/chromedriver_win32 (1)/chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", exePath);
			
		driver =new ChromeDriver();
			driver.get("https://alaskatrips.poweredbygps.com/");
			driver.manage().window().maximize();

			
//			 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.get("https://alaskatrips.poweredbygps.com/g/pt/hotels?MDPCID=ALASKA-US.TPS.BRAND.hotels.HOTEL");
			driver.findElement(By.id("H-destination")).sendKeys("nyc");
			driver.findElement(By.id("H-destination")).sendKeys("05-04-20118");
			driver.findElement(By.id("H-fromDate")).sendKeys(Keys.ENTER);

			WebDriverWait d=new WebDriverWait(driver,20);
			d.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='resultsContainer']/section/article[1]")));
//			Thread.sleep(5000L);

			driver.findElement(By.xpath("//div[@id='resultsContainer']/section/article[1]")).click();
			
			driver.quit();
			   
	}

}
