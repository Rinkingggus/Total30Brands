import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex99Parallella4 {
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
// ********************************************************************PARALLELLA**********************************************************************		
		
		// Driver Selects which "Brand" is needed
		driver.findElement(By.xpath(
				"//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/aside/section/ul/li[3]/div/div/div/ul/li[26]/label/span")).click();
		Thread.sleep(2000);

		//Load more
		//driver.findElement(By.xpath("//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/div/section/div/button")).click();
		
		Thread.sleep(4000);
		
		// Find all elements with class named "_2BULo" and put them in a list.
		List<WebElement> Parallella = driver.findElements(By.className("_2BULo"));

		// System.out.println("Parallella all-products quantity " +
		// (Parallella.size()));

		//Thread.sleep(2500);

		// Find all elements with class named "_2BULo" and put them in a list.
		List<WebElement> ParallellaPrice = driver.findElements(By.className("_23ArP"));

		// place expected and actual Names into value into strings.

		String actualParallellaName1 = Parallella.get(0).getText();
		//String actualParallellaName2 = Parallella.get(1).getText();
		//String actualParallellaName3 = Parallella.get(2).getText();
		//String actualParallellaName4 = Parallella.get(3).getText();

		String actualParallellaPrice1 = ParallellaPrice.get(0).getText();
		//String actualParallellaPrice2 = ParallellaPrice.get(1).getText();
		//String actualParallellaPrice3 = ParallellaPrice.get(2).getText();
		//String actualParallellaPrice4 = ParallellaPrice.get(3).getText();

//add expected result
		String expectedParallellaName1 = "Parallella";
		//String expectedParallellaName2 = "Parallella 43R / 43C";
		//String expectedParallellaName3 = "Parallella Zero W / Zero WH";
		//String expectedParallellaName4 = "Parallella Zero";

		String expectedParallellaPrice1 = "$128.00";
		//String expectedParallellaPrice2 = "$169.00";
		//String expectedParallellaPrice3 = "$10.00";
		//String expectedParallellaPrice4 = "$5.00";

		// Compares Expected to Actual Name 1.

		if (expectedParallellaPrice1.equals(actualParallellaPrice1)) {
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualParallellaPrice1);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedParallellaPrice1);
		} else {
			System.out.println("FAIL");
			System.out.println("Actual result is: " + actualParallellaPrice1);
			System.out.println("Expected result is: " + expectedParallellaPrice1);
		}
		System.out.println("***************************************************");

		// Compares Expected to Actual Price1.
		if (expectedParallellaName1.equals(actualParallellaName1)) {
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualParallellaName1);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedParallellaName1);
		} else {
			System.out.println("FAIL");
			System.out.println("Actual result is: " + actualParallellaName1);
			System.out.println("Expected result is: " + expectedParallellaName1);
		}
		System.out.println("***************************************************");

// ********************************************************************PARALLELLA**********************************************************************				
		
		
		
		
		
		// ********2

		/* // Compares Expected to Actual Price 2.
		if (expectedParallellaPrice2.equals(actualParallellaPrice2)) {
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualParallellaPrice2);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedParallellaPrice2);
		} else {
			System.out.println("FAIL");
			System.out.println("Actual result is: " + actualParallellaPrice2);
			System.out.println("Expected result is: " + expectedParallellaPrice2);
		}
		System.out.println("***************************************************");

		// Compares Expected to Actual Name 2.
		if (expectedParallellaName2.equals(actualParallellaName2)) {
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualParallellaName2);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedParallellaName2);
		} else {
			System.out.println("FAIL");
			System.out.println("Actual result is: " + actualParallellaName2);
			System.out.println("Expected result is: " + expectedParallellaName2);
		}
		System.out.println("***************************************************"); */

		// ********3

	/*	// Compares Expected to Actual Price 3.
		if (expectedParallellaPrice3.equals(actualParallellaPrice3)) {
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualParallellaPrice3);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedParallellaPrice3);
		} else {
			System.out.println("FAIL");
			System.out.println("Actual result is: " + actualParallellaPrice3);
			System.out.println("Expected result is: " + expectedParallellaPrice3);
		}
		System.out.println("***************************************************");

		// Compares Expected to Actual Name 3.
		if (expectedParallellaName3.equals(actualParallellaName3)) {
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualParallellaName3);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedParallellaName3);
		} else {
			System.out.println("FAIL");
			System.out.println("Actual result is: " + actualParallellaName3);
			System.out.println("Expected result is: " + expectedParallellaName3);
		}
		System.out.println("***************************************************");

		// ********4

		// Compares Expected to Actual Price 4.
		if (expectedParallellaPrice4.equals(actualParallellaPrice4)) {
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualParallellaPrice4);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedParallellaPrice4);
		} else {
			System.out.println("FAIL");
			System.out.println("Actual result is: " + actualParallellaPrice4);
			System.out.println("Expected result is: " + expectedParallellaPrice4);
		}
		System.out.println("***************************************************");

		// Compares Expected to Actual Name 3.
		if (expectedParallellaName4.equals(actualParallellaName4)) {
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualParallellaName4);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedParallellaName4);
		} else {
			System.out.println("FAIL");
			System.out.println("Actual result is: " + actualParallellaName4);
			System.out.println("Expected result is: " + expectedParallellaName4);
		}
		System.out.println("***************************************************"); */

		// Press Command+Shift+F to even-out text
		// Double click word to highlight
		// Command+F to replace all words

		driver.quit();
	}
}
