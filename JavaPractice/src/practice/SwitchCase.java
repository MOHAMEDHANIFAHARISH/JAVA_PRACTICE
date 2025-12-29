package practice;

import java.util.*;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Ur Data: ");
		String day=sc.nextLine();
		
		switch (day) {
		
		case "Monday": {
			System.out.println("its Monday");
			break;
		}
		case "Tuesday": {
			System.out.println("its Tuesday");
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + day);
		}
		
	}

}
