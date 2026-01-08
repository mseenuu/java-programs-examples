package atmpinvalidation;

public class Bank {
	
	
	    private int pin;   
	   
	    public void setPin(int p) {
	        pin = p;
	    }

	    
	    public void validatePin() {
	        if (pin == 1001 || pin == 1234 || pin == 1212) {
	            System.out.println("Pin is valid,You can withdraw money");
	            
	        } else {
	            System.out.println("Invalid Pin,Transaction Failed");
	            
	        }
	    }
	

}
