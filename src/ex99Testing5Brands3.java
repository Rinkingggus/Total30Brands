import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex99Testing5Brands3 {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/Rinking/Documents/Selenium/chromedriver");
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

//Open needed web-application
		driver.get("https://kamenkaksk.wixsite.com/wwes-13-1");
		driver.manage().window().maximize();

		Thread.sleep(3000);

//Driver finds and clicks on AllProducts Tab.
		driver.findElement(By.xpath("//*[@id=\"comp-jcfv4kob1label\"]")).click();
		Thread.sleep(3000);
		
		// find Element [BRAND] by xpath and click on it
		driver.findElement(By.xpath("//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/aside/section/ul/li[3]/button")).click();
	
		Thread.sleep(3000);
//**********************************************************************ARDUINO***************************************************************
		driver.findElement(By.xpath("//label/span[contains(text(),'Arduino')]")).click();
		Thread.sleep(3000);
		
		String expectedArduinoName1 = "Arduino Tian";
		String expectedArduinoName2 = "Arduino Yun / Yun PoE";
		String expectedArduinoName3 = "Arduino Industrial 101";

		String expectedArduinoPrice1 = "$76.56";
		String expectedArduinoPrice2 = "$78.10";
		String expectedArduinoPrice3 = "$34.65";

	
		// find all elements which has a className= "_2BULo" and put them in the data
		List<WebElement> ArduinoBrandName = driver.findElements(By.className("_2BULo"));
		// create new Variable
		int numberOFArduinoBrandName = ArduinoBrandName.size();
		String ActualArduinoBrandName1 = ArduinoBrandName.get(0).getText();
		String ActualArduinoBrandName2 = ArduinoBrandName.get(1).getText();
		String ActualArduinoBrandName3 = ArduinoBrandName.get(2).getText();

		// Print number of List Elements
		List<WebElement> ArduinoPrice = driver.findElements(By.className("_23ArP"));
		int numberOFArduinoPrice = ArduinoPrice.size();
		String ActualArduinoPrice1 = ArduinoPrice.get(0).getText();
		String ActualArduinoPrice2 = ArduinoPrice.get(1).getText();
		String ActualArduinoPrice3 = ArduinoPrice.get(2).getText();
		System.out.println("check by brand");
		System.out.println("***********************************");



		if (expectedArduinoName1.equals(ActualArduinoBrandName1)) {
		System.out.println("PASS");
		} else {
		System.out.println("FAIL");
		}
		System.out.println("Expected Result: " + expectedArduinoName1);
		System.out.println("Actual Result: " + ActualArduinoBrandName1);


		if (expectedArduinoName2.equals(ActualArduinoBrandName2)) {
		System.out.println("PASS");
		} else {
		System.out.println("Fail");
		}
		System.out.println("Expected Result: " + expectedArduinoName2);
		System.out.println("Actual Result: " + ActualArduinoBrandName2);


		if (expectedArduinoName3.equals(ActualArduinoBrandName3)) {
		System.out.println("PASS");
		} else {
		System.out.println("Fail");
		}
		System.out.println("Expected Result: " + expectedArduinoName3);
		System.out.println("Actual Result: " + ActualArduinoBrandName3);



		System.out.println("check by price");
		System.out.println("***********************************");

		if (expectedArduinoPrice1.equals(ActualArduinoPrice1)) {
		System.out.println("PASS");
		} else {
		System.out.println("FAIL");
		}
		System.out.println("Expected Result: " + expectedArduinoPrice1);
		System.out.println("Actual Result: " + ActualArduinoPrice1);


		if (expectedArduinoPrice2.equals(ActualArduinoPrice2)) {
		System.out.println("PASS");
		} else {
		System.out.println("Fail");
		}
		System.out.println("Expected Result: " + expectedArduinoPrice2);
		System.out.println("Actual Result: " + ActualArduinoPrice2);


		if (expectedArduinoPrice3.equals(ActualArduinoPrice3)) {
		System.out.println("PASS");
		} else {
		System.out.println("Fail");
		}
		System.out.println("Expected Result: " + expectedArduinoPrice3);
		System.out.println("Actual Result: " + ActualArduinoPrice3);

		
//**********************************************************************ARDUINO***************************************************************
	
		driver.findElement(By.xpath("//label/span[contains(text(),'Arduino')]")).click();
		Thread.sleep(3000);

//**********************************************************************BANANA***************************************************************



String expectedBanana_PiName1 = "Banana Pi BPI-M2 Magic";
String expectedBanana_PiName2 = "Banana Pi BPI-M2 Zero";
String expectedBanana_PiName3 = "Banana Pi BPI-M2 Berry";
String expectedBanana_PiName4 = "Banana Pi BPI-W2";
String expectedBanana_PiName5 = "Banana Pro";
String expectedBanana_PiName6 = "Banana Pi BPI-M64";
String expectedBanana_PiName7 = "Banana Pi BPI-M3";
String expectedBanana_PiName8 = "Banana Pi BPI-M2 Ultra";
String expectedBanana_PiName9 = "Banana Pi BPI-M2";




 
String expectedBanana_PiPrice1 = "$21.00";
String expectedBanana_PiPrice2 = "$21.00";
String expectedBanana_PiPrice3 = "$36.00";
String expectedBanana_PiPrice4 = "$93.00";
String expectedBanana_PiPrice5 = "$48.00";
String expectedBanana_PiPrice6 = "$88.00";
String expectedBanana_PiPrice7 = "$79.00";
String expectedBanana_PiPrice8 = "$58.00";
String expectedBanana_PiPrice9 = "$40.00";

Thread.sleep(2500);	
// find Banana Brand and click on it

driver.findElement(By.xpath("//label/span[contains(text(),'Banana Pi')]")).click();
Thread.sleep(3000);

// find all elements which has a className= "_2BULo" and put them in the data
List<WebElement> Banana_PiBrandName = driver.findElements(By.className("_2BULo"));
// create new Variable

int numberOFBanana_PiBrandName = Banana_PiBrandName.size();
String ActualBanana_PiBrandName1 = Banana_PiBrandName.get(0).getText();
String ActualBanana_PiBrandName2 = Banana_PiBrandName.get(1).getText();
String ActualBanana_PiBrandName3 = Banana_PiBrandName.get(2).getText();
String ActualBanana_PiBrandName4 = Banana_PiBrandName.get(3).getText();
String ActualBanana_PiBrandName5 = Banana_PiBrandName.get(4).getText();
String ActualBanana_PiBrandName6 = Banana_PiBrandName.get(5).getText();
String ActualBanana_PiBrandName7 = Banana_PiBrandName.get(6).getText();
String ActualBanana_PiBrandName8 = Banana_PiBrandName.get(7).getText();
String ActualBanana_PiBrandName9 = Banana_PiBrandName.get(8).getText();


// Print number of List Elements
List<WebElement> Banana_PiPrice = driver.findElements(By.className("_23ArP"));
int numberOFBanana_PiPrice = Banana_PiPrice.size();
String ActualBanana_PiPrice1 = Banana_PiPrice.get(0).getText();
String ActualBanana_PiPrice2 = Banana_PiPrice.get(1).getText();
String ActualBanana_PiPrice3 = Banana_PiPrice.get(2).getText();
String ActualBanana_PiPrice4 = Banana_PiPrice.get(3).getText();
String ActualBanana_PiPrice5 = Banana_PiPrice.get(4).getText();
String ActualBanana_PiPrice6 = Banana_PiPrice.get(5).getText();
String ActualBanana_PiPrice7 = Banana_PiPrice.get(6).getText();
String ActualBanana_PiPrice8 = Banana_PiPrice.get(7).getText();
String ActualBanana_PiPrice9 = Banana_PiPrice.get(8).getText();

System.out.println("check by brand");
System.out.println("***********************************");



if (expectedBanana_PiName1.equals(ActualBanana_PiBrandName1)) {
System.out.println("PASS");
} else {
System.out.println("FAIL");
}
System.out.println("Expected Result: " + expectedBanana_PiName1);
System.out.println("Actual Result: " + ActualBanana_PiBrandName1);


if (expectedBanana_PiName2.equals(ActualBanana_PiBrandName2)) {
System.out.println("PASS");
} else {
System.out.println("Fail");
}
System.out.println("Expected Result: " + expectedBanana_PiName2);
System.out.println("Actual Result: " + ActualBanana_PiBrandName2);



if (expectedBanana_PiName3.equals(ActualBanana_PiBrandName3)) {
System.out.println("PASS");
} else {
System.out.println("Fail");
}
System.out.println("Expected Result: " + expectedBanana_PiName3);
System.out.println("Actual Result: " + ActualBanana_PiBrandName3);



if (expectedBanana_PiName4.equals(ActualBanana_PiBrandName4)) {
System.out.println("PASS");
} else {
System.out.println("FAIL");
}
System.out.println("Expected Result: " + expectedBanana_PiName4);
System.out.println("Actual Result: " + ActualBanana_PiBrandName4);



if (expectedBanana_PiName5.equals(ActualBanana_PiBrandName5)) {
System.out.println("PASS");
} else {
System.out.println("FAIL");
}
System.out.println("Expected Result: " + expectedBanana_PiName5);
System.out.println("Actual Result: " + ActualBanana_PiBrandName5);



if (expectedBanana_PiName6.equals(ActualBanana_PiBrandName6)) {
System.out.println("PASS");
} else {
System.out.println("FAIL");
}
System.out.println("Expected Result: " + expectedBanana_PiName6);
System.out.println("Actual Result: " + ActualBanana_PiBrandName6);



if (expectedBanana_PiName7.equals(ActualBanana_PiBrandName7)) {
System.out.println("PASS");
} else {
System.out.println("FAIL");
}
System.out.println("Expected Result: " + expectedBanana_PiName7);
System.out.println("Actual Result: " + ActualBanana_PiBrandName7);


if (expectedBanana_PiName8.equals(ActualBanana_PiBrandName8)) {
System.out.println("PASS");
} else {
System.out.println("FAIL");
}
System.out.println("Expected Result: " + expectedBanana_PiName8);
System.out.println("Actual Result: " + ActualBanana_PiBrandName8);


if (expectedBanana_PiName9.equals(ActualBanana_PiBrandName9)) {
System.out.println("PASS");
} else {
System.out.println("FAIL");
}
System.out.println("Expected Result: " + expectedBanana_PiName9);
System.out.println("Actual Result: " + ActualBanana_PiBrandName9);


System.out.println("check by price");
System.out.println("***********************************");

if (expectedBanana_PiPrice1.equals(ActualBanana_PiPrice1)) {
System.out.println("PASS");
} else {
System.out.println("FAIL");
}
System.out.println("Expected Result: " + expectedBanana_PiPrice1);
System.out.println("Actual Result: " + ActualBanana_PiPrice1);


if (expectedBanana_PiPrice2.equals(ActualBanana_PiPrice2)) {
System.out.println("PASS");
} else {
System.out.println("Fail");
}
System.out.println("Expected Result: " + expectedBanana_PiPrice2);
System.out.println("Actual Result: " + ActualBanana_PiPrice2);


if (expectedBanana_PiPrice3.equals(ActualBanana_PiPrice3)) {
System.out.println("PASS");
} else {
System.out.println("Fail");
}
System.out.println("Expected Result: " + expectedBanana_PiPrice3);
System.out.println("Actual Result: " + ActualBanana_PiPrice3);

if (expectedBanana_PiPrice4.equals(ActualBanana_PiPrice4)) {
System.out.println("PASS");
} else {
System.out.println("FAIL");
}
System.out.println("Expected Result: " + expectedBanana_PiPrice4);
System.out.println("Actual Result: " + ActualBanana_PiPrice4);


if (expectedBanana_PiPrice5.equals(ActualBanana_PiPrice5)) {
System.out.println("PASS");
} else {
System.out.println("FAIL");
}
System.out.println("Expected Result: " + expectedBanana_PiPrice5);
System.out.println("Actual Result: " + ActualBanana_PiPrice5);


if (expectedBanana_PiPrice6.equals(ActualBanana_PiPrice6)) {
System.out.println("PASS");
} else {
System.out.println("FAIL");
}
System.out.println("Expected Result: " + expectedBanana_PiPrice6);
System.out.println("Actual Result: " + ActualBanana_PiPrice6);

if (expectedBanana_PiPrice7.equals(ActualBanana_PiPrice7)) {
System.out.println("PASS");
} else {
System.out.println("FAIL");
}
System.out.println("Expected Result: " + expectedBanana_PiPrice7);
System.out.println("Actual Result: " + ActualBanana_PiPrice7);


if (expectedBanana_PiPrice8.equals(ActualBanana_PiPrice8)) {
System.out.println("PASS");
} else {
System.out.println("FAIL");
}
System.out.println("Expected Result: " + expectedBanana_PiPrice8);
System.out.println("Actual Result: " + ActualBanana_PiPrice8);

if (expectedBanana_PiPrice9.equals(ActualBanana_PiPrice9)) {
System.out.println("PASS");
} else {
System.out.println("FAIL");
}
System.out.println("Expected Result: " + expectedBanana_PiPrice9);
System.out.println("Actual Result: " + ActualBanana_PiPrice9);
//**********************************************************************BANANA***************************************************************
driver.findElement(By.xpath("//label/span[contains(text(),'Banana Pi')]")).click();
Thread.sleep(3000);
//**********************************************************************BEAGLEBONE***************************************************************

String expectedBeagleBoneName1 = "PocketBeagle";
String expectedBeagleBoneName2 = "BeagleBone Green";
String expectedBeagleBoneName3 = "BeagleBone Green Wireless";
String expectedBeagleBoneName4 = "BeagleBone Blue";
String expectedBeagleBoneName5 = "BeagleBone Black Wireless";
String expectedBeagleBoneName6 = "BeagleBone Black, Rev C";

String expectedBeagleBonePrice1 = "$25.00";
String expectedBeagleBonePrice2 = "$44.00";
String expectedBeagleBonePrice3 = "$52.90";
String expectedBeagleBonePrice4 = "$80.00";
String expectedBeagleBonePrice5 = "$68.75";
String expectedBeagleBonePrice6 = "$55.00";


// find BeagleBone Brand and click on it
driver.findElement(By.xpath("//label/span[contains(text(),'BeagleBone')]")).click();
 Thread.sleep(3500);
// find all elements which has a className= "_2BULo" and put them in the data
List<WebElement> BeagleBoneBrandName = driver.findElements(By.className("_2BULo"));
// create new Variable
Thread.sleep(3000);
int numberOFBeagleBoneBrandName = BeagleBoneBrandName.size();
String ActualBeagleBoneBrandName1 = BeagleBoneBrandName.get(0).getText();
String ActualBeagleBoneBrandName2 = BeagleBoneBrandName.get(1).getText();
String ActualBeagleBoneBrandName3 = BeagleBoneBrandName.get(2).getText();
String ActualBeagleBoneBrandName4 = BeagleBoneBrandName.get(3).getText();
String ActualBeagleBoneBrandName5 = BeagleBoneBrandName.get(4).getText();
String ActualBeagleBoneBrandName6 = BeagleBoneBrandName.get(5).getText();

// Print number of List Elements
List<WebElement> BeagleBonePrice = driver.findElements(By.className("_23ArP"));
int numberOFBeagleBonePrice = BeagleBonePrice.size();
String ActualBeagleBonePrice1 = BeagleBonePrice.get(0).getText();
String ActualBeagleBonePrice2 = BeagleBonePrice.get(1).getText();
String ActualBeagleBonePrice3 = BeagleBonePrice.get(2).getText();
String ActualBeagleBonePrice4 = BeagleBonePrice.get(3).getText();
String ActualBeagleBonePrice5 = BeagleBonePrice.get(4).getText();
String ActualBeagleBonePrice6 = BeagleBonePrice.get(5).getText();

System.out.println("check by brand");
System.out.println("***********************************");

if (expectedBeagleBoneName1.equals(ActualBeagleBoneBrandName1)) {
System.out.println("PASS");
} else {
System.out.println("FAIL");
}
System.out.println("Expected Result: " + expectedBeagleBoneName1);
System.out.println("Actual Result: " + ActualBeagleBoneBrandName1);

if (expectedBeagleBoneName2.equals(ActualBeagleBoneBrandName2)) {
System.out.println("PASS");
} else {
System.out.println("Fail");
}
System.out.println("Expected Result: " + expectedBeagleBoneName2);
System.out.println("Actual Result: " + ActualBeagleBoneBrandName2);

if (expectedBeagleBoneName3.equals(ActualBeagleBoneBrandName3)) {
System.out.println("PASS");
} else {
System.out.println("Fail");
}
System.out.println("Expected Result: " + expectedBeagleBoneName3);
System.out.println("Actual Result: " + ActualBeagleBoneBrandName3);

if (expectedBeagleBoneName4.equals(ActualBeagleBoneBrandName4)) {
System.out.println("PASS");
} else {
System.out.println("FAIL");
}
System.out.println("Expected Result: " + expectedBeagleBoneName4);
System.out.println("Actual Result: " + ActualBeagleBoneBrandName4);

if (expectedBeagleBoneName5.equals(ActualBeagleBoneBrandName5)) {
System.out.println("PASS");
} else {
System.out.println("FAIL");
}
System.out.println("Expected Result: " + expectedBeagleBoneName5);
System.out.println("Actual Result: " + ActualBeagleBoneBrandName5);

if (expectedBeagleBoneName6.equals(ActualBeagleBoneBrandName6)) {
System.out.println("PASS");
} else {
System.out.println("FAIL");
}
System.out.println("Expected Result: " + expectedBeagleBoneName6);
System.out.println("Actual Result: " + ActualBeagleBoneBrandName6);

System.out.println("check by price");
System.out.println("***********************************");

if (expectedBeagleBonePrice1.equals(ActualBeagleBonePrice1)) {
System.out.println("PASS");
} else {
System.out.println("FAIL");
}
System.out.println("Expected Result: " + expectedBeagleBonePrice1);
System.out.println("Actual Result: " + ActualBeagleBonePrice1);

if (expectedBeagleBonePrice2.equals(ActualBeagleBonePrice2)) {
System.out.println("PASS");
} else {
System.out.println("Fail");
}
System.out.println("Expected Result: " + expectedBeagleBonePrice2);
System.out.println("Actual Result: " + ActualBeagleBonePrice2);

if (expectedBeagleBonePrice3.equals(ActualBeagleBonePrice3)) {
System.out.println("PASS");
} else {
System.out.println("Fail");
}
System.out.println("Expected Result: " + expectedBeagleBonePrice3);
System.out.println("Actual Result: " + ActualBeagleBonePrice3);

if (expectedBeagleBonePrice4.equals(ActualBeagleBonePrice4)) {
System.out.println("PASS");
} else {
System.out.println("FAIL");
}
System.out.println("Expected Result: " + expectedBeagleBonePrice4);
System.out.println("Actual Result: " + ActualBeagleBonePrice4);

if (expectedBeagleBonePrice5.equals(ActualBeagleBonePrice5)) {
System.out.println("PASS");
} else {
System.out.println("FAIL");
}
System.out.println("Expected Result: " + expectedBeagleBonePrice5);
System.out.println("Actual Result: " + ActualBeagleBonePrice5);


if (expectedBeagleBonePrice6.equals(ActualBeagleBonePrice6)) {
System.out.println("PASS");
} else {
System.out.println("FAIL");
}
System.out.println("Expected Result: " + expectedBeagleBonePrice6);
System.out.println("Actual Result: " + ActualBeagleBonePrice6);

//**********************************************************************BEAGLEBONE***************************************************************

//find BeagleBone Brand and click on it
driver.findElement(By.xpath("//label/span[contains(text(),'BeagleBone')]")).click();
Thread.sleep(3500);

//**********************************************************************Bubblegum***************************************************************
String expectedBubblegumName1 = "Bubblegum-96";
String expectedBubblegumPrice1 = "$71.20";
// Thread.sleep(5000);


//find Element [Bubblegum] by xpath and click on it
Thread.sleep(3000);
driver.findElement(By.xpath("//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/aside/section/ul/li[3]/div/div/div/ul/li[5]/label/span")).click();
Thread.sleep(4000);

List<WebElement> BubblegumBrandName = driver.findElements(By.className("_2BULo"));
//create new Variable
int numberOFBubblegumBrandName = BubblegumBrandName.size();
System.out.println(numberOFBubblegumBrandName);
String ActualBubblegumBrandName1 = BubblegumBrandName.get(0).getText();
System.out.println(ActualBubblegumBrandName1);

//Print number of List Elements
List<WebElement> BubblegumPrice = driver.findElements(By.className("_23ArP"));
int numberOFBubblegumPrice = BubblegumPrice.size();
String ActualBubblegumPrice1 = BubblegumPrice.get(0).getText();

System.out.println("check by brand");
System.out.println("***********************************");

if (expectedBubblegumName1.equals(ActualBubblegumBrandName1)) {
System.out.println("PASS");
} else {
System.out.println("FAIL");
}
System.out.println("Expected Result: " + expectedBubblegumName1);
System.out.println("Actual Result: " + ActualBubblegumBrandName1);

System.out.println("check by price");
System.out.println("***********************************");

if (expectedBubblegumPrice1.equals(ActualBubblegumPrice1)) {
System.out.println("PASS");
} else {
System.out.println("FAIL");
}
System.out.println("Expected Result: " + expectedBubblegumPrice1);
System.out.println("Actual Result: " + ActualBubblegumPrice1);


//**********************************************************************Bubblegum***************************************************************
driver.findElement(By.xpath("//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/aside/section/ul/li[3]/div/div/div/ul/li[5]/label/span")).click();
Thread.sleep(4000);
//**********************************************************************DUINO***************************************************************
String expectedDuino86Name1 = "86Duino Zero";
String expectedDuino86Price1 = "$39.00";
Thread.sleep(3000);

//find Element [86Duino] by xpath and click on it
Thread.sleep(3000);
driver.findElement(By.xpath("//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/aside/section/ul/li[3]/div/div/div/ul/li[1]/label/span")).click();
Thread.sleep(3000);


//find all elements which has a className= "_2BULo" and put them in the data
List<WebElement> Duino86BrandName = driver.findElements(By.className("_2BULo"));
//create new Variable

int numberOFDuino86BrandName = Duino86BrandName.size();
String ActualDuino86BrandName1 = Duino86BrandName.get(0).getText();


//Print number of List Elements
List<WebElement> Duino86Price = driver.findElements(By.className("_23ArP"));
int numberOFDuino86Price = Duino86Price.size();
String ActualDuino86Price1 = Duino86Price.get(0).getText();

System.out.println("check by brand");
System.out.println("***********************************");



if (expectedDuino86Name1.equals(ActualDuino86BrandName1)) {
System.out.println("PASS");
} else {
System.out.println("FAIL");
}
System.out.println("Expected Result: " + expectedDuino86Name1);
System.out.println("Actual Result: " + ActualDuino86BrandName1);


System.out.println("check by price");
System.out.println("***********************************");

if (expectedDuino86Price1.equals(ActualDuino86Price1)) {
System.out.println("PASS");
} else {
System.out.println("FAIL");
}
System.out.println("Expected Result: " + expectedDuino86Price1);
System.out.println("Actual Result: " + ActualDuino86Price1);


driver.quit();

	}

}