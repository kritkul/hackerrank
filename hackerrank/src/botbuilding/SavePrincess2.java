package botbuilding;

import java.util.Scanner;

public class SavePrincess2 {

	static void nextMove(int n, int r, int c, String[] grid) {
		int botLocX = r;
		int botLocY = c;
		int princeLocX = -1;
		int princeLocY = -1;

		int i = 0;
		boolean found = true;
		while (found) {

			if (grid[i].matches("(.*)p(.*)")) {
				for (int j = 0; j < n; j++) {

					if ('p' == grid[i].charAt(j)) {
						princeLocX = i;
						princeLocY = j;
						found = false;
						break;
					}
				}
			}
			i++;
		}
		
		int diffX = botLocX - princeLocX;
		int diffY = botLocY - princeLocY;
		
		while( diffX != 1 && diffY != 1){
			if(diffX < -1){
				System.out.println("DOWN");
				diffX++;
			}else if(diffX > 1){
				System.out.println("UP");
				diffX--;
			}
			
			if(diffY < -1){
				System.out.println("RIGHT");
				diffY++;
			}else if(diffY > 1){
				System.out.println("LEFT");
				diffY--;
			}
			
			
		}
		
		
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, r, c;
		n = in.nextInt();
		r = in.nextInt();
		c = in.nextInt();
		// in.useDelimiter("\n");
		String grid[] = new String[n];

		for (int i = 0; i < n; i++) {
			grid[i] = in.next();
		}

		nextMove(n, r, c, grid);

	}
}
