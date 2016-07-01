/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ch11;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import javax.swing.JOptionPane;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 *
 * @author dawit.gebremichael
 */
public class FoodMenu {

	static List<Customer> customers = new ArrayList<>();
	static List<Meat> meats = new ArrayList<Meat>();
	static List<Veggi> veggies = new ArrayList<Veggi>();

	public void myDinner() {

		List<Meat> meats = new ArrayList<Meat>();
		String name = JOptionPane.showInputDialog("What is your name?");

		while (true) {

			String inputS = JOptionPane.showInputDialog("1: Meat \n 2: Veggi");
			int input = Integer.parseInt(inputS);

			if (input == 1) {
				String input_meats = JOptionPane
						.showInputDialog("What kind of meat?");
				Meat m = new Meat();
				m.setName(input_meats);
				meats.add(m);
			}

			int value = JOptionPane.showConfirmDialog(null,
					"Do you want to continue?");
			if (value == JOptionPane.NO_OPTION) {
				break;
			}

			Customer c = new Customer();
			c.setName(name);
			c.setMeat(meats);
			customers.add(c);
		}
	}

	// Load Data
	public void loadData() throws FileNotFoundException, IOException {
		FileReader fr = new FileReader(
				"C:\\Users\\Gustavo\\Documents\\workspace\\COSC 2436 - Data Structures\\src\\Ch11\\customerNames");
		BufferedReader br = new BufferedReader(fr);
		String line;

		Customer c;
		while ((line = br.readLine()) != null) {
			c = new Customer();
			StringTokenizer st = new StringTokenizer(line);
			int counter = 0;
			while (st.hasMoreTokens()) {
				String token = st.nextToken();
				if (counter == 0) {
					c.setId(Integer.parseInt(token));
				}
				if (counter == 1) {
					c.setName(token);
				}
				counter++;
			}
			customers.add(c);
		}
	}

	// LoadMeat
	public void loadMeat() throws FileNotFoundException, IOException {
		FileReader fr = new FileReader(
				"C:\\Users\\Gustavo\\Documents\\workspace\\COSC 2436 - Data Structures\\src\\Ch11\\meats");
		BufferedReader br = new BufferedReader(fr);
		String line;

		Meat m;
		while ((line = br.readLine()) != null) {
			m = new Meat();
			StringTokenizer st = new StringTokenizer(line);
			int counter = 0;
			while (st.hasMoreTokens()) {
				String token = st.nextToken();
				if (counter == 0) {
					m.setId(Integer.parseInt(token));
				}
				if (counter == 1) {
					m.setName(token);
				}
				counter++;
			}
			meats.add(m);
		}
	}

	public void loadVeggi() throws FileNotFoundException, IOException {
		FileReader fr = new FileReader(
				"C:\\Users\\Gustavo\\Documents\\workspace\\COSC 2436 - Data Structures\\src\\Ch11\\vegetables");
		BufferedReader br = new BufferedReader(fr);
		String line;

		Veggi v;
		while ((line = br.readLine()) != null) {
			v = new Veggi();
			StringTokenizer st = new StringTokenizer(line);
			int counter = 0;
			while (st.hasMoreTokens()) {
				String token = st.nextToken();
				if (counter == 0) {
					v.setId(Integer.parseInt(token));
				}
				if (counter == 1) {
					v.setName(token);
				}
				counter++;
			}
			veggies.add(v);
		}
	}

	// Create a method called display
	// It should have a parameter: customer type.
	// Display the content of the customer object.

	public void display() {

		for (Customer c : customers) {
			System.out.println("The ID is: " + c.getId() + " The name is: " + c.getName());
		}
	}

	/*
	 * for (Meat meat : customer.getMeat()){ System.out.println("Meat:" +
	 * meat.getName()); } { for (Veggi veggi: customer.getVeggi()){
	 * System.out.println("Veggi:" + veggi.getName()); }
	 * System.out.println(" name " + customer.getName()); }
	 */

	public static void main(String[] args) throws FileNotFoundException,
			IOException {

		FoodMenu f = new FoodMenu();
		// f.myDinner();
		f.loadData();
		f.display();
		// f.loadMeat();
		// f.loadVeggi();

	}
}
