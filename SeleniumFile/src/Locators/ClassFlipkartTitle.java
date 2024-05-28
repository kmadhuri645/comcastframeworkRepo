package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassFlipkartTitle {

	public static void main(String[] args) {
   System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		//create of instance of chromedriver
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        WebElement serchText = driver.findElement(By.className("Pke_EE"));
        serchText.sendKeys("iphone11");
        serchText.submit();
        
        //System.out.println(driver.getTitle());
        String plpTitle = driver.getTitle();
        System.out.println(plpTitle);
        System.out.println(driver.getCurrentUrl());
        driver.close();

	}

}
