package Week2;

import java.util.Scanner;

public class Demo {
   public static Scanner scanner = new Scanner(System.in);

   public static void main(String[] args) {
      try {
         checkIsEvenNumber();
      } catch (Exception e) {
         System.out.println("Invalid input. Please enter an integer. Do you want to try again? (y/n)");
         String response = scanner.nextLine();
         scanner.nextLine(); // Consume the newline character
         if (response.equalsIgnoreCase("y"))
            checkIsEvenNumber();
         else
            System.out.println("Exiting the program.");
      }
   }

   public static void checkIsEvenNumber() {
      System.out.print("Type a number to check if it is even or odd: ");
      int input = scanner.nextInt();
      if (input % 2 == 0) {
         System.out.printf("%d is an even number.", input);
      } else {
         System.out.printf("%d is an odd number.", input);
      }

   }

}
