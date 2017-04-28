package codinginterview;

import java.util.Scanner;

public class Coinchange {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int coins[] = new int[m];
		for (int coins_i = 0; coins_i < m; coins_i++) {
			coins[coins_i] = in.nextInt();
		}
		System.out.println(makeChange(coins, n));

	}

	public static long makeChange(int[] coins, int dollars) {
/*		if (dollars == 0) {
			return 1;
		}
		if (coins.length == 0) {
			return 0;
		}

		long[] store = new long[dollars + 1];
		store[0] = 1; // There's always 1 way to make $0

		for (int coin : coins) {
			for (int i = 0; i < store.length - coin; i++) {
				store[i + coin] += store[i];
			}
		}
		return store[dollars];*/
		
		long[] dp = new long[dollars + 1];
	    dp[0] = 1;

	    for(int i=0; i<coins.length; i++) {
	        for(int j=coins[i]; j <= dollars; j++) {
	            dp[j] += dp[j-coins[i]];
	        }
	    }

	    return dp[dollars];
	}
}
