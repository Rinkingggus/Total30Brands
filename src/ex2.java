import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex2 {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException{
	

System.setProperty("webdriver.chrome.driver", "/Users/Rinking/Documents/Selenium/chromedriver");
	driver=new ChromeDriver();
	
	
	Thread.sleep(1000);
	
	driver.get("https://kamenkaksk.wixsite.com/wwes-13-1");
	
	driver.getCurrentUrl() ;
	
	driver.getTitle();
	
	
	String expectedName1= "HOME";
	String expectedName2= "ALL PRODUCTS";
	
	String expectedUrl1= "https://kamenkaksk.wixsite.com/wwes-13-1";
	String expectedUrl2= "https://kamenkaksk.wixsite.com/wwes-13-1/all-products";
	
	driver.findElement(By.xpath("//*[@id=\"comp-jcfv4kob0label\"]")).click() ;
			
	String actualName1= driver.getCurrentUrl();
	String actualUrl1= driver.getTitle();
	
	//Test Case 001- verification 1st main menu tab
	
	
		System.out.println ("Test Case 001- verification 1st main menu tab");
		if (expectedName1.equals(actualName1)) {
			System.out.println ("PASS");
		System.out.println ("Actual result is: "+actualName1);
		System.out.println ("Expected result is: "+expectedName1);
		}
		else {
			System.out.println ("FAIL");
			System.out.println ("Actual result is: "+actualName1);
			System.out.println ("Expected result is: "+expectedName1);
	
	
	
	
			
		System.out.println (driver.getCurrentUrl());	
			
	driver.close();
	
	
	}
	}

