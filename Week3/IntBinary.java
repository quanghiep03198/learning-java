package Week3;

import java.util.Scanner;

public class IntBinary {

   public static final Scanner scanner = new Scanner(System.in);

   public static void main(String[] args) {
      int[] range = inputRange();
      for (int i = range[0]; i <= range[1]; i++) {
         printValues(i);
      }

   }

   public static int[] inputRange() {
      int[] range = new int[2];
      for (int i = 0; i < range.length; i++) {
         range[i] = scanner.nextInt();
      }

      System.out.println("Decimal\tBinary\tOctal\tHexadecimal");
      return range;

   }

   public static void printValues(int i) {
      System.out.print(i + "\t");
      String bin = Integer.toBinaryString(i);
      System.out.print(bin + "\t");

      String oct = Integer.toOctalString(i);
      System.out.print(oct + "\t");

      String hex = Integer.toHexString(i);
      String hexCap = hex.toUpperCase(); // chuyển xâu sang chữ hoa
      System.out.println(hexCap);
   }
}
