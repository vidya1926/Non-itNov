package testcase;

import org.testng.annotations.Test;

public class LearnAttribute {
	
	@Test(priority=2,invocationCount=6,threadPoolSize=2,invocationTimeOut=300)
	public void testC() throws InterruptedException
	{
		Thread.sleep(5000);
		System.out.println("From Test1");
	}
	
	@Test()
	public void testO() throws Exception {
		System.out.println("From test2");
		throw new Exception();
	}
	
	@Test(priority=3,dependsOnMethods="testO",alwaysRun=true)
	public void testA() {
		System.out.println("From test3");
	}

}
