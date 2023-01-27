package week4day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnToSelectAll {


	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		System.out.println(driver);
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		Actions act =new Actions(driver);
		driver.switchTo().frame(0);
		
		WebElement it1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement it3 = driver.findElement(By.xpath("//li[text()='Item 3']"));
		
		WebElement it4 = driver.findElement(By.xpath("//li[text()='Item 4']"));
		WebElement it6 = driver.findElement(By.xpath("//li[text()='Item 6']"));
		
		act.clickAndHold(it1).moveToElement(it3).release().perform();
		
		act.keyDown(Keys.CONTROL).click(it4).click(it6).keyUp(Keys.CONTROL).perform();
		
		
		//screenshot
		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		File destn=new File("./snap/pic.jpg");
		FileUtils.copyFile(screenshotAs, destn);
				
		// snap shot particular element 
		File elesnap = it6.getScreenshotAs(OutputType.FILE);
		File dest=new File("./snap/pic1.jpg");
		FileUtils.copyFile(elesnap, dest);
		
		

	}

}
