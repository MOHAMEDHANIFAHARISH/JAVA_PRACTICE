package practice;

import java.util.Scanner;

public class Condition {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ur Condition: ");
		boolean con=sc.nextBoolean();//not accept the 0 and 1
		if(con) {
			System.out.println("Conditions True");
		}
		else {
			System.out.println("Condition False");
		}

	}

}
