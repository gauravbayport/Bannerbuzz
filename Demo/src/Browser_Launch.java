import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class Browser_Launch {
	
	public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gaurav Jayant\\eclipse-workspace\\Demo\\Driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("D:\\Selenium Jar\\chrome-win64\\chrome-win64\\chrome.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.bannerbuzz.com/");
		driver.getTitle();
		System.out.println("The Title of the website is:-"+" "+driver.getTitle());
		
		Thread.sleep(10000);
		driver.findElement(By.cssSelector("#headersearch")).sendKeys("banner");
	
		Thread.sleep(10000);
		driver.close();
	}

}
