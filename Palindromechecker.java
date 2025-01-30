import java.util.Scanner;

public class Palindromechecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word or phrase: ");
        String input = scanner.nextLine();
        String cleanInput = input.replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(cleanInput).reverse().toString();
        if (cleanInput.equals(reversed)) {
            System.out.println("It is a palindrome!");
        } else {
            System.out.println("It is not a palindrome.");
        }

        scanner.close();
    }
}
