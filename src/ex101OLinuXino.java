import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex101OLinuXino {
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
// ********************************************************************OLINOXINO*********************************************************************		

		// Driver Selects which "Brand" is needed
		driver.findElement(By.xpath(
				"//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/aside/section/ul/li[3]/div/div/div/ul/li[24]/label/span"))
				.click();
		Thread.sleep(2000);

		// Load more
		// driver.findElement(By.xpath("//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/div/section/div/button")).click();

		Thread.sleep(4000);

		// Find all elements with class named "_2BULo" and put them in a list.
		List<WebElement> OLinuXino = driver.findElements(By.className("_2BULo"));

		// System.out.println("OLinuXino all-products quantity " +
		// (OLinuXino.size()));

		// Thread.sleep(2500);

		// Find all elements with class named "_2BULo" and put them in a list.
		List<WebElement> OLinuXinoPrice = driver.findElements(By.className("_23ArP"));

		// place expected and actual Names into value into strings.

		String actualOLinuXinoName1 = OLinuXino.get(0).getText();
		String actualOLinuXinoName2 = OLinuXino.get(1).getText();
		String actualOLinuXinoName3 = OLinuXino.get(2).getText();
		String actualOLinuXinoName4 = OLinuXino.get(3).getText();

		String actualOLinuXinoPrice1 = OLinuXinoPrice.get(0).getText();
		String actualOLinuXinoPrice2 = OLinuXinoPrice.get(1).getText();
		String actualOLinuXinoPrice3 = OLinuXinoPrice.get(2).getText();
		String actualOLinuXinoPrice4 = OLinuXinoPrice.get(3).getText();

//add expected result
		String expectedOLinuXinoName1 = "A64-OLinuXino";
		String expectedOLinuxinoName2 = "A33-OlinuXino";
		String expectedOLinuxinoName3 = "A20-OlinuXino-Micro";
		String expectedOLinuxinoName4 = "A20-OlinuXino-Lime2";

		String expectedOLinuXinoPrice1 = "$47.00";
		String expectedOLinuXinoPrice2 = "$42.00";
		String expectedOLinuXinoPrice3 = "$65.00";
		String expectedOLinuXinoPrice4 = "$37.10";

		// Compares Expected to Actual Price 1.

		if (expectedOLinuXinoPrice1.equals(actualOLinuXinoPrice1)) {
			System.out.println("Item 1 Price");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualOLinuXinoPrice1);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedOLinuXinoPrice1);
		} else {
			System.out.println("FAIL");
			System.out.println("Item 1 Price");
			System.out.println("Actual result is: " + actualOLinuXinoPrice1);
			System.out.println("Expected result is: " + expectedOLinuXinoPrice1);
		}
		System.out.println("*********************************************");

		// Compares Expected to Actual Name 1.
		if (expectedOLinuXinoName1.equals(actualOLinuXinoName1)) {
			System.out.println("Item 1 Name ");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualOLinuXinoName1);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedOLinuXinoName1);
		} else {
			System.out.println("FAIL");
			System.out.println("Item 1 Name ");
			System.out.println("Actual result is: " + actualOLinuXinoName1);
			System.out.println("Expected result is: " + expectedOLinuXinoName1);
		}
		System.out.println("***************************************************");

		// ********2

		// Compares Expected to Actual Price 2.
		if (expectedOLinuXinoPrice2.equals(actualOLinuXinoPrice2)) {
			System.out.println("Item 2 Price");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualOLinuXinoPrice2);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedOLinuXinoPrice2);
		} else {
			System.out.println("FAIL");
			System.out.println("Item 2 Price");
			System.out.println("Actual result is: " + actualOLinuXinoPrice2);
			System.out.println("Expected result is: " + expectedOLinuXinoPrice2);
		}
		System.out.println("*********************************************");

		// Compares Expected to Actual Name 2.
		if (expectedOLinuxinoName2.equals(actualOLinuXinoName2)) {
			System.out.println("Item 2 Name");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualOLinuXinoName2);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedOLinuxinoName2);
		} else {
			System.out.println("FAIL");
			System.out.println("Item 2 Name");
			System.out.println("Actual result is: " + actualOLinuXinoName2);
			System.out.println("Expected result is: " + expectedOLinuxinoName2);
		}
		System.out.println("***************************************************");

		// ********3

		// Compares Expected to Actual Price 3.
		if (expectedOLinuXinoPrice3.equals(actualOLinuXinoPrice3)) {
			System.out.println("Item 3 Price");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualOLinuXinoPrice3);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedOLinuXinoPrice3);
		} else {
			System.out.println("FAIL");
			System.out.println("Item 3 Price");
			System.out.println("Actual result is: " + actualOLinuXinoPrice3);
			System.out.println("Expected result is: " + expectedOLinuXinoPrice3);
		}
		System.out.println("*********************************************");

		// Compares Expected to Actual Name 3.
		if (expectedOLinuxinoName3.equals(actualOLinuXinoName3)) {
			System.out.println("Item 3 Name");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualOLinuXinoName3);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedOLinuxinoName3);
		} else {
			System.out.println("FAIL");
			System.out.println("Item 3 Name");
			System.out.println("Actual result is: " + actualOLinuXinoName3);
			System.out.println("Expected result is: " + expectedOLinuxinoName3);
		}
		System.out.println("***************************************************");

		// ********4

		// Compares Expected to Actual Price 4.
		if (expectedOLinuXinoPrice4.equals(actualOLinuXinoPrice4)) {
			System.out.println("Item 4 Price");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualOLinuXinoPrice4);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedOLinuXinoPrice4);
		} else {
			System.out.println("FAIL");
			System.out.println("Item 4 Price");
			System.out.println("Actual result is: " + actualOLinuXinoPrice4);
			System.out.println("Expected result is: " + expectedOLinuXinoPrice4);
		}
		System.out.println("*********************************************");

		// Compares Expected to Actual Name 4.
		if (expectedOLinuxinoName4.equals(actualOLinuXinoName4)) {
			System.out.println("Item 4 Name");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualOLinuXinoName4);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedOLinuxinoName4);
		} else {
			System.out.println("FAIL");
			System.out.println("Item 4 Name");
			System.out.println("Actual result is: " + actualOLinuXinoName4);
			System.out.println("Expected result is: " + expectedOLinuxinoName4);
		}
		System.out.println("***************************************************");
		
// ********************************************************************OLINOXINO*********************************************************************			
		driver.findElement(By.xpath(
				"//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/aside/section/ul/li[3]/div/div/div/ul/li[24]/label/span"))
				.click();
		Thread.sleep(2000);	
		
		
		// Press Command+Shift+F to even-out text
		// Double click word to highlight
		// Command+F to replace all words

		driver.quit();
	}
}
