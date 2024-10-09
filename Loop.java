import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      int b = 2;
      int c = 2;
      
      System.out.println("Would you like to see even numbers or odd numbers?(even/odd)");
      String loopOne = input.nextLine().toLowerCase();
      if (loopOne.equals("even")){
      while (b<=100){
        System.out.println(b);
        b += 2;
      }

      System.out.println("End of even numbers");
      }
      else if (loopOne.equals("odd")){
      for (int i = 1; i <= 100; i += 2) {
        System.out.println(i);
      }
      
      System.out.println("End of odd numbers");
      }


      while (true){
        System.out.println("Would you like to see a loop again? (yes/no)");
        String repeatLoop = input.nextLine().toLowerCase();
        if(repeatLoop.equals("no"))
        {
          break;
        }
        else if(repeatLoop.equals("yes"))
        {
        System.out.println("Would you like to see the even or odd loop? (even/odd)");
        String oddEven = input.nextLine().toLowerCase();
        if (oddEven.equals("odd")) {
          for (int i = 1; i <= 100; i += 2) {
            System.out.println(i);
          }
          
          System.out.println("End of odd numbers");
        } 
        else if (oddEven.equals("even")) {
          while (c<=100){
            System.out.println(c);
            c += 2;
          }
        }
      }
    }
    System.out.println("goodbye");
    input.close();
  }
}
  
