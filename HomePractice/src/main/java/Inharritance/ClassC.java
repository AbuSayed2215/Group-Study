package Inharritance;

public class ClassC extends ClassB {
	
	public void furniture() {
		String coutch="Leather";
		System.out.println(coutch);
	}
public static void main(String[] args) {
	ClassC obj = new ClassC();
	obj.furniture();
}
}
