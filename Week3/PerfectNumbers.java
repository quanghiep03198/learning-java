package Week3;

import java.util.Scanner;

public class PerfectNumbers {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int limit = scanner.nextInt();
      String result = "";
      for (int i = 1; i <= limit; i++) {
         if (isPerfect(i)) {
            result += i + " ";
         }
      }
      System.out.println(result.trim());
   }

   public static boolean isPerfect(int number) {
      int sum = 0;
      for (int i = 1; i < number; i++) {
         if (number % i == 0) {
            sum += i;
         }
      }
      return sum == number;
   }

}
