package practice;

interface  testing{
	 void run();//interface does not create object and
	 //its default abstract method and not have constructor and
	 //if any variable is create public static final keyword default present
	 //after the version 8 u can create static function or default function
}

interface function{
	static void func3() {
		System.out.println("testing");
	}
}

class cat implements testing{

	@Override
	public void run() {
		System.out.println("run fast");
	}
	
}

public class Interface implements function{

	

	public static void main(String[] args) {
		cat obj=new cat();
		obj.run();				
	}

}
