package day1;

import java.util.Scanner;

public class BinaryNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        System.out.println(longestConsecutiveOnes(n));
        
       // String cs = Integer.toBinaryString(n);
        
       // System.out.println(cs);

	}
	
	
	private static int longestConsecutiveOnes(int x){
        int count = 0;
        
        while (x!=0)
        {
            x = (x & (x << 1));
        //    System.out.println(Integer.toBinaryString(x));
            count++;
        }
 
        return count;
    }
 

}
