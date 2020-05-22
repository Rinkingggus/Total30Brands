import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex101MinnowBoard {
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
// ********************************************************************MinnowBoard*********************************************************************		

		
		
		// Driver Selects which "Brand" is needed
		driver.findElement(By.xpath(
				"//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/aside/section/ul/li[3]/div/div/div/ul/li[20]/label/span"))
				.click();
		Thread.sleep(2000);

		System.out.println("******************************************************************************MINNOWBOARD");
		Thread.sleep(4000);

		// Find all elements with class named "_2BULo" and put them in a list.
		List<WebElement> MinnowBoard = driver.findElements(By.className("_2BULo"));

		// System.out.println("MinnowBoard all-products quantity " +
		// (MinnowBoard.size()));

		// Thread.sleep(2500);

		// Find all elements with class named "_2BULo" and put them in a list.
		List<WebElement> MinnowBoardPrice = driver.findElements(By.className("_23ArP"));

		// place expected and actual Names into value into strings.

		String actualMinnowBoard1 = MinnowBoard.get(0).getText();
		String actualMinnowBoard2 = MinnowBoard.get(1).getText();
		

		String actualMinnowBoardPrice1 = MinnowBoardPrice.get(0).getText();
		String actualMinnowBoardPrice2 = MinnowBoardPrice.get(1).getText();
	
//add expected result

		String expectedMinnowBoard1 = "MinnowBoard Turbot Quad-Core / Dual-Ethernet Quad-Core";
		String expectedMinnowBoard2 = "MinnowBoard Turbot Dual-Core / Dual-Ethernet Dual-Core";
	

		String expectedMinnowBoardPrice1 = "$190.00";
		String expectedMinnowBoardPrice2 = "$199.00";
	

		// Compares Expected to Actual Price 1.

		if (expectedMinnowBoardPrice1.equals(actualMinnowBoardPrice1)) {
			System.out.println("Item 1 Price");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualMinnowBoardPrice1);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedMinnowBoardPrice1);
		} else {
			System.out.println("FAIL");
			System.out.println("Item 1 Price");
			System.out.println("Actual result is: " + actualMinnowBoardPrice1);
			System.out.println("Expected result is: " + expectedMinnowBoardPrice1);
		}
		System.out.println("*********************************************");

		// Compares Expected to Actual Name 1.
		if (expectedMinnowBoard1.equals(actualMinnowBoard1)) {
			System.out.println("Item 1 Name ");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualMinnowBoard1);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedMinnowBoard1);
		} else {
			System.out.println("FAIL");
			System.out.println("Item 1 Name ");
			System.out.println("Actual result is: " + actualMinnowBoard1);
			System.out.println("Expected result is: " + expectedMinnowBoard1);
		}
		System.out.println("***************************************************");

		// ********2

		// Compares Expected to Actual Price 2.
		if (expectedMinnowBoardPrice2.equals(actualMinnowBoardPrice2)) {
			System.out.println("Item 2 Price");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualMinnowBoardPrice2);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedMinnowBoardPrice2);
		} else {
			System.out.println("FAIL");
			System.out.println("Item 2 Price");
			System.out.println("Actual result is: " + actualMinnowBoardPrice2);
			System.out.println("Expected result is: " + expectedMinnowBoardPrice2);
		}
		System.out.println("*********************************************");

		// Compares Expected to Actual Name 2.
		if (expectedMinnowBoard2.equals(actualMinnowBoard2)) {
			System.out.println("Item 2 Name");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualMinnowBoard2);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedMinnowBoard2);
		} else {
			System.out.println("FAIL");
			System.out.println("Item 2 Name");
			System.out.println("Actual result is: " + actualMinnowBoard2);
			System.out.println("Expected result is: " + expectedMinnowBoard2);
		}
		System.out.println("***************************************************");

		
// ********************************************************************MinnowBoard*********************************************************************		

		
		
		
		
		// Press Command+Shift+F to even-out text
		// Double click word to highlight
		// Command+F to replace all words

		driver.quit();
	}

}
