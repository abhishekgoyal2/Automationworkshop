package CoreJavaASO4;

import java.util.concurrent.TimeUnit;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.interactions.Actions;

public class quikr {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		driver =new FirefoxDriver();
		driver.get("http://www.quikr.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='query']")).sendKeys("Car");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		List<WebElement> allOptions = driver.findElements(By.xpath(".//*[@class='autoSuggestResult']"));
		int count=0;
		for (int i = 0; i < allOptions.size(); i++) {
			String option = ((WebElement) allOptions.get(i)).getText();
			System.out.println(option);
			count =i;
			
		}
		allOptions.get(2).click();
		
		

//		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
//driver.findElement(By.xpath(".//*[@id='submitSearch']")).submit();
	driver.quit();
		

	}

}
