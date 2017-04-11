package datastructure;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int arr_i=0; arr_i < 6; arr_i++){
            for(int arr_j=0; arr_j < 6; arr_j++){
                arr[arr_i][arr_j] = in.nextInt();
            }
        }
        
        int maxsum = -325;
        
        
        for(int x=0; x < 4; x++){
            for(int y=0; y < 4; y++){
            	int tmp = 0;
                tmp += arr[x][y];
                tmp += arr[x][y+1];
                tmp += arr[x][y+2];
                tmp += arr[x+1][y+1];
                tmp += arr[x+2][y];
                tmp += arr[x+2][y+1];
                tmp += arr[x+2][y+2];
                
                if(tmp >= maxsum){
                	maxsum = tmp;
                }
            }
        }
        
        System.out.println(maxsum);
        
        
	}

}
