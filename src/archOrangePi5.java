import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class archOrangePi5 {
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

		String actualName1 = OrangePi.get(0).getText();
		String actualName2 = OrangePi.get(1).getText();
		String actualName3 = OrangePi.get(2).getText();
		String actualName4 = OrangePi.get(3).getText();
		String actualName5 = OrangePi.get(4).getText();
		String actualName6 = OrangePi.get(5).getText();
		String actualName7 = OrangePi.get(6).getText();
		String actualName8 = OrangePi.get(7).getText();
		String actualName9 = OrangePi.get(8).getText();
		String actualName10 = OrangePi.get(9).getText();
		String actualName11 = OrangePi.get(10).getText();
		String actualName12 = OrangePi.get(11).getText();
		String actualName13 = OrangePi.get(12).getText();
		String actualName14 = OrangePi.get(13).getText();
		String actualName15 = OrangePi.get(14).getText();

		String actualPrice1 = OrangePiPrice.get(0).getText();
		String actualPrice2 = OrangePiPrice.get(1).getText();
		String actualPrice3 = OrangePiPrice.get(2).getText();
		String actualPrice4 = OrangePiPrice.get(3).getText();
		String actualPrice5 = OrangePiPrice.get(4).getText();
		String actualPrice6 = OrangePiPrice.get(5).getText();
		String actualPrice7 = OrangePiPrice.get(6).getText();
		String actualPrice8 = OrangePiPrice.get(7).getText();
		String actualPrice9 = OrangePiPrice.get(8).getText();
		String actualPrice10 = OrangePiPrice.get(9).getText();
		String actualPrice11 = OrangePiPrice.get(10).getText();
		String actualPrice12 = OrangePiPrice.get(11).getText();
		String actualPrice13 = OrangePiPrice.get(12).getText();
		String actualPrice14 = OrangePiPrice.get(13).getText();
		String actualPrice15 = OrangePiPrice.get(14).getText();

//add expected result
		String expectedName1 = "Orange Pi Zero H2+ / Zero Plus 2 H3 / Zero Plus 2 H5";
		String expectedName2 = "Orange Pi Win Plus / Win";
		String expectedName3 = "Orange Pi RK3399";
		String expectedName4 = "Orange Pi R1";
		String expectedName5 = "Orange Pi Prime";
		String expectedName6 = "Orange Pi Plus2 / Plus2E";
		String expectedName7 = "Orange Pi PC 2";
		String expectedName8 = "Orange Pi PC / PC Plus";
		String expectedName9 = "Orange Pi One Plus";
		String expectedName10 = "Orange Pi Lite2";
		String expectedName11 = "Orange Pi Lite";
		String expectedName12 = "Orange Pi i96";
		String expectedName13 = "Orange Pi 4G-IOT";
		String expectedName14 = "Orange Pi 3G-IOT";
		String expectedName15 = "Orange Pi 2G-IOT";

		String expectedPrice1 = "$8.50";
		String expectedPrice2 = "$36.90";
		String expectedPrice3 = "$109.00";
		String expectedPrice4 = "$13.90";
		String expectedPrice5 = "$35.90";
		String expectedPrice6 = "$49.00";
		String expectedPrice7 = "$20.00";
		String expectedPrice8 = "$15.00";
		String expectedPrice9 = "$20.00";
		String expectedPrice10 = "$25.00";
		String expectedPrice11 = "$12.00";
		String expectedPrice12 = "$8.80";
		String expectedPrice13 = "$45.00";
		String expectedPrice14 = "$24.90";
		String expectedPrice15 = "$9.90";

		// Compares Expected to Actual 1.

		if (expectedPrice1.equals(actualPrice1)) {
			System.out.println("Item 1 Price");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualPrice1);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedPrice1);
		} else {
			System.out.println("FAIL");
			System.out.println("Item 1 Price");
			System.out.println("Actual result is: " + actualPrice1);
			System.out.println("Expected result is: " + expectedPrice1);
		}
		System.out.println("***************************************************");

		// Compares Expected to Actual Price 1.
		if (expectedName1.equals(actualName1)) {
			System.out.println("Item 1 Name");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualName1);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedName1);
		} else {
			System.out.println("Item 1 Name");
			System.out.println("FAIL");
			
			System.out.println("Actual result is: " + actualName1);
			System.out.println("Expected result is: " + expectedName1);
		}
		System.out.println("***************************************************");

		
		
		// Compares Expected to Actual 2.

		if (expectedPrice2.equals(actualPrice2)) {
			System.out.println("Item 2 Price");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualPrice2);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedPrice2);
		} else {
			System.out.println("Item 2 Price");
			System.out.println("FAIL");
			
			System.out.println("Actual result is: " + actualPrice2);
			System.out.println("Expected result is: " + expectedPrice2);
		}
		System.out.println("***************************************************");

		// Compares Expected to Actual Price 2.
		if (expectedName2.equals(actualName2)) {
			System.out.println("Item 2 Name");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualName2);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedName2);
		} else {
			System.out.println("Item 2 Name");
			System.out.println("FAIL");
			
			System.out.println("Actual result is: " + actualName2);
			System.out.println("Expected result is: " + expectedName2);
		}
		System.out.println("***************************************************");

		
		
		// Compares Expected to Actual 3.

		if (expectedPrice3.equals(actualPrice3)) {
			System.out.println("Item 3 Price");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualPrice3);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedPrice3);
		} else {
			System.out.println("Item 3 Price");
			System.out.println("FAIL");
			
			System.out.println("Actual result is: " + actualPrice3);
			System.out.println("Expected result is: " + expectedPrice3);
		}
		System.out.println("***************************************************");

		// Compares Expected to Actual Price 3.
		if (expectedName3.equals(actualName3)) {
			System.out.println("Item 3 Name");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualName3);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedName3);
		} else {
			System.out.println("Item 3 Name");
			System.out.println("FAIL");
		
			System.out.println("Actual result is: " + actualName3);
			System.out.println("Expected result is: " + expectedName3);
		}
		System.out.println("***************************************************");

		
		
		// Compares Expected to Actual 4.

		if (expectedPrice4.equals(actualPrice4)) {
			System.out.println("Item 4 Price");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualPrice4);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedPrice4);
		} else {
			System.out.println("Item 4 Price");
			System.out.println("FAIL");
			
			System.out.println("Actual result is: " + actualPrice4);
			System.out.println("Expected result is: " + expectedPrice4);
		}
		System.out.println("***************************************************");

		// Compares Expected to Actual Price 4.
		if (expectedName4.equals(actualName4)) {
			System.out.println("Item 4 Name");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualName4);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedName4);
		} else {
			System.out.println("Item 4 Name");
			System.out.println("FAIL");
			
			System.out.println("Actual result is: " + actualName4);
			System.out.println("Expected result is: " + expectedName4);
		}
		System.out.println("***************************************************");		
		
		
		
		// Compares Expected to Actual 5.

		if (expectedPrice5.equals(actualPrice5)) {
			System.out.println("Item 5 Price");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualPrice5);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedPrice5);
		} else {
			System.out.println("Item 5 Price");
			System.out.println("FAIL");
			
			System.out.println("Actual result is: " + actualPrice5);
			System.out.println("Expected result is: " + expectedPrice5);
		}
		System.out.println("***************************************************");

		// Compares Expected to Actual Price 5.
		if (expectedName5.equals(actualName5)) {
			System.out.println("Item 5 Name");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualName5);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedName5);
		} else {
			System.out.println("Item 5 Name");
			System.out.println("FAIL");
			
			System.out.println("Actual result is: " + actualName5);
			System.out.println("Expected result is: " + expectedName5);
		}
		System.out.println("***************************************************");		
		
		
		
		
		// Compares Expected to Actual 6.

		if (expectedPrice6.equals(actualPrice6)) {
			System.out.println("Item 6 Price");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualPrice6);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedPrice6);
		} else {
			System.out.println("Item 6 Price");
			System.out.println("FAIL");
			
			System.out.println("Actual result is: " + actualPrice6);
			System.out.println("Expected result is: " + expectedPrice6);
		}
		System.out.println("***************************************************");

		// Compares Expected to Actual Price 6.
		if (expectedName6.equals(actualName6)) {
			System.out.println("Item 6 Name");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualName6);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedName6);
		} else {
			System.out.println("Item 6 Name");
			System.out.println("FAIL");
			
			System.out.println("Actual result is: " + actualName6);
			System.out.println("Expected result is: " + expectedName6);
		}
		System.out.println("***************************************************");		
		
		
		
		
		
		// Compares Expected to Actual 7.

		if (expectedPrice7.equals(actualPrice7)) {
			System.out.println("Item 7 Price");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualPrice7);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedPrice7);
		} else {
			System.out.println("Item 7 Price");
			System.out.println("FAIL");
			
			System.out.println("Actual result is: " + actualPrice7);
			System.out.println("Expected result is: " + expectedPrice7);
		}
		System.out.println("***************************************************");

		// Compares Expected to Actual Price 7.
		if (expectedName7.equals(actualName7)) {
			System.out.println("Item 7 Name");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualName7);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedName7);
		} else {
			System.out.println("Item 7 Name");
			System.out.println("FAIL");
		
			System.out.println("Actual result is: " + actualName7);
			System.out.println("Expected result is: " + expectedName7);
		}
		System.out.println("***************************************************");		
		
		
		
		
		
		// Compares Expected to Actual 8.

		if (expectedPrice8.equals(actualPrice8)) {
			System.out.println("Item 8 Price");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualPrice8);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedPrice8);
		} else {
			System.out.println("Item 8 Price");
			System.out.println("FAIL");
			
			System.out.println("Actual result is: " + actualPrice8);
			System.out.println("Expected result is: " + expectedPrice8);
		}
		System.out.println("***************************************************");

		// Compares Expected to Actual Price 8.
		if (expectedName8.equals(actualName8)) {
			System.out.println("Item 8 Name");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualName8);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedName8);
		} else {
			System.out.println("Item 8 Name");
			System.out.println("FAIL");
			
			System.out.println("Actual result is: " + actualName8);
			System.out.println("Expected result is: " + expectedName8);
		}
		System.out.println("***************************************************");		
		
		
		
		
		// Compares Expected to Actual 9.

		if (expectedPrice9.equals(actualPrice9)) {
			System.out.println("Item 9 Price");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualPrice9);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedPrice9);
		} else {
			System.out.println("Item 9 Price");
			System.out.println("FAIL");
		
			System.out.println("Actual result is: " + actualPrice9);
			System.out.println("Expected result is: " + expectedPrice9);
		}
		System.out.println("***************************************************");

		// Compares Expected to Actual Price 9.
		if (expectedName9.equals(actualName9)) {
			System.out.println("Item 9 Name");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualName9);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedName9);
		} else {
			System.out.println("Item 9 Name");
			System.out.println("FAIL");
		
			System.out.println("Actual result is: " + actualName9);
			System.out.println("Expected result is: " + expectedName9);
		}
		System.out.println("***************************************************");				
		
		
		
		
		
		
		// Compares Expected to Actual 10.

		if (expectedPrice10.equals(actualPrice10)) {
			System.out.println("Item 10 Price");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualPrice10);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedPrice10);
		} else {
			System.out.println("Item 10 Price");
			System.out.println("FAIL");
			
			System.out.println("Actual result is: " + actualPrice10);
			System.out.println("Expected result is: " + expectedPrice10);
		}
		System.out.println("***************************************************");

		// Compares Expected to Actual Price 10.
		if (expectedName10.equals(actualName10)) {
			System.out.println("Item 10 Name");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualName10);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedName10);
		} else {
			System.out.println("Item 10 Name");
			System.out.println("FAIL");
		
			System.out.println("Actual result is: " + actualName10);
			System.out.println("Expected result is: " + expectedName10);
		}
		System.out.println("***************************************************");	
		
		
		
		
		// Compares Expected to Actual 11.

		if (expectedPrice11.equals(actualPrice11)) {
			System.out.println("Item 11 Price");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualPrice11);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedPrice11);
		} else {
			System.out.println("Item 11 Price");
			System.out.println("FAIL");
			
			System.out.println("Actual result is: " + actualPrice11);
			System.out.println("Expected result is: " + expectedPrice11);
		}
		System.out.println("***************************************************");

		// Compares Expected to Actual Price 11.
		if (expectedName11.equals(actualName11)) {
			System.out.println("Item 11 Name");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualName11);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedName11);
		} else {
			System.out.println("Item 11 Name");
			System.out.println("FAIL");
		
			System.out.println("Actual result is: " + actualName11);
			System.out.println("Expected result is: " + expectedName11);
		}
		System.out.println("***************************************************");			
		

		
		
		
		
		// Compares Expected to Actual 12.

		if (expectedPrice12.equals(actualPrice12)) {
			System.out.println("Item 12 Price");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualPrice12);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedPrice12);
		} else {
			System.out.println("Item 12 Price");
			System.out.println("FAIL");
			
			System.out.println("Actual result is: " + actualPrice12);
			System.out.println("Expected result is: " + expectedPrice12);
		}
		System.out.println("***************************************************");

		// Compares Expected to Actual Price 12.
		if (expectedName12.equals(actualName12)) {
			System.out.println("Item 12 Name");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualName12);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedName12);
		} else {
			System.out.println("Item 12 Name");
			System.out.println("FAIL");
	
			System.out.println("Actual result is: " + actualName12);
			System.out.println("Expected result is: " + expectedName12);
		}
		System.out.println("***************************************************");	
		
		
		
		
		
		
		// Compares Expected to Actual 13.

		if (expectedPrice13.equals(actualPrice13)) {
			System.out.println("Item 13 Price");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualPrice13);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedPrice13);
		} else {
			System.out.println("Item 13 Price");
			System.out.println("FAIL");
		
			System.out.println("Actual result is: " + actualPrice13);
			System.out.println("Expected result is: " + expectedPrice13);
		}
		System.out.println("***************************************************");

		// Compares Expected to Actual Price 13.
		if (expectedName13.equals(actualName13)) {
			System.out.println("Item 13 Name");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualName13);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedName13);
		} else {
			System.out.println("Item 13 Name");
			System.out.println("FAIL");
			
			System.out.println("Actual result is: " + actualName13);
			System.out.println("Expected result is: " + expectedName13);
		}
		System.out.println("***************************************************");	
		
		
		
		
		
		
		// Compares Expected to Actual 14.

		if (expectedPrice14.equals(actualPrice14)) {
			System.out.println("Item 14 Price");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualPrice14);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedPrice14);
		} else {
			System.out.println("Item 14 Price");
			System.out.println("FAIL");
			
			System.out.println("Actual result is: " + actualPrice14);
			System.out.println("Expected result is: " + expectedPrice14);
		}
		System.out.println("***************************************************");

		// Compares Expected to Actual Price 14.
		if (expectedName14.equals(actualName14)) {
			System.out.println("Item 14 Name");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualName14);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedName14);
		} else {
			System.out.println("Item 14 Name");
			System.out.println("FAIL");
			
			System.out.println("Actual result is: " + actualName14);
			System.out.println("Expected result is: " + expectedName14);
		}
		System.out.println("***************************************************");	
		
		
		
		
		
		// Compares Expected to Actual 15.

		if (expectedPrice15.equals(actualPrice15)) {
			System.out.println("Item 15 Price");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualPrice15);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedPrice15);
		} else {
			System.out.println("Item 15 Price");
			System.out.println("FAIL");
			
			System.out.println("Actual result is: " + actualPrice15);
			System.out.println("Expected result is: " + expectedPrice15);
		}
		System.out.println("***************************************************");

		// Compares Expected to Actual Price 15.
		if (expectedName15.equals(actualName15)) {
			System.out.println("Item 15 Name");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualName15);
			// Print number of List Elements
			System.out.println("Expected result is: " + expectedName15);
		} else {
			System.out.println("Item 15 Name");
			System.out.println("FAIL");
			
			System.out.println("Actual result is: " + actualName15);
			System.out.println("Expected result is: " + expectedName15);
		}
		System.out.println("***************************************************");			
		
		
		
		// Press Command+Shift+F to even-out text
		// Double click word to highlight
		// Command+F to replace all words

		driver.quit();
	}
}
