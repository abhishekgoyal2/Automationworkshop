package seleniumPrograms.seleniumPrograms;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Exerc {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		String exePath = "C:/Projects/geckodriver-v0.20.1-win64/geckodriver.exe";
		
	System.setProperty("webdriver.gecko.driver", exePath);
			

		driver =new FirefoxDriver();
		
			driver.get("https://www.ebay.com/");
			driver.manage().window().maximize();
			
			System.out.println("print number of link on this page");
			
			Thread.sleep(1000);
			System.out.println(driver.findElements(By.tagName("a")).size());
			Thread.sleep(3000);
			
			WebElement footer =driver.findElement(By.xpath("//*[@id='glbfooter']"));
			Thread.sleep(1500);
			System.out.println("print number of link on footer of page");

			System.out.println(footer.findElements(By.tagName("a")).size());
			Thread.sleep(2000);
			WebElement Columnsell= driver.findElement(By.xpath("//*[@id='gf-BIG']/table/tbody/tr/td[2]/ul"));
			System.out.println("print number of link in this segment");
			
			System.out.println(Columnsell.findElements(By.tagName("a")).size());
			String beforeclicking = null ;
			String afterclicking ;
			
			for (int i=0;i<Columnsell.findElements(By.tagName("a")).size();i++)
			{
//				System.out.println(Columnsell.findElements(By.tagName("a")).get(i).getText());
				beforeclicking =driver.getTitle();
				
				if(Columnsell.findElements(By.tagName("a")).get(i).getText().contains("Site map"))
						Thread.sleep(1000);
						{
					Columnsell.findElements(By.tagName("a")).get(i).click();
					
					Thread.sleep(1000);
				}	
				
				break;
			}
			
			afterclicking =driver.getTitle();
			
			if(beforeclicking!=(afterclicking));
			{
				System.out.println("String do not matches");
			}
//			Assert.assertEquals(message, expected, actual);
			
			driver.quit();
	}

}
