package exceptionexamples;

public class ExceptionHandling {

	public static void main(String[] args) {
		try {
			int x = 100 / 0;
			System.out.println(x);
		} catch (ArithmeticException e) {
			System.out.println(e);

		} finally {
			System.out.println("x is an integer");
		}

	}

}
