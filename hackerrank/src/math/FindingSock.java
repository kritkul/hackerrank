package math;

import java.util.Scanner;

public class FindingSock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        
       

        for(int i=0; i<n; i++){
        	int tmp = arr[i];
        	tmp = tmp + 1;
  /*      	
        	for(int j=tmp; j > arr[i]; j--){
        		int total = 0; 
        		total += j;
        		System.out.println(tmp);
        	}
   */     	
        	
        	System.out.println(tmp);
        	
        }
        
        
	}
	
}
