package bitmanage;

import java.util.Scanner;

public class LonelyInteger {

	public static int lonelyInteger(int[] a) {
		
		int unique = a[0];
		
		for(int i=1; i < a.length; i++){
			unique = unique ^ a[i];
		}
		
		return unique;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[] = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}
		
		System.out.println(lonelyInteger(a));
	}

}
