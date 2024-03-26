package testNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Launch_1 {
	
	@Test
	public void new1() {
	ChromeDriver driver=new ChromeDriver();
	 //EdgeDriver driver1=new EdgeDriver();
	driver.manage().window().maximize();
	//driver1.manage().window().maximize();
	driver.get("https://www.bannerbuzz.com/");
	//driver1.get("https://www.bannerbuzz.com/");
	//driver.getTitle();
	System.out.println(driver.getTitle());
	driver.quit();
	//System.out.println(driver1.getTitle());
	//driver1.quit();

}
	
@Test
public void gaurav() throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.bannerbuzz.com/");
	Thread.sleep(5000);
	driver.quit();
	
	
}
}
