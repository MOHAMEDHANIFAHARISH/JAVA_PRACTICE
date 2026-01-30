package practice;

abstract class test{
	
	abstract void test2(); //abstarct is used to must override the child class
}
class test1 extends test{

	@Override
	void test2() {
		System.out.println("abstract test");
	}
	
}
public class Abstract {

	public static void main(String[] args) {
		test1 obj=new test1();
		obj.test2();
	}

}
