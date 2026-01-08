package assignmentnine;

public class HDFC implements RBI{	
	
	 public void recurringDeposit(double amount, int duration) {
	        double totalDeposit = amount * duration;
	        double interest = (totalDeposit * INTEREST_RATE * duration) / 100;
	        double maturityAmount = totalDeposit + interest;

	        System.out.println("Bank : HDFC");
	        System.out.println("Monthly Deposit Amount : " + amount);
	        System.out.println("Duration (months) : " + duration);
	        System.out.println("Interest Rate : " + INTEREST_RATE + "%");
	        System.out.println("Maturity Amount : " + maturityAmount);
	    }

}
