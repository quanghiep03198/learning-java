package Week3;

import java.util.Scanner;

public class SortArrayNumbers {

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int arraySize = scanner.nextInt();
      int[] numbers = new int[arraySize];
      scanner.nextLine(); // Consume the newline character
      for (int i = 0; i < arraySize; i++) {
         numbers[i] = scanner.nextInt();
      }
      sortArray(numbers);
      printArray(numbers);
   }

   public static void sortArray(int[] array) {
      for (int i = 0; i < array.length - 1; i++) {
         for (int j = i + 1; j < array.length; j++) {
            if (array[i] > array[j]) {
               // Swap elements
               int temp = array[i];
               array[i] = array[j];
               array[j] = temp;
            }
         }
      }
   }

   public static void printArray(int[] array) {
      for (int num : array) {
         System.out.print(num + " ");
      }
      System.out.println();
   }

}
