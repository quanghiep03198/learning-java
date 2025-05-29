package Week2;

import java.util.Scanner;

public class Timer {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int hour = scanner.nextInt();
      int minute = scanner.nextInt();
      int second = scanner.nextInt();

      int secondsSinceMidnight = hour * 3600 + minute * 60 + second;
      int secondsInDay = 24 * 3600;
      int secondsLeft = secondsInDay - secondsSinceMidnight;

      System.out.println("So giay tinh tu nua dem: " + secondsSinceMidnight);
      System.out.println("So giay con lai trong ngay: " + secondsLeft);
   }
}
