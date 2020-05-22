import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex99Testing5Brands2 {
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

//********************************************************************ORANGEPI**********************************************************************************
		// Driver Selects which "Brand" is needed
		driver.findElement(By.xpath(
				"//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/aside/section/ul/li[3]/div/div/div/ul/li[25]/label/span"))
				.click();
		Thread.sleep(2000);

		// Load more
		// driver.findElement(By.xpath("//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/div/section/div/button")).click();

		Thread.sleep(4000);

		// Find all elements with class named "_2BULo" and put them in a list.
		List<WebElement> OrangePi = driver.findElements(By.className("_2BULo"));

		// System.out.println("OrangePi all-products quantity " +
		// (OrangePi.size()));

		// Thread.sleep(2500);

		// Find all elements with class named "_2BULo" and put them in a list.
		List<WebElement> OrangePiPrice = driver.findElements(By.className("_23ArP"));

		// place expected and actual Names into value into strings.

		String actualOrangePiName1 = OrangePi.get(0).getText();
		String actualOrangePiName2 = OrangePi.get(1).getText();
		String actualOrangePiName3 = OrangePi.get(2).getText();
		String actualOrangePiName4 = OrangePi.get(3).getText();
		String actualOrangePiName5 = OrangePi.get(4).getText();
		String actualOrangePiName6 = OrangePi.get(5).getText();
		String actualOrangePiName7 = OrangePi.get(6).getText();
		String actualOrangePiName8 = OrangePi.get(7).getText();
		String actualOrangePiName9 = OrangePi.get(8).getText();
		String actualOrangePiName10 = OrangePi.get(9).getText();
		String actualOrangePiName11 = OrangePi.get(10).getText();
		String actualOrangePiName12 = OrangePi.get(11).getText();
		String actualOrangePiName13 = OrangePi.get(12).getText();
		String actualOrangePiName14 = OrangePi.get(13).getText();
		String actualOrangePiName15 = OrangePi.get(14).getText();

		String actualOrangePiPrice1 = OrangePiPrice.get(0).getText();
		String actualOrangePiPrice2 = OrangePiPrice.get(1).getText();
		String actualOrangePiPrice3 = OrangePiPrice.get(2).getText();
		String actualOrangePiPrice4 = OrangePiPrice.get(3).getText();
		String actualOrangePiPrice5 = OrangePiPrice.get(4).getText();
		String actualOrangePiPrice6 = OrangePiPrice.get(5).getText();
		String actualOrangePiPrice7 = OrangePiPrice.get(6).getText();
		String actualOrangePiPrice8 = OrangePiPrice.get(7).getText();
		String actualOrangePiPrice9 = OrangePiPrice.get(8).getText();
		String actualOrangePiPrice10 = OrangePiPrice.get(9).getText();
		String actualOrangePiPrice11 = OrangePiPrice.get(10).getText();
		String actualOrangePiPrice12 = OrangePiPrice.get(11).getText();
		String actualOrangePiPrice13 = OrangePiPrice.get(12).getText();
		String actualOrangePiPrice14 = OrangePiPrice.get(13).getText();
		String actualOrangePiPrice15 = OrangePiPrice.get(14).getText();

//add expected result
		String expectedOrangePiName1 = "Orange Pi Zero H2+ / Zero Plus 2 H3 / Zero Plus 2 H5";
		String expectedOrangePiName2 = "Orange Pi Win Plus / Win";
		String expectedOrangePiName3 = "Orange Pi RK3399";
		String expectedOrangePiName4 = "Orange Pi R1";
		String expectedOrangePiName5 = "Orange Pi Prime";
		String expectedOrangePiName6 = "Orange Pi Plus2 / Plus2E";
		String expectedOrangePiName7 = "Orange Pi PC 2";
		String expectedOrangePiName8 = "Orange Pi PC / PC Plus";
		String expectedOrangePiName9 = "Orange Pi One Plus";
		String expectedOrangePiName10 = "Orange Pi Lite2";
		String expectedOrangePiName11 = "Orange Pi Lite";
		String expectedOrangePiName12 = "Orange Pi i96";
		String expectedOrangePiName13 = "Orange Pi 4G-IOT";
		String expectedOrangePiName14 = "Orange Pi 3G-IOT";
		String expectedOrangePiName15 = "Orange Pi 2G-IOT";

		String expectedOrangePiPrice1 = "$8.50";
		String expectedOrangePiPrice2 = "$36.90";
		String expectedOrangePiPrice3 = "$109.00";
		String expectedOrangePiPrice4 = "$13.90";
		String expectedOrangePiPrice5 = "$35.90";
		String expectedOrangePiPrice6 = "$49.00";
		String expectedOrangePiPrice7 = "$20.00";
		String expectedOrangePiPrice8 = "$15.00";
		String expectedOrangePiPrice9 = "$20.00";
		String expectedOrangePiPrice10 = "$25.00";
		String expectedOrangePiPrice11 = "$12.00";
		String expectedOrangePiPrice12 = "$8.80";
		String expectedOrangePiPrice13 = "$45.00";
		String expectedOrangePiPrice14 = "$24.90";
		String expectedOrangePiPrice15 = "$9.90";

		// Compares Expected to Actual 1.

		if (expectedOrangePiPrice1.equals(actualOrangePiPrice1)) {
			System.out.println("Item 1 Price");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualOrangePiPrice1);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedOrangePiPrice1);
		} else {
			System.out.println("FAIL");
			System.out.println("Item 1 Price");
			System.out.println("Actual result is: " + actualOrangePiPrice1);
			System.out.println("Expected result is: " + expectedOrangePiPrice1);
		}
		System.out.println("***************************************************");

		// Compares Expected to Actual Price 1.
		if (expectedOrangePiName1.equals(actualOrangePiName1)) {
			System.out.println("Item 1 Name");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualOrangePiName1);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedOrangePiName1);
		} else {
			System.out.println("Item 1 Name");
			System.out.println("FAIL");

			System.out.println("Actual result is: " + actualOrangePiName1);
			System.out.println("Expected result is: " + expectedOrangePiName1);
		}
		System.out.println("***************************************************");

		// Compares Expected to Actual 2.

		if (expectedOrangePiPrice2.equals(actualOrangePiPrice2)) {
			System.out.println("Item 2 Price");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualOrangePiPrice2);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedOrangePiPrice2);
		} else {
			System.out.println("Item 2 Price");
			System.out.println("FAIL");

			System.out.println("Actual result is: " + actualOrangePiPrice2);
			System.out.println("Expected result is: " + expectedOrangePiPrice2);
		}
		System.out.println("***************************************************");

		// Compares Expected to Actual Price 2.
		if (expectedOrangePiName2.equals(actualOrangePiName2)) {
			System.out.println("Item 2 Name");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualOrangePiName2);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedOrangePiName2);
		} else {
			System.out.println("Item 2 Name");
			System.out.println("FAIL");

			System.out.println("Actual result is: " + actualOrangePiName2);
			System.out.println("Expected result is: " + expectedOrangePiName2);
		}
		System.out.println("***************************************************");

		// Compares Expected to Actual 3.

		if (expectedOrangePiPrice3.equals(actualOrangePiPrice3)) {
			System.out.println("Item 3 Price");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualOrangePiPrice3);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedOrangePiPrice3);
		} else {
			System.out.println("Item 3 Price");
			System.out.println("FAIL");

			System.out.println("Actual result is: " + actualOrangePiPrice3);
			System.out.println("Expected result is: " + expectedOrangePiPrice3);
		}
		System.out.println("***************************************************");

		// Compares Expected to Actual Price 3.
		if (expectedOrangePiName3.equals(actualOrangePiName3)) {
			System.out.println("Item 3 Name");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualOrangePiName3);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedOrangePiName3);
		} else {
			System.out.println("Item 3 Name");
			System.out.println("FAIL");

			System.out.println("Actual result is: " + actualOrangePiName3);
			System.out.println("Expected result is: " + expectedOrangePiName3);
		}
		System.out.println("***************************************************");

		// Compares Expected to Actual 4.

		if (expectedOrangePiPrice4.equals(actualOrangePiPrice4)) {
			System.out.println("Item 4 Price");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualOrangePiPrice4);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedOrangePiPrice4);
		} else {
			System.out.println("Item 4 Price");
			System.out.println("FAIL");

			System.out.println("Actual result is: " + actualOrangePiPrice4);
			System.out.println("Expected result is: " + expectedOrangePiPrice4);
		}
		System.out.println("***************************************************");

		// Compares Expected to Actual Price 4.
		if (expectedOrangePiName4.equals(actualOrangePiName4)) {
			System.out.println("Item 4 Name");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualOrangePiName4);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedOrangePiName4);
		} else {
			System.out.println("Item 4 Name");
			System.out.println("FAIL");

			System.out.println("Actual result is: " + actualOrangePiName4);
			System.out.println("Expected result is: " + expectedOrangePiName4);
		}
		System.out.println("***************************************************");

		// Compares Expected to Actual 5.

		if (expectedOrangePiPrice5.equals(actualOrangePiPrice5)) {
			System.out.println("Item 5 Price");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualOrangePiPrice5);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedOrangePiPrice5);
		} else {
			System.out.println("Item 5 Price");
			System.out.println("FAIL");

			System.out.println("Actual result is: " + actualOrangePiPrice5);
			System.out.println("Expected result is: " + expectedOrangePiPrice5);
		}
		System.out.println("***************************************************");

		// Compares Expected to Actual Price 5.
		if (expectedOrangePiName5.equals(actualOrangePiName5)) {
			System.out.println("Item 5 Name");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualOrangePiName5);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedOrangePiName5);
		} else {
			System.out.println("Item 5 Name");
			System.out.println("FAIL");

			System.out.println("Actual result is: " + actualOrangePiName5);
			System.out.println("Expected result is: " + expectedOrangePiName5);
		}
		System.out.println("***************************************************");

		// Compares Expected to Actual 6.

		if (expectedOrangePiPrice6.equals(actualOrangePiPrice6)) {
			System.out.println("Item 6 Price");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualOrangePiPrice6);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedOrangePiPrice6);
		} else {
			System.out.println("Item 6 Price");
			System.out.println("FAIL");

			System.out.println("Actual result is: " + actualOrangePiPrice6);
			System.out.println("Expected result is: " + expectedOrangePiPrice6);
		}
		System.out.println("***************************************************");

		// Compares Expected to Actual Price 6.
		if (expectedOrangePiName6.equals(actualOrangePiName6)) {
			System.out.println("Item 6 Name");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualOrangePiName6);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedOrangePiName6);
		} else {
			System.out.println("Item 6 Name");
			System.out.println("FAIL");

			System.out.println("Actual result is: " + actualOrangePiName6);
			System.out.println("Expected result is: " + expectedOrangePiName6);
		}
		System.out.println("***************************************************");

		// Compares Expected to Actual 7.

		if (expectedOrangePiPrice7.equals(actualOrangePiPrice7)) {
			System.out.println("Item 7 Price");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualOrangePiPrice7);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedOrangePiPrice7);
		} else {
			System.out.println("Item 7 Price");
			System.out.println("FAIL");

			System.out.println("Actual result is: " + actualOrangePiPrice7);
			System.out.println("Expected result is: " + expectedOrangePiPrice7);
		}
		System.out.println("***************************************************");

		// Compares Expected to Actual Price 7.
		if (expectedOrangePiName7.equals(actualOrangePiName7)) {
			System.out.println("Item 7 Name");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualOrangePiName7);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedOrangePiName7);
		} else {
			System.out.println("Item 7 Name");
			System.out.println("FAIL");

			System.out.println("Actual result is: " + actualOrangePiName7);
			System.out.println("Expected result is: " + expectedOrangePiName7);
		}
		System.out.println("***************************************************");

		// Compares Expected to Actual 8.

		if (expectedOrangePiPrice8.equals(actualOrangePiPrice8)) {
			System.out.println("Item 8 Price");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualOrangePiPrice8);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedOrangePiPrice8);
		} else {
			System.out.println("Item 8 Price");
			System.out.println("FAIL");

			System.out.println("Actual result is: " + actualOrangePiPrice8);
			System.out.println("Expected result is: " + expectedOrangePiPrice8);
		}
		System.out.println("***************************************************");

		// Compares Expected to Actual Price 8.
		if (expectedOrangePiName8.equals(actualOrangePiName8)) {
			System.out.println("Item 8 Name");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualOrangePiName8);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedOrangePiName8);
		} else {
			System.out.println("Item 8 Name");
			System.out.println("FAIL");

			System.out.println("Actual result is: " + actualOrangePiName8);
			System.out.println("Expected result is: " + expectedOrangePiName8);
		}
		System.out.println("***************************************************");

		// Compares Expected to Actual 9.

		if (expectedOrangePiPrice9.equals(actualOrangePiPrice9)) {
			System.out.println("Item 9 Price");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualOrangePiPrice9);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedOrangePiPrice9);
		} else {
			System.out.println("Item 9 Price");
			System.out.println("FAIL");

			System.out.println("Actual result is: " + actualOrangePiPrice9);
			System.out.println("Expected result is: " + expectedOrangePiPrice9);
		}
		System.out.println("***************************************************");

		// Compares Expected to Actual Price 9.
		if (expectedOrangePiName9.equals(actualOrangePiName9)) {
			System.out.println("Item 9 Name");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualOrangePiName9);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedOrangePiName9);
		} else {
			System.out.println("Item 9 Name");
			System.out.println("FAIL");

			System.out.println("Actual result is: " + actualOrangePiName9);
			System.out.println("Expected result is: " + expectedOrangePiName9);
		}
		System.out.println("***************************************************");

		// Compares Expected to Actual 10.

		if (expectedOrangePiPrice10.equals(actualOrangePiPrice10)) {
			System.out.println("Item 10 Price");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualOrangePiPrice10);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedOrangePiPrice10);
		} else {
			System.out.println("Item 10 Price");
			System.out.println("FAIL");

			System.out.println("Actual result is: " + actualOrangePiPrice10);
			System.out.println("Expected result is: " + expectedOrangePiPrice10);
		}
		System.out.println("***************************************************");

		// Compares Expected to Actual Price 10.
		if (expectedOrangePiName10.equals(actualOrangePiName10)) {
			System.out.println("Item 10 Name");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualOrangePiName10);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedOrangePiName10);
		} else {
			System.out.println("Item 10 Name");
			System.out.println("FAIL");

			System.out.println("Actual result is: " + actualOrangePiName10);
			System.out.println("Expected result is: " + expectedOrangePiName10);
		}
		System.out.println("***************************************************");

		// Compares Expected to Actual 11.

		if (expectedOrangePiPrice11.equals(actualOrangePiPrice11)) {
			System.out.println("Item 11 Price");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualOrangePiPrice11);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedOrangePiPrice11);
		} else {
			System.out.println("Item 11 Price");
			System.out.println("FAIL");

			System.out.println("Actual result is: " + actualOrangePiPrice11);
			System.out.println("Expected result is: " + expectedOrangePiPrice11);
		}
		System.out.println("***************************************************");

		// Compares Expected to Actual Price 11.
		if (expectedOrangePiName11.equals(actualOrangePiName11)) {
			System.out.println("Item 11 Name");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualOrangePiName11);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedOrangePiName11);
		} else {
			System.out.println("Item 11 Name");
			System.out.println("FAIL");

			System.out.println("Actual result is: " + actualOrangePiName11);
			System.out.println("Expected result is: " + expectedOrangePiName11);
		}
		System.out.println("***************************************************");

		// Compares Expected to Actual 12.

		if (expectedOrangePiPrice12.equals(actualOrangePiPrice12)) {
			System.out.println("Item 12 Price");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualOrangePiPrice12);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedOrangePiPrice12);
		} else {
			System.out.println("Item 12 Price");
			System.out.println("FAIL");

			System.out.println("Actual result is: " + actualOrangePiPrice12);
			System.out.println("Expected result is: " + expectedOrangePiPrice12);
		}
		System.out.println("***************************************************");

		// Compares Expected to Actual Price 12.
		if (expectedOrangePiName12.equals(actualOrangePiName12)) {
			System.out.println("Item 12 Name");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualOrangePiName12);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedOrangePiName12);
		} else {
			System.out.println("Item 12 Name");
			System.out.println("FAIL");

			System.out.println("Actual result is: " + actualOrangePiName12);
			System.out.println("Expected result is: " + expectedOrangePiName12);
		}
		System.out.println("***************************************************");

		// Compares Expected to Actual 13.

		if (expectedOrangePiPrice13.equals(actualOrangePiPrice13)) {
			System.out.println("Item 13 Price");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualOrangePiPrice13);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedOrangePiPrice13);
		} else {
			System.out.println("Item 13 Price");
			System.out.println("FAIL");

			System.out.println("Actual result is: " + actualOrangePiPrice13);
			System.out.println("Expected result is: " + expectedOrangePiPrice13);
		}
		System.out.println("***************************************************");

		// Compares Expected to Actual Price 13.
		if (expectedOrangePiName13.equals(actualOrangePiName13)) {
			System.out.println("Item 13 Name");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualOrangePiName13);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedOrangePiName13);
		} else {
			System.out.println("Item 13 Name");
			System.out.println("FAIL");

			System.out.println("Actual result is: " + actualOrangePiName13);
			System.out.println("Expected result is: " + expectedOrangePiName13);
		}
		System.out.println("***************************************************");

		// Compares Expected to Actual 14.

		if (expectedOrangePiPrice14.equals(actualOrangePiPrice14)) {
			System.out.println("Item 14 Price");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualOrangePiPrice14);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedOrangePiPrice14);
		} else {
			System.out.println("Item 14 Price");
			System.out.println("FAIL");

			System.out.println("Actual result is: " + actualOrangePiPrice14);
			System.out.println("Expected result is: " + expectedOrangePiPrice14);
		}
		System.out.println("***************************************************");

		// Compares Expected to Actual Price 14.
		if (expectedOrangePiName14.equals(actualOrangePiName14)) {
			System.out.println("Item 14 Name");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualOrangePiName14);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedOrangePiName14);
		} else {
			System.out.println("Item 14 Name");
			System.out.println("FAIL");

			System.out.println("Actual result is: " + actualOrangePiName14);
			System.out.println("Expected result is: " + expectedOrangePiName14);
		}
		System.out.println("***************************************************");

		// Compares Expected to Actual 15.

		if (expectedOrangePiPrice15.equals(actualOrangePiPrice15)) {
			System.out.println("Item 15 Price");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualOrangePiPrice15);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedOrangePiPrice15);
		} else {
			System.out.println("Item 15 Price");
			System.out.println("FAIL");

			System.out.println("Actual result is: " + actualOrangePiPrice15);
			System.out.println("Expected result is: " + expectedOrangePiPrice15);
		}
		System.out.println("***************************************************");

		// Compares Expected to Actual Price 15.
		if (expectedOrangePiName15.equals(actualOrangePiName15)) {
			System.out.println("Item 15 Name");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualOrangePiName15);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedOrangePiName15);
		} else {
			System.out.println("Item 15 Name");
			System.out.println("FAIL");

			System.out.println("Actual result is: " + actualOrangePiName15);
			System.out.println("Expected result is: " + expectedOrangePiName15);
		}
		System.out.println("***************************************************");
//********************************************************************ORANGEPI**********************************************************************************		

		driver.findElement(By.xpath(
				"//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/aside/section/ul/li[3]/div/div/div/ul/li[25]/label/span"))
				.click();
		Thread.sleep(2000);

// ********************************************************************RASPBERRYPI******************************************************************************
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

		// add expected result
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
// ********************************************************************RASPBERRYPI******************************************************************************
		driver.findElement(By.xpath(
				"//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/aside/section/ul/li[3]/div/div/div/ul/li[30]/label/span"))
				.click();
		Thread.sleep(2000);
// ********************************************************************PICOPI**********************************************************************		
		// Driver Selects "Brand" PICOPi
		driver.findElement(By.xpath(
				"//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/aside/section/ul/li[3]/div/div/div/ul/li[28]/label/span"))
				.click();
		Thread.sleep(2000);

		// Load more
		// driver.findElement(By.xpath("//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/div/section/div/button")).click();

		Thread.sleep(4000);

		// Find all elements with class named "_2BULo" and put them in a list.
		List<WebElement> Pico = driver.findElements(By.className("_2BULo"));

		// System.out.println("Pico all-products quantity " +
		// (Pico.size()));

		// Thread.sleep(2500);

		// Find all elements with class named "_2BULo" and put them in a list.
		List<WebElement> PicoPrice = driver.findElements(By.className("_23ArP"));

		// place expected and actual Names into value into strings.

		String actualPicoPiName1 = Pico.get(0).getText();
		String actualPicoPiName2 = Pico.get(1).getText();
		// String actualPicoPiName3 = Pico.get(2).getText();
		// String actualPicoPiName4 = Pico.get(3).getText();

		String actualPicoPiPrice1 = PicoPrice.get(0).getText();
		String actualPicoPiPrice2 = PicoPrice.get(1).getText();
		// String actualPicoPiPrice3 = PicoPrice.get(2).getText();
		// String actualPicoPiPrice4 = PicoPrice.get(3).getText();

		// add expected result
		String expectedPicoPiName1 = "PICO-PI-IMX7";
		String expectedPicoPiName2 = "PICO-PI-IMX6UL";
		// String expectedPicoPiName3 = "Pico Zero W / Zero WH";
		// String expectedPicoPiName4 = "Pico Zero";

		String expectedPicoPiPrice1 = "$79.00";
		String expectedPicoPiPrice2 = "$69.00";
		// String expectedPicoPiPrice3 = "$10.00";
		// String expectedPicoPiPrice4 = "$5.00";

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

		// Driver deselects Privious selection
		driver.findElement(By.xpath(
				"//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/aside/section/ul/li[3]/div/div/div/ul/li[28]/label/span"))
				.click();
		Thread.sleep(2000);

// ********************************************************************PINE**********************************************************************
		// Driver Selects "Brand" Pine

		driver.findElement(By.xpath(
				"//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/aside/section/ul/li[3]/div/div/div/ul/li[29]/label/span"))
				.click();
		Thread.sleep(2000);

		// Find all elements with class named "_2BULo" and put them in a list.
		List<WebElement> Pine = driver.findElements(By.className("_2BULo"));

		// System.out.println("Pine all-products quantity " +
		// (Pine.size()));

		// Thread.sleep(2500);

		// Find all elements with class named "_2BULo" and put them in a list.
		List<WebElement> PinePrice = driver.findElements(By.className("_23ArP"));

		// place expected and actual Names into value into strings.

		String actualPineName1 = Pine.get(0).getText();
		String actualPineName2 = Pine.get(1).getText();
		// String actualPineName3 = Pine.get(2).getText();
		// String actualPineName4 = Pine.get(3).getText();

		String actualPinePrice1 = PinePrice.get(0).getText();
		String actualPinePrice2 = PinePrice.get(1).getText();
		// String actualPinePrice3 = PinePrice.get(2).getText();
		// String actualPinePrice4 = PinePrice.get(3).getText();

		// add expected result
		String expectedPineName1 = "Pine H64";
		String expectedPineName2 = "Pine A64 / A64-LTS";
		// String expectedPineName3 = "Pine Zero W / Zero WH";
		// String expectedPineName4 = "Pine Zero";

		String expectedPinePrice1 = "$26.00";
		String expectedPinePrice2 = "$15.00";
		// String expectedPinePrice3 = "$10.00";
		// String expectedPinePrice4 = "$5.00";

		// Compares Expected to Actual Name 1.

		if (expectedPinePrice1.equals(actualPinePrice1)) {
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualPinePrice1);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedPinePrice1);
		} else {
			System.out.println("FAIL");
			System.out.println("Actual result is: " + actualPinePrice1);
			System.out.println("Expected result is: " + expectedPinePrice1);
		}
		System.out.println("***************************************************");

		// Compares Expected to Actual Price1.
		if (expectedPineName1.equals(actualPineName1)) {
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualPineName1);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedPineName1);
		} else {
			System.out.println("FAIL");
			System.out.println("Actual result is: " + actualPineName1);
			System.out.println("Expected result is: " + expectedPineName1);
		}
		System.out.println("***************************************************");

		// ********2

		// Compares Expected to Actual Price 2.
		if (expectedPinePrice2.equals(actualPinePrice2)) {
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualPinePrice2);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedPinePrice2);
		} else {
			System.out.println("FAIL");
			System.out.println("Actual result is: " + actualPinePrice2);
			System.out.println("Expected result is: " + expectedPinePrice2);
		}
		System.out.println("***************************************************");

		// Compares Expected to Actual Name 2.
		if (expectedPineName2.equals(actualPineName2)) {
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualPineName2);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedPineName2);
		} else {
			System.out.println("FAIL");
			System.out.println("Actual result is: " + actualPineName2);
			System.out.println("Expected result is: " + expectedPineName2);
		}
		System.out.println("***************************************************");

// ********************************************************************PINE**********************************************************************

		driver.findElement(By.xpath(
				"//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/aside/section/ul/li[3]/div/div/div/ul/li[29]/label/span"))
				.click();
		Thread.sleep(2000);

// ********************************************************************PEPPER**********************************************************************

		// Driver Selects which "Brand" is needed
		driver.findElement(By.xpath(
				"//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/aside/section/ul/li[3]/div/div/div/ul/li[27]/label/span"))
				.click();
		Thread.sleep(2000);

		// Load more
		// driver.findElement(By.xpath("//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/div/section/div/button")).click();

		Thread.sleep(4000);

		// Find all elements with class named "_2BULo" and put them in a list.
		List<WebElement> Pepper = driver.findElements(By.className("_2BULo"));

		// System.out.println("Pepper all-products quantity " +
		// (Pepper.size()));

		// Thread.sleep(2500);

		// Find all elements with class named "_2BULo" and put them in a list.
		List<WebElement> PepperPrice = driver.findElements(By.className("_23ArP"));

		// place expected and actual Names into value into strings.

		String actualPepperName1 = Pepper.get(0).getText();
		String actualPepperName2 = Pepper.get(1).getText();
		// String actualPepperName3 = Pepper.get(2).getText();
		// String actualPepperName4 = Pepper.get(3).getText();

		String actualPepperPrice1 = PepperPrice.get(0).getText();
		String actualPepperPrice2 = PepperPrice.get(1).getText();
		// String actualPepperPrice3 = PepperPrice.get(2).getText();
		// String actualPepperPrice4 = PepperPrice.get(3).getText();

		// add expected result
		String expectedPepperName1 = "Pepper DVI-D";
		String expectedPepperName2 = "Pepper 43R / 43C";
		// String expectedPepperName3 = "Pepper Zero W / Zero WH";
		// String expectedPepperName4 = "Pepper Zero";

		String expectedPepperPrice1 = "$119.00";
		String expectedPepperPrice2 = "$169.00";
		// String expectedPepperPrice3 = "$10.00";
		// String expectedPepperPrice4 = "$5.00";

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

		driver.findElement(By.xpath(
				"//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/aside/section/ul/li[3]/div/div/div/ul/li[27]/label/span"))
				.click();
		Thread.sleep(2000);

// ********************************************************************PARALLELLA**********************************************************************		

		// Driver Selects which "Brand" is needed
		driver.findElement(By.xpath(
				"//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/aside/section/ul/li[3]/div/div/div/ul/li[26]/label/span"))
				.click();
		Thread.sleep(2000);

		// Load more
		// driver.findElement(By.xpath("//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/div/section/div/button")).click();

		Thread.sleep(4000);

		// Find all elements with class named "_2BULo" and put them in a list.
		List<WebElement> Parallella = driver.findElements(By.className("_2BULo"));

		// System.out.println("Parallella all-products quantity " +
		// (Parallella.size()));

		// Thread.sleep(2500);

		// Find all elements with class named "_2BULo" and put them in a list.
		List<WebElement> ParallellaPrice = driver.findElements(By.className("_23ArP"));

		// place expected and actual Names into value into strings.

		String actualParallellaName1 = Parallella.get(0).getText();
		// String actualParallellaName2 = Parallella.get(1).getText();
		// String actualParallellaName3 = Parallella.get(2).getText();
		// String actualParallellaName4 = Parallella.get(3).getText();

		String actualParallellaPrice1 = ParallellaPrice.get(0).getText();
		// String actualParallellaPrice2 = ParallellaPrice.get(1).getText();
		// String actualParallellaPrice3 = ParallellaPrice.get(2).getText();
		// String actualParallellaPrice4 = ParallellaPrice.get(3).getText();

		// add expected result
		String expectedParallellaName1 = "Parallella";
		// String expectedParallellaName2 = "Parallella 43R / 43C";
		// String expectedParallellaName3 = "Parallella Zero W / Zero WH";
		// String expectedParallellaName4 = "Parallella Zero";

		String expectedParallellaPrice1 = "$128.00";
		// String expectedParallellaPrice2 = "$169.00";
		// String expectedParallellaPrice3 = "$10.00";
		// String expectedParallellaPrice4 = "$5.00";

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

		driver.findElement(By.xpath(
				"//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/aside/section/ul/li[3]/div/div/div/ul/li[26]/label/span"))
				.click();
		Thread.sleep(2000);

// ********************************************************************OLINOXINO*********************************************************************

		// Driver Selects which "Brand" is needed
		driver.findElement(By.xpath(
				"//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/aside/section/ul/li[3]/div/div/div/ul/li[24]/label/span"))
				.click();
		Thread.sleep(2000);

		// Load more
		// driver.findElement(By.xpath("//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/div/section/div/button")).click();

		Thread.sleep(4000);

		// Find all elements with class named "_2BULo" and put them in a list.
		List<WebElement> OLinuXino = driver.findElements(By.className("_2BULo"));

		// System.out.println("OLinuXino all-products quantity " +
		// (OLinuXino.size()));

		Thread.sleep(2500);

		// Find all elements with class named "_2BULo" and put them in a list.
		List<WebElement> OLinuXinoPrice = driver.findElements(By.className("_23ArP"));

		// place expected and actual Names into value into strings.

		String actualOLinuXinoName1 = OLinuXino.get(0).getText();
		String actualOLinuXinoName2 = OLinuXino.get(1).getText();
		String actualOLinuXinoName3 = OLinuXino.get(2).getText();
		String actualOLinuXinoName4 = OLinuXino.get(3).getText();

		String actualOLinuXinoPrice1 = OLinuXinoPrice.get(0).getText();
		String actualOLinuXinoPrice2 = OLinuXinoPrice.get(1).getText();
		String actualOLinuXinoPrice3 = OLinuXinoPrice.get(2).getText();
		String actualOLinuXinoPrice4 = OLinuXinoPrice.get(3).getText();

		// add expected result
		String expectedOLinuXinoName1 = "A64-OLinuXino";
		String expectedOLinuxinoName2 = "A33-OlinuXino";
		String expectedOLinuxinoName3 = "A20-OlinuXino-Micro";
		String expectedOLinuxinoName4 = "A20-OlinuXino-Lime2";

		String expectedOLinuXinoPrice1 = "$47.00";
		String expectedOLinuXinoPrice2 = "$42.00";
		String expectedOLinuXinoPrice3 = "$65.00";
		String expectedOLinuXinoPrice4 = "$37.10";

		// Compares Expected to Actual Price 1.

		if (expectedOLinuXinoPrice1.equals(actualOLinuXinoPrice1)) {
			System.out.println("Item 1 Price");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualOLinuXinoPrice1);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedOLinuXinoPrice1);
		} else {
			System.out.println("FAIL");
			System.out.println("Item 1 Price");
			System.out.println("Actual result is: " + actualOLinuXinoPrice1);
			System.out.println("Expected result is: " + expectedOLinuXinoPrice1);
		}
		System.out.println("*********************************************");

		// Compares Expected to Actual Name 1.
		if (expectedOLinuXinoName1.equals(actualOLinuXinoName1)) {
			System.out.println("Item 1 Name ");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualOLinuXinoName1);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedOLinuXinoName1);
		} else {
			System.out.println("FAIL");
			System.out.println("Item 1 Name ");
			System.out.println("Actual result is: " + actualOLinuXinoName1);
			System.out.println("Expected result is: " + expectedOLinuXinoName1);
		}
		System.out.println("***************************************************");

		// ********2

		// Compares Expected to Actual Price 2.
		if (expectedOLinuXinoPrice2.equals(actualOLinuXinoPrice2)) {
			System.out.println("Item 2 Price");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualOLinuXinoPrice2);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedOLinuXinoPrice2);
		} else {
			System.out.println("FAIL");
			System.out.println("Item 2 Price");
			System.out.println("Actual result is: " + actualOLinuXinoPrice2);
			System.out.println("Expected result is: " + expectedOLinuXinoPrice2);
		}
		System.out.println("*********************************************");

		// Compares Expected to Actual Name 2.
		if (expectedOLinuxinoName2.equals(actualOLinuXinoName2)) {
			System.out.println("Item 2 Name");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualOLinuXinoName2);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedOLinuxinoName2);
		} else {
			System.out.println("FAIL");
			System.out.println("Item 2 Name");
			System.out.println("Actual result is: " + actualOLinuXinoName2);
			System.out.println("Expected result is: " + expectedOLinuxinoName2);
		}
		System.out.println("***************************************************");

		// ********3

		// Compares Expected to Actual Price 3.
		if (expectedOLinuXinoPrice3.equals(actualOLinuXinoPrice3)) {
			System.out.println("Item 3 Price");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualOLinuXinoPrice3);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedOLinuXinoPrice3);
		} else {
			System.out.println("FAIL");
			System.out.println("Item 3 Price");
			System.out.println("Actual result is: " + actualOLinuXinoPrice3);
			System.out.println("Expected result is: " + expectedOLinuXinoPrice3);
		}
		System.out.println("*********************************************");

		// Compares Expected to Actual Name 3.
		if (expectedOLinuxinoName3.equals(actualOLinuXinoName3)) {
			System.out.println("Item 3 Name");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualOLinuXinoName3);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedOLinuxinoName3);
		} else {
			System.out.println("FAIL");
			System.out.println("Item 3 Name");
			System.out.println("Actual result is: " + actualOLinuXinoName3);
			System.out.println("Expected result is: " + expectedOLinuxinoName3);
		}
		System.out.println("***************************************************");

		// ********4

		// Compares Expected to Actual Price 4.
		if (expectedOLinuXinoPrice4.equals(actualOLinuXinoPrice4)) {
			System.out.println("Item 4 Price");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualOLinuXinoPrice4);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedOLinuXinoPrice4);
		} else {
			System.out.println("FAIL");
			System.out.println("Item 4 Price");
			System.out.println("Actual result is: " + actualOLinuXinoPrice4);
			System.out.println("Expected result is: " + expectedOLinuXinoPrice4);
		}
		System.out.println("*********************************************");

		// Compares Expected to Actual Name 4.
		if (expectedOLinuxinoName4.equals(actualOLinuXinoName4)) {
			System.out.println("Item 4 Name");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualOLinuXinoName4);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedOLinuxinoName4);
		} else {
			System.out.println("FAIL");
			System.out.println("Item 4 Name");
			System.out.println("Actual result is: " + actualOLinuXinoName4);
			System.out.println("Expected result is: " + expectedOLinuxinoName4);
		}
		System.out.println("***************************************************");

		// ********************************************************************OLINOXINO*********************************************************************
		driver.findElement(By.xpath(
				"//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/aside/section/ul/li[3]/div/div/div/ul/li[24]/label/span"))
				.click();
		Thread.sleep(2000);

		// ********************************************************************ODROID*********************************************************************

		// Driver Selects which "Brand" is needed
		driver.findElement(By.xpath(
				"//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/aside/section/ul/li[3]/div/div/div/ul/li[23]/label/span"))
				.click();
		Thread.sleep(2000);

		// Load more
		// driver.findElement(By.xpath("//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/div/section/div/button")).click();

		Thread.sleep(4000);

		// Find all elements with class named "_2BULo" and put them in a list.
		List<WebElement> Odroid = driver.findElements(By.className("_2BULo"));

		// System.out.println("Odroid all-products quantity " +
		// (Odroid.size()));

		// Thread.sleep(2500);

		// Find all elements with class named "_2BULo" and put them in a list.
		List<WebElement> OdroidPrice = driver.findElements(By.className("_23ArP"));

		// place expected and actual Names into value into strings.

		String actualOdroidName1 = Odroid.get(0).getText();
		String actualOdroidName2 = Odroid.get(1).getText();
		String actualOdroidName3 = Odroid.get(2).getText();
		String actualOdroidName4 = Odroid.get(3).getText();
		String actualOdroidName5 = Odroid.get(4).getText();

		String actualOdroidPrice1 = OdroidPrice.get(0).getText();
		String actualOdroidPrice2 = OdroidPrice.get(1).getText();
		String actualOdroidPrice3 = OdroidPrice.get(2).getText();
		String actualOdroidPrice4 = OdroidPrice.get(3).getText();
		String actualOdroidPrice5 = OdroidPrice.get(4).getText();

		// add expected result
		String expectedOdroidName1 = "Odroid-XU4";
		String expectedOdroidName2 = "Odroid-N1";
		String expectedOdroidName3 = "Odroid-C2";
		String expectedOdroidName4 = "Odroid-C1+";
		String expectedOdroidName5 = "Odroid-C0";

		String expectedOdroidPrice1 = "$59.00";
		String expectedOdroidPrice2 = "$110.00";
		String expectedOdroidPrice3 = "$39.00";
		String expectedOdroidPrice4 = "$35.00";
		String expectedOdroidPrice5 = "$29.80";
		// Compares Expected to Actual Price 1.

		if (expectedOdroidPrice1.equals(actualOdroidPrice1)) {
			System.out.println("Item 1 Price");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualOdroidPrice1);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedOdroidPrice1);
		} else {
			System.out.println("FAIL");
			System.out.println("Item 1 Price");
			System.out.println("Actual result is: " + actualOdroidPrice1);
			System.out.println("Expected result is: " + expectedOdroidPrice1);
		}
		System.out.println("*********************************************");

		// Compares Expected to Actual Name 1.
		if (expectedOdroidName1.equals(actualOdroidName1)) {
			System.out.println("Item 1 Name ");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualOdroidName1);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedOdroidName1);
		} else {
			System.out.println("FAIL");
			System.out.println("Item 1 Name ");
			System.out.println("Actual result is: " + actualOdroidName1);
			System.out.println("Expected result is: " + expectedOdroidName1);
		}
		System.out.println("***************************************************");

		// ********2

		// Compares Expected to Actual Price 2.
		if (expectedOdroidPrice2.equals(actualOdroidPrice2)) {
			System.out.println("Item 2 Price");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualOdroidPrice2);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedOdroidPrice2);
		} else {
			System.out.println("FAIL");
			System.out.println("Item 2 Price");
			System.out.println("Actual result is: " + actualOdroidPrice2);
			System.out.println("Expected result is: " + expectedOdroidPrice2);
		}
		System.out.println("*********************************************");

		// Compares Expected to Actual Name 2.
		if (expectedOdroidName2.equals(actualOdroidName2)) {
			System.out.println("Item 2 Name");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualOdroidName2);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedOdroidName2);
		} else {
			System.out.println("FAIL");
			System.out.println("Item 2 Name");
			System.out.println("Actual result is: " + actualOdroidName2);
			System.out.println("Expected result is: " + expectedOdroidName2);
		}
		System.out.println("***************************************************");

		// ********3

		// Compares Expected to Actual Price 3.
		if (expectedOdroidPrice3.equals(actualOdroidPrice3)) {
			System.out.println("Item 3 Price");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualOdroidPrice3);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedOdroidPrice3);
		} else {
			System.out.println("FAIL");
			System.out.println("Item 3 Price");
			System.out.println("Actual result is: " + actualOdroidPrice3);
			System.out.println("Expected result is: " + expectedOdroidPrice3);
		}
		System.out.println("*********************************************");

		// Compares Expected to Actual Name 3.
		if (expectedOdroidName3.equals(actualOdroidName3)) {
			System.out.println("Item 3 Name");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualOdroidName3);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedOdroidName3);
		} else {
			System.out.println("FAIL");
			System.out.println("Item 3 Name");
			System.out.println("Actual result is: " + actualOdroidName3);
			System.out.println("Expected result is: " + expectedOdroidName3);
		}
		System.out.println("***************************************************");

		// ********4

		// Compares Expected to Actual Price 4.
		if (expectedOdroidPrice4.equals(actualOdroidPrice4)) {
			System.out.println("Item 4 Price");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualOdroidPrice4);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedOdroidPrice4);
		} else {
			System.out.println("FAIL");
			System.out.println("Item 4 Price");
			System.out.println("Actual result is: " + actualOdroidPrice4);
			System.out.println("Expected result is: " + expectedOdroidPrice4);
		}
		System.out.println("*********************************************");

		// Compares Expected to Actual Name 4.
		if (expectedOdroidName4.equals(actualOdroidName4)) {
			System.out.println("Item 4 Name");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualOdroidName4);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedOdroidName4);
		} else {
			System.out.println("FAIL");
			System.out.println("Item 4 Name");
			System.out.println("Actual result is: " + actualOdroidName4);
			System.out.println("Expected result is: " + expectedOdroidName4);
		}
		System.out.println("***************************************************");

		// ********5

		// Compares Expected to Actual Price 5.
		if (expectedOdroidPrice5.equals(actualOdroidPrice5)) {
			System.out.println("Item 5 Price");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualOdroidPrice5);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedOdroidPrice5);
		} else {
			System.out.println("FAIL");
			System.out.println("Item 5 Price");
			System.out.println("Actual result is: " + actualOdroidPrice5);
			System.out.println("Expected result is: " + expectedOdroidPrice5);
		}
		System.out.println("*********************************************");

		// Compares Expected to Actual Name 5.
		if (expectedOdroidName5.equals(actualOdroidName5)) {
			System.out.println("Item 5 Name");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualOdroidName5);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedOdroidName5);
		} else {
			System.out.println("FAIL");
			System.out.println("Item 5 Name");
			System.out.println("Actual result is: " + actualOdroidName5);
			System.out.println("Expected result is: " + expectedOdroidName5);
		}
		System.out.println("***************************************************");

// ********************************************************************ODROID*********************************************************************
		// Driver Selects which "Brand" is needed
		driver.findElement(By.xpath(
				"//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/aside/section/ul/li[3]/div/div/div/ul/li[23]/label/span"))
				.click();
		Thread.sleep(2000);

		// ********************************************************************OCTAVO*********************************************************************
		System.out.println("******************************************************************************OCTAVO");
		// Driver Selects which "Brand" is needed
		driver.findElement(By.xpath(
				"//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/aside/section/ul/li[3]/div/div/div/ul/li[22]/label/span"))
				.click();
		Thread.sleep(2000);

		// Load more
		// driver.findElement(By.xpath("//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/div/section/div/button")).click();

		Thread.sleep(4000);

		// Find all elements with class named "_2BULo" and put them in a list.
		List<WebElement> Octavo = driver.findElements(By.className("_2BULo"));

		// Find all elements with class named "_2BULo" and put them in a list.
		List<WebElement> OctavoPrice = driver.findElements(By.className("_23ArP"));

		// place expected and actual Names into value into strings.

		String actualOctavoName1 = Octavo.get(0).getText();

		String actualOctavoPrice1 = OctavoPrice.get(0).getText();

		// add expected result

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
				"//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/aside/section/ul/li[3]/div/div/div/ul/li[22]/label/span"))
				.click();
		Thread.sleep(2000);
		// ********************************************************************NanoPC*********************************************************************

		// Driver Selects which "Brand" is needed
		driver.findElement(By.xpath(
				"//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/aside/section/ul/li[3]/div/div/div/ul/li[21]/label/span"))
				.click();
		Thread.sleep(2000);

		System.out.println("******************************************************************************NANOPC");
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

		// add expected result

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

		// add expected result

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
		driver.findElement(By.xpath(
				"//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/aside/section/ul/li[3]/div/div/div/ul/li[20]/label/span"))
				.click();
		Thread.sleep(2000);

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
		// String actualMediaTek2 = MediaTek.get(1).getText();

		String actualMediaTekPrice1 = MediaTekPrice.get(0).getText();
		// String actualMediaTekPrice2 = MediaTekPrice.get(1).getText();

		// add expected result

		String expectedMediaTek1 = "MediaTek X20 Development Board";
		// String expectedMediaTek2 = "MediaTek Turbot Dual-Core / Dual-Ethernet
		// Dual-Core";

		String expectedMediaTekPrice1 = "$199.00";
		// String expectedMediaTekPrice2 = "$199.00";

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

		// ********************************************************************LinkSprite*********************************************************************

		// Driver Selects which "Brand" is needed
		driver.findElement(By.xpath(
				"//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/aside/section/ul/li[3]/div/div/div/ul/li[18]/label/span"))
				.click();
		Thread.sleep(2000);
		System.out.println("******************************************************************************LINKSPRITE");
		// Load more
		// driver.findElement(By.xpath("//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/div/section/div/button")).click();

		Thread.sleep(4000);

		// Find all elements with class named "_2BULo" and put them in a list.
		List<WebElement> LinkSprite = driver.findElements(By.className("_2BULo"));

		// System.out.println("LinkSprite all-products quantity " +
		// (LinkSprite.size()));

		// Thread.sleep(2500);

		// Find all elements with class named "_2BULo" and put them in a list.
		List<WebElement> LinkSpritePrice = driver.findElements(By.className("_23ArP"));

		// place expected and actual Names into value into strings.

		String actualLinkSprite1 = LinkSprite.get(0).getText();
		String actualLinkSprite2 = LinkSprite.get(1).getText();
		String actualLinkSprite3 = LinkSprite.get(2).getText();

		String actualLinkSpritePrice1 = LinkSpritePrice.get(0).getText();
		String actualLinkSpritePrice2 = LinkSpritePrice.get(1).getText();
		String actualLinkSpritePrice3 = LinkSpritePrice.get(2).getText();

		// add expected result

		String expectedLinkSprite1 = "pcDuino8 Uno";
		String expectedLinkSprite2 = "LinkSprite Acadia V3";
		String expectedLinkSprite3 = "LinkSprite Arches";

		String expectedLinkSpritePrice1 = "$49.00";
		String expectedLinkSpritePrice2 = "$119.00";
		String expectedLinkSpritePrice3 = "$95.00";

		// Compares Expected to Actual Price 1.

		if (expectedLinkSpritePrice1.equals(actualLinkSpritePrice1)) {
			System.out.println("Item 1 Price");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualLinkSpritePrice1);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedLinkSpritePrice1);
		} else {
			System.out.println("FAIL");
			System.out.println("Item 1 Price");
			System.out.println("Actual result is: " + actualLinkSpritePrice1);
			System.out.println("Expected result is: " + expectedLinkSpritePrice1);
		}
		System.out.println("*********************************************");

		// Compares Expected to Actual Name 1.
		if (expectedLinkSprite1.equals(actualLinkSprite1)) {
			System.out.println("Item 1 Name ");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualLinkSprite1);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedLinkSprite1);
		} else {
			System.out.println("FAIL");
			System.out.println("Item 1 Name ");
			System.out.println("Actual result is: " + actualLinkSprite1);
			System.out.println("Expected result is: " + expectedLinkSprite1);
		}
		System.out.println("***************************************************");

		// ********2

		// Compares Expected to Actual Price 2.
		if (expectedLinkSpritePrice2.equals(actualLinkSpritePrice2)) {
			System.out.println("Item 2 Price");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualLinkSpritePrice2);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedLinkSpritePrice2);
		} else {
			System.out.println("FAIL");
			System.out.println("Item 2 Price");
			System.out.println("Actual result is: " + actualLinkSpritePrice2);
			System.out.println("Expected result is: " + expectedLinkSpritePrice2);
		}
		System.out.println("*********************************************");

		// Compares Expected to Actual Name 2.
		if (expectedLinkSprite2.equals(actualLinkSprite2)) {
			System.out.println("Item 2 Name");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualLinkSprite2);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedLinkSprite2);
		} else {
			System.out.println("FAIL");
			System.out.println("Item 2 Name");
			System.out.println("Actual result is: " + actualLinkSprite2);
			System.out.println("Expected result is: " + expectedLinkSprite2);
		}
		System.out.println("***************************************************");

		// ********3

		// Compares Expected to Actual Price 3.
		if (expectedLinkSpritePrice3.equals(actualLinkSpritePrice3)) {
			System.out.println("Item 3 Price");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualLinkSpritePrice3);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedLinkSpritePrice3);
		} else {
			System.out.println("FAIL");
			System.out.println("Item 3 Price");
			System.out.println("Actual result is: " + actualLinkSpritePrice3);
			System.out.println("Expected result is: " + expectedLinkSpritePrice3);
		}
		System.out.println("******************************");

		// Compares Expected to Actual Name 3.
		if (expectedLinkSprite3.equals(actualLinkSprite3)) {
			System.out.println("Item 3 Name");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualLinkSprite3);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedLinkSprite3);
		} else {
			System.out.println("FAIL");
			System.out.println("Item 3 Name");
			System.out.println("Actual result is: " + actualLinkSprite3);
			System.out.println("Expected result is: " + expectedLinkSprite3);
		}
		System.out.println("***************************************************");
		// ********************************************************************LinkSprite*********************************************************************

		// Driver Selects which "Brand" is needed
		driver.findElement(By.xpath(
				"//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/aside/section/ul/li[3]/div/div/div/ul/li[18]/label/span"))
				.click();
		Thread.sleep(2000);

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

		// add expected result

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
		// String actualLibre2 = Libre.get(1).getText();
		// String actualLibre3 = Libre.get(2).getText();

		String actualLibrePrice1 = LibrePrice.get(0).getText();
		// String actualLibrePrice2 = LibrePrice.get(1).getText();
		// String actualLibrePrice3 = LibrePrice.get(2).getText();

		// add expected result

		String expectedLibre1 = "Libre Computer Board (Le Potato)";
		// String expectedLibre2 = "Libre Acadia V3";
		// String expectedLibre3 = "Libre Arches";

		String expectedLibrePrice1 = "$35.00";
		// String expectedLibrePrice2 = "$119.00";
		// String expectedLibrePrice3 = "$95.00";

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

		driver.quit();

	}
}
