package Projects;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import javax.swing.JOptionPane;

import Ch11.Customer;

public class SearchEmployee {

	List<Employee> employees = new ArrayList<Employee>();;

	public void loadEmployee() throws FileNotFoundException, IOException {
		FileReader fr = new FileReader(
				"C:\\Users\\Gustavo\\Documents\\workspace\\COSC 2436 - Data Structures\\src\\Projects\\employee.txt");
		BufferedReader br = new BufferedReader(fr);
		String line;

		Employee e;
		while ((line = br.readLine()) != null) {
			e = new Employee();
			StringTokenizer st = new StringTokenizer(line);
			int counter = 0;

			while (st.hasMoreTokens()) {
				String token = st.nextToken();
				if (counter == 0) {
					e.setName(token);
					counter++;
				} else {
					e.setManager(token);
					employees.add(e);
					counter--;
				}
			}
		}
	}

	public void display() {

		while (true) {

			String input = JOptionPane
					.showInputDialog("What name do you want to look for?");
			JOptionPane.showMessageDialog(null,"The number of employees under " +
					input + " is: " + countEmployees(input));
			int value = JOptionPane.showConfirmDialog(null,
					"Do you want to continue?");

			if (value == JOptionPane.NO_OPTION) {
				break;
			}
		}
	}

	public int countEmployees(String employeeName) {

		int counter = 0;

		for (Employee a : employees) {

			

			if (a.getManager().equals(employeeName)) {
				counter = counter + 1;
				counter = counter + countEmployees(a.getName());
			}
		}
		return counter;
	}

	public static void main(String[] args) throws FileNotFoundException,
			IOException {

		SearchEmployee se1 = new SearchEmployee();
		se1.loadEmployee();
		se1.display();
	
	}
}
