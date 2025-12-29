package assignmentseven;

public class CheckDivisible extends Addition {

    CheckDivisible(int a, int b) {
        super(a, b);  
    }

    void check() {
        int sum = super.getSum();  
        System.out.println("Addition Result: " + sum);

        if (sum % 10 == 0) {
            System.out.println("The result is divisible by 10.");
        } else {
            System.out.println("The result is not divisible by 10.");
        }
    }

    public static void main(String[] args) {
        CheckDivisible obj = new CheckDivisible(25, 15);
        obj.check();
    }
}
