package practice;

class a{
	int a=0;
	void func1() {
		System.out.println(a);
	}
}

class b extends a{
	int b=1;

	void func2() {
		System.out.println(b);
	}
}
class c extends b{
	int c=3;
	
	void func3() {
		System.out.println(c);
	}
}

public class MultipleInheritance {

	public static void main(String[] args) {
		c obj=new c();
		obj.func1();
		obj.func2();
		obj.func3();
	}

}
