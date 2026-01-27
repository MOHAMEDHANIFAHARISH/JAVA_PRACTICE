package practice;

public class Functioncallwithobject {

	void fun1() {
		System.out.println("Func 1 test");
	}
	
	public static void mani(String[] arg) {
		Functioncallwithobject obj1= new Functioncallwithobject();
		
		obj1.fun1();
	}

}
