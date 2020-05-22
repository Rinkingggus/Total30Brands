import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex101NanoPC {
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
// ********************************************************************NanoPC*********************************************************************		

		// Driver Selects which "Brand" is needed
		driver.findElement(By.xpath(
				"//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/aside/section/ul/li[3]/div/div/div/ul/li[21]/label/span"))
				.click();
		Thread.sleep(2000);

System.out.println("******************************************************************************OCTAVO");
		// Load more
		// driver.findElement(By.xpath("//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/div/section/div/button")).click();

		Thread.sleep(4000);

		// Find all elements with class named "_2BULo" and put them in a list.
		List<WebElement> NanoPC = driver.findElements(By.className("_2BULo"));

		// System.out.println("NanoPC all-products quantity " +
		// (NanoPC.size()));

		// Thread.sleep(2500);

		// Find all elements with class named "_2BULo" and put them in a list.
		List<WebElement> NanoPCPrice = driver.findElements(By.className("_23ArP"));

		// place expected and actual Names into value into strings.

		String actualNanoPC1 = NanoPC.get(0).getText();
		String actualNanoPC2 = NanoPC.get(1).getText();
		String actualNanoPC3 = NanoPC.get(2).getText();
		String actualNanoPC4 = NanoPC.get(3).getText();
		String actualNanoPC5 = NanoPC.get(4).getText();
		String actualNanoPC6 = NanoPC.get(5).getText();
		String actualNanoPC7 = NanoPC.get(6).getText();
		String actualNanoPC8 = NanoPC.get(7).getText();
		String actualNanoPC9 = NanoPC.get(8).getText();
		String actualNanoPC10 = NanoPC.get(9).getText();
		String actualNanoPC11 = NanoPC.get(10).getText();
		String actualNanoPC12 = NanoPC.get(11).getText();
		String actualNanoPC13 = NanoPC.get(12).getText();
		String actualNanoPC14 = NanoPC.get(13).getText();
		String actualNanoPC15 = NanoPC.get(14).getText();

		String actualNanoPCPrice1 = NanoPCPrice.get(0).getText();
		String actualNanoPCPrice2 = NanoPCPrice.get(1).getText();
		String actualNanoPCPrice3 = NanoPCPrice.get(2).getText();
		String actualNanoPCPrice4 = NanoPCPrice.get(3).getText();
		String actualNanoPCPrice5 = NanoPCPrice.get(4).getText();
		String actualNanoPCPrice6 = NanoPCPrice.get(5).getText();
		String actualNanoPCPrice7 = NanoPCPrice.get(6).getText();
		String actualNanoPCPrice8 = NanoPCPrice.get(7).getText();
		String actualNanoPCPrice9 = NanoPCPrice.get(8).getText();
		String actualNanoPCPrice10 = NanoPCPrice.get(9).getText();
		String actualNanoPCPrice11 = NanoPCPrice.get(10).getText();
		String actualNanoPCPrice12 = NanoPCPrice.get(11).getText();
		String actualNanoPCPrice13 = NanoPCPrice.get(12).getText();
		String actualNanoPCPrice14 = NanoPCPrice.get(13).getText();
		String actualNanoPCPrice15 = NanoPCPrice.get(14).getText();

//add expected result

		String expectedNanoPC1 = "NanoPi M2A";
		String expectedNanoPC2 = "NanoHat OLED for NanoPi NEO/NEO2/NEO Plus2";
		String expectedNanoPC3 = "NanoPi Hat Oled 2";
		String expectedNanoPC4 = "NanoPi Neo Plus2+";
		String expectedNanoPC5 = "NanoPi Neo Air";
		String expectedNanoPC6 = "NanoPi Neo2-LTS";
		String expectedNanoPC7 = "NanoPi Neo";
		String expectedNanoPC8 = "NanoPi Fire3";
		String expectedNanoPC9 = "NanoPi M1 Plus";
		String expectedNanoPC10 = "NanoPi K2";
		String expectedNanoPC11 = "NanoPi K1 Plus";
		String expectedNanoPC12 = "NanoPi Duo";
		String expectedNanoPC13 = "NanoPi A64";
		String expectedNanoPC14 = "NanoPC-T3 Plus";
		String expectedNanoPC15 = "DE0-Nano-SoC Development Kit";

		String expectedNanoPCPrice1 = "$42.00";
		String expectedNanoPCPrice2 = "$28.50";
		String expectedNanoPCPrice3 = "$28.50";
		String expectedNanoPCPrice4 = "$44.00";
		String expectedNanoPCPrice5 = "$28.00";
		String expectedNanoPCPrice6 = "$19.00";
		String expectedNanoPCPrice7 = "$12.00";
		String expectedNanoPCPrice8 = "$35.00";
		String expectedNanoPCPrice9 = "$38.00";
		String expectedNanoPCPrice10 = "$39.00";
		String expectedNanoPCPrice11 = "$35.00";
		String expectedNanoPCPrice12 = "$8.00";
		String expectedNanoPCPrice13 = "$20.00";
		String expectedNanoPCPrice14 = "$75.00";
		String expectedNanoPCPrice15 = "$99.00";

		// Compares Expected to Actual Price 1.

		if (expectedNanoPCPrice1.equals(actualNanoPCPrice1)) {
			System.out.println("Item 1 Price");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualNanoPCPrice1);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedNanoPCPrice1);
		} else {
			System.out.println("FAIL");
			System.out.println("Item 1 Price");
			System.out.println("Actual result is: " + actualNanoPCPrice1);
			System.out.println("Expected result is: " + expectedNanoPCPrice1);
		}
		System.out.println("**********************************************");

		// Compares Expected to Actual Name 1.
		if (expectedNanoPC1.equals(actualNanoPC1)) {
			System.out.println("Item 1 Name ");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualNanoPC1);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedNanoPC1);
		} else {
			System.out.println("FAIL");
			System.out.println("Item 1 Name ");
			System.out.println("Actual result is: " + actualNanoPC1);
			System.out.println("Expected result is: " + expectedNanoPC1);
		}
		System.out.println("***************************************************");

		// ********2

		// Compares Expected to Actual Price 2.
		if (expectedNanoPCPrice2.equals(actualNanoPCPrice2)) {
			System.out.println("Item 2 Price");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualNanoPCPrice2);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedNanoPCPrice2);
		} else {
			System.out.println("FAIL");
			System.out.println("Item 2 Price");
			System.out.println("Actual result is: " + actualNanoPCPrice2);
			System.out.println("Expected result is: " + expectedNanoPCPrice2);
		}
		System.out.println("*********************************************");

		// Compares Expected to Actual Name 2.
		if (expectedNanoPC2.equals(actualNanoPC2)) {
			System.out.println("Item 2 Name");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualNanoPC2);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedNanoPC2);
		} else {
			System.out.println("FAIL");
			System.out.println("Item 2 Name");
			System.out.println("Actual result is: " + actualNanoPC2);
			System.out.println("Expected result is: " + expectedNanoPC2);
		}
		System.out.println("***************************************************");

		// ********3

		// Compares Expected to Actual Price 3.
		if (expectedNanoPCPrice3.equals(actualNanoPCPrice3)) {
			System.out.println("Item 3 Price");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualNanoPCPrice3);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedNanoPCPrice3);
		} else {
			System.out.println("FAIL");
			System.out.println("Item 3 Price");
			System.out.println("Actual result is: " + actualNanoPCPrice3);
			System.out.println("Expected result is: " + expectedNanoPCPrice3);
		}
		System.out.println("*********************************************");

		// Compares Expected to Actual Name 3.
		if (expectedNanoPC3.equals(actualNanoPC3)) {
			System.out.println("Item 3 Name");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualNanoPC3);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedNanoPC3);
		} else {
			System.out.println("FAIL");
			System.out.println("Item 3 Name");
			System.out.println("Actual result is: " + actualNanoPC3);
			System.out.println("Expected result is: " + expectedNanoPC3);
		}
		System.out.println("***************************************************");

		// ********4

		// Compares Expected to Actual Price 4.
		if (expectedNanoPCPrice4.equals(actualNanoPCPrice4)) {
			System.out.println("Item 4 Price");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualNanoPCPrice4);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedNanoPCPrice4);
		} else {
			System.out.println("FAIL");
			System.out.println("Item 4 Price");
			System.out.println("Actual result is: " + actualNanoPCPrice4);
			System.out.println("Expected result is: " + expectedNanoPCPrice4);
		}
		System.out.println("*********************************************");

		// Compares Expected to Actual Name 4.
		if (expectedNanoPC4.equals(actualNanoPC4)) {
			System.out.println("Item 4 Name");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualNanoPC4);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedNanoPC4);
		} else {
			System.out.println("FAIL");
			System.out.println("Item 4 Name");
			System.out.println("Actual result is: " + actualNanoPC4);
			System.out.println("Expected result is: " + expectedNanoPC4);
		}
		System.out.println("***************************************************");

		// ********5

		// Compares Expected to Actual Price 5.
		if (expectedNanoPCPrice5.equals(actualNanoPCPrice5)) {
			System.out.println("Item 5 Price");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualNanoPCPrice5);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedNanoPCPrice5);
		} else {
			System.out.println("FAIL");
			System.out.println("Item 5 Price");
			System.out.println("Actual result is: " + actualNanoPCPrice5);
			System.out.println("Expected result is: " + expectedNanoPCPrice5);
		}
		System.out.println("*********************************************");

		// Compares Expected to Actual Name 5.
		if (expectedNanoPC5.equals(actualNanoPC5)) {
			System.out.println("Item 5 Name");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualNanoPC5);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedNanoPC5);
		} else {
			System.out.println("FAIL");
			System.out.println("Item 5 Name");
			System.out.println("Actual result is: " + actualNanoPC5);
			System.out.println("Expected result is: " + expectedNanoPC5);
		}
		System.out.println("***************************************************");

		
		// Compares Expected to Actual Price 6.

		if (expectedNanoPCPrice6.equals(actualNanoPCPrice6)) {
			System.out.println("Item 6 Price");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualNanoPCPrice6);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedNanoPCPrice6);
		} else {
			System.out.println("FAIL");
			System.out.println("Item 6 Price");
			System.out.println("Actual result is: " + actualNanoPCPrice6);
			System.out.println("Expected result is: " + expectedNanoPCPrice6);
		}
		System.out.println("*********************************************");

		// Compares Expected to Actual Name 6.
		if (expectedNanoPC6.equals(actualNanoPC6)) {
			System.out.println("Item 6 Name ");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualNanoPC6);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedNanoPC6);
		} else {
			System.out.println("FAIL");
			System.out.println("Item 6 Name ");
			System.out.println("Actual result is: " + actualNanoPC6);
			System.out.println("Expected result is: " + expectedNanoPC6);
		}
		System.out.println("***************************************************");

		// ********2

		// Compares Expected to Actual Price 7.
		if (expectedNanoPCPrice7.equals(actualNanoPCPrice7)) {
			System.out.println("Item 7 Price");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualNanoPCPrice7);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedNanoPCPrice7);
		} else {
			System.out.println("FAIL");
			System.out.println("Item 7 Price");
			System.out.println("Actual result is: " + actualNanoPCPrice7);
			System.out.println("Expected result is: " + expectedNanoPCPrice7);
		}
		System.out.println("*********************************************");

		// Compares Expected to Actual Name 7.
		if (expectedNanoPC7.equals(actualNanoPC7)) {
			System.out.println("Item 7 Name");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualNanoPC7);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedNanoPC7);
		} else {
			System.out.println("FAIL");
			System.out.println("Item 7 Name");
			System.out.println("Actual result is: " + actualNanoPC7);
			System.out.println("Expected result is: " + expectedNanoPC7);
		}
		System.out.println("***************************************************");

		// ********8

		// Compares Expected to Actual Price 8.
		if (expectedNanoPCPrice8.equals(actualNanoPCPrice8)) {
			System.out.println("Item 8 Price");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualNanoPCPrice8);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedNanoPCPrice8);
		} else {
			System.out.println("FAIL");
			System.out.println("Item 8 Price");
			System.out.println("Actual result is: " + actualNanoPCPrice8);
			System.out.println("Expected result is: " + expectedNanoPCPrice8);
		}
		System.out.println("*********************************************");

		// Compares Expected to Actual Name 8.
		if (expectedNanoPC8.equals(actualNanoPC8)) {
			System.out.println("Item 8 Name");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualNanoPC8);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedNanoPC8);
		} else {
			System.out.println("FAIL");
			System.out.println("Item 8 Name");
			System.out.println("Actual result is: " + actualNanoPC8);
			System.out.println("Expected result is: " + expectedNanoPC8);
		}
		System.out.println("***************************************************");

		// ********9

		// Compares Expected to Actual Price 9.
		if (expectedNanoPCPrice9.equals(actualNanoPCPrice9)) {
			System.out.println("Item 9 Price");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualNanoPCPrice9);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedNanoPCPrice9);
		} else {
			System.out.println("FAIL");
			System.out.println("Item 9 Price");
			System.out.println("Actual result is: " + actualNanoPCPrice9);
			System.out.println("Expected result is: " + expectedNanoPCPrice9);
		}
		System.out.println("*********************************************");

		// Compares Expected to Actual Name 9.
		if (expectedNanoPC9.equals(actualNanoPC9)) {
			System.out.println("Item 9 Name");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualNanoPC9);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedNanoPC9);
		} else {
			System.out.println("FAIL");
			System.out.println("Item 9 Name");
			System.out.println("Actual result is: " + actualNanoPC9);
			System.out.println("Expected result is: " + expectedNanoPC9);
		}
		System.out.println("***************************************************");

		// ********10

		// Compares Expected to Actual Price 10.
		if (expectedNanoPCPrice10.equals(actualNanoPCPrice10)) {
			System.out.println("Item 10 Price");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualNanoPCPrice10);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedNanoPCPrice10);
		} else {
			System.out.println("FAIL");
			System.out.println("Item 10 Price");
			System.out.println("Actual result is: " + actualNanoPCPrice10);
			System.out.println("Expected result is: " + expectedNanoPCPrice10);
		}
		System.out.println("*********************************************");

		// Compares Expected to Actual Name 10.
		if (expectedNanoPC10.equals(actualNanoPC10)) {
			System.out.println("Item 10 Name");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualNanoPC10);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedNanoPC10);
		} else {
			System.out.println("FAIL");
			System.out.println("Item 10 Name");
			System.out.println("Actual result is: " + actualNanoPC10);
			System.out.println("Expected result is: " + expectedNanoPC10);
		}
		System.out.println("***************************************************");

		// Compares Expected to Actual Price 11.

		if (expectedNanoPCPrice11.equals(actualNanoPCPrice11)) {
			System.out.println("Item 11 Price");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualNanoPCPrice11);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedNanoPCPrice11);
		} else {
			System.out.println("FAIL");
			System.out.println("Item 11 Price");
			System.out.println("Actual result is: " + actualNanoPCPrice11);
			System.out.println("Expected result is: " + expectedNanoPCPrice11);
		}
		System.out.println("*********************************************");

		// Compares Expected to Actual Name 11.
		if (expectedNanoPC11.equals(actualNanoPC11)) {
			System.out.println("Item 11 Name ");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualNanoPC11);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedNanoPC11);
		} else {
			System.out.println("FAIL");
			System.out.println("Item 11 Name ");
			System.out.println("Actual result is: " + actualNanoPC11);
			System.out.println("Expected result is: " + expectedNanoPC11);
		}
		System.out.println("***************************************************");

		// ********12

		// Compares Expected to Actual Price 12.
		if (expectedNanoPCPrice12.equals(actualNanoPCPrice12)) {
			System.out.println("Item 12 Price");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualNanoPCPrice12);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedNanoPCPrice12);
		} else {
			System.out.println("FAIL");
			System.out.println("Item 12 Price");
			System.out.println("Actual result is: " + actualNanoPCPrice12);
			System.out.println("Expected result is: " + expectedNanoPCPrice12);
		}
		System.out.println("*********************************************");

		// Compares Expected to Actual Name 12.
		if (expectedNanoPC12.equals(actualNanoPC12)) {
			System.out.println("Item 12 Name");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualNanoPC12);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedNanoPC12);
		} else {
			System.out.println("FAIL");
			System.out.println("Item 12 Name");
			System.out.println("Actual result is: " + actualNanoPC12);
			System.out.println("Expected result is: " + expectedNanoPC12);
		}
		System.out.println("***************************************************");

		// ********13

		// Compares Expected to Actual Price 13.
		if (expectedNanoPCPrice13.equals(actualNanoPCPrice13)) {
			System.out.println("Item 13 Price");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualNanoPCPrice13);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedNanoPCPrice13);
		} else {
			System.out.println("FAIL");
			System.out.println("Item 13 Price");
			System.out.println("Actual result is: " + actualNanoPCPrice13);
			System.out.println("Expected result is: " + expectedNanoPCPrice13);
		}
		System.out.println("*********************************************");

		// Compares Expected to Actual Name 13.
		if (expectedNanoPC13.equals(actualNanoPC13)) {
			System.out.println("Item 13 Name");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualNanoPC13);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedNanoPC13);
		} else {
			System.out.println("FAIL");
			System.out.println("Item 13 Name");
			System.out.println("Actual result is: " + actualNanoPC13);
			System.out.println("Expected result is: " + expectedNanoPC13);
		}
		System.out.println("***************************************************");

		// ********14

		// Compares Expected to Actual Price 14.
		if (expectedNanoPCPrice14.equals(actualNanoPCPrice14)) {
			System.out.println("Item 14 Price");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualNanoPCPrice14);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedNanoPCPrice14);
		} else {
			System.out.println("FAIL");
			System.out.println("Item 14 Price");
			System.out.println("Actual result is: " + actualNanoPCPrice14);
			System.out.println("Expected result is: " + expectedNanoPCPrice14);
		}
		System.out.println("*********************************************");

		// Compares Expected to Actual Name 14.
		if (expectedNanoPC14.equals(actualNanoPC14)) {
			System.out.println("Item 14 Name");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualNanoPC14);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedNanoPC14);
		} else {
			System.out.println("FAIL");
			System.out.println("Item 14 Name");
			System.out.println("Actual result is: " + actualNanoPC14);
			System.out.println("Expected result is: " + expectedNanoPC14);
		}
		System.out.println("***************************************************");

		// ********15

		// Compares Expected to Actual Price 15.
		if (expectedNanoPCPrice15.equals(actualNanoPCPrice15)) {
			System.out.println("Item 15 Price");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualNanoPCPrice15);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedNanoPCPrice15);
		} else {
			System.out.println("FAIL");
			System.out.println("Item 15 Price");
			System.out.println("Actual result is: " + actualNanoPCPrice15);
			System.out.println("Expected result is: " + expectedNanoPCPrice15);
		}
		System.out.println("*********************************************");

		// Compares Expected to Actual Name 15.
		if (expectedNanoPC15.equals(actualNanoPC15)) {
			System.out.println("Item 15 Name");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualNanoPC15);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedNanoPC15);
		} else {
			System.out.println("FAIL");
			System.out.println("Item 15 Name");
			System.out.println("Actual result is: " + actualNanoPC15);
			System.out.println("Expected result is: " + expectedNanoPC15);
		}
		System.out.println("***************************************************");

		
// ********************************************************************NanoPC*********************************************************************			
		driver.findElement(By.xpath(
				"//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/aside/section/ul/li[3]/div/div/div/ul/li[21]/label/span"))
				.click();
		Thread.sleep(2000);
		
		
		// Press Command+Shift+F to even-out text
		// Double click word to highlight
		// Command+F to replace all words

		driver.quit();
	}

}
