package BB_Coupon;

import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.Tracing;

public class Coupon_Code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Playwright playwright = Playwright.create()) {
            LaunchOptions lp = new LaunchOptions();
            lp.setChannel("firefox");
            lp.setHeadless(false);
            Browser browser = playwright.firefox().launch(lp);
            BrowserContext context = browser.newContext();
            
         // Start tracing before creating / navigating a page.
            context.tracing().start(new Tracing.StartOptions()
              .setScreenshots(true)
              .setSnapshots(true)
              .setSources(true));
  

            // Configure the context to record videos
            BrowserContext context1 = browser.newContext(new Browser.NewContextOptions()
                .setRecordVideoDir(Paths.get("D:\\Playwright\\example1"))
                .setRecordVideoSize(800, 800)); // Adjust the size as needed

            Page page = context1.newPage();

            // Navigate to the e-commerce site
            page.navigate("https://www.bannerbuzz.com/");
            page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("D:\\Playwright\\example.png")));

            String title = page.title();
            System.out.println("Page title is: " + title);

            String url = page.url();
            System.out.println("URL is: " + url);
            
         // Stop tracing and export it into a zip archive.
            context.tracing().stop(new Tracing.StopOptions()
              .setPath(Paths.get("D:\\Playwright\\trace.zip")));

            context.close();
            browser.close();
        }
    }
}
