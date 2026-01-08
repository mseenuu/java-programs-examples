package exceptionthrowsexample;

public class ThrowsExample {

	public static void main(String[] args) throws VotingException {
		
		int age=15;
		 
		if(age<18) {
		 throw new VotingException("not eligible");
		}else {
			System.out.println("eligible for voting");
		}

	}

}
