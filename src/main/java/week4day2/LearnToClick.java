package week4day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnToClick {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		System.out.println(driver);
		driver.get("https://www.leafground.com/menu.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		Actions act =new Actions(driver);
		
		//right click
		WebElement customer = driver.findElement(By.xpath("//span[text()='Customers']"));
		act.click(customer).contextClick().perform();
		
		//double click
		driver.navigate().to("https://www.leafground.com/dashboard.xhtml");
		WebElement menu = driver.findElement(By.xpath("//label[text()='Message']"));
		act.doubleClick(menu).perform();
	}

}
