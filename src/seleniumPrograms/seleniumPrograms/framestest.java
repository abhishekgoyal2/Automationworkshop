package seleniumPrograms.seleniumPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class framestest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		String exePath = "C:/Projects/chromedriver_win32 (1)/chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", exePath);
			
		driver =new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
			driver.get("http://jqueryui.com/droppable/");
			driver.manage().window().maximize();
			
//			driver.switchTo().frame(1);
		int count =driver.findElements(By.tagName("iframe")).size();
		System.out.println(count);

		driver.switchTo().frame(0);
//			driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
			Actions A1= new Actions(driver);
			WebElement source =driver.findElement(By.id("draggable"));

			WebElement target =driver.findElement(By.id("droppable"));
			
			A1.dragAndDrop(source, target).build().perform();
			
			Thread.sleep(1500);
			driver.quit();
			
	}

}
