package week4day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Learntodrag {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		System.out.println(driver);
		driver.get("https://www.leafground.com/drag.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		Actions act=new Actions(driver);
		
		WebElement draganddrop = driver.findElement(By.xpath("//div[@id='form:conpnl_header']"));
		act.dragAndDropBy(draganddrop, 200, 300).perform();
		
		WebElement source = driver.findElement(By.xpath("//p[text()='Drag to target']"));
		WebElement target = driver.findElement(By.xpath("//p[text()='Drop here']"));
		
		act.dragAndDrop(source, target).perform();
		
		
	}

}
