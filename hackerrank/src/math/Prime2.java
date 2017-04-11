package math;

import java.util.Scanner;

public class Prime2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String tmp = in.nextLine();
		
		int n = Integer.parseInt(tmp);

		long[] arr = new long[n];

		for (int i = 0; i < n; i++) {
			arr[i] = in.nextLong();
			
			System.out.println(getMaximumCountPrim(arr[i]));
		}
		
		

	}
	
	public static int getMaximumCountPrim(long n){
		int answer=0;
		int prime[] = {2 , 3 , 5 , 7 , 11 , 13 , 17 , 19 , 23 , 29 , 31 , 37 , 41 , 43 , 47};
		
		long product = 1;
		
		for(int i=0; i< prime.length;i++){
			product = product * prime[i];
			if(product <= n){
				answer++;
			}
		}
		
		return answer;
	}

}
