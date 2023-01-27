package testcase;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class CommonClass {
	RemoteWebDriver driver;
	public String filename;
	//public ChromeDriver driver;
	//public EdgeDriver driver1;
	
	@Parameters({"browser","url","username","password"})
	@BeforeMethod
	public void preConditions(String browser,String url ,String username,String password) {
		
		if(browser.equalsIgnoreCase("chrome")) {
		driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge")) {
			
		driver=new EdgeDriver();	
		}				/*
		 * System.out.println(driver);
		 * System.out.println(Thread.currentThread().getId());
		 */
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("uname")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
	}
	
	@AfterMethod
	public void postCondition() {
		driver.close();
	}
	
	
	

	@DataProvider(name="fetchData")
	public String[][] sendData() throws IOException {

		/*
		 * String[][] data = new String[3][3];
		 * 
		 * data[0][0] = "TL"; data[0][1] = "vidya"; data[0][2] = "R";
		 * 
		 * data[1][0] = "Wipro"; data[1][1] = "Mirudula"; data[1][2] = "Kumar";
		 * 
		 * data[2][0] = "TCS"; data[2][1] = "Gayathiri"; data[2][2] = "R";
		 */
		return ReadExcelData.readData(filename);

	}

	
	//Xml-->@Before-->@Test-->@after
	//Xml-->@Beforesuite/@BeforeTest/@BeforeClass-->@DataProvider-->@BeforeMethod-->@Test
	

}
