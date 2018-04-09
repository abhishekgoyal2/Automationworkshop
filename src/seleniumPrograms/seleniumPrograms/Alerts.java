package seleniumPrograms.seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		String exePath = "C:/Projects/chromedriver_win32 (1)/chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", exePath);
			
		driver =new ChromeDriver();
			driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//input[@value='Confirmation Alert']")).click();
			
		Thread.sleep(1000);
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(1000);
				driver.switchTo().alert().accept();
				Thread.sleep(1000);
				
//				driver.switchTo().alert().dismiss();
//				driver.switchTo().alert().sendKeys(arg0);
				
				driver.quit();

	}

	}


