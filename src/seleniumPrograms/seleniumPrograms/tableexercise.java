package seleniumPrograms.seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tableexercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;

		
		String exePath = "C:/Projects/chromedriver_win32 (1)/chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", exePath);
			
		driver =new ChromeDriver();
			driver.get("http://www.cricbuzz.com/live-cricket-scorecard/20065/csk-vs-kkr-5th-match-indian-premier-league-2018");
			driver.manage().window().maximize();
			WebElement table =driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
			int rowcount =table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
			int count =table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		int sum=0;
			for (int i=0;i<count-2;i++)
			{
				String score=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
			 int scoreint=Integer.parseInt(score);
			 sum =sum+scoreint;
				System.out.println(table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText());
				System.out.println(sum);
				
	}
			String extras=driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
			System.out.println(driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText());
			
			int extraint=Integer.parseInt(extras);
			sum =sum+extraint;
			System.out.println(sum);
			String total=driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
			System.out.println(driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText());
			int totalint=Integer.parseInt(total);
			
			if(sum==totalint)
			{
				System.out.println("total match sum");
			}
		
}
}
