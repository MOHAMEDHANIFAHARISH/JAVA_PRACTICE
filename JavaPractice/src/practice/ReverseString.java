package practice;

public class ReverseString {
	
	public static StringBuilder reverseword(String str) {
		StringBuilder SB = new StringBuilder(str);
		return SB.reverse();
	}

	public static void main(String[] args) {
		String sen="HNAIFA";
		System.out.println(reverseword(sen));
		

	}

}
