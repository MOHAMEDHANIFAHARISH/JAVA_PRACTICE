package practice;

import java.util.Scanner;

public class ForEach {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many array element: ");
		int s=sc.nextInt();
		int[] nums=new int[s];
		for(int i=0;i<s;i++) {
			System.out.println("Enter ur Element");
			nums[i]=sc.nextInt();
		}
		for(int var:nums) {
			System.out.println(var);
		}
	}
}
