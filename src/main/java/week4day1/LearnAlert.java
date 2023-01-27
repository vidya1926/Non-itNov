package week4day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement simplealert = driver.findElement(By.xpath("//span[text()='Show']"));
		System.out.println(simplealert.getText());
		simplealert.click();

		// to handle the alert-switch the control from the driver control to alert box
		// simple alert
		Alert alert = driver.switchTo().alert();
		// to get the text form the alert box
		String text = alert.getText();
		System.out.println(text);

		// to accept the alert
		alert.accept();

		// confirmation alert
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		alert.dismiss();

		// prompt alert
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		alert.sendKeys("Testleaf");
		alert.accept();

		// sweet alert
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		alert.accept();
		driver.findElement(By.xpath("//span[text()='Yes']")).click();

	}

}
