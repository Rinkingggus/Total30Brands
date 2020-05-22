import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex101Odroid {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/Rinking/Documents/Selenium/chromedriver");
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

//Open needed web-application
		driver.get("https://kamenkaksk.wixsite.com/wwes-13-1");
		driver.manage().window().maximize();

		// Thread.sleep(2000);

//Driver finds and clicks on AllProducts Tab.
		driver.findElement(By.xpath("//*[@id=\"comp-jcfv4kob1label\"]")).click();
		// Thread.sleep(4000);

		// Driver clicks "Brand" button
		driver.findElement(By.xpath("//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/aside/section/ul/li[3]/button"))
				.click();
		Thread.sleep(2500);
// ********************************************************************ODROID*********************************************************************		

		// Driver Selects which "Brand" is needed
		driver.findElement(By.xpath(
				"//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/aside/section/ul/li[3]/div/div/div/ul/li[23]/label/span"))
				.click();
		Thread.sleep(2000);

		// Load more
		// driver.findElement(By.xpath("//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/div/section/div/button")).click();

		Thread.sleep(4000);

		// Find all elements with class named "_2BULo" and put them in a list.
		List<WebElement> Odroid = driver.findElements(By.className("_2BULo"));

		// System.out.println("Odroid all-products quantity " +
		// (Odroid.size()));

		// Thread.sleep(2500);

		// Find all elements with class named "_2BULo" and put them in a list.
		List<WebElement> OdroidPrice = driver.findElements(By.className("_23ArP"));

		// place expected and actual Names into value into strings.

		String actualOdroidName1 = Odroid.get(0).getText();
		String actualOdroidName2 = Odroid.get(1).getText();
		String actualOdroidName3 = Odroid.get(2).getText();
		String actualOdroidName4 = Odroid.get(3).getText();
		String actualOdroidName5 = Odroid.get(4).getText();

		String actualOdroidPrice1 = OdroidPrice.get(0).getText();
		String actualOdroidPrice2 = OdroidPrice.get(1).getText();
		String actualOdroidPrice3 = OdroidPrice.get(2).getText();
		String actualOdroidPrice4 = OdroidPrice.get(3).getText();
		String actualOdroidPrice5 = OdroidPrice.get(4).getText();

//add expected result
		String expectedOdroidName1 = "Odroid-XU4";
		String expectedOdroidName2 = "Odroid-N1";
		String expectedOdroidName3 = "Odroid-C2";
		String expectedOdroidName4 = "Odroid-C1+";
		String expectedOdroidName5 = "Odroid-C0";

		String expectedOdroidPrice1 = "$59.00";
		String expectedOdroidPrice2 = "$110.00";
		String expectedOdroidPrice3 = "$39.00";
		String expectedOdroidPrice4 = "$35.00";
		String expectedOdroidPrice5 = "$29.80";
		// Compares Expected to Actual Price 1.

		if (expectedOdroidPrice1.equals(actualOdroidPrice1)) {
			System.out.println("Item 1 Price");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualOdroidPrice1);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedOdroidPrice1);
		} else {
			System.out.println("FAIL");
			System.out.println("Item 1 Price");
			System.out.println("Actual result is: " + actualOdroidPrice1);
			System.out.println("Expected result is: " + expectedOdroidPrice1);
		}
		System.out.println("*********************************************");

		// Compares Expected to Actual Name 1.
		if (expectedOdroidName1.equals(actualOdroidName1)) {
			System.out.println("Item 1 Name ");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualOdroidName1);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedOdroidName1);
		} else {
			System.out.println("FAIL");
			System.out.println("Item 1 Name ");
			System.out.println("Actual result is: " + actualOdroidName1);
			System.out.println("Expected result is: " + expectedOdroidName1);
		}
		System.out.println("***************************************************");

		// ********2

		// Compares Expected to Actual Price 2.
		if (expectedOdroidPrice2.equals(actualOdroidPrice2)) {
			System.out.println("Item 2 Price");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualOdroidPrice2);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedOdroidPrice2);
		} else {
			System.out.println("FAIL");
			System.out.println("Item 2 Price");
			System.out.println("Actual result is: " + actualOdroidPrice2);
			System.out.println("Expected result is: " + expectedOdroidPrice2);
		}
		System.out.println("*********************************************");

		// Compares Expected to Actual Name 2.
		if (expectedOdroidName2.equals(actualOdroidName2)) {
			System.out.println("Item 2 Name");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualOdroidName2);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedOdroidName2);
		} else {
			System.out.println("FAIL");
			System.out.println("Item 2 Name");
			System.out.println("Actual result is: " + actualOdroidName2);
			System.out.println("Expected result is: " + expectedOdroidName2);
		}
		System.out.println("***************************************************");

		// ********3

		// Compares Expected to Actual Price 3.
		if (expectedOdroidPrice3.equals(actualOdroidPrice3)) {
			System.out.println("Item 3 Price");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualOdroidPrice3);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedOdroidPrice3);
		} else {
			System.out.println("FAIL");
			System.out.println("Item 3 Price");
			System.out.println("Actual result is: " + actualOdroidPrice3);
			System.out.println("Expected result is: " + expectedOdroidPrice3);
		}
		System.out.println("*********************************************");

		// Compares Expected to Actual Name 3.
		if (expectedOdroidName3.equals(actualOdroidName3)) {
			System.out.println("Item 3 Name");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualOdroidName3);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedOdroidName3);
		} else {
			System.out.println("FAIL");
			System.out.println("Item 3 Name");
			System.out.println("Actual result is: " + actualOdroidName3);
			System.out.println("Expected result is: " + expectedOdroidName3);
		}
		System.out.println("***************************************************");

		// ********4

		// Compares Expected to Actual Price 4.
		if (expectedOdroidPrice4.equals(actualOdroidPrice4)) {
			System.out.println("Item 4 Price");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualOdroidPrice4);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedOdroidPrice4);
		} else {
			System.out.println("FAIL");
			System.out.println("Item 4 Price");
			System.out.println("Actual result is: " + actualOdroidPrice4);
			System.out.println("Expected result is: " + expectedOdroidPrice4);
		}
		System.out.println("*********************************************");

		// Compares Expected to Actual Name 4.
		if (expectedOdroidName4.equals(actualOdroidName4)) {
			System.out.println("Item 4 Name");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualOdroidName4);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedOdroidName4);
		} else {
			System.out.println("FAIL");
			System.out.println("Item 4 Name");
			System.out.println("Actual result is: " + actualOdroidName4);
			System.out.println("Expected result is: " + expectedOdroidName4);
		}
		System.out.println("***************************************************");

		// ********5

		// Compares Expected to Actual Price 5.
		if (expectedOdroidPrice5.equals(actualOdroidPrice5)) {
			System.out.println("Item 5 Price");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualOdroidPrice5);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedOdroidPrice5);
		} else {
			System.out.println("FAIL");
			System.out.println("Item 5 Price");
			System.out.println("Actual result is: " + actualOdroidPrice5);
			System.out.println("Expected result is: " + expectedOdroidPrice5);
		}
		System.out.println("*********************************************");

		// Compares Expected to Actual Name 5.
		if (expectedOdroidName5.equals(actualOdroidName5)) {
			System.out.println("Item 5 Name");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualOdroidName5);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedOdroidName5);
		} else {
			System.out.println("FAIL");
			System.out.println("Item 5 Name");
			System.out.println("Actual result is: " + actualOdroidName5);
			System.out.println("Expected result is: " + expectedOdroidName5);
		}
		System.out.println("***************************************************");

		
		
// ********************************************************************ODROID*********************************************************************			
		// Driver Selects which "Brand" is needed
		driver.findElement(By.xpath(
				"//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/aside/section/ul/li[3]/div/div/div/ul/li[23]/label/span"))
				.click();
		Thread.sleep(2000);
		
		
		// Press Command+Shift+F to even-out text
		// Double click word to highlight
		// Command+F to replace all words

		driver.quit();
	}
}
