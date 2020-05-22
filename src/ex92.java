import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex92 {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/Rinking/Documents/Selenium/chromedriver");
		driver = new ChromeDriver();

		
//Open needed web-application
		driver.get("https://kamenkaksk.wixsite.com/wwes-13-1");
		driver.manage().window().maximize();

		
		
		Thread.sleep(1500);

//Driver finds and clicks on ALL PRODUCTS Tab.
		driver.findElement(By.xpath("//*[@id=\"comp-jcfv4kob1label\"]")).click();
		Thread.sleep(1500);
		
//Driver finds and clicks on "Brand" button to expand selection list.		
		driver.findElement(By.xpath("//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/aside/section/ul/li[3]/button")).click();
		Thread.sleep(1500);
		
//Driver finds and clicks on "Arduino" option.		
		driver.findElement(By.xpath("//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/aside/section/ul/li[3]/div/div/div/ul/li[2]/label")).click();
		Thread.sleep(1500);
		//driver.close();
		
		
	// Find all elements with class named "_2BULo" and put them in a list.
		List<WebElement> All_product = driver.findElements( By.className("_2BULo"));
		
		//Print number of List Elements 
		System.out.println("Arduino all-products "+ (All_product.size()));
		
		
		
		System.out.println("***************************");
		System.out.println("Arduino items names: ");
		System.out.println();
		//System prints out all elements of List data structure
		for (int i=0;i<All_product.size();i++) {
			System.out.println(All_product.get(i).getText());}
		
		
		
		
		driver.close();
		
	}
}
