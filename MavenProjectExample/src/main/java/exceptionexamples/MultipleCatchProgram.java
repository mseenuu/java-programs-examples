package exceptionexamples;

public class MultipleCatchProgram {

	public static void main(String[] args) {
		try {
			int arr[]= new int[5];
			arr[5]=50/0;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("arraybound exception");
		}
//		catch(ArithmeticException e) {
//			System.out.println(e);
//		}
		catch(Exception e) {
			System.out.println("unknown exception");
		}

	}

}
