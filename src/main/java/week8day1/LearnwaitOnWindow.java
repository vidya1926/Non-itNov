package week8day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LearnwaitOnWindow {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		driver.findElement(By.xpath("//span[text()='Open with delay']")).click();

		wait.until(ExpectedConditions.numberOfWindowsToBe(3));

		Set<String> windowHandles = driver.getWindowHandles();
		List<String> win = new ArrayList<String>(windowHandles);
		driver.switchTo().window(win.get(1));
		System.out.println(driver.getTitle());


	}

}
