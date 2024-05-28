package WebDriverTestCase;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResizeAndRelocateTheWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		//create of instance of chromedriver
		WebDriver driver=new ChromeDriver();
		
		//maximize the window
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		//1st way resize the window
		//driver.manage().window().setSize(new Dimension(100, 200));
		
		//2ndWays to resize the windows
		Dimension d=new Dimension(100, 200);
		driver.manage().window().setSize(d);
		
		//1st way to relocate
		Point p=new Point(100, 200);
		driver.manage().window().setPosition(p);
		
		//2nd way to relocate
		driver.manage().window().setPosition(new Point(10, 20));
		
		
		

	}

}
