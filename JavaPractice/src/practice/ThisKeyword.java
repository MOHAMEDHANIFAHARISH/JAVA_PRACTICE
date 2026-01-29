package practice;

import java.util.Scanner;

public class ThisKeyword {
	
	String name;
	
	 void fun(String name) {
		this.name=name;
		System.out.println("Ur name: "+this.name);
	}
	
	public static void main(String[] arg) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter UR Name: ");
		String name=sc.nextLine();
		ThisKeyword obj=new ThisKeyword();
		obj.fun(name);
	}
}
