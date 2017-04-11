package day1;

import java.util.Scanner;

public class ComputeDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

		int maximumDifference = 0;
		
		int tmp = 0;
		
		for(int i=a.length-1; i >= 0 ; i--){
			for(int j=0; j <= a.length-1;j++){
				tmp = a[i] - a[j];
				
				if(tmp>maximumDifference){
					maximumDifference = tmp;
				}
				
			}
		}
		
		System.out.println(maximumDifference);
		
	}

}
