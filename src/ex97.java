import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex97 {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/Rinking/Documents/Selenium/chromedriver");
		driver = new ChromeDriver();

//Open needed web-application
		driver.get("https://kamenkaksk.wixsite.com/wwes-13-1");
		driver.manage().window().maximize();

		Thread.sleep(1500);

//Driver finds and clicks on BESTSELLERS Tab.
		driver.findElement(By.xpath("//*[@id=\"comp-jcfv4kob4label\"]")).click();
		Thread.sleep(1500);



		// Find all elements with class named "_2BULo" and put them in a list.
		List<WebElement> Bestsellers = driver.findElements(By.className("_2BULo"));

		// place Bestsellers value into int.
		int actualBestsellers = Bestsellers.size();

//add expected result
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

		driver.close();

	}
}
