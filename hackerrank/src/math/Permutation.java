package math;
/**
 * 
 * @author kkrit
 * Example :
 *  there are a set of number of {1,2,3,4}
 *  now we need to select 2 of them which ordering does not matter and identify how many way to pick them?
 *  possibility could be : {1,2}, {1,3}, {1,4} , {2,3} , {2,4}, {3,4}
 *  this technique is called : combination or binomial coefficient.
 */
public class Permutation {
	int n;
	int r;
	
	Permutation(int n, int r){
		this.n = n;
		this.r = r;
	}
	
	public long getPermutation(){
		return getFactorial(n)/getFactorial(n-r);
	}
	
	public long getCombination(){
		return getFactorial(n)/ (getFactorial(n-r)*getFactorial(r));
	}
	
	private long getFactorial(int f){
		
		if(f<2){
			return 1;
		}
		
		return f * getFactorial(f-1);
	}
}
