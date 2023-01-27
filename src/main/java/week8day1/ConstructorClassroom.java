package week8day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class ConstructorClassroom {

	public static final int buildingfee=100000;
	String collegeName = "WCC";

	public ConstructorClassroom() {
		System.out.println("Anna University");
	}
	public ConstructorClassroom(int a, String collegeName) {
		this();
	//	this.buildingfee=a; cannot assign 
		this.collegeName = collegeName;
		System.out.println(a + "--" + collegeName);
	}
	public static void main(String[] args) {
		
		ConstructorClassroom con = new ConstructorClassroom(2, "Layola");
		System.out.println(con.collegeName+"-->"+buildingfee);
	}

}
