package practice;

 class brand {
	 String name;
	 brand(String name) {
		this.name = name;
		System.out.println(name);
	}
}

 class model extends brand{

	 model(String name) {
		super(name);
		System.out.println(name);
		
	}
	 
 }

public class InheritanceWithSuperKeyword {

	public static void main(String[] args) {
		brand obj=new brand("yamaha");
		model obj1=new model("ho");
	}

}
