package math;

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
