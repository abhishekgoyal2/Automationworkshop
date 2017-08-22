package seleniumTest;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import fileHandling.loadPropety;
import xmlHandling.xmlReader;
import fileHandling.xReader;
import loggoing.logMain;

public class seleniumTest1 extends logMain
{
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception 
  
  {
	  
	System.setProperty("webdriver.firefox.marionette","D:\\Automation_Software\\Selenium Jars\\geckodriver.exe");  
    driver = loadPropety.getBrowser("browser");
    baseUrl = loadPropety.getValue("url");
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);
  }

  @Test
  public void testFist() throws Exception 
  {
	
	  logger.info("Browser laucned");

    driver.get(baseUrl + "/en-in/");
    driver.findElement(By.id("q")).clear();
    logger.info("clear is done");
    driver.findElement(By.id("q")).sendKeys(xmlReader.getXMLTagValue("local", "SearchT"));
    driver.findElement(By.id("q")).click();
    logger.info("click is done");
    driver.findElement(xReader.reader("DC", "pp")).click();
    
    Thread.sleep(3000);
    logger.error("therad is error is done");
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }
 
}
