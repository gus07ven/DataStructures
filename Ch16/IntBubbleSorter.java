package Ch16;

public class IntBubbleSorter {

	public static void bubbleSort(int[] array) {

		int lastPos;
		int index;
		int temp;

		for (lastPos = array.length - 1; lastPos >= 0; lastPos--) {

			for (index = 0; index <= lastPos - 1; index++) {

				if (array[index] > array[index + 1]) {

					temp = array[index];
					array[index] = array[index + 1];
					array[index + 1] = temp;
				}
			}
		}
	}
}
