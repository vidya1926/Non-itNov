package week4day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTable {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		System.out.println(driver);
		driver.get("https://www.leafground.com/table.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		/*
		 * //to identify the table with first row first col data from header table
		 * WebElement theader =
		 * driver.findElement(By.xpath("//table[@role='grid']/thead/tr/th[2]/span"));
		 * String text = theader.getText(); System.out.println(text);
		 * 
		 * //to get the one particular data from table String col2data =
		 * driver.findElement(By.xpath("//table[@role='grid']/tbody/tr[2]/td[2]/span[3]"
		 * )).getText(); System.out.println(col2data);
		 */
		
		//to find the size of row size
		List<WebElement> rowData = driver.findElements(By.xpath("//table[@role='grid']/tbody/tr"));
		int rsize = rowData.size();
		System.out.println("Row size: "+rsize);
		
		//to find the size of the column
		List<WebElement> colData = driver.findElements(By.xpath("//table[@role='grid']/tbody/tr[1]/td"));
		int csize = colData.size();
		System.out.println("Column Size: "+ csize +" in the table");
		
		//to get the values fromm all the rows of first column
		System.out.println("From all rows of 2nd column");
		
		List<String> listValue=new ArrayList<String>();
		
		for(int i=1;i<=rsize;i++) {
			
			String text = driver.findElement(By.xpath("//table[@role='grid']/tbody/tr["+i+"]/td[2]")).getText();
			System.out.println(text);			//tr[1]
			listValue.add(text);				//tr[2]
		}
		
		System.out.println(listValue.size());
		Set<String> unique=new LinkedHashSet<String>(listValue);
		System.out.println(unique.size());
		
		
		if(listValue.size()==unique.size()) {
			System.out.println("No duplicates");
		}else {
			System.out.println("found duplicates");
		}
		
		
		System.out.println("******************************");		
		System.out.println("From 1 rows of all columns");
		for(int i=1;i<=csize;i++) {			
			String text = driver.findElement(By.xpath("//table[@role='grid']/tbody/tr[1]/td["+i+"]")).getText();
			System.out.println(text);			//td[1]
												//td[2]
		}
		
		
		System.out.println("******************************");		
		System.out.println("From all rows and all columns");
		
		for(int i=1;i<=rsize;i++) {
			for(int j=1;j<=csize;j++) {
				String AllValues = driver.findElement
						(By.xpath("//table[@role='grid']/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.println(AllValues);
			}
		}
		
		
		
		
	}

}
