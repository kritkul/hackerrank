package day25;

import java.util.Scanner;

public class PrimeNumber {
	
	static int step = 0;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		int[] arr = new int[n];
		

		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		
		long startTime = System.currentTimeMillis();
		
		for(int j = 0; j < n; j++){
			if(isFastPrime(arr[j])){
				System.out.println("Prime");
			}else{
				System.out.println("Not prime");
			}
		}
		
		long endTime = System.currentTimeMillis();
		long duration = endTime - startTime;
		
		System.out.println("Test " + duration + " ms");
		System.out.println("step = " + step);
	}
	
	public static boolean isFastPrime(int p){
		if (p == 1) {
			step++;
			return false;
		}
		if (p == 2) {
			step++;
			return true;
		}
		for (int i = 2; i * i <= p; i++) {
			step++;
			if (p % i == 0) {
				step++;
				return false;
			}
		}
		return true;
	}
	
	public static boolean isPrime(int p){
		
		if(p <= 1){
			step++;
			return false;
		}else if(p == 2){
			step++;
			return true;
		}
		else if(p%2 == 0){
			step++;
			return false;
		}
		
		int count = 0;
		
		for(int i = 3; i <= p; i+=2){
			step++;
			if(p%i==0){
				step++;
				count++;
			}else if(count > 1){
				step++;
				break;
			}
		}
		
		return count > 1? false : true;
		
	}
	

}
