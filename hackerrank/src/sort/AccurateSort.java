package sort;

import java.util.Scanner;

public class AccurateSort {

	public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int n = in.nextInt();
            int[] a = new int[n];
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }
            // Write Your Code Here
            
            boolean canSort = accurateSort(a,n);
            
            if(canSort){
            	System.out.println("Yes");
            }else{
            	System.out.println("No");
            }
            
            displayArray(a);
            
        }

	}

	private static boolean accurateSort(int[] a, int n) {
		int i=1;
		while(i<=n-1){
			int result = a[i] - a[i-1];
			
			if(result == -1){
			
				int tmp = a[i];
				a[i] = a[i-1];
				a[i-1] = tmp;
				i++;
			}
			i++;
		}
		
		return checkSort(a);
	}
	
	private static boolean checkSort(int[] a){
		
		boolean check = true;
		int i = 1;
		
		while(check && i < a.length){
			
			if(a[i] < a[i-1]){
				check = false;
				
			}
			
			i++;
		}
		
		return check;
	}
	
	public static void displayArray(int[] a){
		for(int w : a){
			System.out.print(w + " ");
		}
	}

}
