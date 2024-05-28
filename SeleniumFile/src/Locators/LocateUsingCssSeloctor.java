package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateUsingCssSeloctor {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		// create of instance of chromedriver
		WebDriver driver = new ChromeDriver();

		// maximize the window
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		WebElement name = driver.findElement(By.cssSelector("input[placeholder='Enter your name']"));
		name.sendKeys("madhu");
		Thread.sleep(2000);

		WebElement emailId = driver.findElement(By.cssSelector("input[name='email']"));
		emailId.sendKeys("madhu123@gmail.com");
		Thread.sleep(2000);

		WebElement password = driver.findElement(By.cssSelector("input[placeholder='Enter your password']"));
		password.sendKeys("madhu123");
		Thread.sleep(2000);

		WebElement register = driver.findElement(By.cssSelector("button[type='submit']"));
		register.click();
		Thread.sleep(2000);
		driver.close();

	}

}
