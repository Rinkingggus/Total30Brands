import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex99Pine {
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
		//Thread.sleep(2000);
		
		
// ********************************************************************PINE**********************************************************************				
		// Driver Selects "Brand" Pine

		driver.findElement(By.xpath(
				"//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/aside/section/ul/li[3]/div/div/div/ul/li[29]/label/span")).click();
		Thread.sleep(2000);

		
		// Find all elements with class named "_2BULo" and put them in a list.
		List<WebElement> Pine = driver.findElements(By.className("_2BULo"));

		// System.out.println("Pine all-products quantity " +
		// (Pine.size()));

		//Thread.sleep(2500);

		// Find all elements with class named "_2BULo" and put them in a list.
		List<WebElement> PinePrice = driver.findElements(By.className("_23ArP"));

		// place expected and actual Names into value into strings.

		String actualPineName1 = Pine.get(0).getText();
		String actualPineName2 = Pine.get(1).getText();
		//String actualPineName3 = Pine.get(2).getText();
		//String actualPineName4 = Pine.get(3).getText();

		String actualPinePrice1 = PinePrice.get(0).getText();
		String actualPinePrice2 = PinePrice.get(1).getText();
		//String actualPinePrice3 = PinePrice.get(2).getText();
		//String actualPinePrice4 = PinePrice.get(3).getText();

//add expected result
		String expectedPineName1 = "Pine H64";
		String expectedPineName2 = "Pine A64/A64/LTS";
		//String expectedPineName3 = "Pine Zero W / Zero WH";
		//String expectedPineName4 = "Pine Zero";

		String expectedPinePrice1 = "$26.00";
		String expectedPinePrice2 = "$15.00";
		//String expectedPinePrice3 = "$10.00";
		//String expectedPinePrice4 = "$5.00";

		// Compares Expected to Actual Name 1.

		if (expectedPinePrice1.equals(actualPinePrice1)) {
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualPinePrice1);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedPinePrice1);
		} else {
			System.out.println("FAIL");
			System.out.println("Actual result is: " + actualPinePrice1);
			System.out.println("Expected result is: " + expectedPinePrice1);
		}
		System.out.println("***************************************************");

		// Compares Expected to Actual Price1.
		if (expectedPineName1.equals(actualPineName1)) {
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualPineName1);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedPineName1);
		} else {
			System.out.println("FAIL");
			System.out.println("Actual result is: " + actualPineName1);
			System.out.println("Expected result is: " + expectedPineName1);
		}
		System.out.println("***************************************************");

		// ********2

		// Compares Expected to Actual Price 2.
		if (expectedPinePrice2.equals(actualPinePrice2)) {
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualPinePrice2);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedPinePrice2);
		} else {
			System.out.println("FAIL");
			System.out.println("Actual result is: " + actualPinePrice2);
			System.out.println("Expected result is: " + expectedPinePrice2);
		}
		System.out.println("***************************************************");

		// Compares Expected to Actual Name 2.
		if (expectedPineName2.equals(actualPineName2)) {
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualPineName2);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedPineName2);
		} else {
			System.out.println("FAIL");
			System.out.println("Actual result is: " + actualPineName2);
			System.out.println("Expected result is: " + expectedPineName2);
		}
		System.out.println("***************************************************");

		
// ********************************************************************PINE**********************************************************************	
		
		
		
		
		
		// ********3

	/*	// Compares Expected to Actual Price 3.
		if (expectedPinePrice3.equals(actualPinePrice3)) {
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualPinePrice3);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedPinePrice3);
		} else {
			System.out.println("FAIL");
			System.out.println("Actual result is: " + actualPinePrice3);
			System.out.println("Expected result is: " + expectedPinePrice3);
		}
		System.out.println("***************************************************");

		// Compares Expected to Actual Name 3.
		if (expectedPineName3.equals(actualPineName3)) {
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualPineName3);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedPineName3);
		} else {
			System.out.println("FAIL");
			System.out.println("Actual result is: " + actualPineName3);
			System.out.println("Expected result is: " + expectedPineName3);
		}
		System.out.println("***************************************************");

		// ********4

		// Compares Expected to Actual Price 4.
		if (expectedPinePrice4.equals(actualPinePrice4)) {
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualPinePrice4);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedPinePrice4);
		} else {
			System.out.println("FAIL");
			System.out.println("Actual result is: " + actualPinePrice4);
			System.out.println("Expected result is: " + expectedPinePrice4);
		}
		System.out.println("***************************************************");

		// Compares Expected to Actual Name 3.
		if (expectedPineName4.equals(actualPineName4)) {
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualPineName4);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedPineName4);
		} else {
			System.out.println("FAIL");
			System.out.println("Actual result is: " + actualPineName4);
			System.out.println("Expected result is: " + expectedPineName4);
		}
		System.out.println("***************************************************"); */

		// Press Command+Shift+F to even-out text
		// Double click word to highlight
		// Command+F to replace all words

		driver.quit();
	}
}
