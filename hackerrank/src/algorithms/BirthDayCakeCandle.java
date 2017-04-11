package algorithms;

import java.util.Scanner;

public class BirthDayCakeCandle {

	/* sample input
	   4
	   3 2 1 3
	  
	 */
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int height[] = new int[n];
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
        }
        
        int max = getMaxNo(height);
        
        System.out.println(getNumberOfBlow(height,max));
    }
	
	public static int getMaxNo(int num[]){
		int max = -300000;
		
		for(int i=0; i< num.length ; i++){
			if(max < num[i]){
				max = num[i];
			}
		}
		
		return max;
	}
	
	public static int getNumberOfBlow(int num[],int max){
		int counter = 0;
		
		for(int i=0; i < num.length; i++){
        	if(max == num[i]){
        		counter++;
        	}
        }
		
		return counter++;
	}
}
