package day1;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
            System.out.print(arr[arr_i] + " ");
        }
        
  //      System.out.print(arr.length);
        System.out.println("test resul ---");
        for(int i=arr.length; i != 0; i--){
            System.out.print(arr[i-1] + " ");
        }
        
        
        
	}

}
