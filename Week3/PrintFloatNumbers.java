package Week3;

import java.util.Scanner;

public class PrintFloatNumbers {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int arraySize = scanner.nextInt();

      float[] floatArray = new float[arraySize];

      for (int i = 0; i < arraySize; i++) {
         floatArray[i] = scanner.nextFloat();
      }

      System.out.printf("%7s%10s\n", "Phan tu", "Gia tri");
      for (int i = 0; i < arraySize; i++) {
         System.out.printf("%7d%10.3f\n", i, floatArray[i]);
      }
   }
}
