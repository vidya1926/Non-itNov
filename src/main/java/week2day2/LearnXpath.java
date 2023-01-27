package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXpath {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		System.out.println(driver);
		//load the url
		driver.get("http://leaftaps.com/opentaps");
		//maximized the browser
		driver.manage().window().maximize();
		//Enter the username
		//apply the wait to locate the element-global wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//enter the username (attribute based)
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoCSR");
		
		//enter the password(attribute based)
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("crmsfa");
		
		//click the login
		driver.findElement(By.xpath("//input[contains(@class,'Submit')]")).click();
		
		
		

	}

}
