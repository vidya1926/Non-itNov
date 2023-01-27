package week8day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option=new ChromeOptions();
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://www.leafground.com/waits.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		/*
		 * FluentWait w =new FluentWait(driver);
		 * w.pollingEvery(Duration.ofSeconds(5)).withMessage("").ignoring(
		 * NoSuchElementException.class);
		 * 
		 * 
		 */		
		try {
		driver.findElement(By.xpath("//span[text()='Click First Button1']")).click();
		}catch(NoSuchElementException e) {
			System.out.println("Check the Xpath");
		}

		WebElement clickable = driver.findElement(By.xpath("//span[text()='Click Second']"));

		wait.until(ExpectedConditions.elementToBeClickable(clickable));
		System.out.println(clickable.getText());

		driver.findElement(By.xpath("//span[text()='Click']")).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[text()='I am here']"))));

		WebElement visible = driver.findElement(By.xpath("//span[text()='I am here']"));
		System.out.println(visible.getText());

		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//span[text()='Click'])[2]")).click();
		WebElement invisible = driver.findElement(By.xpath("//span[text()='I am about to hide']"));
		System.out.println(invisible.getText());
		wait.until(ExpectedConditions.invisibilityOf(invisible));

	}

}
