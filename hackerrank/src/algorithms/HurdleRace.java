package algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class HurdleRace {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] height = new int[n];
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
        }
        
        Arrays.sort(height);
        
        int max = height[height.length-1];
        
        int baverages = max-k;
        
        if(baverages > 0){
        	System.out.println(baverages);
        }else{
        	System.out.println("0");
        }
        
    }

}
