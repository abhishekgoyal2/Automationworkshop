package seleniumPrograms.seleniumPrograms;

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
			driver.quit();
	}

}
