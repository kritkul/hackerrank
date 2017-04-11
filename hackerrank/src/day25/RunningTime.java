package day25;

public class RunningTime {

	public static int findNumsOfRepetitions(String s,char c){
		int sum = 0;
		for(int i = 0 ; i < s.length(); i++){
			if(s.charAt(i) == c){
				sum++;
			}
		}
		
		
		return sum;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.currentTimeMillis();
		
		System.out.println(findNumsOfRepetitions("abcdefjhijklas;dlkjf;alksj;lkjjqoiuerpwieporiuosc,.,mxmn", 'k'));
		
		
		long endTime = System.currentTimeMillis();
		
		long duration = endTime - startTime;
		
		System.out.println("Test " + duration + " ms");
	}

}
