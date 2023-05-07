package Inharritance;

public class ClassD extends ClassC{
	public void appliances () {
		String TV="Samsung";
		super.appliances();
		System.out.println("The television brand is :"+TV);
	}
public static void main(String[] args) {
	ClassD x = new ClassD();
	x.appliances();
}
}
