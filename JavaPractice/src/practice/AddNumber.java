package practice;

import java.util.Scanner;

public class AddNumber {
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Your Frist Number: ");
		int a=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Your Second Number: ");
		int b=sc.nextInt();
		sc.nextLine();
		int sum =a+b;
		System.out.println("Total: "+sum);
		sc.close();
	}

}
