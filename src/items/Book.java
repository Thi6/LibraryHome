package items;

public class Book extends LibraryItem {
	private String genre;
	private String author;

	public Book(int id, String title, String genre, String author) {
		super(id, title);
		this.genre = genre;
		this.author = author;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

}
