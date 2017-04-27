package math;

import java.util.Scanner;

public class Prime2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String tmp = in.next();

		int n = Integer.parseInt(tmp);

		/*
		 * long[] arr = new long[n];
		 * 
		 * for (int i = 0; i < n; i++) { arr[i] = in.nextLong();
		 * 
		 * System.out.println(getMaximumCountPrim(arr[i])); }
		 */

		System.out.println(isPrime(n) ? "Prime" : "Not prime");

	}

	/**
	 * Improved O( n^(1/2)) ) Algorithm Checks if n is divisible by 2 or any odd
	 * number from 3 to sqrt(n). The only way to improve on this is to check if
	 * n is divisible by KNOWN PRIMES from 2 to sqrt(n).
	 *
	 * @param n
	 *            An integer to be checked for primality.
	 * @return true if n is prime, false if n is not prime.
	 **/
	public static boolean isPrime(int n) {
		// check lower boundaries on primality
		if (n == 2) {
			return true;
		} // 1 is not prime, even numbers > 2 are not prime
		else if (n == 1 || (n & 1) == 0) {
			return false;
		}

		// Check for primality using odd numbers from 3 to sqrt(n)
		for (int i = 3; i <= Math.sqrt(n); i += 2) {
			// n is not prime if it is evenly divisible by some 'i' in this
			// range
			if (n % i == 0) {
				return false;
			}
		}
		// n is prime
		return true;
	}

	public static int getMaximumCountPrim(long n) {
		int answer = 0;
		int prime[] = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47 };

		long product = 1;

		for (int i = 0; i < prime.length; i++) {
			product = product * prime[i];
			if (product <= n) {
				answer++;
			}
		}

		return answer;
	}

}
