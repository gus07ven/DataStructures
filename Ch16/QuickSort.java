package Ch16;

public class QuickSort {
	
	static int partition(int arr[], int left, int right)
	{
	      int i = left, j = right;
	      int tmp;
	      int pivot = arr[(left + right) / 2];
	     
	      while (i <= j) {
	            while (arr[i] < pivot)
	                  i++;
	            while (arr[j] > pivot)
	                  j--;
	            if (i <= j) {
	                  tmp = arr[i];
	                  arr[i] = arr[j];
	                  arr[j] = tmp;
	                  i++;
	                  j--;
	            }
	      };      
	      return i;
	}
	 
	static void quickSort(int arr[], int left, int right) {
	      int index = partition(arr, left, right);
	      if (left < index - 1)
	            quickSort(arr, left, index - 1);
	      if (index < right)
	            quickSort(arr, index, right);
	}
	
	public static void main(String[] args) {
		
		int Array[] = {7,6,16,18,14,3,1,20}; // {7,6,16,18,14,3,1,20} {1,3,6,7,14,16,18,20}
		quickSort(Array, 0, 7);
		for (int i : Array) {
			System.out.println(i);
		}
	}

}
