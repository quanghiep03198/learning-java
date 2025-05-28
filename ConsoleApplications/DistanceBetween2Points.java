import java.util.Scanner;

public class DistanceBetween2Points {
   // ph.thức tính khoảng cách giữa 2 điểm (x1, y1) và (x2, y2)
   public static double distance(double x1, double y1, double x2, double y2) {
      double result;
      result = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
      return result;
   }

   // ph.thức main()
   public static void main(String[] args) {
      double x1, y1, x2, y2;
      try (Scanner scanner = new Scanner(System.in)) {
         String input = scanner.nextLine();
         input = input.trim().replaceAll("\\s+", " ");
         String[] coordinates = input.split(" ");
         if (coordinates.length != 4) {
            System.out.println("Du lieu khong hop le. Vui long nhap 4 so thuc.");
            return;
         }

         // Assign values for coordinates of 2 points
         x1 = Double.parseDouble(coordinates[0]);
         y1 = Double.parseDouble(coordinates[1]);
         x2 = Double.parseDouble(coordinates[2]);
         y2 = Double.parseDouble(coordinates[3]);
         double result = distance(x1, y1, x2, y2);
         System.out.printf("Khoang cach giua hai diem (%.2f, %.2f) va (%.2f, %.2f) la: %.2f", x1, y1, x2, y2, result);
      } catch (NumberFormatException e) {
         e.printStackTrace();
      }

   }
}
