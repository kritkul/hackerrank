package day18;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Solution {
	LinkedList<Character> testQueue;
	Stack<Character> testStack;
	
	Solution(){
		testQueue = new LinkedList<>(); 
		testStack = new Stack<>();
	}
	
	public void pushCharacter(char c){
		testStack.push(c);
	}
	
	public char popCharacter(){
		return testStack.pop();
	}
	
	public void enqueueCharacter(char c){
		testQueue.add(c);
	}
	
	public char dequeueCharacter(){
		return testQueue.remove();
	}
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Solution p = new Solution();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }
        
        /*System.out.println(p.popCharacter());
        System.out.println(p.dequeueCharacter());
        System.out.println("queue is " + p.testQueue);
        System.out.println("stack is " + p.testStack);*/
              
        
        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
	}

}
