package practice;

interface dip{
	void disp();
}

public class LamdaExperssion {

	public static void main(String[] args) {
		dip obj=()->{
			System.out.println("testing");
		};
		obj.disp();
	}

}
