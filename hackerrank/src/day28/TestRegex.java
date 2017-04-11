package day28;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// This will match a sequence of 1 or more uppercase and lowercase English letters as well as spaces
		String myRegExString = "[a-zA-Z\\s]+";

		// This is the string we will check to see if our regex matches:
		String myString = "The quick brown fox jumped over the lazy dog...";

		// Create a Pattern object (compiled RegEx) and save it as 'p'
		Pattern p = Pattern.compile(myRegExString);

		// We need a Matcher to match our compiled RegEx to a String
		Matcher m = p.matcher(myString);

		// if our Matcher finds a match
		if( m.find() ) {
		    // Print the match
		    System.out.println( m.group() );
		}
		
		String s = "Hello, Goodbye, Farewell";
		Pattern pat = Pattern.compile("\\p{Alpha}+");
		m = pat.matcher(s);
		
		while( m.find() ) {
		    // Print the match
		    System.out.println( m.group() );
		}
		
		
		String test = "marcokrit@gmail.com";
		
		String reg = "[a-zA-Z\\s]*\\@[g][m][a][i][l]*.[a-zA-Z]*";
		pat = Pattern.compile(reg);
		m = pat.matcher(test);
		
		while( m.find() ) {
		    // Print the match
		    System.out.println( m.group() );
		}
		
		

	}

}
