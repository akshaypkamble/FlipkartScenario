package flipkartTest01;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart01 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
		
		
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Winter heater");
	
		
		driver.findElement(By.cssSelector("svg[viewBox='0 0 17 18']")).click();
				
		driver.findElement(By.xpath("//div[@data-id='ROHG9R5RWDHK9V2T']")).click();
		
		Set<String> windows = driver.getWindowHandles();
		
		for(String st: windows)
		{
		
		driver.switchTo().window(st);
		
		}
		
		driver.findElement(By.cssSelector("button[class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		
		

	}

}
