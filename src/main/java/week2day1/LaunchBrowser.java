package week2day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.manager.SeleniumManager;

public class LaunchBrowser {

	public static void main(String[] args) {
		
				
		//Driver
		//browser		
		//url
		
		//set a path for driver
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		String driverPath = SeleniumManager.getInstance().getDriverPath("chromedriver");
		System.out.println(driverPath);

	}

}
