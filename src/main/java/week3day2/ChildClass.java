package week3day2;

public class ChildClass extends Parentclass {
	//Runtime polymorphism-->Overriding concept
	//same method Same argument in different classes
	  public void ownHouse() {		  
	  super.ownHouse();//call the methods from the super class which is overrided in  the class
	  System.out.println("rebuilt into modern infracture"); 
	  	  }
	  
	  //Compile time Polymorphism-->overloading concept
	  //same class same method with diff diff arguments
	  public void ownHouse(int x) {
		  super.ownHouse();//call the methods from the super class which is overrided in  the class
		  System.out.println("rebuilt into modern infracture"); 
		 int i = super.x;
		  i=10;
		  String s="name";		  
		  s.indexOf(x);
		  s.indexOf(x, x);
		  		  
		  }
	 

	public static void main(String[] args) {
		ChildClass obj = new ChildClass();
		obj.ownHouse();
        
	}

}
