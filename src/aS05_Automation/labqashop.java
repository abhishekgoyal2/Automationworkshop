package aS05_Automation;
import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import CoreJavaASO4.Loadproperty;
public class labqashop {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver =new FirefoxDriver();
		
			String Appurl =Loadproperty.getvalue("url");
		
		
driver.get(Appurl);
driver.manage().window().maximize();
	    
	    System.out.println("Click on Quick Find and search mouse");
	    
	    driver.findElement(By.name("keywords")).sendKeys("mouse");	    
	    	   	   
	    
	    Thread.sleep(200);
	    
        System.out.println("Search mouse");
	    	    	    
	    driver.findElement(By.xpath(".//input[@alt='Quick Find']")).click();
	    
	    //WebElement element = driver.findElement(By.xpath("//div[contains(text(),'Cars & Bikes')]"));
	    
	    Thread.sleep(200);
	    
	    System.out.println("Click on Buy Now");
	    
	    driver.findElement(By.xpath("(//span[text()='Buy Now'])[1]")).click();

	    
	    Thread.sleep(200);
	    
	    //Add to Cart
	    	    
	   driver.findElement(By.xpath("(//span[text()='Add to Cart'])")).click();
	    
	    Thread.sleep(200);
	    
	    if(driver.getPageSource().contains("Product(s)"))
	        System.out.println("Text is present in the page");
	    else
	        System.err.println("Text is not present in the page");
	    	   	
	    driver.findElement(By.name("cart_quantity[]")).clear();
	    driver.findElement(By.name("cart_quantity[]")).sendKeys("2");
	    
	    Thread.sleep(200);
	    
	    //update the cart
	    
	    driver.findElement(By.xpath("//button[@type='submit']")).click();

	    
	    Thread.sleep(200);
	    
	    //remove 
	    
	    driver.findElement(By.xpath("//a[contains(text(),'remove')]")).click();

	    
	    //Verify message
	    
	    if(driver.getPageSource().contains(" Your Shopping Cart is empty!"))
	    	 System.out.println("Text is present in the page");
	    else
	        System.err.println("Text is not present in the page");
	    
	    Thread.sleep(100);
	    
	    driver.quit();
	}

}
