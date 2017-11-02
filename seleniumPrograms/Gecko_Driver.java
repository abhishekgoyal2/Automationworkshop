package seleniumPrograms;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Gecko_Driver {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:/software/geckodriver-v0.19.0-win64/geckodriver.exe");
		driver.get("http://www.toolsqa.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.quit();
	}
}