package testNG;


import org.openqa.selenium.JavascriptExecutor;

//import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Browser_Launch {
	@Test
	public void Demo() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gaurav Jayant\\eclipse-workspace\\Demo\\Driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("D:\\Selenium Jar\\chrome-win64\\chrome-win64\\chrome.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.bannerbuzz.com/");
		driver.getTitle();
		System.out.println("The Title of the website is:-"+" "+driver.getTitle());
		driver.close();
		
	}
	@Test//(timeOut=4000) // this attribute is used to timeOut means if the test case is not run within some seconds
	public void Demo1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gaurav Jayant\\eclipse-workspace\\Demo\\Driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("D:\\Selenium Jar\\chrome-win64\\chrome-win64\\chrome.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.bannerbuzz.com/");
		driver.getTitle();
		Thread.sleep(10000);
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,1000)");
		 
		 Thread.sleep(10000);

		System.out.println("The Title of the website is:-"+" "+driver.getTitle());
		driver.close();
		
	}
	@Test
	public void Demo2() {
		System.out.println("Pass");
		Assert.assertTrue(false);
	}
	
	@BeforeTest
	public void Day1() {
		System.out.println("Before Method");
	}
	
	@AfterTest
	public void ADay2() {
		System.out.println("After Method");
	}
	@BeforeSuite
	public void Day() {
		System.out.println("Before Suite");
	}
	@AfterSuite
	public void Day5() {
		System.out.println("After Suite");
	}
	
	@Test(groups={"smoke"})
	public void Day6() {
		System.out.println("Gaurav");
	}

}
