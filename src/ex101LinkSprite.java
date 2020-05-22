import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex101LinkSprite {
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
// ********************************************************************LinkSprite*********************************************************************		

		// Driver Selects which "Brand" is needed
		driver.findElement(By.xpath(
				"//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/aside/section/ul/li[3]/div/div/div/ul/li[18]/label/span"))
				.click();
		Thread.sleep(2000);
		System.out.println("******************************************************************************LINKSPRITE");
		// Load more
		// driver.findElement(By.xpath("//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/div/section/div/button")).click();

		Thread.sleep(4000);

		// Find all elements with class named "_2BULo" and put them in a list.
		List<WebElement> LinkSprite = driver.findElements(By.className("_2BULo"));

		// System.out.println("LinkSprite all-products quantity " +
		// (LinkSprite.size()));

		// Thread.sleep(2500);

		// Find all elements with class named "_2BULo" and put them in a list.
		List<WebElement> LinkSpritePrice = driver.findElements(By.className("_23ArP"));

		// place expected and actual Names into value into strings.

		String actualLinkSprite1 = LinkSprite.get(0).getText();
		String actualLinkSprite2 = LinkSprite.get(1).getText();
		String actualLinkSprite3 = LinkSprite.get(2).getText();

		String actualLinkSpritePrice1 = LinkSpritePrice.get(0).getText();
		String actualLinkSpritePrice2 = LinkSpritePrice.get(1).getText();
		String actualLinkSpritePrice3 = LinkSpritePrice.get(2).getText();
		
//add expected result

		String expectedLinkSprite1 = "pcDuino8 Uno";
		String expectedLinkSprite2 = "LinkSprite Acadia V3";
		String expectedLinkSprite3 = "LinkSprite Arches";

		String expectedLinkSpritePrice1 = "$49.00";
		String expectedLinkSpritePrice2 = "$119.00";
		String expectedLinkSpritePrice3 = "$95.00";

		// Compares Expected to Actual Price 1.

		if (expectedLinkSpritePrice1.equals(actualLinkSpritePrice1)) {
			System.out.println("Item 1 Price");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualLinkSpritePrice1);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedLinkSpritePrice1);
		} else {
			System.out.println("FAIL");
			System.out.println("Item 1 Price");
			System.out.println("Actual result is: " + actualLinkSpritePrice1);
			System.out.println("Expected result is: " + expectedLinkSpritePrice1);
		}
		System.out.println("*********************************************");

		// Compares Expected to Actual Name 1.
		if (expectedLinkSprite1.equals(actualLinkSprite1)) {
			System.out.println("Item 1 Name ");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualLinkSprite1);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedLinkSprite1);
		} else {
			System.out.println("FAIL");
			System.out.println("Item 1 Name ");
			System.out.println("Actual result is: " + actualLinkSprite1);
			System.out.println("Expected result is: " + expectedLinkSprite1);
		}
		System.out.println("***************************************************");

	// ********2

		// Compares Expected to Actual Price 2.
		if (expectedLinkSpritePrice2.equals(actualLinkSpritePrice2)) {
			System.out.println("Item 2 Price");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualLinkSpritePrice2);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedLinkSpritePrice2);
		} else {
			System.out.println("FAIL");
			System.out.println("Item 2 Price");
			System.out.println("Actual result is: " + actualLinkSpritePrice2);
			System.out.println("Expected result is: " + expectedLinkSpritePrice2);
		}
		System.out.println("*********************************************");

		// Compares Expected to Actual Name 2.
		if (expectedLinkSprite2.equals(actualLinkSprite2)) {
			System.out.println("Item 2 Name");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualLinkSprite2);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedLinkSprite2);
		} else {
			System.out.println("FAIL");
			System.out.println("Item 2 Name");
			System.out.println("Actual result is: " + actualLinkSprite2);
			System.out.println("Expected result is: " + expectedLinkSprite2);
		}
		System.out.println("***************************************************");

		

		// ********3

				// Compares Expected to Actual Price 3.
				if (expectedLinkSpritePrice3.equals(actualLinkSpritePrice3)) {
					System.out.println("Item 3 Price");
					System.out.println("PASS");
					System.out.println("Actual result is: " + actualLinkSpritePrice3);
					// Print number of List Elements
					System.out.println("Expected result is: " + expectedLinkSpritePrice3);
				} else {
					System.out.println("FAIL");
					System.out.println("Item 3 Price");
					System.out.println("Actual result is: " + actualLinkSpritePrice3);
					System.out.println("Expected result is: " + expectedLinkSpritePrice3);
				}
				System.out.println("******************************");

				// Compares Expected to Actual Name 3.
				if (expectedLinkSprite3.equals(actualLinkSprite3)) {
					System.out.println("Item 3 Name");
					System.out.println("PASS");
					System.out.println("Actual result is: " + actualLinkSprite3);
					// Print number of List Elements
					System.out.println("Expected result is: " + expectedLinkSprite3);
				} else {
					System.out.println("FAIL");
					System.out.println("Item 3 Name");
					System.out.println("Actual result is: " + actualLinkSprite3);
					System.out.println("Expected result is: " + expectedLinkSprite3);
				}
				System.out.println("***************************************************");
// ********************************************************************LinkSprite*********************************************************************		

				// Driver Selects which "Brand" is needed
				driver.findElement(By.xpath(
						"//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/aside/section/ul/li[3]/div/div/div/ul/li[18]/label/span"))
						.click();
				Thread.sleep(2000);
		
		
		// Press Command+Shift+F to even-out text
		// Double click word to highlight
		// Command+F to replace all words

		driver.quit();
	}

}
