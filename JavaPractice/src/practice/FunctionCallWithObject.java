package practice;

public class FunctionCallWithObject {

	void fun1() {
		System.out.println("Func 1 test");
	}
	
	public static void main(String[] arg) {
		FunctionCallWithObject obj1= new FunctionCallWithObject();
		
		obj1.fun1();
	}

}
