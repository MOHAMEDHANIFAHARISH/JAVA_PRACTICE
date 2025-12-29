package practice;

import java.util.*;

 class Item{
	String name;
	int qty;
	int price;
	Item(String name,int qty,int price){
		this.name=name;
		this.qty=qty;
		this.price=price;
	}
	
	int gettotal() {
		return qty*price;
	}
}

public class InvoiceCalculation {
	
	
	
	public static void main(String[] arg) {
		
	
		List<Item> itemList=new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many items: ");
		int n=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++) {
			System.out.print("Enter ur item name: ");
			String name=sc.nextLine();
			System.out.print("enter ur item QTY: ");
			int qty=sc.nextInt();
			sc.nextLine();
			System.out.print("enter ur item price: ");
			int rate=sc.nextInt();
			sc.nextLine();
			
			itemList.add(new Item(name,qty,rate));
			
		}
		int grand =0;
		
		for(Item item:itemList) {
			System.out.println("Item Name: "+item.name+" |QTY: "+item.qty+" |Rate: "+item.price+" |Total: "+item.gettotal());
			
			grand+=item.gettotal();
		}
		
		System.out.println("Grand Total: "+grand);
		
		
		
	}

}
