package day1;

import java.util.Scanner;

public class Day6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        String[] s = new String[n];
        

        
        //receive those string as array inputing
        for(int i=0; i<n; i++){
            s[i] = in.next();
            
        }     
        
        for(int i=0; i < n; i++){
        	StringBuffer s0 = new StringBuffer();
        	StringBuffer s1 = new StringBuffer();
        	for(int j=0; j < s[i].length(); j++){
	        	if(j%2 == 0){
	        		s0.append(s[i].charAt(j));
	        	}else{
	        		s1.append(s[i].charAt(j));
	        	}
	        }
        	System.out.println(s0 + " " + s1);
        }
        

	}

}
