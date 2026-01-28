package practice;
import java.util.Scanner;

public class Constructor {
	int mark;
	String name;
	Constructor(int x,String y){
		mark=x;
		name=y;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter ur mark: ");
		int x=sc.nextInt();
		sc.nextLine();
		System.out.println("enter ur name: ");
		String y=sc.nextLine();
		
		Constructor obj=new Constructor(x,y);
		System.out.println(obj.mark);
		System.out.println(obj.name);
	}

}
