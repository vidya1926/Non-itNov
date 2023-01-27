package week1.day1;

public class CarInfo {

	// noOfwheels=4-->numbers int,short,long,float,double
	// brandName=BMW -->word char
	// regNo=numberand characters
	// bodyColur=black-->word
	// carPrice->number->1500000
	// typeOfFuel->p

	// DataTypes-->type of data given as info
	// Decalre the infor/data in java
	// dtattype variableName =value
	// instance varibales/global variable/class level variable
	short noOfWheels = 4;//
	int price = 550000;
	long phno = 6746290204l;
	float fuelCapacity = 12.5f;
	double onRoadPrice = 234556.5676;
	char typeOffuel = 'p';
	String regNo = "TN12 AU 2309";
	String brandVersion = "V2022";
	boolean isVisible= true;
	
	public static void main(String[] args) {

		int noOfSeats = 6;
		int addedPrice = 20000;
		// to Create Object
		// classname objectname=new classname();
		
		CarInfo maruthi = new CarInfo();
		// to call the class variables/info
		// onjName.variable
		System.out.println(maruthi.noOfWheels);
		System.out.println(maruthi.fuelCapacity);
		System.out.println(maruthi.onRoadPrice);
		System.out.println(maruthi.phno);
		System.out.println(maruthi.price);
		System.out.println(maruthi.typeOffuel);

		System.out.println("Information about car");
		CarInfo Hyundai = new CarInfo();
        //local varible
		int originalPrice = Hyundai.price;
		int newPrice = originalPrice + addedPrice;
		System.out.println(newPrice);
		
		

	}

}
