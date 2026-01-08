package assignmentnine;

public class FullTimeEmployee extends Employee{

	public FullTimeEmployee(double paymentPerHour) {
        super(paymentPerHour);
    }

    @Override
    public double calculateSalary() {
        return paymentPerHour * 8; // constant 8 hours
    }
}


