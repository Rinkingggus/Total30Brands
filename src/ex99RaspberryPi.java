import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex99RaspberryPi {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/Rinking/Documents/Selenium/chromedriver");
		driver = new ChromeDriver();

//Open needed web-application
		driver.get("https://kamenkaksk.wixsite.com/wwes-13-1");
		driver.manage().window().maximize();

		Thread.sleep(2000);

//Driver finds and clicks on AllProducts Tab.
		driver.findElement(By.xpath("//*[@id=\"comp-jcfv4kob1label\"]")).click();
		Thread.sleep(4000);

		// Driver clicks "Brand" button
		driver.findElement(By.xpath("//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/aside/section/ul/li[3]/button"))
				.click();
		Thread.sleep(2000);
//********************************************************************RASPBERRYPI******************************************************************************
		driver.findElement(By.xpath(
				"//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/aside/section/ul/li[3]/div/div/div/ul/li[30]/label/span"))
				.click();
		Thread.sleep(2000);

		// Find all elements with class named "_2BULo" and put them in a list.
		List<WebElement> AllRaspberryPi = driver.findElements(By.className("_2BULo"));

		// System.out.println("AllRaspberryPi all-products quantity " +
		// (AllRaspberryPi.size()));

		Thread.sleep(2500);

		// Find all elements with class named "_2BULo" and put them in a list.
		List<WebElement> AllRaspberryPiPrice = driver.findElements(By.className("_23ArP"));

		// place expected and actual Names into value into strings.

		String actualRaspberryPiName1 = AllRaspberryPi.get(0).getText();
		String actualRaspberryPiName2 = AllRaspberryPi.get(1).getText();
		String actualRaspberryPiName3 = AllRaspberryPi.get(2).getText();
		String actualRaspberryPiName4 = AllRaspberryPi.get(3).getText();

		String actualRaspberryPiPrice1 = AllRaspberryPiPrice.get(0).getText();
		String actualRaspberryPiPrice2 = AllRaspberryPiPrice.get(1).getText();
		String actualRaspberryPiPrice3 = AllRaspberryPiPrice.get(2).getText();
		String actualRaspberryPiPrice4 = AllRaspberryPiPrice.get(3).getText();

//add expected result
		String expectedRaspberryPiName1 = "Raspberry Pi 3 Model B+";
		String expectedRaspberryPiName2 = "Raspberry Pi 3 Model B";
		String expectedRaspberryPiName3 = "Raspberry Pi Zero W / Zero WH";
		String expectedRaspberryPiName4 = "Raspberry Pi Zero";

		String expectedRaspberryPiPrice1 = "$30.00";
		String expectedRaspberryPiPrice2 = "$30.00";
		String expectedRaspberryPiPrice3 = "$10.00";
		String expectedRaspberryPiPrice4 = "$5.00";

		// Compares Expected to Actual Name1.

		if (expectedRaspberryPiPrice1.equals(actualRaspberryPiPrice1)) {
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualRaspberryPiPrice1);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedRaspberryPiPrice1);
		} else {
			System.out.println("FAIL");
			System.out.println("Actual result is: " + actualRaspberryPiPrice1);
			System.out.println("Expected result is: " + expectedRaspberryPiPrice1);
		}
		System.out.println("***************************************************");

		// Compares Expected to Actual Price1.
		if (expectedRaspberryPiName1.equals(actualRaspberryPiName1)) {
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualRaspberryPiName1);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedRaspberryPiName1);
		} else {
			System.out.println("FAIL");
			System.out.println("Actual result is: " + actualRaspberryPiName1);
			System.out.println("Expected result is: " + expectedRaspberryPiName1);
		}
		System.out.println("***************************************************");

		// ********2

		// Compares Expected to Actual Price 2.
		if (expectedRaspberryPiPrice2.equals(actualRaspberryPiPrice2)) {
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualRaspberryPiPrice2);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedRaspberryPiPrice2);
		} else {
			System.out.println("FAIL");
			System.out.println("Actual result is: " + actualRaspberryPiPrice2);
			System.out.println("Expected result is: " + expectedRaspberryPiPrice2);
		}
		System.out.println("***************************************************");

		// Compares Expected to Actual Name 2.
		if (expectedRaspberryPiName2.equals(actualRaspberryPiName2)) {
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualRaspberryPiName2);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedRaspberryPiName2);
		} else {
			System.out.println("FAIL");
			System.out.println("Actual result is: " + actualRaspberryPiName2);
			System.out.println("Expected result is: " + expectedRaspberryPiName2);
		}
		System.out.println("***************************************************");

		// ********3

		// Compares Expected to Actual Price 3.
		if (expectedRaspberryPiPrice3.equals(actualRaspberryPiPrice3)) {
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualRaspberryPiPrice3);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedRaspberryPiPrice3);
		} else {
			System.out.println("FAIL");
			System.out.println("Actual result is: " + actualRaspberryPiPrice3);
			System.out.println("Expected result is: " + expectedRaspberryPiPrice3);
		}
		System.out.println("***************************************************");

		// Compares Expected to Actual Name 3.
		if (expectedRaspberryPiName3.equals(actualRaspberryPiName3)) {
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualRaspberryPiName3);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedRaspberryPiName3);
		} else {
			System.out.println("FAIL");
			System.out.println("Actual result is: " + actualRaspberryPiName3);
			System.out.println("Expected result is: " + expectedRaspberryPiName3);
		}
		System.out.println("***************************************************");

		// ********4

		// Compares Expected to Actual Price 4.
		if (expectedRaspberryPiPrice4.equals(actualRaspberryPiPrice4)) {
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualRaspberryPiPrice4);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedRaspberryPiPrice4);
		} else {
			System.out.println("FAIL");
			System.out.println("Actual result is: " + actualRaspberryPiPrice4);
			System.out.println("Expected result is: " + expectedRaspberryPiPrice4);
		}
		System.out.println("***************************************************");

		// Compares Expected to Actual Name 3.
		if (expectedRaspberryPiName4.equals(actualRaspberryPiName4)) {
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualRaspberryPiName4);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedRaspberryPiName4);
		} else {
			System.out.println("FAIL");
			System.out.println("Actual result is: " + actualRaspberryPiName4);
			System.out.println("Expected result is: " + expectedRaspberryPiName4);
		}
		System.out.println("***************************************************");
//********************************************************************RASPBERRYPI******************************************************************************
		// Press Command+Shift+F to even-out text
		// Double click word to highlight
		// Command+F to replace all words

		driver.quit();
	}
}
