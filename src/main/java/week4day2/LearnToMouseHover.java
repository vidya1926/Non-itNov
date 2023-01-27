package week4day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnToMouseHover {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		System.out.println(driver);
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		WebElement men = driver.findElement(By.xpath("//a[text()='Men']"));
		
		Actions builder =new Actions(driver);
		builder.moveToElement(men).perform();
			
		
		
	
	}

}
