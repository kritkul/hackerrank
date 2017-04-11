package math;

import java.util.Scanner;

public class SquareBread {

	public static void main(String[] args) {
/*		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
        
        
        for(int i=0;i<n;i++){
        	int l = in.nextInt();
            int b = in.nextInt();
            
            System.out.println(getMaxBread(l<=b? l:b,l*b));
        }*/
		
		Scanner sc=new Scanner(System.in);
	    int T=sc.nextInt();
	    for(int a=0;a<T;a++)
	        {
	        int l=sc.nextInt();
	        int b=sc.nextInt();
	        int gcd=0,i,sol=0;
	        if(l>=b)
	        {   
	            for(i=1;i<=l;i++)
	            {
	            if(l%i==0&&b%i==0)
	                {
	                gcd=i;
	                }
	            }
	        }
	        else
	            {
	            for(i=1;i<=b;i++)
	            {
	             if(l%i==0&&b%i==0)
	                {
	                gcd=i;
	                }
	            }
	        }
	        sol=(l*b)/(gcd*gcd);
	        System.out.println(sol);
	        }
	}

	
	public static int getMaxBread(int l, int max){
		
		int maxNumber = 0;
		int maxDivisor = 2;
		
		for(int i=2; (i*i) <= max; i++){
			if(max%(i*i)==0){
				int tmp = max/(i*i);
				int divisor = i;
				
		//		System.out.println(tmp + " d : " + divisor);
				
				if(maxNumber <= tmp && maxDivisor <= divisor){
					maxNumber = tmp;
					maxDivisor = divisor;
				}
			}
		}
		
		
		return (maxNumber == 0? max: maxNumber);
	}

}
