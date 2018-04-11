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
//			int score=0, total;
			for (int i=0;i<count-2;i++)
			{
			 System.out.println(table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText());
				
	}
			System.out.println(driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText());

}
}
