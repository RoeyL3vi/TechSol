import java.util.Scanner;  // Import the Scanner class

class Test {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);  // Create a Scanner object
    
    System.out.print("What is your name? ");
    String word1 = input.nextLine();  // Read user input
    System.out.println("Your name is " + word1);  // Output user input

    System.out.print("type a number: ");
    int int1 = input.nextInt();

    System.out.print("type another number: ");
    int int2 = input.nextInt();

    System.out.print("type one more number: ");
    int int3 = input.nextInt();

    int product = int1 * int2 * int3;
    System.out.println("The product of those numbers is " + product);

    /*
     * int is an integer an is a whole number
     * double is a number that has a decimal
     * char is just a single character
     * boolean is a true or false variable
     * String is a variable that contains words
     * an array holds a number of values
     * a float is a number with 6-7 total digits
     */
  }
}
