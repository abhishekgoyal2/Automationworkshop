package AS06_Automation;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import CoreJavaASO4.Loadproperty;

public class yahoo_verifyphone {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver =new FirefoxDriver();
		
			String Appurl =Loadproperty.getvalue("url");
		
		
driver.get(Appurl);
driver.manage().window().maximize();
//sign in:
driver.findElement(By.xpath(".//*[@id='uh-signin']")).click();

//Signup:
driver.findElement(By.xpath(".//*[@id='createacc']")).click();
Thread.sleep(2000);
//First Name:
driver.findElement(By.xpath(".//*[@id='usernamereg-firstName']")).sendKeys("abh");
Thread.sleep(2000);
//Last Name:
driver.findElement(By.xpath(".//*[@id='usernamereg-lastName']")).sendKeys("goi");
Thread.sleep(2000);
//Email id
driver.findElement(By.xpath(".//*[@id='usernamereg-yid']")).sendKeys("abcd_nyz1");
//Password:
Thread.sleep(2000);

driver.findElement(By.xpath(".//*[@id='usernamereg-password']")).sendKeys("Abcd_nyc1");
//mobile phone
Thread.sleep(2000);
driver.findElement(By.xpath(".//*[@id='usernamereg-phone']")).sendKeys("8581234234");
//BirthMonth
Thread.sleep(2000);
	
driver.findElement(By.xpath(".//*[@id='usernamereg-month']")).click();
//Day
Thread.sleep(2000);
driver.findElement(By.xpath(".//*[@id='usernamereg-day']")).sendKeys("01");

//Year
driver.findElement(By.xpath(".//*[@id='usernamereg-year']")).sendKeys("2012");
Thread.sleep(2000);
//Gender

//Continue
driver.findElement(By.xpath(".//*[@id='reg-submit-button']")).click();
Thread.sleep(2000);
	}

}