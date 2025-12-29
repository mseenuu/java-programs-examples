package assignmentfive;

public class ReverseNumber {

	

	    int num;
	    int reverse = 0;

	 
	    public ReverseNumber() {
	        System.out.println("Finding reverse...");
	    }

	    // Calculate reverse
	    public ReverseNumber(int num) {
	        this.num = num;   

	        int temp = num;
	        while (temp != 0) {
	            int digit = temp % 10;
	            reverse = reverse * 10 + digit;
	            temp = temp / 10;
	        }

	        System.out.println("Reverse of " + num + " is " + reverse);
	    }

	    public static void main(String[] args) {

	        
	        ReverseNumber r = new ReverseNumber(1234);
	    }
	}

