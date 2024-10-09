// Roey Levi
// Date: 10/8/2024
// Purpose of program: To show the purpose and importance of conditionals in programming.
/*  In any programming language, conditionals are used to make decisions based on certain conditions.
 * An example would be an if-else statement.*/
import java.util.Scanner;
import java.util.InputMismatchException;

public class Conditionals2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int sum = 0;
        String continueInput;
        boolean validInput = false;

        // executes the "do" code until the condition (the "while") becomes false
        do {
            //checks if the first int is a valid input
            while (!validInput) {
                System.out.print("Enter the first number: ");
                try {
                    num1 = Integer.parseInt(input.nextLine());
                    validInput = true;  // If parsing succeeds, exit the loop
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid integer.");
                }
            }
            validInput = false;
            
            //checks if the second int is a valid input
            while (!validInput) {
                System.out.print("Enter the second number: ");
                try {
                    num2 = Integer.parseInt(input.nextLine());
                    validInput = true;  // If parsing succeeds, exit the loop
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid integer.");
                }
            }  
            validInput = false;

            // Calculate the sum
            sum = num1 + num2;

            // Determine if the sum of both numbers is positive, negative, or zero
            if (sum > 0) {
                System.out.println("The sum is positive.");
            } else if (sum < 0) {
                System.out.println("The sum is negative.");
            } else if (sum == 0) {
                System.out.println("The sum is zero.");
            }
            
            // Ask the user if they want to continue
            System.out.println("Do you want to try more numbers? (yes/no):");
            continueInput = input.nextLine().toLowerCase();
        } while (continueInput.equals("yes"));

        System.out.println("Program ended.");
        
        //closes the scanner
        input.close();
    }
}
