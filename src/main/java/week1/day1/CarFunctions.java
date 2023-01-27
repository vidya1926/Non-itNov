package week1.day1;

public class CarFunctions {

	// accessspecifier returnType methodName(argument){}
	// accessspecifier-scope
	// returntype-datatype
	
	public void driveCar() {
		System.out.println("I started to learn driving");
	}

	public void applyGear() {
		System.out.println("I applied 3rd Gear");
	}

	public static void main(String[] args) {
		
		CarFunctions action=new CarFunctions();		
		action.applyGear();
		action.driveCar();

	}

}
