package Ch16;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/*
 * This program creates students with grades. 
 * The students are put in a list of students. 
 * The quickSort method sorts the students by order
 * of the grades. 
 */

public class Student2 {
	
	private String name;			// The student's first name.
	private int finalGrade;			// The student's final grade.
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getFinalGrade() {
		return finalGrade;
	}
	public void setFinalGrade(int finalGrade) {
		this.finalGrade = finalGrade;
	}
	
	public static void quickSort(Student2 arr[], int left, int right)
	{
	      int i = left, j = right;
	      Student2 tmp;
	      int pivot = arr[(left + right) / 2].getFinalGrade();
	     
	      while (i <= j) {
	            while (arr[i].getFinalGrade() < pivot)
	                  i++;
	            while (arr[j].getFinalGrade() > pivot)
	                  j--;
	            if (i <= j) {
	                  tmp = arr[i];
	                  arr[i] = arr[j];
	                  arr[j] = tmp;
	                  i++;
	                  j--;
	            }
	      };
	     
	// Recursion
	      if (left < j)
	            quickSort(arr, left, j);
	      if (i < right)
	            quickSort(arr, i, right);
	}	
	
	public static void main(String[] args) {
		
		// Create array list to store student objects.
		Student2[] students = new Student2[5];
		
		// Create three students with names and grades.
		Student2 s1 = new Student2();
		s1.setName("Carlos");
		s1.setFinalGrade(98);
		students[0] = s1;
		
		Student2 s2 = new Student2();
		s2.setName("Miguel");
		s2.setFinalGrade(77);
		students[1] = s2;
	
		Student2 s3 = new Student2();
		s3.setName("Luis");
		s3.setFinalGrade(84);
		students[2] = s3;
		
		Student2 s4 = new Student2();
		s4.setName("Mario");
		s4.setFinalGrade(68);
		students[3] = s4;
		
		Student2 s5 = new Student2();
		s5.setName("Daniel");
		s5.setFinalGrade(91);
		students[4] = s5;
		
		// Call quickSort to sort student objects.
		quickSort(students, 0, 4);
		
		// Print out student names and grades in ascending order.
		for (Student2 a : students) {
			System.out.println("Student name: " + a.getName() + " \t"+ "Final grade: " + a.finalGrade);		
		}
		
	}
}
