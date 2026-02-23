public class PalindromeCheckerApp {

    /**
     * Application entry point for UC2.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Hardcoded string
        String input = "madam";

        boolean isPalindrome = true;

        // Loop only till half of the string length
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        if (isPalindrome) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}