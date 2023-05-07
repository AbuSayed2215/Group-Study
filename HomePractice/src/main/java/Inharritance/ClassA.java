package Inharritance;

public class ClassA {

	public void house() {
		int price = 250000;
		int year = 1950;
		System.out.println("House Price="+price+" "+"Making year="+year);
	}
	public void appliances () {
		String TV="LG";
		
		System.out.println("The television brand is :"+TV);
	}
	
	public static void main(String[] args) {
		
		ClassA x = new ClassA();
		x.house();
	}
}
