package week2day1;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnToLocateElements {

	public static void main(String[] args) {

		//launched the browser
		ChromeDriver driver=new ChromeDriver();
		System.out.println(driver);
		//load the url
		driver.get("http://leaftaps.com/opentaps");
		//maximized the browser
		driver.manage().window().maximize();
		//Enter the username
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		//Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//click the login 
		driver.findElement(By.className("decorativeSubmit")).click();
		//click the crmsfa
		driver.findElement(By.linkText("CRM/SFA")).click();
		//click Leads
		WebElement leads = driver.findElement(By.linkText("Leads"));
		String text = leads.getText();
		String attribute = leads.getAttribute("href");
		System.out.println(attribute);		
		System.out.println(text);
		
		
		leads.click();
		//click Create Lead
		
		  driver.findElement(By.linkText("Create Lead")).click(); //Enter company name
		  driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		  
		  //Enter Firstname
		  driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vidya");
		  //enter Last name
		  driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		  
		  //Click create lead 
		  driver.findElement(By.className("smallSubmit")).click();
		  
		  //to verify the page // to know the return type of the method-->ctrl 2 l/ctrl 1 -->assign to local variable 
		  String title = driver.getTitle();
		  System.out.println(title);
		  
		  //driver.close();
		 		
		  
		 
		
	}

}
