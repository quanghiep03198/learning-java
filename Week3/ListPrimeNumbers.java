package Week3;

public class ListPrimeNumbers {

   public static void main(String[] args) {
      // int primeNumCheckRange = 999 - 2 + 1;
      boolean[] isPrimes = new boolean[1000];
      String result = "";

      for (int i = 0; i < isPrimes.length; i++) {
         isPrimes[i] = isPrime(i); // Giả định tất cả các số đều là số nguyên tố
         if (isPrime(i))
            result += i + " "; // Nếu là số nguyên tố, thêm vào kết quả
      }

      System.out.println(result.trim());
   }

   public static boolean isPrime(int number) {
      if (number <= 1)
         return false; // Số nhỏ hơn hoặc bằng 1 không phải là số nguyên tố
      for (int i = 2; i <= Math.sqrt(number); i++) {
         if (number % i == 0)
            return false; // Nếu chia hết cho bất kỳ số nào từ 2 đến căn bậc hai của số đó, không phải là
                          // số nguyên tố
      }
      return true; // Nếu không chia hết cho bất kỳ số nào, là số nguyên tố
   }

}