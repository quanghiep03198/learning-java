package Week3;

import java.util.Scanner;

public class Matrix {
   public static Scanner scanner = new Scanner(System.in);

   
   public static void main(String[] args)

   {

      String matrixSizeStr = scanner.nextLine();
      matrixSizeStr = matrixSizeStr.trim().replaceAll("\\s+", " ");
      String[] matrixSizeParts = matrixSizeStr.split(" ");
      if (matrixSizeParts.length != 2) {
         System.out.println("Error: Please enter exactly two integers for matrix size");
         scanner.close();
         return;
      }
      for (String part : matrixSizeParts) {
         try {
            Integer.parseInt(part);
         } catch (NumberFormatException e) {
            System.out.println("Error: All elements must be integers");
            scanner.close();
            return;
         }
      }

      int rowCount = Integer.parseInt(matrixSizeParts[0]);
      int colCount = Integer.parseInt(matrixSizeParts[1]);
      scanner.nextLine(); // Consume the newline character

      float[][] matrix = new float[rowCount][colCount];
      for (int i = 0; i < rowCount; i++) {
         for (int j = 0; j < colCount; j++) {
            matrix[i][j] = scanner.nextFloat();
         }
      }

      System.out.println(rowCount + " " + colCount);
      scanner.nextLine(); // Consume the newline character
      for (int i = 0; i < rowCount; i++) {
         for (int j = 0; j < colCount; j++) {
            System.out.printf("%8.2f", matrix[i][j]);
         }
         System.out.println();
      }
   }
}
