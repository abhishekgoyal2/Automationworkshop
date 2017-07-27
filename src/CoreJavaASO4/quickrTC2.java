package CoreJavaASO4;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class quickrTC2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver =new FirefoxDriver();
		driver.get("http://noida.quikr.com/");
		driver.manage().window().maximize();
		
		 
		 driver.findElement(By.xpath("html/body/header/div[3]/div/div/div[4]/ul/li[2]/a")).click();
		 
		 Thread.sleep(4000);		 
		 driver.findElement(By.xpath("html/body/div[2]/div[8]/div[1]/div[2]/div[3]")).click();

		 Thread.sleep(4000);	
//		 JavascriptExecutor executor = (JavascriptExecutor)driver;
//		 
//	
//			executor.executeScript("document.getElementByxpath('html/body/div[2]/div[8]/div[5]/div[2]/div/ul/li[2]/a').setAttribute('visibility', 'true');");
		 
		 WebElement ele=driver.findElement(By.xpath("html/body/div[2]/div[8]/div[5]/div[2]/div/ul/li[2]/a[contains(text(),'Cars')]"));
		 ele.click();
		 
		 Thread.sleep(4000);	
		 Actions builder =new Actions(driver);
			
		 WebElement BrandnameSearch = driver.findElement(By.xpath("html/body/div[2]/form/div/div/table/tbody/tr/td[2]/div/div[4]/div[5]/div[1]/div[2]/div[1]/span"));
		
		
		 Action mousehoverSearch = builder.moveToElement(BrandnameSearch).build(); 
		 mousehoverSearch.perform();
		 
	
		 Actions mousehoverSearch1 = builder.moveToElement(BrandnameSearch).click(); 

		 mousehoverSearch1.perform();
		
		 
//		 BrandnameSearch.click();
		 
 Thread.sleep(4000);	
		
//		if(ele.isDisplayed())
//		{
//			ele.click();
//			System.out.println("element is displayed");
//		}



	driver.quit();

	}

}
