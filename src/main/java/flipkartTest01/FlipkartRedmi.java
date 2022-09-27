package flipkartTest01;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartRedmi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.flipkart.com/");
		
driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
		
		
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Redmi");
	
		
		driver.findElement(By.cssSelector("svg[viewBox='0 0 17 18']")).click();
		
		
		List<WebElement> results = driver.findElements(By.xpath("//li[@class='rgWa7D' and (contains(text(),'4 GB RAM '))]"));

		

		int count = 0;

		for(WebElement ele:results)
		{
			System.out.println(ele.getText());
			count++;
		}	
		System.out.println("Total 4 GB RAM Phones = "+count);
	}

}
