package week4day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearntoHandleWindow {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		System.out.println(driver);
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//handle/address of the current active window		
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);	
		
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		
		String windowHandle1 = driver.getWindowHandle();
		System.out.println(windowHandle1);	
		
		//to get the count of number of windows opened
		
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println("No of Windows opened: " +windowHandles.size());
				
		for (String winid : windowHandles) {			
			System.out.println(winid);			
		}//till here the driver control in first window
		
		System.out.println("//Before Switching " +driver.getTitle());
		//Switch to second window
		//step:1--> convert the set to list
		List<String> windows=new ArrayList<String>(windowHandles);
		//use index to switch to child window
		driver.switchTo().window(windows.get(1));
		System.out.println("//After Switching " +driver.getTitle());
		//close the current active window
		driver.close();		
		driver.switchTo().window(windows.get(0));
		

		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		
		Set<String> windowWithMuliple = driver.getWindowHandles();
		System.out.println("No of Windows opened: " +windowWithMuliple.size());
		
		List<String> window=new ArrayList<String>(windowWithMuliple);
		driver.switchTo().window(window.get(1));
		System.out.println("I am in window " +driver.getTitle());
		driver.switchTo().window(window.get(2));
		System.out.println("I am in window " +driver.getTitle());
		driver.close();
		driver.switchTo().window(window.get(1));
		System.out.println("I am in window after switching from " +driver.getTitle());
		driver.close();
		driver.switchTo().window(window.get(0));
		System.out.println("I am in window " +driver.getTitle());
		//close all the opened windows
		driver.quit();			
		//
		
		/*
		 * driver.findElement (By.
		 * xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']"
		 * )).click();
		 */

	}

}
