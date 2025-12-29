package assignmentsix;

public class SalaryComponents {
    double hra, pf;

    void calculateComponents(double basicPay) {
        hra = basicPay * 0.05;   // HRA 5%
        pf = basicPay * 0.20;    // PF 20%
    }
}
