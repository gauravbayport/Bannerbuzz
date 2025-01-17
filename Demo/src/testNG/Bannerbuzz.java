package testNG;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.FileHandler;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import org.apache.commons.io.FileUtils;


public class Bannerbuzz {
	 WebDriver driver;
	@Test()
	public void MetaDescription() {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bannerbuzz.com/");
		driver.getTitle();
		System.out.println("The Title of the website is:-"+" "+driver.getTitle());
		// Find the meta description tag
        String metaDescription = driver.findElement(By.cssSelector("meta[name='description']")).getAttribute("content");

        // Print the meta description
        System.out.println("Meta Description: " + metaDescription);
        Assert.assertEquals(metaDescription, "BannerBuzz is your source for custom banner printing, displays, & graphics. Create custom flags for special events, signs with your logo, & more. Get started today!");
        
        String ActualMetaDescription = driver.findElement(By.cssSelector("meta[name='description']")).getAttribute("content");
        String ExpectedMetaDescription = "BannerBuzz is your source for custom banner printing, displays, & graphics. Create custom flags for special events, signs with your logo, & more. Get started today!";
        
        // Assertion
        Assert.assertEquals(ActualMetaDescription, ExpectedMetaDescription);
        
        // Print whether assertion passed or failed
        if (ActualMetaDescription.equals(ExpectedMetaDescription)) {
            System.out.println("Assertion Passed: Meta Description is correct.");
        } else {
            System.out.println("Assertion Failed: Meta Description is incorrect.");
        }

	try{
	    driver.quit();
	   }catch (Exception e){
	      System.out.println("Nothing to do with it");
	      }}

@Test()
public void ChromeBrowser() throws IOException, InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
    driver.get("https://www.bannerbuzz.com/");
    Thread.sleep(10000);
 // Take screenshot of the page (It is working only capture visible part)
 //  File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
   // FileUtils.copyFile(scrFile, new File("D:\\new\\screenshot4.png"), true);
    
   // driver.findElement(By.xpath("//*[@id=\"scrollTopRibbon\"]/div/button")).click();
    
    Screenshot fpScreenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
    ImageIO.write(fpScreenshot.getImage(),"PNG",new File("D:\\new\\screenshot8.png"));
    
    try{
        driver.quit();
       }catch (Exception e){
          System.out.println("Nothing to do with it");
          
        
}}
@Test(enabled=false)
public void Edge_Browser() throws InterruptedException, IOException {
EdgeDriver driver=new EdgeDriver();
driver.manage().window().maximize();
//driver1.manage().window().maximize();
driver.get("https://www.bannerbuzz.com/");
Thread.sleep(10000);
//driver.findElement(By.xpath("//*[@id=\"scrollTopRibbon\"]/div/button")).click();

Screenshot fpScreenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
ImageIO.write(fpScreenshot.getImage(),"PNG",new File("D:\\new\\screenshot7.png"));

try{
    driver.quit();
   }catch (Exception e){
      System.out.println("Nothing to do with it");
}}
@Test()//enabled=false
public void dropdown() throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
    driver.get("https://www.bannerbuzz.com/");
    Thread.sleep(10000);
    
    WebElement ele = driver.findElement(By.xpath("//*[@id=\"stickyHeader\"]/div[1]/div/div[3]/div[4]/ul/li/span"));

  //Creating object of an Actions class
  Actions action = new Actions(driver);

  //Performing the mouse hover action on the target element.
  action.moveToElement(ele).perform();
  
 driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div[1]/div/div[3]/div[4]/ul/li/ul/li[2]/a/span")).click();
  
  Thread.sleep(10000);
  
  ArrayList<String> wid = new ArrayList<String>(driver.getWindowHandles());
  driver.switchTo().window(wid.get(1));
  System.out.println("Page title of active tab: " + driver.getTitle());
  
  driver.switchTo().window(wid.get(1));
  System.out.println("Page title of active tab: " + driver.getTitle());
  driver.close();
  //switch to parent
  Thread.sleep(10000);
  driver.switchTo().window(wid.get(0));
  System.out.println("Page title of parent window: " + driver.getTitle());
  
  JavascriptExecutor js = (JavascriptExecutor) driver;
  js.executeScript("window.scrollBy(0,550)", "");
  Thread.sleep(5000);
  driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[5]/div/div[2]/div/div/div[1]/div/select")).click();
  Select objSelect = new Select(driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[5]/div/div[2]/div/div/div[1]/div/select")));
  objSelect.selectByIndex(2);
  js.executeScript("window.scrollBy(0,300)", "");
  Thread.sleep(10000);
  
  try{
	    driver.quit();
	   }catch (Exception e){
	      System.out.println("Nothing to do with it");
  
}
}

@Test()
public void screenshotlogo() throws InterruptedException, IOException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
    driver.get("https://www.bannerbuzz.com/");
    Thread.sleep(10000);
    
    WebElement ele = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div[2]/div/div[2]/a/img"));

 // Get entire page screenshot
 File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
 BufferedImage  fullImg = ImageIO.read(screenshot);

 // Get the location of element on the page
 Point point = ele.getLocation();

 // Get width and height of the element
 int eleWidth = ele.getSize().getWidth();
 int eleHeight = ele.getSize().getHeight();

 // Crop the entire page screenshot to get only element screenshot
 BufferedImage eleScreenshot= fullImg.getSubimage(point.getX(), point.getY(),
     eleWidth, eleHeight);
 ImageIO.write(eleScreenshot, "png", screenshot);

 // Copy the element screenshot to disk
 File screenshotLocation = new File("D:\\new\\logo.png");
 FileUtils.copyFile(screenshot, screenshotLocation);
 
 
 
 try{
	    driver.quit();
	   }catch (Exception e){
	      System.out.println("Nothing to do with it");
    
}}}
    
  