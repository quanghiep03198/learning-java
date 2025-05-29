public class BinaryTest {
   public static void main(String[] args) {
      java.util.Scanner scanner = new java.util.Scanner(System.in);
      
      // System.out.print("Nhập số nguyên nhị phân: ");
      long binaryNumber = scanner.nextLong();
      
      long decimal = 0;
      long position = 1;
      
      while (binaryNumber > 0) {
         long bit = binaryNumber % 10;
         decimal += bit * position;
         position *= 2;
         binaryNumber /= 10;
      }
      
      System.out.println(decimal);
      scanner.close();
   }
   
}
