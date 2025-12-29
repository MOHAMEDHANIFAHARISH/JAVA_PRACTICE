package practice;

import java.util.*;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter ur Number");
		int n=sc.nextInt();
		sc.nextLine();
		if(n%2==0) {
			System.out.println("Its Even Number");
		}
		else {
			System.out.println("Its Odd Number");
		}

	}

}
