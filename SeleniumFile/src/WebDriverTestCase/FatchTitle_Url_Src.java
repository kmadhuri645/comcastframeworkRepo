package WebDriverTestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FatchTitle_Url_Src {

	public static void main(String[] args) throws Exception {
		 System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			
			//Step-1 create of instance of chromedriver
			WebDriver driver=new ChromeDriver();
			
			//Step-2 access the application
			driver.get("https://www.flipkart.com/");
			
			//Step-3 fetch title url and src
			String title=driver.getTitle();
			System.out.println(title);
			
			//fetch url
			String url = driver.getCurrentUrl();
			System.out.println(url);
			
			//to fetch src code
			String src = driver.getPageSource();
			System.out.println(src);
		    Thread.sleep(2000);

	}

}
