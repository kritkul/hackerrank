package javastring;

import java.util.Scanner;


/**
 * 
 * @author kkrit
 * Given two strings such as Anagram and Margana,
 * if those two words consist same characters but different orders
 * print "Anagrams" , it they are not print "Not Anagrams"
 */
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
		return (calWords((a+b).toLowerCase()) == 0? true : false);
	}
	/**
	 * 
	 * @param s : receiving concatenate String with lower case format
	 * @return summation of XOR operator by words 
	 * if value is zero those words are symmetric and print "Anagrams"
	 */
	static int calWords(String s){
		int sum = 0;
		for(char word: s.toCharArray()){
			sum ^= word;
		}
		return sum;
	}
}
