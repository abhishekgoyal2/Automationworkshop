package seleniumPrograms.seleniumPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		int i=0;
		String exePath = "C:/Projects/chromedriver_win32 (1)/chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", exePath);
			
		driver =new ChromeDriver();
			driver.get("https://ksrtc.in/oprs-web/");
			driver.manage().window().maximize();
//			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			
			driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys("Beng");
			
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
			
			JavascriptExecutor js =  (JavascriptExecutor)driver;
			
			String script ="return document.getElementById(\"fromPlaceName\").value" ;
			
			String text =(String) js.executeScript(script);
			
			while(!text.equalsIgnoreCase("BENGALURU INTERNATION AIPORT"))
			{
				
				i++;
				driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
				text =(String) js.executeScript(script);
				System.out.println(text);
				if(i>10)
				{
				break;
				}

				}

				if(i>10)
				{
				System.out.println("Element not found");
				}
				else
				{
				System.out.println("Element  found");
				}
			
				driver.quit();	
	}
			
						
}


