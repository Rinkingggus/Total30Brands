import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex99AllProducts3 {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/Rinking/Documents/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
//Open needed web-application
		driver.get("https://kamenkaksk.wixsite.com/wwes-13-1");
		driver.manage().window().maximize();

		Thread.sleep(2000);

//Driver finds and clicks on AllProducts Tab.
		driver.findElement(By.xpath("//*[@id=\"comp-jcfv4kob1label\"]")).click();
		Thread.sleep(4000);

		
		// Driver clicks "Brand" button
		driver.findElement(By.xpath("//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/aside/section/ul/li[3]/button")).click();
		Thread.sleep(2000);
		
		// Driver clicks "AllRaspberryPi" button
		driver.findElement(By.xpath("//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/aside/section/ul/li[3]/div/div/div/ul/li[30]/label/span")).click();
		Thread.sleep(2000);
		
		

		// Find all elements with class named "_2BULo" and put them in a list.
		List<WebElement> AllRaspberryPi = driver.findElements(By.className("_2BULo"));
		
	
		
		
		Thread.sleep(2500);
		
		// Find all elements with class named "_2BULo" and put them in a list.
		List<WebElement> AllRaspberryPiPrice = driver.findElements(By.className("_23ArP"));
		
		
		
		String expectedName1[]= {"Raspberry Pi 3 Model B+","Raspberry Pi 3 Model B","Raspberry Pi Zero W / Zero WH","Raspberry Pi Zero"};

		String expectedPrice1[]= { "$30.00","$30.00","$10.00","$10.00","$5.00"}  ;
		
		for (int i=0;i<AllRaspberryPiPrice.size();i++) {
			
			System.out.println(AllRaspberryPi.get(i).getText());
			System.out.println(expectedName1[i]);
			System.out.println(AllRaspberryPiPrice.get(i).getText());
			System.out.println(expectedPrice1[i]);}
			
			



		
		//Press Command+Shift+F to even-out text
		//Double click word to highlight
		//Command+F to replace all words
		
		
		driver.quit();
	}
}
