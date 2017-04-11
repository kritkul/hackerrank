package algorithms;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ThePowerSum {

	static int counter = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int p = in.nextInt();
		
		int tmp = 0;
		tmp = (int) Math.pow(n,1.0/p);
		
		List resultList = new LinkedList<>();
		
		while(tmp > 0){
			
			resultList.add(powerNum(tmp,p));
			System.out.print(tmp + "^" + p + " ");
			tmp--;
		}
		
		System.out.println();
		
		for(int i=0;i<resultList.size();i++){
			System.out.print(resultList.get(i).toString() + " ");
		}
		
		System.out.print(isPrime(29));

	}
	
	private static boolean isPrime(int num) {
        if (num < 2) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i * i <= num; i += 2)
            if (num % i == 0) return false;
        return true;
}
		
	public static int powerNum(int n,int p){
		if(p == 0){
			return 1;
		}
		
		return n*powerNum(n,p-1);
		
	}

}
