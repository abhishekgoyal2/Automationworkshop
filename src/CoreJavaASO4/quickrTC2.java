package CoreJavaASO4;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class quickrTC2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver =new FirefoxDriver();
		
			String Appurl =Loadproperty.getvalue("url");
		
		
driver.get(Appurl);
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
		
		 WebElement Brandnamedrop =driver.findElement(By.xpath(".//*[@class='dropDowniconWrapper']"));
		 
		 Brandnamedrop.click();
		 
		 WebElement Brandname =driver.findElement(By.xpath("//input[@type='radio' and @value='Honda']"));
		 Thread.sleep(2000);	
		 
		 Brandname.click();
		 
		 Thread.sleep(4000);	
		 
//WebElement YearSelecteddrop =driver.findElement(By.xpath(".//*[@class='dropDowniconWrapper']"));
//		 
//YearSelecteddrop.click();
//		 
//		 WebElement YearRegistration =driver.findElement(By.xpath("//input[@type='radio' and @value='2013']"));
//		 Thread.sleep(2000);	
//		 
//		 YearRegistration.click();
//		 
//		 Thread.sleep(4000);	
		 
		//input[@type='radio' and @value='Honda']
		 
//		 BrandnameSearch.click();
		 

// driver.findElement(By.xpath(".//*[@class='Brand_name_single_list']")).click();
 
// Thread.sleep(4000);
		
//		if(ele.isDisplayed())
//		{
//			ele.click();
//			System.out.println("element is displayed");
//		}



//	driver.quit();

	}

}
