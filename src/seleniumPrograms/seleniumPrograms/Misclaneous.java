package seleniumPrograms.seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Misclaneous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String exePath = "C:/Projects/chromedriver_win32 (1)/chromedriver.exe";
WebDriver driver;

		System.setProperty("webdriver.chrome.driver", exePath);
		driver =new ChromeDriver();
		driver =new ChromeDriver();
		driver.get("https://www.dailyfantasycricket.com/register");
		driver.manage().window().maximize();
	}

	public void switchtoFrame(WebDriver driver)
	{
		int framecount=driver.findElements(By.tagName("iframe ")).size();
		for (int i=0;i<framecount;i++)
		{
			driver.switchTo().frame(i);
			driver.findElement(By.xpath("//*[@id='recaptcha-anchor']/div[5]"));
		}
	}
}
