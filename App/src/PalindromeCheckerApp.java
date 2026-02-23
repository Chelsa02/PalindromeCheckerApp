import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author Developer
 * @version 9.0
 */
public class PalindromeCheckerApp {

    /**
     * Application entry point for UC9.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input : ");
        String input = sc.nextLine();

        // Initial call to the recursive check method
        boolean result = check(input, 0, input.length() - 1);

        System.out.println("Is Palindrome? : " + result);

        sc.close();
    }

    /**
     * Recursively checks whether a string is palindrome.
     * @param s Input string
     * @param start Starting index
     * @param end Ending index
     * @return true if palindrome, otherwise false
     */
    private static boolean check(String s, int start, int end) {
        // Base Condition: If start meets or exceeds end, all matched
        if (start >= end) {
            return true;
        }

        // Check if characters at current positions match
        if (s.charAt(start) != s.charAt(end)) {
            return false; // Mismatch found
        }

        // Recursive call: Move inward by incrementing start and decrementing end
        return check(s, start + 1, end - 1);
    }
}
