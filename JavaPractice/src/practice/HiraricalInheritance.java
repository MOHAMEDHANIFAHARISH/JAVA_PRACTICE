package practice;

class a1{
	int a=0;
	void func1() {
		System.out.println(a);
	}
}

class b1 extends a1{
	int b=1;

	void func2() {
		System.out.println(b);
	}
}
class c1 extends a1{
	int c=3;
	
	void func3() {
		System.out.println(c);
	}
}

public class HiraricalInheritance {
	
	
	public static void main(String[] args) {
		c1 obj=new c1();
		obj.func1();
		obj.func3();

	}

}
