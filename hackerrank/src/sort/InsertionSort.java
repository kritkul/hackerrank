package sort;

import java.util.Scanner;

public class InsertionSort {
	/**
	 * this method will used last value of array to insert value into correct position.
	 * Note: all of value in this array were sorted except last position.
	 * @param ar
	 */
	public static void insertIntoSorted(int[] ar) {
		int j = ar.length-1;
		int x = ar[ar.length-1];
		
		while(j>0 && ar[j-1] > x){
			ar[j] = ar[j-1];
			j--;
			printArray(ar);
			ar[j] = x;
		}
		printArray(ar);
		
	}

	/**
	 * 
	 * @param args
	 * example value of each args via Scanner
	 *  5
	 *	2 4 6 8 1
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int[] ar = new int[s];
		for (int i = 0; i < s; i++) {
			ar[i] = in.nextInt();
		}
		insertIntoSorted(ar);
	}

	private static void printArray(int[] ar) {
		for (int n : ar) {
			System.out.print(n + " ");
		}
		System.out.println("");
	}

}
