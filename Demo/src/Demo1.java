import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo1 {
	 void Launch() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gaurav Jayant\\eclipse-workspace\\Demo\\Driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("D:\\Selenium Jar\\chrome-win64\\chrome-win64\\chrome.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.giantmediaonline.com/");
		driver.getTitle();
		System.out.println("The Title of the website is:-"+" "+driver.getTitle());
	//	driver.close();
		Thread.sleep(1000);
		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Demo1 s = new Demo1();
		s.Launch();

	}

}
