package math;

import java.util.Scanner;

public class MaximizeXOR {
	
	
	static int counter = 0;
	
	
	//performance can be calculate as N+N-1....1  or O(n)
	static int maxXor(int l, int r) {
		int max = 0;
		
		for(int i=l; i<=r; i++){
			for(int j=l;j<=r;j++){
				int tmp = i^j;
				counter++;
				if(max <  tmp){
					max = tmp;
				}
				
			}
			
			l++;
		}
		
		return max;
    }
	
	//this method has better performance (O (log n))
	static int maxOR(int left,int right){
		int p = left^right;
		int ret = 1;
		
		while(p > 0){
			ret <<= 1;
			p >>= 1;
			counter++;
		}
		
		return ret-1;
	}

	
	/*Example input 10
	/*              15
	 * limitation 0 <= left <= right <= 1000
	 */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;
        int _l;
        _l = Integer.parseInt(in.nextLine());
        
        int _r;
        _r = Integer.parseInt(in.nextLine());
        
        res = maxXor(_l, _r);
   //     System.out.println(res);
        System.out.println(maxOR(_l, _r));
        System.out.println("counter = " + counter);
        
    }
}
