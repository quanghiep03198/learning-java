package Week3;

import java.util.Scanner;

/*
 * Nhập điểm (nguyên, thang 10) của cả lớp.
 * In thống kê, tỉ lệ từng điểm.
 */
public class ThongKeDiemThi {
   public static void main(String[] arguments) {
      /* thống kê số điểm 0, 1, 2, ... 10 */
      int[] tk_diem = new int[11]; // mảng lưu số sv đạt điểm i tại tk_diem[i]

      Scanner input = new Scanner(System.in);
      int n = input.nextInt(); // nhập số sinh viên trong lớp
      int[] diem = new int[n]; // điểm của cả lớp
      for (int i = 0; i < n; i++) {
         diem[i] = input.nextInt(); // nhập điểm của sv thứ i
      }

      // cập nhật thống kê điểm
      for (int i = 0; i < n; i++) {
         tk_diem[diem[i]]++; // tăng số lượng sv đạt điểm diem[i]
      }

      // in kết quả thống kê
      System.out.printf("%s\t%s\t%s%n", "Diem", "So SV", "Ti le");
      for (int i = 0; i <= 10; i++) {
         System.out.printf("%d\t%d\t%.2f%%%n", i, tk_diem[i], 100.0 * tk_diem[i] / n);
      }
   }
}
