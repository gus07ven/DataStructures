package Project3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class EmployeeTree {

	Node root;
	int counter;

	public void loadEmployees() throws IOException {
		
		String currentLine;
		Node employees;
		Node temp;

		BufferedReader textFileBr = new BufferedReader(new FileReader(
				"C:\\Users\\Gustavo\\Documents\\workspace\\COSC 2436 - Data Structures\\"
						+ "src\\Project3\\employee"));
		
		while ((currentLine = textFileBr.readLine()) != null) {
			employees = new Node();
			temp = new Node();
			StringTokenizer tokenizeLine = new StringTokenizer(currentLine);
			int counter = 0;

			while (tokenizeLine.hasMoreTokens()) {
				String token = tokenizeLine.nextToken();

				if (root == null) {
					if (counter == 0) {
						employees.name = token;
						counter++;
					} else {
						employees.department = token;
						counter--;
						root = employees;
					}
				} else {
					if (counter == 0) {
						temp.name = token;
						counter++;
					} else {
						temp.department = token;
						counter--;
						insert(root, temp.name, temp.department);
					}
				}
			}
		}
		textFileBr.close();
	}

	public static Node insert(Node input, String name, String department) {
		if (input == null) {
			return new Node(name, department);
		} else {
			if (name.compareTo(input.name) <= 0) {
				input.left = insert(input.left, name, department);
			} else {
				input.right = insert(input.right, name, department);
			}
			return input;
		}
	}

	public void display(Node input) {
		if (input == null) {
			return;
		}
		display(input.left);
		display(input.right);
		System.out.println("Employee: " + input.name + "  Department: "
				+ input.department);
	}

	public void askNameDept() {
	
		while (true) {

			String name = JOptionPane
					.showInputDialog("What name do you want to look for?");
			String department = JOptionPane
					.showInputDialog("What is that person's department?");
			JOptionPane.showMessageDialog(null,"The number of employees that work with " +
					name + " in " + department + " is: " + countEmployees(root, name, department));
			int value = JOptionPane.showConfirmDialog(null,
					"Do you want to continue?");
			if (value == JOptionPane.OK_OPTION){
				counter = 0;
				continue;
			}
			if (value == JOptionPane.NO_OPTION || value == JOptionPane.CANCEL_OPTION) {
				break;
			}
		}
	}

	public int countEmployees(Node root, String name, String dept) {

		if (root == null) {
			return 0;
		}
		countEmployees(root.left, name, dept);
		countEmployees(root.right, name, dept);
		if (root.department.compareTo(dept) == 0) {
				counter++; 
		}
		return counter;
	}
	
	public static void main(String[] args) throws IOException {

		EmployeeTree list = new EmployeeTree();
		list.loadEmployees();
		list.display(list.root);
		list.askNameDept();
	}
}
