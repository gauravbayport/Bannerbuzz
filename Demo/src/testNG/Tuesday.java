package testNG;

import org.testng.annotations.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Tuesday {
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
	@Test
	public void Demo1() {
		System.out.println("Hello");
	}
	
	@Test
	public void Demo2() {
		System.out.println("Test");
	}
	
	@Test(groups={"smoke"})
	public void Day6() {
		System.out.println("Gaurav test");

}}
