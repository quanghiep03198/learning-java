package Week3;

import java.util.*;

public class StudentHistogram {
   public static final Scanner scanner = new Scanner(System.in);

   public static void main(String[] args) {
      int[] studentScores = input();
      printHistogram(studentScores);
   }

   public static int[] input() {
      try {
         int numberOfStudents;
         numberOfStudents = scanner.nextInt();
         if (numberOfStudents <= 0)
            throw new Exception();
         int[] studentScores = new int[numberOfStudents];
         for (int i = 0; i < numberOfStudents; i++) {
            studentScores[i] = scanner.nextInt();
            if (studentScores[i] < 0 || studentScores[i] > 10) {
               System.out.println("Điểm số phải nằm trong khoảng từ 0 đến 10");
               return new int[0];
            }
         }

         return studentScores;
      } catch (Exception e) {
         System.out.println("Số lượng sinh viên phải lớn hơn 0");
         return new int[0];
      }
   }

   public static void printHistogram(int[] studentScores) {
      if (studentScores.length == 0) {
         System.out.println("Không có điểm số hợp lệ để hiển thị biểu đồ");
         return;
      }
      System.out.println("Diem\tSo SV\tHistogram");

      for (int i = 0; i <= 10; i++) {
         final int score = i;
         System.out.print(score + "\t");
         // Sử dụng Streams để filter
         int[] filteredArray = Arrays.stream(studentScores)
               .filter(x -> x == score) // điều kiện filter
               .toArray();

         System.out.print(filteredArray.length + "\t");

         String asteriskScore = new String(new char[filteredArray.length]).replace("\0", "*");
         System.out.println(asteriskScore);
      }
   }

}
