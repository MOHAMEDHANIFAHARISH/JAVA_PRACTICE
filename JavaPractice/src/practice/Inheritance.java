package practice;

 class brand {
	public brand(String string) {
		String name = string;
		System.out.println(name);
	}
}

 class model extends brand{

	public model(String string) {
		super(string);
		System.out.println(string);
		
	}
	 
 }

public class Inheritance {

	public static void main(String[] args) {
		brand obj=new brand("yamaha");
		model obj1=new model("ho");
	}

}
