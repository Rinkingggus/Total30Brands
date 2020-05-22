import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex101Octavo {
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
// ********************************************************************OCTAVO*********************************************************************		
		System.out.println("OCTAVO");
		// Driver Selects which "Brand" is needed
		driver.findElement(By.xpath(
				"//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/aside/section/ul/li[3]/div/div/div/ul/li[22]/label/span")).click();
		Thread.sleep(2000);

		//Load more
		//driver.findElement(By.xpath("//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/div/section/div/button")).click();
		
		Thread.sleep(4000);
		
		// Find all elements with class named "_2BULo" and put them in a list.
		List<WebElement> Octavo = driver.findElements(By.className("_2BULo"));

	

		// Find all elements with class named "_2BULo" and put them in a list.
		List<WebElement> OctavoPrice = driver.findElements(By.className("_23ArP"));

		// place expected and actual Names into value into strings.

		String actualOctavoName1 = Octavo.get(0).getText();
	
		
		String actualOctavoPrice1 = OctavoPrice.get(0).getText();

		
		
//add expected result
		
		
		String expectedOctavoName1 = "OSD3358-SM-RED";
	
		
		
		String expectedOctavoPrice1 = "$199.00";
		
		
		// Compares Expected to Actual Price 1.  

		if (expectedOctavoPrice1.equals(actualOctavoPrice1)) {
			System.out.println("Item 1 Price");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualOctavoPrice1);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedOctavoPrice1);
		} else {
			System.out.println("FAIL");
			System.out.println("Item 1 Price");
			System.out.println("Actual result is: " + actualOctavoPrice1);
			System.out.println("Expected result is: " + expectedOctavoPrice1);
		}
		System.out.println("*********************************************");

		// Compares Expected to Actual Name 1.
		if (expectedOctavoName1.equals(actualOctavoName1)) {
			System.out.println("Item 1 Name ");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualOctavoName1);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedOctavoName1);
		} else {
			System.out.println("FAIL");
			System.out.println("Item 1 Name ");
			System.out.println("Actual result is: " + actualOctavoName1);
			System.out.println("Expected result is: " + expectedOctavoName1);
		}
		System.out.println("***************************************************");			
		
	
		
// ********************************************************************OCTAVO*********************************************************************		
		driver.findElement(By.xpath(
				"//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/aside/section/ul/li[3]/div/div/div/ul/li[22]/label/span")).click();
		Thread.sleep(2000);
		
		// Press Command+Shift+F to even-out text
		// Double click word to highlight
		// Command+F to replace all words

		
		driver.quit();
	}

	
		}
