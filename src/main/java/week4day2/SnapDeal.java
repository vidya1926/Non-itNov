package week4day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapDeal {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		System.out.println(driver);
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement mens = driver.findElement(By.xpath("//span[@class='labelIcon']/following-sibling::span"));
	WebElement pop=driver.findElement(By.id("pushDenied"));
	pop.click();
	
		Actions act =new Actions(driver);
		act.moveToElement(mens).perform();
		
		driver.findElement(By.xpath("//span[text()='Shirts']")).click();
		act.scrollByAmount(0, 300).perform();
		
		WebElement img = driver.findElement(By.xpath("//img[@class='product-image ']"));
		act.moveToElement(img).perform();
		
		WebElement quickview = driver.findElement(By.xpath("//div[contains(@class,'center quick-view-bar')]"));
		quickview.click();
		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		File destn=new File("./snap/pic2.jpg");
		FileUtils.copyFile(screenshotAs, destn);
				
	
	}

}
