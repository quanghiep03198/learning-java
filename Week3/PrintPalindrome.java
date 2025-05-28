package Week3;

import java.util.*;
import java.util.stream.Collectors;

public class PrintPalindrome {

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      // Nhập số bắt đầu và số kết thúc
      String lim = scanner.nextLine(); // Example number
      lim = lim.trim().replaceAll("\\s+", " ");
      int[] numbers = Arrays.stream(lim.split(" "))
            .mapToInt(Integer::parseInt).toArray();

      if (numbers.length != 2 || numbers[0] > numbers[1]) {
         System.out.println("");
         return;
      }

      ArrayList<Integer> palindromes = new ArrayList<>();
      for (int number = numbers[0]; number <= numbers[1]; number++) {
         if (isPalindrome(number))
            palindromes.add(number);
      }

      String result = palindromes.stream()
            .map(String::valueOf)
            .collect(Collectors.joining(" "));

      System.out.println(result);
   }

   public static int reverseInt(int number) {
      int reversed = 0;
      while (number != 0) {
         int digit = number % 10;
         reversed = reversed * 10 + digit;
         number /= 10;
      }
      return reversed;
   }

   public static boolean isPalindrome(int number) {
      int original = number;
      return original == reverseInt(number);
   }
}
