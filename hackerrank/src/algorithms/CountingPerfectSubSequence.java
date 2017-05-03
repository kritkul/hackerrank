package algorithms;

import java.math.BigInteger;
import java.util.Scanner;

public class CountingPerfectSubSequence {

	 static long[] factorial = new long[500001];
	 static int mod = 1000000007;
	    
	    static long countSubs(String s){
	        // Complete this function
	        long subs = 0;	        
	        int words[] = new int[4];
	        for(char w : s.toCharArray()){
	        	words[w - 'a']++;
	        }
	        
	        int minab = Math.min(words[0], words[1]);
	        int mincd = Math.min(words[2], words[3]);
	        
	      
	        subs=(nCk(words[0]+words[1], minab)*nCk(words[2]+words[3], mincd))%1000000007-1;
	        
	        return subs;
	    }
	    
	    static long nCk(int n, int k) {
	        return new BigInteger(""+factorial[n]).multiply(new BigInteger(""+factorial[k]).modInverse(new BigInteger("1000000007"))).multiply(new BigInteger(""+factorial[n-k]).modInverse(new BigInteger("1000000007"))).mod(new BigInteger("1000000007")).longValue();
	   
	    }
	    
	    
	    static void build() {
	        factorial[0]=1;
	        for(int i=1; i<factorial.length; i++)
	            factorial[i]=i*factorial[i-1]%mod;
	    }

	    public static void main(String[] args) {
	        build();
	        Scanner in = new Scanner(System.in);
	        // Return the number of non-empty perfect subsequences mod 1000000007
	        int q = in.nextInt();
	        for(int a0 = 0; a0 < q; a0++){
	            String s = in.next();
	            long result = countSubs(s);
	            System.out.println(result);
	        }
	    }
}
