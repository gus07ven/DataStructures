package Ch11;

import javax.swing.JOptionPane;

public class RecurEx {
	
	private int numEle(int a, int b){
		
		if(b == 0) {
			return 1;
		}
		System.out.println("Hey");
		return a * numEle(a, b-1);
	}
	
	private int forLoop(int y){
		
		int total = 0; 
		
		for (int i = 0; i <= y; i++){
			total += i; 
			System.out.println("Hi");
		}
		
		return total;
	}
	
	private int add(int x){
		if(x == 0){
			return 0;
		}
		System.out.println("Hello");
		return x + add(x-1);
	}

	public void sumDigit(int x){
		   while( x > 0){
		    System.out.println( x % 10);
		    x = x / 10;
		   }
		}
	
	public static int sumDigit2(int x){

		if( x == 0){
		return 0;
		}
		System.out.println(x % 10);
		return sumDigit2(x/10); 
		}


	public static void main(String[] args) {
		
		RecurEx r = new RecurEx();
		//System.out.println(r.numEle(2,3));
		r.sumDigit(12);
		sumDigit2(12);
	}
	
}
