import java.util.Scanner;

public class InputOutputExample {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for an integer
        System.out.print("Enter an integer: ");
        int integerInput = scanner.nextInt();
        
        // Prompt the user for a decimal number
        System.out.print("Enter a decimal number: ");
        double decimalInput = scanner.nextDouble();
        
        // Consume the leftover newline
        scanner.nextLine();
        
        // Prompt the user for a string
        System.out.print("Enter a word or sentence: ");
        String stringInput = scanner.nextLine();
        
        // Display the inputs using different output methods
        System.out.println("\nYour integer: " + integerInput);
        
        // Using printf to format the decimal number to 2 decimal places
        System.out.printf("Your decimal number: %.2f\n", decimalInput);
        
        // Display the string input
        System.out.println("Your string: " + stringInput);
        
        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
