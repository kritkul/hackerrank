package challenge;

import java.util.Scanner;

public class ZeroOneGame {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int g = in.nextInt();
        for(int a0 = 0; a0 < g; a0++){
            int n = in.nextInt();
            int[] sequence = new int[n];
            for(int sequence_i=0; sequence_i < n; sequence_i++){
                sequence[sequence_i] = in.nextInt();
            }
            
            System.out.println(isAliceWin(sequence,n)? "Alice" : "Bob");
            
        }
    

	}
	
	static boolean isAliceWin(int[] seq, int n) {
		int start = -1;
		int ans = 0;
		for (int i = 0; i < n - 1; i++) {
			if (start == -1) {
				if (seq[i] == 0)
					start = i;
			} else {
				if (seq[i] == 1 && seq[i + 1] == 1) {
					ans += Math.max(0, i - start - 2);
					start = -1;
				}
			}
		}
		if (start != -1) {
			ans += Math.max(n - start - 2 - seq[n - 1], 0);
		}

		return (ans % 2 != 0 ? true : false);
	}

}
