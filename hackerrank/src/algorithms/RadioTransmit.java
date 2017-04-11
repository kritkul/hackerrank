package algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class RadioTransmit {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] x = new int[n];
        for(int x_i=0; x_i < n; x_i++){
            x[x_i] = in.nextInt();
        }
               
        Arrays.sort(x);
        
        System.out.println(countTran(x,k));
        

	}
	
	public static int countTran(int x[], int k){
		 int counter = 0;
	        int i = 0;
	        while (i < x.length) {
	        	counter++;
	            int currentloc = x[i] + k;
	            while (i < x.length && x[i] <= currentloc) i++;
	            currentloc = x[--i] + k;
	            while (i < x.length && x[i] <= currentloc) i++;
	        }
		
		return counter;
	}

}
