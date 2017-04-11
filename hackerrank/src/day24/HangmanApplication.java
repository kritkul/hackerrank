package day24;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class HangmanApplication {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to Hangman! If you guess wrong 6 times, then I win");
		System.out.println();
		
		
		boolean wannaPlay = true;
		
		while(wannaPlay){
			//keep playing
			System.out.println("Alright: Let's play!");
			
			Hangman game = new Hangman();
	//		Random ran = new Random();
	//		int hintIndex = Math.abs(ran.nextInt() % game.mysteryWord.length());
			do{
				//Draw the things...
				System.out.println();
				System.out.println(game.drawPicture());
				System.out.println();
				System.out.println(game.getFormalCurrentGuess());
			//	System.out.println("hint is : " + game.mysteryWord.charAt(hintIndex));
				
				// Get the guess
				System.out.println("Enter a character that in the word");
				char guess = (sc.next().toLowerCase().charAt(0));
				System.out.println();
				
				if(game.isGuessAlready(guess)){
					System.out.println("Try again! you've already guessed that character.");
					guess = sc.next().toLowerCase().charAt(0);
					System.out.println();
				}
				
				if(game.playGuess(guess)){
					System.out.println("Great guess. \n");
				}else{
					System.out.println("Unfortunately. \n");
				}
				
				
			}
			while(!game.gameOver());
				
				
			System.out.println();
			System.out.println("Press 'Y' if you wanna play agian");
			Character response = (sc.next().toUpperCase().charAt(0));
			
			wannaPlay = (response == 'Y');
		
			
		}

	}

}
