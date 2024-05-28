package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyUrl {

	public static void main(String[] args) throws Exception {
		
		 System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		 
		 String expectedValue="Showing";
			
			//Step-1 create of instance of chromedriver
			WebDriver driver=new ChromeDriver();
			
			//Step-2 access the application
			driver.get("https://www.flipkart.com/");
			Thread.sleep(3000);

			WebElement search = driver.findElement(By.xpath("//input[@name='q']"));
			search.sendKeys(" i phone11");
			Thread.sleep(3000);
			search.submit();
			
			WebElement searchResult = driver.findElement(By.xpath("//span[contains(text(), 'Showing'  )]"));
			String ActualValue = searchResult.getText();
			
			System.out.println(expectedValue);
			
			if(ActualValue.contains(ActualValue)) {
				System.out.println("validation successful");
			}
			else {
				System.out.println("validation failed");
			}
			Thread.sleep(3000);

			driver.close();

	}

}
