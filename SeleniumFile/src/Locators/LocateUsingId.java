package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateUsingId {

	public static void main(String[] args) throws Exception {
     System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		//create of instance of chromedriver
		WebDriver driver=new ChromeDriver();
		
		//maximize the window
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.manage().window().maximize();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.id("name")).sendKeys("Madhuri");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.id("email")).sendKeys("kmadhuri645@gmail.com");
	    Thread.sleep(2000);
	    
	    WebElement element = driver.findElement(By.id("password"));
	    element.sendKeys("madhu@123");
	    Thread.sleep(2000);
	    element.submit();
	    Thread.sleep(2000);
	    driver.close();
	    

	}

}
