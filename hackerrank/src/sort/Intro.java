package sort;

import java.util.Scanner;
/**
 * 
 * @author kkrit
 *
 */
public class Intro {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int find = in.nextInt();
        int n = in.nextInt();
        int arr[]= new int[n];
        
        for(int i=0; i < n; i++){
        	arr[i] = in.nextInt();
        	
        	if(arr[i] == find){
        		System.out.println(i);
        	}
        }

	}

}
