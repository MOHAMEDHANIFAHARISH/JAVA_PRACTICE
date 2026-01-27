package practice;


import java.util.*;
public class ArrayGet {

	public static void main(String[]arg) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("How Many Element is Store In Array: ");
		int size=sc.nextInt();
		
		int[] ary= new int[size];
		
		for(int i=0;i<size;i++) {
			System.out.println("Enter Ur Number");
			ary[i]=sc.nextInt();
			System.out.println("ur number: "+ary[i]);
		}
		
		System.out.println("Ur array: "+Arrays.toString(ary));
	}
}
