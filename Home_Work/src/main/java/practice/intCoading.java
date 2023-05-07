package practice;

import java.util.Scanner;
import java.util.jar.Manifest;

public class intCoading {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your number :");
		int num = sc.nextInt();
		int rev = 0;
		while(num!=0)
		{
			rev=rev*10 + num%10;
			num=num/10;
						
		}
		System.out.println("The reverse numver is:"+rev);
//		StringBuffer sv = new StringBuffer(String.valueOf(num));
//		System.out.println("The reverse numver is :" +sv.reverse());
	}
	

}
	class stringRev{
	public static void main(String[] args) {
		String Name = "madam";
		StringBuffer sv = new StringBuffer(Name);
		System.out.println(sv.reverse());
	}
}
	class pan{
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the numver:");
			int num = sc.nextInt();
			int org_num=num;
			int rev=0;
			while(num!=0) {
				rev = rev*10 + num%10;
				num=num/10;
			}if (org_num == rev) {
			System.out.println(org_num+ "plandome");
			}else {
				System.out.println(org_num+ "not plandome");
			}
			
		}
	}
	class RN {
		
		public static void main (String[] args) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number:");
			int num = sc.nextInt();
			int rev = 0;
			while (num!=0) {
				rev=rev*10 + num%10;
				num=num/10;
				
			}
			System.out.println("The reverse number is:"+rev);
		}
		
	}
	class RName{
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String Name = "Abu Sayed";
			StringBuffer sv = new StringBuffer(Name);
			System.out.println(sv.reverse());
			
		}
		
	}
class PlaindomePraz{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num= sc.nextInt();
		int org_num=num;
		int rev=0;
		while (num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		if(org_num==rev) {
			
			System.out.println(org_num+"plaindome");
		
		}else {
			System.out.println(org_num+ "not plaindome");
		}
	}
}
class swapingNumz {
	
	public static void main (String[] args) {
		int a=10;
		int b=20;
		System.out.println("Before Swaping Number:"+a+" "+b);
		int t=a;
		a=b;
		b=t;
		System.out.println("After Swaping Number:"+a+" "+b);
		
	}
	
}
class paindomeSt{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string:");
		String str = sc.next();
		String org_str=str;
		String rev = "";
		int len  = str.length();
		for (int i=len-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		if (org_str.equals(rev)) {
			System.out.println(org_str+ "----plaindome");
		} else {
			System.out.println(org_str+ "---not plaindome");
		}}}
