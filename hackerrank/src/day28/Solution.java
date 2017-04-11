package day28;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution{
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int N = in.nextInt();
	        
	        String reg = "[a-zA-Z\\s]*\\@[g,G][m][a][i][l]*.[a-zA-Z]*";
	        Pattern pat = Pattern.compile(reg);
	        
	        Matcher matcher = null;
	        
	        List<String> abc = new ArrayList<String>();
	        
	        for(int a0 = 0; a0 < N; a0++){
	            String firstName = in.next();
	            String emailID = in.next();
	            
	            matcher = pat.matcher(emailID);
	            
	            if(matcher.find()){
	            	abc.add(firstName);
	            }
	        }
	        
	        Collections.sort(abc);

	        for(int i = 0 ; i < abc.size();i++){
	        	System.out.println(abc.get(i).toString());
	        }
	        
	    }


}
