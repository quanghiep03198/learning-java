package Week3;

public class GcdTest {
   public static void main(String[] args) {
      // Example usage of GCD calculation

      System.out.printf("%d", gcd(6, 9, 12));
      System.out.println('\n');
      System.out.printf("%d", gcd(12, 15, 18, 21));
      System.out.println('\n');
      System.out.printf("%d", gcd(12, 15));
      System.out.println('\n');
      System.out.printf("%d", gcd(1, 12));
      System.out.println('\n');
      System.out.printf("%d", gcd(5, 7, 11, 13, 17, 19));
   }

   // Method to calculate GCD using Euclidean algorithm
   public static int gcd(int a, int b, int... numbers) {
      // Start with GCD of first two numbers using Euclidean algorithm
      int result = Math.abs(a);
      int second = Math.abs(b);

      while (second != 0) {
         int temp = second;
         second = result % second;
         result = temp;
      }

      // If there are additional numbers, calculate GCD with each of them
      for (int num : numbers) {
         int current = Math.abs(num);
         while (current != 0) {
            int temp = current;
            current = result % current;
            result = temp;
         }
      }

      return result;
   }
}
