package discountcalculation;

public class Offseason{
	
	public void discount(double amount) {
        double discount = amount * 15 / 100;
        double finalAmount = amount - discount;
        System.out.println("Offseason Discount (15%) = " + discount);
        System.out.println("Amount to Pay = " + finalAmount);
    }

	public static void main(String[] args) {
		Offseason offseason = new Offseason();
		offseason.discount(2000);
		
		Onseason onseason = new Onseason();
		onseason.discount(2000);
		
		

	}

}
