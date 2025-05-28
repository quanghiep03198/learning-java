import java.util.Scanner;

public class PrintDate {
   public static void main(String[] args) {
      try (Scanner scanner = new Scanner(System.in)) {
         int day = scanner.nextInt();
         int date = scanner.nextInt();
         int month = scanner.nextInt();
         int year = scanner.nextInt();

         if (!checkIsValidDate(day, date, month, year)) {
            System.out.println("Du lieu khong hop le. Vui long nhap theo dinh dang dd/MM/yyyy.");
            return;
         }

         String vnDayOfWeek = getLocaleDayOfWeek(day, "vn");
         String enDayOfWeek = getLocaleDayOfWeek(day, "en");
         String enMonth = getLocaleMonthName(month);

         System.out.printf("Viet Nam: %s, ngay %d thang %d nam %d\n", vnDayOfWeek, date, month, year);
         System.out.printf("My: %s, %s %d, %d\n", enDayOfWeek, enMonth, date, year);
         System.out.printf("Chau Au: %s %d %s %d\n", enDayOfWeek, date, enMonth, year);
      } catch (Exception e) {
         System.out.println("Du lieu khong hop le. Vui long nhap theo dinh dang dd/MM/yyyy.");
      }
   }

   public static String getLocaleDayOfWeek(int day, String locale) {
      String[] enDays = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
      String[] vnDays = { "Thu Hai", "Thu Ba", "Thu Tu", "Thu Nam", "Thu Sau", "Thu Bay", "Chu Nhat" };
      if (day < 2 || day > 8)
         return String.valueOf(day);
      if ("en".equals(locale)) {
         return enDays[day - 2];
      } else if ("vn".equals(locale)) {
         return vnDays[day - 2];
      }
      return String.valueOf(day);
   }

   public static String getLocaleMonthName(int month) {
      String[] enMonths = {
            "January", "February", "March", "April", "May", "June", "July", "August", "September", "October",
            "November", "December"
      };
      if (month < 1 || month > 12)
         throw new IllegalArgumentException("Invalid month: " + month);
      return enMonths[month - 1];
   }

   public static boolean checkIsValidDate(int day, int date, int month, int year) {
      if (day < 2 || day > 8) {
         return false;
      }
      if (date < 1 || date > 31) {
         return false;
      }
      if (month < 1 || month > 12) {
         return false;
      }
      if (year <= 0) {
         return false;
      }
      // Check days in month
      int[] daysInMonth = { 31, (isLeapYear(year) ? 29 : 28), 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
      if (date > daysInMonth[month - 1]) {
         return false;
      }
      return true;
   }

   public static boolean isLeapYear(int year) {
      return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
   }
}
