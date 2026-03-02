import java.util.*;

/**
 * UC12
 * Author: Developer
 * Version: 12.0
 */

public class UseCase12PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.println("Choose Strategy:");
        System.out.println("1. Stack Strategy");
        System.out.println("2. Deque Strategy");
        System.out.print("Enter choice (1 or 2): ");

        int choice = scanner.nextInt();

        PalindromeStrategy strategy;

        // Inject strategy at runtime
        if (choice == 1) {
            strategy = new StackStrategy();
        } else {
            strategy = new DequeStrategy();
        }

        boolean result = strategy.check(input);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);

        scanner.close();
    }
}

interface PalindromeStrategy {
    boolean check(String input);
}
class StackStrategy implements PalindromeStrategy {

    @Override
    public boolean check(String input) {

        // Create a stack to store characters
        Stack<Character> stack = new Stack<>();

        // Push each character of the input string onto stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Compare characters by popping from stack
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

class DequeStrategy implements PalindromeStrategy {

    @Override
    public boolean check(String input) {

        Deque<Character> deque = new ArrayDeque<>();

        // Add characters to deque
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        // Compare from both ends
        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }

        return true;
    }
}