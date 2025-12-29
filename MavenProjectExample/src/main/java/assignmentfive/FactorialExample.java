package assignmentfive;

public class FactorialExample {

   
    static int calculateFactorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }

   
    static void printFactorial(int num) {
        int fact = calculateFactorial(num); 
        System.out.println("Factorial of " + num + " is " + fact);
    }

    public static void main(String[] args) {
        
        printFactorial(5);
    }
}

