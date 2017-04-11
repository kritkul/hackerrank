package day21;

public class Printer<T> {
	
	public void printArray(T array[]){
		for(T print:array){
			System.out.println(print);
		}
	}

}
