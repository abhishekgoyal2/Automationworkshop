package seleniumPrograms;
	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Gecko_Driver {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
//	WebDriver driver = new MarionetteDriver();
//	System.setProperty("webdriver.gecko.driver", "C:/Projects/geckodriver-v0.16.0-win64/geckodriver.exe");
	
	String exePath = "C:/Projects/chromedriver_win32 (1)/chromedriver.exe";
	
	System.setProperty("webdriver.chrome.driver", exePath);
		
	driver =new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("hello");
		driver.findElement(By.name("pw")).sendKeys("1234");
	driver.findElement(By.xpath("//*[@id='Login']")).click();
//		driver.findElement(By.cssSelector("#forgot_password_link")).click();
	String printerror =driver.findElement(By.cssSelector("#error")).getText();

	System.out.println(printerror);

		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.quit();
	}
}

