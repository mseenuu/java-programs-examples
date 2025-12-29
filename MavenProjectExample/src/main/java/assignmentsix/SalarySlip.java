package assignmentsix;

public class SalarySlip {

	public static void main(String[] args) {
		 
		        
		        Employee emp = new Employee();

		       
		        SalaryComponentsofEmployee comp = new SalaryComponentsofEmployee();
		        comp.calculateComponents(emp.basicPay);

		        
		        double totalSalary = emp.basicPay + comp.hra - comp.pf - emp.deduction + emp.bonus;

		       
		        System.out.println("----------- Salary Slip -----------");
		        System.out.println("Basic Pay   : " + emp.basicPay);
		        System.out.println("HRA         : " + comp.hra);
		        System.out.println("PF          : " + comp.pf);
		        System.out.println("Deduction   : " + emp.deduction);
		        System.out.println("Bonus       : " + emp.bonus);
		        System.out.println("----------------------------------");
		        System.out.println("Total Salary: " + totalSalary);
		    }
		}