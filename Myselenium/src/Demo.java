import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Demo {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Chrome selenium\\chrome-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("D:\\Chrome selenium\\chrome-win64\\chrome.exe");
		WebDriver driver = (WebDriver) new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.circleone.in/");
		Thread.sleep(10000);
	//	driver.findElement(By.xpath("//*[@id=\"navbarText\"]/ul/li[2]/a")).click();
		
		 WebElement elementToHover = driver.findElement(By.xpath("//*[@id=\"navbarText\"]/ul/li[2]/a/span"));

	        // Create an instance of the Actions class
	        Actions actions = new Actions(driver);

	        // Perform the mouse hover using moveToElement
	        actions.moveToElement(elementToHover).perform();
		 
		
		System.out.println(driver.getTitle());

	

		
	//	driver.manage().wait(500, 0);
		Thread.sleep(10000);
		driver.quit();

}
}