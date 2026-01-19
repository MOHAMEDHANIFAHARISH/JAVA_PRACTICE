package practice;

import java.util.Scanner;


public class StringComparession {
	
	public static String compression(String Sentence) {
		
		StringBuilder SB = new StringBuilder();
		int count=1;
		
		for(int i=0;i<Sentence.length();i++) {
			if(i+1<Sentence.length()&&Sentence.charAt(i)==Sentence.charAt(i+1)) {
				count++;
			}
			else {
				SB.append(Sentence.charAt(i)).append(count);
				count=1;
			}
		}
		
		
		return SB.toString();
		
	}
	
	
	public static void main(String[]arg) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Input: ");
		String str=sc.nextLine();
		System.out.println("Before The Compression: "+str);
		System.out.println("After The Compression: "+compression(str));
		sc.close();
		
	}
}
