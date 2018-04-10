package seleniumPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver ;
		String exePath = "C:/Projects/chromedriver_win32 (1)/chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", exePath);
		driver =new ChromeDriver();
		
		driver.get("https://www.path2usa.com/travel-companions");
		driver.manage().window().maximize();
		
		//April 14
			
		driver.findElement(By.xpath("//*[@id='travel_date']")).click();
		
		driver.findElement(By.cssSelector("[class='datepicker-days'][class='datepicker-switch']")).getText().contains("April");
		
		while(driver.findElement(By.cssSelector("[class='datepicker-days'][class='datepicker-switch']")).getText().contains("April")) 
		{
			driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
		}
		
		List<WebElement> Calendarlist=driver.findElements(By.className("day"));
		
	int count =driver.findElements(By.className("day")).size();
	
	for (int i=0;i<count;i++)
	{
		String text =driver.findElements(By.className("day")).get(i).getText();
	
		if(text.equalsIgnoreCase("10"))
		{
			driver.findElements(By.className("day")).get(i).click();
			break;
		}
	}

	driver.quit();
}
}
