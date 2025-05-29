package Week3;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class ReverseString {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int arraySize = scanner.nextInt();
      String[] arr = new String[arraySize];
      scanner.nextLine();
      String result = "";
      for (int i = 0; i < arraySize; i++) {
         arr[i] = scanner.next();

      }
      Arrays.sort(arr, Collections.reverseOrder());
      for (int i = 0; i < arr.length; i++) {
         result += arr[i] + " ";
      }
      System.out.println(result);
   }
}
