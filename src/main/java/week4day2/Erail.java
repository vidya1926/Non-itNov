package week4day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Erail {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		System.out.println(driver);
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		WebElement fromStation = driver.findElement(By.id("txtStationFrom"));
		fromStation.clear();
		fromStation.sendKeys("MAS");
		fromStation.sendKeys(Keys.ENTER);

		WebElement toStation = driver.findElement(By.id("txtStationTo"));
		toStation.clear();
		toStation.sendKeys("MDU");
		toStation.sendKeys(Keys.ENTER);

		driver.findElement(By.id("buttonFromTo")).click();

		List<WebElement> trainNames = driver.findElements(By.xpath(
				"//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody//td[2]/a"));

		List<String> listValues = new ArrayList<String>();

		for (WebElement tname : trainNames) {
			String text = tname.getText();
			listValues.add(text);
		}

		Set<String> uniqueValues = new LinkedHashSet<String>(listValues);

		if (listValues.size() == uniqueValues.size()) {
			System.out.println("No Duplicates");
		} else {
			System.out.println("Found Duplicates");
		}

		List<WebElement> trainNo = driver.findElements(By.xpath(
				"//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody//td[1]/a"));
    
		List<String> tno = new ArrayList<String>();
		for (WebElement tnos : trainNo) {
			String text = tnos.getText();
			tno.add(text);
		}

				
		
	}

}
