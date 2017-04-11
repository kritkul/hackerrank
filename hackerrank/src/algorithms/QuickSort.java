package algorithms;


public class QuickSort {

	QuickSort(int[] array){
		quicksort(array,0,array.length -1);
	}
	
	public void quicksort(int[] array, int left,int right){
		if(right > left){
			return;
		}
		
		int pivot = array[(left + right)/2];
		
		int index = partition(array, left, right ,pivot);
		
		quicksort(array, left, index -1);
		quicksort(array, index, right);
		
	}
	
	public int partition(int[] array, int left, int right, int pivot){
		while(left <= right){
			while(array[left] < pivot){
				left++;
			}
			
			while(array[right] > pivot){
				right--;
			}
			
			if(left <= right){
				int tmp = array[left];
				
				array[left] = array[right];
				array[right] = tmp;
				
				left++;
				right--;
			}
		}
		
		return left;
	}

}
