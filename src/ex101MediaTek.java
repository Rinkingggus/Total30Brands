import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex101MediaTek {
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
// ********************************************************************MediaTek*********************************************************************		

		// Driver Selects which "Brand" is needed
		driver.findElement(By.xpath(
				"//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/aside/section/ul/li[3]/div/div/div/ul/li[19]/label/span"))
				.click();
		Thread.sleep(2000);
		
		System.out.println("******************************************************************************MEDIATEK");

		// Load more
		// driver.findElement(By.xpath("//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/div/section/div/button")).click();

		Thread.sleep(4000);

		// Find all elements with class named "_2BULo" and put them in a list.
		List<WebElement> MediaTek = driver.findElements(By.className("_2BULo"));

		// System.out.println("MediaTek all-products quantity " +
		// (MediaTek.size()));

		// Thread.sleep(2500);

		// Find all elements with class named "_2BULo" and put them in a list.
		List<WebElement> MediaTekPrice = driver.findElements(By.className("_23ArP"));

		// place expected and actual Names into value into strings.

		String actualMediaTek1 = MediaTek.get(0).getText();
		//String actualMediaTek2 = MediaTek.get(1).getText();
		

		String actualMediaTekPrice1 = MediaTekPrice.get(0).getText();
		//String actualMediaTekPrice2 = MediaTekPrice.get(1).getText();
	
//add expected result

		String expectedMediaTek1 = "MediaTek X20 Development Board";
		//String expectedMediaTek2 = "MediaTek Turbot Dual-Core / Dual-Ethernet Dual-Core";
	

		String expectedMediaTekPrice1 = "$199.00";
		//String expectedMediaTekPrice2 = "$199.00";
	

		// Compares Expected to Actual Price 1.

		if (expectedMediaTekPrice1.equals(actualMediaTekPrice1)) {
			System.out.println("Item 1 Price");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualMediaTekPrice1);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedMediaTekPrice1);
		} else {
			System.out.println("FAIL");
			System.out.println("Item 1 Price");
			System.out.println("Actual result is: " + actualMediaTekPrice1);
			System.out.println("Expected result is: " + expectedMediaTekPrice1);
		}
		System.out.println("*********************************************");

		// Compares Expected to Actual Name 1.
		if (expectedMediaTek1.equals(actualMediaTek1)) {
			System.out.println("Item 1 Name ");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualMediaTek1);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedMediaTek1);
		} else {
			System.out.println("FAIL");
			System.out.println("Item 1 Name ");
			System.out.println("Actual result is: " + actualMediaTek1);
			System.out.println("Expected result is: " + expectedMediaTek1);
		}
		System.out.println("***************************************************");

// ********************************************************************MediaTek*********************************************************************		

				// Driver Selects which "Brand" is needed
				driver.findElement(By.xpath(
						"//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/aside/section/ul/li[3]/div/div/div/ul/li[19]/label/span"))
						.click();
				Thread.sleep(2000);	
		
		
		
		// Press Command+Shift+F to even-out text
		// Double click word to highlight
		// Command+F to replace all words

		driver.quit();
	}

}
