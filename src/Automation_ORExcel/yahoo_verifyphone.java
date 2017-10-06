package Automation_ORExcel;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import CoreJavaASO4.Loadproperty;

public class yahoo_verifyphone {

	@SuppressWarnings("unused")
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


	driver.quit();
	}

}
//
