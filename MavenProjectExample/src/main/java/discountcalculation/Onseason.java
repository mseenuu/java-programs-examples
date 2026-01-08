package discountcalculation;

public class Onseason {
	
	public void discount(double amount) {
        double discount = amount * 40 / 100;
        double finalAmount = amount - discount;
        System.out.println("Onseason Discount (40%) = " + discount);
        System.out.println("Amount to Pay = " + finalAmount);
	}

}
