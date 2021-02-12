package UniquePack;

import java.util.Scanner;

public class SumTillSingleDigit {

	public static long sumOfDigits(long n) {
		long lastDigit = 0, sum = 0;
		while(n!=0) {
			lastDigit = n%10;
			sum+=lastDigit;
			n = n/10;
			lastDigit = 0;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to be summed to get single digit:");
		long n = sc.nextLong();
		long ans = sumOfDigits(n);
		if(ans>9) {
			while(ans>9) {
				ans = sumOfDigits(ans);
			}
			System.out.println(ans);
		}
		else {
			System.out.println(ans);
		}
	}

}
