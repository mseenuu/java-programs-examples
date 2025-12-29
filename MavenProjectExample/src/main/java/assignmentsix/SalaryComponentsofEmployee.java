package assignmentsix;

public class SalaryComponentsofEmployee {

	double hra, pf;

    void calculateComponents(double basicPay) {
        hra = basicPay * 0.05; // HRA 5% of basic pay
        pf = basicPay * 0.20;  // PF 20% of basic pay
    }
}
