package assignmentnine;

public class Contractor extends Employee{

	public int workingHours;

    public Contractor(double paymentPerHour, int workingHours) {
        super(paymentPerHour);
        this.workingHours = workingHours;
    }

    @Override
    public double calculateSalary() {
        return paymentPerHour * workingHours;
    }
	

}
