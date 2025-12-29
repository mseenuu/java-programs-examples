package assignmentfour;

public class PalindromeExample {

    // Method 1: to find the reverse of a number
    static int reverseNumber(int num) {
        int reverse = 0;

        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }
        return reverse;
    }

    // Method 2: to check palindrome or not
    static void checkPalindrome(int number) {
        int reversed = reverseNumber(number);

        if (number == reversed) {
            System.out.println(number + " is a Palindrome number");
        } else {
            System.out.println(number + " is Not a Palindrome number");
        }
    }

    public static void main(String[] args) {
        int number = 121;

        checkPalindrome(number);
    }
}

