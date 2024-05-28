package WebDriverTestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LauchCromeBrowser {

	public static void main(String[] args) {
		
		//Step-1 Provide key and path of chromeDriver
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		//Step-2 Launch the chromeBrowsers
		//create of instance of chromedriver
        WebDriver driver=new ChromeDriver();
        
        //Step-3 to Access the web application 
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        

	}

}
