package practice;

class testprivate{
	private int i=10; // private only access with class
	protected int j=2; //protected access with one package
	void num(){
		System.out.println(i);
	}
}

public class AccessModifier {

	public static void main(String[] args) {
		testprivate obj=new testprivate();
		obj.num();
		System.out.println(obj.j);
	}
}
