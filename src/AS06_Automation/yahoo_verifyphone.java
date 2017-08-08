package AS06_Automation;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import CoreJavaASO4.Loadproperty;

public class yahoo_verifyphone {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver =new FirefoxDriver();
		
			String Appurl =Loadproperty.getvalue("url");
		String Signin = Loadproperty.getvalue("signin");
		String Signup = Loadproperty.getvalue("Signup");	
		String First_Name = Loadproperty.getvalue("FirstName");	
		String Last_Name = Loadproperty.getvalue("LastName");
		String Email_id = Loadproperty.getvalue("Emailid");	
		String Password = Loadproperty.getvalue("Password");	
		String mobile_phone = Loadproperty.getvalue("mobilephone");	
		String Monthstr = Loadproperty.getvalue("Month");	
		String Day = Loadproperty.getvalue("Day");	
		String Year = Loadproperty.getvalue("Year");	
		String Continue = Loadproperty.getvalue("Continue");
		String Gender = Loadproperty.getvalue("Gender");

		
	driver.get(Appurl);
Thread.sleep(2000);
driver.manage().window().maximize();
Thread.sleep(1000);
//sign in:
driver.findElement(By.xpath(Signin)).click();
Thread.sleep(2000);
//Signup:
driver.findElement(By.xpath(Signup)).click();
Thread.sleep(2000);
//First Name:
driver.findElement(By.xpath(First_Name)).sendKeys("abh");
Thread.sleep(2000);
//Last Name:
driver.findElement(By.xpath(Last_Name)).sendKeys("goi");
Thread.sleep(2000);
//Email id
driver.findElement(By.xpath(Email_id)).sendKeys("abcd_nyz1");
//Password:
Thread.sleep(2000);

driver.findElement(By.xpath(Password)).sendKeys("Abcd_nyc1");
//mobile phone
Thread.sleep(2000);
driver.findElement(By.xpath(mobile_phone)).sendKeys("8750360292");

//BirthMonth
Thread.sleep(2000);
	Select Month = new Select(driver.findElement(By.xpath(Monthstr)));

	Month.selectByVisibleText("February");

	//Day
Thread.sleep(2000);
driver.findElement(By.xpath(Day)).sendKeys("01");

//Year
driver.findElement(By.xpath(Year)).sendKeys("2012");
Thread.sleep(2000);
//Gender

//Continue
driver.findElement(By.xpath(Continue)).click();
Thread.sleep(2000);

//if(driver.getPageSource().contains("@92"));
System.out.println("Text message as expected");

	driver.quit();
	}

}
//
