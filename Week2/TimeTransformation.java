package Week2;

import java.util.Scanner;

public class TimeTransformation {
   public static void main(String[] args) {
      try (Scanner scanner = new Scanner(System.in)) {
         int seconds = scanner.nextInt(); // Example input
         int hours = seconds / 3600;
         int minutes = (seconds % 3600) / 60;
         int remainingSeconds = seconds % 60;

         System.out.printf("%d giay = %d gio, %d phut, va %d giay", seconds, hours, minutes, remainingSeconds);
      } catch (Exception e) {
         System.out.println("Invalid input. Please enter an integer.");
      }

   }
}
