package math;

import java.util.Scanner;

public class HandShake {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        int N[] = new int[T];
        
      
        
        for(int a0 = 0; a0 < T; a0++){
            N[a0] = in.nextInt();
            
            int total = 0;
            for(int j = 1; j < N[a0]; j++){       	        
            	total += j;
            }
            System.out.println(total);            
        }

	}

}
