package week4day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnToClickandHold {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		System.out.println(driver);
		driver.get("https://jqueryui.com/sortable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		Actions act =new Actions(driver);
		driver.switchTo().frame(0);
		
		WebElement itm1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement itm4 = driver.findElement(By.xpath("//li[text()='Item 4']"));
		int x = itm4.getLocation().getX();
		int y=itm4.getLocation().getY();
		
		act.clickAndHold(itm1).dragAndDropBy(itm1, x, y).perform();
		
		

		
	}//li[text()='Item 4']

}
