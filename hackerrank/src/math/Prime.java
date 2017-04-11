package math;

import java.math.BigInteger;
import java.util.*;

public class Prime {
	public static final BigInteger ZERO = new BigInteger("0");
	public static final BigInteger ONE = new BigInteger("1");
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String tmp = in.nextLine();
		
		int n = Integer.parseInt(tmp);

		String[] arr = new String[n];

		for (int i = 0; i < n; i++) {
			arr[i] = in.nextLine();
		}
				
		for(int j = 0; j < arr.length; j++){

			System.out.println(countNumDiviser(new BigInteger(arr[j])));
			
		}
		


	}
	
	public static int countNumDiviser(BigInteger num){
		int count = 0;
		
		BigInteger divise = new BigInteger("2");
		BigInteger total = ONE;
		
		
		if(num.equals(new BigInteger("1"))){
			return 0;
		}
		
		if(isBigPrime(num)){
			return 1;
		}else{
			// code begin here
			
			while(num.compareTo(total) >= 0){
				
				if(isBigPrime(divise)){
					
					total = total.multiply(divise); 
					if(total.compareTo(num) <= 0){
					//	System.out.print(divise + " ");
						count++;
					}
					
				}
				divise = divise.add(ONE);
			}
			
			
		}
		
		return count;
	}
	
	
	public static boolean isBigPrime(BigInteger p){
		if (p.equals(new BigInteger("1"))) {
			return false;
		}
		if (p.equals(new BigInteger("2"))) {
			return true;
		}
		
		BigInteger i = new BigInteger("2");
		
		while (i.multiply(i).compareTo(p) <= 0) {
			if (p.mod(i).equals(ZERO)) {
				return false;
			}
			i = i.add(ONE);
		}
		return true;
	}
	

}
