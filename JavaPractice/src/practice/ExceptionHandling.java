package practice;

import java.util.Scanner;

class CustomException extends Exception {
	public CustomException(String msg) {
		super(msg);
	}
}

public class ExceptionHandling {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter UR Input");
		try {
			int s = sc.nextInt();
			throw new CustomException("Custom Exception");
		} catch (CustomException e) { // custom exception is must be first exception
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}

		finally {
			System.out.println("finaly");
		}

	}

}
