package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatesUsingName {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		//create of instance of chromedriver
        WebDriver driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        
        Thread.sleep(3000);
        
        WebElement userName = driver.findElement(By.name("username"));
        userName.sendKeys("Admin");
        
       WebElement passWord = driver.findElement(By.name("password"));
        
       passWord.sendKeys("admin123");
       Thread.sleep(3000);
       driver.close();
		
	}

}
