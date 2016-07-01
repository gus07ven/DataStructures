package LinkedList;

public class Trans {
	
	String a = "Sam";
	char[] b = a.toLowerCase().toCharArray();
	String c = "";
	
	{
		for (char i : b) {
			int num = (int) i;
			c = c + Integer.toString(num);
		}
	
	}

	public static void main(String[] args) {

		Trans a = new Trans();
		System.out.print(a.c);
	}

}
