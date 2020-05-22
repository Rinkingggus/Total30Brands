import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex98 {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/Rinking/Documents/Selenium/chromedriver");
		driver = new ChromeDriver();

//Open needed web-application
		driver.get("https://kamenkaksk.wixsite.com/wwes-13-1");
		driver.manage().window().maximize();

		Thread.sleep(1500);

//Driver finds and clicks on ALL PRODUCTS Tab.
		driver.findElement(By.xpath("//*[@id=\"comp-jcfv4kob3label\"]")).click();
		Thread.sleep(1500);

		// Driver clicks "Load More" until all pages are loaded.
		driver.findElement(By.xpath("//*[@id=\"comp-jcoi0elz\"]/div/div/div/div/section/div/button")).click();
		Thread.sleep(2000);
		// Driver clicks "Load More" until all pages are loaded.
		driver.findElement(By.xpath("//*[@id=\"comp-jcoi0elz\"]/div/div/div/div/section/div/button")).click();
		Thread.sleep(2000);
		// Driver clicks "Load More" until all pages are loaded.
		driver.findElement(By.xpath("//*[@id=\"comp-jcoi0elz\"]/div/div/div/div/section/div/button")).click();
		Thread.sleep(2000);
		// Driver clicks "Load More" until all pages are loaded.
		driver.findElement(By.xpath("//*[@id=\"comp-jcoi0elz\"]/div/div/div/div/section/div/button")).click();
		Thread.sleep(2000);

		// Find all elements with class named "_2BULo" and put them in a list.
		List<WebElement> NewProducts = driver.findElements(By.className("_2BULo"));

		// place NewProducts value into int.
		int actualNewProducts = NewProducts.size();

//add expected result
		int expectedNewProducts = 38;

		// Test case #
		System.out.println("Test Case 004 - compare ammount of elements on NEW PRODUCTS page");

		// Compares Expected to Actual results.
		if (expectedNewProducts == actualNewProducts) {
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualNewProducts);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedNewProducts);
		} else {
			System.out.println("FAIL");
			System.out.println("Actual result is: " + actualNewProducts);
			System.out.println("Expected result is: " + expectedNewProducts);
		}
		System.out.println("***************************************************");

		driver.close();

	}
}
