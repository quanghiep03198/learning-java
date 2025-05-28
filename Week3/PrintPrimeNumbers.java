package Week3;

import java.util.Scanner;

public class PrintPrimeNumbers {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int limit = scanner.nextInt();

      StringBuilder result = new StringBuilder();
      for (int i = 0; i < limit; i++) {
         if (isPrime(i)) {
            result.append(i).append(" ");
         }
      }

      System.out.println(result.toString().trim());
   }

   public static boolean isPrime(int number) {
      if (number <= 1)
         return false;
      for (int i = 2; i <= Math.sqrt(number); i++) {
         if (number % i == 0)
            return false;
      }
      return true;
   }
}
