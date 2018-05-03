package tutorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSLcerticate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	    WebDriver driver;
			
		DesiredCapabilities ch=DesiredCapabilities.chrome();
//		((Object) ch).acceptInsecureCerts();
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			
			ChromeOptions c= new ChromeOptions();
        ch.merge(ch);
        
    
        String exePath = "C:/Projects/chromedriver_win32 (1)/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		driver =new ChromeDriver(c);
		driver.get("https://cacert.org/");
	Thread.sleep(300);
	String pagetitle=driver.getTitle();
	if (pagetitle!=null)
	{
	
System.out.println("accepted ceriticate");
System.out.println(pagetitle);
	}
	
	driver.quit();
}
}
