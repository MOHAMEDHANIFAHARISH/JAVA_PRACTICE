package practice;
class a2{
	int a=0;
	void func1() {
		System.out.println(a);
	}
}

class b2 extends a1{
	int b=1;

	void func2() {
		System.out.println(b);
	}
}
class c2 extends a1{
	int c=3;
	
	void func3() {
		System.out.println(c);
	}
}
class c3 extends b2{
	int c=3;
	
	void func4() {
		System.out.println(c);
	}
}


public class HybridInheritance {

	public static void main(String[] args) {
		c3 obj=new c3();
		obj.func1();
		obj.func2();
		obj.func4();
	}

}
