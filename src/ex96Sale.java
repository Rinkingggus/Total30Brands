import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex96Sale {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/Rinking/Documents/Selenium/chromedriver");
		driver = new ChromeDriver();

//Open needed web-application
		driver.get("https://kamenkaksk.wixsite.com/wwes-13-1");
		driver.manage().window().maximize();

		Thread.sleep(1500);

//Driver finds and clicks on Sale Tab.
		driver.findElement(By.xpath("//*[@id=\"comp-jcfv4kob1label\"]")).click();
		Thread.sleep(1500);

		// Driver clicks "Load More" until all pages are loaded.
		driver.findElement(By.xpath("//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/div/section/div/button")).click();
		Thread.sleep(2000);
		// Driver clicks "Load More" until all pages are loaded.
		driver.findElement(By.xpath("//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/div/section/div/button")).click();
		Thread.sleep(2000);
		// Driver clicks "Load More" until all pages are loaded.
		driver.findElement(By.xpath("//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/div/section/div/button")).click();
		Thread.sleep(2000);

		// Find all elements with class named "_2BULo" and put them in a list.
		List<WebElement> Sale = driver.findElements(By.className("_2BULo"));

		// place Sale value into int.
		int actualSale = Sale.size();

//add expected result
		int expectedSale = 107;

		// Test case #
		System.out.println("Test Case 002 - compare ammount of elements on Sale page");

		// Compares Expected to Actual results.
		if (expectedSale == actualSale) {
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualSale);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedSale);
		} else {
			System.out.println("FAIL");
			System.out.println("Actual result is: " + actualSale);
			System.out.println("Expected result is: " + expectedSale);
		}
		System.out.println("***************************************************");

		driver.close();

	}
}
