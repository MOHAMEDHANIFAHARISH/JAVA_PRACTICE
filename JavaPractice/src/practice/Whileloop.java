package practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Whileloop {
	public static void main(String arg[]) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter integer: ");
		int n=br.read();
		int i=0;
		while(i<n) {
			System.out.println(n);
			System.out.println(i++); 
			
		}
		
	}

}
