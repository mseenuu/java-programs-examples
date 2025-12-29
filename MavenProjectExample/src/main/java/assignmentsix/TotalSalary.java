package assignmentsix;

public class TotalSalary {
    public static void main(String[] args) {

        
        EmployeeInput emp = new EmployeeInput();

       
        SalaryComponents comp = new SalaryComponents();
        comp.calculateComponents(emp.basicPay);

        
        double totalSalary = emp.basicPay + comp.hra + comp.pf + emp.bonus - emp.deduction;

        System.out.println("Total Salary of the Employee: " + totalSalary);
    }
}
