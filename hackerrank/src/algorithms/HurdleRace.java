package algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class HurdleRace {
	public static int getMinimumBeverages(int[] height, int k) {
		// Sort array so highest height is last element
		Arrays.sort(height);
		int difference = height[height.length - 1] - k;	
		return (difference > 0) ? difference : 0;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int[] height = new int[n];
		for (int height_i = 0; height_i < n; height_i++) {
			height[height_i] = in.nextInt();
		}
		in.close();

		System.out.println(getMinimumBeverages(height, k));
	}

}
