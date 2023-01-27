package week4day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/frame.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//handling frame -using index 
		 driver.switchTo().frame(0);				
		driver.findElement(By.id("Click")).click();
		
		//to brink back the control of driver to the main page
		driver.switchTo().defaultContent();
		
		//to find number of frames in webpage
		  List<WebElement> frameCount = driver.findElements(By.tagName("iframe"));
		  System.out.println(frameCount.size());
		 
		
		//using id/name in nested frame
		//step:1 -->switch into the first outer frame and then into the inner to click the element
		//driver.switchTo().frame(2);//first outerframe
		//or through webelement
		driver.switchTo().frame(driver.findElement(By.xpath("(//div[@class='card']/iframe)[3]")));
		//frame with id /name attribute
		driver.switchTo().frame("frame2");
		WebElement nestedframe = driver.findElement(By.id("Click"));
		nestedframe.click();
		System.out.println(nestedframe.getText());
		driver.switchTo().defaultContent();
		//driver.switchTo().parentFrame();
		
		
		
		
		
		
	}

}
