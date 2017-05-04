package math;

public class FibonacciWithMemoization {
	public static long fibArray[]=new long[26];

	 public static long fibonacci(long n){
		 long fibValue=0;
		 
		 if(n <= 1 ){
			 return n;  
		 }else if(fibArray[(int)n] != 0){
			 return fibArray[(int)n];
		 }else{
			 fibValue=fibonacci(n-1)+fibonacci(n-2);
			 fibArray[(int) n]=fibValue;
			 return fibValue;
		 }
	 
	 }

	 public static void main(String args[]){
		 fibArray[0]=1;
		 fibArray[1]=1;

		 long startTime = System.currentTimeMillis();
		 
		 System.out.println(fibonacci(25));

	 
		 long endTime = System.currentTimeMillis();
		
		 long duration = endTime - startTime;
		
		 System.out.println("Test " + duration + " ms");
	 }

}
