package Ch15;

public class RecExamples {

	public static int sum(int[] arr, int n) {

		if (n == arr.length) {
			return 0;
		}
		return arr[n] + sum(arr, n + 1);
	}

	public void sumDigit(int x){
		   while( x > 0){
		    System.out.println( x % 10);
		    x = x / 10;
		   }
		//return x;
		}
	
	public static int sumDigit2(int x){
		
		if( x == 0){
			return 0;
		}
		System.out.println(x % 10);
		return sumDigit2(x/10);	
	}
	
	public static void main(String[] args) {
		int[] input = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
		//System.out.println(sum(input,6));
		
		RecExamples re1 = new RecExamples();
		re1.sumDigit(10);
		sumDigit2(57);
		
	}
}
