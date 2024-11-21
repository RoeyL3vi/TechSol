/* In java, an array is a container that holds a fixed number of values in a single data type. In these program,
 * I am using a multidimensional array which allows me to have rows and columns of information.
 */
import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Create a 2D array with 3 rows and 3 columns
        Object[][] personalInfo = new Object[3][3];

        // Initialize data
        personalInfo[0][0] = "John";  // Name (String)
        personalInfo[0][1] = 25;      // Age (Int)
        personalInfo[0][2] = 5.9;     // Height in feet (Double)

        personalInfo[1][0] = "Alice"; 
        personalInfo[1][1] = 30;      
        personalInfo[1][2] = 5.6;     

        personalInfo[2][0] = "Bob";   
        personalInfo[2][1] = 20;      
        personalInfo[2][2] = 6.0;     

        // Print data
        System.out.println("Name\tAge\tHeight (ft)");
        for (Object[] row : personalInfo) {
            System.out.println(row[0] + "\t" + row[1] + "\t" + row[2]);
        }

        System.out.println("Add a row to the array");
        System.out.print("Enter name: ");
        String name = input.nextLine();
        System.out.print("Enter age: ");
        int age = input.nextInt();
        System.out.print("Enter height (ft): ");
        double height = input.nextDouble();
        input.nextLine(); 

        Object[][] personalInfoNew = new Object[personalInfo.length + 1][personalInfo[0].length];
        for (int i = 0; i < personalInfo.length; i++) {
            personalInfoNew[i] = personalInfo[i].clone();
        }
        personalInfoNew[personalInfoNew.length - 1][0] = name;
        personalInfoNew[personalInfoNew.length - 1][1] = age;
        personalInfoNew[personalInfoNew.length - 1][2] = height;
        personalInfo = personalInfoNew;

        System.out.println("\nUpdated Array:");
        System.out.println("Name\tAge\tHeight (ft)");
        for (Object[] row : personalInfo) {
            System.out.println(row[0] + "\t" + row[1] + "\t" + row[2]);
        }

        System.out.print("\nEnter index to search (0-" + (personalInfo.length - 1) + "): ");
        int index = input.nextInt();
        input.nextLine(); 

        if (index >= 0 && index < personalInfo.length) {
            Object[] row = personalInfo[index];
            System.out.println("\nName: " + row[0]);
            System.out.println("Age: " + row[1]);
            System.out.println("Height: " + row[2]);
        } else {
            System.out.println("Invalid index.");
        }
    }
}
