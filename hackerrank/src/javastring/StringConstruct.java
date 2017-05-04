package javastring;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StringConstruct {
	
	
	public static int getConstructCost(String s){
		int cost = 0;
		
		int a[] = new int[26];
		
		
		for(char c : s.toCharArray()){
			a[c - 'a']++;
		}
		
		for(int i=0; i<a.length;i++){
			if(a[i] > 0){
				cost++;
			}
		}
		
		return cost;
	}
	
	public static int getSetString(String s){
		Set<String> k = new HashSet<>();
		
		for(char c : s.toCharArray()){
			k.add(Character.toString(c));
		}
		
		return k.size();
		
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            String s = in.next();
        //    System.out.println(getConstructCost(s));
            System.out.println(getSetString(s));
        }

	}

}
