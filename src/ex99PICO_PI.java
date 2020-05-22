import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex99PICO_PI {
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
		
		
// ********************************************************************PICOPI**********************************************************************		
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

		String actualPicoPiName1 = Pico.get(0).getText();
		String actualPicoPiName2 = Pico.get(1).getText();
		//String actualPicoPiName3 = Pico.get(2).getText();
		//String actualPicoPiName4 = Pico.get(3).getText();

		String actualPicoPiPrice1 = PicoPrice.get(0).getText();
		String actualPicoPiPrice2 = PicoPrice.get(1).getText();
		//String actualPicoPiPrice3 = PicoPrice.get(2).getText();
		//String actualPicoPiPrice4 = PicoPrice.get(3).getText();

//add expected result
		String expectedPicoPiName1 = "PICO-PI-IMX7";
		String expectedPicoPiName2 = "PICO-PI-IMX6UL";
		//String expectedPicoPiName3 = "Pico Zero W / Zero WH";
		//String expectedPicoPiName4 = "Pico Zero";

		String expectedPicoPiPrice1 = "$79.00";
		String expectedPicoPiPrice2 = "$69.00";
		//String expectedPicoPiPrice3 = "$10.00";
		//String expectedPicoPiPrice4 = "$5.00";

		// Compares Expected to Actual Name 1.

		if (expectedPicoPiPrice1.equals(actualPicoPiPrice1)) {
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualPicoPiPrice1);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedPicoPiPrice1);
		} else {
			System.out.println("FAIL");
			System.out.println("Actual result is: " + actualPicoPiPrice1);
			System.out.println("Expected result is: " + expectedPicoPiPrice1);
		}
		System.out.println("***************************************************");

		// Compares Expected to Actual Price1.
		if (expectedPicoPiName1.equals(actualPicoPiName1)) {
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualPicoPiName1);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedPicoPiName1);
		} else {
			System.out.println("FAIL");
			System.out.println("Actual result is: " + actualPicoPiName1);
			System.out.println("Expected result is: " + expectedPicoPiName1);
		}
		System.out.println("***************************************************");

		// ********2

		// Compares Expected to Actual Price 2.
		if (expectedPicoPiPrice2.equals(actualPicoPiPrice2)) {
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualPicoPiPrice2);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedPicoPiPrice2);
		} else {
			System.out.println("FAIL");
			System.out.println("Actual result is: " + actualPicoPiPrice2);
			System.out.println("Expected result is: " + expectedPicoPiPrice2);
		}
		System.out.println("***************************************************");

		// Compares Expected to Actual Name 2.
		if (expectedPicoPiName2.equals(actualPicoPiName2)) {
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualPicoPiName2);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedPicoPiName2);
		} else {
			System.out.println("FAIL");
			System.out.println("Actual result is: " + actualPicoPiName2);
			System.out.println("Expected result is: " + expectedPicoPiName2);
		}
		System.out.println("***************************************************");

		
		
// ********************************************************************PICOPI**********************************************************************			
		// ********3

	/*	// Compares Expected to Actual Price 3.
		if (expectedPicoPiPrice3.equals(actualPicoPiPrice3)) {
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualPicoPiPrice3);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedPicoPiPrice3);
		} else {
			System.out.println("FAIL");
			System.out.println("Actual result is: " + actualPicoPiPrice3);
			System.out.println("Expected result is: " + expectedPicoPiPrice3);
		}
		System.out.println("***************************************************");

		// Compares Expected to Actual Name 3.
		if (expectedPicoPiName3.equals(actualPicoPiName3)) {
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualPicoPiName3);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedPicoPiName3);
		} else {
			System.out.println("FAIL");
			System.out.println("Actual result is: " + actualPicoPiName3);
			System.out.println("Expected result is: " + expectedPicoPiName3);
		}
		System.out.println("***************************************************");

		// ********4

		// Compares Expected to Actual Price 4.
		if (expectedPicoPiPrice4.equals(actualPicoPiPrice4)) {
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualPicoPiPrice4);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedPicoPiPrice4);
		} else {
			System.out.println("FAIL");
			System.out.println("Actual result is: " + actualPicoPiPrice4);
			System.out.println("Expected result is: " + expectedPicoPiPrice4);
		}
		System.out.println("***************************************************");

		// Compares Expected to Actual Name 3.
		if (expectedPicoPiName4.equals(actualPicoPiName4)) {
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualPicoPiName4);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedPicoPiName4);
		} else {
			System.out.println("FAIL");
			System.out.println("Actual result is: " + actualPicoPiName4);
			System.out.println("Expected result is: " + expectedPicoPiName4);
		}
		System.out.println("***************************************************"); */

		// Press Command+Shift+F to even-out text
		// Double click word to highlight
		// Command+F to replace all words

		driver.quit();
	}
}
