import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class archPICO_PI2 {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/Rinking/Documents/Selenium/chromedriver");
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
//Open needed web-application
		driver.get("https://kamenkaksk.wixsite.com/wwes-13-1");
		driver.manage().window().maximize();

		//Thread.sleep(2000);

//Driver finds and clicks on AllProducts Tab.
		driver.findElement(By.xpath("//*[@id=\"comp-jcfv4kob1label\"]")).click();
		//Thread.sleep(4000);

		// Driver clicks "Brand" button
		driver.findElement(By.xpath("//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/aside/section/ul/li[3]/button"))
				.click();
		Thread.sleep(2500);
		
		// Driver Selects "Brand"
		driver.findElement(By.xpath(
				"//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/aside/section/ul/li[3]/div/div/div/ul/li[28]/label/span")).click();
		Thread.sleep(2000);

		//Load more
		//driver.findElement(By.xpath("//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/div/section/div/button")).click();
		
		Thread.sleep(4000);
		
		// Find all elements with class named "_2BULo" and put them in a list.
		List<WebElement> Pico = driver.findElements(By.className("_2BULo"));

		// System.out.println("Pico all-products quantity " +
		// (Pico.size()));

		//Thread.sleep(2500);

		// Find all elements with class named "_2BULo" and put them in a list.
		List<WebElement> PicoPrice = driver.findElements(By.className("_23ArP"));

		// place expected and actual Names into value into strings.

		String actualName1 = Pico.get(0).getText();
		String actualName2 = Pico.get(1).getText();
		//String actualName3 = Pico.get(2).getText();
		//String actualName4 = Pico.get(3).getText();

		String actualPrice1 = PicoPrice.get(0).getText();
		String actualPrice2 = PicoPrice.get(1).getText();
		//String actualPrice3 = PicoPrice.get(2).getText();
		//String actualPrice4 = PicoPrice.get(3).getText();

//add expected result
		String expectedName1 = "PICO-PI-IMX7";
		String expectedName2 = "PICO-PI-IMX6UL";
		//String expectedName3 = "Pico Zero W / Zero WH";
		//String expectedName4 = "Pico Zero";

		String expectedPrice1 = "$79.00";
		String expectedPrice2 = "$69.00";
		//String expectedPrice3 = "$10.00";
		//String expectedPrice4 = "$5.00";

		// Compares Expected to Actual Name 1.

		if (expectedPrice1.equals(actualPrice1)) {
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualPrice1);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedPrice1);
		} else {
			System.out.println("FAIL");
			System.out.println("Actual result is: " + actualPrice1);
			System.out.println("Expected result is: " + expectedPrice1);
		}
		System.out.println("***************************************************");

		// Compares Expected to Actual Price1.
		if (expectedName1.equals(actualName1)) {
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualName1);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedName1);
		} else {
			System.out.println("FAIL");
			System.out.println("Actual result is: " + actualName1);
			System.out.println("Expected result is: " + expectedName1);
		}
		System.out.println("***************************************************");

		// ********2

		// Compares Expected to Actual Price 2.
		if (expectedPrice2.equals(actualPrice2)) {
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualPrice2);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedPrice2);
		} else {
			System.out.println("FAIL");
			System.out.println("Actual result is: " + actualPrice2);
			System.out.println("Expected result is: " + expectedPrice2);
		}
		System.out.println("***************************************************");

		// Compares Expected to Actual Name 2.
		if (expectedName2.equals(actualName2)) {
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualName2);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedName2);
		} else {
			System.out.println("FAIL");
			System.out.println("Actual result is: " + actualName2);
			System.out.println("Expected result is: " + expectedName2);
		}
		System.out.println("***************************************************");

		// ********3

	/*	// Compares Expected to Actual Price 3.
		if (expectedPrice3.equals(actualPrice3)) {
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualPrice3);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedPrice3);
		} else {
			System.out.println("FAIL");
			System.out.println("Actual result is: " + actualPrice3);
			System.out.println("Expected result is: " + expectedPrice3);
		}
		System.out.println("***************************************************");

		// Compares Expected to Actual Name 3.
		if (expectedName3.equals(actualName3)) {
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualName3);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedName3);
		} else {
			System.out.println("FAIL");
			System.out.println("Actual result is: " + actualName3);
			System.out.println("Expected result is: " + expectedName3);
		}
		System.out.println("***************************************************");

		// ********4

		// Compares Expected to Actual Price 4.
		if (expectedPrice4.equals(actualPrice4)) {
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualPrice4);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedPrice4);
		} else {
			System.out.println("FAIL");
			System.out.println("Actual result is: " + actualPrice4);
			System.out.println("Expected result is: " + expectedPrice4);
		}
		System.out.println("***************************************************");

		// Compares Expected to Actual Name 3.
		if (expectedName4.equals(actualName4)) {
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualName4);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedName4);
		} else {
			System.out.println("FAIL");
			System.out.println("Actual result is: " + actualName4);
			System.out.println("Expected result is: " + expectedName4);
		}
		System.out.println("***************************************************"); */

		// Press Command+Shift+F to even-out text
		// Double click word to highlight
		// Command+F to replace all words

		driver.quit();
	}
}
