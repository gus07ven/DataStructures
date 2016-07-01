package Ch11;

public class RecurTriangle {
	
	public int triangle(int rows){
		
		if(rows == 0){
			return 0;
		}
		return rows + triangle(rows - 1);
	}

	public static void main(String[] args) {
		
		RecurTriangle r = new RecurTriangle();
		System.out.println(r.triangle(3));
		System.out.println();
		
		System.out.println("triangle(0) --> " + r.triangle(0) + "  OK");
		System.out.println("triangle(1) --> " + r.triangle(1) + "  OK");
		System.out.println("triangle(2) --> " + r.triangle(2) + "  OK");
		System.out.println("triangle(3) --> " + r.triangle(3) + "  OK");
		System.out.println("triangle(4) --> " + r.triangle(4) + " OK");
		System.out.println("triangle(5) --> " + r.triangle(5) + " OK");
		System.out.println("triangle(6) --> " + r.triangle(6) + " OK");
		System.out.println("triangle(7) --> " + r.triangle(7) + " OK");
	}
}
