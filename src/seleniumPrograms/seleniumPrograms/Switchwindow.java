package seleniumPrograms.seleniumPrograms;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Switchwindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String exePath = "C:/Projects/geckodriver-v0.20.1-win64/geckodriver.exe";
		
		System.setProperty("webdriver.gecko.driver", exePath);
		FirefoxDriver driver =new FirefoxDriver();
		driver.get("https://accounts.google.com/SignUp?hl=en-GB");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/p/a")).click();
		
		Thread.sleep(1000);
		System.out.println(driver.getTitle());
	
		Set <String>windowid = driver.getWindowHandles();
		Iterator <String> id=windowid.iterator();
		String parentid = id.next();
		String childid = id.next();
		driver.switchTo().window(childid);
		System.out.println("switch to child window");
		
		System.out.println(driver.getTitle());
		System.out.println("switch to parent window");

		driver.switchTo().window(parentid);
		System.out.println(driver.getTitle());
		driver.quit();
	}

	
}
