package Inharritance;



public class Class11 {
	
	int age () {
		return 20;
	}
	static void student() {
		String name = "jen";
		System.out.println("student name:"+name);
	}
	public static void main(String[] args) {
		
		Class11.student();
	
		Class11 obj = new Class11();
		System.out.println("student age: "+obj.age());
	}
}


