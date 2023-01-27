package week1.day1;

public class CallCarFunctions {

	
	public void maruthiBrand() {
		System.out.println("Using existing function");
	}
	
	
	public static void main(String[] args) {
		
		CarFunctions fn=new CarFunctions();
		fn.applyGear();
		fn.driveCar();
		
		CarInfo in=new CarInfo();
		//ctrl 2 l -shortcut key
		String brandVersion = in.brandVersion;
		System.out.println(brandVersion);
		
		CallCarFunctions m=new CallCarFunctions();
		m.maruthiBrand();
		
	}

}
