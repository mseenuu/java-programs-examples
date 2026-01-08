package assignmentnine;

public class Main {
	
	    public static void main(String[] args) {
	        Employee contractor = new Contractor(500, 6);
	        Employee fullTimeEmployee = new FullTimeEmployee(500);

	        System.out.println("Contractor Salary: " + contractor.calculateSalary());
	        System.out.println("Full Time Employee Salary: " + fullTimeEmployee.calculateSalary());
	    }

	

}
