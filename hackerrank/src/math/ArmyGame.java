package math;

import java.util.Scanner;
/*
/*Luke is daydreaming in Math class. He has a sheet of graph paper with N rows and M columns, and he imagines 
/*that there is an army base in each cell for a total of N*M  bases. He wants to drop supplies at strategic points on the 
/*sheet, marking each drop point with a red dot. If a base contains at least one package inside or on top of its border fence, then it's considered to be supplied. 
*/

public class ArmyGame {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        
        System.out.println(getAmountOfPackageSupplier(n, m));

	}
	
	public static int getAmountOfPackageSupplier(int n,int m){
		return (n+(n%2))*(m+(m%2))/4;
	}

}
