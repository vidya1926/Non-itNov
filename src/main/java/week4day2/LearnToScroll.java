package week4day2;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnToScroll {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		System.out.println(driver);
		driver.get("https://www.leafground.com/menu.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		Actions act =new Actions(driver);
		//to scroll from top to bottom use +ve value
		//to scroll from bottom to top use -ve value		
		act.pause(500).scrollByAmount(0, 700).pause(500).scrollByAmount(0,-300).perform();
	//	act.scrollByAmount(0,-300).perform();
	
	}

}
