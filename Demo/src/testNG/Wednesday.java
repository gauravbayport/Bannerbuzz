package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Wednesday {
	@Test
	public void Happy() {
		System.out.println("Hello");
		
	}
	
	@Test(dataProvider="getdata")
	public void sad(String username, String Password) {
		System.out.println("SAD");
		System.out.println(username);
		System.out.println(Password);
	}

	@Test(groups={"smoke"})
	public void Day6() {
		System.out.println("Gaurav test");
	}
	@Parameters({"URL"})
	@Test
	public void Day7(String url, String url1)
	{
		System.out.println("Hi");
		System.out.println(url);
		System.out.println(url1);
		
		
	}
	@DataProvider
	public Object[][] getdata()
	{
		Object[][] data = new Object[3][2];
		data[0][0]="firstusername";
		data[0][1]="firstpassword";
		
		data[1][0]="secondusername";
		data[1][1]="secondpassword";
		
		data[2][0]="thirdusername";
		data[2][1]="thirdpassword";
		return data;
	}
}
