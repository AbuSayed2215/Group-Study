package Inharritance;

public class Vehicle {
	
	 Vehicle(String Car, int milleage) {
		 
		System.out.println("Car brand="+Car+" "+milleage);
	}
	 
	 public int age() {
		 return 25;
	 }
	 
public static void main(String[] args) {
	Vehicle obj = new Vehicle("Ford", 85000);
	
	System.out.println(obj.age());
	
	
	}
	
}
