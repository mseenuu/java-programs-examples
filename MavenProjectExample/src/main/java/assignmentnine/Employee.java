package assignmentnine;

public abstract class Employee {
	
	public double paymentPerHour;

    public Employee(double paymentPerHour) {
        this.paymentPerHour = paymentPerHour;
    }
   
    public abstract double calculateSalary();

}
