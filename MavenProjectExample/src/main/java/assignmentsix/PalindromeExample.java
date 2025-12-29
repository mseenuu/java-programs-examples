package assignmentsix;

public class PalindromeExample {
    public static void main(String[] args) {

        String english = "malayalam";   // English word
        
        if (english.equals(new StringBuilder(english).reverse().toString())) {
            System.out.println("'" + english + "' is a Palindrome.");
        } else {
            System.out.println("'" + english + "' is Not a Palindrome.");
        }

        
    }
}

