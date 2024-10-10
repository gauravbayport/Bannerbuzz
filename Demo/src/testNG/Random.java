package testNG;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;

public class Random {
	@Test()
	public void Dynamic_Dropdown() throws InterruptedException, IOException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://www.spicejet.com/");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div[3]/div[2]/div[3]/div/div[1]/div/div[2]/input")).click();
	    driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div[3]/div[2]/div[3]/div/div[1]/div/div[2]/input")).sendKeys("DEL");
	    
	 //   driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div[3]/div[2]/div[3]/div/div[3]/div[2]/div[2]")).sendKeys("BLR");
	 
	 
	//   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	  //  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div/div[1]/div[3]/div[2]/div[3]/div/div[3]/div[2]/div[2]")));
	  //  new Select(driver.findElement(By.id("/html/body/div[2]/div/div/div[1]/div[3]/div[2]/div[3]/div/div[3]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]"))).selectByVisibleText("AGRA");
	    Thread.sleep(5000);
	//    driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div[3]/div[2]/div[3]/div/div[3]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]")).click();
	    driver.findElement(By.
	    		xpath
	    		("/html/body/div[2]/div/div/div[1]/div[3]/div[2]/div[3]/div/div[3]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]")).click();
	  //  driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div[3]/div[2]/div[4]/div/div/div[1]/div[2]/div[1]")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div[3]/div[2]/div[4]/div/div[2]/div[2]/div[3]/div[2]/div/div[1]/div/div[3]/div[2]/div[4]/div/div")).click();
	    Thread.sleep(9000);
	    
	   // WebDriverWait wait = new WebDriverWait(utilObj.getdriver(), 10);
	    //wait.until(ExpectedConditions.elementToBeClickable(By.id("ctl00_mainContent_ddl_originStation1_CTXT")));
        
}}
