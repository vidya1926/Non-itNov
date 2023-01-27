package week3day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListOfoptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		System.out.println(driver);
		//load the url
		driver.get("http://leaftaps.com/opentaps");
		//maximized the browser
		driver.manage().window().maximize();
		//Enter the username
		//apply the wait to locate the element-global wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		WebElement uname = driver.findElement(By.id("username"));
		uname.sendKeys("DemoCSR");
		
		
		//Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//click the login 
		driver.findElement(By.className("decorativeSubmit")).click();
		//click the crmsfa
	//	driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		//click Leads
		
		  driver.findElement(By.linkText("Leads")).click(); //click Create Lead
		  driver.findElement(By.linkText("Create Lead")).click(); //Enter company name
		  driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		  
		  //Enter Firstname
		  driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vidya");
		  //enter Last name
		  driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		  
		  
		  WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		  Select dd=new Select(source); 
		  dd.selectByIndex(2);
		  
		List<WebElement> options = dd.getOptions();
	    System.out.println(options.size());
		 
	    List<WebElement> link = driver.findElements(By.tagName("a"));
	    System.out.println(link.size());
	    
	   String link2 = link.get(2).getText();
	 //   link2.click();
		
	  // List<WebElement> findElements = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
	   
	}

}
