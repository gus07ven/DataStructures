package Ch11;

public class DBRec {
	
	// Without recursion
	public int getTriangularNum(int number){
		int triangularNumber = 0;
		while(number > 0){
			triangularNumber = triangularNumber + number;
			number--;
		}
		return triangularNumber;
	}
	
	// With recursion
	public int recTN(int number){
		if(number == 1){
			return 1;
		}
		return number + recTN(number - 1);
	}

	public static void main(String[] args) {
		
		DBRec d = new DBRec();
		//System.out.println(d.getTriangularNum(6));
		System.out.println(d.recTN(6));
	}	
}
