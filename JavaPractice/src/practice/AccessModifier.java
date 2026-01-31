package practice;

class testprivate{
	public int l=1; //public is access with anywhere
	private int i=10; // private only access with class
	protected int j=2; //you use extends it will be access
	int k=3; //default access with one package
	void num(){
		System.out.println(i);
	}
}

public class AccessModifier {

	public static void main(String[] args) {
		testprivate obj=new testprivate();
		obj.num();
		System.out.println(obj.j);
		System.out.println(obj.k);
	}
}
