package Week2;

import java.util.Scanner;

public class ScannerBug2 {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      String ageStr = in.nextLine();
      int age = Integer.parseInt(ageStr);
      String name = in.nextLine();
      System.out.printf("Xin chao %s, tuoi %d\n", name, age);
   }
}
