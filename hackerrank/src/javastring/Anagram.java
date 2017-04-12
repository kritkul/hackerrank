package javastring;

import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
	}

	static boolean isAnagram(String a, String b) {		
		int ans = calWords((a+b).toLowerCase());
		return (ans == 0? true : false);
	}
	
	static int calWords(String s){
		int sum = 0;
		for(char word: s.toCharArray()){
			sum ^= word;
		}
		return sum;
	}
}
