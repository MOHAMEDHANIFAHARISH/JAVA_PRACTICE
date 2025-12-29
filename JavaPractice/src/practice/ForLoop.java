package practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ForLoop {
	
	public static void main(String arg[]) throws Exception {
		 Scanner sc=new Scanner(System.in);// one of the method of user input get
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));// one of the method of user input get
		 System.out.print("Enter ur Scanner Input: ");
		 int n=sc.nextInt();
		 for(int i=0;i<n;i++) {
			 System.out.println("SCANNER: "+i);
		 }
		 System.out.print("Enter ur Buffer Input: ");
		 int m=Integer.parseInt( br.readLine());
		 for(int j=0;j<m;j++) {
			 System.out.println("BUFFER: "+j);
		 }
	}

}
