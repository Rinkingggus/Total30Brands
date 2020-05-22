import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex101Linklt {
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
// ********************************************************************Linklt*********************************************************************		

		// Driver Selects which "Brand" is needed
		driver.findElement(By.xpath(
				"//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/aside/section/ul/li[3]/div/div/div/ul/li[17]/label/span"))
				.click();
		Thread.sleep(2000);
		System.out.println("******************************************************************************LINKLT");
		// Load more
		// driver.findElement(By.xpath("//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/div/section/div/button")).click();

		Thread.sleep(4000);

		// Find all elements with class named "_2BULo" and put them in a list.
		List<WebElement> Linklt = driver.findElements(By.className("_2BULo"));

		// System.out.println("Linklt all-products quantity " +
		// (Linklt.size()));

		// Thread.sleep(2500);

		// Find all elements with class named "_2BULo" and put them in a list.
		List<WebElement> LinkltPrice = driver.findElements(By.className("_23ArP"));

		// place expected and actual Names into value into strings.

		String actualLinklt1 = Linklt.get(0).getText();


		String actualLinkltPrice1 = LinkltPrice.get(0).getText();
	
		
//add expected result

		String expectedLinklt1 = "LinkIt Smart 7688";
		

		String expectedLinkltPrice1 = "$14.90";
		

		// Compares Expected to Actual Price 1.

		if (expectedLinkltPrice1.equals(actualLinkltPrice1)) {
			System.out.println("Item 1 Price");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualLinkltPrice1);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedLinkltPrice1);
		} else {
			System.out.println("FAIL");
			System.out.println("Item 1 Price");
			System.out.println("Actual result is: " + actualLinkltPrice1);
			System.out.println("Expected result is: " + expectedLinkltPrice1);
		}
		System.out.println("********************************************");

		// Compares Expected to Actual Name 1.
		if (expectedLinklt1.equals(actualLinklt1)) {
			System.out.println("Item 1 Name ");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualLinklt1);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedLinklt1);
		} else {
			System.out.println("FAIL");
			System.out.println("Item 1 Name ");
			System.out.println("Actual result is: " + actualLinklt1);
			System.out.println("Expected result is: " + expectedLinklt1);
		}
		System.out.println("***************************************************");


		// ********************************************************************Linklt*********************************************************************		

				// Driver Selects which "Brand" is needed
				driver.findElement(By.xpath(
						"//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/aside/section/ul/li[3]/div/div/div/ul/li[17]/label/span"))
						.click();
				Thread.sleep(2000);
				
		// Press Command+Shift+F to even-out text
		// Double click word to highlight
		// Command+F to replace all words

		driver.quit();
	}

}
