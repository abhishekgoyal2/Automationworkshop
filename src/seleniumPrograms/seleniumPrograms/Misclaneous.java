package seleniumPrograms.seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Misclaneous {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
String exePath = "C:/Projects/chromedriver_win32 (1)/chromedriver.exe";
WebDriver driver;

		System.setProperty("webdriver.chrome.driver", exePath);
		driver =new ChromeDriver();
	
		driver.get("https://www.dailyfantasycricket.com/register");
		driver.manage().window().maximize();
//		Thread.sleep(1000);
//		driver.switchTo().alert().dismiss();;
		int num=findFramenumber(driver,By.xpath("//*[@id='recaptcha-anchor']/div[5]"));
		driver.switchTo().frame(num);
		driver.findElement(By.xpath("/*[@id='recaptcha-anchor']/div[5]")).click();
		driver.switchTo().defaultContent();

	
	}

	public static int findFramenumber(WebDriver driver,By by)
	{
		int i;
		int framecount=driver.findElements(By.tagName("iframe ")).size();
		for (i=0;i<framecount;i++)
		{
			driver.switchTo().frame(i);
			int count =driver.findElements(by).size();
			if(count>0)
			{
//				driver.findElement(By.xpath("/*[@id='recaptcha-anchor']/div[5]")).click();
				break ;
		}
			
			else
			{
				System.out.println("contiue script");
	}
			
			
			
}
	driver.switchTo().defaultContent();
		
		return i ;
}
}
