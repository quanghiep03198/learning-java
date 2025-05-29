package Week3;

import java.util.Scanner;

public class CalcMatrix {
   public static Scanner scanner = new Scanner(System.in);

   
   public static void main(String[] args) {
      String inputs = scanner.nextLine();
      inputs = inputs.trim().replaceAll("\\s+", " ");
      String[] parts = inputs.split(" ");
      if (parts.length != 2) {
         System.out.println("Error: Please enter exactly two integers for matrix size");
         scanner.close();
         return;
      }
      for (String part : parts) {
         try {
            Integer.parseInt(part);
         } catch (NumberFormatException
         e) {
            System.out.println("Error: All elements must be integers");
            scanner.close();
            return;
         }
      }
      int n = Integer.parseInt(parts[0]);
      int m = Integer.parseInt(parts[1]);
      
      // khai báo, tạo mới 3 ma trận theo k.thước nhập vào
      double[][] matrix1 = new double[n][m];
      double[][] matrix2 = new double[n][m];
      double[][] matrixSum = new double[n][m];
      
      // gọi ph.thức nhập các pt của ma trận1
      inputMatrix(matrix1);
      
      // gọi ph.thức nhập các pt của ma trận2
      inputMatrix(matrix2);

      
      // gọi ph.thức tính tổng
      sumMatrix(matrix1, matrix2, matrixSum);

      // gọi ph.thức in ma trận tổng
      printMatrix(matrixSum);

   }

   public static void printMatrix(double[][] matrix) {
      int actualRowCount = matrix.length;
      int actualColCount = matrix[0].length;
      System.out.println(actualRowCount + " " + actualColCount);
      scanner.nextLine();
      for (int i = 0; i < actualRowCount; i++) {
         for (int j = 0; j < actualColCount; j++) {
            System.out.printf("%8.2f", matrix[i][j]);
         }
         System.out.println();
      }
   }

   public static void inputMatrix(double[][] matrix) {
      // Implementation for inputting matrix
      for (int i = 0; i < matrix.length; i++) {
         for (int j = 0; j < matrix[i].length; j++) {
            matrix[i][j] = scanner.nextDouble();
         }
      }
   }

   public static void sumMatrix(double[][] matrix1, double[][] matrix2, double[][] matrixSum) {
      for (int i = 0; i < matrix1.length; i++) {
         for (int j = 0; j < matrix1[i].length; j++) {
            matrixSum[i][j] = matrix1[i][j] + matrix2[i][j];
         }
      }
   }
}
