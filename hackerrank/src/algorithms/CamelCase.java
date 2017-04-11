package algorithms;

public class CamelCase {

	public static void main(String[] args) {
		// Scanner in = new Scanner(System.in);
		// String s = in.next();

		String s = "saveChangesInTheEditor";

		System.out.println(getCamelCaseCount(s));
		
		
		//or other ways
		String[] words = s.split("[A-Z]");
		
		System.out.println(words.length);

	}

	public static int getCamelCaseCount(String s) {
		int counter = 0;
		String myRegExString = "(?<!(^|[A-Z]))(?=[A-Z])|(?<!^)(?=[A-Z][a-z])";

		for (String search : s.split(myRegExString)) {
			counter++;
		}
		return counter;
	}
}
