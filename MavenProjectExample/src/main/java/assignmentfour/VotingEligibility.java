package assignmentfour;

public class VotingEligibility {

    
    static boolean isEligible(int age) {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int age = 17;

        if (isEligible(age)) {
            System.out.println("Candidate is eligible for voting");
        } else {
            System.out.println("Candidate is not eligible for voting");
        }
    }
}

