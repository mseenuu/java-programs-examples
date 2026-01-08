package atmpinvalidation;

public class User {

	public static void main(String[] args) {
		
		 int userPin = 1234;   

	        Bank bank = new Bank();
	        bank.setPin(userPin);  
	        bank.validatePin();     
		

	}

}
