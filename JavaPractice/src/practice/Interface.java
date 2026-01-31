package practice;

interface  testing{
	 void run();//interface does not create object and
	 //its default abstract method and not have constructor and
	 //if any variable is create public static final keyword default present
}

class cat implements testing{

	@Override
	public void run() {
		System.out.println("run fast");
	}
	
}

public class Interface {

	

	public static void main(String[] args) {
		cat obj=new cat();
		obj.run();
				
	}

}
