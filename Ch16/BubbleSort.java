package Ch16;

public class BubbleSort {

	public static void bubbleSort(int[] arr) {
	      boolean swapped = true;
	      int j = 0;
	      int tmp;
	      while (swapped) {
	            swapped = false;
	            j++;
	            for (int i = 0; i < arr.length - j; i++) {                                       
	                  if (arr[i] > arr[i + 1]) {                          
	                        tmp = arr[i];
	                        arr[i] = arr[i + 1];
	                        arr[i + 1] = tmp;
	                        swapped = true;
	                  }
	            }                
	      }
	}

	public static void main(String[] args) {

		int[] arr = { 15, 12, -8 };
		bubbleSort(arr);
		for (int i : arr) {
			System.out.println(i);
		}
	}
}
