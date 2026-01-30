package practice;

public class Static {
	
	static int a=0; // static is not change last variable is assign
	int j=0;
	
	static void stt() {
		System.out.println("hello");  //static variable not need to create object and static func acess the static func
	}

	public static void main(String[] args) {
		Static obj=new Static();
		a=10;
		a=20;
		System.out.println(a);
		System.out.println(obj.j);
		stt();
	}

}
