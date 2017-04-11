package datastructure;

import java.util.Scanner;

public class MakingAnagrams {

	public static int numberNeeded(String first, String second) {
		int[] fakeChar = new int[26];
		int counter = 0;
		
		for(int i=0; i<first.length(); ++i){
			fakeChar[first.charAt(i) - 'a']++;
		}
		for(int i=0; i<second.length(); ++i){
			fakeChar[second.charAt(i) - 'a']--;
		}
		
		for(int fc : fakeChar){
			counter+= Math.abs(fc);
		}
		
		return counter;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a = in.next();
		String b = in.next();
	
		System.out.println(numberNeeded(a, b));
	}

}
