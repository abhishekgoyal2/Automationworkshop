package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobuttons {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		String exePath = "C:/Projects/chromedriver_win32 (1)/chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", exePath);
			
		driver =new ChromeDriver();
			driver.get("http://www.echoecho.com/htmlforms10.htm");
			driver.manage().window().maximize();
			
			int count =driver.findElements(By.xpath("//input[@name='group1']")).size();
			Thread.sleep(2500);
			
			System.out.println(count);
			System.out.println("test pass");

	}

}
