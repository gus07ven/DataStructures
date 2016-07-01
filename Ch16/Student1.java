package Ch16;
/*
 * This program uses bubble sort to arrange the grades
 * of a student in ascending order. 
 */

public class Student1 {

	private String name;		// The name of the student.
	private int grade[];		// An array of multiple grades.

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getGrade() {
		return grade;
	}

	public void setGrade(int[] grade) {
		this.grade = grade;
	}

	// Bubble sort method to arrange grades. 
	public void bubbleSort(int arr[]) {

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

		// Create three students and add grades to each.
		Student1 s1 = new Student1();
		int gradesS1[] = { 87, 78, 95, 100 };
		s1.setName("Mike");
		s1.setGrade(gradesS1);

		Student1 s2 = new Student1();
		int gradesS2[] = { 63, 50, 82, 99 };
		s2.setName("Ron");
		s2.setGrade(gradesS2);

		Student1 s3 = new Student1();
		int gradesS3[] = { 87, 78, 95, 100 };
		s3.setName("Bobby");
		s3.setGrade(gradesS3);

		// Call the sorting method for each student created.
		s1.bubbleSort(gradesS1);
		s2.bubbleSort(gradesS2);
		s3.bubbleSort(gradesS3);

		// Print the student names and sorted grades.
		System.out.println("The sorted grades for " + s1.getName() + " are: ");
		for (int i : gradesS1) {
			System.out.println(i);
		}

		System.out.println("The sorted grades for " + s2.getName() + " are: ");
		for (int i : gradesS2) {
			System.out.println(i);
		}
		System.out.println("The sorted grades for " + s3.getName() + " are: ");
		for (int i : gradesS3) {
			System.out.println(i);
		}
	}
}