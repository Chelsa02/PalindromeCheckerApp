import java.util.LinkedList;
import java.util.LinkedList;

/**
 * UseCase8PalindromeCheckerApp
 * Validates a palindrome using a LinkedList by comparing first and last elements.
 */
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        // Define the input string
        String input = "level";
        System.out.println("Input : " + input);

        // Create a LinkedList to store characters
        LinkedList<Character> list = new LinkedList<>();

        // Add each character to the linked list
        for (char c : input.toCharArray()) {
            list.add(c);
        }

        // Flag to track palindrome state
        boolean isPalindrome = true;

        // Compare until only one or zero elements remain
        // removeFirst() and removeLast() effectively check the edges moving inward
        while (list.size() > 1) {
            if (!list.removeFirst().equals(list.removeLast())) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}
