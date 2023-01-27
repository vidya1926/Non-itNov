package week8day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnConstructor {

	int x;
	String comName = "Testleaf";

	public LearnConstructor() {
		System.out.println("I am from default Constructor");
	}
	public LearnConstructor(int a, String comName) {
		this();
		x = a;
		this.comName = comName;
		System.out.println(x + "--" + comName);
	}
	public static void main(String[] args) {

		// ChromeDriver driver=new ChromeDriver();
		// LearnConstructor con=new LearnConstructor();
		LearnConstructor con1 = new LearnConstructor(1, "Qeagle");
		LearnConstructor con2 = new LearnConstructor(2, "TL");
		System.out.println(con2.comName);
	}

}
