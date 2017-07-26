package CoreJavaASO4;

import java.util.concurrent.TimeUnit;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class quikr {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		driver =new FirefoxDriver();
		driver.get("http://www.quikr.com");
		driver.manage().window().maximize();
	driver.findElement(By.xpath(".//*[@id='query']")).sendKeys("Car");
		
		Actions builder =new Actions(driver);
		
		 WebElement submit_search = driver.findElement(By.xpath(".//*[@id='submitSearch']"));
		
		
		 Action mousehoverSearch = builder.moveToElement(submit_search).build(); 
		 mousehoverSearch.perform();
		 Actions mousehoverSearch1 = builder.moveToElement(submit_search).click(); 

 mousehoverSearch1.perform();
 

		 System.out.println("Search pass able to find submit element");
		 
driver.wait(2000);
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		List<WebElement> allOptions = driver.findElements(By.xpath(".//*[@class='autoSuggestResult']"));
//		int count=0;
//		for (int i = 0; i < allOptions.size(); i++) {
//			String option = ((WebElement) allOptions.get(i)).getText();
//			System.out.println(option);
//			count =i;
//			
//		}
//		allOptions.get(2).click();
		
		


	driver.quit();
		

	}

}