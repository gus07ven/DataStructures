package Ch11;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class UserHobbies {

	// List to keep hobbies, books, movies.
	List<Hobbie> hobbies = new ArrayList<Hobbie>();
	List<Book> books = new ArrayList<Book>();
	List<Movie> movies = new ArrayList<Movie>();

	// Method to get hobbies information.
	public void userHob() {

		while (true) {

			// Ask user movie information
			String movieQ1 = JOptionPane
					.showInputDialog("What is the title of a movie you like?");
			String movieQ2 = JOptionPane
					.showInputDialog("What is the genre of that movie?");
			Movie movie1 = new Movie();
			movie1.setMovieTitle(movieQ1);
			movie1.setMovieGenre(movieQ2);
			movies.add(movie1);

			/*
			// Debug
			System.out.println(movie1.getMovieTitle());
			System.out.println(movie1.getMovieGenre());
			*/

			// Ask user book information
			String bookQ1 = JOptionPane
					.showInputDialog("What is the title of a book you like?");
			String bookQ2 = JOptionPane
					.showInputDialog("What is the genre of that book?");
			Book book1 = new Book();
			book1.setBookTitle(bookQ1);
			book1.setBookGenre(bookQ2);
			books.add(book1);

			/*
			// Debug
			System.out.println(book1.getBookTitle());
			System.out.println(book1.getBookGenre());
			*/

			int value = JOptionPane.showConfirmDialog(null,
					"Do you want to continue?");
			if (value == JOptionPane.NO_OPTION) {
				break;
			}
		}
		
		Hobbie hobbie1 = new Hobbie();
		hobbie1.setBook(books);
		hobbie1.setMovie(movies);
		hobbies.add(hobbie1);
	}

	// Display the information collected by userHob method.
	public void display() {

		int q1 = JOptionPane.showConfirmDialog(null,
				"Would you like to see your \n" + "list of movies and books?");
		if (q1 == JOptionPane.YES_OPTION) {

			for (Hobbie h : hobbies) {
				for (Movie m : h.getMovie()) {
					JOptionPane.showMessageDialog(null,
							"Movie info:\n" + "Title: " + m.getMovieTitle()
									+ "\nGenre: " + m.getMovieGenre());
					}
					for (Book b : h.getBook()) {
						JOptionPane.showMessageDialog(null, "Book info:\n"
								+ "Title: " + b.getBookTitle() + "\nGenre: "
								+ b.getBookGenre());
					}
				}
			}
		}
	

	public static void main(String[] args) {

		UserHobbies uh1 = new UserHobbies();
		uh1.userHob();
		uh1.display();
	}
}
