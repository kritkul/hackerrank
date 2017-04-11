package codinginterview;

import java.util.Scanner;

public class StairCase {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		
		long startTime = System.currentTimeMillis();
		for (int a0 = 0; a0 < s; a0++) {
			int n = in.nextInt();
			System.out.println(getStep(n));
	//		System.out.println(calcNum(n));
		}
		long endTime = System.currentTimeMillis();
		
		long duration = endTime - startTime;
		
		System.out.println("Test " + duration + " ms");
	}

	public static int getStep(int n){
		if(n == 1){
			return 1;
		}else if(n == 2){
			return 2;
		}else if(n == 3){
			return 4;
		}
		return getStep(n-3)+getStep(n-2)+getStep(n-1);
	}
	
	public static int calcNum(int n) {
        int[] array = new int[n];
//		int[] array = new int[3];
        if (n == 1) {
            return 1;
        }
        else if(n == 2) {
            return 2;
        }
        else if(n == 3) {
            return 4;
        }
        array[0] = 1;
        array[1] = 2;
        array[2] = 4;
        for (int i = 3; i < n; i++) {
            array[i] = array[i-1] + array[i-2] + array[i-3];
        //	array[i%3] = array[0] + array[1] + array[2];
        }
        return array[array.length-1];
    }

}
