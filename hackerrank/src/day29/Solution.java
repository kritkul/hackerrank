package day29;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        
        for(int a0 = 0; a0 < t; a0++){
           int n = in.nextInt();
           int k = in.nextInt();
/*           if(((k-1)|k) > n && k%2==0){
               System.out.println(k-2);
           }else{
               System.out.println(k-1);               
           }*/
           
           System.out.println( findMaximum(n, k) );

        }
        
        in.close();
    }
    
    
    public static int findMaximum(int n, int k){
        int max = 0;
        int a = n - 1; // we are constrained by a < b
        while(a-- > 0) {
            for(int b = a + 1; b <= n; b++){
                int test = a & b;
                if( 	test < k 
                	&& 	test > max ){
                    max = test;
                }
            }
        }
        return max;
    }
}
