package exceptionthrowsexample;

public class ThrowKeyword {

	public static void main(String[] args) {
		int age=16;
		if(age<18) {
			throw new ArithmeticException("not qualified");
			
		}else {
			System.out.println("eligible for voting");
		}

	}

}
