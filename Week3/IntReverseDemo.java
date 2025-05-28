package Week3;

import java.util.*;

public class IntReverseDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();

		for (int num = num1; num <= num2; num++) {
			int reversedNum = reverseInt(num);
			System.out.println(num + "\t" + reversedNum);
		}
	}

	public static int reverseInt(int number) {
		int reversed = 0;
		while (number != 0) {
			int digit = number % 10;
			reversed = reversed * 10 + digit;
			number /= 10;
		}
		return reversed;
	}
}
