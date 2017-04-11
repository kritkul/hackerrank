package challenge;

import java.util.Comparator;
import java.util.Scanner;

public class BeautifulWord {
	


	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        String w = in.next();
        
        boolean ans = isBeautifulWord(w);
        
        if (ans)
			System.out.println("Yes");
		else
			System.out.println("No");

	}
	
	public static boolean isBeautifulWord(String words){
		
		char init = words.charAt(0);
		int count = 0;
		
		for(int i = 1; i < words.length(); i ++){
			if(init == words.charAt(i)){
				return false;
			}else{
				
				switch(init){
				case 'a' : count++; break;
				case 'e' : count++; break;
				case 'i' : count++; break;
				case 'o' : count++; break;
				case 'u' : count++; break;
				case 'y' : count++; break;
				default : count = 0;
				}
				
				init = words.charAt(i);
			}
			
			
			
			if(count>1) return false;
			
		}
		
		
		return true;
	}
	
}