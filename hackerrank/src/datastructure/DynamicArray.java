package datastructure;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class DynamicArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int j = in.nextInt();
        
        int lastAns = 0;
    //    String seq[] = new String[n];
        
        List<Integer>[] seq = new LinkedList[n];
        
        for (int i=0; i<n; i++){
        	seq[i] = new LinkedList<Integer>();
        }
        
        for(int i=0; i<j ; i++){
        	int check = in.nextInt();
        	int tmp = 0;
        	if(check == 1){
        		tmp = getWhichSeq(in.nextInt(),lastAns,n);
/*        		if(seq[tmp] == null){
        			seq[tmp] = String.valueOf(in.nextInt());
        		}else{
        			seq[tmp] += " " + in.nextInt();
        		}*/
        	
        			seq[tmp].add(in.nextInt());
        
        		
        	}
        	
        	if(check == 2){
        		tmp = getWhichSeq(in.nextInt(),lastAns,n);
/*        		String split[] = seq[tmp].split("\\s+");
        		
        		lastAns = Integer.parseInt(split[in.nextInt()%(seq[tmp].length())]);
        		System.out.println(lastAns);*/
        		int size = seq[tmp].size();
        		lastAns = seq[tmp].get(in.nextInt()%size);
        		System.out.println(lastAns);
        	}
        	        
        }
      
	}

	public static int getWhichSeq(int x,int lastAns,int n){
		return (x ^ lastAns)%n;
	}

}
