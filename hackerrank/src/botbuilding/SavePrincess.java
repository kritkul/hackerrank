package botbuilding;

import java.util.Scanner;

public class SavePrincess {
	static void displayPathtoPrincess(int n, String[] grid) {
		int botLocX = 0;
		int botLocY = 0;
		int princeLocX = 0;
		int princeLocY = 0;
		int diffX = 0;
		int diffY = 0;
		
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if('m' == grid[i].charAt(j)){
					botLocX = i;
					botLocY = j;
				}else if('p' == grid[i].charAt(j)){
					princeLocX = i;
					princeLocY = j;
				}
			}
		}
		
		diffX = botLocX - princeLocX;
		diffY = botLocY - princeLocY;
		
	//	System.out.println("x : " + diffX + " y : " + diffY);
		
		while(diffX != 0 || diffY != 0){
			if(diffX < 0){
				System.out.println("DOWN");
				diffX++;
			}else if(diffX > 0){
				System.out.println("UP");
				diffX--;
			}
			
			if(diffY < 0){
				System.out.println("RIGHT");
				diffY++;
			}else if(diffY > 0){
				System.out.println("LEFT");
				diffY--;
			}
			
			
		}
		
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m;
		m = in.nextInt();
		String grid[] = new String[m];
		for (int i = 0; i < m; i++) {
			grid[i] = in.next();
		}

		displayPathtoPrincess(m, grid);
	}
}
