import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex99Pepper {
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
// ********************************************************************PEPPER**********************************************************************
		
		// Driver Selects which "Brand" is needed
		driver.findElement(By.xpath(
				"//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/aside/section/ul/li[3]/div/div/div/ul/li[27]/label/span")).click();
		Thread.sleep(2000);

		//Load more
		//driver.findElement(By.xpath("//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/div/section/div/button")).click();
		
		Thread.sleep(4000);
		
		// Find all elements with class named "_2BULo" and put them in a list.
		List<WebElement> Pepper = driver.findElements(By.className("_2BULo"));

		// System.out.println("Pepper all-products quantity " +
		// (Pepper.size()));

		//Thread.sleep(2500);

		// Find all elements with class named "_2BULo" and put them in a list.
		List<WebElement> PepperPrice = driver.findElements(By.className("_23ArP"));

		// place expected and actual Names into value into strings.

		String actualPepperName1 = Pepper.get(0).getText();
		String actualPepperName2 = Pepper.get(1).getText();
		//String actualPepperName3 = Pepper.get(2).getText();
		//String actualPepperName4 = Pepper.get(3).getText();

		String actualPepperPrice1 = PepperPrice.get(0).getText();
		String actualPepperPrice2 = PepperPrice.get(1).getText();
		//String actualPepperPrice3 = PepperPrice.get(2).getText();
		//String actualPepperPrice4 = PepperPrice.get(3).getText();

//add expected result
		String expectedPepperName1 = "Pepper DVI-D";
		String expectedPepperName2 = "Pepper 43R / 43C";
		//String expectedPepperName3 = "Pepper Zero W / Zero WH";
		//String expectedPepperName4 = "Pepper Zero";

		String expectedPepperPrice1 = "$119.00";
		String expectedPepperPrice2 = "$169.00";
		//String expectedPepperPrice3 = "$10.00";
		//String expectedPepperPrice4 = "$5.00";

		// Compares Expected to Actual Name 1.

		if (expectedPepperPrice1.equals(actualPepperPrice1)) {
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualPepperPrice1);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedPepperPrice1);
		} else {
			System.out.println("FAIL");
			System.out.println("Actual result is: " + actualPepperPrice1);
			System.out.println("Expected result is: " + expectedPepperPrice1);
		}
		System.out.println("***************************************************");

		// Compares Expected to Actual Price1.
		if (expectedPepperName1.equals(actualPepperName1)) {
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualPepperName1);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedPepperName1);
		} else {
			System.out.println("FAIL");
			System.out.println("Actual result is: " + actualPepperName1);
			System.out.println("Expected result is: " + expectedPepperName1);
		}
		System.out.println("***************************************************");

		// ********2

		// Compares Expected to Actual Price 2.
		if (expectedPepperPrice2.equals(actualPepperPrice2)) {
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualPepperPrice2);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedPepperPrice2);
		} else {
			System.out.println("FAIL");
			System.out.println("Actual result is: " + actualPepperPrice2);
			System.out.println("Expected result is: " + expectedPepperPrice2);
		}
		System.out.println("***************************************************");

		// Compares Expected to Actual Name 2.
		if (expectedPepperName2.equals(actualPepperName2)) {
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualPepperName2);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedPepperName2);
		} else {
			System.out.println("FAIL");
			System.out.println("Actual result is: " + actualPepperName2);
			System.out.println("Expected result is: " + expectedPepperName2);
		}
		System.out.println("***************************************************");
// ********************************************************************PEPPER**********************************************************************
		
		
		// ********3

	/*	// Compares Expected to Actual Price 3.
		if (expectedPepperPrice3.equals(actualPepperPrice3)) {
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualPepperPrice3);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedPepperPrice3);
		} else {
			System.out.println("FAIL");
			System.out.println("Actual result is: " + actualPepperPrice3);
			System.out.println("Expected result is: " + expectedPepperPrice3);
		}
		System.out.println("***************************************************");

		// Compares Expected to Actual Name 3.
		if (expectedPepperName3.equals(actualPepperName3)) {
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualPepperName3);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedPepperName3);
		} else {
			System.out.println("FAIL");
			System.out.println("Actual result is: " + actualPepperName3);
			System.out.println("Expected result is: " + expectedPepperName3);
		}
		System.out.println("***************************************************");

		// ********4

		// Compares Expected to Actual Price 4.
		if (expectedPepperPrice4.equals(actualPepperPrice4)) {
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualPepperPrice4);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedPepperPrice4);
		} else {
			System.out.println("FAIL");
			System.out.println("Actual result is: " + actualPepperPrice4);
			System.out.println("Expected result is: " + expectedPepperPrice4);
		}
		System.out.println("***************************************************");

		// Compares Expected to Actual Name 3.
		if (expectedPepperName4.equals(actualPepperName4)) {
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualPepperName4);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedPepperName4);
		} else {
			System.out.println("FAIL");
			System.out.println("Actual result is: " + actualPepperName4);
			System.out.println("Expected result is: " + expectedPepperName4);
		}
		System.out.println("***************************************************"); */

		// Press Command+Shift+F to even-out text
		// Double click word to highlight
		// Command+F to replace all words

		driver.quit();
	}
}
