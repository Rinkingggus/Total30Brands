import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class exAllTabs {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/Rinking/Documents/Selenium/chromedriver");
		driver = new ChromeDriver();

//Open needed web-application
		driver.get("https://kamenkaksk.wixsite.com/wwes-13-1");
		driver.manage().window().maximize();

		Thread.sleep(2000);

		Thread.sleep(2000);

		// Driver finds and clicks on AllProducts Tab.
		driver.findElement(By.xpath("//*[@id=\"comp-jcfv4kob1label\"]")).click();
		Thread.sleep(2000);

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
		List<WebElement> AllProducts = driver.findElements(By.className("_2BULo"));

		// place AllProducts value into int.
		int actualAllProducts = AllProducts.size();

		// add expected result
		int expectedAllProducts = 107;

		// Test case #
		System.out.println("Test Case 002 - compare ammount of elements on AllProducts page");

		// Compares Expected to Actual results.
		if (expectedAllProducts == actualAllProducts) {
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualAllProducts);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedAllProducts);
		} else {
			System.out.println("FAIL");
			System.out.println("Actual result is: " + actualAllProducts);
			System.out.println("Expected result is: " + expectedAllProducts);
		}
		System.out.println("***************************************************");

		Thread.sleep(2500);

//Driver finds and clicks on SBC Tab.
		driver.findElement(By.xpath("//*[@id=\"comp-jcfv4kob2label\"]")).click();
		Thread.sleep(3000);

		// Driver clicks "Load More" until all pages are loaded.
		driver.findElement(By.xpath("//*[@id=\"comp-jcohrc9f\"]/div/div/div/div/section/div/button")).click();
		Thread.sleep(2000);
		// Driver clicks "Load More" until all pages are loaded.
		driver.findElement(By.xpath("//*[@id=\"comp-jcohrc9f\"]/div/div/div/div/section/div/button")).click();
		Thread.sleep(2000);
		// Driver clicks "Load More" until all pages are loaded.
		driver.findElement(By.xpath("//*[@id=\"comp-jcohrc9f\"]/div/div/div/div/section/div/button")).click();
		Thread.sleep(2000);

		// Find all elements with class named "_2BULo" and put them in a list.
		List<WebElement> SBC = driver.findElements(By.className("_2BULo"));

		// place SBC value into int.
		int actualSBC = SBC.size();

//add expected result
		int expectedSBC = 100;

		// Test case #
		System.out.println("Test Case 002 - compare ammount of elements on SBC page");

		// Compares Expected to Actual results.
		if (expectedSBC == actualSBC) {
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualSBC);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedSBC);
		} else {
			System.out.println("FAIL");
			System.out.println("Actual result is: " + actualSBC);
			System.out.println("Expected result is: " + expectedSBC);
		}
		System.out.println("***************************************************");
		
		Thread.sleep(2000);

		// Driver finds and clicks on BESTSELLERS Tab.
		driver.findElement(By.xpath("//*[@id=\"comp-jcfv4kob4label\"]")).click();
		Thread.sleep(2000);

		// Find all elements with class named "_2BULo" and put them in a list.
		List<WebElement> Bestsellers = driver.findElements(By.className("_2BULo"));

		// place Bestsellers value into int.
		int actualBestsellers = Bestsellers.size();

		// add expected result
		int expectedBestsellers = 7;

		// Test case #
		System.out.println("Test Case 005 - compare ammount of elements on BESTSELLERS page");

		// Compares Expected to Actual results.
		if (expectedBestsellers == actualBestsellers) {
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualBestsellers);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedBestsellers);
		} else {
			System.out.println("FAIL");
			System.out.println("Actual result is: " + actualBestsellers);
			System.out.println("Expected result is: " + expectedBestsellers);
		}
		System.out.println("***************************************************");
		
		Thread.sleep(2000);

		// Driver finds and clicks on ALL PRODUCTS Tab.
		driver.findElement(By.xpath("//*[@id=\"comp-jcfv4kob3label\"]")).click();
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
		// Driver clicks "Load More" until all pages are loaded.
		driver.findElement(By.xpath("//*[@id=\"comp-jcoi0elz\"]/div/div/div/div/section/div/button")).click();
		Thread.sleep(2000);

		// Find all elements with class named "_2BULo" and put them in a list.
		List<WebElement> NewProducts = driver.findElements(By.className("_2BULo"));

		// place NewProducts value into int.
		int actualNewProducts = NewProducts.size();

		// add expected result
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
