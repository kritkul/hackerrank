package codinginterview;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RansomNote {
	Map<String, Integer> magazineMap;
	Map<String, Integer> noteMap; 

/*	public Solution(String magazine, String note) {
        
    }*/
	
	public RansomNote(String magazine, String note){
		magazineMap = new HashMap<>();
		noteMap = new HashMap<>();
		
		setLetterMap(magazine,magazineMap);
		setLetterMap(note,noteMap);
		
	}
	
	public void setLetterMap(String expression, Map<String, Integer> maps){
		
		String[] words = expression.split("\\s");
		
		for(String word : words){
			if(maps.containsKey(word)){
				maps.put(word, maps.get(word)+1);
			}else{
				maps.put(word, 1);
			}
			
		}
	}

	public boolean solve() {
		for(String check : noteMap.keySet()){
			if(magazineMap.containsKey(check) && magazineMap.get(check) >= noteMap.get(check)){
				
			}else{
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int n = scanner.nextInt();

		// Eat whitespace to beginning of next line
		scanner.nextLine();

		// Solution s = new Solution(scanner.nextLine(), scanner.nextLine());
		RansomNote s = new RansomNote(scanner.nextLine(), scanner.nextLine());
		scanner.close();

		boolean answer = s.solve();
		if (answer)
			System.out.println("Yes");
		else
			System.out.println("No");

	}

}
