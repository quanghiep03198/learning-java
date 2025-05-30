package Week3;

import java.util.Scanner;

public class Gcd {
   public static Scanner scanner = new Scanner(System.in);

   public static void main(String[] args) {
      String inputs = scanner.nextLine();
      inputs = inputs.trim().replaceAll("\\s+", " ");
      String[] parts = inputs.split(" ");
      if (parts.length != 2) {
         System.out.println("Error: Please enter exactly two integers");
         scanner.close();
         return;
      }
      for (String part : parts) {
         try {
            int val = Integer.parseInt(part);
            if (val < 0)
               throw new NumberFormatException();
         } catch (NumberFormatException e) {
            System.out.println("Du lieu vao khong hop le.");
            scanner.close();
            return;
         }
      }

      int a = Integer.parseInt(parts[0]);
      int b = Integer.parseInt(parts[1]);
      int gcdNum = gcd(a, b);
      System.out.printf("USCLN cua %d va %d la: %d", a, b, gcdNum);
   }

   public static int gcd(int a, int b) {
      while (b != 0) {
         int temp = b;
         b = a % b;
         a = temp;

      }
      return a;
   }
}
