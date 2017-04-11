package challenge;

public class Project174 {

	public static void main(String[] args) {
		
	}
	
	public static int getNumberOfTiles(int largeSquare, int smallSquare){
	//	int tiles = powerNumber(largeSquare,2) - powerNumber(smallSquare,2);
		int tiles = (largeSquare - smallSquare) * (largeSquare + smallSquare);
		return tiles;
	}
	
	public static int powerNumber(int n, int p){
		if(p == 0){
			return 1;
		}
		return n*powerNumber(n,p-1);
	}

}
