package Week3;

import java.util.Scanner;

public class Marathon {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);

      // nhập số lượng vđv chạy
      String line = in.nextLine();
      int n = Integer.parseInt(line);

      // nhập tên các vđv
      line = in.nextLine();
      String[] names = line.split(" ");

      // nhập thời gian chạy của các vđv
      int[] times = new int[n];
      for (int i = 0; i < times.length; i++) {
         times[i] = in.nextInt();
      }

      // tìm và in vđv chạy nhanh nhất
      int min_index = getMinIndex(times);
      System.out.println("Nguoi chay nhanh nhat la: " + names[min_index]);
      System.out.println("Thoi gian chay la: " + times[min_index]);

      // tìm và in vđv chạy nhanh nhì
      int second_index = getSecondMinIndex(times);
      System.out.println("Nguoi chay nhanh nhi la: " + names[second_index]);
      System.out.println("Thoi gian chay la: " + times[second_index]);
   }

   // phương thức tìm chỉ số của pt nhỏ nhất trong mảng
   public static int getMinIndex(int[] arr) {
      int minIndex = 0; // Giả sử phần tử đầu tiên là nhỏ nhất
      for (int i = 1; i < arr.length; i++) {
         if (arr[i] < arr[minIndex]) {
            minIndex = i; // Cập nhật chỉ số nếu tìm thấy phần tử nhỏ hơn
         }
      }
      return minIndex; // Trả về chỉ số của phần tử nhỏ nhất
      // viết thêm mã lệnh xử lý vào đây
   }

   // phương thức tìm chỉ số của pt nhỏ nhì trong mảng
   public static int getSecondMinIndex(int[] arr) {
      int minIndex = getMinIndex(arr); // Lấy chỉ số của phần tử nhỏ nhất
      int secondMinIndex = -1; // Khởi tạo chỉ số của phần tử nhỏ nhì
      for (int i = 0; i < arr.length; i++) {
         if (i != minIndex) { // Bỏ qua phần tử nhỏ nhất
            if (secondMinIndex == -1 || arr[i] < arr[secondMinIndex]) {
               secondMinIndex = i; // Cập nhật chỉ số nếu tìm thấy phần tử nhỏ nhì
            }
         }
      }
      return secondMinIndex; // Trả về chỉ số của phần tử nhỏ nhì
      // viết thêm mã lệnh xử lý vào đây
   }

}
