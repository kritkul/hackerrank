package arrayleftrotation;

import java.util.Scanner;

public class Solution {

    public static int[] arrayLeftRotation(int[] a, int n, int k) {
    	if(k == 0){
    		return a;
    	}else{
    		int tmp = a[0];
    		for(int i=0;i<n-1;i++){
    			a[i] = a[i+1];
    		}
    		a[n-1] = tmp;
    		return arrayLeftRotation(a, n, k-1);
    	}
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
      
        int[] output = new int[n];
        output = arrayLeftRotation(a, n, k);
        for(int i = 0; i < n; i++)
            System.out.print(output[i] + " ");
      
        System.out.println();
      
    }
}
