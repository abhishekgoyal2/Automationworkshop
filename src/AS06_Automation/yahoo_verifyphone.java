package AS06_Automation;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import CoreJavaASO4.Loadproperty;

public class yahoo_verifyphone {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver =new FirefoxDriver();
		
			String Appurl =Loadproperty.getvalue("url");
		
		
driver.get(Appurl);
driver.manage().window().maximize();
driver.findElement(By.xpath(".//*[@id='uh-signin']")).click();
driver.findElement(By.xpath(".//*[@id='createacc']")).click();
	    

	}

}
