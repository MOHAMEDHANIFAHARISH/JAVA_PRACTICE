package practice;

import java.util.Scanner;

public class FindOddorEven {
	
	void Find(int num) {
		if(num%2==0) {
			System.out.println("its Even Number");
		}
		else {
			System.out.println("its Odd Number");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		FindOddorEven obj=new FindOddorEven();
		System.out.print("Enter UR Number: ");
		int num=sc.nextInt();
		obj.Find(num);		
	}

}
