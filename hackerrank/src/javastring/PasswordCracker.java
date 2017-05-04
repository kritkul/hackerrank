package javastring;

import java.util.Scanner;

/**
 * 
 * @author kkrit
 * sample input
3
4
ozkxyhkcst xvglh hpdnb zfzahm
zfzahm
4
gurwgrb maqz holpkhqx aowypvopu
gurwgrb
10
a aa aaa aaaa aaaaa aaaaaa aaaaaaa aaaaaaaa aaaaaaaaa aaaaaaaaaa
aaaaaaaaaab

=========================


1
6
because can do must we what
wedowhatwemustbecausewecan

 */



public class PasswordCracker {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int loop = in.nextInt();
        while(loop-- >0){
            int n = in.nextInt();
            String[] attempts = new String[n];
            
            for(int i=0;i<n;i++){
                  attempts[i] = in.next();
            }
            
            String key = in.next();
            
            System.out.println(matchingString(key, attempts));
        }

	}

	public static String matchingString(String key, String[] words) {
		if (key.length() <= 0)
			return "";
		for (int i = 1; i <= key.length(); i++) {
			if (subMatching(key.substring(0, i), words)) {
				
				String s = matchingString(key.substring(i, key.length()), words);
				
				if (s.equals("WRONG PASSWORD"))
					return "WRONG PASSWORD";
				else
					return key.substring(0, i) + " " + s;
			}
		}
		return "WRONG PASSWORD";
	}

	public static boolean subMatching(String key, String[] words) {
		for (int i = 0; i < words.length; i++) {
			if (key.equals(words[i]))
				return true;
		}
		return false;
	}

}
