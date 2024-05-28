package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingCssSelector {

	public static void main(String[] args) throws InterruptedException {
     System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		//create of instance of chromedriver
        WebDriver driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        
        Thread.sleep(3000);
        
        WebElement userName = driver.findElement(By.cssSelector("input[name='username']"));
        userName.sendKeys("Admin");
		Thread.sleep(2000);

		WebElement password = driver.findElement(By.cssSelector("input[name='password']"));
		password.sendKeys("admin123");
		Thread.sleep(2000);

		WebElement login = driver.findElement(By.cssSelector("button[type='submit']"));
		login.click();
		Thread.sleep(2000);
		driver.close();
	}

}
