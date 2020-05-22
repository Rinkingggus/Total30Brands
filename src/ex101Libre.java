import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex101Libre {
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
// ********************************************************************Libre*********************************************************************		

		// Driver Selects which "Brand" is needed
		driver.findElement(By.xpath(
				"//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/aside/section/ul/li[3]/div/div/div/ul/li[16]/label/span"))
				.click();
		Thread.sleep(2000);

System.out.println("******************************************************************************LINKLT");
		// Load more
		// driver.findElement(By.xpath("//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/div/section/div/button")).click();

		Thread.sleep(4000);

		// Find all elements with class named "_2BULo" and put them in a list.
		List<WebElement> Libre = driver.findElements(By.className("_2BULo"));

		// System.out.println("Libre all-products quantity " +
		// (Libre.size()));

		// Thread.sleep(2500);

		// Find all elements with class named "_2BULo" and put them in a list.
		List<WebElement> LibrePrice = driver.findElements(By.className("_23ArP"));

		// place expected and actual Names into value into strings.

		String actualLibre1 = Libre.get(0).getText();
		//String actualLibre2 = Libre.get(1).getText();
		//String actualLibre3 = Libre.get(2).getText();

		String actualLibrePrice1 = LibrePrice.get(0).getText();
		//String actualLibrePrice2 = LibrePrice.get(1).getText();
		//String actualLibrePrice3 = LibrePrice.get(2).getText();
		
//add expected result

		String expectedLibre1 = "Libre Computer Board (Le Potato)";
		//String expectedLibre2 = "Libre Acadia V3";
		//String expectedLibre3 = "Libre Arches";

		String expectedLibrePrice1 = "$35.00";
		//String expectedLibrePrice2 = "$119.00";
		//String expectedLibrePrice3 = "$95.00";

		// Compares Expected to Actual Price 1.

		if (expectedLibrePrice1.equals(actualLibrePrice1)) {
			System.out.println("Item 1 Price");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualLibrePrice1);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedLibrePrice1);
		} else {
			System.out.println("FAIL");
			System.out.println("Item 1 Price");
			System.out.println("Actual result is: " + actualLibrePrice1);
			System.out.println("Expected result is: " + expectedLibrePrice1);
		}
		System.out.println("*********************************************");

		// Compares Expected to Actual Name 1.
		if (expectedLibre1.equals(actualLibre1)) {
			System.out.println("Item 1 Name ");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualLibre1);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedLibre1);
		} else {
			System.out.println("FAIL");
			System.out.println("Item 1 Name ");
			System.out.println("Actual result is: " + actualLibre1);
			System.out.println("Expected result is: " + expectedLibre1);
		}
		System.out.println("***************************************************");

		// ********************************************************************Libre*********************************************************************		

				// Driver Selects which "Brand" is needed
				driver.findElement(By.xpath(
						"//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/aside/section/ul/li[3]/div/div/div/ul/li[16]/label/span"))
						.click();
				Thread.sleep(2000);
				
		// Press Command+Shift+F to even-out text
		// Double click word to highlight
		// Command+F to replace all words

		driver.quit();
	}

}
