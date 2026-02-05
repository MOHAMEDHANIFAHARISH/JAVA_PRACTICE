package practice;

interface printable{
	void disp();
}

public class Inhertancefunctional {

	public static void main(String[] args) {
		printable obj= new printable() {

			@Override
			public void disp() {
				System.out.println("display");
			}
			
		};
			obj.disp();

	}

}
