package practice;
import java.util.Scanner;

class ArrayElement{
	private static final int intialcapacity=16;
	int arr[];
	int size =0;
	int capacity;
	
	public ArrayElement(){
		capacity=intialcapacity;
		arr=new int[capacity];
	}
	
	public void insert(int val) {
			arr[size]=val;
			size++;
	}
	
	public void display() {
		for(int value:arr) {
			System.out.println(value);
		}
	}
	
	public void specposition(int pos,int val) {
		for(int i=size;i>pos;i--) {
			arr[size]=arr[i-1];
		}
		update(pos,val);
		size++;
	}
	public void update(int pos,int val) {
		arr[pos]=val;
	}
}

public class DynamicArray {

	public static void main(String[] args) {
		//insert at end,
		//display the list,
		//insert specific position,
		//delete a specific position,
		//exit, 
		//enter ur choice type,
		//delete at end, 
		//delete from begin,
		//insert at begin,
		//get(index),
		//update(index,val), 
		//search(val)->return index , 
		//clear, 
		//contains return true or false
		
		Scanner sc= new Scanner(System.in);
		ArrayElement obj=new ArrayElement();
		while(true) {
		System.out.println("1.insert at end");
		System.out.println("2.display the list");
		System.out.println("3.insert specific position");
		System.out.println("4.delete at end");
		System.out.println("5.delete from begin");
		System.out.println("6.insert at begin");
		System.out.println("7.get(index)");
		System.out.println("8.update(index,val)");
		System.out.println("9.search(val)->return index");
		System.out.println("10.contains return true or false");
		System.out.println("11.clear");
		System.out.println("12.Enter your choice type");
		System.out.println("13.exit");
		System.out.print("Enter Ur Choice: ");
		int choice=sc.nextInt();
		switch (choice) {
		case 1: {
			System.out.println("enter the value : ");
			int val=sc.nextInt();
			obj.insert(val);
			break;
		}
		case 2:{
			obj.display();
			break;
		}
		case 3:{
			System.out.println("Enter ur Position: ");
			int pos=sc.nextInt();
			System.out.println("Enter ur Value: ");
			int val=sc.nextInt();
			obj.specposition(pos,val);
			break;
			
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + choice);
		}
		
		
		
		
		
		
	}

}
}
