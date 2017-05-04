package math;

import java.util.Scanner;

public class FibonacciFinding {

	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
        
        long startTime = System.currentTimeMillis();
        
/*        for(int i=0; i<n ; i++){
        	int a0 = scanner.nextInt();
        	int a1 = scanner.nextInt();
        	int loop = scanner.nextInt();
        	
        	System.out.println(findFibonacci(a0,a1,loop));
        }*/
        System.out.println(findFibo(25));
        
        long endTime = System.currentTimeMillis();
		
		long duration = endTime - startTime;
		
		System.out.println("Test " + duration + " ms");
		
	//	System.out.println(findFibo(8));

	}
	
	public static int findFibo(int n){
		if(n<=1){
            return n;
        }else{
            return findFibo(n-1)+findFibo(n-2);
        }
	}
	
	
	public static int findFibonacci(int a0,int a1,int loop){
		int tmp[] = new int[loop+1];
		
		if(loop > 1){
			tmp[0] = a0;
			tmp[1] = a1;
		}else{
			return a1;
		}
		
		for(int i=2;i<=loop;i++){
			tmp[i] = tmp[i-1] + tmp[i-2];
	
		}
		
		return tmp[tmp.length-1];
		
	//	return a1*findFibo(loop) + a0*findFibo(loop-1);
	}

}
