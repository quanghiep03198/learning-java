package Week3;

import java.util.Scanner;

/* 
 * Nhập kích thước mảng, các pt mảng. In mảng dạng cột.
 */
public class PrintArrayIn2Columns {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int size = input.nextInt(); // nhập kích thước mảng
      if (size <= 0) {
         System.out.println("Kich thuoc mang khong hop le.");
         return;
      }

      int[] arr = new int[size];

      input.nextLine();

      for (int i = 0; i < arr.length; i++) {
         arr[i] = input.nextInt();
      }

      // In mảng dạng cột
      System.out.println("Chi so\tGia tri");
      for (int i = 0; i < arr.length; i++) {
         System.out.printf("%d\t%d%n", i, arr[i]);
      }
   }
}