import java.util.Scanner;
import java.util.Stack;

public class Challenge4 {
    public static boolean isPalindrome(String str)
    {
        // Removing the spaces and converting to all lowercase to make it easier to compare
        String compareString = str.replaceAll("\\s+", "").toLowerCase();
        // Creating a stack for comparison of characters
        Stack<Character> stk = new Stack<>();

        // Pushing half of the string onto the stack for comparison
        for(int i = 0; i < compareString.length() / 2; i++)
        {
            stk.push(compareString.charAt(i));
        }

        // Calculating the middle character of the string, skipping it if the length is odd
        int index;
        if (compareString.length() % 2 == 0)
        {
            index = compareString.length() / 2;
        }
        else {
            index = compareString.length() / 2 + 1;
        }

        // Comparing the second half of the string with the first half of the string by popping from the stack
        for(int i = index; i < compareString.length(); i++)
        {
            if (compareString.charAt(i) != stk.pop())
            {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a string: ");
        String input = scanner.nextLine();

        if(isPalindrome(input)) {
            System.out.println(input + " is a palindrome!");
        }
        else {
            System.out.println(input + " is not a palindrome!");
        }
        scanner.close();
    }
}
