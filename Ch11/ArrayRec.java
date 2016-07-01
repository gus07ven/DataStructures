package Ch11;

/*
 * 1. Create an array with values. 
 * 2. Create a for loop, add all the values, return the sum of the array.
 * 3. Do the same with recursion.	
 */

public class ArrayRec {

	private static int x[] = { 2, 4, 6, 8, 10 };

	public int forLoop(int[] a) {

		int sum = 0;
		for (int i = 0; i < x.length; i++) {
			sum += x[i];
		}
		System.out.println(sum);
		return sum;
	}

	public int recursion(int[] b, int n) {
			if (n == 0) {
				return b[n];
			}
				System.out.println("Hey");
				return b[n] + recursion(b, n - 1);
			}	

	/*
	 * private int numEle(int a, int b){
	 * 
	 * if(b == 0) { return 1; } System.out.println("Hey"); return a * numEle(a,
	 * b-1); }
	 */

	public static void main(String[] args) {

		ArrayRec a = new ArrayRec();
		System.out.println(a.recursion(x, 4));

	}
}
