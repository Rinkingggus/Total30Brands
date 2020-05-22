import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex91 {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		String title;
		System.setProperty("webdriver.chrome.driver", "/Users/Rinking/Documents/Selenium/chromedriver");
		driver = new ChromeDriver();

		driver.get("https://kamenkaksk.wixsite.com/wwes-13-1");
		// driver.get("https://vk.com/");

		// title=driver.getTitle();
		Thread.sleep(1000);
		// System.out.println(title);

		String expectedTitle1 = "HOME | WWES-13 v.1.0";
		String expectedTitle2 = "ALL PRODUCTS | WWES-13 v.1.0";
		String expectedTitle3 = "SINGLE BOARD COMPUTERS | WWES-13 v.1.0";
		String expectedTitle4 = "NEW PRODUCTS | WWES-13 v.1.0";
		String expectedTitle5 = "BESTSELLERS | WWES-13 v.1.0";
		String expectedTitle6 = "SALE | WWES-13 v.1.0";
		String expectedTitle7 = "FORUM | WWES-13 v.1.0";
		String expectedTitle8 = "ABOUT | WWES-13 v.1.0";

		String expectedUrl1 = "https://kamenkaksk.wixsite.com/wwes-13-11";
		String expectedUrl2 = "https://kamenkaksk.wixsite.com/wwes-13-1/all-products1";
		String expectedUrl3 = "https://kamenkaksk.wixsite.com/wwes-13-1/singleboardcomputers1";
		String expectedUrl4 = "https://kamenkaksk.wixsite.com/wwes-13-1/newproducts1";
		String expectedUrl5 = "https://kamenkaksk.wixsite.com/wwes-13-1/bestsellers1";
		String expectedUrl6 = "https://kamenkaksk.wixsite.com/wwes-13-1/sale1";
		String expectedUrl7 = "https://kamenkaksk.wixsite.com/wwes-13-1/forum1";
		String expectedUrl8 = "https://kamenkaksk.wixsite.com/wwes-13-1/about1";

		// String expectedUrl1= "https://kamenkaksk.wixsite.com/wwes-13-1";
		// String expectedUrl2= "https://kamenkaksk.wixsite.com/wwes-13-1/all-products";

		driver.findElement(By.xpath("//*[@id=\"comp-jcfv4kob0label\"]")).click();
		Thread.sleep(1000);
		String actualTitle1 = driver.getTitle();
		String actualUrl1 = driver.getCurrentUrl();

		// Test Case 001- verification 1st main menu tab TITLE
		System.out.println("Test Case 001 - verification 1st main menu tab TITLE");
		if (expectedTitle1.equals(actualTitle1)) {
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualTitle1);
			System.out.println("Expected result is: " + expectedTitle1);
		} else {
			System.out.println("FAIL");
			System.out.println("Actual result is: " + actualTitle1);
			System.out.println("Expected result is: " + expectedTitle1);
		}
		System.out.println("***************************************************");

		// Test Case 002- verification 1st main menu tab URL
		System.out.println("Test Case 002 - verification 1st main menu tab URL");
		if (expectedUrl1.equals(actualUrl1)) {
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualUrl1);
			System.out.println("Expected result is: " + expectedUrl1);
		} else {
			System.out.println("FAIL");
			System.out.println("Actual result is: " + actualUrl1);
			System.out.println("Expected result is: " + expectedUrl1);
		}
		System.out.println("***************************************************");

//2

		driver.findElement(By.xpath("//*[@id=\"comp-jcfv4kob1label\"]")).click();
		Thread.sleep(2000);
		String actualTitle2 = driver.getTitle();
		String actualUrl2 = driver.getCurrentUrl();

		// Test Case 003- verification 2nd main menu tab TITLE
		System.out.println("Test Case 003 - verification 2nd main menu tab TITLE");
		if (expectedTitle2.equals(actualTitle2)) {
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualTitle2);
			System.out.println("Expected result is: " + expectedTitle2);
		} else {
			System.out.println("FAIL");
			System.out.println("Actual result is: " + actualTitle2);
			System.out.println("Expected result is: " + expectedTitle2);
		}
		System.out.println("***************************************************");

		// Test Case 004- verification 2nd main menu tab URL
		System.out.println("Test Case 004 - verification 2nd main menu tab URL");
		if (expectedUrl1.equals(actualUrl1)) {
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualUrl2);
			System.out.println("Expected result is: " + expectedUrl2);
		} else {
			System.out.println("FAIL");
			System.out.println("Actual result is: " + actualUrl2);
			System.out.println("Expected result is: " + expectedUrl2);
		}
		System.out.println("***************************************************");

//3

		driver.findElement(By.xpath("//*[@id=\"comp-jcfv4kob2label\"]")).click();
		Thread.sleep(2000);
		String actualTitle3 = driver.getTitle();
		String actualUrl3 = driver.getCurrentUrl();

		// Test Case 005- verification 3rd main menu tab TITLE
		System.out.println("Test Case 005 - verification 3rd main menu tab TITLE");
		if (expectedTitle3.equals(actualTitle3)) {
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualTitle3);
			System.out.println("Expected result is: " + expectedTitle3);
		} else {
			System.out.println("FAIL");
			System.out.println("Actual result is: " + actualTitle3);
			System.out.println("Expected result is: " + expectedTitle3);
		}
		System.out.println("***************************************************");

		// Test Case 006- verification 3rd main menu tab URL
		System.out.println("Test Case 006 - verification 3rd main menu tab URL");
		if (expectedUrl1.equals(actualUrl1)) {
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualUrl3);
			System.out.println("Expected result is: " + expectedUrl3);
		} else {
			System.out.println("FAIL");
			System.out.println("Actual result is: " + actualUrl3);
			System.out.println("Expected result is: " + expectedUrl3);
		}
		System.out.println("***************************************************");

//4

		driver.findElement(By.xpath("//*[@id=\"comp-jcfv4kob3label\"]")).click();
		Thread.sleep(2000);
		String actualTitle4 = driver.getTitle();
		String actualUrl4 = driver.getCurrentUrl();

		// Test Case 007- verification 4th main menu tab TITLE
		System.out.println("Test Case 007 - verification 4th main menu tab TITLE");
		if (expectedTitle4.equals(actualTitle4)) {
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualTitle4);
			System.out.println("Expected result is: " + expectedTitle4);
		} else {
			System.out.println("FAIL");
			System.out.println("Actual result is: " + actualTitle4);
			System.out.println("Expected result is: " + expectedTitle4);
		}
		System.out.println("***************************************************");

		// Test Case 008- verification 4th main menu tab URL
		System.out.println("Test Case 008 - verification 4th main menu tab URL");
		if (expectedUrl4.equals(actualUrl4)) {
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualUrl4);
			System.out.println("Expected result is: " + expectedUrl4);
		} else {
			System.out.println("FAIL");
			System.out.println("Actual result is: " + actualUrl4);
			System.out.println("Expected result is: " + expectedUrl4);
		}
		System.out.println("***************************************************");

//5								

		driver.findElement(By.xpath("//*[@ id=\"comp-jcfv4kob4label\"]")).click();
		Thread.sleep(2000);
		String actualTitle5 = driver.getTitle();
		String actualUrl5 = driver.getCurrentUrl();

		// Test Case 009- verification 5th main menu tab TITLE
		System.out.println("Test Case 009 - verification 5th main menu tab TITLE");
		if (expectedTitle5.equals(actualTitle5)) {
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualTitle5);
			System.out.println("Expected result is: " + expectedTitle5);
		} else {
			System.out.println("FAIL");
			System.out.println("Actual result is: " + actualTitle5);
			System.out.println("Expected result is: " + expectedTitle5);
		}
		System.out.println("***************************************************");

		// Test Case 010- verification 5th main menu tab URL
		System.out.println("Test Case 010 - verification 5th main menu tab URL");
		if (expectedUrl4.equals(actualUrl4)) {
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualUrl5);
			System.out.println("Expected result is: " + expectedUrl5);
		} else {
			System.out.println("FAIL");
			System.out.println("Actual result is: " + actualUrl5);
			System.out.println("Expected result is: " + expectedUrl5);
		}
		System.out.println("***************************************************");

//6									

		driver.findElement(By.xpath("//*[@ id=\"comp-jcfv4kob5label\"]")).click();
		Thread.sleep(2000);
		String actualTitle6 = driver.getTitle();
		String actualUrl6 = driver.getCurrentUrl();

//Test Case 011- verification 6th main menu tab TITLE
		System.out.println("Test Case 011 - verification 6th main menu tab TITLE");
		if (expectedTitle6.equals(actualTitle6)) {
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualTitle6);
			System.out.println("Expected result is: " + expectedTitle6);
		} else {
			System.out.println("FAIL");
			System.out.println("Actual result is: " + actualTitle6);
			System.out.println("Expected result is: " + expectedTitle6);
		}
		System.out.println("***************************************************");

//Test Case 012- verification 6th main menu tab URL
		System.out.println("Test Case 012 - verification 6th main menu tab URL");
		if (expectedUrl6.equals(actualUrl6)) {
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualUrl6);
			System.out.println("Expected result is: " + expectedUrl6);
		} else {
			System.out.println("FAIL");
			System.out.println("Actual result is: " + actualUrl6);
			System.out.println("Expected result is: " + expectedUrl6);
		}
		System.out.println("***************************************************");

//7

		driver.findElement(By.xpath("//*[@ id=\"comp-jcfv4kob6label\"]")).click();
		Thread.sleep(2000);
		String actualTitle7 = driver.getTitle();
		String actualUrl7 = driver.getCurrentUrl();

//Test Case 013- verification 7th main menu tab TITLE
		System.out.println("Test Case 013 - verification 7th main menu tab TITLE");
		if (expectedTitle7.equals(actualTitle7)) {
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualTitle7);
			System.out.println("Expected result is: " + expectedTitle7);
		} else {
			System.out.println("FAIL");
			System.out.println("Actual result is: " + actualTitle7);
			System.out.println("Expected result is: " + expectedTitle7);
		}
		System.out.println("***************************************************");

//Test Case 014- verification 7th main menu tab URL
		System.out.println("Test Case 014 - verification 7th main menu tab URL");
		if (expectedUrl7.equals(actualUrl7)) {
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualUrl7);
			System.out.println("Expected result is: " + expectedUrl7);
		} else {
			System.out.println("FAIL");
			System.out.println("Actual result is: " + actualUrl7);
			System.out.println("Expected result is: " + expectedUrl7);
		}
		System.out.println("***************************************************");

//8

		driver.findElement(By.xpath("//*[@ id=\"comp-jcfv4kob7label\"]")).click();
		Thread.sleep(2000);
		String actualTitle8 = driver.getTitle();
		String actualUrl8 = driver.getCurrentUrl();

//Test Case 015- verification 8th main menu tab TITLE
		System.out.println("Test Case 015 - verification 8th main menu tab TITLE");
		if (expectedTitle8.equals(actualTitle8)) {
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualTitle8);
			System.out.println("Expected result is: " + expectedTitle8);
		} else {
			System.out.println("FAIL");
			System.out.println("Actual result is: " + actualTitle8);
			System.out.println("Expected result is: " + expectedTitle8);
		}
		System.out.println("***************************************************");

//Test Case 016- verification 8th main menu tab URL
		System.out.println("Test Case 016 - verification 8th main menu tab URL");
		if (expectedUrl8.equals(actualUrl8)) {
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualUrl8);
			System.out.println("Expected result is: " + expectedUrl8);
		} else {
			System.out.println("FAIL");
			System.out.println("Actual result is: " + actualUrl8);
			System.out.println("Expected result is: " + expectedUrl8);
		}
		System.out.println("***************************************************");

		driver.close();
	}
}
