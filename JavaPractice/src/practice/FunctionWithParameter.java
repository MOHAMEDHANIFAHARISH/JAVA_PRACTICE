package practice;

import java.util.Scanner;

public class FunctionWithParameter {
	
	int sum(int num1,int num2) {
		return num1+num2;
	}
	
	String name(String name) {
		return name;
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		FunctionWithParameter obj=new FunctionWithParameter();
		
		System.out.print("Enter UR First Number: ");
		int num1=sc.nextInt();
		System.out.print("Enter UR Second Number: ");
		int num2=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter UR Name: ");
		String name=sc.nextLine();
		
		System.out.println("Total :"+obj.sum(num1,num2));
		System.out.println("Your Name: "+obj.name(name));

	}

}
